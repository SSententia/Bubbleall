.class Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;
.super Landroidx/media2/widget/ClosedCaptionWidget;
.source "Cea708CaptionRenderer.java"

# interfaces
.implements Landroidx/media2/widget/Cea708CCParser$DisplayListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/widget/Cea708CaptionRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Cea708CCWidget"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;,
        Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;,
        Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCHandler;,
        Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;,
        Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$ScaledLayout;
    }
.end annotation


# instance fields
.field private final mCCHandler:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCHandler;

.field final synthetic this$0:Landroidx/media2/widget/Cea708CaptionRenderer;


# direct methods
.method constructor <init>(Landroidx/media2/widget/Cea708CaptionRenderer;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 119
    invoke-direct {p0, p1, p2, v0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;-><init>(Landroidx/media2/widget/Cea708CaptionRenderer;Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method constructor <init>(Landroidx/media2/widget/Cea708CaptionRenderer;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 123
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;-><init>(Landroidx/media2/widget/Cea708CaptionRenderer;Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method constructor <init>(Landroidx/media2/widget/Cea708CaptionRenderer;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 126
    iput-object p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;->this$0:Landroidx/media2/widget/Cea708CaptionRenderer;

    .line 127
    invoke-direct {p0, p2, p3, p4}, Landroidx/media2/widget/ClosedCaptionWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 129
    new-instance p1, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCHandler;

    iget-object p2, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;->mClosedCaptionLayout:Landroidx/media2/widget/ClosedCaptionWidget$ClosedCaptionLayout;

    check-cast p2, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;

    invoke-direct {p1, p0, p2}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCHandler;-><init>(Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;)V

    iput-object p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;->mCCHandler:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCHandler;

    return-void
.end method


# virtual methods
.method public createCaptionLayout(Landroid/content/Context;)Landroidx/media2/widget/ClosedCaptionWidget$ClosedCaptionLayout;
    .locals 1

    .line 134
    new-instance v0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;

    invoke-direct {v0, p0, p1}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;-><init>(Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;Landroid/content/Context;)V

    return-object v0
.end method

.method public emitEvent(Landroidx/media2/widget/Cea708CCParser$CaptionEvent;)V
    .locals 1

    .line 139
    iget-object v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;->mCCHandler:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCHandler;

    invoke-virtual {v0, p1}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCHandler;->processCaptionEvent(Landroidx/media2/widget/Cea708CCParser$CaptionEvent;)V

    .line 141
    invoke-virtual {p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;->getHeight()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;->setSize(II)V

    .line 143
    iget-object p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;->mListener:Landroidx/media2/widget/SubtitleTrack$RenderingWidget$OnChangedListener;

    if-eqz p1, :cond_0

    .line 144
    iget-object p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;->mListener:Landroidx/media2/widget/SubtitleTrack$RenderingWidget$OnChangedListener;

    invoke-interface {p1, p0}, Landroidx/media2/widget/SubtitleTrack$RenderingWidget$OnChangedListener;->onChanged(Landroidx/media2/widget/SubtitleTrack$RenderingWidget;)V

    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 150
    invoke-super {p0, p1}, Landroidx/media2/widget/ClosedCaptionWidget;->onDraw(Landroid/graphics/Canvas;)V

    .line 151
    iget-object v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;->mClosedCaptionLayout:Landroidx/media2/widget/ClosedCaptionWidget$ClosedCaptionLayout;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method
