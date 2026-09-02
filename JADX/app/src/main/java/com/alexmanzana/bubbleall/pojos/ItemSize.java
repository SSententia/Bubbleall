package com.alexmanzana.bubbleall.pojos;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: compiled from: ItemSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m495d2 = {"Lcom/alexmanzana/bubbleall/pojos/ItemSize;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "resource", "size", "(III)V", "getName", "()I", "getResource", "getSize", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final /* data */ class ItemSize {
    private final int name;
    private final int resource;
    private final int size;

    public static /* synthetic */ ItemSize copy$default(ItemSize itemSize, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = itemSize.name;
        }
        if ((i4 & 2) != 0) {
            i2 = itemSize.resource;
        }
        if ((i4 & 4) != 0) {
            i3 = itemSize.size;
        }
        return itemSize.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResource() {
        return this.resource;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final ItemSize copy(int name, int resource, int size) {
        return new ItemSize(name, resource, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemSize)) {
            return false;
        }
        ItemSize itemSize = (ItemSize) other;
        return this.name == itemSize.name && this.resource == itemSize.resource && this.size == itemSize.size;
    }

    public int hashCode() {
        return (((this.name * 31) + this.resource) * 31) + this.size;
    }

    public String toString() {
        return "ItemSize(name=" + this.name + ", resource=" + this.resource + ", size=" + this.size + ')';
    }

    public ItemSize(int i, int i2, int i3) {
        this.name = i;
        this.resource = i2;
        this.size = i3;
    }

    public final int getName() {
        return this.name;
    }

    public final int getResource() {
        return this.resource;
    }

    public final int getSize() {
        return this.size;
    }
}
