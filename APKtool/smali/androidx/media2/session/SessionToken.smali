.class public final Landroidx/media2/session/SessionToken;
.super Ljava/lang/Object;
.source "SessionToken.java"

# interfaces
.implements Landroidx/versionedparcelable/VersionedParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/session/SessionToken$SessionTokenImpl;,
        Landroidx/media2/session/SessionToken$OnSessionTokenCreatedListener;,
        Landroidx/media2/session/SessionToken$TokenType;
    }
.end annotation


# static fields
.field private static final MSG_SEND_TOKEN2_FOR_LEGACY_SESSION:I = 0x3e8

.field private static final TAG:Ljava/lang/String; = "SessionToken"

.field static final TYPE_BROWSER_SERVICE_LEGACY:I = 0x65

.field public static final TYPE_LIBRARY_SERVICE:I = 0x2

.field public static final TYPE_SESSION:I = 0x0

.field static final TYPE_SESSION_LEGACY:I = 0x64

.field public static final TYPE_SESSION_SERVICE:I = 0x1

.field private static final WAIT_TIME_MS_FOR_SESSION_READY:J = 0x12cL


# instance fields
.field mImpl:Landroidx/media2/session/SessionToken$SessionTokenImpl;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 159
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;)V
    .locals 3

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_5

    if-eqz p2, :cond_4

    .line 127
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    .line 128
    invoke-virtual {p2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/media2/session/SessionToken;->getUid(Landroid/content/pm/PackageManager;Ljava/lang/String;)I

    move-result v0

    .line 131
    const-string v1, "androidx.media2.session.MediaLibraryService"

    invoke-static {p1, v1, p2}, Landroidx/media2/session/SessionToken;->isInterfaceDeclared(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/ComponentName;)Z

    move-result v1

    const/16 v2, 0x65

    if-eqz v1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    .line 134
    :cond_0
    const-string v1, "androidx.media2.session.MediaSessionService"

    invoke-static {p1, v1, p2}, Landroidx/media2/session/SessionToken;->isInterfaceDeclared(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/ComponentName;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    .line 137
    :cond_1
    const-string v1, "android.media.browse.MediaBrowserService"

    invoke-static {p1, v1, p2}, Landroidx/media2/session/SessionToken;->isInterfaceDeclared(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/ComponentName;)Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v2

    :goto_0
    if-eq p1, v2, :cond_2

    .line 146
    new-instance v1, Landroidx/media2/session/SessionTokenImplBase;

    invoke-direct {v1, p2, v0, p1}, Landroidx/media2/session/SessionTokenImplBase;-><init>(Landroid/content/ComponentName;II)V

    iput-object v1, p0, Landroidx/media2/session/SessionToken;->mImpl:Landroidx/media2/session/SessionToken$SessionTokenImpl;

    goto :goto_1

    .line 148
    :cond_2
    new-instance p1, Landroidx/media2/session/SessionTokenImplLegacy;

    invoke-direct {p1, p2, v0}, Landroidx/media2/session/SessionTokenImplLegacy;-><init>(Landroid/content/ComponentName;I)V

    iput-object p1, p0, Landroidx/media2/session/SessionToken;->mImpl:Landroidx/media2/session/SessionToken$SessionTokenImpl;

    :goto_1
    return-void

    .line 141
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " doesn\'t implement none of MediaSessionService, MediaLibraryService, MediaBrowserService nor MediaBrowserServiceCompat. Use service\'s full name"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 125
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "serviceComponent shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 122
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "context shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method constructor <init>(Landroidx/media2/session/SessionToken$SessionTokenImpl;)V
    .locals 0

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    iput-object p1, p0, Landroidx/media2/session/SessionToken;->mImpl:Landroidx/media2/session/SessionToken$SessionTokenImpl;

    return-void
.end method

.method private static createMediaControllerCompat(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)Landroid/support/v4/media/session/MediaControllerCompat;
    .locals 1

    .line 391
    new-instance v0, Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-direct {v0, p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    return-object v0
.end method

.method public static createSessionToken(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;Landroidx/media2/session/SessionToken$OnSessionTokenCreatedListener;)V
    .locals 13

    if-eqz p0, :cond_3

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    .line 274
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->getSession2Token()Landroidx/versionedparcelable/VersionedParcelable;

    move-result-object v0

    .line 275
    instance-of v1, v0, Landroidx/media2/session/SessionToken;

    if-eqz v1, :cond_0

    .line 276
    check-cast v0, Landroidx/media2/session/SessionToken;

    invoke-interface {p2, p1, v0}, Landroidx/media2/session/SessionToken$OnSessionTokenCreatedListener;->onSessionTokenCreated(Landroid/support/v4/media/session/MediaSessionCompat$Token;Landroidx/media2/session/SessionToken;)V

    return-void

    .line 281
    :cond_0
    invoke-static {p0, p1}, Landroidx/media2/session/SessionToken;->createMediaControllerCompat(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)Landroid/support/v4/media/session/MediaControllerCompat;

    move-result-object v0

    .line 283
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->getPackageName()Ljava/lang/String;

    move-result-object v9

    .line 284
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    invoke-static {p0, v9}, Landroidx/media2/session/SessionToken;->getUid(Landroid/content/pm/PackageManager;Ljava/lang/String;)I

    move-result p0

    .line 285
    new-instance v10, Landroid/os/HandlerThread;

    const-string v1, "SessionToken"

    invoke-direct {v10, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 286
    invoke-virtual {v10}, Landroid/os/HandlerThread;->start()V

    .line 287
    new-instance v11, Landroidx/media2/session/SessionToken$1;

    invoke-virtual {v10}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    move-object v1, v11

    move-object v3, p2

    move-object v4, v0

    move-object v5, p1

    move-object v6, v9

    move v7, p0

    move-object v8, v10

    invoke-direct/range {v1 .. v8}, Landroidx/media2/session/SessionToken$1;-><init>(Landroid/os/Looper;Landroidx/media2/session/SessionToken$OnSessionTokenCreatedListener;Landroid/support/v4/media/session/MediaControllerCompat;Landroid/support/v4/media/session/MediaSessionCompat$Token;Ljava/lang/String;ILandroid/os/HandlerThread;)V

    .line 311
    new-instance v12, Landroidx/media2/session/SessionToken$2;

    move-object v1, v12

    move-object v2, p2

    move-object v3, v11

    invoke-direct/range {v1 .. v8}, Landroidx/media2/session/SessionToken$2;-><init>(Landroidx/media2/session/SessionToken$OnSessionTokenCreatedListener;Landroid/os/Handler;Landroid/support/v4/media/session/MediaControllerCompat;Landroid/support/v4/media/session/MediaSessionCompat$Token;Ljava/lang/String;ILandroid/os/HandlerThread;)V

    .line 340
    monitor-enter p2

    .line 341
    :try_start_0
    invoke-virtual {v0, v12, v11}, Landroid/support/v4/media/session/MediaControllerCompat;->registerCallback(Landroid/support/v4/media/session/MediaControllerCompat$Callback;Landroid/os/Handler;)V

    const/16 p0, 0x3e8

    .line 342
    invoke-virtual {v11, p0, v12}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p0

    const-wide/16 v0, 0x12c

    .line 343
    invoke-virtual {v11, p0, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 344
    monitor-exit p2

    return-void

    :catchall_0
    move-exception p0

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 270
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "listener shouldn\'t be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 267
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "compatToken shouldn\'t be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 264
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "context shouldn\'t be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static getUid(Landroid/content/pm/PackageManager;Ljava/lang/String;)I
    .locals 2

    const/4 v0, 0x0

    .line 383
    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget p0, p0, Landroid/content/pm/ApplicationInfo;->uid:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    .line 385
    :catch_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot find package "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static isInterfaceDeclared(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/ComponentName;)Z
    .locals 3

    .line 358
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 362
    invoke-virtual {p2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/16 p1, 0x80

    .line 364
    invoke-virtual {p0, v0, p1}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p0

    const/4 p1, 0x0

    if-eqz p0, :cond_2

    move v0, p1

    .line 367
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 368
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ResolveInfo;

    if-eqz v1, :cond_1

    .line 369
    iget-object v2, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-nez v2, :cond_0

    goto :goto_1

    .line 372
    :cond_0
    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 373
    invoke-virtual {p2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v2

    .line 372
    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return p1
.end method

.method static quitHandlerThread(Landroid/os/HandlerThread;)V
    .locals 0

    .line 350
    invoke-static {p0}, Landroidx/media2/common/ClassVerificationHelper$HandlerThread$Api18;->quitSafely(Landroid/os/HandlerThread;)Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 170
    instance-of v0, p1, Landroidx/media2/session/SessionToken;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 173
    :cond_0
    check-cast p1, Landroidx/media2/session/SessionToken;

    .line 174
    iget-object v0, p0, Landroidx/media2/session/SessionToken;->mImpl:Landroidx/media2/session/SessionToken$SessionTokenImpl;

    iget-object p1, p1, Landroidx/media2/session/SessionToken;->mImpl:Landroidx/media2/session/SessionToken$SessionTokenImpl;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getBinder()Ljava/lang/Object;
    .locals 1

    .line 251
    iget-object v0, p0, Landroidx/media2/session/SessionToken;->mImpl:Landroidx/media2/session/SessionToken$SessionTokenImpl;

    invoke-interface {v0}, Landroidx/media2/session/SessionToken$SessionTokenImpl;->getBinder()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getComponentName()Landroid/content/ComponentName;
    .locals 1

    .line 211
    iget-object v0, p0, Landroidx/media2/session/SessionToken;->mImpl:Landroidx/media2/session/SessionToken$SessionTokenImpl;

    invoke-interface {v0}, Landroidx/media2/session/SessionToken$SessionTokenImpl;->getComponentName()Landroid/content/ComponentName;

    move-result-object v0

    return-object v0
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 2

    .line 231
    iget-object v0, p0, Landroidx/media2/session/SessionToken;->mImpl:Landroidx/media2/session/SessionToken$SessionTokenImpl;

    invoke-interface {v0}, Landroidx/media2/session/SessionToken$SessionTokenImpl;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 232
    invoke-static {v0}, Landroidx/media2/session/MediaUtils;->doesBundleHaveCustomParcelable(Landroid/os/Bundle;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 235
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    return-object v1

    .line 233
    :cond_1
    :goto_0
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 194
    iget-object v0, p0, Landroidx/media2/session/SessionToken;->mImpl:Landroidx/media2/session/SessionToken$SessionTokenImpl;

    invoke-interface {v0}, Landroidx/media2/session/SessionToken$SessionTokenImpl;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getServiceName()Ljava/lang/String;
    .locals 1

    .line 202
    iget-object v0, p0, Landroidx/media2/session/SessionToken;->mImpl:Landroidx/media2/session/SessionToken$SessionTokenImpl;

    invoke-interface {v0}, Landroidx/media2/session/SessionToken$SessionTokenImpl;->getServiceName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 222
    iget-object v0, p0, Landroidx/media2/session/SessionToken;->mImpl:Landroidx/media2/session/SessionToken$SessionTokenImpl;

    invoke-interface {v0}, Landroidx/media2/session/SessionToken$SessionTokenImpl;->getType()I

    move-result v0

    return v0
.end method

.method public getUid()I
    .locals 1

    .line 186
    iget-object v0, p0, Landroidx/media2/session/SessionToken;->mImpl:Landroidx/media2/session/SessionToken$SessionTokenImpl;

    invoke-interface {v0}, Landroidx/media2/session/SessionToken$SessionTokenImpl;->getUid()I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 165
    iget-object v0, p0, Landroidx/media2/session/SessionToken;->mImpl:Landroidx/media2/session/SessionToken$SessionTokenImpl;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public isLegacySession()Z
    .locals 1

    .line 243
    iget-object v0, p0, Landroidx/media2/session/SessionToken;->mImpl:Landroidx/media2/session/SessionToken$SessionTokenImpl;

    invoke-interface {v0}, Landroidx/media2/session/SessionToken$SessionTokenImpl;->isLegacySession()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Landroidx/media2/session/SessionToken;->mImpl:Landroidx/media2/session/SessionToken$SessionTokenImpl;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
