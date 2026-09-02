package com.alexmanzana.bubbleall.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.listeners.ListenerSize;
import com.alexmanzana.bubbleall.pojos.ItemSize;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdapterSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0006\u0010\u001a\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterSize;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;", "context", "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/alexmanzana/bubbleall/listeners/ListenerSize;", "isMini", "", "(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerSize;Z)V", "currentSize", "", "listSize", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemSize;", "Lkotlin/collections/ArrayList;", "disableAll", "", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refresh", "ViewHolder", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class AdapterSize extends RecyclerView.Adapter<ViewHolder> {
    private final Context context;
    private int currentSize;
    private final boolean isMini;
    private final ArrayList<ItemSize> listSize;
    private final ListenerSize listener;

    public AdapterSize(Context context, ListenerSize listener, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.listener = listener;
        this.isMini = z;
        ArrayList<ItemSize> arrayList = new ArrayList<>();
        this.listSize = arrayList;
        this.currentSize = BubblePrefs.INSTANCE.getSizeBubble(context);
        arrayList.add(new ItemSize(C1106R.string.text_size_big, C1106R.drawable.ic_bubble_big, 0));
        arrayList.add(new ItemSize(C1106R.string.text_size_medium, C1106R.drawable.ic_bubble_medium, 1));
        arrayList.add(new ItemSize(C1106R.string.text_size_small, C1106R.drawable.ic_bubble_small, 2));
    }

    public /* synthetic */ AdapterSize(Context context, ListenerSize listenerSize, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, listenerSize, (i & 4) != 0 ? false : z);
    }

    public final void refresh() {
        this.currentSize = BubblePrefs.INSTANCE.getSizeBubble(this.context);
        notifyItemRangeChanged(0, this.listSize.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.isMini) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C1106R.layout.adapter_layout_color_text_mini, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new ViewHolder(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(C1106R.layout.adapter_layout_color_text, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new ViewHolder(viewInflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.currentSize == position) {
            holder.getText().setTextColor(ContextCompat.getColor(this.context, C1106R.color.colorPrimary));
            holder.getTheme().setBackgroundResource(C1106R.drawable.background_item_color_current);
        } else {
            if (this.isMini) {
                holder.getText().setTextColor(BubblePrefs.INSTANCE.getInternalColors(this.context));
            } else {
                holder.getText().setTextColor(ContextCompat.getColor(this.context, C1106R.color.colorPrimaryText));
            }
            holder.getTheme().setBackgroundResource(C1106R.drawable.background_item_color);
        }
        holder.getText().setText(this.listSize.get(position).getName());
        holder.getIconView().setImageResource(this.listSize.get(position).getResource());
        if (this.isMini) {
            holder.getIconView().setColorFilter(BubblePrefs.INSTANCE.getInternalColors(this.context));
        } else {
            holder.getIconView().setColorFilter(Color.parseColor("#4d4d4d"));
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.adapters.AdapterSize$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdapterSize.onBindViewHolder$lambda$0(this.f$0, holder, position, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(AdapterSize this$0, ViewHolder holder, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        this$0.disableAll();
        int adapterPosition = holder.getAdapterPosition();
        this$0.currentSize = adapterPosition;
        this$0.notifyItemChanged(adapterPosition);
        this$0.listener.onSize(this$0.listSize.get(i).getSize());
    }

    private final void disableAll() {
        int i = this.currentSize;
        this.currentSize = -1;
        notifyItemChanged(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.listSize.size();
    }

    /* JADX INFO: compiled from: AdapterSize.kt */
    @Metadata(m494d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "iconView", "Landroid/widget/ImageView;", "getIconView", "()Landroid/widget/ImageView;", "text", "Landroid/widget/TextView;", "getText", "()Landroid/widget/TextView;", "theme", "Landroid/widget/RelativeLayout;", "getTheme", "()Landroid/widget/RelativeLayout;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView iconView;
        private final TextView text;
        private final RelativeLayout theme;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(C1106R.id.itemTheme);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.theme = (RelativeLayout) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(C1106R.id.colorView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.iconView = (ImageView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(C1106R.id.textItem);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.text = (TextView) viewFindViewById3;
        }

        public final RelativeLayout getTheme() {
            return this.theme;
        }

        public final ImageView getIconView() {
            return this.iconView;
        }

        public final TextView getText() {
            return this.text;
        }
    }
}
