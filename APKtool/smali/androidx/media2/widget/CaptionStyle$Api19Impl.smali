.class Landroidx/media2/widget/CaptionStyle$Api19Impl;
.super Ljava/lang/Object;
.source "CaptionStyle.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/widget/CaptionStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Api19Impl"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static getTypeface(Landroid/view/accessibility/CaptioningManager$CaptionStyle;)Landroid/graphics/Typeface;
    .locals 0

    .line 209
    invoke-virtual {p0}, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->getTypeface()Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method
