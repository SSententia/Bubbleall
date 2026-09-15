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
import java.util.Locale;

/**
 * One-tap image attach for the bubble browser's file inputs.
 *
 * <p>Web$2 -- the WebChromeClient installed on every {@code views.Web} -- never overrode
 * onShowFileChooser, so {@code <input type=file>} requests from sites such as ChatGPT or Google
 * AI Studio were silently dropped: Chromium asked the app for a file and the default no-op
 * answered nothing. {@link #handle} answers them with the newest image in the gallery instead of
 * showing a picker, so a single tap on "upload" really does upload.
 *
 * <p>When the "Crop before attaching" row in the bubble config is on (the default), the newest
 * image is handed to {@link ImageCrop} first: a full-screen crop screen answers the file chooser
 * with the cropped region instead. Any failure there falls back to attaching the whole image, so
 * a broken crop screen can never turn an upload button dead again.
 *
 * <p>This source is the origin of {@code APKtool/smali/com/alexmanzana/bubbleall/utils/LatestImage.smali};
 * regenerate with {@code scripts/gen-helper.sh} rather than editing the smali by hand.
 */
public final class LatestImage {

    /** WebChromeClient.FileChooserParams.MODE_SAVE */
    private static final int MODE_SAVE = 3;

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
        boolean answered = false;
        boolean imageWanted = false;
        boolean cropping = false;
        int mode = -1;
        Uri result = null;
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
            answered = true;
            if (!hasImagePermission(context)) {
                toast(context, TEXT_NEED_PERMISSION);
            } else {
                Newest newest = newestImage(context);
                if (newest != null && AttachCropOption.enabled(context)
                        && ImageCrop.show(context, newest.uri, callback, newest.orientation)) {
                    cropping = true;             // the crop screen owns the callback from here on
                } else {
                    result = newest == null ? null : newest.uri;
                }
            }
        } catch (Throwable ignored) {
            answered = true;                         // the callback must never be left dangling
        }
        log(mode, imageWanted, answered, cropping, result);
        if (answered && !cropping) {
            deliver(callback, result);
        }
        return answered;
    }

    /** Single line of evidence in logcat: adb logcat -s BubbleUpload */
    private static void log(int mode, boolean imageWanted, boolean answered, boolean cropping,
                            Uri uri) {
        try {
            Log.i(TAG, "file chooser: mode=" + mode + " image=" + imageWanted
                    + " handled=" + answered + " crop=" + cropping + " uri=" + uri);
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
}
