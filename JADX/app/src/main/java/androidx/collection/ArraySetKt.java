package androidx.collection;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ArraySet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m493bv = {1, 0, 3}, m494d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u0086\b\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004\"\u0002H\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m495d2 = {"arraySetOf", "Landroidx/collection/ArraySet;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "values", "", "([Ljava/lang/Object;)Landroidx/collection/ArraySet;", "collection-ktx"}, m496k = 2, m497mv = {1, 1, 13})
public final class ArraySetKt {
    public static final <T> ArraySet<T> arraySetOf() {
        return new ArraySet<>();
    }

    public static final <T> ArraySet<T> arraySetOf(T... values) {
        Intrinsics.checkParameterIsNotNull(values, "values");
        ArraySet<T> arraySet = new ArraySet<>(values.length);
        for (T t : values) {
            arraySet.add(t);
        }
        return arraySet;
    }
}
