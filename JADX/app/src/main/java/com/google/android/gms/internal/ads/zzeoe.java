package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeoe implements zzery<zzerx<Bundle>> {
    private final zzewv zza;

    zzeoe(zzewv zzewvVar) {
        this.zza = zzewvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzerx<Bundle>> zza() {
        zzewv zzewvVar = this.zza;
        zzerx zzerxVar = null;
        if (zzewvVar != null && zzewvVar.zza() != null && !this.zza.zza().isEmpty()) {
            zzerxVar = new zzerx(this) { // from class: com.google.android.gms.internal.ads.zzeod
                private final zzeoe zza;

                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzerx
                public final void zzf(Object obj) {
                    this.zza.zzb((Bundle) obj);
                }
            };
        }
        return zzfsd.zza(zzerxVar);
    }

    final /* synthetic */ void zzb(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
