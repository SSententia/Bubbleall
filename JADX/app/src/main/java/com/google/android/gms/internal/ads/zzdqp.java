package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdqp extends zzbna {
    private final Context zza;
    private final zzdmm zzb;
    private zzdnl zzc;
    private zzdmh zzd;

    public zzdqp(Context context, zzdmm zzdmmVar, zzdnl zzdnlVar, zzdmh zzdmhVar) {
        this.zza = context;
        this.zzb = zzdmmVar;
        this.zzc = zzdnlVar;
        this.zzd = zzdmhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final String zze(String str) {
        return this.zzb.zzY().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final zzbmh zzf(String str) {
        return this.zzb.zzV().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final List<String> zzg() {
        SimpleArrayMap<String, zzblr> simpleArrayMapZzV = this.zzb.zzV();
        SimpleArrayMap<String, String> simpleArrayMapZzY = this.zzb.zzY();
        String[] strArr = new String[simpleArrayMapZzV.size() + simpleArrayMapZzY.size()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < simpleArrayMapZzV.size()) {
            strArr[i3] = simpleArrayMapZzV.keyAt(i2);
            i2++;
            i3++;
        }
        while (i < simpleArrayMapZzY.size()) {
            strArr[i3] = simpleArrayMapZzY.keyAt(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final String zzh() {
        return this.zzb.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzi(String str) {
        zzdmh zzdmhVar = this.zzd;
        if (zzdmhVar != null) {
            zzdmhVar.zzc(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzj() {
        zzdmh zzdmhVar = this.zzd;
        if (zzdmhVar != null) {
            zzdmhVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final zzbhc zzk() {
        return this.zzb.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzl() {
        zzdmh zzdmhVar = this.zzd;
        if (zzdmhVar != null) {
            zzdmhVar.zzT();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final IObjectWrapper zzm() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final boolean zzn(IObjectWrapper iObjectWrapper) {
        zzdnl zzdnlVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdnlVar = this.zzc) == null || !zzdnlVar.zzd((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzR().zzap(new zzdqo(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final boolean zzo() {
        zzdmh zzdmhVar = this.zzd;
        return (zzdmhVar == null || zzdmhVar.zzG()) && this.zzb.zzT() != null && this.zzb.zzR() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final boolean zzp() {
        IObjectWrapper iObjectWrapperZzU = this.zzb.zzU();
        if (iObjectWrapperZzU == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzr().zzf(iObjectWrapperZzU);
        if (this.zzb.zzT() == null) {
            return true;
        }
        this.zzb.zzT().zze("onSdkLoaded", new ArrayMap());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzq(IObjectWrapper iObjectWrapper) {
        zzdmh zzdmhVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof View) || this.zzb.zzU() == null || (zzdmhVar = this.zzd) == null) {
            return;
        }
        zzdmhVar.zzH((View) objUnwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzr() {
        String strZzX = this.zzb.zzX();
        if ("Google".equals(strZzX)) {
            com.google.android.gms.ads.internal.util.zze.zzi("Illegal argument specified for omid partner name.");
            return;
        }
        if (TextUtils.isEmpty(strZzX)) {
            com.google.android.gms.ads.internal.util.zze.zzi("Not starting OMID session. OM partner name has not been configured.");
            return;
        }
        zzdmh zzdmhVar = this.zzd;
        if (zzdmhVar != null) {
            zzdmhVar.zzF(strZzX, false);
        }
    }
}
