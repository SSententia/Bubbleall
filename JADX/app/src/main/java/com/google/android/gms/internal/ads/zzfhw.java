package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfhw extends AsyncTask<Object, Void, String> {
    private zzfhx zza;
    protected final zzfho zzd;

    public zzfhw(zzfho zzfhoVar, byte[] bArr) {
        this.zzd = zzfhoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfhx zzfhxVar = this.zza;
        if (zzfhxVar != null) {
            zzfhxVar.zzb(this);
        }
    }

    public final void zzb(zzfhx zzfhxVar) {
        this.zza = zzfhxVar;
    }
}
