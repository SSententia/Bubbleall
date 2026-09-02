package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdks implements zzdbc, zzdhz {
    private final zzcei zza;
    private final Context zzb;
    private final zzcfa zzc;
    private final View zzd;
    private String zze;
    private final zzazj zzf;

    public zzdks(zzcei zzceiVar, Context context, zzcfa zzcfaVar, View view, zzazj zzazjVar) {
        this.zza = zzceiVar;
        this.zzb = context;
        this.zzc = zzcfaVar;
        this.zzd = view;
        this.zzf = zzazjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdhz
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhz
    public final void zzd() {
        String strZzh = this.zzc.zzh(this.zzb);
        this.zze = strZzh;
        String strValueOf = String.valueOf(strZzh);
        String str = this.zzf == zzazj.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.zze = str.length() != 0 ? strValueOf.concat(str) : new String(strValueOf);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzh() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzi(view.getContext(), this.zze);
        }
        this.zza.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzi() {
        this.zza.zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    @ParametersAreNonnullByDefault
    public final void zzk(zzcbz zzcbzVar, String str, String str2) {
        if (this.zzc.zzb(this.zzb)) {
            try {
                zzcfa zzcfaVar = this.zzc;
                Context context = this.zzb;
                zzcfaVar.zzr(context, zzcfaVar.zzl(context), this.zza.zzb(), zzcbzVar.zzb(), zzcbzVar.zzc());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzm() {
    }
}
