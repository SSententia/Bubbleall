.class public interface abstract Lcom/alexmanzana/bubbleall/ConstantsBubble;
.super Ljava/lang/Object;
.source "ConstantsBubble.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/ConstantsBubble$Ads;,
        Lcom/alexmanzana/bubbleall/ConstantsBubble$Companion;,
        Lcom/alexmanzana/bubbleall/ConstantsBubble$Music;,
        Lcom/alexmanzana/bubbleall/ConstantsBubble$Shortcut;,
        Lcom/alexmanzana/bubbleall/ConstantsBubble$Themes;,
        Lcom/alexmanzana/bubbleall/ConstantsBubble$Video;,
        Lcom/alexmanzana/bubbleall/ConstantsBubble$Web;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0008\u0008f\u0018\u0000 \u00032\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/ConstantsBubble;",
        "",
        "Ads",
        "Companion",
        "Music",
        "Shortcut",
        "Themes",
        "Video",
        "Web",
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


# static fields
.field public static final ACTION_ARGS_BUBBLE:Ljava/lang/String; = "com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE"

.field public static final ACTION_MODIFY_BUBBLE:Ljava/lang/String; = "com.alexmanzana.bubbleall.ACTION_MODIFY_BUBBLE"

.field public static final ACTION_OPEN_MANAGER:Ljava/lang/String; = "com.alexmanzana.bubbleall.ACTION_OPEN_MANAGER"

.field public static final ACTION_START_ONLY_BUBBLE:Ljava/lang/String; = "com.alexmanzana.bubbleall.ACTION_START_ONLY_BUBBLE"

.field public static final Companion:Lcom/alexmanzana/bubbleall/ConstantsBubble$Companion;

.field public static final DATA:Ljava/lang/String; = "bubble_data_prefs"

.field public static final EXTRA_ITEM_DATA:Ljava/lang/String; = "com.alexmanzana.bubbleall.EXTRA_ITEM_DATA"

.field public static final EXTRA_ITEM_ONLY:Ljava/lang/String; = "com.alexmanzana.bubbleall.EXTRA_ITEM_ONLY"

.field public static final EXTRA_OPEN_MANAGER:Ljava/lang/String; = "com.alexmanzana.bubbleall.EXTRA_OPEN_MANAGER"

.field public static final ID_NOTIFICATION_SERVICE:I = 0x4

.field public static final NOTIFICATION_CHANNEL:Ljava/lang/String; = "channel_service"

.field public static final ONLY_MENU:Ljava/lang/String; = "select_menu"

.field public static final POSITION_MENU_OPTION:Ljava/lang/String; = "menu_option"

.field public static final POSITION_STATE:Ljava/lang/String; = "bubble_state"

.field public static final POSITION_X_BUBBLE:Ljava/lang/String; = "xBubble"

.field public static final POSITION_Y_BUBBLE:Ljava/lang/String; = "yBubble"

.field public static final SETTINGS:Ljava/lang/String; = "position_settings"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/alexmanzana/bubbleall/ConstantsBubble$Companion;->$$INSTANCE:Lcom/alexmanzana/bubbleall/ConstantsBubble$Companion;

    sput-object v0, Lcom/alexmanzana/bubbleall/ConstantsBubble;->Companion:Lcom/alexmanzana/bubbleall/ConstantsBubble$Companion;

    return-void
.end method
