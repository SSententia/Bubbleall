package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import androidx.media2.session.SessionCommand;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzedi {
    private final zzazb zza;
    private final Context zzb;
    private final zzecq zzc;
    private final zzcgz zzd;
    private final String zze;
    private final zzffc zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzg().zzp();

    public zzedi(Context context, zzcgz zzcgzVar, zzazb zzazbVar, zzecq zzecqVar, String str, zzffc zzffcVar) {
        this.zzb = context;
        this.zzd = zzcgzVar;
        this.zza = zzazbVar;
        this.zzc = zzecqVar;
        this.zze = str;
        this.zzf = zzffcVar;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList<zzbbi> arrayList) {
        int size = arrayList.size();
        long jZza = 0;
        for (int i = 0; i < size; i++) {
            zzbbi zzbbiVar = arrayList.get(i);
            if (zzbbiVar.zzs() == 2 && zzbbiVar.zza() > jZza) {
                jZza = zzbbiVar.zza();
            }
        }
        if (jZza != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(jZza));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final void zza(final boolean z) {
        try {
            this.zzc.zza(new zzfdw(this, z) { // from class: com.google.android.gms.internal.ads.zzede
                private final zzedi zza;
                private final boolean zzb;

                {
                    this.zza = this;
                    this.zzb = z;
                }

                @Override // com.google.android.gms.internal.ads.zzfdw
                public final Object zza(Object obj) throws Exception {
                    this.zza.zzb(this.zzb, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            com.google.android.gms.ads.internal.util.zze.zzf(strValueOf.length() != 0 ? "Error in offline signals database startup: ".concat(strValueOf) : new String("Error in offline signals database startup: "));
        }
    }

    final /* synthetic */ Void zzb(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
            zzffb zzffbVarZza = zzffb.zza("oa_upload");
            zzffbVarZza.zzc("oa_failed_reqs", String.valueOf(zzedd.zzb(sQLiteDatabase, 0)));
            zzffbVarZza.zzc("oa_total_reqs", String.valueOf(zzedd.zzb(sQLiteDatabase, 1)));
            zzffbVarZza.zzc("oa_upload_time", String.valueOf(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis()));
            zzffbVarZza.zzc("oa_last_successful_time", String.valueOf(zzedd.zzc(sQLiteDatabase, 2)));
            zzffbVarZza.zzc("oa_session_id", this.zzg.zzC() ? "" : this.zze);
            this.zzf.zza(zzffbVarZza);
            ArrayList<zzbbi> arrayListZza = zzedd.zza(sQLiteDatabase);
            zzc(sQLiteDatabase, arrayListZza);
            int size = arrayListZza.size();
            for (int i = 0; i < size; i++) {
                zzbbi zzbbiVar = arrayListZza.get(i);
                zzffb zzffbVarZza2 = zzffb.zza("oa_signals");
                zzffbVarZza2.zzc("oa_session_id", this.zzg.zzC() ? "" : this.zze);
                zzbbd zzbbdVarZzf = zzbbiVar.zzf();
                String strValueOf = zzbbdVarZzf.zza() ? String.valueOf(zzbbdVarZzf.zzg() - 1) : "-1";
                String string = zzfpb.zzb(zzbbiVar.zze(), zzedh.zza).toString();
                zzffbVarZza2.zzc("oa_sig_ts", String.valueOf(zzbbiVar.zza()));
                zzffbVarZza2.zzc("oa_sig_status", String.valueOf(zzbbiVar.zzs() - 1));
                zzffbVarZza2.zzc("oa_sig_resp_lat", String.valueOf(zzbbiVar.zzc()));
                zzffbVarZza2.zzc("oa_sig_render_lat", String.valueOf(zzbbiVar.zzd()));
                zzffbVarZza2.zzc("oa_sig_formats", string);
                zzffbVarZza2.zzc("oa_sig_nw_type", strValueOf);
                zzffbVarZza2.zzc("oa_sig_wifi", String.valueOf(zzbbiVar.zzt() - 1));
                zzffbVarZza2.zzc("oa_sig_airplane", String.valueOf(zzbbiVar.zzu() - 1));
                zzffbVarZza2.zzc("oa_sig_data", String.valueOf(zzbbiVar.zzv() - 1));
                zzffbVarZza2.zzc("oa_sig_nw_resp", String.valueOf(zzbbiVar.zzg()));
                zzffbVarZza2.zzc("oa_sig_offline", String.valueOf(zzbbiVar.zzw() - 1));
                zzffbVarZza2.zzc("oa_sig_nw_state", String.valueOf(zzbbiVar.zzh().zza()));
                if (zzbbdVarZzf.zzc() && zzbbdVarZzf.zza() && zzbbdVarZzf.zzg() == 2) {
                    zzffbVarZza2.zzc("oa_sig_cell_type", String.valueOf(zzbbdVarZzf.zzh() - 1));
                }
                this.zzf.zza(zzffbVarZza2);
            }
        } else {
            ArrayList<zzbbi> arrayListZza2 = zzedd.zza(sQLiteDatabase);
            zzbbj zzbbjVarZza = zzbbn.zza();
            zzbbjVarZza.zze(this.zzb.getPackageName());
            zzbbjVarZza.zzf(Build.MODEL);
            zzbbjVarZza.zzb(zzedd.zzb(sQLiteDatabase, 0));
            zzbbjVarZza.zza(arrayListZza2);
            zzbbjVarZza.zzc(zzedd.zzb(sQLiteDatabase, 1));
            zzbbjVarZza.zzd(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis());
            zzbbjVarZza.zzg(zzedd.zzc(sQLiteDatabase, 2));
            final zzbbn zzbbnVarZzah = zzbbjVarZza.zzah();
            zzc(sQLiteDatabase, arrayListZza2);
            this.zza.zzb(new zzaza(zzbbnVarZzah) { // from class: com.google.android.gms.internal.ads.zzedf
                private final zzbbn zza;

                {
                    this.zza = zzbbnVarZzah;
                }

                @Override // com.google.android.gms.internal.ads.zzaza
                public final void zza(zzbao zzbaoVar) {
                    zzbaoVar.zzi(this.zza);
                }
            });
            zzbby zzbbyVarZza = zzbbz.zza();
            zzbbyVarZza.zza(this.zzd.zzb);
            zzbbyVarZza.zzb(this.zzd.zzc);
            zzbbyVarZza.zzc(true == this.zzd.zzd ? 0 : 2);
            final zzbbz zzbbzVarZzah = zzbbyVarZza.zzah();
            this.zza.zzb(new zzaza(zzbbzVarZzah) { // from class: com.google.android.gms.internal.ads.zzedg
                private final zzbbz zza;

                {
                    this.zza = zzbbzVarZzah;
                }

                @Override // com.google.android.gms.internal.ads.zzaza
                public final void zza(zzbao zzbaoVar) {
                    zzbbz zzbbzVar = this.zza;
                    zzbag zzbagVarZzau = zzbaoVar.zze().zzau();
                    zzbagVarZzau.zzb(zzbbzVar);
                    zzbaoVar.zzf(zzbagVarZzau);
                }
            });
            this.zza.zzc(SessionCommand.COMMAND_CODE_PLAYER_SET_SPEED);
        }
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ContentValues contentValues = new ContentValues();
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }
}
