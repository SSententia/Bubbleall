package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzui implements zzua {
    final /* synthetic */ zzuj zza;
    private final zzame zzb = new zzame(new byte[5], 5);
    private final SparseArray<zzuo> zzc = new SparseArray<>();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzui(zzuj zzujVar, int i) {
        this.zza = zzujVar;
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void zza(zzamn zzamnVar, zznx zznxVar, zzun zzunVar) {
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e2  */
    @Override // com.google.android.gms.internal.ads.zzua
    public final void zzb(zzamf zzamfVar) {
        zzamn zzamnVar;
        int i;
        int i2;
        int i3;
        if (zzamfVar.zzn() != 2) {
            return;
        }
        zzamn zzamnVar2 = (zzamn) this.zza.zzb.get(0);
        if ((zzamfVar.zzn() & 128) == 0) {
            return;
        }
        zzamfVar.zzk(1);
        int iZzo = zzamfVar.zzo();
        int i4 = 3;
        zzamfVar.zzk(3);
        zzamfVar.zzl(this.zzb, 2);
        this.zzb.zzf(3);
        int i5 = 13;
        this.zza.zzq = this.zzb.zzh(13);
        zzamfVar.zzl(this.zzb, 2);
        int i6 = 4;
        this.zzb.zzf(4);
        int i7 = 12;
        zzamfVar.zzk(this.zzb.zzh(12));
        this.zzc.clear();
        this.zzd.clear();
        int iZzd = zzamfVar.zzd();
        while (iZzd > 0) {
            int i8 = 5;
            zzamfVar.zzl(this.zzb, 5);
            int iZzh = this.zzb.zzh(8);
            this.zzb.zzf(i4);
            int iZzh2 = this.zzb.zzh(i5);
            this.zzb.zzf(i6);
            int iZzh3 = this.zzb.zzh(i7);
            int iZzg = zzamfVar.zzg();
            int i9 = iZzg + iZzh3;
            ArrayList arrayList = null;
            String strTrim = null;
            int i10 = -1;
            while (true) {
                if (zzamfVar.zzg() >= i9) {
                    i2 = i6;
                    break;
                }
                int iZzn = zzamfVar.zzn();
                int iZzg2 = zzamfVar.zzg() + zzamfVar.zzn();
                if (iZzg2 > i9) {
                    i2 = 4;
                    break;
                }
                if (iZzn == i8) {
                    long jZzt = zzamfVar.zzt();
                    if (jZzt == 1094921523) {
                        i10 = 129;
                    } else if (jZzt == 1161904947) {
                        i10 = 135;
                    } else if (jZzt == 1094921524) {
                        i10 = 172;
                    } else if (jZzt == 1212503619) {
                        i10 = 36;
                    }
                    i3 = 4;
                } else if (iZzn == 106) {
                    zzamnVar2 = zzamnVar2;
                    i10 = 129;
                    i3 = 4;
                    iZzo = iZzo;
                } else if (iZzn == 122) {
                    zzamnVar2 = zzamnVar2;
                    i10 = 135;
                    i3 = 4;
                } else if (iZzn == 127) {
                    if (zzamfVar.zzn() == 21) {
                        i10 = 172;
                    }
                    i3 = 4;
                } else {
                    if (iZzn == 123) {
                        i10 = 138;
                    } else if (iZzn == 10) {
                        strTrim = zzamfVar.zzE(i4, zzfll.zzc).trim();
                    } else if (iZzn == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (zzamfVar.zzg() < iZzg2) {
                            String strTrim2 = zzamfVar.zzE(i4, zzfll.zzc).trim();
                            int iZzn2 = zzamfVar.zzn();
                            zzamn zzamnVar3 = zzamnVar2;
                            byte[] bArr = new byte[4];
                            zzamfVar.zzm(bArr, 0, 4);
                            arrayList2.add(new zzuk(strTrim2, iZzn2, bArr));
                            zzamnVar2 = zzamnVar3;
                            iZzo = iZzo;
                            i4 = 3;
                        }
                        zzamnVar2 = zzamnVar2;
                        iZzo = iZzo;
                        i3 = 4;
                        arrayList = arrayList2;
                        i10 = 89;
                    } else {
                        zzamnVar2 = zzamnVar2;
                        iZzo = iZzo;
                        i3 = 4;
                        if (iZzn == 111) {
                            i10 = 257;
                        }
                    }
                    i3 = 4;
                }
                zzamfVar.zzk(iZzg2 - zzamfVar.zzg());
                i6 = i3;
                zzamnVar2 = zzamnVar2;
                iZzo = iZzo;
                i4 = 3;
                i8 = 5;
            }
            zzamfVar.zzh(i9);
            zzul zzulVar = new zzul(i10, strTrim, arrayList, Arrays.copyOfRange(zzamfVar.zzi(), iZzg, i9));
            if (iZzh == 6 || iZzh == 5) {
                iZzh = zzulVar.zza;
            }
            iZzd -= iZzh3 + 5;
            if (!this.zza.zzg.get(iZzh2)) {
                zzuo zzuoVarZza = this.zza.zze.zza(iZzh, zzulVar);
                this.zzd.put(iZzh2, iZzh2);
                this.zzc.put(iZzh2, zzuoVarZza);
            }
            i6 = i2;
            zzamnVar2 = zzamnVar2;
            iZzo = iZzo;
            i4 = 3;
            i7 = 12;
            i5 = 13;
        }
        zzamn zzamnVar4 = zzamnVar2;
        int i11 = iZzo;
        int size = this.zzd.size();
        int i12 = 0;
        while (i12 < size) {
            int iKeyAt = this.zzd.keyAt(i12);
            int iValueAt = this.zzd.valueAt(i12);
            this.zza.zzg.put(iKeyAt, true);
            this.zza.zzh.put(iValueAt, true);
            zzuo zzuoVarValueAt = this.zzc.valueAt(i12);
            if (zzuoVarValueAt != null) {
                zznx zznxVar = this.zza.zzk;
                i = i11;
                zzun zzunVar = new zzun(i, iKeyAt, 8192);
                zzamnVar = zzamnVar4;
                zzuoVarValueAt.zza(zzamnVar, zznxVar, zzunVar);
                this.zza.zzf.put(iValueAt, zzuoVarValueAt);
            } else {
                zzamnVar = zzamnVar4;
                i = i11;
            }
            i12++;
            zzamnVar4 = zzamnVar;
            i11 = i;
        }
        this.zza.zzf.remove(this.zze);
        this.zza.zzl = 0;
        if (this.zza.zzl == 0) {
            this.zza.zzk.zzC();
            zzuj.zzm(this.zza, true);
        }
    }
}
