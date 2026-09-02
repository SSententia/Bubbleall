package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzajo extends zzajx {
    public static final Parcelable.Creator<zzajo> CREATOR = new zzajn();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzajx[] zze;

    zzajo(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = zzamq.zza;
        this.zza = string;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = (String[]) zzamq.zzd(parcel.createStringArray());
        int i2 = parcel.readInt();
        this.zze = new zzajx[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zze[i3] = (zzajx) parcel.readParcelable(zzajx.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzajo zzajoVar = (zzajo) obj;
            if (this.zzb == zzajoVar.zzb && this.zzc == zzajoVar.zzc && zzamq.zzc(this.zza, zzajoVar.zza) && Arrays.equals(this.zzd, zzajoVar.zzd) && Arrays.equals(this.zze, zzajoVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31;
        String str = this.zza;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzajx zzajxVar : this.zze) {
            parcel.writeParcelable(zzajxVar, 0);
        }
    }

    public zzajo(String str, boolean z, boolean z2, String[] strArr, zzajx[] zzajxVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzajxVarArr;
    }
}
