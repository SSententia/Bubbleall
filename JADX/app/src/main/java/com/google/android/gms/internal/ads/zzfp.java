package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfp extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzfo zzc;
    public final String zzd;
    public final zzfp zze;

    public zzfp(zzafv zzafvVar, Throwable th, boolean z, int i) {
        String strValueOf = String.valueOf(zzafvVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 36);
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(strValueOf);
        String str = zzafvVar.zzl;
        int iAbs = Math.abs(i);
        StringBuilder sb2 = new StringBuilder(75);
        sb2.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_");
        sb2.append(iAbs);
        this(sb.toString(), th, str, false, null, sb2.toString(), null);
    }

    static /* synthetic */ zzfp zza(zzfp zzfpVar, zzfp zzfpVar2) {
        return new zzfp(zzfpVar.getMessage(), zzfpVar.getCause(), zzfpVar.zza, false, zzfpVar.zzc, zzfpVar.zzd, zzfpVar2);
    }

    public zzfp(zzafv zzafvVar, Throwable th, boolean z, zzfo zzfoVar) {
        String str = zzfoVar.zza;
        String strValueOf = String.valueOf(zzafvVar);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(strValueOf).length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(strValueOf);
        String string = sb.toString();
        String str2 = zzafvVar.zzl;
        String diagnosticInfo = null;
        if (zzamq.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this(string, th, str2, false, zzfoVar, diagnosticInfo, null);
    }

    private zzfp(String str, Throwable th, String str2, boolean z, zzfo zzfoVar, String str3, zzfp zzfpVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzfoVar;
        this.zzd = str3;
        this.zze = zzfpVar;
    }
}
