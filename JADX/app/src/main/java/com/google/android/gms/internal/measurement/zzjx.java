package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzjx extends zzjv<zzjw, zzjw> {
    zzjx() {
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    final /* bridge */ /* synthetic */ void zza(zzjw zzjwVar, int i, long j) {
        zzjwVar.zzh(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    final /* bridge */ /* synthetic */ zzjw zzb() {
        return zzjw.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    final /* bridge */ /* synthetic */ void zzc(Object obj, zzjw zzjwVar) {
        ((zzhr) obj).zzc = zzjwVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    final /* bridge */ /* synthetic */ zzjw zzd(Object obj) {
        return ((zzhr) obj).zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    final void zze(Object obj) {
        ((zzhr) obj).zzc.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    final /* bridge */ /* synthetic */ zzjw zzf(zzjw zzjwVar, zzjw zzjwVar2) {
        zzjw zzjwVar3 = zzjwVar2;
        return zzjwVar3.equals(zzjw.zza()) ? zzjwVar : zzjw.zzc(zzjwVar, zzjwVar3);
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    final /* bridge */ /* synthetic */ int zzg(zzjw zzjwVar) {
        return zzjwVar.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    final /* bridge */ /* synthetic */ int zzh(zzjw zzjwVar) {
        return zzjwVar.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    final /* bridge */ /* synthetic */ void zzi(zzjw zzjwVar, zzgz zzgzVar) throws IOException {
        zzjwVar.zzi(zzgzVar);
    }
}
