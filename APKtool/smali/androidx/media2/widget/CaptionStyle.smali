.class final Landroidx/media2/widget/CaptionStyle;
.super Ljava/lang/Object;
.source "CaptionStyle.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/widget/CaptionStyle$Api19Impl;
    }
.end annotation


# static fields
.field private static final COLOR_NONE_OPAQUE:I = 0xff

.field public static final COLOR_UNSPECIFIED:I = 0xffffff

.field public static final DEFAULT:Landroidx/media2/widget/CaptionStyle;

.field public static final EDGE_TYPE_DEPRESSED:I = 0x4

.field public static final EDGE_TYPE_DROP_SHADOW:I = 0x2

.field public static final EDGE_TYPE_NONE:I = 0x0

.field public static final EDGE_TYPE_OUTLINE:I = 0x1

.field public static final EDGE_TYPE_RAISED:I = 0x3

.field public static final EDGE_TYPE_UNSPECIFIED:I = -0x1


# instance fields
.field public final backgroundColor:I

.field public final edgeColor:I

.field public final edgeType:I

.field public final foregroundColor:I

.field private final mHasBackgroundColor:Z

.field private final mHasEdgeColor:Z

.field private final mHasEdgeType:Z

.field private final mHasForegroundColor:Z

.field private final mHasWindowColor:Z

.field private mParsedTypeface:Landroid/graphics/Typeface;

.field public final windowColor:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 200
    new-instance v7, Landroidx/media2/widget/CaptionStyle;

    const/16 v5, 0xff

    const/4 v6, 0x0

    const/4 v1, -0x1

    const/high16 v2, -0x1000000

    const/4 v3, 0x0

    const/high16 v4, -0x1000000

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Landroidx/media2/widget/CaptionStyle;-><init>(IIIIILandroid/graphics/Typeface;)V

    sput-object v7, Landroidx/media2/widget/CaptionStyle;->DEFAULT:Landroidx/media2/widget/CaptionStyle;

    return-void
.end method

.method constructor <init>(IIIIILandroid/graphics/Typeface;)V
    .locals 7

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    invoke-static {p1}, Landroidx/media2/widget/CaptionStyle;->hasColor(I)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/media2/widget/CaptionStyle;->mHasForegroundColor:Z

    .line 116
    invoke-static {p2}, Landroidx/media2/widget/CaptionStyle;->hasColor(I)Z

    move-result v1

    iput-boolean v1, p0, Landroidx/media2/widget/CaptionStyle;->mHasBackgroundColor:Z

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-eq p3, v3, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    move v4, v2

    .line 117
    :goto_0
    iput-boolean v4, p0, Landroidx/media2/widget/CaptionStyle;->mHasEdgeType:Z

    .line 118
    invoke-static {p4}, Landroidx/media2/widget/CaptionStyle;->hasColor(I)Z

    move-result v5

    iput-boolean v5, p0, Landroidx/media2/widget/CaptionStyle;->mHasEdgeColor:Z

    .line 119
    invoke-static {p5}, Landroidx/media2/widget/CaptionStyle;->hasColor(I)Z

    move-result v6

    iput-boolean v6, p0, Landroidx/media2/widget/CaptionStyle;->mHasWindowColor:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move p1, v3

    .line 123
    :goto_1
    iput p1, p0, Landroidx/media2/widget/CaptionStyle;->foregroundColor:I

    const/high16 p1, -0x1000000

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    move p2, p1

    .line 124
    :goto_2
    iput p2, p0, Landroidx/media2/widget/CaptionStyle;->backgroundColor:I

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    move p3, v2

    .line 125
    :goto_3
    iput p3, p0, Landroidx/media2/widget/CaptionStyle;->edgeType:I

    if-eqz v5, :cond_4

    goto :goto_4

    :cond_4
    move p4, p1

    .line 126
    :goto_4
    iput p4, p0, Landroidx/media2/widget/CaptionStyle;->edgeColor:I

    if-eqz v6, :cond_5

    goto :goto_5

    :cond_5
    const/16 p5, 0xff

    .line 127
    :goto_5
    iput p5, p0, Landroidx/media2/widget/CaptionStyle;->windowColor:I

    .line 129
    iput-object p6, p0, Landroidx/media2/widget/CaptionStyle;->mParsedTypeface:Landroid/graphics/Typeface;

    return-void
.end method

.method constructor <init>(Landroid/view/accessibility/CaptioningManager$CaptionStyle;)V
    .locals 7

    .line 107
    iget v1, p1, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->foregroundColor:I

    iget v2, p1, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->backgroundColor:I

    iget v3, p1, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->edgeType:I

    iget v4, p1, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->edgeColor:I

    .line 109
    iget v5, p1, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->windowColor:I

    .line 110
    invoke-static {p1}, Landroidx/media2/widget/CaptionStyle$Api19Impl;->getTypeface(Landroid/view/accessibility/CaptioningManager$CaptionStyle;)Landroid/graphics/Typeface;

    move-result-object v6

    move-object v0, p0

    .line 107
    invoke-direct/range {v0 .. v6}, Landroidx/media2/widget/CaptionStyle;-><init>(IIIIILandroid/graphics/Typeface;)V

    return-void
.end method

.method static hasColor(I)Z
    .locals 1

    ushr-int/lit8 v0, p0, 0x18

    if-nez v0, :cond_1

    const v0, 0xffff00

    and-int/2addr p0, v0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public getTypeface()Landroid/graphics/Typeface;
    .locals 1

    .line 196
    iget-object v0, p0, Landroidx/media2/widget/CaptionStyle;->mParsedTypeface:Landroid/graphics/Typeface;

    return-object v0
.end method

.method hasBackgroundColor()Z
    .locals 1

    .line 151
    iget-boolean v0, p0, Landroidx/media2/widget/CaptionStyle;->mHasBackgroundColor:Z

    return v0
.end method

.method hasEdgeColor()Z
    .locals 1

    .line 178
    iget-boolean v0, p0, Landroidx/media2/widget/CaptionStyle;->mHasEdgeColor:Z

    return v0
.end method

.method hasEdgeType()Z
    .locals 1

    .line 169
    iget-boolean v0, p0, Landroidx/media2/widget/CaptionStyle;->mHasEdgeType:Z

    return v0
.end method

.method hasForegroundColor()Z
    .locals 1

    .line 160
    iget-boolean v0, p0, Landroidx/media2/widget/CaptionStyle;->mHasForegroundColor:Z

    return v0
.end method

.method hasWindowColor()Z
    .locals 1

    .line 187
    iget-boolean v0, p0, Landroidx/media2/widget/CaptionStyle;->mHasWindowColor:Z

    return v0
.end method
