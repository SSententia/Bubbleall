package androidx.media2.session;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class MediaConstants {
    static final String ARGUMENT_CAPTIONING_ENABLED = "androidx.media2.argument.CAPTIONING_ENABLED";
    public static final String MEDIA_URI_PATH_PLAY_FROM_MEDIA_ID = "playFromMediaId";
    public static final String MEDIA_URI_PATH_PLAY_FROM_SEARCH = "playFromSearch";
    public static final String MEDIA_URI_PATH_PREPARE_FROM_MEDIA_ID = "prepareFromMediaId";
    public static final String MEDIA_URI_PATH_PREPARE_FROM_SEARCH = "prepareFromSearch";
    public static final String MEDIA_URI_QUERY_ID = "id";
    public static final String MEDIA_URI_QUERY_QUERY = "query";
    public static final String MEDIA_URI_QUERY_URI = "uri";
    public static final String MEDIA_URI_SCHEME = "androidx";
    public static final String MEDIA_URI_AUTHORITY = "media2-session";
    public static final String MEDIA_URI_PATH_SET_MEDIA_URI = "setMediaUri";
    static final String MEDIA_URI_SET_MEDIA_URI_PREFIX = new Uri.Builder().scheme(MEDIA_URI_SCHEME).authority(MEDIA_URI_AUTHORITY).path(MEDIA_URI_PATH_SET_MEDIA_URI).build().toString() + "?";

    private MediaConstants() {
    }
}
