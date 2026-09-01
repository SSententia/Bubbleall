.class Landroidx/media2/session/MediaSessionStub$28;
.super Ljava/lang/Object;
.source "MediaSessionStub.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionStub$SessionPlayerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionStub;->setShuffleMode(Landroidx/media2/session/IMediaController;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionStub;

.field final synthetic val$shuffleMode:I


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionStub;I)V
    .locals 0

    .line 951
    iput-object p1, p0, Landroidx/media2/session/MediaSessionStub$28;->this$0:Landroidx/media2/session/MediaSessionStub;

    iput p2, p0, Landroidx/media2/session/MediaSessionStub$28;->val$shuffleMode:I

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

    .line 955
    iget p2, p0, Landroidx/media2/session/MediaSessionStub$28;->val$shuffleMode:I

    invoke-interface {p1, p2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->setShuffleMode(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
