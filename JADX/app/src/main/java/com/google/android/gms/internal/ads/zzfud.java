package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfud<P> {
    private final ConcurrentMap<zzfuc, List<zzfua<P>>> zza = new ConcurrentHashMap();
    private zzfua<P> zzb;
    private final Class<P> zzc;

    private zzfud(Class<P> cls) {
        this.zzc = cls;
    }

    public static <P> zzfud<P> zzb(Class<P> cls) {
        return new zzfud<>(cls);
    }

    public final zzfua<P> zza() {
        return this.zzb;
    }

    public final void zzc(zzfua<P> zzfuaVar) {
        if (zzfuaVar.zzc() != 3) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        List<zzfua<P>> listEmptyList = this.zza.get(new zzfuc(zzfuaVar.zzb(), null));
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        if (listEmptyList.isEmpty()) {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        this.zzb = zzfuaVar;
    }

    public final zzfua<P> zzd(P p, zzgbb zzgbbVar) throws GeneralSecurityException {
        byte[] bArrArray;
        if (zzgbbVar.zzf() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int iZzg = zzgbbVar.zzg() - 2;
        if (iZzg == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgbbVar.zzd()).array();
        } else if (iZzg == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgbbVar.zzd()).array();
        } else if (iZzg != 3) {
            if (iZzg != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgbbVar.zzd()).array();
        } else {
            bArrArray = zzfti.zza;
        }
        zzfua<P> zzfuaVar = new zzfua<>(p, bArrArray, zzgbbVar.zzf(), zzgbbVar.zzg(), zzgbbVar.zzd());
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzfuaVar);
        zzfuc zzfucVar = new zzfuc(zzfuaVar.zzb(), null);
        List<zzfua<P>> listPut = this.zza.put(zzfucVar, Collections.unmodifiableList(arrayList));
        if (listPut != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listPut);
            arrayList2.add(zzfuaVar);
            this.zza.put(zzfucVar, Collections.unmodifiableList(arrayList2));
        }
        return zzfuaVar;
    }

    public final Class<P> zze() {
        return this.zzc;
    }
}
