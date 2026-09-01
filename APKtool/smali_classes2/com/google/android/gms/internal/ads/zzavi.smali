.class final Lcom/google/android/gms/internal/ads/zzavi;
.super Landroid/os/HandlerThread;
.source "com.google.android.gms:play-services-ads@@20.5.0"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;
.implements Landroid/os/Handler$Callback;


# instance fields
.field private final zza:[I

.field private zzb:Landroid/os/Handler;

.field private zzc:Landroid/graphics/SurfaceTexture;

.field private zzd:Ljava/lang/Error;

.field private zze:Ljava/lang/RuntimeException;

.field private zzf:Lcom/google/android/gms/internal/ads/zzavk;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "dummySurface"

    invoke-direct {p0, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzavi;->zza:[I

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 1
    iget v2, v0, Landroid/os/Message;->what:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v2, v6, :cond_2

    if-eq v2, v3, :cond_1

    const/4 v0, 0x3

    if-eq v2, v0, :cond_0

    return v6

    :cond_0
    :try_start_0
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzavi;->zzc:Landroid/graphics/SurfaceTexture;

    .line 2
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iput-object v4, v1, Lcom/google/android/gms/internal/ads/zzavi;->zzf:Lcom/google/android/gms/internal/ads/zzavk;

    iput-object v4, v1, Lcom/google/android/gms/internal/ads/zzavi;->zzc:Landroid/graphics/SurfaceTexture;

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzavi;->zza:[I

    .line 3
    invoke-static {v6, v0, v5}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 6
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzavi;->quit()Z

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 28
    :try_start_2
    iput-object v4, v1, Lcom/google/android/gms/internal/ads/zzavi;->zzf:Lcom/google/android/gms/internal/ads/zzavk;

    iput-object v4, v1, Lcom/google/android/gms/internal/ads/zzavi;->zzc:Landroid/graphics/SurfaceTexture;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzavi;->zza:[I

    .line 3
    invoke-static {v6, v2, v5}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 4
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_3
    const-string v2, "DummySurface"

    const-string v3, "Failed to release dummy surface"

    .line 5
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :goto_1
    return v6

    :catchall_2
    move-exception v0

    .line 6
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzavi;->quit()Z

    .line 7
    throw v0

    .line 6
    :cond_1
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzavi;->zzc:Landroid/graphics/SurfaceTexture;

    .line 8
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    return v6

    .line 9
    :cond_2
    :try_start_4
    iget v0, v0, Landroid/os/Message;->arg1:I

    if-eqz v0, :cond_3

    move v0, v6

    goto :goto_2

    :cond_3
    move v0, v5

    .line 10
    :goto_2
    invoke-static {v5}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    move-result-object v2

    if-eqz v2, :cond_4

    move v7, v6

    goto :goto_3

    :cond_4
    move v7, v5

    :goto_3
    const-string v8, "eglGetDisplay failed"

    .line 11
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/ads/zzaup;->zze(ZLjava/lang/Object;)V

    new-array v7, v3, [I

    .line 12
    invoke-static {v2, v7, v5, v7, v6}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    move-result v7

    const-string v8, "eglInitialize failed"

    .line 13
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/ads/zzaup;->zze(ZLjava/lang/Object;)V

    const/16 v7, 0x11

    new-array v8, v7, [I

    fill-array-data v8, :array_0

    new-array v15, v6, [Landroid/opengl/EGLConfig;

    new-array v14, v6, [I

    const/4 v12, 0x1

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v7, v2

    move-object v10, v15

    move-object v13, v14

    move-object/from16 v17, v14

    move/from16 v14, v16

    .line 14
    invoke-static/range {v7 .. v14}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    move-result v7

    if-eqz v7, :cond_5

    aget v7, v17, v5

    if-lez v7, :cond_5

    aget-object v7, v15, v5

    if-eqz v7, :cond_5

    move v7, v6

    goto :goto_4

    :cond_5
    move v7, v5

    :goto_4
    const-string v8, "eglChooseConfig failed"

    .line 15
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/ads/zzaup;->zze(ZLjava/lang/Object;)V

    aget-object v7, v15, v5

    const/16 v8, 0x3098

    const/16 v9, 0x3038

    if-eqz v0, :cond_6

    const/16 v10, 0x32c0

    filled-new-array {v8, v3, v10, v6, v9}, [I

    move-result-object v3

    goto :goto_5

    .line 28
    :cond_6
    filled-new-array {v8, v3, v9}, [I

    move-result-object v3

    .line 15
    :goto_5
    sget-object v8, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 16
    invoke-static {v2, v7, v8, v3, v5}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    move-result-object v3

    if-eqz v3, :cond_7

    move v8, v6

    goto :goto_6

    :cond_7
    move v8, v5

    :goto_6
    const-string v10, "eglCreateContext failed"

    .line 17
    invoke-static {v8, v10}, Lcom/google/android/gms/internal/ads/zzaup;->zze(ZLjava/lang/Object;)V

    if-eqz v0, :cond_8

    const/4 v8, 0x7

    new-array v8, v8, [I

    fill-array-data v8, :array_1

    goto :goto_7

    :cond_8
    const/16 v8, 0x3056

    const/16 v10, 0x3057

    .line 28
    filled-new-array {v10, v6, v8, v6, v9}, [I

    move-result-object v8

    .line 18
    :goto_7
    invoke-static {v2, v7, v8, v5}, Landroid/opengl/EGL14;->eglCreatePbufferSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;[II)Landroid/opengl/EGLSurface;

    move-result-object v7

    if-eqz v7, :cond_9

    move v8, v6

    goto :goto_8

    :cond_9
    move v8, v5

    :goto_8
    const-string v9, "eglCreatePbufferSurface failed"

    .line 19
    invoke-static {v8, v9}, Lcom/google/android/gms/internal/ads/zzaup;->zze(ZLjava/lang/Object;)V

    .line 20
    invoke-static {v2, v7, v7, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result v2

    const-string v3, "eglMakeCurrent failed"

    .line 21
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzaup;->zze(ZLjava/lang/Object;)V

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzavi;->zza:[I

    .line 22
    invoke-static {v6, v2, v5}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    new-instance v2, Landroid/graphics/SurfaceTexture;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzavi;->zza:[I

    .line 23
    aget v3, v3, v5

    invoke-direct {v2, v3}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzavi;->zzc:Landroid/graphics/SurfaceTexture;

    .line 24
    invoke-virtual {v2, v1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzavk;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzavi;->zzc:Landroid/graphics/SurfaceTexture;

    .line 25
    invoke-direct {v2, v1, v3, v0, v4}, Lcom/google/android/gms/internal/ads/zzavk;-><init>(Lcom/google/android/gms/internal/ads/zzavi;Landroid/graphics/SurfaceTexture;ZLcom/google/android/gms/internal/ads/zzavj;)V

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzavi;->zzf:Lcom/google/android/gms/internal/ads/zzavk;
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    monitor-enter p0

    .line 27
    :try_start_5
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->notify()V

    .line 28
    monitor-exit p0

    goto :goto_9

    :catchall_3
    move-exception v0

    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw v0

    :catchall_4
    move-exception v0

    goto :goto_a

    :catch_0
    move-exception v0

    :try_start_6
    const-string v2, "DummySurface"

    const-string v3, "Failed to initialize dummy surface"

    .line 26
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzavi;->zzd:Ljava/lang/Error;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    monitor-enter p0

    .line 27
    :try_start_7
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->notify()V

    .line 28
    monitor-exit p0

    goto :goto_9

    :catchall_5
    move-exception v0

    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    throw v0

    :catch_1
    move-exception v0

    .line 6
    :try_start_8
    const-string v2, "DummySurface"

    const-string v3, "Failed to initialize dummy surface"

    .line 29
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzavi;->zze:Ljava/lang/RuntimeException;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    monitor-enter p0

    .line 27
    :try_start_9
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->notify()V

    .line 28
    monitor-exit p0

    :goto_9
    return v6

    :catchall_6
    move-exception v0

    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    throw v0

    :goto_a
    monitor-enter p0

    .line 27
    :try_start_a
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->notify()V

    .line 28
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 30
    throw v0

    :catchall_7
    move-exception v0

    .line 28
    :try_start_b
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    throw v0

    :array_0
    .array-data 4
        0x3040
        0x4
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3021
        0x8
        0x3025
        0x0
        0x3027
        0x3038
        0x3033
        0x4
        0x3038
    .end array-data

    :array_1
    .array-data 4
        0x3057
        0x1
        0x3056
        0x1
        0x32c0
        0x1
        0x3038
    .end array-data
.end method

.method public final onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzavi;->zzb:Landroid/os/Handler;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public final zza(Z)Lcom/google/android/gms/internal/ads/zzavk;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzavi;->start()V

    new-instance v0, Landroid/os/Handler;

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzavi;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzavi;->zzb:Landroid/os/Handler;

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzavi;->zzb:Landroid/os/Handler;

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v0, v2, p1, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzavi;->zzf:Lcom/google/android/gms/internal/ads/zzavk;

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzavi;->zze:Ljava/lang/RuntimeException;

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzavi;->zzd:Ljava/lang/Error;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 4
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move v1, v2

    goto :goto_0

    .line 5
    :cond_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_1

    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzavi;->zze:Ljava/lang/RuntimeException;

    if-nez p1, :cond_3

    .line 7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzavi;->zzd:Ljava/lang/Error;

    if-nez p1, :cond_2

    .line 8
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzavi;->zzf:Lcom/google/android/gms/internal/ads/zzavk;

    return-object p1

    :cond_2
    throw p1

    .line 7
    :cond_3
    throw p1

    :catchall_0
    move-exception p1

    .line 5
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final zzb()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzavi;->zzb:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method
