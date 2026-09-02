package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
class zzgp extends zzgo {
    protected final byte[] zza;

    zzgp(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzgr
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgr) || zzc() != ((zzgr) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzgp)) {
            return obj.equals(this);
        }
        zzgp zzgpVar = (zzgp) obj;
        int iZzm = zzm();
        int iZzm2 = zzgpVar.zzm();
        if (iZzm != 0 && iZzm2 != 0 && iZzm != iZzm2) {
            return false;
        }
        int iZzc = zzc();
        if (iZzc > zzgpVar.zzc()) {
            int iZzc2 = zzc();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(iZzc);
            sb.append(iZzc2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (iZzc > zzgpVar.zzc()) {
            int iZzc3 = zzgpVar.zzc();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(iZzc);
            sb2.append(", ");
            sb2.append(iZzc3);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(zzgpVar instanceof zzgp)) {
            return zzgpVar.zze(0, iZzc).equals(zze(0, iZzc));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgpVar.zza;
        zzgpVar.zzd();
        int i = 0;
        int i2 = 0;
        while (i < iZzc) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzgr
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzgr
    byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzgr
    public int zzc() {
        return this.zza.length;
    }

    protected int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzgr
    public final zzgr zze(int i, int i2) {
        int iZzn = zzn(0, i2, zzc());
        return iZzn == 0 ? zzgr.zzb : new zzgm(this.zza, 0, iZzn);
    }

    @Override // com.google.android.gms.internal.measurement.zzgr
    final void zzf(zzgi zzgiVar) throws IOException {
        ((zzgw) zzgiVar).zzp(this.zza, 0, zzc());
    }

    @Override // com.google.android.gms.internal.measurement.zzgr
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzc(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzgr
    public final boolean zzh() {
        return zzkk.zzb(this.zza, 0, zzc());
    }

    @Override // com.google.android.gms.internal.measurement.zzgr
    protected final int zzi(int i, int i2, int i3) {
        return zzhz.zzh(i, this.zza, 0, i3);
    }
}
