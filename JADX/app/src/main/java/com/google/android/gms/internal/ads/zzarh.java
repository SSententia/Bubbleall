package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzarh extends Exception {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzarh(zzanm zzanmVar, Throwable th, boolean z, int i) {
        String strValueOf = String.valueOf(zzanmVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 36);
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(strValueOf);
        super(sb.toString(), th);
        this.zza = zzanmVar.zzf;
        this.zzb = null;
        int iAbs = Math.abs(i);
        StringBuilder sb2 = new StringBuilder(68);
        sb2.append("com.google.android.exoplayer.MediaCodecTrackRenderer_neg_");
        sb2.append(iAbs);
        this.zzc = sb2.toString();
    }

    public zzarh(zzanm zzanmVar, Throwable th, boolean z, String str) {
        String strValueOf = String.valueOf(zzanmVar);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(strValueOf).length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(strValueOf);
        super(sb.toString(), th);
        this.zza = zzanmVar.zzf;
        this.zzb = str;
        String diagnosticInfo = null;
        if (zzave.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzc = diagnosticInfo;
    }
}
