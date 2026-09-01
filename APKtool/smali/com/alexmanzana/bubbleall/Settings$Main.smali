.class public final Lcom/alexmanzana/bubbleall/Settings$Main;
.super Landroidx/preference/PreferenceFragmentCompat;
.source "Settings.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/Settings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Main"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0016J\u0008\u0010\t\u001a\u00020\u0004H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/Settings$Main;",
        "Landroidx/preference/PreferenceFragmentCompat;",
        "()V",
        "onCreatePreferences",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "rootKey",
        "",
        "onResume",
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
.method public static synthetic $r8$lambda$00T-Kwvs88BUn4d8DsFEOLtJMt8(Landroidx/preference/Preference;Lcom/alexmanzana/bubbleall/Settings$Main;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/Settings$Main;->onCreatePreferences$lambda$3$lambda$2(Landroidx/preference/Preference;Lcom/alexmanzana/bubbleall/Settings$Main;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$8bFqL2UQjTER-LVj-ok46jP3euY(Lcom/alexmanzana/bubbleall/Settings$Main;Landroidx/preference/Preference;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/Settings$Main;->onCreatePreferences$lambda$1(Lcom/alexmanzana/bubbleall/Settings$Main;Landroidx/preference/Preference;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$id6u7po_ER18A9oSYQno_0LU84M(Lcom/alexmanzana/bubbleall/Settings$Main;Landroidx/preference/Preference;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/Settings$Main;->onCreatePreferences$lambda$0(Lcom/alexmanzana/bubbleall/Settings$Main;Landroidx/preference/Preference;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$mao8beyJgzdkicyOwAA_pKFs8us(Lcom/alexmanzana/bubbleall/Settings$Main;Landroidx/preference/Preference;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/Settings$Main;->onCreatePreferences$lambda$3(Lcom/alexmanzana/bubbleall/Settings$Main;Landroidx/preference/Preference;)Z

    move-result p0

    return p0
.end method

.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Landroidx/preference/PreferenceFragmentCompat;-><init>()V

    return-void
.end method

.method private static final onCreatePreferences$lambda$0(Lcom/alexmanzana/bubbleall/Settings$Main;Landroidx/preference/Preference;)Z
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/Settings$Main;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/alexmanzana/bubbleall/AdsActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/Settings$Main;->startActivity(Landroid/content/Intent;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final onCreatePreferences$lambda$1(Lcom/alexmanzana/bubbleall/Settings$Main;Landroidx/preference/Preference;Ljava/lang/Object;)Z
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    const-string p1, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    .line 29
    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/Settings$Main;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/alexmanzana/bubbleall/MenuActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 30
    const-string v0, "select_menu"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 31
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/Settings$Main;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return p2
.end method

.method private static final onCreatePreferences$lambda$3(Lcom/alexmanzana/bubbleall/Settings$Main;Landroidx/preference/Preference;)Z
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Landroidx/preference/Preference;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p1}, Landroidx/preference/Preference;->getContext()Landroid/content/Context;

    move-result-object p1

    const-class v1, Lcom/alexmanzana/bubbleall/BubblePositionActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/Settings$Main;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 39
    :cond_0
    new-instance v0, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    invoke-virtual {p1}, Landroidx/preference/Preference;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;-><init>(Landroid/content/Context;)V

    .line 40
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_draw_overlays:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setTitle(I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 41
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_draw_overlays_message_position:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setMessage(I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 42
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_continue:I

    new-instance v2, Lcom/alexmanzana/bubbleall/Settings$Main$$ExternalSyntheticLambda0;

    invoke-direct {v2, p1, p0}, Lcom/alexmanzana/bubbleall/Settings$Main$$ExternalSyntheticLambda0;-><init>(Landroidx/preference/Preference;Lcom/alexmanzana/bubbleall/Settings$Main;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 47
    sget p0, Lcom/alexmanzana/bubbleall/R$string;->text_cancel:I

    const/4 p1, 0x0

    invoke-virtual {v0, p0, p1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 48
    invoke-virtual {v0}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->show()Landroidx/appcompat/app/AlertDialog;

    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final onCreatePreferences$lambda$3$lambda$2(Landroidx/preference/Preference;Lcom/alexmanzana/bubbleall/Settings$Main;Landroid/content/DialogInterface;I)V
    .locals 1

    const-string p2, "$it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    new-instance p2, Landroid/content/Intent;

    const-string p3, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    invoke-direct {p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 44
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "package:"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/preference/Preference;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p2, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 45
    invoke-virtual {p1, p2}, Lcom/alexmanzana/bubbleall/Settings$Main;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public onCreatePreferences(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 2

    .line 19
    sget p1, Lcom/alexmanzana/bubbleall/R$xml;->settings_main:I

    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/Settings$Main;->setPreferencesFromResource(ILjava/lang/String;)V

    .line 20
    const-string p1, "key_main_only_menu"

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/Settings$Main;->findPreference(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    move-result-object p1

    check-cast p1, Landroidx/preference/SwitchPreference;

    .line 21
    const-string p2, "key_start_position"

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p0, p2}, Lcom/alexmanzana/bubbleall/Settings$Main;->findPreference(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    move-result-object p2

    .line 22
    const-string v0, "key_block_ad_app"

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/Settings$Main;->findPreference(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 23
    new-instance v1, Lcom/alexmanzana/bubbleall/Settings$Main$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/alexmanzana/bubbleall/Settings$Main$$ExternalSyntheticLambda1;-><init>(Lcom/alexmanzana/bubbleall/Settings$Main;)V

    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->setOnPreferenceClickListener(Landroidx/preference/Preference$OnPreferenceClickListener;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 27
    new-instance v0, Lcom/alexmanzana/bubbleall/Settings$Main$$ExternalSyntheticLambda2;

    invoke-direct {v0, p0}, Lcom/alexmanzana/bubbleall/Settings$Main$$ExternalSyntheticLambda2;-><init>(Lcom/alexmanzana/bubbleall/Settings$Main;)V

    invoke-virtual {p1, v0}, Landroidx/preference/SwitchPreference;->setOnPreferenceChangeListener(Landroidx/preference/Preference$OnPreferenceChangeListener;)V

    :cond_1
    if-eqz p2, :cond_2

    .line 35
    new-instance p1, Lcom/alexmanzana/bubbleall/Settings$Main$$ExternalSyntheticLambda3;

    invoke-direct {p1, p0}, Lcom/alexmanzana/bubbleall/Settings$Main$$ExternalSyntheticLambda3;-><init>(Lcom/alexmanzana/bubbleall/Settings$Main;)V

    invoke-virtual {p2, p1}, Landroidx/preference/Preference;->setOnPreferenceClickListener(Landroidx/preference/Preference$OnPreferenceClickListener;)V

    :cond_2
    return-void
.end method

.method public onResume()V
    .locals 6

    .line 55
    invoke-super {p0}, Landroidx/preference/PreferenceFragmentCompat;->onResume()V

    .line 56
    const-string v0, "key_main_only_menu"

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/Settings$Main;->findPreference(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    move-result-object v0

    check-cast v0, Landroidx/preference/SwitchPreference;

    .line 57
    const-string v1, "key_start_position"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/Settings$Main;->findPreference(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    move-result-object v1

    .line 58
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/Settings$Main;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const-string v4, "bubble_data_prefs"

    invoke-virtual {v2, v4, v3}, Landroidx/fragment/app/FragmentActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 59
    const-string v4, "menu_option"

    const/4 v5, -0x1

    invoke-interface {v2, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-ne v2, v5, :cond_2

    if-nez v0, :cond_1

    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {v0, v3}, Landroidx/preference/SwitchPreference;->setChecked(Z)V

    :cond_2
    :goto_1
    if-nez v1, :cond_3

    goto :goto_2

    .line 62
    :cond_3
    sget-object v0, Lcom/alexmanzana/bubbleall/BubbleService;->Companion:Lcom/alexmanzana/bubbleall/BubbleService$Companion;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/BubbleService$Companion;->isStarting()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Landroidx/preference/Preference;->setEnabled(Z)V

    .line 63
    :goto_2
    sget-object v0, Lcom/alexmanzana/bubbleall/BubbleService;->Companion:Lcom/alexmanzana/bubbleall/BubbleService$Companion;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/BubbleService$Companion;->isStarting()Z

    move-result v0

    if-eqz v0, :cond_5

    if-nez v1, :cond_4

    goto :goto_3

    .line 64
    :cond_4
    sget v0, Lcom/alexmanzana/bubbleall/R$string;->text_close_position:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/Settings$Main;->getString(I)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Landroidx/preference/Preference;->setSummary(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_5
    if-nez v1, :cond_6

    goto :goto_3

    .line 66
    :cond_6
    sget v0, Lcom/alexmanzana/bubbleall/R$string;->text_bubble_position:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/Settings$Main;->getString(I)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Landroidx/preference/Preference;->setSummary(Ljava/lang/CharSequence;)V

    :goto_3
    return-void
.end method
