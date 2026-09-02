package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzkn extends zzag {
    private zzan zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzkn() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(zzamq.zzd(this.zzb), this.zzc, bArr, i, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzd(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final long zzh(zzan zzanVar) throws IOException {
        zzb(zzanVar);
        this.zza = zzanVar;
        Uri uri = zzanVar.zza;
        String scheme = uri.getScheme();
        boolean zEquals = "data".equals(scheme);
        String strValueOf = String.valueOf(scheme);
        zzakt.zzb(zEquals, strValueOf.length() != 0 ? "Unsupported scheme: ".concat(strValueOf) : new String("Unsupported scheme: "));
        String[] strArrZzt = zzamq.zzt(uri.getSchemeSpecificPart(), ",");
        if (strArrZzt.length != 2) {
            String strValueOf2 = String.valueOf(uri);
            String.valueOf(strValueOf2).length();
            throw zzaha.zza("Unexpected URI format: ".concat(String.valueOf(strValueOf2)), null);
        }
        String str = strArrZzt[1];
        if (strArrZzt[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                String strValueOf3 = String.valueOf(str);
                throw zzaha.zza(strValueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(strValueOf3) : new String("Error while parsing Base64 encoded string: "), e);
            }
        } else {
            this.zzb = zzamq.zzs(URLDecoder.decode(str, zzfll.zza.name()));
        }
        long j = zzanVar.zzf;
        int length = this.zzb.length;
        if (j > length) {
            this.zzb = null;
            throw new zzak(2008);
        }
        int i = (int) j;
        this.zzc = i;
        int i2 = length - i;
        this.zzd = i2;
        long j2 = zzanVar.zzg;
        if (j2 != -1) {
            this.zzd = (int) Math.min(i2, j2);
        }
        zzc(zzanVar);
        long j3 = zzanVar.zzg;
        return j3 != -1 ? j3 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        zzan zzanVar = this.zza;
        if (zzanVar != null) {
            return zzanVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zzj() {
        if (this.zzb != null) {
            this.zzb = null;
            zze();
        }
        this.zza = null;
    }
}
