package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzale {
    private final SparseBooleanArray zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzale)) {
            return false;
        }
        zzale zzaleVar = (zzale) obj;
        if (zzamq.zza >= 24) {
            return this.zza.equals(zzaleVar.zza);
        }
        if (this.zza.size() != zzaleVar.zza.size()) {
            return false;
        }
        for (int i = 0; i < this.zza.size(); i++) {
            if (zzb(i) != zzaleVar.zzb(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (zzamq.zza >= 24) {
            return this.zza.hashCode();
        }
        int size = this.zza.size();
        for (int i = 0; i < this.zza.size(); i++) {
            size = (size * 31) + zzb(i);
        }
        return size;
    }

    public final int zza() {
        return this.zza.size();
    }

    public final int zzb(int i) {
        zzakt.zzc(i, 0, this.zza.size());
        return this.zza.keyAt(i);
    }
}
