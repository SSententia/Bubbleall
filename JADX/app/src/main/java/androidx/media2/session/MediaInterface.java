package androidx.media2.session;

import android.view.Surface;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.VideoSize;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class MediaInterface {

    interface SessionPlaybackControl {
        long getBufferedPosition();

        int getBufferingState();

        long getCurrentPosition();

        long getDuration();

        float getPlaybackSpeed();

        int getPlayerState();

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> pause();

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> play();

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> prepare();

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> seekTo(long j);

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> setPlaybackSpeed(float f);
    }

    interface SessionPlayer extends SessionPlaybackControl, SessionPlaylistControl {
        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> deselectTrack(androidx.media2.common.SessionPlayer.TrackInfo trackInfo);

        androidx.media2.common.SessionPlayer.TrackInfo getSelectedTrack(int i);

        List<androidx.media2.common.SessionPlayer.TrackInfo> getTracks();

        VideoSize getVideoSize();

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> selectTrack(androidx.media2.common.SessionPlayer.TrackInfo trackInfo);

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> setSurface(Surface surface);
    }

    interface SessionPlaylistControl {
        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> addPlaylistItem(int i, MediaItem mediaItem);

        MediaItem getCurrentMediaItem();

        int getCurrentMediaItemIndex();

        int getNextMediaItemIndex();

        List<MediaItem> getPlaylist();

        MediaMetadata getPlaylistMetadata();

        int getPreviousMediaItemIndex();

        int getRepeatMode();

        int getShuffleMode();

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> movePlaylistItem(int i, int i2);

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> removePlaylistItem(int i);

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> replacePlaylistItem(int i, MediaItem mediaItem);

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> setMediaItem(MediaItem mediaItem);

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> setPlaylist(List<MediaItem> list, MediaMetadata mediaMetadata);

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> setRepeatMode(int i);

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> setShuffleMode(int i);

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> skipToNextItem();

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> skipToPlaylistItem(int i);

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> skipToPreviousItem();

        ListenableFuture<androidx.media2.common.SessionPlayer.PlayerResult> updatePlaylistMetadata(MediaMetadata mediaMetadata);
    }

    private MediaInterface() {
    }
}
