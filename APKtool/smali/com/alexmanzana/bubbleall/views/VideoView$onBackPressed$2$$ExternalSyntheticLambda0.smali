.class public final synthetic Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/alexmanzana/bubbleall/views/VideoView;

.field public final synthetic f$1:Ljava/util/ArrayList;

.field public final synthetic f$2:I

.field public final synthetic f$3:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(Lcom/alexmanzana/bubbleall/views/VideoView;Ljava/util/ArrayList;ILandroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2$$ExternalSyntheticLambda0;->f$0:Lcom/alexmanzana/bubbleall/views/VideoView;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2$$ExternalSyntheticLambda0;->f$1:Ljava/util/ArrayList;

    iput p3, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2$$ExternalSyntheticLambda0;->f$2:I

    iput-object p4, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2$$ExternalSyntheticLambda0;->f$3:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2$$ExternalSyntheticLambda0;->f$0:Lcom/alexmanzana/bubbleall/views/VideoView;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2$$ExternalSyntheticLambda0;->f$1:Ljava/util/ArrayList;

    iget v2, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2$$ExternalSyntheticLambda0;->f$2:I

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2$$ExternalSyntheticLambda0;->f$3:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, v1, v2, v3}, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2;->$r8$lambda$McFqK61X1QBr1H1NTl-NBifTR0M(Lcom/alexmanzana/bubbleall/views/VideoView;Ljava/util/ArrayList;ILandroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method
