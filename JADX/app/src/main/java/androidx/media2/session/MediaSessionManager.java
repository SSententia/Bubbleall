package androidx.media2.session;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.collection.ArraySet;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionManager {
    private static MediaSessionManager sInstance;
    private final Context mContext;
    static final String TAG = "MediaSessionManager";
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private static final Object sLock = new Object();

    public static MediaSessionManager getInstance(Context context) {
        MediaSessionManager mediaSessionManager;
        if (context == null) {
            throw new NullPointerException("context shouldn't be null");
        }
        synchronized (sLock) {
            if (sInstance == null) {
                sInstance = new MediaSessionManager(context.getApplicationContext());
            }
            mediaSessionManager = sInstance;
        }
        return mediaSessionManager;
    }

    private MediaSessionManager(Context context) {
        this.mContext = context;
    }

    public Set<SessionToken> getSessionServiceTokens() {
        ArraySet arraySet = new ArraySet();
        PackageManager packageManager = this.mContext.getPackageManager();
        ArrayList<ResolveInfo> arrayList = new ArrayList();
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent(MediaLibraryService.SERVICE_INTERFACE), 128);
        if (listQueryIntentServices != null) {
            arrayList.addAll(listQueryIntentServices);
        }
        List<ResolveInfo> listQueryIntentServices2 = packageManager.queryIntentServices(new Intent(MediaSessionService.SERVICE_INTERFACE), 128);
        if (listQueryIntentServices2 != null) {
            arrayList.addAll(listQueryIntentServices2);
        }
        List<ResolveInfo> listQueryIntentServices3 = packageManager.queryIntentServices(new Intent(MediaBrowserServiceCompat.SERVICE_INTERFACE), 128);
        if (listQueryIntentServices3 != null) {
            arrayList.addAll(listQueryIntentServices3);
        }
        for (ResolveInfo resolveInfo : arrayList) {
            if (resolveInfo != null && resolveInfo.serviceInfo != null) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                arraySet.add(new SessionToken(this.mContext, new ComponentName(serviceInfo.packageName, serviceInfo.name)));
            }
        }
        if (DEBUG) {
            Log.d(TAG, "Found " + arraySet.size() + " session services");
            Iterator it = arraySet.iterator();
            while (it.hasNext()) {
                Log.d(TAG, "   " + ((SessionToken) it.next()));
            }
        }
        return arraySet;
    }
}
