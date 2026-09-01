.class public final Lcom/alexmanzana/bubbleall/Settings$Video;
.super Landroidx/preference/PreferenceFragmentCompat;
.source "Settings.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/Settings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Video"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\ncom/alexmanzana/bubbleall/Settings$Video\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/Settings$Video;",
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
.method public static synthetic $r8$lambda$HLNmOTgN40rxIH8Iunegd5tIiUE(Lcom/alexmanzana/bubbleall/Settings$Video;Landroidx/preference/Preference;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/Settings$Video;->onCreatePreferences$lambda$2(Lcom/alexmanzana/bubbleall/Settings$Video;Landroidx/preference/Preference;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$i6a2UZ0K4XqLJ7zWH6bV4aG2iKM(Lcom/alexmanzana/bubbleall/Settings$Video;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/Settings$Video;->onCreatePreferences$lambda$2$lambda$1(Lcom/alexmanzana/bubbleall/Settings$Video;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 93
    invoke-direct {p0}, Landroidx/preference/PreferenceFragmentCompat;-><init>()V

    return-void
.end method

.method private static final onCreatePreferences$lambda$2(Lcom/alexmanzana/bubbleall/Settings$Video;Landroidx/preference/Preference;)Z
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    new-instance v0, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    invoke-virtual {p1}, Landroidx/preference/Preference;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;-><init>(Landroid/content/Context;)V

    .line 99
    sget p1, Lcom/alexmanzana/bubbleall/R$string;->text_question_delete_all_favorites:I

    invoke-virtual {v0, p1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setTitle(I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 100
    sget p1, Lcom/alexmanzana/bubbleall/R$string;->text_delete_all_favorites_message:I

    invoke-virtual {v0, p1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setMessage(I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 101
    sget p1, Lcom/alexmanzana/bubbleall/R$string;->text_accept:I

    new-instance v1, Lcom/alexmanzana/bubbleall/Settings$Video$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/alexmanzana/bubbleall/Settings$Video$$ExternalSyntheticLambda1;-><init>(Lcom/alexmanzana/bubbleall/Settings$Video;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 104
    sget p0, Lcom/alexmanzana/bubbleall/R$string;->text_cancel:I

    const/4 p1, 0x0

    invoke-virtual {v0, p0, p1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 105
    invoke-virtual {v0}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->show()Landroidx/appcompat/app/AlertDialog;

    const/4 p0, 0x1

    return p0
.end method

.method private static final onCreatePreferences$lambda$2$lambda$1(Lcom/alexmanzana/bubbleall/Settings$Video;Landroid/content/DialogInterface;I)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/Settings$Video;->getContext()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object p1, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    invoke-virtual {p1, p0}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->deleteFavorites(Landroid/content/Context;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onCreatePreferences(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    .line 95
    sget p1, Lcom/alexmanzana/bubbleall/R$xml;->settings_video:I

    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/Settings$Video;->setPreferencesFromResource(ILjava/lang/String;)V

    .line 96
    const-string p1, "key_video_delete_all_favorites"

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/Settings$Video;->findPreference(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 97
    new-instance p2, Lcom/alexmanzana/bubbleall/Settings$Video$$ExternalSyntheticLambda0;

    invoke-direct {p2, p0}, Lcom/alexmanzana/bubbleall/Settings$Video$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/Settings$Video;)V

    invoke-virtual {p1, p2}, Landroidx/preference/Preference;->setOnPreferenceClickListener(Landroidx/preference/Preference$OnPreferenceClickListener;)V

    :cond_0
    return-void
.end method
