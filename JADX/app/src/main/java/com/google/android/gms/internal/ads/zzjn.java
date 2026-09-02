package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzjn extends zzw {
    public static final zzjn zzA;

    @Deprecated
    public static final zzjn zzB;
    public static final zzadw<zzjn> zzN;
    public final int zzC;
    public final boolean zzD;
    public final boolean zzE;
    public final boolean zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    private final SparseArray<Map<zzs, zzjq>> zzO;
    private final SparseBooleanArray zzP;

    static {
        zzjn zzjnVar = new zzjn(new zzjo());
        zzA = zzjnVar;
        zzB = zzjnVar;
        zzN = zzjm.zza;
    }

    private zzjn(zzjo zzjoVar) {
        super(zzjoVar);
        this.zzD = zzjoVar.zza;
        this.zzE = false;
        this.zzF = zzjoVar.zzb;
        this.zzG = zzjoVar.zzc;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzC = 0;
        this.zzK = zzjoVar.zzd;
        this.zzL = false;
        this.zzM = zzjoVar.zze;
        this.zzO = zzjoVar.zzf;
        this.zzP = zzjoVar.zzg;
    }

    public static zzjn zzc(Context context) {
        return new zzjn(new zzjo(context));
    }

    @Override // com.google.android.gms.internal.ads.zzw
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzjn zzjnVar = (zzjn) obj;
            if (super.equals(zzjnVar) && this.zzD == zzjnVar.zzD && this.zzF == zzjnVar.zzF && this.zzG == zzjnVar.zzG && this.zzK == zzjnVar.zzK && this.zzM == zzjnVar.zzM) {
                SparseBooleanArray sparseBooleanArray = this.zzP;
                SparseBooleanArray sparseBooleanArray2 = zzjnVar.zzP;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray<Map<zzs, zzjq>> sparseArray = this.zzO;
                    SparseArray<Map<zzs, zzjq>> sparseArray2 = zzjnVar.zzO;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map<zzs, zzjq> mapValueAt = sparseArray.valueAt(i2);
                                Map<zzs, zzjq> mapValueAt2 = sparseArray2.valueAt(iIndexOfKey);
                                if (mapValueAt2.size() == mapValueAt.size()) {
                                    for (Map.Entry<zzs, zzjq> entry : mapValueAt.entrySet()) {
                                        zzs key = entry.getKey();
                                        if (!mapValueAt2.containsKey(key) || !zzamq.zzc(entry.getValue(), mapValueAt2.get(key))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzw
    public final int hashCode() {
        return ((((((((((super.hashCode() + 31) * 31) + (this.zzD ? 1 : 0)) * 961) + (this.zzF ? 1 : 0)) * 31) + (this.zzG ? 1 : 0)) * 28629151) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0);
    }

    public final boolean zzd(int i) {
        return this.zzP.get(i);
    }

    public final boolean zze(int i, zzs zzsVar) {
        Map<zzs, zzjq> map = this.zzO.get(i);
        return map != null && map.containsKey(zzsVar);
    }

    public final zzjq zzf(int i, zzs zzsVar) {
        Map<zzs, zzjq> map = this.zzO.get(i);
        if (map != null) {
            return map.get(zzsVar);
        }
        return null;
    }

    public final zzjo zzg() {
        return new zzjo(this, null);
    }
}
