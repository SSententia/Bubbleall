package com.alexmanzana.bubbleall.pojos;

import androidx.media2.session.MediaConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ItemAdd.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006!"}, m495d2 = {"Lcom/alexmanzana/bubbleall/pojos/ItemAdd;", "", MediaConstants.MEDIA_URI_QUERY_ID, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "description", "resource", "", "resourceBitmap", "resourceId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getId", "getName", "getResource", "()I", "getResourceBitmap", "getResourceId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final /* data */ class ItemAdd {
    private String description;
    private final String id;
    private final String name;
    private final int resource;
    private final String resourceBitmap;
    private final int resourceId;

    public static /* synthetic */ ItemAdd copy$default(ItemAdd itemAdd, String str, String str2, String str3, int i, String str4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = itemAdd.id;
        }
        if ((i3 & 2) != 0) {
            str2 = itemAdd.name;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            str3 = itemAdd.description;
        }
        String str6 = str3;
        if ((i3 & 8) != 0) {
            i = itemAdd.resource;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            str4 = itemAdd.resourceBitmap;
        }
        String str7 = str4;
        if ((i3 & 32) != 0) {
            i2 = itemAdd.resourceId;
        }
        return itemAdd.copy(str, str5, str6, i4, str7, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getResource() {
        return this.resource;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getResourceBitmap() {
        return this.resourceBitmap;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getResourceId() {
        return this.resourceId;
    }

    public final ItemAdd copy(String id, String name, String description, int resource, String resourceBitmap, int resourceId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        return new ItemAdd(id, name, description, resource, resourceBitmap, resourceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemAdd)) {
            return false;
        }
        ItemAdd itemAdd = (ItemAdd) other;
        return Intrinsics.areEqual(this.id, itemAdd.id) && Intrinsics.areEqual(this.name, itemAdd.name) && Intrinsics.areEqual(this.description, itemAdd.description) && this.resource == itemAdd.resource && Intrinsics.areEqual(this.resourceBitmap, itemAdd.resourceBitmap) && this.resourceId == itemAdd.resourceId;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.resource) * 31;
        String str = this.resourceBitmap;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.resourceId;
    }

    public String toString() {
        return "ItemAdd(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", resource=" + this.resource + ", resourceBitmap=" + this.resourceBitmap + ", resourceId=" + this.resourceId + ')';
    }

    public ItemAdd(String id, String name, String description, int i, String str, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = id;
        this.name = name;
        this.description = description;
        this.resource = i;
        this.resourceBitmap = str;
        this.resourceId = i2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getResource() {
        return this.resource;
    }

    public final String getResourceBitmap() {
        return this.resourceBitmap;
    }

    public final int getResourceId() {
        return this.resourceId;
    }

    public final void setDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }
}
