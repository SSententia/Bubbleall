package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzai implements zzc.zza {
    private Application zza;

    private zzai() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzc.zza
    public final zzc zza() {
        zzcu.zza(this.zza, (Class<Application>) Application.class);
        return new zzag(this.zza, null);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzc.zza
    public final /* synthetic */ zzc.zza zza(Application application) {
        this.zza = (Application) zzcu.zza(application);
        return this;
    }

    /* synthetic */ zzai(zzaf zzafVar) {
        this();
    }
}
