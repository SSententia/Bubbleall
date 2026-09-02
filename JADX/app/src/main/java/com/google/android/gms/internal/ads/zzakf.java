package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzakf extends zzajx {
    public static final Parcelable.Creator<zzakf> CREATOR = new zzake();
    public final String zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    zzakf(Parcel parcel) {
        String string = parcel.readString();
        int i = zzamq.zza;
        super(string);
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    private static List<Integer> zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzakf zzakfVar = (zzakf) obj;
            if (zzamq.zzc(this.zzf, zzakfVar.zzf) && zzamq.zzc(this.zza, zzakfVar.zza) && zzamq.zzc(this.zzb, zzakfVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.zzf.hashCode() + 527) * 31;
        String str = this.zza;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:71:0x0107  */
    @Override // com.google.android.gms.internal.ads.zzajx, com.google.android.gms.internal.ads.zzaiu
    public final void zza(zzagm zzagmVar) {
        switch (this.zzf) {
            case "TT2":
            case "TIT2":
                zzagmVar.zzs(this.zzb);
                break;
            case "TP1":
            case "TPE1":
                zzagmVar.zzt(this.zzb);
                break;
            case "TP2":
            case "TPE2":
                zzagmVar.zzv(this.zzb);
                break;
            case "TAL":
            case "TALB":
                zzagmVar.zzu(this.zzb);
                break;
            case "TRK":
            case "TRCK":
                String[] strArrZzt = zzamq.zzt(this.zzb, "/");
                try {
                    int i = Integer.parseInt(strArrZzt[0]);
                    Integer numValueOf = strArrZzt.length > 1 ? Integer.valueOf(Integer.parseInt(strArrZzt[1])) : null;
                    zzagmVar.zzy(Integer.valueOf(i));
                    zzagmVar.zzz(numValueOf);
                    break;
                } catch (NumberFormatException unused) {
                    return;
                }
                break;
            case "TYE":
            case "TYER":
                try {
                    zzagmVar.zzA(Integer.valueOf(Integer.parseInt(this.zzb)));
                    break;
                } catch (NumberFormatException unused2) {
                    return;
                }
                break;
            case "TDA":
            case "TDAT":
                try {
                    int i2 = Integer.parseInt(this.zzb.substring(2, 4));
                    int i3 = Integer.parseInt(this.zzb.substring(0, 2));
                    zzagmVar.zzB(Integer.valueOf(i2));
                    zzagmVar.zzC(Integer.valueOf(i3));
                    break;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
                break;
            case "TDRC":
                List<Integer> listZzb = zzb(this.zzb);
                int size = listZzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            zzagmVar.zzC(listZzb.get(2));
                        }
                    }
                    zzagmVar.zzB(listZzb.get(1));
                }
                zzagmVar.zzA(listZzb.get(0));
                break;
            case "TDRL":
                List<Integer> listZzb2 = zzb(this.zzb);
                int size2 = listZzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            zzagmVar.zzF(listZzb2.get(2));
                        }
                    }
                    zzagmVar.zzE(listZzb2.get(1));
                }
                zzagmVar.zzD(listZzb2.get(0));
                break;
            case "TCM":
            case "TCOM":
                zzagmVar.zzH(this.zzb);
                break;
            case "TP3":
            case "TPE3":
                zzagmVar.zzI(this.zzb);
                break;
            case "TXT":
            case "TEXT":
                zzagmVar.zzG(this.zzb);
                break;
        }
    }

    public zzakf(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }
}
