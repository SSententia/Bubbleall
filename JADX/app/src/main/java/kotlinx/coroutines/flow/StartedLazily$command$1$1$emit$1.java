package kotlinx.coroutines.flow;

import androidx.media2.widget.Cea708CCParser;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m496k = 3, m497mv = {1, 6, 0}, m499xi = 48)
@DebugMetadata(m511c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", m512f = "SharingStarted.kt", m513i = {}, m514l = {Cea708CCParser.Const.CODE_C1_DF6}, m515m = "emit", m516n = {}, m517s = {})
final class StartedLazily$command$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StartedLazily.C19581.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StartedLazily$command$1$1$emit$1(StartedLazily.C19581.AnonymousClass1<? super T> anonymousClass1, Continuation<? super StartedLazily$command$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(0, this);
    }
}
