.class final enum Landroidx/media2/widget/MusicView$MusicViewType;
.super Ljava/lang/Enum;
.source "MusicView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/widget/MusicView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "MusicViewType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/media2/widget/MusicView$MusicViewType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/media2/widget/MusicView$MusicViewType;

.field public static final enum WITHOUT_TITLE:Landroidx/media2/widget/MusicView$MusicViewType;

.field public static final enum WITH_TITLE_LANDSCAPE:Landroidx/media2/widget/MusicView$MusicViewType;

.field public static final enum WITH_TITLE_PORTRAIT:Landroidx/media2/widget/MusicView$MusicViewType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 160
    new-instance v0, Landroidx/media2/widget/MusicView$MusicViewType;

    const-string v1, "WITH_TITLE_LANDSCAPE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/media2/widget/MusicView$MusicViewType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/media2/widget/MusicView$MusicViewType;->WITH_TITLE_LANDSCAPE:Landroidx/media2/widget/MusicView$MusicViewType;

    new-instance v1, Landroidx/media2/widget/MusicView$MusicViewType;

    const-string v3, "WITH_TITLE_PORTRAIT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Landroidx/media2/widget/MusicView$MusicViewType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Landroidx/media2/widget/MusicView$MusicViewType;->WITH_TITLE_PORTRAIT:Landroidx/media2/widget/MusicView$MusicViewType;

    new-instance v3, Landroidx/media2/widget/MusicView$MusicViewType;

    const-string v5, "WITHOUT_TITLE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Landroidx/media2/widget/MusicView$MusicViewType;-><init>(Ljava/lang/String;I)V

    sput-object v3, Landroidx/media2/widget/MusicView$MusicViewType;->WITHOUT_TITLE:Landroidx/media2/widget/MusicView$MusicViewType;

    const/4 v5, 0x3

    new-array v5, v5, [Landroidx/media2/widget/MusicView$MusicViewType;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Landroidx/media2/widget/MusicView$MusicViewType;->$VALUES:[Landroidx/media2/widget/MusicView$MusicViewType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 160
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/media2/widget/MusicView$MusicViewType;
    .locals 1

    .line 160
    const-class v0, Landroidx/media2/widget/MusicView$MusicViewType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/media2/widget/MusicView$MusicViewType;

    return-object p0
.end method

.method public static values()[Landroidx/media2/widget/MusicView$MusicViewType;
    .locals 1

    .line 160
    sget-object v0, Landroidx/media2/widget/MusicView$MusicViewType;->$VALUES:[Landroidx/media2/widget/MusicView$MusicViewType;

    invoke-virtual {v0}, [Landroidx/media2/widget/MusicView$MusicViewType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/media2/widget/MusicView$MusicViewType;

    return-object v0
.end method
