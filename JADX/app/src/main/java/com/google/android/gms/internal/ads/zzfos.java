package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfos<E> extends zzfoc<E> {

    @CheckForNull
    Object[] zzd;
    private int zze;

    public zzfos() {
        super(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfoc, com.google.android.gms.internal.ads.zzfod
    public final /* bridge */ /* synthetic */ zzfod zzc(Object obj) {
        zze(obj);
        return this;
    }

    public final zzfos<E> zzf(Iterable<? extends E> iterable) {
        if (this.zzd != null) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                zze(it.next());
            }
        } else {
            super.zzb(iterable);
        }
        return this;
    }

    zzfos(int i) {
        super(i);
        this.zzd = new Object[zzfot.zzl(i)];
    }

    public final zzfot<E> zzg() {
        zzfot<E> zzfotVarZzp;
        int i = this.zzb;
        if (i == 0) {
            return zzfqd.zza;
        }
        if (i == 1) {
            Object obj = this.zza[0];
            obj.getClass();
            return new zzfqi(obj);
        }
        if (this.zzd == null || zzfot.zzl(i) != this.zzd.length) {
            zzfotVarZzp = zzfot.zzp(this.zzb, this.zza);
            this.zzb = zzfotVarZzp.size();
        } else {
            Object[] objArrCopyOf = zzfot.zzq(this.zzb, this.zza.length) ? Arrays.copyOf(this.zza, this.zzb) : this.zza;
            int i2 = this.zze;
            Object[] objArr = this.zzd;
            zzfotVarZzp = new zzfqd<>(objArrCopyOf, i2, objArr, objArr.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzfotVarZzp;
    }

    public final zzfos<E> zze(E e) {
        e.getClass();
        if (this.zzd != null) {
            int iZzl = zzfot.zzl(this.zzb);
            Object[] objArr = this.zzd;
            int length = objArr.length;
            if (iZzl <= length) {
                objArr.getClass();
                int i = length - 1;
                int iHashCode = e.hashCode();
                int iZza = zzfob.zza(iHashCode);
                while (true) {
                    int i2 = iZza & i;
                    Object[] objArr2 = this.zzd;
                    Object obj = objArr2[i2];
                    if (obj != null) {
                        if (obj.equals(e)) {
                            break;
                        }
                        iZza = i2 + 1;
                    } else {
                        objArr2[i2] = e;
                        this.zze += iHashCode;
                        super.zza(e);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(e);
        return this;
    }
}
