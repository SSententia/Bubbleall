.class Landroidx/media2/session/MediaSessionStub$25;
.super Ljava/lang/Object;
.source "MediaSessionStub.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionStub$SessionPlayerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionStub;->skipToPreviousItem(Landroidx/media2/session/IMediaController;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionStub;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionStub;)V
    .locals 0

    .line 905
    iput-object p1, p0, Landroidx/media2/session/MediaSessionStub$25;->this$0:Landroidx/media2/session/MediaSessionStub;

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

    .line 909
    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->skipToPreviousItem()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
