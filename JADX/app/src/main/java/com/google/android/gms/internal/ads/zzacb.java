package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzacb extends zzacz {
    private static final zzada<String> zzi = new zzada<>();
    private final Context zzj;

    public zzacb(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i, int i2, Context context) {
        super(zzabrVar, "Cm/m2hUfCdldkdMMT3yEm1sAGuFpKVfLQblDoR20XcK7ttTDkHIz3fwaKTv7az9S", "aEm/NgN//tNFhysboe/lIhu1ib9P4g8tTm8w79YCsSs=", zzyjVar, i, 29);
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzp("E");
        AtomicReference<String> atomicReferenceZza = zzi.zza(this.zzj.getPackageName());
        if (atomicReferenceZza.get() == null) {
            synchronized (atomicReferenceZza) {
                if (atomicReferenceZza.get() == null) {
                    atomicReferenceZza.set((String) this.zzf.invoke(null, this.zzj));
                }
            }
        }
        String str = atomicReferenceZza.get();
        synchronized (this.zze) {
            this.zze.zzp(zzzo.zza(str.getBytes(), true));
        }
    }
}
