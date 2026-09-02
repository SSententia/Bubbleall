package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.sequences.Sequence;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m494d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, m495d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m496k = 1, m497mv = {1, 6, 0}, m499xi = 48)
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5<T> implements Flow<T> {
    final /* synthetic */ Sequence $this_asFlow$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1 */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(m496k = 3, m497mv = {1, 6, 0}, m499xi = 48)
    @DebugMetadata(m511c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", m512f = "Builders.kt", m513i = {0}, m514l = {115}, m515m = "collect", m516n = {"$this$asFlow_u24lambda_u2d7"}, m517s = {"L$0"})
    public static final class C18631 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C18631(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5.this.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) throws Throwable {
        C18631 c18631;
        FlowCollector flowCollector2;
        Iterator<T> it;
        if (continuation instanceof C18631) {
            c18631 = (C18631) continuation;
            if ((c18631.label & Integer.MIN_VALUE) != 0) {
                c18631.label -= Integer.MIN_VALUE;
            } else {
                c18631 = new C18631(continuation);
            }
        } else {
            c18631 = new C18631(continuation);
        }
        Object obj = c18631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18631.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector2 = flowCollector;
            it = this.$this_asFlow$inlined.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c18631.L$1;
            FlowCollector flowCollector3 = (FlowCollector) c18631.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector2 = flowCollector3;
        }
        while (it.hasNext()) {
            T next = it.next();
            c18631.L$0 = flowCollector2;
            c18631.L$1 = it;
            c18631.label = 1;
            if (flowCollector2.emit(next, c18631) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(Sequence sequence) {
        this.$this_asFlow$inlined = sequence;
    }
}
