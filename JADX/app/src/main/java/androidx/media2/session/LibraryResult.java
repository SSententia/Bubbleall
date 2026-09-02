package androidx.media2.session;

import android.os.SystemClock;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.media2.common.MediaItem;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LibraryResult extends CustomVersionedParcelable implements RemoteResult {
    long mCompletionTime;
    MediaItem mItem;
    List<MediaItem> mItemList;
    ParcelImplListSlice mItemListSlice;
    MediaLibraryService.LibraryParams mParams;
    MediaItem mParcelableItem;
    int mResultCode;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ResultCode {
    }

    LibraryResult() {
    }

    public LibraryResult(int i) {
        this(i, null, null, null);
    }

    public LibraryResult(int i, MediaItem mediaItem, MediaLibraryService.LibraryParams libraryParams) {
        this(i, mediaItem, null, libraryParams);
    }

    public LibraryResult(int i, List<MediaItem> list, MediaLibraryService.LibraryParams libraryParams) {
        this(i, null, list, libraryParams);
    }

    private LibraryResult(int i, MediaItem mediaItem, List<MediaItem> list, MediaLibraryService.LibraryParams libraryParams) {
        this.mResultCode = i;
        this.mCompletionTime = SystemClock.elapsedRealtime();
        this.mItem = mediaItem;
        this.mItemList = list;
        this.mParams = libraryParams;
    }

    static ListenableFuture<LibraryResult> createFutureWithResult(int i) {
        ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        resolvableFutureCreate.set(new LibraryResult(i));
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

    public List<MediaItem> getMediaItems() {
        return this.mItemList;
    }

    public MediaLibraryService.LibraryParams getLibraryParams() {
        return this.mParams;
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
        List<MediaItem> list = this.mItemList;
        if (list != null) {
            synchronized (list) {
                if (this.mItemListSlice == null) {
                    this.mItemListSlice = MediaUtils.convertMediaItemListToParcelImplListSlice(this.mItemList);
                }
            }
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        this.mItem = this.mParcelableItem;
        this.mItemList = MediaUtils.convertParcelImplListSliceToMediaItemList(this.mItemListSlice);
    }
}
