package com.alexmanzana.bubbleall.utils;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;
import com.alexmanzana.bubbleall.views.AttachCropOption;
import com.alexmanzana.bubbleall.views.PickGalleryOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * One-tap image attach for the bubble browser's file inputs.
 *
 * <p>Web$2 -- the WebChromeClient installed on every {@code views.Web} -- never overrode
 * onShowFileChooser, so {@code <input type=file>} requests from sites such as ChatGPT or Google
 * AI Studio were silently dropped: Chromium asked the app for a file and the default no-op
 * answered nothing. {@link #handle} answers them instead, two ways, chosen by the bubble config:
 *
 * <ul>
 *   <li><b>Pick from gallery off</b> (the default): the newest image in the gallery is attached
 *       immediately, no picker. With "Crop before attaching" on, it goes through
 *       {@link ImageCrop} first.
 *   <li><b>Pick from gallery on</b>: {@link ImagePicker} shows the recent images so the user
 *       chooses. Every chosen image is cropped in turn when "Crop before attaching" is on, and
 *       the whole selection is then handed to the site in a single answer, because a page reads
 *       its file list from one {@code onReceiveValue} call. Whether several can be picked is the
 *       page's call: a file field that accepts more than one file
 *       ({@link #MODE_OPEN_MULTIPLE}) gets multi-select, a plain one gets single-select.
 * </ul>
 *
 * <p>Any failure falls back to attaching the whole image, so a broken screen can never turn an
 * upload button dead again.
 *
 * <p>This source is the origin of {@code APKtool/smali/com/alexmanzana/bubbleall/utils/LatestImage*.smali};
 * regenerate with {@code scripts/gen-helper.sh} rather than editing the smali by hand.
 */
public final class LatestImage {

    /** WebChromeClient.FileChooserParams.MODE_SAVE */
    private static final int MODE_SAVE = 3;

    /** WebChromeClient.FileChooserParams.MODE_OPEN_MULTIPLE: the input has {@code multiple}. */
    private static final int MODE_OPEN_MULTIPLE = 2;

    private static final int REQUEST_CODE = 8811;
    private static final int PERMISSION_GRANTED = 0;

    private static final String TAG = "BubbleUpload";

    private static final String PERM_IMAGES = "android.permission.READ_MEDIA_IMAGES";
    private static final String PERM_STORAGE = "android.permission.READ_EXTERNAL_STORAGE";

    private static final String TEXT_NEED_PERMISSION =
            "Allow photo access to BubbleAll to attach images";

    private static final String[] IMAGE_EXTENSIONS = {
            ".png", ".jpg", ".jpeg", ".webp", ".gif", ".bmp", ".heic", ".heif", ".avif"
    };

    private LatestImage() {
    }

    /** Called from Web$2.onShowFileChooser. Returns true when the request was answered. */
    public static boolean handle(WebView view, ValueCallback<Uri[]> callback,
                                 WebChromeClient.FileChooserParams params) {
        if (view == null || callback == null || params == null) {
            return false;
        }
        boolean imageWanted = false;
        boolean picker = false;
        boolean cropping = false;
        int mode = -1;
        Uri newest = null;
        Batch batch = null;
        boolean owned = false;                       // the batch owns the callback from here on
        try {
            mode = params.getMode();
            imageWanted = wantsImage(params);
            if (mode == MODE_SAVE || !imageWanted) {
                return false;                        // download target, or a non-image input
            }
            Context context = view.getContext();
            if (context == null) {
                return false;
            }
            if (!hasImagePermission(context)) {
                toast(context, TEXT_NEED_PERMISSION);
            } else {
                batch = new Batch(context, callback);
                if (PickGalleryOption.enabled(context)) {
                    picker = ImagePicker.show(context, batch, mode == MODE_OPEN_MULTIPLE);
                    if (!picker) {
                        // an empty gallery, or a picker that could not open: answer cleanly
                        batch.onPicked(null);
                    }
                } else {
                    Newest found = newestImage(context);
                    newest = found == null ? null : found.uri;
                    if (found == null) {
                        batch.onPicked(null);
                    } else {
                        batch.attachNewest(found.uri, found.orientation);
                        cropping = batch.deferred();  // the crop screen answers later
                    }
                }
                owned = true;
            }
        } catch (Throwable failure) {
            Log.w(TAG, "file chooser could not be answered: " + failure);
        }
        if (!owned) {
            if (batch != null) {
                batch.onPicked(null);
            } else {
                deliver(callback, null);             // the callback must never be left dangling
            }
        }
        log(mode, imageWanted, owned, picker, cropping, newest);
        return true;
    }

    /** Single line of evidence in logcat: adb logcat -s BubbleUpload */
    private static void log(int mode, boolean imageWanted, boolean handled, boolean picker,
                            boolean cropping, Uri uri) {
        try {
            Log.i(TAG, "file chooser: mode=" + mode + " image=" + imageWanted
                    + " handled=" + handled + " picker=" + picker + " crop=" + cropping
                    + " uri=" + uri);
        } catch (Throwable ignored) {
        }
    }

    /** Asks for photo access from MainActivity; {@link #handle} re-checks on every use. */
    public static void requestImagePermissionIfNeeded(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            String permission = imagePermission();
            if (activity.checkSelfPermission(permission) != PERMISSION_GRANTED) {
                activity.requestPermissions(new String[]{permission}, REQUEST_CODE);
            }
        } catch (Throwable ignored) {
        }
    }

    private static String imagePermission() {
        return Build.VERSION.SDK_INT >= 33 ? PERM_IMAGES : PERM_STORAGE;
    }

    private static boolean hasImagePermission(Context context) {
        try {
            return context.checkSelfPermission(imagePermission()) == PERMISSION_GRANTED;
        } catch (Throwable ignored) {
            return false;
        }
    }

    /** True only for inputs that accept images, so every other upload button behaves as before. */
    private static boolean wantsImage(WebChromeClient.FileChooserParams params) {
        String[] types;
        try {
            types = params.getAcceptTypes();
        } catch (Throwable ignored) {
            types = null;
        }
        if (types == null || types.length == 0) {
            return true;                             // no accept attribute: anything goes
        }
        for (int i = 0; i < types.length; i++) {
            String type = types[i];
            if (type == null) {
                continue;
            }
            String value = type.trim().toLowerCase(Locale.US);
            if (value.length() == 0 || value.equals("*/*") || value.startsWith("image/")) {
                return true;
            }
            for (int j = 0; j < IMAGE_EXTENSIONS.length; j++) {
                if (value.equals(IMAGE_EXTENSIONS[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    /** The newest gallery image, with the rotation MediaStore recorded for it. */
    private static final class Newest {
        final Uri uri;
        final int orientation;

        Newest(Uri uri, int orientation) {
            this.uri = uri;
            this.orientation = orientation;
        }
    }

    /** Newest row in MediaStore.Images -- screenshots, camera shots and downloads alike. */
    private static Newest newestImage(Context context) {
        Uri base = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Cursor cursor = null;
        long id = 0L;
        try {
            cursor = context.getContentResolver().query(
                    base,
                    new String[]{MediaStore.Images.Media._ID},
                    null,
                    null,
                    MediaStore.Images.Media._ID + " DESC");
            if (cursor != null && cursor.moveToFirst()) {
                id = cursor.getLong(0);
            }
        } catch (Throwable ignored) {
        } finally {
            close(cursor);
        }
        if (id <= 0L) {
            return null;
        }
        Uri uri = ContentUris.withAppendedId(base, id);
        return new Newest(uri, orientationOf(context, uri));
    }

    /**
     * MediaStore's recorded rotation for one image, queried separately: a missing or unreadable
     * ORIENTATION column must not be able to break finding the image itself.
     */
    private static int orientationOf(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(
                    uri,
                    new String[]{MediaStore.Images.Media.ORIENTATION},
                    null,
                    null,
                    null);
            if (cursor != null && cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getInt(0);
            }
        } catch (Throwable ignored) {
        } finally {
            close(cursor);
        }
        return 0;
    }

    private static void close(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable ignored) {
            }
        }
    }

    private static void deliver(ValueCallback<Uri[]> callback, Uri uri) {
        try {
            if (uri == null) {
                callback.onReceiveValue(null);       // clean cancel
            } else {
                callback.onReceiveValue(new Uri[]{uri});
            }
        } catch (Throwable ignored) {
        }
    }

    private static void toast(Context context, String text) {
        try {
            Toast.makeText(context, text, Toast.LENGTH_LONG).show();
        } catch (Throwable ignored) {
        }
    }

    /**
     * Answers one file-chooser request, with one image or with several.
     *
     * <p>Both routes -- the newest image and a gallery selection -- end up here, and this is the
     * only place that reports back to the WebView. When "Crop before attaching" is on, the images
     * are cropped one after another: each crop screen shows a single picked image, the ones
     * already cropped are held, and the whole set is handed over in one answer at the end.
     *
     * <p>Cancelling any one crop screen cancels the whole attach. Half a selection arriving at the
     * site would be worse than none of it, and the answer is all-or-nothing anyway: a WebView file
     * chooser can only be answered once.
     */
    private static final class Batch implements ImageCrop.Sink, ImagePicker.Sink {

        private final Context context;
        private final ValueCallback<Uri[]> callback;
        private final boolean crop;

        private List<ImagePicker.Pick> picks;
        private Uri[] results;
        private int index;
        private boolean settled;

        Batch(Context context, ValueCallback<Uri[]> callback) {
            this.context = context;
            this.callback = callback;
            this.crop = AttachCropOption.enabled(context);
        }

        /** One image and no picker: the newest-image route, reported exactly like a selection. */
        void attachNewest(Uri uri, int orientation) {
            if (uri == null) {
                settle(null);
                return;
            }
            ArrayList<ImagePicker.Pick> one = new ArrayList<ImagePicker.Pick>();
            one.add(new ImagePicker.Pick(uri, orientation));
            start(one);
        }

        @Override
        public void onPicked(List<ImagePicker.Pick> selection) {
            if (selection == null || selection.isEmpty()) {
                settle(null);
                return;
            }
            start(selection);
        }

        /** True while a crop screen is showing, i.e. the answer comes back later. */
        boolean deferred() {
            return !settled;
        }

        private void start(List<ImagePicker.Pick> selection) {
            picks = selection;
            results = new Uri[selection.size()];
            index = 0;
            advance();
        }

        /** Crops the next image, or reports the batch when there is nothing left to crop. */
        private void advance() {
            if (settled) {
                return;
            }
            while (index < picks.size()) {
                ImagePicker.Pick pick = picks.get(index);
                if (crop && ImageCrop.show(context, pick.uri, this, pick.orientation)) {
                    return;                          // the crop screen answers for this image
                }
                results[index] = pick.uri;           // no crop: attach the original bytes
                index++;
            }
            settle(results);
        }

        @Override
        public void onResult(Uri uri) {
            if (settled) {
                return;
            }
            if (uri == null) {
                Log.i(TAG, "crop cancelled: the whole attach is dropped");
                settle(null);
                return;
            }
            results[index] = uri;
            index++;
            advance();
        }

        /** Delivers the selection, or a clean cancel. Only the first call has any effect. */
        private void settle(Uri[] answer) {
            if (settled) {
                return;
            }
            settled = true;
            Uri[] value = answer;
            if (value != null) {
                ArrayList<Uri> kept = new ArrayList<Uri>(value.length);
                for (int i = 0; i < value.length; i++) {
                    if (value[i] != null) {
                        kept.add(value[i]);
                    }
                }
                if (kept.isEmpty()) {
                    value = null;
                } else if (kept.size() != value.length) {
                    value = kept.toArray(new Uri[kept.size()]);
                }
            }
            Log.i(TAG, value == null
                    ? "file chooser: answered with no file"
                    : "file chooser: answered with " + value.length + " image(s)"
                            + (crop ? ", cropped" : ", as picked"));
            try {
                callback.onReceiveValue(value);
            } catch (Throwable failure) {
                Log.w(TAG, "the file chooser callback refused the images: " + failure);
            }
        }
    }
}
