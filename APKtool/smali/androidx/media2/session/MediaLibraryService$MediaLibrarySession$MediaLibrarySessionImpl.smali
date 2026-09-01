.class interface abstract Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;
.super Ljava/lang/Object;
.source "MediaLibraryService.java"

# interfaces
.implements Landroidx/media2/session/MediaSession$MediaSessionImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "MediaLibrarySessionImpl"
.end annotation


# virtual methods
.method public abstract getCallback()Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionCallback;
.end method

.method public abstract getInstance()Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;
.end method

.method public abstract notifyChildrenChanged(Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;ILandroidx/media2/session/MediaLibraryService$LibraryParams;)V
.end method

.method public abstract notifyChildrenChanged(Ljava/lang/String;ILandroidx/media2/session/MediaLibraryService$LibraryParams;)V
.end method

.method public abstract notifySearchResultChanged(Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;ILandroidx/media2/session/MediaLibraryService$LibraryParams;)V
.end method

.method public abstract onGetChildrenOnExecutor(Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;IILandroidx/media2/session/MediaLibraryService$LibraryParams;)Landroidx/media2/session/LibraryResult;
.end method

.method public abstract onGetItemOnExecutor(Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;)Landroidx/media2/session/LibraryResult;
.end method

.method public abstract onGetLibraryRootOnExecutor(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/MediaLibraryService$LibraryParams;)Landroidx/media2/session/LibraryResult;
.end method

.method public abstract onGetSearchResultOnExecutor(Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;IILandroidx/media2/session/MediaLibraryService$LibraryParams;)Landroidx/media2/session/LibraryResult;
.end method

.method public abstract onSearchOnExecutor(Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;Landroidx/media2/session/MediaLibraryService$LibraryParams;)I
.end method

.method public abstract onSubscribeOnExecutor(Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;Landroidx/media2/session/MediaLibraryService$LibraryParams;)I
.end method

.method public abstract onUnsubscribeOnExecutor(Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;)I
.end method
