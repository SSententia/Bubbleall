package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfmg {
    private final zzflk zza;
    private final zzfmf zzb;

    private zzfmg(zzfmf zzfmfVar) {
        zzflj zzfljVar = zzflj.zza;
        this.zzb = zzfmfVar;
        this.zza = zzfljVar;
    }

    public static zzfmg zzb(zzflk zzflkVar) {
        return new zzfmg(new zzfma(zzflkVar));
    }

    public static zzfmg zzc(int i) {
        return new zzfmg(new zzfmc(4000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator<String> zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final List<String> zzf(CharSequence charSequence) {
        Iterator<String> itZzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZzg.hasNext()) {
            arrayList.add(itZzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterable<String> zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfmd(this, charSequence);
    }
}
