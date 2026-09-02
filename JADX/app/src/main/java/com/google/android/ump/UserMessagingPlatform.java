package com.google.android.ump;

import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zzc;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class UserMessagingPlatform {

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(FormError formError);
    }

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(ConsentForm consentForm);
    }

    public static ConsentInformation getConsentInformation(Context context) {
        return zzc.zza(context).zza();
    }

    public static void loadConsentForm(Context context, OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzc.zza(context).zzb().zza(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
    }

    private UserMessagingPlatform() {
    }
}
