package com.google.android.gms.internal.ads;

import androidx.media2.widget.Cea708CCParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzghy extends zzgex {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, Cea708CCParser.Const.CODE_C1_SPA, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgex zzd;
    private final zzgex zze;
    private final int zzf;
    private final int zzg;

    private zzghy(zzgex zzgexVar, zzgex zzgexVar2) {
        this.zzd = zzgexVar;
        this.zze = zzgexVar2;
        int iZzc = zzgexVar.zzc();
        this.zzf = iZzc;
        this.zzc = iZzc + zzgexVar2.zzc();
        this.zzg = Math.max(zzgexVar.zzf(), zzgexVar2.zzf()) + 1;
    }

    static zzgex zzF(zzgex zzgexVar, zzgex zzgexVar2) {
        if (zzgexVar2.zzc() == 0) {
            return zzgexVar;
        }
        if (zzgexVar.zzc() == 0) {
            return zzgexVar2;
        }
        int iZzc = zzgexVar.zzc() + zzgexVar2.zzc();
        if (iZzc < 128) {
            return zzH(zzgexVar, zzgexVar2);
        }
        if (zzgexVar instanceof zzghy) {
            zzghy zzghyVar = (zzghy) zzgexVar;
            if (zzghyVar.zze.zzc() + zzgexVar2.zzc() < 128) {
                return new zzghy(zzghyVar.zzd, zzH(zzghyVar.zze, zzgexVar2));
            }
            if (zzghyVar.zzd.zzf() > zzghyVar.zze.zzf() && zzghyVar.zzg > zzgexVar2.zzf()) {
                return new zzghy(zzghyVar.zzd, new zzghy(zzghyVar.zze, zzgexVar2));
            }
        }
        return iZzc >= zzG(Math.max(zzgexVar.zzf(), zzgexVar2.zzf()) + 1) ? new zzghy(zzgexVar, zzgexVar2) : zzghv.zza(new zzghv(null), zzgexVar, zzgexVar2);
    }

    static int zzG(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    private static zzgex zzH(zzgex zzgexVar, zzgex zzgexVar2) {
        int iZzc = zzgexVar.zzc();
        int iZzc2 = zzgexVar2.zzc();
        byte[] bArr = new byte[iZzc + iZzc2];
        zzgexVar.zzy(bArr, 0, 0, iZzc);
        zzgexVar2.zzy(bArr, 0, iZzc, iZzc2);
        return new zzget(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgex)) {
            return false;
        }
        zzgex zzgexVar = (zzgex) obj;
        if (this.zzc != zzgexVar.zzc()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int iZzC = zzC();
        int iZzC2 = zzgexVar.zzC();
        if (iZzC != 0 && iZzC2 != 0 && iZzC != iZzC2) {
            return false;
        }
        zzghw zzghwVar = null;
        zzghx zzghxVar = new zzghx(this, zzghwVar);
        zzges zzgesVarZza = zzghxVar.next();
        zzghx zzghxVar2 = new zzghx(zzgexVar, zzghwVar);
        zzges zzgesVarZza2 = zzghxVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iZzc = zzgesVarZza.zzc() - i;
            int iZzc2 = zzgesVarZza2.zzc() - i2;
            int iMin = Math.min(iZzc, iZzc2);
            if (!(i == 0 ? zzgesVarZza.zzh(zzgesVarZza2, i2, iMin) : zzgesVarZza2.zzh(zzgesVarZza, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzc) {
                zzgesVarZza = zzghxVar.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == iZzc2) {
                zzgesVarZza = zzgesVarZza;
                zzgesVarZza2 = zzghxVar2.next();
                i2 = 0;
            } else {
                zzgesVarZza = zzgesVarZza;
                i2 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgex, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new zzghu(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final byte zza(int i) {
        zzD(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    final byte zzb(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zzb(i) : this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i + i3 <= i4) {
            this.zzd.zze(bArr, i, i2, i3);
        } else {
            if (i >= i4) {
                this.zze.zze(bArr, i - i4, i2, i3);
                return;
            }
            int i5 = i4 - i;
            this.zzd.zze(bArr, i, i2, i5);
            this.zze.zze(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    protected final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    protected final boolean zzg() {
        return this.zzc >= zzG(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final zzgex zzi(int i, int i2) {
        int iZzE = zzE(i, i2, this.zzc);
        if (iZzE == 0) {
            return zzgex.zzb;
        }
        if (iZzE == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzi(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzi(i - i3, i2 - i3);
        }
        zzgex zzgexVar = this.zzd;
        return new zzghy(zzgexVar.zzi(i, zzgexVar.zzc()), this.zze.zzi(0, i2 - this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final ByteBuffer zzj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    final void zzk(zzgem zzgemVar) throws IOException {
        this.zzd.zzk(zzgemVar);
        this.zze.zzk(zzgemVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    protected final String zzl(Charset charset) {
        return new String(zzz(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean zzm() {
        int iZzn = this.zzd.zzn(0, 0, this.zzf);
        zzgex zzgexVar = this.zze;
        return zzgexVar.zzn(iZzn, 0, zzgexVar.zzc()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    protected final int zzn(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.zzn(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzn(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.zzn(this.zzd.zzn(i, i2, i5), 0, i3 - i5);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    protected final int zzo(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.zzo(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzo(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.zzo(this.zzd.zzo(i, i2, i5), 0, i3 - i5);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final zzgfc zzp() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        byte b = 0;
        byte b2 = 0;
        zzghx zzghxVar = new zzghx(this, null);
        while (zzghxVar.hasNext()) {
            arrayList.add(zzghxVar.next().zzj());
        }
        int i = zzgfc.zzd;
        int i2 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new zzgez(arrayList, iRemaining, true, b2 == true ? 1 : 0) : new zzgfb(new zzggn(arrayList), 4096, b == true ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    /* JADX INFO: renamed from: zzq */
    public final zzger iterator() {
        return new zzghu(this);
    }
}
