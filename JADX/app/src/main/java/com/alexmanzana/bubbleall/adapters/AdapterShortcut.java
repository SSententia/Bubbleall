package com.alexmanzana.bubbleall.adapters;

import android.content.Context;
import android.content.Intent;
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
import com.alexmanzana.bubbleall.MenuActivity;
import com.alexmanzana.bubbleall.MusicActivity;
import com.alexmanzana.bubbleall.SettingsActivity;
import com.alexmanzana.bubbleall.VideoActivity;
import com.alexmanzana.bubbleall.listeners.ListenerSuccess;
import com.alexmanzana.bubbleall.pojos.ItemShortcut;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdapterShortcut.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J\u001e\u0010\u001c\u001a\u00020\u00152\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;", "context", "Landroid/content/Context;", "grid", "", "(Landroid/content/Context;Z)V", "listAccess", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;", "Lkotlin/collections/ArrayList;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;", "getListener", "()Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;", "setListener", "(Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "replaceList", "list", "ViewHolder", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class AdapterShortcut extends RecyclerView.Adapter<ViewHolder> {
    private final Context context;
    private final boolean grid;
    private ArrayList<ItemShortcut> listAccess;
    private ListenerSuccess listener;

    public AdapterShortcut(Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.grid = z;
        ArrayList<ItemShortcut> arrayList = new ArrayList<>();
        this.listAccess = arrayList;
        arrayList.add(new ItemShortcut(C1106R.drawable.ic_baseline_shortcut, new Intent(context, (Class<?>) MenuActivity.class), C1106R.string.text_menu));
        this.listAccess.add(new ItemShortcut(C1106R.drawable.ic_baseline_library_music_24, new Intent(context, (Class<?>) MusicActivity.class), C1106R.string.text_music));
        this.listAccess.add(new ItemShortcut(C1106R.drawable.ic_baseline_video_24, new Intent(context, (Class<?>) VideoActivity.class), C1106R.string.text_video));
        this.listAccess.add(new ItemShortcut(C1106R.drawable.ic_baseline_settings_24, new Intent(context, (Class<?>) SettingsActivity.class), C1106R.string.text_settings));
    }

    public /* synthetic */ AdapterShortcut(Context context, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? false : z);
    }

    public final ListenerSuccess getListener() {
        return this.listener;
    }

    public final void setListener(ListenerSuccess listenerSuccess) {
        this.listener = listenerSuccess;
    }

    public final void replaceList(ArrayList<ItemShortcut> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.listAccess = list;
        notifyItemRangeChanged(0, list.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.grid) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C1106R.layout.adapter_layout_color_text_grid, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new ViewHolder(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(C1106R.layout.adapter_layout_color_text, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new ViewHolder(viewInflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getText().setText(this.listAccess.get(position).getText());
        if (this.grid) {
            holder.getText().setTextColor(BubblePrefs.INSTANCE.getInternalColors(this.context));
            holder.getIconView().setColorFilter(BubblePrefs.INSTANCE.getInternalColors(this.context));
        } else {
            holder.getText().setTextColor(ContextCompat.getColor(this.context, C1106R.color.colorPrimaryText));
            holder.getIconView().setColorFilter(Color.parseColor("#4d4d4d"));
        }
        holder.getTheme().setBackgroundResource(C1106R.drawable.background_item_color);
        holder.getIconView().setImageResource(this.listAccess.get(position).getIcon());
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.adapters.AdapterShortcut$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdapterShortcut.onBindViewHolder$lambda$0(this.f$0, position, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(AdapterShortcut this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.listAccess.get(i).getIntent() != null) {
            view.getContext().startActivity(this$0.listAccess.get(i).getIntent());
            return;
        }
        ListenerSuccess listenerSuccess = this$0.listener;
        if (listenerSuccess != null) {
            listenerSuccess.onReceived(Integer.valueOf(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.listAccess.size();
    }

    /* JADX INFO: compiled from: AdapterShortcut.kt */
    @Metadata(m494d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "iconView", "Landroid/widget/ImageView;", "getIconView", "()Landroid/widget/ImageView;", "text", "Landroid/widget/TextView;", "getText", "()Landroid/widget/TextView;", "theme", "Landroid/widget/RelativeLayout;", "getTheme", "()Landroid/widget/RelativeLayout;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
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
            View viewFindViewById2 = itemView.findViewById(C1106R.id.textItem);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.text = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(C1106R.id.colorView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.iconView = (ImageView) viewFindViewById3;
        }

        public final RelativeLayout getTheme() {
            return this.theme;
        }

        public final TextView getText() {
            return this.text;
        }

        public final ImageView getIconView() {
            return this.iconView;
        }
    }
}
