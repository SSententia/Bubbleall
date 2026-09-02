package androidx.media2.session;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Surface;
import androidx.concurrent.futures.AbstractResolvableFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.util.ObjectsCompat;
import androidx.media.AudioAttributesCompat;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media2.common.BaseResult;
import androidx.media2.common.ClassVerificationHelper;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.VideoSize;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
class MediaSessionImplBase implements MediaSession.MediaSessionImpl {
    private static boolean sComponentNamesInitialized = false;
    private static ComponentName sServiceComponentName;
    private final AudioManager mAudioManager;
    private final BroadcastReceiver mBroadcastReceiver;
    private MediaBrowserServiceCompat mBrowserServiceLegacyStub;
    final MediaSession.SessionCallback mCallback;
    final Executor mCallbackExecutor;
    private boolean mClosed;
    private final Context mContext;
    private final Handler mHandler;
    private final HandlerThread mHandlerThread;
    private final MediaSession mInstance;
    final Object mLock = new Object();
    private final PendingIntent mMediaButtonIntent;
    MediaController.PlaybackInfo mPlaybackInfo;
    SessionPlayer mPlayer;
    private final SessionPlayerCallback mPlayerCallback;
    private final PendingIntent mSessionActivity;
    private final String mSessionId;
    private final MediaSessionLegacyStub mSessionLegacyStub;
    private final MediaSessionStub mSessionStub;
    private final SessionToken mSessionToken;
    final Uri mSessionUri;
    private static final Object STATIC_LOCK = new Object();
    static final String TAG = "MSImplBase";
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private static final SessionResult RESULT_WHEN_CLOSED = new SessionResult(1);

    @FunctionalInterface
    interface PlayerTask<T> {
        T run(SessionPlayer sessionPlayer) throws Exception;
    }

    @FunctionalInterface
    interface RemoteControllerTask {
        void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException;
    }

