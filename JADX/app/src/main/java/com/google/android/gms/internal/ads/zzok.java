package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzok {
    public final List<byte[]> zza;
    public final int zzb;
    public final String zzc;

    private zzok(List<byte[]> list, int i, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = str;
    }

    public static zzok zza(zzamf zzamfVar) throws zzaha {
        try {
            zzamfVar.zzk(21);
            int iZzn = zzamfVar.zzn() & 3;
            int iZzn2 = zzamfVar.zzn();
            int iZzg = zzamfVar.zzg();
            int i = 0;
            for (int i2 = 0; i2 < iZzn2; i2++) {
                zzamfVar.zzk(1);
                int iZzo = zzamfVar.zzo();
                for (int i3 = 0; i3 < iZzo; i3++) {
                    int iZzo2 = zzamfVar.zzo();
                    i += iZzo2 + 4;
                    zzamfVar.zzk(iZzo2);
                }
            }
            zzamfVar.zzh(iZzg);
            byte[] bArr = new byte[i];
            int i4 = 0;
            String strZzb = null;
            for (int i5 = 0; i5 < iZzn2; i5++) {
                int iZzn3 = zzamfVar.zzn() & 127;
                int iZzo3 = zzamfVar.zzo();
                int i6 = 0;
                while (i6 < iZzo3) {
                    int iZzo4 = zzamfVar.zzo();
                    System.arraycopy(zzalw.zza, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(zzamfVar.zzi(), zzamfVar.zzg(), bArr, i7, iZzo4);
                    if (iZzn3 == 33 && i6 == 0) {
                        i6 = 0;
                        strZzb = zzakv.zzb(new zzamg(bArr, i7, i7 + iZzo4));
                    }
                    i4 = i7 + iZzo4;
                    zzamfVar.zzk(iZzo4);
                    i6++;
                }
            }
            return new zzok(i == 0 ? null : Collections.singletonList(bArr), iZzn + 1, strZzb);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzaha.zzb("Error parsing HEVC config", e);
        }
    }
}
