.class public Landroidx/media2/widget/Cea708CCParser$CaptionColor;
.super Ljava/lang/Object;
.source "Cea708CCParser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/widget/Cea708CCParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CaptionColor"
.end annotation


# static fields
.field private static final COLOR_MAP:[I

.field public static final OPACITY_FLASH:I = 0x1

.field private static final OPACITY_MAP:[I

.field public static final OPACITY_SOLID:I = 0x0

.field public static final OPACITY_TRANSLUCENT:I = 0x2

.field public static final OPACITY_TRANSPARENT:I = 0x3


# instance fields
.field public final blue:I

.field public final green:I

.field public final opacity:I

.field public final red:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    const/16 v1, 0xf

    const/16 v2, 0xf0

    const/16 v3, 0xff

    .line 730
    filled-new-array {v0, v1, v2, v3}, [I

    move-result-object v1

    sput-object v1, Landroidx/media2/widget/Cea708CCParser$CaptionColor;->COLOR_MAP:[I

    const/16 v1, 0xfe

    const/16 v2, 0x80

    .line 731
    filled-new-array {v3, v1, v2, v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/media2/widget/Cea708CCParser$CaptionColor;->OPACITY_MAP:[I

    return-void
.end method

.method constructor <init>(IIII)V
    .locals 0

    .line 738
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 739
    iput p1, p0, Landroidx/media2/widget/Cea708CCParser$CaptionColor;->opacity:I

    .line 740
    iput p2, p0, Landroidx/media2/widget/Cea708CCParser$CaptionColor;->red:I

    .line 741
    iput p3, p0, Landroidx/media2/widget/Cea708CCParser$CaptionColor;->green:I

    .line 742
    iput p4, p0, Landroidx/media2/widget/Cea708CCParser$CaptionColor;->blue:I

    return-void
.end method


# virtual methods
.method public getArgbValue()I
    .locals 5

    .line 746
    sget-object v0, Landroidx/media2/widget/Cea708CCParser$CaptionColor;->OPACITY_MAP:[I

    iget v1, p0, Landroidx/media2/widget/Cea708CCParser$CaptionColor;->opacity:I

    aget v0, v0, v1

    sget-object v1, Landroidx/media2/widget/Cea708CCParser$CaptionColor;->COLOR_MAP:[I

    iget v2, p0, Landroidx/media2/widget/Cea708CCParser$CaptionColor;->red:I

    aget v2, v1, v2

    iget v3, p0, Landroidx/media2/widget/Cea708CCParser$CaptionColor;->green:I

    aget v3, v1, v3

    iget v4, p0, Landroidx/media2/widget/Cea708CCParser$CaptionColor;->blue:I

    aget v1, v1, v4

    invoke-static {v0, v2, v3, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0
.end method
