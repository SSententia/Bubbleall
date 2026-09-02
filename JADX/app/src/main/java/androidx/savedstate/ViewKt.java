package androidx.savedstate;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m493bv = {1, 0, 3}, m494d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, m495d2 = {"findViewTreeSavedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroid/view/View;", "savedstate-ktx_release"}, m496k = 2, m497mv = {1, 4, 1})
public final class ViewKt {
    public static final SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(View findViewTreeSavedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(findViewTreeSavedStateRegistryOwner, "$this$findViewTreeSavedStateRegistryOwner");
        return ViewTreeSavedStateRegistryOwner.get(findViewTreeSavedStateRegistryOwner);
    }
}
