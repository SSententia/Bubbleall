package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbmi extends NativeAd.Image {
    private final zzbmh zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbmi(zzbmh zzbmhVar) {
        Drawable drawable;
        double dZzd;
        int iZze;
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
        int iZzf = -1;
        try {
            iZze = this.zza.zze();
        } catch (RemoteException e4) {
            zzcgt.zzg("", e4);
            iZze = -1;
        }
        this.zze = iZze;
        try {
            iZzf = this.zza.zzf();
        } catch (RemoteException e5) {
            zzcgt.zzg("", e5);
        }
        this.zzf = iZzf;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zzb() {
        return this.zzf;
    }
}
