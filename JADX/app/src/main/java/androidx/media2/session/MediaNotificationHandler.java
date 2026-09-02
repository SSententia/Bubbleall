package androidx.media2.session;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media2.common.ClassVerificationHelper;
import androidx.media2.common.MediaMetadata;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class MediaNotificationHandler extends MediaSession.SessionCallback.ForegroundServiceEventCallback {
    private static final String NOTIFICATION_CHANNEL_ID = "default_channel_id";
    private static final int NOTIFICATION_ID = 1001;
    private final String mNotificationChannelName;
    private final NotificationManagerCompat mNotificationManagerCompat;
    private final MediaSessionService mServiceInstance;
    private final Intent mStartSelfIntent;
    private final NotificationCompat.Action mPlayAction = createNotificationAction(C0755R.drawable.media_session_service_notification_ic_play, C0755R.string.play_button_content_description, 4);
    private final NotificationCompat.Action mPauseAction = createNotificationAction(C0755R.drawable.media_session_service_notification_ic_pause, C0755R.string.pause_button_content_description, 2);
    private final NotificationCompat.Action mSkipToPrevAction = createNotificationAction(C0755R.drawable.media_session_service_notification_ic_skip_to_previous, C0755R.string.skip_to_previous_item_button_content_description, 16);
    private final NotificationCompat.Action mSkipToNextAction = createNotificationAction(C0755R.drawable.media_session_service_notification_ic_skip_to_next, C0755R.string.skip_to_next_item_button_content_description, 32);

    static boolean isPlaybackStopped(int i) {
        return i == 1 || i == 0 || i == 3;
    }

    MediaNotificationHandler(MediaSessionService mediaSessionService) {
        this.mServiceInstance = mediaSessionService;
        this.mStartSelfIntent = new Intent(mediaSessionService, mediaSessionService.getClass());
        this.mNotificationManagerCompat = NotificationManagerCompat.from(mediaSessionService);
        this.mNotificationChannelName = mediaSessionService.getResources().getString(C0755R.string.default_notification_channel_name);
    }

    @Override // androidx.media2.session.MediaSession.SessionCallback.ForegroundServiceEventCallback
    public void onPlayerStateChanged(MediaSession mediaSession, int i) {
        MediaSessionService.MediaNotification mediaNotificationOnUpdateNotification = this.mServiceInstance.onUpdateNotification(mediaSession);
        if (mediaNotificationOnUpdateNotification == null) {
            return;
        }
        int notificationId = mediaNotificationOnUpdateNotification.getNotificationId();
        Notification notification = mediaNotificationOnUpdateNotification.getNotification();
        notification.extras.putParcelable(NotificationCompat.EXTRA_MEDIA_SESSION, (android.media.session.MediaSession.Token) mediaSession.getSessionCompat().getSessionToken().getToken());
        if (isPlaybackStopped(i)) {
            stopForegroundServiceIfNeeded();
            this.mNotificationManagerCompat.notify(notificationId, notification);
        } else {
            ContextCompat.startForegroundService(this.mServiceInstance, this.mStartSelfIntent);
            this.mServiceInstance.startForeground(notificationId, notification);
        }
    }

    @Override // androidx.media2.session.MediaSession.SessionCallback.ForegroundServiceEventCallback
    public void onNotificationUpdateNeeded(MediaSession mediaSession) {
        MediaSessionService.MediaNotification mediaNotificationOnUpdateNotification = this.mServiceInstance.onUpdateNotification(mediaSession);
        if (mediaNotificationOnUpdateNotification == null) {
            return;
        }
        int notificationId = mediaNotificationOnUpdateNotification.getNotificationId();
        Notification notification = mediaNotificationOnUpdateNotification.getNotification();
        notification.extras.putParcelable(NotificationCompat.EXTRA_MEDIA_SESSION, (android.media.session.MediaSession.Token) mediaSession.getSessionCompat().getSessionToken().getToken());
        this.mNotificationManagerCompat.notify(notificationId, notification);
    }

    @Override // androidx.media2.session.MediaSession.SessionCallback.ForegroundServiceEventCallback
    public void onSessionClosed(MediaSession mediaSession) {
        this.mServiceInstance.removeSession(mediaSession);
        stopForegroundServiceIfNeeded();
    }

    private void stopForegroundServiceIfNeeded() {
        List<MediaSession> sessions = this.mServiceInstance.getSessions();
        for (int i = 0; i < sessions.size(); i++) {
            if (!isPlaybackStopped(sessions.get(i).getPlayer().getPlayerState())) {
                return;
            }
        }
        this.mServiceInstance.stopForeground(false);
    }

    public MediaSessionService.MediaNotification onUpdateNotification(MediaSession mediaSession) {
        MediaMetadata metadata;
        ensureNotificationChannel();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this.mServiceInstance, NOTIFICATION_CHANNEL_ID);
        builder.addAction(this.mSkipToPrevAction);
        if (mediaSession.getPlayer().getPlayerState() == 2) {
            builder.addAction(this.mPauseAction);
        } else {
            builder.addAction(this.mPlayAction);
        }
        builder.addAction(this.mSkipToNextAction);
        if (mediaSession.getPlayer().getCurrentMediaItem() != null && (metadata = mediaSession.getPlayer().getCurrentMediaItem().getMetadata()) != null) {
            CharSequence text = metadata.getText("android.media.metadata.DISPLAY_TITLE");
            if (text == null) {
                text = metadata.getText("android.media.metadata.TITLE");
            }
            builder.setContentTitle(text).setContentText(metadata.getText("android.media.metadata.ARTIST")).setLargeIcon(metadata.getBitmap("android.media.metadata.ALBUM_ART"));
        }
        return new MediaSessionService.MediaNotification(1001, builder.setContentIntent(mediaSession.getImpl().getSessionActivity()).setDeleteIntent(createPendingIntent(1L)).setOnlyAlertOnce(true).setSmallIcon(getSmallIconResId()).setStyle(new androidx.media.app.NotificationCompat.MediaStyle().setCancelButtonIntent(createPendingIntent(1L)).setMediaSession(mediaSession.getSessionCompat().getSessionToken()).setShowActionsInCompactView(1)).setVisibility(1).setOngoing(false).build());
    }

    private NotificationCompat.Action createNotificationAction(int i, int i2, long j) {
        return new NotificationCompat.Action(i, this.mServiceInstance.getResources().getText(i2), createPendingIntent(j));
    }

    private PendingIntent createPendingIntent(long j) {
        int keyCode = PlaybackStateCompat.toKeyCode(j);
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        MediaSessionService mediaSessionService = this.mServiceInstance;
        intent.setComponent(new ComponentName(mediaSessionService, mediaSessionService.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, keyCode));
        if (Build.VERSION.SDK_INT >= 26 && j != 2 && j != 1) {
            return ClassVerificationHelper.PendingIntent.Api26.getForegroundService(this.mServiceInstance, keyCode, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        return PendingIntent.getService(this.mServiceInstance, keyCode, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
    }

    private void ensureNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26 && this.mNotificationManagerCompat.getNotificationChannel(NOTIFICATION_CHANNEL_ID) == null) {
            this.mNotificationManagerCompat.createNotificationChannel(new NotificationChannelCompat.Builder(NOTIFICATION_CHANNEL_ID, 2).setName(this.mNotificationChannelName).build());
        }
    }

    private int getSmallIconResId() {
        int i = this.mServiceInstance.getApplicationInfo().icon;
        return i != 0 ? i : C0755R.drawable.media_session_service_notification_ic_music_note;
    }
}
