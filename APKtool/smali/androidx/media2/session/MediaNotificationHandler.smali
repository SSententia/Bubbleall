.class Landroidx/media2/session/MediaNotificationHandler;
.super Landroidx/media2/session/MediaSession$SessionCallback$ForegroundServiceEventCallback;
.source "MediaNotificationHandler.java"


# static fields
.field private static final NOTIFICATION_CHANNEL_ID:Ljava/lang/String; = "default_channel_id"

.field private static final NOTIFICATION_ID:I = 0x3e9


# instance fields
.field private final mNotificationChannelName:Ljava/lang/String;

.field private final mNotificationManagerCompat:Landroidx/core/app/NotificationManagerCompat;

.field private final mPauseAction:Landroidx/core/app/NotificationCompat$Action;

.field private final mPlayAction:Landroidx/core/app/NotificationCompat$Action;

.field private final mServiceInstance:Landroidx/media2/session/MediaSessionService;

.field private final mSkipToNextAction:Landroidx/core/app/NotificationCompat$Action;

.field private final mSkipToPrevAction:Landroidx/core/app/NotificationCompat$Action;

.field private final mStartSelfIntent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionService;)V
    .locals 3

    .line 63
    invoke-direct {p0}, Landroidx/media2/session/MediaSession$SessionCallback$ForegroundServiceEventCallback;-><init>()V

    .line 64
    iput-object p1, p0, Landroidx/media2/session/MediaNotificationHandler;->mServiceInstance:Landroidx/media2/session/MediaSessionService;

    .line 65
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Landroidx/media2/session/MediaNotificationHandler;->mStartSelfIntent:Landroid/content/Intent;

    .line 67
    invoke-static {p1}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v0

    iput-object v0, p0, Landroidx/media2/session/MediaNotificationHandler;->mNotificationManagerCompat:Landroidx/core/app/NotificationManagerCompat;

    .line 68
    invoke-virtual {p1}, Landroidx/media2/session/MediaSessionService;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Landroidx/media2/session/R$string;->default_notification_channel_name:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaNotificationHandler;->mNotificationChannelName:Ljava/lang/String;

    .line 71
    sget p1, Landroidx/media2/session/R$drawable;->media_session_service_notification_ic_play:I

    sget v0, Landroidx/media2/session/R$string;->play_button_content_description:I

    const-wide/16 v1, 0x4

    invoke-direct {p0, p1, v0, v1, v2}, Landroidx/media2/session/MediaNotificationHandler;->createNotificationAction(IIJ)Landroidx/core/app/NotificationCompat$Action;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaNotificationHandler;->mPlayAction:Landroidx/core/app/NotificationCompat$Action;

    .line 74
    sget p1, Landroidx/media2/session/R$drawable;->media_session_service_notification_ic_pause:I

    sget v0, Landroidx/media2/session/R$string;->pause_button_content_description:I

    const-wide/16 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v2}, Landroidx/media2/session/MediaNotificationHandler;->createNotificationAction(IIJ)Landroidx/core/app/NotificationCompat$Action;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaNotificationHandler;->mPauseAction:Landroidx/core/app/NotificationCompat$Action;

    .line 77
    sget p1, Landroidx/media2/session/R$drawable;->media_session_service_notification_ic_skip_to_previous:I

    sget v0, Landroidx/media2/session/R$string;->skip_to_previous_item_button_content_description:I

    const-wide/16 v1, 0x10

    invoke-direct {p0, p1, v0, v1, v2}, Landroidx/media2/session/MediaNotificationHandler;->createNotificationAction(IIJ)Landroidx/core/app/NotificationCompat$Action;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaNotificationHandler;->mSkipToPrevAction:Landroidx/core/app/NotificationCompat$Action;

    .line 80
    sget p1, Landroidx/media2/session/R$drawable;->media_session_service_notification_ic_skip_to_next:I

    sget v0, Landroidx/media2/session/R$string;->skip_to_next_item_button_content_description:I

    const-wide/16 v1, 0x20

    invoke-direct {p0, p1, v0, v1, v2}, Landroidx/media2/session/MediaNotificationHandler;->createNotificationAction(IIJ)Landroidx/core/app/NotificationCompat$Action;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaNotificationHandler;->mSkipToNextAction:Landroidx/core/app/NotificationCompat$Action;

    return-void
