package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdrw extends zzcxg {
    private final Context zzc;
    private final WeakReference<zzcml> zzd;
    private final zzdkn zze;
    private final zzdhy zzf;
    private final zzdbp zzg;
    private final zzdcw zzh;
    private final zzcya zzi;
    private final zzccp zzj;
    private final zzfit zzk;
    private boolean zzl;

    zzdrw(zzcxf zzcxfVar, Context context, zzcml zzcmlVar, zzdkn zzdknVar, zzdhy zzdhyVar, zzdbp zzdbpVar, zzdcw zzdcwVar, zzcya zzcyaVar, zzezz zzezzVar, zzfit zzfitVar) {
        super(zzcxfVar);
        this.zzl = false;
        this.zzc = context;
        this.zze = zzdknVar;
        this.zzd = new WeakReference<>(zzcmlVar);
        this.zzf = zzdhyVar;
        this.zzg = zzdbpVar;
        this.zzh = zzdcwVar;
        this.zzi = zzcyaVar;
        this.zzk = zzfitVar;
        zzccl zzcclVar = zzezzVar.zzm;
        this.zzj = new zzcdj(zzcclVar != null ? zzcclVar.zza : "", zzcclVar != null ? zzcclVar.zzb : 1);
    }

    public final void finalize() throws Throwable {
        try {
            zzcml zzcmlVar = this.zzd.get();
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeZ)).booleanValue()) {
                if (!this.zzl && zzcmlVar != null) {
                    zzchg.zze.execute(zzdrv.zza(zzcmlVar));
                }
            } else if (zzcmlVar != null) {
                zzcmlVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

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
    public final boolean zza(boolean z, Activity activity) {
        Context context;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzar)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc)) {
                com.google.android.gms.ads.internal.util.zze.zzi("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzd();
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzas)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzl) {
            com.google.android.gms.ads.internal.util.zze.zzi("The rewarded ad have been showed.");
            this.zzg.zza(zzfbm.zzd(10, null, null));
            return false;
        }
        this.zzl = true;
        this.zzf.zza();
        if (activity == null) {
            context = activity;
            context = this.zzc;
        }
        try {
            context = activity;
            this.zze.zza(z, context, this.zzg);
            this.zzf.zzb();
            return true;
        } catch (zzdkm e) {
            this.zzg.zzb(e);
            return false;
        }
    }

    public final boolean zzb() {
        return this.zzl;
    }

    public final zzccp zzc() {
        return this.zzj;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        zzcml zzcmlVar = this.zzd.get();
        return (zzcmlVar == null || zzcmlVar.zzaA()) ? false : true;
    }

    public final Bundle zzg() {
        return this.zzh.zzb();
    }
}
