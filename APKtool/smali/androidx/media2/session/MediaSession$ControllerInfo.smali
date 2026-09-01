.class public final Landroidx/media2/session/MediaSession$ControllerInfo;
.super Ljava/lang/Object;
.source "MediaSession.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ControllerInfo"
.end annotation


# instance fields
.field private final mConnectionHints:Landroid/os/Bundle;

.field private final mControllerCb:Landroidx/media2/session/MediaSession$ControllerCb;

.field private final mControllerVersion:I

.field private final mIsTrusted:Z

.field private final mRemoteUserInfo:Landroidx/media/MediaSessionManager$RemoteUserInfo;


# direct methods
.method constructor <init>(Landroidx/media/MediaSessionManager$RemoteUserInfo;IZLandroidx/media2/session/MediaSession$ControllerCb;Landroid/os/Bundle;)V
    .locals 0

    .line 886
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 887
    iput-object p1, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mRemoteUserInfo:Landroidx/media/MediaSessionManager$RemoteUserInfo;

    .line 888
    iput p2, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mControllerVersion:I

    .line 889
    iput-boolean p3, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mIsTrusted:Z

    .line 890
    iput-object p4, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mControllerCb:Landroidx/media2/session/MediaSession$ControllerCb;

    if-eqz p5, :cond_1

    .line 892
    invoke-static {p5}, Landroidx/media2/session/MediaUtils;->doesBundleHaveCustomParcelable(Landroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 895
    :cond_0
    iput-object p5, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mConnectionHints:Landroid/os/Bundle;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 893
    iput-object p1, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mConnectionHints:Landroid/os/Bundle;

    :goto_1
    return-void
.end method

.method static createLegacyControllerInfo()Landroidx/media2/session/MediaSession$ControllerInfo;
    .locals 7

    .line 995
    new-instance v1, Landroidx/media/MediaSessionManager$RemoteUserInfo;

    const-string v0, "android.media.session.MediaController"

    const/4 v2, -0x1

    invoke-direct {v1, v0, v2, v2}, Landroidx/media/MediaSessionManager$RemoteUserInfo;-><init>(Ljava/lang/String;II)V

    .line 1000
    new-instance v6, Landroidx/media2/session/MediaSession$ControllerInfo;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Landroidx/media2/session/MediaSession$ControllerInfo;-><init>(Landroidx/media/MediaSessionManager$RemoteUserInfo;IZLandroidx/media2/session/MediaSession$ControllerCb;Landroid/os/Bundle;)V

    return-object v6
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 970
    instance-of v0, p1, Landroidx/media2/session/MediaSession$ControllerInfo;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-ne p0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 976
    :cond_1
    check-cast p1, Landroidx/media2/session/MediaSession$ControllerInfo;

    .line 977
    iget-object v0, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mControllerCb:Landroidx/media2/session/MediaSession$ControllerCb;

    if-nez v0, :cond_3

    iget-object v1, p1, Landroidx/media2/session/MediaSession$ControllerInfo;->mControllerCb:Landroidx/media2/session/MediaSession$ControllerCb;

    if-eqz v1, :cond_2

    goto :goto_0

    .line 980
    :cond_2
    iget-object v0, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mRemoteUserInfo:Landroidx/media/MediaSessionManager$RemoteUserInfo;

    iget-object p1, p1, Landroidx/media2/session/MediaSession$ControllerInfo;->mRemoteUserInfo:Landroidx/media/MediaSessionManager$RemoteUserInfo;

    invoke-virtual {v0, p1}, Landroidx/media/MediaSessionManager$RemoteUserInfo;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 978
    :cond_3
    :goto_0
    iget-object p1, p1, Landroidx/media2/session/MediaSession$ControllerInfo;->mControllerCb:Landroidx/media2/session/MediaSession$ControllerCb;

    invoke-static {v0, p1}, Landroidx/core/util/ObjectsCompat;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getConnectionHints()Landroid/os/Bundle;
    .locals 2

    .line 947
    iget-object v0, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mConnectionHints:Landroid/os/Bundle;

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    iget-object v1, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mConnectionHints:Landroid/os/Bundle;

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    :goto_0
    return-object v0
.end method

.method getControllerCb()Landroidx/media2/session/MediaSession$ControllerCb;
    .locals 1

    .line 990
    iget-object v0, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mControllerCb:Landroidx/media2/session/MediaSession$ControllerCb;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 927
    iget-object v0, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mRemoteUserInfo:Landroidx/media/MediaSessionManager$RemoteUserInfo;

    invoke-virtual {v0}, Landroidx/media/MediaSessionManager$RemoteUserInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method getRemoteUserInfo()Landroidx/media/MediaSessionManager$RemoteUserInfo;
    .locals 1

    .line 900
    iget-object v0, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mRemoteUserInfo:Landroidx/media/MediaSessionManager$RemoteUserInfo;

    return-object v0
.end method

.method public getUid()I
    .locals 1

    .line 939
    iget-object v0, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mRemoteUserInfo:Landroidx/media/MediaSessionManager$RemoteUserInfo;

    invoke-virtual {v0}, Landroidx/media/MediaSessionManager$RemoteUserInfo;->getUid()I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 965
    iget-object v0, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mControllerCb:Landroidx/media2/session/MediaSession$ControllerCb;

    iget-object v1, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mRemoteUserInfo:Landroidx/media/MediaSessionManager$RemoteUserInfo;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Landroidx/core/util/ObjectsCompat;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isTrusted()Z
    .locals 1

    .line 960
    iget-boolean v0, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mIsTrusted:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 985
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ControllerInfo {pkg="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mRemoteUserInfo:Landroidx/media/MediaSessionManager$RemoteUserInfo;

    invoke-virtual {v1}, Landroidx/media/MediaSessionManager$RemoteUserInfo;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", uid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media2/session/MediaSession$ControllerInfo;->mRemoteUserInfo:Landroidx/media/MediaSessionManager$RemoteUserInfo;

    .line 986
    invoke-virtual {v1}, Landroidx/media/MediaSessionManager$RemoteUserInfo;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "})"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
