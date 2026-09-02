package com.alexmanzana.bubbleall.utils;

import android.graphics.Bitmap;
import com.alexmanzana.bubbleall.listeners.ListenerWeb;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ListenerWebUtil.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, m495d2 = {"Lcom/alexmanzana/bubbleall/utils/ListenerWebUtil;", "Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;", "()V", "onError", "", ImagesContract.URL, "", "onIcon", "icon", "Landroid/graphics/Bitmap;", "onLoaded", "onSelectUrl", "onTitle", "title", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public class ListenerWebUtil implements ListenerWeb {
    @Override // com.alexmanzana.bubbleall.listeners.ListenerWeb
    public void onError(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerWeb
    public void onIcon(Bitmap icon, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerWeb
    public void onLoaded(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerWeb
    public void onSelectUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerWeb
    public void onTitle(String title, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }
}
