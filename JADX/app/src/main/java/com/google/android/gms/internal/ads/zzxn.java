package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzxn extends zzgkl implements Closeable {
    private static final zzgks zza = zzgks.zzb(zzxn.class);

    public zzxn(zzgkm zzgkmVar, zzxm zzxmVar) throws IOException {
        zze(zzgkmVar, zzgkmVar.zzb(), zzxmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgkl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzgkl
    public final String toString() {
        String string = this.zzd.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
