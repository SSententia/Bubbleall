package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzggm extends IOException {
    private zzghi zza;
    private boolean zzb;

    public zzggm(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    static zzggm zzd() {
        return new zzggm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static zzggm zze() {
        return new zzggm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzggm zzf() {
        return new zzggm("CodedInputStream encountered a malformed varint.");
    }

    static zzggm zzg() {
        return new zzggm("Protocol message contained an invalid tag (zero).");
    }

    static zzggm zzh() {
        return new zzggm("Protocol message end-group tag did not match expected tag.");
    }

    static zzggl zzi() {
        return new zzggl("Protocol message tag had invalid wire type.");
    }

    static zzggm zzj() {
        return new zzggm("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static zzggm zzk() {
        return new zzggm("Failed to parse the message.");
    }

    static zzggm zzl() {
        return new zzggm("Protocol message had invalid UTF-8.");
    }

    public final zzggm zza(zzghi zzghiVar) {
        this.zza = zzghiVar;
        return this;
    }

    final void zzb() {
        this.zzb = true;
    }

    final boolean zzc() {
        return this.zzb;
    }

    public zzggm(String str) {
        super(str);
        this.zza = null;
    }
}
