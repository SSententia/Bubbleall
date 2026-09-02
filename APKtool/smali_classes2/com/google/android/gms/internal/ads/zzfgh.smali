.class public final enum Lcom/google/android/gms/internal/ads/zzfgh;
.super Ljava/lang/Enum;
.source "com.google.android.gms:play-services-ads@@20.5.0"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/ads/zzfgh;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/ads/zzfgh;

.field public static final enum zzb:Lcom/google/android/gms/internal/ads/zzfgh;

.field public static final enum zzc:Lcom/google/android/gms/internal/ads/zzfgh;

.field public static final enum zzd:Lcom/google/android/gms/internal/ads/zzfgh;

.field public static final enum zze:Lcom/google/android/gms/internal/ads/zzfgh;

.field private static final synthetic zzg:[Lcom/google/android/gms/internal/ads/zzfgh;


# instance fields
.field private final zzf:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfgh;

    const-string v1, "definedByJavaScript"

    const-string v2, "DEFINED_BY_JAVASCRIPT"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzfgh;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfgh;->zza:Lcom/google/android/gms/internal/ads/zzfgh;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfgh;

    const-string v2, "htmlDisplay"

    .line 2
    const-string v4, "HTML_DISPLAY"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzfgh;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzfgh;->zzb:Lcom/google/android/gms/internal/ads/zzfgh;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzfgh;

    const-string v4, "nativeDisplay"

    .line 3
    const-string v6, "NATIVE_DISPLAY"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lcom/google/android/gms/internal/ads/zzfgh;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/google/android/gms/internal/ads/zzfgh;->zzc:Lcom/google/android/gms/internal/ads/zzfgh;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzfgh;

    const-string v6, "video"

    .line 4
    const-string v8, "VIDEO"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, Lcom/google/android/gms/internal/ads/zzfgh;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/google/android/gms/internal/ads/zzfgh;->zzd:Lcom/google/android/gms/internal/ads/zzfgh;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzfgh;

    const-string v8, "audio"

    .line 5
    const-string v10, "AUDIO"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, Lcom/google/android/gms/internal/ads/zzfgh;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lcom/google/android/gms/internal/ads/zzfgh;->zze:Lcom/google/android/gms/internal/ads/zzfgh;

    const/4 v8, 0x5

    new-array v8, v8, [Lcom/google/android/gms/internal/ads/zzfgh;

    aput-object v0, v8, v3

    aput-object v1, v8, v5

    aput-object v2, v8, v7

    aput-object v4, v8, v9

    aput-object v6, v8, v11

    sput-object v8, Lcom/google/android/gms/internal/ads/zzfgh;->zzg:[Lcom/google/android/gms/internal/ads/zzfgh;

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

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfgh;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/zzfgh;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfgh;->zzg:[Lcom/google/android/gms/internal/ads/zzfgh;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/zzfgh;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/zzfgh;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfgh;->zzf:Ljava/lang/String;

    return-object v0
.end method
