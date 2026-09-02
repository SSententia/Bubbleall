package com.google.android.gms.internal.consent_sdk;

import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaa {
    private final zzz zza;
    private final zzby zzb;
    private int zzc = 0;
    private int zzd = 0;

    zzaa(zzz zzzVar, zzby zzbyVar) {
        this.zza = zzzVar;
        this.zzb = zzbyVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
    final zzy zza() throws zzk {
        String str;
        switch (zzx.zza[this.zzb.zza - 1]) {
            case 1:
                this.zzc = 1;
                this.zzd = 0;
                break;
            case 2:
                this.zzc = 2;
                this.zzd = 0;
                break;
            case 3:
                this.zzc = 3;
                this.zzd = 2;
                break;
            case 4:
                this.zzc = 3;
                this.zzd = 1;
                break;
            case 5:
                this.zzc = 3;
                this.zzd = 0;
                break;
            case 6:
                String strValueOf = String.valueOf(this.zzb.zzd);
                throw new zzk(1, strValueOf.length() != 0 ? "Invalid response from server: ".concat(strValueOf) : new String("Invalid response from server: "));
            case 7:
                String strValueOf2 = String.valueOf(this.zzb.zzd);
                throw new zzk(3, strValueOf2.length() != 0 ? "Publisher misconfiguration: ".concat(strValueOf2) : new String("Publisher misconfiguration: "));
            default:
                throw new zzk(1, "Invalid response from server.");
        }
        String str2 = this.zzb.zzb;
        zzbb zzbbVar = str2 == null ? null : new zzbb(this.zzb.zzc, str2);
        this.zza.zzc.zza(new HashSet(this.zzb.zze));
        for (zzbx zzbxVar : this.zzb.zzf) {
            int i = zzx.zzb[zzbxVar.zza - 1];
            if (i == 1) {
                str = null;
            } else if (i == 2) {
                str = "write";
            } else if (i != 3) {
                str = null;
            } else {
                str = "clear";
            }
            if (str != null) {
                this.zza.zza.zza(str, zzbxVar.zzb, this.zza.zzb);
            }
        }
        return new zzy(this.zzc, this.zzd, zzbbVar, null);
    }
}
