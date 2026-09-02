package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzaas;
import com.google.android.gms.internal.ads.zzcgt;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzp extends AsyncTask<Void, Void, String> {
    final /* synthetic */ zzs zza;

    /* synthetic */ zzp(zzs zzsVar, zzq zzqVar) {
        this.zza = zzsVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        if (this.zza.zzf == null || str2 == null) {
            return;
        }
        this.zza.zzf.loadUrl(str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            zzs zzsVar = this.zza;
            zzsVar.zzh = (zzaas) zzsVar.zzc.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            zzcgt.zzj("", e);
        } catch (ExecutionException e2) {
            e = e2;
            zzcgt.zzj("", e);
        } catch (TimeoutException e3) {
            zzcgt.zzj("", e3);
        }
        return this.zza.zzT();
    }
}
