package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzayv implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzayn zza;
    final /* synthetic */ zzchl zzb;
    final /* synthetic */ zzayx zzc;

    zzayv(zzayx zzayxVar, zzayn zzaynVar, zzchl zzchlVar) {
        this.zzc = zzayxVar;
        this.zza = zzaynVar;
        this.zzb = zzchlVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc.zzd) {
            if (this.zzc.zzb) {
                return;
            }
            zzayx.zzc(this.zzc, true);
            final zzaym zzaymVar = this.zzc.zza;
            if (zzaymVar == null) {
                return;
            }
            zzfsn zzfsnVar = zzchg.zza;
            final zzayn zzaynVar = this.zza;
            final zzchl zzchlVar = this.zzb;
            final zzfsm<?> zzfsmVarZza = zzfsnVar.zza(new Runnable(this, zzaymVar, zzaynVar, zzchlVar) { // from class: com.google.android.gms.internal.ads.zzays
                private final zzayv zza;
                private final zzaym zzb;
                private final zzayn zzc;
                private final zzchl zzd;

                {
                    this.zza = this;
                    this.zzb = zzaymVar;
                    this.zzc = zzaynVar;
                    this.zzd = zzchlVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzayv zzayvVar = this.zza;
                    zzaym zzaymVar2 = this.zzb;
                    zzayn zzaynVar2 = this.zzc;
                    zzchl zzchlVar2 = this.zzd;
                    try {
                        zzayp zzaypVarZzq = zzaymVar2.zzq();
                        zzayk zzaykVarZzf = zzaymVar2.zzp() ? zzaypVarZzq.zzf(zzaynVar2) : zzaypVarZzq.zze(zzaynVar2);
                        if (!zzaykVarZzf.zza()) {
                            zzchlVar2.zzd(new RuntimeException("No entry contents."));
                            zzayx.zzf(zzayvVar.zzc);
                            return;
                        }
                        zzayu zzayuVar = new zzayu(zzayvVar, zzaykVarZzf.zzb(), 1);
                        int i = zzayuVar.read();
                        if (i == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzayuVar.unread(i);
                        zzchlVar2.zzc(zzayz.zza(zzayuVar, zzaykVarZzf.zzd(), zzaykVarZzf.zzg(), zzaykVarZzf.zzf(), zzaykVarZzf.zze()));
                    } catch (RemoteException | IOException e) {
                        com.google.android.gms.ads.internal.util.zze.zzg("Unable to obtain a cache service instance.", e);
                        zzchlVar2.zzd(e);
                        zzayx.zzf(zzayvVar.zzc);
                    }
                }
            });
            final zzchl zzchlVar2 = this.zzb;
            zzchlVar2.zze(new Runnable(zzchlVar2, zzfsmVarZza) { // from class: com.google.android.gms.internal.ads.zzayt
                private final zzchl zza;
                private final Future zzb;

                {
                    this.zza = zzchlVar2;
                    this.zzb = zzfsmVarZza;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzchl zzchlVar3 = this.zza;
                    Future future = this.zzb;
                    int i = zzayv.zzd;
                    if (zzchlVar3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzchg.zzf);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
