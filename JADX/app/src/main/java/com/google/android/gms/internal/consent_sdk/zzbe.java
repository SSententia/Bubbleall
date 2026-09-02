package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbe extends WebView {
    private final Handler zza;
    private final zzbj zzb;
    private boolean zzc;

    public zzbe(zzbh zzbhVar, Handler handler, zzbj zzbjVar) {
        super(zzbhVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzbjVar;
    }

    public final void zza(String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(string).length());
        sb.append(str);
        sb.append("(");
        sb.append(string);
        sb.append(");");
        final String string2 = sb.toString();
        this.zza.post(new Runnable(this, string2) { // from class: com.google.android.gms.internal.consent_sdk.zzbd
            private final zzbe zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = string2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzch.zza(this.zza, this.zzb);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zza(String str) {
        return str != null && str.startsWith("consent://");
    }

    static /* synthetic */ boolean zza(zzbe zzbeVar, boolean z) {
        zzbeVar.zzc = true;
        return true;
    }
}
