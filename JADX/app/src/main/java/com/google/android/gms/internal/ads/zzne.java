package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzne {
    public final List<byte[]> zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;
    public final String zzf;

    private zzne(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = f;
        this.zzf = str;
    }

    public static zzne zza(zzamf zzamfVar) throws zzaha {
        int i;
        int i2;
        float f;
        String strZza;
        try {
            zzamfVar.zzk(4);
            int iZzn = (zzamfVar.zzn() & 3) + 1;
            if (iZzn == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzn2 = zzamfVar.zzn() & 31;
            for (int i3 = 0; i3 < iZzn2; i3++) {
                arrayList.add(zzb(zzamfVar));
            }
            int iZzn3 = zzamfVar.zzn();
            for (int i4 = 0; i4 < iZzn3; i4++) {
                arrayList.add(zzb(zzamfVar));
            }
            if (iZzn2 > 0) {
                zzalv zzalvVarZzb = zzalw.zzb((byte[]) arrayList.get(0), iZzn, ((byte[]) arrayList.get(0)).length);
                int i5 = zzalvVarZzb.zze;
                int i6 = zzalvVarZzb.zzf;
                float f2 = zzalvVarZzb.zzg;
                strZza = zzakv.zza(zzalvVarZzb.zza, zzalvVarZzb.zzb, zzalvVarZzb.zzc);
                i = i5;
                i2 = i6;
                f = f2;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
                strZza = null;
            }
            return new zzne(arrayList, iZzn, i, i2, f, strZza);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzaha.zzb("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzamf zzamfVar) {
        int iZzo = zzamfVar.zzo();
        int iZzg = zzamfVar.zzg();
        zzamfVar.zzk(iZzo);
        return zzakv.zzc(zzamfVar.zzi(), iZzg, iZzo);
    }
}
