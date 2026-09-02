package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbma extends NativeAd.AdChoicesInfo {
    private final zzblz zza;
    private final List<NativeAd.Image> zzb = new ArrayList();
    private String zzc;

    public zzbma(zzblz zzblzVar) {
        IBinder iBinder;
        this.zza = zzblzVar;
        try {
            this.zzc = zzblzVar.zzb();
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
            this.zzc = "";
        }
        try {
            for (zzbmh zzbmhVar : zzblzVar.zzc()) {
                zzbmh zzbmfVar = null;
                if ((zzbmhVar instanceof IBinder) && (iBinder = (IBinder) zzbmhVar) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbmfVar = iInterfaceQueryLocalInterface instanceof zzbmh ? (zzbmh) iInterfaceQueryLocalInterface : new zzbmf(iBinder);
                }
                if (zzbmfVar != null) {
                    this.zzb.add(new zzbmi(zzbmfVar));
                }
            }
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
