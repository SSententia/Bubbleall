package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfhz extends zzfhv {
    /* JADX WARN: Multi-variable type inference failed */
    public zzfhz(zzfho zzfhoVar, zzfho zzfhoVar2, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(zzfhoVar, zzfhoVar2, hashSet, jSONObject, null);
    }

    private final void zzc(String str) {
        zzfgr zzfgrVarZza = zzfgr.zza();
        if (zzfgrVarZza != null) {
            for (zzfgg zzfggVar : zzfgrVarZza.zze()) {
                if (this.zza.contains(zzfggVar.zzh())) {
                    zzfggVar.zzg().zzg(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ String doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfhw, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        zzc(str2);
        super.onPostExecute(str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfhw
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
