package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcwv extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcwv(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcwv zza(Context context, View view, zzezz zzezzVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcwv zzcwvVar = new zzcwv(context);
        if (!zzezzVar.zzu.isEmpty() && (resources = zzcwvVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfaa zzfaaVar = zzezzVar.zzu.get(0);
            zzcwvVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzfaaVar.zza * displayMetrics.density), (int) (zzfaaVar.zzb * displayMetrics.density)));
        }
        zzcwvVar.zzb = view;
        zzcwvVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcht.zzb(zzcwvVar, zzcwvVar);
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcht.zza(zzcwvVar, zzcwvVar);
        JSONObject jSONObject = zzezzVar.zzae;
        RelativeLayout relativeLayout = new RelativeLayout(zzcwvVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcwvVar.zzb(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcwvVar.zzb(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcwvVar.addView(relativeLayout);
        return zzcwvVar;
    }

    private final void zzb(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzc = zzc(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iZzc, 0, iZzc);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzc(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    private final int zzc(double d) {
        zzber.zza();
        return zzcgm.zzs(this.zza, (int) d);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
