.class Landroidx/media2/session/MediaSessionStub$15;
.super Ljava/lang/Object;
.source "MediaSessionStub.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionStub$SessionPlayerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionStub;->setPlaybackSpeed(Landroidx/media2/session/IMediaController;IF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionStub;

.field final synthetic val$speed:F


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionStub;F)V
    .locals 0

    .line 696
    iput-object p1, p0, Landroidx/media2/session/MediaSessionStub$15;->this$0:Landroidx/media2/session/MediaSessionStub;

    iput p2, p0, Landroidx/media2/session/MediaSessionStub$15;->val$speed:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/session/MediaSession$MediaSessionImpl;",
            "Landroidx/media2/session/MediaSession$ControllerInfo;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 700
    iget p2, p0, Landroidx/media2/session/MediaSessionStub$15;->val$speed:F

    invoke-interface {p1, p2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->setPlaybackSpeed(F)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
