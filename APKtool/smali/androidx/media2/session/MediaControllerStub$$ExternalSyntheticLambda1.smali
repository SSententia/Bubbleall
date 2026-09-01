.class public final synthetic Landroidx/media2/session/MediaControllerStub$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/media2/session/MediaControllerStub$BrowserTask;


# instance fields
.field public final synthetic f$0:I

.field public final synthetic f$1:Landroidx/versionedparcelable/ParcelImpl;


# direct methods
.method public synthetic constructor <init>(ILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/media2/session/MediaControllerStub$$ExternalSyntheticLambda1;->f$0:I

    iput-object p2, p0, Landroidx/media2/session/MediaControllerStub$$ExternalSyntheticLambda1;->f$1:Landroidx/versionedparcelable/ParcelImpl;

    return-void
.end method


# virtual methods
.method public final run(Landroidx/media2/session/MediaBrowserImplBase;)V
    .locals 2

    .line 0
    iget v0, p0, Landroidx/media2/session/MediaControllerStub$$ExternalSyntheticLambda1;->f$0:I

    iget-object v1, p0, Landroidx/media2/session/MediaControllerStub$$ExternalSyntheticLambda1;->f$1:Landroidx/versionedparcelable/ParcelImpl;

    invoke-static {v0, v1, p1}, Landroidx/media2/session/MediaControllerStub;->lambda$onLibraryResult$1(ILandroidx/versionedparcelable/ParcelImpl;Landroidx/media2/session/MediaBrowserImplBase;)V

    return-void
.end method
