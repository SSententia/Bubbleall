.class public interface abstract Lcom/alexmanzana/bubbleall/ConstantsBubble$Music;
.super Ljava/lang/Object;
.source "ConstantsBubble.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/ConstantsBubble;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Music"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/ConstantsBubble$Music$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008f\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/ConstantsBubble$Music;",
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
.field public static final BACK:Ljava/lang/String; = "com.alexmanzana.bubbleall.Music.BACK"

.field public static final CHANNEL_MUSIC:Ljava/lang/String; = "music_channel"

.field public static final CLOSE:Ljava/lang/String; = "com.alexmanzana.bubbleall.Music.CLOSE"

.field public static final Companion:Lcom/alexmanzana/bubbleall/ConstantsBubble$Music$Companion;

.field public static final ID_NOTIFICATION_MUSIC:I = 0xffc

.field public static final NEXT:Ljava/lang/String; = "com.alexmanzana.bubbleall.Music.NEXT"

.field public static final PLAY_AND_PAUSE:Ljava/lang/String; = "com.alexmanzana.bubbleall.Music.PLAY_AND_PAUSE"

.field public static final REFRESH:Ljava/lang/String; = "com.alexmanzana.bubbleall.Music.REFRESH"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/alexmanzana/bubbleall/ConstantsBubble$Music$Companion;->$$INSTANCE:Lcom/alexmanzana/bubbleall/ConstantsBubble$Music$Companion;

    sput-object v0, Lcom/alexmanzana/bubbleall/ConstantsBubble$Music;->Companion:Lcom/alexmanzana/bubbleall/ConstantsBubble$Music$Companion;

    return-void
.end method
