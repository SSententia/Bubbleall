package com.alexmanzana.bubbleall.pojos;

import android.graphics.Color;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ItemTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001b¨\u0006,"}, m495d2 = {"Lcom/alexmanzana/bubbleall/pojos/ItemTheme;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "colorBubble", "", "colorCurrentTab", "colorTab", "colorWindow", "colorInternal", "uuid", "(Ljava/lang/String;IIIIILjava/lang/String;)V", "getColorBubble", "()I", "setColorBubble", "(I)V", "getColorCurrentTab", "setColorCurrentTab", "getColorInternal", "setColorInternal", "getColorTab", "setColorTab", "getColorWindow", "setColorWindow", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getUuid", "setUuid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final /* data */ class ItemTheme {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int colorBubble;
    private int colorCurrentTab;
    private int colorInternal;
    private int colorTab;
    private int colorWindow;
    private String name;
    private String uuid;

    public static /* synthetic */ ItemTheme copy$default(ItemTheme itemTheme, String str, int i, int i2, int i3, int i4, int i5, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = itemTheme.name;
        }
        if ((i6 & 2) != 0) {
            i = itemTheme.colorBubble;
        }
        int i7 = i;
        if ((i6 & 4) != 0) {
            i2 = itemTheme.colorCurrentTab;
        }
        int i8 = i2;
        if ((i6 & 8) != 0) {
            i3 = itemTheme.colorTab;
        }
        int i9 = i3;
        if ((i6 & 16) != 0) {
            i4 = itemTheme.colorWindow;
        }
        int i10 = i4;
        if ((i6 & 32) != 0) {
            i5 = itemTheme.colorInternal;
        }
        int i11 = i5;
        if ((i6 & 64) != 0) {
            str2 = itemTheme.uuid;
        }
        return itemTheme.copy(str, i7, i8, i9, i10, i11, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getColorBubble() {
        return this.colorBubble;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getColorCurrentTab() {
        return this.colorCurrentTab;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getColorTab() {
        return this.colorTab;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getColorWindow() {
        return this.colorWindow;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getColorInternal() {
        return this.colorInternal;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final ItemTheme copy(String name, int colorBubble, int colorCurrentTab, int colorTab, int colorWindow, int colorInternal, String uuid) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ItemTheme(name, colorBubble, colorCurrentTab, colorTab, colorWindow, colorInternal, uuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemTheme)) {
            return false;
        }
        ItemTheme itemTheme = (ItemTheme) other;
        return Intrinsics.areEqual(this.name, itemTheme.name) && this.colorBubble == itemTheme.colorBubble && this.colorCurrentTab == itemTheme.colorCurrentTab && this.colorTab == itemTheme.colorTab && this.colorWindow == itemTheme.colorWindow && this.colorInternal == itemTheme.colorInternal && Intrinsics.areEqual(this.uuid, itemTheme.uuid);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.name.hashCode() * 31) + this.colorBubble) * 31) + this.colorCurrentTab) * 31) + this.colorTab) * 31) + this.colorWindow) * 31) + this.colorInternal) * 31;
        String str = this.uuid;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ItemTheme(name=" + this.name + ", colorBubble=" + this.colorBubble + ", colorCurrentTab=" + this.colorCurrentTab + ", colorTab=" + this.colorTab + ", colorWindow=" + this.colorWindow + ", colorInternal=" + this.colorInternal + ", uuid=" + this.uuid + ')';
    }

    public ItemTheme(String name, int i, int i2, int i3, int i4, int i5, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.colorBubble = i;
        this.colorCurrentTab = i2;
        this.colorTab = i3;
        this.colorWindow = i4;
        this.colorInternal = i5;
        this.uuid = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final int getColorBubble() {
        return this.colorBubble;
    }

    public final void setColorBubble(int i) {
        this.colorBubble = i;
    }

    public final int getColorCurrentTab() {
        return this.colorCurrentTab;
    }

    public final void setColorCurrentTab(int i) {
        this.colorCurrentTab = i;
    }

    public final int getColorTab() {
        return this.colorTab;
    }

    public final void setColorTab(int i) {
        this.colorTab = i;
    }

    public final int getColorWindow() {
        return this.colorWindow;
    }

    public final void setColorWindow(int i) {
        this.colorWindow = i;
    }

    public final int getColorInternal() {
        return this.colorInternal;
    }

    public final void setColorInternal(int i) {
        this.colorInternal = i;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    /* JADX INFO: compiled from: ItemTheme.kt */
    @Metadata(m494d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m495d2 = {"Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;", "", "()V", "blank", "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;", "default", "text", "", "forVal", "color", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ItemTheme forVal(int color) {
            return new ItemTheme("", color, color, color, color, color, null);
        }

        public final ItemTheme blank() {
            return new ItemTheme("", -123, -123, -123, -123, -123, null);
        }

        /* JADX INFO: renamed from: default, reason: not valid java name */
        public final ItemTheme m720default() {
            return m721default("");
        }

        /* JADX INFO: renamed from: default, reason: not valid java name */
        public final ItemTheme m721default(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ItemTheme(text, Color.parseColor("#3F51B5"), Color.parseColor("#3F51B5"), Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"), Color.parseColor("#1c1c1c"), null);
        }
    }
}
