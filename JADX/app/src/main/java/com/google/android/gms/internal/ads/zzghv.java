package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzghv {
    private final ArrayDeque<zzgex> zza = new ArrayDeque<>();

    private zzghv() {
    }

    static /* synthetic */ zzgex zza(zzghv zzghvVar, zzgex zzgexVar, zzgex zzgexVar2) {
        zzghvVar.zzb(zzgexVar);
        zzghvVar.zzb(zzgexVar2);
        zzgex zzgexVarPop = zzghvVar.zza.pop();
        while (!zzghvVar.zza.isEmpty()) {
            zzgexVarPop = new zzghy(zzghvVar.zza.pop(), zzgexVarPop);
        }
        return zzgexVarPop;
    }

    private final void zzb(zzgex zzgexVar) {
        zzghw zzghwVar;
        if (!zzgexVar.zzg()) {
            if (!(zzgexVar instanceof zzghy)) {
                String strValueOf = String.valueOf(zzgexVar.getClass());
                String.valueOf(strValueOf).length();
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(strValueOf)));
            }
            zzghy zzghyVar = (zzghy) zzgexVar;
            zzb(zzghyVar.zzd);
            zzb(zzghyVar.zze);
            return;
        }
        int iZzc = zzc(zzgexVar.zzc());
        int iZzG = zzghy.zzG(iZzc + 1);
        if (this.zza.isEmpty() || this.zza.peek().zzc() >= iZzG) {
            this.zza.push(zzgexVar);
            return;
        }
        int iZzG2 = zzghy.zzG(iZzc);
        zzgex zzgexVarPop = this.zza.pop();
        while (true) {
            zzghwVar = null;
            if (this.zza.isEmpty() || this.zza.peek().zzc() >= iZzG2) {
                break;
            } else {
                zzgexVarPop = new zzghy(this.zza.pop(), zzgexVarPop);
            }
        }
        zzghy zzghyVar2 = new zzghy(zzgexVarPop, zzgexVar);
        while (!this.zza.isEmpty()) {
            if (this.zza.peek().zzc() >= zzghy.zzG(zzc(zzghyVar2.zzc()) + 1)) {
                break;
            } else {
                zzghyVar2 = new zzghy(this.zza.pop(), zzghyVar2);
            }
        }
        this.zza.push(zzghyVar2);
    }

    private static final int zzc(int i) {
        int iBinarySearch = Arrays.binarySearch(zzghy.zza, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    /* synthetic */ zzghv(zzghw zzghwVar) {
    }
}
