package com.google.android.gms.internal.ads;

import androidx.media2.session.MediaConstants;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbuk<I, O> implements zzbtw<I, O> {
    private final zzbty<O> zza;
    private final zzbtz<I> zzb;
    private final zzbts zzc;
    private final String zzd;

    zzbuk(zzbts zzbtsVar, String str, zzbtz<I> zzbtzVar, zzbty<O> zzbtyVar) {
        this.zzc = zzbtsVar;
        this.zzd = str;
        this.zzb = zzbtzVar;
        this.zza = zzbtyVar;
    }

    static /* synthetic */ void zzd(zzbuk zzbukVar, zzbtm zzbtmVar, zzbtt zzbttVar, Object obj, zzchl zzchlVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            String string = UUID.randomUUID().toString();
            zzbpq.zzo.zzb(string, new zzbuj(zzbukVar, zzbtmVar, zzchlVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MediaConstants.MEDIA_URI_QUERY_ID, string);
            jSONObject.put("args", zzbukVar.zzb.zzb(obj));
            zzbttVar.zzr(zzbukVar.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzchlVar.zzd(e);
                com.google.android.gms.ads.internal.util.zze.zzg("Unable to invokeJavascript", e);
            } finally {
                zzbtmVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final zzfsm<O> zza(I i) throws Exception {
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzfsm<O> zzb(I i) {
        zzchl zzchlVar = new zzchl();
        zzbtm zzbtmVarZzg = this.zzc.zzg(null);
        zzbtmVarZzg.zzf(new zzbuh(this, zzbtmVarZzg, i, zzchlVar), new zzbui(this, zzchlVar, zzbtmVarZzg));
        return zzchlVar;
    }
}
