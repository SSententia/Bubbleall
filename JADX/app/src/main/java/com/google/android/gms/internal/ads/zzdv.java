package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdv extends Exception {
    public final boolean zza;
    public final zzafv zzb;

    public zzdv(int i, zzafv zzafvVar, boolean z) {
        StringBuilder sb = new StringBuilder(36);
        sb.append("AudioTrack write failed: ");
        sb.append(i);
        super(sb.toString());
        this.zza = z;
        this.zzb = zzafvVar;
    }
}
