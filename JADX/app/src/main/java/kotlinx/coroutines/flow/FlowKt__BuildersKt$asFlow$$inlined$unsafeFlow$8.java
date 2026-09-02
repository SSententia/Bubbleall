package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m494d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, m495d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m496k = 1, m497mv = {1, 6, 0}, m499xi = 48)
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8 implements Flow<Long> {
    final /* synthetic */ long[] $this_asFlow$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1 */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(m496k = 3, m497mv = {1, 6, 0}, m499xi = 48)
    @DebugMetadata(m511c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", m512f = "Builders.kt", m513i = {0}, m514l = {115}, m515m = "collect", m516n = {"$this$asFlow_u24lambda_u2d15"}, m517s = {"L$0"})
    public static final class C18661 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C18661(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8.this.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super Long> flowCollector, Continuation<? super Unit> continuation) throws Throwable {
        C18661 c18661;
        int i;
        long[] jArr;
        FlowCollector flowCollector2;
        int i2;
        if (continuation instanceof C18661) {
            c18661 = (C18661) continuation;
            if ((c18661.label & Integer.MIN_VALUE) != 0) {
                c18661.label -= Integer.MIN_VALUE;
            } else {
                c18661 = new C18661(continuation);
            }
        } else {
            c18661 = new C18661(continuation);
        }
        Object obj = c18661.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c18661.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            long[] jArr2 = this.$this_asFlow$inlined;
            int length = jArr2.length;
            i = 0;
            jArr = jArr2;
            flowCollector2 = flowCollector;
            i2 = length;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c18661.I$1;
            int i4 = c18661.I$0;
            long[] jArr3 = (long[]) c18661.L$1;
            FlowCollector flowCollector3 = (FlowCollector) c18661.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector2 = flowCollector3;
            jArr = jArr3;
            i = i4;
        }
        long[] jArr4 = jArr;
        while (i < i2) {
            long j = jArr4[i];
            i++;
            Long lBoxLong = Boxing.boxLong(j);
            c18661.L$0 = flowCollector2;
            c18661.L$1 = jArr4;
            c18661.I$0 = i;
            c18661.I$1 = i2;
            c18661.label = 1;
            if (flowCollector2.emit(lBoxLong, c18661) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(long[] jArr) {
        this.$this_asFlow$inlined = jArr;
    }
}
