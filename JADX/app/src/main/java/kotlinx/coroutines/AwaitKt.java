package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m494d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004\"\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0004\"\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\u001b\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\n0\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m495d2 = {"awaitAll", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "deferreds", "", "Lkotlinx/coroutines/Deferred;", "([Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinAll", "", "jobs", "Lkotlinx/coroutines/Job;", "([Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m496k = 2, m497mv = {1, 6, 0}, m499xi = 48)
public final class AwaitKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.AwaitKt$joinAll$1 */
    /* JADX INFO: compiled from: Await.kt */
    @Metadata(m496k = 3, m497mv = {1, 6, 0}, m499xi = 48)
    @DebugMetadata(m511c = "kotlinx.coroutines.AwaitKt", m512f = "Await.kt", m513i = {}, m514l = {54}, m515m = "joinAll", m516n = {}, m517s = {})
    static final class C17841 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C17841(Continuation<? super C17841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitKt.joinAll((Job[]) null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.AwaitKt$joinAll$3 */
    /* JADX INFO: compiled from: Await.kt */
    @Metadata(m496k = 3, m497mv = {1, 6, 0}, m499xi = 48)
    @DebugMetadata(m511c = "kotlinx.coroutines.AwaitKt", m512f = "Await.kt", m513i = {}, m514l = {66}, m515m = "joinAll", m516n = {}, m517s = {})
    static final class C17853 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C17853(Continuation<? super C17853> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitKt.joinAll((Collection<? extends Job>) null, this);
        }
    }

    public static final <T> Object awaitAll(Deferred<? extends T>[] deferredArr, Continuation<? super List<? extends T>> continuation) {
        return deferredArr.length == 0 ? CollectionsKt.emptyList() : new AwaitAll(deferredArr).await(continuation);
    }

    public static final <T> Object awaitAll(Collection<? extends Deferred<? extends T>> collection, Continuation<? super List<? extends T>> continuation) {
        if (collection.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        Object[] array = collection.toArray(new Deferred[0]);
        if (array != null) {
            return new AwaitAll((Deferred[]) array).await(continuation);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object joinAll(Job[] jobArr, Continuation<? super Unit> continuation) throws Throwable {
        C17841 c17841;
        int i;
        Job[] jobArr2;
        int length;
        if (continuation instanceof C17841) {
            c17841 = (C17841) continuation;
            if ((c17841.label & Integer.MIN_VALUE) != 0) {
                c17841.label -= Integer.MIN_VALUE;
            } else {
                c17841 = new C17841(continuation);
            }
        } else {
            c17841 = new C17841(continuation);
        }
        Object obj = c17841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17841.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            i = 0;
            jobArr2 = jobArr;
            length = jobArr.length;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = c17841.I$1;
            i = c17841.I$0;
            Job[] jobArr3 = (Job[]) c17841.L$0;
            ResultKt.throwOnFailure(obj);
            jobArr2 = jobArr3;
        }
        while (i < length) {
            Job job = jobArr2[i];
            i++;
            c17841.L$0 = jobArr2;
            c17841.I$0 = i;
            c17841.I$1 = length;
            c17841.label = 1;
            if (job.join(c17841) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object joinAll(Collection<? extends Job> collection, Continuation<? super Unit> continuation) throws Throwable {
        C17853 c17853;
        Iterator it;
        if (continuation instanceof C17853) {
            c17853 = (C17853) continuation;
            if ((c17853.label & Integer.MIN_VALUE) != 0) {
                c17853.label -= Integer.MIN_VALUE;
            } else {
                c17853 = new C17853(continuation);
            }
        } else {
            c17853 = new C17853(continuation);
        }
        Object obj = c17853.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c17853.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            it = collection.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c17853.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            Job job = (Job) it.next();
            c17853.L$0 = it;
            c17853.label = 1;
            if (job.join(c17853) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
