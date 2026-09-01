.class public final Landroidx/media2/common/CallbackMediaItem$Builder;
.super Landroidx/media2/common/MediaItem$Builder;
.source "CallbackMediaItem.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/common/CallbackMediaItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field mDataSourceCallback:Landroidx/media2/common/DataSourceCallback;


# direct methods
.method public constructor <init>(Landroidx/media2/common/DataSourceCallback;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Landroidx/media2/common/MediaItem$Builder;-><init>()V

    .line 66
    invoke-static {p1}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    iput-object p1, p0, Landroidx/media2/common/CallbackMediaItem$Builder;->mDataSourceCallback:Landroidx/media2/common/DataSourceCallback;

    return-void
.end method


# virtual methods
.method public build()Landroidx/media2/common/CallbackMediaItem;
    .locals 1

    .line 97
    new-instance v0, Landroidx/media2/common/CallbackMediaItem;

    invoke-direct {v0, p0}, Landroidx/media2/common/CallbackMediaItem;-><init>(Landroidx/media2/common/CallbackMediaItem$Builder;)V

    return-object v0
.end method

.method public bridge synthetic build()Landroidx/media2/common/MediaItem;
    .locals 1

    .line 56
    invoke-virtual {p0}, Landroidx/media2/common/CallbackMediaItem$Builder;->build()Landroidx/media2/common/CallbackMediaItem;

    move-result-object v0

    return-object v0
.end method

.method public setEndPosition(J)Landroidx/media2/common/CallbackMediaItem$Builder;
    .locals 0

    .line 88
    invoke-super {p0, p1, p2}, Landroidx/media2/common/MediaItem$Builder;->setEndPosition(J)Landroidx/media2/common/MediaItem$Builder;

    move-result-object p1

    check-cast p1, Landroidx/media2/common/CallbackMediaItem$Builder;

    return-object p1
.end method

.method public bridge synthetic setEndPosition(J)Landroidx/media2/common/MediaItem$Builder;
    .locals 0

    .line 56
    invoke-virtual {p0, p1, p2}, Landroidx/media2/common/CallbackMediaItem$Builder;->setEndPosition(J)Landroidx/media2/common/CallbackMediaItem$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setMetadata(Landroidx/media2/common/MediaMetadata;)Landroidx/media2/common/CallbackMediaItem$Builder;
    .locals 0

    .line 74
    invoke-super {p0, p1}, Landroidx/media2/common/MediaItem$Builder;->setMetadata(Landroidx/media2/common/MediaMetadata;)Landroidx/media2/common/MediaItem$Builder;

    move-result-object p1

    check-cast p1, Landroidx/media2/common/CallbackMediaItem$Builder;

    return-object p1
.end method

.method public bridge synthetic setMetadata(Landroidx/media2/common/MediaMetadata;)Landroidx/media2/common/MediaItem$Builder;
    .locals 0

    .line 56
    invoke-virtual {p0, p1}, Landroidx/media2/common/CallbackMediaItem$Builder;->setMetadata(Landroidx/media2/common/MediaMetadata;)Landroidx/media2/common/CallbackMediaItem$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setStartPosition(J)Landroidx/media2/common/CallbackMediaItem$Builder;
    .locals 0

    .line 81
    invoke-super {p0, p1, p2}, Landroidx/media2/common/MediaItem$Builder;->setStartPosition(J)Landroidx/media2/common/MediaItem$Builder;

    move-result-object p1

    check-cast p1, Landroidx/media2/common/CallbackMediaItem$Builder;

    return-object p1
.end method

.method public bridge synthetic setStartPosition(J)Landroidx/media2/common/MediaItem$Builder;
    .locals 0

    .line 56
    invoke-virtual {p0, p1, p2}, Landroidx/media2/common/CallbackMediaItem$Builder;->setStartPosition(J)Landroidx/media2/common/CallbackMediaItem$Builder;

    move-result-object p1

    return-object p1
.end method
