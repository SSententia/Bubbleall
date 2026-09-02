.class public final enum Lcom/google/android/gms/internal/ads/zzfgf;
.super Ljava/lang/Enum;
.source "com.google.android.gms:play-services-ads@@20.5.0"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/ads/zzfgf;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/ads/zzfgf;

.field public static final enum zzb:Lcom/google/android/gms/internal/ads/zzfgf;

.field public static final enum zzc:Lcom/google/android/gms/internal/ads/zzfgf;

.field private static final synthetic zze:[Lcom/google/android/gms/internal/ads/zzfgf;


# instance fields
.field private final zzd:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfgf;

    const-string v1, "html"

    const-string v2, "HTML"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzfgf;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfgf;->zza:Lcom/google/android/gms/internal/ads/zzfgf;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfgf;

    const-string v2, "native"

    .line 2
    const-string v4, "NATIVE"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzfgf;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzfgf;->zzb:Lcom/google/android/gms/internal/ads/zzfgf;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzfgf;

    const-string v4, "javascript"

    .line 3
    const-string v6, "JAVASCRIPT"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lcom/google/android/gms/internal/ads/zzfgf;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/google/android/gms/internal/ads/zzfgf;->zzc:Lcom/google/android/gms/internal/ads/zzfgf;

    const/4 v4, 0x3

    new-array v4, v4, [Lcom/google/android/gms/internal/ads/zzfgf;

    aput-object v0, v4, v3

    aput-object v1, v4, v5

    aput-object v2, v4, v7

    sput-object v4, Lcom/google/android/gms/internal/ads/zzfgf;->zze:[Lcom/google/android/gms/internal/ads/zzfgf;

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

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfgf;->zzd:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/zzfgf;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfgf;->zze:[Lcom/google/android/gms/internal/ads/zzfgf;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/zzfgf;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/zzfgf;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfgf;->zzd:Ljava/lang/String;

    return-object v0
.end method
