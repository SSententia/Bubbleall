.class Landroidx/media2/widget/MediaControlView$30;
.super Ljava/lang/Object;
.source "MediaControlView.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/widget/MediaControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/widget/MediaControlView;


# direct methods
.method constructor <init>(Landroidx/media2/widget/MediaControlView;)V
    .locals 0

    .line 1340
    iput-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1343
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget p1, p1, Landroidx/media2/widget/MediaControlView;->mSettingsMode:I

    if-eqz p1, :cond_8

    const/4 p2, 0x1

    if-eq p1, p2, :cond_6

    const/4 p4, 0x2

    if-eq p1, p4, :cond_3

    const/4 p4, 0x3

    if-eq p1, p4, :cond_0

    goto/16 :goto_2

    :cond_0
    if-nez p3, :cond_1

    .line 1346
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p1, p1, Landroidx/media2/widget/MediaControlView;->mSubSettingsAdapter:Landroidx/media2/widget/MediaControlView$SubSettingsAdapter;

    iget-object p2, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p2, p2, Landroidx/media2/widget/MediaControlView;->mAudioTrackDescriptionList:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroidx/media2/widget/MediaControlView$SubSettingsAdapter;->setTexts(Ljava/util/List;)V

    .line 1347
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p1, p1, Landroidx/media2/widget/MediaControlView;->mSubSettingsAdapter:Landroidx/media2/widget/MediaControlView$SubSettingsAdapter;

    iget-object p2, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget p2, p2, Landroidx/media2/widget/MediaControlView;->mSelectedAudioTrackIndex:I

    invoke-virtual {p1, p2}, Landroidx/media2/widget/MediaControlView$SubSettingsAdapter;->setCheckPosition(I)V

    .line 1348
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    const/4 p2, 0x0

    iput p2, p1, Landroidx/media2/widget/MediaControlView;->mSettingsMode:I

    goto :goto_0

    :cond_1
    if-ne p3, p2, :cond_2

    .line 1350
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p1, p1, Landroidx/media2/widget/MediaControlView;->mSubSettingsAdapter:Landroidx/media2/widget/MediaControlView$SubSettingsAdapter;

    iget-object p3, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p3, p3, Landroidx/media2/widget/MediaControlView;->mPlaybackSpeedTextList:Ljava/util/List;

    invoke-virtual {p1, p3}, Landroidx/media2/widget/MediaControlView$SubSettingsAdapter;->setTexts(Ljava/util/List;)V

    .line 1351
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p1, p1, Landroidx/media2/widget/MediaControlView;->mSubSettingsAdapter:Landroidx/media2/widget/MediaControlView$SubSettingsAdapter;

    iget-object p3, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget p3, p3, Landroidx/media2/widget/MediaControlView;->mSelectedSpeedIndex:I

    invoke-virtual {p1, p3}, Landroidx/media2/widget/MediaControlView$SubSettingsAdapter;->setCheckPosition(I)V

    .line 1352
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iput p2, p1, Landroidx/media2/widget/MediaControlView;->mSettingsMode:I

    .line 1354
    :cond_2
    :goto_0
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p2, p1, Landroidx/media2/widget/MediaControlView;->mSubSettingsAdapter:Landroidx/media2/widget/MediaControlView$SubSettingsAdapter;

    invoke-virtual {p1, p2}, Landroidx/media2/widget/MediaControlView;->displaySettingsWindow(Landroid/widget/BaseAdapter;)V

    goto/16 :goto_2

    .line 1372
    :cond_3
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget p1, p1, Landroidx/media2/widget/MediaControlView;->mSelectedSubtitleTrackIndex:I

    add-int/2addr p1, p2

    if-eq p3, p1, :cond_5

    if-lez p3, :cond_4

    .line 1374
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p1, p1, Landroidx/media2/widget/MediaControlView;->mPlayer:Landroidx/media2/widget/PlayerWrapper;

    iget-object p4, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p4, p4, Landroidx/media2/widget/MediaControlView;->mSubtitleTracks:Ljava/util/List;

    sub-int/2addr p3, p2

    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/media2/common/SessionPlayer$TrackInfo;

    invoke-virtual {p1, p2}, Landroidx/media2/widget/PlayerWrapper;->selectTrack(Landroidx/media2/common/SessionPlayer$TrackInfo;)V

    goto :goto_1

    .line 1376
    :cond_4
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p1, p1, Landroidx/media2/widget/MediaControlView;->mPlayer:Landroidx/media2/widget/PlayerWrapper;

    iget-object p2, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p2, p2, Landroidx/media2/widget/MediaControlView;->mSubtitleTracks:Ljava/util/List;

    iget-object p3, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget p3, p3, Landroidx/media2/widget/MediaControlView;->mSelectedSubtitleTrackIndex:I

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/media2/common/SessionPlayer$TrackInfo;

    invoke-virtual {p1, p2}, Landroidx/media2/widget/PlayerWrapper;->deselectTrack(Landroidx/media2/common/SessionPlayer$TrackInfo;)V

    .line 1379
    :cond_5
    :goto_1
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    invoke-virtual {p1}, Landroidx/media2/widget/MediaControlView;->dismissSettingsWindow()V

    goto :goto_2

    .line 1365
    :cond_6
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget p1, p1, Landroidx/media2/widget/MediaControlView;->mSelectedSpeedIndex:I

    if-eq p3, p1, :cond_7

    .line 1366
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p1, p1, Landroidx/media2/widget/MediaControlView;->mPlaybackSpeedMultBy100List:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-float p1, p1

    const/high16 p2, 0x42c80000    # 100.0f

    div-float/2addr p1, p2

    .line 1367
    iget-object p2, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p2, p2, Landroidx/media2/widget/MediaControlView;->mPlayer:Landroidx/media2/widget/PlayerWrapper;

    invoke-virtual {p2, p1}, Landroidx/media2/widget/PlayerWrapper;->setPlaybackSpeed(F)V

    .line 1369
    :cond_7
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    invoke-virtual {p1}, Landroidx/media2/widget/MediaControlView;->dismissSettingsWindow()V

    goto :goto_2

    .line 1357
    :cond_8
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget p1, p1, Landroidx/media2/widget/MediaControlView;->mSelectedAudioTrackIndex:I

    if-eq p3, p1, :cond_9

    .line 1358
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p1, p1, Landroidx/media2/widget/MediaControlView;->mAudioTracks:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_9

    .line 1359
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p1, p1, Landroidx/media2/widget/MediaControlView;->mPlayer:Landroidx/media2/widget/PlayerWrapper;

    iget-object p2, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p2, p2, Landroidx/media2/widget/MediaControlView;->mAudioTracks:Ljava/util/List;

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/media2/common/SessionPlayer$TrackInfo;

    invoke-virtual {p1, p2}, Landroidx/media2/widget/PlayerWrapper;->selectTrack(Landroidx/media2/common/SessionPlayer$TrackInfo;)V

    .line 1362
    :cond_9
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$30;->this$0:Landroidx/media2/widget/MediaControlView;

    invoke-virtual {p1}, Landroidx/media2/widget/MediaControlView;->dismissSettingsWindow()V

    :goto_2
    return-void
.end method
