package com.alexmanzana.bubbleall.listeners;

import android.graphics.Bitmap;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;

/* JADX INFO: compiled from: ListenerWeb.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\r"}, m495d2 = {"Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;", "", "onError", "", ImagesContract.URL, "", "onIcon", "icon", "Landroid/graphics/Bitmap;", "onLoaded", "onSelectUrl", "onTitle", "title", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public interface ListenerWeb {
    void onError(String url);

    void onIcon(Bitmap icon, String url);

    void onLoaded(String url);

    void onSelectUrl(String url);

    void onTitle(String title, String url);
}
