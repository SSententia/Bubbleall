.class Landroidx/media2/widget/SubtitleController;
.super Ljava/lang/Object;
.source "SubtitleController.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/widget/SubtitleController$Listener;,
        Landroidx/media2/widget/SubtitleController$Anchor;,
        Landroidx/media2/widget/SubtitleController$Renderer;,
        Landroidx/media2/widget/SubtitleController$MediaFormatUtil;
    }
.end annotation


# static fields
.field private static final WHAT_HIDE:I = 0x2

.field private static final WHAT_SELECT_DEFAULT_TRACK:I = 0x4

.field private static final WHAT_SELECT_TRACK:I = 0x3

.field private static final WHAT_SHOW:I = 0x1


# instance fields
.field private mAnchor:Landroidx/media2/widget/SubtitleController$Anchor;

.field private final mCallback:Landroid/os/Handler$Callback;

.field private mCaptioningChangeListener:Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;

.field private mCaptioningManager:Landroid/view/accessibility/CaptioningManager;

.field private mHandler:Landroid/os/Handler;

.field private mListener:Landroidx/media2/widget/SubtitleController$Listener;

.field private mRenderers:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/media2/widget/SubtitleController$Renderer;",
            ">;"
        }
    .end annotation
.end field

.field private final mRenderersLock:Ljava/lang/Object;

.field private mSelectedTrack:Landroidx/media2/widget/SubtitleTrack;

.field private mTimeProvider:Landroidx/media2/widget/MediaTimeProvider;

.field private mTrackIsExplicit:Z

.field private mTracks:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/media2/widget/SubtitleTrack;",
            ">;"
        }
    .end annotation
.end field

.field private final mTracksLock:Ljava/lang/Object;

.field private mVisibilityIsExplicit:Z


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 85
    invoke-direct {p0, p1, v0, v0}, Landroidx/media2/widget/SubtitleController;-><init>(Landroid/content/Context;Landroidx/media2/widget/MediaTimeProvider;Landroidx/media2/widget/SubtitleController$Listener;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroidx/media2/widget/MediaTimeProvider;Landroidx/media2/widget/SubtitleController$Listener;)V
    .locals 1

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/media2/widget/SubtitleController;->mRenderersLock:Ljava/lang/Object;

    .line 48
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/media2/widget/SubtitleController;->mTracksLock:Ljava/lang/Object;

    .line 62
    new-instance v0, Landroidx/media2/widget/SubtitleController$1;

    invoke-direct {v0, p0}, Landroidx/media2/widget/SubtitleController$1;-><init>(Landroidx/media2/widget/SubtitleController;)V

    iput-object v0, p0, Landroidx/media2/widget/SubtitleController;->mCallback:Landroid/os/Handler$Callback;

    const/4 v0, 0x0

    .line 289
    iput-boolean v0, p0, Landroidx/media2/widget/SubtitleController;->mTrackIsExplicit:Z

    .line 290
    iput-boolean v0, p0, Landroidx/media2/widget/SubtitleController;->mVisibilityIsExplicit:Z

    .line 98
    iput-object p2, p0, Landroidx/media2/widget/SubtitleController;->mTimeProvider:Landroidx/media2/widget/MediaTimeProvider;

    .line 99
    iput-object p3, p0, Landroidx/media2/widget/SubtitleController;->mListener:Landroidx/media2/widget/SubtitleController$Listener;

    .line 101
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Landroidx/media2/widget/SubtitleController;->mRenderers:Ljava/util/ArrayList;

    .line 102
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Landroidx/media2/widget/SubtitleController;->mTracks:Ljava/util/ArrayList;

    .line 104
    const-string p2, "captioning"

    .line 105
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/CaptioningManager;

    iput-object p1, p0, Landroidx/media2/widget/SubtitleController;->mCaptioningManager:Landroid/view/accessibility/CaptioningManager;

    .line 106
    new-instance p1, Landroidx/media2/widget/SubtitleController$2;

    invoke-direct {p1, p0}, Landroidx/media2/widget/SubtitleController$2;-><init>(Landroidx/media2/widget/SubtitleController;)V

    iput-object p1, p0, Landroidx/media2/widget/SubtitleController;->mCaptioningChangeListener:Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;

    return-void
