package com.alexmanzana.bubbleall.pojos;

import android.graphics.Bitmap;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ItemWeb.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m495d2 = {"Lcom/alexmanzana/bubbleall/pojos/ItemWeb;", "", ImagesContract.URL, "", "title", "bitmap", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getTitle", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final /* data */ class ItemWeb {
    private final Bitmap bitmap;
    private final String title;
    private final String url;

    public static /* synthetic */ ItemWeb copy$default(ItemWeb itemWeb, String str, String str2, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = itemWeb.url;
        }
        if ((i & 2) != 0) {
            str2 = itemWeb.title;
        }
        if ((i & 4) != 0) {
            bitmap = itemWeb.bitmap;
        }
        return itemWeb.copy(str, str2, bitmap);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final ItemWeb copy(String url, String title, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new ItemWeb(url, title, bitmap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemWeb)) {
            return false;
        }
        ItemWeb itemWeb = (ItemWeb) other;
        return Intrinsics.areEqual(this.url, itemWeb.url) && Intrinsics.areEqual(this.title, itemWeb.title) && Intrinsics.areEqual(this.bitmap, itemWeb.bitmap);
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Bitmap bitmap = this.bitmap;
        return iHashCode2 + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public String toString() {
        return "ItemWeb(url=" + this.url + ", title=" + this.title + ", bitmap=" + this.bitmap + ')';
    }

    public ItemWeb(String url, String str, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.title = str;
        this.bitmap = bitmap;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }
}
