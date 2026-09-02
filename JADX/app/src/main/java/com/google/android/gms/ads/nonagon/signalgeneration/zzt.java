package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzfrz;
import java.util.Collections;
import javax.annotation.Nonnull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzt implements zzfrz<Uri> {
    final /* synthetic */ zzcaf zza;
    final /* synthetic */ zzv zzb;

    zzt(zzv zzvVar, zzcaf zzcafVar) {
        this.zzb = zzvVar;
        this.zza = zzcafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        try {
            zzcaf zzcafVar = this.zza;
            String strValueOf = String.valueOf(th.getMessage());
            zzcafVar.zzf(strValueOf.length() != 0 ? "Internal error: ".concat(strValueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Uri uri) {
        Uri uri2 = uri;
        try {
            this.zzb.zzz.getAndIncrement();
            this.zza.zze(Collections.singletonList(uri2));
            if (this.zzb.zzu) {
                this.zzb.zzs.zzb(zzv.zzL(uri2, this.zzb.zzC, "1").toString());
            }
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
        }
    }
}
