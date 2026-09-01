.class public final Lcom/alexmanzana/bubbleall/Settings$Web;
.super Landroidx/preference/PreferenceFragmentCompat;
.source "Settings.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/Settings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Web"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/Settings$Web;",
        "Landroidx/preference/PreferenceFragmentCompat;",
        "()V",
        "onCreatePreferences",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "rootKey",
        "",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$TMTFd0uCOe8kG5BW-R5xlMSMLL8(Lcom/alexmanzana/bubbleall/Settings$Web;Landroidx/preference/Preference;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/Settings$Web;->onCreatePreferences$lambda$1(Lcom/alexmanzana/bubbleall/Settings$Web;Landroidx/preference/Preference;)Z

    move-result p0

    return p0
.end method

.method public constructor <init>()V
    .locals 0

    .line 70
    invoke-direct {p0}, Landroidx/preference/PreferenceFragmentCompat;-><init>()V

    return-void
.end method

.method private static final onCreatePreferences$lambda$1(Lcom/alexmanzana/bubbleall/Settings$Web;Landroidx/preference/Preference;)Z
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/Settings$Web;->getContext()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 76
    const-string p1, "bubble_data_prefs"

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 77
    new-instance v7, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;

    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_main_page:I

    sget v2, Lcom/alexmanzana/bubbleall/R$string;->text_url:I

    const-string v0, "page_web"

    const-string v3, ""

    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 80
    new-instance v0, Lcom/alexmanzana/bubbleall/Settings$Web$onCreatePreferences$1$1$dialog$1;

    invoke-direct {v0, p1}, Lcom/alexmanzana/bubbleall/Settings$Web$onCreatePreferences$1$1$dialog$1;-><init>(Landroid/content/SharedPreferences;)V

    move-object v6, v0

    check-cast v6, Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v7

    .line 77
    invoke-direct/range {v0 .. v6}, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;-><init>(IILjava/lang/String;ZZLcom/alexmanzana/bubbleall/listeners/ListenerSuccess;)V

    .line 87
    invoke-virtual {v7, p0}, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;->show(Landroid/content/Context;)V

    :cond_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public onCreatePreferences(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    .line 72
    sget p1, Lcom/alexmanzana/bubbleall/R$xml;->settings_web:I

    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/Settings$Web;->setPreferencesFromResource(ILjava/lang/String;)V

    .line 73
    const-string p1, "key_save_main_page"

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/Settings$Web;->findPreference(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 74
    new-instance p2, Lcom/alexmanzana/bubbleall/Settings$Web$$ExternalSyntheticLambda0;

    invoke-direct {p2, p0}, Lcom/alexmanzana/bubbleall/Settings$Web$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/Settings$Web;)V

    invoke-virtual {p1, p2}, Landroidx/preference/Preference;->setOnPreferenceClickListener(Landroidx/preference/Preference$OnPreferenceClickListener;)V

    :cond_0
    return-void
.end method
