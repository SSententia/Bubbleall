.class public final Lcom/alexmanzana/bubbleall/utils/ImagePicker;
.super Ljava/lang/Object;
.source "ImagePicker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;,
        Lcom/alexmanzana/bubbleall/utils/ImagePicker$Sink;,
        Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;,
        Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;,
        Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;,
        Lcom/alexmanzana/bubbleall/utils/ImagePicker$FirstLayout;,
        Lcom/alexmanzana/bubbleall/utils/ImagePicker$Pick;,
        Lcom/alexmanzana/bubbleall/utils/ImagePicker$Worker;,
        Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;
    }
.end annotation


# static fields
.field private static final COLOR_BADGE:I = -0xc27403

.field private static final COLOR_BAR:I = -0xe4dfd9

.field private static final COLOR_BUTTON:I = -0xd4cbc0

.field private static final COLOR_CARD:I = -0xefebe8

.field private static final COLOR_EMPTY:I = -0xdcd5cd

.field private static final COLOR_PRIMARY:I = -0x191510

.field private static final COLOR_SCRIM:I = -0x34000000

.field private static final COLOR_SECONDARY:I = -0x65594c

.field private static final COLUMNS:I = 0x3

.field private static final MAX_IMAGES:I = 0xc8

.field private static final STATE_EMPTY:I = 0x0

.field private static final STATE_FAILED:I = 0x3

.field private static final STATE_LOADED:I = 0x2

.field private static final STATE_LOADING:I = 0x1

.field private static final TAG:Ljava/lang/String; = "BubbleUpload"

.field private static final TEXT_ATTACH:Ljava/lang/String; = "Attach"

.field private static final TEXT_CANCEL:Ljava/lang/String; = "Cancel"

.field private static final TEXT_SELECTED:Ljava/lang/String; = " selected"

.field private static final TEXT_TITLE:Ljava/lang/String; = "Pick images"

.field private static current:Lcom/alexmanzana/bubbleall/utils/ImagePicker;


# instance fields
.field private final attach:Landroid/widget/TextView;

.field private final cellPx:I

.field private final cells:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;",
            ">;"
        }
    .end annotation
.end field

.field private closed:Z

.field private final context:Landroid/content/Context;

.field private delivered:Z

.field private final gapPx:I

.field private final lock:Ljava/lang/Object;

.field private final main:Landroid/os/Handler;

.field private final multiple:Z

.field private final order:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final orientations:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final root:Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;

.field private final scroll:Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;

.field private final selectedLabel:Landroid/widget/TextView;

.field private final sink:Lcom/alexmanzana/bubbleall/utils/ImagePicker$Sink;

