package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdmm {
    private int zza;
    private zzbhc zzb;
    private zzblz zzc;
    private View zzd;
    private List<?> zze;
    private zzbhu zzg;
    private Bundle zzh;
    private zzcml zzi;
    private zzcml zzj;
    private zzcml zzk;
    private IObjectWrapper zzl;
    private View zzm;
    private View zzn;
    private IObjectWrapper zzo;
    private double zzp;
    private zzbmh zzq;
    private zzbmh zzr;
    private String zzs;
    private float zzv;
    private String zzw;
    private final SimpleArrayMap<String, zzblr> zzt = new SimpleArrayMap<>();
    private final SimpleArrayMap<String, String> zzu = new SimpleArrayMap<>();
    private List<zzbhu> zzf = Collections.emptyList();

    public static zzdmm zzaa(zzbvv zzbvvVar) {
        try {
            return zzaf(zzah(zzbvvVar.zzn(), zzbvvVar), zzbvvVar.zzo(), (View) zzag(zzbvvVar.zzp()), zzbvvVar.zze(), zzbvvVar.zzf(), zzbvvVar.zzg(), zzbvvVar.zzs(), zzbvvVar.zzi(), (View) zzag(zzbvvVar.zzq()), zzbvvVar.zzr(), zzbvvVar.zzl(), zzbvvVar.zzm(), zzbvvVar.zzk(), zzbvvVar.zzh(), zzbvvVar.zzj(), zzbvvVar.zzz());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public static zzdmm zzab(zzbvs zzbvsVar) {
        try {
            zzdml zzdmlVarZzah = zzah(zzbvsVar.zzs(), null);
            zzblz zzblzVarZzt = zzbvsVar.zzt();
            View view = (View) zzag(zzbvsVar.zzr());
            String strZze = zzbvsVar.zze();
            List<?> listZzf = zzbvsVar.zzf();
            String strZzg = zzbvsVar.zzg();
            Bundle bundleZzp = zzbvsVar.zzp();
            String strZzi = zzbvsVar.zzi();
            View view2 = (View) zzag(zzbvsVar.zzu());
            IObjectWrapper iObjectWrapperZzv = zzbvsVar.zzv();
            String strZzj = zzbvsVar.zzj();
            zzbmh zzbmhVarZzh = zzbvsVar.zzh();
            zzdmm zzdmmVar = new zzdmm();
            zzdmmVar.zza = 1;
            zzdmmVar.zzb = zzdmlVarZzah;
            zzdmmVar.zzc = zzblzVarZzt;
            zzdmmVar.zzd = view;
            zzdmmVar.zzq("headline", strZze);
            zzdmmVar.zze = listZzf;
            zzdmmVar.zzq("body", strZzg);
            zzdmmVar.zzh = bundleZzp;
            zzdmmVar.zzq("call_to_action", strZzi);
            zzdmmVar.zzm = view2;
            zzdmmVar.zzo = iObjectWrapperZzv;
            zzdmmVar.zzq("advertiser", strZzj);
            zzdmmVar.zzr = zzbmhVarZzh;
            return zzdmmVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdmm zzac(zzbvr zzbvrVar) {
        try {
            zzdml zzdmlVarZzah = zzah(zzbvrVar.zzt(), null);
            zzblz zzblzVarZzv = zzbvrVar.zzv();
            View view = (View) zzag(zzbvrVar.zzu());
            String strZze = zzbvrVar.zze();
            List<?> listZzf = zzbvrVar.zzf();
            String strZzg = zzbvrVar.zzg();
            Bundle bundleZzr = zzbvrVar.zzr();
            String strZzi = zzbvrVar.zzi();
            View view2 = (View) zzag(zzbvrVar.zzw());
            IObjectWrapper iObjectWrapperZzx = zzbvrVar.zzx();
            String strZzk = zzbvrVar.zzk();
            String strZzl = zzbvrVar.zzl();
            double dZzj = zzbvrVar.zzj();
            zzbmh zzbmhVarZzh = zzbvrVar.zzh();
            zzdmm zzdmmVar = new zzdmm();
            zzdmmVar.zza = 2;
            zzdmmVar.zzb = zzdmlVarZzah;
            zzdmmVar.zzc = zzblzVarZzv;
            zzdmmVar.zzd = view;
            zzdmmVar.zzq("headline", strZze);
            zzdmmVar.zze = listZzf;
            zzdmmVar.zzq("body", strZzg);
            zzdmmVar.zzh = bundleZzr;
            zzdmmVar.zzq("call_to_action", strZzi);
            zzdmmVar.zzm = view2;
            zzdmmVar.zzo = iObjectWrapperZzx;
            zzdmmVar.zzq("store", strZzk);
            zzdmmVar.zzq("price", strZzl);
            zzdmmVar.zzp = dZzj;
            zzdmmVar.zzq = zzbmhVarZzh;
            return zzdmmVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdmm zzad(zzbvr zzbvrVar) {
        try {
            return zzaf(zzah(zzbvrVar.zzt(), null), zzbvrVar.zzv(), (View) zzag(zzbvrVar.zzu()), zzbvrVar.zze(), zzbvrVar.zzf(), zzbvrVar.zzg(), zzbvrVar.zzr(), zzbvrVar.zzi(), (View) zzag(zzbvrVar.zzw()), zzbvrVar.zzx(), zzbvrVar.zzk(), zzbvrVar.zzl(), zzbvrVar.zzj(), zzbvrVar.zzh(), null, 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdmm zzae(zzbvs zzbvsVar) {
        try {
            return zzaf(zzah(zzbvsVar.zzs(), null), zzbvsVar.zzt(), (View) zzag(zzbvsVar.zzr()), zzbvsVar.zze(), zzbvsVar.zzf(), zzbvsVar.zzg(), zzbvsVar.zzp(), zzbvsVar.zzi(), (View) zzag(zzbvsVar.zzu()), zzbvsVar.zzv(), null, null, -1.0d, zzbvsVar.zzh(), zzbvsVar.zzj(), 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdmm zzaf(zzbhc zzbhcVar, zzblz zzblzVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbmh zzbmhVar, String str6, float f) {
        zzdmm zzdmmVar = new zzdmm();
        zzdmmVar.zza = 6;
        zzdmmVar.zzb = zzbhcVar;
        zzdmmVar.zzc = zzblzVar;
        zzdmmVar.zzd = view;
        zzdmmVar.zzq("headline", str);
        zzdmmVar.zze = list;
        zzdmmVar.zzq("body", str2);
        zzdmmVar.zzh = bundle;
        zzdmmVar.zzq("call_to_action", str3);
        zzdmmVar.zzm = view2;
        zzdmmVar.zzo = iObjectWrapper;
        zzdmmVar.zzq("store", str4);
        zzdmmVar.zzq("price", str5);
        zzdmmVar.zzp = d;
        zzdmmVar.zzq = zzbmhVar;
        zzdmmVar.zzq("advertiser", str6);
        zzdmmVar.zzs(f);
        return zzdmmVar;
    }

    private static <T> T zzag(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return (T) ObjectWrapper.unwrap(iObjectWrapper);
    }

    private static zzdml zzah(zzbhc zzbhcVar, zzbvv zzbvvVar) {
        if (zzbhcVar == null) {
            return null;
        }
        return new zzdml(zzbhcVar, zzbvvVar);
    }

    public final synchronized List<?> zzA() {
        return this.zze;
    }

    public final zzbmh zzB() {
        List<?> list = this.zze;
        if (list != null && list.size() != 0) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbmg.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized List<zzbhu> zzC() {
        return this.zzf;
    }

    public final synchronized zzbhu zzD() {
        return this.zzg;
    }

    public final synchronized String zzE() {
        return zzu("body");
    }

    public final synchronized Bundle zzF() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized String zzG() {
        return zzu("call_to_action");
    }

    public final synchronized View zzH() {
        return this.zzm;
    }

    public final synchronized View zzI() {
        return this.zzn;
    }

    public final synchronized IObjectWrapper zzJ() {
        return this.zzo;
    }

    public final synchronized String zzK() {
        return zzu("store");
    }

    public final synchronized String zzL() {
        return zzu("price");
    }

    public final synchronized double zzM() {
        return this.zzp;
    }

    public final synchronized zzbmh zzN() {
        return this.zzq;
    }

    public final synchronized String zzO() {
        return zzu("advertiser");
    }

    public final synchronized zzbmh zzP() {
        return this.zzr;
    }

    public final synchronized String zzQ() {
        return this.zzs;
    }

    public final synchronized zzcml zzR() {
        return this.zzi;
    }

    public final synchronized zzcml zzS() {
        return this.zzj;
    }

    public final synchronized zzcml zzT() {
        return this.zzk;
    }

    public final synchronized IObjectWrapper zzU() {
        return this.zzl;
    }

    public final synchronized SimpleArrayMap<String, zzblr> zzV() {
        return this.zzt;
    }

    public final synchronized float zzW() {
        return this.zzv;
    }

    public final synchronized String zzX() {
        return this.zzw;
    }

    public final synchronized SimpleArrayMap<String, String> zzY() {
        return this.zzu;
    }

    public final synchronized void zzZ() {
        zzcml zzcmlVar = this.zzi;
        if (zzcmlVar != null) {
            zzcmlVar.destroy();
            this.zzi = null;
        }
        zzcml zzcmlVar2 = this.zzj;
        if (zzcmlVar2 != null) {
            zzcmlVar2.destroy();
            this.zzj = null;
        }
        zzcml zzcmlVar3 = this.zzk;
        if (zzcmlVar3 != null) {
            zzcmlVar3.destroy();
            this.zzk = null;
        }
        this.zzl = null;
        this.zzt.clear();
        this.zzu.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzm = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
    }

    public final synchronized void zza(int i) {
        this.zza = i;
    }

    public final synchronized void zzb(zzbhc zzbhcVar) {
        this.zzb = zzbhcVar;
    }

    public final synchronized void zzc(zzblz zzblzVar) {
        this.zzc = zzblzVar;
    }

    public final synchronized void zzd(List<zzblr> list) {
        this.zze = list;
    }

    public final synchronized void zze(List<zzbhu> list) {
        this.zzf = list;
    }

    public final synchronized void zzf(zzbhu zzbhuVar) {
        this.zzg = zzbhuVar;
    }

    public final synchronized void zzg(View view) {
        this.zzm = view;
    }

    public final synchronized void zzh(View view) {
        this.zzn = view;
    }

    public final synchronized void zzi(double d) {
        this.zzp = d;
    }

    public final synchronized void zzj(zzbmh zzbmhVar) {
        this.zzq = zzbmhVar;
    }

    public final synchronized void zzk(zzbmh zzbmhVar) {
        this.zzr = zzbmhVar;
    }

    public final synchronized void zzl(String str) {
        this.zzs = str;
    }

    public final synchronized void zzm(zzcml zzcmlVar) {
        this.zzi = zzcmlVar;
    }

    public final synchronized void zzn(zzcml zzcmlVar) {
        this.zzj = zzcmlVar;
    }

    public final synchronized void zzo(zzcml zzcmlVar) {
        this.zzk = zzcmlVar;
    }

    public final synchronized void zzp(IObjectWrapper iObjectWrapper) {
        this.zzl = iObjectWrapper;
    }

    public final synchronized void zzq(String str, String str2) {
        try {
            if (str2 == null) {
                this.zzu.remove(str);
            } else {
                this.zzu.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzr(String str, zzblr zzblrVar) {
        try {
            if (zzblrVar == null) {
                this.zzt.remove(str);
            } else {
                this.zzt.put(str, zzblrVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzs(float f) {
        this.zzv = f;
    }

    public final synchronized void zzt(String str) {
        this.zzw = str;
    }

    public final synchronized String zzu(String str) {
        return this.zzu.get(str);
    }

    public final synchronized int zzv() {
        return this.zza;
    }

    public final synchronized zzbhc zzw() {
        return this.zzb;
    }

    public final synchronized zzblz zzx() {
        return this.zzc;
    }

    public final synchronized View zzy() {
        return this.zzd;
    }

    public final synchronized String zzz() {
        return zzu("headline");
    }
}
