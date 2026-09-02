package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzawe implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final long zzc = ((Long) zzbet.zzc().zzc(zzbjl.zzaR)).longValue();
    BroadcastReceiver zza;
    final WeakReference<View> zzb;
    private final Context zzd;
    private Application zze;
    private final WindowManager zzf;
    private final PowerManager zzg;
    private final KeyguardManager zzh;
    private WeakReference<ViewTreeObserver> zzi;
    private zzawq zzj;
    private final com.google.android.gms.ads.internal.util.zzcc zzk = new com.google.android.gms.ads.internal.util.zzcc(zzc);
    private boolean zzl = false;
    private int zzm = -1;
    private final HashSet<zzawd> zzn = new HashSet<>();
    private final DisplayMetrics zzo;
    private final Rect zzp;

    public zzawe(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.zzf = windowManager;
        this.zzg = (PowerManager) applicationContext.getSystemService("power");
        this.zzh = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.zze = application;
            this.zzj = new zzawq(application, this);
        }
        this.zzo = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.zzp = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.zzb;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzm(view2);
        }
        this.zzb = new WeakReference<>(view);
        if (view != null) {
            if (com.google.android.gms.ads.internal.zzt.zze().zzg(view)) {
                zzl(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final void zzh() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzawa
            private final zzawe zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg();
            }
        });
    }

    private final void zzi(Activity activity, int i) {
        Window window;
        if (this.zzb == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = this.zzb.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.zzm = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:57:0x012e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzj(int i) {
        WeakReference<View> weakReference;
        View view;
        boolean globalVisibleRect;
        boolean localVisibleRect;
        List listEmptyList;
        boolean z;
        if (this.zzn.size() == 0 || (weakReference = this.zzb) == null) {
            return;
        }
        View view2 = weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            globalVisibleRect = view2.getGlobalVisibleRect(rect2);
            localVisibleRect = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Failure getting view location.", e);
            }
            rect.left = iArr[0];
            rect.top = iArr[1];
            rect.right = rect.left + view2.getWidth();
            rect.bottom = rect.top + view2.getHeight();
            view = view2;
        } else {
            view = null;
            globalVisibleRect = false;
            localVisibleRect = false;
        }
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzaU)).booleanValue() || view == null) {
            listEmptyList = Collections.emptyList();
        } else {
            try {
                listEmptyList = new ArrayList();
                ViewParent parent = view.getParent();
                while (parent instanceof View) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        listEmptyList.add(zzd(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.zzt.zzg().zzk(e2, "PositionWatcher.getParentScrollViewRects");
                listEmptyList = Collections.emptyList();
            }
        }
        List list = listEmptyList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i2 = this.zzm;
        if (i2 != -1) {
            windowVisibility = i2;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long jZzA = com.google.android.gms.ads.internal.util.zzs.zzA(view);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgQ)).booleanValue()) {
            if (view2 != null) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzW(view, this.zzg, this.zzh) && globalVisibleRect && localVisibleRect) {
                    if (jZzA >= ((Integer) zzbet.zzc().zzc(zzbjl.zzgT)).intValue() && windowVisibility == 0) {
                        z = 1;
                        windowVisibility = 0;
                    }
                }
            }
            z = 0;
        } else {
            if (view2 != null) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzW(view, this.zzg, this.zzh) && globalVisibleRect && localVisibleRect && windowVisibility == 0) {
                    z = 1;
                    windowVisibility = 0;
                }
            }
            z = 0;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgV)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            int i3 = (windowVisibility == 0 ? 128 : 0) | (true != com.google.android.gms.ads.internal.util.zzs.zzW(view, this.zzg, this.zzh) ? 0 : 64) | (true != globalVisibleRect ? 0 : 8) | (true != localVisibleRect ? 0 : 16);
            int i4 = jZzA >= ((long) ((Integer) zzbet.zzc().zzc(zzbjl.zzgT)).intValue()) ? 32 : 0;
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzM(view, i3 | i4 | z, null);
        }
        if (i == 1 && !this.zzk.zza() && z == this.zzl) {
            return;
        }
        if (z == 0 && !this.zzl && i == 1) {
            return;
        }
        zzawc zzawcVar = new zzawc(com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime(), this.zzg.isScreenOn(), view != null && com.google.android.gms.ads.internal.zzt.zze().zzg(view), view != null ? view.getWindowVisibility() : 8, zzd(this.zzp), zzd(rect), zzd(rect2), globalVisibleRect, zzd(rect3), localVisibleRect, jZzA, zzd(rect4), this.zzo.density, z, list);
        Iterator<zzawd> it = this.zzn.iterator();
        while (it.hasNext()) {
            it.next().zzc(zzawcVar);
        }
        this.zzl = z;
    }

    private final int zzk(int i) {
        return (int) (i / this.zzo.density);
    }

    private final void zzl(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzi = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zza == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zza = new zzawb(this);
            com.google.android.gms.ads.internal.zzt.zzx().zzb(this.zzd, this.zza, intentFilter);
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    private final void zzm(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.zzi;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzi = null;
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.zza != null) {
            try {
                com.google.android.gms.ads.internal.zzt.zzx().zzc(this.zzd, this.zza);
            } catch (IllegalStateException e3) {
                com.google.android.gms.ads.internal.util.zze.zzg("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.zzt.zzg().zzk(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zza = null;
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e5) {
                com.google.android.gms.ads.internal.util.zze.zzg("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzi(activity, 0);
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzi(activity, 4);
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzj(3);
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzj(2);
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzj(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzm = -1;
        zzl(view);
        zzj(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zzm = -1;
        zzj(3);
        zzh();
        zzm(view);
    }

    public final void zza(zzawd zzawdVar) {
        this.zzn.add(zzawdVar);
        zzj(3);
    }

    public final void zzb(zzawd zzawdVar) {
        this.zzn.remove(zzawdVar);
    }

    final Rect zzd(Rect rect) {
        return new Rect(zzk(rect.left), zzk(rect.top), zzk(rect.right), zzk(rect.bottom));
    }

    public final void zze(long j) {
        this.zzk.zzb(j);
    }

    public final void zzf() {
        this.zzk.zzb(zzc);
    }

    final /* synthetic */ void zzg() {
        zzj(3);
    }
}
