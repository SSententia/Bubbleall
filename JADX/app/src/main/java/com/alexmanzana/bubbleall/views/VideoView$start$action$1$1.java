package com.alexmanzana.bubbleall.views;

import android.os.Handler;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.adapters.AdapterVideo;
import com.alexmanzana.bubbleall.listeners.ListenerListVideo;
import com.alexmanzana.bubbleall.pojos.ItemVideo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoView.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m495d2 = {"com/alexmanzana/bubbleall/views/VideoView$start$action$1$1", "Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;", "onReceived", "", "list", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;", "Lkotlin/collections/ArrayList;", "grid", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class VideoView$start$action$1$1 implements ListenerListVideo {
    final /* synthetic */ VideoView $this_run;
    final /* synthetic */ VideoView this$0;

    VideoView$start$action$1$1(VideoView videoView, VideoView videoView2) {
        this.$this_run = videoView;
        this.this$0 = videoView2;
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerListVideo
    public void onReceived(final ArrayList<ItemVideo> list, final int grid) {
        Intrinsics.checkNotNullParameter(list, "list");
        Handler handler = this.$this_run.mHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
            handler = null;
        }
        final VideoView videoView = this.$this_run;
        final VideoView videoView2 = this.this$0;
        handler.post(new Runnable() { // from class: com.alexmanzana.bubbleall.views.VideoView$start$action$1$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                VideoView$start$action$1$1.onReceived$lambda$0(videoView, list, videoView2, grid);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceived$lambda$0(VideoView this_run, ArrayList list, VideoView this$0, int i) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        Intrinsics.checkNotNullParameter(list, "$list");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this_run.listVideos.addAll(list);
        this_run.adapter = new AdapterVideo(this_run.listVideos, this$0, true);
        RecyclerView recyclerView = (RecyclerView) this_run.findViewById(C1106R.id.listVideos);
        if (i > 0) {
            recyclerView.setLayoutManager(new GridLayoutManager(this_run.getContext(), i));
        } else {
            recyclerView.setLayoutManager(new LinearLayoutManager(this_run.getContext()));
        }
        recyclerView.setAdapter(this_run.adapter);
        ((ProgressBar) this_run.findViewById(C1106R.id.progressList)).setVisibility(8);
    }
}
