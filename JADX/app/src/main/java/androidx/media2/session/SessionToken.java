package androidx.media2.session;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media2.common.ClassVerificationHelper;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SessionToken implements VersionedParcelable {
    private static final int MSG_SEND_TOKEN2_FOR_LEGACY_SESSION = 1000;
    private static final String TAG = "SessionToken";
    static final int TYPE_BROWSER_SERVICE_LEGACY = 101;
    public static final int TYPE_LIBRARY_SERVICE = 2;
    public static final int TYPE_SESSION = 0;
    static final int TYPE_SESSION_LEGACY = 100;
    public static final int TYPE_SESSION_SERVICE = 1;
    private static final long WAIT_TIME_MS_FOR_SESSION_READY = 300;
    SessionTokenImpl mImpl;

    public interface OnSessionTokenCreatedListener {
        void onSessionTokenCreated(MediaSessionCompat.Token token, SessionToken sessionToken);
    }

    interface SessionTokenImpl extends VersionedParcelable {
        Object getBinder();

        ComponentName getComponentName();

        Bundle getExtras();

        String getPackageName();

        String getServiceName();

        int getType();

        int getUid();

        boolean isLegacySession();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TokenType {
    }

    public SessionToken(Context context, ComponentName componentName) {
        int i;
        if (context == null) {
            throw new NullPointerException("context shouldn't be null");
        }
        if (componentName == null) {
            throw new NullPointerException("serviceComponent shouldn't be null");
        }
        PackageManager packageManager = context.getPackageManager();
        int uid = getUid(packageManager, componentName.getPackageName());
        if (isInterfaceDeclared(packageManager, MediaLibraryService.SERVICE_INTERFACE, componentName)) {
            i = 2;
        } else if (isInterfaceDeclared(packageManager, MediaSessionService.SERVICE_INTERFACE, componentName)) {
            i = 1;
        } else {
            if (!isInterfaceDeclared(packageManager, MediaBrowserServiceCompat.SERVICE_INTERFACE, componentName)) {
                throw new IllegalArgumentException(componentName + " doesn't implement none of MediaSessionService, MediaLibraryService, MediaBrowserService nor MediaBrowserServiceCompat. Use service's full name");
            }
            i = TYPE_BROWSER_SERVICE_LEGACY;
        }
        if (i != TYPE_BROWSER_SERVICE_LEGACY) {
            this.mImpl = new SessionTokenImplBase(componentName, uid, i);
        } else {
            this.mImpl = new SessionTokenImplLegacy(componentName, uid);
        }
    }

    SessionToken(SessionTokenImpl sessionTokenImpl) {
        this.mImpl = sessionTokenImpl;
    }

    SessionToken() {
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof SessionToken) {
            return this.mImpl.equals(((SessionToken) obj).mImpl);
        }
        return false;
    }

    public String toString() {
        return this.mImpl.toString();
    }

    public int getUid() {
        return this.mImpl.getUid();
    }

    public String getPackageName() {
        return this.mImpl.getPackageName();
    }

    public String getServiceName() {
        return this.mImpl.getServiceName();
    }

    public ComponentName getComponentName() {
        return this.mImpl.getComponentName();
    }

    public int getType() {
        return this.mImpl.getType();
    }

    public Bundle getExtras() {
        Bundle extras = this.mImpl.getExtras();
        if (extras == null || MediaUtils.doesBundleHaveCustomParcelable(extras)) {
            return Bundle.EMPTY;
        }
        return new Bundle(extras);
    }

    public boolean isLegacySession() {
        return this.mImpl.isLegacySession();
    }

    public Object getBinder() {
        return this.mImpl.getBinder();
    }

    public static void createSessionToken(Context context, final MediaSessionCompat.Token token, final OnSessionTokenCreatedListener onSessionTokenCreatedListener) {
        if (context == null) {
            throw new NullPointerException("context shouldn't be null");
        }
        if (token == null) {
            throw new NullPointerException("compatToken shouldn't be null");
        }
        if (onSessionTokenCreatedListener == null) {
            throw new NullPointerException("listener shouldn't be null");
        }
        VersionedParcelable session2Token = token.getSession2Token();
        if (session2Token instanceof SessionToken) {
            onSessionTokenCreatedListener.onSessionTokenCreated(token, (SessionToken) session2Token);
            return;
        }
        final MediaControllerCompat mediaControllerCompatCreateMediaControllerCompat = createMediaControllerCompat(context, token);
        final String packageName = mediaControllerCompatCreateMediaControllerCompat.getPackageName();
        final int uid = getUid(context.getPackageManager(), packageName);
        final HandlerThread handlerThread = new HandlerThread(TAG);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper()) { // from class: androidx.media2.session.SessionToken.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                synchronized (onSessionTokenCreatedListener) {
                    if (message.what != 1000) {
                        return;
                    }
                    mediaControllerCompatCreateMediaControllerCompat.unregisterCallback((MediaControllerCompat.Callback) message.obj);
                    SessionToken sessionToken = new SessionToken(new SessionTokenImplLegacy(token, packageName, uid, mediaControllerCompatCreateMediaControllerCompat.getSessionInfo()));
                    token.setSession2Token(sessionToken);
                    onSessionTokenCreatedListener.onSessionTokenCreated(token, sessionToken);
                    SessionToken.quitHandlerThread(handlerThread);
                }
            }
        };
        MediaControllerCompat.Callback callback = new MediaControllerCompat.Callback() { // from class: androidx.media2.session.SessionToken.2
            @Override // android.support.v4.media.session.MediaControllerCompat.Callback
            public void onSessionReady() {
                SessionToken sessionToken;
                synchronized (onSessionTokenCreatedListener) {
                    handler.removeMessages(1000);
                    mediaControllerCompatCreateMediaControllerCompat.unregisterCallback(this);
                    if (token.getSession2Token() instanceof SessionToken) {
                        sessionToken = (SessionToken) token.getSession2Token();
                    } else {
                        sessionToken = new SessionToken(new SessionTokenImplLegacy(token, packageName, uid, mediaControllerCompatCreateMediaControllerCompat.getSessionInfo()));
                        token.setSession2Token(sessionToken);
                    }
                    onSessionTokenCreatedListener.onSessionTokenCreated(token, sessionToken);
                    SessionToken.quitHandlerThread(handlerThread);
                }
            }
        };
        synchronized (onSessionTokenCreatedListener) {
            mediaControllerCompatCreateMediaControllerCompat.registerCallback(callback, handler);
            handler.sendMessageDelayed(handler.obtainMessage(1000, callback), WAIT_TIME_MS_FOR_SESSION_READY);
        }
    }

    static void quitHandlerThread(HandlerThread handlerThread) {
        ClassVerificationHelper.HandlerThread.Api18.quitSafely(handlerThread);
    }

    private static boolean isInterfaceDeclared(PackageManager packageManager, String str, ComponentName componentName) {
        Intent intent = new Intent(str);
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (listQueryIntentServices != null) {
            for (int i = 0; i < listQueryIntentServices.size(); i++) {
                ResolveInfo resolveInfo = listQueryIntentServices.get(i);
                if (resolveInfo != null && resolveInfo.serviceInfo != null && TextUtils.equals(resolveInfo.serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int getUid(PackageManager packageManager, String str) {
        try {
            return packageManager.getApplicationInfo(str, 0).uid;
        } catch (PackageManager.NameNotFoundException unused) {
            throw new IllegalArgumentException("Cannot find package " + str);
        }
    }

    private static MediaControllerCompat createMediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        return new MediaControllerCompat(context, token);
    }
}
