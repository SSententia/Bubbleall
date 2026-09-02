package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdji extends zzcxg {
    private final Context zzc;
    private final WeakReference<zzcml> zzd;
    private final zzdhy zze;
    private final zzdkn zzf;
    private final zzcya zzg;
    private final zzfit zzh;
    private final zzdbp zzi;
    private boolean zzj;

    zzdji(zzcxf zzcxfVar, Context context, @Nullable zzcml zzcmlVar, zzdhy zzdhyVar, zzdkn zzdknVar, zzcya zzcyaVar, zzfit zzfitVar, zzdbp zzdbpVar) {
        super(zzcxfVar);
        this.zzj = false;
        this.zzc = context;
        this.zzd = new WeakReference<>(zzcmlVar);
        this.zze = zzdhyVar;
        this.zzf = zzdknVar;
        this.zzg = zzcyaVar;
        this.zzh = zzfitVar;
        this.zzi = zzdbpVar;
    }

    public final void finalize() throws Throwable {
        try {
            zzcml zzcmlVar = this.zzd.get();
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeZ)).booleanValue()) {
                if (!this.zzj && zzcmlVar != null) {
                    zzchg.zze.execute(zzdjh.zza(zzcmlVar));
                }
            } else if (zzcmlVar != null) {
                zzcmlVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0073  */
    /* JADX WARN: Code duplicated, block: B:18:0x007a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0048  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zza(boolean z, @Nullable Activity activity) {
        Context context;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzar)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc)) {
                com.google.android.gms.ads.internal.util.zze.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzd();
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzas)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
            } else {
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgX)).booleanValue() && this.zzj) {
                    com.google.android.gms.ads.internal.util.zze.zzi("The interstitial ad has been showed.");
                    this.zzi.zza(zzfbm.zzd(10, null, null));
                }
                if (!this.zzj) {
                    this.zze.zza();
                    if (activity == null) {
                        context = activity;
                        context = this.zzc;
                    }
                    try {
                        context = activity;
                        this.zzf.zza(z, context, this.zzi);
                        this.zze.zzb();
                        this.zzj = true;
                        return true;
                    } catch (zzdkm e) {
                        this.zzi.zzb(e);
                    }
                }
            }
        } else {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgX)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zzi("The interstitial ad has been showed.");
                this.zzi.zza(zzfbm.zzd(10, null, null));
            }
            if (!this.zzj) {
                this.zze.zza();
                if (activity == null) {
                    context = activity;
                    context = this.zzc;
                }
                context = activity;
                this.zzf.zza(z, context, this.zzi);
                this.zze.zzb();
                this.zzj = true;
                return true;
            }
        }
        return false;
    }

    public final boolean zzb() {
        return this.zzg.zzg();
    }
}
