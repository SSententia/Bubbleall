package com.alexmanzana.bubbleall.window;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.media2.session.MediaConstants;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.listeners.ListenerSwipe;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Panel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001fJ\u000e\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\nJ\u0006\u0010&\u001a\u00020\u001dJ\b\u0010'\u001a\u00020\u001dH\u0016J\b\u0010(\u001a\u00020\u0010H\u0016J\u0006\u0010)\u001a\u00020\u001dJ\u0006\u0010*\u001a\u00020\u0010J\b\u0010+\u001a\u00020\u001dH\u0016J\b\u0010,\u001a\u00020\u0010H\u0016J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u0010H\u0016J\b\u0010/\u001a\u00020\u001dH\u0016J\b\u00100\u001a\u00020\u001dH\u0016J\b\u00101\u001a\u00020\u001dH\u0016J\b\u00102\u001a\u00020\u001dH\u0016J\u001f\u00103\u001a\u00020\u001d2\u0012\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u00020605\"\u000206¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020:H\u0002J\u000e\u00108\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001fJ\u0010\u00108\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u0007H\u0002J&\u0010<\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020>2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u000e\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\nJ\u0016\u0010E\u001a\u00020\u001d2\u0006\u00109\u001a\u00020:2\u0006\u0010D\u001a\u00020\nJ\u0016\u0010E\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\nJ\u0006\u0010F\u001a\u00020\u001dJ\b\u0010G\u001a\u00020\u001dH\u0016J\u000e\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020JJ\u000e\u0010K\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\nR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006M"}, m495d2 = {"Lcom/alexmanzana/bubbleall/window/Panel;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "idPanel", "", "getIdPanel", "()Ljava/lang/String;", "setIdPanel", "(Ljava/lang/String;)V", "isCreated", "", "()Z", "setCreated", "(Z)V", "isDestroy", "setDestroy", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/alexmanzana/bubbleall/window/PanelManager$Listener;", "getListener", "()Lcom/alexmanzana/bubbleall/window/PanelManager$Listener;", "setListener", "(Lcom/alexmanzana/bubbleall/window/PanelManager$Listener;)V", "args", "", "item", "", "argsOnPanel", MediaConstants.MEDIA_URI_QUERY_ID, "data", "icon", "checkPermission", "permission", "closeManager", "declareStyle", "finishList", "hideBubble", "isVisibleBubble", "onBackPressed", "onBackground", "onChangeOrientation", "isVertical", "onCreate", "onDestroy", "pause", "pauseMedia", "requestButtons", "buttons", "", "Lcom/alexmanzana/bubbleall/window/ButtonToolbar;", "([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V", "requestIconToolbar", "bitmap", "Landroid/graphics/Bitmap;", "resource", "requestList", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "callback", "Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;", "requestTitle", "title", "requestToolbar", "showBubble", "start", "startActivity", "intent", "Landroid/content/Intent;", "toast", "text", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public class Panel extends RelativeLayout {
    private String idPanel;
    private boolean isCreated;
    private boolean isDestroy;
    private PanelManager.Listener listener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Panel(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Panel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void args(Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    public void declareStyle() {
    }

    public void onBackPressed() {
    }

    public boolean onBackground() {
        return false;
    }

    public void onChangeOrientation(boolean isVertical) {
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }

    public void pause() {
    }

    public void pauseMedia() {
    }

    public void start() {
    }

    public /* synthetic */ Panel(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Panel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.idPanel = "";
    }

    public final PanelManager.Listener getListener() {
        return this.listener;
    }

    public final void setListener(PanelManager.Listener listener) {
        this.listener = listener;
    }

    /* JADX INFO: renamed from: isCreated, reason: from getter */
    public final boolean getIsCreated() {
        return this.isCreated;
    }

    public final void setCreated(boolean z) {
        this.isCreated = z;
    }

    public final String getIdPanel() {
        return this.idPanel;
    }

    public final void setIdPanel(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idPanel = str;
    }

    /* JADX INFO: renamed from: isDestroy, reason: from getter */
    public final boolean getIsDestroy() {
        return this.isDestroy;
    }

    public final void setDestroy(boolean z) {
        this.isDestroy = z;
    }

    public final boolean checkPermission(String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ContextCompat.checkSelfPermission(getContext(), permission) == 0;
    }

    public final void startActivity(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        intent.addFlags(268435456);
        getContext().startActivity(intent);
    }

    public final void requestTitle(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        PanelManager.Listener listener = this.listener;
        if (listener != null) {
            listener.requestTitleToolbar(title, this.idPanel);
        }
    }

    public final void toast(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        PanelManager.Listener listener = this.listener;
        if (listener != null) {
            listener.toast(text);
        }
    }

    public final void hideBubble() {
        PanelManager.Listener listener = this.listener;
        if (listener != null) {
            listener.hideBubble();
        }
    }

    public final boolean isVisibleBubble() {
        PanelManager.Listener listener = this.listener;
        if (listener != null) {
            return listener.isVisibleBubble();
        }
        return true;
    }

    public final void showBubble() {
        PanelManager.Listener listener = this.listener;
        if (listener != null) {
            listener.showBubble();
        }
    }

    public final void closeManager() {
        PanelManager.Listener listener = this.listener;
        if (listener != null) {
            listener.closeManager();
        }
    }

    public void requestList(RecyclerView.LayoutManager layoutManager, RecyclerView.Adapter<?> adapter, ListenerSwipe callback) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        PanelManager.Listener listener = this.listener;
        if (listener != null) {
            listener.requestList(layoutManager, adapter, callback);
        }
    }

    public boolean finishList() {
        PanelManager.Listener listener = this.listener;
        if (listener != null) {
            return listener.finishList();
        }
        return false;
    }

    public final void argsOnPanel(int id, String data, Object icon) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(icon, "icon");
        PanelManager.Listener listener = this.listener;
        if (listener != null) {
            listener.argsOnPanel(id, data, icon);
        }
    }

    public final void requestButtons(ButtonToolbar... buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        PanelManager.Listener listener = this.listener;
        if (listener != null) {
            listener.requestButtons((ButtonToolbar[]) Arrays.copyOf(buttons, buttons.length));
        }
    }

    private final void requestIconToolbar(int resource) {
        PanelManager.Listener listener = this.listener;
        if (listener != null) {
            listener.requestIconToolbar(resource, this.idPanel);
        }
    }

    private final void requestIconToolbar(Bitmap bitmap) {
        PanelManager.Listener listener = this.listener;
        if (listener != null) {
            listener.requestIconToolbar(bitmap, this.idPanel);
        }
    }

    public final void requestIconToolbar(Object icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        if (icon instanceof Bitmap) {
            requestIconToolbar((Bitmap) icon);
        } else {
            requestIconToolbar(((Integer) icon).intValue());
        }
    }

    public final void requestToolbar(int resource, String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        requestTitle(title);
        requestIconToolbar(resource);
    }

    public final void requestToolbar(Bitmap bitmap, String title) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(title, "title");
        requestTitle(title);
        requestIconToolbar(bitmap);
    }
}
