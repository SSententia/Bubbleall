package com.alexmanzana.bubbleall.listeners;

import com.alexmanzana.bubbleall.pojos.ItemTheme;
import kotlin.Metadata;

/* JADX INFO: compiled from: ListenerTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m495d2 = {"Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;", "", "onClick", "", "onTheme", "theme", "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;", "position", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public interface ListenerTheme {
    void onClick();

    void onTheme(ItemTheme theme, int position);
}
