package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbj implements zzi {
    private final Application zza;
    private final zzbh zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zze zze;
    private final zzaj zzf;
    private final zzat zzg;

    zzbj(Application application, zzbh zzbhVar, Handler handler, Executor executor, zze zzeVar, zzaj zzajVar, zzat zzatVar) {
        this.zza = application;
        this.zzb = zzbhVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzeVar;
        this.zzf = zzajVar;
        this.zzg = zzatVar;
    }

    final void zza(int i, String str, String str2) {
        this.zzg.zza(new zzk(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i), str2, str)));
    }

    final void zza(String str) {
        String strValueOf = String.valueOf(str);
        Log.d("UserMessagingPlatform", strValueOf.length() != 0 ? "Receive consent action: ".concat(strValueOf) : new String("Receive consent action: "));
        Uri uri = Uri.parse(str);
        this.zze.zza(uri.getQueryParameter("action"), uri.getQueryParameter("args"), this, this.zzf);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzi
    public final Executor zza() {
        Handler handler = this.zzc;
        handler.getClass();
        return zzbm.zza(handler);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.consent_sdk.zzi
    public final boolean zza(String str, JSONObject jSONObject) {
        str.hashCode();
        int i = 2;
        switch (str) {
            case "load_complete":
                this.zzg.zzb();
                return true;
            case "configure_app_assets":
                this.zzd.execute(new Runnable(this) { // from class: com.google.android.gms.internal.consent_sdk.zzbl
                    private final zzbj zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb();
                    }
                });
                return true;
            case "browser":
                String strOptString = jSONObject.optString(ImagesContract.URL);
                if (TextUtils.isEmpty(strOptString)) {
                    Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
                }
                Uri uri = Uri.parse(strOptString);
                if (uri.getScheme() == null) {
                    String strValueOf = String.valueOf(strOptString);
                    Log.d("UserMessagingPlatform", strValueOf.length() != 0 ? "Action[browser]: empty scheme: ".concat(strValueOf) : new String("Action[browser]: empty scheme: "));
                }
                try {
                    this.zzb.startActivity(new Intent("android.intent.action.VIEW", uri));
                    break;
                } catch (ActivityNotFoundException e) {
                    String strValueOf2 = String.valueOf(strOptString);
                    zzca.zza(strValueOf2.length() != 0 ? "Action[browser]: can not open url: ".concat(strValueOf2) : new String("Action[browser]: can not open url: "), e);
                }
                return true;
            case "dismiss":
                String strOptString2 = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
                strOptString2.hashCode();
                switch (strOptString2) {
                    case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                    case "non_personalized":
                        i = 1;
                        this.zzg.zza(3, i);
                        return true;
                    case "personalized":
                    case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                        this.zzg.zza(3, i);
                        return true;
                    case "CONSENT_SIGNAL_SUFFICIENT":
                        i = 0;
                        this.zzg.zza(3, i);
                        return true;
                    default:
                        this.zzg.zzb(new zzk(1, "We are getting something wrong with the webview."));
                        return true;
                }
            default:
                return false;
        }
    }

    private static JSONObject zza(Context context) {
        String strConcat;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString());
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getApplicationInfo());
            if (applicationIcon == null) {
                strConcat = null;
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                String strValueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                strConcat = strValueOf.length() != 0 ? "data:image/png;base64,".concat(strValueOf) : new String("data:image/png;base64,");
            }
            jSONObject.put("app_icon", strConcat);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    final /* synthetic */ void zzb() {
        this.zzg.zza().zza("UMP_configureFormWithAppAssets", zza(this.zza));
    }
}
