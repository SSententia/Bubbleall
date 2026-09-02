package com.alexmanzana.bubbleall.pojos;

import android.graphics.Bitmap;
import androidx.media2.session.MediaConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ItemPanel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m495d2 = {"Lcom/alexmanzana/bubbleall/pojos/ItemPanel;", "", MediaConstants.MEDIA_URI_QUERY_ID, "", "resource", "", "resourceId", "resourceBitmap", "resourceImage", "Landroid/graphics/Bitmap;", "isActive", "", "(Ljava/lang/String;IILjava/lang/String;Landroid/graphics/Bitmap;Z)V", "getId", "()Ljava/lang/String;", "()Z", "setActive", "(Z)V", "getResource", "()I", "getResourceBitmap", "getResourceId", "getResourceImage", "()Landroid/graphics/Bitmap;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "Companion", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final /* data */ class ItemPanel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String id;
    private boolean isActive;
    private final int resource;
    private final String resourceBitmap;
    private final int resourceId;
    private final Bitmap resourceImage;

    public static /* synthetic */ ItemPanel copy$default(ItemPanel itemPanel, String str, int i, int i2, String str2, Bitmap bitmap, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = itemPanel.id;
        }
        if ((i3 & 2) != 0) {
            i = itemPanel.resource;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = itemPanel.resourceId;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str2 = itemPanel.resourceBitmap;
        }
        String str3 = str2;
        if ((i3 & 16) != 0) {
            bitmap = itemPanel.resourceImage;
        }
        Bitmap bitmap2 = bitmap;
        if ((i3 & 32) != 0) {
            z = itemPanel.isActive;
        }
        return itemPanel.copy(str, i4, i5, str3, bitmap2, z);
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
    public final int getResourceId() {
        return this.resourceId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getResourceBitmap() {
        return this.resourceBitmap;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Bitmap getResourceImage() {
        return this.resourceImage;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final ItemPanel copy(String id, int resource, int resourceId, String resourceBitmap, Bitmap resourceImage, boolean isActive) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new ItemPanel(id, resource, resourceId, resourceBitmap, resourceImage, isActive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemPanel)) {
            return false;
        }
        ItemPanel itemPanel = (ItemPanel) other;
        return Intrinsics.areEqual(this.id, itemPanel.id) && this.resource == itemPanel.resource && this.resourceId == itemPanel.resourceId && Intrinsics.areEqual(this.resourceBitmap, itemPanel.resourceBitmap) && Intrinsics.areEqual(this.resourceImage, itemPanel.resourceImage) && this.isActive == itemPanel.isActive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.resource) * 31) + this.resourceId) * 31;
        String str = this.resourceBitmap;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Bitmap bitmap = this.resourceImage;
        int iHashCode3 = (iHashCode2 + (bitmap != null ? bitmap.hashCode() : 0)) * 31;
        boolean z = this.isActive;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode3 + r1;
    }

    public String toString() {
        return "ItemPanel(id=" + this.id + ", resource=" + this.resource + ", resourceId=" + this.resourceId + ", resourceBitmap=" + this.resourceBitmap + ", resourceImage=" + this.resourceImage + ", isActive=" + this.isActive + ')';
    }

    /* JADX INFO: compiled from: ItemPanel.kt */
    @Metadata(m494d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m495d2 = {"Lcom/alexmanzana/bubbleall/pojos/ItemPanel$Companion;", "", "()V", "create", "Lcom/alexmanzana/bubbleall/pojos/ItemPanel;", "item", "Lcom/alexmanzana/bubbleall/pojos/ItemAdd;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ItemPanel create(ItemAdd item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new ItemPanel(item.getId(), item.getResource(), item.getResourceId(), item.getResourceBitmap(), null, true);
        }
    }

    public ItemPanel(String id, int i, int i2, String str, Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.resource = i;
        this.resourceId = i2;
        this.resourceBitmap = str;
        this.resourceImage = bitmap;
        this.isActive = z;
    }

    public final String getId() {
        return this.id;
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

    public final Bitmap getResourceImage() {
        return this.resourceImage;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }
}
