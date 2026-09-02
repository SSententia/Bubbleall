package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfmb extends zzfme {
    final /* synthetic */ zzfmc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfmb(zzfmc zzfmcVar, zzfmg zzfmgVar, CharSequence charSequence) {
        super(zzfmgVar, charSequence);
        this.zza = zzfmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final int zzc(int i) {
        int i2 = i + 4000;
        if (i2 < this.zzb.length()) {
            return i2;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final int zzd(int i) {
        return i;
    }
}
