package com.google.android.gms.internal.ads;

import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsc extends zzsm {
    private zzoh zza;
    private zzsb zzb;

    zzsc() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    protected final long zzb(zzamf zzamfVar) {
        if (!zzd(zzamfVar.zzi())) {
            return -1L;
        }
        int i = (zzamfVar.zzi()[2] & UByte.MAX_VALUE) >> 4;
        if (i == 6) {
            zzamfVar.zzk(4);
            zzamfVar.zzH();
        } else if (i == 7) {
            i = 7;
            zzamfVar.zzk(4);
            zzamfVar.zzH();
        }
        int iZzc = zzoc.zzc(zzamfVar, i);
        zzamfVar.zzh(0);
        return iZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzamf zzamfVar, long j, zzsk zzskVar) {
        byte[] bArrZzi = zzamfVar.zzi();
        zzoh zzohVar = this.zza;
        if (zzohVar == null) {
            zzoh zzohVar2 = new zzoh(bArrZzi, 17);
            this.zza = zzohVar2;
            zzskVar.zza = zzohVar2.zzc(Arrays.copyOfRange(bArrZzi, 9, zzamfVar.zze()), null);
            return true;
        }
        if ((bArrZzi[0] & ByteCompanionObject.MAX_VALUE) == 3) {
            zzog zzogVarZzb = zzoe.zzb(zzamfVar);
            zzoh zzohVarZze = zzohVar.zze(zzogVarZzb);
            this.zza = zzohVarZze;
            this.zzb = new zzsb(zzohVarZze, zzogVarZzb);
            return true;
        }
        if (!zzd(bArrZzi)) {
            return true;
        }
        zzsb zzsbVar = this.zzb;
        if (zzsbVar != null) {
            zzsbVar.zza(j);
            zzskVar.zzb = this.zzb;
        }
        zzskVar.zza.getClass();
        return false;
    }
}
