.class public final Lcom/squareup/okhttp/Connection;
.super Ljava/lang/Object;
.source "Connection.java"


# instance fields
.field private connected:Z

.field private framedConnection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

.field private handshake:Lcom/squareup/okhttp/Handshake;

.field private httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

.field private idleStartTimeNs:J

.field private owner:Ljava/lang/Object;

.field private final pool:Lcom/squareup/okhttp/ConnectionPool;

.field private protocol:Lcom/squareup/okhttp/Protocol;

.field private recycleCount:I

.field private final route:Lcom/squareup/okhttp/Route;

.field private socket:Ljava/net/Socket;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/ConnectionPool;Lcom/squareup/okhttp/Route;)V
    .locals 1

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 80
    iput-boolean v0, p0, Lcom/squareup/okhttp/Connection;->connected:Z

    .line 83
    sget-object v0, Lcom/squareup/okhttp/Protocol;->HTTP_1_1:Lcom/squareup/okhttp/Protocol;

    iput-object v0, p0, Lcom/squareup/okhttp/Connection;->protocol:Lcom/squareup/okhttp/Protocol;

    .line 96
    iput-object p1, p0, Lcom/squareup/okhttp/Connection;->pool:Lcom/squareup/okhttp/ConnectionPool;

    .line 97
    iput-object p2, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    return-void
.end method

