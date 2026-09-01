.class Landroidx/media2/session/MediaSessionStub$37;
.super Ljava/lang/Object;
.source "MediaSessionStub.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionStub$LibrarySessionCallbackTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionStub;->subscribe(Landroidx/media2/session/IMediaController;ILjava/lang/String;Landroidx/versionedparcelable/ParcelImpl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/media2/session/MediaSessionStub$LibrarySessionCallbackTask<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionStub;

.field final synthetic val$libraryParams:Landroidx/versionedparcelable/ParcelImpl;

.field final synthetic val$parentId:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionStub;Ljava/lang/String;Landroidx/versionedparcelable/ParcelImpl;)V
    .locals 0

    .line 1146
    iput-object p1, p0, Landroidx/media2/session/MediaSessionStub$37;->this$0:Landroidx/media2/session/MediaSessionStub;

    iput-object p2, p0, Landroidx/media2/session/MediaSessionStub$37;->val$parentId:Ljava/lang/String;

    iput-object p3, p0, Landroidx/media2/session/MediaSessionStub$37;->val$libraryParams:Landroidx/versionedparcelable/ParcelImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Ljava/lang/Integer;
    .locals 2

    .line 1150
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$37;->val$parentId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1151
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "subscribe(): Ignoring empty parentId from "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "MediaSessionStub"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, -0x3

    .line 1152
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 1154
    :cond_0
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$37;->val$parentId:Ljava/lang/String;

    iget-object v1, p0, Landroidx/media2/session/MediaSessionStub$37;->val$libraryParams:Landroidx/versionedparcelable/ParcelImpl;

    .line 1156
    invoke-static {v1}, Landroidx/media2/common/MediaParcelUtils;->fromParcelable(Landroidx/versionedparcelable/ParcelImpl;)Landroidx/versionedparcelable/VersionedParcelable;

    move-result-object v1

    check-cast v1, Landroidx/media2/session/MediaLibraryService$LibraryParams;

    .line 1154
    invoke-interface {p1, p2, v0, v1}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;->onSubscribeOnExecutor(Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;Landroidx/media2/session/MediaLibraryService$LibraryParams;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

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

    .line 1146
    invoke-virtual {p0, p1, p2}, Landroidx/media2/session/MediaSessionStub$37;->run(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
