.class Landroidx/media2/session/MediaSessionImplBase$43;
.super Ljava/lang/Object;
.source "MediaSessionImplBase.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionImplBase;->notifyPlayerUpdatedNotLocked(Landroidx/media2/common/SessionPlayer;Landroidx/media2/session/MediaController$PlaybackInfo;Landroidx/media2/common/SessionPlayer;Landroidx/media2/session/MediaController$PlaybackInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionImplBase;

.field final synthetic val$oldPlaybackInfo:Landroidx/media2/session/MediaController$PlaybackInfo;

.field final synthetic val$oldPlayer:Landroidx/media2/common/SessionPlayer;

.field final synthetic val$playbackInfo:Landroidx/media2/session/MediaController$PlaybackInfo;

.field final synthetic val$player:Landroidx/media2/common/SessionPlayer;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionImplBase;Landroidx/media2/common/SessionPlayer;Landroidx/media2/session/MediaController$PlaybackInfo;Landroidx/media2/common/SessionPlayer;Landroidx/media2/session/MediaController$PlaybackInfo;)V
    .locals 0

    .line 1042
    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase$43;->this$0:Landroidx/media2/session/MediaSessionImplBase;

    iput-object p2, p0, Landroidx/media2/session/MediaSessionImplBase$43;->val$oldPlayer:Landroidx/media2/common/SessionPlayer;

    iput-object p3, p0, Landroidx/media2/session/MediaSessionImplBase$43;->val$oldPlaybackInfo:Landroidx/media2/session/MediaController$PlaybackInfo;

    iput-object p4, p0, Landroidx/media2/session/MediaSessionImplBase$43;->val$player:Landroidx/media2/common/SessionPlayer;

    iput-object p5, p0, Landroidx/media2/session/MediaSessionImplBase$43;->val$playbackInfo:Landroidx/media2/session/MediaController$PlaybackInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroidx/media2/session/MediaSession$ControllerCb;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1045
    iget-object v2, p0, Landroidx/media2/session/MediaSessionImplBase$43;->val$oldPlayer:Landroidx/media2/common/SessionPlayer;

    iget-object v3, p0, Landroidx/media2/session/MediaSessionImplBase$43;->val$oldPlaybackInfo:Landroidx/media2/session/MediaController$PlaybackInfo;

    iget-object v4, p0, Landroidx/media2/session/MediaSessionImplBase$43;->val$player:Landroidx/media2/common/SessionPlayer;

    iget-object v5, p0, Landroidx/media2/session/MediaSessionImplBase$43;->val$playbackInfo:Landroidx/media2/session/MediaController$PlaybackInfo;

    move-object v0, p1

    move v1, p2

    invoke-virtual/range {v0 .. v5}, Landroidx/media2/session/MediaSession$ControllerCb;->onPlayerChanged(ILandroidx/media2/common/SessionPlayer;Landroidx/media2/session/MediaController$PlaybackInfo;Landroidx/media2/common/SessionPlayer;Landroidx/media2/session/MediaController$PlaybackInfo;)V

    return-void
.end method