    MediaSessionImplBase(MediaSession mediaSession, Context context, String str, SessionPlayer sessionPlayer, PendingIntent pendingIntent, Executor executor, MediaSession.SessionCallback sessionCallback, Bundle bundle) {
        ComponentName componentName;
        this.mContext = context;
        this.mInstance = mediaSession;
        HandlerThread handlerThread = new HandlerThread("MediaSession_Thread");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mHandler = handler;
        MediaSessionStub mediaSessionStub = new MediaSessionStub(this);
        this.mSessionStub = mediaSessionStub;
        this.mSessionActivity = pendingIntent;
        this.mCallback = sessionCallback;
        this.mCallbackExecutor = executor;
        this.mAudioManager = (AudioManager) context.getSystemService("audio");
        this.mPlayerCallback = new SessionPlayerCallback(this);
        this.mSessionId = str;
        Uri uriBuild = new Uri.Builder().scheme(MediaSessionImplBase.class.getName()).appendPath(str).appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.mSessionUri = uriBuild;
        this.mSessionToken = new SessionToken(new SessionTokenImplBase(Process.myUid(), 0, context.getPackageName(), mediaSessionStub, bundle));
        synchronized (STATIC_LOCK) {
            if (!sComponentNamesInitialized) {
                ComponentName serviceComponentByAction = getServiceComponentByAction(MediaLibraryService.SERVICE_INTERFACE);
                sServiceComponentName = serviceComponentByAction;
                if (serviceComponentByAction == null) {
                    sServiceComponentName = getServiceComponentByAction(MediaSessionService.SERVICE_INTERFACE);
                }
                sComponentNamesInitialized = true;
            }
            componentName = sServiceComponentName;
        }
        int i = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
        if (componentName == null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", uriBuild);
            intent.setPackage(context.getPackageName());
            this.mMediaButtonIntent = PendingIntent.getBroadcast(context, 0, intent, i);
            componentName = new ComponentName(context, context.getClass());
            MediaButtonReceiver mediaButtonReceiver = new MediaButtonReceiver();
            this.mBroadcastReceiver = mediaButtonReceiver;
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            intentFilter.addDataScheme(uriBuild.getScheme());
            context.registerReceiver(mediaButtonReceiver, intentFilter);
        } else {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON", uriBuild);
            intent2.setComponent(componentName);
            if (Build.VERSION.SDK_INT >= 26) {
                this.mMediaButtonIntent = ClassVerificationHelper.PendingIntent.Api26.getForegroundService(context, 0, intent2, i);
            } else {
                this.mMediaButtonIntent = PendingIntent.getService(context, 0, intent2, i);
            }
            this.mBroadcastReceiver = null;
        }
        MediaSessionLegacyStub mediaSessionLegacyStub = new MediaSessionLegacyStub(this, componentName, this.mMediaButtonIntent, handler);
        this.mSessionLegacyStub = mediaSessionLegacyStub;
        updatePlayer(sessionPlayer);
        mediaSessionLegacyStub.start();
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public void updatePlayer(SessionPlayer sessionPlayer) {
        MediaController.PlaybackInfo playbackInfoCreatePlaybackInfo = createPlaybackInfo(sessionPlayer, null);
        synchronized (this.mLock) {
            SessionPlayer sessionPlayer2 = this.mPlayer;
            if (sessionPlayer2 == sessionPlayer) {
                return;
            }
            this.mPlayer = sessionPlayer;
            MediaController.PlaybackInfo playbackInfo = this.mPlaybackInfo;
            this.mPlaybackInfo = playbackInfoCreatePlaybackInfo;
            if (sessionPlayer2 != null) {
                sessionPlayer2.unregisterPlayerCallback(this.mPlayerCallback);
            }
            sessionPlayer.registerPlayerCallback(this.mCallbackExecutor, this.mPlayerCallback);
            notifyPlayerUpdatedNotLocked(sessionPlayer2, playbackInfo, sessionPlayer, playbackInfoCreatePlaybackInfo);
        }
    }

    MediaController.PlaybackInfo createPlaybackInfo(SessionPlayer sessionPlayer, AudioAttributesCompat audioAttributesCompat) {
        if (audioAttributesCompat == null) {
            audioAttributesCompat = sessionPlayer.getAudioAttributes();
        }
        if (!(sessionPlayer instanceof RemoteSessionPlayer)) {
            int legacyStreamType = MediaUtils.getLegacyStreamType(audioAttributesCompat);
            return MediaController.PlaybackInfo.createPlaybackInfo(1, audioAttributesCompat, ClassVerificationHelper.AudioManager.Api21.isVolumeFixed(this.mAudioManager) ? 0 : 2, this.mAudioManager.getStreamMaxVolume(legacyStreamType), this.mAudioManager.getStreamVolume(legacyStreamType));
        }
        RemoteSessionPlayer remoteSessionPlayer = (RemoteSessionPlayer) sessionPlayer;
        return MediaController.PlaybackInfo.createPlaybackInfo(2, audioAttributesCompat, remoteSessionPlayer.getVolumeControlType(), remoteSessionPlayer.getMaxVolume(), remoteSessionPlayer.getVolume());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            this.mClosed = true;
            if (DEBUG) {
                Log.d(TAG, "Closing session, id=" + getId() + ", token=" + getToken());
            }
            this.mPlayer.unregisterPlayerCallback(this.mPlayerCallback);
            this.mMediaButtonIntent.cancel();
            this.mSessionLegacyStub.close();
            BroadcastReceiver broadcastReceiver = this.mBroadcastReceiver;
            if (broadcastReceiver != null) {
                this.mContext.unregisterReceiver(broadcastReceiver);
            }
            this.mCallback.onSessionClosed(this.mInstance);
            dispatchRemoteControllerTaskWithoutReturn(new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.1
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                    controllerCb.onDisconnected(i);
                }
            });
            this.mHandler.removeCallbacksAndMessages(null);
            if (this.mHandlerThread.isAlive()) {
                ClassVerificationHelper.HandlerThread.Api18.quitSafely(this.mHandlerThread);
            }
        }
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public SessionPlayer getPlayer() {
        SessionPlayer sessionPlayer;
        synchronized (this.mLock) {
            sessionPlayer = this.mPlayer;
        }
        return sessionPlayer;
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public String getId() {
        return this.mSessionId;
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public Uri getUri() {
        return this.mSessionUri;
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public SessionToken getToken() {
        return this.mSessionToken;
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public List<MediaSession.ControllerInfo> getConnectedControllers() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mSessionStub.getConnectedControllersManager().getConnectedControllers());
        arrayList.addAll(this.mSessionLegacyStub.getConnectedControllersManager().getConnectedControllers());
        return arrayList;
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public boolean isConnected(MediaSession.ControllerInfo controllerInfo) {
        if (controllerInfo == null) {
            return false;
        }
        return this.mSessionStub.getConnectedControllersManager().isConnected(controllerInfo) || this.mSessionLegacyStub.getConnectedControllersManager().isConnected(controllerInfo);
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public ListenableFuture<SessionResult> setCustomLayout(MediaSession.ControllerInfo controllerInfo, final List<MediaSession.CommandButton> list) {
        return dispatchRemoteControllerTask(controllerInfo, new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.2
            @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
            public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                controllerCb.setCustomLayout(i, list);
            }
        });
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public void setAllowedCommands(MediaSession.ControllerInfo controllerInfo, final SessionCommandGroup sessionCommandGroup) {
        if (this.mSessionStub.getConnectedControllersManager().isConnected(controllerInfo)) {
            this.mSessionStub.getConnectedControllersManager().updateAllowedCommands(controllerInfo, sessionCommandGroup);
            dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.3
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                    controllerCb.onAllowedCommandsChanged(i, sessionCommandGroup);
                }
            });
        } else {
            this.mSessionLegacyStub.getConnectedControllersManager().updateAllowedCommands(controllerInfo, sessionCommandGroup);
        }
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public void broadcastCustomCommand(final SessionCommand sessionCommand, final Bundle bundle) {
        dispatchRemoteControllerTaskWithoutReturn(new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.4
            @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
            public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                controllerCb.sendCustomCommand(i, sessionCommand, bundle);
            }
        });
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public ListenableFuture<SessionResult> sendCustomCommand(MediaSession.ControllerInfo controllerInfo, final SessionCommand sessionCommand, final Bundle bundle) {
        return dispatchRemoteControllerTask(controllerInfo, new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.5
            @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
            public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                controllerCb.sendCustomCommand(i, sessionCommand, bundle);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaybackControl
    public ListenableFuture<SessionPlayer.PlayerResult> play() {
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                if (sessionPlayer.getPlayerState() != 0) {
                    return sessionPlayer.play();
                }
                ListenableFuture<SessionPlayer.PlayerResult> listenableFuturePrepare = sessionPlayer.prepare();
                ListenableFuture<SessionPlayer.PlayerResult> listenableFuturePlay = sessionPlayer.play();
                if (listenableFuturePrepare == null || listenableFuturePlay == null) {
                    return null;
                }
                return CombinedCommandResultFuture.create(MediaUtils.DIRECT_EXECUTOR, listenableFuturePrepare, listenableFuturePlay);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaybackControl
    public ListenableFuture<SessionPlayer.PlayerResult> pause() {
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.pause();
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaybackControl
    public ListenableFuture<SessionPlayer.PlayerResult> prepare() {
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.prepare();
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaybackControl
    public ListenableFuture<SessionPlayer.PlayerResult> seekTo(final long j) {
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.seekTo(j);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaybackControl
    public int getPlayerState() {
        return ((Integer) dispatchPlayerTask(new PlayerTask<Integer>() { // from class: androidx.media2.session.MediaSessionImplBase.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public Integer run(SessionPlayer sessionPlayer) throws Exception {
                return Integer.valueOf(sessionPlayer.getPlayerState());
            }
        }, 3)).intValue();
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaybackControl
    public long getCurrentPosition() {
        return ((Long) dispatchPlayerTask(new PlayerTask<Long>() { // from class: androidx.media2.session.MediaSessionImplBase.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public Long run(SessionPlayer sessionPlayer) throws Exception {
                if (MediaSessionImplBase.this.isInPlaybackState(sessionPlayer)) {
                    return Long.valueOf(sessionPlayer.getCurrentPosition());
                }
                return null;
            }
        }, Long.MIN_VALUE)).longValue();
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaybackControl
    public long getDuration() {
        return ((Long) dispatchPlayerTask(new PlayerTask<Long>() { // from class: androidx.media2.session.MediaSessionImplBase.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public Long run(SessionPlayer sessionPlayer) throws Exception {
                if (MediaSessionImplBase.this.isInPlaybackState(sessionPlayer)) {
                    return Long.valueOf(sessionPlayer.getDuration());
                }
                return null;
            }
        }, Long.MIN_VALUE)).longValue();
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaybackControl
    public long getBufferedPosition() {
        return ((Long) dispatchPlayerTask(new PlayerTask<Long>() { // from class: androidx.media2.session.MediaSessionImplBase.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public Long run(SessionPlayer sessionPlayer) throws Exception {
                if (MediaSessionImplBase.this.isInPlaybackState(sessionPlayer)) {
                    return Long.valueOf(sessionPlayer.getBufferedPosition());
                }
                return null;
            }
        }, Long.MIN_VALUE)).longValue();
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaybackControl
    public int getBufferingState() {
        return ((Integer) dispatchPlayerTask(new PlayerTask<Integer>() { // from class: androidx.media2.session.MediaSessionImplBase.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public Integer run(SessionPlayer sessionPlayer) throws Exception {
                return Integer.valueOf(sessionPlayer.getBufferingState());
            }
        }, 0)).intValue();
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaybackControl
    public float getPlaybackSpeed() {
        return ((Float) dispatchPlayerTask(new PlayerTask<Float>() { // from class: androidx.media2.session.MediaSessionImplBase.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public Float run(SessionPlayer sessionPlayer) throws Exception {
                if (MediaSessionImplBase.this.isInPlaybackState(sessionPlayer)) {
                    return Float.valueOf(sessionPlayer.getPlaybackSpeed());
                }
                return null;
            }
        }, Float.valueOf(1.0f))).floatValue();
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaybackControl
    public ListenableFuture<SessionPlayer.PlayerResult> setPlaybackSpeed(final float f) {
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.setPlaybackSpeed(f);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public List<MediaItem> getPlaylist() {
        return (List) dispatchPlayerTask(new PlayerTask<List<MediaItem>>() { // from class: androidx.media2.session.MediaSessionImplBase.17
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public List<MediaItem> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.getPlaylist();
            }
        }, null);
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public ListenableFuture<SessionPlayer.PlayerResult> setPlaylist(final List<MediaItem> list, final MediaMetadata mediaMetadata) {
        if (list == null) {
            throw new NullPointerException("list shouldn't be null");
        }
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.18
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.setPlaylist(list, mediaMetadata);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public ListenableFuture<SessionPlayer.PlayerResult> setMediaItem(final MediaItem mediaItem) {
        if (mediaItem == null) {
            throw new NullPointerException("item shouldn't be null");
        }
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.19
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.setMediaItem(mediaItem);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public ListenableFuture<SessionPlayer.PlayerResult> skipToPlaylistItem(final int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index shouldn't be negative");
        }
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.20
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                if (i >= sessionPlayer.getPlaylist().size()) {
                    return SessionPlayer.PlayerResult.createFuture(-3);
                }
                return sessionPlayer.skipToPlaylistItem(i);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public ListenableFuture<SessionPlayer.PlayerResult> skipToPreviousItem() {
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.21
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.skipToPreviousPlaylistItem();
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public ListenableFuture<SessionPlayer.PlayerResult> skipToNextItem() {
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.22
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.skipToNextPlaylistItem();
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public MediaMetadata getPlaylistMetadata() {
        return (MediaMetadata) dispatchPlayerTask(new PlayerTask<MediaMetadata>() { // from class: androidx.media2.session.MediaSessionImplBase.23
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public MediaMetadata run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.getPlaylistMetadata();
            }
        }, null);
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public ListenableFuture<SessionPlayer.PlayerResult> addPlaylistItem(final int i, final MediaItem mediaItem) {
        if (i < 0) {
            throw new IllegalArgumentException("index shouldn't be negative");
        }
        if (mediaItem == null) {
            throw new NullPointerException("item shouldn't be null");
        }
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.24
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.addPlaylistItem(i, mediaItem);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public ListenableFuture<SessionPlayer.PlayerResult> removePlaylistItem(final int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index shouldn't be negative");
        }
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.25
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                if (i >= sessionPlayer.getPlaylist().size()) {
                    return SessionPlayer.PlayerResult.createFuture(-3);
                }
                return sessionPlayer.removePlaylistItem(i);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public ListenableFuture<SessionPlayer.PlayerResult> replacePlaylistItem(final int i, final MediaItem mediaItem) {
        if (i < 0) {
            throw new IllegalArgumentException("index shouldn't be negative");
        }
        if (mediaItem == null) {
            throw new NullPointerException("item shouldn't be null");
        }
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.26
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.replacePlaylistItem(i, mediaItem);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public ListenableFuture<SessionPlayer.PlayerResult> movePlaylistItem(final int i, final int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("indices shouldn't be negative");
        }
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.27
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.movePlaylistItem(i, i2);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public MediaItem getCurrentMediaItem() {
        return (MediaItem) dispatchPlayerTask(new PlayerTask<MediaItem>() { // from class: androidx.media2.session.MediaSessionImplBase.28
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public MediaItem run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.getCurrentMediaItem();
            }
        }, null);
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public int getCurrentMediaItemIndex() {
        return ((Integer) dispatchPlayerTask(new PlayerTask<Integer>() { // from class: androidx.media2.session.MediaSessionImplBase.29
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public Integer run(SessionPlayer sessionPlayer) throws Exception {
                return Integer.valueOf(sessionPlayer.getCurrentMediaItemIndex());
            }
        }, -1)).intValue();
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public int getPreviousMediaItemIndex() {
        return ((Integer) dispatchPlayerTask(new PlayerTask<Integer>() { // from class: androidx.media2.session.MediaSessionImplBase.30
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public Integer run(SessionPlayer sessionPlayer) throws Exception {
                return Integer.valueOf(sessionPlayer.getPreviousMediaItemIndex());
            }
        }, -1)).intValue();
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public int getNextMediaItemIndex() {
        return ((Integer) dispatchPlayerTask(new PlayerTask<Integer>() { // from class: androidx.media2.session.MediaSessionImplBase.31
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public Integer run(SessionPlayer sessionPlayer) throws Exception {
                return Integer.valueOf(sessionPlayer.getNextMediaItemIndex());
            }
        }, -1)).intValue();
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public ListenableFuture<SessionPlayer.PlayerResult> updatePlaylistMetadata(final MediaMetadata mediaMetadata) {
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.32
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.updatePlaylistMetadata(mediaMetadata);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public int getRepeatMode() {
        return ((Integer) dispatchPlayerTask(new PlayerTask<Integer>() { // from class: androidx.media2.session.MediaSessionImplBase.33
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public Integer run(SessionPlayer sessionPlayer) throws Exception {
                return Integer.valueOf(sessionPlayer.getRepeatMode());
            }
        }, 0)).intValue();
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public ListenableFuture<SessionPlayer.PlayerResult> setRepeatMode(final int i) {
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.34
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.setRepeatMode(i);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public int getShuffleMode() {
        return ((Integer) dispatchPlayerTask(new PlayerTask<Integer>() { // from class: androidx.media2.session.MediaSessionImplBase.35
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public Integer run(SessionPlayer sessionPlayer) throws Exception {
                return Integer.valueOf(sessionPlayer.getShuffleMode());
            }
        }, 0)).intValue();
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlaylistControl
    public ListenableFuture<SessionPlayer.PlayerResult> setShuffleMode(final int i) {
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.36
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.setShuffleMode(i);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlayer
    public VideoSize getVideoSize() {
        return (VideoSize) dispatchPlayerTask(new PlayerTask<VideoSize>() { // from class: androidx.media2.session.MediaSessionImplBase.37
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public VideoSize run(SessionPlayer sessionPlayer) {
                return MediaUtils.upcastForPreparceling(sessionPlayer.getVideoSize());
            }
        }, new VideoSize(0, 0));
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlayer
    public ListenableFuture<SessionPlayer.PlayerResult> setSurface(final Surface surface) {
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.38
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) {
                return sessionPlayer.setSurface(surface);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlayer
    public List<SessionPlayer.TrackInfo> getTracks() {
        return (List) dispatchPlayerTask(new PlayerTask<List<SessionPlayer.TrackInfo>>() { // from class: androidx.media2.session.MediaSessionImplBase.39
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public List<SessionPlayer.TrackInfo> run(SessionPlayer sessionPlayer) throws Exception {
                return MediaUtils.upcastForPreparceling(sessionPlayer.getTracks());
            }
        }, null);
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlayer
    public ListenableFuture<SessionPlayer.PlayerResult> selectTrack(final SessionPlayer.TrackInfo trackInfo) {
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.40
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.selectTrack(trackInfo);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlayer
    public ListenableFuture<SessionPlayer.PlayerResult> deselectTrack(final SessionPlayer.TrackInfo trackInfo) {
        return dispatchPlayerTask(new PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>>() { // from class: androidx.media2.session.MediaSessionImplBase.41
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(SessionPlayer sessionPlayer) throws Exception {
                return sessionPlayer.deselectTrack(trackInfo);
            }
        });
    }

    @Override // androidx.media2.session.MediaInterface.SessionPlayer
    public SessionPlayer.TrackInfo getSelectedTrack(final int i) {
        return (SessionPlayer.TrackInfo) dispatchPlayerTask(new PlayerTask<SessionPlayer.TrackInfo>() { // from class: androidx.media2.session.MediaSessionImplBase.42
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionImplBase.PlayerTask
            public SessionPlayer.TrackInfo run(SessionPlayer sessionPlayer) throws Exception {
                return MediaUtils.upcastForPreparceling(sessionPlayer.getSelectedTrack(i));
            }
        }, null);
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public MediaSession getInstance() {
        return this.mInstance;
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public Context getContext() {
        return this.mContext;
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public Executor getCallbackExecutor() {
        return this.mCallbackExecutor;
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public MediaSession.SessionCallback getCallback() {
        return this.mCallback;
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public MediaSessionCompat getSessionCompat() {
        return this.mSessionLegacyStub.getSessionCompat();
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public void setLegacyControllerConnectionTimeoutMs(long j) {
        this.mSessionLegacyStub.setLegacyControllerDisconnectTimeoutMs(j);
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public boolean isClosed() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mClosed;
        }
        return z;
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public PlaybackStateCompat createPlaybackStateCompat() {
        int iConvertToPlaybackStateCompatState = MediaUtils.convertToPlaybackStateCompatState(getPlayerState(), getBufferingState());
        return new PlaybackStateCompat.Builder().setState(iConvertToPlaybackStateCompatState, getCurrentPosition(), getPlaybackSpeed(), SystemClock.elapsedRealtime()).setActions(3670015L).setActiveQueueItemId(MediaUtils.convertToQueueItemId(getCurrentMediaItemIndex())).setBufferedPosition(getBufferedPosition()).build();
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public MediaController.PlaybackInfo getPlaybackInfo() {
        MediaController.PlaybackInfo playbackInfo;
        synchronized (this.mLock) {
            playbackInfo = this.mPlaybackInfo;
        }
        return playbackInfo;
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public PendingIntent getSessionActivity() {
        return this.mSessionActivity;
    }

    MediaBrowserServiceCompat createLegacyBrowserServiceLocked(Context context, SessionToken sessionToken, MediaSessionCompat.Token token) {
        return new MediaSessionServiceLegacyStub(context, this, token);
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public void connectFromService(IMediaController iMediaController, int i, String str, int i2, int i3, Bundle bundle) {
        this.mSessionStub.connect(iMediaController, i, str, i2, i3, bundle);
    }

    @Override // androidx.media2.session.MediaSession.MediaSessionImpl
    public IBinder getLegacyBrowserServiceBinder() {
        MediaBrowserServiceCompat mediaBrowserServiceCompat;
        synchronized (this.mLock) {
            if (this.mBrowserServiceLegacyStub == null) {
                this.mBrowserServiceLegacyStub = createLegacyBrowserServiceLocked(this.mContext, this.mSessionToken, this.mSessionLegacyStub.getSessionCompat().getSessionToken());
            }
            mediaBrowserServiceCompat = this.mBrowserServiceLegacyStub;
        }
        return mediaBrowserServiceCompat.onBind(new Intent(MediaBrowserServiceCompat.SERVICE_INTERFACE));
    }

    MediaBrowserServiceCompat getLegacyBrowserService() {
        MediaBrowserServiceCompat mediaBrowserServiceCompat;
        synchronized (this.mLock) {
            mediaBrowserServiceCompat = this.mBrowserServiceLegacyStub;
        }
        return mediaBrowserServiceCompat;
    }

    boolean isInPlaybackState(SessionPlayer sessionPlayer) {
        return (isClosed() || sessionPlayer.getPlayerState() == 0 || sessionPlayer.getPlayerState() == 3) ? false : true;
    }

    private ListenableFuture<SessionPlayer.PlayerResult> dispatchPlayerTask(PlayerTask<ListenableFuture<SessionPlayer.PlayerResult>> playerTask) {
        ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        resolvableFutureCreate.set(new SessionPlayer.PlayerResult(-2, null));
        return (ListenableFuture) dispatchPlayerTask(playerTask, resolvableFutureCreate);
    }

    private <T> T dispatchPlayerTask(PlayerTask<T> playerTask, T t) {
        SessionPlayer sessionPlayer;
        synchronized (this.mLock) {
            sessionPlayer = this.mPlayer;
        }
        try {
            if (!isClosed()) {
                T tRun = playerTask.run(sessionPlayer);
                if (tRun != null) {
                    return tRun;
                }
            } else if (DEBUG) {
                Log.d(TAG, "API calls after the close()", new IllegalStateException());
            }
        } catch (Exception unused) {
        }
        return t;
    }

    private void notifyPlayerUpdatedNotLocked(final SessionPlayer sessionPlayer, final MediaController.PlaybackInfo playbackInfo, final SessionPlayer sessionPlayer2, final MediaController.PlaybackInfo playbackInfo2) {
        dispatchRemoteControllerTaskWithoutReturn(new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.43
            @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
            public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                controllerCb.onPlayerChanged(i, sessionPlayer, playbackInfo, sessionPlayer2, playbackInfo2);
            }
        });
    }

    void notifyPlaybackInfoChangedNotLocked(final MediaController.PlaybackInfo playbackInfo) {
        dispatchRemoteControllerTaskWithoutReturn(new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.44
            @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
            public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                controllerCb.onPlaybackInfoChanged(i, playbackInfo);
            }
        });
    }

    void dispatchRemoteControllerTaskWithoutReturn(RemoteControllerTask remoteControllerTask) {
        List<MediaSession.ControllerInfo> connectedControllers = this.mSessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            dispatchRemoteControllerTaskWithoutReturn(connectedControllers.get(i), remoteControllerTask);
        }
        try {
            remoteControllerTask.run(this.mSessionLegacyStub.getControllerLegacyCbForBroadcast(), 0);
        } catch (RemoteException e) {
            Log.e(TAG, "Exception in using media1 API", e);
        }
    }

    void dispatchRemoteControllerTaskWithoutReturn(MediaSession.ControllerInfo controllerInfo, RemoteControllerTask remoteControllerTask) {
        int iObtainNextSequenceNumber;
        try {
            SequencedFutureManager sequencedFutureManager = this.mSessionStub.getConnectedControllersManager().getSequencedFutureManager(controllerInfo);
            if (sequencedFutureManager != null) {
                iObtainNextSequenceNumber = sequencedFutureManager.obtainNextSequenceNumber();
            } else {
                if (!isConnected(controllerInfo)) {
                    if (DEBUG) {
                        Log.d(TAG, "Skipping dispatching task to disconnected controller, controller=" + controllerInfo);
                        return;
                    }
                    return;
                }
                iObtainNextSequenceNumber = 0;
            }
            remoteControllerTask.run(controllerInfo.getControllerCb(), iObtainNextSequenceNumber);
        } catch (DeadObjectException e) {
            onDeadObjectException(controllerInfo, e);
        } catch (RemoteException e2) {
            Log.w(TAG, "Exception in " + controllerInfo.toString(), e2);
        }
    }

    private ListenableFuture<SessionResult> dispatchRemoteControllerTask(MediaSession.ControllerInfo controllerInfo, RemoteControllerTask remoteControllerTask) {
        int sequenceNumber;
        ListenableFuture<SessionResult> listenableFutureCreateFutureWithResult;
        try {
            SequencedFutureManager sequencedFutureManager = this.mSessionStub.getConnectedControllersManager().getSequencedFutureManager(controllerInfo);
            if (sequencedFutureManager != null) {
                SequencedFutureManager.SequencedFuture sequencedFutureCreateSequencedFuture = sequencedFutureManager.createSequencedFuture(RESULT_WHEN_CLOSED);
                SequencedFutureManager.SequencedFuture sequencedFuture = sequencedFutureCreateSequencedFuture;
                sequenceNumber = sequencedFutureCreateSequencedFuture.getSequenceNumber();
                listenableFutureCreateFutureWithResult = sequencedFutureCreateSequencedFuture;
            } else {
                if (!isConnected(controllerInfo)) {
                    return SessionResult.createFutureWithResult(-100);
                }
                sequenceNumber = 0;
                listenableFutureCreateFutureWithResult = SessionResult.createFutureWithResult(0);
            }
            remoteControllerTask.run(controllerInfo.getControllerCb(), sequenceNumber);
            return listenableFutureCreateFutureWithResult;
        } catch (DeadObjectException e) {
            onDeadObjectException(controllerInfo, e);
            return SessionResult.createFutureWithResult(-100);
        } catch (RemoteException e2) {
            Log.w(TAG, "Exception in " + controllerInfo.toString(), e2);
            return SessionResult.createFutureWithResult(-1);
        }
    }

    private void onDeadObjectException(MediaSession.ControllerInfo controllerInfo, DeadObjectException deadObjectException) {
        if (DEBUG) {
            Log.d(TAG, controllerInfo.toString() + " is gone", deadObjectException);
        }
        this.mSessionStub.getConnectedControllersManager().removeController(controllerInfo);
    }

    private ComponentName getServiceComponentByAction(String str) {
        PackageManager packageManager = this.mContext.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(this.mContext.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ResolveInfo resolveInfo = listQueryIntentServices.get(0);
        return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
    }

    private static class SessionPlayerCallback extends RemoteSessionPlayer.Callback implements MediaItem.OnMetadataChangedListener {
        private MediaItem mMediaItem;
        private List<MediaItem> mPlaylist;
        private final PlaylistItemListener mPlaylistItemChangedListener;
        private final WeakReference<MediaSessionImplBase> mSession;

        SessionPlayerCallback(MediaSessionImplBase mediaSessionImplBase) {
            this.mSession = new WeakReference<>(mediaSessionImplBase);
            this.mPlaylistItemChangedListener = new PlaylistItemListener(mediaSessionImplBase);
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onCurrentMediaItemChanged(SessionPlayer sessionPlayer, MediaItem mediaItem) {
            MediaSessionImplBase session = getSession();
            if (session == null || sessionPlayer == null || session.getPlayer() != sessionPlayer) {
                return;
            }
            MediaItem mediaItem2 = this.mMediaItem;
            if (mediaItem2 != null) {
                mediaItem2.removeOnMetadataChangedListener(this);
            }
            if (mediaItem != null) {
                mediaItem.addOnMetadataChangedListener(session.mCallbackExecutor, this);
            }
            this.mMediaItem = mediaItem;
            session.getCallback().onCurrentMediaItemChanged(session.getInstance());
            if (mediaItem == null || !updateCurrentMediaItemMetadataWithDuration(sessionPlayer, mediaItem, mediaItem.getMetadata())) {
                notifyCurrentMediaItemChanged(mediaItem);
            }
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onPlayerStateChanged(final SessionPlayer sessionPlayer, final int i) {
            MediaSessionImplBase session = getSession();
            if (session == null || sessionPlayer == null || session.getPlayer() != sessionPlayer) {
                return;
            }
            session.getCallback().onPlayerStateChanged(session.getInstance(), i);
            updateCurrentMediaItemMetadataWithDuration(sessionPlayer);
            session.dispatchRemoteControllerTaskWithoutReturn(new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.SessionPlayerCallback.1
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i2) throws RemoteException {
                    controllerCb.onPlayerStateChanged(i2, SystemClock.elapsedRealtime(), sessionPlayer.getCurrentPosition(), i);
                }
            });
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onBufferingStateChanged(final SessionPlayer sessionPlayer, final MediaItem mediaItem, final int i) {
            updateCurrentMediaItemMetadataWithDuration(sessionPlayer);
            dispatchRemoteControllerTask(sessionPlayer, new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.SessionPlayerCallback.2
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i2) throws RemoteException {
                    controllerCb.onBufferingStateChanged(i2, mediaItem, i, sessionPlayer.getBufferedPosition(), SystemClock.elapsedRealtime(), sessionPlayer.getCurrentPosition());
                }
            });
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onPlaybackSpeedChanged(final SessionPlayer sessionPlayer, final float f) {
            dispatchRemoteControllerTask(sessionPlayer, new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.SessionPlayerCallback.3
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                    controllerCb.onPlaybackSpeedChanged(i, SystemClock.elapsedRealtime(), sessionPlayer.getCurrentPosition(), f);
                }
            });
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onSeekCompleted(final SessionPlayer sessionPlayer, final long j) {
            dispatchRemoteControllerTask(sessionPlayer, new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.SessionPlayerCallback.4
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                    controllerCb.onSeekCompleted(i, SystemClock.elapsedRealtime(), sessionPlayer.getCurrentPosition(), j);
                }
            });
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onPlaylistChanged(SessionPlayer sessionPlayer, final List<MediaItem> list, final MediaMetadata mediaMetadata) {
            final MediaSessionImplBase session = getSession();
            if (session == null || sessionPlayer == null || session.getPlayer() != sessionPlayer) {
                return;
            }
            if (this.mPlaylist != null) {
                for (int i = 0; i < this.mPlaylist.size(); i++) {
                    this.mPlaylist.get(i).removeOnMetadataChangedListener(this.mPlaylistItemChangedListener);
                }
            }
            if (list != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    list.get(i2).addOnMetadataChangedListener(session.mCallbackExecutor, this.mPlaylistItemChangedListener);
                }
            }
            this.mPlaylist = list;
            dispatchRemoteControllerTask(sessionPlayer, new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.SessionPlayerCallback.5
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i3) throws RemoteException {
                    controllerCb.onPlaylistChanged(i3, list, mediaMetadata, session.getCurrentMediaItemIndex(), session.getPreviousMediaItemIndex(), session.getNextMediaItemIndex());
                }
            });
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onPlaylistMetadataChanged(SessionPlayer sessionPlayer, final MediaMetadata mediaMetadata) {
            dispatchRemoteControllerTask(sessionPlayer, new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.SessionPlayerCallback.6
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                    controllerCb.onPlaylistMetadataChanged(i, mediaMetadata);
                }
            });
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onRepeatModeChanged(SessionPlayer sessionPlayer, final int i) {
            final MediaSessionImplBase session = getSession();
            dispatchRemoteControllerTask(sessionPlayer, new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.SessionPlayerCallback.7
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i2) throws RemoteException {
                    controllerCb.onRepeatModeChanged(i2, i, session.getCurrentMediaItemIndex(), session.getPreviousMediaItemIndex(), session.getNextMediaItemIndex());
                }
            });
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onShuffleModeChanged(SessionPlayer sessionPlayer, final int i) {
            final MediaSessionImplBase session = getSession();
            dispatchRemoteControllerTask(sessionPlayer, new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.SessionPlayerCallback.8
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i2) throws RemoteException {
                    controllerCb.onShuffleModeChanged(i2, i, session.getCurrentMediaItemIndex(), session.getPreviousMediaItemIndex(), session.getNextMediaItemIndex());
                }
            });
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onPlaybackCompleted(SessionPlayer sessionPlayer) {
            dispatchRemoteControllerTask(sessionPlayer, new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.SessionPlayerCallback.9
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                    controllerCb.onPlaybackCompleted(i);
                }
            });
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onAudioAttributesChanged(SessionPlayer sessionPlayer, AudioAttributesCompat audioAttributesCompat) {
            MediaController.PlaybackInfo playbackInfo;
            MediaSessionImplBase session = getSession();
            if (session == null || sessionPlayer == null || session.getPlayer() != sessionPlayer) {
                return;
            }
            MediaController.PlaybackInfo playbackInfoCreatePlaybackInfo = session.createPlaybackInfo(sessionPlayer, audioAttributesCompat);
            synchronized (session.mLock) {
                playbackInfo = session.mPlaybackInfo;
                session.mPlaybackInfo = playbackInfoCreatePlaybackInfo;
            }
            if (ObjectsCompat.equals(playbackInfoCreatePlaybackInfo, playbackInfo)) {
                return;
            }
            session.notifyPlaybackInfoChangedNotLocked(playbackInfoCreatePlaybackInfo);
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onVideoSizeChanged(SessionPlayer sessionPlayer, final VideoSize videoSize) {
            dispatchRemoteControllerTask(sessionPlayer, new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.SessionPlayerCallback.10
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                    controllerCb.onVideoSizeChanged(i, MediaUtils.upcastForPreparceling(videoSize));
                }
            });
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onTracksChanged(SessionPlayer sessionPlayer, final List<SessionPlayer.TrackInfo> list) {
            final MediaSessionImplBase session = getSession();
            dispatchRemoteControllerTask(sessionPlayer, new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.SessionPlayerCallback.11
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                    controllerCb.onTracksChanged(i, MediaUtils.upcastForPreparceling((List<SessionPlayer.TrackInfo>) list), MediaUtils.upcastForPreparceling(session.getSelectedTrack(1)), MediaUtils.upcastForPreparceling(session.getSelectedTrack(2)), MediaUtils.upcastForPreparceling(session.getSelectedTrack(4)), MediaUtils.upcastForPreparceling(session.getSelectedTrack(5)));
                }
            });
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onTrackSelected(SessionPlayer sessionPlayer, final SessionPlayer.TrackInfo trackInfo) {
            dispatchRemoteControllerTask(sessionPlayer, new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.SessionPlayerCallback.12
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                    controllerCb.onTrackSelected(i, MediaUtils.upcastForPreparceling(trackInfo));
                }
            });
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onTrackDeselected(SessionPlayer sessionPlayer, final SessionPlayer.TrackInfo trackInfo) {
            dispatchRemoteControllerTask(sessionPlayer, new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.SessionPlayerCallback.13
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                    controllerCb.onTrackDeselected(i, MediaUtils.upcastForPreparceling(trackInfo));
                }
            });
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onSubtitleData(SessionPlayer sessionPlayer, final MediaItem mediaItem, final SessionPlayer.TrackInfo trackInfo, final SubtitleData subtitleData) {
            dispatchRemoteControllerTask(sessionPlayer, new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.SessionPlayerCallback.14
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                    controllerCb.onSubtitleData(i, mediaItem, trackInfo, subtitleData);
                }
            });
        }

        @Override // androidx.media2.common.MediaItem.OnMetadataChangedListener
        public void onMetadataChanged(MediaItem mediaItem, MediaMetadata mediaMetadata) {
            MediaSessionImplBase session = getSession();
            if (session == null || updateCurrentMediaItemMetadataWithDuration(session.getPlayer(), mediaItem, mediaMetadata)) {
                return;
            }
            notifyCurrentMediaItemChanged(mediaItem);
        }

        @Override // androidx.media2.session.RemoteSessionPlayer.Callback
        public void onVolumeChanged(RemoteSessionPlayer remoteSessionPlayer, int i) {
            MediaSessionImplBase session = getSession();
            if (session == null) {
                return;
            }
            MediaController.PlaybackInfo playbackInfoCreatePlaybackInfo = session.createPlaybackInfo(remoteSessionPlayer, null);
            synchronized (session.mLock) {
                if (session.mPlayer != remoteSessionPlayer) {
                    return;
                }
                MediaController.PlaybackInfo playbackInfo = session.mPlaybackInfo;
                session.mPlaybackInfo = playbackInfoCreatePlaybackInfo;
                if (ObjectsCompat.equals(playbackInfoCreatePlaybackInfo, playbackInfo)) {
                    return;
                }
                session.notifyPlaybackInfoChangedNotLocked(playbackInfoCreatePlaybackInfo);
            }
        }

        private MediaSessionImplBase getSession() {
            MediaSessionImplBase mediaSessionImplBase = this.mSession.get();
            if (mediaSessionImplBase == null && MediaSessionImplBase.DEBUG) {
                Log.d(MediaSessionImplBase.TAG, "Session is closed", new IllegalStateException());
            }
            return mediaSessionImplBase;
        }

        private void dispatchRemoteControllerTask(SessionPlayer sessionPlayer, RemoteControllerTask remoteControllerTask) {
            MediaSessionImplBase session = getSession();
            if (session == null || sessionPlayer == null || session.getPlayer() != sessionPlayer) {
                return;
            }
            session.dispatchRemoteControllerTaskWithoutReturn(remoteControllerTask);
        }

        private boolean updateCurrentMediaItemMetadataWithDuration(SessionPlayer sessionPlayer) {
            MediaItem currentMediaItem = sessionPlayer.getCurrentMediaItem();
            if (currentMediaItem == null) {
                return false;
            }
            return updateCurrentMediaItemMetadataWithDuration(sessionPlayer, currentMediaItem, currentMediaItem.getMetadata());
        }

        private boolean updateCurrentMediaItemMetadataWithDuration(SessionPlayer sessionPlayer, MediaItem mediaItem, MediaMetadata mediaMetadata) {
            MediaMetadata mediaMetadataBuild;
            long duration = sessionPlayer.getDuration();
            if (mediaItem != sessionPlayer.getCurrentMediaItem() || sessionPlayer.getPlayerState() == 0 || duration <= 0 || duration == Long.MIN_VALUE) {
                return false;
            }
            if (mediaMetadata != null) {
                if (!mediaMetadata.containsKey("android.media.metadata.DURATION")) {
                    mediaMetadataBuild = new MediaMetadata.Builder(mediaMetadata).putLong("android.media.metadata.DURATION", duration).putLong(MediaMetadata.METADATA_KEY_PLAYABLE, 1L).build();
                } else {
                    long j = mediaMetadata.getLong("android.media.metadata.DURATION");
                    if (duration != j) {
                        Log.w(MediaSessionImplBase.TAG, "duration mismatch for an item. duration from player=" + duration + " duration from metadata=" + j + ". May be a timing issue?");
                    }
                    mediaMetadataBuild = null;
                }
            } else {
                mediaMetadataBuild = new MediaMetadata.Builder().putLong("android.media.metadata.DURATION", duration).putString("android.media.metadata.MEDIA_ID", mediaItem.getMediaId()).putLong(MediaMetadata.METADATA_KEY_PLAYABLE, 1L).build();
            }
            if (mediaMetadataBuild == null) {
                return false;
            }
            mediaItem.setMetadata(mediaMetadataBuild);
            return true;
        }

        private void notifyCurrentMediaItemChanged(final MediaItem mediaItem) {
            final MediaSessionImplBase session = getSession();
            if (session == null) {
                return;
            }
            dispatchRemoteControllerTask(session.getPlayer(), new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.SessionPlayerCallback.15
                @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                public void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
                    controllerCb.onCurrentMediaItemChanged(i, mediaItem, session.getCurrentMediaItemIndex(), session.getPreviousMediaItemIndex(), session.getNextMediaItemIndex());
                }
            });
        }
    }

    static class PlaylistItemListener implements MediaItem.OnMetadataChangedListener {
        private final WeakReference<MediaSessionImplBase> mSession;

        PlaylistItemListener(MediaSessionImplBase mediaSessionImplBase) {
            this.mSession = new WeakReference<>(mediaSessionImplBase);
        }

        @Override // androidx.media2.common.MediaItem.OnMetadataChangedListener
        public void onMetadataChanged(MediaItem mediaItem, MediaMetadata mediaMetadata) {
            final List<MediaItem> playlist;
            final MediaSessionImplBase mediaSessionImplBase = this.mSession.get();
            if (mediaSessionImplBase == null || mediaItem == null || (playlist = mediaSessionImplBase.getPlaylist()) == null) {
                return;
            }
            for (int i = 0; i < playlist.size(); i++) {
                if (mediaItem.equals(playlist.get(i))) {
                    mediaSessionImplBase.dispatchRemoteControllerTaskWithoutReturn(new RemoteControllerTask() { // from class: androidx.media2.session.MediaSessionImplBase.PlaylistItemListener.1
                        @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
                        public void run(MediaSession.ControllerCb controllerCb, int i2) throws RemoteException {
                            controllerCb.onPlaylistChanged(i2, playlist, mediaSessionImplBase.getPlaylistMetadata(), mediaSessionImplBase.getCurrentMediaItemIndex(), mediaSessionImplBase.getPreviousMediaItemIndex(), mediaSessionImplBase.getNextMediaItemIndex());
                        }
                    });
                    return;
                }
            }
        }
    }

    static final class CombinedCommandResultFuture<T extends BaseResult> extends AbstractResolvableFuture<T> {
        final ListenableFuture<T>[] mFutures;
        AtomicInteger mSuccessCount = new AtomicInteger(0);

        @SafeVarargs
        public static <U extends BaseResult> CombinedCommandResultFuture<U> create(Executor executor, ListenableFuture<U>... listenableFutureArr) {
            return new CombinedCommandResultFuture<>(executor, listenableFutureArr);
        }

        private CombinedCommandResultFuture(Executor executor, ListenableFuture<T>[] listenableFutureArr) {
            final int i = 0;
            this.mFutures = listenableFutureArr;
            while (true) {
                ListenableFuture<T>[] listenableFutureArr2 = this.mFutures;
                if (i >= listenableFutureArr2.length) {
                    return;
                }
                listenableFutureArr2[i].addListener(new Runnable() { // from class: androidx.media2.session.MediaSessionImplBase.CombinedCommandResultFuture.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            T t = CombinedCommandResultFuture.this.mFutures[i].get();
                            int resultCode = t.getResultCode();
                            if (resultCode != 0 && resultCode != 1) {
                                for (int i2 = 0; i2 < CombinedCommandResultFuture.this.mFutures.length; i2++) {
                                    if (!CombinedCommandResultFuture.this.mFutures[i2].isCancelled() && !CombinedCommandResultFuture.this.mFutures[i2].isDone() && i != i2) {
                                        CombinedCommandResultFuture.this.mFutures[i2].cancel(true);
                                    }
                                }
                                CombinedCommandResultFuture.this.set(t);
                                return;
                            }
                            if (CombinedCommandResultFuture.this.mSuccessCount.incrementAndGet() == CombinedCommandResultFuture.this.mFutures.length) {
                                CombinedCommandResultFuture.this.set(t);
                            }
                        } catch (Exception e) {
                            for (int i3 = 0; i3 < CombinedCommandResultFuture.this.mFutures.length; i3++) {
                                if (!CombinedCommandResultFuture.this.mFutures[i3].isCancelled() && !CombinedCommandResultFuture.this.mFutures[i3].isDone() && i != i3) {
                                    CombinedCommandResultFuture.this.mFutures[i3].cancel(true);
                                }
                            }
                            CombinedCommandResultFuture.this.setException(e);
                        }
                    }
                }, executor);
                i++;
            }
        }
    }

    final class MediaButtonReceiver extends BroadcastReceiver {
        MediaButtonReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            KeyEvent keyEvent;
            if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && ObjectsCompat.equals(intent.getData(), MediaSessionImplBase.this.mSessionUri) && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                MediaSessionImplBase.this.getSessionCompat().getController().dispatchMediaButtonEvent(keyEvent);
            }
        }
    }
}
