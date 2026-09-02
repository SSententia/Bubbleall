package androidx.media2.session;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.media2.common.MediaParcelUtils;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserImplBase extends MediaControllerImplBase implements MediaBrowser.MediaBrowserImpl {
    private static final LibraryResult RESULT_WHEN_CLOSED = new LibraryResult(1);

    @FunctionalInterface
    private interface RemoteLibrarySessionTask {
        void run(IMediaSession iMediaSession, int i) throws RemoteException;
    }

    MediaBrowserImplBase(Context context, MediaController mediaController, SessionToken sessionToken, Bundle bundle) {
        super(context, mediaController, sessionToken, bundle);
    }

    MediaBrowser getMediaBrowser() {
        return (MediaBrowser) this.mInstance;
    }

    @Override // androidx.media2.session.MediaBrowser.MediaBrowserImpl
    public ListenableFuture<LibraryResult> getLibraryRoot(final MediaLibraryService.LibraryParams libraryParams) {
        return dispatchRemoteLibrarySessionTask(SessionCommand.COMMAND_CODE_LIBRARY_GET_LIBRARY_ROOT, new RemoteLibrarySessionTask() { // from class: androidx.media2.session.MediaBrowserImplBase.1
            @Override // androidx.media2.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(IMediaSession iMediaSession, int i) throws RemoteException {
                iMediaSession.getLibraryRoot(MediaBrowserImplBase.this.mControllerStub, i, MediaParcelUtils.toParcelable(libraryParams));
            }
        });
    }

    @Override // androidx.media2.session.MediaBrowser.MediaBrowserImpl
    public ListenableFuture<LibraryResult> subscribe(final String str, final MediaLibraryService.LibraryParams libraryParams) {
        return dispatchRemoteLibrarySessionTask(SessionCommand.COMMAND_CODE_LIBRARY_SUBSCRIBE, new RemoteLibrarySessionTask() { // from class: androidx.media2.session.MediaBrowserImplBase.2
            @Override // androidx.media2.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(IMediaSession iMediaSession, int i) throws RemoteException {
                iMediaSession.subscribe(MediaBrowserImplBase.this.mControllerStub, i, str, MediaParcelUtils.toParcelable(libraryParams));
            }
        });
    }

    @Override // androidx.media2.session.MediaBrowser.MediaBrowserImpl
    public ListenableFuture<LibraryResult> unsubscribe(final String str) {
        return dispatchRemoteLibrarySessionTask(SessionCommand.COMMAND_CODE_LIBRARY_UNSUBSCRIBE, new RemoteLibrarySessionTask() { // from class: androidx.media2.session.MediaBrowserImplBase.3
            @Override // androidx.media2.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(IMediaSession iMediaSession, int i) throws RemoteException {
                iMediaSession.unsubscribe(MediaBrowserImplBase.this.mControllerStub, i, str);
            }
        });
    }

    @Override // androidx.media2.session.MediaBrowser.MediaBrowserImpl
    public ListenableFuture<LibraryResult> getChildren(final String str, final int i, final int i2, final MediaLibraryService.LibraryParams libraryParams) {
        return dispatchRemoteLibrarySessionTask(SessionCommand.COMMAND_CODE_LIBRARY_GET_CHILDREN, new RemoteLibrarySessionTask() { // from class: androidx.media2.session.MediaBrowserImplBase.4
            @Override // androidx.media2.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(IMediaSession iMediaSession, int i3) throws RemoteException {
                iMediaSession.getChildren(MediaBrowserImplBase.this.mControllerStub, i3, str, i, i2, MediaParcelUtils.toParcelable(libraryParams));
            }
        });
    }

    @Override // androidx.media2.session.MediaBrowser.MediaBrowserImpl
    public ListenableFuture<LibraryResult> getItem(final String str) {
        return dispatchRemoteLibrarySessionTask(SessionCommand.COMMAND_CODE_LIBRARY_GET_ITEM, new RemoteLibrarySessionTask() { // from class: androidx.media2.session.MediaBrowserImplBase.5
            @Override // androidx.media2.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(IMediaSession iMediaSession, int i) throws RemoteException {
                iMediaSession.getItem(MediaBrowserImplBase.this.mControllerStub, i, str);
            }
        });
    }

    @Override // androidx.media2.session.MediaBrowser.MediaBrowserImpl
    public ListenableFuture<LibraryResult> search(final String str, final MediaLibraryService.LibraryParams libraryParams) {
        return dispatchRemoteLibrarySessionTask(SessionCommand.COMMAND_CODE_LIBRARY_SEARCH, new RemoteLibrarySessionTask() { // from class: androidx.media2.session.MediaBrowserImplBase.6
            @Override // androidx.media2.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(IMediaSession iMediaSession, int i) throws RemoteException {
                iMediaSession.search(MediaBrowserImplBase.this.mControllerStub, i, str, MediaParcelUtils.toParcelable(libraryParams));
            }
        });
    }

    @Override // androidx.media2.session.MediaBrowser.MediaBrowserImpl
    public ListenableFuture<LibraryResult> getSearchResult(final String str, final int i, final int i2, final MediaLibraryService.LibraryParams libraryParams) {
        return dispatchRemoteLibrarySessionTask(SessionCommand.COMMAND_CODE_LIBRARY_GET_SEARCH_RESULT, new RemoteLibrarySessionTask() { // from class: androidx.media2.session.MediaBrowserImplBase.7
            @Override // androidx.media2.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(IMediaSession iMediaSession, int i3) throws RemoteException {
                iMediaSession.getSearchResult(MediaBrowserImplBase.this.mControllerStub, i3, str, i, i2, MediaParcelUtils.toParcelable(libraryParams));
            }
        });
    }

    void notifySearchResultChanged(final String str, final int i, final MediaLibraryService.LibraryParams libraryParams) {
        getMediaBrowser().notifyBrowserCallback(new MediaBrowser.BrowserCallbackRunnable() { // from class: androidx.media2.session.MediaBrowserImplBase.8
            @Override // androidx.media2.session.MediaBrowser.BrowserCallbackRunnable
            public void run(MediaBrowser.BrowserCallback browserCallback) {
                browserCallback.onSearchResultChanged(MediaBrowserImplBase.this.getMediaBrowser(), str, i, libraryParams);
            }
        });
    }

    void notifyChildrenChanged(final String str, final int i, final MediaLibraryService.LibraryParams libraryParams) {
        getMediaBrowser().notifyBrowserCallback(new MediaBrowser.BrowserCallbackRunnable() { // from class: androidx.media2.session.MediaBrowserImplBase.9
            @Override // androidx.media2.session.MediaBrowser.BrowserCallbackRunnable
            public void run(MediaBrowser.BrowserCallback browserCallback) {
                browserCallback.onChildrenChanged(MediaBrowserImplBase.this.getMediaBrowser(), str, i, libraryParams);
            }
        });
    }

    private ListenableFuture<LibraryResult> dispatchRemoteLibrarySessionTask(int i, RemoteLibrarySessionTask remoteLibrarySessionTask) {
        IMediaSession sessionInterfaceIfAble = getSessionInterfaceIfAble(i);
        if (sessionInterfaceIfAble != null) {
            SequencedFutureManager.SequencedFuture sequencedFutureCreateSequencedFuture = this.mSequencedFutureManager.createSequencedFuture(RESULT_WHEN_CLOSED);
            try {
                remoteLibrarySessionTask.run(sessionInterfaceIfAble, sequencedFutureCreateSequencedFuture.getSequenceNumber());
            } catch (RemoteException e) {
                Log.w("MC2ImplBase", "Cannot connect to the service or the session is gone", e);
                sequencedFutureCreateSequencedFuture.set(new LibraryResult(-100));
            }
            return sequencedFutureCreateSequencedFuture;
        }
        return LibraryResult.createFutureWithResult(-4);
    }
}
