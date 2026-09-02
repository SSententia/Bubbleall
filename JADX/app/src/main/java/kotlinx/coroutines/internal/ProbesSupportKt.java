package kotlinx.coroutines.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: compiled from: ProbesSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m494d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0080\b¨\u0006\u0004"}, m495d2 = {"probeCoroutineCreated", "Lkotlin/coroutines/Continuation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "completion", "kotlinx-coroutines-core"}, m496k = 2, m497mv = {1, 6, 0}, m499xi = 48)
public final class ProbesSupportKt {
    public static final <T> Continuation<T> probeCoroutineCreated(Continuation<? super T> continuation) {
        return DebugProbesKt.probeCoroutineCreated(continuation);
    }
}
