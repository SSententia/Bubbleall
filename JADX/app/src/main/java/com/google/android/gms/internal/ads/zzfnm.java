package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfnm extends AbstractSet<Map.Entry> {
    final /* synthetic */ zzfns zza;

    zzfnm(zzfns zzfnsVar) {
        this.zza = zzfnsVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Map mapZzg = this.zza.zzg();
        if (mapZzg != null) {
            return mapZzg.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzy = this.zza.zzy(entry.getKey());
            if (iZzy != -1 && zzflt.zza(zzfns.zzt(this.zza, iZzy), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        zzfns zzfnsVar = this.zza;
        Map mapZzg = zzfnsVar.zzg();
        return mapZzg != null ? mapZzg.entrySet().iterator() : new zzfnk(zzfnsVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Map mapZzg = this.zza.zzg();
        if (mapZzg != null) {
            return mapZzg.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.zza.zzf()) {
            return false;
        }
        int iZzw = this.zza.zzw();
        int iZze = zzfnt.zze(entry.getKey(), entry.getValue(), iZzw, zzfns.zzo(this.zza), this.zza.zzA(), this.zza.zzB(), this.zza.zzC());
        if (iZze == -1) {
            return false;
        }
        this.zza.zzl(iZze, iZzw);
        this.zza.zzg--;
        this.zza.zzi();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
