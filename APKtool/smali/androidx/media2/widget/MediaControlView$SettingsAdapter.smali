.class Landroidx/media2/widget/MediaControlView$SettingsAdapter;
.super Landroid/widget/BaseAdapter;
.source "MediaControlView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/widget/MediaControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SettingsAdapter"
.end annotation


# instance fields
.field private mIconIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mMainTexts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mSubTexts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Landroidx/media2/widget/MediaControlView;


# direct methods
.method constructor <init>(Landroidx/media2/widget/MediaControlView;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1940
    iput-object p1, p0, Landroidx/media2/widget/MediaControlView$SettingsAdapter;->this$0:Landroidx/media2/widget/MediaControlView;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 1941
    iput-object p2, p0, Landroidx/media2/widget/MediaControlView$SettingsAdapter;->mMainTexts:Ljava/util/List;

    .line 1942
    iput-object p3, p0, Landroidx/media2/widget/MediaControlView$SettingsAdapter;->mSubTexts:Ljava/util/List;

    .line 1943
    iput-object p4, p0, Landroidx/media2/widget/MediaControlView$SettingsAdapter;->mIconIds:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 1948
    iget-object v0, p0, Landroidx/media2/widget/MediaControlView$SettingsAdapter;->mMainTexts:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 1965
    iget-object p2, p0, Landroidx/media2/widget/MediaControlView$SettingsAdapter;->this$0:Landroidx/media2/widget/MediaControlView;

    invoke-virtual {p2}, Landroidx/media2/widget/MediaControlView;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Landroidx/media2/widget/R$layout;->media2_widget_settings_list_item:I

    invoke-static {p2, p3}, Landroidx/media2/widget/MediaControlView;->inflateLayout(Landroid/content/Context;I)Landroid/view/View;

    move-result-object p2

    .line 1966
    sget p3, Landroidx/media2/widget/R$id;->main_text:I

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 1967
    sget v0, Landroidx/media2/widget/R$id;->sub_text:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1968
    sget v1, Landroidx/media2/widget/R$id;->icon:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 1971
    iget-object v2, p0, Landroidx/media2/widget/MediaControlView$SettingsAdapter;->mMainTexts:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1975
    iget-object p3, p0, Landroidx/media2/widget/MediaControlView$SettingsAdapter;->mSubTexts:Ljava/util/List;

    const/16 v2, 0x8

    if-eqz p3, :cond_1

    const-string v3, ""

    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {v3, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    .line 1979
    :cond_0
    iget-object p3, p0, Landroidx/media2/widget/MediaControlView$SettingsAdapter;->mSubTexts:Ljava/util/List;

    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/CharSequence;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 1976
    :cond_1
    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1984
    :goto_1
    iget-object p3, p0, Landroidx/media2/widget/MediaControlView$SettingsAdapter;->mIconIds:Ljava/util/List;

    if-eqz p3, :cond_3

    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    const/4 v0, -0x1

    if-ne p3, v0, :cond_2

    goto :goto_2

    .line 1988
    :cond_2
    iget-object p3, p0, Landroidx/media2/widget/MediaControlView$SettingsAdapter;->this$0:Landroidx/media2/widget/MediaControlView;

    .line 1989
    invoke-virtual {p3}, Landroidx/media2/widget/MediaControlView;->getContext()Landroid/content/Context;

    move-result-object p3

    iget-object v0, p0, Landroidx/media2/widget/MediaControlView$SettingsAdapter;->mIconIds:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p3, p1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 1988
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_3

    .line 1985
    :cond_3
    :goto_2
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_3
    return-object p2
.end method

.method public setSubTexts(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1995
    iput-object p1, p0, Landroidx/media2/widget/MediaControlView$SettingsAdapter;->mSubTexts:Ljava/util/List;

    return-void
.end method
