.class Landroidx/media2/session/MediaLibraryServiceImplBase;
.super Landroidx/media2/session/MediaSessionServiceImplBase;
.source "MediaLibraryServiceImplBase.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Landroidx/media2/session/MediaSessionServiceImplBase;-><init>()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    .line 28
    const-string v0, "androidx.media2.session.MediaLibraryService"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 29
    invoke-virtual {p0}, Landroidx/media2/session/MediaLibraryServiceImplBase;->getServiceBinder()Landroid/os/IBinder;

    move-result-object p1

    return-object p1

    .line 31
    :cond_0
    invoke-super {p0, p1}, Landroidx/media2/session/MediaSessionServiceImplBase;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method
