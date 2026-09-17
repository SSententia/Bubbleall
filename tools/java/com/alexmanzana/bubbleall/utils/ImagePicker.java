package com.alexmanzana.bubbleall.utils;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.util.Log;
import android.util.Size;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.alexmanzana.bubbleall.views.AttachCropOption;
import java.io.Closeable;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * The gallery picker: a grid of the most recent images in MediaStore, tap to select, several at a
 * time.
 *
 * <p>Shown by {@link LatestImage} in place of the newest-image shortcut when the "Pick from
 * gallery" row in the bubble config is on. Options the picker itself has none of: the crop
 * decision and the call back into the WebView belong to the caller, so this class only reports
 * <em>which</em> images were chosen, in the order they were tapped. {@link
 * LatestImage.Batch} is what then crops them one by one and attaches them together.
 *
 * <p>The page's own file input decides how many images can be attached: a field without
 * {@code multiple} asked for one file, so the picker there selects one at a time. That keeps a
 * single-file upload from silently dropping the extra images the user thought they had picked.
 *
 * <p>Like {@link ImageCrop} this is a {@code TYPE_APPLICATION_OVERLAY} window, so it needs no
 * activity and no background-activity-start exemption, and it survives the site's page being the
 * thing underneath it. It is deliberately drag-free: a grid needs taps and flicks, nothing else.
 *
 * <p>Thumbnails are decoded off the UI thread and only for the rows actually on screen (the
 * window is recomputed on every scroll, one row of margin either side), then recycled as they
 * leave it. A phone holding a few thousand screenshots therefore costs about a screenful of
 * bitmaps, not a gallery's worth. On Android 10+ the platform's own thumbnail decoder is used; on
 * older releases the image is downsampled from the full file instead.
 *
 * <p>This source is the origin of
 * {@code APKtool/smali/com/alexmanzana/bubbleall/utils/ImagePicker*.smali}; regenerate with
 * {@code scripts/gen-helper.sh} rather than editing the smali by hand.
 */
public final class ImagePicker {

    /** One chosen image: what to attach, and the rotation MediaStore recorded for it. */
    public static final class Pick {
        public final Uri uri;
        public final int orientation;

        public Pick(Uri uri, int orientation) {
            this.uri = uri;
            this.orientation = orientation;
        }
    }

    /** Where the selection goes. {@code null} means the user cancelled the picker. */
    public interface Sink {
        void onPicked(List<Pick> picks);
    }

    private static final String TAG = "BubbleUpload";

    /** How far back the grid reaches. Enough for real use without building an endless list. */
    private static final int MAX_IMAGES = 200;

    private static final int COLUMNS = 3;

    private static final int STATE_EMPTY = 0;
    private static final int STATE_LOADING = 1;
    private static final int STATE_LOADED = 2;
    private static final int STATE_FAILED = 3;

    private static final String TEXT_TITLE = "Pick images";
    private static final String TEXT_ATTACH = "Attach";
    private static final String TEXT_CANCEL = "Cancel";
    private static final String TEXT_SELECTED = " selected";

    private static final int COLOR_SCRIM = 0xcc000000;
    private static final int COLOR_CARD = 0xff101418;
    private static final int COLOR_BAR = 0xff1b2027;
    private static final int COLOR_BUTTON = 0xff2b3440;
    private static final int COLOR_PRIMARY = 0xffe6eaf0;
    private static final int COLOR_SECONDARY = 0xff9aa6b4;
    private static final int COLOR_EMPTY = 0xff232a33;
    private static final int COLOR_BADGE = 0xff3d8bfd;

    /** The picker currently on screen, if any. A later upload cancels an earlier one. */
    private static ImagePicker current;

    private final Context context;
    private final Sink sink;
    private final WindowManager windowManager;
    private final Handler main = new Handler(Looper.getMainLooper());
    private final Object lock = new Object();

    private final ArrayList<Uri> uris;
    private final ArrayList<Integer> orientations;
    private final boolean multiple;
    /** Selected image indices, in the order they were tapped: that is the crop order too. */
    private final ArrayList<Integer> order = new ArrayList<Integer>();
    private final ArrayList<Cell> cells = new ArrayList<Cell>();

