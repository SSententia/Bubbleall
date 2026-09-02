package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffr {
    private final zzehp zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfam zzf;
    private final Clock zzg;
    private final zzaas zzh;

    public zzffr(zzehp zzehpVar, zzcgz zzcgzVar, String str, String str2, Context context, zzfam zzfamVar, Clock clock, zzaas zzaasVar) {
        this.zza = zzehpVar;
        this.zzb = zzcgzVar.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfamVar;
        this.zzg = clock;
        this.zzh = zzaasVar;
    }

    public static final List<String> zzd(int i, int i2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            StringBuilder sb = new StringBuilder(23);
            sb.append("2.");
            sb.append(i2);
            arrayList.add(zze(str, "@gw_mpe@", sb.toString()));
        }
        return arrayList;
    }

    private static String zze(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    private static String zzf(String str) {
        return (TextUtils.isEmpty(str) || !zzcgs.zzj()) ? str : "fakeForAdDebugLog";
    }

    public final List<String> zza(zzfal zzfalVar, zzezz zzezzVar, List<String> list) {
        return zzb(zzfalVar, zzezzVar, false, "", "", list);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5 A[SYNTHETIC] */
    public final List<String> zzb(zzfal zzfalVar, zzezz zzezzVar, boolean z, String str, String str2, List<String> list) {
        Uri.Builder builderBuildUpon;
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? "0" : "1";
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strZze = zze(zze(zze(it.next(), "@gw_adlocid@", zzfalVar.zza.zza.zzf), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.zzb);
            if (zzezzVar != null) {
                strZze = zzcfc.zza(zze(zze(zze(strZze, "@gw_qdata@", zzezzVar.zzy), "@gw_adnetid@", zzezzVar.zzx), "@gw_allocid@", zzezzVar.zzw), this.zze, zzezzVar.zzS);
            }
            String strZze2 = zze(zze(zze(strZze, "@gw_adnetstatus@", this.zza.zzg()), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z2 = false;
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzca)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (z2) {
                if (this.zzh.zza(Uri.parse(strZze2))) {
                    builderBuildUpon = Uri.parse(strZze2).buildUpon();
                    if (z2) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                    }
                    if (z3) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                    }
                    strZze2 = builderBuildUpon.build().toString();
                }
            } else if (z3) {
                z3 = true;
                if (this.zzh.zza(Uri.parse(strZze2))) {
                    builderBuildUpon = Uri.parse(strZze2).buildUpon();
                    if (z2) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                    }
                    if (z3) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                    }
                    strZze2 = builderBuildUpon.build().toString();
                }
            }
            arrayList.add(strZze2);
        }
        return arrayList;
    }

    public final List<String> zzc(zzezz zzezzVar, List<String> list, zzcbz zzcbzVar) {
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = this.zzg.currentTimeMillis();
        try {
            String strZzb = zzcbzVar.zzb();
            String string = Integer.toString(zzcbzVar.zzc());
            zzfam zzfamVar = this.zzf;
            String strZzf = zzfamVar == null ? "" : zzf(zzfamVar.zza);
            zzfam zzfamVar2 = this.zzf;
            String strZzf2 = zzfamVar2 != null ? zzf(zzfamVar2.zzb) : "";
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzcfc.zza(zze(zze(zze(zze(zze(zze(it.next(), "@gw_rwd_userid@", Uri.encode(strZzf)), "@gw_rwd_custom_data@", Uri.encode(strZzf2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzb)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzezzVar.zzS));
            }
            return arrayList;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
