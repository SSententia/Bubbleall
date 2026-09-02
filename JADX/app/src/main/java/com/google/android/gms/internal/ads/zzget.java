package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzget extends zzges {
    protected final byte[] zza;

    zzget(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgex) || zzc() != ((zzgex) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzget)) {
            return obj.equals(this);
        }
        zzget zzgetVar = (zzget) obj;
        int iZzC = zzC();
        int iZzC2 = zzgetVar.zzC();
        if (iZzC == 0 || iZzC2 == 0 || iZzC == iZzC2) {
            return zzh(zzgetVar, 0, zzc());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public int zzc() {
        return this.zza.length;
    }

    protected int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    protected void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzges
    final boolean zzh(zzgex zzgexVar, int i, int i2) {
        if (i2 > zzgexVar.zzc()) {
            int iZzc = zzc();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(iZzc);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 > zzgexVar.zzc()) {
            int iZzc2 = zzgexVar.zzc();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(iZzc2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(zzgexVar instanceof zzget)) {
            return zzgexVar.zzi(i, i3).equals(zzi(0, i2));
        }
        zzget zzgetVar = (zzget) zzgexVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgetVar.zza;
        int iZzd = zzd() + i2;
        int iZzd2 = zzd();
        int iZzd3 = zzgetVar.zzd() + i;
        while (iZzd2 < iZzd) {
            if (bArr[iZzd2] != bArr2[iZzd3]) {
                return false;
            }
            iZzd2++;
            iZzd3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final zzgex zzi(int i, int i2) {
        int iZzE = zzE(i, i2, zzc());
        return iZzE == 0 ? zzgex.zzb : new zzgeq(this.zza, zzd() + i, iZzE);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final ByteBuffer zzj() {
        return ByteBuffer.wrap(this.zza, zzd(), zzc()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    final void zzk(zzgem zzgemVar) throws IOException {
        ((zzgfe) zzgemVar).zzp(this.zza, zzd(), zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    protected final String zzl(Charset charset) {
        return new String(this.zza, zzd(), zzc(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean zzm() {
        int iZzd = zzd();
        return zzgjd.zzb(this.zza, iZzd, zzc() + iZzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    protected final int zzn(int i, int i2, int i3) {
        int iZzd = zzd() + i2;
        return zzgjd.zzc(i, this.zza, iZzd, i3 + iZzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    protected final int zzo(int i, int i2, int i3) {
        return zzggk.zzh(i, this.zza, zzd() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final zzgfc zzp() {
        return zzgfc.zzF(this.zza, zzd(), zzc(), true);
    }
}
