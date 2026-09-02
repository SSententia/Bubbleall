package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzacw extends zzacz {
    private final View zzi;

    public zzacw(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i, int i2, View view) {
        super(zzabrVar, "Rh7wPiyt0Q0zAefasWAQ/36LhULiVi3U1eCO9K34euxkll+3xBb3q2iaqyDuAy33", "Kmv9uscZLQkY9DcwgermeDphrIGnHnQJYdRAudw6Thg=", zzyjVar, i, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) zzbet.zzc().zzc(zzbjl.zzbX);
            zzabv zzabvVar = new zzabv((String) this.zzf.invoke(null, this.zzi, this.zzb.zzc().getResources().getDisplayMetrics(), bool));
            zzyx zzyxVarZza = zzyy.zza();
            zzyxVarZza.zza(zzabvVar.zza.longValue());
            zzyxVarZza.zzb(zzabvVar.zzb.longValue());
            zzyxVarZza.zzc(zzabvVar.zzc.longValue());
            if (bool.booleanValue()) {
                zzyxVarZza.zzd(zzabvVar.zzd.longValue());
            }
            this.zze.zzL(zzyxVarZza.zzah());
        }
    }
}
