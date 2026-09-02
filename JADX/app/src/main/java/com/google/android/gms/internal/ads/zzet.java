package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzet extends zzeb {
    private int zzd;
    private boolean zze;
    private byte[] zzf = zzamq.zzf;
    private byte[] zzg = zzamq.zzf;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private long zzl;

    private final void zzq(byte[] bArr, int i) {
        zzi(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.zzk = true;
        }
    }

    private final void zzr(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.zzj);
        int i2 = this.zzj - iMin;
        System.arraycopy(bArr, i - i2, this.zzg, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.zzg, i2, iMin);
    }

    private final int zzs(long j) {
        return (int) ((j * ((long) this.zzb.zzb)) / 1000000);
    }

    private final int zzt(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > 1024) {
                int i = this.zzd;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzeb, com.google.android.gms.internal.ads.zzde
    public final boolean zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzc(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !zzj()) {
            int i = this.zzh;
            if (i == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.zzf.length));
                int iLimit2 = byteBuffer.limit();
                while (true) {
                    iLimit2 -= 2;
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(iLimit2)) > 1024) {
                        int i2 = this.zzd;
                        iPosition = ((iLimit2 / i2) * i2) + i2;
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.zzh = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    zzi(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.zzk = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i != 1) {
                int iLimit3 = byteBuffer.limit();
                int iZzt = zzt(byteBuffer);
                byteBuffer.limit(iZzt);
                this.zzl += (long) (byteBuffer.remaining() / this.zzd);
                zzr(byteBuffer, this.zzg, this.zzj);
                if (iZzt < iLimit3) {
                    zzq(this.zzg, this.zzj);
                    this.zzh = 0;
                    byteBuffer.limit(iLimit3);
                }
            } else {
                int iLimit4 = byteBuffer.limit();
                int iZzt2 = zzt(byteBuffer);
                int iPosition2 = iZzt2 - byteBuffer.position();
                byte[] bArr = this.zzf;
                int length = bArr.length;
                int i3 = this.zzi;
                int i4 = length - i3;
                if (iZzt2 >= iLimit4 || iPosition2 >= i4) {
                    int iMin = Math.min(iPosition2, i4);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.zzf, this.zzi, iMin);
                    int i5 = this.zzi + iMin;
                    this.zzi = i5;
                    byte[] bArr2 = this.zzf;
                    if (i5 == bArr2.length) {
                        if (this.zzk) {
                            zzq(bArr2, this.zzj);
                            long j = this.zzl;
                            int i6 = this.zzi;
                            int i7 = this.zzj;
                            this.zzl = j + ((long) ((i6 - (i7 + i7)) / this.zzd));
                            i5 = i6;
                        } else {
                            this.zzl += (long) ((i5 - this.zzj) / this.zzd);
                        }
                        zzr(byteBuffer, this.zzf, i5);
                        this.zzi = 0;
                        this.zzh = 2;
                    }
                    byteBuffer.limit(iLimit4);
                } else {
                    zzq(bArr, i3);
                    this.zzi = 0;
                    this.zzh = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    public final zzdc zzk(zzdc zzdcVar) throws zzdd {
        if (zzdcVar.zzd == 2) {
            return this.zze ? zzdcVar : zzdc.zza;
        }
        throw new zzdd(zzdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    protected final void zzl() {
        int i = this.zzi;
        if (i > 0) {
            zzq(this.zzf, i);
        }
        if (this.zzk) {
            return;
        }
        this.zzl += (long) (this.zzj / this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    protected final void zzm() {
        if (this.zze) {
            this.zzd = this.zzb.zze;
            int iZzs = zzs(150000L) * this.zzd;
            if (this.zzf.length != iZzs) {
                this.zzf = new byte[iZzs];
            }
            int iZzs2 = zzs(20000L) * this.zzd;
            this.zzj = iZzs2;
            if (this.zzg.length != iZzs2) {
                this.zzg = new byte[iZzs2];
            }
        }
        this.zzh = 0;
        this.zzl = 0L;
        this.zzi = 0;
        this.zzk = false;
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    protected final void zzn() {
        this.zze = false;
        this.zzj = 0;
        this.zzf = zzamq.zzf;
        this.zzg = zzamq.zzf;
    }

    public final void zzo(boolean z) {
        this.zze = z;
    }

    public final long zzp() {
        return this.zzl;
    }
}
