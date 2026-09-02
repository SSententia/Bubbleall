package com.alexmanzana.bubbleall.pojos;

import androidx.media2.session.MediaConstants;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ItemMusicMetadata.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m495d2 = {"Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;", "", MediaConstants.MEDIA_URI_QUERY_ID, "", "title", "", "author", "(JLjava/lang/String;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "getId", "()J", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final /* data */ class ItemMusicMetadata {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String author;
    private final long id;
    private final String title;

    public static /* synthetic */ ItemMusicMetadata copy$default(ItemMusicMetadata itemMusicMetadata, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = itemMusicMetadata.id;
        }
        if ((i & 2) != 0) {
            str = itemMusicMetadata.title;
        }
        if ((i & 4) != 0) {
            str2 = itemMusicMetadata.author;
        }
        return itemMusicMetadata.copy(j, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    public final ItemMusicMetadata copy(long id, String title, String author) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(author, "author");
        return new ItemMusicMetadata(id, title, author);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemMusicMetadata)) {
            return false;
        }
        ItemMusicMetadata itemMusicMetadata = (ItemMusicMetadata) other;
        return this.id == itemMusicMetadata.id && Intrinsics.areEqual(this.title, itemMusicMetadata.title) && Intrinsics.areEqual(this.author, itemMusicMetadata.author);
    }

    public int hashCode() {
        return (((ItemMusic$$ExternalSyntheticBackport0.m341m(this.id) * 31) + this.title.hashCode()) * 31) + this.author.hashCode();
    }

    public String toString() {
        return "ItemMusicMetadata(id=" + this.id + ", title=" + this.title + ", author=" + this.author + ')';
    }

    /* JADX INFO: compiled from: ItemMusicMetadata.kt */
    @Metadata(m494d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m495d2 = {"Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata$Companion;", "", "()V", "parse", "", "item", "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String parse(ItemMusic item) {
            Intrinsics.checkNotNullParameter(item, "item");
            Gson gson = new Gson();
            long id = item.getId();
            String title = item.getTitle();
            String author = item.getAuthor();
            if (author == null) {
                author = "";
            }
            String json = gson.toJson(new ItemMusicMetadata(id, title, author));
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return json;
        }
    }

    public ItemMusicMetadata(long j, String title, String author) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(author, "author");
        this.id = j;
        this.title = title;
        this.author = author;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final long getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }
}
