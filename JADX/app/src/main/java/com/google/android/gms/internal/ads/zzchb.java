package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzchb extends ScheduledThreadPoolExecutor {
    zzchb(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
