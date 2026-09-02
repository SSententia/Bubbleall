package com.alexmanzana.bubbleall.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.listeners.ListenerVideo;
import com.alexmanzana.bubbleall.pojos.ItemVideo;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import com.alexmanzana.bubbleall.utils.VideoPrefs;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.ViewTarget;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdapterVideo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB/\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0016J\u001c\u0010\u0019\u001a\u00020\u0011*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;", "list", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;", "Lkotlin/collections/ArrayList;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;", "isThemed", "", "(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;Z)V", "getItemCount", "", "getItemViewType", "position", "loadImage2", "", "view", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDrawableLeft", "Landroid/widget/TextView;", "resource", "color", "ViewHolder", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class AdapterVideo extends RecyclerView.Adapter<ViewHolder> {
    private final boolean isThemed;
    private final ArrayList<ItemVideo> list;
    private final ListenerVideo listener;

    public AdapterVideo(ArrayList<ItemVideo> list, ListenerVideo listener, boolean z) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.list = list;
        this.listener = listener;
        this.isThemed = z;
    }

    public /* synthetic */ AdapterVideo(ArrayList arrayList, ListenerVideo listenerVideo, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, listenerVideo, (i & 4) != 0 ? false : z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C1106R.layout.adapter_layout_video_bucket, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new ViewHolder(viewInflate);
        }
        if (viewType == 1) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(C1106R.layout.adapter_layout_video_explorer, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            return new ViewHolder(viewInflate2);
        }
        if (viewType != 2) {
            View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(C1106R.layout.adapter_layout_video_bucket, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
            return new ViewHolder(viewInflate3);
        }
        View viewInflate4 = LayoutInflater.from(parent.getContext()).inflate(C1106R.layout.adapter_layout_video, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate4, "inflate(...)");
        return new ViewHolder(viewInflate4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (this.list.get(position).isFavorite()) {
            return 2;
        }
        return this.list.get(position).getType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder.getItemViewType() == 0 || holder.getItemViewType() == 1) {
            TextView text = holder.getText();
            if (text != null) {
                text.setText(this.list.get(position).getName());
            }
            if (this.isThemed) {
                TextView text2 = holder.getText();
                if (text2 != null) {
                    BubblePrefs.Companion companion = BubblePrefs.INSTANCE;
                    Context context = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    text2.setTextColor(companion.getInternalColors(context));
                }
            } else {
                TextView text3 = holder.getText();
                if (text3 != null) {
                    text3.setTextColor(ContextCompat.getColor(holder.itemView.getContext(), C1106R.color.colorPrimaryText));
                }
            }
        }
        loadImage2(holder, position);
        holder.getImage().setClipToOutline(true);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.adapters.AdapterVideo$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdapterVideo.onBindViewHolder$lambda$0(this.f$0, position, holder, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(AdapterVideo this$0, int i, ViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        if (this$0.list.get(i).isBucket()) {
            if (holder.getItemViewType() == 1) {
                ListenerVideo listenerVideo = this$0.listener;
                String id = this$0.list.get(i).getId();
                if (id == null) {
                    id = this$0.list.get(i).getName();
                }
                ItemVideo itemVideo = this$0.list.get(i);
                Intrinsics.checkNotNullExpressionValue(itemVideo, "get(...)");
                listenerVideo.onBucket(i, id, itemVideo);
                return;
            }
            ListenerVideo listenerVideo2 = this$0.listener;
            String name = this$0.list.get(i).getName();
            ItemVideo itemVideo2 = this$0.list.get(i);
            Intrinsics.checkNotNullExpressionValue(itemVideo2, "get(...)");
            listenerVideo2.onBucket(i, name, itemVideo2);
            return;
        }
        ListenerVideo listenerVideo3 = this$0.listener;
        ItemVideo itemVideo3 = this$0.list.get(i);
        Intrinsics.checkNotNullExpressionValue(itemVideo3, "get(...)");
        listenerVideo3.onClick(itemVideo3);
    }

    private final void loadImage2(ViewHolder view, int position) {
        Uri uriWithAppendedPath;
        String mimeType;
        ViewTarget<ImageView, Drawable> viewTargetInto;
        Context context = view.itemView.getContext();
        String id = this.list.get(position).getId();
        float f = 7 * (context.getResources().getDisplayMetrics().densityDpi / 160);
        ViewTarget<ImageView, Drawable> viewTarget = null;
        if (this.list.get(position).getType() == 1) {
            if (id == null) {
                id = "";
            }
            File file = new File(id);
            if (file.isDirectory() && this.list.get(position).isBucket() && !this.list.get(position).isFavorite()) {
                mimeType = null;
                uriWithAppendedPath = null;
            } else {
                VideoPrefs.Companion companion = VideoPrefs.INSTANCE;
                Intrinsics.checkNotNull(context);
                mimeType = companion.getMimeType(context, file);
                uriWithAppendedPath = FileProvider.getUriForFile(context, context.getString(C1106R.string.file_provider_authority), file);
            }
        } else {
            uriWithAppendedPath = Uri.withAppendedPath(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, id);
            VideoPrefs.Companion companion2 = VideoPrefs.INSTANCE;
            Intrinsics.checkNotNull(context);
            mimeType = companion2.getMimeType(context, uriWithAppendedPath);
        }
        if (this.list.get(position).getDuration() > 0) {
            TextView duration = view.getDuration();
            if (duration != null) {
                duration.setText(VideoPrefs.INSTANCE.convertTime(this.list.get(position).getDuration()));
            }
            if (this.list.get(position).isFavorite()) {
                if (this.list.get(position).getType() == 1) {
                    TextView duration2 = view.getDuration();
                    if (duration2 != null) {
                        setDrawableLeft(duration2, C1106R.drawable.ic_folder_outline, -1);
                    }
                } else {
                    TextView duration3 = view.getDuration();
                    if (duration3 != null) {
                        setDrawableLeft(duration3, C1106R.drawable.ic_baseline_video_24, -1);
                    }
                }
            } else {
                TextView duration4 = view.getDuration();
                if (duration4 != null) {
                    setDrawableLeft(duration4, C1106R.drawable.ic_baseline_play_circle_outline_24, -1);
                }
            }
            TextView duration5 = view.getDuration();
            if (duration5 != null) {
                duration5.setVisibility(0);
            }
        } else {
            TextView duration6 = view.getDuration();
            if (duration6 != null) {
                duration6.setVisibility(8);
            }
        }
        if (mimeType != null) {
            view.getImage().setPadding(0, 0, 0, 0);
            if (this.list.get(position).getType() == 0) {
                viewTargetInto = Glide.with(context).load(uriWithAppendedPath).into(view.getImage());
            } else {
                viewTargetInto = Glide.with(context).load(uriWithAppendedPath).placeholder(C1106R.drawable.ic_baseline_video_24).into(view.getImage());
            }
            viewTarget = viewTargetInto;
        }
        if (viewTarget == null) {
            int i = (int) f;
            view.getImage().setPadding(i, i, i, i);
            view.getImage().setImageResource(C1106R.drawable.ic_folder_outline);
        }
    }

    private final void setDrawableLeft(TextView textView, int i, int i2) {
        Drawable drawable = ContextCompat.getDrawable(textView.getContext(), i);
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        if (drawableMutate != null) {
            drawableMutate.setTint(i2);
        }
        textView.setCompoundDrawables(drawableMutate, null, null, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    /* JADX INFO: compiled from: AdapterVideo.kt */
    @Metadata(m494d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, m495d2 = {"Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "duration", "Landroid/widget/TextView;", "getDuration", "()Landroid/widget/TextView;", "image", "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", "text", "getText", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView duration;
        private final ImageView image;
        private final TextView text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.duration = (TextView) itemView.findViewById(C1106R.id.durationText);
            View viewFindViewById = itemView.findViewById(C1106R.id.imageVideo);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.image = (ImageView) viewFindViewById;
            this.text = (TextView) itemView.findViewById(C1106R.id.titleVideo);
        }

        public final TextView getDuration() {
            return this.duration;
        }

        public final ImageView getImage() {
            return this.image;
        }

        public final TextView getText() {
            return this.text;
        }
    }
}
