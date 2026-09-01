.class public Landroidx/media2/session/MediaBrowser$BrowserCallback;
.super Landroidx/media2/session/MediaController$ControllerCallback;
.source "MediaBrowser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaBrowser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BrowserCallback"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Landroidx/media2/session/MediaController$ControllerCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onChildrenChanged(Landroidx/media2/session/MediaBrowser;Ljava/lang/String;ILandroidx/media2/session/MediaLibraryService$LibraryParams;)V
    .locals 0

    return-void
.end method

.method public onSearchResultChanged(Landroidx/media2/session/MediaBrowser;Ljava/lang/String;ILandroidx/media2/session/MediaLibraryService$LibraryParams;)V
    .locals 0

    return-void
.end method
