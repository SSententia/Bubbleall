package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import androidx.media2.session.MediaConstants;
import com.bumptech.glide.load.Key;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdnw {
    private final zzdss zza;
    private final zzdrh zzb;
    private final zzcua zzc;
    private final zzdmu zzd;

    public zzdnw(zzdss zzdssVar, zzdrh zzdrhVar, zzcua zzcuaVar, zzdmu zzdmuVar) {
        this.zza = zzdssVar;
        this.zzb = zzdrhVar;
        this.zzc = zzcuaVar;
        this.zzd = zzdmuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() throws zzcmw {
        zzcml zzcmlVarZzb = this.zza.zzb(zzbdl.zzb(), null, null);
        View view = (View) zzcmlVarZzb;
        view.setVisibility(8);
        zzcmlVarZzb.zzab("/sendMessageToSdk", new zzbpr(this) { // from class: com.google.android.gms.internal.ads.zzdnq
            private final zzdnw zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                this.zza.zzf((zzcml) obj, map);
            }
        });
        zzcmlVarZzb.zzab("/adMuted", new zzbpr(this) { // from class: com.google.android.gms.internal.ads.zzdnr
            private final zzdnw zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                this.zza.zze((zzcml) obj, map);
            }
        });
        this.zzb.zzi(new WeakReference(zzcmlVarZzb), "/loadHtml", new zzbpr(this) { // from class: com.google.android.gms.internal.ads.zzdns
            private final zzdnw zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, final Map map) {
                final zzdnw zzdnwVar = this.zza;
                zzcml zzcmlVar = (zzcml) obj;
                zzcmlVar.zzR().zzy(new zzcnx(zzdnwVar, map) { // from class: com.google.android.gms.internal.ads.zzdnv
                    private final zzdnw zza;
                    private final Map zzb;

                    {
                        this.zza = zzdnwVar;
                        this.zzb = map;
                    }

                    @Override // com.google.android.gms.internal.ads.zzcnx
                    public final void zza(boolean z) {
                        this.zza.zzd(this.zzb, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcmlVar.loadData(str, "text/html", Key.STRING_CHARSET_NAME);
                } else {
                    zzcmlVar.loadDataWithBaseURL(str2, str, "text/html", Key.STRING_CHARSET_NAME, null);
                }
            }
        });
        this.zzb.zzi(new WeakReference(zzcmlVarZzb), "/showOverlay", new zzbpr(this) { // from class: com.google.android.gms.internal.ads.zzdnt
            private final zzdnw zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzcml) obj, map);
            }
        });
        this.zzb.zzi(new WeakReference(zzcmlVarZzb), "/hideOverlay", new zzbpr(this) { // from class: com.google.android.gms.internal.ads.zzdnu
            private final zzdnw zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcml) obj, map);
            }
        });
        return view;
    }

    final /* synthetic */ void zzb(zzcml zzcmlVar, Map map) {
        com.google.android.gms.ads.internal.util.zze.zzh("Hiding native ads overlay.");
        zzcmlVar.zzH().setVisibility(8);
        this.zzc.zze(false);
    }

    final /* synthetic */ void zzc(zzcml zzcmlVar, Map map) {
        com.google.android.gms.ads.internal.util.zze.zzh("Showing native ads overlay.");
        zzcmlVar.zzH().setVisibility(0);
        this.zzc.zze(true);
    }

    final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put(MediaConstants.MEDIA_URI_QUERY_ID, (String) map.get(MediaConstants.MEDIA_URI_QUERY_ID));
        this.zzb.zzg("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void zze(zzcml zzcmlVar, Map map) {
        this.zzd.zzw();
    }

    final /* synthetic */ void zzf(zzcml zzcmlVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }
}
