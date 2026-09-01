.class public final Landroidx/media2/session/SessionCommand;
.super Ljava/lang/Object;
.source "SessionCommand.java"

# interfaces
.implements Landroidx/versionedparcelable/VersionedParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/session/SessionCommand$CommandCode;,
        Landroidx/media2/session/SessionCommand$CommandVersion;
    }
.end annotation


# static fields
.field public static final COMMAND_CODE_CUSTOM:I = 0x0

.field public static final COMMAND_CODE_LIBRARY_GET_CHILDREN:I = 0xc353

.field public static final COMMAND_CODE_LIBRARY_GET_ITEM:I = 0xc354

.field public static final COMMAND_CODE_LIBRARY_GET_LIBRARY_ROOT:I = 0xc350

.field public static final COMMAND_CODE_LIBRARY_GET_SEARCH_RESULT:I = 0xc356

.field public static final COMMAND_CODE_LIBRARY_SEARCH:I = 0xc355

.field public static final COMMAND_CODE_LIBRARY_SUBSCRIBE:I = 0xc351

.field public static final COMMAND_CODE_LIBRARY_UNSUBSCRIBE:I = 0xc352

.field public static final COMMAND_CODE_PLAYER_ADD_PLAYLIST_ITEM:I = 0x271d

.field public static final COMMAND_CODE_PLAYER_DESELECT_TRACK:I = 0x2afa

.field public static final COMMAND_CODE_PLAYER_GET_CURRENT_MEDIA_ITEM:I = 0x2720

.field public static final COMMAND_CODE_PLAYER_GET_PLAYLIST:I = 0x2715

.field public static final COMMAND_CODE_PLAYER_GET_PLAYLIST_METADATA:I = 0x271c

.field public static final COMMAND_CODE_PLAYER_MOVE_PLAYLIST_ITEM:I = 0x2723

.field public static final COMMAND_CODE_PLAYER_PAUSE:I = 0x2711

.field public static final COMMAND_CODE_PLAYER_PLAY:I = 0x2710

.field public static final COMMAND_CODE_PLAYER_PREPARE:I = 0x2712

.field public static final COMMAND_CODE_PLAYER_REMOVE_PLAYLIST_ITEM:I = 0x271e

.field public static final COMMAND_CODE_PLAYER_REPLACE_PLAYLIST_ITEM:I = 0x271f

.field public static final COMMAND_CODE_PLAYER_SEEK_TO:I = 0x2713

.field public static final COMMAND_CODE_PLAYER_SELECT_TRACK:I = 0x2af9

.field public static final COMMAND_CODE_PLAYER_SET_MEDIA_ITEM:I = 0x2722

.field public static final COMMAND_CODE_PLAYER_SET_PLAYLIST:I = 0x2716

.field public static final COMMAND_CODE_PLAYER_SET_REPEAT_MODE:I = 0x271b

.field public static final COMMAND_CODE_PLAYER_SET_SHUFFLE_MODE:I = 0x271a

.field public static final COMMAND_CODE_PLAYER_SET_SPEED:I = 0x2714

.field public static final COMMAND_CODE_PLAYER_SET_SURFACE:I = 0x2af8

.field public static final COMMAND_CODE_PLAYER_SKIP_TO_NEXT_PLAYLIST_ITEM:I = 0x2719

.field public static final COMMAND_CODE_PLAYER_SKIP_TO_PLAYLIST_ITEM:I = 0x2717

.field public static final COMMAND_CODE_PLAYER_SKIP_TO_PREVIOUS_PLAYLIST_ITEM:I = 0x2718

.field public static final COMMAND_CODE_PLAYER_UPDATE_LIST_METADATA:I = 0x2721

.field public static final COMMAND_CODE_SESSION_FAST_FORWARD:I = 0x9c40

.field public static final COMMAND_CODE_SESSION_REWIND:I = 0x9c41

.field public static final COMMAND_CODE_SESSION_SET_MEDIA_URI:I = 0x9c4b

.field public static final COMMAND_CODE_SESSION_SET_RATING:I = 0x9c4a

.field public static final COMMAND_CODE_SESSION_SKIP_BACKWARD:I = 0x9c43

