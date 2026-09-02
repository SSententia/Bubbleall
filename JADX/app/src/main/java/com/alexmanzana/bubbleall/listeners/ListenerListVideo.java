package com.alexmanzana.bubbleall.listeners;

import com.alexmanzana.bubbleall.pojos.ItemVideo;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: ListenerListVideo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m495d2 = {"Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;", "", "onReceived", "", "list", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;", "Lkotlin/collections/ArrayList;", "grid", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public interface ListenerListVideo {
    void onReceived(ArrayList<ItemVideo> list, int grid);
}
