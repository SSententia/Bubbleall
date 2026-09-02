package com.alexmanzana.bubbleall.pojos;

import androidx.media2.session.MediaConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ItemData.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m495d2 = {"Lcom/alexmanzana/bubbleall/pojos/ItemData;", "Ljava/io/Serializable;", MediaConstants.MEDIA_URI_QUERY_ID, "", "resource", "", "data", "", "(Ljava/lang/String;ILjava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "getId", "()Ljava/lang/String;", "getResource", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final /* data */ class ItemData implements Serializable {
    private final Object data;
    private final String id;
    private final int resource;

    public static /* synthetic */ ItemData copy$default(ItemData itemData, String str, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = itemData.id;
        }
        if ((i2 & 2) != 0) {
            i = itemData.resource;
        }
        if ((i2 & 4) != 0) {
            obj = itemData.data;
        }
        return itemData.copy(str, i, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResource() {
        return this.resource;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    public final ItemData copy(String id, int resource, Object data) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        return new ItemData(id, resource, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemData)) {
            return false;
        }
        ItemData itemData = (ItemData) other;
        return Intrinsics.areEqual(this.id, itemData.id) && this.resource == itemData.resource && Intrinsics.areEqual(this.data, itemData.data);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.resource) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "ItemData(id=" + this.id + ", resource=" + this.resource + ", data=" + this.data + ')';
    }

    public ItemData(String id, int i, Object data) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        this.id = id;
        this.resource = i;
        this.data = data;
    }

    public final Object getData() {
        return this.data;
    }

    public final String getId() {
        return this.id;
    }

    public final int getResource() {
        return this.resource;
    }
}
