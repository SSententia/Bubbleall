package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaje implements zzaiu {
    public static final Parcelable.Creator<zzaje> CREATOR = new zzajd();
    public final String zza;
    public final String zzb;

    zzaje(Parcel parcel) {
        String string = parcel.readString();
        int i = zzamq.zza;
        this.zza = string;
        this.zzb = parcel.readString();
    }

    public zzaje(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaje zzajeVar = (zzaje) obj;
            if (this.zza.equals(zzajeVar.zza) && this.zzb.equals(zzajeVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    @Override // com.google.android.gms.internal.ads.zzaiu
    public final void zza(zzagm zzagmVar) {
        byte b;
        switch (this.zza) {
            case "ALBUM":
                b = 2;
                break;
            case "TITLE":
                b = 0;
                break;
            case "DESCRIPTION":
                b = 4;
                break;
            case "ALBUMARTIST":
                b = 3;
                break;
            case "ARTIST":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            zzagmVar.zzs(this.zzb);
            return;
        }
        if (b == 1) {
            zzagmVar.zzt(this.zzb);
            return;
        }
        if (b == 2) {
            zzagmVar.zzu(this.zzb);
        } else if (b == 3) {
            zzagmVar.zzv(this.zzb);
        } else {
            if (b != 4) {
                return;
            }
            zzagmVar.zzw(this.zzb);
        }
    }
}
