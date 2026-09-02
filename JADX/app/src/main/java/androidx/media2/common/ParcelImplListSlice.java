package androidx.media2.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImplListSlice implements Parcelable {
    public static final Parcelable.Creator<ParcelImplListSlice> CREATOR = new Parcelable.Creator<ParcelImplListSlice>() { // from class: androidx.media2.common.ParcelImplListSlice.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelImplListSlice createFromParcel(Parcel parcel) {
            return new ParcelImplListSlice(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelImplListSlice[] newArray(int i) {
            return new ParcelImplListSlice[i];
        }
    };
    private static final boolean DEBUG = false;
    private static final int INLINE_COUNT_LIMIT = 1;
    private static final int MAX_IPC_SIZE = 65536;
    private static final String TAG = "ParcelImplListSlice";
    final List<ParcelImpl> mList;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelImplListSlice(List<ParcelImpl> list) {
        if (list == null) {
            throw new NullPointerException("list shouldn't be null");
        }
        this.mList = list;
    }

    ParcelImplListSlice(Parcel parcel) {
        int i = parcel.readInt();
        this.mList = new ArrayList(i);
        if (i <= 0) {
            return;
        }
        int i2 = 0;
        while (i2 < i && parcel.readInt() != 0) {
            this.mList.add((ParcelImpl) parcel.readParcelable(ParcelImpl.class.getClassLoader()));
            i2++;
        }
        if (i2 >= i) {
            return;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        while (i2 < i) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i2);
                try {
                    strongBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (i2 < i && parcelObtain2.readInt() != 0) {
                        this.mList.add((ParcelImpl) parcelObtain2.readParcelable(ParcelImpl.class.getClassLoader()));
                        i2++;
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (RemoteException e) {
                    Log.w(TAG, "Failure retrieving array; only received " + i2 + " of " + i, e);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return;
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
    }

    public List<ParcelImpl> getList() {
        return this.mList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        final int size = this.mList.size();
        parcel.writeInt(size);
        if (size > 0) {
            int i2 = 0;
            while (i2 < size && i2 < 1 && parcel.dataSize() < 65536) {
                parcel.writeInt(1);
                parcel.writeParcelable(this.mList.get(i2), i);
                i2++;
            }
            if (i2 < size) {
                parcel.writeInt(0);
                parcel.writeStrongBinder(new Binder() { // from class: androidx.media2.common.ParcelImplListSlice.1
                    @Override // android.os.Binder
                    protected boolean onTransact(int i3, Parcel parcel2, Parcel parcel3, int i4) throws RemoteException {
                        if (i3 != 1) {
                            return super.onTransact(i3, parcel2, parcel3, i4);
                        }
                        int i5 = parcel2.readInt();
                        while (i5 < size && parcel3.dataSize() < 65536) {
                            parcel3.writeInt(1);
                            parcel3.writeParcelable(ParcelImplListSlice.this.mList.get(i5), i4);
                            i5++;
                        }
                        if (i5 < size) {
                            parcel3.writeInt(0);
                        }
                        return true;
                    }
                });
            }
        }
    }
}
