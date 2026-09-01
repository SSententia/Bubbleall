.class public interface abstract Lcom/alexmanzana/bubbleall/ConstantsBubble$Themes;
.super Ljava/lang/Object;
.source "ConstantsBubble.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/ConstantsBubble;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Themes"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/ConstantsBubble$Themes$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008f\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/ConstantsBubble$Themes;",
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
.field public static final Companion:Lcom/alexmanzana/bubbleall/ConstantsBubble$Themes$Companion;

.field public static final NAME_DB:Ljava/lang/String; = "db_themes"

.field public static final SIZE:Ljava/lang/String; = "theme_size"

.field public static final TABLE_DB:Ljava/lang/String; = "themes"

.field public static final THEME:Ljava/lang/String; = "theme_selected"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/alexmanzana/bubbleall/ConstantsBubble$Themes$Companion;->$$INSTANCE:Lcom/alexmanzana/bubbleall/ConstantsBubble$Themes$Companion;

    sput-object v0, Lcom/alexmanzana/bubbleall/ConstantsBubble$Themes;->Companion:Lcom/alexmanzana/bubbleall/ConstantsBubble$Themes$Companion;

    return-void
.end method
