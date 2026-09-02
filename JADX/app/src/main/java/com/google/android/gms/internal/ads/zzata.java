package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzata implements zzapx {
    private zzasy zze;
    private zzasy zzf;
    private zzanm zzg;
    private zzanm zzh;
    private long zzi;
    private zzasz zzk;
    private final zzauc zzl;
    private final zzasx zza = new zzasx();
    private final zzasw zzb = new zzasw();
    private final zzaux zzc = new zzaux(32);
    private final AtomicInteger zzd = new AtomicInteger();
    private int zzj = 65536;

    public zzata(zzauc zzaucVar, byte[] bArr) {
        this.zzl = zzaucVar;
        zzasy zzasyVar = new zzasy(0L, 65536);
        this.zze = zzasyVar;
        this.zzf = zzasyVar;
    }

    private final void zzo(long j, byte[] bArr, int i) {
        zzp(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.zze.zza);
            int iMin = Math.min(i - i2, 65536 - i3);
            zzatw zzatwVar = this.zze.zzd;
            System.arraycopy(zzatwVar.zza, i3, bArr, i2, iMin);
            j += (long) iMin;
            i2 += iMin;
            if (j == this.zze.zzb) {
                this.zzl.zzd(zzatwVar);
                zzasy zzasyVar = this.zze;
                zzasyVar.zzd = null;
                this.zze = zzasyVar.zze;
            }
        }
    }

    private final void zzp(long j) {
        while (true) {
            zzasy zzasyVar = this.zze;
            if (j < zzasyVar.zzb) {
                return;
            }
            this.zzl.zzd(zzasyVar.zzd);
            zzasy zzasyVar2 = this.zze;
            zzasyVar2.zzd = null;
            this.zze = zzasyVar2.zze;
        }
    }

    private final boolean zzq() {
        return this.zzd.compareAndSet(0, 1);
    }

    private final void zzr() {
        if (this.zzd.compareAndSet(1, 0)) {
            return;
        }
        zzs();
    }

    private final void zzs() {
        this.zza.zza();
        zzasy zzasyVar = this.zze;
        if (zzasyVar.zzc) {
            zzasy zzasyVar2 = this.zzf;
            boolean z = zzasyVar2.zzc;
            int i = (z ? 1 : 0) + (((int) (zzasyVar2.zza - zzasyVar.zza)) / 65536);
            zzatw[] zzatwVarArr = new zzatw[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzatwVarArr[i2] = zzasyVar.zzd;
                zzasyVar.zzd = null;
                zzasyVar = zzasyVar.zze;
            }
            this.zzl.zze(zzatwVarArr);
        }
        zzasy zzasyVar3 = new zzasy(0L, 65536);
        this.zze = zzasyVar3;
        this.zzf = zzasyVar3;
        this.zzi = 0L;
        this.zzj = 65536;
        this.zzl.zzf();
    }

    private final int zzt(int i) {
        if (this.zzj == 65536) {
            this.zzj = 0;
            zzasy zzasyVar = this.zzf;
            if (zzasyVar.zzc) {
                this.zzf = zzasyVar.zze;
            }
            zzasy zzasyVar2 = this.zzf;
            zzatw zzatwVarZzc = this.zzl.zzc();
            zzasy zzasyVar3 = new zzasy(this.zzf.zzb, 65536);
            zzasyVar2.zzd = zzatwVarZzc;
            zzasyVar2.zze = zzasyVar3;
            zzasyVar2.zzc = true;
        }
        return Math.min(i, 65536 - this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzapx
    public final void zza(zzanm zzanmVar) {
        zzanm zzanmVar2 = zzanmVar == null ? null : zzanmVar;
        boolean zZzj = this.zza.zzj(zzanmVar2);
        this.zzh = zzanmVar;
        zzasz zzaszVar = this.zzk;
        if (zzaszVar == null || !zZzj) {
            return;
        }
        zzaszVar.zzw(zzanmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzapx
    public final void zzb(zzaux zzauxVar, int i) {
        if (!zzq()) {
            zzauxVar.zzj(i);
            return;
        }
        while (i > 0) {
            int iZzt = zzt(i);
            zzauxVar.zzk(this.zzf.zzd.zza, this.zzj, iZzt);
            this.zzj += iZzt;
            this.zzi += (long) iZzt;
            i -= iZzt;
        }
        zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzapx
    public final void zzc(long j, int i, int i2, int i3, zzapw zzapwVar) {
        if (!zzq()) {
            this.zza.zzl(j);
            return;
        }
        try {
            this.zza.zzk(j, i, this.zzi - ((long) i2), i2, zzapwVar);
        } finally {
            zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapx
    public final int zzd(zzapn zzapnVar, int i, boolean z) throws InterruptedException, IOException {
        if (!zzq()) {
            int iZzc = zzapnVar.zzc(i);
            if (iZzc != -1) {
                return iZzc;
            }
            throw new EOFException();
        }
        try {
            int iZza = zzapnVar.zza(this.zzf.zzd.zza, this.zzj, zzt(i));
            if (iZza == -1) {
                throw new EOFException();
            }
            this.zzj += iZza;
            this.zzi += (long) iZza;
            zzr();
            return iZza;
        } catch (Throwable th) {
            zzr();
            throw th;
        }
    }

    public final void zze(boolean z) {
        int andSet = this.zzd.getAndSet(true != z ? 2 : 0);
        zzs();
        this.zza.zzb();
        if (andSet == 2) {
            this.zzg = null;
        }
    }

    public final int zzf() {
        return this.zza.zzc();
    }

    public final void zzg() {
        if (this.zzd.getAndSet(2) == 0) {
            zzs();
        }
    }

    public final boolean zzh() {
        return this.zza.zzd();
    }

    public final zzanm zzi() {
        return this.zza.zze();
    }

    public final long zzj() {
        return this.zza.zzf();
    }

    public final void zzk() {
        long jZzh = this.zza.zzh();
        if (jZzh != -1) {
            zzp(jZzh);
        }
    }

    public final boolean zzl(long j, boolean z) {
        long jZzi = this.zza.zzi(j, z);
        if (jZzi == -1) {
            return false;
        }
        zzp(jZzi);
        return true;
    }

    public final int zzm(zzann zzannVar, zzapg zzapgVar, boolean z, boolean z2, long j) {
        int iZzg = this.zza.zzg(zzannVar, zzapgVar, z, z2, this.zzg, this.zzb);
        if (iZzg == -5) {
            this.zzg = zzannVar.zza;
            return -5;
        }
        if (iZzg != -4) {
            return -3;
        }
        if (!zzapgVar.zzc()) {
            if (zzapgVar.zzc < j) {
                zzapgVar.zzf(Integer.MIN_VALUE);
            }
            if (zzapgVar.zzi()) {
                zzasw zzaswVar = this.zzb;
                long j2 = zzaswVar.zzb;
                int iZzm = 1;
                this.zzc.zza(1);
                zzo(j2, this.zzc.zza, 1);
                long j3 = j2 + 1;
                byte b = this.zzc.zza[0];
                int i = b & ByteCompanionObject.MIN_VALUE;
                int i2 = b & ByteCompanionObject.MAX_VALUE;
                zzape zzapeVar = zzapgVar.zza;
                if (zzapeVar.zza == null) {
                    zzapeVar.zza = new byte[16];
                }
                zzo(j3, zzapeVar.zza, i2);
                long j4 = j3 + ((long) i2);
                if (i != 0) {
                    this.zzc.zza(2);
                    zzo(j4, this.zzc.zza, 2);
                    j4 += 2;
                    iZzm = this.zzc.zzm();
                }
                int i3 = iZzm;
                zzape zzapeVar2 = zzapgVar.zza;
                int[] iArr = zzapeVar2.zzd;
                if (iArr == null || iArr.length < i3) {
                    iArr = new int[i3];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = zzapeVar2.zze;
                if (iArr3 == null || iArr3.length < i3) {
                    iArr3 = new int[i3];
                }
                int[] iArr4 = iArr3;
                if (i != 0) {
                    int i4 = i3 * 6;
                    this.zzc.zza(i4);
                    zzo(j4, this.zzc.zza, i4);
                    j4 += (long) i4;
                    this.zzc.zzi(0);
                    for (int i5 = 0; i5 < i3; i5++) {
                        iArr2[i5] = this.zzc.zzm();
                        iArr4[i5] = this.zzc.zzu();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = zzaswVar.zza - ((int) (j4 - zzaswVar.zzb));
                }
                zzapw zzapwVar = zzaswVar.zzd;
                zzape zzapeVar3 = zzapgVar.zza;
                byte[] bArr = zzapwVar.zzb;
                byte[] bArr2 = zzapeVar3.zza;
                int i6 = zzapwVar.zza;
                zzapeVar3.zza(i3, iArr2, iArr4, bArr, bArr2, 1);
                long j5 = zzaswVar.zzb;
                int i7 = (int) (j4 - j5);
                zzaswVar.zzb = j5 + ((long) i7);
                zzaswVar.zza -= i7;
            }
            zzapgVar.zzh(this.zzb.zza);
            zzasw zzaswVar2 = this.zzb;
            long j6 = zzaswVar2.zzb;
            ByteBuffer byteBuffer = zzapgVar.zzb;
            int i8 = zzaswVar2.zza;
            zzp(j6);
            while (i8 > 0) {
                int i9 = (int) (j6 - this.zze.zza);
                int iMin = Math.min(i8, 65536 - i9);
                zzatw zzatwVar = this.zze.zzd;
                byteBuffer.put(zzatwVar.zza, i9, iMin);
                j6 += (long) iMin;
                i8 -= iMin;
                if (j6 == this.zze.zzb) {
                    this.zzl.zzd(zzatwVar);
                    zzasy zzasyVar = this.zze;
                    zzasyVar.zzd = null;
                    this.zze = zzasyVar.zze;
                }
            }
            zzp(this.zzb.zzc);
        }
        return -4;
    }

    public final void zzn(zzasz zzaszVar) {
        this.zzk = zzaszVar;
    }
}
