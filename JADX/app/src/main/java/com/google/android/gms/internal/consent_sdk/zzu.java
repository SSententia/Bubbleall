package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzu implements Runnable {
    private final ConsentInformation.OnConsentInfoUpdateSuccessListener zza;

    private zzu(ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener) {
        this.zza = onConsentInfoUpdateSuccessListener;
    }

    static Runnable zza(ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener) {
        return new zzu(onConsentInfoUpdateSuccessListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.onConsentInfoUpdateSuccess();
    }
}
