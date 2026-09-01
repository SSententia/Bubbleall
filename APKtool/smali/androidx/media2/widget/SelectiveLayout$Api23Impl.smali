.class final Landroidx/media2/widget/SelectiveLayout$Api23Impl;
.super Ljava/lang/Object;
.source "SelectiveLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/widget/SelectiveLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Api23Impl"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 205
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static getForeground(Landroid/view/View;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 202
    invoke-virtual {p0}, Landroid/view/View;->getForeground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method
