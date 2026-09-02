package com.alexmanzana.bubbleall;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media2.session.MediaConstants;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.adapters.AdapterPanels;
import com.alexmanzana.bubbleall.listeners.ListenerAdd;
import com.alexmanzana.bubbleall.listeners.ListenerPanel;
import com.alexmanzana.bubbleall.listeners.ListenerWindow;
import com.alexmanzana.bubbleall.pojos.ItemAdd;
import com.alexmanzana.bubbleall.pojos.ItemData;
import com.alexmanzana.bubbleall.pojos.ItemPanel;
import com.alexmanzana.bubbleall.utils.AnimationUtils;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import com.alexmanzana.bubbleall.utils.ShortcutPrefs;
import com.alexmanzana.bubbleall.views.AddView;
import com.alexmanzana.bubbleall.window.Panel;
import com.alexmanzana.bubbleall.window.PanelManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BubbleService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0004\b\u000b\u000e\u001c\u0018\u0000 l2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001lB\u0005¢\u0006\u0002\u0010\u0004J\b\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u0002062\u0006\u0010;\u001a\u000200H\u0016J\u0010\u0010<\u001a\u0002062\u0006\u0010=\u001a\u000203H\u0002J\u0010\u0010<\u001a\u0002062\u0006\u0010=\u001a\u000209H\u0002J\u0012\u0010>\u001a\u0002062\b\u0010?\u001a\u0004\u0018\u00010@H\u0002J\u0010\u0010A\u001a\u0002062\u0006\u0010B\u001a\u00020CH\u0002J\u0014\u0010D\u001a\u0002062\n\b\u0002\u0010B\u001a\u0004\u0018\u00010CH\u0002J\u0010\u0010E\u001a\u0002062\u0006\u0010;\u001a\u000200H\u0002J\b\u0010F\u001a\u000206H\u0002J\u0014\u0010G\u001a\u0002062\n\b\u0002\u0010B\u001a\u0004\u0018\u00010CH\u0002J\b\u0010H\u001a\u000206H\u0002J\b\u0010I\u001a\u000206H\u0002J\b\u0010J\u001a\u000206H\u0002J\u0010\u0010K\u001a\u00020\u00112\u0006\u00108\u001a\u000203H\u0002J\u0010\u0010L\u001a\u00020\u00112\u0006\u0010M\u001a\u000209H\u0002J\b\u0010N\u001a\u00020&H\u0002J\b\u0010O\u001a\u00020&H\u0002J\b\u0010P\u001a\u000203H\u0002J\u0010\u0010Q\u001a\u0002032\u0006\u0010M\u001a\u000209H\u0002J\b\u0010R\u001a\u000206H\u0016J\b\u0010S\u001a\u000206H\u0016J\b\u0010T\u001a\u00020\u0011H\u0016J\b\u0010U\u001a\u000206H\u0002J\u0014\u0010V\u001a\u0004\u0018\u00010W2\b\u0010X\u001a\u0004\u0018\u00010@H\u0016J \u0010Y\u001a\u00020\u00112\u0006\u0010M\u001a\u0002092\u0006\u0010Z\u001a\u0002032\u0006\u0010[\u001a\u000203H\u0016J\b\u0010\\\u001a\u000206H\u0016J\u0010\u0010]\u001a\u0002062\u0006\u0010^\u001a\u00020_H\u0016J\b\u0010`\u001a\u000206H\u0016J\b\u0010a\u001a\u000206H\u0016J\"\u0010b\u001a\u0002032\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010c\u001a\u0002032\u0006\u0010d\u001a\u000203H\u0017J\b\u0010e\u001a\u000206H\u0002J\b\u0010f\u001a\u000206H\u0002J\b\u0010g\u001a\u000206H\u0002J\u0012\u0010h\u001a\u0002062\b\u0010?\u001a\u0004\u0018\u00010@H\u0002J\u0012\u0010i\u001a\u0002062\b\u0010?\u001a\u0004\u0018\u00010@H\u0002J\b\u0010j\u001a\u000206H\u0002J\b\u0010k\u001a\u000206H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020&X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020&X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u0012\u0012\u0004\u0012\u0002000/j\b\u0012\u0004\u0012\u000200`1X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006m"}, m495d2 = {"Lcom/alexmanzana/bubbleall/BubbleService;", "Landroid/app/Service;", "Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;", "Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;", "()V", "adapter", "Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;", "argsBubble", "com/alexmanzana/bubbleall/BubbleService$argsBubble$1", "Lcom/alexmanzana/bubbleall/BubbleService$argsBubble$1;", "callbackHorizontal", "com/alexmanzana/bubbleall/BubbleService$callbackHorizontal$1", "Lcom/alexmanzana/bubbleall/BubbleService$callbackHorizontal$1;", "callbackVertical", "com/alexmanzana/bubbleall/BubbleService$callbackVertical$1", "Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;", "isHideBubble", "", "isInitManger", "isOnlyBubble", "isOpenManager", "mBubble", "Landroid/view/View;", "mHandler", "Landroid/os/Handler;", "mInflater", "Landroid/view/LayoutInflater;", "mListenerMoveBubble", "com/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1", "Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;", "mPanelManager", "Lcom/alexmanzana/bubbleall/window/PanelManager;", "mPrefs", "Landroid/content/SharedPreferences;", "mView", "Landroid/widget/LinearLayout;", "mViewManager", "mViewManagerParams", "Landroid/view/WindowManager$LayoutParams;", "mViewManagerParamsI", "mViewParams", "mWindowManager", "Landroid/view/WindowManager;", "optionsHorizontal", "Landroidx/recyclerview/widget/RecyclerView;", "optionsVertical", "panels", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemPanel;", "Lkotlin/collections/ArrayList;", "xBubble", "", "yBubble", "activeBubble", "", "activePanel", "openItem", "", "addBubbleInPanels", "item", "addForPosition", "positionMenu", "animationStart", "intent", "Landroid/content/Intent;", "animationToEnd", "runnable", "Ljava/lang/Runnable;", "animationToNormal", "clearPanels", "closeAllViews", "closeManager", "declareProperties", "declareReceiver", "declareValues", "existsOption", "existsPanel", MediaConstants.MEDIA_URI_QUERY_ID, "getBaseParams", "getParamsManager", "getPositionActive", "getPositionForId", "hideBubble", "hideNormal", "isVisibleBubble", "modifyBubble", "onBind", "Landroid/os/IBinder;", "p0", "onClick", "position", "resourceId", "onClose", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "onDestroy", "onStartCommand", "flags", "startId", "open", "openManager", "prepareAddView", "preparePanel", "requestArgsBubble", "requestLayoutOrientation", "toTop", "Companion", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class BubbleService extends Service implements ListenerWindow, ListenerPanel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isStarting;
    private AdapterPanels adapter;
    private boolean isHideBubble;
    private boolean isInitManger;
    private boolean isOnlyBubble;
    private boolean isOpenManager;
    private View mBubble;
    private Handler mHandler;
    private LayoutInflater mInflater;
    private PanelManager mPanelManager;
    private SharedPreferences mPrefs;
    private LinearLayout mView;
    private View mViewManager;
    private WindowManager.LayoutParams mViewManagerParams;
    private WindowManager.LayoutParams mViewManagerParamsI;
    private WindowManager.LayoutParams mViewParams;
    private WindowManager mWindowManager;
    private RecyclerView optionsHorizontal;
    private RecyclerView optionsVertical;
    private int xBubble;
    private int yBubble;
    private final ArrayList<ItemPanel> panels = new ArrayList<>();
    private final BubbleService$argsBubble$1 argsBubble = new BroadcastReceiver() { // from class: com.alexmanzana.bubbleall.BubbleService$argsBubble$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context p0, Intent p1) {
            String action = p1 != null ? p1.getAction() : null;
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == -1459612733) {
                    if (action.equals("com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE")) {
                        this.this$0.requestArgsBubble(p1);
                    }
                } else if (iHashCode == 259207075) {
                    if (action.equals("com.alexmanzana.bubbleall.ACTION_OPEN_MANAGER")) {
                        this.this$0.openManager();
                    }
                } else if (iHashCode == 593411078 && action.equals("com.alexmanzana.bubbleall.ACTION_MODIFY_BUBBLE")) {
                    this.this$0.modifyBubble();
                }
            }
        }
    };
    private final BubbleService$callbackHorizontal$1 callbackHorizontal = new ItemTouchHelper.SimpleCallback() { // from class: com.alexmanzana.bubbleall.BubbleService$callbackHorizontal$1
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
            if (viewHolder.getAdapterPosition() == this.this$0.panels.size() - 1) {
                return 0;
            }
            return super.getSwipeDirs(recyclerView, viewHolder);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            int adapterPosition = viewHolder.getAdapterPosition();
            int size = this.this$0.panels.size() - 2;
            int size2 = this.this$0.panels.size() - 1;
            PanelManager panelManager = this.this$0.mPanelManager;
            AdapterPanels adapterPanels = null;
            if (panelManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
                panelManager = null;
            }
            panelManager.destroy(((ItemPanel) this.this$0.panels.get(adapterPosition)).getResourceId(), ((ItemPanel) this.this$0.panels.get(adapterPosition)).getId());
            Object obj = this.this$0.panels.get(adapterPosition);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            if (((ItemPanel) obj).isActive()) {
                if (adapterPosition == size) {
                    AdapterPanels adapterPanels2 = this.this$0.adapter;
                    if (adapterPanels2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        adapterPanels2 = null;
                    }
                    adapterPanels2.active(size2);
                } else {
                    AdapterPanels adapterPanels3 = this.this$0.adapter;
                    if (adapterPanels3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        adapterPanels3 = null;
                    }
                    adapterPanels3.active(adapterPosition + 1);
                }
            }
            this.this$0.panels.remove(adapterPosition);
            AdapterPanels adapterPanels4 = this.this$0.adapter;
            if (adapterPanels4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                adapterPanels4 = null;
            }
            adapterPanels4.notifyItemRemoved(adapterPosition);
            AdapterPanels adapterPanels5 = this.this$0.adapter;
            if (adapterPanels5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                adapterPanels = adapterPanels5;
            }
            adapterPanels.notifyItemRangeChanged(adapterPosition, this.this$0.panels.size());
        }
    };
    private final BubbleService$callbackVertical$1 callbackVertical = new ItemTouchHelper.SimpleCallback() { // from class: com.alexmanzana.bubbleall.BubbleService$callbackVertical$1
        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            Intrinsics.checkNotNullParameter(target, "target");
            return false;
        }

        {
            super(0, 3);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback
        public int getSwipeDirs(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            if (viewHolder.getAdapterPosition() == this.this$0.panels.size() - 1) {
                return 0;
            }
            return super.getSwipeDirs(recyclerView, viewHolder);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            int adapterPosition = viewHolder.getAdapterPosition();
            int size = this.this$0.panels.size() - 2;
            int size2 = this.this$0.panels.size() - 1;
            PanelManager panelManager = this.this$0.mPanelManager;
            AdapterPanels adapterPanels = null;
            if (panelManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
                panelManager = null;
            }
            panelManager.destroy(((ItemPanel) this.this$0.panels.get(adapterPosition)).getResourceId(), ((ItemPanel) this.this$0.panels.get(adapterPosition)).getId());
            Object obj = this.this$0.panels.get(adapterPosition);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            if (((ItemPanel) obj).isActive()) {
                if (adapterPosition == size) {
                    AdapterPanels adapterPanels2 = this.this$0.adapter;
                    if (adapterPanels2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        adapterPanels2 = null;
                    }
                    adapterPanels2.active(size2);
                } else {
                    AdapterPanels adapterPanels3 = this.this$0.adapter;
                    if (adapterPanels3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        adapterPanels3 = null;
                    }
                    adapterPanels3.active(adapterPosition + 1);
                }
            }
            this.this$0.panels.remove(adapterPosition);
            AdapterPanels adapterPanels4 = this.this$0.adapter;
            if (adapterPanels4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                adapterPanels4 = null;
            }
            adapterPanels4.notifyItemRemoved(adapterPosition);
            AdapterPanels adapterPanels5 = this.this$0.adapter;
            if (adapterPanels5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                adapterPanels = adapterPanels5;
            }
            adapterPanels.notifyItemRangeChanged(adapterPosition, this.this$0.panels.size());
        }
    };
    private final BubbleService$mListenerMoveBubble$1 mListenerMoveBubble = new View.OnTouchListener() { // from class: com.alexmanzana.bubbleall.BubbleService$mListenerMoveBubble$1
        private final int MAX_CLICK_DURATION = 200;
        private float initialTouchX;
        private float initialTouchY;
        private int initialX;
        private int initialY;
        private long startClickTime;

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            Intent intent = new Intent("com.alexmanzana.bubbleall.ACTION_START_ONLY_BUBBLE");
            int action = event.getAction();
            WindowManager.LayoutParams layoutParams = null;
            if (action == 0) {
                this.startClickTime = Calendar.getInstance().getTimeInMillis();
                WindowManager.LayoutParams layoutParams2 = this.this$0.mViewParams;
                if (layoutParams2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
                    layoutParams2 = null;
                }
                this.initialX = layoutParams2.x;
                WindowManager.LayoutParams layoutParams3 = this.this$0.mViewParams;
                if (layoutParams3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
                } else {
                    layoutParams = layoutParams3;
                }
                this.initialY = layoutParams.y;
                this.initialTouchX = event.getRawX();
                this.initialTouchY = event.getRawY();
                if (this.this$0.isOnlyBubble) {
                    intent.putExtra("bubble_state", "down");
                    this.this$0.sendBroadcast(intent);
                }
                return true;
            }
            if (action != 1) {
                if (action != 2 || this.this$0.isOpenManager) {
                    return false;
                }
                WindowManager.LayoutParams layoutParams4 = this.this$0.mViewParams;
                if (layoutParams4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
                    layoutParams4 = null;
                }
                layoutParams4.x = this.initialX + ((int) (event.getRawX() - this.initialTouchX));
                WindowManager.LayoutParams layoutParams5 = this.this$0.mViewParams;
                if (layoutParams5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
                    layoutParams5 = null;
                }
                layoutParams5.y = this.initialY + ((int) (event.getRawY() - this.initialTouchY));
                WindowManager windowManager = this.this$0.mWindowManager;
                if (windowManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mWindowManager");
                    windowManager = null;
                }
                LinearLayout linearLayout = this.this$0.mView;
                if (linearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mView");
                    linearLayout = null;
                }
                LinearLayout linearLayout2 = linearLayout;
                WindowManager.LayoutParams layoutParams6 = this.this$0.mViewParams;
                if (layoutParams6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
                } else {
                    layoutParams = layoutParams6;
                }
                windowManager.updateViewLayout(linearLayout2, layoutParams);
                return true;
            }
            if (this.this$0.isOnlyBubble) {
                intent.putExtra("bubble_state", "up");
                WindowManager.LayoutParams layoutParams7 = this.this$0.mViewParams;
                if (layoutParams7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
                    layoutParams7 = null;
                }
                intent.putExtra("xBubble", layoutParams7.x);
                WindowManager.LayoutParams layoutParams8 = this.this$0.mViewParams;
                if (layoutParams8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
                } else {
                    layoutParams = layoutParams8;
                }
                intent.putExtra("yBubble", layoutParams.y);
                this.this$0.sendBroadcast(intent);
            } else if (Calendar.getInstance().getTimeInMillis() - this.startClickTime < this.MAX_CLICK_DURATION) {
                this.this$0.openManager();
            }
            return true;
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent p0) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        isStarting = true;
        BubbleService bubbleService = this;
        Intent intent = new Intent(bubbleService, (Class<?>) DynamicActivity.class);
        intent.setAction("com.alexmanzana.bubbleall.ACTION_OPEN_MANAGER");
        NotificationCompat.Builder builder = new NotificationCompat.Builder(bubbleService, "channel_service");
        builder.setSmallIcon(C1106R.drawable.ic_service_small);
        builder.setContentIntent(PendingIntent.getActivity(bubbleService, 0, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
        builder.setColor(BubblePrefs.INSTANCE.getColorBubble(bubbleService));
        builder.setContentText(getString(C1106R.string.text_description_service));
        builder.setOngoing(true);
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setColorized(true);
        }
        startForeground(4, builder.build());
        declareValues();
        declareReceiver();
    }

    private final void declareReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alexmanzana.bubbleall.ACTION_START_ONLY_BUBBLE");
        intentFilter.addAction("com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE");
        intentFilter.addAction("com.alexmanzana.bubbleall.ACTION_MODIFY_BUBBLE");
        intentFilter.addAction("com.alexmanzana.bubbleall.ACTION_OPEN_MANAGER");
        try {
            registerReceiver(this.argsBubble, intentFilter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void modifyBubble() {
        AdapterPanels adapterPanels = this.adapter;
        PanelManager panelManager = null;
        if (adapterPanels == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            adapterPanels = null;
        }
        adapterPanels.notifyItemRangeChanged(0, this.panels.size());
        BubbleService bubbleService = this;
        int sizeBubble = BubblePrefs.INSTANCE.getSizeBubble(bubbleService);
        if (sizeBubble == 1) {
            View view = this.mBubble;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBubble");
                view = null;
            }
            view.setBackgroundResource(C1106R.drawable.ic_bubble_medium);
        } else if (sizeBubble == 2) {
            View view2 = this.mBubble;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBubble");
                view2 = null;
            }
            view2.setBackgroundResource(C1106R.drawable.ic_bubble_small);
        } else {
            View view3 = this.mBubble;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBubble");
                view3 = null;
            }
            view3.setBackgroundResource(C1106R.drawable.ic_bubble_big);
        }
        View view4 = this.mViewManager;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
            view4 = null;
        }
        view4.findViewById(C1106R.id.contentLayout).getBackground().setTint(BubblePrefs.INSTANCE.getColorManager(bubbleService));
        View view5 = this.mBubble;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBubble");
            view5 = null;
        }
        view5.getBackground().setTint(BubblePrefs.INSTANCE.getColorBubble(bubbleService));
        PanelManager panelManager2 = this.mPanelManager;
        if (panelManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
        } else {
            panelManager = panelManager2;
        }
        panelManager.refreshStyle();
    }

    /* JADX INFO: compiled from: BubbleService.kt */
    @Metadata(m494d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m495d2 = {"Lcom/alexmanzana/bubbleall/BubbleService$Companion;", "", "()V", "isStarting", "", "()Z", "setStarting", "(Z)V", "start", "", "context", "Landroid/content/Context;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isStarting() {
            return BubbleService.isStarting;
        }

        public final void setStarting(boolean z) {
            BubbleService.isStarting = z;
        }

        public final void start(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) BubbleService.class);
            if (!isStarting()) {
                context.startService(intent);
            } else {
                context.stopService(intent);
            }
            setStarting(!isStarting());
        }
    }

    private final void closeAllViews() {
        WindowManager windowManager = this.mWindowManager;
        View view = null;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWindowManager");
            windowManager = null;
        }
        LinearLayout linearLayout = this.mView;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            linearLayout = null;
        }
        windowManager.removeView(linearLayout);
        if (!this.isOnlyBubble) {
            for (ItemPanel itemPanel : this.panels) {
                PanelManager panelManager = this.mPanelManager;
                if (panelManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
                    panelManager = null;
                }
                panelManager.destroy(itemPanel.getResourceId(), itemPanel.getId());
                PanelManager panelManager2 = this.mPanelManager;
                if (panelManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
                    panelManager2 = null;
                }
                panelManager2.removeView(itemPanel.getResourceId());
            }
            WindowManager windowManager2 = this.mWindowManager;
            if (windowManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWindowManager");
                windowManager2 = null;
            }
            View view2 = this.mViewManager;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
            } else {
                view = view2;
            }
            windowManager2.removeView(view);
        }
        isStarting = false;
        try {
            unregisterReceiver(this.argsBubble);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (this.isOpenManager) {
            closeManager(new Runnable() { // from class: com.alexmanzana.bubbleall.BubbleService$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    BubbleService.onDestroy$lambda$1(this.f$0);
                }
            });
        } else {
            closeAllViews();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDestroy$lambda$1(BubbleService this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.closeAllViews();
    }

    private final void declareValues() {
        WindowManager.LayoutParams layoutParams;
        Object systemService = getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.mWindowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams = new WindowManager.LayoutParams(0, 0, 2038, 8, -2);
        } else {
            layoutParams = new WindowManager.LayoutParams(0, 0, 2002, 8, -2);
        }
        this.mViewManagerParamsI = layoutParams;
        layoutParams.y = 0;
        WindowManager.LayoutParams layoutParams2 = this.mViewManagerParamsI;
        WindowManager.LayoutParams layoutParams3 = null;
        if (layoutParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewManagerParamsI");
            layoutParams2 = null;
        }
        layoutParams2.x = 0;
        WindowManager.LayoutParams layoutParams4 = this.mViewManagerParamsI;
        if (layoutParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewManagerParamsI");
        } else {
            layoutParams3 = layoutParams4;
        }
        layoutParams3.gravity = 80;
        this.mViewParams = getBaseParams();
        this.mViewManagerParams = getParamsManager();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        this.mInflater = layoutInflaterFrom;
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        this.mHandler = new Handler(looperMyLooper);
        SharedPreferences sharedPreferences = getSharedPreferences("bubble_data_prefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.mPrefs = sharedPreferences;
    }

    private final WindowManager.LayoutParams getParamsManager() {
        WindowManager.LayoutParams layoutParams;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams = new WindowManager.LayoutParams(-1, -1, 2038, 262144, -2);
        } else {
            layoutParams = new WindowManager.LayoutParams(-1, -1, 2002, 33554432, -2);
        }
        layoutParams.y = 0;
        layoutParams.x = 0;
        layoutParams.gravity = 48;
        return layoutParams;
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerWindow
    public boolean isVisibleBubble() {
        return !this.isHideBubble;
    }

    private final WindowManager.LayoutParams getBaseParams() {
        WindowManager.LayoutParams layoutParams;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams = new WindowManager.LayoutParams(-2, -2, 2038, 8, -3);
        } else {
            layoutParams = new WindowManager.LayoutParams(-2, -2, 2002, 8, -3);
        }
        layoutParams.gravity = 8388659;
        layoutParams.y = 0;
        layoutParams.x = 0;
        return layoutParams;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        BubbleService bubbleService = this;
        LinearLayout linearLayout = new LinearLayout(bubbleService);
        this.mView = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = this.mView;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            linearLayout2 = null;
        }
        linearLayout2.setGravity(49);
        LayoutInflater layoutInflater = this.mInflater;
        if (layoutInflater == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInflater");
            layoutInflater = null;
        }
        int i = C1106R.layout.layout_bubble;
        LinearLayout linearLayout3 = this.mView;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            linearLayout3 = null;
        }
        View viewInflate = layoutInflater.inflate(i, (ViewGroup) linearLayout3, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        this.mBubble = viewInflate;
        int sizeBubble = BubblePrefs.INSTANCE.getSizeBubble(bubbleService);
        if (sizeBubble == 1) {
            View view = this.mBubble;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBubble");
                view = null;
            }
            view.setBackgroundResource(C1106R.drawable.ic_bubble_medium);
        } else if (sizeBubble == 2) {
            View view2 = this.mBubble;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBubble");
                view2 = null;
            }
            view2.setBackgroundResource(C1106R.drawable.ic_bubble_small);
        } else {
            View view3 = this.mBubble;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBubble");
                view3 = null;
            }
            view3.setBackgroundResource(C1106R.drawable.ic_bubble_big);
        }
        LinearLayout linearLayout4 = this.mView;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            linearLayout4 = null;
        }
        View view4 = this.mBubble;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBubble");
            view4 = null;
        }
        linearLayout4.addView(view4, new LinearLayout.LayoutParams(-2, -2));
        this.isOnlyBubble = Intrinsics.areEqual(intent != null ? intent.getAction() : null, "com.alexmanzana.bubbleall.ACTION_START_ONLY_BUBBLE");
        WindowManager windowManager = this.mWindowManager;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWindowManager");
            windowManager = null;
        }
        LinearLayout linearLayout5 = this.mView;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            linearLayout5 = null;
        }
        LinearLayout linearLayout6 = linearLayout5;
        WindowManager.LayoutParams layoutParams = this.mViewParams;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
            layoutParams = null;
        }
        windowManager.addView(linearLayout6, layoutParams);
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "com.alexmanzana.bubbleall.ACTION_START_ONLY_BUBBLE")) {
            SharedPreferences sharedPreferences = this.mPrefs;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPrefs");
                sharedPreferences = null;
            }
            int i2 = sharedPreferences.getInt("xBubble", 0);
            SharedPreferences sharedPreferences2 = this.mPrefs;
            if (sharedPreferences2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPrefs");
                sharedPreferences2 = null;
            }
            int i3 = sharedPreferences2.getInt("yBubble", 200);
            View view5 = this.mBubble;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBubble");
                view5 = null;
            }
            view5.setOnTouchListener(this.mListenerMoveBubble);
            View view6 = this.mBubble;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBubble");
                view6 = null;
            }
            view6.getBackground().setTint(BubblePrefs.INSTANCE.getColorBubble(bubbleService));
            WindowManager.LayoutParams layoutParams2 = this.mViewParams;
            if (layoutParams2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
                layoutParams2 = null;
            }
            layoutParams2.x = i2;
            WindowManager.LayoutParams layoutParams3 = this.mViewParams;
            if (layoutParams3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
                layoutParams3 = null;
            }
            layoutParams3.y = i3;
            WindowManager windowManager2 = this.mWindowManager;
            if (windowManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWindowManager");
                windowManager2 = null;
            }
            LinearLayout linearLayout7 = this.mView;
            if (linearLayout7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
                linearLayout7 = null;
            }
            LinearLayout linearLayout8 = linearLayout7;
            WindowManager.LayoutParams layoutParams4 = this.mViewParams;
            if (layoutParams4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
                layoutParams4 = null;
            }
            windowManager2.updateViewLayout(linearLayout8, layoutParams4);
        }
        if (!Intrinsics.areEqual(intent != null ? intent.getAction() : null, "com.alexmanzana.bubbleall.ACTION_START_ONLY_BUBBLE")) {
            LayoutInflater layoutInflater2 = this.mInflater;
            if (layoutInflater2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInflater");
                layoutInflater2 = null;
            }
            View viewInflate2 = layoutInflater2.inflate(C1106R.layout.layout_window, (ViewGroup) null, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            this.mViewManager = viewInflate2;
            if (!PreferenceManager.getDefaultSharedPreferences(bubbleService).getBoolean("key_main_only_menu", false)) {
                this.panels.add(new ItemPanel("add", C1106R.drawable.ic_baseline_add_24, C1106R.id.addView, null, null, true));
            }
            this.adapter = new AdapterPanels(this, this.panels);
            prepareAddView();
            preparePanel(intent);
            animationStart(intent);
            declareProperties();
            requestLayoutOrientation();
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestArgsBubble(Intent intent) {
        if (intent == null || !Intrinsics.areEqual(intent.getAction(), "com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE")) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("com.alexmanzana.bubbleall.EXTRA_ITEM_DATA");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.alexmanzana.bubbleall.pojos.ItemData");
        ItemData itemData = (ItemData) serializableExtra;
        if (existsOption(itemData.getResource())) {
            PanelManager panelManager = null;
            if (existsPanel(itemData.getId())) {
                if (!activePanel(itemData.getId())) {
                    AdapterPanels adapterPanels = this.adapter;
                    if (adapterPanels == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        adapterPanels = null;
                    }
                    adapterPanels.active(getPositionForId(itemData.getId()));
                }
                toTop();
            } else {
                addForPosition(itemData.getId());
                toTop();
            }
            PanelManager panelManager2 = this.mPanelManager;
            if (panelManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
            } else {
                panelManager = panelManager2;
            }
            panelManager.setDataExtra(itemData.getResource(), itemData.getData());
            if (intent.getBooleanExtra("com.alexmanzana.bubbleall.EXTRA_OPEN_MANAGER", false)) {
                openManager();
            }
        }
    }

    private final boolean existsOption(int openItem) {
        PanelManager panelManager = this.mPanelManager;
        if (panelManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
            panelManager = null;
        }
        int childCount = panelManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            PanelManager panelManager2 = this.mPanelManager;
            if (panelManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
                panelManager2 = null;
            }
            View childAt = panelManager2.getChildAt(i);
            if (childAt != null && (childAt instanceof Panel) && ((Panel) childAt).getId() == openItem) {
                return true;
            }
        }
        return false;
    }

    private final boolean activePanel(String openItem) {
        for (ItemPanel itemPanel : this.panels) {
            if (Intrinsics.areEqual(itemPanel.getId(), openItem)) {
                return itemPanel.isActive();
            }
        }
        return false;
    }

    private final void clearPanels(ItemPanel item) {
        PanelManager panelManager = this.mPanelManager;
        PanelManager panelManager2 = null;
        if (panelManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
            panelManager = null;
        }
        int childCount = panelManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            PanelManager panelManager3 = this.mPanelManager;
            if (panelManager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
                panelManager3 = null;
            }
            View childAt = panelManager3.getChildAt(i);
            if (childAt != null && childAt.getId() != item.getResourceId()) {
                PanelManager panelManager4 = this.mPanelManager;
                if (panelManager4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
                    panelManager4 = null;
                }
                panelManager4.removeViewAt(i);
            }
        }
        PanelManager panelManager5 = this.mPanelManager;
        if (panelManager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
        } else {
            panelManager2 = panelManager5;
        }
        panelManager2.setPanelId(item.getResourceId(), item.getId());
    }

    private final void prepareAddView() {
        View view = this.mViewManager;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
            view = null;
        }
        AddView addView = (AddView) view.findViewById(C1106R.id.addView);
        if (addView == null) {
            return;
        }
        addView.setListenerAdd(new ListenerAdd() { // from class: com.alexmanzana.bubbleall.BubbleService.prepareAddView.1
            @Override // com.alexmanzana.bubbleall.listeners.ListenerAdd
            public void onClick(ItemAdd option, int position) {
                Intrinsics.checkNotNullParameter(option, "option");
                AdapterPanels adapterPanels = null;
                if (BubbleService.this.existsPanel(option.getId())) {
                    AdapterPanels adapterPanels2 = BubbleService.this.adapter;
                    if (adapterPanels2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        adapterPanels = adapterPanels2;
                    }
                    adapterPanels.active(BubbleService.this.getPositionForId(option.getId()));
                    return;
                }
                AdapterPanels adapterPanels3 = BubbleService.this.adapter;
                if (adapterPanels3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    adapterPanels3 = null;
                }
                adapterPanels3.disableAll();
                ItemPanel itemPanelCreate = ItemPanel.INSTANCE.create(option);
                BubbleService.this.panels.add(0, itemPanelCreate);
                AdapterPanels adapterPanels4 = BubbleService.this.adapter;
                if (adapterPanels4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    adapterPanels = adapterPanels4;
                }
                adapterPanels.notifyItemInserted(0);
                BubbleService.this.onClick(itemPanelCreate.getId(), position, itemPanelCreate.getResourceId());
            }

            @Override // com.alexmanzana.bubbleall.listeners.ListenerAdd
            public void onLong(ItemAdd option, int position) {
                Intrinsics.checkNotNullParameter(option, "option");
                if (BubbleService.this.existsPanel(option.getId())) {
                    return;
                }
                int resourceId = option.getResourceId();
                PanelManager panelManager = null;
                if (resourceId == C1106R.id.shortcutPanel) {
                    PanelManager panelManager2 = BubbleService.this.mPanelManager;
                    if (panelManager2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
                        panelManager2 = null;
                    }
                    panelManager2.args(option.getResourceId(), option.getId(), "");
                    PanelManager panelManager3 = BubbleService.this.mPanelManager;
                    if (panelManager3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
                    } else {
                        panelManager = panelManager3;
                    }
                    String string = BubbleService.this.getString(C1106R.string.text_shortcut_clean);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    panelManager.showToast(string);
                    return;
                }
                if (resourceId == C1106R.id.videoPanel) {
                    Intent intent = new Intent(BubbleService.this, (Class<?>) VideoActivity.class);
                    intent.addFlags(268435456);
                    BubbleService.this.startActivity(intent);
                    BubbleService.closeManager$default(BubbleService.this, null, 1, null);
                    return;
                }
                if (resourceId == C1106R.id.musicPanel) {
                    Intent intent2 = new Intent(BubbleService.this, (Class<?>) MusicActivity.class);
                    intent2.addFlags(268435456);
                    BubbleService.this.startActivity(intent2);
                    BubbleService.closeManager$default(BubbleService.this, null, 1, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPositionForId(String id) {
        int size = this.panels.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.areEqual(this.panels.get(i).getId(), id)) {
                return i;
            }
        }
        return this.panels.size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean existsPanel(String id) {
        Iterator<ItemPanel> it = this.panels.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next().getId(), id)) {
                return true;
            }
        }
        return false;
    }

    private final void requestLayoutOrientation() {
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(this.callbackVertical);
        RecyclerView recyclerView = this.optionsVertical;
        PanelManager panelManager = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("optionsVertical");
            recyclerView = null;
        }
        itemTouchHelper.attachToRecyclerView(recyclerView);
        ItemTouchHelper itemTouchHelper2 = new ItemTouchHelper(this.callbackHorizontal);
        RecyclerView recyclerView2 = this.optionsHorizontal;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("optionsHorizontal");
            recyclerView2 = null;
        }
        itemTouchHelper2.attachToRecyclerView(recyclerView2);
        if (getResources().getConfiguration().orientation == 1) {
            View view = this.mViewManager;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
                view = null;
            }
            view.findViewById(C1106R.id.optionsManager).setVisibility(0);
            View view2 = this.mViewManager;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
                view2 = null;
            }
            view2.findViewById(C1106R.id.optionsManagerHorizontal).setVisibility(8);
            RecyclerView recyclerView3 = this.optionsVertical;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("optionsVertical");
                recyclerView3 = null;
            }
            AdapterPanels adapterPanels = this.adapter;
            if (adapterPanels == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                adapterPanels = null;
            }
            recyclerView3.setAdapter(adapterPanels);
            RecyclerView recyclerView4 = this.optionsHorizontal;
            if (recyclerView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("optionsHorizontal");
                recyclerView4 = null;
            }
            recyclerView4.setAdapter(null);
        } else {
            View view3 = this.mViewManager;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
                view3 = null;
            }
            view3.findViewById(C1106R.id.optionsManager).setVisibility(8);
            View view4 = this.mViewManager;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
                view4 = null;
            }
            view4.findViewById(C1106R.id.optionsManagerHorizontal).setVisibility(0);
            RecyclerView recyclerView5 = this.optionsVertical;
            if (recyclerView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("optionsVertical");
                recyclerView5 = null;
            }
            recyclerView5.setAdapter(null);
            RecyclerView recyclerView6 = this.optionsHorizontal;
            if (recyclerView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("optionsHorizontal");
                recyclerView6 = null;
            }
            AdapterPanels adapterPanels2 = this.adapter;
            if (adapterPanels2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                adapterPanels2 = null;
            }
            recyclerView6.setAdapter(adapterPanels2);
        }
        PanelManager panelManager2 = this.mPanelManager;
        if (panelManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
        } else {
            panelManager = panelManager2;
        }
        panelManager.changeOrientation(getResources().getConfiguration().orientation == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openManager() {
        if (this.isOpenManager) {
            closeManager$default(this, null, 1, null);
        } else {
            open();
        }
    }

    private final void open() {
        this.isOpenManager = true;
        View view = this.mViewManager;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
            view = null;
        }
        view.setVisibility(0);
        View view3 = this.mBubble;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBubble");
        } else {
            view2 = view3;
        }
        view2.setVisibility(0);
        animationToEnd(new Runnable() { // from class: com.alexmanzana.bubbleall.BubbleService$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                BubbleService.open$lambda$6(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void open$lambda$6(BubbleService this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PanelManager panelManager = null;
        if (!this$0.isInitManger) {
            WindowManager windowManager = this$0.mWindowManager;
            if (windowManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWindowManager");
                windowManager = null;
            }
            View view = this$0.mViewManager;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
                view = null;
            }
            WindowManager.LayoutParams layoutParams = this$0.mViewManagerParams;
            if (layoutParams == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewManagerParams");
                layoutParams = null;
            }
            windowManager.addView(view, layoutParams);
            this$0.isInitManger = true;
        }
        View view2 = this$0.mBubble;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBubble");
            view2 = null;
        }
        view2.setVisibility(4);
        WindowManager windowManager2 = this$0.mWindowManager;
        if (windowManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWindowManager");
            windowManager2 = null;
        }
        View view3 = this$0.mViewManager;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
            view3 = null;
        }
        WindowManager.LayoutParams layoutParams2 = this$0.mViewManagerParams;
        if (layoutParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewManagerParams");
            layoutParams2 = null;
        }
        windowManager2.updateViewLayout(view3, layoutParams2);
        this$0.toTop();
        PanelManager panelManager2 = this$0.mPanelManager;
        if (panelManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
        } else {
            panelManager = panelManager2;
        }
        panelManager.playBackground();
    }

    private final void animationToEnd(final Runnable runnable) {
        WindowManager.LayoutParams layoutParams = this.mViewParams;
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
            layoutParams = null;
        }
        this.xBubble = layoutParams.x;
        WindowManager.LayoutParams layoutParams3 = this.mViewParams;
        if (layoutParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
        } else {
            layoutParams2 = layoutParams3;
        }
        int i = layoutParams2.y;
        this.yBubble = i;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 0);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alexmanzana.bubbleall.BubbleService$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BubbleService.animationToEnd$lambda$7(this.f$0, valueAnimator);
            }
        });
        valueAnimatorOfInt.setDuration(150L);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(this.xBubble, getResources().getDisplayMetrics().widthPixels);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alexmanzana.bubbleall.BubbleService$$ExternalSyntheticLambda5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BubbleService.animationToEnd$lambda$8(this.f$0, valueAnimator);
            }
        });
        valueAnimatorOfInt2.setDuration(150L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt2, valueAnimatorOfInt);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.alexmanzana.bubbleall.BubbleService.animationToEnd.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                runnable.run();
            }
        });
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationToEnd$lambda$7(BubbleService this$0, ValueAnimator valueAnimator1) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(valueAnimator1, "valueAnimator1");
        WindowManager.LayoutParams layoutParams = this$0.mViewParams;
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
            layoutParams = null;
        }
        Object animatedValue = valueAnimator1.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.y = ((Integer) animatedValue).intValue();
        WindowManager windowManager = this$0.mWindowManager;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWindowManager");
            windowManager = null;
        }
        LinearLayout linearLayout = this$0.mView;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            linearLayout = null;
        }
        LinearLayout linearLayout2 = linearLayout;
        WindowManager.LayoutParams layoutParams3 = this$0.mViewParams;
        if (layoutParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
        } else {
            layoutParams2 = layoutParams3;
        }
        windowManager.updateViewLayout(linearLayout2, layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationToEnd$lambda$8(BubbleService this$0, ValueAnimator valueAnimator1) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(valueAnimator1, "valueAnimator1");
        WindowManager.LayoutParams layoutParams = this$0.mViewParams;
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
            layoutParams = null;
        }
        Object animatedValue = valueAnimator1.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.x = ((Integer) animatedValue).intValue();
        WindowManager windowManager = this$0.mWindowManager;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWindowManager");
            windowManager = null;
        }
        LinearLayout linearLayout = this$0.mView;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            linearLayout = null;
        }
        LinearLayout linearLayout2 = linearLayout;
        WindowManager.LayoutParams layoutParams3 = this$0.mViewParams;
        if (layoutParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
        } else {
            layoutParams2 = layoutParams3;
        }
        windowManager.updateViewLayout(linearLayout2, layoutParams2);
    }

    private final void toTop() {
        int positionActive = getPositionActive();
        ItemPanel itemPanel = this.panels.get(positionActive);
        Intrinsics.checkNotNullExpressionValue(itemPanel, "get(...)");
        ItemPanel itemPanel2 = itemPanel;
        if (Intrinsics.areEqual(itemPanel2.getId(), "add")) {
            return;
        }
        this.panels.remove(positionActive);
        this.panels.add(0, itemPanel2);
        AdapterPanels adapterPanels = this.adapter;
        if (adapterPanels == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            adapterPanels = null;
        }
        adapterPanels.notifyItemMoved(positionActive, 0);
    }

    private final int getPositionActive() {
        int i = 0;
        for (Object obj : this.panels) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (((ItemPanel) obj).isActive()) {
                return i;
            }
            i = i2;
        }
        return this.panels.size() - 1;
    }

    private final void declareProperties() {
        View view = this.mViewManager;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
            view = null;
        }
        View viewFindViewById = view.findViewById(C1106R.id.optionsManager);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.optionsVertical = (RecyclerView) viewFindViewById;
        View view3 = this.mViewManager;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
            view3 = null;
        }
        View viewFindViewById2 = view3.findViewById(C1106R.id.optionsManagerHorizontal);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.optionsHorizontal = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("optionsHorizontal");
            recyclerView = null;
        }
        BubbleService bubbleService = this;
        recyclerView.setLayoutManager(new LinearLayoutManager(bubbleService, 1, false));
        RecyclerView recyclerView2 = this.optionsVertical;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("optionsVertical");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(bubbleService, 0, true));
        View view4 = this.mBubble;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBubble");
            view4 = null;
        }
        view4.setOnTouchListener(this.mListenerMoveBubble);
        View view5 = this.mBubble;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBubble");
        } else {
            view2 = view5;
        }
        view2.getBackground().setTint(BubblePrefs.INSTANCE.getColorBubble(bubbleService));
    }

    private final void animationStart(final Intent intent) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences sharedPreferences = this.mPrefs;
        Handler handler = null;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrefs");
            sharedPreferences = null;
        }
        final int i = sharedPreferences.getInt("yBubble", 200);
        SharedPreferences sharedPreferences2 = this.mPrefs;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrefs");
            sharedPreferences2 = null;
        }
        final int i2 = sharedPreferences2.getInt("xBubble", 0);
        if (defaultSharedPreferences.getBoolean("key_go_position", true)) {
            Looper looperMyLooper = Looper.myLooper();
            Intrinsics.checkNotNull(looperMyLooper);
            new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.alexmanzana.bubbleall.BubbleService$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    BubbleService.animationStart$lambda$12(this.f$0, i, i2, intent);
                }
            }, 500L);
            return;
        }
        WindowManager.LayoutParams layoutParams = this.mViewParams;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
            layoutParams = null;
        }
        layoutParams.x = i2;
        WindowManager.LayoutParams layoutParams2 = this.mViewParams;
        if (layoutParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
            layoutParams2 = null;
        }
        layoutParams2.y = i;
        WindowManager windowManager = this.mWindowManager;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWindowManager");
            windowManager = null;
        }
        LinearLayout linearLayout = this.mView;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            linearLayout = null;
        }
        LinearLayout linearLayout2 = linearLayout;
        WindowManager.LayoutParams layoutParams3 = this.mViewParams;
        if (layoutParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
            layoutParams3 = null;
        }
        windowManager.updateViewLayout(linearLayout2, layoutParams3);
        Handler handler2 = this.mHandler;
        if (handler2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
        } else {
            handler = handler2;
        }
        handler.postDelayed(new Runnable() { // from class: com.alexmanzana.bubbleall.BubbleService$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                BubbleService.animationStart$lambda$14(intent, this);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationStart$lambda$12(final BubbleService this$0, int i, int i2, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WindowManager.LayoutParams layoutParams = this$0.mViewParams;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
            layoutParams = null;
        }
        int i3 = layoutParams.y;
        this$0.yBubble = i3;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i3, i);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alexmanzana.bubbleall.BubbleService$$ExternalSyntheticLambda8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BubbleService.animationStart$lambda$12$lambda$10(this.f$0, valueAnimator);
            }
        });
        valueAnimatorOfInt.setDuration(200L);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(this$0.xBubble, i2);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alexmanzana.bubbleall.BubbleService$$ExternalSyntheticLambda9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BubbleService.animationStart$lambda$12$lambda$11(this.f$0, valueAnimator);
            }
        });
        valueAnimatorOfInt2.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt2, valueAnimatorOfInt);
        animatorSet.addListener(new BubbleService$animationStart$1$3(this$0, intent));
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationStart$lambda$12$lambda$10(BubbleService this$0, ValueAnimator valueAnimator1) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(valueAnimator1, "valueAnimator1");
        try {
            WindowManager.LayoutParams layoutParams = this$0.mViewParams;
            WindowManager.LayoutParams layoutParams2 = null;
            if (layoutParams == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
                layoutParams = null;
            }
            Object animatedValue = valueAnimator1.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.y = ((Integer) animatedValue).intValue();
            WindowManager windowManager = this$0.mWindowManager;
            if (windowManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWindowManager");
                windowManager = null;
            }
            LinearLayout linearLayout = this$0.mView;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
                linearLayout = null;
            }
            LinearLayout linearLayout2 = linearLayout;
            WindowManager.LayoutParams layoutParams3 = this$0.mViewParams;
            if (layoutParams3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
            } else {
                layoutParams2 = layoutParams3;
            }
            windowManager.updateViewLayout(linearLayout2, layoutParams2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationStart$lambda$12$lambda$11(BubbleService this$0, ValueAnimator valueAnimator1) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(valueAnimator1, "valueAnimator1");
        WindowManager.LayoutParams layoutParams = this$0.mViewParams;
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
            layoutParams = null;
        }
        Object animatedValue = valueAnimator1.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.x = ((Integer) animatedValue).intValue();
        WindowManager windowManager = this$0.mWindowManager;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWindowManager");
            windowManager = null;
        }
        LinearLayout linearLayout = this$0.mView;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            linearLayout = null;
        }
        LinearLayout linearLayout2 = linearLayout;
        WindowManager.LayoutParams layoutParams3 = this$0.mViewParams;
        if (layoutParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
        } else {
            layoutParams2 = layoutParams3;
        }
        windowManager.updateViewLayout(linearLayout2, layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationStart$lambda$14(Intent intent, BubbleService this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (intent == null || !Intrinsics.areEqual(intent.getAction(), "com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE")) {
            return;
        }
        this$0.openManager();
    }

    private final void preparePanel(Intent intent) {
        View view = this.mViewManager;
        PanelManager panelManager = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
            view = null;
        }
        BubbleService bubbleService = this;
        view.findViewById(C1106R.id.contentLayout).getBackground().setTint(BubblePrefs.INSTANCE.getColorManager(bubbleService));
        View view2 = this.mViewManager;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
            view2 = null;
        }
        View viewFindViewById = view2.findViewById(C1106R.id.containerPanel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        PanelManager panelManager2 = (PanelManager) viewFindViewById;
        this.mPanelManager = panelManager2;
        if (panelManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
            panelManager2 = null;
        }
        View view3 = this.mViewManager;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
            view3 = null;
        }
        panelManager2.setToolbar(view3.findViewById(C1106R.id.toolbarManager));
        PanelManager panelManager3 = this.mPanelManager;
        if (panelManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
            panelManager3 = null;
        }
        View view4 = this.mViewManager;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
            view4 = null;
        }
        panelManager3.setList((RecyclerView) view4.findViewById(C1106R.id.recyclerOptions));
        PanelManager panelManager4 = this.mPanelManager;
        if (panelManager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
            panelManager4 = null;
        }
        View view5 = this.mViewManager;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
            view5 = null;
        }
        panelManager4.setToast((TextView) view5.findViewById(C1106R.id.toastView));
        PanelManager panelManager5 = this.mPanelManager;
        if (panelManager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
            panelManager5 = null;
        }
        panelManager5.setListener(this);
        PanelManager panelManager6 = this.mPanelManager;
        if (panelManager6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
            panelManager6 = null;
        }
        panelManager6.init();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(bubbleService);
        SharedPreferences sharedPreferences = this.mPrefs;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrefs");
            sharedPreferences = null;
        }
        int i = sharedPreferences.getInt("menu_option", -1);
        if (intent != null && intent.getBooleanExtra("com.alexmanzana.bubbleall.EXTRA_ITEM_ONLY", false)) {
            this.panels.clear();
            Serializable serializableExtra = intent.getSerializableExtra("com.alexmanzana.bubbleall.EXTRA_ITEM_DATA");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.alexmanzana.bubbleall.pojos.ItemData");
            addForPosition(((ItemData) serializableExtra).getId());
            ArrayList<ItemPanel> arrayList = this.panels;
            ItemPanel itemPanel = arrayList.get(arrayList.size() - 1);
            Intrinsics.checkNotNullExpressionValue(itemPanel, "get(...)");
            clearPanels(itemPanel);
        } else if (defaultSharedPreferences.getBoolean("key_main_only_menu", false)) {
            addForPosition(i);
            ArrayList<ItemPanel> arrayList2 = this.panels;
            ItemPanel itemPanel2 = arrayList2.get(arrayList2.size() - 1);
            Intrinsics.checkNotNullExpressionValue(itemPanel2, "get(...)");
            clearPanels(itemPanel2);
        } else {
            PanelManager panelManager7 = this.mPanelManager;
            if (panelManager7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
                panelManager7 = null;
            }
            panelManager7.setPanelId(C1106R.id.addView, "add");
        }
        requestArgsBubble(intent);
        PanelManager panelManager8 = this.mPanelManager;
        if (panelManager8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
        } else {
            panelManager = panelManager8;
        }
        panelManager.refreshStyle();
    }

    private final void addForPosition(String positionMenu) {
        int iHashCode = positionMenu.hashCode();
        if (iHashCode != 117588) {
            if (iHashCode != 104263205) {
                if (iHashCode == 112202875 && positionMenu.equals("video")) {
                    this.panels.add(new ItemPanel("video", C1106R.drawable.ic_baseline_video_24, C1106R.id.videoPanel, null, null, true));
                }
            } else if (positionMenu.equals("music")) {
                this.panels.add(new ItemPanel("music", C1106R.drawable.ic_baseline_library_music_24, C1106R.id.musicPanel, null, null, true));
            }
        } else if (positionMenu.equals("web")) {
            this.panels.add(new ItemPanel("web", C1106R.drawable.ic_web, C1106R.id.webPanel, null, null, true));
        }
        AdapterPanels adapterPanels = this.adapter;
        if (adapterPanels == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            adapterPanels = null;
        }
        adapterPanels.active(this.panels.size() - 1);
    }

    private final void addForPosition(int positionMenu) {
        if (positionMenu == 0) {
            this.panels.add(new ItemPanel("web", C1106R.drawable.ic_web, C1106R.id.webPanel, null, null, true));
            return;
        }
        if (positionMenu == 1) {
            this.panels.add(new ItemPanel("video", C1106R.drawable.ic_baseline_video_24, C1106R.id.videoPanel, null, null, true));
            return;
        }
        if (positionMenu == 2) {
            this.panels.add(new ItemPanel("music", C1106R.drawable.ic_baseline_library_music_24, C1106R.id.musicPanel, null, null, true));
            return;
        }
        ItemAdd itemAdd = ShortcutPrefs.INSTANCE.list(this).get(positionMenu - 3);
        Intrinsics.checkNotNullExpressionValue(itemAdd, "get(...)");
        ItemAdd itemAdd2 = itemAdd;
        this.panels.add(new ItemPanel(itemAdd2.getId(), 0, C1106R.id.shortcutPanel, itemAdd2.getResourceBitmap(), null, true));
    }

    static /* synthetic */ void closeManager$default(BubbleService bubbleService, Runnable runnable, int i, Object obj) {
        if ((i & 1) != 0) {
            runnable = null;
        }
        bubbleService.closeManager(runnable);
    }

    private final void closeManager(Runnable runnable) {
        this.isOpenManager = false;
        WindowManager windowManager = this.mWindowManager;
        PanelManager panelManager = null;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWindowManager");
            windowManager = null;
        }
        View view = this.mViewManager;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewManager");
            view = null;
        }
        WindowManager.LayoutParams layoutParams = this.mViewManagerParamsI;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewManagerParamsI");
            layoutParams = null;
        }
        windowManager.updateViewLayout(view, layoutParams);
        animationToNormal(runnable);
        PanelManager panelManager2 = this.mPanelManager;
        if (panelManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
        } else {
            panelManager = panelManager2;
        }
        panelManager.onBackground();
    }

    static /* synthetic */ void animationToNormal$default(BubbleService bubbleService, Runnable runnable, int i, Object obj) {
        if ((i & 1) != 0) {
            runnable = null;
        }
        bubbleService.animationToNormal(runnable);
    }

    private final void animationToNormal(final Runnable runnable) {
        WindowManager.LayoutParams layoutParams = this.mViewParams;
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
            layoutParams = null;
        }
        int i = layoutParams.x;
        WindowManager.LayoutParams layoutParams3 = this.mViewParams;
        if (layoutParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
        } else {
            layoutParams2 = layoutParams3;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams2.y, this.yBubble);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alexmanzana.bubbleall.BubbleService$$ExternalSyntheticLambda6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BubbleService.animationToNormal$lambda$15(this.f$0, valueAnimator);
            }
        });
        valueAnimatorOfInt.setDuration(230L);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i, this.xBubble);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alexmanzana.bubbleall.BubbleService$$ExternalSyntheticLambda7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BubbleService.animationToNormal$lambda$16(this.f$0, valueAnimator);
            }
        });
        valueAnimatorOfInt2.setDuration(230L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new AnimationUtils() { // from class: com.alexmanzana.bubbleall.BubbleService.animationToNormal.3
            @Override // com.alexmanzana.bubbleall.utils.AnimationUtils, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                View view = null;
                if (BubbleService.this.isHideBubble) {
                    View view2 = BubbleService.this.mBubble;
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBubble");
                    } else {
                        view = view2;
                    }
                    view.setVisibility(8);
                } else {
                    View view3 = BubbleService.this.mBubble;
                    if (view3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBubble");
                    } else {
                        view = view3;
                    }
                    view.setVisibility(0);
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // com.alexmanzana.bubbleall.utils.AnimationUtils, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                View view = BubbleService.this.mBubble;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBubble");
                    view = null;
                }
                view.setVisibility(0);
            }
        });
        animatorSet.playTogether(valueAnimatorOfInt2, valueAnimatorOfInt);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationToNormal$lambda$15(BubbleService this$0, ValueAnimator valueAnimator1) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(valueAnimator1, "valueAnimator1");
        WindowManager.LayoutParams layoutParams = this$0.mViewParams;
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
            layoutParams = null;
        }
        Object animatedValue = valueAnimator1.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.y = ((Integer) animatedValue).intValue();
        WindowManager windowManager = this$0.mWindowManager;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWindowManager");
            windowManager = null;
        }
        LinearLayout linearLayout = this$0.mView;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            linearLayout = null;
        }
        LinearLayout linearLayout2 = linearLayout;
        WindowManager.LayoutParams layoutParams3 = this$0.mViewParams;
        if (layoutParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
        } else {
            layoutParams2 = layoutParams3;
        }
        windowManager.updateViewLayout(linearLayout2, layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationToNormal$lambda$16(BubbleService this$0, ValueAnimator valueAnimator1) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(valueAnimator1, "valueAnimator1");
        WindowManager.LayoutParams layoutParams = this$0.mViewParams;
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
            layoutParams = null;
        }
        Object animatedValue = valueAnimator1.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.x = ((Integer) animatedValue).intValue();
        WindowManager windowManager = this$0.mWindowManager;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWindowManager");
            windowManager = null;
        }
        LinearLayout linearLayout = this$0.mView;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            linearLayout = null;
        }
        LinearLayout linearLayout2 = linearLayout;
        WindowManager.LayoutParams layoutParams3 = this$0.mViewParams;
        if (layoutParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewParams");
        } else {
            layoutParams2 = layoutParams3;
        }
        windowManager.updateViewLayout(linearLayout2, layoutParams2);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        requestLayoutOrientation();
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerWindow
    public void hideBubble() {
        this.isHideBubble = true;
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerWindow
    public void hideNormal() {
        closeManager$default(this, null, 1, null);
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerWindow
    public void activeBubble() {
        this.isHideBubble = false;
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerWindow
    public void addBubbleInPanels(ItemPanel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AdapterPanels adapterPanels = this.adapter;
        AdapterPanels adapterPanels2 = null;
        if (adapterPanels == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            adapterPanels = null;
        }
        adapterPanels.disableAll();
        this.panels.add(0, item);
        AdapterPanels adapterPanels3 = this.adapter;
        if (adapterPanels3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            adapterPanels2 = adapterPanels3;
        }
        adapterPanels2.notifyItemInserted(0);
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerPanel
    public boolean onClick(String id, int position, int resourceId) {
        Intrinsics.checkNotNullParameter(id, "id");
        PanelManager panelManager = this.mPanelManager;
        if (panelManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPanelManager");
            panelManager = null;
        }
        panelManager.setPanelId(resourceId, id);
        return true;
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerPanel
    public void onClose() {
        hideNormal();
    }
}
