package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzcgm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
public class zzz extends zzx {
    static final boolean zzp(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzad
    public final boolean zzo(Activity activity, Configuration configuration) {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzdk)).booleanValue()) {
            return false;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdm)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        zzber.zza();
        int iZzs = zzcgm.zzs(activity, configuration.screenHeightDp);
        int iZzs2 = zzcgm.zzs(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics displayMetricsZzy = zzs.zzy(windowManager);
        int i = displayMetricsZzy.heightPixels;
        int i2 = displayMetricsZzy.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iRound = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) zzbet.zzc().zzc(zzbjl.zzdi)).intValue();
        return (zzp(i, iZzs + dimensionPixelSize, iRound) && zzp(i2, iZzs2, iRound)) ? false : true;
    }
}
