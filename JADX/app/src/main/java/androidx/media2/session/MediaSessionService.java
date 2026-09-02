package androidx.media2.session;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaSessionService extends Service {
    public static final String SERVICE_INTERFACE = "androidx.media2.session.MediaSessionService";
    private final MediaSessionServiceImpl mImpl = createImpl();

    interface MediaSessionServiceImpl {
        void addSession(MediaSession mediaSession);

        List<MediaSession> getSessions();

        IBinder onBind(Intent intent);

        void onCreate(MediaSessionService mediaSessionService);

        void onDestroy();

        int onStartCommand(Intent intent, int i, int i2);

        MediaNotification onUpdateNotification(MediaSession mediaSession);

        void removeSession(MediaSession mediaSession);
    }

    public abstract MediaSession onGetSession(MediaSession.ControllerInfo controllerInfo);

    MediaSessionServiceImpl createImpl() {
        return new MediaSessionServiceImplBase();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mImpl.onCreate(this);
    }

    public final void addSession(MediaSession mediaSession) {
        if (mediaSession == null) {
            throw new NullPointerException("session shouldn't be null");
        }
        if (mediaSession.isClosed()) {
            throw new IllegalArgumentException("session is already closed");
        }
        this.mImpl.addSession(mediaSession);
    }

    public final void removeSession(MediaSession mediaSession) {
        if (mediaSession == null) {
            throw new NullPointerException("session shouldn't be null");
        }
        this.mImpl.removeSession(mediaSession);
    }

    public MediaNotification onUpdateNotification(MediaSession mediaSession) {
        if (mediaSession == null) {
            throw new NullPointerException("session shouldn't be null");
        }
        return this.mImpl.onUpdateNotification(mediaSession);
    }

    public final List<MediaSession> getSessions() {
        return this.mImpl.getSessions();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mImpl.onBind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return this.mImpl.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mImpl.onDestroy();
    }

    public static class MediaNotification {
        private final Notification mNotification;
        private final int mNotificationId;

        public MediaNotification(int i, Notification notification) {
            if (notification == null) {
                throw new NullPointerException("notification shouldn't be null");
            }
            this.mNotificationId = i;
            this.mNotification = notification;
        }

        public int getNotificationId() {
            return this.mNotificationId;
        }

        public Notification getNotification() {
            return this.mNotification;
        }
    }
}
