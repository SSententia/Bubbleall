package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzds extends Exception {
    public final boolean zza;
    public final zzafv zzb;

    public zzds(int i, int i2, int i3, int i4, zzafv zzafvVar, boolean z, Exception exc) {
        StringBuilder sb = new StringBuilder(80);
        sb.append("AudioTrack init failed ");
        sb.append(i);
        sb.append(" Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(")");
        super(sb.toString(), exc);
        this.zza = false;
        this.zzb = zzafvVar;
    }
}
