package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzfrz;
import java.util.ArrayList;
import javax.annotation.Nonnull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzs implements zzfrz<ArrayList<Uri>> {
    final /* synthetic */ zzcaf zza;
    final /* synthetic */ zzv zzb;

    zzs(zzv zzvVar, zzcaf zzcafVar) {
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
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull ArrayList<Uri> arrayList) {
        ArrayList<Uri> arrayList2 = arrayList;
        try {
            this.zza.zze(arrayList2);
            if (this.zzb.zzt) {
                for (Uri uri : arrayList2) {
                    if (zzv.zzw(uri)) {
                        this.zzb.zzs.zzb(zzv.zzL(uri, this.zzb.zzC, "1").toString());
                    }
                }
            }
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
        }
    }
}
