package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.work.WorkRequest;
import com.bumptech.glide.load.Key;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzat implements ConsentForm {
    private final Application zza;
    private final zzab zzb;
    private final zzbh zzc;
    private final zzal zzd;
    private final zzbb zze;
    private final zzct<zzbe> zzf;
    private Dialog zzg;
    private zzbe zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference<zzax> zzj = new AtomicReference<>();
    private final AtomicReference<ConsentForm.OnConsentFormDismissedListener> zzk = new AtomicReference<>();
    private final AtomicReference<zzay> zzl = new AtomicReference<>();

    public zzat(Application application, zzab zzabVar, zzbh zzbhVar, zzal zzalVar, zzbb zzbbVar, zzct<zzbe> zzctVar) {
        this.zza = application;
        this.zzb = zzabVar;
        this.zzc = zzbhVar;
        this.zzd = zzalVar;
        this.zze = zzbbVar;
        this.zzf = zzctVar;
    }

    final void zza(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzbe zzbeVarZza = this.zzf.zza();
        this.zzh = zzbeVarZza;
        zzbeVarZza.setBackgroundColor(0);
        zzbeVarZza.getSettings().setJavaScriptEnabled(true);
        zzbeVarZza.setWebViewClient(new zzbf(zzbeVarZza));
        this.zzj.set(new zzax(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener));
        this.zzh.loadDataWithBaseURL(this.zze.zza(), this.zze.zzb(), "text/html", Key.STRING_CHARSET_NAME, null);
        zzcd.zza.postDelayed(new Runnable(this) { // from class: com.google.android.gms.internal.consent_sdk.zzaw
            private final zzat zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc();
            }
        }, WorkRequest.MIN_BACKOFF_MILLIS);
    }

    final zzbe zza() {
        return this.zzh;
    }

    @Override // com.google.android.ump.ConsentForm
    public final void show(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zzcd.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            onConsentFormDismissedListener.onConsentFormDismissed(new zzk(3, "ConsentForm#show can only be invoked once.").zza());
            return;
        }
        zzay zzayVar = new zzay(this, activity);
        this.zza.registerActivityLifecycleCallbacks(zzayVar);
        this.zzl.set(zzayVar);
        this.zzc.zza(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.zzh);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            onConsentFormDismissedListener.onConsentFormDismissed(new zzk(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        this.zzk.set(onConsentFormDismissedListener);
        dialog.show();
        this.zzg = dialog;
    }

    final void zzb() {
        zzax andSet = this.zzj.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.onConsentFormLoadSuccess(this);
    }

    final void zza(zzk zzkVar) {
        zzax andSet = this.zzj.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.onConsentFormLoadFailure(zzkVar.zza());
    }

    final void zza(int i, int i2) {
        zzd();
        ConsentForm.OnConsentFormDismissedListener andSet = this.zzk.getAndSet(null);
        if (andSet == null) {
            return;
        }
        this.zzd.zza(3);
        this.zzd.zzb(i2);
        andSet.onConsentFormDismissed(null);
    }

    final void zzb(zzk zzkVar) {
        zzd();
        ConsentForm.OnConsentFormDismissedListener andSet = this.zzk.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.onConsentFormDismissed(zzkVar.zza());
    }

    private final void zzd() {
        Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza(null);
        zzay andSet = this.zzl.getAndSet(null);
        if (andSet != null) {
            andSet.zza();
        }
    }

    final /* synthetic */ void zzc() {
        zza(new zzk(4, "Web view timed out."));
    }
}
