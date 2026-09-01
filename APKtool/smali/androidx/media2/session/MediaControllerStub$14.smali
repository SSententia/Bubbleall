.class Landroidx/media2/session/MediaControllerStub$14;
.super Ljava/lang/Object;
.source "MediaControllerStub.java"

# interfaces
.implements Landroidx/media2/session/MediaControllerStub$ControllerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaControllerStub;->onSetCustomLayout(ILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaControllerStub;

.field final synthetic val$commandButtonList:Ljava/util/List;

.field final synthetic val$seq:I


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaControllerStub;Ljava/util/List;I)V
    .locals 0

    .line 329
    iput-object p1, p0, Landroidx/media2/session/MediaControllerStub$14;->this$0:Landroidx/media2/session/MediaControllerStub;

    iput-object p2, p0, Landroidx/media2/session/MediaControllerStub$14;->val$commandButtonList:Ljava/util/List;

    iput p3, p0, Landroidx/media2/session/MediaControllerStub$14;->val$seq:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroidx/media2/session/MediaControllerImplBase;)V
    .locals 3

    .line 332
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 333
    :goto_0
    iget-object v2, p0, Landroidx/media2/session/MediaControllerStub$14;->val$commandButtonList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 334
    iget-object v2, p0, Landroidx/media2/session/MediaControllerStub$14;->val$commandButtonList:Ljava/util/List;

    .line 335
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/versionedparcelable/ParcelImpl;

    invoke-static {v2}, Landroidx/media2/common/MediaParcelUtils;->fromParcelable(Landroidx/versionedparcelable/ParcelImpl;)Landroidx/versionedparcelable/VersionedParcelable;

    move-result-object v2

    check-cast v2, Landroidx/media2/session/MediaSession$CommandButton;

    if-eqz v2, :cond_0

    .line 337
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 340
    :cond_1
    iget v1, p0, Landroidx/media2/session/MediaControllerStub$14;->val$seq:I

    invoke-virtual {p1, v1, v0}, Landroidx/media2/session/MediaControllerImplBase;->onSetCustomLayout(ILjava/util/List;)V

    return-void
.end method
