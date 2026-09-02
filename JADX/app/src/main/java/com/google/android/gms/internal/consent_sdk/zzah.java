package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzah implements zzau {
    private zzbb zza;
    private final /* synthetic */ zzag zzb;

    private zzah(zzag zzagVar) {
        this.zzb = zzagVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzau
    public final zzar zza() {
        zzcu.zza(this.zza, (Class<zzbb>) zzbb.class);
        return new zzak(this.zzb, this.zza, null);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzau
    public final /* synthetic */ zzau zza(zzbb zzbbVar) {
        this.zza = (zzbb) zzcu.zza(zzbbVar);
        return this;
    }

    /* synthetic */ zzah(zzag zzagVar, zzaf zzafVar) {
        this(zzagVar);
    }
}
