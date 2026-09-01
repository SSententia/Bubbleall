.class public interface abstract Lcom/alexmanzana/bubbleall/ConstantsBubble$Shortcut;
.super Ljava/lang/Object;
.source "ConstantsBubble.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/ConstantsBubble;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Shortcut"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/ConstantsBubble$Shortcut$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008f\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/ConstantsBubble$Shortcut;",
        "",
        "Companion",
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
.field public static final CLOSE:Ljava/lang/String; = "com.alexmanzana.bubbleall.Shortcut.CLOSE"

.field public static final Companion:Lcom/alexmanzana/bubbleall/ConstantsBubble$Shortcut$Companion;

.field public static final FORWARD_10:Ljava/lang/String; = "com.alexmanzana.bubbleall.Shortcut.FORWARD_10"

.field public static final ID_NOTIFICATION_MUSIC:I = 0x4e

.field public static final NAME_DB:Ljava/lang/String; = "db_shortcuts"

.field public static final PLAY_AND_PAUSE:Ljava/lang/String; = "com.alexmanzana.bubbleall.Shortcut.PLAY_AND_PAUSE"

.field public static final REFRESH:Ljava/lang/String; = "com.alexmanzana.bubbleall.Shortcut.REFRESH"

.field public static final REPLAY_10:Ljava/lang/String; = "com.alexmanzana.bubbleall.Shortcut.REPLAY_10"

.field public static final TABLE_DB:Ljava/lang/String; = "shortcuts"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/alexmanzana/bubbleall/ConstantsBubble$Shortcut$Companion;->$$INSTANCE:Lcom/alexmanzana/bubbleall/ConstantsBubble$Shortcut$Companion;

    sput-object v0, Lcom/alexmanzana/bubbleall/ConstantsBubble$Shortcut;->Companion:Lcom/alexmanzana/bubbleall/ConstantsBubble$Shortcut$Companion;

    return-void
.end method
