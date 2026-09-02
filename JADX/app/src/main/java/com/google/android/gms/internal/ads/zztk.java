package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztk implements zztb {
    private final zzuc zza;
    private long zze;
    private String zzg;
    private zzox zzh;
    private zztj zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zztq zzb = new zztq(7, 128);
    private final zztq zzc = new zztq(8, 128);
    private final zztq zzd = new zztq(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzamf zzm = new zzamf();

    public zztk(zzuc zzucVar, boolean z, boolean z2) {
        this.zza = zzucVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        if (!this.zzj) {
            this.zzb.zzd(bArr, i, i2);
            this.zzc.zzd(bArr, i, i2);
        }
        this.zzd.zzd(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzalw.zze(this.zzf);
        this.zzb.zza();
        this.zzc.zza();
        this.zzd.zza();
        zztj zztjVar = this.zzi;
        if (zztjVar != null) {
            zztjVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        zzunVar.zza();
        this.zzg = zzunVar.zzc();
        zzox zzoxVarZzB = zznxVar.zzB(zzunVar.zzb(), 2);
        this.zzh = zzoxVarZzB;
        this.zzi = new zztj(zzoxVarZzB, false, false);
        this.zza.zza(zznxVar, zzunVar);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
        this.zzl |= (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051  */
    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzd(zzamf zzamfVar) {
        int i;
        int i2;
        zzakt.zze(this.zzh);
        int i3 = zzamq.zza;
        int iZzg = zzamfVar.zzg();
        int iZze = zzamfVar.zze();
        byte[] bArrZzi = zzamfVar.zzi();
        this.zze += (long) zzamfVar.zzd();
        zzov.zzb(this.zzh, zzamfVar, zzamfVar.zzd());
        while (true) {
            int iZzd = zzalw.zzd(bArrZzi, iZzg, iZze, this.zzf);
            if (iZzd == iZze) {
                zzf(bArrZzi, iZzg, iZze);
                return;
            }
            int i4 = iZzd + 3;
            int i5 = bArrZzi[i4] & 31;
            int i6 = iZzd - iZzg;
            if (i6 > 0) {
                zzf(bArrZzi, iZzg, iZzd);
            }
            int i7 = iZze - iZzd;
            long j = this.zze - ((long) i7);
            int i8 = i6 < 0 ? -i6 : 0;
            long j2 = this.zzk;
            if (this.zzj) {
                i = iZze;
                i2 = i4;
            } else {
                this.zzb.zze(i8);
                this.zzc.zze(i8);
                if (this.zzj) {
                    i = iZze;
                    i2 = i4;
                    if (this.zzb.zzb()) {
                        zztq zztqVar = this.zzb;
                        this.zzi.zza(zzalw.zzb(zztqVar.zza, 3, zztqVar.zzb));
                        this.zzb.zza();
                    } else if (this.zzc.zzb()) {
                        zztq zztqVar2 = this.zzc;
                        this.zzi.zzb(zzalw.zzc(zztqVar2.zza, 3, zztqVar2.zzb));
                        this.zzc.zza();
                    }
                } else if (this.zzb.zzb() && this.zzc.zzb()) {
                    ArrayList arrayList = new ArrayList();
                    zztq zztqVar3 = this.zzb;
                    arrayList.add(Arrays.copyOf(zztqVar3.zza, zztqVar3.zzb));
                    zztq zztqVar4 = this.zzc;
                    arrayList.add(Arrays.copyOf(zztqVar4.zza, zztqVar4.zzb));
                    zztq zztqVar5 = this.zzb;
                    zzalv zzalvVarZzb = zzalw.zzb(zztqVar5.zza, 3, zztqVar5.zzb);
                    zztq zztqVar6 = this.zzc;
                    zzalu zzaluVarZzc = zzalw.zzc(zztqVar6.zza, 3, zztqVar6.zzb);
                    i2 = i4;
                    String strZza = zzakv.zza(zzalvVarZzb.zza, zzalvVarZzb.zzb, zzalvVarZzb.zzc);
                    zzox zzoxVar = this.zzh;
                    zzaft zzaftVar = new zzaft();
                    i = iZze;
                    zzaftVar.zzD(this.zzg);
                    zzaftVar.zzN("video/avc");
                    zzaftVar.zzK(strZza);
                    zzaftVar.zzS(zzalvVarZzb.zze);
                    zzaftVar.zzT(zzalvVarZzb.zzf);
                    zzaftVar.zzW(zzalvVarZzb.zzg);
                    zzaftVar.zzP(arrayList);
                    zzoxVar.zzs(zzaftVar.zzah());
                    this.zzj = true;
                    this.zzi.zza(zzalvVarZzb);
                    this.zzi.zzb(zzaluVarZzc);
                    this.zzb.zza();
                    this.zzc.zza();
                } else {
                    i = iZze;
                    i2 = i4;
                }
            }
            if (this.zzd.zze(i8)) {
                zztq zztqVar7 = this.zzd;
                this.zzm.zzb(this.zzd.zza, zzalw.zza(zztqVar7.zza, zztqVar7.zzb));
                this.zzm.zzh(4);
                this.zza.zzb(j2, this.zzm);
            }
            if (this.zzi.zze(j, i7, this.zzj, this.zzl)) {
                this.zzl = false;
            }
            long j3 = this.zzk;
            if (!this.zzj) {
                this.zzb.zzc(i5);
                this.zzc.zzc(i5);
            }
            this.zzd.zzc(i5);
            this.zzi.zzd(j, i5, j3);
            iZzg = i2;
            iZze = i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }
}
