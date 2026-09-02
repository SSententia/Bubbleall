package androidx.media2.session;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class MediaBrowser extends MediaController {
    static final String TAG = "MediaBrowser";
    static final boolean DEBUG = Log.isLoggable(TAG, 3);

    public static class BrowserCallback extends MediaController.ControllerCallback {
        public void onChildrenChanged(MediaBrowser mediaBrowser, String str, int i, MediaLibraryService.LibraryParams libraryParams) {
        }

        public void onSearchResultChanged(MediaBrowser mediaBrowser, String str, int i, MediaLibraryService.LibraryParams libraryParams) {
        }
    }

    interface BrowserCallbackRunnable {
        void run(BrowserCallback browserCallback);
    }

    interface MediaBrowserImpl extends MediaController.MediaControllerImpl {
        ListenableFuture<LibraryResult> getChildren(String str, int i, int i2, MediaLibraryService.LibraryParams libraryParams);

        ListenableFuture<LibraryResult> getItem(String str);

        ListenableFuture<LibraryResult> getLibraryRoot(MediaLibraryService.LibraryParams libraryParams);

        ListenableFuture<LibraryResult> getSearchResult(String str, int i, int i2, MediaLibraryService.LibraryParams libraryParams);

        ListenableFuture<LibraryResult> search(String str, MediaLibraryService.LibraryParams libraryParams);

        ListenableFuture<LibraryResult> subscribe(String str, MediaLibraryService.LibraryParams libraryParams);

        ListenableFuture<LibraryResult> unsubscribe(String str);
    }

    MediaBrowser(Context context, SessionToken sessionToken, Bundle bundle, Executor executor, BrowserCallback browserCallback) {
        super(context, sessionToken, bundle, executor, browserCallback);
    }

    MediaBrowser(Context context, MediaSessionCompat.Token token, Bundle bundle, Executor executor, BrowserCallback browserCallback) {
        super(context, token, bundle, executor, browserCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.media2.session.MediaController
    public MediaBrowserImpl createImpl(Context context, SessionToken sessionToken, Bundle bundle) {
        if (sessionToken.isLegacySession()) {
            return new MediaBrowserImplLegacy(context, this, sessionToken);
        }
        return new MediaBrowserImplBase(context, this, sessionToken, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.media2.session.MediaController
    public MediaBrowserImpl getImpl() {
        return (MediaBrowserImpl) super.getImpl();
    }

    public ListenableFuture<LibraryResult> getLibraryRoot(MediaLibraryService.LibraryParams libraryParams) {
        if (isConnected()) {
            return getImpl().getLibraryRoot(libraryParams);
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<LibraryResult> subscribe(String str, MediaLibraryService.LibraryParams libraryParams) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId shouldn't be empty");
        }
        if (isConnected()) {
            return getImpl().subscribe(str, libraryParams);
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<LibraryResult> unsubscribe(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId shouldn't be empty");
        }
        if (isConnected()) {
            return getImpl().unsubscribe(str);
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<LibraryResult> getChildren(String str, int i, int i2, MediaLibraryService.LibraryParams libraryParams) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId shouldn't be empty");
        }
        if (i < 0) {
            throw new IllegalArgumentException("page shouldn't be negative");
        }
        if (i2 < 1) {
            throw new IllegalArgumentException("pageSize shouldn't be less than 1");
        }
        if (isConnected()) {
            return getImpl().getChildren(str, i, i2, libraryParams);
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<LibraryResult> getItem(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("mediaId shouldn't be empty");
        }
        if (isConnected()) {
            return getImpl().getItem(str);
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<LibraryResult> search(String str, MediaLibraryService.LibraryParams libraryParams) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query shouldn't be empty");
        }
        if (isConnected()) {
            return getImpl().search(str, libraryParams);
        }
        return createDisconnectedFuture();
    }

    public ListenableFuture<LibraryResult> getSearchResult(String str, int i, int i2, MediaLibraryService.LibraryParams libraryParams) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query shouldn't be empty");
        }
        if (i < 0) {
            throw new IllegalArgumentException("page shouldn't be negative");
        }
        if (i2 < 1) {
            throw new IllegalArgumentException("pageSize shouldn't be less than 1");
        }
        if (isConnected()) {
            return getImpl().getSearchResult(str, i, i2, libraryParams);
        }
        return createDisconnectedFuture();
    }

    void notifyBrowserCallback(final BrowserCallbackRunnable browserCallbackRunnable) {
        if (this.mPrimaryCallback == null || this.mPrimaryCallbackExecutor == null) {
            return;
        }
        this.mPrimaryCallbackExecutor.execute(new Runnable() { // from class: androidx.media2.session.MediaBrowser.1
            @Override // java.lang.Runnable
            public void run() {
                browserCallbackRunnable.run((BrowserCallback) MediaBrowser.this.mPrimaryCallback);
            }
        });
    }

    public static final class Builder extends MediaController.BuilderBase<MediaBrowser, Builder, BrowserCallback> {
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
        public Builder setControllerCallback(Executor executor, BrowserCallback browserCallback) {
            return (Builder) super.setControllerCallback(executor, browserCallback);
        }

        @Override // androidx.media2.session.MediaController.BuilderBase
        public Builder setConnectionHints(Bundle bundle) {
            return (Builder) super.setConnectionHints(bundle);
        }

        @Override // androidx.media2.session.MediaController.BuilderBase
        public MediaBrowser build() {
            if (this.mToken == null && this.mCompatToken == null) {
                throw new IllegalArgumentException("token and compat token shouldn't be both null");
            }
            if (this.mToken != null) {
                return new MediaBrowser(this.mContext, this.mToken, this.mConnectionHints, this.mCallbackExecutor, (BrowserCallback) this.mCallback);
            }
            return new MediaBrowser(this.mContext, this.mCompatToken, this.mConnectionHints, this.mCallbackExecutor, (BrowserCallback) this.mCallback);
        }
    }

    private static ListenableFuture<LibraryResult> createDisconnectedFuture() {
        return LibraryResult.createFutureWithResult(-100);
    }
}
