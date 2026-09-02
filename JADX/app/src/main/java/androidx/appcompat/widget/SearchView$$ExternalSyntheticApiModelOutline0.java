package androidx.appcompat.widget;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.Person;
import android.app.job.JobWorkItem;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.view.inspector.InspectionCompanion;
import android.view.textclassifier.TextClassificationManager;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SearchView$$ExternalSyntheticApiModelOutline0 {
    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ Notification.MessagingStyle m10m(Object obj) {
        return (Notification.MessagingStyle) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ NotificationChannel m11m(Object obj) {
        return (NotificationChannel) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ NotificationChannelGroup m12m(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ Person m13m(Object obj) {
        return (Person) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ JobWorkItem m15m(Intent intent) {
        return new JobWorkItem(intent);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ ShortcutInfo.Builder m18m(Context context, String str) {
        return new ShortcutInfo.Builder(context, str);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ ShortcutInfo m30m(Object obj) {
        return (ShortcutInfo) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ MediaSession m33m(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ InspectionCompanion.UninitializedPropertyMapException m42m() {
        return new InspectionCompanion.UninitializedPropertyMapException();
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ TextClassificationManager m43m(Object obj) {
        return (TextClassificationManager) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ Class m47m() {
        return TextClassificationManager.class;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m50m() {
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return Notification.MessagingStyle.class;
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return Notification.DecoratedCustomViewStyle.class;
    }
}
