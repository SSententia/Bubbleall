package kotlinx.coroutines.flow;

import androidx.media2.widget.Cea708CCParser;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Errors.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m496k = 3, m497mv = {1, 6, 0}, m499xi = 48)
@DebugMetadata(m511c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", m512f = "Errors.kt", m513i = {0}, m514l = {Cea708CCParser.Const.CODE_C1_DF6}, m515m = "emit", m516n = {"this"}, m517s = {"L$0"})
final class FlowKt__ErrorsKt$catchImpl$2$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__ErrorsKt.C18912<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__ErrorsKt$catchImpl$2$emit$1(FlowKt__ErrorsKt.C18912<? super T> c18912, Continuation<? super FlowKt__ErrorsKt$catchImpl$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = c18912;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
