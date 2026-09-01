.class public Landroidx/media2/common/UriMediaItem;
.super Landroidx/media2/common/MediaItem;
.source "UriMediaItem.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/common/UriMediaItem$Builder;
    }
.end annotation


# instance fields
.field private final mUri:Landroid/net/Uri;

.field private final mUriCookies:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/net/HttpCookie;",
            ">;"
        }
    .end annotation
.end field

.field private final mUriHeader:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/media2/common/UriMediaItem$Builder;)V
    .locals 1

    .line 50
    invoke-direct {p0, p1}, Landroidx/media2/common/MediaItem;-><init>(Landroidx/media2/common/MediaItem$Builder;)V

    .line 51
    iget-object v0, p1, Landroidx/media2/common/UriMediaItem$Builder;->mUri:Landroid/net/Uri;

    iput-object v0, p0, Landroidx/media2/common/UriMediaItem;->mUri:Landroid/net/Uri;

    .line 52
    iget-object v0, p1, Landroidx/media2/common/UriMediaItem$Builder;->mUriHeader:Ljava/util/Map;

    iput-object v0, p0, Landroidx/media2/common/UriMediaItem;->mUriHeader:Ljava/util/Map;

    .line 53
    iget-object p1, p1, Landroidx/media2/common/UriMediaItem$Builder;->mUriCookies:Ljava/util/List;

    iput-object p1, p0, Landroidx/media2/common/UriMediaItem;->mUriCookies:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getUri()Landroid/net/Uri;
    .locals 1

    .line 62
    iget-object v0, p0, Landroidx/media2/common/UriMediaItem;->mUri:Landroid/net/Uri;

    return-object v0
.end method

.method public getUriCookies()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/net/HttpCookie;",
            ">;"
        }
    .end annotation

    .line 83
    iget-object v0, p0, Landroidx/media2/common/UriMediaItem;->mUriCookies:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 86
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/media2/common/UriMediaItem;->mUriCookies:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getUriHeaders()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 71
    iget-object v0, p0, Landroidx/media2/common/UriMediaItem;->mUriHeader:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 74
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Landroidx/media2/common/UriMediaItem;->mUriHeader:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    return-object v0
.end method
