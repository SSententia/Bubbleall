package com.alexmanzana.bubbleall.pojos;

import android.graphics.Bitmap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ItemVideoBucket.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u0019"}, m495d2 = {"Lcom/alexmanzana/bubbleall/pojos/ItemVideoBucket;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "firstImage", "image", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getFirstImage", "()Ljava/lang/String;", "getImage", "()Landroid/graphics/Bitmap;", "setImage", "(Landroid/graphics/Bitmap;)V", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final /* data */ class ItemVideoBucket {
    private final String firstImage;
    private Bitmap image;
    private final String name;

    public static /* synthetic */ ItemVideoBucket copy$default(ItemVideoBucket itemVideoBucket, String str, String str2, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = itemVideoBucket.name;
        }
        if ((i & 2) != 0) {
            str2 = itemVideoBucket.firstImage;
        }
        if ((i & 4) != 0) {
            bitmap = itemVideoBucket.image;
        }
        return itemVideoBucket.copy(str, str2, bitmap);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstImage() {
        return this.firstImage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Bitmap getImage() {
        return this.image;
    }

    public final ItemVideoBucket copy(String name, String firstImage, Bitmap image) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(firstImage, "firstImage");
        return new ItemVideoBucket(name, firstImage, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemVideoBucket)) {
            return false;
        }
        ItemVideoBucket itemVideoBucket = (ItemVideoBucket) other;
        return Intrinsics.areEqual(this.name, itemVideoBucket.name) && Intrinsics.areEqual(this.firstImage, itemVideoBucket.firstImage) && Intrinsics.areEqual(this.image, itemVideoBucket.image);
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.firstImage.hashCode()) * 31;
        Bitmap bitmap = this.image;
        return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public String toString() {
        return "ItemVideoBucket(name=" + this.name + ", firstImage=" + this.firstImage + ", image=" + this.image + ')';
    }

    public ItemVideoBucket(String name, String firstImage, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(firstImage, "firstImage");
        this.name = name;
        this.firstImage = firstImage;
        this.image = bitmap;
    }

    public /* synthetic */ ItemVideoBucket(String str, String str2, Bitmap bitmap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : bitmap);
    }

    public final String getFirstImage() {
        return this.firstImage;
    }

    public final Bitmap getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public final void setImage(Bitmap bitmap) {
        this.image = bitmap;
    }
}
