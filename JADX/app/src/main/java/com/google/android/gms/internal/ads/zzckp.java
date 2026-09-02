package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.media2.widget.Cea708CCParser;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzckp implements zzbpr<zzcjb> {
    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcjb zzcjbVar, Map map) {
        zzcjb zzcjbVar2 = zzcjbVar;
        zzcnh zzcnhVarZzh = zzcjbVar2.zzh();
        if (zzcnhVarZzh == null) {
            try {
                zzcnh zzcnhVar = new zzcnh(zzcjbVar2, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcjbVar2.zzx(zzcnhVar);
                zzcnhVarZzh = zzcnhVar;
            } catch (NullPointerException e) {
                e = e;
                com.google.android.gms.ads.internal.util.zze.zzg("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.zze.zzg("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f2 = Float.parseFloat((String) map.get("currentTime"));
        int i = Integer.parseInt((String) map.get("playbackState"));
        int i2 = 0;
        if (i >= 0 && i <= 3) {
            i2 = i;
        }
        String str = (String) map.get("aspectRatio");
        float f3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + Cea708CCParser.Const.CODE_C1_DLW);
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(f2);
            sb.append(" , duration : ");
            sb.append(f);
            sb.append(" , isMuted : ");
            sb.append(zEquals);
            sb.append(" , playbackState : ");
            sb.append(i2);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            com.google.android.gms.ads.internal.util.zze.zzd(sb.toString());
        }
        zzcnhVarZzh.zzs(f2, f, i2, zEquals, f3);
    }
}
