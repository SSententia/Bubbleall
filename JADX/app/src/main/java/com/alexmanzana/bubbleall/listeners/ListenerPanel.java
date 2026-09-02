package com.alexmanzana.bubbleall.listeners;

import androidx.media2.session.MediaConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: ListenerPanel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m495d2 = {"Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;", "", "onClick", "", MediaConstants.MEDIA_URI_QUERY_ID, "", "position", "", "resourceId", "onClose", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public interface ListenerPanel {
    boolean onClick(String id, int position, int resourceId);

    void onClose();
}
