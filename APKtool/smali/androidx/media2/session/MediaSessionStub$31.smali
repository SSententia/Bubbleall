.class Landroidx/media2/session/MediaSessionStub$31;
.super Ljava/lang/Object;
.source "MediaSessionStub.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionStub$SessionPlayerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionStub;->deselectTrack(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionStub;

.field final synthetic val$trackInfoParcel:Landroidx/versionedparcelable/ParcelImpl;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionStub;Landroidx/versionedparcelable/ParcelImpl;)V
    .locals 0

    .line 1000
    iput-object p1, p0, Landroidx/media2/session/MediaSessionStub$31;->this$0:Landroidx/media2/session/MediaSessionStub;

    iput-object p2, p0, Landroidx/media2/session/MediaSessionStub$31;->val$trackInfoParcel:Landroidx/versionedparcelable/ParcelImpl;

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

    .line 1004
    iget-object p2, p0, Landroidx/media2/session/MediaSessionStub$31;->val$trackInfoParcel:Landroidx/versionedparcelable/ParcelImpl;

    invoke-static {p2}, Landroidx/media2/common/MediaParcelUtils;->fromParcelable(Landroidx/versionedparcelable/ParcelImpl;)Landroidx/versionedparcelable/VersionedParcelable;

    move-result-object p2

    check-cast p2, Landroidx/media2/common/SessionPlayer$TrackInfo;

    if-nez p2, :cond_0

    const/4 p1, -0x3

    .line 1006
    invoke-static {p1}, Landroidx/media2/common/SessionPlayer$PlayerResult;->createFuture(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 1008
    :cond_0
    invoke-interface {p1, p2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->deselectTrack(Landroidx/media2/common/SessionPlayer$TrackInfo;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
