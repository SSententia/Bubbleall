package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgc<MessageType extends zzgc<MessageType, BuilderType>, BuilderType extends zzgb<MessageType, BuilderType>> implements zziw {
    protected int zzb = 0;

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void zzbs(Iterable<T> iterable, List<? super T> list) {
        zzhz.zza(iterable);
        if (iterable instanceof zzig) {
            List<?> listZzh = ((zzig) iterable).zzh();
            zzig zzigVar = (zzig) list;
            int size = list.size();
            for (Object obj : listZzh) {
                if (obj == null) {
                    int size2 = zzigVar.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String string = sb.toString();
                    int size3 = zzigVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(string);
                        }
                        zzigVar.remove(size3);
                    }
                } else if (obj instanceof zzgr) {
                    zzigVar.zzf((zzgr) obj);
                } else {
                    zzigVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzjd) {
            list.addAll(iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size4 = list.size();
        for (T t : iterable) {
            if (t == null) {
                int size5 = list.size();
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size5 - size4);
                sb2.append(" is null.");
                String string2 = sb2.toString();
                int size6 = list.size();
                while (true) {
                    size6--;
                    if (size6 < size4) {
                        throw new NullPointerException(string2);
                    }
                    list.remove(size6);
                }
            } else {
                list.add(t);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final zzgr zzbo() {
        try {
            int iZzbw = zzbw();
            zzgr zzgrVar = zzgr.zzb;
            byte[] bArr = new byte[iZzbw];
            zzgy zzgyVarZzt = zzgy.zzt(bArr);
            zzbv(zzgyVarZzt);
            zzgyVarZzt.zzC();
            return new zzgp(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] zzbp() {
        try {
            byte[] bArr = new byte[zzbw()];
            zzgy zzgyVarZzt = zzgy.zzt(bArr);
            zzbv(zzgyVarZzt);
            zzgyVarZzt.zzC();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    int zzbq() {
        throw null;
    }

    void zzbr(int i) {
        throw null;
    }
}
