package com.alexmanzana.bubbleall.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.ThemeActivity;
import com.alexmanzana.bubbleall.listeners.ListenerTheme;
import com.alexmanzana.bubbleall.pojos.ItemTheme;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdapterTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0006\u0010\u0019\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$ViewHolder;", "context", "Landroid/content/Context;", "listenerClick", "Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;", "(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;)V", "themes", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;", "Lkotlin/collections/ArrayList;", "clear", "", "delete", "position", "", "dp1", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refresh", "ViewHolder", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class AdapterTheme extends RecyclerView.Adapter<ViewHolder> {
    private final Context context;
    private final ListenerTheme listenerClick;
    private final ArrayList<ItemTheme> themes;

    public AdapterTheme(Context context, ListenerTheme listenerClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listenerClick, "listenerClick");
        this.context = context;
        this.listenerClick = listenerClick;
        ArrayList<ItemTheme> arrayList = new ArrayList<>();
        this.themes = arrayList;
        ItemTheme.Companion companion = ItemTheme.INSTANCE;
        String string = context.getString(C1106R.string.text_default);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(companion.m721default(string));
        arrayList.addAll(BubblePrefs.INSTANCE.list(context));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C1106R.layout.adapter_layout_theme, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new ViewHolder(viewInflate);
    }

    public final void delete(int position) {
        this.themes.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, this.themes.size());
    }

    public final void clear() {
        this.themes.clear();
        notifyItemRangeChanged(0, this.themes.size());
    }

    private final int dp1() {
        return (int) (this.context.getResources().getDisplayMetrics().densityDpi / 160);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getTitle().setText(this.themes.get(position).getName());
        Drawable drawableMutate = holder.getIcon().getBackground().mutate();
        Intrinsics.checkNotNull(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) drawableMutate;
        Drawable drawableMutate2 = layerDrawable.findDrawableByLayerId(C1106R.id.windowBubble).mutate();
        Intrinsics.checkNotNull(drawableMutate2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) drawableMutate2;
        gradientDrawable.setStroke(dp1(), this.themes.get(position).getColorBubble());
        gradientDrawable.setColor(this.themes.get(position).getColorWindow());
        layerDrawable.findDrawableByLayerId(C1106R.id.colorBubble).mutate().setTint(this.themes.get(position).getColorBubble());
        holder.getButton().setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.adapters.AdapterTheme$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdapterTheme.onBindViewHolder$lambda$1(this.f$0, position, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(final AdapterTheme this$0, final int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = view.getContext().getSharedPreferences("bubble_data_prefs", 0).getString("theme_selected", "");
        String str = string != null ? string : "";
        PopupMenu popupMenu = new PopupMenu(this$0.context, view);
        popupMenu.inflate(C1106R.menu.menu_themes_options);
        if (i == 0) {
            popupMenu.getMenu().findItem(C1106R.id.deleteTheme).setEnabled(false);
            popupMenu.getMenu().findItem(C1106R.id.editTheme).setEnabled(false);
        } else if (Intrinsics.areEqual(str, this$0.themes.get(i).getUuid())) {
            popupMenu.getMenu().findItem(C1106R.id.deleteTheme).setEnabled(false);
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.alexmanzana.bubbleall.adapters.AdapterTheme$$ExternalSyntheticLambda0
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return AdapterTheme.onBindViewHolder$lambda$1$lambda$0(this.f$0, i, menuItem);
            }
        });
        popupMenu.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$1$lambda$0(AdapterTheme this$0, int i, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (menuItem.getItemId() == C1106R.id.deleteTheme) {
            ListenerTheme listenerTheme = this$0.listenerClick;
            ItemTheme itemTheme = this$0.themes.get(i);
            Intrinsics.checkNotNullExpressionValue(itemTheme, "get(...)");
            listenerTheme.onTheme(itemTheme, i);
        } else if (menuItem.getItemId() == C1106R.id.editTheme || menuItem.getItemId() == C1106R.id.duplicateTheme) {
            Intent intent = new Intent(this$0.context, (Class<?>) ThemeActivity.class);
            intent.putExtra("uuid", this$0.themes.get(i).getUuid());
            intent.putExtra("duplicate", menuItem.getItemId() == C1106R.id.duplicateTheme);
            this$0.context.startActivity(intent);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.themes.size();
    }

    public final void refresh() {
        this.themes.clear();
        ArrayList<ItemTheme> arrayList = this.themes;
        ItemTheme.Companion companion = ItemTheme.INSTANCE;
        String string = this.context.getString(C1106R.string.text_default);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(companion.m721default(string));
        this.themes.addAll(BubblePrefs.INSTANCE.list(this.context));
        notifyItemRangeChanged(0, this.themes.size());
    }

    /* JADX INFO: compiled from: AdapterTheme.kt */
    @Metadata(m494d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "button", "Landroid/widget/ImageView;", "getButton", "()Landroid/widget/ImageView;", "icon", "Landroid/widget/FrameLayout;", "getIcon", "()Landroid/widget/FrameLayout;", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView button;
        private final FrameLayout icon;
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(C1106R.id.titleItem);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.title = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(C1106R.id.itemThemeColor);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.icon = (FrameLayout) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(C1106R.id.moreOptionsForTheme);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.button = (ImageView) viewFindViewById3;
        }

        public final TextView getTitle() {
            return this.title;
        }

        public final FrameLayout getIcon() {
            return this.icon;
        }

        public final ImageView getButton() {
            return this.button;
        }
    }
}