    private final Root root;
    private final PickerScroll scroll;
    private final TextView selectedLabel;
    private final TextView attach;

    private final Bitmap[] thumbs;
    private final int[] states;
    private final boolean[] wanted;

    private final int cellPx;
    private final int gapPx;

    private boolean delivered;
    private boolean closed;
    private boolean workerStarted;

    private ImagePicker(Context context, Sink sink, ArrayList<Uri> uris,
                        ArrayList<Integer> orientations, boolean multiple) {
        this.context = context;
        this.sink = sink;
        this.uris = uris;
        this.orientations = orientations;
        this.multiple = multiple;
        this.windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        this.thumbs = new Bitmap[uris.size()];
        this.states = new int[uris.size()];
        this.wanted = new boolean[uris.size()];

        int margin = dp(10);
        int pad = dp(8);
        this.gapPx = dp(4);
        int usable = context.getResources().getDisplayMetrics().widthPixels
                - 2 * (margin + pad);
        this.cellPx = Math.max(dp(40), (usable - gapPx * (COLUMNS - 1)) / COLUMNS);

        this.selectedLabel = label("", 13f, COLOR_SECONDARY);
        this.attach = button(TEXT_ATTACH, new Click(true));
        this.scroll = new PickerScroll(context);

        LinearLayout card = new LinearLayout(context);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setPadding(pad, pad, pad, pad);
        card.setBackground(shape(COLOR_CARD, 14));
        card.addView(header(), new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        card.addView(buildGrid(), new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f));
        card.addView(footer(), new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        this.root = new Root(context);
        FrameLayout.LayoutParams cardParams = new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT,
                Gravity.CENTER);
        cardParams.setMargins(margin, margin, margin, margin);
        root.addView(card, cardParams);

        refreshSelection();
    }

    /**
     * Opens the picker and returns true when it owns [sink] from now on. Returns false — without
     * touching the sink — when there is nothing to pick from, so the caller can fall back to the
     * newest-image path (which will find the same empty gallery and answer with a clean cancel).
     *
     * @param multiple whether the page's file input accepts more than one file
     */
    public static boolean show(Context context, Sink sink, boolean multiple) {
        try {
            if (context == null || sink == null) {
                return false;
            }
            dismissCurrent();
            ArrayList<Uri> uris = new ArrayList<Uri>();
            ArrayList<Integer> orientations = new ArrayList<Integer>();
            readGallery(context, uris, orientations);
            if (uris.isEmpty()) {
                Log.i(TAG, "picker: the gallery has no images to offer");
                return false;
            }
            Log.i(TAG, "picker: opened on " + uris.size() + " image(s), multiple=" + multiple);
            ImagePicker picker = new ImagePicker(context, sink, uris, orientations, multiple);
            picker.attach();
            current = picker;
            return true;
        } catch (Throwable failure) {
            Log.w(TAG, "picker could not be opened: " + failure);
            return false;
        }
    }

    /** Cancels a picker that is still waiting for the user (the earlier upload is dropped). */
    public static void dismissCurrent() {
        ImagePicker open = current;
        if (open != null) {
            open.finish(null);
        }
    }

    /**
     * The newest {@link #MAX_IMAGES} images the app is allowed to see, newest first.
     *
     * <p>ORIENTATION is queried per row because a camera photo carries its rotation out of band:
     * the crop screen needs it to show the picture the right way up.
     */
    private static void readGallery(Context context, ArrayList<Uri> uris,
                                    ArrayList<Integer> orientations) {
        Cursor cursor = null;
        try {
            String[] projection = new String[]{
                    MediaStore.Images.Media._ID, MediaStore.Images.Media.ORIENTATION};
            // IS_PENDING only exists from Android 10; asking for it on an older phone throws.
            String selection = Build.VERSION.SDK_INT >= 29
                    ? MediaStore.Images.Media.IS_PENDING + " = 0" : null;
            cursor = context.getContentResolver().query(
                    MediaStore.Images.Media.EXTERNAL_CONTENT_URI, projection, selection, null,
                    MediaStore.Images.Media._ID + " DESC");
            if (cursor == null) {
                return;
            }
            int idColumn = cursor.getColumnIndex(MediaStore.Images.Media._ID);
            int orientationColumn = cursor.getColumnIndex(MediaStore.Images.Media.ORIENTATION);
            while (uris.size() < MAX_IMAGES && cursor.moveToNext()) {
                long id = cursor.getLong(idColumn);
                int orientation = 0;
                if (orientationColumn >= 0 && !cursor.isNull(orientationColumn)) {
                    orientation = cursor.getInt(orientationColumn);
                }
                uris.add(ContentUris.withAppendedId(
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI, id));
                orientations.add(Integer.valueOf(orientation));
            }
        } catch (Throwable failure) {
            Log.w(TAG, "gallery query failed: " + failure);
        } finally {
            close(cursor);
        }
    }

