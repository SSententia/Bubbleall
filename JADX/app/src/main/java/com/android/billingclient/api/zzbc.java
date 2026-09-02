package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.play_billing.zzhl;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzbc implements ServiceConnection {
    final /* synthetic */ BillingClientImpl zza;
    private final Object zzb = new Object();
    private boolean zzc = false;
    private BillingClientStateListener zzd;

    /* synthetic */ zzbc(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, zzbb zzbbVar) {
        this.zza = billingClientImpl;
        this.zzd = billingClientStateListener;
    }

    private final void zzd(BillingResult billingResult) {
        synchronized (this.zzb) {
            BillingClientStateListener billingClientStateListener = this.zzd;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingSetupFinished(billingResult);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service connected.");
        this.zza.zzg = com.google.android.gms.internal.play_billing.zzr.zzu(iBinder);
        Callable callable = new Callable() { // from class: com.android.billingclient.api.zzaz
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zza();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzba
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb();
            }
        };
        BillingClientImpl billingClientImpl = this.zza;
        if (billingClientImpl.zzao(callable, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, runnable, billingClientImpl.zzaj()) == null) {
            BillingClientImpl billingClientImpl2 = this.zza;
            BillingResult billingResultZzal = billingClientImpl2.zzal();
            billingClientImpl2.zzap(zzcb.zza(25, 6, billingResultZzal));
            zzd(billingResultZzal);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing service disconnected.");
        this.zza.zzf.zze(zzhl.zzz());
        this.zza.zzg = null;
        this.zza.zza = 0;
        synchronized (this.zzb) {
            BillingClientStateListener billingClientStateListener = this.zzd;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingServiceDisconnected();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x020e  */
    /* JADX WARN: Code duplicated, block: B:126:0x023a  */
    /* JADX WARN: Code duplicated, block: B:127:0x023f  */
    /* JADX WARN: Instruction removed from duplicated block: B:124:0x020e, please report this as an issue */
    final /* synthetic */ Object zza() throws Exception {
        Bundle bundle;
        int i;
        int i2;
        String strSubstring;
        int iZzy;
        synchronized (this.zzb) {
            if (!this.zzc) {
                if (TextUtils.isEmpty(null)) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle.putString("accountName", null);
                }
                int i3 = 3;
                try {
                    String packageName = this.zza.zze.getPackageName();
                    iZzy = 3;
                    int i4 = 22;
                    while (true) {
                        if (i4 < 3) {
                            i4 = 0;
                            break;
                        }
                        if (bundle == null) {
                            try {
                                iZzy = this.zza.zzg.zzy(i4, packageName, "subs");
                            } catch (Exception e) {
                                e = e;
                                i3 = iZzy;
                                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                if (e instanceof DeadObjectException) {
                                    i2 = 101;
                                } else if (e instanceof RemoteException) {
                                    i2 = 100;
                                } else {
                                    if (e instanceof SecurityException) {
                                        i2 = 102;
                                    } else {
                                        i = 42;
                                    }
                                    if (i == 42) {
                                        strSubstring = e.getClass().getSimpleName() + ": " + com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage());
                                        if (strSubstring.length() > 70) {
                                            strSubstring = strSubstring.substring(0, 70);
                                        }
                                    } else {
                                        strSubstring = null;
                                    }
                                    this.zza.zza = 0;
                                    this.zza.zzg = null;
                                    iZzy = i3;
                                }
                                i = i2;
                                if (i == 42) {
                                    strSubstring = e.getClass().getSimpleName() + ": " + com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage());
                                    if (strSubstring.length() > 70) {
                                        strSubstring = strSubstring.substring(0, 70);
                                    }
                                } else {
                                    strSubstring = null;
                                }
                                this.zza.zza = 0;
                                this.zza.zzg = null;
                                iZzy = i3;
                            }
                        } else {
                            iZzy = this.zza.zzg.zzc(i4, packageName, "subs", bundle);
                        }
                        if (iZzy == 0) {
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "highestLevelSupportedForSubs: " + i4);
                            break;
                        }
                        i4--;
                    }
                    boolean z = true;
                    this.zza.zzj = i4 >= 5;
                    this.zza.zzi = i4 >= 3;
                    if (i4 < 3) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "In-app billing API does not support subscription on this device.");
                        i = 9;
                    } else {
                        i = 1;
                    }
                    for (int i5 = 22; i5 >= 3; i5--) {
                        iZzy = bundle == null ? this.zza.zzg.zzy(i5, packageName, "inapp") : this.zza.zzg.zzc(i5, packageName, "inapp", bundle);
                        if (iZzy == 0) {
                            this.zza.zzk = i5;
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "mHighestLevelSupportedForInApp: " + this.zza.zzk);
                            break;
                        }
                    }
                    BillingClientImpl billingClientImpl = this.zza;
                    billingClientImpl.zzy = billingClientImpl.zzk >= 22;
                    BillingClientImpl billingClientImpl2 = this.zza;
                    billingClientImpl2.zzx = billingClientImpl2.zzk >= 21;
                    BillingClientImpl billingClientImpl3 = this.zza;
                    billingClientImpl3.zzw = billingClientImpl3.zzk >= 20;
                    BillingClientImpl billingClientImpl4 = this.zza;
                    billingClientImpl4.zzv = billingClientImpl4.zzk >= 19;
                    BillingClientImpl billingClientImpl5 = this.zza;
                    billingClientImpl5.zzu = billingClientImpl5.zzk >= 18;
                    BillingClientImpl billingClientImpl6 = this.zza;
                    billingClientImpl6.zzt = billingClientImpl6.zzk >= 17;
                    BillingClientImpl billingClientImpl7 = this.zza;
                    billingClientImpl7.zzs = billingClientImpl7.zzk >= 16;
                    BillingClientImpl billingClientImpl8 = this.zza;
                    billingClientImpl8.zzr = billingClientImpl8.zzk >= 15;
                    BillingClientImpl billingClientImpl9 = this.zza;
                    billingClientImpl9.zzq = billingClientImpl9.zzk >= 14;
                    BillingClientImpl billingClientImpl10 = this.zza;
                    billingClientImpl10.zzp = billingClientImpl10.zzk >= 12;
                    BillingClientImpl billingClientImpl11 = this.zza;
                    billingClientImpl11.zzo = billingClientImpl11.zzk >= 10;
                    BillingClientImpl billingClientImpl12 = this.zza;
                    billingClientImpl12.zzn = billingClientImpl12.zzk >= 9;
                    BillingClientImpl billingClientImpl13 = this.zza;
                    billingClientImpl13.zzm = billingClientImpl13.zzk >= 8;
                    BillingClientImpl billingClientImpl14 = this.zza;
                    if (billingClientImpl14.zzk < 6) {
                        z = false;
                    }
                    billingClientImpl14.zzl = z;
                    if (this.zza.zzk < 3) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "In-app billing API version 3 is not supported on this device.");
                        i = 36;
                    }
                    if (iZzy == 0) {
                        this.zza.zza = 2;
                        if (this.zza.zzd != null) {
                            this.zza.zzd.zzg(this.zza.zzx);
                        }
                    } else {
                        this.zza.zza = 0;
                        this.zza.zzg = null;
                    }
                    strSubstring = null;
                } catch (Exception e2) {
                    e = e2;
                }
                if (iZzy == 0) {
                    this.zza.zzaq(zzcb.zzc(6));
                    zzd(zzce.zzl);
                } else {
                    this.zza.zzap(zzcb.zzb(i, 6, zzce.zza, strSubstring));
                    zzd(zzce.zza);
                }
            }
        }
        return null;
    }

    final /* synthetic */ void zzb() {
        this.zza.zza = 0;
        this.zza.zzg = null;
        this.zza.zzap(zzcb.zza(24, 6, zzce.zzn));
        zzd(zzce.zzn);
    }

    final void zzc() {
        synchronized (this.zzb) {
            this.zzd = null;
            this.zzc = true;
        }
    }
}
