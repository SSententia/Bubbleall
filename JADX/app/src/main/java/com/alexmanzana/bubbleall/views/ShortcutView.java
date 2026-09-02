package com.alexmanzana.bubbleall.views;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media2.session.MediaConstants;
import androidx.preference.PreferenceManager;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.pojos.ItemAdd;
import com.alexmanzana.bubbleall.utils.ListenerWebUtil;
import com.alexmanzana.bubbleall.utils.ShortcutPrefs;
import com.alexmanzana.bubbleall.window.ButtonToolbar;
import com.alexmanzana.bubbleall.window.Panel;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: ShortcutView.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0011\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0016H\u0002J\b\u0010 \u001a\u00020\u0014H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0014H\u0017J\b\u0010$\u001a\u00020\u0014H\u0016J\b\u0010%\u001a\u00020\u0014H\u0016J\b\u0010&\u001a\u00020\u0014H\u0016J\b\u0010'\u001a\u00020\u0014H\u0002J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0007H\u0002J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020\u0014H\u0002J0\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u00064"}, m495d2 = {"Lcom/alexmanzana/bubbleall/views/ShortcutView;", "Lcom/alexmanzana/bubbleall/window/Panel;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentPosition", "mManager", "Landroid/app/NotificationManager;", "mPrefs", "Landroid/content/SharedPreferences;", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "receiver", "com/alexmanzana/bubbleall/views/ShortcutView$receiver$1", "Lcom/alexmanzana/bubbleall/views/ShortcutView$receiver$1;", "addOrExists", "", "item", "", MediaConstants.MEDIA_URI_QUERY_ID, "addViewToContainer", "web", "Lcom/alexmanzana/bubbleall/views/Web;", "args", "", "buttons", "getPosition", "currentUrl", "onBackPressed", "onBackground", "", "onCreate", "onDestroy", "pause", "pauseMedia", "pauseMediaNotification", "setWebView", "i", "start", "startDataNotification", "startNotification", "title", "duration", "", "current", "speed", "", "verifyExists", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class ShortcutView extends Panel {
    private int currentPosition;
    private NotificationManager mManager;
    private SharedPreferences mPrefs;
    private MediaSessionCompat mediaSession;
    private final ShortcutView$receiver$1 receiver;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortcutView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortcutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pauseMediaNotification$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5 */
    public static final void m342xb70f074d(String str) {
    }

    public /* synthetic */ ShortcutView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentPosition = -1;
        this.receiver = new ShortcutView$receiver$1(this);
    }

    private final int getPosition(String currentUrl) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Web) && Intrinsics.areEqual(((Web) childAt).getId(), currentUrl)) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void pause() {
        int i;
        SharedPreferences sharedPreferences = this.mPrefs;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrefs");
            sharedPreferences = null;
        }
        if (!sharedPreferences.getBoolean("key_shortcut_pause", true) || (i = this.currentPosition) == -1) {
            return;
        }
        View childAt = getChildAt(i);
        if (childAt instanceof Web) {
            Web web = (Web) childAt;
            web.setVisibility(8);
            web.onPause();
        }
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void onBackPressed() {
        View childAt;
        int i = this.currentPosition;
        if (i == -1 || (childAt = getChildAt(i)) == null || !(childAt instanceof Web)) {
            return;
        }
        Web web = (Web) childAt;
        if (web.canGoBack()) {
            web.goBack();
        }
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public boolean onBackground() {
        int i;
        SharedPreferences sharedPreferences = this.mPrefs;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrefs");
            sharedPreferences = null;
        }
        if (!sharedPreferences.getBoolean("key_shortcut_multimedia", false) || (i = this.currentPosition) == -1) {
            return true;
        }
        View childAt = getChildAt(i);
        if (!(childAt instanceof Web)) {
            return true;
        }
        ((Web) childAt).evaluateJavascript("(function(){var r = \"g\";var videos = document.querySelectorAll('video');var videoPlayback = null;if(videos.length>0){videoPlayback = videos[0];}for(var i= 0;i<videos.length;i++){if(videos[i].src.startsWith(\"blob\")){videoPlayback = videos[i];break;}else{if(videos[i].duration>videoPlayback.duration){videoPlayback = videos[i];}}}if(videoPlayback!=null && !videoPlayback.paused){r = \"f\";}else{r = \"g\";}return r;})();", new ValueCallback() { // from class: com.alexmanzana.bubbleall.views.ShortcutView$$ExternalSyntheticLambda8
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                ShortcutView.onBackground$lambda$2(this.f$0, (String) obj);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackground$lambda$2(ShortcutView this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null) {
            String strSubstring = str.substring(1, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (Intrinsics.areEqual(strSubstring, "g")) {
                return;
            }
            this$0.startDataNotification();
        }
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void pauseMedia() {
        int i = this.currentPosition;
        if (i != -1) {
            View childAt = getChildAt(i);
            if (childAt instanceof Web) {
                ((Web) childAt).evaluateJavascript("(function(){var r = \"f\";var videos = document.querySelectorAll('video');var videoPlayback = null;if(videos.length>0){videoPlayback = videos[0];}for(var i= 0;i<videos.length;i++){if(videos[i].src.startsWith(\"blob\")){videoPlayback = videos[i];break;}else{if(videos[i].duration>videoPlayback.duration){videoPlayback = videos[i];}}}if(videoPlayback!=null && !videoPlayback.paused){r = \"f\";}else{r = \"g\";videoPlayback.play();}return r;})();", new ValueCallback() { // from class: com.alexmanzana.bubbleall.views.ShortcutView$$ExternalSyntheticLambda3
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        ShortcutView.pauseMedia$lambda$4(this.f$0, (String) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pauseMedia$lambda$4(ShortcutView this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null) {
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "f", false, 2, (Object) null)) {
                this$0.pauseMediaNotification();
            } else {
                this$0.startDataNotification();
            }
        }
    }

    private final void pauseMediaNotification() {
        final View childAt = getChildAt(this.currentPosition);
        if (childAt == null || !(childAt instanceof Web)) {
            return;
        }
        ((Web) childAt).evaluateJavascript("(function(){var r = \"-1\";var videos = document.querySelectorAll('video');var videoPlayback = null;if(videos.length>0){videoPlayback = videos[0];}for(var i= 0;i<videos.length;i++){if(videos[i].src.startsWith(\"blob\")){videoPlayback = videos[i];break;}else{if(videos[i].duration>videoPlayback.duration){videoPlayback = videos[i];}}}if(videoPlayback!=null && !videoPlayback.paused){r = videoPlayback.duration.toString();}return r;})();", new ValueCallback() { // from class: com.alexmanzana.bubbleall.views.ShortcutView$$ExternalSyntheticLambda5
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                ShortcutView.pauseMediaNotification$lambda$10$lambda$9(childAt, this, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pauseMediaNotification$lambda$10$lambda$9(final View view, final ShortcutView this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null) {
            String strSubstring = str.substring(1, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            final double d = Double.parseDouble(strSubstring);
            ((Web) view).evaluateJavascript("(function(){var r = \"-1\";var videos = document.querySelectorAll('video');var videoPlayback = null;if(videos.length>0){videoPlayback = videos[0];}for(var i= 0;i<videos.length;i++){if(videos[i].src.startsWith(\"blob\")){videoPlayback = videos[i];break;}else{if(videos[i].duration>videoPlayback.duration){videoPlayback = videos[i];}}}if(videoPlayback!=null && !videoPlayback.paused){r = videoPlayback.currentTime.toString();}return r;})();", new ValueCallback() { // from class: com.alexmanzana.bubbleall.views.ShortcutView$$ExternalSyntheticLambda6
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    ShortcutView.pauseMediaNotification$lambda$10$lambda$9$lambda$8$lambda$7(this.f$0, view, d, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pauseMediaNotification$lambda$10$lambda$9$lambda$8$lambda$7(ShortcutView this$0, View view, double d, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null) {
            String strSubstring = str.substring(1, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            double d2 = Double.parseDouble(strSubstring);
            try {
                String title = ((Web) view).getTitle();
                if (title == null) {
                    title = "";
                }
                Intrinsics.checkNotNull(title);
                this$0.startNotification(title, MathKt.roundToLong(d), MathKt.roundToLong(d2), (Web) view, 0.0f);
                ((Web) view).evaluateJavascript("(function(){var r = \"f\";var videos = document.querySelectorAll('video');var videoPlayback = null;if(videos.length>0){videoPlayback = videos[0];}for(var i= 0;i<videos.length;i++){if(videos[i].src.startsWith(\"blob\")){videoPlayback = videos[i];break;}else{if(videos[i].duration>videoPlayback.duration){videoPlayback = videos[i];}}}if(videoPlayback!=null && !videoPlayback.paused){videoPlayback.pause();r = \"f\";}else{r = \"g\";videoPlayback.play();}return r;})();", new ValueCallback() { // from class: com.alexmanzana.bubbleall.views.ShortcutView$$ExternalSyntheticLambda7
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        ShortcutView.m342xb70f074d((String) obj);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private final void startNotification(String title, long duration, long current, Web web, float speed) {
        int i;
        int i2;
        String id;
        String name;
        String name2;
        ShortcutPrefs.Companion companion = ShortcutPrefs.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ItemAdd itemAdd = companion.get(context, getIdPanel());
        PendingIntent broadcast = PendingIntent.getBroadcast(getContext(), 0, new Intent("com.alexmanzana.bubbleall.Shortcut.REPLAY_10"), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(getContext(), 0, new Intent("com.alexmanzana.bubbleall.Shortcut.PLAY_AND_PAUSE"), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        PendingIntent broadcast3 = PendingIntent.getBroadcast(getContext(), 0, new Intent("com.alexmanzana.bubbleall.Shortcut.REFRESH"), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        PendingIntent broadcast4 = PendingIntent.getBroadcast(getContext(), 0, new Intent("com.alexmanzana.bubbleall.Shortcut.FORWARD_10"), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        PendingIntent broadcast5 = PendingIntent.getBroadcast(getContext(), 0, new Intent("com.alexmanzana.bubbleall.Shortcut.CLOSE"), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        try {
            MediaSessionCompat mediaSessionCompat = this.mediaSession;
            String str = "";
            if (mediaSessionCompat != null) {
                MediaMetadataCompat.Builder builderPutString = new MediaMetadataCompat.Builder().putString("android.media.metadata.TITLE", title);
                if (itemAdd == null || (name2 = itemAdd.getName()) == null) {
                    name2 = "";
                }
                mediaSessionCompat.setMetadata(builderPutString.putString("android.media.metadata.AUTHOR", name2).putLong("android.media.metadata.DURATION", TimeUnit.SECONDS.toMillis(duration)).build());
            }
            MediaSessionCompat mediaSessionCompat2 = this.mediaSession;
            if (mediaSessionCompat2 != null) {
                mediaSessionCompat2.setCallback(new C11151(web, this));
            }
            if (speed == 0.0f) {
                i = C1106R.drawable.ic_play;
                i2 = 2;
            } else {
                i = C1106R.drawable.ic_pause;
                i2 = 3;
            }
            MediaSessionCompat mediaSessionCompat3 = this.mediaSession;
            if (mediaSessionCompat3 != null) {
                mediaSessionCompat3.setPlaybackState(new PlaybackStateCompat.Builder().setState(i2, TimeUnit.SECONDS.toMillis(current), speed).setActions(256L).build());
            }
            Context context2 = getContext();
            if (itemAdd == null || (id = itemAdd.getId()) == null) {
                id = "channel_service";
            }
            NotificationCompat.Builder contentTitle = new NotificationCompat.Builder(context2, id).setSmallIcon(C1106R.drawable.ic_service_small).setContentTitle(title);
            if (itemAdd != null && (name = itemAdd.getName()) != null) {
                str = name;
            }
            NotificationCompat.Builder contentText = contentTitle.setContentText(str);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(itemAdd != null ? itemAdd.getResourceBitmap() : null);
            if (bitmapDecodeFile == null) {
                bitmapDecodeFile = web.getFavicon();
            }
            NotificationCompat.Builder builderAddAction = contentText.setLargeIcon(bitmapDecodeFile).addAction(C1106R.drawable.ic_baseline_refresh_24, "Refresh", broadcast3).addAction(C1106R.drawable.ic_baseline_replay_10_24, "Replay10", broadcast).addAction(i, "Play/Pause", broadcast2).addAction(C1106R.drawable.ic_baseline_forward_10_24, "Forward10", broadcast4).addAction(C1106R.drawable.ic_close, "Close", broadcast5);
            androidx.media.app.NotificationCompat.MediaStyle showActionsInCompactView = new androidx.media.app.NotificationCompat.MediaStyle().setShowActionsInCompactView(0, 2, 4);
            MediaSessionCompat mediaSessionCompat4 = this.mediaSession;
            Notification notificationBuild = builderAddAction.setStyle(showActionsInCompactView.setMediaSession(mediaSessionCompat4 != null ? mediaSessionCompat4.getSessionToken() : null)).build();
            Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
            NotificationManager notificationManager = this.mManager;
            if (notificationManager != null) {
                notificationManager.notify(78, notificationBuild);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: com.alexmanzana.bubbleall.views.ShortcutView$startNotification$1 */
    /* JADX INFO: compiled from: ShortcutView.kt */
    @Metadata(m494d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m495d2 = {"com/alexmanzana/bubbleall/views/ShortcutView$startNotification$1", "Landroid/support/v4/media/session/MediaSessionCompat$Callback;", "onSeekTo", "", "pos", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class C11151 extends MediaSessionCompat.Callback {
        final /* synthetic */ Web $web;
        final /* synthetic */ ShortcutView this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSeekTo$lambda$0(String str) {
        }

        C11151(Web web, ShortcutView shortcutView) {
            this.$web = web;
            this.this$0 = shortcutView;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSeekTo(long pos) {
            this.$web.evaluateJavascript("(function(){var videos = document.querySelectorAll('video');var videoPlayback = null;if(videos.length>0){videoPlayback = videos[0];}for(var i= 0;i<videos.length;i++){if(videos[i].src.startsWith(\"blob\")){videoPlayback = videos[i];break;}else{if(videos[i].duration>videoPlayback.duration){videoPlayback = videos[i];}}}if(videoPlayback!=null && !videoPlayback.paused){videoPlayback.currentTime = " + (pos / ((long) 1000)) + ";videoPlayback.play();}})();", new ValueCallback() { // from class: com.alexmanzana.bubbleall.views.ShortcutView$startNotification$1$$ExternalSyntheticLambda0
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    ShortcutView.C11151.onSeekTo$lambda$0((String) obj);
                }
            });
            this.this$0.startDataNotification();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startDataNotification() {
        final View childAt = getChildAt(this.currentPosition);
        if (childAt instanceof Web) {
            ((Web) childAt).evaluateJavascript("(function(){var r = \"-1\";var videos = document.querySelectorAll('video');var videoPlayback = null;if(videos.length>0){videoPlayback = videos[0];}for(var i= 0;i<videos.length;i++){if(videos[i].src.startsWith(\"blob\")){videoPlayback = videos[i];break;}else{if(videos[i].duration>videoPlayback.duration){videoPlayback = videos[i];}}}if(videoPlayback!=null && !videoPlayback.paused){r = videoPlayback.duration.toString();}return r;})();", new ValueCallback() { // from class: com.alexmanzana.bubbleall.views.ShortcutView$$ExternalSyntheticLambda4
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    ShortcutView.startDataNotification$lambda$14(childAt, this, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startDataNotification$lambda$14(final View view, final ShortcutView this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null) {
            String strSubstring = str.substring(1, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            final double d = Double.parseDouble(strSubstring);
            ((Web) view).evaluateJavascript("(function(){var r = \"-1\";var videos = document.querySelectorAll('video');var videoPlayback = null;if(videos.length>0){videoPlayback = videos[0];}for(var i= 0;i<videos.length;i++){if(videos[i].src.startsWith(\"blob\")){videoPlayback = videos[i];break;}else{if(videos[i].duration>videoPlayback.duration){videoPlayback = videos[i];}}}if(videoPlayback!=null && !videoPlayback.paused){r = videoPlayback.currentTime.toString();}return r;})();", new ValueCallback() { // from class: com.alexmanzana.bubbleall.views.ShortcutView$$ExternalSyntheticLambda2
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    ShortcutView.startDataNotification$lambda$14$lambda$13$lambda$12(this.f$0, view, d, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startDataNotification$lambda$14$lambda$13$lambda$12(ShortcutView this$0, View view, double d, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null) {
            String strSubstring = str.substring(1, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            double d2 = Double.parseDouble(strSubstring);
            try {
                String title = ((Web) view).getTitle();
                if (title == null) {
                    title = "";
                }
                Intrinsics.checkNotNull(title);
                long jRoundToLong = MathKt.roundToLong(d);
                long jRoundToLong2 = MathKt.roundToLong(d2);
                Intrinsics.checkNotNull(view);
                this$0.startNotification(title, jRoundToLong, jRoundToLong2, (Web) view, 1.0f);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private final boolean verifyExists(String currentUrl) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Web) && Intrinsics.areEqual(((Web) childAt).getId(), currentUrl)) {
                return true;
            }
        }
        return false;
    }

    private final void buttons() {
        requestButtons(new ButtonToolbar(C1106R.drawable.ic_baseline_refresh_24, new Runnable() { // from class: com.alexmanzana.bubbleall.views.ShortcutView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ShortcutView.buttons$lambda$15(this.f$0);
            }
        }), new ButtonToolbar(C1106R.drawable.ic_baseline_launch_24, new Runnable() { // from class: com.alexmanzana.bubbleall.views.ShortcutView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ShortcutView.buttons$lambda$16(this.f$0);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buttons$lambda$15(ShortcutView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.currentPosition;
        if (i != -1) {
            View childAt = this$0.getChildAt(i);
            if (childAt instanceof Web) {
                ((Web) childAt).reload();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buttons$lambda$16(ShortcutView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.closeManager();
        int i = this$0.currentPosition;
        if (i != -1) {
            View childAt = this$0.getChildAt(i);
            if (childAt instanceof Web) {
                this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((Web) childAt).getUrl())));
            }
        }
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void start() {
        Unit unit;
        if (getIdPanel().length() > 0) {
            buttons();
            ShortcutPrefs.Companion companion = ShortcutPrefs.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ItemAdd itemAdd = companion.get(context, getIdPanel());
            if (itemAdd != null) {
                addOrExists(itemAdd.getDescription(), itemAdd.getId());
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(itemAdd.getResourceBitmap());
                Intrinsics.checkNotNullExpressionValue(bitmapDecodeFile, "decodeFile(...)");
                requestToolbar(bitmapDecodeFile, itemAdd.getName());
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                addOrExists(getIdPanel(), getIdPanel());
                int i = this.currentPosition;
                if (i != -1) {
                    View childAt = getChildAt(i);
                    if (childAt instanceof Web) {
                        int i2 = C1106R.drawable.ic_web;
                        Web web = (Web) childAt;
                        String title = web.getTitle();
                        if (title == null) {
                            title = "";
                        }
                        Intrinsics.checkNotNull(title);
                        requestToolbar(i2, title);
                        Bitmap favicon = web.getFavicon();
                        if (favicon != null) {
                            Intrinsics.checkNotNull(favicon);
                            String title2 = web.getTitle();
                            String str = title2 != null ? title2 : "";
                            Intrinsics.checkNotNull(str);
                            requestToolbar(favicon, str);
                        }
                    }
                }
            }
            NotificationManager notificationManager = this.mManager;
            if (notificationManager != null) {
                notificationManager.cancel(78);
            }
        }
    }

    private final void addOrExists(String item, String id) {
        int position = getPosition(id);
        int i = this.currentPosition;
        if (i != -1 && i != position) {
            View childAt = getChildAt(i);
            if (childAt instanceof Web) {
                Web web = (Web) childAt;
                web.setVisibility(8);
                SharedPreferences sharedPreferences = this.mPrefs;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPrefs");
                    sharedPreferences = null;
                }
                if (sharedPreferences.getBoolean("key_shortcut_pause", true)) {
                    web.onPause();
                }
            }
        }
        if (verifyExists(id)) {
            this.currentPosition = position;
            if (position != -1) {
                View childAt2 = getChildAt(position);
                if (childAt2 instanceof Web) {
                    Web web2 = (Web) childAt2;
                    web2.setVisibility(0);
                    web2.onResume();
                    childAt2.requestFocus();
                    return;
                }
                return;
            }
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Web web3 = new Web(context, null, 0, 6, null);
        web3.setId(id);
        web3.setListener(new ListenerWebUtil() { // from class: com.alexmanzana.bubbleall.views.ShortcutView.addOrExists.1
            @Override // com.alexmanzana.bubbleall.utils.ListenerWebUtil, com.alexmanzana.bubbleall.listeners.ListenerWeb
            public void onLoaded(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                NotificationManager notificationManager = ShortcutView.this.mManager;
                if (notificationManager != null) {
                    notificationManager.cancel(78);
                }
            }
        });
        addViewToContainer(web3);
        web3.loadUrl(item);
        this.currentPosition = getChildCount() - 1;
    }

    private final void addViewToContainer(Web web) {
        addView(web, new FrameLayout.LayoutParams(-1, -1));
        setWebView(getChildCount() - 1);
    }

    private final void setWebView(int i) {
        if (this.currentPosition != -1) {
            View childAt = getChildAt(i);
            if (childAt instanceof Web) {
                Web web = (Web) childAt;
                web.onResume();
                web.setVisibility(0);
                childAt.requestFocus();
                this.currentPosition = i;
            }
        }
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void onCreate() {
        this.mManager = (NotificationManager) getContext().getSystemService("notification");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.mPrefs = defaultSharedPreferences;
        this.mediaSession = new MediaSessionCompat(getContext(), "AccessDirect");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alexmanzana.bubbleall.Shortcut.CLOSE");
        intentFilter.addAction("com.alexmanzana.bubbleall.Shortcut.REFRESH");
        intentFilter.addAction("com.alexmanzana.bubbleall.Shortcut.REPLAY_10");
        intentFilter.addAction("com.alexmanzana.bubbleall.Shortcut.FORWARD_10");
        intentFilter.addAction("com.alexmanzana.bubbleall.Shortcut.PLAY_AND_PAUSE");
        if (Build.VERSION.SDK_INT >= 33) {
            getContext().registerReceiver(this.receiver, intentFilter, 4);
        } else {
            getContext().registerReceiver(this.receiver, intentFilter);
        }
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void args(Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = (String) item;
        if (((CharSequence) item).length() == 0) {
            View childAt = getChildAt(getPosition(getIdPanel()));
            if (childAt != null) {
                removeView(childAt);
                return;
            }
            return;
        }
        addOrExists(str, str);
        buttons();
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void onDestroy() {
        NotificationManager notificationManager = this.mManager;
        if (notificationManager != null) {
            notificationManager.cancel(78);
        }
        try {
            getContext().unregisterReceiver(this.receiver);
        } catch (Exception e) {
            e.printStackTrace();
        }
        View childAt = getChildAt(getPosition(getIdPanel()));
        if (childAt instanceof Web) {
            Web web = (Web) childAt;
            web.setVisibility(8);
            web.onPause();
            ShortcutPrefs.Companion companion = ShortcutPrefs.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!companion.exists(context, getIdPanel())) {
                removeView(childAt);
                return;
            }
            SharedPreferences sharedPreferences = this.mPrefs;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPrefs");
                sharedPreferences = null;
            }
            if (sharedPreferences.getBoolean("key_save_shortcut_open", false)) {
                ShortcutPrefs.Companion companion2 = ShortcutPrefs.INSTANCE;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                ItemAdd itemAdd = companion2.get(context2, getIdPanel());
                if (itemAdd != null) {
                    String url = web.getUrl();
                    if (url == null) {
                        url = getIdPanel();
                    } else {
                        Intrinsics.checkNotNull(url);
                    }
                    itemAdd.setDescription(url);
                    ShortcutPrefs.Companion companion3 = ShortcutPrefs.INSTANCE;
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    companion3.edit(context3, itemAdd);
                }
            }
        }
    }
}
