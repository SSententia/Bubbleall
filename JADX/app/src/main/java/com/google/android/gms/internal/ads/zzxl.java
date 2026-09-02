package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzxl implements zzxm {
    private static final Logger zzb = Logger.getLogger(zzxl.class.getName());
    final ThreadLocal<ByteBuffer> zza = new zzxk(this);

    public abstract zzxp zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzxm
    public final zzxp zzb(zzgkm zzgkmVar, zzxq zzxqVar) throws IOException {
        int iZza;
        long jZzb;
        long jZzc = zzgkmVar.zzc();
        this.zza.get().rewind().limit(8);
        do {
            iZza = zzgkmVar.zza(this.zza.get());
            if (iZza == 8) {
                this.zza.get().rewind();
                long jZza = zzxo.zza(this.zza.get());
                byte[] bArr = null;
                if (jZza < 8 && jZza > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jZza);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                this.zza.get().get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jZza == 1) {
                        this.zza.get().limit(16);
                        zzgkmVar.zza(this.zza.get());
                        this.zza.get().position(8);
                        jZzb = zzxo.zzd(this.zza.get()) - 16;
                    } else {
                        jZzb = jZza == 0 ? zzgkmVar.zzb() - zzgkmVar.zzc() : jZza - 8;
                    }
                    if ("uuid".equals(str)) {
                        this.zza.get().limit(this.zza.get().limit() + 16);
                        zzgkmVar.zza(this.zza.get());
                        bArr = new byte[16];
                        for (int iPosition = this.zza.get().position() - 16; iPosition < this.zza.get().position(); iPosition++) {
                            bArr[iPosition - (this.zza.get().position() - 16)] = this.zza.get().get(iPosition);
                        }
                        jZzb -= 16;
                    }
                    long j = jZzb;
                    zzxp zzxpVarZza = zza(str, bArr, zzxqVar instanceof zzxp ? ((zzxp) zzxqVar).zzb() : "");
                    zzxpVarZza.zza(zzxqVar);
                    this.zza.get().rewind();
                    zzxpVarZza.zzc(zzgkmVar, this.zza.get(), j, this);
                    return zzxpVarZza;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (iZza >= 0);
        zzgkmVar.zzd(jZzc);
        throw new EOFException();
    }
}
