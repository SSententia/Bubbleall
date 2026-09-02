package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzclp extends zzag {
    private final Context zza;
    private final zzaj zzb;
    private final zzclo zzc;
    private final String zzd;
    private final int zze;
    private final boolean zzf;
    private InputStream zzg;
    private boolean zzh;
    private Uri zzi;
    private volatile zzayn zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private long zzo;
    private zzfsm<Long> zzp;
    private final AtomicLong zzq;

    public zzclp(Context context, zzaj zzajVar, String str, int i, zzay zzayVar, zzclo zzcloVar) {
        super(false);
        this.zza = context;
        this.zzb = zzajVar;
        this.zzc = zzcloVar;
        this.zzd = str;
        this.zze = i;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0L;
        this.zzq = new AtomicLong(-1L);
        this.zzp = null;
        this.zzf = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue();
        zza(zzayVar);
    }

    private final boolean zzr() {
        if (!this.zzf) {
            return false;
        }
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzcL)).booleanValue() || this.zzm) {
            return ((Boolean) zzbet.zzc().zzc(zzbjl.zzcM)).booleanValue() && !this.zzn;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzg;
        int iZzg = inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zzg(bArr, i, i2);
        if (!this.zzf || this.zzg != null) {
            zzd(iZzg);
        }
        return iZzg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.zzclo] */
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
    @Override // com.google.android.gms.internal.ads.zzaj
    public final long zzh(zzan zzanVar) throws Throwable {
        zzayk zzaykVarZzf;
        Long l;
        boolean z;
        boolean z2;
        long jElapsedRealtime;
        String string = "ms";
        if (this.zzh) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        ?? r2 = 1;
        this.zzh = true;
        this.zzi = zzanVar.zza;
        if (!this.zzf) {
            zzc(zzanVar);
        }
        this.zzj = zzayn.zza(zzanVar.zza);
        ?? sb = -1;
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzcI)).booleanValue()) {
            if (this.zzj != null) {
                this.zzj.zzh = zzanVar.zzf;
                this.zzj.zzi = zzfmi.zza(this.zzd);
                this.zzj.zzj = this.zze;
                zzaykVarZzf = com.google.android.gms.ads.internal.zzt.zzi().zzf(this.zzj);
            } else {
                zzaykVarZzf = null;
            }
            if (zzaykVarZzf != null && zzaykVarZzf.zza()) {
                this.zzk = zzaykVarZzf.zzd();
                this.zzm = zzaykVarZzf.zzg();
                this.zzn = zzaykVarZzf.zze();
                this.zzo = zzaykVarZzf.zzf();
                this.zzl = true;
                if (!zzr()) {
                    this.zzg = zzaykVarZzf.zzb();
                    if (this.zzf) {
                        zzc(zzanVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzj != null) {
            this.zzj.zzh = zzanVar.zzf;
            this.zzj.zzi = zzfmi.zza(this.zzd);
            this.zzj.zzj = this.zze;
            if (this.zzj.zzg) {
                l = (Long) zzbet.zzc().zzc(zzbjl.zzcK);
            } else {
                l = (Long) zzbet.zzc().zzc(zzbjl.zzcJ);
            }
            long jLongValue = l.longValue();
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzw();
            Future<zzayz> futureZza = zzayy.zza(this.zza, this.zzj);
            try {
                try {
                    zzayz zzayzVar = futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    try {
                        this.zzk = zzayzVar.zzc();
                        this.zzm = zzayzVar.zzd();
                        this.zzn = zzayzVar.zzf();
                        this.zzo = zzayzVar.zze();
                        if (!zzr()) {
                            this.zzg = zzayzVar.zzb();
                            if (this.zzf) {
                                zzc(zzanVar);
                            }
                            long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - jElapsedRealtime2;
                            this.zzc.zza(true, jElapsedRealtime3);
                            this.zzl = true;
                            StringBuilder sb2 = new StringBuilder(44);
                            sb2.append("Cache connection took ");
                            sb2.append(jElapsedRealtime3);
                            sb2.append("ms");
                            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                            return -1L;
                        }
                        long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - jElapsedRealtime2;
                        this.zzc.zza(true, jElapsedRealtime4);
                        this.zzl = true;
                        StringBuilder sb3 = new StringBuilder(44);
                        sb3.append("Cache connection took ");
                        sb3.append(jElapsedRealtime4);
                        sb3.append("ms");
                        string = sb3.toString();
                    } catch (InterruptedException unused) {
                        z2 = true;
                        futureZza.cancel(true);
                        Thread.currentThread().interrupt();
                        jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - jElapsedRealtime2;
                        this.zzc.zza(z2, jElapsedRealtime);
                        this.zzl = z2;
                        sb = new StringBuilder(44);
                        sb.append("Cache connection took ");
                        sb.append(jElapsedRealtime);
                        sb.append("ms");
                        string = sb.toString();
                    } catch (ExecutionException | TimeoutException unused2) {
                        z = true;
                        futureZza.cancel(true);
                        jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - jElapsedRealtime2;
                        this.zzc.zza(z, jElapsedRealtime);
                        this.zzl = z;
                        sb = new StringBuilder(44);
                        sb.append("Cache connection took ");
                        sb.append(jElapsedRealtime);
                        sb.append("ms");
                        string = sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        long jElapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - jElapsedRealtime2;
                        this.zzc.zza(r2, jElapsedRealtime5);
                        this.zzl = r2;
                        StringBuilder sb4 = new StringBuilder(44);
                        sb4.append("Cache connection took ");
                        sb4.append(jElapsedRealtime5);
                        sb4.append(string);
                        com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
                        throw th;
                    }
                } catch (InterruptedException unused3) {
                    z2 = false;
                } catch (ExecutionException | TimeoutException unused4) {
                    z = false;
                } catch (Throwable th2) {
                    th = th2;
                    r2 = 0;
                }
                com.google.android.gms.ads.internal.util.zze.zza(string);
            } catch (Throwable th3) {
                th = th3;
                r2 = sb;
            }
        }
        this.zzl = false;
        if (this.zzj != null) {
            Uri uri = Uri.parse(this.zzj.zza);
            byte[] bArr = zzanVar.zzc;
            long j = zzanVar.zze;
            long j2 = zzanVar.zzf;
            long j3 = zzanVar.zzg;
            String str = zzanVar.zzh;
            zzanVar = new zzan(uri, null, j, j2, j3, null, zzanVar.zzi);
        }
        return this.zzb.zzh(zzanVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zzj() throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzh = false;
        this.zzi = null;
        boolean z = (this.zzf && this.zzg == null) ? false : true;
        InputStream inputStream = this.zzg;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzg = null;
        } else {
            this.zzb.zzj();
        }
        if (z) {
            zze();
        }
    }

    public final boolean zzk() {
        return this.zzk;
    }

    public final boolean zzl() {
        return this.zzl;
    }

    public final boolean zzm() {
        return this.zzm;
    }

    public final boolean zzn() {
        return this.zzn;
    }

    public final long zzo() {
        return this.zzo;
    }

    public final long zzp() {
        if (this.zzj == null) {
            return -1L;
        }
        if (this.zzq.get() != -1) {
            return this.zzq.get();
        }
        synchronized (this) {
            if (this.zzp == null) {
                this.zzp = zzchg.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcln
                    private final zzclp zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzq();
                    }
                });
            }
        }
        if (!this.zzp.isDone()) {
            return -1L;
        }
        try {
            this.zzq.compareAndSet(-1L, this.zzp.get().longValue());
            return this.zzq.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1L;
        }
    }

    final /* synthetic */ Long zzq() throws Exception {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzg(this.zzj));
    }
}
