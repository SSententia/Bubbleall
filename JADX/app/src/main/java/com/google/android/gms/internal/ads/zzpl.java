package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpl extends zzpq {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzpl(zzox zzoxVar) {
        super(zzoxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    protected final boolean zza(zzamf zzamfVar) throws zzpp {
        if (this.zzc) {
            zzamfVar.zzk(1);
        } else {
            int iZzn = zzamfVar.zzn();
            int i = iZzn >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(iZzn >> 2) & 3];
                zzaft zzaftVar = new zzaft();
                zzaftVar.zzN("audio/mpeg");
                zzaftVar.zzaa(1);
                zzaftVar.zzab(i2);
                this.zza.zzs(zzaftVar.zzah());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                zzaft zzaftVar2 = new zzaft();
                zzaftVar2.zzN(str);
                zzaftVar2.zzaa(1);
                zzaftVar2.zzab(8000);
                this.zza.zzs(zzaftVar2.zzah());
                this.zzd = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Audio format not supported: ");
                sb.append(i);
                throw new zzpp(sb.toString());
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    protected final boolean zzb(zzamf zzamfVar, long j) throws zzaha {
        if (this.zze == 2) {
            int iZzd = zzamfVar.zzd();
            this.zza.zzy(zzamfVar, iZzd);
            this.zza.zzv(j, 1, iZzd, 0, null);
            return true;
        }
        int iZzn = zzamfVar.zzn();
        if (iZzn != 0 || this.zzd) {
            if (this.zze == 10 && iZzn != 1) {
                return false;
            }
            int iZzd2 = zzamfVar.zzd();
            this.zza.zzy(zzamfVar, iZzd2);
            this.zza.zzv(j, 1, iZzd2, 0, null);
            return true;
        }
        int iZzd3 = zzamfVar.zzd();
        byte[] bArr = new byte[iZzd3];
        zzamfVar.zzm(bArr, 0, iZzd3);
        zzmv zzmvVarZza = zzmx.zza(bArr);
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzN("audio/mp4a-latm");
        zzaftVar.zzK(zzmvVarZza.zzc);
        zzaftVar.zzaa(zzmvVarZza.zzb);
        zzaftVar.zzab(zzmvVarZza.zza);
        zzaftVar.zzP(Collections.singletonList(bArr));
        this.zza.zzs(zzaftVar.zzah());
        this.zzd = true;
        return false;
    }
}
