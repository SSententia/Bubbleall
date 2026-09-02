.class public Lcom/squareup/okhttp/internal/Platform;
.super Ljava/lang/Object;
.source "Platform.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/internal/Platform$JettyNegoProvider;,
        Lcom/squareup/okhttp/internal/Platform$JdkWithJettyBootPlatform;,
        Lcom/squareup/okhttp/internal/Platform$Android;
    }
.end annotation


# static fields
.field private static final PLATFORM:Lcom/squareup/okhttp/internal/Platform;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 55
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->findPlatform()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/Platform;->PLATFORM:Lcom/squareup/okhttp/internal/Platform;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static concatLengthPrefixed(Ljava/util/List;)[B
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/Protocol;",
            ">;)[B"
        }
    .end annotation

    .line 362
    new-instance v0, Lokio/Buffer;

    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    .line 363
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 364
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/squareup/okhttp/Protocol;

    .line 365
    sget-object v4, Lcom/squareup/okhttp/Protocol;->HTTP_1_0:Lcom/squareup/okhttp/Protocol;

    if-ne v3, v4, :cond_0

    goto :goto_1

    .line 366
    :cond_0
    invoke-virtual {v3}, Lcom/squareup/okhttp/Protocol;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v0, v4}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 367
    invoke-virtual {v3}, Lcom/squareup/okhttp/Protocol;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lokio/Buffer;->writeUtf8(Ljava/lang/String;)Lokio/Buffer;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 369
    :cond_1
    invoke-virtual {v0}, Lokio/Buffer;->readByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method private static findPlatform()Lcom/squareup/okhttp/internal/Platform;
    .locals 12

    .line 108
    const-class v0, [B

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "com.android.org.conscrypt.OpenSSLSocketImpl"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 111
    :catch_0
    :try_start_1
    const-string v3, "org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 114
    :goto_0
    new-instance v5, Lcom/squareup/okhttp/internal/OptionalMethod;

    const-string v3, "setUseSessionTickets"

    new-array v4, v1, [Ljava/lang/Class;

    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v6, v4, v2

    const/4 v6, 0x0

    invoke-direct {v5, v6, v3, v4}, Lcom/squareup/okhttp/internal/OptionalMethod;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 116
    new-instance v3, Lcom/squareup/okhttp/internal/OptionalMethod;

    const-string v4, "setHostname"

    new-array v7, v1, [Ljava/lang/Class;

    const-class v8, Ljava/lang/String;

    aput-object v8, v7, v2

    invoke-direct {v3, v6, v4, v7}, Lcom/squareup/okhttp/internal/OptionalMethod;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_5

    .line 125
    :try_start_2
    const-string v4, "android.net.TrafficStats"

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    .line 126
    const-string v7, "tagSocket"

    new-array v8, v1, [Ljava/lang/Class;

    const-class v9, Ljava/net/Socket;

    aput-object v9, v8, v2

    invoke-virtual {v4, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_3

    .line 127
    :try_start_3
    const-string v8, "untagSocket"

    new-array v9, v1, [Ljava/lang/Class;

    const-class v10, Ljava/net/Socket;

    aput-object v10, v9, v2

    invoke-virtual {v4, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_2

    .line 131
    :try_start_4
    const-string v8, "android.net.Network"

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 132
    new-instance v8, Lcom/squareup/okhttp/internal/OptionalMethod;

    const-string v9, "getAlpnSelectedProtocol"

    new-array v10, v2, [Ljava/lang/Class;

    invoke-direct {v8, v0, v9, v10}, Lcom/squareup/okhttp/internal/OptionalMethod;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_1

    .line 133
    :try_start_5
    new-instance v9, Lcom/squareup/okhttp/internal/OptionalMethod;

    const-string v10, "setAlpnProtocols"

    new-array v11, v1, [Ljava/lang/Class;

    aput-object v0, v11, v2

    invoke-direct {v9, v6, v10, v11}, Lcom/squareup/okhttp/internal/OptionalMethod;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_4

    move-object v6, v9

    goto :goto_1

    :catch_1
    move-object v8, v6

    goto :goto_1

    :catch_2
    move-object v4, v6

    move-object v8, v4

    goto :goto_1

    :catch_3
    move-object v4, v6

    move-object v7, v4

    move-object v8, v7

    :catch_4
    :goto_1
    move-object v10, v6

    move-object v9, v8

    move-object v8, v4

    .line 139
    :try_start_6
    new-instance v0, Lcom/squareup/okhttp/internal/Platform$Android;

    move-object v4, v0

    move-object v6, v3

    invoke-direct/range {v4 .. v10}, Lcom/squareup/okhttp/internal/Platform$Android;-><init>(Lcom/squareup/okhttp/internal/OptionalMethod;Lcom/squareup/okhttp/internal/OptionalMethod;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lcom/squareup/okhttp/internal/OptionalMethod;Lcom/squareup/okhttp/internal/OptionalMethod;)V
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_5

    return-object v0

    .line 147
    :catch_5
    :try_start_7
    const-string v0, "org.eclipse.jetty.alpn.ALPN"

    .line 148
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 149
    const-string v3, "org.eclipse.jetty.alpn.ALPN$Provider"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 150
    const-string v4, "org.eclipse.jetty.alpn.ALPN$ClientProvider"

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    .line 151
    const-string v4, "org.eclipse.jetty.alpn.ALPN$ServerProvider"

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    .line 152
    const-string v4, "put"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Class;

    const-class v6, Ljavax/net/ssl/SSLSocket;

    aput-object v6, v5, v2

    aput-object v3, v5, v1

    invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 153
    const-string v3, "get"

    new-array v4, v1, [Ljava/lang/Class;

    const-class v5, Ljavax/net/ssl/SSLSocket;

    aput-object v5, v4, v2

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 154
    const-string v3, "remove"

    new-array v1, v1, [Ljava/lang/Class;

    const-class v4, Ljavax/net/ssl/SSLSocket;

    aput-object v4, v1, v2

    invoke-virtual {v0, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    .line 155
    new-instance v0, Lcom/squareup/okhttp/internal/Platform$JdkWithJettyBootPlatform;

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, Lcom/squareup/okhttp/internal/Platform$JdkWithJettyBootPlatform;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V
    :try_end_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_7} :catch_6
    .catch Ljava/lang/NoSuchMethodException; {:try_start_7 .. :try_end_7} :catch_6

    return-object v0

    .line 160
    :catch_6
    new-instance v0, Lcom/squareup/okhttp/internal/Platform;

    invoke-direct {v0}, Lcom/squareup/okhttp/internal/Platform;-><init>()V

    return-object v0
.end method

.method public static get()Lcom/squareup/okhttp/internal/Platform;
    .locals 1

    .line 58
    sget-object v0, Lcom/squareup/okhttp/internal/Platform;->PLATFORM:Lcom/squareup/okhttp/internal/Platform;

    return-object v0
.end method


# virtual methods
.method public afterHandshake(Ljavax/net/ssl/SSLSocket;)V
    .locals 0

    return-void
.end method

.method public configureTlsExtensions(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/net/ssl/SSLSocket;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/Protocol;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public connectSocket(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 100
    invoke-virtual {p1, p2, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    return-void
.end method

.method public getPrefix()Ljava/lang/String;
    .locals 1

    .line 63
    const-string v0, "OkHttp"

    return-object v0
.end method

.method public getSelectedProtocol(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public logW(Ljava/lang/String;)V
    .locals 1

    .line 67
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public tagSocket(Ljava/net/Socket;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/SocketException;
        }
    .end annotation

    return-void
.end method

.method public untagSocket(Ljava/net/Socket;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/SocketException;
        }
    .end annotation

    return-void
.end method
