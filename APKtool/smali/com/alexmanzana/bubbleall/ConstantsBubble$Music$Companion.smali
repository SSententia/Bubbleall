.class public final Lcom/alexmanzana/bubbleall/ConstantsBubble$Music$Companion;
.super Ljava/lang/Object;
.source "ConstantsBubble.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/ConstantsBubble$Music;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/ConstantsBubble$Music$Companion;",
        "",
        "()V",
        "BACK",
        "",
        "CHANNEL_MUSIC",
        "CLOSE",
        "ID_NOTIFICATION_MUSIC",
        "",
        "NEXT",
        "PLAY_AND_PAUSE",
        "REFRESH",
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
.field static final synthetic $$INSTANCE:Lcom/alexmanzana/bubbleall/ConstantsBubble$Music$Companion;

.field public static final BACK:Ljava/lang/String; = "com.alexmanzana.bubbleall.Music.BACK"

.field public static final CHANNEL_MUSIC:Ljava/lang/String; = "music_channel"

.field public static final CLOSE:Ljava/lang/String; = "com.alexmanzana.bubbleall.Music.CLOSE"

.field public static final ID_NOTIFICATION_MUSIC:I = 0xffc

.field public static final NEXT:Ljava/lang/String; = "com.alexmanzana.bubbleall.Music.NEXT"

.field public static final PLAY_AND_PAUSE:Ljava/lang/String; = "com.alexmanzana.bubbleall.Music.PLAY_AND_PAUSE"

.field public static final REFRESH:Ljava/lang/String; = "com.alexmanzana.bubbleall.Music.REFRESH"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/alexmanzana/bubbleall/ConstantsBubble$Music$Companion;

    invoke-direct {v0}, Lcom/alexmanzana/bubbleall/ConstantsBubble$Music$Companion;-><init>()V

    sput-object v0, Lcom/alexmanzana/bubbleall/ConstantsBubble$Music$Companion;->$$INSTANCE:Lcom/alexmanzana/bubbleall/ConstantsBubble$Music$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
