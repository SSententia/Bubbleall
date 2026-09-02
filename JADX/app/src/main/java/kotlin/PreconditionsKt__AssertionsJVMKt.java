package kotlin;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssertionsJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m494d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, m495d2 = {"assert", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "lazyMessage", "Lkotlin/Function0;", "", "kotlin-stdlib"}, m496k = 5, m497mv = {1, 9, 0}, m499xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, m500xs = "kotlin/PreconditionsKt")
class PreconditionsKt__AssertionsJVMKt {
    /* JADX INFO: renamed from: assert, reason: not valid java name */
    private static final void m748assert(boolean z) {
    }

    /* JADX INFO: renamed from: assert, reason: not valid java name */
    private static final void m749assert(boolean z, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
    }
}
