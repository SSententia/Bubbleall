package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzckl {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzxs zzxsVar;
        zzxr zzxrVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator<zzxp> it = new zzxn(new zzckk(byteBufferDuplicate), zzckn.zzb).zzd().iterator();
            while (true) {
                zzxsVar = null;
                if (!it.hasNext()) {
                    zzxrVar = null;
                    break;
                }
                zzxp next = it.next();
                if (next instanceof zzxr) {
                    zzxrVar = (zzxr) next;
                    break;
                }
            }
            for (zzxp zzxpVar : zzxrVar.zzd()) {
                if (zzxpVar instanceof zzxs) {
                    zzxsVar = (zzxs) zzxpVar;
                    break;
                }
            }
            long jZze = (zzxsVar.zze() * 1000) / zzxsVar.zzd();
            this.zza = jZze;
            return jZze;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
