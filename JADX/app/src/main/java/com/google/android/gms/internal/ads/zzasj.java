package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzasj {
    private final zzapo[] zza;
    private final zzapp zzb;
    private zzapo zzc;

    public zzasj(zzapo[] zzapoVarArr, zzapp zzappVar) {
        this.zza = zzapoVarArr;
        this.zzb = zzappVar;
    }

    public final void zza() {
        if (this.zzc != null) {
            this.zzc = null;
        }
    }

    public final zzapo zzb(zzapn zzapnVar, Uri uri) throws InterruptedException, IOException {
        zzapo zzapoVar = this.zzc;
        if (zzapoVar != null) {
            return zzapoVar;
        }
        for (zzapo zzapoVar2 : this.zza) {
            try {
                if (zzapoVar2.zzf(zzapnVar)) {
                    this.zzc = zzapoVar2;
                    zzapnVar.zzg();
                    break;
                }
                continue;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                zzapnVar.zzg();
                throw th;
            }
            zzapnVar.zzg();
        }
        zzapo zzapoVar3 = this.zzc;
        if (zzapoVar3 != null) {
            zzapoVar3.zzd(this.zzb);
            return this.zzc;
        }
        String strZzn = zzave.zzn(this.zza);
        StringBuilder sb = new StringBuilder(strZzn.length() + 58);
        sb.append("None of the available extractors (");
        sb.append(strZzn);
        sb.append(") could read the stream.");
        throw new zzath(sb.toString(), uri);
    }
}