.method private connectSocket(IIILcom/squareup/okhttp/Request;Lcom/squareup/okhttp/internal/ConnectionSpecSelector;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 195
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v0, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 196
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    iget-object v2, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    invoke-virtual {v2}, Lcom/squareup/okhttp/Route;->getSocketAddress()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lcom/squareup/okhttp/internal/Platform;->connectSocket(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V

    .line 198
    iget-object p1, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object p1, p1, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    invoke-virtual {p1}, Lcom/squareup/okhttp/Address;->getSslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 199
    invoke-direct {p0, p2, p3, p4, p5}, Lcom/squareup/okhttp/Connection;->connectTls(IILcom/squareup/okhttp/Request;Lcom/squareup/okhttp/internal/ConnectionSpecSelector;)V

    .line 202
    :cond_0
    iget-object p1, p0, Lcom/squareup/okhttp/Connection;->protocol:Lcom/squareup/okhttp/Protocol;

    sget-object p2, Lcom/squareup/okhttp/Protocol;->SPDY_3:Lcom/squareup/okhttp/Protocol;

    if-eq p1, p2, :cond_2

    iget-object p1, p0, Lcom/squareup/okhttp/Connection;->protocol:Lcom/squareup/okhttp/Protocol;

    sget-object p2, Lcom/squareup/okhttp/Protocol;->HTTP_2:Lcom/squareup/okhttp/Protocol;

    if-ne p1, p2, :cond_1

    goto :goto_0

    .line 208
    :cond_1
    new-instance p1, Lcom/squareup/okhttp/internal/http/HttpConnection;

    iget-object p2, p0, Lcom/squareup/okhttp/Connection;->pool:Lcom/squareup/okhttp/ConnectionPool;

    iget-object p3, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-direct {p1, p2, p0, p3}, Lcom/squareup/okhttp/internal/http/HttpConnection;-><init>(Lcom/squareup/okhttp/ConnectionPool;Lcom/squareup/okhttp/Connection;Ljava/net/Socket;)V

    iput-object p1, p0, Lcom/squareup/okhttp/Connection;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    goto :goto_1

    .line 203
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 204
    new-instance p1, Lcom/squareup/okhttp/internal/framed/FramedConnection$Builder;

    iget-object p2, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object p2, p2, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    iget-object p2, p2, Lcom/squareup/okhttp/Address;->uriHost:Ljava/lang/String;

    const/4 p3, 0x1

    iget-object p4, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-direct {p1, p2, p3, p4}, Lcom/squareup/okhttp/internal/framed/FramedConnection$Builder;-><init>(Ljava/lang/String;ZLjava/net/Socket;)V

    iget-object p2, p0, Lcom/squareup/okhttp/Connection;->protocol:Lcom/squareup/okhttp/Protocol;

    .line 205
    invoke-virtual {p1, p2}, Lcom/squareup/okhttp/internal/framed/FramedConnection$Builder;->protocol(Lcom/squareup/okhttp/Protocol;)Lcom/squareup/okhttp/internal/framed/FramedConnection$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/framed/FramedConnection$Builder;->build()Lcom/squareup/okhttp/internal/framed/FramedConnection;

    move-result-object p1

    iput-object p1, p0, Lcom/squareup/okhttp/Connection;->framedConnection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    .line 206
    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/framed/FramedConnection;->sendConnectionPreface()V

    :goto_1
    return-void
.end method

.method private connectTls(IILcom/squareup/okhttp/Request;Lcom/squareup/okhttp/internal/ConnectionSpecSelector;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, " not verified:\n    certificate: "

    const-string v1, "Hostname "

    .line 214
    iget-object v2, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    invoke-virtual {v2}, Lcom/squareup/okhttp/Route;->requiresTunnel()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 215
    invoke-direct {p0, p1, p2, p3}, Lcom/squareup/okhttp/Connection;->createTunnel(IILcom/squareup/okhttp/Request;)V

    .line 218
    :cond_0
    iget-object p1, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    invoke-virtual {p1}, Lcom/squareup/okhttp/Route;->getAddress()Lcom/squareup/okhttp/Address;

    move-result-object p1

    .line 219
    invoke-virtual {p1}, Lcom/squareup/okhttp/Address;->getSslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object p2

    const/4 p3, 0x0

    .line 224
    :try_start_0
    iget-object v2, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    .line 225
    invoke-virtual {p1}, Lcom/squareup/okhttp/Address;->getUriHost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/squareup/okhttp/Address;->getUriPort()I

    move-result v4

    const/4 v5, 0x1

    .line 224
    invoke-virtual {p2, v2, v3, v4, v5}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object p2

    check-cast p2, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 228
    :try_start_1
    invoke-virtual {p4, p2}, Lcom/squareup/okhttp/internal/ConnectionSpecSelector;->configureSecureSocket(Ljavax/net/ssl/SSLSocket;)Lcom/squareup/okhttp/ConnectionSpec;

    move-result-object p4

    .line 229
    invoke-virtual {p4}, Lcom/squareup/okhttp/ConnectionSpec;->supportsTlsExtensions()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 230
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v2

    .line 231
    invoke-virtual {p1}, Lcom/squareup/okhttp/Address;->getUriHost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/squareup/okhttp/Address;->getProtocols()Ljava/util/List;

    move-result-object v4

    .line 230
    invoke-virtual {v2, p2, v3, v4}, Lcom/squareup/okhttp/internal/Platform;->configureTlsExtensions(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 235
    :cond_1
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 236
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v2

    invoke-static {v2}, Lcom/squareup/okhttp/Handshake;->get(Ljavax/net/ssl/SSLSession;)Lcom/squareup/okhttp/Handshake;

    move-result-object v2

    .line 239
    invoke-virtual {p1}, Lcom/squareup/okhttp/Address;->getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v3

    invoke-virtual {p1}, Lcom/squareup/okhttp/Address;->getUriHost()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 248
    invoke-virtual {p1}, Lcom/squareup/okhttp/Address;->getCertificatePinner()Lcom/squareup/okhttp/CertificatePinner;

    move-result-object v0

    invoke-virtual {p1}, Lcom/squareup/okhttp/Address;->getUriHost()Ljava/lang/String;

    move-result-object p1

    .line 249
    invoke-virtual {v2}, Lcom/squareup/okhttp/Handshake;->peerCertificates()Ljava/util/List;

    move-result-object v1

    .line 248
    invoke-virtual {v0, p1, v1}, Lcom/squareup/okhttp/CertificatePinner;->check(Ljava/lang/String;Ljava/util/List;)V

    .line 252
    invoke-virtual {p4}, Lcom/squareup/okhttp/ConnectionSpec;->supportsTlsExtensions()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 253
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/squareup/okhttp/internal/Platform;->getSelectedProtocol(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object p3

    :cond_2
    if-eqz p3, :cond_3

    .line 256
    invoke-static {p3}, Lcom/squareup/okhttp/Protocol;->get(Ljava/lang/String;)Lcom/squareup/okhttp/Protocol;

    move-result-object p1

    goto :goto_0

    :cond_3
    sget-object p1, Lcom/squareup/okhttp/Protocol;->HTTP_1_1:Lcom/squareup/okhttp/Protocol;

    :goto_0
    iput-object p1, p0, Lcom/squareup/okhttp/Connection;->protocol:Lcom/squareup/okhttp/Protocol;

    .line 258
    iput-object v2, p0, Lcom/squareup/okhttp/Connection;->handshake:Lcom/squareup/okhttp/Handshake;

    .line 259
    iput-object p2, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_4

    .line 266
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/squareup/okhttp/internal/Platform;->afterHandshake(Ljavax/net/ssl/SSLSocket;)V

    :cond_4
    return-void

    .line 240
    :cond_5
    :try_start_2
    invoke-virtual {v2}, Lcom/squareup/okhttp/Handshake;->peerCertificates()Ljava/util/List;

    move-result-object p3

    const/4 p4, 0x0

    invoke-interface {p3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/security/cert/X509Certificate;

    .line 241
    new-instance p4, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/okhttp/Address;->getUriHost()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    invoke-static {p3}, Lcom/squareup/okhttp/CertificatePinner;->pin(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n    DN: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    invoke-virtual {p3}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object p1

    invoke-interface {p1}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n    subjectAltNames: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    invoke-static {p3}, Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;->allSubjectAltNames(Ljava/security/cert/X509Certificate;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p4, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p4
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    move-object p3, p2

    goto :goto_2

    :catch_0
    move-exception p1

    move-object p3, p2

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 262
    :goto_1
    :try_start_3
    invoke-static {p1}, Lcom/squareup/okhttp/internal/Util;->isAndroidGetsocknameError(Ljava/lang/AssertionError;)Z

    move-result p2

    if-eqz p2, :cond_6

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 263
    :cond_6
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    if-eqz p3, :cond_7

    .line 266
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/squareup/okhttp/internal/Platform;->afterHandshake(Ljavax/net/ssl/SSLSocket;)V

    .line 269
    :cond_7
    invoke-static {p3}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/net/Socket;)V

    throw p1
.end method

.method private createTunnel(IILcom/squareup/okhttp/Request;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 281
    invoke-direct {p0, p3}, Lcom/squareup/okhttp/Connection;->createTunnelRequest(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Request;

    move-result-object p3

    .line 282
    new-instance v0, Lcom/squareup/okhttp/internal/http/HttpConnection;

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->pool:Lcom/squareup/okhttp/ConnectionPool;

    iget-object v2, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-direct {v0, v1, p0, v2}, Lcom/squareup/okhttp/internal/http/HttpConnection;-><init>(Lcom/squareup/okhttp/ConnectionPool;Lcom/squareup/okhttp/Connection;Ljava/net/Socket;)V

    .line 283
    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/internal/http/HttpConnection;->setTimeouts(II)V

    .line 284
    invoke-virtual {p3}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object p1

    .line 285
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "CONNECT "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/okhttp/HttpUrl;->host()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/squareup/okhttp/HttpUrl;->port()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " HTTP/1.1"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 287
    :goto_0
    invoke-virtual {p3}, Lcom/squareup/okhttp/Request;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, Lcom/squareup/okhttp/internal/http/HttpConnection;->writeRequest(Lcom/squareup/okhttp/Headers;Ljava/lang/String;)V

    .line 288
    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->flush()V

    .line 289
    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->readResponse()Lcom/squareup/okhttp/Response$Builder;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/squareup/okhttp/Response$Builder;->request(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/squareup/okhttp/Response$Builder;->build()Lcom/squareup/okhttp/Response;

    move-result-object p2

    .line 292
    invoke-static {p2}, Lcom/squareup/okhttp/internal/http/OkHeaders;->contentLength(Lcom/squareup/okhttp/Response;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long p3, v1, v3

    const-wide/16 v3, 0x0

    if-nez p3, :cond_0

    move-wide v1, v3

    .line 296
    :cond_0
    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/internal/http/HttpConnection;->newFixedLengthSource(J)Lokio/Source;

    move-result-object p3

    const v1, 0x7fffffff

    .line 297
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p3, v1, v2}, Lcom/squareup/okhttp/internal/Util;->skipAll(Lokio/Source;ILjava/util/concurrent/TimeUnit;)Z

    .line 298
    invoke-interface {p3}, Lokio/Source;->close()V

    .line 300
    invoke-virtual {p2}, Lcom/squareup/okhttp/Response;->code()I

    move-result p3

    const/16 v1, 0xc8

    if-eq p3, v1, :cond_3

    const/16 v1, 0x197

    if-ne p3, v1, :cond_2

    .line 312
    iget-object p3, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    .line 313
    invoke-virtual {p3}, Lcom/squareup/okhttp/Route;->getAddress()Lcom/squareup/okhttp/Address;

    move-result-object p3

    invoke-virtual {p3}, Lcom/squareup/okhttp/Address;->getAuthenticator()Lcom/squareup/okhttp/Authenticator;

    move-result-object p3

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    invoke-virtual {v1}, Lcom/squareup/okhttp/Route;->getProxy()Ljava/net/Proxy;

    move-result-object v1

    .line 312
    invoke-static {p3, p2, v1}, Lcom/squareup/okhttp/internal/http/OkHeaders;->processAuthHeader(Lcom/squareup/okhttp/Authenticator;Lcom/squareup/okhttp/Response;Ljava/net/Proxy;)Lcom/squareup/okhttp/Request;

    move-result-object p3

    if-eqz p3, :cond_1

    goto :goto_0

    .line 315
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Failed to authenticate with proxy"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 318
    :cond_2
    new-instance p1, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Unexpected response code for CONNECT: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 319
    invoke-virtual {p2}, Lcom/squareup/okhttp/Response;->code()I

    move-result p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 306
    :cond_3
    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->bufferSize()J

    move-result-wide p1

    cmp-long p1, p1, v3

    if-gtz p1, :cond_4

    return-void

    .line 307
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "TLS tunnel buffered too many bytes!"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private createTunnelRequest(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Request;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 332
    new-instance v0, Lcom/squareup/okhttp/HttpUrl$Builder;

    invoke-direct {v0}, Lcom/squareup/okhttp/HttpUrl$Builder;-><init>()V

    const-string v1, "https"

    .line 333
    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/HttpUrl$Builder;->scheme(Ljava/lang/String;)Lcom/squareup/okhttp/HttpUrl$Builder;

    move-result-object v0

    .line 334
    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/HttpUrl;->host()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/HttpUrl$Builder;->host(Ljava/lang/String;)Lcom/squareup/okhttp/HttpUrl$Builder;

    move-result-object v0

    .line 335
    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/HttpUrl;->port()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/HttpUrl$Builder;->port(I)Lcom/squareup/okhttp/HttpUrl$Builder;

    move-result-object v0

    .line 336
    invoke-virtual {v0}, Lcom/squareup/okhttp/HttpUrl$Builder;->build()Lcom/squareup/okhttp/HttpUrl;

    move-result-object v0

    .line 337
    new-instance v1, Lcom/squareup/okhttp/Request$Builder;

    invoke-direct {v1}, Lcom/squareup/okhttp/Request$Builder;-><init>()V

    .line 338
    invoke-virtual {v1, v0}, Lcom/squareup/okhttp/Request$Builder;->url(Lcom/squareup/okhttp/HttpUrl;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v1

    const-string v2, "Host"

    .line 339
    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->hostHeader(Lcom/squareup/okhttp/HttpUrl;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    const-string v1, "Proxy-Connection"

    const-string v2, "Keep-Alive"

    .line 340
    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    .line 343
    const-string v1, "User-Agent"

    invoke-virtual {p1, v1}, Lcom/squareup/okhttp/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 345
    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    .line 349
    :cond_0
    const-string v1, "Proxy-Authorization"

    invoke-virtual {p1, v1}, Lcom/squareup/okhttp/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 351
    invoke-virtual {v0, v1, p1}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    .line 354
    :cond_1
    invoke-virtual {v0}, Lcom/squareup/okhttp/Request$Builder;->build()Lcom/squareup/okhttp/Request;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method clearOwner()Z
    .locals 2

    .line 121
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->pool:Lcom/squareup/okhttp/ConnectionPool;

    monitor-enter v0

    .line 122
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->owner:Ljava/lang/Object;

    if-nez v1, :cond_0

    .line 124
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v1, 0x0

    .line 127
    iput-object v1, p0, Lcom/squareup/okhttp/Connection;->owner:Ljava/lang/Object;

    .line 128
    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    .line 129
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method closeIfOwnedBy(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 137
    invoke-virtual {p0}, Lcom/squareup/okhttp/Connection;->isFramed()Z

    move-result v0

    if-nez v0, :cond_2

    .line 138
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->pool:Lcom/squareup/okhttp/ConnectionPool;

    monitor-enter v0

    .line 139
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->owner:Ljava/lang/Object;

    if-eq v1, p1, :cond_0

    .line 140
    monitor-exit v0

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 143
    iput-object p1, p0, Lcom/squareup/okhttp/Connection;->owner:Ljava/lang/Object;

    .line 144
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    iget-object p1, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    if-eqz p1, :cond_1

    .line 148
    invoke-virtual {p1}, Ljava/net/Socket;->close()V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 144
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 137
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method connect(IIILcom/squareup/okhttp/Request;Ljava/util/List;Z)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Lcom/squareup/okhttp/Request;",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/ConnectionSpec;",
            ">;Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/squareup/okhttp/internal/http/RouteException;
        }
    .end annotation

    move-object v7, p0

    move-object/from16 v0, p5

    .line 154
    iget-boolean v1, v7, Lcom/squareup/okhttp/Connection;->connected:Z

    if-nez v1, :cond_7

    .line 157
    new-instance v8, Lcom/squareup/okhttp/internal/ConnectionSpecSelector;

    invoke-direct {v8, v0}, Lcom/squareup/okhttp/internal/ConnectionSpecSelector;-><init>(Ljava/util/List;)V

    .line 158
    iget-object v1, v7, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    invoke-virtual {v1}, Lcom/squareup/okhttp/Route;->getProxy()Ljava/net/Proxy;

    move-result-object v9

    .line 159
    iget-object v1, v7, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    invoke-virtual {v1}, Lcom/squareup/okhttp/Route;->getAddress()Lcom/squareup/okhttp/Address;

    move-result-object v10

    .line 161
    iget-object v1, v7, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v1, v1, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    invoke-virtual {v1}, Lcom/squareup/okhttp/Address;->getSslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/squareup/okhttp/ConnectionSpec;->CLEARTEXT:Lcom/squareup/okhttp/ConnectionSpec;

    .line 162
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 163
    :cond_0
    new-instance v1, Lcom/squareup/okhttp/internal/http/RouteException;

    new-instance v2, Ljava/net/UnknownServiceException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CLEARTEXT communication not supported: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lcom/squareup/okhttp/internal/http/RouteException;-><init>(Ljava/io/IOException;)V

    throw v1

    :cond_1
    :goto_0
    const/4 v11, 0x0

    move-object v12, v11

    .line 167
    :goto_1
    iget-boolean v0, v7, Lcom/squareup/okhttp/Connection;->connected:Z

    if-nez v0, :cond_6

    .line 169
    :try_start_0
    invoke-virtual {v9}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_3

    invoke-virtual {v9}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_2

    goto :goto_2

    .line 170
    :cond_2
    new-instance v0, Ljava/net/Socket;

    invoke-direct {v0, v9}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-virtual {v10}, Lcom/squareup/okhttp/Address;->getSocketFactory()Ljavax/net/SocketFactory;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    :goto_3
    iput-object v0, v7, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object v6, v8

    .line 172
    invoke-direct/range {v1 .. v6}, Lcom/squareup/okhttp/Connection;->connectSocket(IIILcom/squareup/okhttp/Request;Lcom/squareup/okhttp/internal/ConnectionSpecSelector;)V

    const/4 v0, 0x1

    .line 174
    iput-boolean v0, v7, Lcom/squareup/okhttp/Connection;->connected:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 176
    iget-object v1, v7, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-static {v1}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/net/Socket;)V

    .line 177
    iput-object v11, v7, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    if-nez v12, :cond_4

    .line 180
    new-instance v12, Lcom/squareup/okhttp/internal/http/RouteException;

    invoke-direct {v12, v0}, Lcom/squareup/okhttp/internal/http/RouteException;-><init>(Ljava/io/IOException;)V

    goto :goto_4

    .line 182
    :cond_4
    invoke-virtual {v12, v0}, Lcom/squareup/okhttp/internal/http/RouteException;->addConnectException(Ljava/io/IOException;)V

    :goto_4
    if-eqz p6, :cond_5

    .line 185
    invoke-virtual {v8, v0}, Lcom/squareup/okhttp/internal/ConnectionSpecSelector;->connectionFailed(Ljava/io/IOException;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_1

    .line 186
    :cond_5
    throw v12

    :cond_6
    return-void

    .line 154
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method connectAndSetOwner(Lcom/squareup/okhttp/OkHttpClient;Ljava/lang/Object;Lcom/squareup/okhttp/Request;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/squareup/okhttp/internal/http/RouteException;
        }
    .end annotation

    .line 363
    invoke-virtual {p0, p2}, Lcom/squareup/okhttp/Connection;->setOwner(Ljava/lang/Object;)V

    .line 365
    invoke-virtual {p0}, Lcom/squareup/okhttp/Connection;->isConnected()Z

    move-result p2

    if-nez p2, :cond_1

    .line 366
    iget-object p2, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object p2, p2, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    invoke-virtual {p2}, Lcom/squareup/okhttp/Address;->getConnectionSpecs()Ljava/util/List;

    move-result-object v5

    .line 367
    invoke-virtual {p1}, Lcom/squareup/okhttp/OkHttpClient;->getConnectTimeout()I

    move-result v1

    invoke-virtual {p1}, Lcom/squareup/okhttp/OkHttpClient;->getReadTimeout()I

    move-result v2

    invoke-virtual {p1}, Lcom/squareup/okhttp/OkHttpClient;->getWriteTimeout()I

    move-result v3

    .line 368
    invoke-virtual {p1}, Lcom/squareup/okhttp/OkHttpClient;->getRetryOnConnectionFailure()Z

    move-result v6

    move-object v0, p0

    move-object v4, p3

    .line 367
    invoke-virtual/range {v0 .. v6}, Lcom/squareup/okhttp/Connection;->connect(IIILcom/squareup/okhttp/Request;Ljava/util/List;Z)V

    .line 369
    invoke-virtual {p0}, Lcom/squareup/okhttp/Connection;->isFramed()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 370
    invoke-virtual {p1}, Lcom/squareup/okhttp/OkHttpClient;->getConnectionPool()Lcom/squareup/okhttp/ConnectionPool;

    move-result-object p2

    invoke-virtual {p2, p0}, Lcom/squareup/okhttp/ConnectionPool;->share(Lcom/squareup/okhttp/Connection;)V

    .line 372
    :cond_0
    invoke-virtual {p1}, Lcom/squareup/okhttp/OkHttpClient;->routeDatabase()Lcom/squareup/okhttp/internal/RouteDatabase;

    move-result-object p2

    invoke-virtual {p0}, Lcom/squareup/okhttp/Connection;->getRoute()Lcom/squareup/okhttp/Route;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/squareup/okhttp/internal/RouteDatabase;->connected(Lcom/squareup/okhttp/Route;)V

    .line 375
    :cond_1
    invoke-virtual {p1}, Lcom/squareup/okhttp/OkHttpClient;->getReadTimeout()I

    move-result p2

    invoke-virtual {p1}, Lcom/squareup/okhttp/OkHttpClient;->getWriteTimeout()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/squareup/okhttp/Connection;->setTimeouts(II)V

    return-void
.end method

.method public getHandshake()Lcom/squareup/okhttp/Handshake;
    .locals 1

    .line 440
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->handshake:Lcom/squareup/okhttp/Handshake;

    return-object v0
.end method

.method getIdleStartTimeNs()J
    .locals 2

    .line 436
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->framedConnection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/squareup/okhttp/Connection;->idleStartTimeNs:J

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/framed/FramedConnection;->getIdleStartTimeNs()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method getOwner()Ljava/lang/Object;
    .locals 2

    .line 101
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->pool:Lcom/squareup/okhttp/ConnectionPool;

    monitor-enter v0

    .line 102
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->owner:Ljava/lang/Object;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 103
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getProtocol()Lcom/squareup/okhttp/Protocol;
    .locals 1

    .line 463
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->protocol:Lcom/squareup/okhttp/Protocol;

    return-object v0
.end method

.method public getRoute()Lcom/squareup/okhttp/Route;
    .locals 1

    .line 385
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    return-object v0
.end method

.method public getSocket()Ljava/net/Socket;
    .locals 1

    .line 393
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    return-object v0
.end method

.method incrementRecycleCount()V
    .locals 1

    .line 491
    iget v0, p0, Lcom/squareup/okhttp/Connection;->recycleCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/squareup/okhttp/Connection;->recycleCount:I

    return-void
.end method

.method isAlive()Z
    .locals 1

    .line 408
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method isConnected()Z
    .locals 1

    .line 380
    iget-boolean v0, p0, Lcom/squareup/okhttp/Connection;->connected:Z

    return v0
.end method

.method isFramed()Z
    .locals 1

    .line 455
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->framedConnection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method isIdle()Z
    .locals 1

    .line 428
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->framedConnection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/framed/FramedConnection;->isIdle()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method isReadable()Z
    .locals 1

    .line 417
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->isReadable()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method newTransport(Lcom/squareup/okhttp/internal/http/HttpEngine;)Lcom/squareup/okhttp/internal/http/Transport;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 445
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->framedConnection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/squareup/okhttp/internal/http/FramedTransport;

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->framedConnection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    invoke-direct {v0, p1, v1}, Lcom/squareup/okhttp/internal/http/FramedTransport;-><init>(Lcom/squareup/okhttp/internal/http/HttpEngine;Lcom/squareup/okhttp/internal/framed/FramedConnection;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/squareup/okhttp/internal/http/HttpTransport;

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-direct {v0, p1, v1}, Lcom/squareup/okhttp/internal/http/HttpTransport;-><init>(Lcom/squareup/okhttp/internal/http/HttpEngine;Lcom/squareup/okhttp/internal/http/HttpConnection;)V

    :goto_0
    return-object v0
.end method

.method rawSink()Lokio/BufferedSink;
    .locals 1

    .line 402
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    if-eqz v0, :cond_0

    .line 403
    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->rawSink()Lokio/BufferedSink;

    move-result-object v0

    return-object v0

    .line 402
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method rawSource()Lokio/BufferedSource;
    .locals 1

    .line 397
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    if-eqz v0, :cond_0

    .line 398
    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->rawSource()Lokio/BufferedSource;

    move-result-object v0

    return-object v0

    .line 397
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method recycleCount()I
    .locals 1

    .line 499
    iget v0, p0, Lcom/squareup/okhttp/Connection;->recycleCount:I

    return v0
.end method

.method resetIdleStartTime()V
    .locals 2

    .line 422
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->framedConnection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    if-nez v0, :cond_0

    .line 423
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/squareup/okhttp/Connection;->idleStartTimeNs:J

    return-void

    .line 422
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "framedConnection != null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method setOwner(Ljava/lang/Object;)V
    .locals 2

    .line 107
    invoke-virtual {p0}, Lcom/squareup/okhttp/Connection;->isFramed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->pool:Lcom/squareup/okhttp/ConnectionPool;

    monitor-enter v0

    .line 109
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->owner:Ljava/lang/Object;

    if-nez v1, :cond_1

    .line 110
    iput-object p1, p0, Lcom/squareup/okhttp/Connection;->owner:Ljava/lang/Object;

    .line 111
    monitor-exit v0

    return-void

    .line 109
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Connection already has an owner!"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 111
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method setProtocol(Lcom/squareup/okhttp/Protocol;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 472
    iput-object p1, p0, Lcom/squareup/okhttp/Connection;->protocol:Lcom/squareup/okhttp/Protocol;

    return-void

    .line 471
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "protocol == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method setTimeouts(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/squareup/okhttp/internal/http/RouteException;
        }
    .end annotation

    .line 477
    iget-boolean v0, p0, Lcom/squareup/okhttp/Connection;->connected:Z

    if-eqz v0, :cond_1

    .line 480
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    if-eqz v0, :cond_0

    .line 482
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v0, p1}, Ljava/net/Socket;->setSoTimeout(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 486
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/internal/http/HttpConnection;->setTimeouts(II)V

    goto :goto_0

    :catch_0
    move-exception p1

    .line 484
    new-instance p2, Lcom/squareup/okhttp/internal/http/RouteException;

    invoke-direct {p2, p1}, Lcom/squareup/okhttp/internal/http/RouteException;-><init>(Ljava/io/IOException;)V

    throw p2

    :cond_0
    :goto_0
    return-void

    .line 477
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "setTimeouts - not connected"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 503
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Connection{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v1, v1, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    iget-object v1, v1, Lcom/squareup/okhttp/Address;->uriHost:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v1, v1, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    iget v1, v1, Lcom/squareup/okhttp/Address;->uriPort:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v1, v1, Lcom/squareup/okhttp/Route;->proxy:Ljava/net/Proxy;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " hostAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v1, v1, Lcom/squareup/okhttp/Route;->inetSocketAddress:Ljava/net/InetSocketAddress;

    .line 508
    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->handshake:Lcom/squareup/okhttp/Handshake;

    if-eqz v1, :cond_0

    .line 510
    invoke-virtual {v1}, Lcom/squareup/okhttp/Handshake;->cipherSuite()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "none"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->protocol:Lcom/squareup/okhttp/Protocol;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
