package androidx.media2.widget;

import android.view.accessibility.CaptioningManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class CaptioningManagerHelper {

    static final class Api19Impl {
        static void addCaptioningChangeListener(CaptioningManager captioningManager, CaptioningManager.CaptioningChangeListener captioningChangeListener) {
            captioningManager.addCaptioningChangeListener(captioningChangeListener);
        }

        static void removeCaptioningChangeListener(CaptioningManager captioningManager, CaptioningManager.CaptioningChangeListener captioningChangeListener) {
            captioningManager.removeCaptioningChangeListener(captioningChangeListener);
        }

        static float getFontScale(CaptioningManager captioningManager) {
            return captioningManager.getFontScale();
        }

        static Locale getLocale(CaptioningManager captioningManager) {
            return captioningManager.getLocale();
        }

        static CaptioningManager.CaptionStyle getUserStyle(CaptioningManager captioningManager) {
            return captioningManager.getUserStyle();
        }

        static boolean isEnabled(CaptioningManager captioningManager) {
            return captioningManager.isEnabled();
        }

        private Api19Impl() {
        }
    }

    private CaptioningManagerHelper() {
    }
}
