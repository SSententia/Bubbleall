package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.app.NotificationCompat;
import androidx.media2.session.MediaConstants;
import com.android.billingclient.api.zzn$$ExternalSyntheticApiModelOutline0;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.C1205R;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzedy extends zzbzd {
    private final Context zza;
    private final zzdvi zzb;
    private final zzcgy zzc;
    private final zzedq zzd;
    private final zzffc zze;

    public zzedy(Context context, zzedq zzedqVar, zzcgy zzcgyVar, zzdvi zzdviVar, zzffc zzffcVar) {
        this.zza = context;
        this.zzb = zzdviVar;
        this.zzc = zzcgyVar;
        this.zzd = zzedqVar;
        this.zze = zzffcVar;
    }

    public static void zzc(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzl zzlVar, final com.google.android.gms.ads.internal.util.zzbu zzbuVar, final zzedq zzedqVar, final zzdvi zzdviVar, final zzffc zzffcVar, final String str, final String str2) {
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, com.google.android.gms.ads.internal.zzt.zze().zzm());
        final Resources resourcesZzj = com.google.android.gms.ads.internal.zzt.zzg().zzj();
        builder.setTitle(resourcesZzj == null ? "Open ad when you're back online." : resourcesZzj.getString(C1205R.string.offline_opt_in_title)).setMessage(resourcesZzj == null ? "We'll send you a notification with a link to the advertiser site." : resourcesZzj.getString(C1205R.string.offline_opt_in_message)).setPositiveButton(resourcesZzj == null ? "OK" : resourcesZzj.getString(C1205R.string.offline_opt_in_confirm), new DialogInterface.OnClickListener(zzdviVar, activity, zzffcVar, zzedqVar, str, zzbuVar, str2, resourcesZzj, zzlVar) { // from class: com.google.android.gms.internal.ads.zzedt
            private final zzdvi zza;
            private final Activity zzb;
            private final zzffc zzc;
            private final zzedq zzd;
            private final String zze;
            private final com.google.android.gms.ads.internal.util.zzbu zzf;
            private final String zzg;
            private final Resources zzh;
            private final com.google.android.gms.ads.internal.overlay.zzl zzi;

            {
                this.zza = zzdviVar;
                this.zzb = activity;
                this.zzc = zzffcVar;
                this.zzd = zzedqVar;
                this.zze = str;
                this.zzf = zzbuVar;
                this.zzg = str2;
                this.zzh = resourcesZzj;
                this.zzi = zzlVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zzdvi zzdviVar2 = this.zza;
                Activity activity2 = this.zzb;
                zzffc zzffcVar2 = this.zzc;
                zzedq zzedqVar2 = this.zzd;
                String str3 = this.zze;
                com.google.android.gms.ads.internal.util.zzbu zzbuVar2 = this.zzf;
                String str4 = this.zzg;
                Resources resources = this.zzh;
                final com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = this.zzi;
                if (zzdviVar2 != null) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "confirm");
                    zzedy.zzh(activity2, zzdviVar2, zzffcVar2, zzedqVar2, str3, "dialog_click", map);
                }
                try {
                    if (!zzbuVar2.zze(ObjectWrapper.wrap(activity2), str4, str3)) {
                        zzedqVar2.zzd(str3);
                        if (zzdviVar2 != null) {
                            zzedy.zzd(activity2, zzdviVar2, zzffcVar2, zzedqVar2, str3, "offline_notification_worker_not_scheduled");
                        }
                    }
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzg("Failed to schedule offline notification poster.", e);
                }
                com.google.android.gms.ads.internal.zzt.zzc();
                AlertDialog.Builder builder2 = new AlertDialog.Builder(activity2, com.google.android.gms.ads.internal.zzt.zze().zzm());
                builder2.setMessage(resources == null ? "You'll get a notification with the link when you're back online" : resources.getString(C1205R.string.offline_opt_in_confirmation)).setOnCancelListener(new DialogInterface.OnCancelListener(zzlVar2) { // from class: com.google.android.gms.internal.ads.zzedw
                    private final com.google.android.gms.ads.internal.overlay.zzl zza;

                    {
                        this.zza = zzlVar2;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface2) {
                        com.google.android.gms.ads.internal.overlay.zzl zzlVar3 = this.zza;
                        if (zzlVar3 != null) {
                            zzlVar3.zzb();
                        }
                    }
                });
                AlertDialog alertDialogCreate = builder2.create();
                alertDialogCreate.show();
                Timer timer = new Timer();
                timer.schedule(new zzedx(alertDialogCreate, timer, zzlVar2), 3000L);
            }
        }).setNegativeButton(resourcesZzj == null ? "No thanks" : resourcesZzj.getString(C1205R.string.offline_opt_in_decline), new DialogInterface.OnClickListener(zzedqVar, str, zzdviVar, activity, zzffcVar, zzlVar) { // from class: com.google.android.gms.internal.ads.zzedu
            private final zzedq zza;
            private final String zzb;
            private final zzdvi zzc;
            private final Activity zzd;
            private final zzffc zze;
            private final com.google.android.gms.ads.internal.overlay.zzl zzf;

            {
                this.zza = zzedqVar;
                this.zzb = str;
                this.zzc = zzdviVar;
                this.zzd = activity;
                this.zze = zzffcVar;
                this.zzf = zzlVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zzedq zzedqVar2 = this.zza;
                String str3 = this.zzb;
                zzdvi zzdviVar2 = this.zzc;
                Activity activity2 = this.zzd;
                zzffc zzffcVar2 = this.zze;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = this.zzf;
                zzedqVar2.zzd(str3);
                if (zzdviVar2 != null) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "dismiss");
                    zzedy.zzh(activity2, zzdviVar2, zzffcVar2, zzedqVar2, str3, "dialog_click", map);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener(zzedqVar, str, zzdviVar, activity, zzffcVar, zzlVar) { // from class: com.google.android.gms.internal.ads.zzedv
            private final zzedq zza;
            private final String zzb;
            private final zzdvi zzc;
            private final Activity zzd;
            private final zzffc zze;
            private final com.google.android.gms.ads.internal.overlay.zzl zzf;

            {
                this.zza = zzedqVar;
                this.zzb = str;
                this.zzc = zzdviVar;
                this.zzd = activity;
                this.zze = zzffcVar;
                this.zzf = zzlVar;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzedq zzedqVar2 = this.zza;
                String str3 = this.zzb;
                zzdvi zzdviVar2 = this.zzc;
                Activity activity2 = this.zzd;
                zzffc zzffcVar2 = this.zze;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = this.zzf;
                zzedqVar2.zzd(str3);
                if (zzdviVar2 != null) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "dismiss");
                    zzedy.zzh(activity2, zzdviVar2, zzffcVar2, zzedqVar2, str3, "dialog_click", map);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        builder.create().show();
    }

    public static void zzd(Context context, zzdvi zzdviVar, zzffc zzffcVar, zzedq zzedqVar, String str, String str2) {
        zzh(context, zzdviVar, zzffcVar, zzedqVar, str, str2, new HashMap());
    }

    public static void zzh(Context context, zzdvi zzdviVar, zzffc zzffcVar, zzedq zzedqVar, String str, String str2, Map<String, String> map) {
        String strZzf;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
            zzffb zzffbVarZza = zzffb.zza(str2);
            zzffbVarZza.zzc("gqi", str);
            com.google.android.gms.ads.internal.zzt.zzc();
            zzffbVarZza.zzc("device_connectivity", true == com.google.android.gms.ads.internal.util.zzs.zzI(context) ? "online" : "offline");
            zzffbVarZza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                zzffbVarZza.zzc(entry.getKey(), entry.getValue());
            }
            strZzf = zzffcVar.zzb(zzffbVarZza);
        } else {
            zzdvh zzdvhVarZzd = zzdviVar.zzd();
            zzdvhVarZzd.zzd("gqi", str);
            zzdvhVarZzd.zzd("action", str2);
            com.google.android.gms.ads.internal.zzt.zzc();
            zzdvhVarZzd.zzd("device_connectivity", true == com.google.android.gms.ads.internal.util.zzs.zzI(context) ? "online" : "offline");
            zzdvhVarZzd.zzd("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis()));
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                zzdvhVarZzd.zzd(entry2.getKey(), entry2.getValue());
            }
            strZzf = zzdvhVarZzd.zzf();
        }
        zzedqVar.zze(new zzeds(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis(), str, strZzf, 2));
    }

    private final void zzi(String str, String str2, Map<String, String> map) {
        zzh(this.zza, this.zzb, this.zze, this.zzd, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbze
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra(MediaConstants.MEDIA_URI_QUERY_URI);
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean zZzI = com.google.android.gms.ads.internal.util.zzs.zzI(this.zza);
            HashMap map = new HashMap();
            char c = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zZzI ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.zza;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzi(stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = this.zzd.getWritableDatabase();
                if (c == 1) {
                    this.zzd.zzb(writableDatabase, this.zzc, stringExtra2);
                } else {
                    zzedq.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                com.google.android.gms.ads.internal.util.zze.zzf("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbze
    public final void zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.ads.internal.zzt.zzc();
        if (PlatformVersion.isAtLeastO()) {
            NotificationChannel notificationChannelM352m = zzn$$ExternalSyntheticApiModelOutline0.m352m("offline_notification_channel", "AdMob Offline Notifications", 2);
            notificationChannelM352m.setShowBadge(false);
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelM352m);
        }
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra(MediaConstants.MEDIA_URI_QUERY_URI, str);
        PendingIntent pendingIntentZza = zzfld.zza(context, 0, intent, zzfld.zza | BasicMeasure.EXACTLY, 0);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent pendingIntentZza2 = zzfld.zza(context, 0, intent2, zzfld.zza | BasicMeasure.EXACTLY, 0);
        Resources resourcesZzj = com.google.android.gms.ads.internal.zzt.zzg().zzj();
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, new NotificationCompat.Builder(context, "offline_notification_channel").setContentTitle(resourcesZzj == null ? "View the ad you saved when you were offline" : resourcesZzj.getString(C1205R.string.offline_notification_title)).setContentText(resourcesZzj == null ? "Tap to open ad" : resourcesZzj.getString(C1205R.string.offline_notification_text)).setAutoCancel(true).setDeleteIntent(pendingIntentZza2).setContentIntent(pendingIntentZza).setSmallIcon(context.getApplicationInfo().icon).build());
        zzi(str2, "offline_notification_impression", new HashMap());
    }

    @Override // com.google.android.gms.internal.ads.zzbze
    public final void zzg() {
        zzedq zzedqVar = this.zzd;
        final zzcgy zzcgyVar = this.zzc;
        zzedqVar.zza(new zzfdw(zzcgyVar) { // from class: com.google.android.gms.internal.ads.zzedk
            private final zzcgy zza;

            {
                this.zza = zzcgyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfdw
            public final Object zza(Object obj) throws Exception {
                zzedq.zzh(this.zza, (SQLiteDatabase) obj);
                return null;
            }
        });
    }
}
