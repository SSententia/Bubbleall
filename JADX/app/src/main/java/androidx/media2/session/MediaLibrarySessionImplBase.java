package androidx.media2.session;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.SessionPlayer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class MediaLibrarySessionImplBase extends MediaSessionImplBase implements MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl {
    private final ArrayMap<MediaSession.ControllerCb, Set<String>> mSubscriptions;
    private final boolean mThrowsWhenInvalidReturn;

    MediaLibrarySessionImplBase(MediaSession mediaSession, Context context, String str, SessionPlayer sessionPlayer, PendingIntent pendingIntent, Executor executor, MediaSession.SessionCallback sessionCallback, Bundle bundle, boolean z) {
        super(mediaSession, context, str, sessionPlayer, pendingIntent, executor, sessionCallback, bundle);
        this.mSubscriptions = new ArrayMap<>();
        this.mThrowsWhenInvalidReturn = z;
    }

    @Override // androidx.media2.session.MediaSessionImplBase
    MediaBrowserServiceCompat createLegacyBrowserServiceLocked(Context context, SessionToken sessionToken, MediaSessionCompat.Token token) {
        return new MediaLibraryServiceLegacyStub(context, this, token);
    }

    @Override // androidx.media2.session.MediaSessionImplBase, androidx.media2.session.MediaSession.MediaSessionImpl
    public MediaLibraryService.MediaLibrarySession getInstance() {
        return (MediaLibraryService.MediaLibrarySession) super.getInstance();
    }

    @Override // androidx.media2.session.MediaSessionImplBase, androidx.media2.session.MediaSession.MediaSessionImpl
    public MediaLibraryService.MediaLibrarySession.MediaLibrarySessionCallback getCallback() {
        return (MediaLibraryService.MediaLibrarySession.MediaLibrarySessionCallback) super.getCallback();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.media2.session.MediaSessionImplBase
    public MediaLibraryServiceLegacyStub getLegacyBrowserService() {
        return (MediaLibraryServiceLegacyStub) super.getLegacyBrowserService();
    }

    @Override // androidx.media2.session.MediaSessionImplBase, androidx.media2.session.MediaSession.MediaSessionImpl
    public List<MediaSession.ControllerInfo> getConnectedControllers() {
        List<MediaSession.ControllerInfo> connectedControllers = super.getConnectedControllers();
        MediaLibraryServiceLegacyStub legacyBrowserService = getLegacyBrowserService();
        if (legacyBrowserService != null) {
            connectedControllers.addAll(legacyBrowserService.getConnectedControllersManager().getConnectedControllers());
        }
        return connectedControllers;
    }

    @Override // androidx.media2.session.MediaSessionImplBase, androidx.media2.session.MediaSession.MediaSessionImpl
    public boolean isConnected(MediaSession.ControllerInfo controllerInfo) {
        if (super.isConnected(controllerInfo)) {
            return true;
        }
        MediaLibraryServiceLegacyStub legacyBrowserService = getLegacyBrowserService();
        if (legacyBrowserService != null) {
            return legacyBrowserService.getConnectedControllersManager().isConnected(controllerInfo);
        }
        return false;
    }

    @Override // androidx.media2.session.MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl
    public void notifyChildrenChanged(final String str, final int i, final MediaLibraryService.LibraryParams libraryParams) {
        dispatchRemoteControllerTaskWithoutReturn(new MediaSessionImplBase.RemoteControllerTask() { // from class: androidx.media2.session.MediaLibrarySessionImplBase.1
            @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
            public void run(MediaSession.ControllerCb controllerCb, int i2) throws RemoteException {
                if (MediaLibrarySessionImplBase.this.isSubscribed(controllerCb, str)) {
                    controllerCb.onChildrenChanged(i2, str, i, libraryParams);
                }
            }
        });
    }

    @Override // androidx.media2.session.MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl
    public void notifyChildrenChanged(final MediaSession.ControllerInfo controllerInfo, final String str, final int i, final MediaLibraryService.LibraryParams libraryParams) {
        dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new MediaSessionImplBase.RemoteControllerTask() { // from class: androidx.media2.session.MediaLibrarySessionImplBase.2
            @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
            public void run(MediaSession.ControllerCb controllerCb, int i2) throws RemoteException {
                if (!MediaLibrarySessionImplBase.this.isSubscribed(controllerCb, str)) {
                    if (MediaSessionImplBase.DEBUG) {
                        Log.d("MSImplBase", "Skipping notifyChildrenChanged() to " + controllerInfo + " because it hasn't subscribed");
                        MediaLibrarySessionImplBase.this.dumpSubscription();
                        return;
                    }
                    return;
                }
                controllerCb.onChildrenChanged(i2, str, i, libraryParams);
            }
        });
    }

    @Override // androidx.media2.session.MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl
    public void notifySearchResultChanged(MediaSession.ControllerInfo controllerInfo, final String str, final int i, final MediaLibraryService.LibraryParams libraryParams) {
        dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new MediaSessionImplBase.RemoteControllerTask() { // from class: androidx.media2.session.MediaLibrarySessionImplBase.3
            @Override // androidx.media2.session.MediaSessionImplBase.RemoteControllerTask
            public void run(MediaSession.ControllerCb controllerCb, int i2) throws RemoteException {
                controllerCb.onSearchResultChanged(i2, str, i, libraryParams);
            }
        });
    }

    private LibraryResult ensureNonNullResult(LibraryResult libraryResult) {
        if (libraryResult != null) {
            return libraryResult;
        }
        handleError("LibraryResult shouldn't be null");
        return new LibraryResult(-1);
    }

    private LibraryResult ensureNonNullResultWithValidList(LibraryResult libraryResult, int i) {
        LibraryResult libraryResultEnsureNonNullResult = ensureNonNullResult(libraryResult);
        if (libraryResultEnsureNonNullResult.getResultCode() != 0) {
            return libraryResultEnsureNonNullResult;
        }
        List<MediaItem> mediaItems = libraryResultEnsureNonNullResult.getMediaItems();
        if (mediaItems == null) {
            handleError("List shouldn't be null for the success");
            return new LibraryResult(-1);
        }
        if (mediaItems.size() > i) {
            handleError("List shouldn't contain items more than pageSize, size=" + libraryResultEnsureNonNullResult.getMediaItems().size() + ", pageSize" + i);
            return new LibraryResult(-1);
        }
        Iterator<MediaItem> it = mediaItems.iterator();
        while (it.hasNext()) {
            if (!isValidItem(it.next())) {
                return new LibraryResult(-1);
            }
        }
        return libraryResultEnsureNonNullResult;
    }

    private LibraryResult ensureNonNullResultWithValidItem(LibraryResult libraryResult) {
        LibraryResult libraryResultEnsureNonNullResult = ensureNonNullResult(libraryResult);
        return (libraryResultEnsureNonNullResult.getResultCode() != 0 || isValidItem(libraryResultEnsureNonNullResult.getMediaItem())) ? libraryResultEnsureNonNullResult : new LibraryResult(-1);
    }

    private boolean isValidItem(MediaItem mediaItem) {
        if (mediaItem == null) {
            handleError("Item shouldn't be null for the success");
            return false;
        }
        if (TextUtils.isEmpty(mediaItem.getMediaId())) {
            handleError("Media ID of an item shouldn't be empty for the success");
            return false;
        }
        MediaMetadata metadata = mediaItem.getMetadata();
        if (metadata == null) {
            handleError("Metadata of an item shouldn't be null for the success");
            return false;
        }
        if (!metadata.containsKey(MediaMetadata.METADATA_KEY_BROWSABLE)) {
            handleError("METADATA_KEY_BROWSABLE should be specified in metadata of an item");
            return false;
        }
        if (metadata.containsKey(MediaMetadata.METADATA_KEY_PLAYABLE)) {
            return true;
        }
        handleError("METADATA_KEY_PLAYABLE should be specified in metadata of an item");
        return false;
    }

    @Override // androidx.media2.session.MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl
    public LibraryResult onGetLibraryRootOnExecutor(MediaSession.ControllerInfo controllerInfo, MediaLibraryService.LibraryParams libraryParams) {
        return ensureNonNullResultWithValidItem(getCallback().onGetLibraryRoot(getInstance(), controllerInfo, libraryParams));
    }

    @Override // androidx.media2.session.MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl
    public LibraryResult onGetItemOnExecutor(MediaSession.ControllerInfo controllerInfo, String str) {
        return ensureNonNullResultWithValidItem(getCallback().onGetItem(getInstance(), controllerInfo, str));
    }

    @Override // androidx.media2.session.MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl
    public LibraryResult onGetChildrenOnExecutor(MediaSession.ControllerInfo controllerInfo, String str, int i, int i2, MediaLibraryService.LibraryParams libraryParams) {
        return ensureNonNullResultWithValidList(getCallback().onGetChildren(getInstance(), controllerInfo, str, i, i2, libraryParams), i2);
    }

    @Override // androidx.media2.session.MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl
    public int onSubscribeOnExecutor(MediaSession.ControllerInfo controllerInfo, String str, MediaLibraryService.LibraryParams libraryParams) {
        synchronized (this.mLock) {
            Set<String> hashSet = this.mSubscriptions.get(controllerInfo.getControllerCb());
            if (hashSet == null) {
                hashSet = new HashSet<>();
                this.mSubscriptions.put(controllerInfo.getControllerCb(), hashSet);
            }
            hashSet.add(str);
        }
        int iOnSubscribe = getCallback().onSubscribe(getInstance(), controllerInfo, str, libraryParams);
        if (iOnSubscribe != 0) {
            synchronized (this.mLock) {
                this.mSubscriptions.remove(controllerInfo.getControllerCb());
            }
        }
        return iOnSubscribe;
    }

    @Override // androidx.media2.session.MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl
    public int onUnsubscribeOnExecutor(MediaSession.ControllerInfo controllerInfo, String str) {
        int iOnUnsubscribe = getCallback().onUnsubscribe(getInstance(), controllerInfo, str);
        synchronized (this.mLock) {
            this.mSubscriptions.remove(controllerInfo.getControllerCb());
        }
        return iOnUnsubscribe;
    }

    @Override // androidx.media2.session.MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl
    public int onSearchOnExecutor(MediaSession.ControllerInfo controllerInfo, String str, MediaLibraryService.LibraryParams libraryParams) {
        return getCallback().onSearch(getInstance(), controllerInfo, str, libraryParams);
    }

    @Override // androidx.media2.session.MediaLibraryService.MediaLibrarySession.MediaLibrarySessionImpl
    public LibraryResult onGetSearchResultOnExecutor(MediaSession.ControllerInfo controllerInfo, String str, int i, int i2, MediaLibraryService.LibraryParams libraryParams) {
        return ensureNonNullResultWithValidList(getCallback().onGetSearchResult(getInstance(), controllerInfo, str, i, i2, libraryParams), i2);
    }

    @Override // androidx.media2.session.MediaSessionImplBase
    void dispatchRemoteControllerTaskWithoutReturn(MediaSessionImplBase.RemoteControllerTask remoteControllerTask) {
        super.dispatchRemoteControllerTaskWithoutReturn(remoteControllerTask);
        MediaLibraryServiceLegacyStub legacyBrowserService = getLegacyBrowserService();
        if (legacyBrowserService != null) {
            try {
                remoteControllerTask.run(legacyBrowserService.getBrowserLegacyCbForBroadcast(), 0);
            } catch (RemoteException e) {
                Log.e("MSImplBase", "Exception in using media1 API", e);
            }
        }
    }

    boolean isSubscribed(MediaSession.ControllerCb controllerCb, String str) {
        synchronized (this.mLock) {
            Set<String> set = this.mSubscriptions.get(controllerCb);
            if (set != null && set.contains(str)) {
                return true;
            }
            return false;
        }
    }

    void dumpSubscription() {
        if (DEBUG) {
            synchronized (this.mLock) {
                Log.d("MSImplBase", "Dumping subscription, controller sz=" + this.mSubscriptions.size());
                for (int i = 0; i < this.mSubscriptions.size(); i++) {
                    Log.d("MSImplBase", "  controller " + this.mSubscriptions.valueAt(i));
                    Iterator<String> it = this.mSubscriptions.valueAt(i).iterator();
                    while (it.hasNext()) {
                        Log.d("MSImplBase", "  - " + it.next());
                    }
                }
            }
        }
    }

    private void handleError(String str) {
        if (this.mThrowsWhenInvalidReturn) {
            throw new RuntimeException(str);
        }
        Log.e("MSImplBase", str);
    }
}
