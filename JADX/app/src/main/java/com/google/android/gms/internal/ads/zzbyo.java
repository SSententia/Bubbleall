package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbyo extends zzbyp implements zzbpr<zzcml> {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcml zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbiv zzk;
    private float zzl;
    private int zzm;

    public zzbyo(zzcml zzcmlVar, Context context, zzbiv zzbivVar) {
        super(zzcmlVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcmlVar;
        this.zzi = context;
        this.zzk = zzbivVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcml zzcmlVar, Map map) {
        JSONObject jSONObjectPut;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        zzber.zza();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzcgm.zzq(displayMetrics, displayMetrics.widthPixels);
        zzber.zza();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzcgm.zzq(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityZzj = this.zzh.zzj();
        if (activityZzj == null || activityZzj.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzt.zzc();
            int[] iArrZzT = com.google.android.gms.ads.internal.util.zzs.zzT(activityZzj);
            zzber.zza();
            this.zzd = zzcgm.zzq(this.zza, iArrZzT[0]);
            zzber.zza();
            this.zze = zzcgm.zzq(this.zza, iArrZzT[1]);
        }
        if (this.zzh.zzP().zzg()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzk(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbyn zzbynVar = new zzbyn();
        zzbiv zzbivVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbynVar.zzg(zzbivVar.zzc(intent));
        zzbiv zzbivVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbynVar.zzf(zzbivVar2.zzc(intent2));
        zzbynVar.zzh(this.zzk.zzb());
        zzbynVar.zzi(this.zzk.zza());
        zzbynVar.zzj(true);
        boolean z = zzbynVar.zza;
        boolean z2 = zzbynVar.zzb;
        boolean z3 = zzbynVar.zzc;
        boolean z4 = zzbynVar.zzd;
        boolean z5 = zzbynVar.zze;
        zzcml zzcmlVar2 = this.zzh;
        try {
            jSONObjectPut = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObjectPut = null;
        }
        zzcmlVar2.zzd("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(zzber.zza().zza(this.zzi, iArr[0]), zzber.zza().zza(this.zzi, iArr[1]));
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            com.google.android.gms.ads.internal.util.zze.zzh("Dispatching Ready Event.");
        }
        zzg(this.zzh.zzt().zza);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006f A[PHI: r2
  0x006f: PHI (r2v4 int) = (r2v3 int), (r2v8 int) binds: [B:11:0x0046, B:17:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    public final void zzb(int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.zzi instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzc();
            i3 = com.google.android.gms.ads.internal.util.zzs.zzV((Activity) this.zzi)[0];
        } else {
            i3 = 0;
        }
        if (this.zzh.zzP() == null || !this.zzh.zzP().zzg()) {
            int width = this.zzh.getWidth();
            int height = this.zzh.getHeight();
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzM)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzP() != null ? this.zzh.zzP().zzb : 0;
                }
                if (height != 0) {
                    i4 = height;
                } else if (this.zzh.zzP() != null) {
                    i4 = this.zzh.zzP().zza;
                }
            } else {
                i4 = height;
            }
            this.zzf = zzber.zza().zza(this.zzi, width);
            this.zzg = zzber.zza().zza(this.zzi, i4);
        }
        zzi(i, i2 - i3, this.zzf, this.zzg);
        this.zzh.zzR().zzE(i, i2);
    }
}
