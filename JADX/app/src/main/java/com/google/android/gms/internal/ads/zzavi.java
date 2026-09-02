package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzavi extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {
    private final int[] zza;
    private Handler zzb;
    private SurfaceTexture zzc;
    private Error zzd;
    private RuntimeException zze;
    private zzavk zzf;

    public zzavi() {
        super("dummySurface");
        this.zza = new int[1];
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i == 2) {
                    this.zzc.updateTexImage();
                    return true;
                }
                if (i != 3) {
                    return true;
                }
                try {
                    try {
                        this.zzc.release();
                        this.zzf = null;
                        this.zzc = null;
                        GLES20.glDeleteTextures(1, this.zza, 0);
                    } catch (Throwable th) {
                        try {
                            Log.e("DummySurface", "Failed to release dummy surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                } catch (Throwable th2) {
                    this.zzf = null;
                    this.zzc = null;
                    GLES20.glDeleteTextures(1, this.zza, 0);
                    throw th2;
                }
            }
            try {
                boolean z = message.arg1 != 0;
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                zzaup.zze(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
                int[] iArr = new int[2];
                zzaup.zze(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                zzaup.zze(EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                zzaup.zze(eGLContextEglCreateContext != null, "eglCreateContext failed");
                EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                zzaup.zze(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                zzaup.zze(EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), "eglMakeCurrent failed");
                GLES20.glGenTextures(1, this.zza, 0);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.zza[0]);
                this.zzc = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this);
                this.zzf = new zzavk(this, this.zzc, z, null);
                synchronized (this) {
                    notify();
                }
            } catch (Error e) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e);
                this.zzd = e;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                this.zze = e2;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzb.sendEmptyMessage(2);
    }

    public final zzavk zza(boolean z) {
        boolean z2;
        start();
        this.zzb = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.zzb.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.zzf == null && this.zze == null && this.zzd == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zze;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzd;
        if (error == null) {
            return this.zzf;
        }
        throw error;
    }

    public final void zzb() {
        this.zzb.sendEmptyMessage(3);
    }
}
