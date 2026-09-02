package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeuu implements zzelx<zzcuq> {
    final /* synthetic */ zzeuv zza;

    zzeuu(zzeuv zzeuvVar) {
        this.zza = zzeuvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        this.zza.zza = null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0063  */
    /* JADX WARN: Code duplicated, block: B:12:0x0066  */
    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    /* JADX WARN: Code duplicated, block: B:9:0x004b  */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x004b, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(zzcuq zzcuqVar) {
        int i;
        zzcuq zzcuqVar2 = zzcuqVar;
        zzcuq zzcuqVar3 = this.zza.zza;
        if (zzcuqVar3 != null) {
            zzcuqVar3.zzT();
        }
        zzeuv zzeuvVar = this.zza;
        zzeuvVar.zza = zzcuqVar2;
        zzeuvVar.zzd.removeAllViews();
        this.zza.zzd.addView(zzcuqVar2.zzb(), com.google.android.gms.ads.internal.zzt.zze().zzj());
        if (zzcuqVar2.zzd()) {
            com.google.android.gms.ads.internal.overlay.zzq zzqVarZzf = zzeuv.zzf(this.zza, zzcuqVar2);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            if (true != zzcuqVar2.zzf()) {
                i = 9;
            } else {
                i = 11;
            }
            layoutParams.addRule(i);
            zzqVarZzf.zza((zzcuqVar2.zzg() || zzcuqVar2.zze()) ? false : true);
            this.zza.zzd.addView(zzqVarZzf, layoutParams);
        } else {
            if (this.zza.zzi.zzc < ((Integer) zzbet.zzc().zzc(zzbjl.zzdB)).intValue()) {
                com.google.android.gms.ads.internal.overlay.zzq zzqVarZzf2 = zzeuv.zzf(this.zza, zzcuqVar2);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(10);
                if (true != zzcuqVar2.zzf()) {
                    i = 9;
                } else {
                    i = 11;
                }
                layoutParams2.addRule(i);
                zzqVarZzf2.zza((zzcuqVar2.zzg() || zzcuqVar2.zze()) ? false : true);
                this.zza.zzd.addView(zzqVarZzf2, layoutParams2);
            }
        }
        zzcuqVar2.zzh(this.zza);
        ViewGroup viewGroup = this.zza.zzd;
        zzeuv zzeuvVar2 = this.zza;
        viewGroup.setMinimumHeight(zzfav.zzb(zzeuvVar2.zzc, Collections.singletonList(zzeuvVar2.zza.zza())).zzc);
        ViewGroup viewGroup2 = this.zza.zzd;
        zzeuv zzeuvVar3 = this.zza;
        viewGroup2.setMinimumWidth(zzfav.zzb(zzeuvVar3.zzc, Collections.singletonList(zzeuvVar3.zza.zza())).zzf);
        this.zza.zzh.zzm(new zzcvd(zzcuqVar2, this.zza));
        zzcuqVar2.zzS();
    }
}