.end method

.method private createNotificationAction(IIJ)Landroidx/core/app/NotificationCompat$Action;
    .locals 1

    .line 223
    iget-object v0, p0, Landroidx/media2/session/MediaNotificationHandler;->mServiceInstance:Landroidx/media2/session/MediaSessionService;

    invoke-virtual {v0}, Landroidx/media2/session/MediaSessionService;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p2

    .line 224
    new-instance v0, Landroidx/core/app/NotificationCompat$Action;

    invoke-direct {p0, p3, p4}, Landroidx/media2/session/MediaNotificationHandler;->createPendingIntent(J)Landroid/app/PendingIntent;

    move-result-object p3

    invoke-direct {v0, p1, p2, p3}, Landroidx/core/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    return-object v0
.end method

.method private createPendingIntent(J)Landroid/app/PendingIntent;
    .locals 5

    .line 228
    invoke-static {p1, p2}, Landroid/support/v4/media/session/PlaybackStateCompat;->toKeyCode(J)I

    move-result v0

    .line 229
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.MEDIA_BUTTON"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 230
    new-instance v2, Landroid/content/ComponentName;

    iget-object v3, p0, Landroidx/media2/session/MediaNotificationHandler;->mServiceInstance:Landroidx/media2/session/MediaSessionService;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 231
    new-instance v2, Landroid/view/KeyEvent;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Landroid/view/KeyEvent;-><init>(II)V

    const-string v3, "android.intent.extra.KEY_EVENT"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 233
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1a

    const/high16 v4, 0x4000000

    if-lt v2, v3, :cond_0

    const-wide/16 v2, 0x2

    cmp-long v2, p1, v2

    if-eqz v2, :cond_0

    const-wide/16 v2, 0x1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_0

    .line 234
    iget-object p1, p0, Landroidx/media2/session/MediaNotificationHandler;->mServiceInstance:Landroidx/media2/session/MediaSessionService;

    invoke-static {p1, v0, v1, v4}, Landroidx/media2/common/ClassVerificationHelper$PendingIntent$Api26;->getForegroundService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1

    .line 238
    :cond_0
    iget-object p1, p0, Landroidx/media2/session/MediaNotificationHandler;->mServiceInstance:Landroidx/media2/session/MediaSessionService;

    invoke-static {p1, v0, v1, v4}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method private ensureNotificationChannel()V
    .locals 3

    .line 245
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    return-void

    .line 248
    :cond_0
    iget-object v0, p0, Landroidx/media2/session/MediaNotificationHandler;->mNotificationManagerCompat:Landroidx/core/app/NotificationManagerCompat;

    const-string v1, "default_channel_id"

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationManagerCompat;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object v0

    if-eqz v0, :cond_1

    return-void

    .line 252
    :cond_1
    new-instance v0, Landroidx/core/app/NotificationChannelCompat$Builder;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/core/app/NotificationChannelCompat$Builder;-><init>(Ljava/lang/String;I)V

    iget-object v1, p0, Landroidx/media2/session/MediaNotificationHandler;->mNotificationChannelName:Ljava/lang/String;

    .line 255
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationChannelCompat$Builder;->setName(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationChannelCompat$Builder;

    move-result-object v0

    .line 256
    invoke-virtual {v0}, Landroidx/core/app/NotificationChannelCompat$Builder;->build()Landroidx/core/app/NotificationChannelCompat;

    move-result-object v0

    .line 257
    iget-object v1, p0, Landroidx/media2/session/MediaNotificationHandler;->mNotificationManagerCompat:Landroidx/core/app/NotificationManagerCompat;

    invoke-virtual {v1, v0}, Landroidx/core/app/NotificationManagerCompat;->createNotificationChannel(Landroidx/core/app/NotificationChannelCompat;)V

    return-void
.end method

.method private getSmallIconResId()I
    .locals 1

    .line 261
    iget-object v0, p0, Landroidx/media2/session/MediaNotificationHandler;->mServiceInstance:Landroidx/media2/session/MediaSessionService;

    invoke-virtual {v0}, Landroidx/media2/session/MediaSessionService;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    if-eqz v0, :cond_0

    return v0

    .line 266
    :cond_0
    sget v0, Landroidx/media2/session/R$drawable;->media_session_service_notification_ic_music_note:I

    return v0
.end method

.method static isPlaybackStopped(I)Z
    .locals 2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    if-eqz p0, :cond_1

    const/4 v1, 0x3

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method

.method private stopForegroundServiceIfNeeded()V
    .locals 4

    .line 159
    iget-object v0, p0, Landroidx/media2/session/MediaNotificationHandler;->mServiceInstance:Landroidx/media2/session/MediaSessionService;

    invoke-virtual {v0}, Landroidx/media2/session/MediaSessionService;->getSessions()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    .line 160
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 161
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/media2/session/MediaSession;

    invoke-virtual {v3}, Landroidx/media2/session/MediaSession;->getPlayer()Landroidx/media2/common/SessionPlayer;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/media2/common/SessionPlayer;->getPlayerState()I

    move-result v3

    invoke-static {v3}, Landroidx/media2/session/MediaNotificationHandler;->isPlaybackStopped(I)Z

    move-result v3

    if-nez v3, :cond_0

    return-void

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 168
    :cond_1
    iget-object v0, p0, Landroidx/media2/session/MediaNotificationHandler;->mServiceInstance:Landroidx/media2/session/MediaSessionService;

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaSessionService;->stopForeground(Z)V

    return-void
.end method


# virtual methods
.method public onNotificationUpdateNeeded(Landroidx/media2/session/MediaSession;)V
    .locals 4

    .line 130
    iget-object v0, p0, Landroidx/media2/session/MediaNotificationHandler;->mServiceInstance:Landroidx/media2/session/MediaSessionService;

    .line 131
    invoke-virtual {v0, p1}, Landroidx/media2/session/MediaSessionService;->onUpdateNotification(Landroidx/media2/session/MediaSession;)Landroidx/media2/session/MediaSessionService$MediaNotification;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 138
    :cond_0
    invoke-virtual {v0}, Landroidx/media2/session/MediaSessionService$MediaNotification;->getNotificationId()I

    move-result v1

    .line 139
    invoke-virtual {v0}, Landroidx/media2/session/MediaSessionService$MediaNotification;->getNotification()Landroid/app/Notification;

    move-result-object v0

    .line 145
    invoke-virtual {p1}, Landroidx/media2/session/MediaSession;->getSessionCompat()Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaSessionCompat;->getSessionToken()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->getToken()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/session/MediaSession$Token;

    .line 146
    iget-object v2, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    const-string v3, "android.mediaSession"

    invoke-virtual {v2, v3, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 149
    iget-object p1, p0, Landroidx/media2/session/MediaNotificationHandler;->mNotificationManagerCompat:Landroidx/core/app/NotificationManagerCompat;

    invoke-virtual {p1, v1, v0}, Landroidx/core/app/NotificationManagerCompat;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public onPlayerStateChanged(Landroidx/media2/session/MediaSession;I)V
    .locals 4

    .line 94
    iget-object v0, p0, Landroidx/media2/session/MediaNotificationHandler;->mServiceInstance:Landroidx/media2/session/MediaSessionService;

    .line 95
    invoke-virtual {v0, p1}, Landroidx/media2/session/MediaSessionService;->onUpdateNotification(Landroidx/media2/session/MediaSession;)Landroidx/media2/session/MediaSessionService$MediaNotification;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 102
    :cond_0
    invoke-virtual {v0}, Landroidx/media2/session/MediaSessionService$MediaNotification;->getNotificationId()I

    move-result v1

    .line 103
    invoke-virtual {v0}, Landroidx/media2/session/MediaSessionService$MediaNotification;->getNotification()Landroid/app/Notification;

    move-result-object v0

    .line 109
    invoke-virtual {p1}, Landroidx/media2/session/MediaSession;->getSessionCompat()Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaSessionCompat;->getSessionToken()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->getToken()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/session/MediaSession$Token;

    .line 110
    iget-object v2, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    const-string v3, "android.mediaSession"

    invoke-virtual {v2, v3, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 113
    invoke-static {p2}, Landroidx/media2/session/MediaNotificationHandler;->isPlaybackStopped(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 114
    invoke-direct {p0}, Landroidx/media2/session/MediaNotificationHandler;->stopForegroundServiceIfNeeded()V

    .line 115
    iget-object p1, p0, Landroidx/media2/session/MediaNotificationHandler;->mNotificationManagerCompat:Landroidx/core/app/NotificationManagerCompat;

    invoke-virtual {p1, v1, v0}, Landroidx/core/app/NotificationManagerCompat;->notify(ILandroid/app/Notification;)V

    return-void

    .line 120
    :cond_1
    iget-object p1, p0, Landroidx/media2/session/MediaNotificationHandler;->mServiceInstance:Landroidx/media2/session/MediaSessionService;

    iget-object p2, p0, Landroidx/media2/session/MediaNotificationHandler;->mStartSelfIntent:Landroid/content/Intent;

    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->startForegroundService(Landroid/content/Context;Landroid/content/Intent;)V

    .line 121
    iget-object p1, p0, Landroidx/media2/session/MediaNotificationHandler;->mServiceInstance:Landroidx/media2/session/MediaSessionService;

    invoke-virtual {p1, v1, v0}, Landroidx/media2/session/MediaSessionService;->startForeground(ILandroid/app/Notification;)V

    return-void
.end method

.method public onSessionClosed(Landroidx/media2/session/MediaSession;)V
    .locals 1

    .line 154
    iget-object v0, p0, Landroidx/media2/session/MediaNotificationHandler;->mServiceInstance:Landroidx/media2/session/MediaSessionService;

    invoke-virtual {v0, p1}, Landroidx/media2/session/MediaSessionService;->removeSession(Landroidx/media2/session/MediaSession;)V

    .line 155
    invoke-direct {p0}, Landroidx/media2/session/MediaNotificationHandler;->stopForegroundServiceIfNeeded()V

    return-void
.end method

.method public onUpdateNotification(Landroidx/media2/session/MediaSession;)Landroidx/media2/session/MediaSessionService$MediaNotification;
    .locals 6

    .line 175
    invoke-direct {p0}, Landroidx/media2/session/MediaNotificationHandler;->ensureNotificationChannel()V

    .line 177
    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v1, p0, Landroidx/media2/session/MediaNotificationHandler;->mServiceInstance:Landroidx/media2/session/MediaSessionService;

    const-string v2, "default_channel_id"

    invoke-direct {v0, v1, v2}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 181
    iget-object v1, p0, Landroidx/media2/session/MediaNotificationHandler;->mSkipToPrevAction:Landroidx/core/app/NotificationCompat$Action;

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->addAction(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;

    .line 182
    invoke-virtual {p1}, Landroidx/media2/session/MediaSession;->getPlayer()Landroidx/media2/common/SessionPlayer;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/media2/common/SessionPlayer;->getPlayerState()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 183
    iget-object v1, p0, Landroidx/media2/session/MediaNotificationHandler;->mPauseAction:Landroidx/core/app/NotificationCompat$Action;

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->addAction(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;

    goto :goto_0

    .line 185
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaNotificationHandler;->mPlayAction:Landroidx/core/app/NotificationCompat$Action;

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->addAction(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;

    .line 187
    :goto_0
    iget-object v1, p0, Landroidx/media2/session/MediaNotificationHandler;->mSkipToNextAction:Landroidx/core/app/NotificationCompat$Action;

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->addAction(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;

    .line 190
    invoke-virtual {p1}, Landroidx/media2/session/MediaSession;->getPlayer()Landroidx/media2/common/SessionPlayer;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/media2/common/SessionPlayer;->getCurrentMediaItem()Landroidx/media2/common/MediaItem;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 191
    invoke-virtual {p1}, Landroidx/media2/session/MediaSession;->getPlayer()Landroidx/media2/common/SessionPlayer;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/media2/common/SessionPlayer;->getCurrentMediaItem()Landroidx/media2/common/MediaItem;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/media2/common/MediaItem;->getMetadata()Landroidx/media2/common/MediaMetadata;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 193
    const-string v2, "android.media.metadata.DISPLAY_TITLE"

    invoke-virtual {v1, v2}, Landroidx/media2/common/MediaMetadata;->getText(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    if-nez v2, :cond_1

    .line 195
    const-string v2, "android.media.metadata.TITLE"

    invoke-virtual {v1, v2}, Landroidx/media2/common/MediaMetadata;->getText(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    .line 197
    :cond_1
    invoke-virtual {v0, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v2

    const-string v3, "android.media.metadata.ARTIST"

    .line 198
    invoke-virtual {v1, v3}, Landroidx/media2/common/MediaMetadata;->getText(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v2

    const-string v3, "android.media.metadata.ALBUM_ART"

    .line 199
    invoke-virtual {v1, v3}, Landroidx/media2/common/MediaMetadata;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroidx/core/app/NotificationCompat$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroidx/core/app/NotificationCompat$Builder;

    .line 203
    :cond_2
    new-instance v1, Landroidx/media/app/NotificationCompat$MediaStyle;

    invoke-direct {v1}, Landroidx/media/app/NotificationCompat$MediaStyle;-><init>()V

    const-wide/16 v2, 0x1

    .line 204
    invoke-direct {p0, v2, v3}, Landroidx/media2/session/MediaNotificationHandler;->createPendingIntent(J)Landroid/app/PendingIntent;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/media/app/NotificationCompat$MediaStyle;->setCancelButtonIntent(Landroid/app/PendingIntent;)Landroidx/media/app/NotificationCompat$MediaStyle;

    move-result-object v1

    .line 205
    invoke-virtual {p1}, Landroidx/media2/session/MediaSession;->getSessionCompat()Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object v4

    invoke-virtual {v4}, Landroid/support/v4/media/session/MediaSessionCompat;->getSessionToken()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/media/app/NotificationCompat$MediaStyle;->setMediaSession(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Landroidx/media/app/NotificationCompat$MediaStyle;

    move-result-object v1

    const/4 v4, 0x1

    filled-new-array {v4}, [I

    move-result-object v5

    .line 206
    invoke-virtual {v1, v5}, Landroidx/media/app/NotificationCompat$MediaStyle;->setShowActionsInCompactView([I)Landroidx/media/app/NotificationCompat$MediaStyle;

    move-result-object v1

    .line 209
    invoke-virtual {p1}, Landroidx/media2/session/MediaSession;->getImpl()Landroidx/media2/session/MediaSession$MediaSessionImpl;

    move-result-object p1

    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getSessionActivity()Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    .line 210
    invoke-direct {p0, v2, v3}, Landroidx/media2/session/MediaNotificationHandler;->createPendingIntent(J)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    .line 211
    invoke-virtual {p1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setOnlyAlertOnce(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    .line 212
    invoke-direct {p0}, Landroidx/media2/session/MediaNotificationHandler;->getSmallIconResId()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    .line 213
    invoke-virtual {p1, v1}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    .line 214
    invoke-virtual {p1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setVisibility(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const/4 v0, 0x0

    .line 215
    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    .line 216
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    .line 218
    new-instance v0, Landroidx/media2/session/MediaSessionService$MediaNotification;

    const/16 v1, 0x3e9

    invoke-direct {v0, v1, p1}, Landroidx/media2/session/MediaSessionService$MediaNotification;-><init>(ILandroid/app/Notification;)V

    return-object v0
.end method
