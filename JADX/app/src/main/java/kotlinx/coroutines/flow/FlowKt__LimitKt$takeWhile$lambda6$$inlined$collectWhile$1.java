package kotlinx.coroutines.flow;

import androidx.media2.widget.Cea708CCParser;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1, reason: invalid class name */
/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m494d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, m495d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m496k = 1, m497mv = {1, 6, 0}, m499xi = 48)
public final class FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1<T> implements FlowCollector<T> {
    final /* synthetic */ Function2 $predicate$inlined;
    final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1$1 */
    /* JADX INFO: compiled from: Limit.kt */
    @Metadata(m496k = 3, m497mv = {1, 6, 0}, m499xi = 48)
    @DebugMetadata(m511c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", m512f = "Limit.kt", m513i = {0, 0, 1}, m514l = {143, Cea708CCParser.Const.CODE_C1_SPA}, m515m = "emit", m516n = {"this", AppMeasurementSdk.ConditionalUserProperty.VALUE, "this"}, m517s = {"L$0", "L$1", "L$0"})
    public static final class C18981 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C18981(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1.this.emit(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1(Function2 function2, FlowCollector flowCollector) {
        this.$predicate$inlined = function2;
        this.$this_unsafeFlow$inlined = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> continuation) throws Throwable {
        C18981 c18981;
        Object obj;
        Object obj2;
        FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1<T> flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1;
        if (continuation instanceof C18981) {
            c18981 = (C18981) continuation;
            if ((c18981.label & Integer.MIN_VALUE) != 0) {
                c18981.label -= Integer.MIN_VALUE;
            } else {
                c18981 = new C18981(continuation);
            }
        } else {
            c18981 = new C18981(continuation);
        }
        Object obj3 = c18981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18981.label;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                Object obj4 = c18981.L$1;
                FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1<T> flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$2 = (FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1) c18981.L$0;
                ResultKt.throwOnFailure(obj3);
                obj2 = obj4;
                flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$2;
                obj = obj3;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 = (FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1) c18981.L$0;
                ResultKt.throwOnFailure(obj3);
            }
            if (z) {
                return Unit.INSTANCE;
            }
            throw new AbortFlowException(flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1);
        }
        ResultKt.throwOnFailure(obj3);
        Function2 function2 = this.$predicate$inlined;
        c18981.L$0 = this;
        c18981.L$1 = t;
        c18981.label = 1;
        InlineMarker.mark(6);
        Object objInvoke = function2.invoke(t, c18981);
        InlineMarker.mark(7);
        if (objInvoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj = objInvoke;
        obj2 = t;
        flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 = this;
        if (((Boolean) obj).booleanValue()) {
            FlowCollector flowCollector = flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1.$this_unsafeFlow$inlined;
            c18981.L$0 = flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1;
            c18981.L$1 = null;
            c18981.label = 2;
            if (flowCollector.emit(obj2, c18981) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            z = false;
        }
        if (z) {
            return Unit.INSTANCE;
        }
        throw new AbortFlowException(flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1);
    }
}
