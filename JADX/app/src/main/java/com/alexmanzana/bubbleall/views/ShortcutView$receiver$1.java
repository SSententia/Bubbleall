package com.alexmanzana.bubbleall.views;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.webkit.ValueCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ShortcutView.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, m495d2 = {"com/alexmanzana/bubbleall/views/ShortcutView$receiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class ShortcutView$receiver$1 extends BroadcastReceiver {
    final /* synthetic */ ShortcutView this$0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceive$lambda$3$lambda$0(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceive$lambda$3$lambda$1(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceive$lambda$3$lambda$2(String str) {
    }

    ShortcutView$receiver$1(ShortcutView shortcutView) {
        this.this$0 = shortcutView;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        NotificationManager notificationManager;
        ShortcutView shortcutView = this.this$0;
        View childAt = shortcutView.getChildAt(shortcutView.currentPosition);
        if (childAt != null) {
            ShortcutView shortcutView2 = this.this$0;
            if (childAt instanceof Web) {
                if (intent == null || (action = intent.getAction()) == null) {
                    action = "com.alexmanzana.bubbleall.Shortcut.CLOSE";
                }
                switch (action.hashCode()) {
                    case -2094221458:
                        if (action.equals("com.alexmanzana.bubbleall.Shortcut.CLOSE") && (notificationManager = shortcutView2.mManager) != null) {
                            notificationManager.cancel(78);
                        }
                        break;
                    case 518245677:
                        if (action.equals("com.alexmanzana.bubbleall.Shortcut.PLAY_AND_PAUSE")) {
                            shortcutView2.pauseMedia();
                        }
                        break;
                    case 667379725:
                        if (action.equals("com.alexmanzana.bubbleall.Shortcut.REPLAY_10")) {
                            ((Web) childAt).evaluateJavascript("(function(){var videos = document.querySelectorAll('video');var videoPlayback = null;if(videos.length>0){videoPlayback = videos[0];}for(var i= 0;i<videos.length;i++){if(videos[i].src.startsWith(\"blob\")){videoPlayback = videos[i];break;}else{if(videos[i].duration>videoPlayback.duration){videoPlayback = videos[i];}}}if(videoPlayback!=null && !videoPlayback.paused){videoPlayback.currentTime = videoPlayback.currentTime - 10;}})();", new ValueCallback() { // from class: com.alexmanzana.bubbleall.views.ShortcutView$receiver$1$$ExternalSyntheticLambda2
                                @Override // android.webkit.ValueCallback
                                public final void onReceiveValue(Object obj) {
                                    ShortcutView$receiver$1.onReceive$lambda$3$lambda$2((String) obj);
                                }
                            });
                        }
                        break;
                    case 1033456163:
                        if (action.equals("com.alexmanzana.bubbleall.Shortcut.FORWARD_10")) {
                            ((Web) childAt).evaluateJavascript("(function(){var videos = document.querySelectorAll('video');var videoPlayback = null;if(videos.length>0){videoPlayback = videos[0];}for(var i= 0;i<videos.length;i++){if(videos[i].src.startsWith(\"blob\")){videoPlayback = videos[i];break;}else{if(videos[i].duration>videoPlayback.duration){videoPlayback = videos[i];}}}if(videoPlayback!=null && !videoPlayback.paused){videoPlayback.currentTime = videoPlayback.currentTime + 10;}})();", new ValueCallback() { // from class: com.alexmanzana.bubbleall.views.ShortcutView$receiver$1$$ExternalSyntheticLambda1
                                @Override // android.webkit.ValueCallback
                                public final void onReceiveValue(Object obj) {
                                    ShortcutView$receiver$1.onReceive$lambda$3$lambda$1((String) obj);
                                }
                            });
                        }
                        break;
                    case 2011751121:
                        if (action.equals("com.alexmanzana.bubbleall.Shortcut.REFRESH")) {
                            ((Web) childAt).evaluateJavascript("(function(){var videos = document.querySelectorAll('video');var videoPlayback = null;if(videos.length>0){videoPlayback = videos[0];}for(var i= 0;i<videos.length;i++){if(videos[i].src.startsWith(\"blob\")){videoPlayback = videos[i];break;}else{if(videos[i].duration>videoPlayback.duration){videoPlayback = videos[i];}}}if(videoPlayback!=null && !videoPlayback.paused){videoPlayback.currentTime = 0;}})();", new ValueCallback() { // from class: com.alexmanzana.bubbleall.views.ShortcutView$receiver$1$$ExternalSyntheticLambda0
                                @Override // android.webkit.ValueCallback
                                public final void onReceiveValue(Object obj) {
                                    ShortcutView$receiver$1.onReceive$lambda$3$lambda$0((String) obj);
                                }
                            });
                        }
                        break;
                }
                if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "com.alexmanzana.bubbleall.Shortcut.CLOSE")) {
                    return;
                }
                shortcutView2.startDataNotification();
            }
        }
    }
}
