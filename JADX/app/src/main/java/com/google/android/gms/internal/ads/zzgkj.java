package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgkj extends zzgkh implements zzxp {
    private int zza;

    protected zzgkj(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    protected final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzxo.zzc(byteBuffer.get());
        zzxo.zzb(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
