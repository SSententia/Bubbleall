package com.alexmanzana.bubbleall.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.listeners.ListenerPanel;
import com.alexmanzana.bubbleall.pojos.ItemPanel;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdapterPanels.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000bJ\b\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;", "panels", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemPanel;", "Lkotlin/collections/ArrayList;", "(Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;Ljava/util/ArrayList;)V", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "position", "", "disableAll", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setImage", "icon", "Landroid/widget/ImageView;", "image", "", "ViewHolder", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class AdapterPanels extends RecyclerView.Adapter<ViewHolder> {
    private final ListenerPanel listener;
    private final ArrayList<ItemPanel> panels;

    public AdapterPanels(ListenerPanel listener, ArrayList<ItemPanel> panels) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(panels, "panels");
        this.listener = listener;
        this.panels = panels;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C1106R.layout.adapter_layout_panel, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new ViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        BubblePrefs.Companion companion = BubblePrefs.INSTANCE;
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int sizeBubble = companion.getSizeBubble(context);
        if (sizeBubble == 1) {
            holder.itemView.setBackgroundResource(C1106R.drawable.ic_bubble_medium);
        } else if (sizeBubble == 2) {
            holder.itemView.setBackgroundResource(C1106R.drawable.ic_bubble_small);
        } else {
            holder.itemView.setBackgroundResource(C1106R.drawable.ic_bubble_big);
        }
        ImageView icon = holder.getIcon();
        Object resourceImage = this.panels.get(position).getResourceImage();
        if (resourceImage == null && (resourceImage = this.panels.get(position).getResourceBitmap()) == null) {
            resourceImage = Integer.valueOf(this.panels.get(position).getResource());
        }
        setImage(icon, resourceImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.adapters.AdapterPanels$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdapterPanels.onBindViewHolder$lambda$0(this.f$0, position, view);
            }
        });
        if (this.panels.get(position).isActive()) {
            Drawable background = holder.itemView.getBackground();
            BubblePrefs.Companion companion2 = BubblePrefs.INSTANCE;
            Context context2 = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            background.setTint(companion2.getColorTabSelected(context2));
            return;
        }
        Drawable background2 = holder.itemView.getBackground();
        BubblePrefs.Companion companion3 = BubblePrefs.INSTANCE;
        Context context3 = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        background2.setTint(companion3.getColorTabNotSelected(context3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(AdapterPanels this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.panels.get(i).isActive()) {
                this$0.listener.onClose();
            } else {
                this$0.active(i);
            }
        } catch (Exception unused) {
        }
    }

    private final void setImage(ImageView icon, Object image) {
        if (image instanceof Bitmap) {
            icon.setImageBitmap((Bitmap) image);
        } else if (image instanceof Integer) {
            icon.setImageResource(((Number) image).intValue());
        } else {
            Intrinsics.checkNotNull(image, "null cannot be cast to non-null type kotlin.String");
            icon.setImageBitmap(BitmapFactory.decodeFile((String) image));
        }
    }

    public final void active(int position) {
        disableAll();
        this.panels.get(position).setActive(this.listener.onClick(this.panels.get(position).getId(), position, this.panels.get(position).getResourceId()));
        notifyItemChanged(position);
    }

    public final void disableAll() {
        int size = this.panels.size();
        for (int i = 0; i < size; i++) {
            this.panels.get(i).setActive(false);
            notifyItemChanged(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.panels.size();
    }

    /* JADX INFO: compiled from: AdapterPanels.kt */
    @Metadata(m494d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView icon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(C1106R.id.imagePanel);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById;
        }

        public final ImageView getIcon() {
            return this.icon;
        }
    }
}
