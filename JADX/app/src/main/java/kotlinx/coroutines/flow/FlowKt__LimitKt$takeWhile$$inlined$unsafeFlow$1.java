package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m494d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, m495d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m496k = 1, m497mv = {1, 6, 0}, m499xi = 48)
public final class FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1<T> implements Flow<T> {
    final /* synthetic */ Function2 $predicate$inlined;
    final /* synthetic */ Flow $this_takeWhile$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(m496k = 3, m497mv = {1, 6, 0}, m499xi = 48)
    @DebugMetadata(m511c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", m512f = "Limit.kt", m513i = {0}, m514l = {124}, m515m = "collect", m516n = {"collector$iv"}, m517s = {"L$0"})
    public static final class C18971 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C18971(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) throws Throwable {
        C18971 c18971;
        FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1;
        if (continuation instanceof C18971) {
            c18971 = (C18971) continuation;
            if ((c18971.label & Integer.MIN_VALUE) != 0) {
                c18971.label -= Integer.MIN_VALUE;
            } else {
                c18971 = new C18971(continuation);
            }
        } else {
            c18971 = new C18971(continuation);
        }
        Object obj = c18971.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18971.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flow = this.$this_takeWhile$inlined;
            FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$2 = new FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1(this.$predicate$inlined, flowCollector);
            try {
                c18971.L$0 = flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$2;
                c18971.label = 1;
                if (flow.collect(flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$2, c18971) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (AbortFlowException e) {
                e = e;
                flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$2;
                FlowExceptions_commonKt.checkOwnership(e, flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 = (FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1) c18971.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                FlowExceptions_commonKt.checkOwnership(e, flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1);
            }
        }
        return Unit.INSTANCE;
    }

    public FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(Flow flow, Function2 function2) {
        this.$this_takeWhile$inlined = flow;
        this.$predicate$inlined = function2;
    }
}
