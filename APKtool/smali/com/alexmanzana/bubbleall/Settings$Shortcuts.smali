.class public final Lcom/alexmanzana/bubbleall/Settings$Shortcuts;
.super Landroidx/preference/PreferenceFragmentCompat;
.source "Settings.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/Settings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Shortcuts"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/Settings$Shortcuts;",
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
.method public static synthetic $r8$lambda$zuROeOf8gNLJvht2pgYL_Jeh-n4(Lcom/alexmanzana/bubbleall/Settings$Shortcuts;Landroidx/preference/Preference;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/Settings$Shortcuts;->onCreatePreferences$lambda$0(Lcom/alexmanzana/bubbleall/Settings$Shortcuts;Landroidx/preference/Preference;)Z

    move-result p0

    return p0
.end method

.method public constructor <init>()V
    .locals 0

    .line 115
    invoke-direct {p0}, Landroidx/preference/PreferenceFragmentCompat;-><init>()V

    return-void
.end method

.method private static final onCreatePreferences$lambda$0(Lcom/alexmanzana/bubbleall/Settings$Shortcuts;Landroidx/preference/Preference;)Z
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/Settings$Shortcuts;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/alexmanzana/bubbleall/ShortcutActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/Settings$Shortcuts;->startActivity(Landroid/content/Intent;)V

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public onCreatePreferences(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    .line 117
    sget p1, Lcom/alexmanzana/bubbleall/R$xml;->settings_shortcuts:I

    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/Settings$Shortcuts;->setPreferencesFromResource(ILjava/lang/String;)V

    .line 118
    const-string p1, "key_open_shortcut_created"

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/Settings$Shortcuts;->findPreference(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 119
    new-instance p2, Lcom/alexmanzana/bubbleall/Settings$Shortcuts$$ExternalSyntheticLambda0;

    invoke-direct {p2, p0}, Lcom/alexmanzana/bubbleall/Settings$Shortcuts$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/Settings$Shortcuts;)V

    invoke-virtual {p1, p2}, Landroidx/preference/Preference;->setOnPreferenceClickListener(Landroidx/preference/Preference$OnPreferenceClickListener;)V

    :cond_0
    return-void
.end method