.field private final states:[I

.field private final thumbs:[Landroid/graphics/Bitmap;

.field private final uris:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private final wanted:[Z

.field private final windowManager:Landroid/view/WindowManager;

.field private workerStarted:Z


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcom/alexmanzana/bubbleall/utils/ImagePicker$Sink;Ljava/util/ArrayList;Ljava/util/ArrayList;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/alexmanzana/bubbleall/utils/ImagePicker$Sink;",
            "Ljava/util/ArrayList<",
            "Landroid/net/Uri;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->main:Landroid/os/Handler;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->lock:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->order:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cells:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->sink:Lcom/alexmanzana/bubbleall/utils/ImagePicker$Sink;

    iput-object p3, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->uris:Ljava/util/ArrayList;

    iput-object p4, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->orientations:Ljava/util/ArrayList;

    iput-boolean p5, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->multiple:Z

    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/WindowManager;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->windowManager:Landroid/view/WindowManager;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [Landroid/graphics/Bitmap;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->thumbs:[Landroid/graphics/Bitmap;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [I

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->states:[I

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [Z

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->wanted:[Z

    const/16 p2, 0xa

    invoke-direct {p0, p2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->dp(I)I

    move-result p2

    const/16 p3, 0x8

    invoke-direct {p0, p3}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->dp(I)I

    move-result p3

    const/4 p4, 0x4

    invoke-direct {p0, p4}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->dp(I)I

    move-result p4

    iput p4, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->gapPx:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    invoke-virtual {p4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p4

    iget p4, p4, Landroid/util/DisplayMetrics;->widthPixels:I

    add-int p5, p2, p3

    mul-int/lit8 p5, p5, 0x2

    sub-int/2addr p4, p5

    const/16 p5, 0x28

    invoke-direct {p0, p5}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->dp(I)I

    move-result p5

    iget v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->gapPx:I

    mul-int/lit8 v0, v0, 0x2

    sub-int/2addr p4, v0

    div-int/lit8 p4, p4, 0x3

    invoke-static {p5, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    iput p4, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cellPx:I

    const/high16 p4, 0x41500000    # 13.0f

    const p5, -0x65594c

    const-string v0, ""

    invoke-direct {p0, v0, p4, p5}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->label(Ljava/lang/String;FI)Landroid/widget/TextView;

    move-result-object p4

    iput-object p4, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->selectedLabel:Landroid/widget/TextView;

    new-instance p4, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;

    const/4 p5, 0x1

    invoke-direct {p4, p0, p5}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;-><init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;Z)V

    const-string v0, "Attach"

    invoke-direct {p0, v0, p4}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->button(Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/widget/TextView;

    move-result-object p4

    iput-object p4, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->attach:Landroid/widget/TextView;

    new-instance p4, Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;

    invoke-direct {p4, p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;-><init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;Landroid/content/Context;)V

    iput-object p4, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->scroll:Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;

    new-instance p4, Landroid/widget/LinearLayout;

    invoke-direct {p4, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {p4, p5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {p4, p3, p3, p3, p3}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    const p3, -0xefebe8

    const/16 p5, 0xe

    invoke-direct {p0, p3, p5}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->shape(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object p3

    invoke-virtual {p4, p3}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->header()Landroid/view/View;

    move-result-object p3

    new-instance p5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {p5, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p4, p3, p5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->buildGrid()Landroid/view/View;

    move-result-object p3

    new-instance p5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {p5, v0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {p4, p3, p5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->footer()Landroid/view/View;

    move-result-object p3

    new-instance p5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p5, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p4, p3, p5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p3, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;

    invoke-direct {p3, p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;-><init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;Landroid/content/Context;)V

    iput-object p3, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->root:Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;

    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 p3, 0x11

    invoke-direct {p1, v0, v0, p3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p1, p2, p2, p2, p2}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    iget-object p2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->root:Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;

    invoke-virtual {p2, p4, p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->refreshSelection()V

    return-void
.end method

.method static synthetic access$100(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Z
    .locals 0

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->onScrolled()Z

    move-result p0

    return p0
.end method

.method static synthetic access$1000(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)[Landroid/graphics/Bitmap;
    .locals 0

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->thumbs:[Landroid/graphics/Bitmap;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cells:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;
    .locals 0

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->scroll:Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;

    return-object p0
.end method

.method static synthetic access$1300(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)V
    .locals 0

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->startWorker()V

    return-void
.end method

.method static synthetic access$1400(Lcom/alexmanzana/bubbleall/utils/ImagePicker;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->finish(Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$1500(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$1600(Lcom/alexmanzana/bubbleall/utils/ImagePicker;I)I
    .locals 0

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->dp(I)I

    move-result p0

    return p0
.end method

.method static synthetic access$1700(Lcom/alexmanzana/bubbleall/utils/ImagePicker;Ljava/lang/String;FI)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->label(Ljava/lang/String;FI)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1800(Lcom/alexmanzana/bubbleall/utils/ImagePicker;II)Landroid/graphics/drawable/GradientDrawable;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->shape(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1900(Lcom/alexmanzana/bubbleall/utils/ImagePicker;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->toggle(I)V

    return-void
.end method

.method static synthetic access$2000(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)V
    .locals 0

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->confirm()V

    return-void
.end method

.method static synthetic access$300(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->lock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$400(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->closed:Z

    return p0
.end method

.method static synthetic access$500(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)I
    .locals 0

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->nextWanted()I

    move-result p0

    return p0
.end method

.method static synthetic access$600(Lcom/alexmanzana/bubbleall/utils/ImagePicker;I)Landroid/graphics/Bitmap;
    .locals 0

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->readThumbnail(I)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$700(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->main:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$800(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)[I
    .locals 0

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->states:[I

    return-object p0
.end method

.method static synthetic access$900(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)[Z
    .locals 0

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->wanted:[Z

    return-object p0
.end method

.method private attach()V
    .locals 7

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->windowManager:Landroid/view/WindowManager;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-static {}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->overlayType()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, -0x3

    const/4 v2, -0x1

    const/4 v3, -0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    const v1, 0x800033

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->windowManager:Landroid/view/WindowManager;

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->root:Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;

    invoke-interface {v1, v2, v0}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->scroll:Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/alexmanzana/bubbleall/utils/ImagePicker$FirstLayout;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$FirstLayout;-><init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;Lcom/alexmanzana/bubbleall/utils/ImagePicker$1;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->main:Landroid/os/Handler;

    new-instance v1, Lcom/alexmanzana/bubbleall/utils/ImagePicker$1;

    invoke-direct {v1, p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$1;-><init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->root:Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;->requestFocus()Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no WindowManager"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private buildGrid()Landroid/view/View;
    .locals 10

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/4 v2, 0x4

    invoke-direct {p0, v2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->dp(I)I

    move-result v3

    const/16 v4, 0xa

    invoke-direct {p0, v4}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->dp(I)I

    move-result v4

    invoke-direct {p0, v2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->dp(I)I

    move-result v2

    invoke-virtual {v0, v3, v4, v3, v2}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->scroll:Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;->setFocusable(Z)V

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->scroll:Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;

    invoke-virtual {v2, v3}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;->setFocusableInTouchMode(Z)V

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->scroll:Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;

    invoke-virtual {v2, v3}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;->setVerticalScrollBarEnabled(Z)V

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->scroll:Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v5, -0x1

    const/4 v6, -0x2

    invoke-direct {v4, v5, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v0, v4}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->uris:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x3

    add-int/2addr v2, v4

    sub-int/2addr v2, v1

    div-int/2addr v2, v4

    move v1, v3

    :goto_0
    if-ge v1, v2, :cond_2

    new-instance v5, Landroid/widget/LinearLayout;

    iget-object v7, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->context:Landroid/content/Context;

    invoke-direct {v5, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    move v7, v3

    :goto_1
    if-ge v7, v4, :cond_1

    mul-int/lit8 v8, v1, 0x3

    add-int/2addr v8, v7

    iget-object v9, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->uris:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-lt v8, v9, :cond_0

    new-instance v8, Landroid/view/View;

    iget-object v9, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->context:Landroid/content/Context;

    invoke-direct {v8, v9}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cellParams()Landroid/widget/LinearLayout$LayoutParams;

    move-result-object v9

    invoke-virtual {v5, v8, v9}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_2

    :cond_0
    new-instance v9, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;

    invoke-direct {v9, p0, v8}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;-><init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;I)V

    iget-object v8, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cells:Ljava/util/ArrayList;

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cellParams()Landroid/widget/LinearLayout$LayoutParams;

    move-result-object v8

    invoke-virtual {v5, v9, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v5, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->scroll:Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;

    return-object v0
.end method

.method private button(Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/widget/TextView;
    .locals 2

    const/high16 v0, 0x41600000    # 14.0f

    const/4 v1, -0x1

    invoke-direct {p0, p1, v0, v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->label(Ljava/lang/String;FI)Landroid/widget/TextView;

    move-result-object p1

    const/16 v0, 0x11

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    const/16 v0, 0xe

    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->dp(I)I

    move-result v0

    const/16 v1, 0x9

    invoke-direct {p0, v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->dp(I)I

    move-result v1

    invoke-virtual {p1, v0, v1, v0, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    const v0, -0xd4cbc0

    const/16 v1, 0xa

    invoke-direct {p0, v0, v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->shape(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

.method private cellParams()Landroid/widget/LinearLayout$LayoutParams;
    .locals 3

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    iget v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cellPx:I

    iget v2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cellPx:I

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->gapPx:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMarginEnd(I)V

    iget v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->gapPx:I

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    return-object v0
.end method

.method private static close(Ljava/io/Closeable;)V
    .locals 0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    :cond_0
    :goto_0
    return-void
.end method

.method private confirm()V
    .locals 6

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->order:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->finish(Ljava/util/List;)V

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->order:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->order:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->order:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    new-instance v3, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Pick;

    iget-object v4, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->uris:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/net/Uri;

    iget-object v5, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->orientations:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v3, v4, v2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Pick;-><init>(Landroid/net/Uri;I)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->finish(Ljava/util/List;)V

    return-void
.end method

.method private detach()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->windowManager:Landroid/view/WindowManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->windowManager:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->root:Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_0
    return-void
.end method

.method public static dismissCurrent()V
    .locals 2

    sget-object v0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->current:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->finish(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method private dp(I)I
    .locals 1

    int-to-float p1, p1

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1
.end method

.method private finish(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/alexmanzana/bubbleall/utils/ImagePicker$Pick;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->delivered:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->delivered:Z

    sget-object v0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->current:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    if-ne v0, p0, :cond_1

    const/4 v0, 0x0

    sput-object v0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->current:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    :cond_1
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->release()V

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->detach()V

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "picker: picked "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " image(s)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    :goto_0
    const-string v0, "picker: cancelled"

    :goto_1
    const-string v1, "BubbleUpload"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->sink:Lcom/alexmanzana/bubbleall/utils/ImagePicker$Sink;

    invoke-interface {v0, p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Sink;->onPicked(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "the picker sink refused the selection: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    return-void
.end method

.method private footer()Landroid/view/View;
    .locals 7

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v2, 0x10

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/4 v2, 0x6

    invoke-direct {p0, v2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->dp(I)I

    move-result v3

    invoke-virtual {v0, v3, v3, v3, v3}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    const v3, -0xe4dfd9

    const/16 v4, 0xa

    invoke-direct {p0, v3, v4}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->shape(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->hintText()Ljava/lang/String;

    move-result-object v3

    const/high16 v4, 0x41400000    # 12.0f

    const v5, -0x65594c

    invoke-direct {p0, v3, v4, v5}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->label(Ljava/lang/String;FI)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setMaxLines(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, -0x2

    invoke-direct {v4, v1, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-direct {p0, v2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->dp(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout$LayoutParams;->setMarginEnd(I)V

    invoke-virtual {v0, v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;

    invoke-direct {v3, p0, v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;-><init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;Z)V

    const-string v1, "Cancel"

    invoke-direct {p0, v1, v3}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->button(Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-direct {p0, v2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->dp(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->attach:Landroid/widget/TextView;

    invoke-virtual {v0, v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method private header()Landroid/view/View;
    .locals 6

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v2, 0x10

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/high16 v2, 0x41800000    # 16.0f

    const v3, -0x191510

    const-string v4, "Pick images"

    invoke-direct {p0, v4, v2, v3}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->label(Ljava/lang/String;FI)Landroid/widget/TextView;

    move-result-object v2

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, -0x2

    invoke-direct {v3, v1, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->selectedLabel:Landroid/widget/TextView;

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method private hintText()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Newest "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->uris:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " in the gallery - tap to select"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->multiple:Z

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->context:Landroid/content/Context;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/views/AttachCropOption;->enabled(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, " one - it is cropped before it is attached"

    goto :goto_0

    :cond_0
    const-string v1, " one image"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->context:Landroid/content/Context;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/views/AttachCropOption;->enabled(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " - each is cropped, then all are attached"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " - all of them are attached at once"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private label(Ljava/lang/String;FI)Landroid/widget/TextView;
    .locals 2

    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setSingleLine(Z)V

    return-object v0
.end method

.method private nextWanted()I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->wanted:[Z

    array-length v1, v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->wanted:[Z

    aget-boolean v1, v1, v0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->states:[I

    aget v1, v1, v0

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->states:[I

    const/4 v2, 0x1

    aput v2, v1, v0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method private onScrolled()Z
    .locals 8

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->scroll:Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;->getHeight()I

    move-result v0

    iget-boolean v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->closed:Z

    const/4 v2, 0x0

    if-nez v1, :cond_4

    iget v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cellPx:I

    if-lez v1, :cond_4

    if-lez v0, :cond_4

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->uris:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    iget v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cellPx:I

    iget v3, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->gapPx:I

    add-int/2addr v1, v3

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->uris:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, 0x3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    div-int/lit8 v3, v3, 0x3

    iget-object v5, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->scroll:Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;

    invoke-virtual {v5}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;->getScrollY()I

    move-result v5

    div-int v6, v5, v1

    sub-int/2addr v6, v4

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    sub-int/2addr v3, v4

    add-int/2addr v5, v0

    div-int/2addr v5, v1

    add-int/2addr v5, v4

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->lock:Ljava/lang/Object;

    monitor-enter v1

    move v3, v2

    :goto_0
    :try_start_0
    iget-object v5, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->wanted:[Z

    array-length v5, v5

    if-ge v3, v5, :cond_3

    div-int/lit8 v5, v3, 0x3

    if-lt v5, v6, :cond_1

    if-gt v5, v0, :cond_1

    move v5, v4

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    iget-object v7, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->wanted:[Z

    aput-boolean v5, v7, v3

    if-nez v5, :cond_2

    iget-object v5, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->states:[I

    aget v5, v5, v3

    const/4 v7, 0x2

    if-ne v5, v7, :cond_2

    invoke-direct {p0, v3}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->recycle(I)V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->lock:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v1

    return v4

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_4
    :goto_2
    return v2
.end method

.method private static overlayType()I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const/16 v0, 0x7f6

    goto :goto_0

    :cond_0
    const/16 v0, 0x7d2

    :goto_0
    return v0
.end method

.method private static readGallery(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Landroid/net/Uri;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "orientation"

    const-string v1, "_id"

    const/4 v2, 0x0

    :try_start_0
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v5

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v3, v4, :cond_0

    const-string v3, "is_pending = 0"

    move-object v6, v3

    goto :goto_0

    :cond_0
    move-object v6, v2

    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    sget-object v4, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v8, "_id DESC"

    const/4 v7, 0x0

    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    invoke-static {v2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->close(Ljava/io/Closeable;)V

    return-void

    :cond_1
    :try_start_1
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/16 v3, 0xc8

    if-ge v1, v3, :cond_3

    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v2, p0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    nop

    if-ltz v0, :cond_2

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    sget-object v5, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-static {v5, v3, v4}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    :try_start_2
    const-string p1, "BubbleUpload"

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "gallery query failed: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_3
    invoke-static {v2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->close(Ljava/io/Closeable;)V

    nop

    return-void

    :catchall_1
    move-exception p0

    invoke-static {v2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->close(Ljava/io/Closeable;)V

    throw p0
.end method

.method private readThumbnail(I)Landroid/graphics/Bitmap;
    .locals 8

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->uris:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const-string v2, ": "

    const-string v3, "BubbleUpload"

    const/4 v4, 0x0

    if-lt v0, v1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    new-instance v1, Landroid/util/Size;

    iget v5, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cellPx:I

    iget v6, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cellPx:I

    invoke-direct {v1, v5, v6}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {v0, p1, v1, v4}, Landroid/content/ContentResolver;->loadThumbnail(Landroid/net/Uri;Landroid/util/Size;Landroid/os/CancellationSignal;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "platform thumbnail failed for "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    nop

    :try_start_1
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    iget-object v5, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->context:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    invoke-virtual {v5, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-static {v5, v4, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    invoke-static {v5}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->close(Ljava/io/Closeable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    nop

    nop

    :try_start_3
    iget v5, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_0
    if-lez v0, :cond_1

    mul-int/lit8 v5, v1, 0x2

    div-int v6, v0, v5

    iget v7, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cellPx:I

    if-lt v6, v7, :cond_1

    move v1, v5

    goto :goto_0

    :cond_1
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-static {v5, v4, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v5}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->close(Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    nop

    nop

    invoke-static {v4}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->close(Ljava/io/Closeable;)V

    return-object v0

    :catchall_1
    move-exception v0

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v5, v4

    :goto_1
    :try_start_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "thumbnail decode failed for "

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    nop

    invoke-static {v5}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->close(Ljava/io/Closeable;)V

    return-object v4

    :catchall_3
    move-exception p1

    invoke-static {v5}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->close(Ljava/io/Closeable;)V

    throw p1
.end method

.method private recycle(I)V
    .locals 4

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->thumbs:[Landroid/graphics/Bitmap;

    aget-object v0, v0, p1

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->thumbs:[Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    aput-object v2, v1, p1

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->states:[I

    const/4 v3, 0x0

    aput v3, v1, p1

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cells:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cells:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;

    iget-object p1, p1, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->image:Landroid/widget/ImageView;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    return-void
.end method

.method private refreshSelection()V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cells:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->cells:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->order:Ljava/util/ArrayList;

    iget v3, v1, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->index:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->showSelected(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->order:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->selectedLabel:Landroid/widget/TextView;

    if-nez v0, :cond_1

    const-string v2, "nothing selected"

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " selected"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->attach:Landroid/widget/TextView;

    if-nez v0, :cond_2

    const-string v2, "Attach"

    goto :goto_2

    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Attach ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_2
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->attach:Landroid/widget/TextView;

    if-nez v0, :cond_3

    const v0, 0x3ee66666    # 0.45f

    goto :goto_3

    :cond_3
    const/high16 v0, 0x3f800000    # 1.0f

    :goto_3
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setAlpha(F)V

    return-void
.end method

.method private release()V
    .locals 2

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->lock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->closed:Z

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->lock:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->states:[I

    array-length v1, v1

    if-ge v0, v1, :cond_0

    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->recycle(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private shape(II)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-direct {p0, p2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->dp(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    return-object v0
.end method

.method public static show(Landroid/content/Context;Lcom/alexmanzana/bubbleall/utils/ImagePicker$Sink;Z)Z
    .locals 9

    const-string v0, "BubbleUpload"

    const/4 v1, 0x0

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->dismissCurrent()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0, v5, v6}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->readGallery(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string p0, "picker: the gallery has no images to offer"

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "picker: opened on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " image(s), multiple="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v8, Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    move-object v2, v8

    move-object v3, p0

    move-object v4, p1

    move v7, p2

    invoke-direct/range {v2 .. v7}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;-><init>(Landroid/content/Context;Lcom/alexmanzana/bubbleall/utils/ImagePicker$Sink;Ljava/util/ArrayList;Ljava/util/ArrayList;Z)V

    invoke-direct {v8}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->attach()V

    sput-object v8, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->current:Lcom/alexmanzana/bubbleall/utils/ImagePicker;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    move-exception p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "picker could not be opened: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_2
    :goto_0
    return v1
.end method

.method private startWorker()V
    .locals 4

    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->workerStarted:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->workerStarted:Z

    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Worker;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Worker;-><init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;Lcom/alexmanzana/bubbleall/utils/ImagePicker$1;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method private toggle(I)V
    .locals 2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->order:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    iget-boolean v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->multiple:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->order:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->order:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->refreshSelection()V

    return-void

    :cond_1
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->order:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->order:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->refreshSelection()V

    return-void
.end method
