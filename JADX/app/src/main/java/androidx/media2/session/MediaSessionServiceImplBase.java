package androidx.media2.session;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.KeyEvent;
import androidx.collection.ArrayMap;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media2.common.MediaParcelUtils;
import androidx.versionedparcelable.ParcelImpl;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class MediaSessionServiceImplBase implements MediaSessionService.MediaSessionServiceImpl {
    private static final boolean DEBUG = true;
    private static final String TAG = "MSS2ImplBase";
    MediaSessionService mInstance;
    private MediaNotificationHandler mNotificationHandler;
    MediaSessionServiceStub mStub;
    private final Object mLock = new Object();
    private Map<String, MediaSession> mSessions = new ArrayMap();

    MediaSessionServiceImplBase() {
    }

    @Override // androidx.media2.session.MediaSessionService.MediaSessionServiceImpl
    public void onCreate(MediaSessionService mediaSessionService) {
        synchronized (this.mLock) {
            this.mInstance = mediaSessionService;
            this.mStub = new MediaSessionServiceStub(this);
            this.mNotificationHandler = new MediaNotificationHandler(mediaSessionService);
        }
    }

    @Override // androidx.media2.session.MediaSessionService.MediaSessionServiceImpl
    public IBinder onBind(Intent intent) {
        MediaSessionService mediaSessionServiceImplBase = getInstance();
        if (mediaSessionServiceImplBase == null) {
            Log.w(TAG, "Service hasn't created before onBind()");
            return null;
        }
        String action = intent.getAction();
        action.hashCode();
        if (action.equals(MediaSessionService.SERVICE_INTERFACE)) {
            return getServiceBinder();
        }
        if (!action.equals(MediaBrowserServiceCompat.SERVICE_INTERFACE)) {
            return null;
        }
        MediaSession mediaSessionOnGetSession = mediaSessionServiceImplBase.onGetSession(MediaSession.ControllerInfo.createLegacyControllerInfo());
        if (mediaSessionOnGetSession == null) {
            Log.d(TAG, "Rejecting incoming connection request from legacy media browsers.");
            return null;
        }
        addSession(mediaSessionOnGetSession);
        return mediaSessionOnGetSession.getLegacyBrowerServiceBinder();
    }

    @Override // androidx.media2.session.MediaSessionService.MediaSessionServiceImpl
    public void onDestroy() {
        synchronized (this.mLock) {
            this.mInstance = null;
            MediaSessionServiceStub mediaSessionServiceStub = this.mStub;
            if (mediaSessionServiceStub != null) {
                mediaSessionServiceStub.close();
                this.mStub = null;
            }
        }
    }

    @Override // androidx.media2.session.MediaSessionService.MediaSessionServiceImpl
    public void addSession(MediaSession mediaSession) {
        MediaSession mediaSession2;
        MediaNotificationHandler mediaNotificationHandler;
        synchronized (this.mLock) {
            mediaSession2 = this.mSessions.get(mediaSession.getId());
            if (mediaSession2 != null && mediaSession2 != mediaSession) {
                throw new IllegalArgumentException("Session ID should be unique");
            }
            this.mSessions.put(mediaSession.getId(), mediaSession);
        }
        if (mediaSession2 == null) {
            synchronized (this.mLock) {
                mediaNotificationHandler = this.mNotificationHandler;
            }
            mediaNotificationHandler.onPlayerStateChanged(mediaSession, mediaSession.getPlayer().getPlayerState());
            mediaSession.getCallback().setForegroundServiceEventCallback(mediaNotificationHandler);
        }
    }

    @Override // androidx.media2.session.MediaSessionService.MediaSessionServiceImpl
    public void removeSession(MediaSession mediaSession) {
        synchronized (this.mLock) {
            this.mSessions.remove(mediaSession.getId());
        }
    }

    @Override // androidx.media2.session.MediaSessionService.MediaSessionServiceImpl
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && intent.getAction() != null) {
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                MediaSessionService mediaSessionServiceImplBase = getInstance();
                if (mediaSessionServiceImplBase == null) {
                    Log.wtf(TAG, "Service hasn't created");
                }
                MediaSession session = MediaSession.getSession(intent.getData());
                if (session == null) {
                    session = mediaSessionServiceImplBase.onGetSession(MediaSession.ControllerInfo.createLegacyControllerInfo());
                }
                if (session == null) {
                    Log.d(TAG, "Rejecting wake-up of the service from media key events.");
                } else {
                    KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                    if (keyEvent != null) {
                        session.getSessionCompat().getController().dispatchMediaButtonEvent(keyEvent);
                    }
                }
            }
        }
        return 1;
    }

    @Override // androidx.media2.session.MediaSessionService.MediaSessionServiceImpl
    public MediaSessionService.MediaNotification onUpdateNotification(MediaSession mediaSession) {
        MediaNotificationHandler mediaNotificationHandler;
        synchronized (this.mLock) {
            mediaNotificationHandler = this.mNotificationHandler;
        }
        if (mediaNotificationHandler == null) {
            throw new IllegalStateException("Service hasn't created");
        }
        return mediaNotificationHandler.onUpdateNotification(mediaSession);
    }

    @Override // androidx.media2.session.MediaSessionService.MediaSessionServiceImpl
    public List<MediaSession> getSessions() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mLock) {
            arrayList.addAll(this.mSessions.values());
        }
        return arrayList;
    }

    MediaSessionService getInstance() {
        MediaSessionService mediaSessionService;
        synchronized (this.mLock) {
            mediaSessionService = this.mInstance;
        }
        return mediaSessionService;
    }

    IBinder getServiceBinder() {
        IBinder iBinderAsBinder;
        synchronized (this.mLock) {
            MediaSessionServiceStub mediaSessionServiceStub = this.mStub;
            iBinderAsBinder = mediaSessionServiceStub != null ? mediaSessionServiceStub.asBinder() : null;
        }
        return iBinderAsBinder;
    }

    private static final class MediaSessionServiceStub extends IMediaSessionService.Stub implements Closeable {
        private final Handler mHandler;
        private final androidx.media.MediaSessionManager mMediaSessionManager;
        final WeakReference<MediaSessionServiceImplBase> mServiceImpl;

        MediaSessionServiceStub(MediaSessionServiceImplBase mediaSessionServiceImplBase) {
            this.mServiceImpl = new WeakReference<>(mediaSessionServiceImplBase);
            this.mHandler = new Handler(mediaSessionServiceImplBase.getInstance().getMainLooper());
            this.mMediaSessionManager = androidx.media.MediaSessionManager.getSessionManager(mediaSessionServiceImplBase.getInstance());
        }

        @Override // androidx.media2.session.IMediaSessionService
        public void connect(final IMediaController iMediaController, ParcelImpl parcelImpl) {
            if (this.mServiceImpl.get() == null) {
                Log.d(MediaSessionServiceImplBase.TAG, "ServiceImpl isn't available");
                return;
            }
            int callingPid = Binder.getCallingPid();
            final int callingUid = Binder.getCallingUid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            final ConnectionRequest connectionRequest = (ConnectionRequest) MediaParcelUtils.fromParcelable(parcelImpl);
            if (callingPid == 0) {
                callingPid = connectionRequest.getPid();
            }
            final int i = callingPid;
            final String packageName = parcelImpl == null ? null : connectionRequest.getPackageName();
            final Bundle connectionHints = parcelImpl == null ? null : connectionRequest.getConnectionHints();
            final androidx.media.MediaSessionManager.RemoteUserInfo remoteUserInfo = new androidx.media.MediaSessionManager.RemoteUserInfo(packageName, i, callingUid);
            final boolean zIsTrustedForMediaControl = this.mMediaSessionManager.isTrustedForMediaControl(remoteUserInfo);
            try {
                this.mHandler.post(new Runnable() { // from class: androidx.media2.session.MediaSessionServiceImplBase.MediaSessionServiceStub.1
                    @Override // java.lang.Runnable
                    public void run() throws Throwable {
                        boolean z = true;
                        try {
                            MediaSessionServiceImplBase mediaSessionServiceImplBase = MediaSessionServiceStub.this.mServiceImpl.get();
                            if (mediaSessionServiceImplBase == null) {
                                Log.d(MediaSessionServiceImplBase.TAG, "ServiceImpl isn't available");
                                Log.d(MediaSessionServiceImplBase.TAG, "Notifying the controller of its disconnection");
                                try {
                                    iMediaController.onDisconnected(0);
                                    return;
                                } catch (RemoteException unused) {
                                    return;
                                }
                            }
                            MediaSessionService mediaSessionServiceImplBase2 = mediaSessionServiceImplBase.getInstance();
                            if (mediaSessionServiceImplBase2 == null) {
                                Log.d(MediaSessionServiceImplBase.TAG, "Service isn't available");
                                Log.d(MediaSessionServiceImplBase.TAG, "Notifying the controller of its disconnection");
                                try {
                                    iMediaController.onDisconnected(0);
                                    return;
                                } catch (RemoteException unused2) {
                                    return;
                                }
                            }
                            MediaSession.ControllerInfo controllerInfo = new MediaSession.ControllerInfo(remoteUserInfo, connectionRequest.getVersion(), zIsTrustedForMediaControl, null, connectionHints);
                            Log.d(MediaSessionServiceImplBase.TAG, "Handling incoming connection request from the controller=" + controllerInfo);
                            try {
                                MediaSession mediaSessionOnGetSession = mediaSessionServiceImplBase2.onGetSession(controllerInfo);
                                if (mediaSessionOnGetSession == null) {
                                    Log.w(MediaSessionServiceImplBase.TAG, "Rejecting incoming connection request from the controller=" + controllerInfo);
                                    Log.d(MediaSessionServiceImplBase.TAG, "Notifying the controller of its disconnection");
                                    try {
                                        iMediaController.onDisconnected(0);
                                        return;
                                    } catch (RemoteException unused3) {
                                        return;
                                    }
                                }
                                mediaSessionServiceImplBase2.addSession(mediaSessionOnGetSession);
                                try {
                                    mediaSessionOnGetSession.handleControllerConnectionFromService(iMediaController, connectionRequest.getVersion(), packageName, i, callingUid, connectionHints);
                                } catch (Exception e) {
                                    e = e;
                                    z = false;
                                    Log.w(MediaSessionServiceImplBase.TAG, "Failed to add a session to session service", e);
                                    if (z) {
                                        Log.d(MediaSessionServiceImplBase.TAG, "Notifying the controller of its disconnection");
                                        try {
                                            iMediaController.onDisconnected(0);
                                        } catch (RemoteException unused4) {
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z = false;
                                    if (z) {
                                        Log.d(MediaSessionServiceImplBase.TAG, "Notifying the controller of its disconnection");
                                        try {
                                            iMediaController.onDisconnected(0);
                                        } catch (RemoteException unused5) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mServiceImpl.clear();
            this.mHandler.removeCallbacksAndMessages(null);
        }
    }
}
