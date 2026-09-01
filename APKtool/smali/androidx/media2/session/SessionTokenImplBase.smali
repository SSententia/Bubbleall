.class final Landroidx/media2/session/SessionTokenImplBase;
.super Ljava/lang/Object;
.source "SessionTokenImplBase.java"

# interfaces
.implements Landroidx/media2/session/SessionToken$SessionTokenImpl;


# instance fields
.field mComponentName:Landroid/content/ComponentName;

.field mExtras:Landroid/os/Bundle;

.field mISession:Landroid/os/IBinder;

.field mPackageName:Ljava/lang/String;

.field mServiceName:Ljava/lang/String;

.field mType:I

.field mUid:I


# direct methods
.method constructor <init>()V
    .locals 0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(IILjava/lang/String;Landroidx/media2/session/IMediaSession;Landroid/os/Bundle;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput p1, p0, Landroidx/media2/session/SessionTokenImplBase;->mUid:I

    .line 73
    iput p2, p0, Landroidx/media2/session/SessionTokenImplBase;->mType:I

    .line 74
    iput-object p3, p0, Landroidx/media2/session/SessionTokenImplBase;->mPackageName:Ljava/lang/String;

    const/4 p1, 0x0

    .line 75
    iput-object p1, p0, Landroidx/media2/session/SessionTokenImplBase;->mServiceName:Ljava/lang/String;

    .line 76
    iput-object p1, p0, Landroidx/media2/session/SessionTokenImplBase;->mComponentName:Landroid/content/ComponentName;

    .line 77
    invoke-interface {p4}, Landroidx/media2/session/IMediaSession;->asBinder()Landroid/os/IBinder;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/SessionTokenImplBase;->mISession:Landroid/os/IBinder;

    .line 78
    iput-object p5, p0, Landroidx/media2/session/SessionTokenImplBase;->mExtras:Landroid/os/Bundle;

    return-void
.end method

.method constructor <init>(Landroid/content/ComponentName;II)V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 61
    iput-object p1, p0, Landroidx/media2/session/SessionTokenImplBase;->mComponentName:Landroid/content/ComponentName;

    .line 62
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mPackageName:Ljava/lang/String;

    .line 63
    invoke-virtual {p1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/SessionTokenImplBase;->mServiceName:Ljava/lang/String;

    .line 64
    iput p2, p0, Landroidx/media2/session/SessionTokenImplBase;->mUid:I

    .line 65
    iput p3, p0, Landroidx/media2/session/SessionTokenImplBase;->mType:I

    const/4 p1, 0x0

    .line 66
    iput-object p1, p0, Landroidx/media2/session/SessionTokenImplBase;->mISession:Landroid/os/IBinder;

    .line 67
    iput-object p1, p0, Landroidx/media2/session/SessionTokenImplBase;->mExtras:Landroid/os/Bundle;

    return-void

    .line 59
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "serviceComponent shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 95
    instance-of v0, p1, Landroidx/media2/session/SessionTokenImplBase;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 98
    :cond_0
    check-cast p1, Landroidx/media2/session/SessionTokenImplBase;

    .line 99
    iget v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mUid:I

    iget v2, p1, Landroidx/media2/session/SessionTokenImplBase;->mUid:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mPackageName:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media2/session/SessionTokenImplBase;->mPackageName:Ljava/lang/String;

    .line 100
    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mServiceName:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media2/session/SessionTokenImplBase;->mServiceName:Ljava/lang/String;

    .line 101
    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mType:I

    iget v2, p1, Landroidx/media2/session/SessionTokenImplBase;->mType:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mISession:Landroid/os/IBinder;

    iget-object p1, p1, Landroidx/media2/session/SessionTokenImplBase;->mISession:Landroid/os/IBinder;

    .line 103
    invoke-static {v0, p1}, Landroidx/core/util/ObjectsCompat;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public getBinder()Ljava/lang/Object;
    .locals 1

    .line 159
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mISession:Landroid/os/IBinder;

    return-object v0
.end method

.method public getComponentName()Landroid/content/ComponentName;
    .locals 1

    .line 142
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mComponentName:Landroid/content/ComponentName;

    return-object v0
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 1

    .line 154
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mExtras:Landroid/os/Bundle;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mPackageName:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceName()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mServiceName:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 148
    iget v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mType:I

    return v0
.end method

.method public getUid()I
    .locals 1

    .line 120
    iget v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mUid:I

    return v0
.end method

.method public hashCode()I
    .locals 6

    .line 90
    iget v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Landroidx/media2/session/SessionTokenImplBase;->mUid:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Landroidx/media2/session/SessionTokenImplBase;->mPackageName:Ljava/lang/String;

    iget-object v3, p0, Landroidx/media2/session/SessionTokenImplBase;->mServiceName:Ljava/lang/String;

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-static {v4}, Landroidx/core/util/ObjectsCompat;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isLegacySession()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SessionToken {pkg="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/media2/session/SessionTokenImplBase;->mPackageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/media2/session/SessionTokenImplBase;->mType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " service="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media2/session/SessionTokenImplBase;->mServiceName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " IMediaSession="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media2/session/SessionTokenImplBase;->mISession:Landroid/os/IBinder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " extras="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media2/session/SessionTokenImplBase;->mExtras:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
