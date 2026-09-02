package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzfme extends zzfle<String> {
    final CharSequence zzb;
    final zzflk zzc;
    int zzd = 0;
    int zze = Integer.MAX_VALUE;

    protected zzfme(zzfmg zzfmgVar, CharSequence charSequence) {
        this.zzc = zzfmgVar.zza;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfle
    @CheckForNull
    protected final /* bridge */ /* synthetic */ String zza() {
        int iZzd;
        int i = this.zzd;
        while (true) {
            int i2 = this.zzd;
            if (i2 == -1) {
                zzb();
                return null;
            }
            int iZzc = zzc(i2);
            if (iZzc == -1) {
                iZzc = this.zzb.length();
                this.zzd = -1;
                iZzd = -1;
            } else {
                iZzd = zzd(iZzc);
                this.zzd = iZzd;
            }
            if (iZzd != i) {
                if (i < iZzc) {
                    this.zzb.charAt(i);
                }
                if (i < iZzc) {
                    this.zzb.charAt(iZzc - 1);
                }
                int i3 = this.zze;
                if (i3 == 1) {
                    iZzc = this.zzb.length();
                    this.zzd = -1;
                    if (iZzc > i) {
                        this.zzb.charAt(iZzc - 1);
                    }
                } else {
                    this.zze = i3 - 1;
                }
                return this.zzb.subSequence(i, iZzc).toString();
            }
            int i4 = iZzd + 1;
            this.zzd = i4;
            if (i4 > this.zzb.length()) {
                this.zzd = -1;
            }
        }
    }

    abstract int zzc(int i);

    abstract int zzd(int i);
}
