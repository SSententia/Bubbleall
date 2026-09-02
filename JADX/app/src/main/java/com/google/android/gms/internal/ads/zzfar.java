package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfar {
    public final zzbis zza;
    public final zzbrx zzb;
    public final zzeli zzc;
    public final zzbdg zzd;
    public final zzbdl zze;
    public final String zzf;
    public final ArrayList<String> zzg;
    public final ArrayList<String> zzh;
    public final zzblv zzi;
    public final zzbdr zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final zzbfu zzn;
    public final zzfah zzo;
    public final boolean zzp;
    public final zzbfy zzq;

    /* synthetic */ zzfar(zzfap zzfapVar, zzfaq zzfaqVar) {
        this.zze = zzfapVar.zzb;
        this.zzf = zzfapVar.zzc;
        this.zzq = zzfapVar.zzr;
        int i = zzfapVar.zza.zza;
        long j = zzfapVar.zza.zzb;
        Bundle bundle = zzfapVar.zza.zzc;
        int i2 = zzfapVar.zza.zzd;
        List<String> list = zzfapVar.zza.zze;
        boolean z = zzfapVar.zza.zzf;
        int i3 = zzfapVar.zza.zzg;
        boolean z2 = true;
        if (!zzfapVar.zza.zzh && !zzfapVar.zze) {
            z2 = false;
        }
        this.zzd = new zzbdg(i, j, bundle, i2, list, z, i3, z2, zzfapVar.zza.zzi, zzfapVar.zza.zzj, zzfapVar.zza.zzk, zzfapVar.zza.zzl, zzfapVar.zza.zzm, zzfapVar.zza.zzn, zzfapVar.zza.zzo, zzfapVar.zza.zzp, zzfapVar.zza.zzq, zzfapVar.zza.zzr, zzfapVar.zza.zzs, zzfapVar.zza.zzt, zzfapVar.zza.zzu, zzfapVar.zza.zzv, com.google.android.gms.ads.internal.util.zzs.zze(zzfapVar.zza.zzw), zzfapVar.zza.zzx);
        this.zza = zzfapVar.zzd != null ? zzfapVar.zzd : zzfapVar.zzh != null ? zzfapVar.zzh.zzf : null;
        this.zzg = zzfapVar.zzf;
        this.zzh = zzfapVar.zzg;
        this.zzi = zzfapVar.zzf == null ? null : zzfapVar.zzh == null ? new zzblv(new NativeAdOptions.Builder().build()) : zzfapVar.zzh;
        this.zzj = zzfapVar.zzi;
        this.zzk = zzfapVar.zzm;
        this.zzl = zzfapVar.zzj;
        this.zzm = zzfapVar.zzk;
        this.zzn = zzfapVar.zzl;
        this.zzb = zzfapVar.zzn;
        this.zzo = new zzfah(zzfapVar.zzo, null);
        this.zzp = zzfapVar.zzp;
        this.zzc = zzfapVar.zzq;
    }

    public final zzbny zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzc() : this.zzl.zza();
    }
}
