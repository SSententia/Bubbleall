package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Count.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m494d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001aE\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m495d2 = {"count", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m496k = 5, m497mv = {1, 6, 0}, m499xi = 48, m500xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__CountKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$1 */
    /* JADX INFO: compiled from: Count.kt */
    @Metadata(m496k = 3, m497mv = {1, 6, 0}, m499xi = 48)
    @DebugMetadata(m511c = "kotlinx.coroutines.flow.FlowKt__CountKt", m512f = "Count.kt", m513i = {0}, m514l = {18}, m515m = "count", m516n = {"i"}, m517s = {"L$0"})
    static final class C18741<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C18741(Continuation<? super C18741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.count(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$3 */
    /* JADX INFO: compiled from: Count.kt */
    @Metadata(m496k = 3, m497mv = {1, 6, 0}, m499xi = 48)
    @DebugMetadata(m511c = "kotlinx.coroutines.flow.FlowKt__CountKt", m512f = "Count.kt", m513i = {0}, m514l = {30}, m515m = "count", m516n = {"i"}, m517s = {"L$0"})
    static final class C18763<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C18763(Continuation<? super C18763> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.count(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> Object count(Flow<? extends T> flow, Continuation<? super Integer> continuation) throws Throwable {
        C18741 c18741;
        Ref.IntRef intRef;
        if (continuation instanceof C18741) {
            c18741 = (C18741) continuation;
            if ((c18741.label & Integer.MIN_VALUE) != 0) {
                c18741.label -= Integer.MIN_VALUE;
            } else {
                c18741 = new C18741(continuation);
            }
        } else {
            c18741 = new C18741(continuation);
        }
        Object obj = c18741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18741.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.IntRef intRef2 = new Ref.IntRef();
            FlowCollector<? super Object> c18752 = new C18752<>(intRef2);
            c18741.L$0 = intRef2;
            c18741.label = 1;
            if (flow.collect(c18752, c18741) == coroutine_suspended) {
                return coroutine_suspended;
            }
            intRef = intRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef = (Ref.IntRef) c18741.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxInt(intRef.element);
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$2 */
    /* JADX INFO: compiled from: Count.kt */
    @Metadata(m494d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m495d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m496k = 3, m497mv = {1, 6, 0}, m499xi = 48)
    static final class C18752<T> implements FlowCollector, SuspendFunction {

        /* JADX INFO: renamed from: $i */
        final /* synthetic */ Ref.IntRef f253$i;

        C18752(Ref.IntRef intRef) {
            this.f253$i = intRef;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            this.f253$i.element++;
            int i = this.f253$i.element;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> Object count(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super Integer> continuation) throws Throwable {
        C18763 c18763;
        Ref.IntRef intRef;
        if (continuation instanceof C18763) {
            c18763 = (C18763) continuation;
            if ((c18763.label & Integer.MIN_VALUE) != 0) {
                c18763.label -= Integer.MIN_VALUE;
            } else {
                c18763 = new C18763(continuation);
            }
        } else {
            c18763 = new C18763(continuation);
        }
        Object obj = c18763.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18763.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.IntRef intRef2 = new Ref.IntRef();
            FlowCollector<? super Object> c18774 = new C18774<>(function2, intRef2);
            c18763.L$0 = intRef2;
            c18763.label = 1;
            if (flow.collect(c18774, c18763) == coroutine_suspended) {
                return coroutine_suspended;
            }
            intRef = intRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef = (Ref.IntRef) c18763.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxInt(intRef.element);
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$4 */
    /* JADX INFO: compiled from: Count.kt */
    @Metadata(m494d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m495d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, AppMeasurementSdk.ConditionalUserProperty.VALUE, "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m496k = 3, m497mv = {1, 6, 0}, m499xi = 48)
    static final class C18774<T> implements FlowCollector, SuspendFunction {

        /* JADX INFO: renamed from: $i */
        final /* synthetic */ Ref.IntRef f254$i;
        final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> $predicate;

        /* JADX WARN: Multi-variable type inference failed */
        C18774(Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Ref.IntRef intRef) {
            this.$predicate = function2;
            this.f254$i = intRef;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t, Continuation<? super Unit> continuation) throws Throwable {
            FlowKt__CountKt$count$4$emit$1 flowKt__CountKt$count$4$emit$1;
            C18774<T> c18774;
            if (continuation instanceof FlowKt__CountKt$count$4$emit$1) {
                flowKt__CountKt$count$4$emit$1 = (FlowKt__CountKt$count$4$emit$1) continuation;
                if ((flowKt__CountKt$count$4$emit$1.label & Integer.MIN_VALUE) != 0) {
                    flowKt__CountKt$count$4$emit$1.label -= Integer.MIN_VALUE;
                } else {
                    flowKt__CountKt$count$4$emit$1 = new FlowKt__CountKt$count$4$emit$1(this, continuation);
                }
            } else {
                flowKt__CountKt$count$4$emit$1 = new FlowKt__CountKt$count$4$emit$1(this, continuation);
            }
            Object objInvoke = flowKt__CountKt$count$4$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = flowKt__CountKt$count$4$emit$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(objInvoke);
                Function2<T, Continuation<? super Boolean>, Object> function2 = this.$predicate;
                flowKt__CountKt$count$4$emit$1.L$0 = this;
                flowKt__CountKt$count$4$emit$1.label = 1;
                objInvoke = function2.invoke(t, flowKt__CountKt$count$4$emit$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c18774 = this;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c18774 = (C18774) flowKt__CountKt$count$4$emit$1.L$0;
                ResultKt.throwOnFailure(objInvoke);
            }
            if (((Boolean) objInvoke).booleanValue()) {
                c18774.f254$i.element++;
                int i2 = c18774.f254$i.element;
            }
            return Unit.INSTANCE;
        }
    }
}
