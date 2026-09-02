package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzacg extends zzacz {
    public zzacg(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i, int i2) {
        super(zzabrVar, "NSYe0Ak7CUXd9zFZA3bczJ8pTgBK/kfUu9ICpHR+lQrTNc8+V7Owo49e2WIp0407", "Ux7t0A/7z2bV/IDvLZJgV4tTxr0Vvc1KngWKlG2Szwg=", zzyjVar, i, 24);
    }

    private final void zzc() {
        AdvertisingIdClient advertisingIdClientZzt = this.zzb.zzt();
        if (advertisingIdClientZzt == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = advertisingIdClientZzt.getInfo();
            String strZza = zzabu.zza(info.getId());
            if (strZza != null) {
                synchronized (this.zze) {
                    try {
                        this.zze.zzS(strZza);
                        this.zze.zzT(info.isLimitAdTrackingEnabled());
                        this.zze.zzaa(6);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacz, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzb.zzi()) {
            zzc();
            return;
        }
        synchronized (this.zze) {
            this.zze.zzS((String) this.zzf.invoke(null, this.zzb.zzc()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    public final Void zzk() throws Exception {
        if (this.zzb.zzd()) {
            super.zzk();
            return null;
        }
        if (this.zzb.zzi()) {
            zzc();
        }
        return null;
    }
}
