package com.google.android.gms.internal.ads;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzub implements zzuo {
    private final zzua zza;
    private final zzamf zzb = new zzamf(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzub(zzua zzuaVar) {
        this.zza = zzuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zza(zzamn zzamnVar, zznx zznxVar, zzun zzunVar) {
        this.zza.zza(zzamnVar, zznxVar, zzunVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzb() {
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzc(zzamf zzamfVar, int i) {
        int iZzg;
        int i2 = i & 1;
        if (i2 != 0) {
            iZzg = zzamfVar.zzg() + zzamfVar.zzn();
        } else {
            iZzg = -1;
        }
        if (this.zzf) {
            if (i2 == 0) {
                return;
            }
            this.zzf = false;
            zzamfVar.zzh(iZzg);
            this.zzd = 0;
        }
        while (zzamfVar.zzd() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iZzn = zzamfVar.zzn();
                    zzamfVar.zzh(zzamfVar.zzg() - 1);
                    if (iZzn == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzamfVar.zzd(), 3 - this.zzd);
                zzamfVar.zzm(this.zzb.zzi(), this.zzd, iMin);
                int i4 = this.zzd + iMin;
                this.zzd = i4;
                if (i4 == 3) {
                    this.zzb.zzh(0);
                    this.zzb.zzf(3);
                    this.zzb.zzk(1);
                    int iZzn2 = this.zzb.zzn();
                    int iZzn3 = this.zzb.zzn();
                    this.zze = (iZzn2 & 128) != 0;
                    this.zzc = (((iZzn2 & 15) << 8) | iZzn3) + 3;
                    int iZzj = this.zzb.zzj();
                    int i5 = this.zzc;
                    if (iZzj < i5) {
                        int iZzj2 = this.zzb.zzj();
                        this.zzb.zzc(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i5, iZzj2 + iZzj2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzamfVar.zzd(), this.zzc - this.zzd);
                zzamfVar.zzm(this.zzb.zzi(), this.zzd, iMin2);
                int i6 = this.zzd + iMin2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.zze) {
                        this.zzb.zzf(i7);
                    } else {
                        if (zzamq.zzV(this.zzb.zzi(), 0, this.zzc, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzf(this.zzc - 4);
                    }
                    this.zzb.zzh(0);
                    this.zza.zzb(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }
}