    // ── chrome ─────────────────────────────────────────────────────────────────

    private View header() {
        LinearLayout row = new LinearLayout(context);
        row.setOrientation(LinearLayout.HORIZONTAL);
        row.setGravity(Gravity.CENTER_VERTICAL);
        TextView heading = label(TEXT_TITLE, 16f, COLOR_PRIMARY);
        row.addView(heading, new LinearLayout.LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        row.addView(selectedLabel, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        return row;
    }

    private View footer() {
        LinearLayout row = new LinearLayout(context);
        row.setOrientation(LinearLayout.HORIZONTAL);
        row.setGravity(Gravity.CENTER_VERTICAL);
        int pad = dp(6);
        row.setPadding(pad, pad, pad, pad);
        row.setBackground(shape(COLOR_BAR, 10));
        TextView hint = label(hintText(), 12f, COLOR_SECONDARY);
        hint.setSingleLine(false);
        hint.setMaxLines(2);
        LinearLayout.LayoutParams hintParams = new LinearLayout.LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f);
        hintParams.setMarginEnd(dp(6));
        row.addView(hint, hintParams);
        row.addView(button(TEXT_CANCEL, new Click(false)));
        LinearLayout.LayoutParams attachParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        attachParams.setMarginStart(dp(6));
        row.addView(attach, attachParams);
        return row;
    }

    private String hintText() {
        String text = "Newest " + uris.size() + " in the gallery - tap to select";
        if (!multiple) {
            // the page's input takes one file, so offering more would be a promise it drops
            return text + (AttachCropOption.enabled(context)
                    ? " one - it is cropped before it is attached" : " one image");
        }
        if (AttachCropOption.enabled(context)) {
            return text + " - each is cropped, then all are attached";
        }
        return text + " - all of them are attached at once";
    }

    private View buildGrid() {
        LinearLayout column = new LinearLayout(context);
        column.setOrientation(LinearLayout.VERTICAL);
        int pad = dp(4);
        column.setPadding(pad, dp(10), pad, dp(4));
        scroll.setFocusable(false);
        scroll.setFocusableInTouchMode(false);
        scroll.setVerticalScrollBarEnabled(false);
        scroll.addView(column, new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        int rowCount = (uris.size() + COLUMNS - 1) / COLUMNS;
        for (int row = 0; row < rowCount; row++) {
            LinearLayout line = new LinearLayout(context);
            line.setOrientation(LinearLayout.HORIZONTAL);
            for (int columnIndex = 0; columnIndex < COLUMNS; columnIndex++) {
                int index = row * COLUMNS + columnIndex;
                if (index >= uris.size()) {
                    // keep the last row's cells on the same grid as the rows above it
                    line.addView(new View(context), cellParams());
                    continue;
                }
                Cell cell = new Cell(index);
                cells.add(cell);
                line.addView(cell, cellParams());
            }
            column.addView(line, new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        }
        return scroll;
    }

    private LinearLayout.LayoutParams cellParams() {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(cellPx, cellPx);
        params.setMarginEnd(gapPx);
        params.bottomMargin = gapPx;
        return params;
    }

    private TextView label(String value, float size, int color) {
        TextView view = new TextView(context);
        view.setText(value);
        view.setTextColor(color);
        view.setTextSize(size);
        view.setSingleLine(true);
        return view;
    }

    private TextView button(String value, View.OnClickListener listener) {
        TextView button = label(value, 14f, Color.WHITE);
        button.setGravity(Gravity.CENTER);
        int padX = dp(14);
        int padY = dp(9);
        button.setPadding(padX, padY, padX, padY);
        button.setBackground(shape(COLOR_BUTTON, 10));
        button.setOnClickListener(listener);
        return button;
    }

    private GradientDrawable shape(int color, int radiusDp) {
        GradientDrawable shape = new GradientDrawable();
        shape.setColor(color);
        shape.setCornerRadius(dp(radiusDp));
        return shape;
    }

    private int dp(int value) {
        return Math.round(value * context.getResources().getDisplayMetrics().density);
    }

    // ── window ─────────────────────────────────────────────────────────────────

    private void attach() {
        if (windowManager == null) {
            throw new IllegalStateException("no WindowManager");
        }
        WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT,
                overlayType(), 0, PixelFormat.TRANSLUCENT);
        params.gravity = Gravity.TOP | Gravity.START;
        windowManager.addView(root, params);
        // The scroll window cannot be computed before the window is laid out, so hook the layout
        // passes and start the thumbnail worker from there; this posted pass covers a layout that
        // completed before the listener was attached.
        scroll.getViewTreeObserver().addOnGlobalLayoutListener(new FirstLayout());
        main.post(new Runnable() {
            @Override
            public void run() {
                onScrolled();
            }
        });
        root.requestFocus();
    }

    private void detach() {
        try {
            if (windowManager != null) {
                windowManager.removeView(root);
            }
        } catch (Throwable ignored) {
        }
    }

    private static int overlayType() {
        return Build.VERSION.SDK_INT >= 26 ? 2038 /* TYPE_APPLICATION_OVERLAY */
                : 2002 /* TYPE_SYSTEM_ALERT */;
    }

    // ── selection ──────────────────────────────────────────────────────────────

    private void toggle(int index) {
        Integer key = Integer.valueOf(index);
        boolean already = order.contains(key);
        if (!multiple) {
            // a single-file input: tapping another image replaces the one that was selected
            order.clear();
            if (!already) {
                order.add(key);
            }
            refreshSelection();
            return;
        }
        if (already) {
            order.remove(key);
        } else {
            order.add(key);
        }
        refreshSelection();
    }

    private void refreshSelection() {
        for (int i = 0; i < cells.size(); i++) {
            Cell cell = cells.get(i);
            // the badge shows the position in the batch, which is also the crop order
            cell.showSelected(order.indexOf(Integer.valueOf(cell.index)) + 1);
        }
        int count = order.size();
        selectedLabel.setText(count == 0 ? "nothing selected" : count + TEXT_SELECTED);
        attach.setText(count == 0 ? TEXT_ATTACH : TEXT_ATTACH + " (" + count + ")");
        attach.setAlpha(count == 0 ? 0.45f : 1f);
    }

    private void confirm() {
        if (order.isEmpty()) {
            finish(null);
            return;
        }
        ArrayList<Pick> picks = new ArrayList<Pick>(order.size());
        for (int i = 0; i < order.size(); i++) {
            int index = order.get(i).intValue();
            picks.add(new Pick(uris.get(index), orientations.get(index).intValue()));
        }
        finish(picks);
    }

    /** Hand the answer back and tear the window down. */
    private void finish(List<Pick> picks) {
        if (delivered) {
            return;
        }
        delivered = true;
        if (current == this) {
            current = null;
        }
        release();
        detach();
        Log.i(TAG, picks == null || picks.isEmpty()
                ? "picker: cancelled" : "picker: picked " + picks.size() + " image(s)");
        try {
            sink.onPicked(picks);
        } catch (Throwable failure) {
            Log.w(TAG, "the picker sink refused the selection: " + failure);
        }
    }

    private void release() {
        synchronized (lock) {
            closed = true;
            lock.notifyAll();
        }
        for (int i = 0; i < states.length; i++) {
            recycle(i);
        }
    }

    // ── thumbnails ─────────────────────────────────────────────────────────────

    /**
     * Recomputes the rows that may hold bitmaps: everything on screen plus one row either side.
     * Called on the main thread from layout and from every scroll, so the set tracks the flicks
     * of the grid rather than lagging behind them. Returns false while the window is not yet
     * measurable (the first layout pass can run before the card has been measured), so the caller
     * knows to try again rather than leave the grid empty.
     */
    private boolean onScrolled() {
        int viewport = scroll.getHeight();
        if (closed || cellPx <= 0 || viewport <= 0 || uris.isEmpty()) {
            return false;
        }
        int rowHeight = cellPx + gapPx;
        int rowCount = (uris.size() + COLUMNS - 1) / COLUMNS;
        int top = scroll.getScrollY();
        int first = Math.max(0, top / rowHeight - 1);
        int last = Math.min(rowCount - 1, (top + viewport) / rowHeight + 1);
        synchronized (lock) {
            for (int i = 0; i < wanted.length; i++) {
                int row = i / COLUMNS;
                boolean want = row >= first && row <= last;
                wanted[i] = want;
                if (!want && states[i] == STATE_LOADED) {
                    recycle(i);
                }
            }
            lock.notifyAll();
        }
        return true;
    }

    /** Main thread only: drop one bitmap and clear the cell that was showing it. */
    private void recycle(int index) {
        Bitmap bitmap = thumbs[index];
        thumbs[index] = null;
        states[index] = STATE_EMPTY;
        if (index < cells.size()) {
            cells.get(index).image.setImageDrawable(null);
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /** Caller holds [lock]: the next cell in the window that has no bitmap yet. */
    private int nextWanted() {
        for (int i = 0; i < wanted.length; i++) {
            if (wanted[i] && states[i] == STATE_EMPTY) {
                states[i] = STATE_LOADING;
                return i;
            }
        }
        return -1;
    }

    /** Off the UI thread: a thumbnail for one cell, or null when it cannot be read. */
    private Bitmap readThumbnail(int index) {
        Uri uri = uris.get(index);
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                return context.getContentResolver().loadThumbnail(
                        uri, new Size(cellPx, cellPx), null);
            } catch (Throwable failure) {
                // the platform decoder is the cheap path; reading the file itself is the fallback
                Log.w(TAG, "platform thumbnail failed for " + uri + ": " + failure);
            }
        }
        InputStream in = null;
        try {
            BitmapFactory.Options bounds = new BitmapFactory.Options();
            bounds.inJustDecodeBounds = true;
            in = context.getContentResolver().openInputStream(uri);
            BitmapFactory.decodeStream(in, null, bounds);
            close(in);
            in = null;

            int sample = 1;
            int shorter = Math.min(bounds.outWidth, bounds.outHeight);
            while (shorter > 0 && shorter / (sample * 2) >= cellPx) {
                sample *= 2;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = sample;
            in = context.getContentResolver().openInputStream(uri);
            Bitmap decoded = BitmapFactory.decodeStream(in, null, options);
            close(in);
            in = null;
            return decoded;
        } catch (Throwable failure) {
            Log.w(TAG, "thumbnail decode failed for " + uri + ": " + failure);
            return null;
        } finally {
            close(in);
        }
    }

    private void startWorker() {
        if (workerStarted) {
            return;
        }
        workerStarted = true;
        Thread worker = new Thread(new Worker());
        worker.setDaemon(true);
        worker.start();
    }

    private static void close(Closeable stream) {
        if (stream != null) {
            try {
                stream.close();
            } catch (Throwable ignored) {
            }
        }
    }

    // ── nested pieces ──────────────────────────────────────────────────────────

    /** Draws every wanted row's thumbnail, one at a time, until the picker is gone. */
    private final class Worker implements Runnable {
        @Override
        public void run() {
            while (true) {
                int index;
                synchronized (lock) {
                    if (closed) {
                        return;
                    }
                    index = nextWanted();
                    if (index < 0) {
                        try {
                            lock.wait(150L);
                        } catch (InterruptedException stop) {
                            return;
                        }
                        continue;
                    }
                }
                Bitmap bitmap = readThumbnail(index);
                main.post(new Arrived(index, bitmap));
            }
        }
    }

    /** One decoded thumbnail: keep it if its cell is still on screen, otherwise recycle it. */
    private final class Arrived implements Runnable {
        private final int index;
        private final Bitmap bitmap;

        Arrived(int index, Bitmap bitmap) {
            this.index = index;
            this.bitmap = bitmap;
        }

        @Override
        public void run() {
            if (bitmap == null) {
                synchronized (lock) {
                    if (!closed) {
                        states[index] = STATE_FAILED;
                    }
                }
                return;
            }
            boolean keep;
            synchronized (lock) {
                keep = !closed && wanted[index] && states[index] == STATE_LOADING;
                if (keep) {
                    states[index] = STATE_LOADED;
                    thumbs[index] = bitmap;
                } else {
                    states[index] = STATE_EMPTY;
                }
            }
            if (keep) {
                if (index < cells.size()) {
                    cells.get(index).image.setImageBitmap(bitmap);
                }
            } else if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }

    /**
     * Starts the worker, and the thumbnail window, as soon as the layout makes them knowable.
     * The listener is only removed once the window really has been computed: the first pass can
     * arrive before the card is measured, and dropping out then would leave every cell blank.
     */
    private final class FirstLayout implements ViewTreeObserver.OnGlobalLayoutListener {
        @Override
        public void onGlobalLayout() {
            if (onScrolled()) {
                scroll.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            startWorker();
        }
    }

    private final class PickerScroll extends ScrollView {
        PickerScroll(Context context) {
            super(context);
        }

        @Override
        protected void onScrollChanged(int left, int top, int oldLeft, int oldTop) {
            super.onScrollChanged(left, top, oldLeft, oldTop);
            onScrolled();
        }
    }

    /** The window root: the scrim, and the one place BACK is handled. */
    private final class Root extends FrameLayout {
        Root(Context context) {
            super(context);
            setBackgroundColor(COLOR_SCRIM);
            setFocusable(true);
            setFocusableInTouchMode(true);
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent event) {
            if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
                if (event.getAction() == KeyEvent.ACTION_UP) {
                    finish(null);
                }
                return true;
            }
            return super.dispatchKeyEvent(event);
        }
    }

    /** One grid cell: the thumbnail, plus a badge with its position in the selection. */
    private final class Cell extends FrameLayout {

        final int index;
        final ImageView image;
        private final TextView badge;

        Cell(int index) {
            super(context);
            this.index = index;
            int pad = dp(2);
            setPadding(pad, pad, pad, pad);

            image = new ImageView(context);
            image.setScaleType(ImageView.ScaleType.CENTER_CROP);
            image.setBackgroundColor(COLOR_EMPTY);
            addView(image, new FrameLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

            badge = label("", 11f, Color.WHITE);
            badge.setGravity(Gravity.CENTER);
            GradientDrawable circle = new GradientDrawable();
            circle.setColor(COLOR_BADGE);
            circle.setShape(GradientDrawable.OVAL);
            badge.setBackground(circle);
            badge.setVisibility(View.GONE);
            int size = dp(20);
            FrameLayout.LayoutParams badgeParams = new FrameLayout.LayoutParams(
                    size, size, Gravity.TOP | Gravity.END);
            badgeParams.topMargin = dp(2);
            badgeParams.rightMargin = dp(2);
            addView(badge, badgeParams);

            setBackground(shape(COLOR_EMPTY, 8));
            setOnClickListener(new Click(index));
        }

        /** [position] is 1-based while this image is selected, 0 when it is not. */
        void showSelected(int position) {
            boolean on = position > 0;
            badge.setVisibility(on ? View.VISIBLE : View.GONE);
            if (on) {
                badge.setText(String.valueOf(position));
            }
            GradientDrawable background = new GradientDrawable();
            background.setColor(COLOR_EMPTY);
            background.setCornerRadius(dp(8));
            if (on) {
                background.setStroke(Math.max(2, dp(2)), COLOR_BADGE);
            }
            setBackground(background);
            invalidate();
        }
    }

    /** One listener for all three jobs: a cell toggles, and the bar's buttons confirm or cancel. */
    private final class Click implements View.OnClickListener {
        private final boolean confirm;
        private final int index;

        Click(boolean confirm) {
            this.confirm = confirm;
            this.index = -1;
        }

        Click(int index) {
            this.confirm = false;
            this.index = index;
        }

        @Override
        public void onClick(View view) {
            if (index >= 0) {
                toggle(index);
                return;
            }
            if (confirm) {
                ImagePicker.this.confirm();
            } else {
                ImagePicker.this.finish(null);
            }
        }
    }
}
