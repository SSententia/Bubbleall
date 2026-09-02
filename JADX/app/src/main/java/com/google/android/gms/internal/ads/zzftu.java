package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzftu<KeyProtoT extends zzghi> {
    private final Class<KeyProtoT> zza;
    private final Map<Class<?>, zzftt<?, KeyProtoT>> zzb;
    private final Class<?> zzc;

    @SafeVarargs
    protected zzftu(Class<KeyProtoT> cls, zzftt<?, KeyProtoT>... zzfttVarArr) {
        this.zza = cls;
        HashMap map = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zzftt<?, KeyProtoT> zzfttVar = zzfttVarArr[i];
            if (map.containsKey(zzfttVar.zza())) {
                String strValueOf = String.valueOf(zzfttVar.zza().getCanonicalName());
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(strValueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            map.put(zzfttVar.zza(), zzfttVar);
        }
        this.zzc = zzfttVarArr[0].zza();
        this.zzb = Collections.unmodifiableMap(map);
    }

    public final Class<KeyProtoT> zza() {
        return this.zza;
    }

    public abstract String zzb();

    public abstract KeyProtoT zzc(zzgex zzgexVar) throws zzggm;

    public abstract void zzd(KeyProtoT keyprotot) throws GeneralSecurityException;

    public final <P> P zze(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        zzftt<?, KeyProtoT> zzfttVar = this.zzb.get(cls);
        if (zzfttVar != null) {
            return (P) zzfttVar.zzb(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final Set<Class<?>> zzf() {
        return this.zzb.keySet();
    }

    final Class<?> zzg() {
        return this.zzc;
    }

    public zzfts<?, KeyProtoT> zzh() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract int zzi();

    public int zzj() {
        return 1;
    }
}
