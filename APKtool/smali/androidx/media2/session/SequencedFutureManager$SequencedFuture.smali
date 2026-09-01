.class final Landroidx/media2/session/SequencedFutureManager$SequencedFuture;
.super Landroidx/concurrent/futures/AbstractResolvableFuture;
.source "SequencedFutureManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/SequencedFutureManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "SequencedFuture"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/concurrent/futures/AbstractResolvableFuture<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final mResultWhenClosed:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final mSequenceNumber:I


# direct methods
.method private constructor <init>(ILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    .line 147
    invoke-direct {p0}, Landroidx/concurrent/futures/AbstractResolvableFuture;-><init>()V

    .line 148
    iput p1, p0, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;->mSequenceNumber:I

    .line 149
    iput-object p2, p0, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;->mResultWhenClosed:Ljava/lang/Object;

    return-void
.end method

.method static create(ILjava/lang/Object;)Landroidx/media2/session/SequencedFutureManager$SequencedFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(ITT;)",
            "Landroidx/media2/session/SequencedFutureManager$SequencedFuture<",
            "TT;>;"
        }
    .end annotation

    .line 127
    new-instance v0, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;-><init>(ILjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public getResultWhenClosed()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 144
    iget-object v0, p0, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;->mResultWhenClosed:Ljava/lang/Object;

    return-object v0
.end method

.method public getSequenceNumber()I
    .locals 1

    .line 140
    iget v0, p0, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;->mSequenceNumber:I

    return v0
.end method

.method public set(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 132
    invoke-super {p0, p1}, Landroidx/concurrent/futures/AbstractResolvableFuture;->set(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method setWithTheValueOfResultWhenClosed()V
    .locals 1

    .line 136
    iget-object v0, p0, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;->mResultWhenClosed:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;->set(Ljava/lang/Object;)Z

    return-void
.end method
