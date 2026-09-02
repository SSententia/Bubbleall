package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdly extends zzbmd {
    private final zzdmm zza;
    private IObjectWrapper zzb;

    public zzdly(zzdmm zzdmmVar) {
        this.zza = zzdmmVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final float zze() throws RemoteException {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzeA)).booleanValue()) {
            return 0.0f;
        }
        if (this.zza.zzW() != 0.0f) {
            return this.zza.zzW();
        }
        if (this.zza.zzw() != null) {
            try {
                return this.zza.zzw().zzm();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        zzbmh zzbmhVarZzB = this.zza.zzB();
        if (zzbmhVarZzB == null) {
            return 0.0f;
        }
        float fZze = (zzbmhVarZzB.zze() == -1 || zzbmhVarZzB.zzf() == -1) ? 0.0f : zzbmhVarZzB.zze() / zzbmhVarZzB.zzf();
        return fZze == 0.0f ? zzb(zzbmhVarZzB.zzb()) : fZze;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final IObjectWrapper zzg() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbmh zzbmhVarZzB = this.zza.zzB();
        if (zzbmhVarZzB == null) {
            return null;
        }
        return zzbmhVarZzB.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final float zzh() throws RemoteException {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeB)).booleanValue() && this.zza.zzw() != null) {
            return this.zza.zzw().zzj();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final float zzi() throws RemoteException {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeB)).booleanValue() && this.zza.zzw() != null) {
            return this.zza.zzw().zzk();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final zzbhc zzj() throws RemoteException {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeB)).booleanValue()) {
            return this.zza.zzw();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final boolean zzk() throws RemoteException {
        return ((Boolean) zzbet.zzc().zzc(zzbjl.zzeB)).booleanValue() && this.zza.zzw() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzl(zzbnp zzbnpVar) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeB)).booleanValue() && (this.zza.zzw() instanceof zzcnh)) {
            ((zzcnh) this.zza.zzw()).zzv(zzbnpVar);
        }
    }
}
