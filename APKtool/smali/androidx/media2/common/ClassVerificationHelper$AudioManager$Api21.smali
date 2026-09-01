.class public final Landroidx/media2/common/ClassVerificationHelper$AudioManager$Api21;
.super Ljava/lang/Object;
.source "ClassVerificationHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/common/ClassVerificationHelper$AudioManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Api21"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isVolumeFixed(Landroid/media/AudioManager;)Z
    .locals 0

    .line 46
    invoke-virtual {p0}, Landroid/media/AudioManager;->isVolumeFixed()Z

    move-result p0

    return p0
.end method
