package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgha implements zzgia {
    private static final zzghg zzb = new zzggy();
    private final zzghg zza;

    public zzgha() {
        zzghg zzghgVar;
        zzghg[] zzghgVarArr = new zzghg[2];
        zzghgVarArr[0] = zzgfv.zza();
        try {
            zzghgVar = (zzghg) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzghgVar = zzb;
        }
        zzghgVarArr[1] = zzghgVar;
        zzggz zzggzVar = new zzggz(zzghgVarArr);
        zzggk.zzb(zzggzVar, "messageInfoFactory");
        this.zza = zzggzVar;
    }

    private static boolean zzb(zzghf zzghfVar) {
        return zzghfVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final <T> zzghz<T> zza(Class<T> cls) {
        zzgib.zza(cls);
        zzghf zzghfVarZzc = this.zza.zzc(cls);
        if (zzghfVarZzc.zza()) {
            return zzgga.class.isAssignableFrom(cls) ? zzghm.zzg(zzgib.zzC(), zzgfp.zza(), zzghfVarZzc.zzb()) : zzghm.zzg(zzgib.zzA(), zzgfp.zzb(), zzghfVarZzc.zzb());
        }
        if (zzgga.class.isAssignableFrom(cls)) {
            return zzb(zzghfVarZzc) ? zzghl.zzl(cls, zzghfVarZzc, zzgho.zzb(), zzggw.zze(), zzgib.zzC(), zzgfp.zza(), zzghe.zzb()) : zzghl.zzl(cls, zzghfVarZzc, zzgho.zzb(), zzggw.zze(), zzgib.zzC(), null, zzghe.zzb());
        }
        return zzb(zzghfVarZzc) ? zzghl.zzl(cls, zzghfVarZzc, zzgho.zza(), zzggw.zzd(), zzgib.zzA(), zzgfp.zzb(), zzghe.zza()) : zzghl.zzl(cls, zzghfVarZzc, zzgho.zza(), zzggw.zzd(), zzgib.zzB(), null, zzghe.zza());
    }
}
