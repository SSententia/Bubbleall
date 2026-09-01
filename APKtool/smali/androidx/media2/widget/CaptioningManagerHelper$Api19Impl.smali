.class final Landroidx/media2/widget/CaptioningManagerHelper$Api19Impl;
.super Ljava/lang/Object;
.source "CaptioningManagerHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/widget/CaptioningManagerHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Api19Impl"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static addCaptioningChangeListener(Landroid/view/accessibility/CaptioningManager;Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;)V
    .locals 0

    .line 34
    invoke-virtual {p0, p1}, Landroid/view/accessibility/CaptioningManager;->addCaptioningChangeListener(Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;)V

    return-void
.end method

.method static getFontScale(Landroid/view/accessibility/CaptioningManager;)F
    .locals 0

    .line 45
    invoke-virtual {p0}, Landroid/view/accessibility/CaptioningManager;->getFontScale()F

    move-result p0

    return p0
.end method

.method static getLocale(Landroid/view/accessibility/CaptioningManager;)Ljava/util/Locale;
    .locals 0

    .line 50
    invoke-virtual {p0}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    move-result-object p0

    return-object p0
.end method

.method static getUserStyle(Landroid/view/accessibility/CaptioningManager;)Landroid/view/accessibility/CaptioningManager$CaptionStyle;
    .locals 0

    .line 55
    invoke-virtual {p0}, Landroid/view/accessibility/CaptioningManager;->getUserStyle()Landroid/view/accessibility/CaptioningManager$CaptionStyle;

    move-result-object p0

    return-object p0
.end method

.method static isEnabled(Landroid/view/accessibility/CaptioningManager;)Z
    .locals 0

    .line 60
    invoke-virtual {p0}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result p0

    return p0
.end method

.method static removeCaptioningChangeListener(Landroid/view/accessibility/CaptioningManager;Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;)V
    .locals 0

    .line 40
    invoke-virtual {p0, p1}, Landroid/view/accessibility/CaptioningManager;->removeCaptioningChangeListener(Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;)V

    return-void
.end method
