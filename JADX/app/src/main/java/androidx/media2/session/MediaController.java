package androidx.media2.session;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Pair;
import androidx.media.AudioAttributesCompat;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.Rating;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.VideoSize;
import androidx.versionedparcelable.VersionedParcelable;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class MediaController implements Closeable {
    private static final String TAG = "MediaController";
    boolean mClosed;
    private final List<Pair<ControllerCallback, Executor>> mExtraControllerCallbacks;
    MediaControllerImpl mImpl;
    final Object mLock;
    final ControllerCallback mPrimaryCallback;
    final Executor mPrimaryCallbackExecutor;
    Long mTimeDiff;

    public interface ControllerCallbackRunnable {
        void run(ControllerCallback controllerCallback);
    }

    interface MediaControllerImpl extends Closeable {
        ListenableFuture<SessionResult> addPlaylistItem(int i, String str);

        ListenableFuture<SessionResult> adjustVolume(int i, int i2);

        ListenableFuture<SessionResult> deselectTrack(SessionPlayer.TrackInfo trackInfo);

        ListenableFuture<SessionResult> fastForward();

        SessionCommandGroup getAllowedCommands();

        MediaBrowserCompat getBrowserCompat();

        long getBufferedPosition();

        int getBufferingState();

        SessionToken getConnectedToken();

        Context getContext();

        MediaItem getCurrentMediaItem();

        int getCurrentMediaItemIndex();

        long getCurrentPosition();

        long getDuration();

        int getNextMediaItemIndex();

        PlaybackInfo getPlaybackInfo();

        float getPlaybackSpeed();

        int getPlayerState();

        List<MediaItem> getPlaylist();

        MediaMetadata getPlaylistMetadata();

        int getPreviousMediaItemIndex();

        int getRepeatMode();

        SessionPlayer.TrackInfo getSelectedTrack(int i);

        PendingIntent getSessionActivity();

        int getShuffleMode();

        List<SessionPlayer.TrackInfo> getTracks();

        VideoSize getVideoSize();

        boolean isConnected();

        ListenableFuture<SessionResult> movePlaylistItem(int i, int i2);

        ListenableFuture<SessionResult> pause();

        ListenableFuture<SessionResult> play();

        ListenableFuture<SessionResult> prepare();

        ListenableFuture<SessionResult> removePlaylistItem(int i);

        ListenableFuture<SessionResult> replacePlaylistItem(int i, String str);

        ListenableFuture<SessionResult> rewind();

        ListenableFuture<SessionResult> seekTo(long j);

        ListenableFuture<SessionResult> selectTrack(SessionPlayer.TrackInfo trackInfo);

        ListenableFuture<SessionResult> sendCustomCommand(SessionCommand sessionCommand, Bundle bundle);

        ListenableFuture<SessionResult> setMediaItem(String str);

        ListenableFuture<SessionResult> setMediaUri(Uri uri, Bundle bundle);

        ListenableFuture<SessionResult> setPlaybackSpeed(float f);

        ListenableFuture<SessionResult> setPlaylist(List<String> list, MediaMetadata mediaMetadata);

        ListenableFuture<SessionResult> setRating(String str, Rating rating);

        ListenableFuture<SessionResult> setRepeatMode(int i);

        ListenableFuture<SessionResult> setShuffleMode(int i);

        ListenableFuture<SessionResult> setSurface(Surface surface);

        ListenableFuture<SessionResult> setVolumeTo(int i, int i2);

        ListenableFuture<SessionResult> skipBackward();

        ListenableFuture<SessionResult> skipForward();

        ListenableFuture<SessionResult> skipToNextItem();

        ListenableFuture<SessionResult> skipToPlaylistItem(int i);

        ListenableFuture<SessionResult> skipToPreviousItem();

        ListenableFuture<SessionResult> updatePlaylistMetadata(MediaMetadata mediaMetadata);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface VolumeDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface VolumeFlags {
    }

    MediaController(Context context, SessionToken sessionToken, Bundle bundle, Executor executor, ControllerCallback controllerCallback) {
        Object obj = new Object();
        this.mLock = obj;
        this.mExtraControllerCallbacks = new ArrayList();
        if (context == null) {
            throw new NullPointerException("context shouldn't be null");
        }
        if (sessionToken == null) {
            throw new NullPointerException("token shouldn't be null");
        }
        this.mPrimaryCallback = controllerCallback;
        this.mPrimaryCallbackExecutor = executor;
        synchronized (obj) {
            this.mImpl = createImpl(context, sessionToken, bundle);
        }
    }

    MediaController(final Context context, MediaSessionCompat.Token token, final Bundle bundle, Executor executor, ControllerCallback controllerCallback) {
        this.mLock = new Object();
        this.mExtraControllerCallbacks = new ArrayList();
        if (context == null) {
            throw new NullPointerException("context shouldn't be null");
        }
        if (token == null) {
            throw new NullPointerException("token shouldn't be null");
        }
        this.mPrimaryCallback = controllerCallback;
        this.mPrimaryCallbackExecutor = executor;
        SessionToken.createSessionToken(context, token, new SessionToken.OnSessionTokenCreatedListener() { // from class: androidx.media2.session.MediaController$$ExternalSyntheticLambda0
            @Override // androidx.media2.session.SessionToken.OnSessionTokenCreatedListener
            public final void onSessionTokenCreated(MediaSessionCompat.Token token2, SessionToken sessionToken) {
                this.f$0.m678lambda$new$1$androidxmedia2sessionMediaController(context, bundle, token2, sessionToken);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$new$1$androidx-media2-session-MediaController, reason: not valid java name */
    /* synthetic */ void m678lambda$new$1$androidxmedia2sessionMediaController(Context context, Bundle bundle, MediaSessionCompat.Token token, SessionToken sessionToken) {
        boolean z;
        synchronized (this.mLock) {
            z = this.mClosed;
            if (!z) {
                this.mImpl = createImpl(context, sessionToken, bundle);
            }
        }
        if (z) {
            notifyAllControllerCallbacks(new ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaController$$ExternalSyntheticLambda1
                @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                public final void run(MediaController.ControllerCallback controllerCallback) {
                    this.f$0.m677lambda$new$0$androidxmedia2sessionMediaController(controllerCallback);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-media2-session-MediaController, reason: not valid java name */
    /* synthetic */ void m677lambda$new$0$androidxmedia2sessionMediaController(ControllerCallback controllerCallback) {
        controllerCallback.onDisconnected(this);
    }

    MediaControllerImpl createImpl(Context context, SessionToken sessionToken, Bundle bundle) {
        if (sessionToken.isLegacySession()) {
            return new MediaControllerImplLegacy(context, this, sessionToken);
        }
        return new MediaControllerImplBase(context, this, sessionToken, bundle);
    }

    MediaControllerImpl getImpl() {
        MediaControllerImpl mediaControllerImpl;
        synchronized (this.mLock) {
            mediaControllerImpl = this.mImpl;
        }
        return mediaControllerImpl;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            synchronized (this.mLock) {
                if (this.mClosed) {
                    return;
                }
                this.mClosed = true;
                MediaControllerImpl mediaControllerImpl = this.mImpl;
                if (mediaControllerImpl != null) {
                    mediaControllerImpl.close();
                }
            }
        } catch (Exception unused) {
        }
    }

    public SessionToken getConnectedToken() {
        if (isConnected()) {
            return getImpl().getConnectedToken();
        }
        return null;
    }

    public boolean isConnected() {
        MediaControllerImpl impl = getImpl();
        return impl != null && impl.isConnected();
    }

    public ListenableFuture<SessionResult> play() {
        if (isConnected()) {
            return getImpl().play();
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> pause() {
        if (isConnected()) {
            return getImpl().pause();
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> prepare() {
        if (isConnected()) {
            return getImpl().prepare();
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> fastForward() {
        if (isConnected()) {
            return getImpl().fastForward();
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> rewind() {
        if (isConnected()) {
            return getImpl().rewind();
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> skipForward() {
        if (isConnected()) {
            return getImpl().skipForward();
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> skipBackward() {
        if (isConnected()) {
            return getImpl().skipBackward();
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> seekTo(long j) {
        if (isConnected()) {
            return getImpl().seekTo(j);
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> setVolumeTo(int i, int i2) {
        if (isConnected()) {
            return getImpl().setVolumeTo(i, i2);
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> adjustVolume(int i, int i2) {
        if (isConnected()) {
            return getImpl().adjustVolume(i, i2);
        }
        return createDisconnectedFuture();
    }

    public PendingIntent getSessionActivity() {
        if (isConnected()) {
            return getImpl().getSessionActivity();
        }
        return null;
    }

    public int getPlayerState() {
        if (isConnected()) {
            return getImpl().getPlayerState();
        }
        return 0;
    }

    public long getDuration() {
        if (isConnected()) {
            return getImpl().getDuration();
        }
        return Long.MIN_VALUE;
    }

    public long getCurrentPosition() {
        if (isConnected()) {
            return getImpl().getCurrentPosition();
        }
        return Long.MIN_VALUE;
    }

    public float getPlaybackSpeed() {
        if (isConnected()) {
            return getImpl().getPlaybackSpeed();
        }
        return 0.0f;
    }

    public ListenableFuture<SessionResult> setPlaybackSpeed(float f) {
        if (f == 0.0f) {
            throw new IllegalArgumentException("speed must not be zero");
        }
        if (isConnected()) {
            return getImpl().setPlaybackSpeed(f);
        }
        return createDisconnectedFuture();
    }

    public int getBufferingState() {
        if (isConnected()) {
            return getImpl().getBufferingState();
        }
        return 0;
    }

    public long getBufferedPosition() {
        if (isConnected()) {
            return getImpl().getBufferedPosition();
        }
        return Long.MIN_VALUE;
    }

    public PlaybackInfo getPlaybackInfo() {
        if (isConnected()) {
            return getImpl().getPlaybackInfo();
        }
        return null;
    }

    public ListenableFuture<SessionResult> setRating(String str, Rating rating) {
        if (str == null) {
            throw new NullPointerException("mediaId shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("mediaId shouldn't be empty");
        }
        if (rating == null) {
            throw new NullPointerException("rating shouldn't be null");
        }
        if (isConnected()) {
            return getImpl().setRating(str, rating);
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> sendCustomCommand(SessionCommand sessionCommand, Bundle bundle) {
        if (sessionCommand == null) {
            throw new NullPointerException("command shouldn't be null");
        }
        if (sessionCommand.getCommandCode() != 0) {
            throw new IllegalArgumentException("command should be a custom command");
        }
        if (isConnected()) {
            return getImpl().sendCustomCommand(sessionCommand, bundle);
        }
        return createDisconnectedFuture();
    }

    public List<MediaItem> getPlaylist() {
        if (isConnected()) {
            return getImpl().getPlaylist();
        }
        return null;
    }

    public ListenableFuture<SessionResult> setPlaylist(List<String> list, MediaMetadata mediaMetadata) {
        if (list == null) {
            throw new NullPointerException("list shouldn't be null");
        }
        for (int i = 0; i < list.size(); i++) {
            if (TextUtils.isEmpty(list.get(i))) {
                throw new IllegalArgumentException("list shouldn't contain empty id, index=" + i);
            }
        }
        if (isConnected()) {
            return getImpl().setPlaylist(list, mediaMetadata);
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> setMediaItem(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("mediaId shouldn't be empty");
        }
        if (isConnected()) {
            return getImpl().setMediaItem(str);
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> setMediaUri(Uri uri, Bundle bundle) {
        if (uri == null) {
            throw new NullPointerException("mediaUri shouldn't be null");
        }
        if (isConnected()) {
            return getImpl().setMediaUri(uri, bundle);
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> updatePlaylistMetadata(MediaMetadata mediaMetadata) {
        if (isConnected()) {
            return getImpl().updatePlaylistMetadata(mediaMetadata);
        }
        return createDisconnectedFuture();
    }

    public MediaMetadata getPlaylistMetadata() {
        if (isConnected()) {
            return getImpl().getPlaylistMetadata();
        }
        return null;
    }

    public ListenableFuture<SessionResult> addPlaylistItem(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException("index shouldn't be negative");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("mediaId shouldn't be empty");
        }
        if (isConnected()) {
            return getImpl().addPlaylistItem(i, str);
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> removePlaylistItem(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index shouldn't be negative");
        }
        if (isConnected()) {
            return getImpl().removePlaylistItem(i);
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> replacePlaylistItem(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException("index shouldn't be negative");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("mediaId shouldn't be empty");
        }
        if (isConnected()) {
            return getImpl().replacePlaylistItem(i, str);
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> movePlaylistItem(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("indexes shouldn't be negative");
        }
        if (isConnected()) {
            return getImpl().movePlaylistItem(i, i2);
        }
        return createDisconnectedFuture();
    }

    public MediaItem getCurrentMediaItem() {
        if (isConnected()) {
            return getImpl().getCurrentMediaItem();
        }
        return null;
    }

    public int getCurrentMediaItemIndex() {
        if (isConnected()) {
            return getImpl().getCurrentMediaItemIndex();
        }
        return -1;
    }

    public int getPreviousMediaItemIndex() {
        if (isConnected()) {
            return getImpl().getPreviousMediaItemIndex();
        }
        return -1;
    }

    public int getNextMediaItemIndex() {
        if (isConnected()) {
            return getImpl().getNextMediaItemIndex();
        }
        return -1;
    }

    public ListenableFuture<SessionResult> skipToPreviousPlaylistItem() {
        if (isConnected()) {
            return getImpl().skipToPreviousItem();
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> skipToNextPlaylistItem() {
        if (isConnected()) {
            return getImpl().skipToNextItem();
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<SessionResult> skipToPlaylistItem(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index shouldn't be negative");
        }
        if (isConnected()) {
            return getImpl().skipToPlaylistItem(i);
        }
        return createDisconnectedFuture();
    }

    public int getRepeatMode() {
        if (isConnected()) {
            return getImpl().getRepeatMode();
        }
        return 0;
    }

    public ListenableFuture<SessionResult> setRepeatMode(int i) {
        if (isConnected()) {
            return getImpl().setRepeatMode(i);
        }
        return createDisconnectedFuture();
    }

    public int getShuffleMode() {
        if (isConnected()) {
            return getImpl().getShuffleMode();
        }
        return 0;
    }

    public ListenableFuture<SessionResult> setShuffleMode(int i) {
        if (isConnected()) {
            return getImpl().setShuffleMode(i);
        }
        return createDisconnectedFuture();
    }

    public VideoSize getVideoSize() {
        return isConnected() ? getImpl().getVideoSize() : new VideoSize(0, 0);
    }

    public ListenableFuture<SessionResult> setSurface(Surface surface) {
        if (isConnected()) {
            return getImpl().setSurface(surface);
        }
        return createDisconnectedFuture();
    }

    public List<SessionPlayer.TrackInfo> getTracks() {
        return isConnected() ? getImpl().getTracks() : Collections.emptyList();
    }

    public ListenableFuture<SessionResult> selectTrack(SessionPlayer.TrackInfo trackInfo) {
        if (trackInfo != null) {
            return isConnected() ? getImpl().selectTrack(trackInfo) : createDisconnectedFuture();
        }
        throw new NullPointerException("TrackInfo shouldn't be null");
    }

    public ListenableFuture<SessionResult> deselectTrack(SessionPlayer.TrackInfo trackInfo) {
        if (trackInfo != null) {
            return isConnected() ? getImpl().deselectTrack(trackInfo) : createDisconnectedFuture();
        }
        throw new NullPointerException("TrackInfo shouldn't be null");
    }

    public SessionPlayer.TrackInfo getSelectedTrack(int i) {
        if (isConnected()) {
            return getImpl().getSelectedTrack(i);
        }
        return null;
    }

    public void setTimeDiff(Long l) {
        this.mTimeDiff = l;
    }

    public void registerExtraCallback(Executor executor, ControllerCallback controllerCallback) {
        boolean z;
        if (executor == null) {
            throw new NullPointerException("executor shouldn't be null");
        }
        if (controllerCallback == null) {
            throw new NullPointerException("callback shouldn't be null");
        }
        synchronized (this.mLock) {
            Iterator<Pair<ControllerCallback, Executor>> it = this.mExtraControllerCallbacks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (it.next().first == controllerCallback) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                this.mExtraControllerCallbacks.add(new Pair<>(controllerCallback, executor));
            }
        }
        if (z) {
            Log.w(TAG, "registerExtraCallback: the callback already exists");
        }
    }

    public void unregisterExtraCallback(ControllerCallback controllerCallback) {
        boolean z;
        if (controllerCallback == null) {
            throw new NullPointerException("callback shouldn't be null");
        }
        synchronized (this.mLock) {
            z = true;
            int size = this.mExtraControllerCallbacks.size() - 1;
            while (true) {
                if (size < 0) {
                    z = false;
                    break;
                } else {
                    if (this.mExtraControllerCallbacks.get(size).first == controllerCallback) {
                        this.mExtraControllerCallbacks.remove(size);
                        break;
                    }
                    size--;
                }
            }
        }
        if (z) {
            return;
        }
        Log.w(TAG, "unregisterExtraCallback: no such callback found");
    }

    public List<Pair<ControllerCallback, Executor>> getExtraControllerCallbacks() {
        ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new ArrayList(this.mExtraControllerCallbacks);
        }
        return arrayList;
    }

    public SessionCommandGroup getAllowedCommands() {
        if (isConnected()) {
            return getImpl().getAllowedCommands();
        }
        return null;
    }

    private static ListenableFuture<SessionResult> createDisconnectedFuture() {
        return SessionResult.createFutureWithResult(-100);
    }

    void notifyPrimaryControllerCallback(final ControllerCallbackRunnable controllerCallbackRunnable) {
        Executor executor;
        if (this.mPrimaryCallback == null || (executor = this.mPrimaryCallbackExecutor) == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.media2.session.MediaController.1
            @Override // java.lang.Runnable
            public void run() {
                controllerCallbackRunnable.run(MediaController.this.mPrimaryCallback);
            }
        });
    }

    public void notifyAllControllerCallbacks(final ControllerCallbackRunnable controllerCallbackRunnable) {
        notifyPrimaryControllerCallback(controllerCallbackRunnable);
        for (Pair<ControllerCallback, Executor> pair : getExtraControllerCallbacks()) {
            final ControllerCallback controllerCallback = pair.first;
            Executor executor = pair.second;
            if (controllerCallback == null) {
                Log.e(TAG, "notifyAllControllerCallbacks: mExtraControllerCallbacks contains a null ControllerCallback! Ignoring.");
            } else if (executor == null) {
                Log.e(TAG, "notifyAllControllerCallbacks: mExtraControllerCallbacks contains a null Executor! Ignoring.");
            } else {
                executor.execute(new Runnable() { // from class: androidx.media2.session.MediaController.2
                    @Override // java.lang.Runnable
                    public void run() {
                        controllerCallbackRunnable.run(controllerCallback);
                    }
                });
            }
        }
    }

    public static final class Builder extends BuilderBase<MediaController, Builder, ControllerCallback> {
        public Builder(Context context) {
            super(context);
        }

        @Override // androidx.media2.session.MediaController.BuilderBase
        public Builder setSessionToken(SessionToken sessionToken) {
            return (Builder) super.setSessionToken(sessionToken);
        }

        @Override // androidx.media2.session.MediaController.BuilderBase
        public Builder setSessionCompatToken(MediaSessionCompat.Token token) {
            return (Builder) super.setSessionCompatToken(token);
        }

        @Override // androidx.media2.session.MediaController.BuilderBase
        public Builder setConnectionHints(Bundle bundle) {
            return (Builder) super.setConnectionHints(bundle);
        }

        @Override // androidx.media2.session.MediaController.BuilderBase
        public Builder setControllerCallback(Executor executor, ControllerCallback controllerCallback) {
            return (Builder) super.setControllerCallback(executor, controllerCallback);
        }

        @Override // androidx.media2.session.MediaController.BuilderBase
        public MediaController build() {
            if (this.mToken == null && this.mCompatToken == null) {
                throw new IllegalArgumentException("token and compat token shouldn't be both null");
            }
            if (this.mToken != null) {
                return new MediaController(this.mContext, this.mToken, this.mConnectionHints, this.mCallbackExecutor, this.mCallback);
            }
            return new MediaController(this.mContext, this.mCompatToken, this.mConnectionHints, this.mCallbackExecutor, this.mCallback);
        }
    }

    static abstract class BuilderBase<T extends MediaController, U extends BuilderBase<T, U, C>, C extends ControllerCallback> {
        ControllerCallback mCallback;
        Executor mCallbackExecutor;
        MediaSessionCompat.Token mCompatToken;
        Bundle mConnectionHints;
        final Context mContext;
        SessionToken mToken;

        abstract T build();

        BuilderBase(Context context) {
            if (context == null) {
                throw new NullPointerException("context shouldn't be null");
            }
            this.mContext = context;
        }

        U setSessionToken(SessionToken sessionToken) {
            if (sessionToken == null) {
                throw new NullPointerException("token shouldn't be null");
            }
            this.mToken = sessionToken;
            this.mCompatToken = null;
            return this;
        }

        U setSessionCompatToken(MediaSessionCompat.Token token) {
            if (token == null) {
                throw new NullPointerException("compatToken shouldn't be null");
            }
            this.mCompatToken = token;
            this.mToken = null;
            return this;
        }

        public U setConnectionHints(Bundle bundle) {
            if (bundle == null) {
                throw new NullPointerException("connectionHints shouldn't be null");
            }
            if (MediaUtils.doesBundleHaveCustomParcelable(bundle)) {
                throw new IllegalArgumentException("connectionHints shouldn't contain any custom parcelables");
            }
            this.mConnectionHints = new Bundle(bundle);
            return this;
        }

        U setControllerCallback(Executor executor, C c) {
            if (executor == null) {
                throw new NullPointerException("executor shouldn't be null");
            }
            if (c == null) {
                throw new NullPointerException("callback shouldn't be null");
            }
            this.mCallbackExecutor = executor;
            this.mCallback = c;
            return this;
        }
    }

    public static abstract class ControllerCallback {
        public void onAllowedCommandsChanged(MediaController mediaController, SessionCommandGroup sessionCommandGroup) {
        }

        public void onBufferingStateChanged(MediaController mediaController, MediaItem mediaItem, int i) {
        }

        public void onConnected(MediaController mediaController, SessionCommandGroup sessionCommandGroup) {
        }

        public void onCurrentMediaItemChanged(MediaController mediaController, MediaItem mediaItem) {
        }

        public void onDisconnected(MediaController mediaController) {
        }

        public void onPlaybackCompleted(MediaController mediaController) {
        }

        public void onPlaybackInfoChanged(MediaController mediaController, PlaybackInfo playbackInfo) {
        }

        public void onPlaybackSpeedChanged(MediaController mediaController, float f) {
        }

        public void onPlayerStateChanged(MediaController mediaController, int i) {
        }

        public void onPlaylistChanged(MediaController mediaController, List<MediaItem> list, MediaMetadata mediaMetadata) {
        }

        public void onPlaylistMetadataChanged(MediaController mediaController, MediaMetadata mediaMetadata) {
        }

        public void onRepeatModeChanged(MediaController mediaController, int i) {
        }

        public void onSeekCompleted(MediaController mediaController, long j) {
        }

        public int onSetCustomLayout(MediaController mediaController, List<MediaSession.CommandButton> list) {
            return -6;
        }

        public void onShuffleModeChanged(MediaController mediaController, int i) {
        }

        public void onSubtitleData(MediaController mediaController, MediaItem mediaItem, SessionPlayer.TrackInfo trackInfo, SubtitleData subtitleData) {
        }

        public void onTrackDeselected(MediaController mediaController, SessionPlayer.TrackInfo trackInfo) {
        }

        public void onTrackSelected(MediaController mediaController, SessionPlayer.TrackInfo trackInfo) {
        }

        public void onTracksChanged(MediaController mediaController, List<SessionPlayer.TrackInfo> list) {
        }

        @Deprecated
        public void onVideoSizeChanged(MediaController mediaController, MediaItem mediaItem, VideoSize videoSize) {
        }

        public void onVideoSizeChanged(MediaController mediaController, VideoSize videoSize) {
        }

        public SessionResult onCustomCommand(MediaController mediaController, SessionCommand sessionCommand, Bundle bundle) {
            return new SessionResult(-6);
        }
    }

    public static final class PlaybackInfo implements VersionedParcelable {
        public static final int PLAYBACK_TYPE_LOCAL = 1;
        public static final int PLAYBACK_TYPE_REMOTE = 2;
        AudioAttributesCompat mAudioAttrsCompat;
        int mControlType;
        int mCurrentVolume;
        int mMaxVolume;
        int mPlaybackType;

        PlaybackInfo() {
        }

        PlaybackInfo(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.mPlaybackType = i;
            this.mAudioAttrsCompat = audioAttributesCompat;
            this.mControlType = i2;
            this.mMaxVolume = i3;
            this.mCurrentVolume = i4;
        }

        public int getPlaybackType() {
            return this.mPlaybackType;
        }

        public AudioAttributesCompat getAudioAttributes() {
            return this.mAudioAttrsCompat;
        }

        public int getControlType() {
            return this.mControlType;
        }

        public int getMaxVolume() {
            return this.mMaxVolume;
        }

        public int getCurrentVolume() {
            return this.mCurrentVolume;
        }

        public int hashCode() {
            return ObjectsCompat.hash(Integer.valueOf(this.mPlaybackType), Integer.valueOf(this.mControlType), Integer.valueOf(this.mMaxVolume), Integer.valueOf(this.mCurrentVolume), this.mAudioAttrsCompat);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof PlaybackInfo)) {
                return false;
            }
            PlaybackInfo playbackInfo = (PlaybackInfo) obj;
            return this.mPlaybackType == playbackInfo.mPlaybackType && this.mControlType == playbackInfo.mControlType && this.mMaxVolume == playbackInfo.mMaxVolume && this.mCurrentVolume == playbackInfo.mCurrentVolume && ObjectsCompat.equals(this.mAudioAttrsCompat, playbackInfo.mAudioAttrsCompat);
        }

        static PlaybackInfo createPlaybackInfo(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            return new PlaybackInfo(i, audioAttributesCompat, i2, i3, i4);
        }
    }
}
