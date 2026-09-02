package androidx.tracing;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.job.JobInfo;
import android.media.AudioFocusRequest;
import android.media.session.MediaSessionManager;
import android.net.Uri;
import android.view.DisplayCutout;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputContentInfo;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Trace$$ExternalSyntheticApiModelOutline0 {
    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException m271m(Object obj) {
        return (ForegroundServiceStartNotAllowedException) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ JobInfo.TriggerContentUri m277m(Uri uri, int i) {
        return new JobInfo.TriggerContentUri(uri, i);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ AudioFocusRequest m281m(Object obj) {
        return (AudioFocusRequest) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ MediaSessionManager.RemoteUserInfo m283m(String str, int i, int i2) {
        return new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ DisplayCutout m285m(Object obj) {
        return (DisplayCutout) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ AccessibilityNodeInfo.TouchDelegateInfo m289m(Map map) {
        return new AccessibilityNodeInfo.TouchDelegateInfo(map);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ AutofillId m291m(Object obj) {
        return (AutofillId) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ ContentCaptureSession m292m(Object obj) {
        return (ContentCaptureSession) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ InputContentInfo m293m(Object obj) {
        return (InputContentInfo) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ Class m295m() {
        return Consumer.class;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m302m() {
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ boolean m326m(Object obj) {
        return obj instanceof ForegroundServiceStartNotAllowedException;
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
