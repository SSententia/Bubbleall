.class Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;
.super Ljava/lang/Object;
.source "HttpEngine.java"

# interfaces
.implements Lcom/squareup/okhttp/Interceptor$Chain;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/http/HttpEngine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "NetworkInterceptorChain"
.end annotation


# instance fields
.field private calls:I

.field private final index:I

.field private final request:Lcom/squareup/okhttp/Request;

.field final synthetic this$0:Lcom/squareup/okhttp/internal/http/HttpEngine;


# direct methods
.method constructor <init>(Lcom/squareup/okhttp/internal/http/HttpEngine;ILcom/squareup/okhttp/Request;)V
    .locals 0

    .line 830
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 831
    iput p2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->index:I

    .line 832
    iput-object p3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->request:Lcom/squareup/okhttp/Request;

    return-void
.end method


# virtual methods
.method public connection()Lcom/squareup/okhttp/Connection;
    .locals 1

    .line 836
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->access$000(Lcom/squareup/okhttp/internal/http/HttpEngine;)Lcom/squareup/okhttp/Connection;

    move-result-object v0

    return-object v0
.end method

.method public proceed(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Response;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 844
    iget v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->calls:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->calls:I

    .line 846
    iget v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->index:I

    const-string v2, " must call proceed() exactly once"

    const-string v3, "network interceptor "

    if-lez v0, :cond_2

    .line 847
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->networkInterceptors()Ljava/util/List;

    move-result-object v0

    iget v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->index:I

    sub-int/2addr v4, v1

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/okhttp/Interceptor;

    .line 848
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->connection()Lcom/squareup/okhttp/Connection;

    move-result-object v4

    invoke-virtual {v4}, Lcom/squareup/okhttp/Connection;->getRoute()Lcom/squareup/okhttp/Route;

    move-result-object v4

    invoke-virtual {v4}, Lcom/squareup/okhttp/Route;->getAddress()Lcom/squareup/okhttp/Address;

    move-result-object v4

    .line 851
    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object v5

    invoke-virtual {v5}, Lcom/squareup/okhttp/HttpUrl;->host()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lcom/squareup/okhttp/Address;->getUriHost()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 852
    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object v5

    invoke-virtual {v5}, Lcom/squareup/okhttp/HttpUrl;->port()I

    move-result v5

    invoke-virtual {v4}, Lcom/squareup/okhttp/Address;->getUriPort()I

    move-result v4

    if-ne v5, v4, :cond_1

    .line 858
    iget v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->calls:I

    if-gt v4, v1, :cond_0

    goto :goto_0

    .line 859
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 853
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " must retain the same host and port"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 864
    :cond_2
    :goto_0
    iget v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->index:I

    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v4, v4, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v4}, Lcom/squareup/okhttp/OkHttpClient;->networkInterceptors()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_4

    .line 866
    new-instance v0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;

    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget v5, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->index:I

    add-int/2addr v5, v1

    invoke-direct {v0, v4, v5, p1}, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;-><init>(Lcom/squareup/okhttp/internal/http/HttpEngine;ILcom/squareup/okhttp/Request;)V

    .line 867
    iget-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object p1, p1, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {p1}, Lcom/squareup/okhttp/OkHttpClient;->networkInterceptors()Ljava/util/List;

    move-result-object p1

    iget v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->index:I

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/squareup/okhttp/Interceptor;

    .line 868
    invoke-interface {p1, v0}, Lcom/squareup/okhttp/Interceptor;->intercept(Lcom/squareup/okhttp/Interceptor$Chain;)Lcom/squareup/okhttp/Response;

    move-result-object v4

    .line 871
    iget v0, v0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->calls:I

    if-ne v0, v1, :cond_3

    return-object v4

    .line 872
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 879
    :cond_4
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->access$100(Lcom/squareup/okhttp/internal/http/HttpEngine;)Lcom/squareup/okhttp/internal/http/Transport;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/squareup/okhttp/internal/http/Transport;->writeRequestHeaders(Lcom/squareup/okhttp/Request;)V

    .line 882
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-static {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->access$202(Lcom/squareup/okhttp/internal/http/HttpEngine;Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Request;

    .line 884
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->permitsRequestBody()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->body()Lcom/squareup/okhttp/RequestBody;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 885
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->access$100(Lcom/squareup/okhttp/internal/http/HttpEngine;)Lcom/squareup/okhttp/internal/http/Transport;

    move-result-object v0

    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->body()Lcom/squareup/okhttp/RequestBody;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/RequestBody;->contentLength()J

    move-result-wide v1

    invoke-interface {v0, p1, v1, v2}, Lcom/squareup/okhttp/internal/http/Transport;->createRequestBody(Lcom/squareup/okhttp/Request;J)Lokio/Sink;

    move-result-object v0

    .line 886
    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v0

    .line 887
    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->body()Lcom/squareup/okhttp/RequestBody;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/squareup/okhttp/RequestBody;->writeTo(Lokio/BufferedSink;)V

    .line 888
    invoke-interface {v0}, Lokio/BufferedSink;->close()V

    .line 891
    :cond_5
    iget-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-static {p1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->access$300(Lcom/squareup/okhttp/internal/http/HttpEngine;)Lcom/squareup/okhttp/Response;

    move-result-object p1

    .line 893
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->code()I

    move-result v0

    const/16 v1, 0xcc

    if-eq v0, v1, :cond_6

    const/16 v1, 0xcd

    if-ne v0, v1, :cond_7

    .line 894
    :cond_6
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/ResponseBody;->contentLength()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-gtz v1, :cond_8

    :cond_7
    return-object p1

    .line 895
    :cond_8
    new-instance v1, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "HTTP "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " had non-zero Content-Length: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 896
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object p1

    invoke-virtual {p1}, Lcom/squareup/okhttp/ResponseBody;->contentLength()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public request()Lcom/squareup/okhttp/Request;
    .locals 1

    .line 840
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->request:Lcom/squareup/okhttp/Request;

    return-object v0
.end method
