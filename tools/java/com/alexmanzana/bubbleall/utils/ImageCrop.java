package com.alexmanzana.bubbleall.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * The full-screen crop screen shown before the newest gallery image is attached to an upload
 * field in the bubble browser.
 *
 * <p>Ported from FloatingOCR's crop screen: the photo itself covers the whole display at full
 * opacity, while everything drawn on top of it — the shade outside the frame, the marquee, the
 * handles and the button bar — follows BubbleAll's Transparency setting ({@code theme_alpha}), so
 * the crop screen matches the rest of the bubble instead of appearing as an opaque slab.
 *
 * <p>Faithful to FloatingOCR's crop screen in the three ways that matter on a phone: the preview
 * is <em>not</em> fitted inside the button bar — it fills the whole display while the bar overlays
 * its bottom edge — it is drawn centred at {@link #PREVIEW_SCALE} past every screen edge so a
 * screenshot reads like the screen itself instead of a letterboxed rectangle, and the marquee
 * starts as a centred square rather than covering the image, which keeps its top handle clear of
 * the status bar (dragging a handle from the very top edge pulls the notification shade down).
 *
 * <p>The screen is a {@code TYPE_APPLICATION_OVERLAY} window added next to the bubble and manager
 * windows, so it needs no activity and no background-activity-start exemption. It answers the
 * WebView's file chooser itself: the cropped region is written to the app cache and handed to the
 * pending {@link ValueCallback} as a {@code content://} URI from the app's FileProvider.
 *
 * <p>This source is the origin of {@code APKtool/smali/com/alexmanzana/bubbleall/utils/ImageCrop*.smali};
 * regenerate with {@code scripts/gen-helper.sh} rather than editing the smali by hand.
 */
public final class ImageCrop {

    private static final String TAG = "BubbleUpload";

    private static final String PREFS = "bubble_data_prefs";
    private static final String KEY_ALPHA = "theme_alpha";
    private static final int ALPHA_DEFAULT = 255;

    /** Transparency floor for the crop chrome: at theme_alpha 0 an invisible frame and button bar
     *  would make the screen unusable, so the elements fade but never disappear. */
    private static final float MIN_CHROME_ALPHA = 0.25f;

    private static final String AUTHORITY = "com.alexmanzana.bubbleall.fileprovider";

    /** Decode budget: images above this on their long edge are halved so the screen stays inside
     *  a sane heap. Typical phone screenshots are already below it and stay 1:1 (crop crispness). */
    private static final int MAX_EDGE = 3200;

    /** Preview zoom, centred on the image so nothing is skewed: the photo is drawn this much
     *  larger than the fittable size, so it reaches past the screen edge on every side the way a
     *  screenshot taken on this phone does. Mirrors FloatingOCR's 110% crop preview scale. */
    private static final float PREVIEW_SCALE = 1.10f;

    private static final String TEXT_LOADING = "Opening the newest image…";
    private static final String TEXT_HINT = "Drag the frame over the part to attach";
    private static final String TEXT_CANCEL = "Cancel";
    private static final String TEXT_ATTACH = "Attach";

    private static final int COLOR_BAR = 0xdd101418;
    private static final int COLOR_BUTTON = 0xff2b3440;

    /** The crop screen currently on screen, if any. Later uploads cancel an earlier one. */
    private static ImageCrop current;

    private final Context context;
    private final Uri source;
    private final ValueCallback<Uri[]> callback;
    private final int orientation;
    private final WindowManager windowManager;
    private final CropLayer layer;
    private final TextView hint;
    private final Root root;
    private final Handler main = new Handler(Looper.getMainLooper());

    private Bitmap bitmap;
    private boolean finished;

    private ImageCrop(Context context, Uri source, ValueCallback<Uri[]> callback, int orientation) {
        this.context = context;
        this.source = source;
        this.callback = callback;
        this.orientation = orientation;
        this.windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);

        float alpha = chromeAlpha(context);
        this.layer = new CropLayer(context);
        layer.setChromeAlpha(alpha);
        this.hint = buildHint();
        LinearLayout bar = buildBar(alpha);
        this.root = new Root(context);
        root.addView(layer, new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        // The bar sits over the photo rather than shrinking it: the preview keeps the phone's
        // whole size, which is what makes the crop screen look like the screen.
        root.addView(bar, new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT,
                Gravity.BOTTOM));
    }

    /**
     * Opens the crop screen over everything else and returns true when it owns [callback] from now
     * on. Returns false — without touching the callback — when the screen cannot be shown, so the
     * caller can fall back to attaching the image as it is.
     *
     * @param orientation the MediaStore ORIENTATION of the row, applied to the decoded bitmap
     */
    public static boolean show(Context context, Uri source, ValueCallback<Uri[]> callback,
                               int orientation) {
        try {
            if (context == null || source == null || callback == null) {
                return false;
            }
            cancelCurrent();
            ImageCrop screen = new ImageCrop(context, source, callback, orientation);
            screen.attach();
            current = screen;
            screen.load();
            return true;
        } catch (Throwable failure) {
            Log.w(TAG, "crop screen could not be opened: " + failure);
            return false;
        }
    }

    /** Cancels a crop screen that is still waiting for the user (the earlier upload is dropped). */
    private static void cancelCurrent() {
        ImageCrop open = current;
        if (open != null) {
            open.finish(null);
        }
    }

    /** The transparency setting, as a 0..1 alpha for the crop chrome. */
    private static float chromeAlpha(Context context) {
        int value = ALPHA_DEFAULT;
        try {
            value = context.getSharedPreferences(PREFS, 0).getInt(KEY_ALPHA, ALPHA_DEFAULT);
        } catch (Throwable ignored) {
        }
        float alpha = value / 255f;
        if (alpha < MIN_CHROME_ALPHA) {
            return MIN_CHROME_ALPHA;
        }
        return alpha > 1f ? 1f : alpha;
    }

    private void attach() {
        if (windowManager == null) {
            throw new IllegalStateException("no WindowManager");
        }
        WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT,
                overlayType(), 0, PixelFormat.TRANSLUCENT);
        params.gravity = Gravity.TOP | Gravity.START;
        windowManager.addView(root, params);
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

    private TextView buildHint() {
        TextView view = new TextView(context);
        view.setText(TEXT_LOADING);
        view.setTextColor(0xffe6eaf0);
        view.setTextSize(13f);
        view.setMaxLines(2);
        view.setPadding(dp(4), 0, dp(4), 0);
        view.setLayoutParams(new LinearLayout.LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        return view;
    }

    private LinearLayout buildBar(float alpha) {
        LinearLayout container = new LinearLayout(context);
        container.setOrientation(LinearLayout.HORIZONTAL);
        container.setGravity(Gravity.CENTER_VERTICAL);
        int pad = dp(10);
        container.setPadding(pad + dp(4), pad, pad, pad);
        container.setBackgroundColor(COLOR_BAR);
        container.setAlpha(alpha);
        container.addView(hint);
        container.addView(makeButton(TEXT_CANCEL, new Click(false)));
        container.addView(makeButton(TEXT_ATTACH, new Click(true)));
        return container;
    }

    private View makeButton(String text, View.OnClickListener listener) {
        TextView button = new TextView(context);
        button.setText(text);
        button.setTextColor(Color.WHITE);
        button.setTextSize(14f);
        button.setGravity(Gravity.CENTER);
        button.setSingleLine(true);
        int padX = dp(14);
        int padY = dp(9);
        button.setPadding(padX, padY, padX, padY);
        GradientDrawable shape = new GradientDrawable();
        shape.setColor(COLOR_BUTTON);
        shape.setCornerRadius(dp(10));
        button.setBackground(shape);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMarginStart(dp(8));
        button.setLayoutParams(params);
        button.setOnClickListener(listener);
        return button;
    }

    private int dp(int value) {
        return Math.round(value * context.getResources().getDisplayMetrics().density);
    }

    // ── loading ────────────────────────────────────────────────────────────────

    private void load() {
        try {
            Thread loader = new Thread(new Loader());
            loader.setDaemon(true);
            loader.start();
        } catch (Throwable failure) {
            // the screen is already up, so it must answer the callback rather than throw
            Log.w(TAG, "no loader thread: " + failure);
            onDecoded(null);
        }
    }

    private void onDecoded(Bitmap decoded) {
        if (finished) {
            if (decoded != null) {
                decoded.recycle();
            }
            return;
        }
        if (decoded == null) {
            // unreadable or unrotatable: attaching the original is better than cancelling
            Log.w(TAG, "could not decode " + source);
            finish(source);
            return;
        }
        bitmap = decoded;
        layer.setBitmap(decoded);
        hint.setText(TEXT_HINT);
    }

    private Bitmap decode() {
        InputStream in = null;
        try {
            BitmapFactory.Options bounds = new BitmapFactory.Options();
            bounds.inJustDecodeBounds = true;
            in = context.getContentResolver().openInputStream(source);
            BitmapFactory.decodeStream(in, null, bounds);
            close(in);
            in = null;

            int sample = 1;
            int longest = Math.max(bounds.outWidth, bounds.outHeight);
            while (longest > 0 && longest / sample > MAX_EDGE) {
                sample *= 2;
            }

            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = sample;
            in = context.getContentResolver().openInputStream(source);
            Bitmap decoded = BitmapFactory.decodeStream(in, null, options);
            close(in);
            in = null;
            return rotate(decoded);
        } catch (Throwable failure) {
            Log.w(TAG, "decode failed: " + failure);
            return null;
        } finally {
            close(in);
        }
    }

    /** Camera photos carry their rotation out of band, so apply MediaStore's ORIENTATION. */
    private Bitmap rotate(Bitmap decoded) {
        int degrees = orientation % 360;
        if (decoded == null || degrees == 0) {
            return decoded;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.postRotate(degrees);
            Bitmap rotated = Bitmap.createBitmap(decoded, 0, 0,
                    decoded.getWidth(), decoded.getHeight(), matrix, true);
            if (rotated != decoded) {
                decoded.recycle();
            }
            return rotated;
        } catch (Throwable ignored) {
            return decoded;
        }
    }

    private static void close(Closeable stream) {
        if (stream != null) {
            try {
                stream.close();
            } catch (Throwable ignored) {
            }
        }
    }

    // ── result ─────────────────────────────────────────────────────────────────

    private void confirm() {
        Bitmap decoded = bitmap;
        Rect crop = layer.cropPixels();
        if (decoded == null || crop.isEmpty()) {
            finish(source);
            return;
        }
        boolean whole = crop.left == 0 && crop.top == 0
                && crop.width() == decoded.getWidth() && crop.height() == decoded.getHeight();
        if (whole) {
            finish(source); // nothing was cropped: attach the original bytes, no re-encode
            return;
        }
        Uri saved = save(decoded, crop);
        finish(saved != null ? saved : source);
    }

    private Uri save(Bitmap decoded, Rect crop) {
        OutputStream out = null;
        Bitmap piece = null;
        try {
            piece = Bitmap.createBitmap(decoded, crop.left, crop.top, crop.width(), crop.height());
            boolean png = "image/png".equals(mime());
            File file = new File(context.getCacheDir(), "bubble_crop_" + System.currentTimeMillis()
                    + (png ? ".png" : ".jpg"));
            out = new FileOutputStream(file);
            piece.compress(png ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 95, out);
            out.flush();
            out.close();
            out = null;
            // The source rectangle is what makes a crop verifiable from logcat alone: it says
            // which region of which decoded image was written, not merely how big the piece is.
            Log.i(TAG, "crop " + crop.width() + "x" + crop.height() + " at " + crop.left + ","
                    + crop.top + " of " + decoded.getWidth() + "x" + decoded.getHeight()
                    + " -> " + file.getName());
            return FileProvider.getUriForFile(context, AUTHORITY, file);
        } catch (Throwable failure) {
            Log.w(TAG, "crop could not be saved: " + failure);
            return null;
        } finally {
            close(out);
            if (piece != null && piece != decoded) {
                piece.recycle();
            }
        }
    }

    private String mime() {
        try {
            return context.getContentResolver().getType(source);
        } catch (Throwable ignored) {
            return null;
        }
    }

    /** Hand the answer back to the WebView's file chooser and tear the screen down. */
    private void finish(Uri result) {
        if (finished) {
            return;
        }
        finished = true;
        if (current == this) {
            current = null;
        }
        detach();
        if (bitmap != null) {
            bitmap.recycle();
            bitmap = null;
        }
        layer.setBitmap(null);
        try {
            callback.onReceiveValue(result == null ? null : new Uri[]{result});
        } catch (Throwable failure) {
            Log.w(TAG, "file chooser callback refused the result: " + failure);
        }
    }

    // ── nested pieces ──────────────────────────────────────────────────────────

    /** Decodes off the UI thread so attaching never blocks the WebView's callback. */
    private final class Loader implements Runnable {
        @Override
        public void run() {
            final Bitmap decoded = decode();
            main.post(new Runnable() {
                @Override
                public void run() {
                    onDecoded(decoded);
                }
            });
        }
    }

    private final class Click implements View.OnClickListener {
        private final boolean confirm;

        Click(boolean confirm) {
            this.confirm = confirm;
        }

        @Override
        public void onClick(View view) {
            if (confirm) {
                ImageCrop.this.confirm();
            } else {
                ImageCrop.this.finish(null);
            }
        }
    }

    /** The window root: a focusable full-screen layer whose BACK is Cancel. */
    private final class Root extends FrameLayout {

        Root(Context context) {
            super(context);
            setBackgroundColor(Color.BLACK);
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

    /**
     * The photo with a draggable crop frame. Crop bounds are normalized to the bitmap, so they
     * survive layout changes, the preview zoom and panning, and always map back to image pixels;
     * only the chrome (shade, marquee, handles) follows the transparency setting — the photo stays
     * fully opaque.
     */
    private static final class CropLayer extends View {

        private static final int NONE = 0;
        private static final int MOVE = 1;
        private static final int EDGE_L = 2;
        private static final int EDGE_R = 3;
        private static final int EDGE_T = 4;
        private static final int EDGE_B = 5;
        private static final int CORNER_TL = 6;
        private static final int CORNER_TR = 7;
        private static final int CORNER_BL = 8;
        private static final int CORNER_BR = 9;

        /** Smallest crop edge, as a fraction of the image, so the frame stays grabbable. */
        private static final float MIN_SIZE = 0.05f;
        private static final float SHADE = 0.6f;

        /** The frame starts as a centred square this fraction of the image's short edge: the
         *  marquee begins somewhere useful instead of covering the whole photo. */
        private static final float FRAME_START = 0.72f;

        /** How far down the image that square starts. Far enough that its top handle is nowhere
         *  near the status bar, because a drag from there opens the notification tray. */
        private static final float FRAME_TOP = 0.20f;

        private final Paint shade = new Paint();
        private final Paint stroke = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final Paint handle = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final float slop;
        private final float handleRadius;
        private final RectF imageRect = new RectF();
        private final RectF frame = new RectF();

        private Bitmap bitmap;
        private float left = 0f;
        private float top = 0f;
        private float right = 1f;
        private float bottom = 1f;
        private float chromeAlpha = 1f;
        private int drag = NONE;
        private boolean panning;
        private float panX;
        private float panY;
        private float lastX;
        private float lastY;

        CropLayer(Context context) {
            super(context);
            float density = context.getResources().getDisplayMetrics().density;
            slop = 22f * density;
            handleRadius = 8f * density;
            shade.setColor(Color.BLACK);
            stroke.setStyle(Paint.Style.STROKE);
            stroke.setStrokeWidth(Math.max(2f, 2f * density));
            stroke.setColor(Color.WHITE);
            handle.setStyle(Paint.Style.FILL);
            handle.setColor(Color.WHITE);
            applyChromeAlpha();
        }

        /** Starts on a centred square with its top edge well below the screen top. */
        void setBitmap(Bitmap value) {
            bitmap = value;
            float[] start = startFrame(value);
            left = start[0];
            top = start[1];
            right = start[2];
            bottom = start[3];
            panX = 0f;
            panY = 0f;
            requestLayout();
            invalidate();
        }

        /**
         * The starting marquee: square in image pixels, centred horizontally, its top edge down at
         * {@link #FRAME_TOP}. Expressing it in image fractions rather than screen pixels is what
         * keeps it square for any image, portrait or landscape.
         */
        private static float[] startFrame(Bitmap image) {
            if (image == null || image.getWidth() <= 0 || image.getHeight() <= 0) {
                return new float[]{0f, 0f, 1f, 1f};
            }
            float side = Math.min(image.getWidth(), image.getHeight()) * FRAME_START;
            float width = side / image.getWidth();
            float height = side / image.getHeight();
            float x = (1f - width) / 2f;
            float y = Math.min(FRAME_TOP, Math.max(0f, 1f - height));
            return new float[]{x, y, x + width, y + height};
        }

        void setChromeAlpha(float alpha) {
            chromeAlpha = alpha;
            applyChromeAlpha();
            invalidate();
        }

        private void applyChromeAlpha() {
            stroke.setAlpha(Math.round(255 * chromeAlpha));
            handle.setAlpha(Math.round(255 * chromeAlpha));
            shade.setAlpha(Math.round(255 * SHADE * chromeAlpha));
        }

        @Override
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            super.onSizeChanged(w, h, oldw, oldh);
            layoutImage(w, h);
        }

        private void layoutImage(int viewWidth, int viewHeight) {
            Bitmap image = bitmap;
            if (image == null || viewWidth <= 0 || viewHeight <= 0) {
                imageRect.setEmpty();
                return;
            }
            float fit = Math.min((float) viewWidth / image.getWidth(),
                    (float) viewHeight / image.getHeight());
            float drawWidth = image.getWidth() * fit * PREVIEW_SCALE;
            float drawHeight = image.getHeight() * fit * PREVIEW_SCALE;
            // Pan offsets are deviations from the centred position, so the zoom stays pinned on
            // the image centre and an axis smaller than the view stays centred — see clampPan.
            panX = clampPan(panX, viewWidth, drawWidth);
            panY = clampPan(panY, viewHeight, drawHeight);
            float offsetX = (viewWidth - drawWidth) / 2f + panX;
            float offsetY = (viewHeight - drawHeight) / 2f + panY;
            imageRect.set(offsetX, offsetY, offsetX + drawWidth, offsetY + drawHeight);
        }

        /**
         * Clamps a pan deviation so an axis that overflows the view can still be dragged to either
         * of its edges, while a smaller axis is forced back to the centre (there is nothing to
         * reveal on it).
         */
        private static float clampPan(float deviation, float view, float draw) {
            if (draw <= view) {
                return 0f;
            }
            float limit = (draw - view) / 2f;
            return clampFloat(deviation, -limit, limit);
        }

        /** The crop rectangle in bitmap pixels, clamped to the bitmap. */
        Rect cropPixels() {
            Bitmap image = bitmap;
            if (image == null) {
                return new Rect();
            }
            int x = clamp(Math.round(left * image.getWidth()), 0, image.getWidth() - 1);
            int y = clamp(Math.round(top * image.getHeight()), 0, image.getHeight() - 1);
            int w = clamp(Math.round((right - left) * image.getWidth()), 1, image.getWidth() - x);
            int h = clamp(Math.round((bottom - top) * image.getHeight()), 1, image.getHeight() - y);
            return new Rect(x, y, x + w, y + h);
        }

        private static int clamp(int value, int low, int high) {
            if (value < low) {
                return low;
            }
            return value > high ? high : value;
        }

        private void updateFrame() {
            frame.set(
                    imageRect.left + left * imageRect.width(),
                    imageRect.top + top * imageRect.height(),
                    imageRect.left + right * imageRect.width(),
                    imageRect.top + bottom * imageRect.height());
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Bitmap image = bitmap;
            if (image == null) {
                return;
            }
            if (imageRect.isEmpty()) {
                layoutImage(getWidth(), getHeight());
            }
            canvas.drawBitmap(image, null, imageRect, null);
            updateFrame();

            canvas.drawRect(0f, 0f, getWidth(), frame.top, shade);
            canvas.drawRect(0f, frame.bottom, getWidth(), getHeight(), shade);
            canvas.drawRect(0f, frame.top, frame.left, frame.bottom, shade);
            canvas.drawRect(frame.right, frame.top, getWidth(), frame.bottom, shade);

            canvas.drawRect(frame, stroke);
            float middleX = frame.centerX();
            float middleY = frame.centerY();
            canvas.drawCircle(frame.left, frame.top, handleRadius, handle);
            canvas.drawCircle(middleX, frame.top, handleRadius, handle);
            canvas.drawCircle(frame.right, frame.top, handleRadius, handle);
            canvas.drawCircle(frame.left, middleY, handleRadius, handle);
            canvas.drawCircle(frame.right, middleY, handleRadius, handle);
            canvas.drawCircle(frame.left, frame.bottom, handleRadius, handle);
            canvas.drawCircle(middleX, frame.bottom, handleRadius, handle);
            canvas.drawCircle(frame.right, frame.bottom, handleRadius, handle);
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            if (bitmap == null) {
                return false;
            }
            switch (event.getActionMasked()) {
                case MotionEvent.ACTION_DOWN:
                    updateFrame();
                    drag = handleAt(event.getX(), event.getY());
                    // a drag that starts outside the frame pans the zoomed preview instead, which is
                    // how an image edge the zoom pushed off-screen stays reachable
                    panning = drag == NONE;
                    lastX = event.getX();
                    lastY = event.getY();
                    return true;
                case MotionEvent.ACTION_MOVE:
                    if (drag == NONE && !panning) {
                        return true;
                    }
                    float dx = event.getX() - lastX;
                    float dy = event.getY() - lastY;
                    lastX = event.getX();
                    lastY = event.getY();
                    if (panning) {
                        panX += dx;
                        panY += dy;
                        layoutImage(getWidth(), getHeight());
                    } else {
                        applyDrag(dx / Math.max(1f, imageRect.width()),
                                dy / Math.max(1f, imageRect.height()));
                    }
                    invalidate();
                    return true;
                case MotionEvent.ACTION_UP:
                case MotionEvent.ACTION_CANCEL:
                    drag = NONE;
                    panning = false;
                    return true;
                default:
                    return false;
            }
        }

        private int handleAt(float x, float y) {
            boolean nearLeft = Math.abs(x - frame.left) <= slop;
            boolean nearRight = Math.abs(x - frame.right) <= slop;
            boolean nearTop = Math.abs(y - frame.top) <= slop;
            boolean nearBottom = Math.abs(y - frame.bottom) <= slop;
            boolean insideX = x >= frame.left - slop && x <= frame.right + slop;
            boolean insideY = y >= frame.top - slop && y <= frame.bottom + slop;
            if (nearLeft && nearTop) {
                return CORNER_TL;
            }
            if (nearRight && nearTop) {
                return CORNER_TR;
            }
            if (nearLeft && nearBottom) {
                return CORNER_BL;
            }
            if (nearRight && nearBottom) {
                return CORNER_BR;
            }
            if (nearLeft && insideY) {
                return EDGE_L;
            }
            if (nearRight && insideY) {
                return EDGE_R;
            }
            if (nearTop && insideX) {
                return EDGE_T;
            }
            if (nearBottom && insideX) {
                return EDGE_B;
            }
            return frame.contains(x, y) ? MOVE : NONE;
        }

        private void applyDrag(float dx, float dy) {
            switch (drag) {
                case MOVE: {
                    float width = right - left;
                    float height = bottom - top;
                    left = clampFloat(left + dx, 0f, 1f - width);
                    top = clampFloat(top + dy, 0f, 1f - height);
                    right = left + width;
                    bottom = top + height;
                    break;
                }
                case EDGE_L:
                    left = clampFloat(left + dx, 0f, right - MIN_SIZE);
                    break;
                case EDGE_R:
                    right = clampFloat(right + dx, left + MIN_SIZE, 1f);
                    break;
                case EDGE_T:
                    top = clampFloat(top + dy, 0f, bottom - MIN_SIZE);
                    break;
                case EDGE_B:
                    bottom = clampFloat(bottom + dy, top + MIN_SIZE, 1f);
                    break;
                case CORNER_TL:
                    left = clampFloat(left + dx, 0f, right - MIN_SIZE);
                    top = clampFloat(top + dy, 0f, bottom - MIN_SIZE);
                    break;
                case CORNER_TR:
                    right = clampFloat(right + dx, left + MIN_SIZE, 1f);
                    top = clampFloat(top + dy, 0f, bottom - MIN_SIZE);
                    break;
                case CORNER_BL:
                    left = clampFloat(left + dx, 0f, right - MIN_SIZE);
                    bottom = clampFloat(bottom + dy, top + MIN_SIZE, 1f);
                    break;
                case CORNER_BR:
                    right = clampFloat(right + dx, left + MIN_SIZE, 1f);
                    bottom = clampFloat(bottom + dy, top + MIN_SIZE, 1f);
                    break;
                default:
                    break;
            }
        }

        private static float clampFloat(float value, float low, float high) {
            if (value < low) {
                return low;
            }
            return value > high ? high : value;
        }
    }
}
