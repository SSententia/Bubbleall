package androidx.media2.widget;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
class UriUtil {
    static boolean isFromNetwork(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        return scheme.equals("http") || scheme.equals("https") || scheme.equals("rtsp");
    }

    private UriUtil() {
    }
}
