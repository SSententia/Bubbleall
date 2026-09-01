.class public Landroidx/media2/common/SessionPlayer$PlayerResult;
.super Ljava/lang/Object;
.source "SessionPlayer.java"

# interfaces
.implements Landroidx/media2/common/BaseResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/common/SessionPlayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PlayerResult"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/common/SessionPlayer$PlayerResult$ResultCode;
    }
.end annotation


# instance fields
.field private final mCompletionTime:J

.field private final mItem:Landroidx/media2/common/MediaItem;

.field private final mResultCode:I


# direct methods
.method public constructor <init>(ILandroidx/media2/common/MediaItem;)V
    .locals 2

    .line 1560
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/media2/common/SessionPlayer$PlayerResult;-><init>(ILandroidx/media2/common/MediaItem;J)V

    return-void
.end method

.method private constructor <init>(ILandroidx/media2/common/MediaItem;J)V
    .locals 0

    .line 1564
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1565
    iput p1, p0, Landroidx/media2/common/SessionPlayer$PlayerResult;->mResultCode:I

    .line 1566
    iput-object p2, p0, Landroidx/media2/common/SessionPlayer$PlayerResult;->mItem:Landroidx/media2/common/MediaItem;

    .line 1567
    iput-wide p3, p0, Landroidx/media2/common/SessionPlayer$PlayerResult;->mCompletionTime:J

    return-void
.end method

.method public static createFuture(I)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 1577
    invoke-static {}, Landroidx/concurrent/futures/ResolvableFuture;->create()Landroidx/concurrent/futures/ResolvableFuture;

    move-result-object v0

    .line 1578
    new-instance v1, Landroidx/media2/common/SessionPlayer$PlayerResult;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Landroidx/media2/common/SessionPlayer$PlayerResult;-><init>(ILandroidx/media2/common/MediaItem;)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/ResolvableFuture;->set(Ljava/lang/Object;)Z

    return-object v0
.end method


# virtual methods
.method public getCompletionTime()J
    .locals 2

    .line 1611
    iget-wide v0, p0, Landroidx/media2/common/SessionPlayer$PlayerResult;->mCompletionTime:J

    return-wide v0
.end method

.method public getMediaItem()Landroidx/media2/common/MediaItem;
    .locals 1

    .line 1625
    iget-object v0, p0, Landroidx/media2/common/SessionPlayer$PlayerResult;->mItem:Landroidx/media2/common/MediaItem;

    return-object v0
.end method

.method public getResultCode()I
    .locals 1

    .line 1600
    iget v0, p0, Landroidx/media2/common/SessionPlayer$PlayerResult;->mResultCode:I

    return v0
.end method
