.class public Landroidx/media2/session/MediaUtils;
.super Ljava/lang/Object;
.source "MediaUtils.java"


# static fields
.field public static final CURRENT_VERSION:I = 0x0

.field public static final DIRECT_EXECUTOR:Ljava/util/concurrent/Executor;

.field private static final METADATA_COMPAT_KEY_TO_METADATA_KEY:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final METADATA_KEY_TO_METADATA_COMPAT_KEY:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final TAG:Ljava/lang/String; = "MediaUtils"

.field public static final TRANSACTION_SIZE_LIMIT_IN_BYTES:I = 0x40000

.field public static final VERSION_0:I = 0x0

.field public static final VERSION_UNKNOWN:I = -0x1

.field public static final sDefaultBrowserRoot:Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 98
    new-instance v0, Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;

    const-string v1, "androidx.media2.session.MediaLibraryService"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    sput-object v0, Landroidx/media2/session/MediaUtils;->sDefaultBrowserRoot:Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;

    .line 101
    new-instance v0, Landroidx/media2/session/MediaUtils$1;

    invoke-direct {v0}, Landroidx/media2/session/MediaUtils$1;-><init>()V

    sput-object v0, Landroidx/media2/session/MediaUtils;->DIRECT_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 117
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Landroidx/media2/session/MediaUtils;->METADATA_COMPAT_KEY_TO_METADATA_KEY:Ljava/util/Map;

    .line 118
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, Landroidx/media2/session/MediaUtils;->METADATA_KEY_TO_METADATA_COMPAT_KEY:Ljava/util/Map;

    .line 120
    const-string v1, "android.media.metadata.ADVERTISEMENT"

    const-string v2, "androidx.media2.metadata.ADVERTISEMENT"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    const-string v1, "android.media.metadata.BT_FOLDER_TYPE"

    const-string v2, "androidx.media2.metadata.BROWSABLE"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    const-string v1, "android.media.metadata.DOWNLOAD_STATUS"

    const-string v2, "androidx.media2.metadata.DOWNLOAD_STATUS"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 129
    sget-object v2, Landroidx/media2/session/MediaUtils;->METADATA_KEY_TO_METADATA_COMPAT_KEY:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 132
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 130
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Shouldn\'t map to the same value"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static convertCommandButtonListToParcelImplList(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media2/session/MediaSession$CommandButton;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/versionedparcelable/ParcelImpl;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 683
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 684
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 685
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media2/session/MediaSession$CommandButton;

    .line 686
    invoke-static {v2}, Landroidx/media2/common/MediaParcelUtils;->toParcelable(Landroidx/versionedparcelable/VersionedParcelable;)Landroidx/versionedparcelable/ParcelImpl;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static convertMediaItemListToMediaItemList(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 372
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 373
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 374
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    invoke-static {v2}, Landroidx/media2/session/MediaUtils;->convertToMediaItem(Landroid/support/v4/media/MediaBrowserCompat$MediaItem;)Landroidx/media2/common/MediaItem;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static convertMediaItemListToParcelImplListSlice(Ljava/util/List;)Landroidx/media2/common/ParcelImplListSlice;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;)",
            "Landroidx/media2/common/ParcelImplListSlice;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 699
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 700
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 701
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media2/common/MediaItem;

    if-eqz v2, :cond_1

    .line 703
    invoke-static {v2}, Landroidx/media2/common/MediaParcelUtils;->toParcelable(Landroidx/versionedparcelable/VersionedParcelable;)Landroidx/versionedparcelable/ParcelImpl;

    move-result-object v2

    .line 704
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 707
    :cond_2
    new-instance p0, Landroidx/media2/common/ParcelImplListSlice;

    invoke-direct {p0, v0}, Landroidx/media2/common/ParcelImplListSlice;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method public static convertParcelImplListSliceToMediaItemList(Landroidx/media2/common/ParcelImplListSlice;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/common/ParcelImplListSlice;",
            ")",
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 449
    :cond_0
    invoke-virtual {p0}, Landroidx/media2/common/ParcelImplListSlice;->getList()Ljava/util/List;

    move-result-object p0

    .line 450
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 451
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 452
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/versionedparcelable/ParcelImpl;

    if-eqz v2, :cond_1

    .line 454
    invoke-static {v2}, Landroidx/media2/common/MediaParcelUtils;->fromParcelable(Landroidx/versionedparcelable/ParcelImpl;)Landroidx/versionedparcelable/VersionedParcelable;

    move-result-object v2

    check-cast v2, Landroidx/media2/common/MediaItem;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static convertQueueItemListToMediaItemList(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 386
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 387
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 388
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    invoke-static {v2}, Landroidx/media2/session/MediaUtils;->convertToMediaItem(Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;)Landroidx/media2/common/MediaItem;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 390
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static convertToCustomLayout(Landroid/support/v4/media/session/PlaybackStateCompat;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/media/session/PlaybackStateCompat;",
            ")",
            "Ljava/util/List<",
            "Landroidx/media2/session/MediaSession$CommandButton;",
            ">;"
        }
    .end annotation

    .line 952
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p0, :cond_0

    return-object v0

    .line 956
    :cond_0
    invoke-virtual {p0}, Landroid/support/v4/media/session/PlaybackStateCompat;->getCustomActions()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 957
    new-instance v2, Landroidx/media2/session/MediaSession$CommandButton$Builder;

    invoke-direct {v2}, Landroidx/media2/session/MediaSession$CommandButton$Builder;-><init>()V

    new-instance v3, Landroidx/media2/session/SessionCommand;

    .line 958
    invoke-virtual {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Landroidx/media2/session/SessionCommand;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v2, v3}, Landroidx/media2/session/MediaSession$CommandButton$Builder;->setCommand(Landroidx/media2/session/SessionCommand;)Landroidx/media2/session/MediaSession$CommandButton$Builder;

    move-result-object v2

    .line 959
    invoke-virtual {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->getName()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/media2/session/MediaSession$CommandButton$Builder;->setDisplayName(Ljava/lang/CharSequence;)Landroidx/media2/session/MediaSession$CommandButton$Builder;

    move-result-object v2

    const/4 v3, 0x1

    .line 960
    invoke-virtual {v2, v3}, Landroidx/media2/session/MediaSession$CommandButton$Builder;->setEnabled(Z)Landroidx/media2/session/MediaSession$CommandButton$Builder;

    move-result-object v2

    .line 961
    invoke-virtual {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->getIcon()I

    move-result v1

    invoke-virtual {v2, v1}, Landroidx/media2/session/MediaSession$CommandButton$Builder;->setIconResId(I)Landroidx/media2/session/MediaSession$CommandButton$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/media2/session/MediaSession$CommandButton$Builder;->build()Landroidx/media2/session/MediaSession$CommandButton;

    move-result-object v1

    .line 962
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static convertToLibraryParams(Landroid/content/Context;Landroid/os/Bundle;)Landroidx/media2/session/MediaLibraryService$LibraryParams;
    .locals 1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 852
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 853
    new-instance p0, Landroidx/media2/session/MediaLibraryService$LibraryParams$Builder;

    invoke-direct {p0}, Landroidx/media2/session/MediaLibraryService$LibraryParams$Builder;-><init>()V

    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaLibraryService$LibraryParams$Builder;->setExtras(Landroid/os/Bundle;)Landroidx/media2/session/MediaLibraryService$LibraryParams$Builder;

    move-result-object p0

    const-string v0, "android.service.media.extra.RECENT"

    .line 854
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/media2/session/MediaLibraryService$LibraryParams$Builder;->setRecent(Z)Landroidx/media2/session/MediaLibraryService$LibraryParams$Builder;

    move-result-object p0

    const-string v0, "android.service.media.extra.OFFLINE"

    .line 855
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/media2/session/MediaLibraryService$LibraryParams$Builder;->setOffline(Z)Landroidx/media2/session/MediaLibraryService$LibraryParams$Builder;

    move-result-object p0

    const-string v0, "android.service.media.extra.SUGGESTED"

    .line 856
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/media2/session/MediaLibraryService$LibraryParams$Builder;->setSuggested(Z)Landroidx/media2/session/MediaLibraryService$LibraryParams$Builder;

    move-result-object p0

    .line 857
    invoke-virtual {p0}, Landroidx/media2/session/MediaLibraryService$LibraryParams$Builder;->build()Landroidx/media2/session/MediaLibraryService$LibraryParams;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 860
    :catch_0
    new-instance p0, Landroidx/media2/session/MediaLibraryService$LibraryParams$Builder;

    invoke-direct {p0}, Landroidx/media2/session/MediaLibraryService$LibraryParams$Builder;-><init>()V

    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaLibraryService$LibraryParams$Builder;->setExtras(Landroid/os/Bundle;)Landroidx/media2/session/MediaLibraryService$LibraryParams$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/media2/session/MediaLibraryService$LibraryParams$Builder;->build()Landroidx/media2/session/MediaLibraryService$LibraryParams;

    move-result-object p0

    return-object p0
.end method

.method public static convertToMediaItem(Landroidx/media2/common/MediaItem;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;
    .locals 9

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 223
    :cond_0
    invoke-virtual {p0}, Landroidx/media2/common/MediaItem;->getMetadata()Landroidx/media2/common/MediaMetadata;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 225
    new-instance v0, Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    invoke-direct {v0}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;-><init>()V

    .line 226
    invoke-virtual {p0}, Landroidx/media2/common/MediaItem;->getMediaId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setMediaId(Ljava/lang/String;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    move-result-object p0

    .line 227
    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->build()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object p0

    goto/16 :goto_3

    .line 229
    :cond_1
    new-instance v2, Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    invoke-direct {v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;-><init>()V

    .line 230
    invoke-virtual {p0}, Landroidx/media2/common/MediaItem;->getMediaId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setMediaId(Ljava/lang/String;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    move-result-object p0

    const-string v2, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 231
    invoke-virtual {v0, v2}, Landroidx/media2/common/MediaMetadata;->getText(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setSubtitle(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    move-result-object p0

    const-string v2, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 232
    invoke-virtual {v0, v2}, Landroidx/media2/common/MediaMetadata;->getText(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setDescription(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    move-result-object p0

    const-string v2, "android.media.metadata.DISPLAY_ICON"

    .line 233
    invoke-virtual {v0, v2}, Landroidx/media2/common/MediaMetadata;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setIconBitmap(Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    move-result-object p0

    .line 234
    invoke-virtual {v0}, Landroidx/media2/common/MediaMetadata;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setExtras(Landroid/os/Bundle;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    move-result-object p0

    .line 236
    const-string v2, "android.media.metadata.TITLE"

    invoke-virtual {v0, v2}, Landroidx/media2/common/MediaMetadata;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 238
    invoke-virtual {p0, v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    goto :goto_0

    .line 240
    :cond_2
    const-string v2, "android.media.metadata.DISPLAY_TITLE"

    invoke-virtual {v0, v2}, Landroidx/media2/common/MediaMetadata;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    .line 243
    :goto_0
    const-string v2, "android.media.metadata.DISPLAY_ICON_URI"

    invoke-virtual {v0, v2}, Landroidx/media2/common/MediaMetadata;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 245
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setIconUri(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    .line 248
    :cond_3
    const-string v2, "android.media.metadata.MEDIA_URI"

    invoke-virtual {v0, v2}, Landroidx/media2/common/MediaMetadata;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 250
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setMediaUri(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    .line 253
    :cond_4
    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->build()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object p0

    .line 255
    const-string v2, "androidx.media2.metadata.BROWSABLE"

    invoke-virtual {v0, v2}, Landroidx/media2/common/MediaMetadata;->containsKey(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_5

    .line 256
    invoke-virtual {v0, v2}, Landroidx/media2/common/MediaMetadata;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v5, -0x1

    cmp-long v2, v2, v5

    if-eqz v2, :cond_5

    move v2, v4

    goto :goto_1

    :cond_5
    move v2, v1

    .line 257
    :goto_1
    const-string v3, "androidx.media2.metadata.PLAYABLE"

    invoke-virtual {v0, v3}, Landroidx/media2/common/MediaMetadata;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v0, v5, v7

    if-eqz v0, :cond_6

    goto :goto_2

    :cond_6
    move v4, v1

    :goto_2
    if-eqz v4, :cond_7

    const/4 v1, 0x2

    :cond_7
    or-int/2addr v1, v2

    .line 261
    :goto_3
    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    invoke-direct {v0, p0, v1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/support/v4/media/MediaDescriptionCompat;I)V

    return-object v0
.end method

.method public static convertToMediaItem(Landroid/support/v4/media/MediaBrowserCompat$MediaItem;)Landroidx/media2/common/MediaItem;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 290
    :cond_0
    invoke-virtual {p0}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->getDescription()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v0

    .line 291
    invoke-virtual {p0}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->isBrowsable()Z

    move-result v1

    invoke-virtual {p0}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->isPlayable()Z

    move-result p0

    .line 290
    invoke-static {v0, v1, p0}, Landroidx/media2/session/MediaUtils;->convertToMediaMetadata(Landroid/support/v4/media/MediaDescriptionCompat;ZZ)Landroidx/media2/common/MediaMetadata;

    move-result-object p0

    .line 292
    new-instance v0, Landroidx/media2/common/MediaItem$Builder;

    invoke-direct {v0}, Landroidx/media2/common/MediaItem$Builder;-><init>()V

    .line 293
    invoke-virtual {v0, p0}, Landroidx/media2/common/MediaItem$Builder;->setMetadata(Landroidx/media2/common/MediaMetadata;)Landroidx/media2/common/MediaItem$Builder;

    move-result-object p0

    .line 294
    invoke-virtual {p0}, Landroidx/media2/common/MediaItem$Builder;->build()Landroidx/media2/common/MediaItem;

    move-result-object p0

    return-object p0
.end method

.method public static convertToMediaItem(Landroid/support/v4/media/MediaDescriptionCompat;)Landroidx/media2/common/MediaItem;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 357
    invoke-static {p0, v0, v1}, Landroidx/media2/session/MediaUtils;->convertToMediaMetadata(Landroid/support/v4/media/MediaDescriptionCompat;ZZ)Landroidx/media2/common/MediaMetadata;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 361
    :cond_0
    new-instance v0, Landroidx/media2/common/MediaItem$Builder;

    invoke-direct {v0}, Landroidx/media2/common/MediaItem$Builder;-><init>()V

    invoke-virtual {v0, p0}, Landroidx/media2/common/MediaItem$Builder;->setMetadata(Landroidx/media2/common/MediaMetadata;)Landroidx/media2/common/MediaItem$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/media2/common/MediaItem$Builder;->build()Landroidx/media2/common/MediaItem;

    move-result-object p0

    return-object p0
.end method

.method public static convertToMediaItem(Landroid/support/v4/media/MediaMetadataCompat;I)Landroidx/media2/common/MediaItem;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 323
    :cond_0
    new-instance v0, Landroidx/media2/common/MediaMetadata$Builder;

    invoke-direct {v0}, Landroidx/media2/common/MediaMetadata$Builder;-><init>()V

    const-string v1, "androidx.media2.metadata.PLAYABLE"

    const-wide/16 v2, 0x1

    .line 324
    invoke-virtual {v0, v1, v2, v3}, Landroidx/media2/common/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroidx/media2/common/MediaMetadata$Builder;

    move-result-object v0

    .line 326
    invoke-static {p1}, Landroid/support/v4/media/RatingCompat;->newUnratedRating(I)Landroid/support/v4/media/RatingCompat;

    move-result-object p1

    invoke-static {p1}, Landroidx/media2/session/MediaUtils;->convertToRating(Landroid/support/v4/media/RatingCompat;)Landroidx/media2/common/Rating;

    move-result-object p1

    .line 325
    const-string v1, "android.media.metadata.USER_RATING"

    invoke-virtual {v0, v1, p1}, Landroidx/media2/common/MediaMetadata$Builder;->putRating(Ljava/lang/String;Landroidx/media2/common/Rating;)Landroidx/media2/common/MediaMetadata$Builder;

    move-result-object p1

    .line 327
    invoke-virtual {p0}, Landroid/support/v4/media/MediaMetadataCompat;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 328
    invoke-virtual {p0}, Landroid/support/v4/media/MediaMetadataCompat;->getBundle()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 329
    sget-object v3, Landroidx/media2/session/MediaUtils;->METADATA_COMPAT_KEY_TO_METADATA_KEY:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 330
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v3, v1

    .line 331
    :goto_1
    instance-of v4, v2, Ljava/lang/CharSequence;

    if-eqz v4, :cond_3

    .line 332
    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {p1, v3, v2}, Landroidx/media2/common/MediaMetadata$Builder;->putText(Ljava/lang/String;Ljava/lang/CharSequence;)Landroidx/media2/common/MediaMetadata$Builder;

    goto :goto_0

    .line 333
    :cond_3
    instance-of v4, v2, Landroid/graphics/Bitmap;

    if-eqz v4, :cond_4

    .line 334
    check-cast v2, Landroid/graphics/Bitmap;

    invoke-virtual {p1, v3, v2}, Landroidx/media2/common/MediaMetadata$Builder;->putBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroidx/media2/common/MediaMetadata$Builder;

    goto :goto_0

    .line 335
    :cond_4
    instance-of v4, v2, Ljava/lang/Long;

    if-eqz v4, :cond_5

    .line 336
    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p1, v3, v1, v2}, Landroidx/media2/common/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroidx/media2/common/MediaMetadata$Builder;

    goto :goto_0

    .line 337
    :cond_5
    instance-of v4, v2, Landroid/support/v4/media/RatingCompat;

    if-nez v4, :cond_6

    instance-of v2, v2, Landroid/media/Rating;

    if-eqz v2, :cond_1

    .line 342
    :cond_6
    :try_start_0
    invoke-virtual {p0, v1}, Landroid/support/v4/media/MediaMetadataCompat;->getRating(Ljava/lang/String;)Landroid/support/v4/media/RatingCompat;

    move-result-object v1

    .line 343
    invoke-static {v1}, Landroidx/media2/session/MediaUtils;->convertToRating(Landroid/support/v4/media/RatingCompat;)Landroidx/media2/common/Rating;

    move-result-object v1

    invoke-virtual {p1, v3, v1}, Landroidx/media2/common/MediaMetadata$Builder;->putRating(Ljava/lang/String;Landroidx/media2/common/Rating;)Landroidx/media2/common/MediaMetadata$Builder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 349
    :cond_7
    new-instance p0, Landroidx/media2/common/MediaItem$Builder;

    invoke-direct {p0}, Landroidx/media2/common/MediaItem$Builder;-><init>()V

    invoke-virtual {p1}, Landroidx/media2/common/MediaMetadata$Builder;->build()Landroidx/media2/common/MediaMetadata;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/media2/common/MediaItem$Builder;->setMetadata(Landroidx/media2/common/MediaMetadata;)Landroidx/media2/common/MediaItem$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/media2/common/MediaItem$Builder;->build()Landroidx/media2/common/MediaItem;

    move-result-object p0

    return-object p0
.end method

.method public static convertToMediaItem(Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;)Landroidx/media2/common/MediaItem;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 305
    :cond_0
    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->getDescription()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 306
    invoke-static {p0, v0, v1}, Landroidx/media2/session/MediaUtils;->convertToMediaMetadata(Landroid/support/v4/media/MediaDescriptionCompat;ZZ)Landroidx/media2/common/MediaMetadata;

    move-result-object p0

    .line 307
    new-instance v0, Landroidx/media2/common/MediaItem$Builder;

    invoke-direct {v0}, Landroidx/media2/common/MediaItem$Builder;-><init>()V

    .line 308
    invoke-virtual {v0, p0}, Landroidx/media2/common/MediaItem$Builder;->setMetadata(Landroidx/media2/common/MediaMetadata;)Landroidx/media2/common/MediaItem$Builder;

    move-result-object p0

    .line 309
    invoke-virtual {p0}, Landroidx/media2/common/MediaItem$Builder;->build()Landroidx/media2/common/MediaItem;

    move-result-object p0

    return-object p0
.end method

.method public static convertToMediaItemList(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 273
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 274
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 275
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media2/common/MediaItem;

    invoke-static {v2}, Landroidx/media2/session/MediaUtils;->convertToMediaItem(Landroidx/media2/common/MediaItem;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static convertToMediaMetadata(Landroid/support/v4/media/MediaDescriptionCompat;ZZ)Landroidx/media2/common/MediaMetadata;
    .locals 6

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 505
    :cond_0
    new-instance v0, Landroidx/media2/common/MediaMetadata$Builder;

    invoke-direct {v0}, Landroidx/media2/common/MediaMetadata$Builder;-><init>()V

    .line 506
    const-string v1, "android.media.metadata.MEDIA_ID"

    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->getMediaId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/media2/common/MediaMetadata$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroidx/media2/common/MediaMetadata$Builder;

    .line 508
    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->getTitle()Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 510
    const-string v2, "android.media.metadata.DISPLAY_TITLE"

    invoke-virtual {v0, v2, v1}, Landroidx/media2/common/MediaMetadata$Builder;->putText(Ljava/lang/String;Ljava/lang/CharSequence;)Landroidx/media2/common/MediaMetadata$Builder;

    .line 513
    :cond_1
    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->getDescription()Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 515
    const-string v1, "android.media.metadata.DISPLAY_DESCRIPTION"

    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->getDescription()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/media2/common/MediaMetadata$Builder;->putText(Ljava/lang/String;Ljava/lang/CharSequence;)Landroidx/media2/common/MediaMetadata$Builder;

    .line 518
    :cond_2
    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 520
    const-string v2, "android.media.metadata.DISPLAY_SUBTITLE"

    invoke-virtual {v0, v2, v1}, Landroidx/media2/common/MediaMetadata$Builder;->putText(Ljava/lang/String;Ljava/lang/CharSequence;)Landroidx/media2/common/MediaMetadata$Builder;

    .line 523
    :cond_3
    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->getIconBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 525
    const-string v2, "android.media.metadata.DISPLAY_ICON"

    invoke-virtual {v0, v2, v1}, Landroidx/media2/common/MediaMetadata$Builder;->putBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroidx/media2/common/MediaMetadata$Builder;

    .line 528
    :cond_4
    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->getIconUri()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 530
    const-string v2, "android.media.metadata.DISPLAY_ICON_URI"

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroidx/media2/common/MediaMetadata$Builder;->putText(Ljava/lang/String;Ljava/lang/CharSequence;)Landroidx/media2/common/MediaMetadata$Builder;

    .line 533
    :cond_5
    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 535
    invoke-virtual {v0, v1}, Landroidx/media2/common/MediaMetadata$Builder;->setExtras(Landroid/os/Bundle;)Landroidx/media2/common/MediaMetadata$Builder;

    .line 538
    :cond_6
    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->getMediaUri()Landroid/net/Uri;

    move-result-object p0

    if-eqz p0, :cond_7

    .line 540
    const-string v2, "android.media.metadata.MEDIA_URI"

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v2, p0}, Landroidx/media2/common/MediaMetadata$Builder;->putText(Ljava/lang/String;Ljava/lang/CharSequence;)Landroidx/media2/common/MediaMetadata$Builder;

    :cond_7
    const-wide/16 v2, 0x0

    .line 543
    const-string p0, "androidx.media2.metadata.BROWSABLE"

    if-eqz v1, :cond_8

    const-string v4, "android.media.extra.BT_FOLDER_TYPE"

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 545
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 544
    invoke-virtual {v0, p0, v4, v5}, Landroidx/media2/common/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroidx/media2/common/MediaMetadata$Builder;

    goto :goto_0

    :cond_8
    if-eqz p1, :cond_9

    .line 547
    invoke-virtual {v0, p0, v2, v3}, Landroidx/media2/common/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroidx/media2/common/MediaMetadata$Builder;

    goto :goto_0

    :cond_9
    const-wide/16 v4, -0x1

    .line 549
    invoke-virtual {v0, p0, v4, v5}, Landroidx/media2/common/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroidx/media2/common/MediaMetadata$Builder;

    :goto_0
    if-eqz p2, :cond_a

    const-wide/16 v2, 0x1

    .line 552
    :cond_a
    const-string p0, "androidx.media2.metadata.PLAYABLE"

    invoke-virtual {v0, p0, v2, v3}, Landroidx/media2/common/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroidx/media2/common/MediaMetadata$Builder;

    .line 554
    invoke-virtual {v0}, Landroidx/media2/common/MediaMetadata$Builder;->build()Landroidx/media2/common/MediaMetadata;

    move-result-object p0

    return-object p0
.end method

.method public static convertToMediaMetadata(Ljava/lang/CharSequence;)Landroidx/media2/common/MediaMetadata;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 564
    :cond_0
    new-instance v0, Landroidx/media2/common/MediaMetadata$Builder;

    invoke-direct {v0}, Landroidx/media2/common/MediaMetadata$Builder;-><init>()V

    const-string v1, "android.media.metadata.TITLE"

    .line 565
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Landroidx/media2/common/MediaMetadata$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroidx/media2/common/MediaMetadata$Builder;

    move-result-object p0

    const-string v0, "androidx.media2.metadata.BROWSABLE"

    const-wide/16 v1, 0x0

    .line 566
    invoke-virtual {p0, v0, v1, v2}, Landroidx/media2/common/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroidx/media2/common/MediaMetadata$Builder;

    move-result-object p0

    const-string v0, "androidx.media2.metadata.PLAYABLE"

    const-wide/16 v1, 0x1

    .line 567
    invoke-virtual {p0, v0, v1, v2}, Landroidx/media2/common/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroidx/media2/common/MediaMetadata$Builder;

    move-result-object p0

    .line 568
    invoke-virtual {p0}, Landroidx/media2/common/MediaMetadata$Builder;->build()Landroidx/media2/common/MediaMetadata;

    move-result-object p0

    return-object p0
.end method

.method public static convertToMediaMetadataCompat(Landroidx/media2/common/MediaMetadata;)Landroid/support/v4/media/MediaMetadataCompat;
    .locals 6

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 581
    :cond_0
    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat$Builder;

    invoke-direct {v0}, Landroid/support/v4/media/MediaMetadataCompat$Builder;-><init>()V

    .line 582
    invoke-virtual {p0}, Landroidx/media2/common/MediaMetadata;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :catch_0
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 583
    sget-object v3, Landroidx/media2/session/MediaUtils;->METADATA_KEY_TO_METADATA_COMPAT_KEY:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 584
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v3, v2

    .line 585
    :goto_1
    invoke-virtual {p0, v2}, Landroidx/media2/common/MediaMetadata;->getObject(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 586
    instance-of v5, v4, Ljava/lang/CharSequence;

    if-eqz v5, :cond_3

    .line 587
    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v0, v3, v4}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putText(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    goto :goto_0

    .line 588
    :cond_3
    instance-of v5, v4, Landroid/graphics/Bitmap;

    if-eqz v5, :cond_4

    .line 589
    check-cast v4, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v3, v4}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    goto :goto_0

    .line 590
    :cond_4
    instance-of v5, v4, Ljava/lang/Long;

    if-eqz v5, :cond_5

    .line 591
    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putLong(Ljava/lang/String;J)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    goto :goto_0

    .line 592
    :cond_5
    instance-of v4, v4, Landroid/os/Bundle;

    if-eqz v4, :cond_1

    const-string v4, "androidx.media2.metadata.EXTRAS"

    invoke-static {v2, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 596
    :try_start_0
    invoke-virtual {p0, v2}, Landroidx/media2/common/MediaMetadata;->getRating(Ljava/lang/String;)Landroidx/media2/common/Rating;

    move-result-object v2

    .line 597
    invoke-static {v2}, Landroidx/media2/session/MediaUtils;->convertToRatingCompat(Landroidx/media2/common/Rating;)Landroid/support/v4/media/RatingCompat;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putRating(Ljava/lang/String;Landroid/support/v4/media/RatingCompat;)Landroid/support/v4/media/MediaMetadataCompat$Builder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 603
    :cond_6
    invoke-virtual {v0}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->build()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p0

    return-object p0
.end method

.method public static convertToPlaybackStateCompatState(II)I
    .locals 2

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-eq p0, v0, :cond_2

    if-eq p0, v1, :cond_0

    const/4 p0, 0x7

    return p0

    :cond_0
    if-eq p1, v1, :cond_1

    const/4 p0, 0x3

    return p0

    :cond_1
    const/4 p0, 0x6

    return p0

    :cond_2
    return v1

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static convertToPlayerState(Landroid/support/v4/media/session/PlaybackStateCompat;)I
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 740
    :cond_0
    invoke-virtual {p0}, Landroid/support/v4/media/session/PlaybackStateCompat;->getState()I

    move-result p0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const/4 p0, 0x3

    return p0

    :pswitch_1
    const/4 p0, 0x2

    return p0

    :pswitch_2
    const/4 p0, 0x1

    return p0

    :pswitch_3
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static convertToQueueItemId(I)J
    .locals 2

    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_0
    int-to-long v0, p0

    return-wide v0
.end method

.method public static convertToQueueItemList(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 414
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 415
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 416
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media2/common/MediaItem;

    .line 417
    invoke-virtual {v2}, Landroidx/media2/common/MediaItem;->getMetadata()Landroidx/media2/common/MediaMetadata;

    move-result-object v3

    if-nez v3, :cond_1

    .line 418
    new-instance v3, Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    invoke-direct {v3}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;-><init>()V

    invoke-virtual {v2}, Landroidx/media2/common/MediaItem;->getMediaId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setMediaId(Ljava/lang/String;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->build()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v2

    goto :goto_1

    .line 419
    :cond_1
    invoke-virtual {v2}, Landroidx/media2/common/MediaItem;->getMetadata()Landroidx/media2/common/MediaMetadata;

    move-result-object v2

    invoke-static {v2}, Landroidx/media2/session/MediaUtils;->convertToMediaMetadataCompat(Landroidx/media2/common/MediaMetadata;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/media/MediaMetadataCompat;->getDescription()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v2

    .line 420
    :goto_1
    invoke-static {v1}, Landroidx/media2/session/MediaUtils;->convertToQueueItemId(I)J

    move-result-wide v3

    .line 421
    new-instance v5, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    invoke-direct {v5, v2, v3, v4}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;-><init>(Landroid/support/v4/media/MediaDescriptionCompat;J)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static convertToRating(Landroid/support/v4/media/RatingCompat;)Landroidx/media2/common/Rating;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 616
    :cond_0
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->getRatingStyle()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    return-object v0

    .line 633
    :pswitch_0
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->isRated()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 634
    new-instance v0, Landroidx/media2/session/PercentageRating;

    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->getPercentRating()F

    move-result p0

    invoke-direct {v0, p0}, Landroidx/media2/session/PercentageRating;-><init>(F)V

    goto :goto_0

    .line 635
    :cond_1
    new-instance v0, Landroidx/media2/session/PercentageRating;

    invoke-direct {v0}, Landroidx/media2/session/PercentageRating;-><init>()V

    :goto_0
    return-object v0

    .line 624
    :pswitch_1
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->isRated()Z

    move-result v0

    const/4 v1, 0x5

    if-eqz v0, :cond_2

    .line 625
    new-instance v0, Landroidx/media2/session/StarRating;

    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->getStarRating()F

    move-result p0

    invoke-direct {v0, v1, p0}, Landroidx/media2/session/StarRating;-><init>(IF)V

    goto :goto_1

    :cond_2
    new-instance v0, Landroidx/media2/session/StarRating;

    invoke-direct {v0, v1}, Landroidx/media2/session/StarRating;-><init>(I)V

    :goto_1
    return-object v0

    .line 621
    :pswitch_2
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->isRated()Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_3

    .line 622
    new-instance v0, Landroidx/media2/session/StarRating;

    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->getStarRating()F

    move-result p0

    invoke-direct {v0, v1, p0}, Landroidx/media2/session/StarRating;-><init>(IF)V

    goto :goto_2

    :cond_3
    new-instance v0, Landroidx/media2/session/StarRating;

    invoke-direct {v0, v1}, Landroidx/media2/session/StarRating;-><init>(I)V

    :goto_2
    return-object v0

    .line 618
    :pswitch_3
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->isRated()Z

    move-result v0

    const/4 v1, 0x3

    if-eqz v0, :cond_4

    .line 619
    new-instance v0, Landroidx/media2/session/StarRating;

    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->getStarRating()F

    move-result p0

    invoke-direct {v0, v1, p0}, Landroidx/media2/session/StarRating;-><init>(IF)V

    goto :goto_3

    :cond_4
    new-instance v0, Landroidx/media2/session/StarRating;

    invoke-direct {v0, v1}, Landroidx/media2/session/StarRating;-><init>(I)V

    :goto_3
    return-object v0

    .line 630
    :pswitch_4
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->isRated()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 631
    new-instance v0, Landroidx/media2/session/ThumbRating;

    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->isThumbUp()Z

    move-result p0

    invoke-direct {v0, p0}, Landroidx/media2/session/ThumbRating;-><init>(Z)V

    goto :goto_4

    :cond_5
    new-instance v0, Landroidx/media2/session/ThumbRating;

    invoke-direct {v0}, Landroidx/media2/session/ThumbRating;-><init>()V

    :goto_4
    return-object v0

    .line 627
    :pswitch_5
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->isRated()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 628
    new-instance v0, Landroidx/media2/session/HeartRating;

    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->hasHeart()Z

    move-result p0

    invoke-direct {v0, p0}, Landroidx/media2/session/HeartRating;-><init>(Z)V

    goto :goto_5

    :cond_6
    new-instance v0, Landroidx/media2/session/HeartRating;

    invoke-direct {v0}, Landroidx/media2/session/HeartRating;-><init>()V

    :goto_5
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static convertToRatingCompat(Landroidx/media2/common/Rating;)Landroid/support/v4/media/RatingCompat;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 652
    :cond_0
    invoke-static {p0}, Landroidx/media2/session/MediaUtils;->getRatingCompatStyle(Landroidx/media2/common/Rating;)I

    move-result v1

    .line 653
    invoke-interface {p0}, Landroidx/media2/common/Rating;->isRated()Z

    move-result v2

    if-nez v2, :cond_1

    .line 654
    invoke-static {v1}, Landroid/support/v4/media/RatingCompat;->newUnratedRating(I)Landroid/support/v4/media/RatingCompat;

    move-result-object p0

    return-object p0

    :cond_1
    packed-switch v1, :pswitch_data_0

    return-object v0

    .line 668
    :pswitch_0
    check-cast p0, Landroidx/media2/session/PercentageRating;

    .line 669
    invoke-virtual {p0}, Landroidx/media2/session/PercentageRating;->getPercentRating()F

    move-result p0

    .line 668
    invoke-static {p0}, Landroid/support/v4/media/RatingCompat;->newPercentageRating(F)Landroid/support/v4/media/RatingCompat;

    move-result-object p0

    return-object p0

    .line 661
    :pswitch_1
    check-cast p0, Landroidx/media2/session/StarRating;

    .line 662
    invoke-virtual {p0}, Landroidx/media2/session/StarRating;->getStarRating()F

    move-result p0

    .line 661
    invoke-static {v1, p0}, Landroid/support/v4/media/RatingCompat;->newStarRating(IF)Landroid/support/v4/media/RatingCompat;

    move-result-object p0

    return-object p0

    .line 666
    :pswitch_2
    check-cast p0, Landroidx/media2/session/ThumbRating;

    invoke-virtual {p0}, Landroidx/media2/session/ThumbRating;->isThumbUp()Z

    move-result p0

    invoke-static {p0}, Landroid/support/v4/media/RatingCompat;->newThumbRating(Z)Landroid/support/v4/media/RatingCompat;

    move-result-object p0

    return-object p0

    .line 664
    :pswitch_3
    check-cast p0, Landroidx/media2/session/HeartRating;

    invoke-virtual {p0}, Landroidx/media2/session/HeartRating;->hasHeart()Z

    move-result p0

    invoke-static {p0}, Landroid/support/v4/media/RatingCompat;->newHeartRating(Z)Landroid/support/v4/media/RatingCompat;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static convertToRootHints(Landroidx/media2/session/MediaLibraryService$LibraryParams;)Landroid/os/Bundle;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 875
    :cond_0
    invoke-virtual {p0}, Landroidx/media2/session/MediaLibraryService$LibraryParams;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_1

    .line 876
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v0, Landroid/os/Bundle;

    invoke-virtual {p0}, Landroidx/media2/session/MediaLibraryService$LibraryParams;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 877
    :goto_0
    const-string v1, "android.service.media.extra.RECENT"

    invoke-virtual {p0}, Landroidx/media2/session/MediaLibraryService$LibraryParams;->isRecent()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 878
    const-string v1, "android.service.media.extra.OFFLINE"

    invoke-virtual {p0}, Landroidx/media2/session/MediaLibraryService$LibraryParams;->isOffline()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 879
    const-string v1, "android.service.media.extra.SUGGESTED"

    invoke-virtual {p0}, Landroidx/media2/session/MediaLibraryService$LibraryParams;->isSuggested()Z

    move-result p0

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static convertToSessionCommandGroup(JLandroid/support/v4/media/session/PlaybackStateCompat;)Landroidx/media2/session/SessionCommandGroup;
    .locals 4

    .line 918
    new-instance v0, Landroidx/media2/session/SessionCommandGroup$Builder;

    invoke-direct {v0}, Landroidx/media2/session/SessionCommandGroup$Builder;-><init>()V

    const/4 v1, 0x1

    .line 921
    invoke-virtual {v0, v1}, Landroidx/media2/session/SessionCommandGroup$Builder;->addAllPlayerBasicCommands(I)Landroidx/media2/session/SessionCommandGroup$Builder;

    const-wide/16 v2, 0x4

    and-long/2addr p0, v2

    const-wide/16 v2, 0x0

    cmp-long p0, p0, v2

    if-eqz p0, :cond_0

    .line 924
    invoke-virtual {v0, v1}, Landroidx/media2/session/SessionCommandGroup$Builder;->addAllPlayerPlaylistCommands(I)Landroidx/media2/session/SessionCommandGroup$Builder;

    .line 926
    :cond_0
    invoke-virtual {v0, v1}, Landroidx/media2/session/SessionCommandGroup$Builder;->addAllVolumeCommands(I)Landroidx/media2/session/SessionCommandGroup$Builder;

    .line 927
    invoke-virtual {v0, v1}, Landroidx/media2/session/SessionCommandGroup$Builder;->addAllSessionCommands(I)Landroidx/media2/session/SessionCommandGroup$Builder;

    .line 929
    new-instance p0, Landroidx/media2/session/SessionCommand;

    const/16 p1, 0x2714

    invoke-direct {p0, p1}, Landroidx/media2/session/SessionCommand;-><init>(I)V

    invoke-virtual {v0, p0}, Landroidx/media2/session/SessionCommandGroup$Builder;->removeCommand(Landroidx/media2/session/SessionCommand;)Landroidx/media2/session/SessionCommandGroup$Builder;

    .line 930
    new-instance p0, Landroidx/media2/session/SessionCommand;

    const/16 p1, 0x2af8

    invoke-direct {p0, p1}, Landroidx/media2/session/SessionCommand;-><init>(I)V

    invoke-virtual {v0, p0}, Landroidx/media2/session/SessionCommandGroup$Builder;->removeCommand(Landroidx/media2/session/SessionCommand;)Landroidx/media2/session/SessionCommandGroup$Builder;

    .line 931
    new-instance p0, Landroidx/media2/session/SessionCommand;

    const/16 p1, 0x2af9

    invoke-direct {p0, p1}, Landroidx/media2/session/SessionCommand;-><init>(I)V

    invoke-virtual {v0, p0}, Landroidx/media2/session/SessionCommandGroup$Builder;->removeCommand(Landroidx/media2/session/SessionCommand;)Landroidx/media2/session/SessionCommandGroup$Builder;

    .line 932
    new-instance p0, Landroidx/media2/session/SessionCommand;

    const/16 p1, 0x2afa

    invoke-direct {p0, p1}, Landroidx/media2/session/SessionCommand;-><init>(I)V

    invoke-virtual {v0, p0}, Landroidx/media2/session/SessionCommandGroup$Builder;->removeCommand(Landroidx/media2/session/SessionCommand;)Landroidx/media2/session/SessionCommandGroup$Builder;

    if-eqz p2, :cond_1

    .line 934
    invoke-virtual {p2}, Landroid/support/v4/media/session/PlaybackStateCompat;->getCustomActions()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 935
    invoke-virtual {p2}, Landroid/support/v4/media/session/PlaybackStateCompat;->getCustomActions()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 936
    new-instance p2, Landroidx/media2/session/SessionCommand;

    .line 937
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-direct {p2, v1, p1}, Landroidx/media2/session/SessionCommand;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 936
    invoke-virtual {v0, p2}, Landroidx/media2/session/SessionCommandGroup$Builder;->addCommand(Landroidx/media2/session/SessionCommand;)Landroidx/media2/session/SessionCommandGroup$Builder;

    goto :goto_0

    .line 940
    :cond_1
    invoke-virtual {v0}, Landroidx/media2/session/SessionCommandGroup$Builder;->build()Landroidx/media2/session/SessionCommandGroup;

    move-result-object p0

    return-object p0
.end method

.method public static createMediaDescriptionCompat(Ljava/lang/String;)Landroid/support/v4/media/MediaDescriptionCompat;
    .locals 1

    .line 400
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 403
    :cond_0
    new-instance v0, Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    invoke-direct {v0}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;-><init>()V

    invoke-virtual {v0, p0}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setMediaId(Ljava/lang/String;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->build()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object p0

    return-object p0
.end method

.method static doesBundleHaveCustomParcelable(Landroid/os/Bundle;)Z
    .locals 4

    .line 993
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 995
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    const/4 p0, 0x0

    .line 996
    invoke-virtual {v0, p0}, Landroid/os/Parcel;->setDataPosition(I)V

    const/4 v1, 0x0

    .line 997
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v1

    .line 998
    invoke-virtual {v1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 1000
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1007
    :cond_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return p0

    :catchall_0
    move-exception p0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 1004
    :try_start_1
    const-string v1, "MediaUtils"

    const-string v2, "Custom parcelables are not allowed"

    invoke-static {v1, v2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1007
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    const/4 p0, 0x1

    return p0

    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1008
    throw p0
.end method

.method public static getLegacyStreamType(Landroidx/media/AudioAttributesCompat;)I
    .locals 2

    const/4 v0, 0x3

    if-nez p0, :cond_0

    goto :goto_0

    .line 978
    :cond_0
    invoke-virtual {p0}, Landroidx/media/AudioAttributesCompat;->getLegacyStreamType()I

    move-result p0

    const/high16 v1, -0x80000000

    if-ne p0, v1, :cond_1

    goto :goto_0

    :cond_1
    move v0, p0

    :goto_0
    return v0
.end method

.method private static getRatingCompatStyle(Landroidx/media2/common/Rating;)I
    .locals 1

    .line 820
    instance-of v0, p0, Landroidx/media2/session/HeartRating;

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 822
    :cond_0
    instance-of v0, p0, Landroidx/media2/session/ThumbRating;

    if-eqz v0, :cond_1

    const/4 p0, 0x2

    return p0

    .line 824
    :cond_1
    instance-of v0, p0, Landroidx/media2/session/StarRating;

    if-eqz v0, :cond_3

    .line 825
    check-cast p0, Landroidx/media2/session/StarRating;

    invoke-virtual {p0}, Landroidx/media2/session/StarRating;->getMaxStars()I

    move-result p0

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-eq p0, v0, :cond_2

    goto :goto_0

    :cond_2
    return v0

    .line 833
    :cond_3
    instance-of p0, p0, Landroidx/media2/session/PercentageRating;

    if-eqz p0, :cond_4

    const/4 p0, 0x6

    return p0

    :cond_4
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static isUnparcelableBundle(Landroid/os/Bundle;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 795
    :cond_0
    const-class v1, Landroidx/media2/session/MediaUtils;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 797
    :try_start_0
    invoke-virtual {p0}, Landroid/os/Bundle;->size()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const/4 p0, 0x1

    return p0
.end method

.method public static keepUnparcelableBundlesOnly(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    if-nez p0, :cond_0

    return-void

    .line 811
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_2

    .line 812
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    .line 813
    invoke-static {v1}, Landroidx/media2/session/MediaUtils;->isUnparcelableBundle(Landroid/os/Bundle;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 814
    invoke-interface {p0, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static removeNullElements(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 894
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 895
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 897
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toBufferingState(I)I
    .locals 1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x6

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x2

    return p0

    :cond_1
    return v0
.end method

.method public static toPlaybackInfo2(Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;)Landroidx/media2/session/MediaController$PlaybackInfo;
    .locals 4

    .line 782
    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;->getPlaybackType()I

    move-result v0

    new-instance v1, Landroidx/media/AudioAttributesCompat$Builder;

    invoke-direct {v1}, Landroidx/media/AudioAttributesCompat$Builder;-><init>()V

    .line 784
    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;->getAudioAttributes()Landroidx/media/AudioAttributesCompat;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/media/AudioAttributesCompat;->getLegacyStreamType()I

    move-result v2

    .line 783
    invoke-virtual {v1, v2}, Landroidx/media/AudioAttributesCompat$Builder;->setLegacyStreamType(I)Landroidx/media/AudioAttributesCompat$Builder;

    move-result-object v1

    .line 784
    invoke-virtual {v1}, Landroidx/media/AudioAttributesCompat$Builder;->build()Landroidx/media/AudioAttributesCompat;

    move-result-object v1

    .line 785
    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;->getVolumeControl()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;->getMaxVolume()I

    move-result v3

    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;->getCurrentVolume()I

    move-result p0

    .line 782
    invoke-static {v0, v1, v2, v3, p0}, Landroidx/media2/session/MediaController$PlaybackInfo;->createPlaybackInfo(ILandroidx/media/AudioAttributesCompat;III)Landroidx/media2/session/MediaController$PlaybackInfo;

    move-result-object p0

    return-object p0
.end method

.method public static truncateListBySize(Ljava/util/List;I)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/Parcelable;",
            ">(",
            "Ljava/util/List<",
            "TT;>;I)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 470
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 471
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    .line 473
    :goto_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 475
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Parcelable;

    .line 476
    invoke-virtual {v1, v4, v2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 477
    invoke-virtual {v1}, Landroid/os/Parcel;->dataSize()I

    move-result v5

    if-ge v5, p1, :cond_1

    .line 478
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 485
    :cond_1
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    return-object v0

    :catchall_0
    move-exception p0

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 486
    throw p0
.end method

.method public static upcastForPreparceling(Landroidx/media2/common/MediaItem;)Landroidx/media2/common/MediaItem;
    .locals 3

    if-eqz p0, :cond_1

    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Landroidx/media2/common/MediaItem;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 151
    :cond_0
    new-instance v0, Landroidx/media2/common/MediaItem$Builder;

    invoke-direct {v0}, Landroidx/media2/common/MediaItem$Builder;-><init>()V

    .line 152
    invoke-virtual {p0}, Landroidx/media2/common/MediaItem;->getStartPosition()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/media2/common/MediaItem$Builder;->setStartPosition(J)Landroidx/media2/common/MediaItem$Builder;

    move-result-object v0

    .line 153
    invoke-virtual {p0}, Landroidx/media2/common/MediaItem;->getEndPosition()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/media2/common/MediaItem$Builder;->setEndPosition(J)Landroidx/media2/common/MediaItem$Builder;

    move-result-object v0

    .line 154
    invoke-virtual {p0}, Landroidx/media2/common/MediaItem;->getMetadata()Landroidx/media2/common/MediaMetadata;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/media2/common/MediaItem$Builder;->setMetadata(Landroidx/media2/common/MediaMetadata;)Landroidx/media2/common/MediaItem$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/media2/common/MediaItem$Builder;->build()Landroidx/media2/common/MediaItem;

    move-result-object p0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static upcastForPreparceling(Landroidx/media2/common/SessionPlayer$TrackInfo;)Landroidx/media2/common/SessionPlayer$TrackInfo;
    .locals 4

    if-eqz p0, :cond_1

    .line 183
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Landroidx/media2/common/SessionPlayer$TrackInfo;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 186
    :cond_0
    new-instance v0, Landroidx/media2/common/SessionPlayer$TrackInfo;

    invoke-virtual {p0}, Landroidx/media2/common/SessionPlayer$TrackInfo;->getId()I

    move-result v1

    invoke-virtual {p0}, Landroidx/media2/common/SessionPlayer$TrackInfo;->getTrackType()I

    move-result v2

    invoke-virtual {p0}, Landroidx/media2/common/SessionPlayer$TrackInfo;->getFormat()Landroid/media/MediaFormat;

    move-result-object v3

    .line 187
    invoke-virtual {p0}, Landroidx/media2/common/SessionPlayer$TrackInfo;->isSelectable()Z

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Landroidx/media2/common/SessionPlayer$TrackInfo;-><init>(IILandroid/media/MediaFormat;Z)V

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static upcastForPreparceling(Landroidx/media2/common/VideoSize;)Landroidx/media2/common/VideoSize;
    .locals 2

    if-eqz p0, :cond_1

    .line 167
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Landroidx/media2/common/VideoSize;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 170
    :cond_0
    new-instance v0, Landroidx/media2/common/VideoSize;

    invoke-virtual {p0}, Landroidx/media2/common/VideoSize;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroidx/media2/common/VideoSize;->getHeight()I

    move-result p0

    invoke-direct {v0, v1, p0}, Landroidx/media2/common/VideoSize;-><init>(II)V

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static upcastForPreparceling(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media2/common/SessionPlayer$TrackInfo;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/media2/common/SessionPlayer$TrackInfo;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    return-object p0

    .line 203
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 204
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 205
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media2/common/SessionPlayer$TrackInfo;

    invoke-static {v2}, Landroidx/media2/session/MediaUtils;->upcastForPreparceling(Landroidx/media2/common/SessionPlayer$TrackInfo;)Landroidx/media2/common/SessionPlayer$TrackInfo;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method
