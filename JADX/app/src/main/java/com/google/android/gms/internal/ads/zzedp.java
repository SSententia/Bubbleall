package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzedp implements zzfrz<SQLiteDatabase> {
    final /* synthetic */ zzfdw zza;

    zzedp(zzedq zzedqVar, zzfdw zzfdwVar) {
        this.zza = zzfdwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        String strValueOf = String.valueOf(th.getMessage());
        com.google.android.gms.ads.internal.util.zze.zzf(strValueOf.length() != 0 ? "Failed to get offline buffered ping database: ".concat(strValueOf) : new String("Failed to get offline buffered ping database: "));
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(SQLiteDatabase sQLiteDatabase) {
        try {
            this.zza.zza(sQLiteDatabase);
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            com.google.android.gms.ads.internal.util.zze.zzf(strValueOf.length() != 0 ? "Error executing function on offline buffered ping database: ".concat(strValueOf) : new String("Error executing function on offline buffered ping database: "));
        }
    }
}
