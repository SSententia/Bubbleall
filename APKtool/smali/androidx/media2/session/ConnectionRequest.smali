.class Landroidx/media2/session/ConnectionRequest;
.super Ljava/lang/Object;
.source "ConnectionRequest.java"

# interfaces
.implements Landroidx/versionedparcelable/VersionedParcelable;


# instance fields
.field mConnectionHints:Landroid/os/Bundle;

.field mPackageName:Ljava/lang/String;

.field mPid:I

.field mVersion:I


# direct methods
.method constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 49
    iput v0, p0, Landroidx/media2/session/ConnectionRequest;->mVersion:I

    .line 50
    iput-object p1, p0, Landroidx/media2/session/ConnectionRequest;->mPackageName:Ljava/lang/String;

    .line 51
    iput p2, p0, Landroidx/media2/session/ConnectionRequest;->mPid:I

    .line 52
    iput-object p3, p0, Landroidx/media2/session/ConnectionRequest;->mConnectionHints:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public getConnectionHints()Landroid/os/Bundle;
    .locals 1

    .line 68
    iget-object v0, p0, Landroidx/media2/session/ConnectionRequest;->mConnectionHints:Landroid/os/Bundle;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Landroidx/media2/session/ConnectionRequest;->mPackageName:Ljava/lang/String;

    return-object v0
.end method

.method public getPid()I
    .locals 1

    .line 64
    iget v0, p0, Landroidx/media2/session/ConnectionRequest;->mPid:I

    return v0
.end method

.method public getVersion()I
    .locals 1

    .line 60
    iget v0, p0, Landroidx/media2/session/ConnectionRequest;->mVersion:I

    return v0
.end method
