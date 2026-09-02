package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapk implements Comparator<zzapj>, Parcelable {
    public static final Parcelable.Creator<zzapk> CREATOR = new zzaph();
    public final int zza;
    private final zzapj[] zzb;
    private int zzc;

    zzapk(Parcel parcel) {
        zzapj[] zzapjVarArr = (zzapj[]) parcel.createTypedArray(zzapj.CREATOR);
        this.zzb = zzapjVarArr;
        this.zza = zzapjVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzapj zzapjVar, zzapj zzapjVar2) {
        zzapj zzapjVar3 = zzapjVar;
        zzapj zzapjVar4 = zzapjVar2;
        if (zzamx.zzb.equals(zzapjVar3.zze)) {
            return !zzamx.zzb.equals(zzapjVar4.zze) ? 1 : 0;
        }
        return zzapjVar3.zze.compareTo(zzapjVar4.zze);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzapk) obj).zzb);
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.zzb);
        this.zzc = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.zzb, 0);
    }

    public final zzapj zza(int i) {
        return this.zzb[i];
    }

    public zzapk(List<zzapj> list) {
        this(false, (zzapj[]) list.toArray(new zzapj[list.size()]));
    }

    private zzapk(boolean z, zzapj... zzapjVarArr) {
        zzapjVarArr = z ? (zzapj[]) zzapjVarArr.clone() : zzapjVarArr;
        Arrays.sort(zzapjVarArr, this);
        int i = 1;
        while (true) {
            int length = zzapjVarArr.length;
            if (i >= length) {
                this.zzb = zzapjVarArr;
                this.zza = length;
                return;
            } else {
                if (zzapjVarArr[i - 1].zze.equals(zzapjVarArr[i].zze)) {
                    String strValueOf = String.valueOf(zzapjVarArr[i].zze);
                    String.valueOf(strValueOf).length();
                    throw new IllegalArgumentException("Duplicate data for uuid: ".concat(String.valueOf(strValueOf)));
                }
                i++;
            }
        }
    }

    public zzapk(zzapj... zzapjVarArr) {
        this(true, zzapjVarArr);
    }
}
