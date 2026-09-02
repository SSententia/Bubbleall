package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzlp implements zzaj {
    private final zzaj zza;
    private long zzb;
    private Uri zzc;
    private Map<String, List<String>> zzd;

    public final long zzb() {
        return this.zzb;
    }

    public final Uri zzc() {
        return this.zzc;
    }

    public final Map<String, List<String>> zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Map<String, List<String>> zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i, int i2) throws IOException {
        int iZzg = this.zza.zzg(bArr, i, i2);
        if (iZzg != -1) {
            this.zzb += (long) iZzg;
        }
        return iZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final long zzh(zzan zzanVar) throws IOException {
        this.zzc = zzanVar.zza;
        this.zzd = Collections.emptyMap();
        long jZzh = this.zza.zzh(zzanVar);
        Uri uriZzi = zzi();
        uriZzi.getClass();
        this.zzc = uriZzi;
        this.zzd = zzf();
        return jZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zzj() throws IOException {
        this.zza.zzj();
    }

    public zzlp(zzaj zzajVar) {
        zzajVar.getClass();
        this.zza = zzajVar;
        this.zzc = Uri.EMPTY;
        this.zzd = Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zza(zzay zzayVar) {
        zzayVar.getClass();
        this.zza.zza(zzayVar);
    }
}
