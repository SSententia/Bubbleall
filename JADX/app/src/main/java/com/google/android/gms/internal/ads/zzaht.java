package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaht extends zzadm {
    private final int zza;
    private final int zzb;
    private final int[] zze;
    private final int[] zzf;
    private final zzaiq[] zzg;
    private final Object[] zzh;
    private final HashMap<Object, Integer> zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zzaht(Collection collection, Collection<? extends zzagt> collection2, zzix zzixVar) {
        super(false, collection2, null);
        int iZza = 0;
        int size = collection.size();
        this.zze = new int[size];
        this.zzf = new int[size];
        this.zzg = new zzaiq[size];
        this.zzh = new Object[size];
        this.zzi = new HashMap<>();
        Iterator it = collection.iterator();
        int iZzg = 0;
        int i = 0;
        while (it.hasNext()) {
            zzagt zzagtVar = (zzagt) it.next();
            this.zzg[i] = zzagtVar.zzc();
            this.zzf[i] = iZza;
            this.zze[i] = iZzg;
            iZza += this.zzg[i].zza();
            iZzg += this.zzg[i].zzg();
            this.zzh[i] = zzagtVar.zzb();
            this.zzi.put(this.zzh[i], Integer.valueOf(i));
            i++;
        }
        this.zza = iZza;
        this.zzb = iZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    protected final int zzl(int i) {
        return zzamq.zzC(this.zze, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    protected final int zzm(int i) {
        return zzamq.zzC(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    protected final int zzn(Object obj) {
        Integer num = this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    protected final zzaiq zzo(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    protected final int zzp(int i) {
        return this.zze[i];
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    protected final int zzq(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    protected final Object zzr(int i) {
        return this.zzh[i];
    }

    final List<zzaiq> zzs() {
        return Arrays.asList(this.zzg);
    }
}
