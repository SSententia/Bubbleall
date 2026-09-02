package com.alexmanzana.bubbleall.pojos;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.media2.session.MediaConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ItemMusic.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r¨\u0006#"}, m495d2 = {"Lcom/alexmanzana/bubbleall/pojos/ItemMusic;", "", MediaConstants.MEDIA_URI_QUERY_ID, "", "data", "Landroid/net/Uri;", "title", "", "author", "image", "Landroid/graphics/Bitmap;", "(JLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getAuthor", "()Ljava/lang/String;", "getData", "()Landroid/net/Uri;", "getId", "()J", "getImage", "()Landroid/graphics/Bitmap;", "setImage", "(Landroid/graphics/Bitmap;)V", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final /* data */ class ItemMusic {
    private final String author;
    private final Uri data;
    private final long id;
    private Bitmap image;
    private final String title;

    public static /* synthetic */ ItemMusic copy$default(ItemMusic itemMusic, long j, Uri uri, String str, String str2, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            j = itemMusic.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            uri = itemMusic.data;
        }
        Uri uri2 = uri;
        if ((i & 4) != 0) {
            str = itemMusic.title;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = itemMusic.author;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            bitmap = itemMusic.image;
        }
        return itemMusic.copy(j2, uri2, str3, str4, bitmap);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Uri getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Bitmap getImage() {
        return this.image;
    }

    public final ItemMusic copy(long id, Uri data, String title, String author, Bitmap image) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(title, "title");
        return new ItemMusic(id, data, title, author, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemMusic)) {
            return false;
        }
        ItemMusic itemMusic = (ItemMusic) other;
        return this.id == itemMusic.id && Intrinsics.areEqual(this.data, itemMusic.data) && Intrinsics.areEqual(this.title, itemMusic.title) && Intrinsics.areEqual(this.author, itemMusic.author) && Intrinsics.areEqual(this.image, itemMusic.image);
    }

    public int hashCode() {
        int iM341m = ((((ItemMusic$$ExternalSyntheticBackport0.m341m(this.id) * 31) + this.data.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.author;
        int iHashCode = (iM341m + (str == null ? 0 : str.hashCode())) * 31;
        Bitmap bitmap = this.image;
        return iHashCode + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public String toString() {
        return "ItemMusic(id=" + this.id + ", data=" + this.data + ", title=" + this.title + ", author=" + this.author + ", image=" + this.image + ')';
    }

    public ItemMusic(long j, Uri data, String title, String str, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j;
        this.data = data;
        this.title = title;
        this.author = str;
        this.image = bitmap;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final Uri getData() {
        return this.data;
    }

    public final long getId() {
        return this.id;
    }

    public final Bitmap getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setImage(Bitmap bitmap) {
        this.image = bitmap;
    }
}
