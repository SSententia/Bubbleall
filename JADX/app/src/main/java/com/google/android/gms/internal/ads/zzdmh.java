package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdmh extends zzcxg {
    private final Executor zzc;
    private final zzdmm zzd;
    private final zzdmu zze;
    private final zzdnl zzf;
    private final zzdmr zzg;
    private final zzdmx zzh;
    private final zzgku<zzdqm> zzi;
    private final zzgku<zzdqk> zzj;
    private final zzgku<zzdqr> zzk;
    private final zzgku<zzdqi> zzl;
    private final zzgku<zzdqp> zzm;
    private zzdog zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private final zzcei zzr;
    private final zzaas zzs;
    private final zzcgz zzt;
    private final Context zzu;
    private final zzdmj zzv;
    private final zzell zzw;
    private final Map<String, Boolean> zzx;
    private final List<zzawe> zzy;
    private final zzawf zzz;

    public zzdmh(zzcxf zzcxfVar, Executor executor, zzdmm zzdmmVar, zzdmu zzdmuVar, zzdnl zzdnlVar, zzdmr zzdmrVar, zzdmx zzdmxVar, zzgku<zzdqm> zzgkuVar, zzgku<zzdqk> zzgkuVar2, zzgku<zzdqr> zzgkuVar3, zzgku<zzdqi> zzgkuVar4, zzgku<zzdqp> zzgkuVar5, zzcei zzceiVar, zzaas zzaasVar, zzcgz zzcgzVar, Context context, zzdmj zzdmjVar, zzell zzellVar, zzawf zzawfVar) {
        super(zzcxfVar);
        this.zzc = executor;
        this.zzd = zzdmmVar;
        this.zze = zzdmuVar;
        this.zzf = zzdnlVar;
        this.zzg = zzdmrVar;
        this.zzh = zzdmxVar;
        this.zzi = zzgkuVar;
        this.zzj = zzgkuVar2;
        this.zzk = zzgkuVar3;
        this.zzl = zzgkuVar4;
        this.zzm = zzgkuVar5;
        this.zzr = zzceiVar;
        this.zzs = zzaasVar;
        this.zzt = zzcgzVar;
        this.zzu = context;
        this.zzv = zzdmjVar;
        this.zzw = zzellVar;
        this.zzx = new HashMap();
        this.zzy = new ArrayList();
        this.zzz = zzawfVar;
    }

    public static boolean zzC(View view) {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgS)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long jZzA = com.google.android.gms.ads.internal.util.zzs.zzA(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (jZzA >= ((Integer) zzbet.zzc().zzc(zzbjl.zzgT)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzQ, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzN(zzdog zzdogVar) {
        Iterator<String> itKeys;
        View view;
        zzaao zzaaoVarZzb;
        if (this.zzo) {
            return;
        }
        this.zzn = zzdogVar;
        this.zzf.zza(zzdogVar);
        this.zze.zzd(zzdogVar.zzbx(), zzdogVar.zzk(), zzdogVar.zzl(), zzdogVar, zzdogVar);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbK)).booleanValue() && (zzaaoVarZzb = this.zzs.zzb()) != null) {
            zzaaoVarZzb.zzn(zzdogVar.zzbx());
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbg)).booleanValue()) {
            zzezz zzezzVar = this.zzb;
            if (zzezzVar.zzah && (itKeys = zzezzVar.zzag.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    WeakReference<View> weakReference = this.zzn.zzj().get(next);
                    this.zzx.put(next, false);
                    if (weakReference != null && (view = weakReference.get()) != null) {
                        zzawe zzaweVar = new zzawe(this.zzu, view);
                        this.zzy.add(zzaweVar);
                        zzaweVar.zza(new zzdmg(this, next));
                    }
                }
            }
        }
        if (zzdogVar.zzh() != null) {
            zzdogVar.zzh().zza(this.zzr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
    public final void zzM(zzdog zzdogVar) {
        this.zze.zze(zzdogVar.zzbx(), zzdogVar.zzj());
        if (zzdogVar.zzbt() != null) {
            zzdogVar.zzbt().setClickable(false);
            zzdogVar.zzbt().removeAllViews();
        }
        if (zzdogVar.zzh() != null) {
            zzdogVar.zzh().zzb(this.zzr);
        }
        this.zzn = null;
    }

    public final synchronized void zzA() {
        zzdog zzdogVar = this.zzn;
        if (zzdogVar == null) {
            com.google.android.gms.ads.internal.util.zze.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdogVar instanceof zzdnf;
            this.zzc.execute(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.zzdmf
                private final zzdmh zza;
                private final boolean zzb;

                {
                    this.zza = this;
                    this.zzb = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzL(this.zzb);
                }
            });
        }
    }

    public final synchronized boolean zzB() {
        return this.zze.zzk();
    }

    public final boolean zzD() {
        return this.zzg.zzc();
    }

    public final String zzE() {
        return this.zzg.zzf();
    }

    public final void zzF(String str, boolean z) {
        String str2;
        zzbzl zzbzlVar;
        zzbzm zzbzmVar;
        if (!this.zzg.zzd() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcml zzcmlVarZzT = this.zzd.zzT();
        zzcml zzcmlVarZzR = this.zzd.zzR();
        if (zzcmlVarZzT == null && zzcmlVarZzR == null) {
            return;
        }
        if (zzcmlVarZzT != null) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzcmlVarZzT = zzcmlVarZzR;
        }
        String str3 = str2;
        if (!com.google.android.gms.ads.internal.zzt.zzr().zza(this.zzu)) {
            com.google.android.gms.ads.internal.util.zze.zzi("Failed to initialize omid in InternalNativeAd");
            return;
        }
        zzcgz zzcgzVar = this.zzt;
        int i = zzcgzVar.zzb;
        int i2 = zzcgzVar.zzc;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        String string = sb.toString();
        if (zzcmlVarZzR != null) {
            zzbzlVar = zzbzl.VIDEO;
            zzbzmVar = zzbzm.DEFINED_BY_JAVASCRIPT;
        } else {
            zzbzlVar = zzbzl.NATIVE_DISPLAY;
            zzbzmVar = this.zzd.zzv() == 3 ? zzbzm.UNSPECIFIED : zzbzm.ONE_PIXEL;
        }
        IObjectWrapper iObjectWrapperZze = com.google.android.gms.ads.internal.zzt.zzr().zze(string, zzcmlVarZzT.zzG(), "", "javascript", str3, str, zzbzmVar, zzbzlVar, this.zzb.zzai);
        if (iObjectWrapperZze == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Failed to create omid session in InternalNativeAd");
            return;
        }
        this.zzd.zzp(iObjectWrapperZze);
        zzcmlVarZzT.zzak(iObjectWrapperZze);
        if (zzcmlVarZzR != null) {
            com.google.android.gms.ads.internal.zzt.zzr().zzh(iObjectWrapperZze, zzcmlVarZzR.zzH());
            this.zzq = true;
        }
        if (z) {
            com.google.android.gms.ads.internal.zzt.zzr().zzf(iObjectWrapperZze);
            zzcmlVarZzT.zze("onSdkLoaded", new ArrayMap());
        }
    }

    public final boolean zzG() {
        return this.zzg.zzd();
    }

    public final void zzH(View view) {
        IObjectWrapper iObjectWrapperZzU = this.zzd.zzU();
        zzcml zzcmlVarZzT = this.zzd.zzT();
        if (!this.zzg.zzd() || iObjectWrapperZzU == null || zzcmlVarZzT == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzr().zzh(iObjectWrapperZzU, view);
    }

    public final void zzI(View view) {
        IObjectWrapper iObjectWrapperZzU = this.zzd.zzU();
        if (!this.zzg.zzd() || iObjectWrapperZzU == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzr().zzi(iObjectWrapperZzU, view);
    }

    public final zzdmj zzJ() {
        return this.zzv;
    }

    public final synchronized void zzK(zzbgw zzbgwVar) {
        this.zzw.zza(zzbgwVar);
    }

    final /* synthetic */ void zzL(boolean z) {
        this.zze.zzi(this.zzn.zzbx(), this.zzn.zzj(), this.zzn.zzk(), z);
    }

    final /* synthetic */ void zzO() {
        this.zze.zzA();
        this.zzd.zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzS() {
        this.zzc.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdma
            private final zzdmh zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzP();
            }
        });
        if (this.zzd.zzv() != 7) {
            Executor executor = this.zzc;
            zzdmu zzdmuVar = this.zze;
            zzdmuVar.getClass();
            executor.execute(zzdmb.zza(zzdmuVar));
        }
        super.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final synchronized void zzT() {
        this.zzo = true;
        this.zzc.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdmc
            private final zzdmh zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzO();
            }
        });
        super.zzT();
    }

    public final synchronized void zzc(String str) {
        this.zze.zzg(str);
    }

    public final synchronized void zze() {
        if (this.zzp) {
            return;
        }
        this.zze.zzq();
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zze.zzh(bundle);
    }

    public final synchronized boolean zzg(Bundle bundle) {
        if (this.zzp) {
            return true;
        }
        boolean zZzz = this.zze.zzz(bundle);
        this.zzp = zZzz;
        return zZzz;
    }

    public final synchronized void zzh(Bundle bundle) {
        this.zze.zzn(bundle);
    }

    public final synchronized void zzj(final zzdog zzdogVar) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbe)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this, zzdogVar) { // from class: com.google.android.gms.internal.ads.zzdmd
                private final zzdmh zza;
                private final zzdog zzb;

                {
                    this.zza = this;
                    this.zzb = zzdogVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzN(this.zzb);
                }
            });
        } else {
            zzN(zzdogVar);
        }
    }

    public final synchronized void zzk(final zzdog zzdogVar) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbe)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this, zzdogVar) { // from class: com.google.android.gms.internal.ads.zzdme
                private final zzdmh zza;
                private final zzdog zzb;

                {
                    this.zza = this;
                    this.zzb = zzdogVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzM(this.zzb);
                }
            });
        } else {
            zzM(zzdogVar);
        }
    }

    public final synchronized void zzp(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        this.zzf.zzb(this.zzn);
        this.zze.zzf(view, view2, map, map2, z);
        if (this.zzq && this.zzd.zzR() != null) {
            this.zzd.zzR().zze("onSdkAdUserInteractionClick", new ArrayMap());
        }
    }

    public final synchronized void zzq(View view, MotionEvent motionEvent, View view2) {
        this.zze.zzm(view, motionEvent, view2);
    }

    public final synchronized void zzr(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.zzp) {
            return;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbg)).booleanValue() && this.zzb.zzah) {
            Iterator<String> it = this.zzx.keySet().iterator();
            while (it.hasNext()) {
                if (!this.zzx.get(it.next()).booleanValue()) {
                    return;
                }
            }
        }
        if (z) {
            this.zzf.zzc(this.zzn);
            this.zze.zzx(view, map, map2);
            this.zzp = true;
            return;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzcq)).booleanValue() && map != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                View view2 = it2.next().getValue().get();
                if (view2 != null && zzC(view2)) {
                    this.zzf.zzc(this.zzn);
                    this.zze.zzx(view, map, map2);
                    this.zzp = true;
                    return;
                }
            }
        }
    }

    public final synchronized JSONObject zzs(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.zze.zzo(view, map, map2);
    }

    public final synchronized JSONObject zzt(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.zze.zzp(view, map, map2);
    }

    public final synchronized void zzu(View view) {
        this.zze.zzr(view);
    }

    public final synchronized void zzv(zzbob zzbobVar) {
        this.zze.zzs(zzbobVar);
    }

    public final synchronized void zzw() {
        this.zze.zzt();
    }

    public final synchronized void zzx(zzbgm zzbgmVar) {
        this.zze.zzu(zzbgmVar);
    }

    public final synchronized void zzy(zzbgi zzbgiVar) {
        this.zze.zzv(zzbgiVar);
    }

    public final synchronized void zzz() {
        this.zze.zzj();
    }

    final /* bridge */ /* synthetic */ void zzP() {
        try {
            int iZzv = this.zzd.zzv();
            if (iZzv == 1) {
                if (this.zzh.zza() != null) {
                    zzF("Google", true);
                    this.zzh.zza().zze(this.zzi.zzb());
                    return;
                }
                return;
            }
            if (iZzv == 2) {
                if (this.zzh.zzb() != null) {
                    zzF("Google", true);
                    this.zzh.zzb().zze(this.zzj.zzb());
                    return;
                }
                return;
            }
            if (iZzv == 3) {
                if (this.zzh.zzf(this.zzd.zzQ()) != null) {
                    if (this.zzd.zzR() != null) {
                        zzF("Google", true);
                    }
                    this.zzh.zzf(this.zzd.zzQ()).zze(this.zzm.zzb());
                    return;
                }
                return;
            }
            if (iZzv == 6) {
                if (this.zzh.zzc() != null) {
                    zzF("Google", true);
                    this.zzh.zzc().zze(this.zzk.zzb());
                    return;
                }
                return;
            }
            if (iZzv != 7) {
                com.google.android.gms.ads.internal.util.zze.zzf("Wrong native template id!");
            } else if (this.zzh.zze() != null) {
                this.zzh.zze().zze(this.zzl.zzb());
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("RemoteException when notifyAdLoad is called", e);
        }
    }
}
