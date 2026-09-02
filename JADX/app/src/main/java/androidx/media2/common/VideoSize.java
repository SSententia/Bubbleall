package androidx.media2.common;

import androidx.versionedparcelable.VersionedParcelable;

/* JADX INFO: loaded from: classes.dex */
public class VideoSize implements VersionedParcelable {
    int mHeight;
    int mWidth;

    VideoSize() {
    }

    public VideoSize(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("width can not be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("height can not be negative");
        }
        this.mWidth = i;
        this.mHeight = i2;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSize)) {
            return false;
        }
        VideoSize videoSize = (VideoSize) obj;
        return this.mWidth == videoSize.mWidth && this.mHeight == videoSize.mHeight;
    }

    public String toString() {
        return this.mWidth + "x" + this.mHeight;
    }

    public int hashCode() {
        int i = this.mHeight;
        int i2 = this.mWidth;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }
}
