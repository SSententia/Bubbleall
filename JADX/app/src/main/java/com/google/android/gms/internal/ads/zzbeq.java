package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzbeq<T> {
    private static final zzbfx zza;

    static {
        zzbfx zzbfvVar = null;
        try {
            Object objNewInstance = zzbep.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzbfvVar = iInterfaceQueryLocalInterface instanceof zzbfx ? (zzbfx) iInterfaceQueryLocalInterface : new zzbfv(iBinder);
                }
            } else {
                zzcgt.zzi("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            zzcgt.zzi("Failed to instantiate ClientApi class.");
        }
        zza = zzbfvVar;
    }

    zzbeq() {
    }

    private final T zze() {
        zzbfx zzbfxVar = zza;
        if (zzbfxVar == null) {
            zzcgt.zzi("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zzc(zzbfxVar);
        } catch (RemoteException e) {
            zzcgt.zzj("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final T zzf() {
        try {
            return zzb();
        } catch (RemoteException e) {
            zzcgt.zzj("Cannot invoke remote loader.", e);
            return null;
        }
    }

    protected abstract T zza();

    protected abstract T zzb() throws RemoteException;

    protected abstract T zzc(zzbfx zzbfxVar) throws RemoteException;

    public final T zzd(Context context, boolean z) {
        boolean z2;
        T tZze;
        if (!z) {
            zzber.zza();
            if (!zzcgm.zzn(context, 12451000)) {
                zzcgt.zzd("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = z | (!(DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID)));
        zzbjl.zza(context);
        if (zzbku.zza.zze().booleanValue()) {
            z2 = false;
        } else if (zzbku.zzb.zze().booleanValue()) {
            z2 = true;
            z3 = true;
        } else {
            z3 = z4;
            z2 = false;
        }
        if (z3) {
            tZze = zze();
            if (tZze == null && !z2) {
                tZze = zzf();
            }
        } else {
            T tZzf = zzf();
            if (tZzf == null) {
                if (zzber.zze().nextInt(zzblf.zza.zze().intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzber.zza().zze(context, zzber.zzd().zza, "gmob-apps", bundle, true);
                }
            }
            tZze = tZzf == null ? zze() : tZzf;
        }
        return tZze == null ? zza() : tZze;
    }
}
