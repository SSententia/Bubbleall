.class public final Landroidx/media2/common/ClassVerificationHelper$HandlerThread$Api18;
.super Ljava/lang/Object;
.source "ClassVerificationHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/common/ClassVerificationHelper$HandlerThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Api18"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static quitSafely(Landroid/os/HandlerThread;)Z
    .locals 0

    .line 65
    invoke-virtual {p0}, Landroid/os/HandlerThread;->quitSafely()Z

    move-result p0

    return p0
.end method
