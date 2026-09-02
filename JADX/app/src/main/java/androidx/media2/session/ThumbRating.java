package androidx.media2.session;

import androidx.core.util.ObjectsCompat;
import androidx.media2.common.Rating;

/* JADX INFO: loaded from: classes.dex */
public final class ThumbRating implements Rating {
    boolean mIsRated = false;
    boolean mThumbUp;

    public ThumbRating() {
    }

    public ThumbRating(boolean z) {
        this.mThumbUp = z;
    }

    @Override // androidx.media2.common.Rating
    public boolean isRated() {
        return this.mIsRated;
    }

    public int hashCode() {
        return ObjectsCompat.hash(Boolean.valueOf(this.mIsRated), Boolean.valueOf(this.mThumbUp));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ThumbRating)) {
            return false;
        }
        ThumbRating thumbRating = (ThumbRating) obj;
        return this.mThumbUp == thumbRating.mThumbUp && this.mIsRated == thumbRating.mIsRated;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ThumbRating: ");
        if (this.mIsRated) {
            str = "isThumbUp=" + this.mThumbUp;
        } else {
            str = "unrated";
        }
        sb.append(str);
        return sb.toString();
    }

    public boolean isThumbUp() {
        return this.mThumbUp;
    }
}
