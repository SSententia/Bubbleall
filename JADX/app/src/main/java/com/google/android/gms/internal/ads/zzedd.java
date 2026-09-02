package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzedd {
    public static ArrayList<zzbbi> zza(SQLiteDatabase sQLiteDatabase) {
        ArrayList<zzbbi> arrayList = new ArrayList<>();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(zzbbi.zzi(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzggm e) {
                com.google.android.gms.ads.internal.util.zze.zzf("Unable to deserialize proto from offline signals database:");
                com.google.android.gms.ads.internal.util.zze.zzf(e.getMessage());
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public static int zzb(SQLiteDatabase sQLiteDatabase, int i) {
        int i2;
        Cursor cursorZzd = zzd(sQLiteDatabase, i);
        if (cursorZzd.getCount() > 0) {
            cursorZzd.moveToNext();
            i2 = cursorZzd.getInt(cursorZzd.getColumnIndexOrThrow(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        } else {
            i2 = 0;
        }
        cursorZzd.close();
        return i2;
    }

    public static long zzc(SQLiteDatabase sQLiteDatabase, int i) {
        long j;
        Cursor cursorZzd = zzd(sQLiteDatabase, 2);
        if (cursorZzd.getCount() > 0) {
            cursorZzd.moveToNext();
            j = cursorZzd.getLong(cursorZzd.getColumnIndexOrThrow(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        } else {
            j = 0;
        }
        cursorZzd.close();
        return j;
    }

    private static Cursor zzd(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {AppMeasurementSdk.ConditionalUserProperty.VALUE};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i != 1) {
            strArr2[0] = "last_successful_request_time";
        } else {
            strArr2[0] = "total_requests";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }
}
