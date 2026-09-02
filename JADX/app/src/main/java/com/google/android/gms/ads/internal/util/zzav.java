package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzchg;
import com.google.android.gms.internal.ads.zzdxy;
import com.google.android.gms.internal.ads.zzdyc;
import com.google.android.gms.internal.ads.zzfsn;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzav {
    private final Context zza;
    private final zzdyc zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzav(Context context) {
        this.zzg = 0;
        this.zzl = new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzaf
            private final zzav zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzr();
            }
        };
        this.zza = context;
        this.zzh = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzt.zzq().zza();
        this.zzk = com.google.android.gms.ads.internal.zzt.zzq().zzb();
        this.zzb = com.google.android.gms.ads.internal.zzt.zzm().zzb();
    }

    private final boolean zzs(float f, float f2, float f3, float f4) {
        return Math.abs(this.zzi.x - f) < ((float) this.zzh) && Math.abs(this.zzi.y - f2) < ((float) this.zzh) && Math.abs(this.zzj.x - f3) < ((float) this.zzh) && Math.abs(this.zzj.y - f4) < ((float) this.zzh);
    }

    private final void zzt(Context context) {
        final int i;
        ArrayList arrayList = new ArrayList();
        int iZzu = zzu(arrayList, "None", true);
        final int iZzu2 = zzu(arrayList, "Shake", true);
        final int iZzu3 = zzu(arrayList, "Flick", true);
        zzdxy zzdxyVar = zzdxy.NONE;
        int iOrdinal = this.zzb.zzf().ordinal();
        if (iOrdinal != 1) {
            i = iOrdinal != 2 ? iZzu : iZzu3;
        } else {
            i = iZzu2;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, com.google.android.gms.ads.internal.zzt.zze().zzm());
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        builder.setTitle("Setup gesture");
        builder.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterface.OnClickListener(atomicInteger) { // from class: com.google.android.gms.ads.internal.util.zzan
            private final AtomicInteger zza;

            {
                this.zza = atomicInteger;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.zza.set(i2);
            }
        });
        builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener(this) { // from class: com.google.android.gms.ads.internal.util.zzao
            private final zzav zza;

            {
                this.zza = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.zza.zzb();
            }
        });
        builder.setPositiveButton("Save", new DialogInterface.OnClickListener(this, atomicInteger, i, iZzu2, iZzu3) { // from class: com.google.android.gms.ads.internal.util.zzap
            private final zzav zza;
            private final AtomicInteger zzb;
            private final int zzc;
            private final int zzd;
            private final int zze;

            {
                this.zza = this;
                this.zzb = atomicInteger;
                this.zzc = i;
                this.zzd = iZzu2;
                this.zze = iZzu3;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.zza.zzp(this.zzb, this.zzc, this.zzd, this.zze, dialogInterface, i2);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: com.google.android.gms.ads.internal.util.zzaq
            private final zzav zza;

            {
                this.zza = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.zzb();
            }
        });
        builder.create().show();
    }

    private static final int zzu(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzc);
        sb.append(",DebugSignal: ");
        sb.append(this.zzf);
        sb.append(",AFMA Version: ");
        sb.append(this.zze);
        sb.append(",Ad Unit ID: ");
        sb.append(this.zzd);
        sb.append("}");
        return sb.toString();
    }

    public final void zza(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzg = 0;
            this.zzi = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.zzg;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.zzg = 5;
                this.zzj = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.zzk.postDelayed(this.zzl, ((Long) zzbet.zzc().zzc(zzbjl.zzdc)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !zzs(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (zzs(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.zzg = -1;
            this.zzk.removeCallbacks(this.zzl);
        }
    }

    public final void zzb() {
        try {
            if (!(this.zza instanceof Activity)) {
                zze.zzh("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzm().zzi())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzt.zzm().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iZzu = zzu(arrayList, "Ad information", true);
            final int iZzu2 = zzu(arrayList, str, true);
            final int iZzu3 = zzu(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) zzbet.zzc().zzc(zzbjl.zzgE)).booleanValue();
            final int iZzu4 = zzu(arrayList, "Open ad inspector", zBooleanValue);
            final int iZzu5 = zzu(arrayList, "Ad inspector settings", zBooleanValue);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.zza, com.google.android.gms.ads.internal.zzt.zze().zzm());
            builder.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener(this, iZzu, iZzu2, iZzu3, iZzu4, iZzu5) { // from class: com.google.android.gms.ads.internal.util.zzam
                private final zzav zza;
                private final int zzb;
                private final int zzc;
                private final int zzd;
                private final int zze;
                private final int zzf;

                {
                    this.zza = this;
                    this.zzb = iZzu;
                    this.zzc = iZzu2;
                    this.zzd = iZzu3;
                    this.zze = iZzu4;
                    this.zzf = iZzu5;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.zza.zzq(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, dialogInterface, i);
                }
            });
            builder.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.zzb("", e);
        }
    }

    public final void zzc(String str) {
        this.zzd = str;
    }

    public final void zzd(String str) {
        this.zze = str;
    }

    public final void zze(String str) {
        this.zzc = str;
    }

    public final void zzf(String str) {
        this.zzf = str;
    }

    final /* synthetic */ void zzg() {
        zzaz zzazVarZzm = com.google.android.gms.ads.internal.zzt.zzm();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        String str3 = this.zzf;
        boolean zZzm = zzazVarZzm.zzm();
        zzazVarZzm.zzl(zzazVarZzm.zze(context, str, str2));
        if (!zzazVarZzm.zzm()) {
            zzazVarZzm.zzf(context, str, str2);
            return;
        }
        if (!zZzm && !TextUtils.isEmpty(str3)) {
            zzazVarZzm.zzh(context, str2, str3, str);
        }
        zze.zzd("Device is linked for debug signals.");
        zzazVarZzm.zzn(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    final /* synthetic */ void zzh() {
        zzaz zzazVarZzm = com.google.android.gms.ads.internal.zzt.zzm();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        if (!zzazVarZzm.zzd(context, str, str2)) {
            zzazVarZzm.zzn(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(zzazVarZzm.zza)) {
            zze.zzd("Creative is not pushed for this device.");
            zzazVarZzm.zzn(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzazVarZzm.zza)) {
            zze.zzd("The app is not linked for creative preview.");
            zzazVarZzm.zzf(context, str, str2);
        } else if ("0".equals(zzazVarZzm.zza)) {
            zze.zzd("Device is linked for in app preview.");
            zzazVarZzm.zzn(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    final /* synthetic */ void zzi(zzfsn zzfsnVar) {
        if (com.google.android.gms.ads.internal.zzt.zzm().zze(this.zza, this.zzd, this.zze)) {
            zzfsnVar.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzak
                private final zzav zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzm().zzf(this.zza, this.zzd, this.zze);
        }
    }

    final /* synthetic */ void zzj() {
        zzt(this.zza);
    }

    final /* synthetic */ void zzk() {
        zzt(this.zza);
    }

    final /* synthetic */ void zzl(zzfsn zzfsnVar) {
        if (com.google.android.gms.ads.internal.zzt.zzm().zze(this.zza, this.zzd, this.zze)) {
            zzfsnVar.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzal
                private final zzav zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzm().zzf(this.zza, this.zzd, this.zze);
        }
    }

    final /* synthetic */ void zzm() {
        com.google.android.gms.ads.internal.zzt.zzm().zzc(this.zza);
    }

    final /* synthetic */ void zzn() {
        com.google.android.gms.ads.internal.zzt.zzm().zzc(this.zza);
    }

    final /* synthetic */ void zzo(String str, DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzP(this.zza, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void zzp(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                this.zzb.zze(zzdxy.SHAKE);
            } else if (atomicInteger.get() == i3) {
                this.zzb.zze(zzdxy.FLICK);
            } else {
                this.zzb.zze(zzdxy.NONE);
            }
        }
        zzb();
    }

    final /* synthetic */ void zzq(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 != i) {
            if (i6 == i2) {
                zze.zzd("Debug mode [Creative Preview] selected.");
                zzchg.zza.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzai
                    private final zzav zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzh();
                    }
                });
                return;
            }
            if (i6 == i3) {
                zze.zzd("Debug mode [Troubleshooting] selected.");
                zzchg.zza.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzaj
                    private final zzav zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzg();
                    }
                });
                return;
            }
            if (i6 == i4) {
                final zzfsn zzfsnVar = zzchg.zze;
                zzfsn zzfsnVar2 = zzchg.zza;
                if (this.zzb.zzn()) {
                    zzfsnVar.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzat
                        private final zzav zza;

                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzn();
                        }
                    });
                    return;
                } else {
                    zzfsnVar2.execute(new Runnable(this, zzfsnVar) { // from class: com.google.android.gms.ads.internal.util.zzau
                        private final zzav zza;
                        private final zzfsn zzb;

                        {
                            this.zza = this;
                            this.zzb = zzfsnVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzl(this.zzb);
                        }
                    });
                    return;
                }
            }
            if (i6 == i5) {
                final zzfsn zzfsnVar3 = zzchg.zze;
                zzfsn zzfsnVar4 = zzchg.zza;
                if (this.zzb.zzn()) {
                    zzfsnVar3.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzag
                        private final zzav zza;

                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzk();
                        }
                    });
                    return;
                } else {
                    zzfsnVar4.execute(new Runnable(this, zzfsnVar3) { // from class: com.google.android.gms.ads.internal.util.zzah
                        private final zzav zza;
                        private final zzfsn zzb;

                        {
                            this.zza = this;
                            this.zzb = zzfsnVar3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzi(this.zzb);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.zza instanceof Activity)) {
            zze.zzh("Can not create dialog without Activity Context");
            return;
        }
        String str = this.zzc;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            com.google.android.gms.ads.internal.zzt.zzc();
            Map<String, String> mapZzR = zzs.zzR(uriBuild);
            for (String str3 : mapZzR.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append(mapZzR.get(str3));
                sb.append("\n\n");
            }
            String strTrim = sb.toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.zza);
        builder.setMessage(str2);
        builder.setTitle("Ad Information");
        builder.setPositiveButton("Share", new DialogInterface.OnClickListener(this, str2) { // from class: com.google.android.gms.ads.internal.util.zzar
            private final zzav zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = str2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i7) {
                this.zza.zzo(this.zzb, dialogInterface2, i7);
            }
        });
        builder.setNegativeButton("Close", zzas.zza);
        builder.create().show();
    }

    final /* synthetic */ void zzr() {
        this.zzg = 4;
        zzb();
    }

    public zzav(Context context, String str) {
        this(context);
        this.zzc = str;
    }
}
