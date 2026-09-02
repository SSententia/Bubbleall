package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgeq extends zzget {
    private final int zzc;
    private final int zzd;

    zzgeq(byte[] bArr, int i, int i2) {
        super(bArr);
        zzE(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzget, com.google.android.gms.internal.ads.zzgex
    public final byte zza(int i) {
        zzD(i, this.zzd);
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzget, com.google.android.gms.internal.ads.zzgex
    final byte zzb(int i) {
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzget, com.google.android.gms.internal.ads.zzgex
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzget
    protected final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzget, com.google.android.gms.internal.ads.zzgex
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, this.zzc + i, bArr, i2, i3);
    }
}
