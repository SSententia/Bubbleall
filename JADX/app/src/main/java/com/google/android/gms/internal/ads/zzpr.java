package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpr extends zzpq {
    private final zzamf zzb;
    private final zzamf zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzpr(zzox zzoxVar) {
        super(zzoxVar);
        this.zzb = new zzamf(zzalw.zza);
        this.zzc = new zzamf(4);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    protected final boolean zza(zzamf zzamfVar) throws zzpp {
        int iZzn = zzamfVar.zzn();
        int i = iZzn >> 4;
        int i2 = iZzn & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new zzpp(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    protected final boolean zzb(zzamf zzamfVar, long j) throws zzaha {
        int iZzn = zzamfVar.zzn();
        long jZzs = j + (((long) zzamfVar.zzs()) * 1000);
        if (iZzn == 0) {
            if (!this.zze) {
                zzamf zzamfVar2 = new zzamf(new byte[zzamfVar.zzd()]);
                zzamfVar.zzm(zzamfVar2.zzi(), 0, zzamfVar.zzd());
                zzne zzneVarZza = zzne.zza(zzamfVar2);
                this.zzd = zzneVarZza.zzb;
                zzaft zzaftVar = new zzaft();
                zzaftVar.zzN("video/avc");
                zzaftVar.zzK(zzneVarZza.zzf);
                zzaftVar.zzS(zzneVarZza.zzc);
                zzaftVar.zzT(zzneVarZza.zzd);
                zzaftVar.zzW(zzneVarZza.zze);
                zzaftVar.zzP(zzneVarZza.zza);
                this.zza.zzs(zzaftVar.zzah());
                this.zze = true;
                return false;
            }
        } else if (iZzn == 1 && this.zze) {
            int i = this.zzg == 1 ? 1 : 0;
            if (!this.zzf && i == 0) {
                return false;
            }
            byte[] bArrZzi = this.zzc.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i2 = 4 - this.zzd;
            int i3 = 0;
            while (zzamfVar.zzd() > 0) {
                zzamfVar.zzm(this.zzc.zzi(), i2, this.zzd);
                this.zzc.zzh(0);
                int iZzB = this.zzc.zzB();
                this.zzb.zzh(0);
                this.zza.zzy(this.zzb, 4);
                this.zza.zzy(zzamfVar, iZzB);
                i3 = i3 + 4 + iZzB;
            }
            this.zza.zzv(jZzs, i, i3, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
