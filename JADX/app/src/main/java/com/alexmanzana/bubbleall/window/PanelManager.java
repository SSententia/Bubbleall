package com.alexmanzana.bubbleall.window;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.media2.session.MediaConstants;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.listeners.ListenerSwipe;
import com.alexmanzana.bubbleall.listeners.ListenerWindow;
import com.alexmanzana.bubbleall.pojos.ItemPanel;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PanelManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000\u0097\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\f\u0018\u00002\u00020\u0001:\u0001TB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J!\u0010.\u001a\u00020(2\u0012\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u0002000/\"\u000200H\u0002¢\u0006\u0002\u00101J\u000e\u00102\u001a\u00020(2\u0006\u00103\u001a\u000204J\u0018\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\u00072\b\u00107\u001a\u0004\u0018\u00010+J\u0012\u00108\u001a\u0002042\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\u0006\u0010;\u001a\u000204J\b\u0010\u0017\u001a\u00020<H\u0002J\u0006\u0010=\u001a\u00020(J&\u0010\u000f\u001a\u00020(2\u0006\u0010>\u001a\u00020?2\n\u0010@\u001a\u0006\u0012\u0002\b\u00030A2\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0002J\u0006\u0010B\u001a\u00020(J\b\u0010C\u001a\u00020(H\u0002J\u0006\u0010D\u001a\u00020(J\b\u0010E\u001a\u00020(H\u0002J\u0006\u0010F\u001a\u00020(J\u0006\u0010G\u001a\u00020(J\u000e\u0010H\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0007J\u000e\u0010I\u001a\u00020(2\u0006\u0010J\u001a\u00020KJ\u000e\u0010I\u001a\u00020(2\u0006\u0010L\u001a\u00020\u0007J\u000e\u0010M\u001a\u00020(2\u0006\u0010N\u001a\u00020+J\u0016\u0010O\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010,\u001a\u00020-J\u0016\u0010P\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+J\u000e\u0010Q\u001a\u00020(2\u0006\u0010R\u001a\u00020+J\b\u0010S\u001a\u00020(H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006U"}, m495d2 = {"Lcom/alexmanzana/bubbleall/window/PanelManager;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "callback", "Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;", "callbackRecycler", "com/alexmanzana/bubbleall/window/PanelManager$callbackRecycler$1", "Lcom/alexmanzana/bubbleall/window/PanelManager$callbackRecycler$1;", "currentId", "list", "Landroidx/recyclerview/widget/RecyclerView;", "getList", "()Landroidx/recyclerview/widget/RecyclerView;", "setList", "(Landroidx/recyclerview/widget/RecyclerView;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;", "getListener", "()Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;", "setListener", "(Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;)V", "toast", "Landroid/widget/TextView;", "getToast", "()Landroid/widget/TextView;", "setToast", "(Landroid/widget/TextView;)V", "toolbar", "Landroid/view/View;", "getToolbar", "()Landroid/view/View;", "setToolbar", "(Landroid/view/View;)V", "args", "", MediaConstants.MEDIA_URI_QUERY_ID, "id_", "", "f", "", "buttons", "", "Lcom/alexmanzana/bubbleall/window/ButtonToolbar;", "([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V", "changeOrientation", "isVertical", "", "destroy", "panelId", "_id", "dispatchKeyEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "endList", "Lcom/alexmanzana/bubbleall/window/PanelManager$Listener;", "init", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "onBackground", "pause", "pauseMedia", "play", "playBackground", "refreshStyle", "removeView", "requestIcon", "bitmap", "Landroid/graphics/Bitmap;", "resource", "requestTitle", AppMeasurementSdk.ConditionalUserProperty.NAME, "setDataExtra", "setPanelId", "showToast", "text", "verifyVisibility", "Listener", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class PanelManager extends RelativeLayout {
    private ListenerSwipe callback;
    private final PanelManager$callbackRecycler$1 callbackRecycler;
    private int currentId;
    private RecyclerView list;
    private ListenerWindow listener;
    private TextView toast;
    private View toolbar;

    /* JADX INFO: compiled from: PanelManager.kt */
    @Metadata(m494d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u000bH&J!\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H&¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0007H&J&\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H&J\b\u0010!\u001a\u00020\u0003H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0007H&¨\u0006$"}, m495d2 = {"Lcom/alexmanzana/bubbleall/window/PanelManager$Listener;", "", "argsOnPanel", "", MediaConstants.MEDIA_URI_QUERY_ID, "", "data", "", "icon", "closeManager", "finishList", "", "hideBubble", "isVisibleBubble", "requestButtons", "buttons", "", "Lcom/alexmanzana/bubbleall/window/ButtonToolbar;", "([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V", "requestIconToolbar", "bitmap", "Landroid/graphics/Bitmap;", "idPanel", "resource", "requestList", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "callback", "Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;", "requestTitleToolbar", "title", "showBubble", "toast", "text", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public interface Listener {
        void argsOnPanel(int id, String data, Object icon);

        void closeManager();

        boolean finishList();

        void hideBubble();

        boolean isVisibleBubble();

        void requestButtons(ButtonToolbar... buttons);

        void requestIconToolbar(int resource, String idPanel);

        void requestIconToolbar(Bitmap bitmap, String idPanel);

        void requestList(RecyclerView.LayoutManager layoutManager, RecyclerView.Adapter<?> adapter, ListenerSwipe callback);

        void requestTitleToolbar(String title, String idPanel);

        void showBubble();

        void toast(String text);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PanelManager(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PanelManager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PanelManager(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.alexmanzana.bubbleall.window.PanelManager$callbackRecycler$1] */
    public PanelManager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.callbackRecycler = new ItemTouchHelper.SimpleCallback() { // from class: com.alexmanzana.bubbleall.window.PanelManager$callbackRecycler$1
            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                Intrinsics.checkNotNullParameter(target, "target");
                return false;
            }

            {
                super(0, 12);
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback
            public int getSwipeDirs(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                ListenerSwipe listenerSwipe = this.this$0.callback;
                if (listenerSwipe == null || !listenerSwipe.isSwipe(viewHolder.getAdapterPosition())) {
                    return 0;
                }
                return super.getSwipeDirs(recyclerView, viewHolder);
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                ListenerSwipe listenerSwipe = this.this$0.callback;
                if (listenerSwipe != null) {
                    listenerSwipe.onSwipe(viewHolder.getAdapterPosition());
                }
            }
        };
    }

    public final ListenerWindow getListener() {
        return this.listener;
    }

    public final void setListener(ListenerWindow listenerWindow) {
        this.listener = listenerWindow;
    }

    public final TextView getToast() {
        return this.toast;
    }

    public final void setToast(TextView textView) {
        this.toast = textView;
    }

    public final View getToolbar() {
        return this.toolbar;
    }

    public final void setToolbar(View view) {
        this.toolbar = view;
    }

    public final RecyclerView getList() {
        return this.list;
    }

    public final void setList(RecyclerView recyclerView) {
        this.list = recyclerView;
    }

    public final void pauseMedia() {
        Panel panel;
        int i = this.currentId;
        if (i == 0 || (panel = (Panel) findViewById(i)) == null) {
            return;
        }
        panel.pauseMedia();
    }

    public final void refreshStyle() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Panel) {
                Panel panel = (Panel) childAt;
                if (panel.getIsCreated()) {
                    panel.declareStyle();
                }
            }
        }
    }

    public final void removeView(int id) {
        Panel panel = (Panel) findViewById(id);
        if (panel != null) {
            removeView(panel);
        }
    }

    public final void destroy(int panelId, String _id) {
        String idPanel;
        Panel panel = (Panel) findViewById(this.currentId);
        Panel panel2 = (Panel) findViewById(panelId);
        if (panel2 == null || (idPanel = panel2.getIdPanel()) == null) {
            idPanel = "";
        }
        if (!Intrinsics.areEqual(panel != null ? Integer.valueOf(panel.getId()) : null, panel2 != null ? Integer.valueOf(panel2.getId()) : null) && panel2 != null) {
            panel2.setVisibility(8);
        }
        if (panel2 != null) {
            if (_id == null) {
                _id = idPanel;
            }
            panel2.setIdPanel(_id);
        }
        if (Intrinsics.areEqual(panel != null ? Integer.valueOf(panel.getId()) : null, panel2 != null ? Integer.valueOf(panel2.getId()) : null) && panel2 != null) {
            panel2.pause();
        }
        if (panel2 != null) {
            panel2.onDestroy();
        }
        if (panel2 != null) {
            panel2.setCreated(false);
        }
        if (panel2 != null) {
            panel2.setDestroy(true);
        }
        if (panel2 == null) {
            return;
        }
        panel2.setIdPanel(idPanel);
    }

    public final void playBackground() {
        Panel panel;
        int i = this.currentId;
        if (i == 0 || (panel = (Panel) findViewById(i)) == null) {
            return;
        }
        panel.start();
    }

    private final void pause() {
        Panel panel;
        int i = this.currentId;
        if (i == 0 || (panel = (Panel) findViewById(i)) == null) {
            return;
        }
        panel.setVisibility(8);
    }

    private final void play() {
        Panel panel;
        int i = this.currentId;
        if (i == 0 || (panel = (Panel) findViewById(i)) == null) {
            return;
        }
        panel.setVisibility(0);
    }

    public final void onBackground() {
        Panel panel;
        int i = this.currentId;
        if (i == 0 || (panel = (Panel) findViewById(i)) == null || panel.onBackground()) {
            return;
        }
        panel.pause();
    }

    public final void init() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Panel) {
                Panel panel = (Panel) childAt;
                panel.setListener(getListener());
                panel.setVisibility(8);
            } else {
                childAt.setVisibility(8);
            }
        }
    }

    private final Listener getListener() {
        return new Listener() { // from class: com.alexmanzana.bubbleall.window.PanelManager.getListener.1
            @Override // com.alexmanzana.bubbleall.window.PanelManager.Listener
            public void requestTitleToolbar(String title, String idPanel) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(idPanel, "idPanel");
                PanelManager panelManager = PanelManager.this;
                View viewFindViewById = panelManager.findViewById(panelManager.currentId);
                if (viewFindViewById != null) {
                    PanelManager panelManager2 = PanelManager.this;
                    if ((viewFindViewById instanceof Panel) && Intrinsics.areEqual(((Panel) viewFindViewById).getIdPanel(), idPanel)) {
                        panelManager2.requestTitle(title);
                    }
                }
            }

            @Override // com.alexmanzana.bubbleall.window.PanelManager.Listener
            public void toast(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                PanelManager.this.showToast(text);
            }

            @Override // com.alexmanzana.bubbleall.window.PanelManager.Listener
            public void closeManager() {
                ListenerWindow listener = PanelManager.this.getListener();
                if (listener != null) {
                    listener.hideNormal();
                }
            }

            @Override // com.alexmanzana.bubbleall.window.PanelManager.Listener
            public void argsOnPanel(int id, String data, Object icon) {
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(icon, "icon");
                if (data.length() <= 0 || ((Panel) PanelManager.this.findViewById(id)) == null) {
                    return;
                }
                PanelManager panelManager = PanelManager.this;
                panelManager.setDataExtra(id, data);
                if (icon instanceof Integer) {
                    ListenerWindow listener = panelManager.getListener();
                    if (listener != null) {
                        listener.addBubbleInPanels(new ItemPanel(data, ((Number) icon).intValue(), id, null, null, true));
                        return;
                    }
                    return;
                }
                if (icon instanceof String) {
                    ListenerWindow listener2 = panelManager.getListener();
                    if (listener2 != null) {
                        listener2.addBubbleInPanels(new ItemPanel(data, 0, id, (String) icon, null, true));
                        return;
                    }
                    return;
                }
                ListenerWindow listener3 = panelManager.getListener();
                if (listener3 != null) {
                    listener3.addBubbleInPanels(new ItemPanel(data, 0, id, null, (Bitmap) icon, true));
                }
            }

            @Override // com.alexmanzana.bubbleall.window.PanelManager.Listener
            public void requestIconToolbar(int resource, String idPanel) {
                Intrinsics.checkNotNullParameter(idPanel, "idPanel");
                PanelManager panelManager = PanelManager.this;
                View viewFindViewById = panelManager.findViewById(panelManager.currentId);
                if (viewFindViewById != null) {
                    PanelManager panelManager2 = PanelManager.this;
                    if ((viewFindViewById instanceof Panel) && Intrinsics.areEqual(((Panel) viewFindViewById).getIdPanel(), idPanel)) {
                        panelManager2.requestIcon(resource);
                    }
                }
            }

            @Override // com.alexmanzana.bubbleall.window.PanelManager.Listener
            public void requestButtons(ButtonToolbar... buttons) {
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                PanelManager.this.buttons((ButtonToolbar[]) Arrays.copyOf(buttons, buttons.length));
            }

            @Override // com.alexmanzana.bubbleall.window.PanelManager.Listener
            public void showBubble() {
                ListenerWindow listener = PanelManager.this.getListener();
                if (listener != null) {
                    listener.activeBubble();
                }
            }

            @Override // com.alexmanzana.bubbleall.window.PanelManager.Listener
            public boolean isVisibleBubble() {
                ListenerWindow listener = PanelManager.this.getListener();
                if (listener != null) {
                    return listener.isVisibleBubble();
                }
                return true;
            }

            @Override // com.alexmanzana.bubbleall.window.PanelManager.Listener
            public void hideBubble() {
                ListenerWindow listener = PanelManager.this.getListener();
                if (listener != null) {
                    listener.hideBubble();
                }
            }

            @Override // com.alexmanzana.bubbleall.window.PanelManager.Listener
            public boolean finishList() {
                return PanelManager.this.endList();
            }

            @Override // com.alexmanzana.bubbleall.window.PanelManager.Listener
            public void requestIconToolbar(Bitmap bitmap, String idPanel) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                Intrinsics.checkNotNullParameter(idPanel, "idPanel");
                PanelManager panelManager = PanelManager.this;
                View viewFindViewById = panelManager.findViewById(panelManager.currentId);
                if (viewFindViewById != null) {
                    PanelManager panelManager2 = PanelManager.this;
                    if ((viewFindViewById instanceof Panel) && Intrinsics.areEqual(((Panel) viewFindViewById).getIdPanel(), idPanel)) {
                        panelManager2.requestIcon(bitmap);
                    }
                }
            }

            @Override // com.alexmanzana.bubbleall.window.PanelManager.Listener
            public void requestList(RecyclerView.LayoutManager layoutManager, RecyclerView.Adapter<?> adapter, ListenerSwipe callback) {
                Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                PanelManager.this.list(layoutManager, adapter, callback);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buttons(final ButtonToolbar... buttons) {
        View view = this.toolbar;
        ViewGroup viewGroup = view != null ? (ViewGroup) view.findViewById(C1106R.id.buttonsToolbar) : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                viewGroup.getChildAt(i).setVisibility(8);
            }
            int length = buttons.length;
            for (final int i2 = 0; i2 < length; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView = (ImageView) childAt;
                imageView.setVisibility(0);
                BubblePrefs.Companion companion = BubblePrefs.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                imageView.setColorFilter(companion.getInternalColors(context));
                imageView.setImageResource(buttons[i2].getResource());
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.window.PanelManager$$ExternalSyntheticLambda2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PanelManager.buttons$lambda$1(buttons, i2, view2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buttons$lambda$1(ButtonToolbar[] buttons, int i, View view) {
        Intrinsics.checkNotNullParameter(buttons, "$buttons");
        buttons[i].getListener().run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void list(RecyclerView.LayoutManager layoutManager, RecyclerView.Adapter<?> adapter, ListenerSwipe listener) {
        init();
        pause();
        setVisibility(8);
        this.callback = listener;
        new ItemTouchHelper(this.callbackRecycler).attachToRecyclerView(this.list);
        RecyclerView recyclerView = this.list;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(layoutManager);
        }
        RecyclerView recyclerView2 = this.list;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(adapter);
        }
        RecyclerView recyclerView3 = this.list;
        if (recyclerView3 == null) {
            return;
        }
        recyclerView3.setVisibility(0);
    }

    public final void requestIcon(int resource) {
        View view = this.toolbar;
        ImageView imageView = view != null ? (ImageView) view.findViewById(C1106R.id.iconOption) : null;
        if (imageView != null) {
            imageView.setImageResource(resource);
        }
        if (imageView != null) {
            BubblePrefs.Companion companion = BubblePrefs.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            imageView.setColorFilter(companion.getInternalColors(context));
        }
    }

    public final void requestIcon(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        View view = this.toolbar;
        ImageView imageView = view != null ? (ImageView) view.findViewById(C1106R.id.iconOption) : null;
        if (imageView != null) {
            imageView.setColorFilter(0);
        }
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        int i;
        Intrinsics.checkNotNull(event);
        if (event.getKeyCode() == 4 && event.getAction() == 0 && (i = this.currentId) != 0) {
            ((Panel) findViewById(i)).onBackPressed();
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    public final boolean endList() {
        RecyclerView recyclerView = this.list;
        if (recyclerView == null || recyclerView.getVisibility() != 0) {
            return false;
        }
        RecyclerView recyclerView2 = this.list;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
        setVisibility(0);
        play();
        return true;
    }

    public final void setDataExtra(int id, Object f) {
        Intrinsics.checkNotNullParameter(f, "f");
        Panel panel = (Panel) findViewById(id);
        if (panel != null) {
            setPanelId(id, "");
            panel.args(f);
        }
    }

    public final void args(int id, String id_, Object f) {
        Intrinsics.checkNotNullParameter(id_, "id_");
        Intrinsics.checkNotNullParameter(f, "f");
        Panel panel = (Panel) findViewById(id);
        if (panel != null) {
            panel.setIdPanel(id_);
            panel.args(f);
        }
    }

    public final void setPanelId(int id, String id_) {
        Intrinsics.checkNotNullParameter(id_, "id_");
        endList();
        Panel panel = (Panel) findViewById(this.currentId);
        if (panel != null) {
            panel.pause();
        }
        Panel panel2 = (Panel) findViewById(id);
        if (panel2 != null) {
            this.currentId = panel2.getId();
            panel2.setIdPanel(id_);
            panel2.setVisibility(0);
            if (!panel2.getIsCreated()) {
                panel2.onCreate();
                panel2.declareStyle();
                panel2.setCreated(true);
                panel2.setDestroy(false);
            }
            panel2.start();
        }
        verifyVisibility();
    }

    private final void verifyVisibility() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Panel) {
                Panel panel = (Panel) childAt;
                if (panel.getId() == this.currentId) {
                    panel.setVisibility(0);
                } else {
                    panel.setVisibility(8);
                }
            }
        }
    }

    public final void showToast(final String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        post(new Runnable() { // from class: com.alexmanzana.bubbleall.window.PanelManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PanelManager.showToast$lambda$5(this.f$0, text);
            }
        });
        TextView textView = this.toast;
        if (textView != null) {
            textView.postDelayed(new Runnable() { // from class: com.alexmanzana.bubbleall.window.PanelManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    PanelManager.showToast$lambda$6(this.f$0);
                }
            }, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showToast$lambda$5(PanelManager this$0, String text) {
        Drawable background;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(text, "$text");
        TextView textView = this$0.toast;
        if (textView != null) {
            textView.setText(text);
        }
        TextView textView2 = this$0.toast;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this$0.toast;
        if (textView3 != null && (background = textView3.getBackground()) != null) {
            BubblePrefs.Companion companion = BubblePrefs.INSTANCE;
            Context context = this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            background.setTint(companion.getInternalColors(context));
        }
        TextView textView4 = this$0.toast;
        if (textView4 != null) {
            BubblePrefs.Companion companion2 = BubblePrefs.INSTANCE;
            Context context2 = this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            textView4.setTextColor(companion2.getColorManager(context2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showToast$lambda$6(PanelManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = this$0.toast;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public final void requestTitle(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        View view = this.toolbar;
        TextView textView = view != null ? (TextView) view.findViewById(C1106R.id.titleOption) : null;
        if (textView != null) {
            BubblePrefs.Companion companion = BubblePrefs.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setTextColor(companion.getInternalColors(context));
        }
        if (textView == null) {
            return;
        }
        textView.setText(name);
    }

    public final void changeOrientation(boolean isVertical) {
        Panel panel = (Panel) findViewById(this.currentId);
        if (panel == null || !panel.getIsCreated()) {
            return;
        }
        panel.onChangeOrientation(isVertical);
    }
}
