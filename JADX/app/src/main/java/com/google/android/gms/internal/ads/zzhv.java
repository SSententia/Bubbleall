package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhv extends zzgq<Integer> {
    private static final zzagk zza;
    private final zzhh[] zzb;
    private final zzaiq[] zzc;
    private final ArrayList<zzhh> zzd;
    private final Map<Object, Long> zze;
    private final zzfpj<Object, zzgm> zzf;
    private int zzg;
    private long[][] zzh;
    private zzhu zzi;
    private final zzgs zzj;

    static {
        zzagb zzagbVar = new zzagb();
        zzagbVar.zza("MergingMediaSource");
        zza = zzagbVar.zzc();
    }

    public zzhv(boolean z, boolean z2, zzhh... zzhhVarArr) {
        zzgs zzgsVar = new zzgs();
        this.zzb = zzhhVarArr;
        this.zzj = zzgsVar;
        this.zzd = new ArrayList<>(Arrays.asList(zzhhVarArr));
        this.zzg = -1;
        this.zzc = new zzaiq[zzhhVarArr.length];
        this.zzh = new long[0][];
        this.zze = new HashMap();
        this.zzf = zzfpr.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzA(zzhe zzheVar) {
        zzht zzhtVar = (zzht) zzheVar;
        int i = 0;
        while (true) {
            zzhh[] zzhhVarArr = this.zzb;
            if (i >= zzhhVarArr.length) {
                return;
            }
            zzhhVarArr[i].zzA(zzhtVar.zza(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final zzhe zzC(zzhf zzhfVar, zzko zzkoVar, long j) {
        int length = this.zzb.length;
        zzhe[] zzheVarArr = new zzhe[length];
        int iZzi = this.zzc[0].zzi(zzhfVar.zza);
        for (int i = 0; i < length; i++) {
            zzheVarArr[i] = this.zzb[i].zzC(zzhfVar.zzc(this.zzc[i].zzj(iZzi)), zzkoVar, j - this.zzh[iZzi][i]);
        }
        return new zzht(this.zzj, this.zzh[iZzi], zzheVarArr, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzgi
    protected final void zza(zzay zzayVar) {
        super.zza(zzayVar);
        for (int i = 0; i < this.zzb.length; i++) {
            zzw(Integer.valueOf(i), this.zzb[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzgi
    protected final void zzd() {
        super.zzd();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzhh
    public final void zzu() throws IOException {
        zzhu zzhuVar = this.zzi;
        if (zzhuVar != null) {
            throw zzhuVar;
        }
        super.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    protected final /* bridge */ /* synthetic */ void zzv(Integer num, zzhh zzhhVar, zzaiq zzaiqVar) {
        int iZzg;
        if (this.zzi != null) {
            return;
        }
        if (this.zzg == -1) {
            iZzg = zzaiqVar.zzg();
            this.zzg = iZzg;
        } else {
            int iZzg2 = zzaiqVar.zzg();
            int i = this.zzg;
            if (iZzg2 != i) {
                this.zzi = new zzhu(0);
                return;
            }
            iZzg = i;
        }
        if (this.zzh.length == 0) {
            this.zzh = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iZzg, this.zzc.length);
        }
        this.zzd.remove(zzhhVar);
        this.zzc[num.intValue()] = zzaiqVar;
        if (this.zzd.isEmpty()) {
            zze(this.zzc[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    protected final /* bridge */ /* synthetic */ zzhf zzx(Integer num, zzhf zzhfVar) {
        if (num.intValue() == 0) {
            return zzhfVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final zzagk zzz() {
        zzhh[] zzhhVarArr = this.zzb;
        return zzhhVarArr.length > 0 ? zzhhVarArr[0].zzz() : zza;
    }
}
