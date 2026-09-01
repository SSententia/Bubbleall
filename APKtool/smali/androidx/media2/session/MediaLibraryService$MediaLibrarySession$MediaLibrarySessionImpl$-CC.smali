.class public final synthetic Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl$-CC;
.super Ljava/lang/Object;
.source "MediaLibraryService.java"


# direct methods
.method public static bridge synthetic $default$getCallback(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;)Landroidx/media2/session/MediaSession$SessionCallback;
    .locals 1
    .param p0, "_this"    # Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;

    .line 464
    invoke-interface {p0}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;->getCallback()Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionCallback;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic $default$getInstance(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;)Landroidx/media2/session/MediaSession;
    .locals 1
    .param p0, "_this"    # Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;

    .line 464
    invoke-interface {p0}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;->getInstance()Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;

    move-result-object v0

    return-object v0
.end method
