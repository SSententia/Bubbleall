package com.google.android.gms.internal.ads;

import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfoi extends zzfoj {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfoj zzc;

    zzfoi(zzfoj zzfojVar, int i, int i2) {
        this.zzc = zzfojVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzflx.zze(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    @CheckForNull
    final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    /* JADX INFO: renamed from: zzh */
    public final zzfoj subList(int i, int i2) {
        zzflx.zzg(i, i2, this.zzb);
        zzfoj zzfojVar = this.zzc;
        int i3 = this.zza;
        return zzfojVar.subList(i + i3, i2 + i3);
    }
}
