package com.alexmanzana.bubbleall.pojos;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ItemShortcut.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m495d2 = {"Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;", "", "icon", "", "intent", "Landroid/content/Intent;", "text", "(ILandroid/content/Intent;I)V", "getIcon", "()I", "getIntent", "()Landroid/content/Intent;", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final /* data */ class ItemShortcut {
    private final int icon;
    private final Intent intent;
    private final int text;

    public static /* synthetic */ ItemShortcut copy$default(ItemShortcut itemShortcut, int i, Intent intent, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = itemShortcut.icon;
        }
        if ((i3 & 2) != 0) {
            intent = itemShortcut.intent;
        }
        if ((i3 & 4) != 0) {
            i2 = itemShortcut.text;
        }
        return itemShortcut.copy(i, intent, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Intent getIntent() {
        return this.intent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getText() {
        return this.text;
    }

    public final ItemShortcut copy(int icon, Intent intent, int text) {
        return new ItemShortcut(icon, intent, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemShortcut)) {
            return false;
        }
        ItemShortcut itemShortcut = (ItemShortcut) other;
        return this.icon == itemShortcut.icon && Intrinsics.areEqual(this.intent, itemShortcut.intent) && this.text == itemShortcut.text;
    }

    public int hashCode() {
        int i = this.icon * 31;
        Intent intent = this.intent;
        return ((i + (intent == null ? 0 : intent.hashCode())) * 31) + this.text;
    }

    public String toString() {
        return "ItemShortcut(icon=" + this.icon + ", intent=" + this.intent + ", text=" + this.text + ')';
    }

    public ItemShortcut(int i, Intent intent, int i2) {
        this.icon = i;
        this.intent = intent;
        this.text = i2;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final Intent getIntent() {
        return this.intent;
    }

    public final int getText() {
        return this.text;
    }
}
