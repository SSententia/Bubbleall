package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdtc {
    private final Map<String, zzdtb> zza = new HashMap();

    zzdtc() {
    }

    final synchronized void zza(String str, zzfbi zzfbiVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdtb(str, zzfbiVar.zzz(), zzfbiVar.zzA()));
        } catch (zzfaw unused) {
        }
    }

    final synchronized void zzb(String str, zzbxn zzbxnVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdtb(str, zzbxnVar.zzf(), zzbxnVar.zzg()));
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final synchronized zzdtb zzc(String str) {
        return this.zza.get(str);
    }

    @Nullable
    public final zzdtb zzd(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            zzdtb zzdtbVarZzc = zzc(it.next());
            if (zzdtbVarZzc != null) {
                return zzdtbVarZzc;
            }
        }
        return null;
    }
}
