package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzfn extends zzad {
    public final zzfo zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzfn(Throwable th, zzfo zzfoVar) {
        String diagnosticInfo = null;
        String strValueOf = String.valueOf(zzfoVar == null ? null : zzfoVar.zza);
        super(strValueOf.length() != 0 ? "Decoder failed: ".concat(strValueOf) : new String("Decoder failed: "), th);
        this.zza = zzfoVar;
        if (zzamq.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzb = diagnosticInfo;
    }
}
