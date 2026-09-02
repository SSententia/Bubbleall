package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzdoj implements zzdmu {
    private final zzbvv zza;
    private final zzdbu zzb;
    private final zzdba zzc;
    private final zzdim zzd;
    private final Context zze;
    private final zzezz zzf;
    private final zzcgz zzg;
    private final zzfar zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbvr zzl;
    private final zzbvs zzm;

    public zzdoj(zzbvr zzbvrVar, zzbvs zzbvsVar, zzbvv zzbvvVar, zzdbu zzdbuVar, zzdba zzdbaVar, zzdim zzdimVar, Context context, zzezz zzezzVar, zzcgz zzcgzVar, zzfar zzfarVar, byte[] bArr) {
        this.zzl = zzbvrVar;
        this.zzm = zzbvsVar;
        this.zza = zzbvvVar;
        this.zzb = zzdbuVar;
        this.zzc = zzdbaVar;
        this.zzd = zzdimVar;
        this.zze = context;
        this.zzf = zzezzVar;
        this.zzg = zzcgzVar;
        this.zzh = zzfarVar;
    }

    private final void zza(View view) {
        try {
            zzbvv zzbvvVar = this.zza;
            if (zzbvvVar != null && !zzbvvVar.zzu()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzhb)).booleanValue()) {
                    this.zzd.zzb();
                    return;
                }
                return;
            }
            zzbvr zzbvrVar = this.zzl;
            if (zzbvrVar != null && !zzbvrVar.zzq()) {
                this.zzl.zzn(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzhb)).booleanValue()) {
                    this.zzd.zzb();
                    return;
                }
                return;
            }
            zzbvs zzbvsVar = this.zzm;
            if (zzbvsVar == null || zzbvsVar.zzo()) {
                return;
            }
            this.zzm.zzl(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzhb)).booleanValue()) {
                this.zzd.zzb();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to call handleClick", e);
        }
    }

    private static final HashMap<String, View> zzb(Map<String, WeakReference<View>> map) {
        HashMap<String, View> map2 = new HashMap<>();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view = entry.getValue().get();
                if (view != null) {
                    map2.put(entry.getKey(), view);
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzA() {
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cc A[Catch: JSONException -> 0x0044, RemoteException -> 0x0122, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0044, blocks: (B:47:0x00b1, B:48:0x00c6, B:50:0x00cc), top: B:72:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzd(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ClassLoader classLoader;
        Iterator it;
        IObjectWrapper iObjectWrapperZzq;
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzag;
            boolean z = true;
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbb)).booleanValue() && jSONObject.length() != 0) {
                Map<String, WeakReference<View>> map3 = map == null ? new HashMap<>() : map;
                Map<String, WeakReference<View>> map4 = map2 == null ? new HashMap<>() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbc)).booleanValue() && next.equals("3010")) {
                                zzbvv zzbvvVar = this.zza;
                                Object objUnwrap = null;
                                if (zzbvvVar != null) {
                                    try {
                                        iObjectWrapperZzq = zzbvvVar.zzq();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbvr zzbvrVar = this.zzl;
                                    if (zzbvrVar != null) {
                                        iObjectWrapperZzq = zzbvrVar.zzw();
                                    } else {
                                        zzbvs zzbvsVar = this.zzm;
                                        iObjectWrapperZzq = zzbvsVar != null ? zzbvsVar.zzu() : null;
                                    }
                                }
                                if (iObjectWrapperZzq != null) {
                                    objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzq);
                                }
                                if (objUnwrap != null) {
                                    cls = objUnwrap.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbx.zza(jSONArrayOptJSONArray, arrayList);
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    classLoader = this.zze.getClassLoader();
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbx.zza(jSONArrayOptJSONArray, arrayList2);
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    classLoader = this.zze.getClassLoader();
                                    it = arrayList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzk = z;
            HashMap<String, View> mapZzb = zzb(map);
            HashMap<String, View> mapZzb2 = zzb(map2);
            zzbvv zzbvvVar2 = this.zza;
            if (zzbvvVar2 != null) {
                zzbvvVar2.zzx(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzb), ObjectWrapper.wrap(mapZzb2));
                return;
            }
            zzbvr zzbvrVar2 = this.zzl;
            if (zzbvrVar2 != null) {
                zzbvrVar2.zzy(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzb), ObjectWrapper.wrap(mapZzb2));
                this.zzl.zzo(iObjectWrapperWrap);
                return;
            }
            zzbvs zzbvsVar2 = this.zzm;
            if (zzbvsVar2 != null) {
                zzbvsVar2.zzw(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzb), ObjectWrapper.wrap(mapZzb2));
                this.zzm.zzm(iObjectWrapperWrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zze(View view, Map<String, WeakReference<View>> map) {
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            zzbvv zzbvvVar = this.zza;
            if (zzbvvVar != null) {
                zzbvvVar.zzy(iObjectWrapperWrap);
                return;
            }
            zzbvr zzbvrVar = this.zzl;
            if (zzbvrVar != null) {
                zzbvrVar.zzs(iObjectWrapperWrap);
                return;
            }
            zzbvs zzbvsVar = this.zzm;
            if (zzbvsVar != null) {
                zzbvsVar.zzq(iObjectWrapperWrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzf(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.zzj && this.zzf.zzH) {
            return;
        }
        zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzg(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzh(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzi(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.zzj) {
            com.google.android.gms.ads.internal.util.zze.zzi("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzf.zzH) {
            zza(view);
        } else {
            com.google.android.gms.ads.internal.util.zze.zzi("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzj() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final boolean zzk() {
        return this.zzf.zzH;
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzm(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzn(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final JSONObject zzo(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final JSONObject zzp(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzr(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzs(zzbob zzbobVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzu(zzbgm zzbgmVar) {
        com.google.android.gms.ads.internal.util.zze.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzv(zzbgi zzbgiVar) {
        com.google.android.gms.ads.internal.util.zze.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzw() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzx(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzt.zzm().zzg(this.zze, this.zzg.zza, this.zzf.zzC.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbvv zzbvvVar = this.zza;
                if (zzbvvVar != null && !zzbvvVar.zzt()) {
                    this.zza.zzv();
                    this.zzb.zza();
                    return;
                }
                zzbvr zzbvrVar = this.zzl;
                if (zzbvrVar != null && !zzbvrVar.zzp()) {
                    this.zzl.zzm();
                    this.zzb.zza();
                    return;
                }
                zzbvs zzbvsVar = this.zzm;
                if (zzbvsVar == null || zzbvsVar.zzn()) {
                    return;
                }
                this.zzm.zzk();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final void zzy() {
    }

    @Override // com.google.android.gms.internal.ads.zzdmu
    public final boolean zzz(Bundle bundle) {
        return false;
    }
}
