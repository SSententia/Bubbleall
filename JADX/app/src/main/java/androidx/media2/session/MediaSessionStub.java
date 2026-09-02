package androidx.media2.session;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import androidx.core.util.ObjectsCompat;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.MediaParcelUtils;
import androidx.media2.common.Rating;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.VideoSize;
import androidx.versionedparcelable.ParcelImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class MediaSessionStub extends IMediaSession.Stub {
    private static final boolean RETHROW_EXCEPTION = true;
    final ConnectedControllersManager<IBinder> mConnectedControllersManager;
    final Object mLock = new Object();
    final WeakReference<MediaSession.MediaSessionImpl> mSessionImpl;
    private final androidx.media.MediaSessionManager mSessionManager;
    private static final String TAG = "MediaSessionStub";
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    static final SparseArray<SessionCommand> sCommandsForOnCommandRequest = new SparseArray<>();

    private interface LibrarySessionCallbackTask<T> extends SessionTask {
        T run(MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl mediaLibrarySessionImpl, MediaSession.ControllerInfo controllerInfo) throws RemoteException;
    }

    private interface SessionCallbackTask<T> extends SessionTask {
        T run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) throws RemoteException;
    }

    private interface SessionPlayerTask extends SessionTask {
        ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) throws RemoteException;
    }

    private interface SessionTask {
    }

    static {
        for (SessionCommand sessionCommand : new SessionCommandGroup.Builder().addAllPlayerCommands(2).addAllVolumeCommands(2).build().getCommands()) {
            sCommandsForOnCommandRequest.append(sessionCommand.getCommandCode(), sessionCommand);
        }
    }

    MediaSessionStub(MediaSession.MediaSessionImpl mediaSessionImpl) {
        this.mSessionImpl = new WeakReference<>(mediaSessionImpl);
        this.mSessionManager = androidx.media.MediaSessionManager.getSessionManager(mediaSessionImpl.getContext());
        this.mConnectedControllersManager = new ConnectedControllersManager<>(mediaSessionImpl);
    }

    ConnectedControllersManager<IBinder> getConnectedControllersManager() {
        return this.mConnectedControllersManager;
    }

    static void sendSessionResult(MediaSession.ControllerInfo controllerInfo, int i, int i2) {
        sendSessionResult(controllerInfo, i, new SessionResult(i2));
    }

    static void sendSessionResult(MediaSession.ControllerInfo controllerInfo, int i, SessionResult sessionResult) {
        try {
            controllerInfo.getControllerCb().onSessionResult(i, sessionResult);
        } catch (RemoteException e) {
            Log.w(TAG, "Exception in " + controllerInfo.toString(), e);
        }
    }

    static void sendPlayerResult(MediaSession.ControllerInfo controllerInfo, int i, SessionPlayer.PlayerResult playerResult) {
        try {
            controllerInfo.getControllerCb().onPlayerResult(i, playerResult);
        } catch (RemoteException e) {
            Log.w(TAG, "Exception in " + controllerInfo.toString(), e);
        }
    }

    static void sendLibraryResult(MediaSession.ControllerInfo controllerInfo, int i, int i2) {
        sendLibraryResult(controllerInfo, i, new LibraryResult(i2));
    }

    static void sendLibraryResult(MediaSession.ControllerInfo controllerInfo, int i, LibraryResult libraryResult) {
        try {
            controllerInfo.getControllerCb().onLibraryResult(i, libraryResult);
        } catch (RemoteException e) {
            Log.w(TAG, "Exception in " + controllerInfo.toString(), e);
        }
    }

    private void dispatchSessionTask(IMediaController iMediaController, int i, int i2, SessionTask sessionTask) {
        dispatchSessionTaskInternal(iMediaController, i, null, i2, sessionTask);
    }

    private void dispatchSessionTask(IMediaController iMediaController, int i, SessionCommand sessionCommand, SessionTask sessionTask) {
        dispatchSessionTaskInternal(iMediaController, i, sessionCommand, 0, sessionTask);
    }

    private void dispatchSessionTaskInternal(IMediaController iMediaController, final int i, final SessionCommand sessionCommand, final int i2, final SessionTask sessionTask) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final MediaSession.MediaSessionImpl mediaSessionImpl = this.mSessionImpl.get();
            if (mediaSessionImpl != null && !mediaSessionImpl.isClosed()) {
                final MediaSession.ControllerInfo controller = this.mConnectedControllersManager.getController(iMediaController.asBinder());
                if (controller == null) {
                    return;
                }
                mediaSessionImpl.getCallbackExecutor().execute(new Runnable() { // from class: androidx.media2.session.MediaSessionStub.1
                    @Override // java.lang.Runnable
                    public void run() throws Exception {
                        SessionCommand sessionCommand2;
                        if (MediaSessionStub.this.mConnectedControllersManager.isConnected(controller)) {
                            if (sessionCommand != null) {
                                if (!MediaSessionStub.this.mConnectedControllersManager.isAllowedCommand(controller, sessionCommand)) {
                                    if (MediaSessionStub.DEBUG) {
                                        Log.d(MediaSessionStub.TAG, "Command (" + sessionCommand + ") from " + controller + " isn't allowed.");
                                    }
                                    MediaSessionStub.sendSessionResult(controller, i, -4);
                                    return;
                                }
                                sessionCommand2 = MediaSessionStub.sCommandsForOnCommandRequest.get(sessionCommand.getCommandCode());
                            } else {
                                if (!MediaSessionStub.this.mConnectedControllersManager.isAllowedCommand(controller, i2)) {
                                    if (MediaSessionStub.DEBUG) {
                                        Log.d(MediaSessionStub.TAG, "Command (" + i2 + ") from " + controller + " isn't allowed.");
                                    }
                                    MediaSessionStub.sendSessionResult(controller, i, -4);
                                    return;
                                }
                                sessionCommand2 = MediaSessionStub.sCommandsForOnCommandRequest.get(i2);
                            }
                            if (sessionCommand2 != null) {
                                try {
                                    int iOnCommandRequest = mediaSessionImpl.getCallback().onCommandRequest(mediaSessionImpl.getInstance(), controller, sessionCommand2);
                                    if (iOnCommandRequest != 0) {
                                        if (MediaSessionStub.DEBUG) {
                                            Log.d(MediaSessionStub.TAG, "Command (" + sessionCommand2 + ") from " + controller + " was rejected by " + MediaSessionStub.this.mSessionImpl + ", code=" + iOnCommandRequest);
                                        }
                                        MediaSessionStub.sendSessionResult(controller, i, iOnCommandRequest);
                                        return;
                                    }
                                } catch (RemoteException e) {
                                    Log.w(MediaSessionStub.TAG, "Exception in " + controller.toString(), e);
                                    return;
                                } catch (Exception e2) {
                                    throw e2;
                                }
                            }
                            SessionTask sessionTask2 = sessionTask;
                            if (sessionTask2 instanceof SessionPlayerTask) {
                                final ListenableFuture<SessionPlayer.PlayerResult> listenableFutureRun = ((SessionPlayerTask) sessionTask2).run(mediaSessionImpl, controller);
                                if (listenableFutureRun == null) {
                                    throw new RuntimeException("SessionPlayer has returned null, commandCode=" + i2);
                                }
                                listenableFutureRun.addListener(new Runnable() { // from class: androidx.media2.session.MediaSessionStub.1.1
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        try {
                                            MediaSessionStub.sendPlayerResult(controller, i, (SessionPlayer.PlayerResult) listenableFutureRun.get(0L, TimeUnit.MILLISECONDS));
                                        } catch (Exception e3) {
                                            Log.w(MediaSessionStub.TAG, "Cannot obtain PlayerResult after the command is finished", e3);
                                            MediaSessionStub.sendSessionResult(controller, i, -2);
                                        }
                                    }
                                }, MediaUtils.DIRECT_EXECUTOR);
                                return;
                            }
                            if (sessionTask2 instanceof SessionCallbackTask) {
                                Object objRun = ((SessionCallbackTask) sessionTask2).run(mediaSessionImpl, controller);
                                if (objRun == null) {
                                    throw new RuntimeException("SessionCallback has returned null, commandCode=" + i2);
                                }
                                if (objRun instanceof Integer) {
                                    MediaSessionStub.sendSessionResult(controller, i, ((Integer) objRun).intValue());
                                    return;
                                }
                                if (objRun instanceof SessionResult) {
                                    MediaSessionStub.sendSessionResult(controller, i, (SessionResult) objRun);
                                    return;
                                } else {
                                    if (MediaSessionStub.DEBUG) {
                                        throw new RuntimeException("Unexpected return type " + objRun + ". Fix bug");
                                    }
                                    return;
                                }
                            }
                            if (sessionTask2 instanceof LibrarySessionCallbackTask) {
                                Object objRun2 = ((LibrarySessionCallbackTask) sessionTask2).run((MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl) mediaSessionImpl, controller);
                                if (objRun2 == null) {
                                    throw new RuntimeException("LibrarySessionCallback has returned null, commandCode=" + i2);
                                }
                                if (objRun2 instanceof Integer) {
                                    MediaSessionStub.sendLibraryResult(controller, i, ((Integer) objRun2).intValue());
                                    return;
                                }
                                if (objRun2 instanceof LibraryResult) {
                                    MediaSessionStub.sendLibraryResult(controller, i, (LibraryResult) objRun2);
                                    return;
                                } else {
                                    if (MediaSessionStub.DEBUG) {
                                        throw new RuntimeException("Unexpected return type " + objRun2 + ". Fix bug");
                                    }
                                    return;
                                }
                            }
                            if (MediaSessionStub.DEBUG) {
                                throw new RuntimeException("Unknown task " + sessionTask + ". Fix bug");
                            }
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    void connect(final IMediaController iMediaController, int i, String str, int i2, int i3, Bundle bundle) {
        androidx.media.MediaSessionManager.RemoteUserInfo remoteUserInfo = new androidx.media.MediaSessionManager.RemoteUserInfo(str, i2, i3);
        final MediaSession.ControllerInfo controllerInfo = new MediaSession.ControllerInfo(remoteUserInfo, i, this.mSessionManager.isTrustedForMediaControl(remoteUserInfo), new Controller2Cb(iMediaController), bundle);
        final MediaSession.MediaSessionImpl mediaSessionImpl = this.mSessionImpl.get();
        if (mediaSessionImpl == null || mediaSessionImpl.isClosed()) {
            return;
        }
        mediaSessionImpl.getCallbackExecutor().execute(new Runnable() { // from class: androidx.media2.session.MediaSessionStub.2
            @Override // java.lang.Runnable
            public void run() {
                SequencedFutureManager sequencedFutureManager;
                if (mediaSessionImpl.isClosed()) {
                    return;
                }
                IBinder callbackBinder = ((Controller2Cb) controllerInfo.getControllerCb()).getCallbackBinder();
                SessionCommandGroup sessionCommandGroupOnConnect = mediaSessionImpl.getCallback().onConnect(mediaSessionImpl.getInstance(), controllerInfo);
                if (sessionCommandGroupOnConnect != null || controllerInfo.isTrusted()) {
                    if (MediaSessionStub.DEBUG) {
                        Log.d(MediaSessionStub.TAG, "Accepting connection, controllerInfo=" + controllerInfo + " allowedCommands=" + sessionCommandGroupOnConnect);
                    }
                    if (sessionCommandGroupOnConnect == null) {
                        sessionCommandGroupOnConnect = new SessionCommandGroup();
                    }
                    synchronized (MediaSessionStub.this.mLock) {
                        if (MediaSessionStub.this.mConnectedControllersManager.isConnected(controllerInfo)) {
                            Log.w(MediaSessionStub.TAG, "Controller " + controllerInfo + " has sent connection request multiple times");
                        }
                        MediaSessionStub.this.mConnectedControllersManager.addController(callbackBinder, controllerInfo, sessionCommandGroupOnConnect);
                        sequencedFutureManager = MediaSessionStub.this.mConnectedControllersManager.getSequencedFutureManager(controllerInfo);
                    }
                    ConnectionResult connectionResult = new ConnectionResult(MediaSessionStub.this, mediaSessionImpl, sessionCommandGroupOnConnect);
                    if (mediaSessionImpl.isClosed()) {
                        return;
                    }
                    try {
                        iMediaController.onConnected(sequencedFutureManager.obtainNextSequenceNumber(), MediaParcelUtils.toParcelable(connectionResult));
                    } catch (RemoteException unused) {
                    }
                    mediaSessionImpl.getCallback().onPostConnect(mediaSessionImpl.getInstance(), controllerInfo);
                    return;
                }
                if (MediaSessionStub.DEBUG) {
                    Log.d(MediaSessionStub.TAG, "Rejecting connection, controllerInfo=" + controllerInfo);
                }
                try {
                    iMediaController.onDisconnected(0);
                } catch (RemoteException unused2) {
                }
            }
        });
    }

    MediaItem convertMediaItemOnExecutor(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        MediaItem mediaItemOnCreateMediaItem = mediaSessionImpl.getCallback().onCreateMediaItem(mediaSessionImpl.getInstance(), controllerInfo, str);
        if (mediaItemOnCreateMediaItem == null) {
            Log.w(TAG, "onCreateMediaItem(mediaId=" + str + ") returned null. Ignoring");
        } else if (mediaItemOnCreateMediaItem.getMetadata() == null || !TextUtils.equals(str, mediaItemOnCreateMediaItem.getMetadata().getString("android.media.metadata.MEDIA_ID"))) {
            throw new RuntimeException("onCreateMediaItem(mediaId=" + str + "): media ID in the returned media item should match");
        }
        return mediaItemOnCreateMediaItem;
    }

    @Override // androidx.media2.session.IMediaSession
    public void connect(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RuntimeException {
        if (iMediaController == null || parcelImpl == null) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        int callingPid = Binder.getCallingPid();
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        ConnectionRequest connectionRequest = (ConnectionRequest) MediaParcelUtils.fromParcelable(parcelImpl);
        if (callingPid == 0) {
            callingPid = connectionRequest.getPid();
        }
        try {
            connect(iMediaController, connectionRequest.getVersion(), connectionRequest.getPackageName(), callingPid, callingUid, connectionRequest.getConnectionHints());
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media2.session.IMediaSession
    public void release(IMediaController iMediaController, int i) throws RemoteException {
        if (iMediaController == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            this.mConnectedControllersManager.removeController(iMediaController.asBinder());
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media2.session.IMediaSession
    public void onControllerResult(IMediaController iMediaController, int i, ParcelImpl parcelImpl) {
        if (iMediaController == null || parcelImpl == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            SequencedFutureManager sequencedFutureManager = this.mConnectedControllersManager.getSequencedFutureManager(iMediaController.asBinder());
            if (sequencedFutureManager == null) {
                return;
            }
            sequencedFutureManager.setFutureResult(i, (SessionResult) MediaParcelUtils.fromParcelable(parcelImpl));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media2.session.IMediaSession
    public void setVolumeTo(IMediaController iMediaController, int i, final int i2, final int i3) throws RuntimeException {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_VOLUME_SET_VOLUME, new SessionCallbackTask<Integer>() { // from class: androidx.media2.session.MediaSessionStub.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionStub.SessionCallbackTask
            public Integer run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                mediaSessionImpl.getSessionCompat().getController().setVolumeTo(i2, i3);
                return 0;
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void adjustVolume(IMediaController iMediaController, int i, final int i2, final int i3) throws RuntimeException {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_VOLUME_ADJUST_VOLUME, new SessionCallbackTask<Integer>() { // from class: androidx.media2.session.MediaSessionStub.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionStub.SessionCallbackTask
            public Integer run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                mediaSessionImpl.getSessionCompat().getController().adjustVolume(i2, i3);
                return 0;
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void play(IMediaController iMediaController, int i) throws RuntimeException {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_PLAY, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.5
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return mediaSessionImpl.play();
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void pause(IMediaController iMediaController, int i) throws RuntimeException {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_PAUSE, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.6
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return mediaSessionImpl.pause();
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void prepare(IMediaController iMediaController, int i) throws RuntimeException {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_PREPARE, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.7
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return mediaSessionImpl.prepare();
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void fastForward(IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_SESSION_FAST_FORWARD, new SessionCallbackTask<Integer>() { // from class: androidx.media2.session.MediaSessionStub.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionStub.SessionCallbackTask
            public Integer run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return Integer.valueOf(mediaSessionImpl.getCallback().onFastForward(mediaSessionImpl.getInstance(), controllerInfo));
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void rewind(IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_SESSION_REWIND, new SessionCallbackTask<Integer>() { // from class: androidx.media2.session.MediaSessionStub.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionStub.SessionCallbackTask
            public Integer run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return Integer.valueOf(mediaSessionImpl.getCallback().onRewind(mediaSessionImpl.getInstance(), controllerInfo));
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void skipForward(IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_SESSION_SKIP_FORWARD, new SessionCallbackTask<Integer>() { // from class: androidx.media2.session.MediaSessionStub.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionStub.SessionCallbackTask
            public Integer run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return Integer.valueOf(mediaSessionImpl.getCallback().onSkipForward(mediaSessionImpl.getInstance(), controllerInfo));
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void skipBackward(IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_SESSION_SKIP_BACKWARD, new SessionCallbackTask<Integer>() { // from class: androidx.media2.session.MediaSessionStub.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionStub.SessionCallbackTask
            public Integer run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return Integer.valueOf(mediaSessionImpl.getCallback().onSkipBackward(mediaSessionImpl.getInstance(), controllerInfo));
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void seekTo(IMediaController iMediaController, int i, final long j) throws RuntimeException {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_SEEK_TO, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.12
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return mediaSessionImpl.seekTo(j);
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void onCustomCommand(IMediaController iMediaController, int i, ParcelImpl parcelImpl, final Bundle bundle) {
        if (iMediaController == null || parcelImpl == null) {
            return;
        }
        final SessionCommand sessionCommand = (SessionCommand) MediaParcelUtils.fromParcelable(parcelImpl);
        dispatchSessionTask(iMediaController, i, sessionCommand, new SessionCallbackTask<SessionResult>() { // from class: androidx.media2.session.MediaSessionStub.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionStub.SessionCallbackTask
            public SessionResult run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                SessionResult sessionResultOnCustomCommand = mediaSessionImpl.getCallback().onCustomCommand(mediaSessionImpl.getInstance(), controllerInfo, sessionCommand, bundle);
                if (sessionResultOnCustomCommand != null) {
                    return sessionResultOnCustomCommand;
                }
                throw new RuntimeException("SessionCallback#onCustomCommand has returned null, command=" + sessionCommand);
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void setRating(IMediaController iMediaController, int i, final String str, ParcelImpl parcelImpl) {
        if (iMediaController == null || parcelImpl == null) {
            return;
        }
        final Rating rating = (Rating) MediaParcelUtils.fromParcelable(parcelImpl);
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_SESSION_SET_RATING, new SessionCallbackTask<Integer>() { // from class: androidx.media2.session.MediaSessionStub.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionStub.SessionCallbackTask
            public Integer run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                if (TextUtils.isEmpty(str)) {
                    Log.w(MediaSessionStub.TAG, "setRating(): Ignoring empty mediaId from " + controllerInfo);
                    return -3;
                }
                if (rating == null) {
                    Log.w(MediaSessionStub.TAG, "setRating(): Ignoring null rating from " + controllerInfo);
                    return -3;
                }
                return Integer.valueOf(mediaSessionImpl.getCallback().onSetRating(mediaSessionImpl.getInstance(), controllerInfo, str, rating));
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void setPlaybackSpeed(IMediaController iMediaController, int i, final float f) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_SET_SPEED, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.15
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return mediaSessionImpl.setPlaybackSpeed(f);
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void setPlaylist(IMediaController iMediaController, int i, final List<String> list, final ParcelImpl parcelImpl) {
        if (iMediaController == null || parcelImpl == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_SET_PLAYLIST, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.16
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                if (list == null) {
                    Log.w(MediaSessionStub.TAG, "setPlaylist(): Ignoring null playlist from " + controllerInfo);
                    return SessionPlayer.PlayerResult.createFuture(-3);
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    MediaItem mediaItemConvertMediaItemOnExecutor = MediaSessionStub.this.convertMediaItemOnExecutor(mediaSessionImpl, controllerInfo, (String) list.get(i2));
                    if (mediaItemConvertMediaItemOnExecutor != null) {
                        arrayList.add(mediaItemConvertMediaItemOnExecutor);
                    }
                }
                return mediaSessionImpl.setPlaylist(arrayList, (MediaMetadata) MediaParcelUtils.fromParcelable(parcelImpl));
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void setMediaItem(IMediaController iMediaController, int i, final String str) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_SET_MEDIA_ITEM, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.17
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                if (TextUtils.isEmpty(str)) {
                    Log.w(MediaSessionStub.TAG, "setMediaItem(): Ignoring empty mediaId from " + controllerInfo);
                    return SessionPlayer.PlayerResult.createFuture(-3);
                }
                MediaItem mediaItemConvertMediaItemOnExecutor = MediaSessionStub.this.convertMediaItemOnExecutor(mediaSessionImpl, controllerInfo, str);
                if (mediaItemConvertMediaItemOnExecutor == null) {
                    return SessionPlayer.PlayerResult.createFuture(-3);
                }
                return mediaSessionImpl.setMediaItem(mediaItemConvertMediaItemOnExecutor);
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void setMediaUri(IMediaController iMediaController, int i, final Uri uri, final Bundle bundle) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_SESSION_SET_MEDIA_URI, new SessionCallbackTask<Integer>() { // from class: androidx.media2.session.MediaSessionStub.18
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionStub.SessionCallbackTask
            public Integer run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                if (uri == null) {
                    Log.w(MediaSessionStub.TAG, "setMediaUri(): Ignoring null uri from " + controllerInfo);
                    return -3;
                }
                return Integer.valueOf(mediaSessionImpl.getCallback().onSetMediaUri(mediaSessionImpl.getInstance(), controllerInfo, uri, bundle));
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void updatePlaylistMetadata(IMediaController iMediaController, int i, final ParcelImpl parcelImpl) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_UPDATE_LIST_METADATA, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.19
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return mediaSessionImpl.updatePlaylistMetadata((MediaMetadata) MediaParcelUtils.fromParcelable(parcelImpl));
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void addPlaylistItem(IMediaController iMediaController, int i, final int i2, final String str) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_ADD_PLAYLIST_ITEM, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.20
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                if (TextUtils.isEmpty(str)) {
                    Log.w(MediaSessionStub.TAG, "addPlaylistItem(): Ignoring empty mediaId from " + controllerInfo);
                    return SessionPlayer.PlayerResult.createFuture(-3);
                }
                MediaItem mediaItemConvertMediaItemOnExecutor = MediaSessionStub.this.convertMediaItemOnExecutor(mediaSessionImpl, controllerInfo, str);
                if (mediaItemConvertMediaItemOnExecutor == null) {
                    return SessionPlayer.PlayerResult.createFuture(-3);
                }
                return mediaSessionImpl.addPlaylistItem(i2, mediaItemConvertMediaItemOnExecutor);
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void removePlaylistItem(IMediaController iMediaController, int i, final int i2) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_REMOVE_PLAYLIST_ITEM, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.21
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return mediaSessionImpl.removePlaylistItem(i2);
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void replacePlaylistItem(IMediaController iMediaController, int i, final int i2, final String str) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_REPLACE_PLAYLIST_ITEM, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.22
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                if (TextUtils.isEmpty(str)) {
                    Log.w(MediaSessionStub.TAG, "replacePlaylistItem(): Ignoring empty mediaId from " + controllerInfo);
                    return SessionPlayer.PlayerResult.createFuture(-3);
                }
                MediaItem mediaItemConvertMediaItemOnExecutor = MediaSessionStub.this.convertMediaItemOnExecutor(mediaSessionImpl, controllerInfo, str);
                if (mediaItemConvertMediaItemOnExecutor == null) {
                    return SessionPlayer.PlayerResult.createFuture(-3);
                }
                return mediaSessionImpl.replacePlaylistItem(i2, mediaItemConvertMediaItemOnExecutor);
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void movePlaylistItem(IMediaController iMediaController, int i, final int i2, final int i3) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_MOVE_PLAYLIST_ITEM, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.23
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return mediaSessionImpl.movePlaylistItem(i2, i3);
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void skipToPlaylistItem(IMediaController iMediaController, int i, final int i2) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_SKIP_TO_PLAYLIST_ITEM, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.24
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                int i3 = i2;
                if (i3 < 0) {
                    Log.w(MediaSessionStub.TAG, "skipToPlaylistItem(): Ignoring negative index from " + controllerInfo);
                    return SessionPlayer.PlayerResult.createFuture(-3);
                }
                return mediaSessionImpl.skipToPlaylistItem(i3);
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void skipToPreviousItem(IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_SKIP_TO_PREVIOUS_PLAYLIST_ITEM, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.25
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return mediaSessionImpl.skipToPreviousItem();
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void skipToNextItem(IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_SKIP_TO_NEXT_PLAYLIST_ITEM, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.26
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return mediaSessionImpl.skipToNextItem();
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void setRepeatMode(IMediaController iMediaController, int i, final int i2) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_SET_REPEAT_MODE, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.27
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return mediaSessionImpl.setRepeatMode(i2);
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void setShuffleMode(IMediaController iMediaController, int i, final int i2) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_SET_SHUFFLE_MODE, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.28
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return mediaSessionImpl.setShuffleMode(i2);
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void setSurface(IMediaController iMediaController, int i, final Surface surface) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_SET_SURFACE, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.29
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return mediaSessionImpl.setSurface(surface);
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void selectTrack(IMediaController iMediaController, int i, final ParcelImpl parcelImpl) {
        if (iMediaController == null || parcelImpl == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_SELECT_TRACK, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.30
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                SessionPlayer.TrackInfo trackInfo = (SessionPlayer.TrackInfo) MediaParcelUtils.fromParcelable(parcelImpl);
                if (trackInfo == null) {
                    return SessionPlayer.PlayerResult.createFuture(-3);
                }
                return mediaSessionImpl.selectTrack(trackInfo);
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void deselectTrack(IMediaController iMediaController, int i, final ParcelImpl parcelImpl) {
        if (iMediaController == null || parcelImpl == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_PLAYER_DESELECT_TRACK, new SessionPlayerTask() { // from class: androidx.media2.session.MediaSessionStub.31
            @Override // androidx.media2.session.MediaSessionStub.SessionPlayerTask
            public ListenableFuture<SessionPlayer.PlayerResult> run(MediaSession.MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
                SessionPlayer.TrackInfo trackInfo = (SessionPlayer.TrackInfo) MediaParcelUtils.fromParcelable(parcelImpl);
                if (trackInfo == null) {
                    return SessionPlayer.PlayerResult.createFuture(-3);
                }
                return mediaSessionImpl.deselectTrack(trackInfo);
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void getLibraryRoot(IMediaController iMediaController, int i, final ParcelImpl parcelImpl) throws RuntimeException {
        if (iMediaController == null || parcelImpl == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_LIBRARY_GET_LIBRARY_ROOT, new LibrarySessionCallbackTask<LibraryResult>() { // from class: androidx.media2.session.MediaSessionStub.32
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionStub.LibrarySessionCallbackTask
            public LibraryResult run(MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl mediaLibrarySessionImpl, MediaSession.ControllerInfo controllerInfo) {
                return mediaLibrarySessionImpl.onGetLibraryRootOnExecutor(controllerInfo, (MediaLibraryService.LibraryParams) MediaParcelUtils.fromParcelable(parcelImpl));
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void getItem(IMediaController iMediaController, int i, final String str) throws RuntimeException {
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_LIBRARY_GET_ITEM, new LibrarySessionCallbackTask<LibraryResult>() { // from class: androidx.media2.session.MediaSessionStub.33
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionStub.LibrarySessionCallbackTask
            public LibraryResult run(MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl mediaLibrarySessionImpl, MediaSession.ControllerInfo controllerInfo) {
                if (TextUtils.isEmpty(str)) {
                    Log.w(MediaSessionStub.TAG, "getItem(): Ignoring empty mediaId from " + controllerInfo);
                    return new LibraryResult(-3);
                }
                return mediaLibrarySessionImpl.onGetItemOnExecutor(controllerInfo, str);
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void getChildren(IMediaController iMediaController, int i, final String str, final int i2, final int i3, final ParcelImpl parcelImpl) throws RuntimeException {
        if (iMediaController == null || parcelImpl == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_LIBRARY_GET_CHILDREN, new LibrarySessionCallbackTask<LibraryResult>() { // from class: androidx.media2.session.MediaSessionStub.34
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionStub.LibrarySessionCallbackTask
            public LibraryResult run(MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl mediaLibrarySessionImpl, MediaSession.ControllerInfo controllerInfo) {
                if (TextUtils.isEmpty(str)) {
                    Log.w(MediaSessionStub.TAG, "getChildren(): Ignoring empty parentId from " + controllerInfo);
                    return new LibraryResult(-3);
                }
                int i4 = i2;
                if (i4 < 0) {
                    Log.w(MediaSessionStub.TAG, "getChildren(): Ignoring negative page from " + controllerInfo);
                    return new LibraryResult(-3);
                }
                int i5 = i3;
                if (i5 < 1) {
                    Log.w(MediaSessionStub.TAG, "getChildren(): Ignoring pageSize less than 1 from " + controllerInfo);
                    return new LibraryResult(-3);
                }
                return mediaLibrarySessionImpl.onGetChildrenOnExecutor(controllerInfo, str, i4, i5, (MediaLibraryService.LibraryParams) MediaParcelUtils.fromParcelable(parcelImpl));
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void search(IMediaController iMediaController, int i, final String str, final ParcelImpl parcelImpl) {
        if (iMediaController == null || parcelImpl == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_LIBRARY_SEARCH, new LibrarySessionCallbackTask<Integer>() { // from class: androidx.media2.session.MediaSessionStub.35
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionStub.LibrarySessionCallbackTask
            public Integer run(MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl mediaLibrarySessionImpl, MediaSession.ControllerInfo controllerInfo) {
                if (TextUtils.isEmpty(str)) {
                    Log.w(MediaSessionStub.TAG, "search(): Ignoring empty query from " + controllerInfo);
                    return -3;
                }
                return Integer.valueOf(mediaLibrarySessionImpl.onSearchOnExecutor(controllerInfo, str, (MediaLibraryService.LibraryParams) MediaParcelUtils.fromParcelable(parcelImpl)));
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void getSearchResult(IMediaController iMediaController, int i, final String str, final int i2, final int i3, final ParcelImpl parcelImpl) {
        if (iMediaController == null || parcelImpl == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_LIBRARY_GET_SEARCH_RESULT, new LibrarySessionCallbackTask<LibraryResult>() { // from class: androidx.media2.session.MediaSessionStub.36
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionStub.LibrarySessionCallbackTask
            public LibraryResult run(MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl mediaLibrarySessionImpl, MediaSession.ControllerInfo controllerInfo) {
                if (TextUtils.isEmpty(str)) {
                    Log.w(MediaSessionStub.TAG, "getSearchResult(): Ignoring empty query from " + controllerInfo);
                    return new LibraryResult(-3);
                }
                int i4 = i2;
                if (i4 < 0) {
                    Log.w(MediaSessionStub.TAG, "getSearchResult(): Ignoring negative page from " + controllerInfo);
                    return new LibraryResult(-3);
                }
                int i5 = i3;
                if (i5 < 1) {
                    Log.w(MediaSessionStub.TAG, "getSearchResult(): Ignoring pageSize less than 1 from " + controllerInfo);
                    return new LibraryResult(-3);
                }
                return mediaLibrarySessionImpl.onGetSearchResultOnExecutor(controllerInfo, str, i4, i5, (MediaLibraryService.LibraryParams) MediaParcelUtils.fromParcelable(parcelImpl));
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void subscribe(IMediaController iMediaController, int i, final String str, final ParcelImpl parcelImpl) {
        if (iMediaController == null || parcelImpl == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_LIBRARY_SUBSCRIBE, new LibrarySessionCallbackTask<Integer>() { // from class: androidx.media2.session.MediaSessionStub.37
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionStub.LibrarySessionCallbackTask
            public Integer run(MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl mediaLibrarySessionImpl, MediaSession.ControllerInfo controllerInfo) {
                if (TextUtils.isEmpty(str)) {
                    Log.w(MediaSessionStub.TAG, "subscribe(): Ignoring empty parentId from " + controllerInfo);
                    return -3;
                }
                return Integer.valueOf(mediaLibrarySessionImpl.onSubscribeOnExecutor(controllerInfo, str, (MediaLibraryService.LibraryParams) MediaParcelUtils.fromParcelable(parcelImpl)));
            }
        });
    }

    @Override // androidx.media2.session.IMediaSession
    public void unsubscribe(IMediaController iMediaController, int i, final String str) {
        if (iMediaController == null) {
            return;
        }
        dispatchSessionTask(iMediaController, i, SessionCommand.COMMAND_CODE_LIBRARY_UNSUBSCRIBE, new LibrarySessionCallbackTask<Integer>() { // from class: androidx.media2.session.MediaSessionStub.38
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media2.session.MediaSessionStub.LibrarySessionCallbackTask
            public Integer run(MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl mediaLibrarySessionImpl, MediaSession.ControllerInfo controllerInfo) {
                if (TextUtils.isEmpty(str)) {
                    Log.w(MediaSessionStub.TAG, "unsubscribe(): Ignoring empty parentId from " + controllerInfo);
                    return -3;
                }
                return Integer.valueOf(mediaLibrarySessionImpl.onUnsubscribeOnExecutor(controllerInfo, str));
            }
        });
    }

    final class Controller2Cb extends MediaSession.ControllerCb {
        private final IMediaController mIControllerCallback;

        Controller2Cb(IMediaController iMediaController) {
            this.mIControllerCallback = iMediaController;
        }

        IBinder getCallbackBinder() {
            return this.mIControllerCallback.asBinder();
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlayerResult(int i, SessionPlayer.PlayerResult playerResult) throws RemoteException {
            onSessionResult(i, SessionResult.from(playerResult));
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onSessionResult(int i, SessionResult sessionResult) throws RemoteException {
            if (sessionResult == null) {
                sessionResult = new SessionResult(-1, null);
            }
            this.mIControllerCallback.onSessionResult(i, MediaParcelUtils.toParcelable(sessionResult));
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onLibraryResult(int i, LibraryResult libraryResult) throws RemoteException {
            if (libraryResult == null) {
                libraryResult = new LibraryResult(-1);
            }
            this.mIControllerCallback.onLibraryResult(i, MediaParcelUtils.toParcelable(libraryResult));
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlayerChanged(int i, SessionPlayer sessionPlayer, MediaController.PlaybackInfo playbackInfo, SessionPlayer sessionPlayer2, MediaController.PlaybackInfo playbackInfo2) throws RemoteException {
            if (sessionPlayer == null || MediaSessionStub.this.mSessionImpl.get() == null) {
                return;
            }
            List<MediaItem> playlist = sessionPlayer.getPlaylist();
            List<MediaItem> playlist2 = sessionPlayer2.getPlaylist();
            if (!ObjectsCompat.equals(playlist, playlist2)) {
                onPlaylistChanged(i, playlist2, sessionPlayer2.getPlaylistMetadata(), sessionPlayer2.getCurrentMediaItemIndex(), sessionPlayer2.getPreviousMediaItemIndex(), sessionPlayer2.getNextMediaItemIndex());
            } else {
                MediaMetadata playlistMetadata = sessionPlayer.getPlaylistMetadata();
                MediaMetadata playlistMetadata2 = sessionPlayer2.getPlaylistMetadata();
                if (!ObjectsCompat.equals(playlistMetadata, playlistMetadata2)) {
                    onPlaylistMetadataChanged(i, playlistMetadata2);
                }
            }
            MediaItem currentMediaItem = sessionPlayer.getCurrentMediaItem();
            MediaItem currentMediaItem2 = sessionPlayer2.getCurrentMediaItem();
            if (!ObjectsCompat.equals(currentMediaItem, currentMediaItem2)) {
                onCurrentMediaItemChanged(i, currentMediaItem2, sessionPlayer2.getCurrentMediaItemIndex(), sessionPlayer2.getPreviousMediaItemIndex(), sessionPlayer2.getNextMediaItemIndex());
            }
            int repeatMode = sessionPlayer2.getRepeatMode();
            if (sessionPlayer.getRepeatMode() != repeatMode) {
                onRepeatModeChanged(i, repeatMode, sessionPlayer2.getCurrentMediaItemIndex(), sessionPlayer2.getPreviousMediaItemIndex(), sessionPlayer2.getNextMediaItemIndex());
            }
            int shuffleMode = sessionPlayer2.getShuffleMode();
            if (sessionPlayer.getShuffleMode() != shuffleMode) {
                onShuffleModeChanged(i, shuffleMode, sessionPlayer2.getCurrentMediaItemIndex(), sessionPlayer2.getPreviousMediaItemIndex(), sessionPlayer2.getNextMediaItemIndex());
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long currentPosition = sessionPlayer2.getCurrentPosition();
            onPlayerStateChanged(i, jElapsedRealtime, currentPosition, sessionPlayer2.getPlayerState());
            MediaItem currentMediaItem3 = sessionPlayer2.getCurrentMediaItem();
            if (currentMediaItem3 != null) {
                onBufferingStateChanged(i, currentMediaItem3, sessionPlayer2.getBufferingState(), sessionPlayer2.getBufferedPosition(), SystemClock.elapsedRealtime(), sessionPlayer2.getCurrentPosition());
            }
            float playbackSpeed = sessionPlayer2.getPlaybackSpeed();
            if (playbackSpeed != sessionPlayer.getPlaybackSpeed()) {
                onPlaybackSpeedChanged(i, jElapsedRealtime, currentPosition, playbackSpeed);
            }
            if (ObjectsCompat.equals(playbackInfo, playbackInfo2)) {
                return;
            }
            onPlaybackInfoChanged(i, playbackInfo2);
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void setCustomLayout(int i, List<MediaSession.CommandButton> list) throws RemoteException {
            this.mIControllerCallback.onSetCustomLayout(i, MediaUtils.convertCommandButtonListToParcelImplList(list));
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlaybackInfoChanged(int i, MediaController.PlaybackInfo playbackInfo) throws RemoteException {
            this.mIControllerCallback.onPlaybackInfoChanged(i, MediaParcelUtils.toParcelable(playbackInfo));
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onAllowedCommandsChanged(int i, SessionCommandGroup sessionCommandGroup) throws RemoteException {
            this.mIControllerCallback.onAllowedCommandsChanged(i, MediaParcelUtils.toParcelable(sessionCommandGroup));
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void sendCustomCommand(int i, SessionCommand sessionCommand, Bundle bundle) throws RemoteException {
            this.mIControllerCallback.onCustomCommand(i, MediaParcelUtils.toParcelable(sessionCommand), bundle);
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlayerStateChanged(int i, long j, long j2, int i2) throws RemoteException {
            this.mIControllerCallback.onPlayerStateChanged(i, j, j2, i2);
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlaybackSpeedChanged(int i, long j, long j2, float f) throws RemoteException {
            this.mIControllerCallback.onPlaybackSpeedChanged(i, j, j2, f);
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onBufferingStateChanged(int i, MediaItem mediaItem, int i2, long j, long j2, long j3) throws RemoteException {
            this.mIControllerCallback.onBufferingStateChanged(i, MediaParcelUtils.toParcelable(mediaItem), i2, j, j2, j3);
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onSeekCompleted(int i, long j, long j2, long j3) throws RemoteException {
            this.mIControllerCallback.onSeekCompleted(i, j, j2, j3);
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onCurrentMediaItemChanged(int i, MediaItem mediaItem, int i2, int i3, int i4) throws RemoteException {
            this.mIControllerCallback.onCurrentMediaItemChanged(i, MediaParcelUtils.toParcelable(mediaItem), i2, i3, i4);
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlaylistChanged(int i, List<MediaItem> list, MediaMetadata mediaMetadata, int i2, int i3, int i4) throws RemoteException {
            MediaSession.ControllerInfo controller = MediaSessionStub.this.mConnectedControllersManager.getController(getCallbackBinder());
            if (MediaSessionStub.this.mConnectedControllersManager.isAllowedCommand(controller, SessionCommand.COMMAND_CODE_PLAYER_GET_PLAYLIST)) {
                this.mIControllerCallback.onPlaylistChanged(i, MediaUtils.convertMediaItemListToParcelImplListSlice(list), MediaParcelUtils.toParcelable(mediaMetadata), i2, i3, i4);
            } else if (MediaSessionStub.this.mConnectedControllersManager.isAllowedCommand(controller, SessionCommand.COMMAND_CODE_PLAYER_GET_PLAYLIST_METADATA)) {
                this.mIControllerCallback.onPlaylistMetadataChanged(i, MediaParcelUtils.toParcelable(mediaMetadata));
            }
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlaylistMetadataChanged(int i, MediaMetadata mediaMetadata) throws RemoteException {
            if (MediaSessionStub.this.mConnectedControllersManager.isAllowedCommand(MediaSessionStub.this.mConnectedControllersManager.getController(getCallbackBinder()), SessionCommand.COMMAND_CODE_PLAYER_GET_PLAYLIST_METADATA)) {
                this.mIControllerCallback.onPlaylistMetadataChanged(i, MediaParcelUtils.toParcelable(mediaMetadata));
            }
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onShuffleModeChanged(int i, int i2, int i3, int i4, int i5) throws RemoteException {
            this.mIControllerCallback.onShuffleModeChanged(i, i2, i3, i4, i5);
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onRepeatModeChanged(int i, int i2, int i3, int i4, int i5) throws RemoteException {
            this.mIControllerCallback.onRepeatModeChanged(i, i2, i3, i4, i5);
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlaybackCompleted(int i) throws RemoteException {
            this.mIControllerCallback.onPlaybackCompleted(i);
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onChildrenChanged(int i, String str, int i2, MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
            this.mIControllerCallback.onChildrenChanged(i, str, i2, MediaParcelUtils.toParcelable(libraryParams));
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onSearchResultChanged(int i, String str, int i2, MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
            this.mIControllerCallback.onSearchResultChanged(i, str, i2, MediaParcelUtils.toParcelable(libraryParams));
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onDisconnected(int i) throws RemoteException {
            this.mIControllerCallback.onDisconnected(i);
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onVideoSizeChanged(int i, VideoSize videoSize) throws RemoteException {
            this.mIControllerCallback.onVideoSizeChanged(i, MediaParcelUtils.toParcelable(new MediaItem.Builder().build()), MediaParcelUtils.toParcelable(videoSize));
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onTracksChanged(int i, List<SessionPlayer.TrackInfo> list, SessionPlayer.TrackInfo trackInfo, SessionPlayer.TrackInfo trackInfo2, SessionPlayer.TrackInfo trackInfo3, SessionPlayer.TrackInfo trackInfo4) throws RemoteException {
            this.mIControllerCallback.onTrackInfoChanged(i, MediaParcelUtils.toParcelableList(list), MediaParcelUtils.toParcelable(trackInfo), MediaParcelUtils.toParcelable(trackInfo2), MediaParcelUtils.toParcelable(trackInfo3), MediaParcelUtils.toParcelable(trackInfo4));
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onTrackSelected(int i, SessionPlayer.TrackInfo trackInfo) throws RemoteException {
            this.mIControllerCallback.onTrackSelected(i, MediaParcelUtils.toParcelable(trackInfo));
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onTrackDeselected(int i, SessionPlayer.TrackInfo trackInfo) throws RemoteException {
            this.mIControllerCallback.onTrackDeselected(i, MediaParcelUtils.toParcelable(trackInfo));
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onSubtitleData(int i, MediaItem mediaItem, SessionPlayer.TrackInfo trackInfo, SubtitleData subtitleData) throws RemoteException {
            this.mIControllerCallback.onSubtitleData(i, MediaParcelUtils.toParcelable(mediaItem), MediaParcelUtils.toParcelable(trackInfo), MediaParcelUtils.toParcelable(subtitleData));
        }

        public int hashCode() {
            return ObjectsCompat.hash(getCallbackBinder());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != Controller2Cb.class) {
                return false;
            }
            return ObjectsCompat.equals(getCallbackBinder(), ((Controller2Cb) obj).getCallbackBinder());
        }
    }
}
