.class Landroidx/media2/session/MediaControllerImplBase$SessionServiceConnection;
.super Ljava/lang/Object;
.source "MediaControllerImplBase.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaControllerImplBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SessionServiceConnection"
.end annotation


# instance fields
.field private final mConnectionHints:Landroid/os/Bundle;

.field final synthetic this$0:Landroidx/media2/session/MediaControllerImplBase;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaControllerImplBase;Landroid/os/Bundle;)V
    .locals 0

    .line 1351
    iput-object p1, p0, Landroidx/media2/session/MediaControllerImplBase$SessionServiceConnection;->this$0:Landroidx/media2/session/MediaControllerImplBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1352
    iput-object p2, p0, Landroidx/media2/session/MediaControllerImplBase$SessionServiceConnection;->mConnectionHints:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public onBindingDied(Landroid/content/ComponentName;)V
    .locals 0

    .line 1403
    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplBase$SessionServiceConnection;->this$0:Landroidx/media2/session/MediaControllerImplBase;

    iget-object p1, p1, Landroidx/media2/session/MediaControllerImplBase;->mInstance:Landroidx/media2/session/MediaController;

    invoke-virtual {p1}, Landroidx/media2/session/MediaController;->close()V

    return-void
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 6

    .line 1357
    const-string v0, "MC2ImplBase"

    .line 0
    const-string v1, "Expected connection to "

    const-string v2, "onServiceConnected "

    const-string v3, "Service "

    .line 1360
    :try_start_0
    sget-boolean v4, Landroidx/media2/session/MediaControllerImplBase;->DEBUG:Z

    if-eqz v4, :cond_0

    .line 1361
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1363
    :cond_0
    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplBase$SessionServiceConnection;->this$0:Landroidx/media2/session/MediaControllerImplBase;

    iget-object v2, v2, Landroidx/media2/session/MediaControllerImplBase;->mToken:Landroidx/media2/session/SessionToken;

    invoke-virtual {v2}, Landroidx/media2/session/SessionToken;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 1364
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplBase$SessionServiceConnection;->this$0:Landroidx/media2/session/MediaControllerImplBase;

    iget-object v1, v1, Landroidx/media2/session/MediaControllerImplBase;->mToken:Landroidx/media2/session/SessionToken;

    invoke-virtual {v1}, Landroidx/media2/session/SessionToken;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " but is connected to "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1381
    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplBase$SessionServiceConnection;->this$0:Landroidx/media2/session/MediaControllerImplBase;

    iget-object p1, p1, Landroidx/media2/session/MediaControllerImplBase;->mInstance:Landroidx/media2/session/MediaController;

    invoke-virtual {p1}, Landroidx/media2/session/MediaController;->close()V

    return-void

    .line 1368
    :cond_1
    :try_start_1
    invoke-static {p2}, Landroidx/media2/session/IMediaSessionService$Stub;->asInterface(Landroid/os/IBinder;)Landroidx/media2/session/IMediaSessionService;

    move-result-object p2

    if-nez p2, :cond_2

    .line 1370
    const-string p2, "Service interface is missing."

    invoke-static {v0, p2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1381
    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplBase$SessionServiceConnection;->this$0:Landroidx/media2/session/MediaControllerImplBase;

    iget-object p1, p1, Landroidx/media2/session/MediaControllerImplBase;->mInstance:Landroidx/media2/session/MediaController;

    invoke-virtual {p1}, Landroidx/media2/session/MediaController;->close()V

    return-void

    .line 1373
    :cond_2
    :try_start_2
    new-instance v1, Landroidx/media2/session/ConnectionRequest;

    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplBase$SessionServiceConnection;->this$0:Landroidx/media2/session/MediaControllerImplBase;

    invoke-virtual {v2}, Landroidx/media2/session/MediaControllerImplBase;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 1374
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v4

    iget-object v5, p0, Landroidx/media2/session/MediaControllerImplBase$SessionServiceConnection;->mConnectionHints:Landroid/os/Bundle;

    invoke-direct {v1, v2, v4, v5}, Landroidx/media2/session/ConnectionRequest;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 1375
    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplBase$SessionServiceConnection;->this$0:Landroidx/media2/session/MediaControllerImplBase;

    iget-object v2, v2, Landroidx/media2/session/MediaControllerImplBase;->mControllerStub:Landroidx/media2/session/MediaControllerStub;

    invoke-static {v1}, Landroidx/media2/common/MediaParcelUtils;->toParcelable(Landroidx/versionedparcelable/VersionedParcelable;)Landroidx/versionedparcelable/ParcelImpl;

    move-result-object v1

    invoke-interface {p2, v2, v1}, Landroidx/media2/session/IMediaSessionService;->connect(Landroidx/media2/session/IMediaController;Landroidx/versionedparcelable/ParcelImpl;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 1378
    :catch_0
    :try_start_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " has died prematurely"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1381
    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplBase$SessionServiceConnection;->this$0:Landroidx/media2/session/MediaControllerImplBase;

    iget-object p1, p1, Landroidx/media2/session/MediaControllerImplBase;->mInstance:Landroidx/media2/session/MediaController;

    invoke-virtual {p1}, Landroidx/media2/session/MediaController;->close()V

    :goto_0
    return-void

    :goto_1
    iget-object p2, p0, Landroidx/media2/session/MediaControllerImplBase$SessionServiceConnection;->this$0:Landroidx/media2/session/MediaControllerImplBase;

    iget-object p2, p2, Landroidx/media2/session/MediaControllerImplBase;->mInstance:Landroidx/media2/session/MediaController;

    invoke-virtual {p2}, Landroidx/media2/session/MediaController;->close()V

    .line 1383
    throw p1
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 1392
    sget-boolean v0, Landroidx/media2/session/MediaControllerImplBase;->DEBUG:Z

    if-eqz v0, :cond_0

    .line 1393
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Session service "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is disconnected."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MC2ImplBase"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1395
    :cond_0
    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplBase$SessionServiceConnection;->this$0:Landroidx/media2/session/MediaControllerImplBase;

    iget-object p1, p1, Landroidx/media2/session/MediaControllerImplBase;->mInstance:Landroidx/media2/session/MediaController;

    invoke-virtual {p1}, Landroidx/media2/session/MediaController;->close()V

    return-void
.end method