.field public static final COMMAND_CODE_SESSION_SKIP_FORWARD:I = 0x9c42

.field public static final COMMAND_CODE_VOLUME_ADJUST_VOLUME:I = 0x7531

.field public static final COMMAND_CODE_VOLUME_SET_VOLUME:I = 0x7530

.field public static final COMMAND_VERSION_1:I = 0x1

.field public static final COMMAND_VERSION_2:I = 0x2

.field public static final COMMAND_VERSION_CURRENT:I = 0x2

.field static final VERSION_LIBRARY_COMMANDS_MAP:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field static final VERSION_PLAYER_BASIC_COMMANDS_MAP:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field static final VERSION_PLAYER_PLAYLIST_COMMANDS_MAP:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field static final VERSION_SESSION_COMMANDS_MAP:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field static final VERSION_VOLUME_COMMANDS_MAP:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field mCommandCode:I

.field mCustomAction:Ljava/lang/String;

.field mCustomExtras:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 24

    .line 149
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Landroidx/media2/session/SessionCommand;->VERSION_PLAYER_BASIC_COMMANDS_MAP:Landroid/util/SparseArray;

    .line 150
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    sput-object v1, Landroidx/media2/session/SessionCommand;->VERSION_PLAYER_PLAYLIST_COMMANDS_MAP:Landroid/util/SparseArray;

    const/16 v2, 0x2710

    .line 400
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x2711

    .line 401
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v4, 0x2712

    .line 402
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v5, 0x2713

    .line 403
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v6, 0x2714

    .line 404
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/16 v7, 0x2af8

    .line 405
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v8, 0x2af9

    .line 406
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v9, 0x2afa

    .line 407
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/16 v10, 0x8

    new-array v11, v10, [Ljava/lang/Integer;

    const/4 v12, 0x0

    aput-object v2, v11, v12

    const/4 v2, 0x1

    aput-object v3, v11, v2

    const/4 v3, 0x2

    aput-object v4, v11, v3

    const/4 v4, 0x3

    aput-object v5, v11, v4

    const/4 v5, 0x4

    aput-object v6, v11, v5

    const/4 v6, 0x5

    aput-object v7, v11, v6

    const/4 v7, 0x6

    aput-object v8, v11, v7

    const/4 v8, 0x7

    aput-object v9, v11, v8

    .line 400
    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    .line 399
    invoke-virtual {v0, v2, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/16 v0, 0x2715

    .line 412
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v9, 0x2716

    .line 413
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/16 v11, 0x2717

    .line 414
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v13, 0x2718

    .line 415
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v14, 0x2719

    .line 416
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v15, 0x271a

    .line 417
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v16, 0x271b

    .line 418
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    const/16 v17, 0x271c

    .line 419
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    const/16 v18, 0x271d

    .line 420
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    const/16 v19, 0x271e

    .line 421
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    const/16 v20, 0x271f

    .line 422
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    const/16 v21, 0x2720

    .line 423
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    const/16 v22, 0x2721

    .line 424
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v22

    const/16 v23, 0x2722

    .line 425
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    const/16 v10, 0xe

    new-array v10, v10, [Ljava/lang/Integer;

    aput-object v0, v10, v12

    aput-object v9, v10, v2

    aput-object v11, v10, v3

    aput-object v13, v10, v4

    aput-object v14, v10, v5

    aput-object v15, v10, v6

    aput-object v16, v10, v7

    aput-object v17, v10, v8

    const/16 v0, 0x8

    aput-object v18, v10, v0

    const/16 v0, 0x9

    aput-object v19, v10, v0

    const/16 v0, 0xa

    aput-object v20, v10, v0

    const/16 v0, 0xb

    aput-object v21, v10, v0

    const/16 v0, 0xc

    aput-object v22, v10, v0

    const/16 v0, 0xd

    aput-object v23, v10, v0

    .line 412
    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 411
    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/16 v0, 0x2723

    .line 427
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 426
    invoke-virtual {v1, v3, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 433
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Landroidx/media2/session/SessionCommand;->VERSION_VOLUME_COMMANDS_MAP:Landroid/util/SparseArray;

    const/16 v1, 0x7530

    .line 461
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v9, 0x7531

    .line 462
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-array v10, v3, [Ljava/lang/Integer;

    aput-object v1, v10, v12

    aput-object v9, v10, v2

    .line 461
    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 460
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 468
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Landroidx/media2/session/SessionCommand;->VERSION_SESSION_COMMANDS_MAP:Landroid/util/SparseArray;

    const v1, 0x9c40

    .line 516
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v9, 0x9c41

    .line 517
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const v10, 0x9c42

    .line 518
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const v11, 0x9c43

    .line 519
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const v13, 0x9c4a

    .line 520
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    new-array v14, v6, [Ljava/lang/Integer;

    aput-object v1, v14, v12

    aput-object v9, v14, v2

    aput-object v10, v14, v3

    aput-object v11, v14, v4

    aput-object v13, v14, v5

    .line 516
    invoke-static {v14}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 515
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const v1, 0x9c4b

    .line 522
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 521
    invoke-virtual {v0, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 528
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Landroidx/media2/session/SessionCommand;->VERSION_LIBRARY_COMMANDS_MAP:Landroid/util/SparseArray;

    const v1, 0xc350

    .line 581
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v9, 0xc351

    .line 582
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const v10, 0xc352

    .line 583
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const v11, 0xc353

    .line 584
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const v13, 0xc354

    .line 585
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const v14, 0xc355

    .line 586
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const v15, 0xc356

    .line 587
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    new-array v8, v8, [Ljava/lang/Integer;

    aput-object v1, v8, v12

    aput-object v9, v8, v2

    aput-object v10, v8, v3

    aput-object v11, v8, v4

    aput-object v13, v8, v5

    aput-object v14, v8, v6

    aput-object v15, v8, v7

    .line 581
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 580
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 603
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 611
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 615
    iput p1, p0, Landroidx/media2/session/SessionCommand;->mCommandCode:I

    const/4 p1, 0x0

    .line 616
    iput-object p1, p0, Landroidx/media2/session/SessionCommand;->mCustomAction:Ljava/lang/String;

    .line 617
    iput-object p1, p0, Landroidx/media2/session/SessionCommand;->mCustomExtras:Landroid/os/Bundle;

    return-void

    .line 613
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "commandCode shouldn\'t be COMMAND_CODE_CUSTOM"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 626
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 630
    iput v0, p0, Landroidx/media2/session/SessionCommand;->mCommandCode:I

    .line 631
    iput-object p1, p0, Landroidx/media2/session/SessionCommand;->mCustomAction:Ljava/lang/String;

    .line 632
    iput-object p2, p0, Landroidx/media2/session/SessionCommand;->mCustomExtras:Landroid/os/Bundle;

    return-void

    .line 628
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "action shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 664
    instance-of v0, p1, Landroidx/media2/session/SessionCommand;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 667
    :cond_0
    check-cast p1, Landroidx/media2/session/SessionCommand;

    .line 668
    iget v0, p0, Landroidx/media2/session/SessionCommand;->mCommandCode:I

    iget v2, p1, Landroidx/media2/session/SessionCommand;->mCommandCode:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Landroidx/media2/session/SessionCommand;->mCustomAction:Ljava/lang/String;

    iget-object p1, p1, Landroidx/media2/session/SessionCommand;->mCustomAction:Ljava/lang/String;

    .line 669
    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public getCommandCode()I
    .locals 1

    .line 641
    iget v0, p0, Landroidx/media2/session/SessionCommand;->mCommandCode:I

    return v0
.end method

.method public getCustomAction()Ljava/lang/String;
    .locals 1

    .line 650
    iget-object v0, p0, Landroidx/media2/session/SessionCommand;->mCustomAction:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomExtras()Landroid/os/Bundle;
    .locals 1

    .line 659
    iget-object v0, p0, Landroidx/media2/session/SessionCommand;->mCustomExtras:Landroid/os/Bundle;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 674
    iget-object v0, p0, Landroidx/media2/session/SessionCommand;->mCustomAction:Ljava/lang/String;

    iget v1, p0, Landroidx/media2/session/SessionCommand;->mCommandCode:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Landroidx/core/util/ObjectsCompat;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
