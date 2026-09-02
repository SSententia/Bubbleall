package com.alexmanzana.bubbleall.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.listeners.ListenerWebTab;
import com.alexmanzana.bubbleall.pojos.ItemWeb;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdapterWebTab.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\nJ\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/alexmanzana/bubbleall/listeners/ListenerWebTab;", "list", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemWeb;", "Lkotlin/collections/ArrayList;", "currentPosition", "", "(Lcom/alexmanzana/bubbleall/listeners/ListenerWebTab;Ljava/util/ArrayList;I)V", "getList", "()Ljava/util/ArrayList;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "remove", "item", "setImage", "view", "Landroid/widget/ImageView;", "image", "", "ViewHolder", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class AdapterWebTab extends RecyclerView.Adapter<ViewHolder> {
    private int currentPosition;
    private final ArrayList<ItemWeb> list;
    private final ListenerWebTab listener;

    public AdapterWebTab(ListenerWebTab listener, ArrayList<ItemWeb> list, int i) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(list, "list");
        this.listener = listener;
        this.list = list;
        this.currentPosition = i;
    }

    public final ArrayList<ItemWeb> getList() {
        return this.list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C1106R.layout.adapter_layout_webview_tab, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new ViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.currentPosition != position) {
            ImageView icon = holder.getIcon();
            Object bitmap = this.list.get(position).getBitmap();
            if (bitmap == null) {
                bitmap = Integer.valueOf(C1106R.drawable.ic_web);
            }
            setImage(icon, bitmap);
        } else {
            holder.getIcon().setColorFilter(Color.parseColor("#89CD6D"));
            holder.getIcon().setImageResource(C1106R.drawable.ic_check);
        }
        TextView title = holder.getTitle();
        BubblePrefs.Companion companion = BubblePrefs.INSTANCE;
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        title.setTextColor(companion.getInternalColors(context));
        TextView title2 = holder.getTitle();
        String title3 = this.list.get(position).getTitle();
        if (title3 == null) {
            title3 = this.list.get(position).getUrl();
        }
        title2.setText(title3);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.adapters.AdapterWebTab$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdapterWebTab.onBindViewHolder$lambda$0(position, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(int i, AdapterWebTab this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != this$0.currentPosition) {
            this$0.listener.onClick(i);
        }
    }

    public final void remove(int item) {
        int size = this.list.size() - 1;
        int i = this.currentPosition;
        if (i != 0 && item != size) {
            this.currentPosition = i - 1;
        }
        this.list.remove(item);
        notifyItemRemoved(item);
        notifyItemRangeChanged(item, this.list.size());
        this.listener.onRemove(item, this.currentPosition);
    }

    private final void setImage(ImageView view, Object image) {
        if (image instanceof Bitmap) {
            view.setColorFilter(0);
            view.setImageBitmap((Bitmap) image);
            return;
        }
        BubblePrefs.Companion companion = BubblePrefs.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setColorFilter(companion.getInternalColors(context));
        Intrinsics.checkNotNull(image, "null cannot be cast to non-null type kotlin.Int");
        view.setImageResource(((Integer) image).intValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    /* JADX INFO: compiled from: AdapterWebTab.kt */
    @Metadata(m494d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView icon;
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(C1106R.id.imageIcon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(C1106R.id.titleItem);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.title = (TextView) viewFindViewById2;
        }

        public final ImageView getIcon() {
            return this.icon;
        }

        public final TextView getTitle() {
            return this.title;
        }
    }
}
