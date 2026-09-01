.class Landroidx/media2/session/MediaSessionStub$32;
.super Ljava/lang/Object;
.source "MediaSessionStub.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionStub$LibrarySessionCallbackTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionStub;->getLibraryRoot(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/media2/session/MediaSessionStub$LibrarySessionCallbackTask<",
        "Landroidx/media2/session/LibraryResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionStub;

.field final synthetic val$libraryParams:Landroidx/versionedparcelable/ParcelImpl;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionStub;Landroidx/versionedparcelable/ParcelImpl;)V
    .locals 0

    .line 1025
    iput-object p1, p0, Landroidx/media2/session/MediaSessionStub$32;->this$0:Landroidx/media2/session/MediaSessionStub;

    iput-object p2, p0, Landroidx/media2/session/MediaSessionStub$32;->val$libraryParams:Landroidx/versionedparcelable/ParcelImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Landroidx/media2/session/LibraryResult;
    .locals 1

    .line 1029
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$32;->val$libraryParams:Landroidx/versionedparcelable/ParcelImpl;

    .line 1030
    invoke-static {v0}, Landroidx/media2/common/MediaParcelUtils;->fromParcelable(Landroidx/versionedparcelable/ParcelImpl;)Landroidx/versionedparcelable/VersionedParcelable;

    move-result-object v0

    check-cast v0, Landroidx/media2/session/MediaLibraryService$LibraryParams;

    .line 1029
    invoke-interface {p1, p2, v0}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;->onGetLibraryRootOnExecutor(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/MediaLibraryService$LibraryParams;)Landroidx/media2/session/LibraryResult;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic run(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1025
    invoke-virtual {p0, p1, p2}, Landroidx/media2/session/MediaSessionStub$32;->run(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Landroidx/media2/session/LibraryResult;

    move-result-object p1

    return-object p1
.end method
