package com.alexmanzana.bubbleall.listeners;

import com.alexmanzana.bubbleall.pojos.ItemVideo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: compiled from: ListenerVideo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, m495d2 = {"Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;", "", "onBucket", "", "position", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "item", "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;", "onClick", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public interface ListenerVideo {
    void onBucket(int position, String name, ItemVideo item);

    void onClick(ItemVideo item);
}
