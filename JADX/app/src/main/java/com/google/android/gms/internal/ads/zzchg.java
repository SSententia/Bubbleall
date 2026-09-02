package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzchg {
    public static final zzfsn zza;
    public static final zzfsn zzb;
    public static final zzfsn zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzfsn zze;
    public static final zzfsn zzf;

    static {
        Executor threadPoolExecutor;
        ExecutorService executorServiceZza;
        ExecutorService executorServiceZzc;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfkz.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzchc("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzchc("Default"));
        }
        zzchf zzchfVar = null;
        zza = new zzche(threadPoolExecutor, zzchfVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZza = zzfkz.zza().zza(5, new zzchc("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzchc("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executorServiceZza = threadPoolExecutor2;
        }
        zzb = new zzche(executorServiceZza, zzchfVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZzc = zzfkz.zza().zzc(new zzchc("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzchc("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceZzc = threadPoolExecutor3;
        }
        zzc = new zzche(executorServiceZzc, zzchfVar);
        zzd = new zzchb(3, new zzchc("Schedule"));
        zze = new zzche(new zzchd(), zzchfVar);
        zzf = new zzche(zzfst.zza(), zzchfVar);
    }
}
