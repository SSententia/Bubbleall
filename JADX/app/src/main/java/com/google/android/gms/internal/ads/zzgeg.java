package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgef;
import com.google.android.gms.internal.ads.zzgeg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgeg<MessageType extends zzgeg<MessageType, BuilderType>, BuilderType extends zzgef<MessageType, BuilderType>> implements zzghi {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void zzar(Iterable<T> iterable, List<? super T> list) {
        zzggk.zza(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (T t : iterable) {
            if (t == null) {
                int size2 = list.size();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Element at index ");
                sb.append(size2 - size);
                sb.append(" is null.");
                String string = sb.toString();
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(string);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(t);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final zzgex zzan() {
        try {
            int iZzaw = zzaw();
            zzgex zzgexVar = zzgex.zzb;
            byte[] bArr = new byte[iZzaw];
            zzgfh zzgfhVarZzu = zzgfh.zzu(bArr);
            zzav(zzgfhVarZzu);
            zzgfhVarZzu.zzD();
            return new zzget(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final byte[] zzao() {
        try {
            byte[] bArr = new byte[zzaw()];
            zzgfh zzgfhVarZzu = zzgfh.zzu(bArr);
            zzav(zzgfhVarZzu);
            zzgfhVarZzu.zzD();
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

    int zzap() {
        throw null;
    }

    void zzaq(int i) {
        throw null;
    }
}
