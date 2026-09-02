package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbte implements zzbpr<zzbtt> {
    final /* synthetic */ zzbsn zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzcd zzb;
    final /* synthetic */ zzbts zzc;

    zzbte(zzbts zzbtsVar, zzaas zzaasVar, zzbsn zzbsnVar, com.google.android.gms.ads.internal.util.zzcd zzcdVar) {
        this.zzc = zzbtsVar;
        this.zza = zzbsnVar;
        this.zzb = zzcdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbpr, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzbtt zzbttVar, Map map) {
        synchronized (this.zzc.zza) {
            com.google.android.gms.ads.internal.util.zze.zzh("JS Engine is requesting an update");
            if (this.zzc.zzh == 0) {
                com.google.android.gms.ads.internal.util.zze.zzh("Starting reload.");
                this.zzc.zzh = 2;
                this.zzc.zzf(null);
            }
            this.zza.zzm("/requestReload", this.zzb.zza());
        }
    }
}
