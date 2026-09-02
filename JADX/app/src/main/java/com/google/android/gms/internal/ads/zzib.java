package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzib implements zzlc, zzgv {
    final /* synthetic */ zzig zza;
    private final Uri zzc;
    private final zzlp zzd;
    private final zzhx zze;
    private final zznx zzf;
    private final zzakw zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzox zzn;
    private boolean zzo;
    private final zzoq zzh = new zzoq();
    private boolean zzj = true;
    private long zzm = -1;
    private final long zzb = zzgx.zza();
    private zzan zzl = zzj(0);

    public zzib(zzig zzigVar, Uri uri, zzaj zzajVar, zzhx zzhxVar, zznx zznxVar, zzakw zzakwVar) {
        this.zza = zzigVar;
        this.zzc = uri;
        this.zzd = new zzlp(zzajVar);
        this.zze = zzhxVar;
        this.zzf = zznxVar;
        this.zzg = zzakwVar;
    }

    static /* synthetic */ void zzi(zzib zzibVar, long j, long j2) {
        zzibVar.zzh.zza = j;
        zzibVar.zzk = j2;
        zzibVar.zzj = true;
        zzibVar.zzo = false;
    }

    private final zzan zzj(long j) {
        zzal zzalVar = new zzal();
        zzalVar.zza(this.zzc);
        zzalVar.zzc(j);
        zzalVar.zzd(6);
        zzalVar.zzb(zzig.zzb);
        return zzalVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01e8 */
    @Override // com.google.android.gms.internal.ads.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzib.zzh():void");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final void zza(zzamf zzamfVar) {
        long jMax = !this.zzo ? this.zzk : Math.max(this.zza.zzV(), this.zzk);
        int iZzd = zzamfVar.zzd();
        zzox zzoxVar = this.zzn;
        zzoxVar.getClass();
        zzov.zzb(zzoxVar, zzamfVar, iZzd);
        zzoxVar.zzv(jMax, 1, iZzd, 0, null);
        this.zzo = true;
    }
}
