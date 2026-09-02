package com.alexmanzana.bubbleall.views;

import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.adapters.AdapterMusic;
import com.alexmanzana.bubbleall.listeners.ListenerListMusic;
import com.alexmanzana.bubbleall.pojos.ItemMusic;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MusicView.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0016¨\u0006\b"}, m495d2 = {"com/alexmanzana/bubbleall/views/MusicView$start$action$1$1", "Lcom/alexmanzana/bubbleall/listeners/ListenerListMusic;", "onReceived", "", "list", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;", "Lkotlin/collections/ArrayList;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class MusicView$start$action$1$1 implements ListenerListMusic {
    final /* synthetic */ MusicView $this_run;
    final /* synthetic */ MusicView this$0;

    MusicView$start$action$1$1(MusicView musicView, MusicView musicView2) {
        this.$this_run = musicView;
        this.this$0 = musicView2;
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerListMusic
    public void onReceived(final ArrayList<ItemMusic> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Handler handler = this.$this_run.mHandler;
        if (handler != null) {
            final MusicView musicView = this.$this_run;
            final MusicView musicView2 = this.this$0;
            handler.post(new Runnable() { // from class: com.alexmanzana.bubbleall.views.MusicView$start$action$1$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MusicView$start$action$1$1.onReceived$lambda$0(musicView, list, musicView2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceived$lambda$0(MusicView this_run, ArrayList list, MusicView this$0) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        Intrinsics.checkNotNullParameter(list, "$list");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this_run.adapter = new AdapterMusic(list, this$0, true);
        View viewFindViewById = this_run.findViewById(C1106R.id.listMusic);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(this_run.getContext()));
        recyclerView.setAdapter(this_run.adapter);
        ((ProgressBar) this_run.findViewById(C1106R.id.progressList)).setVisibility(8);
    }
}
