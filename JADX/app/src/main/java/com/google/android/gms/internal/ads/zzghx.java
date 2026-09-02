package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzghx implements Iterator<zzges> {
    private final ArrayDeque<zzghy> zza;
    private zzges zzb;

    /* synthetic */ zzghx(zzgex zzgexVar, zzghw zzghwVar) {
        if (!(zzgexVar instanceof zzghy)) {
            this.zza = null;
            this.zzb = (zzges) zzgexVar;
            return;
        }
        zzghy zzghyVar = (zzghy) zzgexVar;
        ArrayDeque<zzghy> arrayDeque = new ArrayDeque<>(zzghyVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzghyVar);
        this.zzb = zzb(zzghyVar.zzd);
    }

    private final zzges zzb(zzgex zzgexVar) {
        while (zzgexVar instanceof zzghy) {
            zzghy zzghyVar = (zzghy) zzgexVar;
            this.zza.push(zzghyVar);
            zzgexVar = zzghyVar.zzd;
        }
        return (zzges) zzgexVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzges next() {
        zzges zzgesVarZzb;
        zzges zzgesVar = this.zzb;
        if (zzgesVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque<zzghy> arrayDeque = this.zza;
            zzgesVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgesVarZzb = zzb(this.zza.pop().zze);
        } while (zzgesVarZzb.zzr());
        this.zzb = zzgesVarZzb;
        return zzgesVar;
    }
}
