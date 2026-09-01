.class Landroidx/media2/session/MediaSessionImplBase$17;
.super Ljava/lang/Object;
.source "MediaSessionImplBase.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionImplBase$PlayerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionImplBase;->getPlaylist()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/media2/session/MediaSessionImplBase$PlayerTask<",
        "Ljava/util/List<",
        "Landroidx/media2/common/MediaItem;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionImplBase;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionImplBase;)V
    .locals 0

    .line 566
    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase$17;->this$0:Landroidx/media2/session/MediaSessionImplBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic run(Landroidx/media2/common/SessionPlayer;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 566
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaSessionImplBase$17;->run(Landroidx/media2/common/SessionPlayer;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public run(Landroidx/media2/common/SessionPlayer;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/common/SessionPlayer;",
            ")",
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 569
    invoke-virtual {p1}, Landroidx/media2/common/SessionPlayer;->getPlaylist()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
