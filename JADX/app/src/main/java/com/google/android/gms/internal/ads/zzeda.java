package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeda implements zzfrz<Bundle> {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzedb zzb;

    zzeda(zzedb zzedbVar, boolean z) {
        this.zzb = zzedbVar;
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.zze.zzf("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(Bundle bundle) {
        List listEmptyList;
        List listAsList;
        final ArrayList arrayList;
        Iterator it;
        byte b;
        zzazx zzazxVar;
        Bundle bundle2 = bundle;
        if (this.zzb.zzf.zzC()) {
            return;
        }
        Object obj = bundle2.get("ad_types");
        if (!(obj instanceof List)) {
            if (obj instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj);
            } else {
                listEmptyList = Collections.emptyList();
            }
            arrayList = new ArrayList();
            it = listEmptyList.iterator();
            while (it.hasNext()) {
                switch ((String) it.next()) {
                    case "banner":
                        b = 0;
                        break;
                    case "native":
                        b = 2;
                        break;
                    case "rewarded":
                        b = 3;
                        break;
                    case "interstitial":
                        b = 1;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b != 0) {
                    zzazxVar = zzazx.BANNER;
                } else if (b != 1) {
                    zzazxVar = zzazx.INTERSTITIAL;
                } else if (b != 2) {
                    zzazxVar = zzazx.NATIVE_APP_INSTALL;
                } else if (b != 3) {
                    zzazxVar = zzazx.AD_FORMAT_TYPE_UNSPECIFIED;
                } else {
                    zzazxVar = zzazx.REWARD_BASED_VIDEO_AD;
                }
                arrayList.add(zzazxVar);
            }
            zzedb zzedbVar = this.zzb;
            final zzbbm zzbbmVar = zzedb.zzg.get(zzfbd.zza(zzfbd.zza(bundle2, "device"), "network").getInt("active_network_state", -1), zzbbm.UNSPECIFIED);
            final zzbbd zzbbdVarZzc = zzedb.zzc(this.zzb, bundle2);
            zzecq zzecqVar = this.zzb.zze;
            final boolean z = this.zza;
            zzecqVar.zza(new zzfdw(this, z, arrayList, zzbbdVarZzc, zzbbmVar) { // from class: com.google.android.gms.internal.ads.zzecz
                private final zzeda zza;
                private final boolean zzb;
                private final ArrayList zzc;
                private final zzbbd zzd;
                private final zzbbm zze;

                {
                    this.zza = this;
                    this.zzb = z;
                    this.zzc = arrayList;
                    this.zzd = zzbbdVarZzc;
                    this.zze = zzbbmVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfdw
                public final Object zza(Object obj2) {
                    zzeda zzedaVar = this.zza;
                    boolean z2 = this.zzb;
                    ArrayList arrayList2 = this.zzc;
                    zzbbd zzbbdVar = this.zzd;
                    zzbbm zzbbmVar2 = this.zze;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj2;
                    if (!zzedaVar.zzb.zzf.zzC()) {
                        byte[] bArrZze = zzedb.zze(zzedaVar.zzb, z2, arrayList2, zzbbdVar, zzbbmVar2);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("timestamp", Long.valueOf(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis()));
                        contentValues.put("serialized_proto_data", bArrZze);
                        sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
                        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
                        if (!z2) {
                            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
                        }
                    }
                    return null;
                }
            });
        }
        listAsList = (List) obj;
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj2 : listAsList) {
            if (obj2 instanceof String) {
                arrayList2.add((String) obj2);
            }
        }
        listEmptyList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listEmptyList.iterator();
        while (it.hasNext()) {
            switch ((String) it.next()) {
                case -1396342996:
                    if (!r1.equals("banner")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    break;
                case -1052618729:
                    if (!r1.equals("native")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -239580146:
                    if (!r1.equals("rewarded")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    break;
                case 604727084:
                    if (!r1.equals("interstitial")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b != 0) {
                zzazxVar = zzazx.BANNER;
            } else if (b != 1) {
                zzazxVar = zzazx.INTERSTITIAL;
            } else if (b != 2) {
                zzazxVar = zzazx.NATIVE_APP_INSTALL;
            } else if (b != 3) {
                zzazxVar = zzazx.AD_FORMAT_TYPE_UNSPECIFIED;
            } else {
                zzazxVar = zzazx.REWARD_BASED_VIDEO_AD;
            }
            arrayList.add(zzazxVar);
        }
        zzedb zzedbVar2 = this.zzb;
        final zzbbm zzbbmVar2 = zzedb.zzg.get(zzfbd.zza(zzfbd.zza(bundle2, "device"), "network").getInt("active_network_state", -1), zzbbm.UNSPECIFIED);
        final zzbbd zzbbdVarZzc2 = zzedb.zzc(this.zzb, bundle2);
        zzecq zzecqVar2 = this.zzb.zze;
        final boolean z2 = this.zza;
        zzecqVar2.zza(new zzfdw(this, z2, arrayList, zzbbdVarZzc2, zzbbmVar2) { // from class: com.google.android.gms.internal.ads.zzecz
            private final zzeda zza;
            private final boolean zzb;
            private final ArrayList zzc;
            private final zzbbd zzd;
            private final zzbbm zze;

            {
                this.zza = this;
                this.zzb = z2;
                this.zzc = arrayList;
                this.zzd = zzbbdVarZzc2;
                this.zze = zzbbmVar2;
            }

            @Override // com.google.android.gms.internal.ads.zzfdw
            public final Object zza(Object obj3) {
                zzeda zzedaVar = this.zza;
                boolean z3 = this.zzb;
                ArrayList arrayList3 = this.zzc;
                zzbbd zzbbdVar = this.zzd;
                zzbbm zzbbmVar3 = this.zze;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                if (!zzedaVar.zzb.zzf.zzC()) {
                    byte[] bArrZze = zzedb.zze(zzedaVar.zzb, z3, arrayList3, zzbbdVar, zzbbmVar3);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("timestamp", Long.valueOf(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis()));
                    contentValues.put("serialized_proto_data", bArrZze);
                    sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
                    sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
                    if (!z3) {
                        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
                    }
                }
                return null;
            }
        });
    }
}
