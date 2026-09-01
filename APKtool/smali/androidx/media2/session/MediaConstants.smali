.class public Landroidx/media2/session/MediaConstants;
.super Ljava/lang/Object;
.source "MediaConstants.java"


# static fields
.field static final ARGUMENT_CAPTIONING_ENABLED:Ljava/lang/String; = "androidx.media2.argument.CAPTIONING_ENABLED"

.field public static final MEDIA_URI_AUTHORITY:Ljava/lang/String; = "media2-session"

.field public static final MEDIA_URI_PATH_PLAY_FROM_MEDIA_ID:Ljava/lang/String; = "playFromMediaId"

.field public static final MEDIA_URI_PATH_PLAY_FROM_SEARCH:Ljava/lang/String; = "playFromSearch"

.field public static final MEDIA_URI_PATH_PREPARE_FROM_MEDIA_ID:Ljava/lang/String; = "prepareFromMediaId"

.field public static final MEDIA_URI_PATH_PREPARE_FROM_SEARCH:Ljava/lang/String; = "prepareFromSearch"

.field public static final MEDIA_URI_PATH_SET_MEDIA_URI:Ljava/lang/String; = "setMediaUri"

.field public static final MEDIA_URI_QUERY_ID:Ljava/lang/String; = "id"

.field public static final MEDIA_URI_QUERY_QUERY:Ljava/lang/String; = "query"

.field public static final MEDIA_URI_QUERY_URI:Ljava/lang/String; = "uri"

.field public static final MEDIA_URI_SCHEME:Ljava/lang/String; = "androidx"

.field static final MEDIA_URI_SET_MEDIA_URI_PREFIX:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    const-string v2, "androidx"

    .line 88
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "media2-session"

    .line 89
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "setMediaUri"

    .line 90
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/media2/session/MediaConstants;->MEDIA_URI_SET_MEDIA_URI_PREFIX:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
