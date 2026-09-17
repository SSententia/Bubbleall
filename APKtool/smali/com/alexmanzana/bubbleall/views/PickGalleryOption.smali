.class public final Lcom/alexmanzana/bubbleall/views/PickGalleryOption;
.super Ljava/lang/Object;
.source "PickGalleryOption.java"


# static fields
.field private static final DEFAULT_PICK:Z = false

.field public static final KEY_PICK:Ljava/lang/String; = "pick_from_gallery"

.field private static final PREFS:Ljava/lang/String; = "bubble_data_prefs"

.field private static final TEXT_OFF:Ljava/lang/String; = "Off"

.field private static final TEXT_ON:Ljava/lang/String; = "On"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Landroid/content/Context;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/views/PickGalleryOption;->setEnabled(Landroid/content/Context;Z)V

    return-void
.end method

.method static synthetic access$100(Landroid/view/View;Landroid/view/View;ZII)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/alexmanzana/bubbleall/views/PickGalleryOption;->apply(Landroid/view/View;Landroid/view/View;ZII)V

    return-void
.end method

.method private static apply(Landroid/view/View;Landroid/view/View;ZII)V
    .locals 0

    if-eqz p2, :cond_0

    move p3, p4

    :cond_0
    :try_start_0
    invoke-virtual {p0, p3}, Landroid/view/View;->setBackgroundResource(I)V

    instance-of p0, p1, Landroid/widget/TextView;

    if-eqz p0, :cond_2

    check-cast p1, Landroid/widget/TextView;

    if-eqz p2, :cond_1

    const-string p0, "On"

    goto :goto_0

    :cond_1
    const-string p0, "Off"

    :goto_0
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    goto :goto_1

    :catchall_0
    move-exception p0

    :goto_1
    return-void
.end method

.method public static bind(Landroid/content/Context;Landroid/view/View;Landroid/view/View;II)V
    .locals 7

    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/PickGalleryOption;->enabled(Landroid/content/Context;)Z

    move-result v0

    invoke-static {p1, p2, v0, p3, p4}, Lcom/alexmanzana/bubbleall/views/PickGalleryOption;->apply(Landroid/view/View;Landroid/view/View;ZII)V

    new-instance v0, Lcom/alexmanzana/bubbleall/views/PickGalleryOption$1;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/alexmanzana/bubbleall/views/PickGalleryOption$1;-><init>(Landroid/content/Context;Landroid/view/View;Landroid/view/View;II)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public static enabled(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    :try_start_0
    const-string v1, "bubble_data_prefs"

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v1, "pick_from_gallery"

    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    move-exception p0

    return v0
.end method

.method private static setEnabled(Landroid/content/Context;Z)V
    .locals 2

    :try_start_0
    const-string v0, "bubble_data_prefs"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v0, "pick_from_gallery"

    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    :goto_0
    return-void
.end method
