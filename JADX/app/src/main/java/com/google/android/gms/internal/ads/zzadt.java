package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzadt {
    private final AudioManager zza;
    private final zzadr zzb;
    private zzads zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzadt(Context context, Handler handler, zzads zzadsVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.zza = audioManager;
        this.zzc = zzadsVar;
        this.zzb = new zzadr(this, handler);
        this.zzd = 0;
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzamq.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzf(0);
    }

    private final void zzf(int i) {
        if (this.zzd == i) {
            return;
        }
        this.zzd = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.zze == f) {
            return;
        }
        this.zze = f;
        zzads zzadsVar = this.zzc;
        if (zzadsVar != null) {
            ((zzaib) zzadsVar).zza.zzad();
        }
    }

    private final void zzg(int i) {
        zzads zzadsVar = this.zzc;
        if (zzadsVar != null) {
            zzaib zzaibVar = (zzaib) zzadsVar;
            boolean zZzM = zzaibVar.zza.zzM();
            zzaibVar.zza.zzae(zZzM, i, zzaie.zzai(zZzM, i));
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int i) {
        zze();
        return z ? 1 : -1;
    }

    public final void zzc() {
        this.zzc = null;
        zze();
    }

    static /* synthetic */ void zzd(zzadt zzadtVar, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzadtVar.zzf(3);
                return;
            } else {
                zzadtVar.zzg(0);
                zzadtVar.zzf(2);
                return;
            }
        }
        if (i == -1) {
            zzadtVar.zzg(-1);
            zzadtVar.zze();
        } else if (i == 1) {
            zzadtVar.zzf(1);
            zzadtVar.zzg(1);
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i);
            Log.w("AudioFocusManager", sb.toString());
        }
    }
}
