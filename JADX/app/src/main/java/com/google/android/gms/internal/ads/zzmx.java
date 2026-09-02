package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzmx {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzmv zza(byte[] bArr) throws zzaha {
        return zzb(new zzame(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ba, code lost:
    
        if (r12 != 3) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzmv zzb(com.google.android.gms.internal.ads.zzame r12, boolean r13) throws com.google.android.gms.internal.ads.zzaha {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmx.zzb(com.google.android.gms.internal.ads.zzame, boolean):com.google.android.gms.internal.ads.zzmv");
    }

    private static int zzc(zzame zzameVar) {
        int iZzh = zzameVar.zzh(5);
        return iZzh == 31 ? zzameVar.zzh(6) + 32 : iZzh;
    }

    private static int zzd(zzame zzameVar) throws zzaha {
        int iZzh = zzameVar.zzh(4);
        if (iZzh == 15) {
            return zzameVar.zzh(24);
        }
        if (iZzh < 13) {
            return zzb[iZzh];
        }
        throw zzaha.zzb(null, null);
    }
}
