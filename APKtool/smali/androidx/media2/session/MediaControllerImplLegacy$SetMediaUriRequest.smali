.class final Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;
.super Ljava/lang/Object;
.source "MediaControllerImplLegacy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaControllerImplLegacy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "SetMediaUriRequest"
.end annotation


# instance fields
.field public final extras:Landroid/os/Bundle;

.field public final result:Landroidx/concurrent/futures/ResolvableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/ResolvableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation
.end field

.field public final type:Ljava/lang/String;

.field public final value:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroidx/concurrent/futures/ResolvableFuture;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            "Landroidx/concurrent/futures/ResolvableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;)V"
        }
    .end annotation

    .line 1431
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1432
    iput-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->type:Ljava/lang/String;

    .line 1433
    iput-object p2, p0, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->value:Ljava/lang/String;

    .line 1434
    iput-object p3, p0, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->extras:Landroid/os/Bundle;

    .line 1435
    iput-object p4, p0, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->result:Landroidx/concurrent/futures/ResolvableFuture;

    return-void
.end method
