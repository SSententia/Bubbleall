package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzavl {
    public final List<byte[]> zza;
    public final int zzb;

    private zzavl(List<byte[]> list, int i) {
        this.zza = list;
        this.zzb = i;
    }

    public static zzavl zza(zzaux zzauxVar) throws zzanp {
        try {
            zzauxVar.zzj(21);
            int iZzl = zzauxVar.zzl() & 3;
            int iZzl2 = zzauxVar.zzl();
            int iZzg = zzauxVar.zzg();
            int i = 0;
            for (int i2 = 0; i2 < iZzl2; i2++) {
                zzauxVar.zzj(1);
                int iZzm = zzauxVar.zzm();
                for (int i3 = 0; i3 < iZzm; i3++) {
                    int iZzm2 = zzauxVar.zzm();
                    i += iZzm2 + 4;
                    zzauxVar.zzj(iZzm2);
                }
            }
            zzauxVar.zzi(iZzg);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < iZzl2; i5++) {
                zzauxVar.zzj(1);
                int iZzm3 = zzauxVar.zzm();
                for (int i6 = 0; i6 < iZzm3; i6++) {
                    int iZzm4 = zzauxVar.zzm();
                    System.arraycopy(zzauv.zza, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(zzauxVar.zza, zzauxVar.zzg(), bArr, i7, iZzm4);
                    i4 = i7 + iZzm4;
                    zzauxVar.zzj(iZzm4);
                }
            }
            return new zzavl(i == 0 ? null : Collections.singletonList(bArr), iZzl + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzanp("Error parsing HEVC config", e);
        }
    }
}
