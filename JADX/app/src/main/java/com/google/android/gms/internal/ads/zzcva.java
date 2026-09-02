package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcva extends zzcxg {
    private final zzcml zzc;
    private final int zzd;
    private final Context zze;
    private final zzcui zzf;
    private final zzdkn zzg;
    private final zzdbp zzh;
    private boolean zzi;

    zzcva(zzcxf zzcxfVar, Context context, zzcml zzcmlVar, int i, zzcui zzcuiVar, zzdkn zzdknVar, zzdbp zzdbpVar) {
        super(zzcxfVar);
        this.zzi = false;
        this.zzc = zzcmlVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcuiVar;
        this.zzg = zzdknVar;
        this.zzh = zzdbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzT() {
        super.zzT();
        zzcml zzcmlVar = this.zzc;
        if (zzcmlVar != null) {
            zzcmlVar.destroy();
        }
    }

    public final void zza(zzaxq zzaxqVar) {
        zzcml zzcmlVar = this.zzc;
        if (zzcmlVar != null) {
            zzcmlVar.zzax(zzaxqVar);
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
    public final void zzb(Activity activity, zzayd zzaydVar, boolean z) throws RemoteException {
        Context context = activity;
        if (activity == null) {
            context = this.zze;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzar)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzJ(context)) {
                com.google.android.gms.ads.internal.util.zze.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzh.zzd();
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzas)).booleanValue()) {
                    new zzfit(context.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzq().zza()).zza(this.zza.zzb.zzb.zzb);
                    return;
                }
                return;
            }
        }
        if (this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zzi("App open interstitial ad is already visible.");
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgX)).booleanValue()) {
                this.zzh.zza(zzfbm.zzd(10, null, null));
            }
        }
        if (this.zzi) {
            return;
        }
        try {
            this.zzg.zza(z, context, this.zzh);
            this.zzi = true;
        } catch (zzdkm e) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgX)).booleanValue()) {
                this.zzh.zzb(e);
            } else {
                zzaydVar.zze(zzfbm.zza(e));
            }
        }
    }

    public final int zzc() {
        return this.zzd;
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
