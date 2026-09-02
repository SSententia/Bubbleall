package androidx.media2.session;

import androidx.core.util.ObjectsCompat;
import androidx.media2.common.Rating;

/* JADX INFO: loaded from: classes.dex */
public final class StarRating implements Rating {
    private static final float RATING_NOT_RATED = -1.0f;
    int mMaxStars;
    float mStarRating;

    StarRating() {
    }

    public StarRating(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxStars should be a positive integer");
        }
        this.mMaxStars = i;
        this.mStarRating = -1.0f;
    }

    public StarRating(int i, float f) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxStars should be a positive integer");
        }
        if (f < 0.0f || f > i) {
            throw new IllegalArgumentException("starRating is out of range [0, maxStars]");
        }
        this.mMaxStars = i;
        this.mStarRating = f;
    }

    @Override // androidx.media2.common.Rating
    public boolean isRated() {
        return this.mStarRating >= 0.0f;
    }

    public int hashCode() {
        return ObjectsCompat.hash(Integer.valueOf(this.mMaxStars), Float.valueOf(this.mStarRating));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        return this.mMaxStars == starRating.mMaxStars && this.mStarRating == starRating.mStarRating;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("StarRating: maxStars=");
        sb.append(this.mMaxStars);
        if (isRated()) {
            str = ", starRating=" + this.mStarRating;
        } else {
            str = ", unrated";
        }
        sb.append(str);
        return sb.toString();
    }

    public int getMaxStars() {
        return this.mMaxStars;
    }

    public float getStarRating() {
        return this.mStarRating;
    }
}
