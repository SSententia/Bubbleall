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
public final class zzcjx implements zzatz {
    private final zzauo<zzatz> zza;
    private final Context zzb;
    private final zzatz zzc;
    private final zzcjw zzd;
    private final String zze;
    private final int zzf;
    private InputStream zzh;
    private boolean zzi;
    private Uri zzj;
    private volatile zzayn zzk;
    private boolean zzl = false;
    private boolean zzm = false;
    private boolean zzn = false;
    private boolean zzo = false;
    private long zzp = 0;
    private final AtomicLong zzr = new AtomicLong(-1);
    private zzfsm<Long> zzq = null;
    private final boolean zzg = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue();

    public zzcjx(Context context, zzatz zzatzVar, String str, int i, zzauo<zzatz> zzauoVar, zzcjw zzcjwVar) {
        this.zzb = context;
        this.zzc = zzatzVar;
        this.zza = zzauoVar;
        this.zzd = zzcjwVar;
        this.zze = str;
        this.zzf = i;
    }

    private final void zzl(zzaub zzaubVar) {
        zzauo<zzatz> zzauoVar = this.zza;
        if (zzauoVar != null) {
            ((zzcki) zzauoVar).zzj(this, zzaubVar);
        }
    }

    private final boolean zzm() {
        if (!this.zzg) {
            return false;
        }
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzcL)).booleanValue() || this.zzn) {
            return ((Boolean) zzbet.zzc().zzc(zzbjl.zzcM)).booleanValue() && !this.zzo;
        }
        return true;
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
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.zzcjw] */
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
    @Override // com.google.android.gms.internal.ads.zzatz
    public final long zza(zzaub zzaubVar) throws Throwable {
        zzayk zzaykVarZzf;
        Long l;
        boolean z;
        boolean z2;
        long jElapsedRealtime;
        String string = "ms";
        if (this.zzi) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        ?? r2 = 1;
        this.zzi = true;
        this.zzj = zzaubVar.zza;
        if (!this.zzg) {
            zzl(zzaubVar);
        }
        this.zzk = zzayn.zza(zzaubVar.zza);
        ?? sb = -1;
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzcI)).booleanValue()) {
            if (this.zzk != null) {
                this.zzk.zzh = zzaubVar.zzc;
                this.zzk.zzi = zzfmi.zza(this.zze);
                this.zzk.zzj = this.zzf;
                zzaykVarZzf = com.google.android.gms.ads.internal.zzt.zzi().zzf(this.zzk);
            } else {
                zzaykVarZzf = null;
            }
            if (zzaykVarZzf != null && zzaykVarZzf.zza()) {
                this.zzl = zzaykVarZzf.zzd();
                this.zzn = zzaykVarZzf.zzg();
                this.zzo = zzaykVarZzf.zze();
                this.zzp = zzaykVarZzf.zzf();
                this.zzm = true;
                if (!zzm()) {
                    this.zzh = zzaykVarZzf.zzb();
                    if (this.zzg) {
                        zzl(zzaubVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzk != null) {
            this.zzk.zzh = zzaubVar.zzc;
            this.zzk.zzi = zzfmi.zza(this.zze);
            this.zzk.zzj = this.zzf;
            if (this.zzk.zzg) {
                l = (Long) zzbet.zzc().zzc(zzbjl.zzcK);
            } else {
                l = (Long) zzbet.zzc().zzc(zzbjl.zzcJ);
            }
            long jLongValue = l.longValue();
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzw();
            Future<zzayz> futureZza = zzayy.zza(this.zzb, this.zzk);
            try {
                try {
                    zzayz zzayzVar = futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    try {
                        this.zzl = zzayzVar.zzc();
                        this.zzn = zzayzVar.zzd();
                        this.zzo = zzayzVar.zzf();
                        this.zzp = zzayzVar.zze();
                        if (!zzm()) {
                            this.zzh = zzayzVar.zzb();
                            if (this.zzg) {
                                zzl(zzaubVar);
                            }
                            long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - jElapsedRealtime2;
                            this.zzd.zza(true, jElapsedRealtime3);
                            this.zzm = true;
                            StringBuilder sb2 = new StringBuilder(44);
                            sb2.append("Cache connection took ");
                            sb2.append(jElapsedRealtime3);
                            sb2.append("ms");
                            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                            return -1L;
                        }
                        long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - jElapsedRealtime2;
                        this.zzd.zza(true, jElapsedRealtime4);
                        this.zzm = true;
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
                        this.zzd.zza(z2, jElapsedRealtime);
                        this.zzm = z2;
                        sb = new StringBuilder(44);
                        sb.append("Cache connection took ");
                        sb.append(jElapsedRealtime);
                        sb.append("ms");
                        string = sb.toString();
                    } catch (ExecutionException | TimeoutException unused2) {
                        z = true;
                        futureZza.cancel(true);
                        jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - jElapsedRealtime2;
                        this.zzd.zza(z, jElapsedRealtime);
                        this.zzm = z;
                        sb = new StringBuilder(44);
                        sb.append("Cache connection took ");
                        sb.append(jElapsedRealtime);
                        sb.append("ms");
                        string = sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        long jElapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - jElapsedRealtime2;
                        this.zzd.zza(r2, jElapsedRealtime5);
                        this.zzm = r2;
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
        this.zzm = false;
        if (this.zzk != null) {
            zzaubVar = new zzaub(Uri.parse(this.zzk.zza), null, zzaubVar.zzb, zzaubVar.zzc, zzaubVar.zzd, null, 0);
        }
        return this.zzc.zza(zzaubVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final int zzb(byte[] bArr, int i, int i2) throws IOException {
        zzauo<zzatz> zzauoVar;
        if (!this.zzi) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzh;
        int iZzb = inputStream != null ? inputStream.read(bArr, i, i2) : this.zzc.zzb(bArr, i, i2);
        if ((!this.zzg || this.zzh != null) && (zzauoVar = this.zza) != null) {
            ((zzcki) zzauoVar).zzS(this, iZzb);
        }
        return iZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final Uri zzc() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final void zzd() throws IOException {
        if (!this.zzi) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzi = false;
        this.zzj = null;
        InputStream inputStream = this.zzh;
        if (inputStream == null) {
            this.zzc.zzd();
        } else {
            IOUtils.closeQuietly(inputStream);
            this.zzh = null;
        }
    }

    public final boolean zze() {
        return this.zzl;
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        return this.zzn;
    }

    public final boolean zzh() {
        return this.zzo;
    }

    public final long zzi() {
        return this.zzp;
    }

    public final long zzj() {
        if (this.zzk == null) {
            return -1L;
        }
        if (this.zzr.get() != -1) {
            return this.zzr.get();
        }
        synchronized (this) {
            if (this.zzq == null) {
                this.zzq = zzchg.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcjv
                    private final zzcjx zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzk();
                    }
                });
            }
        }
        if (!this.zzq.isDone()) {
            return -1L;
        }
        try {
            this.zzr.compareAndSet(-1L, this.zzq.get().longValue());
            return this.zzr.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1L;
        }
    }

    final /* synthetic */ Long zzk() throws Exception {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzg(this.zzk));
    }
}
