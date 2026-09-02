package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaib implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzmu, zzdq, zzakr, zzaiw, zzads, zzado, zzaif, zzahj, zzaeh {
    final /* synthetic */ zzaie zza;

    /* synthetic */ zzaib(zzaie zzaieVar, zzaid zzaidVar) {
        this.zza = zzaieVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzaie.zzS(this.zza, surfaceTexture);
        this.zza.zzac(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzab(null);
        this.zza.zzac(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzac(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzac(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzac(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzA(Exception exc) {
        this.zza.zzi.zzA(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzH(zzaiq zzaiqVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzI(zzagk zzagkVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzJ(zzs zzsVar, zzt zztVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzK(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzL(zzahi zzahiVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzM(boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzN(int i) {
        zzaie.zzY(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzO(boolean z, int i) {
        zzaie.zzY(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzP(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzQ(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzR(zzahc zzahcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzS(zzaho zzahoVar, zzaho zzahoVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzT(zzahf zzahfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzU(zzago zzagoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzV() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zza(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzb(boolean z) {
        zzaie.zzY(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzg(zzaz zzazVar) {
        this.zza.zzx = zzazVar;
        this.zza.zzi.zzg(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzh(String str, long j, long j2) {
        this.zza.zzi.zzh(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzi(zzafv zzafvVar, zzba zzbaVar) {
        this.zza.zzp = zzafvVar;
        this.zza.zzi.zzi(zzafvVar, zzbaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzj(long j) {
        this.zza.zzi.zzj(j);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzk(int i, long j, long j2) {
        this.zza.zzi.zzk(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzl(String str) {
        this.zza.zzi.zzl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzm(zzaz zzazVar) {
        this.zza.zzi.zzm(zzazVar);
        this.zza.zzp = null;
        this.zza.zzx = null;
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzn(boolean z) {
        if (this.zza.zzB == z) {
            return;
        }
        this.zza.zzB = z;
        zzaie.zzW(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzo(Exception exc) {
        this.zza.zzi.zzo(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzp(Exception exc) {
        this.zza.zzi.zzp(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzr(zzaz zzazVar) {
        this.zza.zzw = zzazVar;
        this.zza.zzi.zzr(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzs(String str, long j, long j2) {
        this.zza.zzi.zzs(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzt(zzafv zzafvVar, zzba zzbaVar) {
        this.zza.zzo = zzafvVar;
        this.zza.zzi.zzt(zzafvVar, zzbaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzu(int i, long j) {
        this.zza.zzi.zzu(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzv(String str) {
        this.zza.zzi.zzv(str);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzw(zzaz zzazVar) {
        this.zza.zzi.zzw(zzazVar);
        this.zza.zzo = null;
        this.zza.zzw = null;
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzx(zzy zzyVar) {
        this.zza.zzG = zzyVar;
        this.zza.zzi.zzx(zzyVar);
        Iterator it = this.zza.zzh.iterator();
        while (it.hasNext()) {
            ((zzahl) it.next()).zzx(zzyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzy(Object obj, long j) {
        this.zza.zzi.zzy(obj, j);
        if (this.zza.zzr == obj) {
            Iterator it = this.zza.zzh.iterator();
            while (it.hasNext()) {
                ((zzahl) it.next()).zzae();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzz(long j, int i) {
        this.zza.zzi.zzz(j, i);
    }
}
