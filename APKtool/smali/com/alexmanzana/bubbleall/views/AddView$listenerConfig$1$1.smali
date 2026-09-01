.class public final Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$1;
.super Ljava/lang/Object;
.source "AddView.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerSize;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/views/AddView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/alexmanzana/bubbleall/views/AddView$listenerConfig$1$1",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerSize;",
        "onSize",
        "",
        "position",
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


# instance fields
.field final synthetic $context:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$1;->$context:Landroid/content/Context;

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSize(I)V
    .locals 3

    .line 61
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$1;->$context:Landroid/content/Context;

    const-string v1, "bubble_data_prefs"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 62
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 63
    const-string v1, "theme_size"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 64
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 65
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$1;->$context:Landroid/content/Context;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.alexmanzana.bubbleall.ACTION_MODIFY_BUBBLE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method
