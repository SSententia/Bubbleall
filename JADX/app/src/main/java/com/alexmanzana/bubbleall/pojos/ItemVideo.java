package com.alexmanzana.bubbleall.pojos;

import androidx.media2.session.MediaConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ItemVideo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\nHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m495d2 = {"Lcom/alexmanzana/bubbleall/pojos/ItemVideo;", "Ljava/io/Serializable;", MediaConstants.MEDIA_URI_QUERY_ID, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "duration", "", "isBucket", "", "type", "", "isFavorite", "(Ljava/lang/String;Ljava/lang/String;JZIZ)V", "getDuration", "()J", "getId", "()Ljava/lang/String;", "()Z", "getName", "getType", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final /* data */ class ItemVideo implements Serializable {
    private final long duration;
    private final String id;
    private final boolean isBucket;
    private final boolean isFavorite;
    private final String name;
    private final int type;

    public static /* synthetic */ ItemVideo copy$default(ItemVideo itemVideo, String str, String str2, long j, boolean z, int i, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = itemVideo.id;
        }
        if ((i2 & 2) != 0) {
            str2 = itemVideo.name;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            j = itemVideo.duration;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            z = itemVideo.isBucket;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            i = itemVideo.type;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            z2 = itemVideo.isFavorite;
        }
        return itemVideo.copy(str, str3, j2, z3, i3, z2);
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
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsBucket() {
        return this.isBucket;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    public final ItemVideo copy(String id, String name, long duration, boolean isBucket, int type, boolean isFavorite) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ItemVideo(id, name, duration, isBucket, type, isFavorite);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemVideo)) {
            return false;
        }
        ItemVideo itemVideo = (ItemVideo) other;
        return Intrinsics.areEqual(this.id, itemVideo.id) && Intrinsics.areEqual(this.name, itemVideo.name) && this.duration == itemVideo.duration && this.isBucket == itemVideo.isBucket && this.type == itemVideo.type && this.isFavorite == itemVideo.isFavorite;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.name.hashCode()) * 31) + ItemMusic$$ExternalSyntheticBackport0.m341m(this.duration)) * 31;
        boolean z = this.isBucket;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (((iHashCode + r1) * 31) + this.type) * 31;
        boolean z2 = this.isFavorite;
        return i + (z2 ? 1 : z2);
    }

    public String toString() {
        return "ItemVideo(id=" + this.id + ", name=" + this.name + ", duration=" + this.duration + ", isBucket=" + this.isBucket + ", type=" + this.type + ", isFavorite=" + this.isFavorite + ')';
    }

    public ItemVideo(String str, String name, long j, boolean z, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = str;
        this.name = name;
        this.duration = j;
        this.isBucket = z;
        this.type = i;
        this.isFavorite = z2;
    }

    public /* synthetic */ ItemVideo(String str, String str2, long j, boolean z, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, z, i, (i2 & 32) != 0 ? false : z2);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isBucket() {
        return this.isBucket;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }
}
