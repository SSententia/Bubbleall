package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztz implements zznu {
    public static final zzoa zza = zztx.zza;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private zztv zzj;
    private zznx zzk;
    private boolean zzl;
    private final zzamn zzb = new zzamn(0);
    private final zzamf zzd = new zzamf(4096);
    private final SparseArray<zzty> zzc = new SparseArray<>();
    private final zztw zze = new zztw();

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        byte[] bArr = new byte[14];
        zznp zznpVar = (zznp) zznvVar;
        zznpVar.zzh(bArr, 0, 14, false);
        if ((((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zznpVar.zzj(bArr[13] & 7, false);
        zznpVar.zzh(bArr, 0, 3, false);
        return ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) | (bArr[2] & UByte.MAX_VALUE)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzk = zznxVar;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x014f  */
    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        zztb zztdVar;
        zzakt.zze(this.zzk);
        long jZzo = zznvVar.zzo();
        if (jZzo != -1 && !this.zze.zza()) {
            return this.zze.zzc(zznvVar, zzoqVar);
        }
        if (!this.zzl) {
            this.zzl = true;
            if (this.zze.zzd() != -9223372036854775807L) {
                zztv zztvVar = new zztv(this.zze.zzb(), this.zze.zzd(), jZzo);
                this.zzj = zztvVar;
                this.zzk.zzD(zztvVar.zza());
            } else {
                this.zzk.zzD(new zzos(this.zze.zzd(), 0L));
            }
        }
        zztv zztvVar2 = this.zzj;
        if (zztvVar2 != null && zztvVar2.zzc()) {
            return this.zzj.zzd(zznvVar, zzoqVar);
        }
        zznvVar.zzl();
        long jZzm = jZzo != -1 ? jZzo - zznvVar.zzm() : -1L;
        if ((jZzm != -1 && jZzm < 4) || !zznvVar.zzh(this.zzd.zzi(), 0, 4, true)) {
            return -1;
        }
        this.zzd.zzh(0);
        int iZzv = this.zzd.zzv();
        if (iZzv == 441) {
            return -1;
        }
        if (iZzv == 442) {
            zznp zznpVar = (zznp) zznvVar;
            zznpVar.zzh(this.zzd.zzi(), 0, 10, false);
            this.zzd.zzh(9);
            zznpVar.zzd((this.zzd.zzn() & 7) + 14, false);
            return 0;
        }
        if (iZzv == 443) {
            zznp zznpVar2 = (zznp) zznvVar;
            zznpVar2.zzh(this.zzd.zzi(), 0, 2, false);
            this.zzd.zzh(0);
            zznpVar2.zzd(this.zzd.zzo() + 6, false);
            return 0;
        }
        if ((iZzv >> 8) != 1) {
            ((zznp) zznvVar).zzd(1, false);
            return 0;
        }
        int i = iZzv & 255;
        zzty zztyVar = this.zzc.get(i);
        if (!this.zzf) {
            if (zztyVar == null) {
                zztb zztbVar = null;
                if (i == 189) {
                    zztdVar = new zzsr(null);
                    this.zzg = true;
                    this.zzi = zznvVar.zzn();
                } else if ((iZzv & 224) == 192) {
                    zztdVar = new zztp(null);
                    this.zzg = true;
                    this.zzi = zznvVar.zzn();
                } else if ((iZzv & 240) == 224) {
                    zztdVar = new zztd(null);
                    this.zzh = true;
                    this.zzi = zznvVar.zzn();
                } else if (zztbVar != null) {
                    zztbVar.zzb(this.zzk, new zzun(Integer.MIN_VALUE, i, 256));
                    zztyVar = new zzty(zztbVar, this.zzb);
                    this.zzc.put(i, zztyVar);
                }
                zztbVar = zztdVar;
                if (zztbVar != null) {
                    zztbVar.zzb(this.zzk, new zzun(Integer.MIN_VALUE, i, 256));
                    zztyVar = new zzty(zztbVar, this.zzb);
                    this.zzc.put(i, zztyVar);
                }
            }
            boolean z = this.zzg;
            long j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (z && this.zzh) {
                j = this.zzi + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            if (zznvVar.zzn() > j) {
                this.zzf = true;
                this.zzk.zzC();
            }
        }
        zznp zznpVar3 = (zznp) zznvVar;
        zznpVar3.zzh(this.zzd.zzi(), 0, 2, false);
        this.zzd.zzh(0);
        int iZzo = this.zzd.zzo() + 6;
        if (zztyVar == null) {
            zznpVar3.zzd(iZzo, false);
        } else {
            this.zzd.zza(iZzo);
            zznpVar3.zza(this.zzd.zzi(), 0, iZzo, false);
            this.zzd.zzh(6);
            zztyVar.zzb(this.zzd);
            zzamf zzamfVar = this.zzd;
            zzamfVar.zzf(zzamfVar.zzj());
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        if (this.zzb.zzc() != -9223372036854775807L) {
            long jZza = this.zzb.zza();
            if (jZza != -9223372036854775807L && jZza != 0 && jZza != j2) {
                this.zzb.zzd(j2);
            }
        } else {
            this.zzb.zzd(j2);
        }
        zztv zztvVar = this.zzj;
        if (zztvVar != null) {
            zztvVar.zzb(j2);
        }
        for (int i = 0; i < this.zzc.size(); i++) {
            this.zzc.valueAt(i).zza();
        }
    }
}
