.class Landroidx/media2/session/MediaSessionStub$1;
.super Ljava/lang/Object;
.source "MediaSessionStub.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionStub;->dispatchSessionTaskInternal(Landroidx/media2/session/IMediaController;ILandroidx/media2/session/SessionCommand;ILandroidx/media2/session/MediaSessionStub$SessionTask;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionStub;

.field final synthetic val$commandCode:I

.field final synthetic val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

.field final synthetic val$seq:I

.field final synthetic val$sessionCommand:Landroidx/media2/session/SessionCommand;

.field final synthetic val$sessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

.field final synthetic val$task:Landroidx/media2/session/MediaSessionStub$SessionTask;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionStub;Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommand;IILandroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSessionStub$SessionTask;)V
    .locals 0

    .line 184
    iput-object p1, p0, Landroidx/media2/session/MediaSessionStub$1;->this$0:Landroidx/media2/session/MediaSessionStub;

    iput-object p2, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    iput-object p3, p0, Landroidx/media2/session/MediaSessionStub$1;->val$sessionCommand:Landroidx/media2/session/SessionCommand;

    iput p4, p0, Landroidx/media2/session/MediaSessionStub$1;->val$seq:I

    iput p5, p0, Landroidx/media2/session/MediaSessionStub$1;->val$commandCode:I

    iput-object p6, p0, Landroidx/media2/session/MediaSessionStub$1;->val$sessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    iput-object p7, p0, Landroidx/media2/session/MediaSessionStub$1;->val$task:Landroidx/media2/session/MediaSessionStub$SessionTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    const-string v0, "LibrarySessionCallback has returned null, commandCode="

    const-string v1, "SessionCallback has returned null, commandCode="

    const-string v2, "Unknown task "

    const-string v3, "SessionPlayer has returned null, commandCode="

    .line 188
    iget-object v4, p0, Landroidx/media2/session/MediaSessionStub$1;->this$0:Landroidx/media2/session/MediaSessionStub;

    iget-object v4, v4, Landroidx/media2/session/MediaSessionStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    iget-object v5, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    invoke-virtual {v4, v5}, Landroidx/media2/session/ConnectedControllersManager;->isConnected(Landroidx/media2/session/MediaSession$ControllerInfo;)Z

    move-result v4

    if-nez v4, :cond_0

    return-void

    .line 192
    :cond_0
    iget-object v4, p0, Landroidx/media2/session/MediaSessionStub$1;->val$sessionCommand:Landroidx/media2/session/SessionCommand;

    const-string v5, " isn\'t allowed."

    const/4 v6, -0x4

    const-string v7, ") from "

    const-string v8, "MediaSessionStub"

    const-string v9, "Command ("

    if-eqz v4, :cond_3

    .line 193
    iget-object v4, p0, Landroidx/media2/session/MediaSessionStub$1;->this$0:Landroidx/media2/session/MediaSessionStub;

    iget-object v4, v4, Landroidx/media2/session/MediaSessionStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    iget-object v10, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    iget-object v11, p0, Landroidx/media2/session/MediaSessionStub$1;->val$sessionCommand:Landroidx/media2/session/SessionCommand;

    invoke-virtual {v4, v10, v11}, Landroidx/media2/session/ConnectedControllersManager;->isAllowedCommand(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommand;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 195
    sget-boolean v0, Landroidx/media2/session/MediaSessionStub;->DEBUG:Z

    if-eqz v0, :cond_1

    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/media2/session/MediaSessionStub$1;->val$sessionCommand:Landroidx/media2/session/SessionCommand;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    :cond_1
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    iget v1, p0, Landroidx/media2/session/MediaSessionStub$1;->val$seq:I

    invoke-static {v0, v1, v6}, Landroidx/media2/session/MediaSessionStub;->sendSessionResult(Landroidx/media2/session/MediaSession$ControllerInfo;II)V

    return-void

    .line 202
    :cond_2
    sget-object v4, Landroidx/media2/session/MediaSessionStub;->sCommandsForOnCommandRequest:Landroid/util/SparseArray;

    iget-object v5, p0, Landroidx/media2/session/MediaSessionStub$1;->val$sessionCommand:Landroidx/media2/session/SessionCommand;

    .line 203
    invoke-virtual {v5}, Landroidx/media2/session/SessionCommand;->getCommandCode()I

    move-result v5

    .line 202
    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/media2/session/SessionCommand;

    goto :goto_0

    .line 205
    :cond_3
    iget-object v4, p0, Landroidx/media2/session/MediaSessionStub$1;->this$0:Landroidx/media2/session/MediaSessionStub;

    iget-object v4, v4, Landroidx/media2/session/MediaSessionStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    iget-object v10, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    iget v11, p0, Landroidx/media2/session/MediaSessionStub$1;->val$commandCode:I

    invoke-virtual {v4, v10, v11}, Landroidx/media2/session/ConnectedControllersManager;->isAllowedCommand(Landroidx/media2/session/MediaSession$ControllerInfo;I)Z

    move-result v4

    if-nez v4, :cond_5

    .line 207
    sget-boolean v0, Landroidx/media2/session/MediaSessionStub;->DEBUG:Z

    if-eqz v0, :cond_4

    .line 208
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroidx/media2/session/MediaSessionStub$1;->val$commandCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    :cond_4
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    iget v1, p0, Landroidx/media2/session/MediaSessionStub$1;->val$seq:I

    invoke-static {v0, v1, v6}, Landroidx/media2/session/MediaSessionStub;->sendSessionResult(Landroidx/media2/session/MediaSession$ControllerInfo;II)V

    return-void

    .line 214
    :cond_5
    sget-object v4, Landroidx/media2/session/MediaSessionStub;->sCommandsForOnCommandRequest:Landroid/util/SparseArray;

    iget v5, p0, Landroidx/media2/session/MediaSessionStub$1;->val$commandCode:I

    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/media2/session/SessionCommand;

    :goto_0
    if-eqz v4, :cond_7

    .line 219
    :try_start_0
    iget-object v5, p0, Landroidx/media2/session/MediaSessionStub$1;->val$sessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v5}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getCallback()Landroidx/media2/session/MediaSession$SessionCallback;

    move-result-object v5

    iget-object v6, p0, Landroidx/media2/session/MediaSessionStub$1;->val$sessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    .line 220
    invoke-interface {v6}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getInstance()Landroidx/media2/session/MediaSession;

    move-result-object v6

    iget-object v10, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    .line 219
    invoke-virtual {v5, v6, v10, v4}, Landroidx/media2/session/MediaSession$SessionCallback;->onCommandRequest(Landroidx/media2/session/MediaSession;Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommand;)I

    move-result v5

    if-eqz v5, :cond_7

    .line 224
    sget-boolean v0, Landroidx/media2/session/MediaSessionStub;->DEBUG:Z

    if-eqz v0, :cond_6

    .line 225
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " was rejected by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media2/session/MediaSessionStub$1;->this$0:Landroidx/media2/session/MediaSessionStub;

    iget-object v1, v1, Landroidx/media2/session/MediaSessionStub;->mSessionImpl:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 229
    :cond_6
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    iget v1, p0, Landroidx/media2/session/MediaSessionStub$1;->val$seq:I

    invoke-static {v0, v1, v5}, Landroidx/media2/session/MediaSessionStub;->sendSessionResult(Landroidx/media2/session/MediaSession$ControllerInfo;II)V

    return-void

    .line 233
    :cond_7
    iget-object v4, p0, Landroidx/media2/session/MediaSessionStub$1;->val$task:Landroidx/media2/session/MediaSessionStub$SessionTask;

    instance-of v5, v4, Landroidx/media2/session/MediaSessionStub$SessionPlayerTask;

    if-eqz v5, :cond_9

    .line 234
    check-cast v4, Landroidx/media2/session/MediaSessionStub$SessionPlayerTask;

    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$1;->val$sessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    iget-object v1, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    .line 235
    invoke-interface {v4, v0, v1}, Landroidx/media2/session/MediaSessionStub$SessionPlayerTask;->run(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 240
    new-instance v1, Landroidx/media2/session/MediaSessionStub$1$1;

    invoke-direct {v1, p0, v0}, Landroidx/media2/session/MediaSessionStub$1$1;-><init>(Landroidx/media2/session/MediaSessionStub$1;Lcom/google/common/util/concurrent/ListenableFuture;)V

    sget-object v2, Landroidx/media2/session/MediaUtils;->DIRECT_EXECUTOR:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto/16 :goto_1

    .line 237
    :cond_8
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Landroidx/media2/session/MediaSessionStub$1;->val$commandCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 255
    :cond_9
    instance-of v3, v4, Landroidx/media2/session/MediaSessionStub$SessionCallbackTask;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, ". Fix bug"

    const-string v6, "Unexpected return type "

    if-eqz v3, :cond_e

    .line 256
    :try_start_1
    check-cast v4, Landroidx/media2/session/MediaSessionStub$SessionCallbackTask;

    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$1;->val$sessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    iget-object v2, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    invoke-interface {v4, v0, v2}, Landroidx/media2/session/MediaSessionStub$SessionCallbackTask;->run(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 261
    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_a

    .line 262
    iget-object v1, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    iget v2, p0, Landroidx/media2/session/MediaSessionStub$1;->val$seq:I

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v1, v2, v0}, Landroidx/media2/session/MediaSessionStub;->sendSessionResult(Landroidx/media2/session/MediaSession$ControllerInfo;II)V

    goto/16 :goto_1

    .line 263
    :cond_a
    instance-of v1, v0, Landroidx/media2/session/SessionResult;

    if-eqz v1, :cond_b

    .line 264
    iget-object v1, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    iget v2, p0, Landroidx/media2/session/MediaSessionStub$1;->val$seq:I

    check-cast v0, Landroidx/media2/session/SessionResult;

    invoke-static {v1, v2, v0}, Landroidx/media2/session/MediaSessionStub;->sendSessionResult(Landroidx/media2/session/MediaSession$ControllerInfo;ILandroidx/media2/session/SessionResult;)V

    goto/16 :goto_1

    .line 265
    :cond_b
    sget-boolean v1, Landroidx/media2/session/MediaSessionStub;->DEBUG:Z

    if-nez v1, :cond_c

    goto/16 :goto_1

    .line 266
    :cond_c
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 259
    :cond_d
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroidx/media2/session/MediaSessionStub$1;->val$commandCode:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 269
    :cond_e
    instance-of v1, v4, Landroidx/media2/session/MediaSessionStub$LibrarySessionCallbackTask;

    if-eqz v1, :cond_13

    .line 270
    check-cast v4, Landroidx/media2/session/MediaSessionStub$LibrarySessionCallbackTask;

    iget-object v1, p0, Landroidx/media2/session/MediaSessionStub$1;->val$sessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    check-cast v1, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;

    iget-object v2, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    invoke-interface {v4, v1, v2}, Landroidx/media2/session/MediaSessionStub$LibrarySessionCallbackTask;->run(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_12

    .line 275
    instance-of v0, v1, Ljava/lang/Integer;

    if-eqz v0, :cond_f

    .line 276
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    iget v2, p0, Landroidx/media2/session/MediaSessionStub$1;->val$seq:I

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v2, v1}, Landroidx/media2/session/MediaSessionStub;->sendLibraryResult(Landroidx/media2/session/MediaSession$ControllerInfo;II)V

    goto :goto_1

    .line 277
    :cond_f
    instance-of v0, v1, Landroidx/media2/session/LibraryResult;

    if-eqz v0, :cond_10

    .line 278
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    iget v2, p0, Landroidx/media2/session/MediaSessionStub$1;->val$seq:I

    check-cast v1, Landroidx/media2/session/LibraryResult;

    invoke-static {v0, v2, v1}, Landroidx/media2/session/MediaSessionStub;->sendLibraryResult(Landroidx/media2/session/MediaSession$ControllerInfo;ILandroidx/media2/session/LibraryResult;)V

    goto :goto_1

    .line 279
    :cond_10
    sget-boolean v0, Landroidx/media2/session/MediaSessionStub;->DEBUG:Z

    if-nez v0, :cond_11

    goto :goto_1

    .line 280
    :cond_11
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 273
    :cond_12
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Landroidx/media2/session/MediaSessionStub$1;->val$commandCode:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 283
    :cond_13
    sget-boolean v0, Landroidx/media2/session/MediaSessionStub;->DEBUG:Z

    if-nez v0, :cond_14

    goto :goto_1

    .line 284
    :cond_14
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Landroidx/media2/session/MediaSessionStub$1;->val$task:Landroidx/media2/session/MediaSessionStub$SessionTask;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    .line 298
    throw v0

    :catch_1
    move-exception v0

    .line 292
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Exception in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Landroidx/media2/session/MediaSessionStub$1;->val$controller:Landroidx/media2/session/MediaSession$ControllerInfo;

    invoke-virtual {v2}, Landroidx/media2/session/MediaSession$ControllerInfo;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    return-void
.end method
