.class Landroidx/media2/session/SequencedFutureManager;
.super Ljava/lang/Object;
.source "SequencedFutureManager.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/session/SequencedFutureManager$SequencedFuture;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field private static final TAG:Ljava/lang/String; = "SequencedFutureManager"


# instance fields
.field private final mLock:Ljava/lang/Object;

.field private mNextSequenceNumber:I

.field private mSeqToFutureMap:Landroidx/collection/ArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/ArrayMap<",
            "Ljava/lang/Integer;",
            "Landroidx/media2/session/SequencedFutureManager$SequencedFuture<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/media2/session/SequencedFutureManager;->mLock:Ljava/lang/Object;

    .line 43
    new-instance v0, Landroidx/collection/ArrayMap;

    invoke-direct {v0}, Landroidx/collection/ArrayMap;-><init>()V

    iput-object v0, p0, Landroidx/media2/session/SequencedFutureManager;->mSeqToFutureMap:Landroidx/collection/ArrayMap;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 109
    iget-object v0, p0, Landroidx/media2/session/SequencedFutureManager;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 110
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/media2/session/SequencedFutureManager;->mSeqToFutureMap:Landroidx/collection/ArrayMap;

    invoke-virtual {v2}, Landroidx/collection/ArrayMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 111
    iget-object v2, p0, Landroidx/media2/session/SequencedFutureManager;->mSeqToFutureMap:Landroidx/collection/ArrayMap;

    invoke-virtual {v2}, Landroidx/collection/ArrayMap;->clear()V

    .line 112
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;

    .line 114
    invoke-virtual {v1}, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;->setWithTheValueOfResultWhenClosed()V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 112
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public createSequencedFuture(Ljava/lang/Object;)Landroidx/media2/session/SequencedFutureManager$SequencedFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Landroidx/media2/session/SequencedFutureManager$SequencedFuture<",
            "TT;>;"
        }
    .end annotation

    .line 67
    iget-object v0, p0, Landroidx/media2/session/SequencedFutureManager;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 68
    :try_start_0
    invoke-virtual {p0}, Landroidx/media2/session/SequencedFutureManager;->obtainNextSequenceNumber()I

    move-result v1

    .line 69
    invoke-static {v1, p1}, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;->create(ILjava/lang/Object;)Landroidx/media2/session/SequencedFutureManager$SequencedFuture;

    move-result-object p1

    .line 70
    iget-object v2, p0, Landroidx/media2/session/SequencedFutureManager;->mSeqToFutureMap:Landroidx/collection/ArrayMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1, p1}, Landroidx/collection/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 72
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public obtainNextSequenceNumber()I
    .locals 3

    .line 53
    iget-object v0, p0, Landroidx/media2/session/SequencedFutureManager;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 54
    :try_start_0
    iget v1, p0, Landroidx/media2/session/SequencedFutureManager;->mNextSequenceNumber:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Landroidx/media2/session/SequencedFutureManager;->mNextSequenceNumber:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 55
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public setFutureResult(ILjava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(ITT;)V"
        }
    .end annotation

    const-string v0, "Type mismatch, expected "

    .line 84
    iget-object v1, p0, Landroidx/media2/session/SequencedFutureManager;->mLock:Ljava/lang/Object;

    monitor-enter v1

    .line 85
    :try_start_0
    iget-object v2, p0, Landroidx/media2/session/SequencedFutureManager;->mSeqToFutureMap:Landroidx/collection/ArrayMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroidx/collection/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    .line 88
    invoke-virtual {p1}, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;->getResultWhenClosed()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v2, v3, :cond_0

    goto :goto_0

    .line 91
    :cond_0
    const-string v2, "SequencedFutureManager"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    invoke-virtual {p1}, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;->getResultWhenClosed()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", but was "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 91
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 89
    :cond_1
    :goto_0
    invoke-virtual {p1, p2}, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;->set(Ljava/lang/Object;)Z

    .line 103
    :cond_2
    :goto_1
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
