package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzawz implements ValueCallback<String> {
    final /* synthetic */ zzaxa zza;

    zzawz(zzaxa zzaxaVar) {
        this.zza = zzaxaVar;
    }

    @Override // android.webkit.ValueCallback
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onReceiveValue(String str) {
        zzaxa zzaxaVar = this.zza;
        zzaxaVar.zze.zzd(zzaxaVar.zzb, zzaxaVar.zzc, str, zzaxaVar.zzd);
    }
}
