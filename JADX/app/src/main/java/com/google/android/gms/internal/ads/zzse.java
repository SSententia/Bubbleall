package com.google.android.gms.internal.ads;

import androidx.window.embedding.EmbeddingCompat;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzse implements zznu {
    public static final zzoa zza = zzsd.zza;
    private zznx zzb;
    private zzsm zzc;
    private boolean zzd;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = EmbeddingCompat.DEBUG)
    private final boolean zze(zznv zznvVar) throws IOException {
        zzsg zzsgVar = new zzsg();
        if (zzsgVar.zzc(zznvVar, true) && (zzsgVar.zza & 2) == 2) {
            int iMin = Math.min(zzsgVar.zze, 8);
            zzamf zzamfVar = new zzamf(iMin);
            ((zznp) zznvVar).zzh(zzamfVar.zzi(), 0, iMin, false);
            zzamfVar.zzh(0);
            if (zzamfVar.zzd() >= 5 && zzamfVar.zzn() == 127 && zzamfVar.zzt() == 1179402563) {
                this.zzc = new zzsc();
            } else {
                zzamfVar.zzh(0);
                try {
                    if (zzpc.zzc(1, zzamfVar, true)) {
                        this.zzc = new zzso();
                    } else {
                        zzamfVar.zzh(0);
                        if (zzsi.zzd(zzamfVar)) {
                            this.zzc = new zzsi();
                        }
                    }
                } catch (zzaha unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        try {
            return zze(zznvVar);
        } catch (zzaha unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzb = zznxVar;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        zzakt.zze(this.zzb);
        if (this.zzc == null) {
            if (!zze(zznvVar)) {
                throw zzaha.zzb("Failed to determine bitstream type", null);
            }
            zznvVar.zzl();
        }
        if (!this.zzd) {
            zzox zzoxVarZzB = this.zzb.zzB(0, 1);
            this.zzb.zzC();
            this.zzc.zze(this.zzb, zzoxVarZzB);
            this.zzd = true;
        }
        return this.zzc.zzg(zznvVar, zzoqVar);
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        zzsm zzsmVar = this.zzc;
        if (zzsmVar != null) {
            zzsmVar.zzf(j, j2);
        }
    }
}
