package com.google.android.gms.internal.ads;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzrj {
    public final zzox zza;
    public zzrx zzd;
    public zzrf zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzrw zzb = new zzrw();
    public final zzamf zzc = new zzamf();
    private final zzamf zzj = new zzamf(1);
    private final zzamf zzk = new zzamf();

    public zzrj(zzox zzoxVar, zzrx zzrxVar, zzrf zzrfVar) {
        this.zza = zzoxVar;
        this.zzd = zzrxVar;
        this.zze = zzrfVar;
        zzc(zzrxVar, zzrfVar);
    }

    static /* synthetic */ boolean zza(zzrj zzrjVar, boolean z) {
        zzrjVar.zzl = true;
        return true;
    }

    public final void zzc(zzrx zzrxVar, zzrf zzrfVar) {
        this.zzd = zzrxVar;
        this.zze = zzrfVar;
        this.zza.zzs(zzrxVar.zza.zzf);
        zzd();
    }

    public final void zzd() {
        zzrw zzrwVar = this.zzb;
        zzrwVar.zzd = 0;
        zzrwVar.zzq = 0L;
        zzrwVar.zzr = false;
        zzrwVar.zzl = false;
        zzrwVar.zzp = false;
        zzrwVar.zzn = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final long zze() {
        return !this.zzl ? this.zzd.zzf[this.zzf] : this.zzb.zzb(this.zzf);
    }

    public final long zzf() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final int zzg() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzh() {
        int i;
        if (this.zzl) {
            i = this.zzb.zzk[this.zzf] ? 1 : 0;
        } else {
            i = this.zzd.zzg[this.zzf];
        }
        return zzk() != null ? i | BasicMeasure.EXACTLY : i;
    }

    public final boolean zzi() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }

    public final int zzj(int i, int i2) {
        zzamf zzamfVar;
        zzrv zzrvVarZzk = zzk();
        if (zzrvVarZzk == null) {
            return 0;
        }
        int i3 = zzrvVarZzk.zzd;
        if (i3 != 0) {
            zzamfVar = this.zzb.zzo;
        } else {
            byte[] bArr = (byte[]) zzamq.zzd(zzrvVarZzk.zze);
            zzamf zzamfVar2 = this.zzk;
            int length = bArr.length;
            zzamfVar2.zzb(bArr, length);
            zzamfVar = this.zzk;
            i3 = length;
        }
        boolean zZzc = this.zzb.zzc(this.zzf);
        boolean z = zZzc || i2 != 0;
        this.zzj.zzi()[0] = (byte) ((true != z ? 0 : 128) | i3);
        this.zzj.zzh(0);
        this.zza.zzu(this.zzj, 1, 1);
        this.zza.zzu(zzamfVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zZzc) {
            this.zzc.zza(8);
            byte[] bArrZzi = this.zzc.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 1;
            bArrZzi[2] = 0;
            bArrZzi[3] = (byte) i2;
            bArrZzi[4] = (byte) ((i >> 24) & 255);
            bArrZzi[5] = (byte) ((i >> 16) & 255);
            bArrZzi[6] = (byte) ((i >> 8) & 255);
            bArrZzi[7] = (byte) (i & 255);
            this.zza.zzu(this.zzc, 8, 1);
            return i3 + 9;
        }
        zzamf zzamfVar3 = this.zzb.zzo;
        int iZzo = zzamfVar3.zzo();
        zzamfVar3.zzk(-2);
        int i4 = (iZzo * 6) + 2;
        if (i2 != 0) {
            this.zzc.zza(i4);
            byte[] bArrZzi2 = this.zzc.zzi();
            zzamfVar3.zzm(bArrZzi2, 0, i4);
            int i5 = (((bArrZzi2[2] & UByte.MAX_VALUE) << 8) | (bArrZzi2[3] & UByte.MAX_VALUE)) + i2;
            bArrZzi2[2] = (byte) ((i5 >> 8) & 255);
            bArrZzi2[3] = (byte) (i5 & 255);
            zzamfVar3 = this.zzc;
        }
        this.zza.zzu(zzamfVar3, i4, 1);
        return i3 + 1 + i4;
    }

    public final zzrv zzk() {
        if (!this.zzl) {
            return null;
        }
        zzrw zzrwVar = this.zzb;
        zzrf zzrfVar = zzrwVar.zza;
        int i = zzamq.zza;
        int i2 = zzrfVar.zza;
        zzrv zzrvVarZza = zzrwVar.zzn;
        if (zzrvVarZza == null) {
            zzrvVarZza = this.zzd.zza.zza(i2);
        }
        if (zzrvVarZza == null || !zzrvVarZza.zza) {
            return null;
        }
        return zzrvVarZza;
    }
}
