package androidx.media2.session;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;
import androidx.versionedparcelable.ParcelImpl;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface IMediaSession extends IInterface {

    public static class Default implements IMediaSession {
        @Override // androidx.media2.session.IMediaSession
        public void addPlaylistItem(IMediaController iMediaController, int i, int i2, String str) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void adjustVolume(IMediaController iMediaController, int i, int i2, int i3) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.media2.session.IMediaSession
        public void connect(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void deselectTrack(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void fastForward(IMediaController iMediaController, int i) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void getChildren(IMediaController iMediaController, int i, String str, int i2, int i3, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void getItem(IMediaController iMediaController, int i, String str) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void getLibraryRoot(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void getSearchResult(IMediaController iMediaController, int i, String str, int i2, int i3, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void movePlaylistItem(IMediaController iMediaController, int i, int i2, int i3) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void onControllerResult(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void onCustomCommand(IMediaController iMediaController, int i, ParcelImpl parcelImpl, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void pause(IMediaController iMediaController, int i) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void play(IMediaController iMediaController, int i) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void prepare(IMediaController iMediaController, int i) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void release(IMediaController iMediaController, int i) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void removePlaylistItem(IMediaController iMediaController, int i, int i2) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void replacePlaylistItem(IMediaController iMediaController, int i, int i2, String str) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void rewind(IMediaController iMediaController, int i) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void search(IMediaController iMediaController, int i, String str, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void seekTo(IMediaController iMediaController, int i, long j) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void selectTrack(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void setMediaItem(IMediaController iMediaController, int i, String str) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void setMediaUri(IMediaController iMediaController, int i, Uri uri, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void setPlaybackSpeed(IMediaController iMediaController, int i, float f) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void setPlaylist(IMediaController iMediaController, int i, List<String> list, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void setRating(IMediaController iMediaController, int i, String str, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void setRepeatMode(IMediaController iMediaController, int i, int i2) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void setShuffleMode(IMediaController iMediaController, int i, int i2) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void setSurface(IMediaController iMediaController, int i, Surface surface) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void setVolumeTo(IMediaController iMediaController, int i, int i2, int i3) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void skipBackward(IMediaController iMediaController, int i) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void skipForward(IMediaController iMediaController, int i) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void skipToNextItem(IMediaController iMediaController, int i) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void skipToPlaylistItem(IMediaController iMediaController, int i, int i2) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void skipToPreviousItem(IMediaController iMediaController, int i) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void subscribe(IMediaController iMediaController, int i, String str, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void unsubscribe(IMediaController iMediaController, int i, String str) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaSession
        public void updatePlaylistMetadata(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException {
        }
    }

    void addPlaylistItem(IMediaController iMediaController, int i, int i2, String str) throws RemoteException;

    void adjustVolume(IMediaController iMediaController, int i, int i2, int i3) throws RemoteException;

    void connect(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException;

    void deselectTrack(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException;

    void fastForward(IMediaController iMediaController, int i) throws RemoteException;

    void getChildren(IMediaController iMediaController, int i, String str, int i2, int i3, ParcelImpl parcelImpl) throws RemoteException;

    void getItem(IMediaController iMediaController, int i, String str) throws RemoteException;

    void getLibraryRoot(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException;

    void getSearchResult(IMediaController iMediaController, int i, String str, int i2, int i3, ParcelImpl parcelImpl) throws RemoteException;

    void movePlaylistItem(IMediaController iMediaController, int i, int i2, int i3) throws RemoteException;

    void onControllerResult(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException;

    void onCustomCommand(IMediaController iMediaController, int i, ParcelImpl parcelImpl, Bundle bundle) throws RemoteException;

    void pause(IMediaController iMediaController, int i) throws RemoteException;

    void play(IMediaController iMediaController, int i) throws RemoteException;

    void prepare(IMediaController iMediaController, int i) throws RemoteException;

    void release(IMediaController iMediaController, int i) throws RemoteException;

    void removePlaylistItem(IMediaController iMediaController, int i, int i2) throws RemoteException;

    void replacePlaylistItem(IMediaController iMediaController, int i, int i2, String str) throws RemoteException;

    void rewind(IMediaController iMediaController, int i) throws RemoteException;

    void search(IMediaController iMediaController, int i, String str, ParcelImpl parcelImpl) throws RemoteException;

    void seekTo(IMediaController iMediaController, int i, long j) throws RemoteException;

    void selectTrack(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException;

    void setMediaItem(IMediaController iMediaController, int i, String str) throws RemoteException;

    void setMediaUri(IMediaController iMediaController, int i, Uri uri, Bundle bundle) throws RemoteException;

    void setPlaybackSpeed(IMediaController iMediaController, int i, float f) throws RemoteException;

    void setPlaylist(IMediaController iMediaController, int i, List<String> list, ParcelImpl parcelImpl) throws RemoteException;

    void setRating(IMediaController iMediaController, int i, String str, ParcelImpl parcelImpl) throws RemoteException;

    void setRepeatMode(IMediaController iMediaController, int i, int i2) throws RemoteException;

    void setShuffleMode(IMediaController iMediaController, int i, int i2) throws RemoteException;

    void setSurface(IMediaController iMediaController, int i, Surface surface) throws RemoteException;

    void setVolumeTo(IMediaController iMediaController, int i, int i2, int i3) throws RemoteException;

    void skipBackward(IMediaController iMediaController, int i) throws RemoteException;

    void skipForward(IMediaController iMediaController, int i) throws RemoteException;

    void skipToNextItem(IMediaController iMediaController, int i) throws RemoteException;

    void skipToPlaylistItem(IMediaController iMediaController, int i, int i2) throws RemoteException;

    void skipToPreviousItem(IMediaController iMediaController, int i) throws RemoteException;

    void subscribe(IMediaController iMediaController, int i, String str, ParcelImpl parcelImpl) throws RemoteException;

    void unsubscribe(IMediaController iMediaController, int i, String str) throws RemoteException;

    void updatePlaylistMetadata(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException;

    public static abstract class Stub extends Binder implements IMediaSession {
        private static final String DESCRIPTOR = "androidx.media2.session.IMediaSession";
        static final int TRANSACTION_addPlaylistItem = 25;
        static final int TRANSACTION_adjustVolume = 4;
        static final int TRANSACTION_connect = 1;
        static final int TRANSACTION_deselectTrack = 43;
        static final int TRANSACTION_fastForward = 8;
        static final int TRANSACTION_getChildren = 36;
        static final int TRANSACTION_getItem = 35;
        static final int TRANSACTION_getLibraryRoot = 34;
        static final int TRANSACTION_getSearchResult = 38;
        static final int TRANSACTION_movePlaylistItem = 44;
        static final int TRANSACTION_onControllerResult = 33;
        static final int TRANSACTION_onCustomCommand = 13;
        static final int TRANSACTION_pause = 6;
        static final int TRANSACTION_play = 5;
        static final int TRANSACTION_prepare = 7;
        static final int TRANSACTION_release = 2;
        static final int TRANSACTION_removePlaylistItem = 26;
        static final int TRANSACTION_replacePlaylistItem = 27;
        static final int TRANSACTION_rewind = 9;
        static final int TRANSACTION_search = 37;
        static final int TRANSACTION_seekTo = 12;
        static final int TRANSACTION_selectTrack = 42;
        static final int TRANSACTION_setMediaItem = 23;
        static final int TRANSACTION_setMediaUri = 45;
        static final int TRANSACTION_setPlaybackSpeed = 21;
        static final int TRANSACTION_setPlaylist = 22;
        static final int TRANSACTION_setRating = 20;
        static final int TRANSACTION_setRepeatMode = 31;
        static final int TRANSACTION_setShuffleMode = 32;
        static final int TRANSACTION_setSurface = 41;
        static final int TRANSACTION_setVolumeTo = 3;
        static final int TRANSACTION_skipBackward = 11;
        static final int TRANSACTION_skipForward = 10;
        static final int TRANSACTION_skipToNextItem = 30;
        static final int TRANSACTION_skipToPlaylistItem = 28;
        static final int TRANSACTION_skipToPreviousItem = 29;
        static final int TRANSACTION_subscribe = 39;
        static final int TRANSACTION_unsubscribe = 40;
        static final int TRANSACTION_updatePlaylistMetadata = 24;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMediaSession asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IMediaSession)) {
                return (IMediaSession) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    connect(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    release(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    setVolumeTo(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    adjustVolume(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    play(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    pause(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    prepare(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    fastForward(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    rewind(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    skipForward(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    skipBackward(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    seekTo(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    onCustomCommand(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                default:
                    switch (i) {
                        case 20:
                            parcel.enforceInterface(DESCRIPTOR);
                            setRating(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                            return true;
                        case 21:
                            parcel.enforceInterface(DESCRIPTOR);
                            setPlaybackSpeed(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                            return true;
                        case 22:
                            parcel.enforceInterface(DESCRIPTOR);
                            setPlaylist(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.createStringArrayList(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                            return true;
                        case 23:
                            parcel.enforceInterface(DESCRIPTOR);
                            setMediaItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                            return true;
                        case 24:
                            parcel.enforceInterface(DESCRIPTOR);
                            updatePlaylistMetadata(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                            return true;
                        case 25:
                            parcel.enforceInterface(DESCRIPTOR);
                            addPlaylistItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString());
                            return true;
                        case 26:
                            parcel.enforceInterface(DESCRIPTOR);
                            removePlaylistItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                            return true;
                        case 27:
                            parcel.enforceInterface(DESCRIPTOR);
                            replacePlaylistItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString());
                            return true;
                        case 28:
                            parcel.enforceInterface(DESCRIPTOR);
                            skipToPlaylistItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                            return true;
                        case 29:
                            parcel.enforceInterface(DESCRIPTOR);
                            skipToPreviousItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                            return true;
                        case 30:
                            parcel.enforceInterface(DESCRIPTOR);
                            skipToNextItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                            return true;
                        case 31:
                            parcel.enforceInterface(DESCRIPTOR);
                            setRepeatMode(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                            return true;
                        case 32:
                            parcel.enforceInterface(DESCRIPTOR);
                            setShuffleMode(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                            return true;
                        case 33:
                            parcel.enforceInterface(DESCRIPTOR);
                            onControllerResult(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                            return true;
                        case 34:
                            parcel.enforceInterface(DESCRIPTOR);
                            getLibraryRoot(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                            return true;
                        case 35:
                            parcel.enforceInterface(DESCRIPTOR);
                            getItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                            return true;
                        case 36:
                            parcel.enforceInterface(DESCRIPTOR);
                            getChildren(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                            return true;
                        case 37:
                            parcel.enforceInterface(DESCRIPTOR);
                            search(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                            return true;
                        case 38:
                            parcel.enforceInterface(DESCRIPTOR);
                            getSearchResult(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                            return true;
                        case 39:
                            parcel.enforceInterface(DESCRIPTOR);
                            subscribe(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                            return true;
                        case 40:
                            parcel.enforceInterface(DESCRIPTOR);
                            unsubscribe(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                            return true;
                        case 41:
                            parcel.enforceInterface(DESCRIPTOR);
                            setSurface(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? (Surface) Surface.CREATOR.createFromParcel(parcel) : null);
                            return true;
                        case 42:
                            parcel.enforceInterface(DESCRIPTOR);
                            selectTrack(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                            return true;
                        case 43:
                            parcel.enforceInterface(DESCRIPTOR);
                            deselectTrack(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                            return true;
                        case 44:
                            parcel.enforceInterface(DESCRIPTOR);
                            movePlaylistItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                            return true;
                        case 45:
                            parcel.enforceInterface(DESCRIPTOR);
                            setMediaUri(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                            return true;
                        default:
                            return super.onTransact(i, parcel, parcel2, i2);
                    }
            }
        }

        private static class Proxy implements IMediaSession {
            public static IMediaSession sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // androidx.media2.session.IMediaSession
            public void connect(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().connect(iMediaController, i, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void release(IMediaController iMediaController, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().release(iMediaController, i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void setVolumeTo(IMediaController iMediaController, int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (this.mRemote.transact(3, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().setVolumeTo(iMediaController, i, i2, i3);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void adjustVolume(IMediaController iMediaController, int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (this.mRemote.transact(4, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().adjustVolume(iMediaController, i, i2, i3);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void play(IMediaController iMediaController, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(5, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().play(iMediaController, i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void pause(IMediaController iMediaController, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(6, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().pause(iMediaController, i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void prepare(IMediaController iMediaController, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(7, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().prepare(iMediaController, i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void fastForward(IMediaController iMediaController, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(8, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().fastForward(iMediaController, i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void rewind(IMediaController iMediaController, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(9, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().rewind(iMediaController, i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void skipForward(IMediaController iMediaController, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(10, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().skipForward(iMediaController, i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void skipBackward(IMediaController iMediaController, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(11, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().skipBackward(iMediaController, i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void seekTo(IMediaController iMediaController, int i, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    if (this.mRemote.transact(12, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().seekTo(iMediaController, i, j);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void onCustomCommand(IMediaController iMediaController, int i, ParcelImpl parcelImpl, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(13, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onCustomCommand(iMediaController, i, parcelImpl, bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void setRating(IMediaController iMediaController, int i, String str, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(20, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().setRating(iMediaController, i, str, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void setPlaybackSpeed(IMediaController iMediaController, int i, float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeFloat(f);
                    if (this.mRemote.transact(21, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().setPlaybackSpeed(iMediaController, i, f);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void setPlaylist(IMediaController iMediaController, int i, List<String> list, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringList(list);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(22, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().setPlaylist(iMediaController, i, list, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void setMediaItem(IMediaController iMediaController, int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(23, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().setMediaItem(iMediaController, i, str);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void setMediaUri(IMediaController iMediaController, int i, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(45, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().setMediaUri(iMediaController, i, uri, bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void updatePlaylistMetadata(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(24, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().updatePlaylistMetadata(iMediaController, i, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void addPlaylistItem(IMediaController iMediaController, int i, int i2, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(25, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().addPlaylistItem(iMediaController, i, i2, str);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void removePlaylistItem(IMediaController iMediaController, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(26, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().removePlaylistItem(iMediaController, i, i2);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void replacePlaylistItem(IMediaController iMediaController, int i, int i2, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(27, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().replacePlaylistItem(iMediaController, i, i2, str);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void movePlaylistItem(IMediaController iMediaController, int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (this.mRemote.transact(44, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().movePlaylistItem(iMediaController, i, i2, i3);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void skipToPlaylistItem(IMediaController iMediaController, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(28, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().skipToPlaylistItem(iMediaController, i, i2);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void skipToPreviousItem(IMediaController iMediaController, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(29, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().skipToPreviousItem(iMediaController, i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void skipToNextItem(IMediaController iMediaController, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(30, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().skipToNextItem(iMediaController, i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void setRepeatMode(IMediaController iMediaController, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(31, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().setRepeatMode(iMediaController, i, i2);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void setShuffleMode(IMediaController iMediaController, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(32, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().setShuffleMode(iMediaController, i, i2);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void setSurface(IMediaController iMediaController, int i, Surface surface) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (surface != null) {
                        parcelObtain.writeInt(1);
                        surface.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(41, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().setSurface(iMediaController, i, surface);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void selectTrack(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(42, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().selectTrack(iMediaController, i, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void deselectTrack(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(43, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().deselectTrack(iMediaController, i, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void onControllerResult(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(33, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onControllerResult(iMediaController, i, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void getLibraryRoot(IMediaController iMediaController, int i, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(34, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().getLibraryRoot(iMediaController, i, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void getItem(IMediaController iMediaController, int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(35, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().getItem(iMediaController, i, str);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void getChildren(IMediaController iMediaController, int i, String str, int i2, int i3, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(36, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().getChildren(iMediaController, i, str, i2, i3, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void search(IMediaController iMediaController, int i, String str, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(37, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().search(iMediaController, i, str, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void getSearchResult(IMediaController iMediaController, int i, String str, int i2, int i3, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(38, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().getSearchResult(iMediaController, i, str, i2, i3, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void subscribe(IMediaController iMediaController, int i, String str, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(39, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().subscribe(iMediaController, i, str, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaSession
            public void unsubscribe(IMediaController iMediaController, int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaController != null ? iMediaController.asBinder() : null);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(40, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().unsubscribe(iMediaController, i, str);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IMediaSession iMediaSession) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMediaSession == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMediaSession;
            return true;
        }

        public static IMediaSession getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
