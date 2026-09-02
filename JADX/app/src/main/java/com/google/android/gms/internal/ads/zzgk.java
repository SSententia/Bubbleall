package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgk implements zzhx {
    private final zzoa zza;
    private zznu zzb;
    private zznv zzc;

    public zzgk(zzoa zzoaVar) {
        this.zza = zzoaVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zza(zzah zzahVar, Uri uri, Map<String, List<String>> map, long j, long j2, zznx zznxVar) throws IOException {
        zznp zznpVar = new zznp(zzahVar, j, j2);
        this.zzc = zznpVar;
        if (this.zzb != null) {
            return;
        }
        zznu[] zznuVarArrZza = this.zza.zza(uri, map);
        int length = zznuVarArrZza.length;
        if (length == 1) {
            this.zzb = zznuVarArrZza[0];
        } else {
            for (int i = 0; i < length; i++) {
                zznu zznuVar = zznuVarArrZza[i];
                try {
                    if (zznuVar.zza(zznpVar)) {
                        this.zzb = zznuVar;
                        zzakt.zzd(zznuVar != null || zznpVar.zzn() == j);
                        zznpVar.zzl();
                        break;
                    } else {
                        boolean z = this.zzb != null || zznpVar.zzn() == j;
                        zzakt.zzd(z);
                        zznpVar.zzl();
                    }
                } catch (EOFException unused) {
                    if (this.zzb != null || zznpVar.zzn() == j) {
                    }
                } catch (Throwable th) {
                    zzakt.zzd(this.zzb != null || zznpVar.zzn() == j);
                    zznpVar.zzl();
                    throw th;
                }
                zzakt.zzd(z);
                zznpVar.zzl();
            }
            if (this.zzb == null) {
                String strZzM = zzamq.zzM(zznuVarArrZza);
                StringBuilder sb = new StringBuilder(strZzM.length() + 58);
                sb.append("None of the available extractors (");
                sb.append(strZzM);
                sb.append(") could read the stream.");
                throw new zzjb(sb.toString(), uri);
            }
        }
        this.zzb.zzb(zznxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zzb() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zzc() {
        zznu zznuVar = this.zzb;
        if (zznuVar instanceof zzqq) {
            ((zzqq) zznuVar).zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final long zzd() {
        zznv zznvVar = this.zzc;
        if (zznvVar != null) {
            return zznvVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zze(long j, long j2) {
        zznu zznuVar = this.zzb;
        zznuVar.getClass();
        zznuVar.zzd(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final int zzf(zzoq zzoqVar) throws IOException {
        zznu zznuVar = this.zzb;
        zznuVar.getClass();
        zznv zznvVar = this.zzc;
        zznvVar.getClass();
        return zznuVar.zzc(zznvVar, zzoqVar);
    }
}
