package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzew extends zzeb {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzamq.zzf;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzc(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.zzg);
        this.zzj += (long) (iMin / this.zzb.zze);
        this.zzg -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.zzg > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.zzi + i2) - this.zzh.length;
        ByteBuffer byteBufferZzi = zzi(length);
        int iZzx = zzamq.zzx(length, 0, this.zzi);
        byteBufferZzi.put(this.zzh, 0, iZzx);
        int iZzx2 = zzamq.zzx(length - iZzx, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iZzx2);
        byteBufferZzi.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iZzx2;
        int i4 = this.zzi - iZzx;
        this.zzi = i4;
        byte[] bArr = this.zzh;
        System.arraycopy(bArr, iZzx, bArr, 0, i4);
        byteBuffer.get(this.zzh, this.zzi, i3);
        this.zzi += i3;
        byteBufferZzi.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzeb, com.google.android.gms.internal.ads.zzde
    public final ByteBuffer zze() {
        int i;
        if (super.zzf() && (i = this.zzi) > 0) {
            zzi(i).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzeb, com.google.android.gms.internal.ads.zzde
    public final boolean zzf() {
        return super.zzf() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    public final zzdc zzk(zzdc zzdcVar) throws zzdd {
        if (zzdcVar.zzd != 2) {
            throw new zzdd(zzdcVar);
        }
        this.zzf = true;
        return (this.zzd == 0 && this.zze == 0) ? zzdc.zza : zzdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    protected final void zzl() {
        if (this.zzf) {
            int i = this.zzi;
            if (i > 0) {
                this.zzj += (long) (i / this.zzb.zze);
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    protected final void zzm() {
        if (this.zzf) {
            this.zzf = false;
            int i = this.zze;
            int i2 = this.zzb.zze;
            this.zzh = new byte[i * i2];
            this.zzg = this.zzd * i2;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    protected final void zzn() {
        this.zzh = zzamq.zzf;
    }

    public final void zzo(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final long zzq() {
        return this.zzj;
    }
}
