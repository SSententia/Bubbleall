.class public Landroidx/media2/widget/Cea708CCParser$CaptionWindow;
.super Ljava/lang/Object;
.source "Cea708CCParser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/widget/Cea708CCParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CaptionWindow"
.end annotation


# instance fields
.field public final anchorHorizontal:I

.field public final anchorId:I

.field public final anchorVertical:I

.field public final columnCount:I

.field public final columnLock:Z

.field public final id:I

.field public final penStyle:I

.field public final priority:I

.field public final relativePositioning:Z

.field public final rowCount:I

.field public final rowLock:Z

.field public final visible:Z

.field public final windowStyle:I


# direct methods
.method constructor <init>(IZZZIZIIIIIII)V
    .locals 0

    .line 881
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 882
    iput p1, p0, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->id:I

    .line 883
    iput-boolean p2, p0, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->visible:Z

    .line 884
    iput-boolean p3, p0, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->rowLock:Z

    .line 885
    iput-boolean p4, p0, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->columnLock:Z

    .line 886
    iput p5, p0, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->priority:I

    .line 887
    iput-boolean p6, p0, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->relativePositioning:Z

    .line 888
    iput p7, p0, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->anchorVertical:I

    .line 889
    iput p8, p0, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->anchorHorizontal:I

    .line 890
    iput p9, p0, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->anchorId:I

    .line 891
    iput p10, p0, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->rowCount:I

    .line 892
    iput p11, p0, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->columnCount:I

    .line 893
    iput p12, p0, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->penStyle:I

    .line 894
    iput p13, p0, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->windowStyle:I

    return-void
.end method
