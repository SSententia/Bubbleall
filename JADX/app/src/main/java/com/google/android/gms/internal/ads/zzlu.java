package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzlu extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzls zzd;
    private boolean zze;

    /* synthetic */ zzlu(zzls zzlsVar, SurfaceTexture surfaceTexture, boolean z, zzlt zzltVar) {
        super(surfaceTexture);
        this.zzd = zzlsVar;
        this.zza = z;
    }

    public static synchronized boolean zza(Context context) {
        String strEglQueryString;
        int i;
        String strEglQueryString2;
        if (!zzc) {
            if (zzamq.zza >= 24 && ((zzamq.zza >= 26 || !("samsung".equals(zzamq.zzc) || "XT1650".equals(zzamq.zzd))) && ((zzamq.zza >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                i = 2;
                if (zzamq.zza >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                    i = 1;
                }
            } else {
                i = 0;
            }
            zzb = i;
            zzc = true;
        }
        return zzb != 0;
    }

    public static zzlu zzb(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zza(context)) {
            z2 = false;
        }
        zzakt.zzd(z2);
        return new zzls().zza(z ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
