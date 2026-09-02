package com.alexmanzana.bubbleall.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.listeners.ListenerAdd;
import com.alexmanzana.bubbleall.pojos.ItemAdd;
import com.alexmanzana.bubbleall.utils.ShortcutPrefs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdapterAdd.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0006\u0010\u0016\u001a\u00020\u000fJ\u001e\u0010\u0017\u001a\u00020\u000f2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bJ\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;", "context", "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;", "(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;)V", "items", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemAdd;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refreshAccess", "replaceList", "list", "setImage", "icon", "Landroid/widget/ImageView;", "image", "", "ViewHolder", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class AdapterAdd extends RecyclerView.Adapter<ViewHolder> {
    private final Context context;
    private ArrayList<ItemAdd> items;
    private final ListenerAdd listener;

    public AdapterAdd(Context context, ListenerAdd listenerAdd) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.listener = listenerAdd;
        this.items = new ArrayList<>();
        if (!PreferenceManager.getDefaultSharedPreferences(context).getBoolean("key_shortcut_show_only", false)) {
            ArrayList<ItemAdd> arrayList = this.items;
            String string = context.getString(C1106R.string.text_web);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = context.getString(C1106R.string.text_web_description);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            arrayList.add(new ItemAdd("web", string, string2, C1106R.drawable.ic_web, null, C1106R.id.webPanel));
            ArrayList<ItemAdd> arrayList2 = this.items;
            String string3 = context.getString(C1106R.string.text_video);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = context.getString(C1106R.string.text_video_description);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            arrayList2.add(new ItemAdd("video", string3, string4, C1106R.drawable.ic_baseline_video_24, null, C1106R.id.videoPanel));
            ArrayList<ItemAdd> arrayList3 = this.items;
            String string5 = context.getString(C1106R.string.text_music);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            String string6 = context.getString(C1106R.string.text_music_description);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            arrayList3.add(new ItemAdd("music", string5, string6, C1106R.drawable.ic_baseline_library_music_24, null, C1106R.id.musicPanel));
        }
        this.items.addAll(ShortcutPrefs.INSTANCE.list(context));
    }

    public final void refreshAccess() {
        if (PreferenceManager.getDefaultSharedPreferences(this.context).getBoolean("key_access_show_only", false)) {
            this.items.clear();
        } else {
            ArrayList<ItemAdd> arrayList = this.items;
            arrayList.subList(3, arrayList.size()).clear();
        }
        this.items.addAll(ShortcutPrefs.INSTANCE.list(this.context));
    }

    public final void replaceList(ArrayList<ItemAdd> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.items = list;
        notifyItemRangeChanged(0, list.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C1106R.layout.adapter_layout_add, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new ViewHolder(viewInflate);
    }

    private final void setImage(ImageView icon, Object image) {
        if (image instanceof Bitmap) {
            icon.setImageBitmap((Bitmap) image);
            icon.setColorFilter(0);
        } else {
            Intrinsics.checkNotNull(image, "null cannot be cast to non-null type kotlin.Int");
            icon.setImageResource(((Integer) image).intValue());
            icon.setColorFilter(Color.parseColor("#1c1c1c"));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getTitle().setText(this.items.get(position).getName());
        holder.getDescription().setText(this.items.get(position).getDescription());
        ImageView icon = holder.getIcon();
        Object objDecodeFile = BitmapFactory.decodeFile(this.items.get(position).getResourceBitmap());
        if (objDecodeFile == null) {
            objDecodeFile = Integer.valueOf(this.items.get(position).getResource());
        }
        setImage(icon, objDecodeFile);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.adapters.AdapterAdd$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdapterAdd.onBindViewHolder$lambda$0(this.f$0, position, view);
            }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.alexmanzana.bubbleall.adapters.AdapterAdd$$ExternalSyntheticLambda1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return AdapterAdd.onBindViewHolder$lambda$1(this.f$0, position, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(AdapterAdd this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ListenerAdd listenerAdd = this$0.listener;
        if (listenerAdd != null) {
            ItemAdd itemAdd = this$0.items.get(i);
            Intrinsics.checkNotNullExpressionValue(itemAdd, "get(...)");
            listenerAdd.onClick(itemAdd, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$1(AdapterAdd this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ListenerAdd listenerAdd = this$0.listener;
        if (listenerAdd == null) {
            return true;
        }
        ItemAdd itemAdd = this$0.items.get(i);
        Intrinsics.checkNotNullExpressionValue(itemAdd, "get(...)");
        listenerAdd.onLong(itemAdd, i);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    /* JADX INFO: compiled from: AdapterAdd.kt */
    @Metadata(m494d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\n¨\u0006\u0014"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "description", "Landroid/widget/TextView;", "getDescription", "()Landroid/widget/TextView;", "setDescription", "(Landroid/widget/TextView;)V", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "setIcon", "(Landroid/widget/ImageView;)V", "title", "getTitle", "setTitle", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private TextView description;
        private ImageView icon;
        private TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(C1106R.id.titleItem);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.title = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(C1106R.id.descriptionItem);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.description = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(C1106R.id.imageIcon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById3;
        }

        public final TextView getTitle() {
            return this.title;
        }

        public final void setTitle(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.title = textView;
        }

        public final TextView getDescription() {
            return this.description;
        }

        public final void setDescription(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.description = textView;
        }

        public final ImageView getIcon() {
            return this.icon;
        }

        public final void setIcon(ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.icon = imageView;
        }
    }
}
