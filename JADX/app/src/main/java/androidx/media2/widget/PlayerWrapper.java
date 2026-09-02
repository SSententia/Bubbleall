package androidx.media2.widget;

import android.view.Surface;
import androidx.core.util.ObjectsCompat;
import androidx.media2.common.BaseResult;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.VideoSize;
import androidx.media2.session.MediaController;
import androidx.media2.session.SessionCommand;
import androidx.media2.session.SessionCommandGroup;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class PlayerWrapper {
    private final SessionCommandGroup mAllCommands;
    SessionCommandGroup mAllowedCommands;
    private boolean mCallbackAttached;
    private final Executor mCallbackExecutor;
    final MediaController mController;
    private final MediaControllerCallback mControllerCallback;
    MediaMetadata mMediaMetadata;
    final SessionPlayer mPlayer;
    private final SessionPlayerCallback mPlayerCallback;
    int mSavedPlayerState = 0;
    final PlayerCallback mWrapperCallback;

    PlayerWrapper(MediaController mediaController, Executor executor, PlayerCallback playerCallback) {
        if (mediaController == null) {
            throw new NullPointerException("controller must not be null");
        }
        if (executor == null) {
            throw new NullPointerException("executor must not be null");
        }
        if (playerCallback == null) {
            throw new NullPointerException("callback must not be null");
        }
        this.mController = mediaController;
        this.mCallbackExecutor = executor;
        this.mWrapperCallback = playerCallback;
        this.mControllerCallback = new MediaControllerCallback();
        this.mPlayer = null;
        this.mPlayerCallback = null;
        this.mAllCommands = null;
    }

    PlayerWrapper(SessionPlayer sessionPlayer, Executor executor, PlayerCallback playerCallback) {
        if (sessionPlayer == null) {
            throw new NullPointerException("player must not be null");
        }
        if (executor == null) {
            throw new NullPointerException("executor must not be null");
        }
        if (playerCallback == null) {
            throw new NullPointerException("callback must not be null");
        }
        this.mPlayer = sessionPlayer;
        this.mCallbackExecutor = executor;
        this.mWrapperCallback = playerCallback;
        this.mPlayerCallback = new SessionPlayerCallback();
        this.mController = null;
        this.mControllerCallback = null;
        this.mAllCommands = new SessionCommandGroup.Builder().addAllPredefinedCommands(1).build();
    }

    boolean hasDisconnectedController() {
        MediaController mediaController = this.mController;
        return (mediaController == null || mediaController.isConnected()) ? false : true;
    }

    void attachCallback() {
        if (this.mCallbackAttached) {
            return;
        }
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            mediaController.registerExtraCallback(this.mCallbackExecutor, this.mControllerCallback);
        } else {
            SessionPlayer sessionPlayer = this.mPlayer;
            if (sessionPlayer != null) {
                sessionPlayer.registerPlayerCallback(this.mCallbackExecutor, this.mPlayerCallback);
            }
        }
        updateAndNotifyCachedStates();
        this.mCallbackAttached = true;
    }

    void detachCallback() {
        if (this.mCallbackAttached) {
            MediaController mediaController = this.mController;
            if (mediaController != null) {
                mediaController.unregisterExtraCallback(this.mControllerCallback);
            } else {
                SessionPlayer sessionPlayer = this.mPlayer;
                if (sessionPlayer != null) {
                    sessionPlayer.unregisterPlayerCallback(this.mPlayerCallback);
                }
            }
            this.mCallbackAttached = false;
        }
    }

    boolean isPlaying() {
        return this.mSavedPlayerState == 2;
    }

    long getCurrentPosition() {
        long currentPosition;
        if (this.mSavedPlayerState == 0) {
            return 0L;
        }
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            currentPosition = mediaController.getCurrentPosition();
        } else {
            SessionPlayer sessionPlayer = this.mPlayer;
            currentPosition = sessionPlayer != null ? sessionPlayer.getCurrentPosition() : 0L;
        }
        if (currentPosition < 0) {
            return 0L;
        }
        return currentPosition;
    }

    long getBufferPercentage() {
        long bufferedPosition;
        if (this.mSavedPlayerState == 0) {
            return 0L;
        }
        long durationMs = getDurationMs();
        if (durationMs == 0) {
            return 0L;
        }
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            bufferedPosition = mediaController.getBufferedPosition();
        } else {
            SessionPlayer sessionPlayer = this.mPlayer;
            bufferedPosition = sessionPlayer != null ? sessionPlayer.getBufferedPosition() : 0L;
        }
        if (bufferedPosition < 0) {
            return 0L;
        }
        return (bufferedPosition * 100) / durationMs;
    }

    int getPlayerState() {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            return mediaController.getPlayerState();
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            return sessionPlayer.getPlayerState();
        }
        return 0;
    }

    boolean canPause() {
        SessionCommandGroup sessionCommandGroup = this.mAllowedCommands;
        return sessionCommandGroup != null && sessionCommandGroup.hasCommand(SessionCommand.COMMAND_CODE_PLAYER_PAUSE);
    }

    boolean canSeekBackward() {
        SessionCommandGroup sessionCommandGroup = this.mAllowedCommands;
        return sessionCommandGroup != null && sessionCommandGroup.hasCommand(SessionCommand.COMMAND_CODE_SESSION_REWIND);
    }

    boolean canSeekForward() {
        SessionCommandGroup sessionCommandGroup = this.mAllowedCommands;
        return sessionCommandGroup != null && sessionCommandGroup.hasCommand(SessionCommand.COMMAND_CODE_SESSION_FAST_FORWARD);
    }

    boolean canSkipToNext() {
        SessionCommandGroup sessionCommandGroup = this.mAllowedCommands;
        return sessionCommandGroup != null && sessionCommandGroup.hasCommand(SessionCommand.COMMAND_CODE_PLAYER_SKIP_TO_NEXT_PLAYLIST_ITEM);
    }

    boolean canSkipToPrevious() {
        SessionCommandGroup sessionCommandGroup = this.mAllowedCommands;
        return sessionCommandGroup != null && sessionCommandGroup.hasCommand(SessionCommand.COMMAND_CODE_PLAYER_SKIP_TO_PREVIOUS_PLAYLIST_ITEM);
    }

    boolean canSeekTo() {
        SessionCommandGroup sessionCommandGroup = this.mAllowedCommands;
        return sessionCommandGroup != null && sessionCommandGroup.hasCommand(SessionCommand.COMMAND_CODE_PLAYER_SEEK_TO);
    }

    boolean canSelectDeselectTrack() {
        SessionCommandGroup sessionCommandGroup = this.mAllowedCommands;
        return sessionCommandGroup != null && sessionCommandGroup.hasCommand(SessionCommand.COMMAND_CODE_PLAYER_SELECT_TRACK) && this.mAllowedCommands.hasCommand(SessionCommand.COMMAND_CODE_PLAYER_DESELECT_TRACK);
    }

    void pause() {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            mediaController.pause();
            return;
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            sessionPlayer.pause();
        }
    }

    void play() {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            mediaController.play();
            return;
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            sessionPlayer.play();
        }
    }

    void seekTo(long j) {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            mediaController.seekTo(j);
            return;
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            sessionPlayer.seekTo(j);
        }
    }

    void skipToNextItem() {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            mediaController.skipToNextPlaylistItem();
            return;
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            sessionPlayer.skipToNextPlaylistItem();
        }
    }

    void skipToPreviousItem() {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            mediaController.skipToPreviousPlaylistItem();
            return;
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            sessionPlayer.skipToPreviousPlaylistItem();
        }
    }

    private float getPlaybackSpeed() {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            return mediaController.getPlaybackSpeed();
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            return sessionPlayer.getPlaybackSpeed();
        }
        return 1.0f;
    }

    void setPlaybackSpeed(float f) {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            mediaController.setPlaybackSpeed(f);
            return;
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            sessionPlayer.setPlaybackSpeed(f);
        }
    }

    void selectTrack(SessionPlayer.TrackInfo trackInfo) {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            mediaController.selectTrack(trackInfo);
            return;
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            sessionPlayer.selectTrack(trackInfo);
        }
    }

    void deselectTrack(SessionPlayer.TrackInfo trackInfo) {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            mediaController.deselectTrack(trackInfo);
            return;
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            sessionPlayer.deselectTrack(trackInfo);
        }
    }

    long getDurationMs() {
        long duration;
        if (this.mSavedPlayerState == 0) {
            return 0L;
        }
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            duration = mediaController.getDuration();
        } else {
            SessionPlayer sessionPlayer = this.mPlayer;
            duration = sessionPlayer != null ? sessionPlayer.getDuration() : 0L;
        }
        if (duration < 0) {
            return 0L;
        }
        return duration;
    }

    CharSequence getTitle() {
        MediaMetadata mediaMetadata = this.mMediaMetadata;
        if (mediaMetadata == null || !mediaMetadata.containsKey("android.media.metadata.TITLE")) {
            return null;
        }
        return this.mMediaMetadata.getText("android.media.metadata.TITLE");
    }

    CharSequence getArtistText() {
        MediaMetadata mediaMetadata = this.mMediaMetadata;
        if (mediaMetadata == null || !mediaMetadata.containsKey("android.media.metadata.ARTIST")) {
            return null;
        }
        return this.mMediaMetadata.getText("android.media.metadata.ARTIST");
    }

    MediaItem getCurrentMediaItem() {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            return mediaController.getCurrentMediaItem();
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            return sessionPlayer.getCurrentMediaItem();
        }
        return null;
    }

    private SessionCommandGroup getAllowedCommands() {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            return mediaController.getAllowedCommands();
        }
        if (this.mPlayer != null) {
            return this.mAllCommands;
        }
        return null;
    }

    void updateAndNotifyCachedStates() {
        boolean z;
        int playerState = getPlayerState();
        boolean z2 = true;
        if (this.mSavedPlayerState != playerState) {
            this.mSavedPlayerState = playerState;
            z = true;
        } else {
            z = false;
        }
        SessionCommandGroup allowedCommands = getAllowedCommands();
        if (ObjectsCompat.equals(this.mAllowedCommands, allowedCommands)) {
            z2 = false;
        } else {
            this.mAllowedCommands = allowedCommands;
        }
        MediaItem currentMediaItem = getCurrentMediaItem();
        this.mMediaMetadata = currentMediaItem == null ? null : currentMediaItem.getMetadata();
        if (z) {
            this.mWrapperCallback.onPlayerStateChanged(this, playerState);
        }
        if (allowedCommands != null && z2) {
            this.mWrapperCallback.onAllowedCommandsChanged(this, allowedCommands);
        }
        this.mWrapperCallback.onCurrentMediaItemChanged(this, currentMediaItem);
        notifyNonCachedStates();
    }

    VideoSize getVideoSize() {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            return mediaController.getVideoSize();
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            return sessionPlayer.getVideoSize();
        }
        return new VideoSize(0, 0);
    }

    List<SessionPlayer.TrackInfo> getTracks() {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            return mediaController.getTracks();
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            return sessionPlayer.getTracks();
        }
        return Collections.emptyList();
    }

    SessionPlayer.TrackInfo getSelectedTrack(int i) {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            return mediaController.getSelectedTrack(i);
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            return sessionPlayer.getSelectedTrack(i);
        }
        return null;
    }

    ListenableFuture<? extends BaseResult> setSurface(Surface surface) {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            return mediaController.setSurface(surface);
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            return sessionPlayer.setSurface(surface);
        }
        return null;
    }

    int getCurrentMediaItemIndex() {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            return mediaController.getCurrentMediaItemIndex();
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            return sessionPlayer.getCurrentMediaItemIndex();
        }
        return -1;
    }

    int getPreviousMediaItemIndex() {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            return mediaController.getPreviousMediaItemIndex();
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            return sessionPlayer.getPreviousMediaItemIndex();
        }
        return -1;
    }

    int getNextMediaItemIndex() {
        MediaController mediaController = this.mController;
        if (mediaController != null) {
            return mediaController.getNextMediaItemIndex();
        }
        SessionPlayer sessionPlayer = this.mPlayer;
        if (sessionPlayer != null) {
            return sessionPlayer.getNextMediaItemIndex();
        }
        return -1;
    }

    private class MediaControllerCallback extends MediaController.ControllerCallback {
        MediaControllerCallback() {
        }

        @Override // androidx.media2.session.MediaController.ControllerCallback
        public void onConnected(MediaController mediaController, SessionCommandGroup sessionCommandGroup) {
            PlayerWrapper.this.mWrapperCallback.onConnected(PlayerWrapper.this);
            PlayerWrapper.this.updateAndNotifyCachedStates();
        }

        @Override // androidx.media2.session.MediaController.ControllerCallback
        public void onAllowedCommandsChanged(MediaController mediaController, SessionCommandGroup sessionCommandGroup) {
            if (ObjectsCompat.equals(PlayerWrapper.this.mAllowedCommands, sessionCommandGroup)) {
                return;
            }
            PlayerWrapper.this.mAllowedCommands = sessionCommandGroup;
            PlayerWrapper.this.mWrapperCallback.onAllowedCommandsChanged(PlayerWrapper.this, sessionCommandGroup);
        }

        @Override // androidx.media2.session.MediaController.ControllerCallback
        public void onPlayerStateChanged(MediaController mediaController, int i) {
            if (PlayerWrapper.this.mSavedPlayerState == i) {
                return;
            }
            PlayerWrapper.this.mSavedPlayerState = i;
            PlayerWrapper.this.mWrapperCallback.onPlayerStateChanged(PlayerWrapper.this, i);
        }

        @Override // androidx.media2.session.MediaController.ControllerCallback
        public void onPlaybackSpeedChanged(MediaController mediaController, float f) {
            PlayerWrapper.this.mWrapperCallback.onPlaybackSpeedChanged(PlayerWrapper.this, f);
        }

        @Override // androidx.media2.session.MediaController.ControllerCallback
        public void onSeekCompleted(MediaController mediaController, long j) {
            PlayerWrapper.this.mWrapperCallback.onSeekCompleted(PlayerWrapper.this, j);
        }

        @Override // androidx.media2.session.MediaController.ControllerCallback
        public void onCurrentMediaItemChanged(MediaController mediaController, MediaItem mediaItem) {
            PlayerWrapper.this.mMediaMetadata = mediaItem == null ? null : mediaItem.getMetadata();
            PlayerWrapper.this.mWrapperCallback.onCurrentMediaItemChanged(PlayerWrapper.this, mediaItem);
        }

        @Override // androidx.media2.session.MediaController.ControllerCallback
        public void onPlaylistChanged(MediaController mediaController, List<MediaItem> list, MediaMetadata mediaMetadata) {
            PlayerWrapper.this.mWrapperCallback.onPlaylistChanged(PlayerWrapper.this, list, mediaMetadata);
        }

        @Override // androidx.media2.session.MediaController.ControllerCallback
        public void onPlaybackCompleted(MediaController mediaController) {
            PlayerWrapper.this.mWrapperCallback.onPlaybackCompleted(PlayerWrapper.this);
        }

        @Override // androidx.media2.session.MediaController.ControllerCallback
        public void onVideoSizeChanged(MediaController mediaController, VideoSize videoSize) {
            PlayerWrapper.this.mWrapperCallback.onVideoSizeChanged(PlayerWrapper.this, videoSize);
        }

        @Override // androidx.media2.session.MediaController.ControllerCallback
        public void onSubtitleData(MediaController mediaController, MediaItem mediaItem, SessionPlayer.TrackInfo trackInfo, SubtitleData subtitleData) {
            PlayerWrapper.this.mWrapperCallback.onSubtitleData(PlayerWrapper.this, mediaItem, trackInfo, subtitleData);
        }

        @Override // androidx.media2.session.MediaController.ControllerCallback
        public void onTracksChanged(MediaController mediaController, List<SessionPlayer.TrackInfo> list) {
            PlayerWrapper.this.mWrapperCallback.onTracksChanged(PlayerWrapper.this, list);
        }

        @Override // androidx.media2.session.MediaController.ControllerCallback
        public void onTrackSelected(MediaController mediaController, SessionPlayer.TrackInfo trackInfo) {
            PlayerWrapper.this.mWrapperCallback.onTrackSelected(PlayerWrapper.this, trackInfo);
        }

        @Override // androidx.media2.session.MediaController.ControllerCallback
        public void onTrackDeselected(MediaController mediaController, SessionPlayer.TrackInfo trackInfo) {
            PlayerWrapper.this.mWrapperCallback.onTrackDeselected(PlayerWrapper.this, trackInfo);
        }
    }

    private void notifyNonCachedStates() {
        this.mWrapperCallback.onPlaybackSpeedChanged(this, getPlaybackSpeed());
        List<SessionPlayer.TrackInfo> tracks = getTracks();
        if (tracks != null) {
            this.mWrapperCallback.onTracksChanged(this, tracks);
        }
        if (getCurrentMediaItem() != null) {
            this.mWrapperCallback.onVideoSizeChanged(this, getVideoSize());
        }
    }

    private class SessionPlayerCallback extends SessionPlayer.PlayerCallback {
        SessionPlayerCallback() {
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onPlayerStateChanged(SessionPlayer sessionPlayer, int i) {
            if (PlayerWrapper.this.mSavedPlayerState == i) {
                return;
            }
            PlayerWrapper.this.mSavedPlayerState = i;
            PlayerWrapper.this.mWrapperCallback.onPlayerStateChanged(PlayerWrapper.this, i);
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onPlaybackSpeedChanged(SessionPlayer sessionPlayer, float f) {
            PlayerWrapper.this.mWrapperCallback.onPlaybackSpeedChanged(PlayerWrapper.this, f);
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onSeekCompleted(SessionPlayer sessionPlayer, long j) {
            PlayerWrapper.this.mWrapperCallback.onSeekCompleted(PlayerWrapper.this, j);
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onCurrentMediaItemChanged(SessionPlayer sessionPlayer, MediaItem mediaItem) {
            PlayerWrapper.this.mMediaMetadata = mediaItem == null ? null : mediaItem.getMetadata();
            PlayerWrapper.this.mWrapperCallback.onCurrentMediaItemChanged(PlayerWrapper.this, mediaItem);
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onPlaylistChanged(SessionPlayer sessionPlayer, List<MediaItem> list, MediaMetadata mediaMetadata) {
            PlayerWrapper.this.mWrapperCallback.onPlaylistChanged(PlayerWrapper.this, list, mediaMetadata);
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onPlaybackCompleted(SessionPlayer sessionPlayer) {
            PlayerWrapper.this.mWrapperCallback.onPlaybackCompleted(PlayerWrapper.this);
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onVideoSizeChanged(SessionPlayer sessionPlayer, VideoSize videoSize) {
            PlayerWrapper.this.mWrapperCallback.onVideoSizeChanged(PlayerWrapper.this, videoSize);
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onSubtitleData(SessionPlayer sessionPlayer, MediaItem mediaItem, SessionPlayer.TrackInfo trackInfo, SubtitleData subtitleData) {
            PlayerWrapper.this.mWrapperCallback.onSubtitleData(PlayerWrapper.this, mediaItem, trackInfo, subtitleData);
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onTracksChanged(SessionPlayer sessionPlayer, List<SessionPlayer.TrackInfo> list) {
            PlayerWrapper.this.mWrapperCallback.onTracksChanged(PlayerWrapper.this, list);
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onTrackSelected(SessionPlayer sessionPlayer, SessionPlayer.TrackInfo trackInfo) {
            PlayerWrapper.this.mWrapperCallback.onTrackSelected(PlayerWrapper.this, trackInfo);
        }

        @Override // androidx.media2.common.SessionPlayer.PlayerCallback
        public void onTrackDeselected(SessionPlayer sessionPlayer, SessionPlayer.TrackInfo trackInfo) {
            PlayerWrapper.this.mWrapperCallback.onTrackDeselected(PlayerWrapper.this, trackInfo);
        }
    }

    static abstract class PlayerCallback {
        void onAllowedCommandsChanged(PlayerWrapper playerWrapper, SessionCommandGroup sessionCommandGroup) {
        }

        void onConnected(PlayerWrapper playerWrapper) {
        }

        void onCurrentMediaItemChanged(PlayerWrapper playerWrapper, MediaItem mediaItem) {
        }

        void onPlaybackCompleted(PlayerWrapper playerWrapper) {
        }

        void onPlaybackSpeedChanged(PlayerWrapper playerWrapper, float f) {
        }

        void onPlayerStateChanged(PlayerWrapper playerWrapper, int i) {
        }

        void onPlaylistChanged(PlayerWrapper playerWrapper, List<MediaItem> list, MediaMetadata mediaMetadata) {
        }

        void onSeekCompleted(PlayerWrapper playerWrapper, long j) {
        }

        void onSubtitleData(PlayerWrapper playerWrapper, MediaItem mediaItem, SessionPlayer.TrackInfo trackInfo, SubtitleData subtitleData) {
        }

        void onTrackDeselected(PlayerWrapper playerWrapper, SessionPlayer.TrackInfo trackInfo) {
        }

        void onTrackSelected(PlayerWrapper playerWrapper, SessionPlayer.TrackInfo trackInfo) {
        }

        void onTracksChanged(PlayerWrapper playerWrapper, List<SessionPlayer.TrackInfo> list) {
        }

        void onVideoSizeChanged(PlayerWrapper playerWrapper, VideoSize videoSize) {
        }

        PlayerCallback() {
        }
    }
}
