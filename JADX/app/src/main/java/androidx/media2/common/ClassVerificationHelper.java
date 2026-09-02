package androidx.media2.common;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class ClassVerificationHelper {

    public static final class AudioManager {

        public static final class Api21 {
            public static boolean isVolumeFixed(android.media.AudioManager audioManager) {
                return audioManager.isVolumeFixed();
            }

            private Api21() {
            }
        }

        private AudioManager() {
        }
    }

    public static final class HandlerThread {

        public static final class Api18 {
            public static boolean quitSafely(android.os.HandlerThread handlerThread) {
                return handlerThread.quitSafely();
            }

            private Api18() {
            }
        }

        private HandlerThread() {
        }
    }

    public static final class PendingIntent {

        public static final class Api26 {
            public static android.app.PendingIntent getForegroundService(Context context, int i, Intent intent, int i2) {
                return android.app.PendingIntent.getForegroundService(context, i, intent, i2);
            }

            private Api26() {
            }
        }

        private PendingIntent() {
        }
    }

    private ClassVerificationHelper() {
    }
}
