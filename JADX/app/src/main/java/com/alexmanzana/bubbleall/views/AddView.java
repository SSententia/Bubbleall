package com.alexmanzana.bubbleall.views;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.adapters.AdapterAdd;
import com.alexmanzana.bubbleall.adapters.AdapterSize;
import com.alexmanzana.bubbleall.listeners.ListenerAdd;
import com.alexmanzana.bubbleall.listeners.ListenerSize;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import com.alexmanzana.bubbleall.window.ButtonToolbar;
import com.alexmanzana.bubbleall.window.Panel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AddView.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m495d2 = {"Lcom/alexmanzana/bubbleall/views/AddView;", "Lcom/alexmanzana/bubbleall/window/Panel;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;", "isOpenConfig", "", "listenerAdd", "Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;", "getListenerAdd", "()Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;", "setListenerAdd", "(Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;)V", "listenerConfig", "Ljava/lang/Runnable;", "onClick", "", "v", "Landroid/view/View;", "onCreate", "pause", "start", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class AddView extends Panel implements View.OnClickListener {
    private AdapterAdd adapter;
    private boolean isOpenConfig;
    private ListenerAdd listenerAdd;
    private final Runnable listenerConfig;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AddView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.listenerConfig = new Runnable() { // from class: com.alexmanzana.bubbleall.views.AddView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AddView.listenerConfig$lambda$0(this.f$0, context);
            }
        };
    }

    public final ListenerAdd getListenerAdd() {
        return this.listenerAdd;
    }

    public final void setListenerAdd(ListenerAdd listenerAdd) {
        this.listenerAdd = listenerAdd;
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void onCreate() {
        super.onCreate();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.adapter = new AdapterAdd(context, this.listenerAdd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listenerConfig$lambda$0(AddView this$0, final Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        if (this$0.isOpenConfig) {
            this$0.removeAllViews();
            this$0.start();
        } else {
            this$0.finishList();
            this$0.requestIconToolbar(Integer.valueOf(C1106R.drawable.ic_baseline_settings_24));
            String string = context.getString(C1106R.string.text_bubble_config);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this$0.requestTitle(string);
            RelativeLayout.inflate(context, C1106R.layout.layout_add_window, this$0);
            ((TextView) this$0.findViewById(C1106R.id.showBubbleTitle)).setTextColor(BubblePrefs.INSTANCE.getInternalColors(context));
            ((TextView) this$0.findViewById(C1106R.id.showBubbleDesc)).setTextColor(BubblePrefs.INSTANCE.getInternalColors(context));
            ((TextView) this$0.findViewById(C1106R.id.sizeBubbleTitle)).setTextColor(BubblePrefs.INSTANCE.getInternalColors(context));
            ((TextView) this$0.findViewById(C1106R.id.sizeBubbleDesc)).setTextColor(BubblePrefs.INSTANCE.getInternalColors(context));
            ((ImageView) this$0.findViewById(C1106R.id.showBubbleImage)).setColorFilter(BubblePrefs.INSTANCE.getInternalColors(context));
            ((ImageView) this$0.findViewById(C1106R.id.hideBubbleImage)).setColorFilter(BubblePrefs.INSTANCE.getInternalColors(context));
            RelativeLayout relativeLayout = (RelativeLayout) this$0.findViewById(C1106R.id.hideBubble);
            RelativeLayout relativeLayout2 = (RelativeLayout) this$0.findViewById(C1106R.id.showBubble);
            RecyclerView recyclerView = (RecyclerView) this$0.findViewById(C1106R.id.sizeBubble);
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
            recyclerView.setAdapter(new AdapterSize(context, new ListenerSize() { // from class: com.alexmanzana.bubbleall.views.AddView$listenerConfig$1$1
                @Override // com.alexmanzana.bubbleall.listeners.ListenerSize
                public void onSize(int position) {
                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("bubble_data_prefs", 0).edit();
                    editorEdit.putInt("theme_size", position);
                    editorEdit.apply();
                    context.sendBroadcast(new Intent("com.alexmanzana.bubbleall.ACTION_MODIFY_BUBBLE"));
                }
            }, true));
            if (this$0.isVisibleBubble()) {
                relativeLayout.setBackgroundResource(C1106R.drawable.background_item_color);
                relativeLayout2.setBackgroundResource(C1106R.drawable.background_item_color_current);
            } else {
                relativeLayout.setBackgroundResource(C1106R.drawable.background_item_color_current);
                relativeLayout2.setBackgroundResource(C1106R.drawable.background_item_color);
            }
            AddView addView = this$0;
            relativeLayout.setOnClickListener(addView);
            relativeLayout2.setOnClickListener(addView);
        }
        this$0.isOpenConfig = !this$0.isOpenConfig;
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void pause() {
        removeAllViews();
        this.isOpenConfig = false;
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void start() {
        super.start();
        requestButtons(new ButtonToolbar(C1106R.drawable.ic_baseline_settings_24, this.listenerConfig));
        requestIconToolbar(Integer.valueOf(C1106R.drawable.ic_baseline_add_24));
        String string = getContext().getString(C1106R.string.text_add);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        requestTitle(string);
        AdapterAdd adapterAdd = this.adapter;
        if (adapterAdd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            adapterAdd = null;
        }
        adapterAdd.refreshAccess();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        AdapterAdd adapterAdd2 = this.adapter;
        if (adapterAdd2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            adapterAdd2 = null;
        }
        requestList(linearLayoutManager, adapterAdd2, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C1106R.id.hideBubble);
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(C1106R.id.showBubble);
        relativeLayout.setBackgroundResource(C1106R.drawable.background_item_color);
        relativeLayout2.setBackgroundResource(C1106R.drawable.background_item_color);
        v.setBackgroundResource(C1106R.drawable.background_item_color_current);
        int id = v.getId();
        if (id == C1106R.id.hideBubble) {
            hideBubble();
        } else if (id == C1106R.id.showBubble) {
            showBubble();
        }
    }
}
