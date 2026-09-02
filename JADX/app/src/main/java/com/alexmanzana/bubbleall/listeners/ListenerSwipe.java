package com.alexmanzana.bubbleall.listeners;

import kotlin.Metadata;

/* JADX INFO: compiled from: ListenerSwipe.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, m495d2 = {"Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;", "", "isSwipe", "", "position", "", "onSwipe", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public interface ListenerSwipe {
    boolean isSwipe(int position);

    void onSwipe(int position);
}
