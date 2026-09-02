package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m496k = 3, m497mv = {1, 6, 0}, m499xi = 48)
@DebugMetadata(m511c = "kotlinx.coroutines.channels.AbstractChannel", m512f = "AbstractChannel.kt", m513i = {}, m514l = {633}, m515m = "receiveCatching-JP2dKIU", m516n = {}, m517s = {})
final class AbstractChannel$receiveCatching$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractChannel$receiveCatching$1(AbstractChannel<E> abstractChannel, Continuation<? super AbstractChannel$receiveCatching$1> continuation) {
        super(continuation);
        this.this$0 = abstractChannel;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo2259receiveCatchingJP2dKIU = this.this$0.mo2259receiveCatchingJP2dKIU(this);
        return objMo2259receiveCatchingJP2dKIU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo2259receiveCatchingJP2dKIU : ChannelResult.m2266boximpl(objMo2259receiveCatchingJP2dKIU);
    }
}
