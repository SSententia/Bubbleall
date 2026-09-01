.class public final synthetic Landroidx/media2/session/MediaController$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/media2/session/SessionToken$OnSessionTokenCreatedListener;


# instance fields
.field public final synthetic f$0:Landroidx/media2/session/MediaController;

.field public final synthetic f$1:Landroid/content/Context;

.field public final synthetic f$2:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Landroidx/media2/session/MediaController;Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media2/session/MediaController$$ExternalSyntheticLambda0;->f$0:Landroidx/media2/session/MediaController;

    iput-object p2, p0, Landroidx/media2/session/MediaController$$ExternalSyntheticLambda0;->f$1:Landroid/content/Context;

    iput-object p3, p0, Landroidx/media2/session/MediaController$$ExternalSyntheticLambda0;->f$2:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final onSessionTokenCreated(Landroid/support/v4/media/session/MediaSessionCompat$Token;Landroidx/media2/session/SessionToken;)V
    .locals 3

    .line 0
    iget-object v0, p0, Landroidx/media2/session/MediaController$$ExternalSyntheticLambda0;->f$0:Landroidx/media2/session/MediaController;

    iget-object v1, p0, Landroidx/media2/session/MediaController$$ExternalSyntheticLambda0;->f$1:Landroid/content/Context;

    iget-object v2, p0, Landroidx/media2/session/MediaController$$ExternalSyntheticLambda0;->f$2:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, p1, p2}, Landroidx/media2/session/MediaController;->lambda$new$1$androidx-media2-session-MediaController(Landroid/content/Context;Landroid/os/Bundle;Landroid/support/v4/media/session/MediaSessionCompat$Token;Landroidx/media2/session/SessionToken;)V

    return-void
.end method
