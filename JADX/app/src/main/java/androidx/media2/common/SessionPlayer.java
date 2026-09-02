package androidx.media2.common;

import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.util.Pair;
import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class SessionPlayer implements Closeable {
    public static final int BUFFERING_STATE_BUFFERING_AND_PLAYABLE = 1;
    public static final int BUFFERING_STATE_BUFFERING_AND_STARVED = 2;
    public static final int BUFFERING_STATE_COMPLETE = 3;
    public static final int BUFFERING_STATE_UNKNOWN = 0;
    public static final int INVALID_ITEM_INDEX = -1;
    public static final int PLAYER_STATE_ERROR = 3;
    public static final int PLAYER_STATE_IDLE = 0;
    public static final int PLAYER_STATE_PAUSED = 1;
    public static final int PLAYER_STATE_PLAYING = 2;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_GROUP = 3;
    public static final int REPEAT_MODE_NONE = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int SHUFFLE_MODE_ALL = 1;
    public static final int SHUFFLE_MODE_GROUP = 2;
    public static final int SHUFFLE_MODE_NONE = 0;
    private static final String TAG = "SessionPlayer";
    public static final long UNKNOWN_TIME = Long.MIN_VALUE;
    private final Object mLock = new Object();
    private final List<Pair<PlayerCallback, Executor>> mCallbacks = new ArrayList();

    @Retention(RetentionPolicy.SOURCE)
    public @interface BuffState {
    }

    public static abstract class PlayerCallback {
        public void onAudioAttributesChanged(SessionPlayer sessionPlayer, AudioAttributesCompat audioAttributesCompat) {
        }

        public void onBufferingStateChanged(SessionPlayer sessionPlayer, MediaItem mediaItem, int i) {
        }

        public void onCurrentMediaItemChanged(SessionPlayer sessionPlayer, MediaItem mediaItem) {
        }

        public void onPlaybackCompleted(SessionPlayer sessionPlayer) {
        }

        public void onPlaybackSpeedChanged(SessionPlayer sessionPlayer, float f) {
        }

        public void onPlayerStateChanged(SessionPlayer sessionPlayer, int i) {
        }

        public void onPlaylistChanged(SessionPlayer sessionPlayer, List<MediaItem> list, MediaMetadata mediaMetadata) {
        }

        public void onPlaylistMetadataChanged(SessionPlayer sessionPlayer, MediaMetadata mediaMetadata) {
        }

        public void onRepeatModeChanged(SessionPlayer sessionPlayer, int i) {
        }

        public void onSeekCompleted(SessionPlayer sessionPlayer, long j) {
        }

        public void onShuffleModeChanged(SessionPlayer sessionPlayer, int i) {
        }

        public void onSubtitleData(SessionPlayer sessionPlayer, MediaItem mediaItem, TrackInfo trackInfo, SubtitleData subtitleData) {
        }

        public void onTrackDeselected(SessionPlayer sessionPlayer, TrackInfo trackInfo) {
        }

        public void onTrackSelected(SessionPlayer sessionPlayer, TrackInfo trackInfo) {
        }

        public void onTracksChanged(SessionPlayer sessionPlayer, List<TrackInfo> list) {
        }

        public void onVideoSizeChanged(SessionPlayer sessionPlayer, VideoSize videoSize) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerState {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShuffleMode {
    }

    public abstract ListenableFuture<PlayerResult> addPlaylistItem(int i, MediaItem mediaItem);

    public abstract AudioAttributesCompat getAudioAttributes();

    public abstract long getBufferedPosition();

    public abstract int getBufferingState();

    public abstract MediaItem getCurrentMediaItem();

    public abstract int getCurrentMediaItemIndex();

    public abstract long getCurrentPosition();

    public abstract long getDuration();

    public abstract int getNextMediaItemIndex();

    public abstract float getPlaybackSpeed();

    public abstract int getPlayerState();

    public abstract List<MediaItem> getPlaylist();

    public abstract MediaMetadata getPlaylistMetadata();

    public abstract int getPreviousMediaItemIndex();

    public abstract int getRepeatMode();

    public abstract int getShuffleMode();

    public abstract ListenableFuture<PlayerResult> pause();

    public abstract ListenableFuture<PlayerResult> play();

    public abstract ListenableFuture<PlayerResult> prepare();

    public abstract ListenableFuture<PlayerResult> removePlaylistItem(int i);

    public abstract ListenableFuture<PlayerResult> replacePlaylistItem(int i, MediaItem mediaItem);

    public abstract ListenableFuture<PlayerResult> seekTo(long j);

    public abstract ListenableFuture<PlayerResult> setAudioAttributes(AudioAttributesCompat audioAttributesCompat);

    public abstract ListenableFuture<PlayerResult> setMediaItem(MediaItem mediaItem);

    public abstract ListenableFuture<PlayerResult> setPlaybackSpeed(float f);

    public abstract ListenableFuture<PlayerResult> setPlaylist(List<MediaItem> list, MediaMetadata mediaMetadata);

    public abstract ListenableFuture<PlayerResult> setRepeatMode(int i);

    public abstract ListenableFuture<PlayerResult> setShuffleMode(int i);

    public abstract ListenableFuture<PlayerResult> skipToNextPlaylistItem();

    public abstract ListenableFuture<PlayerResult> skipToPlaylistItem(int i);

    public abstract ListenableFuture<PlayerResult> skipToPreviousPlaylistItem();

    public abstract ListenableFuture<PlayerResult> updatePlaylistMetadata(MediaMetadata mediaMetadata);

    public VideoSize getVideoSize() {
        throw new UnsupportedOperationException("getVideoSize is not implemented");
    }

    public ListenableFuture<PlayerResult> setSurface(Surface surface) {
        throw new UnsupportedOperationException("setSurface is not implemented");
    }

    public ListenableFuture<PlayerResult> movePlaylistItem(int i, int i2) {
        throw new UnsupportedOperationException("movePlaylistItem is not implemented");
    }

    public final void registerPlayerCallback(Executor executor, PlayerCallback playerCallback) {
        if (executor == null) {
            throw new NullPointerException("executor shouldn't be null");
        }
        if (playerCallback == null) {
            throw new NullPointerException("callback shouldn't be null");
        }
        synchronized (this.mLock) {
            for (Pair<PlayerCallback, Executor> pair : this.mCallbacks) {
                if (pair.first == playerCallback && pair.second != null) {
                    Log.w(TAG, "callback is already added. Ignoring.");
                    return;
                }
            }
            this.mCallbacks.add(new Pair<>(playerCallback, executor));
        }
    }

    public final void unregisterPlayerCallback(PlayerCallback playerCallback) {
        if (playerCallback == null) {
            throw new NullPointerException("callback shouldn't be null");
        }
        synchronized (this.mLock) {
            for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                if (this.mCallbacks.get(size).first == playerCallback) {
                    this.mCallbacks.remove(size);
                }
            }
        }
    }

    protected final List<Pair<PlayerCallback, Executor>> getCallbacks() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mLock) {
            arrayList.addAll(this.mCallbacks);
        }
        return arrayList;
    }

    public List<TrackInfo> getTracks() {
        throw new UnsupportedOperationException("getTracks is not implemented");
    }

    public ListenableFuture<PlayerResult> selectTrack(TrackInfo trackInfo) {
        throw new UnsupportedOperationException("selectTrack is not implemented");
    }

    public ListenableFuture<PlayerResult> deselectTrack(TrackInfo trackInfo) {
        throw new UnsupportedOperationException("deselectTrack is not implemented");
    }

    public TrackInfo getSelectedTrack(int i) {
        throw new UnsupportedOperationException("getSelectedTrack is not implemented");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.mLock) {
            this.mCallbacks.clear();
        }
    }

    public static class TrackInfo extends CustomVersionedParcelable {
        private static final String KEY_IS_FORMAT_NULL = "androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_FORMAT_NULL";
        private static final String KEY_IS_SELECTABLE = "androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE";
        public static final int MEDIA_TRACK_TYPE_AUDIO = 2;
        public static final int MEDIA_TRACK_TYPE_METADATA = 5;
        public static final int MEDIA_TRACK_TYPE_SUBTITLE = 4;
        public static final int MEDIA_TRACK_TYPE_UNKNOWN = 0;
        public static final int MEDIA_TRACK_TYPE_VIDEO = 1;
        MediaFormat mFormat;
        int mId;
        boolean mIsSelectable;
        private final Object mLock;
        Bundle mParcelableExtras;
        int mTrackType;

        @Retention(RetentionPolicy.SOURCE)
        public @interface MediaTrackType {
        }

        TrackInfo() {
            this.mLock = new Object();
        }

        public TrackInfo(int i, int i2, MediaFormat mediaFormat) {
            this(i, i2, mediaFormat, false);
        }

        public TrackInfo(int i, int i2, MediaFormat mediaFormat, boolean z) {
            this.mLock = new Object();
            this.mId = i;
            this.mTrackType = i2;
            this.mFormat = mediaFormat;
            this.mIsSelectable = z;
        }

        public int getTrackType() {
            return this.mTrackType;
        }

        public Locale getLanguage() {
            MediaFormat mediaFormat = this.mFormat;
            String string = mediaFormat != null ? mediaFormat.getString("language") : null;
            if (string == null) {
                string = "und";
            }
            return new Locale(string);
        }

        public MediaFormat getFormat() {
            return this.mFormat;
        }

        public int getId() {
            return this.mId;
        }

        public boolean isSelectable() {
            return this.mIsSelectable;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append(getClass().getName());
            sb.append('#');
            sb.append(this.mId);
            sb.append('{');
            int i = this.mTrackType;
            if (i == 1) {
                sb.append("VIDEO");
            } else if (i == 2) {
                sb.append("AUDIO");
            } else if (i == 4) {
                sb.append("SUBTITLE");
            } else if (i == 5) {
                sb.append("METADATA");
            } else {
                sb.append("UNKNOWN");
            }
            sb.append(", ");
            sb.append(this.mFormat);
            sb.append(", isSelectable=");
            sb.append(this.mIsSelectable);
            sb.append("}");
            return sb.toString();
        }

        public int hashCode() {
            return this.mId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackInfo) && this.mId == ((TrackInfo) obj).mId;
        }

        @Override // androidx.versionedparcelable.CustomVersionedParcelable
        public void onPreParceling(boolean z) {
            synchronized (this.mLock) {
                Bundle bundle = new Bundle();
                this.mParcelableExtras = bundle;
                bundle.putBoolean(KEY_IS_FORMAT_NULL, this.mFormat == null);
                MediaFormat mediaFormat = this.mFormat;
                if (mediaFormat != null) {
                    putStringValueToBundle("language", mediaFormat, this.mParcelableExtras);
                    putStringValueToBundle("mime", this.mFormat, this.mParcelableExtras);
                    putIntValueToBundle("is-forced-subtitle", this.mFormat, this.mParcelableExtras);
                    putIntValueToBundle("is-autoselect", this.mFormat, this.mParcelableExtras);
                    putIntValueToBundle("is-default", this.mFormat, this.mParcelableExtras);
                }
                this.mParcelableExtras.putBoolean(KEY_IS_SELECTABLE, this.mIsSelectable);
            }
        }

        @Override // androidx.versionedparcelable.CustomVersionedParcelable
        public void onPostParceling() {
            Bundle bundle = this.mParcelableExtras;
            if (bundle != null && !bundle.getBoolean(KEY_IS_FORMAT_NULL)) {
                MediaFormat mediaFormat = new MediaFormat();
                this.mFormat = mediaFormat;
                setStringValueToMediaFormat("language", mediaFormat, this.mParcelableExtras);
                setStringValueToMediaFormat("mime", this.mFormat, this.mParcelableExtras);
                setIntValueToMediaFormat("is-forced-subtitle", this.mFormat, this.mParcelableExtras);
                setIntValueToMediaFormat("is-autoselect", this.mFormat, this.mParcelableExtras);
                setIntValueToMediaFormat("is-default", this.mFormat, this.mParcelableExtras);
            }
            Bundle bundle2 = this.mParcelableExtras;
            if (bundle2 == null || !bundle2.containsKey(KEY_IS_SELECTABLE)) {
                this.mIsSelectable = this.mTrackType != 1;
            } else {
                this.mIsSelectable = this.mParcelableExtras.getBoolean(KEY_IS_SELECTABLE);
            }
        }

        private static void putIntValueToBundle(String str, MediaFormat mediaFormat, Bundle bundle) {
            if (mediaFormat.containsKey(str)) {
                bundle.putInt(str, mediaFormat.getInteger(str));
            }
        }

        private static void putStringValueToBundle(String str, MediaFormat mediaFormat, Bundle bundle) {
            if (mediaFormat.containsKey(str)) {
                bundle.putString(str, mediaFormat.getString(str));
            }
        }

        private static void setIntValueToMediaFormat(String str, MediaFormat mediaFormat, Bundle bundle) {
            if (bundle.containsKey(str)) {
                mediaFormat.setInteger(str, bundle.getInt(str));
            }
        }

        private static void setStringValueToMediaFormat(String str, MediaFormat mediaFormat, Bundle bundle) {
            if (bundle.containsKey(str)) {
                mediaFormat.setString(str, bundle.getString(str));
            }
        }
    }

    public static class PlayerResult implements BaseResult {
        private final long mCompletionTime;
        private final MediaItem mItem;
        private final int mResultCode;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ResultCode {
        }

        public PlayerResult(int i, MediaItem mediaItem) {
            this(i, mediaItem, SystemClock.elapsedRealtime());
        }

        private PlayerResult(int i, MediaItem mediaItem, long j) {
            this.mResultCode = i;
            this.mItem = mediaItem;
            this.mCompletionTime = j;
        }

        public static ListenableFuture<PlayerResult> createFuture(int i) {
            ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
            resolvableFutureCreate.set(new PlayerResult(i, null));
            return resolvableFutureCreate;
        }

        @Override // androidx.media2.common.BaseResult
        public int getResultCode() {
            return this.mResultCode;
        }

        @Override // androidx.media2.common.BaseResult
        public long getCompletionTime() {
            return this.mCompletionTime;
        }

        @Override // androidx.media2.common.BaseResult
        public MediaItem getMediaItem() {
            return this.mItem;
        }
    }
}
