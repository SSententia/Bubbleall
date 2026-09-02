package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaqi extends zzaqk {
    public final long zza;
    public final List<zzaqj> zzb;
    public final List<zzaqi> zzc;

    public zzaqi(int i, long j) {
        super(i);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzaqk
    public final String toString() {
        String strZzg = zzg(this.zzaR);
        String string = Arrays.toString(this.zzb.toArray());
        String string2 = Arrays.toString(this.zzc.toArray());
        int length = String.valueOf(string).length();
        StringBuilder sb = new StringBuilder(strZzg.length() + 22 + length + String.valueOf(string2).length());
        sb.append(strZzg);
        sb.append(" leaves: ");
        sb.append(string);
        sb.append(" containers: ");
        sb.append(string2);
        return sb.toString();
    }

    public final void zza(zzaqj zzaqjVar) {
        this.zzb.add(zzaqjVar);
    }

    public final void zzb(zzaqi zzaqiVar) {
        this.zzc.add(zzaqiVar);
    }

    public final zzaqj zzc(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzaqj zzaqjVar = this.zzb.get(i2);
            if (zzaqjVar.zzaR == i) {
                return zzaqjVar;
            }
        }
        return null;
    }

    public final zzaqi zzd(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzaqi zzaqiVar = this.zzc.get(i2);
            if (zzaqiVar.zzaR == i) {
                return zzaqiVar;
            }
        }
        return null;
    }
}
