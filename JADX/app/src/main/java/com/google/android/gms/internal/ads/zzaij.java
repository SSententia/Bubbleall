package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaij {
    private final Context zza;
    private final Handler zzb;
    private final zzaif zzc;
    private final AudioManager zzd;
    private zzaii zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    public zzaij(Context context, Handler handler, zzaif zzaifVar) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = handler;
        this.zzc = zzaifVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        zzakt.zze(audioManager);
        this.zzd = audioManager;
        this.zzf = 3;
        this.zzg = zzh(audioManager, 3);
        this.zzh = zzi(audioManager, this.zzf);
        zzaii zzaiiVar = new zzaii(this, null);
        try {
            applicationContext.registerReceiver(zzaiiVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.zze = zzaiiVar;
        } catch (RuntimeException e) {
            zzaln.zza("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        int iZzh = zzh(this.zzd, this.zzf);
        boolean zZzi = zzi(this.zzd, this.zzf);
        if (this.zzg == iZzh && this.zzh == zZzi) {
            return;
        }
        this.zzg = iZzh;
        this.zzh = zZzi;
        Iterator it = ((zzaib) this.zzc).zza.zzh.iterator();
        while (it.hasNext()) {
            ((zzahl) it.next()).zzad(iZzh, zZzi);
        }
    }

    private static int zzh(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            zzaln.zza("StreamVolumeManager", sb.toString(), e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    private static boolean zzi(AudioManager audioManager, int i) {
        if (zzamq.zza >= 23) {
            return audioManager.isStreamMute(i);
        }
        return zzh(audioManager, i) == 0;
    }

    public final void zzb(int i) {
        if (this.zzf == 3) {
            return;
        }
        this.zzf = 3;
        zzg();
        zzaib zzaibVar = (zzaib) this.zzc;
        zzaee zzaeeVarZzah = zzaie.zzah(zzaibVar.zza.zzl);
        if (zzaeeVarZzah.equals(zzaibVar.zza.zzF)) {
            return;
        }
        zzaibVar.zza.zzF = zzaeeVarZzah;
        Iterator it = zzaibVar.zza.zzh.iterator();
        while (it.hasNext()) {
            ((zzahl) it.next()).zzac(zzaeeVarZzah);
        }
    }

    public final int zzc() {
        if (zzamq.zza >= 28) {
            return this.zzd.getStreamMinVolume(this.zzf);
        }
        return 0;
    }

    public final int zzd() {
        return this.zzd.getStreamMaxVolume(this.zzf);
    }

    public final void zze() {
        zzaii zzaiiVar = this.zze;
        if (zzaiiVar != null) {
            try {
                this.zza.unregisterReceiver(zzaiiVar);
            } catch (RuntimeException e) {
                zzaln.zza("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.zze = null;
        }
    }
}
