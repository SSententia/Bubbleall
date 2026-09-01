.class public Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionCallback;
.super Landroidx/media2/session/MediaSession$SessionCallback;
.source "MediaLibraryService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MediaLibrarySessionCallback"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 114
    invoke-direct {p0}, Landroidx/media2/session/MediaSession$SessionCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onGetChildren(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;IILandroidx/media2/session/MediaLibraryService$LibraryParams;)Landroidx/media2/session/LibraryResult;
    .locals 0

    .line 185
    new-instance p1, Landroidx/media2/session/LibraryResult;

    const/4 p2, -0x6

    invoke-direct {p1, p2}, Landroidx/media2/session/LibraryResult;-><init>(I)V

    return-object p1
.end method

.method public onGetItem(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;)Landroidx/media2/session/LibraryResult;
    .locals 0

    .line 159
    new-instance p1, Landroidx/media2/session/LibraryResult;

    const/4 p2, -0x6

    invoke-direct {p1, p2}, Landroidx/media2/session/LibraryResult;-><init>(I)V

    return-object p1
.end method

.method public onGetLibraryRoot(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/MediaLibraryService$LibraryParams;)Landroidx/media2/session/LibraryResult;
    .locals 0

    .line 140
    new-instance p1, Landroidx/media2/session/LibraryResult;

    const/4 p2, -0x6

    invoke-direct {p1, p2}, Landroidx/media2/session/LibraryResult;-><init>(I)V

    return-object p1
.end method

.method public onGetSearchResult(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;IILandroidx/media2/session/MediaLibraryService$LibraryParams;)Landroidx/media2/session/LibraryResult;
    .locals 0

    .line 286
    new-instance p1, Landroidx/media2/session/LibraryResult;

    const/4 p2, -0x6

    invoke-direct {p1, p2}, Landroidx/media2/session/LibraryResult;-><init>(I)V

    return-object p1
.end method

.method public onSearch(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;Landroidx/media2/session/MediaLibraryService$LibraryParams;)I
    .locals 0

    const/4 p1, -0x6

    return p1
.end method

.method public onSubscribe(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;Landroidx/media2/session/MediaLibraryService$LibraryParams;)I
    .locals 0

    const/4 p1, -0x6

    return p1
.end method

.method public onUnsubscribe(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;)I
    .locals 0

    const/4 p1, -0x6

    return p1
.end method
