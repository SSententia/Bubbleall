package androidx.media2.session;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.media2.common.MediaItem;
import androidx.media2.common.SessionPlayer;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class SessionResult extends CustomVersionedParcelable implements RemoteResult {
    public static final int RESULT_SUCCESS = 0;
    long mCompletionTime;
    Bundle mCustomCommandResult;
    MediaItem mItem;
    MediaItem mParcelableItem;
    int mResultCode;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ResultCode {
    }

    public SessionResult(int i, Bundle bundle) {
        this(i, bundle, null, SystemClock.elapsedRealtime());
    }

    SessionResult() {
    }

    SessionResult(int i) {
        this(i, null);
    }

    SessionResult(int i, Bundle bundle, MediaItem mediaItem) {
        this(i, bundle, mediaItem, SystemClock.elapsedRealtime());
    }

    SessionResult(int i, Bundle bundle, MediaItem mediaItem, long j) {
        this.mResultCode = i;
        this.mCustomCommandResult = bundle;
        this.mItem = mediaItem;
        this.mCompletionTime = j;
    }

    static SessionResult from(SessionPlayer.PlayerResult playerResult) {
        if (playerResult == null) {
            return null;
        }
        return new SessionResult(playerResult.getResultCode(), null, playerResult.getMediaItem(), playerResult.getCompletionTime());
    }

    static ListenableFuture<SessionResult> createFutureWithResult(int i) {
        ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        resolvableFutureCreate.set(new SessionResult(i));
        return resolvableFutureCreate;
    }

    @Override // androidx.media2.common.BaseResult
    public int getResultCode() {
        return this.mResultCode;
    }

    public Bundle getCustomCommandResult() {
        return this.mCustomCommandResult;
    }

    @Override // androidx.media2.common.BaseResult
    public long getCompletionTime() {
        return this.mCompletionTime;
    }

    @Override // androidx.media2.common.BaseResult
    public MediaItem getMediaItem() {
        return this.mItem;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean z) {
        MediaItem mediaItem = this.mItem;
        if (mediaItem != null) {
            synchronized (mediaItem) {
                if (this.mParcelableItem == null) {
                    this.mParcelableItem = MediaUtils.upcastForPreparceling(this.mItem);
                }
            }
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        this.mItem = this.mParcelableItem;
    }
}
