package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.C0176xc40028dd;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfqw<V> extends zzfte implements zzfsm<V> {
    private static final boolean zzaN;
    private static final Logger zzaQ;
    private static final zza zzaR;
    private static final Object zzaS;

    @CheckForNull
    private volatile zzd listeners;

    @CheckForNull
    private volatile Object value;

    @CheckForNull
    private volatile zzl waiters;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
    abstract class zza {
        /* synthetic */ zza(zze zzeVar) {
        }

        abstract void zza(zzl zzlVar, Thread thread);

        abstract void zzb(zzl zzlVar, @CheckForNull zzl zzlVar2);

        abstract boolean zzc(zzfqw<?> zzfqwVar, @CheckForNull zzl zzlVar, @CheckForNull zzl zzlVar2);

        abstract boolean zzd(zzfqw<?> zzfqwVar, @CheckForNull zzd zzdVar, zzd zzdVar2);

        abstract boolean zze(zzfqw<?> zzfqwVar, @CheckForNull Object obj, Object obj2);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
    final class zzb {

        @CheckForNull
        static final zzb zza;

        @CheckForNull
        static final zzb zzb;
        final boolean zzc;

        @CheckForNull
        final Throwable zzd;

        static {
            if (zzfqw.zzaN) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(false, null);
                zza = new zzb(true, null);
            }
        }

        zzb(boolean z, @CheckForNull Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzfqw.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
    final class zzd {
        static final zzd zza = new zzd();

        @CheckForNull
        zzd next;

        @CheckForNull
        final Runnable zzb;

        @CheckForNull
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
    final class zzf extends zza {
        final AtomicReferenceFieldUpdater<zzl, Thread> zza;
        final AtomicReferenceFieldUpdater<zzl, zzl> zzb;
        final AtomicReferenceFieldUpdater<zzfqw, zzl> zzc;
        final AtomicReferenceFieldUpdater<zzfqw, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzfqw, Object> zze;

        zzf(AtomicReferenceFieldUpdater<zzl, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<zzl, zzl> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<zzfqw, zzl> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<zzfqw, zzd> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<zzfqw, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        final void zza(zzl zzlVar, Thread thread) {
            this.zza.lazySet(zzlVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        final void zzb(zzl zzlVar, @CheckForNull zzl zzlVar2) {
            this.zzb.lazySet(zzlVar, zzlVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        final boolean zzc(zzfqw<?> zzfqwVar, @CheckForNull zzl zzlVar, @CheckForNull zzl zzlVar2) {
            return C0176xc40028dd.m82m(this.zzc, zzfqwVar, zzlVar, zzlVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        final boolean zzd(zzfqw<?> zzfqwVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return C0176xc40028dd.m82m(this.zzd, zzfqwVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        final boolean zze(zzfqw<?> zzfqwVar, @CheckForNull Object obj, Object obj2) {
            return C0176xc40028dd.m82m(this.zze, zzfqwVar, obj, obj2);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
    final class zzg<V> implements Runnable {
        final zzfqw<V> zza;
        final zzfsm<? extends V> zzb;

        zzg(zzfqw<V> zzfqwVar, zzfsm<? extends V> zzfsmVar) {
            this.zza = zzfqwVar;
            this.zzb = zzfsmVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzfqw) this.zza).value != this) {
                return;
            }
            if (zzfqw.zzaR.zze(this.zza, this, zzfqw.zzb(this.zzb))) {
                zzfqw.zzx(this.zza);
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
    final class zzh extends zza {
        private zzh() {
            super(null);
        }

        /* synthetic */ zzh(zze zzeVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        final void zza(zzl zzlVar, Thread thread) {
            zzlVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        final void zzb(zzl zzlVar, @CheckForNull zzl zzlVar2) {
            zzlVar.next = zzlVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        final boolean zzc(zzfqw<?> zzfqwVar, @CheckForNull zzl zzlVar, @CheckForNull zzl zzlVar2) {
            synchronized (zzfqwVar) {
                if (((zzfqw) zzfqwVar).waiters != zzlVar) {
                    return false;
                }
                ((zzfqw) zzfqwVar).waiters = zzlVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        final boolean zzd(zzfqw<?> zzfqwVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            synchronized (zzfqwVar) {
                if (((zzfqw) zzfqwVar).listeners != zzdVar) {
                    return false;
                }
                ((zzfqw) zzfqwVar).listeners = zzdVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        final boolean zze(zzfqw<?> zzfqwVar, @CheckForNull Object obj, Object obj2) {
            synchronized (zzfqwVar) {
                if (((zzfqw) zzfqwVar).value != obj) {
                    return false;
                }
                ((zzfqw) zzfqwVar).value = obj2;
                return true;
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
    interface zzi<V> extends zzfsm<V> {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
    abstract class zzj<V> extends zzfqw<V> implements zzi<V> {
        zzj() {
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
    final class zzk extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzfqw.zzk.1
                        public static final Unsafe zza() throws Exception {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }

                        @Override // java.security.PrivilegedExceptionAction
                        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                            return zza();
                        }
                    });
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzfqw.class.getDeclaredField("waiters"));
                    zzb = unsafe.objectFieldOffset(zzfqw.class.getDeclaredField("listeners"));
                    zzd = unsafe.objectFieldOffset(zzfqw.class.getDeclaredField(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                    zze = unsafe.objectFieldOffset(zzl.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zzl.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (Exception e) {
                    zzfmk.zza(e);
                    throw new RuntimeException(e);
                }
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }

        private zzk() {
            super(null);
        }

        /* synthetic */ zzk(zze zzeVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        final void zza(zzl zzlVar, Thread thread) {
            zza.putObject(zzlVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        final void zzb(zzl zzlVar, @CheckForNull zzl zzlVar2) {
            zza.putObject(zzlVar, zzf, zzlVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        final boolean zzc(zzfqw<?> zzfqwVar, @CheckForNull zzl zzlVar, @CheckForNull zzl zzlVar2) {
            return zzfqw$zzk$$ExternalSyntheticBackportWithForwarding0.m488m(zza, zzfqwVar, zzc, zzlVar, zzlVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        final boolean zzd(zzfqw<?> zzfqwVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzfqw$zzk$$ExternalSyntheticBackportWithForwarding0.m488m(zza, zzfqwVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        final boolean zze(zzfqw<?> zzfqwVar, @CheckForNull Object obj, Object obj2) {
            return zzfqw$zzk$$ExternalSyntheticBackportWithForwarding0.m488m(zza, zzfqwVar, zzd, obj, obj2);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
    final class zzl {
        static final zzl zza = new zzl(false);

        @CheckForNull
        volatile zzl next;

        @CheckForNull
        volatile Thread thread;

        zzl() {
            zzfqw.zzaR.zza(this, Thread.currentThread());
        }

        zzl(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzhVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzaN = z;
        zzaQ = Logger.getLogger(zzfqw.class.getName());
        zze zzeVar = null;
        try {
            zzhVar = new zzk(zzeVar);
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th2 = th3;
                zzhVar = new zzf(AtomicReferenceFieldUpdater.newUpdater(zzl.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzl.class, zzl.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzfqw.class, zzl.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzfqw.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzfqw.class, Object.class, AppMeasurementSdk.ConditionalUserProperty.VALUE));
                th = null;
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                zzhVar = new zzh(zzeVar);
            }
        }
        zzaR = zzhVar;
        if (th != null) {
            Logger logger = zzaQ;
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzaS = new Object();
    }

    protected zzfqw() {
    }

    private final void zzA(StringBuilder sb, @CheckForNull Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    private static void zzB(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = zzaQ;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 57 + String.valueOf(strValueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final V zzC(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzaS) {
            return null;
        }
        return obj;
    }

    private final void zza(zzl zzlVar) {
        zzlVar.thread = null;
        while (true) {
            zzl zzlVar2 = this.waiters;
            if (zzlVar2 != zzl.zza) {
                zzl zzlVar3 = null;
                while (zzlVar2 != null) {
                    zzl zzlVar4 = zzlVar2.next;
                    if (zzlVar2.thread != null) {
                        zzlVar3 = zzlVar2;
                    } else if (zzlVar3 != null) {
                        zzlVar3.next = zzlVar4;
                        if (zzlVar3.thread == null) {
                        }
                    } else if (!zzaR.zzc(this, zzlVar2, zzlVar4)) {
                    }
                    zzlVar2 = zzlVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zzb(zzfsm<?> zzfsmVar) {
        Throwable thZzu;
        if (zzfsmVar instanceof zzi) {
            Object zzbVar = ((zzfqw) zzfsmVar).value;
            if (zzbVar instanceof zzb) {
                zzb zzbVar2 = (zzb) zzbVar;
                if (zzbVar2.zzc) {
                    Throwable th = zzbVar2.zzd;
                    zzbVar = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            zzbVar.getClass();
            return zzbVar;
        }
        if ((zzfsmVar instanceof zzfte) && (thZzu = ((zzfte) zzfsmVar).zzu()) != null) {
            return new zzc(thZzu);
        }
        boolean zIsCancelled = zzfsmVar.isCancelled();
        if ((!zzaN) && zIsCancelled) {
            zzb zzbVar3 = zzb.zzb;
            zzbVar3.getClass();
            return zzbVar3;
        }
        try {
            Object objZzw = zzw(zzfsmVar);
            if (!zIsCancelled) {
                return objZzw == null ? zzaS : objZzw;
            }
            String strValueOf = String.valueOf(zzfsmVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(strValueOf);
            return new zzb(false, new IllegalArgumentException(sb.toString()));
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new zzb(false, e);
            }
            String strValueOf2 = String.valueOf(zzfsmVar);
            String.valueOf(strValueOf2).length();
            return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(strValueOf2)), e));
        } catch (ExecutionException e2) {
            if (!zIsCancelled) {
                return new zzc(e2.getCause());
            }
            String strValueOf3 = String.valueOf(zzfsmVar);
            String.valueOf(strValueOf3).length();
            return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(strValueOf3)), e2));
        } catch (Throwable th2) {
            return new zzc(th2);
        }
    }

    private static <V> V zzw(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void zzx(zzfqw<?> zzfqwVar) {
        zzd zzdVar;
        zzd zzdVar2;
        zzd zzdVar3 = null;
        while (true) {
            zzl zzlVar = ((zzfqw) zzfqwVar).waiters;
            if (zzaR.zzc(zzfqwVar, zzlVar, zzl.zza)) {
                while (zzlVar != null) {
                    Thread thread = zzlVar.thread;
                    if (thread != null) {
                        zzlVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    zzlVar = zzlVar.next;
                }
                zzfqwVar.zzd();
                do {
                    zzdVar = ((zzfqw) zzfqwVar).listeners;
                } while (!zzaR.zzd(zzfqwVar, zzdVar, zzd.zza));
                while (true) {
                    zzdVar2 = zzdVar3;
                    zzdVar3 = zzdVar;
                    if (zzdVar3 == null) {
                        break;
                    }
                    zzdVar = zzdVar3.next;
                    zzdVar3.next = zzdVar2;
                }
                while (zzdVar2 != null) {
                    zzdVar3 = zzdVar2.next;
                    Runnable runnable = zzdVar2.zzb;
                    runnable.getClass();
                    if (runnable instanceof zzg) {
                        zzg zzgVar = (zzg) runnable;
                        zzfqwVar = zzgVar.zza;
                        if (((zzfqw) zzfqwVar).value == zzgVar) {
                            if (zzaR.zze(zzfqwVar, zzgVar, zzb(zzgVar.zzb))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = zzdVar2.zzc;
                        executor.getClass();
                        zzB(runnable, executor);
                    }
                    zzdVar2 = zzdVar3;
                }
                return;
            }
        }
    }

    private final void zzy(StringBuilder sb) {
        String strConcat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzg) {
            sb.append(", setFuture=[");
            zzA(sb, ((zzg) obj).zzb);
            sb.append("]");
        } else {
            try {
                strConcat = zzfmi.zzb(zzc());
            } catch (RuntimeException | StackOverflowError e) {
                String strValueOf = String.valueOf(e.getClass());
                String.valueOf(strValueOf).length();
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(strValueOf));
            }
            if (strConcat != null) {
                sb.append(", info=[");
                sb.append(strConcat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzz(sb);
        }
    }

    private final void zzz(StringBuilder sb) {
        try {
            Object objZzw = zzw(this);
            sb.append("SUCCESS, result=[");
            if (objZzw == null) {
                sb.append("null");
            } else if (objZzw == this) {
                sb.append("this future");
            } else {
                sb.append(objZzw.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objZzw)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        zzb zzbVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof zzg)) {
            return false;
        }
        if (zzaN) {
            zzbVar = new zzb(z, new CancellationException("Future.cancel() was called."));
        } else {
            zzbVar = z ? zzb.zza : zzb.zzb;
            zzbVar.getClass();
        }
        zzfqw<V> zzfqwVar = this;
        boolean z2 = false;
        while (true) {
            if (zzaR.zze(zzfqwVar, obj, zzbVar)) {
                if (z) {
                    zzfqwVar.zzn();
                }
                zzx(zzfqwVar);
                if (obj instanceof zzg) {
                    zzfsm<? extends V> zzfsmVar = ((zzg) obj).zzb;
                    if (zzfsmVar instanceof zzi) {
                        zzfqwVar = (zzfqw) zzfsmVar;
                        obj = zzfqwVar.value;
                        if ((obj == null) | (obj instanceof zzg)) {
                            z2 = true;
                        }
                    } else {
                        zzfsmVar.cancel(z);
                    }
                }
                return true;
            }
            obj = zzfqwVar.value;
            if (!(obj instanceof zzg)) {
                return z2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof zzg))) {
            return (V) zzC(obj2);
        }
        zzl zzlVar = this.waiters;
        if (zzlVar != zzl.zza) {
            zzl zzlVar2 = new zzl();
            do {
                zza zzaVar = zzaR;
                zzaVar.zzb(zzlVar2, zzlVar);
                if (zzaVar.zzc(this, zzlVar, zzlVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzlVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof zzg))));
                    return (V) zzC(obj);
                }
                zzlVar = this.waiters;
            } while (zzlVar != zzl.zza);
        }
        Object obj3 = this.value;
        obj3.getClass();
        return (V) zzC(obj3);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof zzg)) & (obj != null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzz(sb);
        } else {
            zzy(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    protected String zzc() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    protected void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzfsm
    public void zze(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzflx.zzc(runnable, "Runnable was null.");
        zzflx.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzaR.zzd(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != zzd.zza);
        }
        zzB(runnable, executor);
    }

    protected void zzn() {
    }

    protected final boolean zzo() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected boolean zzp(V v) {
        if (v == null) {
            v = (V) zzaS;
        }
        if (!zzaR.zze(this, null, v)) {
            return false;
        }
        zzx(this);
        return true;
    }

    protected boolean zzq(Throwable th) {
        th.getClass();
        if (!zzaR.zze(this, null, new zzc(th))) {
            return false;
        }
        zzx(this);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfte
    @CheckForNull
    protected final Throwable zzu() {
        if (!(this instanceof zzi)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    final void zzv(@CheckForNull Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzo());
        }
    }

    protected final boolean zzr(zzfsm<? extends V> zzfsmVar) {
        zzc zzcVar;
        zzfsmVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (zzfsmVar.isDone()) {
                if (!zzaR.zze(this, null, zzb(zzfsmVar))) {
                    return false;
                }
                zzx(this);
                return true;
            }
            zzg zzgVar = new zzg(this, zzfsmVar);
            if (zzaR.zze(this, null, zzgVar)) {
                try {
                    zzfsmVar.zze(zzgVar, zzfrr.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Throwable unused) {
                        zzcVar = zzc.zza;
                    }
                    zzaR.zze(this, zzgVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzfsmVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof zzg))) {
                return (V) zzC(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzl zzlVar = this.waiters;
                if (zzlVar != zzl.zza) {
                    zzl zzlVar2 = new zzl();
                    while (true) {
                        zza zzaVar = zzaR;
                        zzaVar.zzb(zzlVar2, zzlVar);
                        if (zzaVar.zzc(this, zzlVar, zzlVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (Thread.interrupted()) {
                                    zza(zzlVar2);
                                    throw new InterruptedException();
                                }
                                Object obj2 = this.value;
                                if (!((obj2 != null) & (!(obj2 instanceof zzg)))) {
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    return (V) zzC(obj2);
                                }
                            } while (nanos >= 1000);
                            zza(zzlVar2);
                            break;
                        }
                        zzlVar = this.waiters;
                        if (zzlVar == zzl.zza) {
                        }
                    }
                }
                Object obj3 = this.value;
                obj3.getClass();
                return (V) zzC(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if (!((obj4 != null) & (!(obj4 instanceof zzg)))) {
                    if (!Thread.interrupted()) {
                        nanos = jNanoTime - System.nanoTime();
                    } else {
                        throw new InterruptedException();
                    }
                } else {
                    return (V) zzC(obj4);
                }
            }
            String string = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j);
            sb.append(" ");
            sb.append(lowerCase2);
            String string2 = sb.toString();
            if (nanos + 1000 < 0) {
                String strConcat = string2.concat(" (plus ");
                long j2 = -nanos;
                long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (jConvert > 0) {
                    String strValueOf = String.valueOf(strConcat);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 21 + String.valueOf(lowerCase).length());
                    sb2.append(strValueOf);
                    sb2.append(jConvert);
                    sb2.append(" ");
                    sb2.append(lowerCase);
                    String string3 = sb2.toString();
                    if (z) {
                        string3 = string3.concat(",");
                    }
                    strConcat = String.valueOf(string3).concat(" ");
                }
                if (z) {
                    String strValueOf2 = String.valueOf(strConcat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf2).length() + 33);
                    sb3.append(strValueOf2);
                    sb3.append(nanos2);
                    sb3.append(" nanoseconds ");
                    strConcat = sb3.toString();
                }
                string2 = String.valueOf(strConcat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(string2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb4 = new StringBuilder(String.valueOf(string2).length() + 5 + String.valueOf(string).length());
            sb4.append(string2);
            sb4.append(" for ");
            sb4.append(string);
            throw new TimeoutException(sb4.toString());
        }
        throw new InterruptedException();
    }
}
