package com.alexmanzana.bubbleall.listeners;

import com.alexmanzana.bubbleall.pojos.ItemPanel;
import kotlin.Metadata;

/* JADX INFO: compiled from: ListenerWindow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m495d2 = {"Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;", "", "activeBubble", "", "addBubbleInPanels", "item", "Lcom/alexmanzana/bubbleall/pojos/ItemPanel;", "hideBubble", "hideNormal", "isVisibleBubble", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public interface ListenerWindow {
    void activeBubble();

    void addBubbleInPanels(ItemPanel item);

    void hideBubble();

    void hideNormal();

    boolean isVisibleBubble();
}
