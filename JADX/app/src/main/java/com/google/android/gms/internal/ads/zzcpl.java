package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcpl extends zzesq {
    private final zzetx zza;
    private final zzcqu zzb;
    private final zzcpl zzc = this;
    private final zzgln<Integer> zzd;
    private final zzgln<zzesn> zze;
    private final zzgln<String> zzf;
    private final zzgln<zzesw> zzg;
    private final zzgln<zzetc> zzh;
    private final zzgln<zzetg> zzi;
    private final zzgln<zzetn> zzj;
    private final zzgln<zzetu> zzk;
    private final zzgln<zzeum> zzl;
    private final zzgln<Boolean> zzm;
    private final zzgln<zzeui> zzn;
    private final zzgln<String> zzo;
    private final zzgln<zzduq> zzp;
    private final zzgln<zzduq> zzq;
    private final zzgln<zzduq> zzr;
    private final zzgln<zzduq> zzs;
    private final zzgln<Map<zzfem, zzduq>> zzt;
    private final zzgln<Set<zzdih<zzfet>>> zzu;
    private final zzgln<Set<zzdih<zzfet>>> zzv;
    private final zzgln zzw;
    private final zzgln<zzfes> zzx;

    /* synthetic */ zzcpl(zzcqu zzcquVar, zzetx zzetxVar, zzcql zzcqlVar) {
        this.zzb = zzcquVar;
        this.zza = zzetxVar;
        zzetz zzetzVar = new zzetz(zzetxVar);
        this.zzd = zzetzVar;
        this.zze = new zzesp(zzcru.zza, zzcquVar.zzh, zzcquVar.zzn, zzfdo.zza(), zzetzVar);
        zzety zzetyVar = new zzety(zzetxVar);
        this.zzf = zzetyVar;
        this.zzg = new zzesy(zzcoz.zza, zzcquVar.zzh, zzetyVar, zzfdo.zza());
        this.zzh = new zzete(zzcru.zza, zzetzVar, zzcquVar.zzh, zzcquVar.zzY, zzcquVar.zzn, zzfdo.zza(), zzetyVar);
        this.zzi = new zzeti(zzcro.zza, zzfdo.zza(), zzcquVar.zzh);
        this.zzj = new zzetp(zzcrq.zza, zzfdo.zza(), zzetyVar);
        this.zzk = new zzetw(zzcrs.zza, zzcquVar.zzn, zzcquVar.zzh);
        this.zzl = new zzeuo(zzfdo.zza());
        zzeua zzeuaVar = new zzeua(zzetxVar);
        this.zzm = zzeuaVar;
        this.zzn = new zzeuk(zzcquVar.zzY, zzeuaVar, zzcrw.zza, zzfdo.zza(), zzetyVar, zzcquVar.zzn);
        zzeub zzeubVar = new zzeub(zzetxVar);
        this.zzo = zzeubVar;
        zzgln<zzduq> zzglnVarZza = zzgkz.zza(zzduj.zza());
        this.zzp = zzglnVarZza;
        zzgln<zzduq> zzglnVarZza2 = zzgkz.zza(zzduh.zza());
        this.zzq = zzglnVarZza2;
        zzgln<zzduq> zzglnVarZza3 = zzgkz.zza(zzdul.zza());
        this.zzr = zzglnVarZza3;
        zzgln<zzduq> zzglnVarZza4 = zzgkz.zza(zzdun.zza());
        this.zzs = zzglnVarZza4;
        zzgld zzgldVarZzc = zzgle.zzc(4);
        zzgldVarZzc.zzb(zzfem.GMS_SIGNALS, zzglnVarZza);
        zzgldVarZzc.zzb(zzfem.BUILD_URL, zzglnVarZza2);
        zzgldVarZzc.zzb(zzfem.HTTP, zzglnVarZza3);
        zzgldVarZzc.zzb(zzfem.PRE_PROCESS, zzglnVarZza4);
        zzgle zzgleVarZzc = zzgldVarZzc.zzc();
        this.zzt = zzgleVarZzc;
        zzgln<Set<zzdih<zzfet>>> zzglnVarZza5 = zzgkz.zza(new zzduo(zzeubVar, zzcquVar.zzh, zzfdo.zza(), zzgleVarZzc));
        this.zzu = zzglnVarZza5;
        zzglk zzglkVarZza = zzgll.zza(0, 1);
        zzglkVarZza.zzb(zzglnVarZza5);
        zzgll zzgllVarZzc = zzglkVarZza.zzc();
        this.zzv = zzgllVarZzc;
        zzfev zzfevVar = new zzfev(zzgllVarZzc);
        this.zzw = zzfevVar;
        this.zzx = zzgkz.zza(new zzfeu(zzfdo.zza(), zzcquVar.zzn, zzfevVar));
    }

    private final zzetr zzd() {
        zzbiw zzbiwVar = new zzbiw();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        List<String> listZzd = this.zza.zzd();
        zzgli.zzb(listZzd);
        return new zzetr(zzbiwVar, zzfsnVar, listZzd, null);
    }

    private final zzest zze() {
        zzcfw zzcfwVar = new zzcfw();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        String strZzb = this.zza.zzb();
        zzgli.zzb(strZzb);
        return new zzest(zzcfwVar, zzfsnVar, strZzb, this.zza.zzc(), this.zza.zzf(), null);
    }

    @Override // com.google.android.gms.internal.ads.zzesq
    public final zzesb<JSONObject> zza() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        zzcft zzcftVar = new zzcft();
        zzfsn zzfsnVar2 = zzchg.zza;
        zzgli.zzb(zzfsnVar2);
        String strZza = this.zza.zza();
        zzgli.zzb(strZza);
        zzeqi zzeqiVar = new zzeqi(new zzetn(zzcftVar, zzfsnVar2, strZza, null), 0L, (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzbzu zzbzuVar = new zzbzu();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzn.zzb();
        Context contextZza = this.zzb.zza.zza();
        zzgli.zzb(contextZza);
        zzeqi zzeqiVar2 = new zzeqi(new zzetu(zzbzuVar, scheduledExecutorService, contextZza, null), ((Long) zzbet.zzc().zzc(zzbjl.zzcy)).longValue(), (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzcfw zzcfwVar = new zzcfw();
        Context contextZza2 = this.zzb.zza.zza();
        zzgli.zzb(contextZza2);
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.zzb.zzn.zzb();
        zzfsn zzfsnVar3 = zzchg.zza;
        zzgli.zzb(zzfsnVar3);
        zzeqi zzeqiVar3 = new zzeqi(new zzesn(zzcfwVar, contextZza2, scheduledExecutorService2, zzfsnVar3, this.zza.zzf(), null), 0L, (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzfsn zzfsnVar4 = zzchg.zza;
        zzgli.zzb(zzfsnVar4);
        zzeqi zzeqiVar4 = new zzeqi(new zzeum(zzfsnVar4), 0L, (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzery<? extends zzerx<JSONObject>> zzeryVarZza = zzeue.zza();
        Context contextZza3 = this.zzb.zza.zza();
        zzgli.zzb(contextZza3);
        String strZza2 = this.zza.zza();
        zzgli.zzb(strZza2);
        zzfsn zzfsnVar5 = zzchg.zza;
        zzgli.zzb(zzfsnVar5);
        zzesw zzeswVar = new zzesw(null, contextZza3, strZza2, zzfsnVar5);
        zzayq zzayqVar = new zzayq();
        zzfsn zzfsnVar6 = zzchg.zza;
        zzgli.zzb(zzfsnVar6);
        Context contextZza4 = this.zzb.zza.zza();
        zzgli.zzb(contextZza4);
        zzcfw zzcfwVar2 = new zzcfw();
        int iZzf = this.zza.zzf();
        Context contextZza5 = this.zzb.zza.zza();
        zzgli.zzb(contextZza5);
        zzcge zzcgeVar = (zzcge) this.zzb.zzY.zzb();
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.zzb.zzn.zzb();
        zzfsn zzfsnVar7 = zzchg.zza;
        zzgli.zzb(zzfsnVar7);
        String strZza3 = this.zza.zza();
        zzgli.zzb(strZza3);
        return new zzesb<>(zzfsnVar, zzfot.zzi(zzeqiVar, zzeqiVar2, zzeqiVar3, zzeqiVar4, zzeryVarZza, zzeswVar, new zzetg(zzayqVar, zzfsnVar6, contextZza4, null), zzd(), zze(), new zzetc(zzcfwVar2, iZzf, contextZza5, zzcgeVar, scheduledExecutorService3, zzfsnVar7, strZza3, null), (zzery) this.zzb.zzaw.zzb()));
    }

    @Override // com.google.android.gms.internal.ads.zzesq
    public final zzesb<JSONObject> zzb() {
        zzcft zzcftVar = new zzcft();
        zzcfu zzcfuVar = new zzcfu();
        Object objZzb = this.zzb.zzaw.zzb();
        zzest zzestVarZze = zze();
        zzetr zzetrVarZzd = zzd();
        zzgku zzgkuVarZzc = zzgkz.zzc(this.zze);
        zzgku zzgkuVarZzc2 = zzgkz.zzc(this.zzg);
        zzgku zzgkuVarZzc3 = zzgkz.zzc(this.zzh);
        zzgku zzgkuVarZzc4 = zzgkz.zzc(this.zzi);
        zzgku zzgkuVarZzc5 = zzgkz.zzc(this.zzj);
        zzgku zzgkuVarZzc6 = zzgkz.zzc(this.zzk);
        zzgku zzgkuVarZzc7 = zzgkz.zzc(this.zzl);
        zzgku zzgkuVarZzc8 = zzgkz.zzc(this.zzn);
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return zzeuf.zza(zzcftVar, zzcfuVar, objZzb, zzestVarZze, zzetrVarZzd, zzgkuVarZzc, zzgkuVarZzc2, zzgkuVarZzc3, zzgkuVarZzc4, zzgkuVarZzc5, zzgkuVarZzc6, zzgkuVarZzc7, zzgkuVarZzc8, zzfsnVar, (ScheduledExecutorService) this.zzb.zzn.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzesq
    public final zzfes zzc() {
        return this.zzx.zzb();
    }
}
