package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzfrz;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzr implements zzfrz<zzah> {
    final /* synthetic */ zzcfk zza;
    final /* synthetic */ zzv zzb;

    zzr(zzv zzvVar, zzcfk zzcfkVar) {
        this.zzb = zzvVar;
        this.zza = zzcfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        String message = th.getMessage();
        com.google.android.gms.ads.internal.zzt.zzg().zzk(th, "SignalGeneratorImpl.generateSignals");
        zzv.zzy(this.zzb, "sgf", "sgf_reason", message);
        try {
            zzcfk zzcfkVar = this.zza;
            String strValueOf = String.valueOf(message);
            zzcfkVar.zzb(strValueOf.length() != 0 ? "Internal error. ".concat(strValueOf) : new String("Internal error. "));
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(zzah zzahVar) {
        zzah zzahVar2 = zzahVar;
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzfx)).booleanValue()) {
            try {
                this.zza.zzb("QueryInfo generation has been disabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzf("QueryInfo generation has been disabled.".concat(e.toString()));
                return;
            }
        }
        try {
            if (zzahVar2 == null) {
                this.zza.zzc(null, null, null);
                zzv.zzy(this.zzb, "sgs", "rid", "-1");
                return;
            }
            try {
                String strOptString = new JSONObject(zzahVar2.zzb).optString("request_id", "");
                if (TextUtils.isEmpty(strOptString)) {
                    com.google.android.gms.ads.internal.util.zze.zzi("The request ID is empty in request JSON.");
                    this.zza.zzb("Internal error: request ID is empty in request JSON.");
                    zzv.zzy(this.zzb, "sgf", "sgf_reason", "rid_missing");
                    return;
                }
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfi)).booleanValue()) {
                    this.zzb.zzp.zzb(strOptString, zzahVar2.zzb);
                }
                Bundle bundle = zzahVar2.zzc;
                if (this.zzb.zzw && bundle != null && bundle.getInt(this.zzb.zzy, -1) == -1) {
                    bundle.putInt(this.zzb.zzy, this.zzb.zzz.get());
                }
                if (this.zzb.zzv && bundle != null && TextUtils.isEmpty(bundle.getString(this.zzb.zzx))) {
                    if (TextUtils.isEmpty(this.zzb.zzB)) {
                        this.zzb.zzB = com.google.android.gms.ads.internal.zzt.zzc().zzi(this.zzb.zzg, this.zzb.zzA.zza);
                    }
                    bundle.putString(this.zzb.zzx, this.zzb.zzB);
                }
                this.zza.zzc(zzahVar2.zza, zzahVar2.zzb, bundle);
                zzv.zzy(this.zzb, "sgs", "rid", strOptString);
            } catch (JSONException e2) {
                com.google.android.gms.ads.internal.util.zze.zzi("Failed to create JSON object from the request string.");
                zzcfk zzcfkVar = this.zza;
                String string = e2.toString();
                StringBuilder sb = new StringBuilder(string.length() + 33);
                sb.append("Internal error for request JSON: ");
                sb.append(string);
                zzcfkVar.zzb(sb.toString());
                zzv.zzy(this.zzb, "sgf", "sgf_reason", "request_invalid");
            }
        } catch (RemoteException e3) {
            zzcgt.zzg("", e3);
        }
    }
}
