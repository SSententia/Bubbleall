package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaoy implements zzaob {
    private int zzb = -1;
    private int zzc = -1;
    private int zzd = 0;
    private ByteBuffer zze = zza;
    private ByteBuffer zzf = zza;
    private boolean zzg;

    @Override // com.google.android.gms.internal.ads.zzaob
    public final boolean zza(int i, int i2, int i3) throws zzaoa {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new zzaoa(i, i2, i3);
        }
        if (this.zzb == i && this.zzc == i2 && this.zzd == i3) {
            return false;
        }
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        if (i3 != 2) {
            return true;
        }
        this.zze = zza;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final boolean zzb() {
        int i = this.zzd;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final int zzd() {
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0046 A[ADDED_TO_REGION, LOOP:0: B:19:0x0046->B:20:0x0048, LOOP_START, PHI: r0
  0x0046: PHI (r0v6 int) = (r0v0 int), (r0v7 int) binds: [B:18:0x0044, B:20:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0048 A[LOOP:0: B:19:0x0046->B:20:0x0048, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[ADDED_TO_REGION, LOOP:1: B:23:0x0067->B:24:0x0069, LOOP_START, PHI: r0
  0x0067: PHI (r0v4 int) = (r0v0 int), (r0v5 int) binds: [B:17:0x0042, B:24:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0069 A[LOOP:1: B:23:0x0067->B:24:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[ADDED_TO_REGION, LOOP:2: B:25:0x0080->B:26:0x0082, LOOP_START, PHI: r0
  0x0080: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0040, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0082 A[LOOP:2: B:25:0x0080->B:26:0x0082, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zze(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i3 = iLimit - iPosition;
        int i4 = this.zzd;
        if (i4 != Integer.MIN_VALUE) {
            if (i4 != 3) {
                if (i4 != 1073741824) {
                    throw new IllegalStateException();
                }
                i = i3 / 2;
            }
            if (this.zze.capacity() < i) {
                this.zze = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
            } else {
                this.zze.clear();
            }
            i2 = this.zzd;
            if (i2 != Integer.MIN_VALUE) {
                while (iPosition < iLimit) {
                    this.zze.put(byteBuffer.get(iPosition + 1));
                    this.zze.put(byteBuffer.get(iPosition + 2));
                    iPosition += 3;
                }
            } else if (i2 != 3) {
                while (iPosition < iLimit) {
                    this.zze.put((byte) 0);
                    this.zze.put((byte) ((byteBuffer.get(iPosition) & UByte.MAX_VALUE) - 128));
                    iPosition++;
                }
            } else {
                if (i2 == 1073741824) {
                    throw new IllegalStateException();
                }
                while (iPosition < iLimit) {
                    this.zze.put(byteBuffer.get(iPosition + 2));
                    this.zze.put(byteBuffer.get(iPosition + 3));
                    iPosition += 4;
                }
            }
            byteBuffer.position(byteBuffer.limit());
            this.zze.flip();
            this.zzf = this.zze;
        }
        i3 /= 3;
        i = i3 + i3;
        if (this.zze.capacity() < i) {
            this.zze = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zze.clear();
        }
        i2 = this.zzd;
        if (i2 != Integer.MIN_VALUE) {
            while (iPosition < iLimit) {
                this.zze.put(byteBuffer.get(iPosition + 1));
                this.zze.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i2 != 3) {
            while (iPosition < iLimit) {
                this.zze.put((byte) 0);
                this.zze.put((byte) ((byteBuffer.get(iPosition) & UByte.MAX_VALUE) - 128));
                iPosition++;
            }
        } else {
            if (i2 == 1073741824) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                this.zze.put(byteBuffer.get(iPosition + 2));
                this.zze.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.zze.flip();
        this.zzf = this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zzf() {
        this.zzg = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final ByteBuffer zzg() {
        ByteBuffer byteBuffer = this.zzf;
        this.zzf = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final boolean zzh() {
        return this.zzg && this.zzf == zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zzi() {
        this.zzf = zza;
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zzj() {
        zzi();
        this.zze = zza;
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = 0;
    }
}
