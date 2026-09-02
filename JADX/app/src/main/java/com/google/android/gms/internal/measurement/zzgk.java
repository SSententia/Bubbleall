package com.google.android.gms.internal.measurement;

import java.util.Comparator;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgk implements Comparator<zzgr> {
    zzgk() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzgr zzgrVar, zzgr zzgrVar2) {
        zzgr zzgrVar3 = zzgrVar;
        zzgr zzgrVar4 = zzgrVar2;
        zzgj zzgjVar = new zzgj(zzgrVar3);
        zzgj zzgjVar2 = new zzgj(zzgrVar4);
        while (zzgjVar.hasNext() && zzgjVar2.hasNext()) {
            int iCompare = Integer.compare(zzgjVar.zza() & UByte.MAX_VALUE, zzgjVar2.zza() & UByte.MAX_VALUE);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(zzgrVar3.zzc(), zzgrVar4.zzc());
    }
}
