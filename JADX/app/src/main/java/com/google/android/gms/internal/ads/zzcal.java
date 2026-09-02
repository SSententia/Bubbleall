package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcal {

    @Nonnull
    private final View zza;
    private final Map<String, WeakReference<View>> zzb;
    private final zzcfn zzc;

    public zzcal(zzcak zzcakVar) {
        View view = zzcakVar.zza;
        this.zza = view;
        Map<String, WeakReference<View>> map = zzcakVar.zzb;
        this.zzb = map;
        zzcfn zzcfnVarZza = zzcah.zza(zzcakVar.zza.getContext());
        this.zzc = zzcfnVarZza;
        if (zzcfnVarZza == null || map.isEmpty()) {
            return;
        }
        try {
            zzcfnVarZza.zzi(new zzcam(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
        } catch (RemoteException unused) {
            zzcgt.zzf("Failed to call remote method.");
        }
    }

    public final void zza(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzg(list, ObjectWrapper.wrap(this.zza), new zzcai(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void zzb(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzh(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzcaj(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzcfn zzcfnVar = this.zzc;
        if (zzcfnVar == null) {
            zzcgt.zzd("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzcfnVar.zzf(ObjectWrapper.wrap(motionEvent));
        } catch (RemoteException unused) {
            zzcgt.zzf("Failed to call remote method.");
        }
    }
}
