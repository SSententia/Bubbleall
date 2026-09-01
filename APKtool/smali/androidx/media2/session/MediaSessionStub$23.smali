.class Landroidx/media2/session/MediaSessionStub$23;
.super Ljava/lang/Object;
.source "MediaSessionStub.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionStub$SessionPlayerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionStub;->movePlaylistItem(Landroidx/media2/session/IMediaController;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionStub;

.field final synthetic val$fromIndex:I

.field final synthetic val$toIndex:I


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionStub;II)V
    .locals 0

    .line 869
    iput-object p1, p0, Landroidx/media2/session/MediaSessionStub$23;->this$0:Landroidx/media2/session/MediaSessionStub;

    iput p2, p0, Landroidx/media2/session/MediaSessionStub$23;->val$fromIndex:I

    iput p3, p0, Landroidx/media2/session/MediaSessionStub$23;->val$toIndex:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
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

    .line 873
    iget p2, p0, Landroidx/media2/session/MediaSessionStub$23;->val$fromIndex:I

    iget v0, p0, Landroidx/media2/session/MediaSessionStub$23;->val$toIndex:I

    invoke-interface {p1, p2, v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->movePlaylistItem(II)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
