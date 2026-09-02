package androidx.media2.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.ParcelImpl;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface IMediaController extends IInterface {

    public static class Default implements IMediaController {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.media2.session.IMediaController
        public void onAllowedCommandsChanged(int i, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onBufferingStateChanged(int i, ParcelImpl parcelImpl, int i2, long j, long j2, long j3) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onChildrenChanged(int i, String str, int i2, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onConnected(int i, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onCurrentMediaItemChanged(int i, ParcelImpl parcelImpl, int i2, int i3, int i4) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onCustomCommand(int i, ParcelImpl parcelImpl, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onDisconnected(int i) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onLibraryResult(int i, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onPlaybackCompleted(int i) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onPlaybackInfoChanged(int i, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onPlaybackSpeedChanged(int i, long j, long j2, float f) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onPlayerStateChanged(int i, long j, long j2, int i2) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onPlaylistChanged(int i, ParcelImplListSlice parcelImplListSlice, ParcelImpl parcelImpl, int i2, int i3, int i4) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onPlaylistMetadataChanged(int i, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onRepeatModeChanged(int i, int i2, int i3, int i4, int i5) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onSearchResultChanged(int i, String str, int i2, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onSeekCompleted(int i, long j, long j2, long j3) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onSessionResult(int i, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onSetCustomLayout(int i, List<ParcelImpl> list) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onShuffleModeChanged(int i, int i2, int i3, int i4, int i5) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onSubtitleData(int i, ParcelImpl parcelImpl, ParcelImpl parcelImpl2, ParcelImpl parcelImpl3) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onTrackDeselected(int i, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onTrackInfoChanged(int i, List<ParcelImpl> list, ParcelImpl parcelImpl, ParcelImpl parcelImpl2, ParcelImpl parcelImpl3, ParcelImpl parcelImpl4) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onTrackSelected(int i, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // androidx.media2.session.IMediaController
        public void onVideoSizeChanged(int i, ParcelImpl parcelImpl, ParcelImpl parcelImpl2) throws RemoteException {
        }
    }

    void onAllowedCommandsChanged(int i, ParcelImpl parcelImpl) throws RemoteException;

    void onBufferingStateChanged(int i, ParcelImpl parcelImpl, int i2, long j, long j2, long j3) throws RemoteException;

    void onChildrenChanged(int i, String str, int i2, ParcelImpl parcelImpl) throws RemoteException;

    void onConnected(int i, ParcelImpl parcelImpl) throws RemoteException;

    void onCurrentMediaItemChanged(int i, ParcelImpl parcelImpl, int i2, int i3, int i4) throws RemoteException;

    void onCustomCommand(int i, ParcelImpl parcelImpl, Bundle bundle) throws RemoteException;

    void onDisconnected(int i) throws RemoteException;

    void onLibraryResult(int i, ParcelImpl parcelImpl) throws RemoteException;

    void onPlaybackCompleted(int i) throws RemoteException;

    void onPlaybackInfoChanged(int i, ParcelImpl parcelImpl) throws RemoteException;

    void onPlaybackSpeedChanged(int i, long j, long j2, float f) throws RemoteException;

    void onPlayerStateChanged(int i, long j, long j2, int i2) throws RemoteException;

    void onPlaylistChanged(int i, ParcelImplListSlice parcelImplListSlice, ParcelImpl parcelImpl, int i2, int i3, int i4) throws RemoteException;

    void onPlaylistMetadataChanged(int i, ParcelImpl parcelImpl) throws RemoteException;

    void onRepeatModeChanged(int i, int i2, int i3, int i4, int i5) throws RemoteException;

    void onSearchResultChanged(int i, String str, int i2, ParcelImpl parcelImpl) throws RemoteException;

    void onSeekCompleted(int i, long j, long j2, long j3) throws RemoteException;

    void onSessionResult(int i, ParcelImpl parcelImpl) throws RemoteException;

    void onSetCustomLayout(int i, List<ParcelImpl> list) throws RemoteException;

    void onShuffleModeChanged(int i, int i2, int i3, int i4, int i5) throws RemoteException;

    void onSubtitleData(int i, ParcelImpl parcelImpl, ParcelImpl parcelImpl2, ParcelImpl parcelImpl3) throws RemoteException;

    void onTrackDeselected(int i, ParcelImpl parcelImpl) throws RemoteException;

    void onTrackInfoChanged(int i, List<ParcelImpl> list, ParcelImpl parcelImpl, ParcelImpl parcelImpl2, ParcelImpl parcelImpl3, ParcelImpl parcelImpl4) throws RemoteException;

    void onTrackSelected(int i, ParcelImpl parcelImpl) throws RemoteException;

    void onVideoSizeChanged(int i, ParcelImpl parcelImpl, ParcelImpl parcelImpl2) throws RemoteException;

    public static abstract class Stub extends Binder implements IMediaController {
        private static final String DESCRIPTOR = "androidx.media2.session.IMediaController";
        static final int TRANSACTION_onAllowedCommandsChanged = 15;
        static final int TRANSACTION_onBufferingStateChanged = 4;
        static final int TRANSACTION_onChildrenChanged = 19;
        static final int TRANSACTION_onConnected = 12;
        static final int TRANSACTION_onCurrentMediaItemChanged = 1;
        static final int TRANSACTION_onCustomCommand = 16;
        static final int TRANSACTION_onDisconnected = 13;
        static final int TRANSACTION_onLibraryResult = 18;
        static final int TRANSACTION_onPlaybackCompleted = 10;
        static final int TRANSACTION_onPlaybackInfoChanged = 7;
        static final int TRANSACTION_onPlaybackSpeedChanged = 3;
        static final int TRANSACTION_onPlayerStateChanged = 2;
        static final int TRANSACTION_onPlaylistChanged = 5;
        static final int TRANSACTION_onPlaylistMetadataChanged = 6;
        static final int TRANSACTION_onRepeatModeChanged = 8;
        static final int TRANSACTION_onSearchResultChanged = 20;
        static final int TRANSACTION_onSeekCompleted = 11;
        static final int TRANSACTION_onSessionResult = 17;
        static final int TRANSACTION_onSetCustomLayout = 14;
        static final int TRANSACTION_onShuffleModeChanged = 9;
        static final int TRANSACTION_onSubtitleData = 25;
        static final int TRANSACTION_onTrackDeselected = 24;
        static final int TRANSACTION_onTrackInfoChanged = 22;
        static final int TRANSACTION_onTrackSelected = 23;
        static final int TRANSACTION_onVideoSizeChanged = 21;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMediaController asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IMediaController)) {
                return (IMediaController) iInterfaceQueryLocalInterface;
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
                    onCurrentMediaItemChanged(parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onPlayerStateChanged(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readInt());
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    onPlaybackSpeedChanged(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readFloat());
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    onBufferingStateChanged(parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong());
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onPlaylistChanged(parcel.readInt(), parcel.readInt() != 0 ? ParcelImplListSlice.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    onPlaylistMetadataChanged(parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    onPlaybackInfoChanged(parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    onRepeatModeChanged(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    onShuffleModeChanged(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    onPlaybackCompleted(parcel.readInt());
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSeekCompleted(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong());
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    onConnected(parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDisconnected(parcel.readInt());
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSetCustomLayout(parcel.readInt(), parcel.createTypedArrayList(ParcelImpl.CREATOR));
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    onAllowedCommandsChanged(parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    onCustomCommand(parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSessionResult(parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    onLibraryResult(parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    onChildrenChanged(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSearchResultChanged(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    onVideoSizeChanged(parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    onTrackInfoChanged(parcel.readInt(), parcel.createTypedArrayList(ParcelImpl.CREATOR), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    onTrackSelected(parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 24:
                    parcel.enforceInterface(DESCRIPTOR);
                    onTrackDeselected(parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 25:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSubtitleData(parcel.readInt(), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements IMediaController {
            public static IMediaController sDefaultImpl;
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

            @Override // androidx.media2.session.IMediaController
            public void onCurrentMediaItemChanged(int i, ParcelImpl parcelImpl, int i2, int i3, int i4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onCurrentMediaItemChanged(i, parcelImpl, i2, i3, i4);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onPlayerStateChanged(int i, long j, long j2, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onPlayerStateChanged(i, j, j2, i2);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onPlaybackSpeedChanged(int i, long j, long j2, float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeFloat(f);
                    if (this.mRemote.transact(3, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onPlaybackSpeedChanged(i, j, j2, f);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onBufferingStateChanged(int i, ParcelImpl parcelImpl, int i2, long j, long j2, long j3) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeLong(j3);
                    try {
                        if (this.mRemote.transact(4, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                            parcelObtain.recycle();
                        } else {
                            Stub.getDefaultImpl().onBufferingStateChanged(i, parcelImpl, i2, j, j2, j3);
                            parcelObtain.recycle();
                        }
                    } catch (Throwable th) {
                        th = th;
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onPlaylistChanged(int i, ParcelImplListSlice parcelImplListSlice, ParcelImpl parcelImpl, int i2, int i3, int i4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (parcelImplListSlice != null) {
                        parcelObtain.writeInt(1);
                        parcelImplListSlice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    if (this.mRemote.transact(5, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onPlaylistChanged(i, parcelImplListSlice, parcelImpl, i2, i3, i4);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onPlaylistMetadataChanged(int i, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(6, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onPlaylistMetadataChanged(i, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onPlaybackInfoChanged(int i, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(7, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onPlaybackInfoChanged(i, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onRepeatModeChanged(int i, int i2, int i3, int i4, int i5) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeInt(i5);
                    if (this.mRemote.transact(8, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onRepeatModeChanged(i, i2, i3, i4, i5);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onShuffleModeChanged(int i, int i2, int i3, int i4, int i5) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeInt(i5);
                    if (this.mRemote.transact(9, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onShuffleModeChanged(i, i2, i3, i4, i5);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onPlaybackCompleted(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(10, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onPlaybackCompleted(i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onSeekCompleted(int i, long j, long j2, long j3) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeLong(j3);
                    try {
                        if (this.mRemote.transact(11, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                            parcelObtain.recycle();
                        } else {
                            Stub.getDefaultImpl().onSeekCompleted(i, j, j2, j3);
                            parcelObtain.recycle();
                        }
                    } catch (Throwable th) {
                        th = th;
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onVideoSizeChanged(int i, ParcelImpl parcelImpl, ParcelImpl parcelImpl2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (parcelImpl2 != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl2.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(21, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onVideoSizeChanged(i, parcelImpl, parcelImpl2);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onSubtitleData(int i, ParcelImpl parcelImpl, ParcelImpl parcelImpl2, ParcelImpl parcelImpl3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (parcelImpl2 != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl2.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (parcelImpl3 != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl3.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(25, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSubtitleData(i, parcelImpl, parcelImpl2, parcelImpl3);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onConnected(int i, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(12, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onConnected(i, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onDisconnected(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(13, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onDisconnected(i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onSetCustomLayout(int i, List<ParcelImpl> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeTypedList(list);
                    if (this.mRemote.transact(14, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSetCustomLayout(i, list);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onAllowedCommandsChanged(int i, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(15, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onAllowedCommandsChanged(i, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onCustomCommand(int i, ParcelImpl parcelImpl, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
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
                    if (this.mRemote.transact(16, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onCustomCommand(i, parcelImpl, bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onSessionResult(int i, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(17, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSessionResult(i, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onLibraryResult(int i, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(18, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onLibraryResult(i, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onTrackInfoChanged(int i, List<ParcelImpl> list, ParcelImpl parcelImpl, ParcelImpl parcelImpl2, ParcelImpl parcelImpl3, ParcelImpl parcelImpl4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeTypedList(list);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (parcelImpl2 != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl2.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (parcelImpl3 != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl3.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (parcelImpl4 != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl4.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(22, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onTrackInfoChanged(i, list, parcelImpl, parcelImpl2, parcelImpl3, parcelImpl4);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onTrackSelected(int i, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(23, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onTrackSelected(i, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onTrackDeselected(int i, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
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
                    Stub.getDefaultImpl().onTrackDeselected(i, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onChildrenChanged(int i, String str, int i2, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(19, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onChildrenChanged(i, str, i2, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media2.session.IMediaController
            public void onSearchResultChanged(int i, String str, int i2, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(20, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSearchResultChanged(i, str, i2, parcelImpl);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IMediaController iMediaController) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMediaController == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMediaController;
            return true;
        }

        public static IMediaController getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
