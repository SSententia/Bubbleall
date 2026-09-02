package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.C1205R;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbym extends zzbyp {
    private final Map<String, String> zza;
    private final Context zzb;

    public zzbym(zzcml zzcmlVar, Map<String, String> map) {
        super(zzcmlVar, "storePicture");
        this.zza = map;
        this.zzb = zzcmlVar.zzj();
    }

    public final void zzb() {
        if (this.zzb == null) {
            zzf("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!new zzbiv(this.zzb).zza()) {
            zzf("Feature is not supported by the device.");
            return;
        }
        String str = this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzf("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            String strValueOf = String.valueOf(str);
            zzf(strValueOf.length() != 0 ? "Invalid image url: ".concat(strValueOf) : new String("Invalid image url: "));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzt.zzc();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            String strValueOf2 = String.valueOf(lastPathSegment);
            zzf(strValueOf2.length() != 0 ? "Image type not recognized: ".concat(strValueOf2) : new String("Image type not recognized: "));
            return;
        }
        Resources resourcesZzj = com.google.android.gms.ads.internal.zzt.zzg().zzj();
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.zzb);
        builder.setTitle(resourcesZzj != null ? resourcesZzj.getString(C1205R.string.f176s1) : "Save image");
        builder.setMessage(resourcesZzj != null ? resourcesZzj.getString(C1205R.string.f177s2) : "Allow Ad to store image in Picture gallery?");
        builder.setPositiveButton(resourcesZzj != null ? resourcesZzj.getString(C1205R.string.f178s3) : "Accept", new zzbyk(this, str, lastPathSegment));
        builder.setNegativeButton(resourcesZzj != null ? resourcesZzj.getString(C1205R.string.f179s4) : "Decline", new zzbyl(this));
        builder.create().show();
    }
}
