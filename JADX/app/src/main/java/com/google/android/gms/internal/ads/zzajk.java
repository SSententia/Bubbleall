package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzajk extends zzajx {
    public static final Parcelable.Creator<zzajk> CREATOR = new zzajj();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    zzajk(Parcel parcel) {
        String string = parcel.readString();
        int i = zzamq.zza;
        super(string);
        this.zza = (byte[]) zzamq.zzd(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzajk zzajkVar = (zzajk) obj;
            if (this.zzf.equals(zzajkVar.zzf) && Arrays.equals(this.zza, zzajkVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + 527) * 31) + Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public zzajk(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}
