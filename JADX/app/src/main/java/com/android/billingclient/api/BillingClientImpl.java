package com.android.billingclient.api;

import android.R;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.BundleCompat;
import androidx.work.WorkRequest;
import com.android.billingclient.BuildConfig;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzgd;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgg;
import com.google.android.gms.internal.play_billing.zzgk;
import com.google.android.gms.internal.play_billing.zzgt;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzgz;
import com.google.android.gms.internal.play_billing.zzhb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
class BillingClientImpl extends BillingClient {
    private boolean zzA;
    private ExecutorService zzB;
    private volatile int zza;
    private final String zzb;
    private final Handler zzc;
    private volatile zzo zzd;
    private Context zze;
    private zzcc zzf;
    private volatile com.google.android.gms.internal.play_billing.zzs zzg;
    private volatile zzbc zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private PendingPurchasesParams zzz;

    private BillingClientImpl(Activity activity, PendingPurchasesParams pendingPurchasesParams, String str) {
        this(activity.getApplicationContext(), pendingPurchasesParams, new zzbu(), str, null, null, null, null);
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, zzc zzcVar, String str, zzcc zzccVar) {
        this.zze = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(str);
        zzgtVarZzy.zzm(this.zze.getPackageName());
        if (zzccVar != null) {
            this.zzf = zzccVar;
        } else {
            this.zzf = new zzch(this.zze, (zzgu) zzgtVarZzy.zzf());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzd = new zzo(this.zze, purchasesUpdatedListener, null, zzcVar, null, this.zzf);
        this.zzz = pendingPurchasesParams;
        this.zzA = zzcVar != null;
        this.zze.getPackageName();
    }

    private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void startConnection(long j) {
        zzbu zzbuVar = new zzbu(j);
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            zzaq(zzcb.zzc(6));
            zzbuVar.onBillingSetupFinished(zzce.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            zzap(zzcb.zza(37, 6, zzce.zzd));
            zzbuVar.onBillingSetupFinished(zzce.zzd);
            return;
        }
        if (this.zza == 3) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            zzap(zzcb.zza(38, 6, zzce.zzm));
            zzbuVar.onBillingSetupFinished(zzce.zzm);
            return;
        }
        this.zza = 1;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Starting in-app billing setup.");
        this.zzh = new zzbc(this, zzbuVar, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i = 41;
        } else {
            ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                String str = resolveInfo.serviceInfo.packageName;
                String str2 = resolveInfo.serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                    i = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.zzb);
                    if (this.zze.bindService(intent2, this.zzh, 1)) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                        i = 39;
                    }
                }
            }
        }
        this.zza = 0;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service unavailable on device.");
        zzap(zzcb.zza(i, 6, zzce.zzc));
        zzbuVar.onBillingSetupFinished(zzce.zzc);
    }

    static /* bridge */ /* synthetic */ zzcz zzag(BillingClientImpl billingClientImpl, String str, int i) {
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzc = com.google.android.gms.internal.play_billing.zzb.zzc(billingClientImpl.zzn, billingClientImpl.zzv, billingClientImpl.zzz.isEnabledForOneTimeProducts(), billingClientImpl.zzz.isEnabledForPrepaidPlans(), billingClientImpl.zzb);
        List list = null;
        String string = null;
        while (true) {
            try {
                Bundle bundleZzj = billingClientImpl.zzn ? billingClientImpl.zzg.zzj(true != billingClientImpl.zzv ? 9 : 19, billingClientImpl.zze.getPackageName(), str, string, bundleZzc) : billingClientImpl.zzg.zzi(3, billingClientImpl.zze.getPackageName(), str, string);
                zzda zzdaVarZza = zzdb.zza(bundleZzj, "BillingClient", "getPurchase()");
                BillingResult billingResultZza = zzdaVarZza.zza();
                if (billingResultZza != zzce.zzl) {
                    billingClientImpl.zzap(zzcb.zza(zzdaVarZza.zzb(), 9, billingResultZza));
                    return new zzcz(billingResultZza, list);
                }
                ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z = false;
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str2 = stringArrayList2.get(i2);
                    String str3 = stringArrayList3.get(i2);
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i2))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e);
                        billingClientImpl.zzap(zzcb.zza(51, 9, zzce.zzj));
                        return new zzcz(zzce.zzj, null);
                    }
                }
                if (z) {
                    billingClientImpl.zzap(zzcb.zza(26, 9, zzce.zzj));
                }
                string = bundleZzj.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new zzcz(zzce.zzl, arrayList);
                }
                list = null;
            } catch (Exception e2) {
                billingClientImpl.zzap(zzcb.zza(52, 9, zzce.zzm));
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new zzcz(zzce.zzm, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler zzaj() {
        return Looper.myLooper() == null ? this.zzc : new Handler(Looper.myLooper());
    }

    private final BillingResult zzak(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zzc.post(new Runnable() { // from class: com.android.billingclient.api.zzq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzS(billingResult);
            }
        });
        return billingResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BillingResult zzal() {
        return (this.zza == 0 || this.zza == 3) ? zzce.zzm : zzce.zzj;
    }

    private final String zzam(QueryProductDetailsParams queryProductDetailsParams) {
        if (TextUtils.isEmpty(null)) {
            return this.zze.getPackageName();
        }
        return null;
    }

    private static String zzan() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Future zzao(Callable callable, long j, final Runnable runnable, Handler handler) {
        if (this.zzB == null) {
            this.zzB = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzb.zza, new zzat(this));
        }
        try {
            final Future futureSubmit = this.zzB.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzy
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzap(zzga zzgaVar) {
        this.zzf.zzb(zzgaVar, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaq(zzge zzgeVar) {
        this.zzf.zzd(zzgeVar, this.zzk);
    }

    private final void zzar(String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 11, zzce.zzm));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzce.zzm, null);
        } else if (zzao(new zzav(this, str, purchaseHistoryResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzam
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaa(purchaseHistoryResponseListener);
            }
        }, zzaj()) == null) {
            BillingResult billingResultZzal = zzal();
            zzap(zzcb.zza(25, 11, billingResultZzal));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResultZzal, null);
        }
    }

    private final void zzas(String str, final PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 9, zzce.zzm));
            purchasesResponseListener.onQueryPurchasesResponse(zzce.zzm, com.google.android.gms.internal.play_billing.zzai.zzk());
        } else if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please provide a valid product type.");
            zzap(zzcb.zza(50, 9, zzce.zzg));
            purchasesResponseListener.onQueryPurchasesResponse(zzce.zzg, com.google.android.gms.internal.play_billing.zzai.zzk());
        } else if (zzao(new zzau(this, str, purchasesResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzae
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzab(purchasesResponseListener);
            }
        }, zzaj()) == null) {
            BillingResult billingResultZzal = zzal();
            zzap(zzcb.zza(25, 9, billingResultZzal));
            purchasesResponseListener.onQueryPurchasesResponse(billingResultZzal, com.google.android.gms.internal.play_billing.zzai.zzk());
        }
    }

    private final boolean zzat() {
        return this.zzv && this.zzz.isEnabledForPrepaidPlans();
    }

    private final void zzau(BillingResult billingResult, int i, int i2) {
        zzge zzgeVar = null;
        zzga zzgaVar = null;
        if (billingResult.getResponseCode() == 0) {
            int i3 = zzcb.zza;
            try {
                zzgd zzgdVarZzy = zzge.zzy();
                zzgdVarZzy.zzm(5);
                zzgz zzgzVarZzy = zzhb.zzy();
                zzgzVarZzy.zzl(i2);
                zzgdVarZzy.zzl((zzhb) zzgzVarZzy.zzf());
                zzgeVar = (zzge) zzgdVarZzy.zzf();
            } catch (Exception e) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
            }
            zzaq(zzgeVar);
            return;
        }
        int i4 = zzcb.zza;
        try {
            zzfz zzfzVarZzy = zzga.zzy();
            zzgg zzggVarZzy = zzgk.zzy();
            zzggVarZzy.zzn(billingResult.getResponseCode());
            zzggVarZzy.zzm(billingResult.getDebugMessage());
            zzggVarZzy.zzo(i);
            zzfzVarZzy.zzl(zzggVarZzy);
            zzfzVarZzy.zzn(5);
            zzgz zzgzVarZzy2 = zzhb.zzy();
            zzgzVarZzy2.zzl(i2);
            zzfzVarZzy.zzm((zzhb) zzgzVarZzy2.zzf());
            zzgaVar = (zzga) zzfzVarZzy.zzf();
        } catch (Exception e2) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e2);
        }
        zzap(zzgaVar);
    }

    static /* bridge */ /* synthetic */ zzbt zzg(BillingClientImpl billingClientImpl, String str) {
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzc = com.google.android.gms.internal.play_billing.zzb.zzc(billingClientImpl.zzn, billingClientImpl.zzv, billingClientImpl.zzz.isEnabledForOneTimeProducts(), billingClientImpl.zzz.isEnabledForPrepaidPlans(), billingClientImpl.zzb);
        String string = null;
        while (billingClientImpl.zzl) {
            try {
                Bundle bundleZzh = billingClientImpl.zzg.zzh(6, billingClientImpl.zze.getPackageName(), str, string, bundleZzc);
                zzda zzdaVarZza = zzdb.zza(bundleZzh, "BillingClient", "getPurchaseHistory()");
                BillingResult billingResultZza = zzdaVarZza.zza();
                if (billingResultZza != zzce.zzl) {
                    billingClientImpl.zzap(zzcb.zza(zzdaVarZza.zzb(), 11, billingResultZza));
                    return new zzbt(billingResultZza, null);
                }
                ArrayList<String> stringArrayList = bundleZzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z = false;
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str2 = stringArrayList2.get(i);
                    String str3 = stringArrayList3.get(i);
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str2, str3);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e) {
                        com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e);
                        billingClientImpl.zzap(zzcb.zza(51, 11, zzce.zzj));
                        return new zzbt(zzce.zzj, null);
                    }
                }
                if (z) {
                    billingClientImpl.zzap(zzcb.zza(26, 11, zzce.zzj));
                }
                string = bundleZzh.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new zzbt(zzce.zzl, arrayList);
                }
            } catch (RemoteException e2) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got exception trying to get purchase history, try to reconnect", e2);
                billingClientImpl.zzap(zzcb.zza(59, 11, zzce.zzm));
                return new zzbt(zzce.zzm, null);
            }
        }
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getPurchaseHistory is not supported on current device");
        return new zzbt(zzce.zzq, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 3, zzce.zzm));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzce.zzm);
            return;
        }
        if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please provide a valid purchase token.");
            zzap(zzcb.zza(26, 3, zzce.zzi));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzce.zzi);
        } else if (!this.zzn) {
            zzap(zzcb.zza(27, 3, zzce.zzb));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzce.zzb);
        } else if (zzao(new Callable() { // from class: com.android.billingclient.api.zzu
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzk(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzR(acknowledgePurchaseResponseListener);
            }
        }, zzaj()) == null) {
            BillingResult billingResultZzal = zzal();
            zzap(zzcb.zza(25, 3, billingResultZzal));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResultZzal);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 4, zzce.zzm));
            consumeResponseListener.onConsumeResponse(zzce.zzm, consumeParams.getPurchaseToken());
        } else if (zzao(new Callable() { // from class: com.android.billingclient.api.zzah
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzl(consumeParams, consumeResponseListener);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzai
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzT(consumeResponseListener, consumeParams);
            }
        }, zzaj()) == null) {
            BillingResult billingResultZzal = zzal();
            zzap(zzcb.zza(25, 4, billingResultZzal));
            consumeResponseListener.onConsumeResponse(billingResultZzal, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 15, zzce.zzm));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzce.zzm, null);
        } else if (!this.zzx) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support alternative billing only.");
            zzap(zzcb.zza(66, 15, zzce.zzE));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzce.zzE, null);
        } else if (zzao(new Callable() { // from class: com.android.billingclient.api.zzz
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzq(alternativeBillingOnlyReportingDetailsListener);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzaa
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzU(alternativeBillingOnlyReportingDetailsListener);
            }
        }, zzaj()) == null) {
            BillingResult billingResultZzal = zzal();
            zzap(zzcb.zza(25, 15, billingResultZzal));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResultZzal, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 24, zzce.zzm));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzce.zzm, null);
        } else if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support external offer.");
            zzap(zzcb.zza(103, 24, zzce.zzy));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzce.zzy, null);
        } else if (zzao(new Callable() { // from class: com.android.billingclient.api.zzab
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzr(externalOfferReportingDetailsListener);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzak
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzV(externalOfferReportingDetailsListener);
            }
        }, zzaj()) == null) {
            BillingResult billingResultZzal = zzal();
            zzap(zzcb.zza(25, 24, billingResultZzal));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResultZzal, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void endConnection() {
        zzaq(zzcb.zzc(12));
        try {
            try {
                if (this.zzd != null) {
                    this.zzd.zzf();
                }
                if (this.zzh != null) {
                    this.zzh.zzc();
                }
                if (this.zzh != null && this.zzg != null) {
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Unbinding from service.");
                    this.zze.unbindService(this.zzh);
                    this.zzh = null;
                }
                this.zzg = null;
                ExecutorService executorService = this.zzB;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.zzB = null;
                }
            } catch (Exception e) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "There was an exception while ending connection!", e);
            }
        } finally {
            this.zza = 3;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Service disconnected.");
            zzap(zzcb.zza(2, 13, zzce.zzm));
            billingConfigResponseListener.onBillingConfigResponse(zzce.zzm, null);
        } else {
            if (!this.zzu) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support get billing config.");
                zzap(zzcb.zza(32, 13, zzce.zzA));
                billingConfigResponseListener.onBillingConfigResponse(zzce.zzA, null);
                return;
            }
            String str = this.zzb;
            final Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            if (zzao(new Callable() { // from class: com.android.billingclient.api.zzw
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzm(bundle, billingConfigResponseListener);
                    return null;
                }
            }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzW(billingConfigResponseListener);
                }
            }, zzaj()) == null) {
                BillingResult billingResultZzal = zzal();
                zzap(zzcb.zza(25, 13, billingResultZzal));
                billingConfigResponseListener.onBillingConfigResponse(billingResultZzal, null);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        return this.zza;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 14, zzce.zzm));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzce.zzm);
        } else if (!this.zzx) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support alternative billing only.");
            zzap(zzcb.zza(66, 14, zzce.zzE));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzce.zzE);
        } else if (zzao(new Callable() { // from class: com.android.billingclient.api.zzaf
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzs(alternativeBillingOnlyAvailabilityListener);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzag
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzX(alternativeBillingOnlyAvailabilityListener);
            }
        }, zzaj()) == null) {
            BillingResult billingResultZzal = zzal();
            zzap(zzcb.zza(25, 14, billingResultZzal));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResultZzal);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 23, zzce.zzm));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzce.zzm);
        } else if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support external offer.");
            zzap(zzcb.zza(103, 23, zzce.zzy));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzce.zzy);
        } else if (zzao(new Callable() { // from class: com.android.billingclient.api.zzaq
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzt(externalOfferAvailabilityListener);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzar
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzY(externalOfferAvailabilityListener);
            }
        }, zzaj()) == null) {
            BillingResult billingResultZzal = zzal();
            zzap(zzcb.zza(25, 23, billingResultZzal));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResultZzal);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult isFeatureSupported(String str) {
        if (!isReady()) {
            BillingResult billingResult = zzce.zzm;
            if (billingResult.getResponseCode() != 0) {
                zzap(zzcb.zza(2, 5, billingResult));
            } else {
                zzaq(zzcb.zzc(5));
            }
            return zzce.zzm;
        }
        int i = zzce.zzG;
        switch (str) {
            case "subscriptions":
                BillingResult billingResult2 = this.zzi ? zzce.zzl : zzce.zzo;
                zzau(billingResult2, 9, 2);
                return billingResult2;
            case "subscriptionsUpdate":
                BillingResult billingResult3 = this.zzj ? zzce.zzl : zzce.zzp;
                zzau(billingResult3, 10, 3);
                return billingResult3;
            case "priceChangeConfirmation":
                BillingResult billingResult4 = this.zzm ? zzce.zzl : zzce.zzr;
                zzau(billingResult4, 35, 4);
                return billingResult4;
            case "bbb":
                BillingResult billingResult5 = this.zzp ? zzce.zzl : zzce.zzw;
                zzau(billingResult5, 30, 5);
                return billingResult5;
            case "aaa":
                BillingResult billingResult6 = this.zzr ? zzce.zzl : zzce.zzs;
                zzau(billingResult6, 31, 6);
                return billingResult6;
            case "ddd":
                BillingResult billingResult7 = this.zzq ? zzce.zzl : zzce.zzu;
                zzau(billingResult7, 21, 7);
                return billingResult7;
            case "ccc":
                BillingResult billingResult8 = this.zzs ? zzce.zzl : zzce.zzt;
                zzau(billingResult8, 19, 8);
                return billingResult8;
            case "eee":
                BillingResult billingResult9 = this.zzs ? zzce.zzl : zzce.zzt;
                zzau(billingResult9, 61, 9);
                return billingResult9;
            case "fff":
                BillingResult billingResult10 = this.zzt ? zzce.zzl : zzce.zzv;
                zzau(billingResult10, 20, 10);
                return billingResult10;
            case "ggg":
                BillingResult billingResult11 = this.zzu ? zzce.zzl : zzce.zzA;
                zzau(billingResult11, 32, 11);
                return billingResult11;
            case "hhh":
                BillingResult billingResult12 = this.zzu ? zzce.zzl : zzce.zzB;
                zzau(billingResult12, 33, 12);
                return billingResult12;
            case "iii":
                BillingResult billingResult13 = this.zzw ? zzce.zzl : zzce.zzD;
                zzau(billingResult13, 60, 13);
                return billingResult13;
            case "jjj":
                BillingResult billingResult14 = this.zzx ? zzce.zzl : zzce.zzE;
                zzau(billingResult14, 66, 14);
                return billingResult14;
            case "kkk":
                BillingResult billingResult15 = this.zzy ? zzce.zzl : zzce.zzy;
                zzau(billingResult15, 103, 18);
                return billingResult15;
            default:
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Unsupported feature: ".concat(String.valueOf(str)));
                zzau(zzce.zzz, 34, 1);
                return zzce.zzz;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        return (this.zza != 2 || this.zzg == null || this.zzh == null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:157:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:159:0x0402  */
    /* JADX WARN: Code duplicated, block: B:172:0x0433  */
    /* JADX WARN: Code duplicated, block: B:174:0x0437 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x043c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0440  */
    /* JADX WARN: Code duplicated, block: B:179:0x0443  */
    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult launchBillingFlow(Activity activity, final BillingFlowParams billingFlowParams) {
        final String productId;
        final String productType;
        String str;
        Future futureZzao;
        int i;
        boolean z;
        String str2;
        SkuDetails skuDetails;
        BillingFlowParams.ProductDetailsParams productDetailsParams;
        String str3;
        String str4;
        String str5;
        boolean z2;
        Intent intent;
        String str6;
        int i2;
        final int i3;
        final BillingClientImpl billingClientImpl = this;
        if (billingClientImpl.zzd == null || billingClientImpl.zzd.zzd() == null) {
            billingClientImpl.zzap(zzcb.zza(12, 2, zzce.zzF));
            return zzce.zzF;
        }
        if (!isReady()) {
            billingClientImpl.zzap(zzcb.zza(2, 2, zzce.zzm));
            BillingResult billingResult = zzce.zzm;
            billingClientImpl.zzak(billingResult);
            return billingResult;
        }
        ArrayList<SkuDetails> arrayListZzf = billingFlowParams.zzf();
        List listZzg = billingFlowParams.zzg();
        SkuDetails skuDetails2 = (SkuDetails) com.google.android.gms.internal.play_billing.zzan.zza(arrayListZzf, null);
        BillingFlowParams.ProductDetailsParams productDetailsParams2 = (BillingFlowParams.ProductDetailsParams) com.google.android.gms.internal.play_billing.zzan.zza(listZzg, null);
        if (skuDetails2 != null) {
            productId = skuDetails2.getSku();
            productType = skuDetails2.getType();
        } else {
            productId = productDetailsParams2.zza().getProductId();
            productType = productDetailsParams2.zza().getProductType();
        }
        if (productType.equals("subs") && !billingClientImpl.zzi) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support subscriptions.");
            billingClientImpl.zzap(zzcb.zza(9, 2, zzce.zzo));
            BillingResult billingResult2 = zzce.zzo;
            billingClientImpl.zzak(billingResult2);
            return billingResult2;
        }
        if (billingFlowParams.zzp() && !billingClientImpl.zzl) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support extra params for buy intent.");
            billingClientImpl.zzap(zzcb.zza(18, 2, zzce.zzh));
            BillingResult billingResult3 = zzce.zzh;
            billingClientImpl.zzak(billingResult3);
            return billingResult3;
        }
        if (arrayListZzf.size() > 1 && !billingClientImpl.zzs) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support multi-item purchases.");
            billingClientImpl.zzap(zzcb.zza(19, 2, zzce.zzt));
            BillingResult billingResult4 = zzce.zzt;
            billingClientImpl.zzak(billingResult4);
            return billingResult4;
        }
        if (!listZzg.isEmpty() && !billingClientImpl.zzt) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            billingClientImpl.zzap(zzcb.zza(20, 2, zzce.zzv));
            BillingResult billingResult5 = zzce.zzv;
            billingClientImpl.zzak(billingResult5);
            return billingResult5;
        }
        if (billingClientImpl.zzl) {
            boolean z3 = billingClientImpl.zzn;
            boolean z4 = billingClientImpl.zzv;
            boolean zIsEnabledForOneTimeProducts = billingClientImpl.zzz.isEnabledForOneTimeProducts();
            boolean zIsEnabledForPrepaidPlans = billingClientImpl.zzz.isEnabledForPrepaidPlans();
            boolean z5 = billingClientImpl.zzA;
            String str7 = billingClientImpl.zzb;
            final Bundle bundle = new Bundle();
            final String str8 = productType;
            bundle.putString("playBillingLibraryVersion", str7);
            if (billingFlowParams.zza() != 0) {
                bundle.putInt("prorationMode", billingFlowParams.zza());
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzb())) {
                bundle.putString(BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, billingFlowParams.zzb());
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzc())) {
                bundle.putString("obfuscatedProfileId", billingFlowParams.zzc());
            }
            if (billingFlowParams.zzo()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzd())) {
                bundle.putString("oldSkuPurchaseToken", billingFlowParams.zzd());
            }
            String str9 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(billingFlowParams.zze())) {
                bundle.putString("originalExternalTransactionId", billingFlowParams.zze());
                str9 = null;
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString("paymentsPurchaseParams", str9);
            }
            if (z3 && zIsEnabledForOneTimeProducts) {
                z = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z = true;
            }
            if (z4 && zIsEnabledForPrepaidPlans) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z);
            }
            if (z5) {
                bundle.putBoolean("enableAlternativeBilling", z);
            }
            if (arrayListZzf.isEmpty()) {
                str2 = "proxyPackageVersion";
                skuDetails = skuDetails2;
                productDetailsParams = productDetailsParams2;
                str3 = productId;
                str4 = "BillingClient";
                ArrayList<String> arrayList = new ArrayList<>(listZzg.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(listZzg.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                for (int i4 = 0; i4 < listZzg.size(); i4++) {
                    BillingFlowParams.ProductDetailsParams productDetailsParams3 = (BillingFlowParams.ProductDetailsParams) listZzg.get(i4);
                    ProductDetails productDetailsZza = productDetailsParams3.zza();
                    if (!productDetailsZza.zzb().isEmpty()) {
                        arrayList3.add(productDetailsZza.zzb());
                    }
                    arrayList4.add(productDetailsParams3.zzb());
                    if (!TextUtils.isEmpty(productDetailsZza.zzc())) {
                        arrayList5.add(productDetailsZza.zzc());
                    }
                    if (i4 > 0) {
                        arrayList.add(((BillingFlowParams.ProductDetailsParams) listZzg.get(i4)).zza().getProductId());
                        arrayList2.add(((BillingFlowParams.ProductDetailsParams) listZzg.get(i4)).zza().getProductType());
                    }
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                if (!arrayList3.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList6 = new ArrayList<>();
                ArrayList<String> arrayList7 = new ArrayList<>();
                str3 = productId;
                ArrayList<String> arrayList8 = new ArrayList<>();
                str2 = "proxyPackageVersion";
                ArrayList<Integer> arrayList9 = new ArrayList<>();
                str4 = "BillingClient";
                ArrayList<String> arrayList10 = new ArrayList<>();
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                for (SkuDetails skuDetails3 : arrayListZzf) {
                    if (!skuDetails3.zzf().isEmpty()) {
                        arrayList6.add(skuDetails3.zzf());
                    }
                    String strZzc = skuDetails3.zzc();
                    SkuDetails skuDetails4 = skuDetails2;
                    String strZzb = skuDetails3.zzb();
                    int iZza = skuDetails3.zza();
                    String strZze = skuDetails3.zze();
                    arrayList7.add(strZzc);
                    z6 |= !TextUtils.isEmpty(strZzc);
                    arrayList8.add(strZzb);
                    z7 |= !TextUtils.isEmpty(strZzb);
                    arrayList9.add(Integer.valueOf(iZza));
                    z8 |= iZza != 0;
                    z9 |= !TextUtils.isEmpty(strZze);
                    arrayList10.add(strZze);
                    productDetailsParams2 = productDetailsParams2;
                    skuDetails2 = skuDetails4;
                }
                skuDetails = skuDetails2;
                productDetailsParams = productDetailsParams2;
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList6);
                }
                if (z6) {
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList7);
                }
                if (z7) {
                    bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList8);
                }
                if (z8) {
                    bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList9);
                }
                if (z9) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList10);
                }
                if (arrayListZzf.size() > 1) {
                    ArrayList<String> arrayList11 = new ArrayList<>(arrayListZzf.size() - 1);
                    ArrayList<String> arrayList12 = new ArrayList<>(arrayListZzf.size() - 1);
                    for (int i5 = 1; i5 < arrayListZzf.size(); i5++) {
                        arrayList11.add(((SkuDetails) arrayListZzf.get(i5)).getSku());
                        arrayList12.add(((SkuDetails) arrayListZzf.get(i5)).getType());
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList11);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList12);
                }
            }
            billingClientImpl = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !billingClientImpl.zzq) {
                billingClientImpl.zzap(zzcb.zza(21, 2, zzce.zzu));
                BillingResult billingResult6 = zzce.zzu;
                billingClientImpl.zzak(billingResult6);
                return billingResult6;
            }
            if (skuDetails == null || TextUtils.isEmpty(skuDetails.zzd())) {
                if (productDetailsParams == null || TextUtils.isEmpty(productDetailsParams.zza().zza())) {
                    str5 = null;
                    z2 = false;
                } else {
                    bundle.putString("skuPackageName", productDetailsParams.zza().zza());
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("accountName", str5);
                }
                intent = activity.getIntent();
                if (intent == null) {
                    str = str4;
                    com.google.android.gms.internal.play_billing.zzb.zzk(str, "Activity's intent is null.");
                } else {
                    str = str4;
                    if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                        String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                        bundle.putString("proxyPackage", stringExtra);
                        try {
                            str6 = str2;
                            try {
                                bundle.putString(str6, billingClientImpl.zze.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                            } catch (PackageManager.NameNotFoundException unused) {
                                bundle.putString(str6, "package not found");
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str6 = str2;
                        }
                    }
                }
                if (!billingClientImpl.zzt && !listZzg.isEmpty()) {
                    i2 = 17;
                } else if (billingClientImpl.zzr || !z2) {
                    if (billingClientImpl.zzn) {
                        i3 = 9;
                    } else {
                        i2 = 6;
                    }
                    final String str10 = str3;
                    futureZzao = zzao(new Callable() { // from class: com.android.billingclient.api.zzas
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zza.zzc(i3, str10, str8, billingFlowParams, bundle);
                        }
                    }, 5000L, null, billingClientImpl.zzc);
                    i = 78;
                } else {
                    i2 = 15;
                }
                i3 = i2;
                final String str11 = str3;
                futureZzao = zzao(new Callable() { // from class: com.android.billingclient.api.zzas
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzc(i3, str11, str8, billingFlowParams, bundle);
                    }
                }, 5000L, null, billingClientImpl.zzc);
                i = 78;
            } else {
                bundle.putString("skuPackageName", skuDetails.zzd());
            }
            str5 = null;
            z2 = true;
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("accountName", str5);
            }
            intent = activity.getIntent();
            if (intent == null) {
                str = str4;
                com.google.android.gms.internal.play_billing.zzb.zzk(str, "Activity's intent is null.");
            } else {
                str = str4;
                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra2 = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra2);
                    str6 = str2;
                    bundle.putString(str6, billingClientImpl.zze.getPackageManager().getPackageInfo(stringExtra2, 0).versionName);
                }
            }
            if (!billingClientImpl.zzt) {
                if (billingClientImpl.zzr) {
                    if (billingClientImpl.zzn) {
                        i3 = 9;
                    } else {
                        i2 = 6;
                        i3 = i2;
                    }
                } else if (billingClientImpl.zzn) {
                    i3 = 9;
                } else {
                    i2 = 6;
                    i3 = i2;
                }
            } else if (billingClientImpl.zzr) {
                if (billingClientImpl.zzn) {
                    i3 = 9;
                } else {
                    i2 = 6;
                    i3 = i2;
                }
            } else if (billingClientImpl.zzn) {
                i3 = 9;
            } else {
                i2 = 6;
                i3 = i2;
            }
            final String str12 = str3;
            futureZzao = zzao(new Callable() { // from class: com.android.billingclient.api.zzas
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzc(i3, str12, str8, billingFlowParams, bundle);
                }
            }, 5000L, null, billingClientImpl.zzc);
            i = 78;
        } else {
            str = "BillingClient";
            futureZzao = zzao(new Callable() { // from class: com.android.billingclient.api.zzr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzd(productId, productType);
                }
            }, 5000L, null, billingClientImpl.zzc);
            i = 80;
        }
        try {
            if (futureZzao == null) {
                billingClientImpl.zzap(zzcb.zza(25, 2, zzce.zzm));
                BillingResult billingResult7 = zzce.zzm;
                billingClientImpl.zzak(billingResult7);
                return billingResult7;
            }
            Bundle bundle2 = (Bundle) futureZzao.get(5000L, TimeUnit.MILLISECONDS);
            int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle2, str);
            String strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundle2, str);
            if (iZzb == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                activity.startActivity(intent2);
                return zzce.zzl;
            }
            com.google.android.gms.internal.play_billing.zzb.zzk(str, "Unable to buy item, Error response code: " + iZzb);
            BillingResult billingResultZza = zzce.zza(iZzb, strZzg);
            if (bundle2 != null) {
                i = 23;
            }
            billingClientImpl.zzap(zzcb.zza(i, 2, billingResultZza));
            billingClientImpl.zzak(billingResultZza);
            return billingResultZza;
        } catch (CancellationException e) {
            e = e;
            com.google.android.gms.internal.play_billing.zzb.zzl(str, "Time out while launching billing flow. Try to reconnect", e);
            billingClientImpl.zzap(zzcb.zza(4, 2, zzce.zzn));
            BillingResult billingResult8 = zzce.zzn;
            billingClientImpl.zzak(billingResult8);
            return billingResult8;
        } catch (TimeoutException e2) {
            e = e2;
            com.google.android.gms.internal.play_billing.zzb.zzl(str, "Time out while launching billing flow. Try to reconnect", e);
            billingClientImpl.zzap(zzcb.zza(4, 2, zzce.zzn));
            BillingResult billingResult9 = zzce.zzn;
            billingClientImpl.zzak(billingResult9);
            return billingResult9;
        } catch (Exception e3) {
            com.google.android.gms.internal.play_billing.zzb.zzl(str, "Exception while launching billing flow. Try to reconnect", e3);
            billingClientImpl.zzap(zzcb.zza(5, 2, zzce.zzm));
            BillingResult billingResult10 = zzce.zzm;
            billingClientImpl.zzak(billingResult10);
            return billingResult10;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 7, zzce.zzm));
            productDetailsResponseListener.onProductDetailsResponse(zzce.zzm, new ArrayList());
        } else if (!this.zzt) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Querying product details is not supported.");
            zzap(zzcb.zza(20, 7, zzce.zzv));
            productDetailsResponseListener.onProductDetailsResponse(zzce.zzv, new ArrayList());
        } else if (zzao(new Callable() { // from class: com.android.billingclient.api.zzan
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzn(queryProductDetailsParams, productDetailsResponseListener);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzao
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzZ(productDetailsResponseListener);
            }
        }, zzaj()) == null) {
            BillingResult billingResultZzal = zzal();
            zzap(zzcb.zza(25, 7, billingResultZzal));
            productDetailsResponseListener.onProductDetailsResponse(billingResultZzal, new ArrayList());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzar(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        zzas(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 8, zzce.zzm));
            skuDetailsResponseListener.onSkuDetailsResponse(zzce.zzm, null);
            return;
        }
        final String skuType = skuDetailsParams.getSkuType();
        final List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please fix the input params. SKU type can't be empty.");
            zzap(zzcb.zza(49, 8, zzce.zzf));
            skuDetailsResponseListener.onSkuDetailsResponse(zzce.zzf, null);
        } else if (skusList == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            zzap(zzcb.zza(48, 8, zzce.zze));
            skuDetailsResponseListener.onSkuDetailsResponse(zzce.zze, null);
        } else {
            final String str = null;
            if (zzao(new Callable(skuType, skusList, str, skuDetailsResponseListener) { // from class: com.android.billingclient.api.zzac
                public final /* synthetic */ String zzb;
                public final /* synthetic */ List zzc;
                public final /* synthetic */ SkuDetailsResponseListener zzd;

                {
                    this.zzd = skuDetailsResponseListener;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzo(this.zzb, this.zzc, null, this.zzd);
                    return null;
                }
            }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzad
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzac(skuDetailsResponseListener);
                }
            }, zzaj()) == null) {
                BillingResult billingResultZzal = zzal();
                zzap(zzcb.zza(25, 8, billingResultZzal));
                skuDetailsResponseListener.onSkuDetailsResponse(billingResultZzal, null);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Service disconnected.");
            return zzce.zzm;
        }
        if (!this.zzp) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support showing in-app messages.");
            return zzce.zzw;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        BundleCompat.putBinder(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.zzb);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
        final zzaw zzawVar = new zzaw(this, this.zzc, inAppMessageResponseListener);
        zzao(new Callable() { // from class: com.android.billingclient.api.zzap
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzp(bundle, activity, zzawVar);
                return null;
            }
        }, 5000L, null, this.zzc);
        return zzce.zzl;
    }

    final /* synthetic */ void zzR(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        zzap(zzcb.zza(24, 3, zzce.zzn));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzce.zzn);
    }

    final /* synthetic */ void zzS(BillingResult billingResult) {
        if (this.zzd.zzd() != null) {
            this.zzd.zzd().onPurchasesUpdated(billingResult, null);
        } else {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    final /* synthetic */ void zzT(ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        zzap(zzcb.zza(24, 4, zzce.zzn));
        consumeResponseListener.onConsumeResponse(zzce.zzn, consumeParams.getPurchaseToken());
    }

    final /* synthetic */ void zzU(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        zzap(zzcb.zza(24, 15, zzce.zzn));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzce.zzn, null);
    }

    final /* synthetic */ void zzV(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        zzap(zzcb.zza(24, 24, zzce.zzn));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzce.zzn, null);
    }

    final /* synthetic */ void zzW(BillingConfigResponseListener billingConfigResponseListener) {
        zzap(zzcb.zza(24, 13, zzce.zzn));
        billingConfigResponseListener.onBillingConfigResponse(zzce.zzn, null);
    }

    final /* synthetic */ void zzX(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        zzap(zzcb.zza(24, 14, zzce.zzn));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzce.zzn);
    }

    final /* synthetic */ void zzY(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        zzap(zzcb.zza(24, 23, zzce.zzn));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzce.zzn);
    }

    final /* synthetic */ void zzZ(ProductDetailsResponseListener productDetailsResponseListener) {
        zzap(zzcb.zza(24, 7, zzce.zzn));
        productDetailsResponseListener.onProductDetailsResponse(zzce.zzn, new ArrayList());
    }

    final /* synthetic */ void zzaa(PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzap(zzcb.zza(24, 11, zzce.zzn));
        purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzce.zzn, null);
    }

    final /* synthetic */ void zzab(PurchasesResponseListener purchasesResponseListener) {
        zzap(zzcb.zza(24, 9, zzce.zzn));
        purchasesResponseListener.onQueryPurchasesResponse(zzce.zzn, com.google.android.gms.internal.play_billing.zzai.zzk());
    }

    final /* synthetic */ void zzac(SkuDetailsResponseListener skuDetailsResponseListener) {
        zzap(zzcb.zza(24, 8, zzce.zzn));
        skuDetailsResponseListener.onSkuDetailsResponse(zzce.zzn, null);
    }

    final /* synthetic */ void zzad(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        zzap(zzcb.zza(24, 16, zzce.zzn));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(zzce.zzn);
    }

    final /* synthetic */ void zzae(ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        zzap(zzcb.zza(24, 25, zzce.zzn));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(zzce.zzn);
    }

    final /* synthetic */ Bundle zzc(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        return this.zzg.zzg(i, this.zze.getPackageName(), str, str2, null, bundle);
    }

    final /* synthetic */ Bundle zzd(String str, String str2) throws Exception {
        return this.zzg.zzf(3, this.zze.getPackageName(), str, str2, null);
    }

    final /* synthetic */ Object zzk(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) throws Exception {
        try {
            com.google.android.gms.internal.play_billing.zzs zzsVar = this.zzg;
            String packageName = this.zze.getPackageName();
            String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
            String str = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle bundleZzd = zzsVar.zzd(9, packageName, purchaseToken, bundle);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzce.zza(com.google.android.gms.internal.play_billing.zzb.zzb(bundleZzd, "BillingClient"), com.google.android.gms.internal.play_billing.zzb.zzg(bundleZzd, "BillingClient")));
            return null;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error acknowledge purchase!", e);
            zzap(zzcb.zza(28, 3, zzce.zzm));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzce.zzm);
            return null;
        }
    }

    final /* synthetic */ Object zzl(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Exception {
        int iZza;
        String strZzg;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Consuming purchase with token: " + purchaseToken);
            if (this.zzn) {
                com.google.android.gms.internal.play_billing.zzs zzsVar = this.zzg;
                String packageName = this.zze.getPackageName();
                boolean z = this.zzn;
                String str = this.zzb;
                Bundle bundle = new Bundle();
                if (z) {
                    bundle.putString("playBillingLibraryVersion", str);
                }
                Bundle bundleZze = zzsVar.zze(9, packageName, purchaseToken, bundle);
                iZza = bundleZze.getInt("RESPONSE_CODE");
                strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundleZze, "BillingClient");
            } else {
                iZza = this.zzg.zza(3, this.zze.getPackageName(), purchaseToken);
                strZzg = "";
            }
            BillingResult billingResultZza = zzce.zza(iZza, strZzg);
            if (iZza == 0) {
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(billingResultZza, purchaseToken);
                return null;
            }
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Error consuming purchase with token. Response code: " + iZza);
            zzap(zzcb.zza(23, 4, billingResultZza));
            consumeResponseListener.onConsumeResponse(billingResultZza, purchaseToken);
            return null;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error consuming purchase!", e);
            zzap(zzcb.zza(29, 4, zzce.zzm));
            consumeResponseListener.onConsumeResponse(zzce.zzm, purchaseToken);
            return null;
        }
    }

    final /* synthetic */ Object zzm(Bundle bundle, BillingConfigResponseListener billingConfigResponseListener) throws Exception {
        try {
            this.zzg.zzp(18, this.zze.getPackageName(), bundle, new zzbk(billingConfigResponseListener, this.zzf, this.zzk, null));
        } catch (DeadObjectException e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "getBillingConfig got a dead object exception (try to reconnect).", e);
            zzap(zzcb.zza(62, 13, zzce.zzm));
            billingConfigResponseListener.onBillingConfigResponse(zzce.zzm, null);
        } catch (Exception e2) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "getBillingConfig got an exception.", e2);
            zzap(zzcb.zza(62, 13, zzce.zzj));
            billingConfigResponseListener.onBillingConfigResponse(zzce.zzj, null);
        }
        return null;
    }

    final /* synthetic */ Object zzn(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) throws Exception {
        String strZzg;
        int iZzb;
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        String strZzb = queryProductDetailsParams.zzb();
        com.google.android.gms.internal.play_billing.zzai zzaiVarZza = queryProductDetailsParams.zza();
        int size = zzaiVarZza.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                strZzg = "";
                iZzb = 0;
                break;
            }
            int i4 = i3 + 20;
            ArrayList arrayList2 = new ArrayList(zzaiVarZza.subList(i3, i4 > size ? size : i4));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList3.add(((QueryProductDetailsParams.Product) arrayList2.get(i5)).zza());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            try {
                com.google.android.gms.internal.play_billing.zzs zzsVar = this.zzg;
                int i6 = true != this.zzw ? 17 : 20;
                String packageName = this.zze.getPackageName();
                boolean zZzat = zzat();
                String str = this.zzb;
                zzam(queryProductDetailsParams);
                zzam(queryProductDetailsParams);
                zzam(queryProductDetailsParams);
                Bundle bundle2 = new Bundle();
                bundle2.putString("playBillingLibraryVersion", str);
                bundle2.putBoolean("enablePendingPurchases", true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (zZzat) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                com.google.android.gms.internal.play_billing.zzai zzaiVar = zzaiVarZza;
                int i7 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i7 < size3) {
                    QueryProductDetailsParams.Product product = (QueryProductDetailsParams.Product) arrayList2.get(i7);
                    ArrayList arrayList6 = arrayList2;
                    arrayList4.add(null);
                    z |= !TextUtils.isEmpty(null);
                    String strZzb2 = product.zzb();
                    int i8 = size3;
                    if (strZzb2.equals("first_party")) {
                        com.google.android.gms.internal.play_billing.zzaa.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add(null);
                        z2 = true;
                    }
                    i7++;
                    size3 = i8;
                    arrayList2 = arrayList6;
                }
                if (z) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z2 && !TextUtils.isEmpty(null)) {
                    bundle2.putString("accountName", null);
                }
                i2 = 7;
                try {
                    Bundle bundleZzl = zzsVar.zzl(i6, packageName, strZzb, bundle, bundle2);
                    strZzg = "Item is unavailable for purchase.";
                    if (bundleZzl == null) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "queryProductDetailsAsync got empty product details response.");
                        zzap(zzcb.zza(44, 7, zzce.zzC));
                    } else {
                        if (!bundleZzl.containsKey("DETAILS_LIST")) {
                            iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundleZzl, "BillingClient");
                            strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundleZzl, "BillingClient");
                            if (iZzb == 0) {
                                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                                zzap(zzcb.zza(45, 7, zzce.zza(6, strZzg)));
                                iZzb = 6;
                                break;
                            }
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iZzb);
                            zzap(zzcb.zza(23, 7, zzce.zza(iZzb, strZzg)));
                            break;
                        }
                        ArrayList<String> stringArrayList = bundleZzl.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "queryProductDetailsAsync got null response list");
                            zzap(zzcb.zza(46, 7, zzce.zzC));
                        } else {
                            for (int i9 = 0; i9 < stringArrayList.size(); i9++) {
                                try {
                                    ProductDetails productDetails = new ProductDetails(stringArrayList.get(i9));
                                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Got product details: ".concat(productDetails.toString()));
                                    arrayList.add(productDetails);
                                } catch (JSONException e) {
                                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                                    strZzg = "Error trying to decode SkuDetails.";
                                    i = 6;
                                    zzap(zzcb.zza(47, 7, zzce.zza(6, "Error trying to decode SkuDetails.")));
                                    iZzb = i;
                                    productDetailsResponseListener.onProductDetailsResponse(zzce.zza(iZzb, strZzg), arrayList);
                                    return null;
                                }
                            }
                            i3 = i4;
                            zzaiVarZza = zzaiVar;
                        }
                    }
                    iZzb = 4;
                    break;
                } catch (Exception e2) {
                    e = e2;
                    i = 6;
                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    zzap(zzcb.zza(43, i2, zzce.zzj));
                    strZzg = "An internal error occurred.";
                    iZzb = i;
                    productDetailsResponseListener.onProductDetailsResponse(zzce.zza(iZzb, strZzg), arrayList);
                    return null;
                }
            } catch (Exception e3) {
                e = e3;
                i = 6;
                i2 = 7;
            }
        }
        productDetailsResponseListener.onProductDetailsResponse(zzce.zza(iZzb, strZzg), arrayList);
        return null;
    }

    final /* synthetic */ Object zzo(String str, List list, String str2, SkuDetailsResponseListener skuDetailsResponseListener) throws Exception {
        String strZzg;
        int i;
        Bundle bundleZzk;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                strZzg = "";
                i = 0;
            } else {
                int i3 = i2 + 20;
                ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i2, i3 > size ? size : i3));
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
                bundle.putString("playBillingLibraryVersion", this.zzb);
                try {
                    if (this.zzo) {
                        com.google.android.gms.internal.play_billing.zzs zzsVar = this.zzg;
                        String packageName = this.zze.getPackageName();
                        int i4 = this.zzk;
                        boolean zIsEnabledForOneTimeProducts = this.zzz.isEnabledForOneTimeProducts();
                        boolean zZzat = zzat();
                        String str3 = this.zzb;
                        Bundle bundle2 = new Bundle();
                        if (i4 >= 9) {
                            bundle2.putString("playBillingLibraryVersion", str3);
                        }
                        if (i4 >= 9 && zIsEnabledForOneTimeProducts) {
                            bundle2.putBoolean("enablePendingPurchases", true);
                        }
                        if (zZzat) {
                            bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                        }
                        bundleZzk = zzsVar.zzl(10, packageName, str, bundle, bundle2);
                    } else {
                        bundleZzk = this.zzg.zzk(3, this.zze.getPackageName(), str, bundle);
                    }
                    strZzg = "Item is unavailable for purchase.";
                    if (bundleZzk == null) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "querySkuDetailsAsync got null sku details list");
                        zzap(zzcb.zza(44, 8, zzce.zzC));
                        break;
                    }
                    if (bundleZzk.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = bundleZzk.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "querySkuDetailsAsync got null response list");
                            zzap(zzcb.zza(46, 8, zzce.zzC));
                            break;
                        }
                        for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
                            try {
                                SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i5));
                                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                                arrayList.add(skuDetails);
                            } catch (JSONException e) {
                                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e);
                                strZzg = "Error trying to decode SkuDetails.";
                                zzap(zzcb.zza(47, 8, zzce.zza(6, "Error trying to decode SkuDetails.")));
                                i = 6;
                            }
                        }
                        i2 = i3;
                        arrayList = null;
                    } else {
                        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundleZzk, "BillingClient");
                        strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundleZzk, "BillingClient");
                        if (iZzb != 0) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() failed. Response code: " + iZzb);
                            zzap(zzcb.zza(23, 8, zzce.zza(iZzb, strZzg)));
                            i = iZzb;
                        } else {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                            zzap(zzcb.zza(45, 8, zzce.zza(6, strZzg)));
                            i = 6;
                        }
                    }
                } catch (Exception e2) {
                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
                    zzap(zzcb.zza(43, 8, zzce.zzm));
                    strZzg = "Service connection is disconnected.";
                    i = -1;
                }
            }
            skuDetailsResponseListener.onSkuDetailsResponse(zzce.zza(i, strZzg), arrayList);
            return null;
        }
        i = 4;
        arrayList = null;
        skuDetailsResponseListener.onSkuDetailsResponse(zzce.zza(i, strZzg), arrayList);
        return null;
    }

    final /* synthetic */ Object zzp(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        this.zzg.zzt(12, this.zze.getPackageName(), bundle, new zzbs(new WeakReference(activity), resultReceiver, null));
        return null;
    }

    final /* synthetic */ Void zzq(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws Exception {
        try {
            this.zzg.zzm(21, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbe(alternativeBillingOnlyReportingDetailsListener, this.zzf, this.zzk, null));
        } catch (Exception unused) {
            zzap(zzcb.zza(70, 15, zzce.zzj));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzce.zzj, null);
        }
        return null;
    }

    final /* synthetic */ Void zzr(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) throws Exception {
        try {
            this.zzg.zzn(22, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbg(externalOfferReportingDetailsListener, this.zzf, this.zzk, null));
        } catch (Exception e) {
            zzap(zzcb.zzb(94, 24, zzce.zzj, String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage()))));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzce.zzj, null);
        }
        return null;
    }

    final /* synthetic */ Void zzs(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) throws Exception {
        try {
            this.zzg.zzr(21, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbo(alternativeBillingOnlyAvailabilityListener, this.zzf, this.zzk, null));
        } catch (Exception unused) {
            zzap(zzcb.zza(69, 14, zzce.zzj));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzce.zzj);
        }
        return null;
    }

    final /* synthetic */ Void zzt(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws Exception {
        try {
            this.zzg.zzs(22, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbq(externalOfferAvailabilityListener, this.zzf, this.zzk, null));
        } catch (Exception e) {
            zzap(zzcb.zzb(91, 23, zzce.zzj, String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage()))));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzce.zzj);
        }
        return null;
    }

    final /* synthetic */ Void zzu(Activity activity, ResultReceiver resultReceiver, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) throws Exception {
        try {
            this.zzg.zzo(21, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbi(new WeakReference(activity), resultReceiver, null));
        } catch (Exception unused) {
            zzap(zzcb.zza(74, 16, zzce.zzj));
            alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(zzce.zzj);
        }
        return null;
    }

    final /* synthetic */ Void zzv(Activity activity, ResultReceiver resultReceiver, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) throws Exception {
        try {
            this.zzg.zzq(22, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbm(new WeakReference(activity), resultReceiver, null));
        } catch (Exception e) {
            zzap(zzcb.zzb(98, 25, zzce.zzj, String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage()))));
            externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(zzce.zzj);
        }
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzar(str, purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        zzas(str, purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            zzap(zzcb.zza(2, 16, zzce.zzm));
            return zzce.zzm;
        }
        if (!this.zzx) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            zzap(zzcb.zza(66, 16, zzce.zzE));
            return zzce.zzE;
        }
        final zzax zzaxVar = new zzax(this, this.zzc, alternativeBillingOnlyInformationDialogListener);
        if (zzao(new Callable() { // from class: com.android.billingclient.api.zzs
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzu(activity, zzaxVar, alternativeBillingOnlyInformationDialogListener);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzad(alternativeBillingOnlyInformationDialogListener);
            }
        }, this.zzc) != null) {
            return zzce.zzl;
        }
        BillingResult billingResultZzal = zzal();
        zzap(zzcb.zza(25, 16, billingResultZzal));
        return billingResultZzal;
    }

    @Override // com.android.billingclient.api.BillingClient
    public BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            zzap(zzcb.zza(2, 25, zzce.zzm));
            return zzce.zzm;
        }
        if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current Play Store version doesn't support external offer.");
            zzap(zzcb.zza(103, 25, zzce.zzy));
            return zzce.zzy;
        }
        final zzay zzayVar = new zzay(this, this.zzc, externalOfferInformationDialogListener);
        if (zzao(new Callable() { // from class: com.android.billingclient.api.zzaj
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzv(activity, zzayVar, externalOfferInformationDialogListener);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzal
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzae(externalOfferInformationDialogListener);
            }
        }, this.zzc) != null) {
            return zzce.zzl;
        }
        BillingResult billingResultZzal = zzal();
        zzap(zzcb.zza(25, 25, billingResultZzal));
        return billingResultZzal;
    }

    private BillingClientImpl(Context context, PendingPurchasesParams pendingPurchasesParams, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, UserChoiceBillingListener userChoiceBillingListener, zzcc zzccVar, ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, userChoiceBillingListener, str, (zzcc) null);
    }

    private BillingClientImpl(String str) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
    }

    BillingClientImpl(String str, Context context, zzcc zzccVar, ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        String strZzan = zzan();
        this.zzb = strZzan;
        this.zze = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(strZzan);
        zzgtVarZzy.zzm(this.zze.getPackageName());
        this.zzf = new zzch(this.zze, (zzgu) zzgtVarZzy.zzf());
        this.zze.getPackageName();
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, UserChoiceBillingListener userChoiceBillingListener, String str, zzcc zzccVar) {
        this.zze = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(str);
        zzgtVarZzy.zzm(this.zze.getPackageName());
        if (zzccVar != null) {
            this.zzf = zzccVar;
        } else {
            this.zzf = new zzch(this.zze, (zzgu) zzgtVarZzy.zzf());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzd = new zzo(this.zze, purchasesUpdatedListener, null, null, userChoiceBillingListener, this.zzf);
        this.zzz = pendingPurchasesParams;
        this.zzA = userChoiceBillingListener != null;
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, zzck zzckVar, zzcc zzccVar, ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = zzan();
        this.zze = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(zzan());
        zzgtVarZzy.zzm(this.zze.getPackageName());
        this.zzf = new zzch(this.zze, (zzgu) zzgtVarZzy.zzf());
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zzd = new zzo(this.zze, null, null, null, null, this.zzf);
        this.zzz = pendingPurchasesParams;
        this.zze.getPackageName();
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzc zzcVar, zzcc zzccVar, ExecutorService executorService) {
        String strZzan = zzan();
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = strZzan;
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, (zzc) null, strZzan, (zzcc) null);
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, zzcc zzccVar, ExecutorService executorService) {
        this(context, pendingPurchasesParams, purchasesUpdatedListener, zzan(), null, userChoiceBillingListener, null, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            zzaq(zzcb.zzc(6));
            billingClientStateListener.onBillingSetupFinished(zzce.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            zzap(zzcb.zza(37, 6, zzce.zzd));
            billingClientStateListener.onBillingSetupFinished(zzce.zzd);
            return;
        }
        if (this.zza == 3) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            zzap(zzcb.zza(38, 6, zzce.zzm));
            billingClientStateListener.onBillingSetupFinished(zzce.zzm);
            return;
        }
        this.zza = 1;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Starting in-app billing setup.");
        this.zzh = new zzbc(this, billingClientStateListener, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i = 41;
        } else {
            ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                String str = resolveInfo.serviceInfo.packageName;
                String str2 = resolveInfo.serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                    i = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.zzb);
                    if (this.zze.bindService(intent2, this.zzh, 1)) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                        i = 39;
                    }
                }
            }
        }
        this.zza = 0;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service unavailable on device.");
        zzap(zzcb.zza(i, 6, zzce.zzc));
        billingClientStateListener.onBillingSetupFinished(zzce.zzc);
    }
}
