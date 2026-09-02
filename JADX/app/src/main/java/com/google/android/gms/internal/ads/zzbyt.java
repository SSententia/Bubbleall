package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbyt extends NativeAd.Image {
    private final zzbmh zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;

    public zzbyt(zzbmh zzbmhVar) {
        Drawable drawable;
        double dZzd;
        this.zza = zzbmhVar;
        Uri uriZzc = null;
        try {
            IObjectWrapper iObjectWrapperZzb = zzbmhVar.zzb();
            drawable = iObjectWrapperZzb != null ? (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzb) : null;
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
        }
        this.zzb = drawable;
        try {
            uriZzc = this.zza.zzc();
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
        this.zzc = uriZzc;
        try {
            dZzd = this.zza.zzd();
        } catch (RemoteException e3) {
            zzcgt.zzg("", e3);
            dZzd = 1.0d;
        }
        this.zzd = dZzd;
        try {
            this.zza.zze();
        } catch (RemoteException e4) {
            zzcgt.zzg("", e4);
        }
        try {
            this.zza.zzf();
        } catch (RemoteException e5) {
            zzcgt.zzg("", e5);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.zzc;
    }
}
