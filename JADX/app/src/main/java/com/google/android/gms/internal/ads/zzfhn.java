package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfhn {
    private final HashMap<View, String> zza = new HashMap<>();
    private final HashMap<View, zzfhm> zzb = new HashMap<>();
    private final HashMap<String, View> zzc = new HashMap<>();
    private final HashSet<View> zzd = new HashSet<>();
    private final HashSet<String> zze = new HashSet<>();
    private final HashSet<String> zzf = new HashSet<>();
    private final HashMap<String, String> zzg = new HashMap<>();
    private boolean zzh;

    public final HashSet<String> zza() {
        return this.zze;
    }

    public final HashSet<String> zzb() {
        return this.zzf;
    }

    public final String zzc(String str) {
        return this.zzg.get(str);
    }

    public final void zzd() {
        String str;
        zzfgr zzfgrVarZza = zzfgr.zza();
        if (zzfgrVarZza != null) {
            for (zzfgg zzfggVar : zzfgrVarZza.zzf()) {
                View viewZzi = zzfggVar.zzi();
                if (zzfggVar.zzj()) {
                    String strZzh = zzfggVar.zzh();
                    if (viewZzi != null) {
                        if (viewZzi.hasWindowFocus()) {
                            HashSet hashSet = new HashSet();
                            View view = viewZzi;
                            while (true) {
                                if (view == null) {
                                    this.zzd.addAll(hashSet);
                                    str = null;
                                    break;
                                }
                                String strZzb = zzfhl.zzb(view);
                                if (strZzb != null) {
                                    str = strZzb;
                                    break;
                                } else {
                                    hashSet.add(view);
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            }
                        } else {
                            str = "noWindowFocus";
                        }
                        if (str == null) {
                            this.zze.add(strZzh);
                            this.zza.put(viewZzi, strZzh);
                            for (zzfgu zzfguVar : zzfggVar.zzf()) {
                                View view2 = (View) zzfguVar.zza().get();
                                if (view2 != null) {
                                    zzfhm zzfhmVar = this.zzb.get(view2);
                                    if (zzfhmVar != null) {
                                        zzfhmVar.zza(zzfggVar.zzh());
                                    } else {
                                        this.zzb.put(view2, new zzfhm(zzfguVar, zzfggVar.zzh()));
                                    }
                                }
                            }
                        } else {
                            this.zzf.add(strZzh);
                            this.zzc.put(strZzh, viewZzi);
                            this.zzg.put(strZzh, str);
                        }
                    } else {
                        this.zzf.add(strZzh);
                        this.zzg.put(strZzh, "noAdView");
                    }
                }
            }
        }
    }

    public final void zze() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzh = false;
    }

    public final void zzf() {
        this.zzh = true;
    }

    public final String zzg(View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        String str = this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final View zzh(String str) {
        return this.zzc.get(str);
    }

    public final zzfhm zzi(View view) {
        zzfhm zzfhmVar = this.zzb.get(view);
        if (zzfhmVar != null) {
            this.zzb.remove(view);
        }
        return zzfhmVar;
    }

    public final int zzj(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzh ? 2 : 3;
    }
}
