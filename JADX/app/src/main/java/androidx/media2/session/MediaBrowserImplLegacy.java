package androidx.media2.session;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserImplLegacy extends MediaControllerImplLegacy implements MediaBrowser.MediaBrowserImpl {
    private static final String TAG = "MB2ImplLegacy";
    final HashMap<MediaLibraryService.LibraryParams, MediaBrowserCompat> mBrowserCompats;
    private final HashMap<String, List<SubscribeCallback>> mSubscribeCallbacks;

    MediaBrowserImplLegacy(Context context, MediaBrowser mediaBrowser, SessionToken sessionToken) {
        super(context, mediaBrowser, sessionToken);
        this.mBrowserCompats = new HashMap<>();
        this.mSubscribeCallbacks = new HashMap<>();
    }

    MediaBrowser getMediaBrowser() {
        return (MediaBrowser) this.mInstance;
    }

    @Override // androidx.media2.session.MediaControllerImplLegacy, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.mLock) {
            Iterator<MediaBrowserCompat> it = this.mBrowserCompats.values().iterator();
            while (it.hasNext()) {
                it.next().disconnect();
            }
            this.mBrowserCompats.clear();
            super.close();
        }
    }

    @Override // androidx.media2.session.MediaBrowser.MediaBrowserImpl
    public ListenableFuture<LibraryResult> getLibraryRoot(final MediaLibraryService.LibraryParams libraryParams) {
        final ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        MediaBrowserCompat browserCompat = getBrowserCompat(libraryParams);
        if (browserCompat != null) {
            resolvableFutureCreate.set(new LibraryResult(0, createRootMediaItem(browserCompat), (MediaLibraryService.LibraryParams) null));
        } else {
            this.mHandler.post(new Runnable() { // from class: androidx.media2.session.MediaBrowserImplLegacy.1
                @Override // java.lang.Runnable
                public void run() {
                    MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(MediaBrowserImplLegacy.this.getContext(), MediaBrowserImplLegacy.this.getConnectedToken().getComponentName(), MediaBrowserImplLegacy.this.new GetLibraryRootCallback(resolvableFutureCreate, libraryParams), MediaUtils.convertToRootHints(libraryParams));
                    synchronized (MediaBrowserImplLegacy.this.mLock) {
                        MediaBrowserImplLegacy.this.mBrowserCompats.put(libraryParams, mediaBrowserCompat);
                    }
                    mediaBrowserCompat.connect();
                }
            });
        }
        return resolvableFutureCreate;
    }

    @Override // androidx.media2.session.MediaBrowser.MediaBrowserImpl
    public ListenableFuture<LibraryResult> subscribe(String str, MediaLibraryService.LibraryParams libraryParams) {
        MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return LibraryResult.createFutureWithResult(-100);
        }
        ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        SubscribeCallback subscribeCallback = new SubscribeCallback(resolvableFutureCreate);
        synchronized (this.mLock) {
            List<SubscribeCallback> arrayList = this.mSubscribeCallbacks.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.mSubscribeCallbacks.put(str, arrayList);
            }
            arrayList.add(subscribeCallback);
        }
        browserCompat.subscribe(str, createOptions(libraryParams), subscribeCallback);
        return resolvableFutureCreate;
    }

    @Override // androidx.media2.session.MediaBrowser.MediaBrowserImpl
    public ListenableFuture<LibraryResult> unsubscribe(String str) {
        MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return LibraryResult.createFutureWithResult(-100);
        }
        synchronized (this.mLock) {
            List<SubscribeCallback> list = this.mSubscribeCallbacks.get(str);
            if (list == null) {
                return LibraryResult.createFutureWithResult(-3);
            }
            for (int i = 0; i < list.size(); i++) {
                browserCompat.unsubscribe(str, list.get(i));
            }
            return LibraryResult.createFutureWithResult(0);
        }
    }

    @Override // androidx.media2.session.MediaBrowser.MediaBrowserImpl
    public ListenableFuture<LibraryResult> getChildren(String str, int i, int i2, MediaLibraryService.LibraryParams libraryParams) {
        MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return LibraryResult.createFutureWithResult(-100);
        }
        ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        browserCompat.subscribe(str, createOptions(libraryParams, i, i2), new GetChildrenCallback(resolvableFutureCreate, str));
        return resolvableFutureCreate;
    }

    @Override // androidx.media2.session.MediaBrowser.MediaBrowserImpl
    public ListenableFuture<LibraryResult> getItem(String str) {
        MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return LibraryResult.createFutureWithResult(-100);
        }
        final ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        browserCompat.getItem(str, new MediaBrowserCompat.ItemCallback() { // from class: androidx.media2.session.MediaBrowserImplLegacy.2
            @Override // android.support.v4.media.MediaBrowserCompat.ItemCallback
            public void onItemLoaded(final MediaBrowserCompat.MediaItem mediaItem) {
                MediaBrowserImplLegacy.this.mHandler.post(new Runnable() { // from class: androidx.media2.session.MediaBrowserImplLegacy.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (mediaItem != null) {
                            resolvableFutureCreate.set(new LibraryResult(0, MediaUtils.convertToMediaItem(mediaItem), (MediaLibraryService.LibraryParams) null));
                        } else {
                            resolvableFutureCreate.set(new LibraryResult(-3));
                        }
                    }
                });
            }

            @Override // android.support.v4.media.MediaBrowserCompat.ItemCallback
            public void onError(String str2) {
                MediaBrowserImplLegacy.this.mHandler.post(new Runnable() { // from class: androidx.media2.session.MediaBrowserImplLegacy.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        resolvableFutureCreate.set(new LibraryResult(-1));
                    }
                });
            }
        });
        return resolvableFutureCreate;
    }

    @Override // androidx.media2.session.MediaBrowser.MediaBrowserImpl
    public ListenableFuture<LibraryResult> search(String str, MediaLibraryService.LibraryParams libraryParams) {
        MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return LibraryResult.createFutureWithResult(-100);
        }
        browserCompat.search(str, getExtras(libraryParams), new MediaBrowserCompat.SearchCallback() { // from class: androidx.media2.session.MediaBrowserImplLegacy.3
            @Override // android.support.v4.media.MediaBrowserCompat.SearchCallback
            public void onSearchResult(final String str2, Bundle bundle, final List<MediaBrowserCompat.MediaItem> list) {
                MediaBrowserImplLegacy.this.getMediaBrowser().notifyBrowserCallback(new MediaBrowser.BrowserCallbackRunnable() { // from class: androidx.media2.session.MediaBrowserImplLegacy.3.1
                    @Override // androidx.media2.session.MediaBrowser.BrowserCallbackRunnable
                    public void run(MediaBrowser.BrowserCallback browserCallback) {
                        browserCallback.onSearchResultChanged(MediaBrowserImplLegacy.this.getMediaBrowser(), str2, list.size(), null);
                    }
                });
            }

            @Override // android.support.v4.media.MediaBrowserCompat.SearchCallback
            public void onError(final String str2, Bundle bundle) {
                MediaBrowserImplLegacy.this.getMediaBrowser().notifyBrowserCallback(new MediaBrowser.BrowserCallbackRunnable() { // from class: androidx.media2.session.MediaBrowserImplLegacy.3.2
                    @Override // androidx.media2.session.MediaBrowser.BrowserCallbackRunnable
                    public void run(MediaBrowser.BrowserCallback browserCallback) {
                        browserCallback.onSearchResultChanged(MediaBrowserImplLegacy.this.getMediaBrowser(), str2, 0, null);
                    }
                });
            }
        });
        return LibraryResult.createFutureWithResult(0);
    }

    @Override // androidx.media2.session.MediaBrowser.MediaBrowserImpl
    public ListenableFuture<LibraryResult> getSearchResult(String str, int i, int i2, MediaLibraryService.LibraryParams libraryParams) {
        MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return LibraryResult.createFutureWithResult(-100);
        }
        final ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        browserCompat.search(str, createOptions(libraryParams, i, i2), new MediaBrowserCompat.SearchCallback() { // from class: androidx.media2.session.MediaBrowserImplLegacy.4
            @Override // android.support.v4.media.MediaBrowserCompat.SearchCallback
            public void onSearchResult(String str2, Bundle bundle, final List<MediaBrowserCompat.MediaItem> list) {
                MediaBrowserImplLegacy.this.mHandler.post(new Runnable() { // from class: androidx.media2.session.MediaBrowserImplLegacy.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        resolvableFutureCreate.set(new LibraryResult(0, MediaUtils.convertMediaItemListToMediaItemList(list), (MediaLibraryService.LibraryParams) null));
                    }
                });
            }

            @Override // android.support.v4.media.MediaBrowserCompat.SearchCallback
            public void onError(String str2, Bundle bundle) {
                MediaBrowserImplLegacy.this.mHandler.post(new Runnable() { // from class: androidx.media2.session.MediaBrowserImplLegacy.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        resolvableFutureCreate.set(new LibraryResult(-1));
                    }
                });
            }
        });
        return resolvableFutureCreate;
    }

    private MediaBrowserCompat getBrowserCompat(MediaLibraryService.LibraryParams libraryParams) {
        MediaBrowserCompat mediaBrowserCompat;
        synchronized (this.mLock) {
            mediaBrowserCompat = this.mBrowserCompats.get(libraryParams);
        }
        return mediaBrowserCompat;
    }

    private static Bundle createOptions(MediaLibraryService.LibraryParams libraryParams) {
        return (libraryParams == null || libraryParams.getExtras() == null) ? new Bundle() : new Bundle(libraryParams.getExtras());
    }

    private static Bundle createOptions(MediaLibraryService.LibraryParams libraryParams, int i, int i2) {
        Bundle bundleCreateOptions = createOptions(libraryParams);
        bundleCreateOptions.putInt(MediaBrowserCompat.EXTRA_PAGE, i);
        bundleCreateOptions.putInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, i2);
        return bundleCreateOptions;
    }

    private static Bundle getExtras(MediaLibraryService.LibraryParams libraryParams) {
        if (libraryParams != null) {
            return libraryParams.getExtras();
        }
        return null;
    }

    MediaItem createRootMediaItem(MediaBrowserCompat mediaBrowserCompat) {
        return new MediaItem.Builder().setMetadata(new MediaMetadata.Builder().putString("android.media.metadata.MEDIA_ID", mediaBrowserCompat.getRoot()).putLong(MediaMetadata.METADATA_KEY_BROWSABLE, 0L).putLong(MediaMetadata.METADATA_KEY_PLAYABLE, 0L).setExtras(mediaBrowserCompat.getExtras()).build()).build();
    }

    private class GetLibraryRootCallback extends MediaBrowserCompat.ConnectionCallback {
        final MediaLibraryService.LibraryParams mParams;
        final ResolvableFuture<LibraryResult> mResult;

        GetLibraryRootCallback(ResolvableFuture<LibraryResult> resolvableFuture, MediaLibraryService.LibraryParams libraryParams) {
            this.mResult = resolvableFuture;
            this.mParams = libraryParams;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnected() {
            MediaBrowserCompat mediaBrowserCompat;
            synchronized (MediaBrowserImplLegacy.this.mLock) {
                mediaBrowserCompat = MediaBrowserImplLegacy.this.mBrowserCompats.get(this.mParams);
            }
            if (mediaBrowserCompat == null) {
                this.mResult.set(new LibraryResult(-1));
            } else {
                this.mResult.set(new LibraryResult(0, MediaBrowserImplLegacy.this.createRootMediaItem(mediaBrowserCompat), MediaUtils.convertToLibraryParams(MediaBrowserImplLegacy.this.mContext, mediaBrowserCompat.getExtras())));
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionSuspended() {
            onConnectionFailed();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionFailed() {
            this.mResult.set(new LibraryResult(-3));
            MediaBrowserImplLegacy.this.close();
        }
    }

    private class SubscribeCallback extends MediaBrowserCompat.SubscriptionCallback {
        final ResolvableFuture<LibraryResult> mFuture;

        SubscribeCallback(ResolvableFuture<LibraryResult> resolvableFuture) {
            this.mFuture = resolvableFuture;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public void onError(String str) {
            onErrorInternal();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public void onError(String str, Bundle bundle) {
            onErrorInternal();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowserCompat.MediaItem> list) {
            onChildrenLoadedInternal(str, list);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
            onChildrenLoadedInternal(str, list);
        }

        private void onErrorInternal() {
            this.mFuture.set(new LibraryResult(-1));
        }

        private void onChildrenLoadedInternal(final String str, List<MediaBrowserCompat.MediaItem> list) {
            if (TextUtils.isEmpty(str)) {
                Log.w(MediaBrowserImplLegacy.TAG, "SubscribeCallback.onChildrenLoaded(): Ignoring empty parentId");
                return;
            }
            MediaBrowserCompat browserCompat = MediaBrowserImplLegacy.this.getBrowserCompat();
            if (browserCompat == null || list == null) {
                return;
            }
            final int size = list.size();
            final MediaLibraryService.LibraryParams libraryParamsConvertToLibraryParams = MediaUtils.convertToLibraryParams(MediaBrowserImplLegacy.this.mContext, browserCompat.getNotifyChildrenChangedOptions());
            MediaBrowserImplLegacy.this.getMediaBrowser().notifyBrowserCallback(new MediaBrowser.BrowserCallbackRunnable() { // from class: androidx.media2.session.MediaBrowserImplLegacy.SubscribeCallback.1
                @Override // androidx.media2.session.MediaBrowser.BrowserCallbackRunnable
                public void run(MediaBrowser.BrowserCallback browserCallback) {
                    browserCallback.onChildrenChanged(MediaBrowserImplLegacy.this.getMediaBrowser(), str, size, libraryParamsConvertToLibraryParams);
                }
            });
            this.mFuture.set(new LibraryResult(0));
        }
    }

    private class GetChildrenCallback extends MediaBrowserCompat.SubscriptionCallback {
        final ResolvableFuture<LibraryResult> mFuture;
        final String mParentId;

        GetChildrenCallback(ResolvableFuture<LibraryResult> resolvableFuture, String str) {
            this.mFuture = resolvableFuture;
            this.mParentId = str;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public void onError(String str) {
            onErrorInternal();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public void onError(String str, Bundle bundle) {
            onErrorInternal();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowserCompat.MediaItem> list) {
            onChildrenLoadedInternal(str, list);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
            onChildrenLoadedInternal(str, list);
        }

        private void onErrorInternal() {
            this.mFuture.set(new LibraryResult(-1));
        }

        private void onChildrenLoadedInternal(String str, List<MediaBrowserCompat.MediaItem> list) {
            if (TextUtils.isEmpty(str)) {
                Log.w(MediaBrowserImplLegacy.TAG, "GetChildrenCallback.onChildrenLoaded(): Ignoring empty parentId");
                return;
            }
            MediaBrowserCompat browserCompat = MediaBrowserImplLegacy.this.getBrowserCompat();
            if (browserCompat == null) {
                this.mFuture.set(new LibraryResult(-100));
                return;
            }
            browserCompat.unsubscribe(this.mParentId, this);
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                this.mFuture.set(new LibraryResult(-1));
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(MediaUtils.convertToMediaItem(list.get(i)));
            }
            this.mFuture.set(new LibraryResult(0, arrayList, (MediaLibraryService.LibraryParams) null));
        }
    }
}
