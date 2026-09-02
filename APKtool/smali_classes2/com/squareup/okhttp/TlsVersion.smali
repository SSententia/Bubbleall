.class public final enum Lcom/squareup/okhttp/TlsVersion;
.super Ljava/lang/Enum;
.source "TlsVersion.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/squareup/okhttp/TlsVersion;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/squareup/okhttp/TlsVersion;

.field public static final enum SSL_3_0:Lcom/squareup/okhttp/TlsVersion;

.field public static final enum TLS_1_0:Lcom/squareup/okhttp/TlsVersion;

.field public static final enum TLS_1_1:Lcom/squareup/okhttp/TlsVersion;

.field public static final enum TLS_1_2:Lcom/squareup/okhttp/TlsVersion;


# instance fields
.field final javaName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 25
    new-instance v0, Lcom/squareup/okhttp/TlsVersion;

    const-string v1, "TLSv1.2"

    const-string v2, "TLS_1_2"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/squareup/okhttp/TlsVersion;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/squareup/okhttp/TlsVersion;->TLS_1_2:Lcom/squareup/okhttp/TlsVersion;

    .line 26
    new-instance v1, Lcom/squareup/okhttp/TlsVersion;

    const-string v2, "TLSv1.1"

    const-string v4, "TLS_1_1"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lcom/squareup/okhttp/TlsVersion;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/squareup/okhttp/TlsVersion;->TLS_1_1:Lcom/squareup/okhttp/TlsVersion;

    .line 27
    new-instance v2, Lcom/squareup/okhttp/TlsVersion;

    const-string v4, "TLSv1"

    const-string v6, "TLS_1_0"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lcom/squareup/okhttp/TlsVersion;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/squareup/okhttp/TlsVersion;->TLS_1_0:Lcom/squareup/okhttp/TlsVersion;

    .line 28
    new-instance v4, Lcom/squareup/okhttp/TlsVersion;

    const-string v6, "SSLv3"

    const-string v8, "SSL_3_0"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, Lcom/squareup/okhttp/TlsVersion;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/squareup/okhttp/TlsVersion;->SSL_3_0:Lcom/squareup/okhttp/TlsVersion;

    const/4 v6, 0x4

    .line 24
    new-array v6, v6, [Lcom/squareup/okhttp/TlsVersion;

    aput-object v0, v6, v3

    aput-object v1, v6, v5

    aput-object v2, v6, v7

    aput-object v4, v6, v9

    sput-object v6, Lcom/squareup/okhttp/TlsVersion;->$VALUES:[Lcom/squareup/okhttp/TlsVersion;

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

    .line 33
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 34
    iput-object p3, p0, Lcom/squareup/okhttp/TlsVersion;->javaName:Ljava/lang/String;

    return-void
.end method

.method public static forJavaName(Ljava/lang/String;)Lcom/squareup/okhttp/TlsVersion;
    .locals 3

    .line 38
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "TLSv1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "SSLv3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_2
    const-string v0, "TLSv1.2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "TLSv1.1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 44
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected TLS version: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 41
    :pswitch_0
    sget-object p0, Lcom/squareup/okhttp/TlsVersion;->TLS_1_0:Lcom/squareup/okhttp/TlsVersion;

    return-object p0

    .line 42
    :pswitch_1
    sget-object p0, Lcom/squareup/okhttp/TlsVersion;->SSL_3_0:Lcom/squareup/okhttp/TlsVersion;

    return-object p0

    .line 39
    :pswitch_2
    sget-object p0, Lcom/squareup/okhttp/TlsVersion;->TLS_1_2:Lcom/squareup/okhttp/TlsVersion;

    return-object p0

    .line 40
    :pswitch_3
    sget-object p0, Lcom/squareup/okhttp/TlsVersion;->TLS_1_1:Lcom/squareup/okhttp/TlsVersion;

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x1dfc3f27 -> :sswitch_3
        -0x1dfc3f26 -> :sswitch_2
        0x4b88569 -> :sswitch_1
        0x4c38896 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/squareup/okhttp/TlsVersion;
    .locals 1

    .line 24
    const-class v0, Lcom/squareup/okhttp/TlsVersion;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/squareup/okhttp/TlsVersion;

    return-object p0
.end method

.method public static values()[Lcom/squareup/okhttp/TlsVersion;
    .locals 1

    .line 24
    sget-object v0, Lcom/squareup/okhttp/TlsVersion;->$VALUES:[Lcom/squareup/okhttp/TlsVersion;

    invoke-virtual {v0}, [Lcom/squareup/okhttp/TlsVersion;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/squareup/okhttp/TlsVersion;

    return-object v0
.end method


# virtual methods
.method public javaName()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/squareup/okhttp/TlsVersion;->javaName:Ljava/lang/String;

    return-object v0
.end method
