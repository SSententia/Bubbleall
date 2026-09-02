package com.alexmanzana.bubbleall.adapters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.listeners.ListenerTheme;
import com.alexmanzana.bubbleall.pojos.ItemTheme;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdapterColors.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001f\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0019\"\u00020\u0014¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0006H\u0016J\u0016\u0010$\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterColors;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;", "context", "Landroid/content/Context;", "resource", "", "listenerColor", "Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;", "modePreview", "isListingThemes", "", "(Landroid/content/Context;ILcom/alexmanzana/bubbleall/listeners/ListenerTheme;IZ)V", "colorCurrent", "getColorCurrent", "()I", "setColorCurrent", "(I)V", "listColors", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;", "Lkotlin/collections/ArrayList;", "addColor", "", "themes", "", "([Lcom/alexmanzana/bubbleall/pojos/ItemTheme;)V", "disableAll", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refresh", "ViewHolder", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class AdapterColors extends RecyclerView.Adapter<ViewHolder> {
    private int colorCurrent;
    private final ArrayList<ItemTheme> listColors;
    private final ListenerTheme listenerColor;
    private final int modePreview;
    private final int resource;

    public AdapterColors(Context context, int i, ListenerTheme listenerColor, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listenerColor, "listenerColor");
        this.resource = i;
        this.listenerColor = listenerColor;
        this.modePreview = i2;
        ArrayList<ItemTheme> arrayList = new ArrayList<>();
        this.listColors = arrayList;
        int i3 = 1;
        this.colorCurrent = 1;
        arrayList.clear();
        arrayList.add(ItemTheme.INSTANCE.blank());
        arrayList.add(ItemTheme.INSTANCE.m720default());
        if (z) {
            arrayList.addAll(BubblePrefs.INSTANCE.list(context));
            int position = BubblePrefs.INSTANCE.getPosition(context);
            if (position != -1) {
                i3 = position + 2;
            }
        }
        this.colorCurrent = i3;
    }

    public final int getColorCurrent() {
        return this.colorCurrent;
    }

    public final void setColorCurrent(int i) {
        this.colorCurrent = i;
    }

    public final void addColor(ItemTheme... themes) {
        Intrinsics.checkNotNullParameter(themes, "themes");
        int size = this.listColors.size() - 1;
        CollectionsKt.addAll(this.listColors, themes);
        this.colorCurrent = this.listColors.size() - 1;
        notifyItemRangeChanged(size, this.listColors.size() - 1);
        ListenerTheme listenerTheme = this.listenerColor;
        ItemTheme itemTheme = this.listColors.get(this.colorCurrent);
        Intrinsics.checkNotNullExpressionValue(itemTheme, "get(...)");
        listenerTheme.onTheme(itemTheme, this.colorCurrent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C1106R.layout.adapter_layout_color, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new ViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.listColors.get(position).getColorBubble() != -123) {
            holder.getColorView().setVisibility(8);
            holder.getTheme().setVisibility(0);
            if (this.colorCurrent == position) {
                holder.itemView.setBackgroundResource(C1106R.drawable.background_item_color_current);
            } else {
                holder.itemView.setBackgroundResource(C1106R.drawable.background_item_color);
            }
            int i = this.modePreview;
            if (i == 0) {
                Drawable background = holder.getTheme().getBackground();
                Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) background).setColor(this.listColors.get(position).getColorBubble());
            } else if (i == 1) {
                Drawable background2 = holder.getTheme().getBackground();
                Intrinsics.checkNotNull(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) background2).setColor(this.listColors.get(position).getColorCurrentTab());
            } else if (i == 2) {
                Drawable background3 = holder.getTheme().getBackground();
                Intrinsics.checkNotNull(background3, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) background3).setColor(this.listColors.get(position).getColorTab());
            } else if (i == 3) {
                Drawable background4 = holder.getTheme().getBackground();
                Intrinsics.checkNotNull(background4, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) background4).setColor(this.listColors.get(position).getColorWindow());
            } else if (i == 4) {
                Drawable background5 = holder.getTheme().getBackground();
                Intrinsics.checkNotNull(background5, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) background5).setColor(this.listColors.get(position).getColorInternal());
            } else {
                Drawable background6 = holder.getTheme().getBackground();
                Intrinsics.checkNotNull(background6, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) background6).setColor(this.listColors.get(position).getColorBubble());
            }
        } else {
            holder.getColorView().setVisibility(0);
            holder.getTheme().setVisibility(8);
            holder.getColorView().setColorFilter(Color.parseColor("#4d4d4d"));
            holder.getColorView().setImageResource(this.resource);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.adapters.AdapterColors$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdapterColors.onBindViewHolder$lambda$0(this.f$0, position, holder, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(AdapterColors this$0, int i, ViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        if (this$0.listColors.get(i).getColorBubble() != -123) {
            this$0.disableAll();
            int adapterPosition = holder.getAdapterPosition();
            this$0.colorCurrent = adapterPosition;
            ListenerTheme listenerTheme = this$0.listenerColor;
            ItemTheme itemTheme = this$0.listColors.get(adapterPosition);
            Intrinsics.checkNotNullExpressionValue(itemTheme, "get(...)");
            listenerTheme.onTheme(itemTheme, i);
            this$0.notifyItemChanged(this$0.colorCurrent);
            return;
        }
        this$0.listenerColor.onClick();
    }

    private final void disableAll() {
        int i = this.colorCurrent;
        this.colorCurrent = -1;
        notifyItemChanged(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.listColors.size();
    }

    public final void refresh(Context context, boolean isListingThemes) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.listColors.clear();
        this.listColors.add(ItemTheme.INSTANCE.blank());
        this.listColors.add(ItemTheme.INSTANCE.m720default());
        if (isListingThemes) {
            this.listColors.addAll(BubblePrefs.INSTANCE.list(context));
            int position = BubblePrefs.INSTANCE.getPosition(context);
            this.colorCurrent = position != -1 ? position + 2 : 1;
        }
        notifyItemRangeChanged(1, this.listColors.size());
    }

    /* JADX INFO: compiled from: AdapterColors.kt */
    @Metadata(m494d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "colorView", "Landroid/widget/ImageView;", "getColorView", "()Landroid/widget/ImageView;", "theme", "Landroid/widget/FrameLayout;", "getTheme", "()Landroid/widget/FrameLayout;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView colorView;
        private final FrameLayout theme;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(C1106R.id.colorView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.colorView = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(C1106R.id.itemTheme);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.theme = (FrameLayout) viewFindViewById2;
        }

        public final ImageView getColorView() {
            return this.colorView;
        }

        public final FrameLayout getTheme() {
            return this.theme;
        }
    }
}
