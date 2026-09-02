package androidx.media2.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.util.ObjectsCompat;
import androidx.media.VolumeProviderCompat;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.Rating;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.VideoSize;
import androidx.work.PeriodicWorkRequest;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class MediaSessionLegacyStub extends MediaSessionCompat.Callback implements Closeable {
    private static final int DEFAULT_CONNECTION_TIMEOUT_MS = 300000;
    private static final String DEFAULT_MEDIA_SESSION_TAG_DELIM = ".";
    private static final String DEFAULT_MEDIA_SESSION_TAG_PREFIX = "androidx.media2.session.id";
    final ConnectedControllersManager<androidx.media.MediaSessionManager.RemoteUserInfo> mConnectedControllersManager;
    final ConnectionTimeoutHandler mConnectionTimeoutHandler;
    volatile long mConnectionTimeoutMs;
    final Context mContext;
    final MediaSession.ControllerCb mControllerLegacyCbForBroadcast;
    private final Handler mHandler;
    final MediaSessionCompat mSessionCompat;
    final MediaSession.MediaSessionImpl mSessionImpl;
    final androidx.media.MediaSessionManager mSessionManager;
    private static final String TAG = "MediaSessionLegacyStub";
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    static final SparseArray<SessionCommand> sCommandsForOnCommandRequest = new SparseArray<>();

    @FunctionalInterface
    private interface SessionTask {
        void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onCustomAction(String str, Bundle bundle) {
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSetCaptioningEnabled(boolean z) {
    }

    static {
        for (SessionCommand sessionCommand : new SessionCommandGroup.Builder().addAllPlayerCommands(2).addAllVolumeCommands(2).build().getCommands()) {
            sCommandsForOnCommandRequest.append(sessionCommand.getCommandCode(), sessionCommand);
        }
    }

    MediaSessionLegacyStub(MediaSession.MediaSessionImpl mediaSessionImpl, ComponentName componentName, PendingIntent pendingIntent, Handler handler) {
        this.mSessionImpl = mediaSessionImpl;
        Context context = mediaSessionImpl.getContext();
        this.mContext = context;
        this.mSessionManager = androidx.media.MediaSessionManager.getSessionManager(context);
        this.mControllerLegacyCbForBroadcast = new ControllerLegacyCbForBroadcast();
        this.mConnectionTimeoutHandler = new ConnectionTimeoutHandler(handler.getLooper());
        this.mConnectedControllersManager = new ConnectedControllersManager<>(mediaSessionImpl);
        this.mConnectionTimeoutMs = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.mHandler = handler;
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, TextUtils.join(DEFAULT_MEDIA_SESSION_TAG_DELIM, new String[]{DEFAULT_MEDIA_SESSION_TAG_PREFIX, mediaSessionImpl.getId()}), componentName, pendingIntent, mediaSessionImpl.getToken().getExtras(), mediaSessionImpl.getToken());
        this.mSessionCompat = mediaSessionCompat;
        mediaSessionCompat.setSessionActivity(mediaSessionImpl.getSessionActivity());
        mediaSessionCompat.setFlags(4);
    }

    public void start() {
        this.mSessionCompat.setCallback(this, this.mHandler);
        this.mSessionCompat.setActive(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mSessionCompat.release();
    }

    public MediaSessionCompat getSessionCompat() {
        return this.mSessionCompat;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onCommand(String str, final Bundle bundle, final ResultReceiver resultReceiver) {
        if (str == null) {
            return;
        }
        final SessionCommand sessionCommand = new SessionCommand(str, null);
        dispatchSessionTask(sessionCommand, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.1
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                SessionResult sessionResultOnCustomCommand = MediaSessionLegacyStub.this.mSessionImpl.getCallback().onCustomCommand(MediaSessionLegacyStub.this.mSessionImpl.getInstance(), controllerInfo, sessionCommand, bundle);
                ResultReceiver resultReceiver2 = resultReceiver;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(sessionResultOnCustomCommand.getResultCode(), sessionResultOnCustomCommand.getCustomCommandResult());
                }
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPrepare() {
        dispatchSessionTask(SessionCommand.COMMAND_CODE_PLAYER_PREPARE, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.2
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                MediaSessionLegacyStub.this.mSessionImpl.prepare();
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPrepareFromMediaId(String str, Bundle bundle) {
        onPrepareFromUri(new Uri.Builder().scheme(MediaConstants.MEDIA_URI_SCHEME).authority(MediaConstants.MEDIA_URI_AUTHORITY).path(MediaConstants.MEDIA_URI_PATH_PREPARE_FROM_MEDIA_ID).appendQueryParameter(MediaConstants.MEDIA_URI_QUERY_ID, str).build(), bundle);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPrepareFromSearch(String str, Bundle bundle) {
        onPrepareFromUri(new Uri.Builder().scheme(MediaConstants.MEDIA_URI_SCHEME).authority(MediaConstants.MEDIA_URI_AUTHORITY).path(MediaConstants.MEDIA_URI_PATH_PREPARE_FROM_SEARCH).appendQueryParameter("query", str).build(), bundle);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPrepareFromUri(final Uri uri, final Bundle bundle) {
        dispatchSessionTask(SessionCommand.COMMAND_CODE_SESSION_SET_MEDIA_URI, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.3
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                if (MediaSessionLegacyStub.this.mSessionImpl.getCallback().onSetMediaUri(MediaSessionLegacyStub.this.mSessionImpl.getInstance(), controllerInfo, uri, bundle) == 0) {
                    MediaSessionLegacyStub.this.mSessionImpl.prepare();
                }
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPlay() {
        dispatchSessionTask(SessionCommand.COMMAND_CODE_PLAYER_PLAY, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.4
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                MediaSessionLegacyStub.this.mSessionImpl.play();
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPlayFromMediaId(String str, Bundle bundle) {
        onPlayFromUri(new Uri.Builder().scheme(MediaConstants.MEDIA_URI_SCHEME).authority(MediaConstants.MEDIA_URI_AUTHORITY).path(MediaConstants.MEDIA_URI_PATH_PLAY_FROM_MEDIA_ID).appendQueryParameter(MediaConstants.MEDIA_URI_QUERY_ID, str).build(), bundle);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPlayFromSearch(String str, Bundle bundle) {
        onPlayFromUri(new Uri.Builder().scheme(MediaConstants.MEDIA_URI_SCHEME).authority(MediaConstants.MEDIA_URI_AUTHORITY).path(MediaConstants.MEDIA_URI_PATH_PLAY_FROM_SEARCH).appendQueryParameter("query", str).build(), bundle);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPlayFromUri(final Uri uri, final Bundle bundle) {
        dispatchSessionTask(SessionCommand.COMMAND_CODE_SESSION_SET_MEDIA_URI, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.5
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                if (MediaSessionLegacyStub.this.mSessionImpl.getCallback().onSetMediaUri(MediaSessionLegacyStub.this.mSessionImpl.getInstance(), controllerInfo, uri, bundle) == 0) {
                    MediaSessionLegacyStub.this.mSessionImpl.play();
                }
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPause() {
        dispatchSessionTask(SessionCommand.COMMAND_CODE_PLAYER_PAUSE, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.6
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                MediaSessionLegacyStub.this.mSessionImpl.pause();
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onStop() {
        dispatchSessionTask(SessionCommand.COMMAND_CODE_PLAYER_PAUSE, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.7
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                MediaSessionLegacyStub.this.handleTaskOnExecutor(controllerInfo, null, SessionCommand.COMMAND_CODE_PLAYER_SEEK_TO, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.7.1
                    @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
                    public void run(MediaSession.ControllerInfo controllerInfo2) throws RemoteException {
                        MediaSessionLegacyStub.this.mSessionImpl.pause();
                        MediaSessionLegacyStub.this.mSessionImpl.seekTo(0L);
                    }
                });
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSeekTo(final long j) {
        dispatchSessionTask(SessionCommand.COMMAND_CODE_PLAYER_SEEK_TO, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.8
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                MediaSessionLegacyStub.this.mSessionImpl.seekTo(j);
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSkipToNext() {
        dispatchSessionTask(SessionCommand.COMMAND_CODE_PLAYER_SKIP_TO_NEXT_PLAYLIST_ITEM, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.9
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                MediaSessionLegacyStub.this.mSessionImpl.skipToNextItem();
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSkipToPrevious() {
        dispatchSessionTask(SessionCommand.COMMAND_CODE_PLAYER_SKIP_TO_PREVIOUS_PLAYLIST_ITEM, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.10
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                MediaSessionLegacyStub.this.mSessionImpl.skipToPreviousItem();
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSetPlaybackSpeed(final float f) {
        dispatchSessionTask(SessionCommand.COMMAND_CODE_PLAYER_SET_SPEED, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.11
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                MediaSessionLegacyStub.this.mSessionImpl.setPlaybackSpeed(f);
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSkipToQueueItem(final long j) {
        dispatchSessionTask(SessionCommand.COMMAND_CODE_PLAYER_SKIP_TO_PLAYLIST_ITEM, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.12
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                if (MediaSessionLegacyStub.this.mSessionImpl.getPlayer().getPlaylist() == null) {
                    return;
                }
                MediaSessionLegacyStub.this.mSessionImpl.skipToPlaylistItem((int) j);
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onFastForward() {
        dispatchSessionTask(SessionCommand.COMMAND_CODE_SESSION_FAST_FORWARD, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.13
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                MediaSessionLegacyStub.this.mSessionImpl.getCallback().onFastForward(MediaSessionLegacyStub.this.mSessionImpl.getInstance(), controllerInfo);
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onRewind() {
        dispatchSessionTask(SessionCommand.COMMAND_CODE_SESSION_REWIND, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.14
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                MediaSessionLegacyStub.this.mSessionImpl.getCallback().onRewind(MediaSessionLegacyStub.this.mSessionImpl.getInstance(), controllerInfo);
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSetRating(RatingCompat ratingCompat) {
        onSetRating(ratingCompat, null);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSetRating(final RatingCompat ratingCompat, Bundle bundle) {
        if (ratingCompat == null) {
            return;
        }
        dispatchSessionTask(SessionCommand.COMMAND_CODE_SESSION_SET_RATING, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.15
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                MediaItem currentMediaItem = MediaSessionLegacyStub.this.mSessionImpl.getCurrentMediaItem();
                if (currentMediaItem == null) {
                    return;
                }
                MediaSessionLegacyStub.this.mSessionImpl.getCallback().onSetRating(MediaSessionLegacyStub.this.mSessionImpl.getInstance(), controllerInfo, currentMediaItem.getMediaId(), MediaUtils.convertToRating(ratingCompat));
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSetRepeatMode(final int i) {
        dispatchSessionTask(SessionCommand.COMMAND_CODE_PLAYER_SET_REPEAT_MODE, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.16
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                MediaSessionLegacyStub.this.mSessionImpl.setRepeatMode(i);
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSetShuffleMode(final int i) {
        dispatchSessionTask(SessionCommand.COMMAND_CODE_PLAYER_SET_SHUFFLE_MODE, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.17
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                MediaSessionLegacyStub.this.mSessionImpl.setShuffleMode(i);
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        onAddQueueItem(mediaDescriptionCompat, Integer.MAX_VALUE);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onAddQueueItem(final MediaDescriptionCompat mediaDescriptionCompat, final int i) {
        if (mediaDescriptionCompat == null) {
            return;
        }
        dispatchSessionTask(SessionCommand.COMMAND_CODE_PLAYER_ADD_PLAYLIST_ITEM, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.18
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                String mediaId = mediaDescriptionCompat.getMediaId();
                if (TextUtils.isEmpty(mediaId)) {
                    Log.w(MediaSessionLegacyStub.TAG, "onAddQueueItem(): Media ID shouldn't be empty");
                } else {
                    MediaSessionLegacyStub.this.mSessionImpl.addPlaylistItem(i, MediaSessionLegacyStub.this.mSessionImpl.getCallback().onCreateMediaItem(MediaSessionLegacyStub.this.mSessionImpl.getInstance(), controllerInfo, mediaId));
                }
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onRemoveQueueItem(final MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat == null) {
            return;
        }
        dispatchSessionTask(SessionCommand.COMMAND_CODE_PLAYER_REMOVE_PLAYLIST_ITEM, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.19
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                String mediaId = mediaDescriptionCompat.getMediaId();
                if (TextUtils.isEmpty(mediaId)) {
                    Log.w(MediaSessionLegacyStub.TAG, "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                List<MediaItem> playlist = MediaSessionLegacyStub.this.mSessionImpl.getPlaylist();
                for (int i = 0; i < playlist.size(); i++) {
                    if (TextUtils.equals(playlist.get(i).getMediaId(), mediaId)) {
                        MediaSessionLegacyStub.this.mSessionImpl.removePlaylistItem(i);
                        return;
                    }
                }
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onRemoveQueueItemAt(final int i) {
        dispatchSessionTask(SessionCommand.COMMAND_CODE_PLAYER_REMOVE_PLAYLIST_ITEM, new SessionTask() { // from class: androidx.media2.session.MediaSessionLegacyStub.20
            @Override // androidx.media2.session.MediaSessionLegacyStub.SessionTask
            public void run(MediaSession.ControllerInfo controllerInfo) throws RemoteException {
                if (i < 0) {
                    Log.w(MediaSessionLegacyStub.TAG, "onRemoveQueueItem(): index shouldn't be negative");
                } else {
                    MediaSessionLegacyStub.this.mSessionImpl.removePlaylistItem(i);
                }
            }
        });
    }

    MediaSession.ControllerCb getControllerLegacyCbForBroadcast() {
        return this.mControllerLegacyCbForBroadcast;
    }

    ConnectedControllersManager<androidx.media.MediaSessionManager.RemoteUserInfo> getConnectedControllersManager() {
        return this.mConnectedControllersManager;
    }

    private void dispatchSessionTask(int i, SessionTask sessionTask) {
        dispatchSessionTaskInternal(null, i, sessionTask);
    }

    private void dispatchSessionTask(SessionCommand sessionCommand, SessionTask sessionTask) {
        dispatchSessionTaskInternal(sessionCommand, 0, sessionTask);
    }

    private void dispatchSessionTaskInternal(final SessionCommand sessionCommand, final int i, final SessionTask sessionTask) {
        if (this.mSessionImpl.isClosed()) {
            return;
        }
        final androidx.media.MediaSessionManager.RemoteUserInfo currentControllerInfo = this.mSessionCompat.getCurrentControllerInfo();
        if (currentControllerInfo == null) {
            Log.d(TAG, "RemoteUserInfo is null, ignoring command=" + sessionCommand + ", commandCode=" + i);
            return;
        }
        this.mSessionImpl.getCallbackExecutor().execute(new Runnable() { // from class: androidx.media2.session.MediaSessionLegacyStub.21
            @Override // java.lang.Runnable
            public void run() {
                if (MediaSessionLegacyStub.this.mSessionImpl.isClosed()) {
                    return;
                }
                MediaSession.ControllerInfo controller = MediaSessionLegacyStub.this.mConnectedControllersManager.getController(currentControllerInfo);
                if (controller == null) {
                    controller = new MediaSession.ControllerInfo(currentControllerInfo, -1, MediaSessionLegacyStub.this.mSessionManager.isTrustedForMediaControl(currentControllerInfo), MediaSessionLegacyStub.this.new ControllerLegacyCb(currentControllerInfo), null);
                    SessionCommandGroup sessionCommandGroupOnConnect = MediaSessionLegacyStub.this.mSessionImpl.getCallback().onConnect(MediaSessionLegacyStub.this.mSessionImpl.getInstance(), controller);
                    if (sessionCommandGroupOnConnect == null) {
                        try {
                            controller.getControllerCb().onDisconnected(0);
                            return;
                        } catch (RemoteException unused) {
                            return;
                        }
                    }
                    MediaSessionLegacyStub.this.mConnectedControllersManager.addController(controller.getRemoteUserInfo(), controller, sessionCommandGroupOnConnect);
                }
                MediaSessionLegacyStub.this.mConnectionTimeoutHandler.disconnectControllerAfterTimeout(controller, MediaSessionLegacyStub.this.mConnectionTimeoutMs);
                MediaSessionLegacyStub.this.handleTaskOnExecutor(controller, sessionCommand, i, sessionTask);
            }
        });
    }

    void handleTaskOnExecutor(MediaSession.ControllerInfo controllerInfo, SessionCommand sessionCommand, int i, SessionTask sessionTask) {
        SessionCommand sessionCommand2;
        if (sessionCommand != null) {
            if (!this.mConnectedControllersManager.isAllowedCommand(controllerInfo, sessionCommand)) {
                return;
            } else {
                sessionCommand2 = sCommandsForOnCommandRequest.get(sessionCommand.getCommandCode());
            }
        } else if (!this.mConnectedControllersManager.isAllowedCommand(controllerInfo, i)) {
            return;
        } else {
            sessionCommand2 = sCommandsForOnCommandRequest.get(i);
        }
        if (sessionCommand2 != null && this.mSessionImpl.getCallback().onCommandRequest(this.mSessionImpl.getInstance(), controllerInfo, sessionCommand2) != 0) {
            if (DEBUG) {
                Log.d(TAG, "Command (" + sessionCommand2 + ") from " + controllerInfo + " was rejected by " + this.mSessionImpl);
                return;
            }
            return;
        }
        try {
            sessionTask.run(controllerInfo);
        } catch (RemoteException e) {
            Log.w(TAG, "Exception in " + controllerInfo, e);
        }
    }

    public void setLegacyControllerDisconnectTimeoutMs(long j) {
        this.mConnectionTimeoutMs = j;
    }

    static VolumeProviderCompat createVolumeProviderCompat(final RemoteSessionPlayer remoteSessionPlayer) {
        return new VolumeProviderCompat(remoteSessionPlayer.getVolumeControlType(), remoteSessionPlayer.getMaxVolume(), remoteSessionPlayer.getVolume()) { // from class: androidx.media2.session.MediaSessionLegacyStub.22
            @Override // androidx.media.VolumeProviderCompat
            public void onSetVolumeTo(int i) {
                remoteSessionPlayer.setVolume(i);
            }

            @Override // androidx.media.VolumeProviderCompat
            public void onAdjustVolume(int i) {
                remoteSessionPlayer.adjustVolume(i);
            }
        };
    }

    static int getRatingType(Rating rating) {
        if (rating instanceof HeartRating) {
            return 1;
        }
        if (rating instanceof ThumbRating) {
            return 2;
        }
        if (!(rating instanceof StarRating)) {
            return rating instanceof PercentageRating ? 6 : 0;
        }
        int maxStars = ((StarRating) rating).getMaxStars();
        int i = 3;
        if (maxStars != 3) {
            i = 4;
            if (maxStars != 4) {
                i = 5;
                if (maxStars != 5) {
                    return 0;
                }
            }
        }
        return i;
    }

    final class ControllerLegacyCb extends MediaSession.ControllerCb {
        private final androidx.media.MediaSessionManager.RemoteUserInfo mRemoteUserInfo;

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onAllowedCommandsChanged(int i, SessionCommandGroup sessionCommandGroup) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onChildrenChanged(int i, String str, int i2, MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onDisconnected(int i) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onLibraryResult(int i, LibraryResult libraryResult) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlayerChanged(int i, SessionPlayer sessionPlayer, MediaController.PlaybackInfo playbackInfo, SessionPlayer sessionPlayer2, MediaController.PlaybackInfo playbackInfo2) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlayerResult(int i, SessionPlayer.PlayerResult playerResult) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onSearchResultChanged(int i, String str, int i2, MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onSessionResult(int i, SessionResult sessionResult) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onSubtitleData(int i, MediaItem mediaItem, SessionPlayer.TrackInfo trackInfo, SubtitleData subtitleData) {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onTrackDeselected(int i, SessionPlayer.TrackInfo trackInfo) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onTrackSelected(int i, SessionPlayer.TrackInfo trackInfo) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onTracksChanged(int i, List<SessionPlayer.TrackInfo> list, SessionPlayer.TrackInfo trackInfo, SessionPlayer.TrackInfo trackInfo2, SessionPlayer.TrackInfo trackInfo3, SessionPlayer.TrackInfo trackInfo4) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onVideoSizeChanged(int i, VideoSize videoSize) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void sendCustomCommand(int i, SessionCommand sessionCommand, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void setCustomLayout(int i, List<MediaSession.CommandButton> list) throws RemoteException {
        }

        ControllerLegacyCb(androidx.media.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.mRemoteUserInfo = remoteUserInfo;
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlaybackInfoChanged(int i, MediaController.PlaybackInfo playbackInfo) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlayerStateChanged(int i, long j, long j2, int i2) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlaybackSpeedChanged(int i, long j, long j2, float f) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onBufferingStateChanged(int i, MediaItem mediaItem, int i2, long j, long j2, long j3) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onSeekCompleted(int i, long j, long j2, long j3) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onCurrentMediaItemChanged(int i, MediaItem mediaItem, int i2, int i3, int i4) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlaylistChanged(int i, List<MediaItem> list, MediaMetadata mediaMetadata, int i2, int i3, int i4) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlaylistMetadataChanged(int i, MediaMetadata mediaMetadata) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onShuffleModeChanged(int i, int i2, int i3, int i4, int i5) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onRepeatModeChanged(int i, int i2, int i3, int i4, int i5) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlaybackCompleted(int i) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.mRemoteUserInfo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != ControllerLegacyCb.class) {
                return false;
            }
            return ObjectsCompat.equals(this.mRemoteUserInfo, ((ControllerLegacyCb) obj).mRemoteUserInfo);
        }
    }

    final class ControllerLegacyCbForBroadcast extends MediaSession.ControllerCb {
        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onChildrenChanged(int i, String str, int i2, MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onDisconnected(int i) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onLibraryResult(int i, LibraryResult libraryResult) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlayerResult(int i, SessionPlayer.PlayerResult playerResult) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onSearchResultChanged(int i, String str, int i2, MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onSessionResult(int i, SessionResult sessionResult) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onSubtitleData(int i, MediaItem mediaItem, SessionPlayer.TrackInfo trackInfo, SubtitleData subtitleData) {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onTrackDeselected(int i, SessionPlayer.TrackInfo trackInfo) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onTrackSelected(int i, SessionPlayer.TrackInfo trackInfo) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onTracksChanged(int i, List<SessionPlayer.TrackInfo> list, SessionPlayer.TrackInfo trackInfo, SessionPlayer.TrackInfo trackInfo2, SessionPlayer.TrackInfo trackInfo3, SessionPlayer.TrackInfo trackInfo4) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onVideoSizeChanged(int i, VideoSize videoSize) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void sendCustomCommand(int i, SessionCommand sessionCommand, Bundle bundle) throws RemoteException {
        }

        ControllerLegacyCbForBroadcast() {
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlayerChanged(int i, SessionPlayer sessionPlayer, MediaController.PlaybackInfo playbackInfo, SessionPlayer sessionPlayer2, MediaController.PlaybackInfo playbackInfo2) throws RemoteException {
            if (sessionPlayer == null || !ObjectsCompat.equals(sessionPlayer.getPlaylist(), sessionPlayer2.getPlaylist())) {
                onPlaylistChanged(i, sessionPlayer2.getPlaylist(), sessionPlayer2.getPlaylistMetadata(), sessionPlayer2.getCurrentMediaItemIndex(), sessionPlayer2.getPreviousMediaItemIndex(), sessionPlayer2.getNextMediaItemIndex());
            } else if (sessionPlayer == null || !ObjectsCompat.equals(sessionPlayer.getPlaylistMetadata(), sessionPlayer2.getPlaylistMetadata())) {
                onPlaylistMetadataChanged(i, sessionPlayer2.getPlaylistMetadata());
            }
            if (sessionPlayer == null || sessionPlayer.getShuffleMode() != sessionPlayer2.getShuffleMode()) {
                onShuffleModeChanged(i, sessionPlayer2.getShuffleMode(), sessionPlayer2.getCurrentMediaItemIndex(), sessionPlayer2.getPreviousMediaItemIndex(), sessionPlayer2.getNextMediaItemIndex());
            }
            if (sessionPlayer == null || sessionPlayer.getRepeatMode() != sessionPlayer2.getRepeatMode()) {
                onRepeatModeChanged(i, sessionPlayer2.getRepeatMode(), sessionPlayer2.getCurrentMediaItemIndex(), sessionPlayer2.getPreviousMediaItemIndex(), sessionPlayer2.getNextMediaItemIndex());
            }
            if (sessionPlayer == null || !ObjectsCompat.equals(sessionPlayer.getCurrentMediaItem(), sessionPlayer2.getCurrentMediaItem())) {
                onCurrentMediaItemChanged(i, sessionPlayer2.getCurrentMediaItem(), sessionPlayer2.getCurrentMediaItemIndex(), sessionPlayer2.getPreviousMediaItemIndex(), sessionPlayer2.getNextMediaItemIndex());
            } else {
                MediaSessionLegacyStub.this.mSessionCompat.setPlaybackState(MediaSessionLegacyStub.this.mSessionImpl.createPlaybackStateCompat());
            }
            onPlaybackInfoChanged(i, playbackInfo2);
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void setCustomLayout(int i, List<MediaSession.CommandButton> list) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlaybackInfoChanged(int i, MediaController.PlaybackInfo playbackInfo) throws RemoteException {
            if (playbackInfo.getPlaybackType() == 2) {
                MediaSessionLegacyStub.this.mSessionCompat.setPlaybackToRemote(MediaSessionLegacyStub.createVolumeProviderCompat((RemoteSessionPlayer) MediaSessionLegacyStub.this.mSessionImpl.getPlayer()));
            } else {
                MediaSessionLegacyStub.this.mSessionCompat.setPlaybackToLocal(MediaUtils.getLegacyStreamType(playbackInfo.getAudioAttributes()));
            }
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onAllowedCommandsChanged(int i, SessionCommandGroup sessionCommandGroup) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlayerStateChanged(int i, long j, long j2, int i2) throws RemoteException {
            MediaSessionLegacyStub.this.mSessionCompat.setPlaybackState(MediaSessionLegacyStub.this.mSessionImpl.createPlaybackStateCompat());
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlaybackSpeedChanged(int i, long j, long j2, float f) throws RemoteException {
            MediaSessionLegacyStub.this.mSessionCompat.setPlaybackState(MediaSessionLegacyStub.this.mSessionImpl.createPlaybackStateCompat());
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onBufferingStateChanged(int i, MediaItem mediaItem, int i2, long j, long j2, long j3) throws RemoteException {
            MediaSessionLegacyStub.this.mSessionCompat.setPlaybackState(MediaSessionLegacyStub.this.mSessionImpl.createPlaybackStateCompat());
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onSeekCompleted(int i, long j, long j2, long j3) throws RemoteException {
            MediaSessionLegacyStub.this.mSessionCompat.setPlaybackState(MediaSessionLegacyStub.this.mSessionImpl.createPlaybackStateCompat());
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onCurrentMediaItemChanged(int i, MediaItem mediaItem, int i2, int i3, int i4) throws RemoteException {
            MediaMetadata metadata = mediaItem == null ? null : mediaItem.getMetadata();
            MediaSessionLegacyStub.this.mSessionCompat.setMetadata(MediaUtils.convertToMediaMetadataCompat(metadata));
            MediaSessionLegacyStub.this.mSessionCompat.setRatingType(MediaSessionLegacyStub.getRatingType(metadata != null ? metadata.getRating("android.media.metadata.USER_RATING") : null));
            MediaSessionLegacyStub.this.mSessionCompat.setPlaybackState(MediaSessionLegacyStub.this.mSessionImpl.createPlaybackStateCompat());
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlaylistChanged(int i, List<MediaItem> list, MediaMetadata mediaMetadata, int i2, int i3, int i4) throws RemoteException {
            MediaSessionLegacyStub.this.mSessionCompat.setQueue(MediaUtils.convertToQueueItemList(list));
            onPlaylistMetadataChanged(i, mediaMetadata);
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlaylistMetadataChanged(int i, MediaMetadata mediaMetadata) throws RemoteException {
            CharSequence text;
            CharSequence queueTitle = MediaSessionLegacyStub.this.mSessionCompat.getController().getQueueTitle();
            if (mediaMetadata != null) {
                text = mediaMetadata.getText("android.media.metadata.DISPLAY_TITLE");
                if (text == null) {
                    text = mediaMetadata.getText("android.media.metadata.TITLE");
                }
            } else {
                text = null;
            }
            if (TextUtils.equals(queueTitle, text)) {
                return;
            }
            MediaSessionLegacyStub.this.mSessionCompat.setQueueTitle(text);
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onShuffleModeChanged(int i, int i2, int i3, int i4, int i5) throws RemoteException {
            MediaSessionLegacyStub.this.mSessionCompat.setShuffleMode(i2);
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onRepeatModeChanged(int i, int i2, int i3, int i4, int i5) throws RemoteException {
            MediaSessionLegacyStub.this.mSessionCompat.setRepeatMode(i2);
        }

        @Override // androidx.media2.session.MediaSession.ControllerCb
        void onPlaybackCompleted(int i) throws RemoteException {
            PlaybackStateCompat playbackStateCompatCreatePlaybackStateCompat = MediaSessionLegacyStub.this.mSessionImpl.createPlaybackStateCompat();
            if (playbackStateCompatCreatePlaybackStateCompat.getState() != 2) {
                playbackStateCompatCreatePlaybackStateCompat = new PlaybackStateCompat.Builder(playbackStateCompatCreatePlaybackStateCompat).setState(2, playbackStateCompatCreatePlaybackStateCompat.getPosition(), playbackStateCompatCreatePlaybackStateCompat.getPlaybackSpeed()).build();
            }
            MediaSessionLegacyStub.this.mSessionCompat.setPlaybackState(playbackStateCompatCreatePlaybackStateCompat);
        }
    }

    private class ConnectionTimeoutHandler extends Handler {
        private static final int MSG_CONNECTION_TIMED_OUT = 1001;

        ConnectionTimeoutHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MediaSession.ControllerInfo controllerInfo = (MediaSession.ControllerInfo) message.obj;
            if (MediaSessionLegacyStub.this.mConnectedControllersManager.isConnected(controllerInfo)) {
                try {
                    controllerInfo.getControllerCb().onDisconnected(0);
                } catch (RemoteException unused) {
                }
                MediaSessionLegacyStub.this.mConnectedControllersManager.removeController(controllerInfo);
            }
        }

        public void disconnectControllerAfterTimeout(MediaSession.ControllerInfo controllerInfo, long j) {
            removeMessages(1001, controllerInfo);
            sendMessageDelayed(obtainMessage(1001, controllerInfo), j);
        }
    }
}
