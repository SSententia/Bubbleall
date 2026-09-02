package com.alexmanzana.bubbleall.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media2.session.MediaConstants;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.listeners.ListenerMusic;
import com.alexmanzana.bubbleall.pojos.ItemMusic;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdapterMusic.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB3\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0002J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;", "list", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;", "Lkotlin/collections/ArrayList;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;", "isThemed", "", "(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;Z)V", "declareStyle", "", "get", MediaConstants.MEDIA_URI_QUERY_ID, "", "getItemCount", "loadImage", "view", "Landroid/widget/ImageView;", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class AdapterMusic extends RecyclerView.Adapter<ViewHolder> {
    private final boolean isThemed;
    private final ArrayList<ItemMusic> list;
    private final ListenerMusic listener;

    public AdapterMusic(ArrayList<ItemMusic> list, ListenerMusic listenerMusic, boolean z) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
        this.listener = listenerMusic;
        this.isThemed = z;
    }

    public /* synthetic */ AdapterMusic(ArrayList arrayList, ListenerMusic listenerMusic, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, (i & 2) != 0 ? null : listenerMusic, (i & 4) != 0 ? false : z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C1106R.layout.adapter_layout_music, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new ViewHolder(viewInflate);
    }

    public final void declareStyle() {
        notifyItemRangeChanged(0, this.list.size());
    }

    public final ItemMusic get(int id) {
        ItemMusic itemMusic = this.list.get(id);
        Intrinsics.checkNotNullExpressionValue(itemMusic, "get(...)");
        return itemMusic;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Unit unit;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getTitleMusic().setText(this.list.get(position).getTitle());
        holder.getImageMusic().setClipToOutline(true);
        if (this.isThemed) {
            TextView titleMusic = holder.getTitleMusic();
            BubblePrefs.Companion companion = BubblePrefs.INSTANCE;
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            titleMusic.setTextColor(companion.getInternalColors(context));
            TextView authorMusic = holder.getAuthorMusic();
            BubblePrefs.Companion companion2 = BubblePrefs.INSTANCE;
            Context context2 = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            authorMusic.setTextColor(companion2.getInternalColors(context2));
        }
        loadImage(holder.getImageMusic(), position);
        String author = this.list.get(position).getAuthor();
        if (author != null) {
            holder.getAuthorMusic().setVisibility(0);
            holder.getAuthorMusic().setText(author);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            holder.getAuthorMusic().setVisibility(8);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.adapters.AdapterMusic$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdapterMusic.onBindViewHolder$lambda$2(this.f$0, position, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2(AdapterMusic this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ListenerMusic listenerMusic = this$0.listener;
        if (listenerMusic != null) {
            ItemMusic itemMusic = this$0.list.get(i);
            Intrinsics.checkNotNullExpressionValue(itemMusic, "get(...)");
            listenerMusic.onClick(itemMusic, i);
        }
    }

    private final void loadImage(final ImageView view, final int position) {
        final Context context = view.getContext();
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        final Handler handler = new Handler(looperMyLooper);
        Bitmap image = this.list.get(position).getImage();
        if (image == null) {
            Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: com.alexmanzana.bubbleall.adapters.AdapterMusic$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AdapterMusic.loadImage$lambda$9$lambda$8(view, this, position, handler, context);
                }
            });
        } else {
            view.setPadding(0, 0, 0, 0);
            view.setImageBitmap(image);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$9$lambda$8(final ImageView view, final AdapterMusic this_run, final int i, Handler mHandler, final Context context) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        Intrinsics.checkNotNullParameter(mHandler, "$mHandler");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(view.getContext(), this_run.list.get(i).getData());
        byte[] embeddedPicture = mediaMetadataRetriever.getEmbeddedPicture();
        if (embeddedPicture != null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 2;
            this_run.list.get(i).setImage(BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length, options));
            mHandler.post(new Runnable() { // from class: com.alexmanzana.bubbleall.adapters.AdapterMusic$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AdapterMusic.loadImage$lambda$9$lambda$8$lambda$5$lambda$4(view, this_run, i);
                }
            });
            return;
        }
        mHandler.post(new Runnable() { // from class: com.alexmanzana.bubbleall.adapters.AdapterMusic$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AdapterMusic.loadImage$lambda$9$lambda$8$lambda$7$lambda$6(context, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$9$lambda$8$lambda$5$lambda$4(ImageView view, AdapterMusic this_run, int i) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        view.setPadding(0, 0, 0, 0);
        view.setImageBitmap(this_run.list.get(i).getImage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$9$lambda$8$lambda$7$lambda$6(Context context, ImageView view) {
        Intrinsics.checkNotNullParameter(view, "$view");
        int i = (int) (7 * (context.getResources().getDisplayMetrics().densityDpi / 160));
        view.setPadding(i, i, i, i);
        view.setImageResource(C1106R.drawable.ic_baseline_music_note_24);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    /* JADX INFO: compiled from: AdapterMusic.kt */
    @Metadata(m494d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "authorMusic", "Landroid/widget/TextView;", "getAuthorMusic", "()Landroid/widget/TextView;", "imageMusic", "Landroid/widget/ImageView;", "getImageMusic", "()Landroid/widget/ImageView;", "titleMusic", "getTitleMusic", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView authorMusic;
        private final ImageView imageMusic;
        private final TextView titleMusic;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(C1106R.id.musicArt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.imageMusic = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(C1106R.id.titleMusic);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.titleMusic = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(C1106R.id.authorMusic);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.authorMusic = (TextView) viewFindViewById3;
        }

        public final ImageView getImageMusic() {
            return this.imageMusic;
        }

        public final TextView getTitleMusic() {
            return this.titleMusic;
        }

        public final TextView getAuthorMusic() {
            return this.authorMusic;
        }
    }
}
