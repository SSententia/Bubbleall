package com.google.android.gms.internal.ads;

import com.google.android.gms.location.LocationRequest;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdue implements zzddx, zzdcq, zzdbf, zzdbw, zzbcv, zzdgj {
    private final zzazb zza;
    private boolean zzb = false;

    public zzdue(zzazb zzazbVar, @Nullable zzexu zzexuVar) {
        this.zza = zzazbVar;
        zzazbVar.zzc(2);
        if (zzexuVar != null) {
            zzazbVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcv
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzbD(zzbcz zzbczVar) {
        switch (zzbczVar.zza) {
            case 1:
                this.zza.zzc(101);
                break;
            case 2:
                this.zza.zzc(102);
                break;
            case 3:
                this.zza.zzc(5);
                break;
            case 4:
                this.zza.zzc(103);
                break;
            case 5:
                this.zza.zzc(104);
                break;
            case 6:
                this.zza.zzc(LocationRequest.PRIORITY_NO_POWER);
                break;
            case 7:
                this.zza.zzc(106);
                break;
            default:
                this.zza.zzc(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzbG(zzcbj zzcbjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zzc(final zzazu zzazuVar) {
        this.zza.zzb(new zzaza(zzazuVar) { // from class: com.google.android.gms.internal.ads.zzdub
            private final zzazu zza;

            {
                this.zza = zzazuVar;
            }

            @Override // com.google.android.gms.internal.ads.zzaza
            public final void zza(zzbao zzbaoVar) {
                zzbaoVar.zzk(this.zza);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zzd(final zzazu zzazuVar) {
        this.zza.zzb(new zzaza(zzazuVar) { // from class: com.google.android.gms.internal.ads.zzduc
            private final zzazu zza;

            {
                this.zza = zzazuVar;
            }

            @Override // com.google.android.gms.internal.ads.zzaza
            public final void zza(zzbao zzbaoVar) {
                zzbaoVar.zzk(this.zza);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zze(final zzazu zzazuVar) {
        this.zza.zzb(new zzaza(zzazuVar) { // from class: com.google.android.gms.internal.ads.zzdud
            private final zzazu zza;

            {
                this.zza = zzazuVar;
            }

            @Override // com.google.android.gms.internal.ads.zzaza
            public final void zza(zzbao zzbaoVar) {
                zzbaoVar.zzk(this.zza);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdcq
    public final void zzf() {
        this.zza.zzc(3);
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final synchronized void zzg() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zzn(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zzo(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zzp() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzq(final zzfal zzfalVar) {
        this.zza.zzb(new zzaza(zzfalVar) { // from class: com.google.android.gms.internal.ads.zzdua
            private final zzfal zza;

            {
                this.zza = zzfalVar;
            }

            @Override // com.google.android.gms.internal.ads.zzaza
            public final void zza(zzbao zzbaoVar) {
                zzfal zzfalVar2 = this.zza;
                zzazk zzazkVarZzau = zzbaoVar.zzg().zzau();
                zzbac zzbacVarZzau = zzbaoVar.zzg().zza().zzau();
                zzbacVarZzau.zza(zzfalVar2.zzb.zzb.zzb);
                zzazkVarZzau.zzb(zzbacVarZzau);
                zzbaoVar.zzh(zzazkVarZzau);
            }
        });
    }
}
