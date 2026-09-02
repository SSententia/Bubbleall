package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzif extends zzgd<String> implements RandomAccess, zzig {
    public static final zzig zza;
    private static final zzif zzb;
    private final List<Object> zzc;

    static {
        zzif zzifVar = new zzif(10);
        zzb = zzifVar;
        zzifVar.zzb();
        zza = zzifVar;
    }

    public zzif() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof zzgr ? ((zzgr) obj).zzl(zzhz.zza) : zzhz.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzgd, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzbL();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzgd, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzbL();
        if (collection instanceof zzig) {
            collection = ((zzig) collection).zzh();
        }
        boolean zAddAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.measurement.zzgd, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbL();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzgd, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbL();
        Object objRemove = this.zzc.remove(i);
        this.modCount++;
        return zzj(objRemove);
    }

    @Override // com.google.android.gms.internal.measurement.zzgd, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzbL();
        return zzj(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgr) {
            zzgr zzgrVar = (zzgr) obj;
            String strZzl = zzgrVar.zzl(zzhz.zza);
            if (zzgrVar.zzh()) {
                this.zzc.set(i, strZzl);
            }
            return strZzl;
        }
        byte[] bArr = (byte[]) obj;
        String strZzd = zzhz.zzd(bArr);
        if (zzhz.zzc(bArr)) {
            this.zzc.set(i, strZzd);
        }
        return strZzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzhy
    public final /* bridge */ /* synthetic */ zzhy zze(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzif((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final void zzf(zzgr zzgrVar) {
        zzbL();
        this.zzc.add(zzgrVar);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final Object zzg(int i) {
        return this.zzc.get(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final List<?> zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final zzig zzi() {
        return zza() ? new zzka(this) : this;
    }

    public zzif(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzif(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.zzgd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
