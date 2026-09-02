package androidx.media2.session;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.util.ObjectsCompat;
import androidx.media2.common.ClassVerificationHelper;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.Rating;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.VideoSize;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerImplLegacy implements MediaController.MediaControllerImpl {
    private static final int ITEM_NONE = -1;
    private static final long POSITION_DIFF_TOLERANCE = 100;
    static final String SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED = "android.media.session.command.ON_CAPTIONING_ENALBED_CHANGED";
    static final String SESSION_COMMAND_ON_EXTRAS_CHANGED = "android.media.session.command.ON_EXTRAS_CHANGED";
    SessionCommandGroup mAllowedCommands;
    MediaBrowserCompat mBrowserCompat;
    long mBufferedPosition;
    int mBufferingState;
    boolean mClosed;
    boolean mConnected;
    final Context mContext;
    MediaControllerCompat mControllerCompat;
    ControllerCompatCallback mControllerCompatCallback;
    MediaItem mCurrentMediaItem;
    int mCurrentMediaItemIndex;
    List<MediaSession.CommandButton> mCustomLayout;
    final Handler mHandler;
    final HandlerThread mHandlerThread;
    MediaController mInstance;
    final Object mLock;
    MediaMetadataCompat mMediaMetadataCompat;
    private SetMediaUriRequest mPendingSetMediaUriRequest;
    MediaController.PlaybackInfo mPlaybackInfo;
    PlaybackStateCompat mPlaybackStateCompat;
    int mPlayerState;
    List<MediaItem> mPlaylist;
    MediaMetadata mPlaylistMetadata;
    List<MediaSessionCompat.QueueItem> mQueue;
    int mRepeatMode;
    int mShuffleMode;
    int mSkipToPlaylistIndex;
    final SessionToken mToken;
    private static final String TAG = "MC2ImplLegacy";
    static final boolean DEBUG = Log.isLoggable(TAG, 3);

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public int getNextMediaItemIndex() {
        return -1;
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public int getPreviousMediaItemIndex() {
        return -1;
    }

    MediaControllerImplLegacy(Context context, MediaController mediaController, SessionToken sessionToken) {
        Object obj = new Object();
        this.mLock = obj;
        this.mSkipToPlaylistIndex = -1;
        this.mContext = context;
        this.mInstance = mediaController;
        HandlerThread handlerThread = new HandlerThread("MediaController_Thread");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
        this.mToken = sessionToken;
        if (sessionToken.getType() == 0) {
            synchronized (obj) {
                this.mBrowserCompat = null;
            }
            connectToSession((MediaSessionCompat.Token) sessionToken.getBinder());
            return;
        }
        connectToService();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (DEBUG) {
            Log.d(TAG, "close from " + this.mToken);
        }
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            this.mHandler.removeCallbacksAndMessages(null);
            ClassVerificationHelper.HandlerThread.Api18.quitSafely(this.mHandlerThread);
            this.mClosed = true;
            MediaBrowserCompat mediaBrowserCompat = this.mBrowserCompat;
            if (mediaBrowserCompat != null) {
                mediaBrowserCompat.disconnect();
                this.mBrowserCompat = null;
            }
            MediaControllerCompat mediaControllerCompat = this.mControllerCompat;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.unregisterCallback(this.mControllerCompatCallback);
                this.mControllerCompat = null;
            }
            this.mConnected = false;
            this.mInstance.notifyAllControllerCallbacks(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.1
                @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                public void run(MediaController.ControllerCallback controllerCallback) {
                    controllerCallback.onDisconnected(MediaControllerImplLegacy.this.mInstance);
                }
            });
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public SessionToken getConnectedToken() {
        SessionToken sessionToken;
        synchronized (this.mLock) {
            sessionToken = this.mConnected ? this.mToken : null;
        }
        return sessionToken;
    }

    private ListenableFuture<SessionResult> createFutureWithResult(int i) {
        ResolvableFuture<SessionResult> resolvableFutureCreate = ResolvableFuture.create();
        setFutureResult(resolvableFutureCreate, i);
        return resolvableFutureCreate;
    }

    private void setFutureResult(ResolvableFuture<SessionResult> resolvableFuture, int i) {
        MediaItem mediaItem;
        synchronized (this.mLock) {
            mediaItem = this.mCurrentMediaItem;
        }
        resolvableFuture.set(new SessionResult(i, null, mediaItem));
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public boolean isConnected() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mConnected;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> play() {
        byte b;
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            SetMediaUriRequest setMediaUriRequest = this.mPendingSetMediaUriRequest;
            if (setMediaUriRequest == null) {
                this.mControllerCompat.getTransportControls().play();
            } else {
                String str = setMediaUriRequest.type;
                int iHashCode = str.hashCode();
                if (iHashCode != 3355) {
                    if (iHashCode != 116076) {
                        if (iHashCode == 107944136 && str.equals("query")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (str.equals(MediaConstants.MEDIA_URI_QUERY_URI)) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (str.equals(MediaConstants.MEDIA_URI_QUERY_ID)) {
                    b = 0;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    this.mControllerCompat.getTransportControls().playFromMediaId(this.mPendingSetMediaUriRequest.value, this.mPendingSetMediaUriRequest.extras);
                } else if (b == 1) {
                    this.mControllerCompat.getTransportControls().playFromSearch(this.mPendingSetMediaUriRequest.value, this.mPendingSetMediaUriRequest.extras);
                } else if (b == 2) {
                    this.mControllerCompat.getTransportControls().playFromUri(Uri.parse(this.mPendingSetMediaUriRequest.value), this.mPendingSetMediaUriRequest.extras);
                } else {
                    this.mPendingSetMediaUriRequest = null;
                    return createFutureWithResult(-2);
                }
                setFutureResult(this.mPendingSetMediaUriRequest.result, 0);
                this.mPendingSetMediaUriRequest = null;
            }
            return createFutureWithResult(0);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> pause() {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            this.mControllerCompat.getTransportControls().pause();
            return createFutureWithResult(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> prepare() {
        byte b;
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            SetMediaUriRequest setMediaUriRequest = this.mPendingSetMediaUriRequest;
            if (setMediaUriRequest == null) {
                this.mControllerCompat.getTransportControls().prepare();
            } else {
                String str = setMediaUriRequest.type;
                int iHashCode = str.hashCode();
                if (iHashCode != 3355) {
                    if (iHashCode != 116076) {
                        if (iHashCode == 107944136 && str.equals("query")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (str.equals(MediaConstants.MEDIA_URI_QUERY_URI)) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (str.equals(MediaConstants.MEDIA_URI_QUERY_ID)) {
                    b = 0;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    this.mControllerCompat.getTransportControls().prepareFromMediaId(this.mPendingSetMediaUriRequest.value, this.mPendingSetMediaUriRequest.extras);
                } else if (b == 1) {
                    this.mControllerCompat.getTransportControls().prepareFromSearch(this.mPendingSetMediaUriRequest.value, this.mPendingSetMediaUriRequest.extras);
                } else if (b == 2) {
                    this.mControllerCompat.getTransportControls().prepareFromUri(Uri.parse(this.mPendingSetMediaUriRequest.value), this.mPendingSetMediaUriRequest.extras);
                } else {
                    this.mPendingSetMediaUriRequest = null;
                    return createFutureWithResult(-2);
                }
                setFutureResult(this.mPendingSetMediaUriRequest.result, 0);
                this.mPendingSetMediaUriRequest = null;
            }
            return createFutureWithResult(0);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> fastForward() {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            this.mControllerCompat.getTransportControls().fastForward();
            return createFutureWithResult(0);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> rewind() {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            this.mControllerCompat.getTransportControls().rewind();
            return createFutureWithResult(0);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> skipForward() {
        return createFutureWithResult(-6);
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> skipBackward() {
        return createFutureWithResult(-6);
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> seekTo(long j) {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            this.mControllerCompat.getTransportControls().seekTo(j);
            return createFutureWithResult(0);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> setVolumeTo(int i, int i2) {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            this.mControllerCompat.setVolumeTo(i, i2);
            return createFutureWithResult(0);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> adjustVolume(int i, int i2) {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            this.mControllerCompat.adjustVolume(i, i2);
            return createFutureWithResult(0);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public PendingIntent getSessionActivity() {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return null;
            }
            return this.mControllerCompat.getSessionActivity();
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public int getPlayerState() {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return 3;
            }
            return this.mPlayerState;
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public long getDuration() {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return Long.MIN_VALUE;
            }
            MediaMetadataCompat mediaMetadataCompat = this.mMediaMetadataCompat;
            if (mediaMetadataCompat == null || !mediaMetadataCompat.containsKey("android.media.metadata.DURATION")) {
                return Long.MIN_VALUE;
            }
            return this.mMediaMetadataCompat.getLong("android.media.metadata.DURATION");
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public long getCurrentPosition() {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return Long.MIN_VALUE;
            }
            PlaybackStateCompat playbackStateCompat = this.mPlaybackStateCompat;
            if (playbackStateCompat == null) {
                return Long.MIN_VALUE;
            }
            return playbackStateCompat.getCurrentPosition(this.mInstance.mTimeDiff);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public float getPlaybackSpeed() {
        synchronized (this.mLock) {
            float playbackSpeed = 0.0f;
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return 0.0f;
            }
            PlaybackStateCompat playbackStateCompat = this.mPlaybackStateCompat;
            if (playbackStateCompat != null) {
                playbackSpeed = playbackStateCompat.getPlaybackSpeed();
            }
            return playbackSpeed;
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public int getBufferingState() {
        synchronized (this.mLock) {
            int bufferingState = 0;
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return 0;
            }
            PlaybackStateCompat playbackStateCompat = this.mPlaybackStateCompat;
            if (playbackStateCompat != null) {
                bufferingState = MediaUtils.toBufferingState(playbackStateCompat.getState());
            }
            return bufferingState;
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public long getBufferedPosition() {
        synchronized (this.mLock) {
            long bufferedPosition = Long.MIN_VALUE;
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return Long.MIN_VALUE;
            }
            PlaybackStateCompat playbackStateCompat = this.mPlaybackStateCompat;
            if (playbackStateCompat != null) {
                bufferedPosition = playbackStateCompat.getBufferedPosition();
            }
            return bufferedPosition;
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public MediaController.PlaybackInfo getPlaybackInfo() {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return null;
            }
            return this.mPlaybackInfo;
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> setRating(String str, Rating rating) {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            MediaItem mediaItem = this.mCurrentMediaItem;
            if (mediaItem != null && str.equals(mediaItem.getMediaId())) {
                this.mControllerCompat.getTransportControls().setRating(MediaUtils.convertToRatingCompat(rating));
            }
            return createFutureWithResult(0);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> setPlaybackSpeed(float f) {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            this.mControllerCompat.getTransportControls().setPlaybackSpeed(f);
            return createFutureWithResult(0);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> sendCustomCommand(SessionCommand sessionCommand, Bundle bundle) {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            if (this.mAllowedCommands.hasCommand(sessionCommand)) {
                this.mControllerCompat.getTransportControls().sendCustomAction(sessionCommand.getCustomAction(), bundle);
                return createFutureWithResult(0);
            }
            final ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
            this.mControllerCompat.sendCommand(sessionCommand.getCustomAction(), bundle, new ResultReceiver(this.mHandler) { // from class: androidx.media2.session.MediaControllerImplLegacy.2
                @Override // android.os.ResultReceiver
                protected void onReceiveResult(int i, Bundle bundle2) {
                    resolvableFutureCreate.set(new SessionResult(i, bundle2));
                }
            });
            return resolvableFutureCreate;
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public List<MediaItem> getPlaylist() {
        synchronized (this.mLock) {
            ArrayList arrayList = null;
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return null;
            }
            List<MediaItem> list = this.mPlaylist;
            if (list != null && list.size() != 0) {
                arrayList = new ArrayList(this.mPlaylist);
            }
            return arrayList;
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> setPlaylist(List<String> list, MediaMetadata mediaMetadata) {
        return createFutureWithResult(-6);
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> setMediaItem(String str) {
        return createFutureWithResult(-6);
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> setMediaUri(Uri uri, Bundle bundle) {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            if (this.mPendingSetMediaUriRequest != null) {
                Log.w(TAG, "SetMediaUri() is called multiple times without prepare() nor play(). Previous call will be skipped.");
                setFutureResult(this.mPendingSetMediaUriRequest.result, 1);
                this.mPendingSetMediaUriRequest = null;
            }
            ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
            if (uri.toString().startsWith(MediaConstants.MEDIA_URI_SET_MEDIA_URI_PREFIX) && uri.getQueryParameterNames().size() == 1) {
                String next = uri.getQueryParameterNames().iterator().next();
                if (TextUtils.equals(next, MediaConstants.MEDIA_URI_QUERY_ID) || TextUtils.equals(next, "query") || TextUtils.equals(next, MediaConstants.MEDIA_URI_QUERY_URI)) {
                    this.mPendingSetMediaUriRequest = new SetMediaUriRequest(next, uri.getQueryParameter(next), bundle, resolvableFutureCreate);
                }
            }
            if (this.mPendingSetMediaUriRequest == null) {
                this.mPendingSetMediaUriRequest = new SetMediaUriRequest(MediaConstants.MEDIA_URI_QUERY_URI, uri.toString(), bundle, resolvableFutureCreate);
            }
            return resolvableFutureCreate;
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> updatePlaylistMetadata(MediaMetadata mediaMetadata) {
        return createFutureWithResult(-6);
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public MediaMetadata getPlaylistMetadata() {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return null;
            }
            return this.mPlaylistMetadata;
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> addPlaylistItem(int i, String str) {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            this.mControllerCompat.addQueueItem(MediaUtils.createMediaDescriptionCompat(str), i);
            return createFutureWithResult(0);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> removePlaylistItem(int i) {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            List<MediaSessionCompat.QueueItem> list = this.mQueue;
            if (list != null && i >= 0 && i < list.size()) {
                this.mControllerCompat.removeQueueItem(this.mQueue.get(i).getDescription());
                return createFutureWithResult(0);
            }
            return createFutureWithResult(-3);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> replacePlaylistItem(int i, String str) {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            List<MediaSessionCompat.QueueItem> list = this.mQueue;
            if (list != null && i >= 0 && i < list.size()) {
                this.mControllerCompat.removeQueueItem(this.mQueue.get(i).getDescription());
                this.mControllerCompat.addQueueItem(MediaUtils.createMediaDescriptionCompat(str), i);
                return createFutureWithResult(0);
            }
            return createFutureWithResult(-3);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> movePlaylistItem(int i, int i2) {
        return createFutureWithResult(-6);
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public MediaItem getCurrentMediaItem() {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return null;
            }
            return this.mCurrentMediaItem;
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public int getCurrentMediaItemIndex() {
        return this.mCurrentMediaItemIndex;
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> skipToPreviousItem() {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            this.mControllerCompat.getTransportControls().skipToPrevious();
            return createFutureWithResult(0);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> skipToNextItem() {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            this.mControllerCompat.getTransportControls().skipToNext();
            return createFutureWithResult(0);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> skipToPlaylistItem(int i) {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            this.mSkipToPlaylistIndex = i;
            this.mControllerCompat.getTransportControls().skipToQueueItem(this.mQueue.get(i).getQueueId());
            return createFutureWithResult(0);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public int getRepeatMode() {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return 0;
            }
            return this.mRepeatMode;
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> setRepeatMode(int i) {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            this.mControllerCompat.getTransportControls().setRepeatMode(i);
            return createFutureWithResult(0);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public int getShuffleMode() {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return 0;
            }
            return this.mShuffleMode;
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> setShuffleMode(int i) {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return createFutureWithResult(-100);
            }
            this.mControllerCompat.getTransportControls().setShuffleMode(i);
            return createFutureWithResult(0);
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public VideoSize getVideoSize() {
        Log.w(TAG, "Session doesn't support getting VideoSize");
        return new VideoSize(0, 0);
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> setSurface(Surface surface) {
        Log.w(TAG, "Session doesn't support setting Surface");
        return createFutureWithResult(-6);
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public List<SessionPlayer.TrackInfo> getTracks() {
        Log.w(TAG, "Session doesn't support getting TrackInfo");
        return Collections.emptyList();
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> selectTrack(SessionPlayer.TrackInfo trackInfo) {
        Log.w(TAG, "Session doesn't support selecting track");
        return createFutureWithResult(-6);
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public ListenableFuture<SessionResult> deselectTrack(SessionPlayer.TrackInfo trackInfo) {
        Log.w(TAG, "Session doesn't support deselecting track");
        return createFutureWithResult(-6);
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public SessionPlayer.TrackInfo getSelectedTrack(int i) {
        Log.w(TAG, "Session doesn't support getting selected track");
        return null;
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public SessionCommandGroup getAllowedCommands() {
        synchronized (this.mLock) {
            if (!this.mConnected) {
                Log.w(TAG, "Session isn't active", new IllegalStateException());
                return null;
            }
            return this.mAllowedCommands;
        }
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public Context getContext() {
        return this.mContext;
    }

    @Override // androidx.media2.session.MediaController.MediaControllerImpl
    public MediaBrowserCompat getBrowserCompat() {
        MediaBrowserCompat mediaBrowserCompat;
        synchronized (this.mLock) {
            mediaBrowserCompat = this.mBrowserCompat;
        }
        return mediaBrowserCompat;
    }

    void onConnectedNotLocked() {
        if (DEBUG) {
            Log.d(TAG, "onConnectedNotLocked token=" + this.mToken);
        }
        synchronized (this.mLock) {
            if (!this.mClosed && !this.mConnected) {
                this.mPlaybackStateCompat = this.mControllerCompat.getPlaybackState();
                this.mAllowedCommands = MediaUtils.convertToSessionCommandGroup(this.mControllerCompat.getFlags(), this.mPlaybackStateCompat);
                this.mPlayerState = MediaUtils.convertToPlayerState(this.mPlaybackStateCompat);
                PlaybackStateCompat playbackStateCompat = this.mPlaybackStateCompat;
                this.mBufferedPosition = playbackStateCompat == null ? Long.MIN_VALUE : playbackStateCompat.getBufferedPosition();
                final List<MediaSession.CommandButton> listConvertToCustomLayout = MediaUtils.convertToCustomLayout(this.mPlaybackStateCompat);
                this.mCustomLayout = listConvertToCustomLayout;
                final SessionCommandGroup sessionCommandGroup = this.mAllowedCommands;
                this.mPlaybackInfo = MediaUtils.toPlaybackInfo2(this.mControllerCompat.getPlaybackInfo());
                this.mRepeatMode = this.mControllerCompat.getRepeatMode();
                this.mShuffleMode = this.mControllerCompat.getShuffleMode();
                List<MediaSessionCompat.QueueItem> listRemoveNullElements = MediaUtils.removeNullElements(this.mControllerCompat.getQueue());
                this.mQueue = listRemoveNullElements;
                if (listRemoveNullElements == null || listRemoveNullElements.size() == 0) {
                    this.mQueue = null;
                    this.mPlaylist = null;
                } else {
                    this.mPlaylist = MediaUtils.convertQueueItemListToMediaItemList(this.mQueue);
                }
                this.mPlaylistMetadata = MediaUtils.convertToMediaMetadata(this.mControllerCompat.getQueueTitle());
                setCurrentMediaItemLocked(this.mControllerCompat.getMetadata());
                this.mConnected = true;
                this.mInstance.notifyAllControllerCallbacks(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.3
                    @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                    public void run(MediaController.ControllerCallback controllerCallback) {
                        controllerCallback.onConnected(MediaControllerImplLegacy.this.mInstance, sessionCommandGroup);
                    }
                });
                if (listConvertToCustomLayout.isEmpty()) {
                    return;
                }
                this.mInstance.notifyPrimaryControllerCallback(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.4
                    @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                    public void run(MediaController.ControllerCallback controllerCallback) {
                        controllerCallback.onSetCustomLayout(MediaControllerImplLegacy.this.mInstance, listConvertToCustomLayout);
                    }
                });
            }
        }
    }

    void connectToSession(MediaSessionCompat.Token token) {
        boolean zIsSessionReady;
        MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(this.mContext, token);
        synchronized (this.mLock) {
            this.mControllerCompat = mediaControllerCompat;
            this.mControllerCompatCallback = new ControllerCompatCallback();
            zIsSessionReady = this.mControllerCompat.isSessionReady();
            this.mControllerCompat.registerCallback(this.mControllerCompatCallback, this.mHandler);
        }
        if (zIsSessionReady) {
            return;
        }
        onConnectedNotLocked();
    }

    private void connectToService() {
        this.mHandler.post(new Runnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.5
            @Override // java.lang.Runnable
            public void run() {
                synchronized (MediaControllerImplLegacy.this.mLock) {
                    MediaControllerImplLegacy.this.mBrowserCompat = new MediaBrowserCompat(MediaControllerImplLegacy.this.mContext, MediaControllerImplLegacy.this.mToken.getComponentName(), MediaControllerImplLegacy.this.new ConnectionCallback(), null);
                    MediaControllerImplLegacy.this.mBrowserCompat.connect();
                }
            }
        });
    }

    void setCurrentMediaItemLocked(MediaMetadataCompat mediaMetadataCompat) {
        this.mMediaMetadataCompat = mediaMetadataCompat;
        int ratingType = this.mControllerCompat.getRatingType();
        if (mediaMetadataCompat == null) {
            this.mCurrentMediaItemIndex = -1;
            this.mCurrentMediaItem = null;
            return;
        }
        if (this.mQueue == null) {
            this.mCurrentMediaItemIndex = -1;
            this.mCurrentMediaItem = MediaUtils.convertToMediaItem(mediaMetadataCompat, ratingType);
            return;
        }
        PlaybackStateCompat playbackStateCompat = this.mPlaybackStateCompat;
        if (playbackStateCompat != null) {
            long activeQueueItemId = playbackStateCompat.getActiveQueueItemId();
            for (int i = 0; i < this.mQueue.size(); i++) {
                if (this.mQueue.get(i).getQueueId() == activeQueueItemId) {
                    this.mCurrentMediaItem = MediaUtils.convertToMediaItem(mediaMetadataCompat, ratingType);
                    this.mCurrentMediaItemIndex = i;
                    return;
                }
            }
        }
        String string = mediaMetadataCompat.getString("android.media.metadata.MEDIA_ID");
        if (string == null) {
            this.mCurrentMediaItemIndex = -1;
            this.mCurrentMediaItem = MediaUtils.convertToMediaItem(mediaMetadataCompat, ratingType);
            return;
        }
        int i2 = this.mSkipToPlaylistIndex;
        if (i2 >= 0 && i2 < this.mQueue.size() && TextUtils.equals(string, this.mQueue.get(this.mSkipToPlaylistIndex).getDescription().getMediaId())) {
            this.mCurrentMediaItem = MediaUtils.convertToMediaItem(mediaMetadataCompat, ratingType);
            this.mCurrentMediaItemIndex = this.mSkipToPlaylistIndex;
            this.mSkipToPlaylistIndex = -1;
            return;
        }
        for (int i3 = 0; i3 < this.mQueue.size(); i3++) {
            if (TextUtils.equals(string, this.mQueue.get(i3).getDescription().getMediaId())) {
                this.mCurrentMediaItemIndex = i3;
                this.mCurrentMediaItem = MediaUtils.convertToMediaItem(mediaMetadataCompat, ratingType);
                return;
            }
        }
        this.mCurrentMediaItemIndex = -1;
        this.mCurrentMediaItem = MediaUtils.convertToMediaItem(this.mMediaMetadataCompat, ratingType);
    }

    private class ConnectionCallback extends MediaBrowserCompat.ConnectionCallback {
        ConnectionCallback() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnected() {
            MediaBrowserCompat browserCompat = MediaControllerImplLegacy.this.getBrowserCompat();
            if (browserCompat != null) {
                MediaControllerImplLegacy.this.connectToSession(browserCompat.getSessionToken());
            } else if (MediaControllerImplLegacy.DEBUG) {
                Log.d(MediaControllerImplLegacy.TAG, "Controller is closed prematually", new IllegalStateException());
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionSuspended() {
            MediaControllerImplLegacy.this.close();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionFailed() {
            MediaControllerImplLegacy.this.close();
        }
    }

    private final class ControllerCompatCallback extends MediaControllerCompat.Callback {
        ControllerCompatCallback() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionReady() {
            boolean z;
            PlaybackStateCompat playbackState;
            int shuffleMode;
            int repeatMode;
            boolean zIsCaptioningEnabled;
            synchronized (MediaControllerImplLegacy.this.mLock) {
                z = MediaControllerImplLegacy.this.mConnected;
            }
            if (!z) {
                MediaControllerImplLegacy.this.onConnectedNotLocked();
                return;
            }
            synchronized (MediaControllerImplLegacy.this.mLock) {
                playbackState = MediaControllerImplLegacy.this.mControllerCompat.getPlaybackState();
                shuffleMode = MediaControllerImplLegacy.this.mControllerCompat.getShuffleMode();
                repeatMode = MediaControllerImplLegacy.this.mControllerCompat.getRepeatMode();
                zIsCaptioningEnabled = MediaControllerImplLegacy.this.mControllerCompat.isCaptioningEnabled();
            }
            onPlaybackStateChanged(playbackState);
            onShuffleModeChanged(shuffleMode);
            onRepeatModeChanged(repeatMode);
            onCaptioningEnabledChanged(zIsCaptioningEnabled);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionDestroyed() {
            MediaControllerImplLegacy.this.close();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionEvent(final String str, final Bundle bundle) {
            synchronized (MediaControllerImplLegacy.this.mLock) {
                if (!MediaControllerImplLegacy.this.mClosed && MediaControllerImplLegacy.this.mConnected) {
                    MediaControllerImplLegacy.this.mInstance.notifyPrimaryControllerCallback(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.1
                        @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                        public void run(MediaController.ControllerCallback controllerCallback) {
                            controllerCallback.onCustomCommand(MediaControllerImplLegacy.this.mInstance, new SessionCommand(str, null), bundle);
                        }
                    });
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onPlaybackStateChanged(final PlaybackStateCompat playbackStateCompat) {
            synchronized (MediaControllerImplLegacy.this.mLock) {
                if (!MediaControllerImplLegacy.this.mClosed && MediaControllerImplLegacy.this.mConnected) {
                    MediaItem mediaItem = MediaControllerImplLegacy.this.mCurrentMediaItem;
                    PlaybackStateCompat playbackStateCompat2 = MediaControllerImplLegacy.this.mPlaybackStateCompat;
                    MediaControllerImplLegacy.this.mPlaybackStateCompat = playbackStateCompat;
                    MediaControllerImplLegacy.this.mPlayerState = MediaUtils.convertToPlayerState(playbackStateCompat);
                    MediaControllerImplLegacy.this.mBufferedPosition = playbackStateCompat == null ? Long.MIN_VALUE : playbackStateCompat.getBufferedPosition();
                    if (MediaControllerImplLegacy.this.mQueue != null && playbackStateCompat != null) {
                        for (int i = 0; i < MediaControllerImplLegacy.this.mQueue.size(); i++) {
                            if (MediaControllerImplLegacy.this.mQueue.get(i).getQueueId() == playbackStateCompat.getActiveQueueItemId()) {
                                MediaControllerImplLegacy.this.mCurrentMediaItemIndex = i;
                                MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
                                mediaControllerImplLegacy.mCurrentMediaItem = mediaControllerImplLegacy.mPlaylist.get(i);
                            }
                        }
                    }
                    final MediaItem mediaItem2 = MediaControllerImplLegacy.this.mCurrentMediaItem;
                    List<MediaSession.CommandButton> list = MediaControllerImplLegacy.this.mCustomLayout;
                    MediaControllerImplLegacy.this.mCustomLayout = MediaUtils.convertToCustomLayout(playbackStateCompat);
                    final List<MediaSession.CommandButton> list2 = MediaControllerImplLegacy.this.mCustomLayout;
                    SessionCommandGroup sessionCommandGroup = MediaControllerImplLegacy.this.mAllowedCommands;
                    MediaControllerImplLegacy mediaControllerImplLegacy2 = MediaControllerImplLegacy.this;
                    mediaControllerImplLegacy2.mAllowedCommands = MediaUtils.convertToSessionCommandGroup(mediaControllerImplLegacy2.mControllerCompat.getFlags(), MediaControllerImplLegacy.this.mPlaybackStateCompat);
                    final SessionCommandGroup sessionCommandGroup2 = MediaControllerImplLegacy.this.mAllowedCommands;
                    if (mediaItem != mediaItem2) {
                        MediaControllerImplLegacy.this.mInstance.notifyAllControllerCallbacks(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.2
                            @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                            public void run(MediaController.ControllerCallback controllerCallback) {
                                controllerCallback.onCurrentMediaItemChanged(MediaControllerImplLegacy.this.mInstance, mediaItem2);
                            }
                        });
                    }
                    if (playbackStateCompat == null) {
                        if (playbackStateCompat2 != null) {
                            MediaControllerImplLegacy.this.mInstance.notifyAllControllerCallbacks(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.3
                                @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                                public void run(MediaController.ControllerCallback controllerCallback) {
                                    controllerCallback.onPlayerStateChanged(MediaControllerImplLegacy.this.mInstance, 0);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (playbackStateCompat2 == null || playbackStateCompat2.getState() != playbackStateCompat.getState()) {
                        MediaControllerImplLegacy.this.mInstance.notifyAllControllerCallbacks(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.4
                            @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                            public void run(MediaController.ControllerCallback controllerCallback) {
                                controllerCallback.onPlayerStateChanged(MediaControllerImplLegacy.this.mInstance, MediaUtils.convertToPlayerState(playbackStateCompat));
                            }
                        });
                    }
                    if (playbackStateCompat2 == null || playbackStateCompat2.getPlaybackSpeed() != playbackStateCompat.getPlaybackSpeed()) {
                        MediaControllerImplLegacy.this.mInstance.notifyAllControllerCallbacks(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.5
                            @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                            public void run(MediaController.ControllerCallback controllerCallback) {
                                controllerCallback.onPlaybackSpeedChanged(MediaControllerImplLegacy.this.mInstance, playbackStateCompat.getPlaybackSpeed());
                            }
                        });
                    }
                    if (playbackStateCompat2 != null) {
                        final long currentPosition = playbackStateCompat.getCurrentPosition(MediaControllerImplLegacy.this.mInstance.mTimeDiff);
                        if (Math.abs(currentPosition - playbackStateCompat2.getCurrentPosition(MediaControllerImplLegacy.this.mInstance.mTimeDiff)) > MediaControllerImplLegacy.POSITION_DIFF_TOLERANCE) {
                            MediaControllerImplLegacy.this.mInstance.notifyAllControllerCallbacks(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.6
                                @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                                public void run(MediaController.ControllerCallback controllerCallback) {
                                    controllerCallback.onSeekCompleted(MediaControllerImplLegacy.this.mInstance, currentPosition);
                                }
                            });
                        }
                    }
                    if (!sessionCommandGroup.equals(sessionCommandGroup2)) {
                        MediaControllerImplLegacy.this.mInstance.notifyAllControllerCallbacks(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.7
                            @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                            public void run(MediaController.ControllerCallback controllerCallback) {
                                controllerCallback.onAllowedCommandsChanged(MediaControllerImplLegacy.this.mInstance, sessionCommandGroup2);
                            }
                        });
                    }
                    if (list.size() == list2.size()) {
                        for (int i2 = 0; i2 < list2.size(); i2++) {
                            if (!ObjectsCompat.equals(list.get(i2).getCommand(), list2.get(i2).getCommand())) {
                                MediaControllerImplLegacy.this.mInstance.notifyPrimaryControllerCallback(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.8
                                    @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                                    public void run(MediaController.ControllerCallback controllerCallback) {
                                        controllerCallback.onSetCustomLayout(MediaControllerImplLegacy.this.mInstance, list2);
                                    }
                                });
                                break;
                            }
                        }
                    } else {
                        MediaControllerImplLegacy.this.mInstance.notifyPrimaryControllerCallback(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.8
                            @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                            public void run(MediaController.ControllerCallback controllerCallback) {
                                controllerCallback.onSetCustomLayout(MediaControllerImplLegacy.this.mInstance, list2);
                            }
                        });
                        break;
                    }
                    if (mediaItem2 == null) {
                        return;
                    }
                    final int bufferingState = MediaUtils.toBufferingState(playbackStateCompat.getState());
                    if (bufferingState != (playbackStateCompat2 != null ? MediaUtils.toBufferingState(playbackStateCompat2.getState()) : 0)) {
                        MediaControllerImplLegacy.this.mInstance.notifyAllControllerCallbacks(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.9
                            @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                            public void run(MediaController.ControllerCallback controllerCallback) {
                                controllerCallback.onBufferingStateChanged(MediaControllerImplLegacy.this.mInstance, mediaItem2, bufferingState);
                            }
                        });
                    }
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            synchronized (MediaControllerImplLegacy.this.mLock) {
                if (!MediaControllerImplLegacy.this.mClosed && MediaControllerImplLegacy.this.mConnected) {
                    MediaItem mediaItem = MediaControllerImplLegacy.this.mCurrentMediaItem;
                    MediaControllerImplLegacy.this.setCurrentMediaItemLocked(mediaMetadataCompat);
                    final MediaItem mediaItem2 = MediaControllerImplLegacy.this.mCurrentMediaItem;
                    if (mediaItem != mediaItem2) {
                        MediaControllerImplLegacy.this.mInstance.notifyAllControllerCallbacks(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.10
                            @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                            public void run(MediaController.ControllerCallback controllerCallback) {
                                controllerCallback.onCurrentMediaItemChanged(MediaControllerImplLegacy.this.mInstance, mediaItem2);
                            }
                        });
                    }
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
            synchronized (MediaControllerImplLegacy.this.mLock) {
                if (!MediaControllerImplLegacy.this.mClosed && MediaControllerImplLegacy.this.mConnected) {
                    MediaControllerImplLegacy.this.mQueue = MediaUtils.removeNullElements(list);
                    if (MediaControllerImplLegacy.this.mQueue == null || MediaControllerImplLegacy.this.mQueue.size() == 0) {
                        MediaControllerImplLegacy.this.mQueue = null;
                        MediaControllerImplLegacy.this.mPlaylist = null;
                    } else {
                        MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
                        mediaControllerImplLegacy.mPlaylist = MediaUtils.convertQueueItemListToMediaItemList(mediaControllerImplLegacy.mQueue);
                    }
                    final List<MediaItem> list2 = MediaControllerImplLegacy.this.mPlaylist;
                    final MediaMetadata mediaMetadata = MediaControllerImplLegacy.this.mPlaylistMetadata;
                    MediaControllerImplLegacy.this.mInstance.notifyAllControllerCallbacks(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.11
                        @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                        public void run(MediaController.ControllerCallback controllerCallback) {
                            controllerCallback.onPlaylistChanged(MediaControllerImplLegacy.this.mInstance, list2, mediaMetadata);
                        }
                    });
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            synchronized (MediaControllerImplLegacy.this.mLock) {
                if (!MediaControllerImplLegacy.this.mClosed && MediaControllerImplLegacy.this.mConnected) {
                    MediaControllerImplLegacy.this.mPlaylistMetadata = MediaUtils.convertToMediaMetadata(charSequence);
                    final MediaMetadata mediaMetadata = MediaControllerImplLegacy.this.mPlaylistMetadata;
                    MediaControllerImplLegacy.this.mInstance.notifyAllControllerCallbacks(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.12
                        @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                        public void run(MediaController.ControllerCallback controllerCallback) {
                            controllerCallback.onPlaylistMetadataChanged(MediaControllerImplLegacy.this.mInstance, mediaMetadata);
                        }
                    });
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onExtrasChanged(final Bundle bundle) {
            synchronized (MediaControllerImplLegacy.this.mLock) {
                if (!MediaControllerImplLegacy.this.mClosed && MediaControllerImplLegacy.this.mConnected) {
                    MediaControllerImplLegacy.this.mInstance.notifyPrimaryControllerCallback(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.13
                        @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                        public void run(MediaController.ControllerCallback controllerCallback) {
                            controllerCallback.onCustomCommand(MediaControllerImplLegacy.this.mInstance, new SessionCommand(MediaControllerImplLegacy.SESSION_COMMAND_ON_EXTRAS_CHANGED, null), bundle);
                        }
                    });
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onAudioInfoChanged(MediaControllerCompat.PlaybackInfo playbackInfo) {
            final MediaController.PlaybackInfo playbackInfo2 = MediaUtils.toPlaybackInfo2(playbackInfo);
            synchronized (MediaControllerImplLegacy.this.mLock) {
                if (!MediaControllerImplLegacy.this.mClosed && MediaControllerImplLegacy.this.mConnected) {
                    MediaControllerImplLegacy.this.mPlaybackInfo = playbackInfo2;
                    MediaControllerImplLegacy.this.mInstance.notifyAllControllerCallbacks(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.14
                        @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                        public void run(MediaController.ControllerCallback controllerCallback) {
                            controllerCallback.onPlaybackInfoChanged(MediaControllerImplLegacy.this.mInstance, playbackInfo2);
                        }
                    });
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onCaptioningEnabledChanged(final boolean z) {
            synchronized (MediaControllerImplLegacy.this.mLock) {
                if (!MediaControllerImplLegacy.this.mClosed && MediaControllerImplLegacy.this.mConnected) {
                    MediaControllerImplLegacy.this.mInstance.notifyPrimaryControllerCallback(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.15
                        @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                        public void run(MediaController.ControllerCallback controllerCallback) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("androidx.media2.argument.CAPTIONING_ENABLED", z);
                            controllerCallback.onCustomCommand(MediaControllerImplLegacy.this.mInstance, new SessionCommand(MediaControllerImplLegacy.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED, null), bundle);
                        }
                    });
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onRepeatModeChanged(final int i) {
            synchronized (MediaControllerImplLegacy.this.mLock) {
                if (!MediaControllerImplLegacy.this.mClosed && MediaControllerImplLegacy.this.mConnected) {
                    MediaControllerImplLegacy.this.mRepeatMode = i;
                    MediaControllerImplLegacy.this.mInstance.notifyAllControllerCallbacks(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.16
                        @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                        public void run(MediaController.ControllerCallback controllerCallback) {
                            controllerCallback.onRepeatModeChanged(MediaControllerImplLegacy.this.mInstance, i);
                        }
                    });
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onShuffleModeChanged(final int i) {
            synchronized (MediaControllerImplLegacy.this.mLock) {
                if (!MediaControllerImplLegacy.this.mClosed && MediaControllerImplLegacy.this.mConnected) {
                    MediaControllerImplLegacy.this.mShuffleMode = i;
                    MediaControllerImplLegacy.this.mInstance.notifyAllControllerCallbacks(new MediaController.ControllerCallbackRunnable() { // from class: androidx.media2.session.MediaControllerImplLegacy.ControllerCompatCallback.17
                        @Override // androidx.media2.session.MediaController.ControllerCallbackRunnable
                        public void run(MediaController.ControllerCallback controllerCallback) {
                            controllerCallback.onShuffleModeChanged(MediaControllerImplLegacy.this.mInstance, i);
                        }
                    });
                }
            }
        }
    }

    private static final class SetMediaUriRequest {
        public final Bundle extras;
        public final ResolvableFuture<SessionResult> result;
        public final String type;
        public final String value;

        SetMediaUriRequest(String str, String str2, Bundle bundle, ResolvableFuture<SessionResult> resolvableFuture) {
            this.type = str;
            this.value = str2;
            this.extras = bundle;
            this.result = resolvableFuture;
        }
    }
}
