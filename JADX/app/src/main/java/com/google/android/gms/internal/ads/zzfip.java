package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfip implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfjp zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue<zzyz> zzd;
    private final HandlerThread zze;

    public zzfip(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfjp zzfjpVar = new zzfjp(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfjpVar;
        this.zzd = new LinkedBlockingQueue<>();
        zzfjpVar.checkAvailabilityAndConnect();
    }

    static zzyz zzc() {
        zzyj zzyjVarZzi = zzyz.zzi();
        zzyjVarZzi.zzl(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID);
        return zzyjVarZzi.zzah();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfju zzfjuVarZzd = zzd();
        if (zzfjuVarZzd != null) {
            try {
                try {
                    this.zzd.put(zzfjuVarZzd.zze(new zzfjq(this.zzb, this.zzc)).zza());
                } catch (InterruptedException unused) {
                } finally {
                    zzb();
                    this.zze.quit();
                }
            } catch (Throwable unused2) {
                this.zzd.put(zzc());
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    public final zzyz zza(int i) {
        zzyz zzyzVarPoll;
        try {
            zzyzVarPoll = this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzyzVarPoll = null;
        }
        return zzyzVarPoll == null ? zzc() : zzyzVarPoll;
    }

    public final void zzb() {
        zzfjp zzfjpVar = this.zza;
        if (zzfjpVar != null) {
            if (zzfjpVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    protected final zzfju zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
