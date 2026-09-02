package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfap {
    private zzbdg zza;
    private zzbdl zzb;
    private String zzc;
    private zzbis zzd;
    private boolean zze;
    private ArrayList<String> zzf;
    private ArrayList<String> zzg;
    private zzblv zzh;
    private zzbdr zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private zzbfu zzl;
    private zzbrx zzn;
    private zzeli zzq;
    private zzbfy zzr;
    private int zzm = 1;
    private final zzfaf zzo = new zzfaf();
    private boolean zzp = false;

    public final zzfap zzA(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfap zzB(int i) {
        this.zzm = i;
        return this;
    }

    public final zzfap zzC(ArrayList<String> arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfap zzD(ArrayList<String> arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfap zzE(zzblv zzblvVar) {
        this.zzh = zzblvVar;
        return this;
    }

    public final zzfap zzF(zzbdr zzbdrVar) {
        this.zzi = zzbdrVar;
        return this;
    }

    public final zzfap zzG(zzbrx zzbrxVar) {
        this.zzn = zzbrxVar;
        this.zzd = new zzbis(false, true, false);
        return this;
    }

    public final zzfap zzH(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zza();
            this.zzl = publisherAdViewOptions.zzb();
        }
        return this;
    }

    public final zzfap zzI(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfap zzJ(zzeli zzeliVar) {
        this.zzq = zzeliVar;
        return this;
    }

    public final zzfap zzK(zzfar zzfarVar) {
        this.zzo.zzb(zzfarVar.zzo.zza);
        this.zza = zzfarVar.zzd;
        this.zzb = zzfarVar.zze;
        this.zzr = zzfarVar.zzq;
        this.zzc = zzfarVar.zzf;
        this.zzd = zzfarVar.zza;
        this.zzf = zzfarVar.zzg;
        this.zzg = zzfarVar.zzh;
        this.zzh = zzfarVar.zzi;
        this.zzi = zzfarVar.zzj;
        zzI(zzfarVar.zzl);
        zzH(zzfarVar.zzm);
        this.zzp = zzfarVar.zzp;
        this.zzq = zzfarVar.zzc;
        return this;
    }

    public final zzfar zzL() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfar(this, null);
    }

    public final boolean zzM() {
        return this.zzp;
    }

    public final zzfap zzO(zzbfy zzbfyVar) {
        this.zzr = zzbfyVar;
        return this;
    }

    public final zzfap zzr(zzbdg zzbdgVar) {
        this.zza = zzbdgVar;
        return this;
    }

    public final zzbdg zzs() {
        return this.zza;
    }

    public final zzfap zzt(zzbdl zzbdlVar) {
        this.zzb = zzbdlVar;
        return this;
    }

    public final zzfap zzu(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzbdl zzv() {
        return this.zzb;
    }

    public final zzfap zzw(String str) {
        this.zzc = str;
        return this;
    }

    public final String zzx() {
        return this.zzc;
    }

    public final zzfap zzy(zzbis zzbisVar) {
        this.zzd = zzbisVar;
        return this;
    }

    public final zzfaf zzz() {
        return this.zzo;
    }
}
