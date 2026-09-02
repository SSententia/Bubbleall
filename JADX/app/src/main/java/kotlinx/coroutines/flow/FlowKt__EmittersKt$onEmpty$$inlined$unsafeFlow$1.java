package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m494d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, m495d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m496k = 1, m497mv = {1, 6, 0}, m499xi = 48)
public final class FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1<T> implements Flow<T> {
    final /* synthetic */ Function2 $action$inlined;
    final /* synthetic */ Flow $this_onEmpty$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(m496k = 3, m497mv = {1, 6, 0}, m499xi = 48)
    @DebugMetadata(m511c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", m512f = "Emitters.kt", m513i = {0, 0, 0, 1}, m514l = {114, 122}, m515m = "collect", m516n = {"this", "$this$onEmpty_u24lambda_u2d3", "isEmpty", "collector"}, m517s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class C18851 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C18851(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.flow.FlowCollector<? super T>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) throws Throwable {
        C18851 c18851;
        FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1<T> flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1;
        ?? r2;
        Ref.BooleanRef booleanRef;
        if (continuation instanceof C18851) {
            c18851 = (C18851) continuation;
            if ((c18851.label & Integer.MIN_VALUE) != 0) {
                c18851.label -= Integer.MIN_VALUE;
            } else {
                c18851 = new C18851(continuation);
            }
        } else {
            c18851 = new C18851(continuation);
        }
        Object obj = c18851.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18851.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                booleanRef2.element = true;
                Flow flow = this.$this_onEmpty$inlined;
                FlowKt__EmittersKt$onEmpty$1$1 flowKt__EmittersKt$onEmpty$1$1 = new FlowKt__EmittersKt$onEmpty$1$1(booleanRef2, flowCollector);
                c18851.L$0 = this;
                c18851.L$1 = flowCollector;
                c18851.L$2 = booleanRef2;
                c18851.label = 1;
                if (flow.collect(flowKt__EmittersKt$onEmpty$1$1, c18851) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 = this;
                r2 = flowCollector;
                booleanRef = booleanRef2;
            } else {
                if (i == 1) {
                    booleanRef = (Ref.BooleanRef) c18851.L$2;
                    FlowCollector flowCollector2 = (FlowCollector) c18851.L$1;
                    flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1) c18851.L$0;
                    ResultKt.throwOnFailure(obj);
                    r2 = flowCollector2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SafeCollector safeCollector = (SafeCollector) c18851.L$0;
                    ResultKt.throwOnFailure(obj);
                    flowCollector = safeCollector;
                }
                ((SafeCollector) flowCollector).releaseIntercepted();
                return Unit.INSTANCE;
            }
            if (booleanRef.element) {
                SafeCollector safeCollector2 = new SafeCollector(r2, c18851.getContext());
                Function2 function2 = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.$action$inlined;
                c18851.L$0 = safeCollector2;
                c18851.L$1 = null;
                c18851.L$2 = null;
                c18851.label = 2;
                InlineMarker.mark(6);
                Object objInvoke = function2.invoke(safeCollector2, c18851);
                InlineMarker.mark(7);
                flowCollector = safeCollector2;
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ((SafeCollector) flowCollector).releaseIntercepted();
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            flowCollector.releaseIntercepted();
            throw th;
        }
    }

    public FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(Flow flow, Function2 function2) {
        this.$this_onEmpty$inlined = flow;
        this.$action$inlined = function2;
    }
}
