package com.google.android.gms.internal.ads;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapg extends zzapb {
    public final zzape zza = new zzape();
    public ByteBuffer zzb;
    public long zzc;

    public zzapg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zza() {
        super.zza();
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void zzh(int i) throws IllegalStateException {
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer == null) {
            this.zzb = zzj(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = this.zzb.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            return;
        }
        ByteBuffer byteBufferZzj = zzj(i2);
        if (iPosition > 0) {
            this.zzb.position(0);
            this.zzb.limit(iPosition);
            byteBufferZzj.put(this.zzb);
        }
        this.zzb = byteBufferZzj;
    }

    public final boolean zzi() {
        return zzg(BasicMeasure.EXACTLY);
    }

    private final ByteBuffer zzj(int i) {
        ByteBuffer byteBuffer = this.zzb;
        int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(iCapacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }
}
