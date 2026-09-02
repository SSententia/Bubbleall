package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzio implements zzji {
    private static final zziu zzb = new zzim();
    private final zziu zza;

    public zzio() {
        zziu zziuVar;
        zziu[] zziuVarArr = new zziu[2];
        zziuVarArr[0] = zzhm.zza();
        try {
            zziuVar = (zziu) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zziuVar = zzb;
        }
        zziuVarArr[1] = zziuVar;
        zzin zzinVar = new zzin(zziuVarArr);
        zzhz.zzb(zzinVar, "messageInfoFactory");
        this.zza = zzinVar;
    }

    private static boolean zzb(zzit zzitVar) {
        return zzitVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzji
    public final <T> zzjh<T> zza(Class<T> cls) {
        zzjj.zza(cls);
        zzit zzitVarZzc = this.zza.zzc(cls);
        if (zzitVarZzc.zza()) {
            return zzhr.class.isAssignableFrom(cls) ? zzja.zzf(zzjj.zzC(), zzhg.zza(), zzitVarZzc.zzb()) : zzja.zzf(zzjj.zzA(), zzhg.zzb(), zzitVarZzc.zzb());
        }
        if (zzhr.class.isAssignableFrom(cls)) {
            return zzb(zzitVarZzc) ? zziz.zzk(cls, zzitVarZzc, zzjc.zzb(), zzik.zzd(), zzjj.zzC(), zzhg.zza(), zzis.zzb()) : zziz.zzk(cls, zzitVarZzc, zzjc.zzb(), zzik.zzd(), zzjj.zzC(), null, zzis.zzb());
        }
        return zzb(zzitVarZzc) ? zziz.zzk(cls, zzitVarZzc, zzjc.zza(), zzik.zzc(), zzjj.zzA(), zzhg.zzb(), zzis.zza()) : zziz.zzk(cls, zzitVarZzc, zzjc.zza(), zzik.zzc(), zzjj.zzB(), null, zzis.zza());
    }
}
