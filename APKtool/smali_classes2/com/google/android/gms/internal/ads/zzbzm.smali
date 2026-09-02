.class public final enum Lcom/google/android/gms/internal/ads/zzbzm;
.super Ljava/lang/Enum;
.source "com.google.android.gms:play-services-ads-lite@@20.5.0"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/ads/zzbzm;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/ads/zzbzm;

.field public static final enum zzb:Lcom/google/android/gms/internal/ads/zzbzm;

.field public static final enum zzc:Lcom/google/android/gms/internal/ads/zzbzm;

.field public static final enum zzd:Lcom/google/android/gms/internal/ads/zzbzm;

.field private static final synthetic zzf:[Lcom/google/android/gms/internal/ads/zzbzm;


# instance fields
.field private final zze:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbzm;

    const-string v1, "beginToRender"

    const-string v2, "BEGIN_TO_RENDER"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzbzm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbzm;->zza:Lcom/google/android/gms/internal/ads/zzbzm;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbzm;

    const-string v2, "definedByJavascript"

    .line 2
    const-string v4, "DEFINED_BY_JAVASCRIPT"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzbzm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzbzm;->zzb:Lcom/google/android/gms/internal/ads/zzbzm;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzbzm;

    const-string v4, "onePixel"

    .line 3
    const-string v6, "ONE_PIXEL"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lcom/google/android/gms/internal/ads/zzbzm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/google/android/gms/internal/ads/zzbzm;->zzc:Lcom/google/android/gms/internal/ads/zzbzm;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzbzm;

    const-string v6, "unspecified"

    .line 4
    const-string v8, "UNSPECIFIED"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, Lcom/google/android/gms/internal/ads/zzbzm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/google/android/gms/internal/ads/zzbzm;->zzd:Lcom/google/android/gms/internal/ads/zzbzm;

    const/4 v6, 0x4

    new-array v6, v6, [Lcom/google/android/gms/internal/ads/zzbzm;

    aput-object v0, v6, v3

    aput-object v1, v6, v5

    aput-object v2, v6, v7

    aput-object v4, v6, v9

    sput-object v6, Lcom/google/android/gms/internal/ads/zzbzm;->zzf:[Lcom/google/android/gms/internal/ads/zzbzm;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbzm;->zze:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/zzbzm;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbzm;->zzf:[Lcom/google/android/gms/internal/ads/zzbzm;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/zzbzm;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/zzbzm;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbzm;->zze:Ljava/lang/String;

    return-object v0
.end method