.end method

.method private getRenderingWidget()Landroidx/media2/widget/SubtitleTrack$RenderingWidget;
    .locals 1

    .line 151
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mSelectedTrack:Landroidx/media2/widget/SubtitleTrack;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 154
    :cond_0
    invoke-virtual {v0}, Landroidx/media2/widget/SubtitleTrack;->getRenderingWidget()Landroidx/media2/widget/SubtitleTrack$RenderingWidget;

    move-result-object v0

    return-object v0
.end method

.method private processOnAnchor(Landroid/os/Message;)V
    .locals 2

    .line 516
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Landroidx/media2/widget/SubtitleController;->mHandler:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 517
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->dispatchMessage(Landroid/os/Message;)V

    goto :goto_0

    .line 519
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :goto_0
    return-void
.end method


# virtual methods
.method public addTrack(Landroid/media/MediaFormat;)Landroidx/media2/widget/SubtitleTrack;
    .locals 4

    .line 354
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mRenderersLock:Ljava/lang/Object;

    monitor-enter v0

    .line 355
    :try_start_0
    iget-object v1, p0, Landroidx/media2/widget/SubtitleController;->mRenderers:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media2/widget/SubtitleController$Renderer;

    .line 356
    invoke-virtual {v2, p1}, Landroidx/media2/widget/SubtitleController$Renderer;->supports(Landroid/media/MediaFormat;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 357
    invoke-virtual {v2, p1}, Landroidx/media2/widget/SubtitleController$Renderer;->createTrack(Landroid/media/MediaFormat;)Landroidx/media2/widget/SubtitleTrack;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 359
    iget-object p1, p0, Landroidx/media2/widget/SubtitleController;->mTracksLock:Ljava/lang/Object;

    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 360
    :try_start_1
    iget-object v1, p0, Landroidx/media2/widget/SubtitleController;->mTracks:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 361
    iget-object v1, p0, Landroidx/media2/widget/SubtitleController;->mCaptioningManager:Landroid/view/accessibility/CaptioningManager;

    iget-object v3, p0, Landroidx/media2/widget/SubtitleController;->mCaptioningChangeListener:Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;

    invoke-static {v1, v3}, Landroidx/media2/widget/CaptioningManagerHelper$Api19Impl;->addCaptioningChangeListener(Landroid/view/accessibility/CaptioningManager;Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;)V

    .line 364
    :cond_1
    iget-object v1, p0, Landroidx/media2/widget/SubtitleController;->mTracks:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 365
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 366
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object v2

    :catchall_0
    move-exception v1

    .line 365
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v1

    .line 370
    :cond_2
    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method doHide()V
    .locals 1

    const/4 v0, 0x1

    .line 402
    iput-boolean v0, p0, Landroidx/media2/widget/SubtitleController;->mVisibilityIsExplicit:Z

    .line 403
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mSelectedTrack:Landroidx/media2/widget/SubtitleTrack;

    if-eqz v0, :cond_0

    .line 404
    invoke-virtual {v0}, Landroidx/media2/widget/SubtitleTrack;->hide()V

    :cond_0
    return-void
.end method

.method doSelectDefaultTrack()V
    .locals 3

    .line 299
    iget-boolean v0, p0, Landroidx/media2/widget/SubtitleController;->mTrackIsExplicit:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 300
    iget-boolean v0, p0, Landroidx/media2/widget/SubtitleController;->mVisibilityIsExplicit:Z

    if-eqz v0, :cond_0

    return-void

    .line 306
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mCaptioningManager:Landroid/view/accessibility/CaptioningManager;

    invoke-static {v0}, Landroidx/media2/widget/CaptioningManagerHelper$Api19Impl;->isEnabled(Landroid/view/accessibility/CaptioningManager;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 307
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mSelectedTrack:Landroidx/media2/widget/SubtitleTrack;

    if-eqz v0, :cond_1

    .line 309
    invoke-virtual {v0}, Landroidx/media2/widget/SubtitleTrack;->getFormat()Landroid/media/MediaFormat;

    move-result-object v0

    const-string v2, "is-forced-subtitle"

    .line 308
    invoke-static {v0, v2, v1}, Landroidx/media2/widget/SubtitleController$MediaFormatUtil;->getInteger(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 312
    :cond_1
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mSelectedTrack:Landroidx/media2/widget/SubtitleTrack;

    if-eqz v0, :cond_3

    .line 313
    invoke-virtual {v0}, Landroidx/media2/widget/SubtitleTrack;->getTrackType()I

    move-result v0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_3

    .line 314
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleController;->hide()V

    goto :goto_1

    .line 311
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleController;->show()V

    .line 316
    :cond_3
    :goto_1
    iput-boolean v1, p0, Landroidx/media2/widget/SubtitleController;->mVisibilityIsExplicit:Z

    .line 322
    :cond_4
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleController;->getDefaultTrack()Landroidx/media2/widget/SubtitleTrack;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 324
    invoke-virtual {p0, v0}, Landroidx/media2/widget/SubtitleController;->selectTrack(Landroidx/media2/widget/SubtitleTrack;)Z

    .line 325
    iput-boolean v1, p0, Landroidx/media2/widget/SubtitleController;->mTrackIsExplicit:Z

    .line 326
    iget-boolean v0, p0, Landroidx/media2/widget/SubtitleController;->mVisibilityIsExplicit:Z

    if-nez v0, :cond_5

    .line 327
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleController;->show()V

    .line 328
    iput-boolean v1, p0, Landroidx/media2/widget/SubtitleController;->mVisibilityIsExplicit:Z

    :cond_5
    return-void
.end method

.method doSelectTrack(Landroidx/media2/widget/SubtitleTrack;)V
    .locals 2

    const/4 v0, 0x1

    .line 179
    iput-boolean v0, p0, Landroidx/media2/widget/SubtitleController;->mTrackIsExplicit:Z

    .line 180
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mSelectedTrack:Landroidx/media2/widget/SubtitleTrack;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    if-eqz v0, :cond_1

    .line 185
    invoke-virtual {v0}, Landroidx/media2/widget/SubtitleTrack;->hide()V

    .line 186
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mSelectedTrack:Landroidx/media2/widget/SubtitleTrack;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/media2/widget/SubtitleTrack;->setTimeProvider(Landroidx/media2/widget/MediaTimeProvider;)V

    .line 189
    :cond_1
    iput-object p1, p0, Landroidx/media2/widget/SubtitleController;->mSelectedTrack:Landroidx/media2/widget/SubtitleTrack;

    .line 190
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mAnchor:Landroidx/media2/widget/SubtitleController$Anchor;

    if-eqz v0, :cond_2

    .line 191
    invoke-direct {p0}, Landroidx/media2/widget/SubtitleController;->getRenderingWidget()Landroidx/media2/widget/SubtitleTrack$RenderingWidget;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/media2/widget/SubtitleController$Anchor;->setSubtitleWidget(Landroidx/media2/widget/SubtitleTrack$RenderingWidget;)V

    .line 194
    :cond_2
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mSelectedTrack:Landroidx/media2/widget/SubtitleTrack;

    if-eqz v0, :cond_3

    .line 195
    iget-object v1, p0, Landroidx/media2/widget/SubtitleController;->mTimeProvider:Landroidx/media2/widget/MediaTimeProvider;

    invoke-virtual {v0, v1}, Landroidx/media2/widget/SubtitleTrack;->setTimeProvider(Landroidx/media2/widget/MediaTimeProvider;)V

    .line 196
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mSelectedTrack:Landroidx/media2/widget/SubtitleTrack;

    invoke-virtual {v0}, Landroidx/media2/widget/SubtitleTrack;->show()V

    .line 199
    :cond_3
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mListener:Landroidx/media2/widget/SubtitleController$Listener;

    if-eqz v0, :cond_4

    .line 200
    invoke-interface {v0, p1}, Landroidx/media2/widget/SubtitleController$Listener;->onSubtitleTrackSelected(Landroidx/media2/widget/SubtitleTrack;)V

    :cond_4
    return-void
.end method

.method doShow()V
    .locals 1

    const/4 v0, 0x1

    .line 385
    iput-boolean v0, p0, Landroidx/media2/widget/SubtitleController;->mVisibilityIsExplicit:Z

    .line 386
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mSelectedTrack:Landroidx/media2/widget/SubtitleTrack;

    if-eqz v0, :cond_0

    .line 387
    invoke-virtual {v0}, Landroidx/media2/widget/SubtitleTrack;->show()V

    :cond_0
    return-void
.end method

.method protected finalize()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 124
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mCaptioningManager:Landroid/view/accessibility/CaptioningManager;

    iget-object v1, p0, Landroidx/media2/widget/SubtitleController;->mCaptioningChangeListener:Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;

    invoke-static {v0, v1}, Landroidx/media2/widget/CaptioningManagerHelper$Api19Impl;->removeCaptioningChangeListener(Landroid/view/accessibility/CaptioningManager;Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;)V

    .line 127
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method public getDefaultTrack()Landroidx/media2/widget/SubtitleTrack;
    .locals 16

    move-object/from16 v1, p0

    .line 232
    iget-object v0, v1, Landroidx/media2/widget/SubtitleController;->mCaptioningManager:Landroid/view/accessibility/CaptioningManager;

    invoke-static {v0}, Landroidx/media2/widget/CaptioningManagerHelper$Api19Impl;->getLocale(Landroid/view/accessibility/CaptioningManager;)Ljava/util/Locale;

    move-result-object v0

    if-nez v0, :cond_0

    .line 235
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v0

    .line 238
    :goto_0
    iget-object v3, v1, Landroidx/media2/widget/SubtitleController;->mCaptioningManager:Landroid/view/accessibility/CaptioningManager;

    invoke-static {v3}, Landroidx/media2/widget/CaptioningManagerHelper$Api19Impl;->isEnabled(Landroid/view/accessibility/CaptioningManager;)Z

    move-result v3

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    .line 240
    iget-object v5, v1, Landroidx/media2/widget/SubtitleController;->mTracksLock:Ljava/lang/Object;

    monitor-enter v5

    .line 241
    :try_start_0
    iget-object v6, v1, Landroidx/media2/widget/SubtitleController;->mTracks:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, -0x1

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/media2/widget/SubtitleTrack;

    .line 242
    invoke-virtual {v9}, Landroidx/media2/widget/SubtitleTrack;->getFormat()Landroid/media/MediaFormat;

    move-result-object v10

    .line 243
    const-string v11, "language"

    invoke-virtual {v10, v11}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 244
    const-string v12, "is-forced-subtitle"

    const/4 v13, 0x0

    .line 245
    invoke-static {v10, v12, v13}, Landroidx/media2/widget/SubtitleController$MediaFormatUtil;->getInteger(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    move-result v12

    if-eqz v12, :cond_1

    move v12, v4

    goto :goto_2

    :cond_1
    move v12, v13

    .line 246
    :goto_2
    const-string v14, "is-autoselect"

    .line 247
    invoke-static {v10, v14, v4}, Landroidx/media2/widget/SubtitleController$MediaFormatUtil;->getInteger(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    move-result v14

    if-eqz v14, :cond_2

    move v14, v4

    goto :goto_3

    :cond_2
    move v14, v13

    .line 248
    :goto_3
    const-string v15, "is-default"

    .line 249
    invoke-static {v10, v15, v13}, Landroidx/media2/widget/SubtitleController$MediaFormatUtil;->getInteger(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    move-result v10

    if-eqz v10, :cond_3

    move v10, v4

    goto :goto_4

    :cond_3
    move v10, v13

    :goto_4
    if-eqz v2, :cond_5

    .line 252
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v15

    const-string v4, ""

    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 253
    invoke-virtual {v2}, Ljava/util/Locale;->getISO3Language()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 254
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_5

    :cond_4
    move v4, v13

    goto :goto_6

    :cond_5
    :goto_5
    const/4 v4, 0x1

    :goto_6
    if-eqz v12, :cond_6

    move v11, v13

    goto :goto_7

    :cond_6
    const/16 v11, 0x8

    :goto_7
    if-nez v0, :cond_7

    if-eqz v10, :cond_7

    const/4 v15, 0x4

    goto :goto_8

    :cond_7
    move v15, v13

    :goto_8
    add-int/2addr v11, v15

    if-eqz v14, :cond_8

    goto :goto_9

    :cond_8
    const/4 v13, 0x2

    :goto_9
    add-int/2addr v11, v13

    add-int/2addr v11, v4

    if-eqz v3, :cond_a

    if-nez v12, :cond_a

    :cond_9
    :goto_a
    const/4 v4, 0x1

    goto :goto_1

    :cond_a
    if-nez v0, :cond_b

    if-nez v10, :cond_c

    :cond_b
    if-eqz v4, :cond_9

    if-nez v14, :cond_c

    if-nez v12, :cond_c

    if-eqz v0, :cond_9

    :cond_c
    if-le v11, v8, :cond_9

    move-object v7, v9

    move v8, v11

    goto :goto_a

    .line 273
    :cond_d
    monitor-exit v5

    return-object v7

    :catchall_0
    move-exception v0

    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getSelectedTrack()Landroidx/media2/widget/SubtitleTrack;
    .locals 1

    .line 147
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mSelectedTrack:Landroidx/media2/widget/SubtitleTrack;

    return-object v0
.end method

.method public getTracks()[Landroidx/media2/widget/SubtitleTrack;
    .locals 3

    .line 136
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mTracksLock:Ljava/lang/Object;

    monitor-enter v0

    .line 137
    :try_start_0
    iget-object v1, p0, Landroidx/media2/widget/SubtitleController;->mTracks:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Landroidx/media2/widget/SubtitleTrack;

    .line 138
    iget-object v2, p0, Landroidx/media2/widget/SubtitleController;->mTracks:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 139
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 140
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public hasRendererFor(Landroid/media/MediaFormat;)Z
    .locals 3

    .line 464
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mRenderersLock:Ljava/lang/Object;

    monitor-enter v0

    .line 466
    :try_start_0
    iget-object v1, p0, Landroidx/media2/widget/SubtitleController;->mRenderers:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media2/widget/SubtitleController$Renderer;

    .line 467
    invoke-virtual {v2, p1}, Landroidx/media2/widget/SubtitleController$Renderer;->supports(Landroid/media/MediaFormat;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 468
    monitor-exit v0

    const/4 p1, 0x1

    return p1

    .line 471
    :cond_1
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    .line 472
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public hide()V
    .locals 2

    .line 397
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/media2/widget/SubtitleController;->processOnAnchor(Landroid/os/Message;)V

    return-void
.end method

.method public registerRenderer(Landroidx/media2/widget/SubtitleController$Renderer;)V
    .locals 2

    .line 447
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mRenderersLock:Ljava/lang/Object;

    monitor-enter v0

    .line 449
    :try_start_0
    iget-object v1, p0, Landroidx/media2/widget/SubtitleController;->mRenderers:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 451
    iget-object v1, p0, Landroidx/media2/widget/SubtitleController;->mRenderers:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 453
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public reset()V
    .locals 2

    .line 335
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleController;->hide()V

    const/4 v0, 0x0

    .line 336
    invoke-virtual {p0, v0}, Landroidx/media2/widget/SubtitleController;->selectTrack(Landroidx/media2/widget/SubtitleTrack;)Z

    .line 337
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mTracks:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    .line 338
    iput-boolean v0, p0, Landroidx/media2/widget/SubtitleController;->mTrackIsExplicit:Z

    .line 339
    iput-boolean v0, p0, Landroidx/media2/widget/SubtitleController;->mVisibilityIsExplicit:Z

    .line 341
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mCaptioningManager:Landroid/view/accessibility/CaptioningManager;

    iget-object v1, p0, Landroidx/media2/widget/SubtitleController;->mCaptioningChangeListener:Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;

    invoke-static {v0, v1}, Landroidx/media2/widget/CaptioningManagerHelper$Api19Impl;->removeCaptioningChangeListener(Landroid/view/accessibility/CaptioningManager;Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;)V

    return-void
.end method

.method public selectDefaultTrack()V
    .locals 2

    .line 294
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/media2/widget/SubtitleController;->processOnAnchor(Landroid/os/Message;)V

    return-void
.end method

.method public selectTrack(Landroidx/media2/widget/SubtitleTrack;)Z
    .locals 2

    if-eqz p1, :cond_0

    .line 169
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mTracks:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 173
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/media2/widget/SubtitleController;->processOnAnchor(Landroid/os/Message;)V

    const/4 p1, 0x1

    return p1
.end method

.method public setAnchor(Landroidx/media2/widget/SubtitleController$Anchor;)V
    .locals 2

    .line 500
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mAnchor:Landroidx/media2/widget/SubtitleController$Anchor;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 505
    invoke-interface {v0, v1}, Landroidx/media2/widget/SubtitleController$Anchor;->setSubtitleWidget(Landroidx/media2/widget/SubtitleTrack$RenderingWidget;)V

    .line 507
    :cond_1
    iput-object p1, p0, Landroidx/media2/widget/SubtitleController;->mAnchor:Landroidx/media2/widget/SubtitleController$Anchor;

    .line 508
    iput-object v1, p0, Landroidx/media2/widget/SubtitleController;->mHandler:Landroid/os/Handler;

    if-eqz p1, :cond_2

    .line 510
    new-instance p1, Landroid/os/Handler;

    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mAnchor:Landroidx/media2/widget/SubtitleController$Anchor;

    invoke-interface {v0}, Landroidx/media2/widget/SubtitleController$Anchor;->getSubtitleLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Landroidx/media2/widget/SubtitleController;->mCallback:Landroid/os/Handler$Callback;

    invoke-direct {p1, v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Landroidx/media2/widget/SubtitleController;->mHandler:Landroid/os/Handler;

    .line 511
    iget-object p1, p0, Landroidx/media2/widget/SubtitleController;->mAnchor:Landroidx/media2/widget/SubtitleController$Anchor;

    invoke-direct {p0}, Landroidx/media2/widget/SubtitleController;->getRenderingWidget()Landroidx/media2/widget/SubtitleTrack$RenderingWidget;

    move-result-object v0

    invoke-interface {p1, v0}, Landroidx/media2/widget/SubtitleController$Anchor;->setSubtitleWidget(Landroidx/media2/widget/SubtitleTrack$RenderingWidget;)V

    :cond_2
    return-void
.end method

.method public show()V
    .locals 2

    .line 380
    iget-object v0, p0, Landroidx/media2/widget/SubtitleController;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/media2/widget/SubtitleController;->processOnAnchor(Landroid/os/Message;)V

    return-void
.end method
