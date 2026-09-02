package androidx.activity.contextaware;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.activity.contextaware.ContextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$2 */
/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m493bv = {1, 0, 3}, m494d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, m495d2 = {"<anonymous>", "", "R", "it", "", "invoke", "androidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$1"}, m496k = 3, m497mv = {1, 4, 1})
public final class C0040x8a9e0a56 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ C0039x8a9e0a55 $listener;
    final /* synthetic */ Function1 $onContextAvailable$inlined;
    final /* synthetic */ ContextAware $this_withContextAvailable$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040x8a9e0a56(C0039x8a9e0a55 c0039x8a9e0a55, ContextAware contextAware, Function1 function1) {
        super(1);
        this.$listener = c0039x8a9e0a55;
        this.$this_withContextAvailable$inlined = contextAware;
        this.$onContextAvailable$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$this_withContextAvailable$inlined.removeOnContextAvailableListener(this.$listener);
    }
}
