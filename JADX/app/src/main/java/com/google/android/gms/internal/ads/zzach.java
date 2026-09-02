package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzach implements Callable {
    private final zzabr zza;
    private final zzyj zzb;

    public zzach(zzabr zzabrVar, zzyj zzyjVar) {
        this.zza = zzabrVar;
        this.zzb = zzyjVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzo() != null) {
            this.zza.zzo().get();
        }
        zzyz zzyzVarZzn = this.zza.zzn();
        if (zzyzVarZzn == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                try {
                    zzyj zzyjVar = this.zzb;
                    byte[] bArrZzao = zzyzVarZzn.zzao();
                    zzyjVar.zzaj(bArrZzao, 0, bArrZzao.length, zzgfm.zza());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (zzggm | NullPointerException unused) {
            return null;
        }
    }
}
