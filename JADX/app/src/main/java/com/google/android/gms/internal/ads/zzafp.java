package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzafp implements Handler.Callback, zzhd, zzjy, zzagy, zzaeb, zzahq {
    private boolean zzA;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    private zzafo zzH;
    private long zzI;
    private int zzJ;
    private boolean zzK;
    private zzaeg zzL;
    private final zzadz zzM;
    private final zzahv[] zza;
    private final Set<zzahv> zzb;
    private final zzahw[] zzc;
    private final zzjz zzd;
    private final zzka zze;
    private final zzafy zzf;
    private final zzki zzg;
    private final zzalg zzh;
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzaip zzk;
    private final zzain zzl;
    private final long zzm;
    private final zzaec zzn;
    private final ArrayList<zzafl> zzo;
    private final zzaku zzp;
    private final zzafn zzq;
    private final zzags zzr;
    private final zzagz zzs;
    private zzahz zzt;
    private zzahd zzu;
    private zzafm zzv;
    private boolean zzw;
    private boolean zzy;
    private boolean zzz;
    private int zzB = 0;
    private boolean zzC = false;
    private boolean zzx = false;

    public zzafp(zzahv[] zzahvVarArr, zzjz zzjzVar, zzka zzkaVar, zzafy zzafyVar, zzki zzkiVar, int i, boolean z, zzcy zzcyVar, zzahz zzahzVar, zzadz zzadzVar, long j, boolean z2, Looper looper, zzaku zzakuVar, zzafn zzafnVar, byte[] bArr) {
        this.zzq = zzafnVar;
        this.zza = zzahvVarArr;
        this.zzd = zzjzVar;
        this.zze = zzkaVar;
        this.zzf = zzafyVar;
        this.zzg = zzkiVar;
        this.zzt = zzahzVar;
        this.zzM = zzadzVar;
        this.zzp = zzakuVar;
        this.zzm = zzafyVar.zzd();
        zzafyVar.zze();
        zzahd zzahdVarZza = zzahd.zza(zzkaVar);
        this.zzu = zzahdVarZza;
        this.zzv = new zzafm(zzahdVarZza);
        this.zzc = new zzahw[2];
        for (int i2 = 0; i2 < 2; i2++) {
            zzahvVarArr[i2].zzae(i2);
            this.zzc[i2] = zzahvVarArr[i2].zzad();
        }
        this.zzn = new zzaec(this, zzakuVar);
        this.zzo = new ArrayList<>();
        this.zzb = Collections.newSetFromMap(new IdentityHashMap());
        this.zzk = new zzaip();
        this.zzl = new zzain();
        zzjzVar.zzk(this, zzkiVar);
        this.zzK = true;
        Handler handler = new Handler(looper);
        this.zzr = new zzags(zzcyVar, handler);
        this.zzs = new zzagz(this, zzcyVar, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.zzi = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.zzj = looper2;
        this.zzh = zzakuVar.zza(looper2, this);
    }

    private final void zzA() throws zzaeg {
        zzagp zzagpVarZzh = this.zzr.zzh();
        if (zzagpVarZzh == null) {
            return;
        }
        long jZzg = zzagpVarZzh.zzd ? zzagpVarZzh.zza.zzg() : -9223372036854775807L;
        if (jZzg != -9223372036854775807L) {
            zzG(jZzg);
            if (jZzg != this.zzu.zzs) {
                zzahd zzahdVar = this.zzu;
                this.zzu = zzV(zzahdVar.zzb, jZzg, zzahdVar.zzc, jZzg, true, 5);
            }
        } else {
            long jZzf = this.zzn.zzf(zzagpVarZzh != this.zzr.zzi());
            this.zzI = jZzf;
            long jZza = jZzf - zzagpVarZzh.zza();
            long j = this.zzu.zzs;
            if (!this.zzo.isEmpty() && !this.zzu.zzb.zzb()) {
                if (this.zzK) {
                    j--;
                    this.zzK = false;
                }
                zzahd zzahdVar2 = this.zzu;
                int iZzi = zzahdVar2.zza.zzi(zzahdVar2.zzb.zza);
                int iMin = Math.min(this.zzJ, this.zzo.size());
                zzafl zzaflVar = iMin > 0 ? this.zzo.get(iMin - 1) : null;
                while (zzaflVar != null && (iZzi < 0 || (iZzi == 0 && j < 0))) {
                    int i = iMin - 1;
                    zzaflVar = i > 0 ? this.zzo.get(iMin - 2) : null;
                    iMin = i;
                }
                if (iMin < this.zzo.size()) {
                    this.zzo.get(iMin);
                }
                this.zzJ = iMin;
            }
            this.zzu.zzs = jZza;
        }
        this.zzu.zzq = this.zzr.zzg().zze();
        this.zzu.zzr = zzZ();
        zzahd zzahdVar3 = this.zzu;
        if (zzahdVar3.zzl && zzahdVar3.zze == 3 && zzC(zzahdVar3.zza, zzahdVar3.zzb)) {
            zzahd zzahdVar4 = this.zzu;
            if (zzahdVar4.zzn.zzb == 1.0f) {
                float fZzd = this.zzM.zzd(zzB(zzahdVar4.zza, zzahdVar4.zzb.zza, zzahdVar4.zzs), zzZ());
                if (this.zzn.zzA().zzb != fZzd) {
                    this.zzn.zzz(new zzahf(fZzd, this.zzu.zzn.zzc));
                    zzR(this.zzu.zzn, this.zzn.zzA().zzb, false, false);
                }
            }
        }
    }

    private final long zzB(zzaiq zzaiqVar, Object obj, long j) {
        zzaiqVar.zzf(zzaiqVar.zzy(obj, this.zzl).zzc, this.zzk, 0L);
        zzaip zzaipVar = this.zzk;
        if (zzaipVar.zze != -9223372036854775807L && zzaipVar.zzb()) {
            zzaip zzaipVar2 = this.zzk;
            if (zzaipVar2.zzh) {
                return zzadx.zzb(zzamq.zzab(zzaipVar2.zzf) - this.zzk.zze) - j;
            }
        }
        return -9223372036854775807L;
    }

    private final boolean zzC(zzaiq zzaiqVar, zzhf zzhfVar) {
        if (!zzhfVar.zzb() && !zzaiqVar.zzt()) {
            zzaiqVar.zzf(zzaiqVar.zzy(zzhfVar.zza, this.zzl).zzc, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzaip zzaipVar = this.zzk;
                if (zzaipVar.zzh && zzaipVar.zze != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void zzD(long j, long j2) {
        this.zzh.zzh(2);
        this.zzh.zzg(2, j + j2);
    }

    private final long zzE(zzhf zzhfVar, long j, boolean z) throws zzaeg {
        return zzF(zzhfVar, j, this.zzr.zzh() != this.zzr.zzi(), z);
    }

    private final long zzF(zzhf zzhfVar, long j, boolean z, boolean z2) throws zzaeg {
        zzz();
        this.zzz = false;
        if (z2 || this.zzu.zze == 3) {
            zzu(2);
        }
        zzagp zzagpVarZzh = this.zzr.zzh();
        zzagp zzagpVarZzo = zzagpVarZzh;
        while (zzagpVarZzo != null && !zzhfVar.equals(zzagpVarZzo.zzf.zza)) {
            zzagpVarZzo = zzagpVarZzo.zzo();
        }
        if (z || zzagpVarZzh != zzagpVarZzo || (zzagpVarZzo != null && zzagpVarZzo.zza() + j < 0)) {
            zzahv[] zzahvVarArr = this.zza;
            for (int i = 0; i < 2; i++) {
                zzL(zzahvVarArr[i]);
            }
            if (zzagpVarZzo != null) {
                while (this.zzr.zzh() != zzagpVarZzo) {
                    this.zzr.zzk();
                }
                this.zzr.zzl(zzagpVarZzo);
                zzagpVarZzo.zzb(0L);
                zzW();
            }
        }
        if (zzagpVarZzo != null) {
            this.zzr.zzl(zzagpVarZzo);
            if (!zzagpVarZzo.zzd) {
                zzagpVarZzo.zzf = zzagpVarZzo.zzf.zza(j);
            } else if (zzagpVarZzo.zze) {
                j = zzagpVarZzo.zza.zzi(j);
                zzagpVarZzo.zza.zze(j - this.zzm, false);
            }
            zzG(j);
            zzS();
        } else {
            this.zzr.zzm();
            zzG(j);
        }
        zzY(false);
        this.zzh.zzf(2);
        return j;
    }

    private final void zzG(long j) throws zzaeg {
        zzagp zzagpVarZzh = this.zzr.zzh();
        if (zzagpVarZzh != null) {
            j += zzagpVarZzh.zza();
        }
        this.zzI = j;
        this.zzn.zzc(j);
        zzahv[] zzahvVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzahv zzahvVar = zzahvVarArr[i];
            if (zzaf(zzahvVar)) {
                zzahvVar.zzap(this.zzI);
            }
        }
        for (zzagp zzagpVarZzh2 = this.zzr.zzh(); zzagpVarZzh2 != null; zzagpVarZzh2 = zzagpVarZzh2.zzo()) {
            for (zzjg zzjgVar : zzagpVarZzh2.zzq().zzd) {
            }
        }
    }

    private final void zzH(boolean z, boolean z2) {
        zzI(z || !this.zzD, false, true, false);
        this.zzv.zzb(z2 ? 1 : 0);
        this.zzf.zzb();
        zzu(1);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009f A[PHI: r2 r5 r7
  0x009f: PHI (r2v2 com.google.android.gms.internal.ads.zzhf) = (r2v1 com.google.android.gms.internal.ads.zzhf), (r2v6 com.google.android.gms.internal.ads.zzhf) binds: [B:30:0x0074, B:32:0x0099] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r5v3 long) = (r5v2 long), (r5v6 long) binds: [B:30:0x0074, B:32:0x0099] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r7v3 long) = (r7v2 long), (r7v6 long) binds: [B:30:0x0074, B:32:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    private final void zzI(boolean z, boolean z2, boolean z3, boolean z4) {
        zzhf zzhfVar;
        boolean z5;
        this.zzh.zzh(2);
        this.zzL = null;
        this.zzz = false;
        this.zzn.zzb();
        this.zzI = 0L;
        zzahv[] zzahvVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            try {
                zzL(zzahvVarArr[i]);
            } catch (zzaeg | RuntimeException e) {
                zzaln.zzb("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            zzahv[] zzahvVarArr2 = this.zza;
            for (int i2 = 0; i2 < 2; i2++) {
                zzahv zzahvVar = zzahvVarArr2[i2];
                if (this.zzb.remove(zzahvVar)) {
                    try {
                        zzahvVar.zzas();
                    } catch (RuntimeException e2) {
                        zzaln.zzb("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.zzG = 0;
        zzahd zzahdVar = this.zzu;
        zzhf zzhfVar2 = zzahdVar.zzb;
        long jLongValue = zzahdVar.zzs;
        long j = (this.zzu.zzb.zzb() || zzad(this.zzu, this.zzl)) ? this.zzu.zzc : this.zzu.zzs;
        if (z2) {
            this.zzH = null;
            Pair<zzhf, Long> pairZzJ = zzJ(this.zzu.zza);
            zzhfVar2 = (zzhf) pairZzJ.first;
            jLongValue = ((Long) pairZzJ.second).longValue();
            j = -9223372036854775807L;
            if (zzhfVar2.equals(this.zzu.zzb)) {
                zzhfVar = zzhfVar2;
                z5 = false;
            } else {
                z5 = true;
                zzhfVar = zzhfVar2;
            }
        } else {
            zzhfVar = zzhfVar2;
            z5 = false;
        }
        long j2 = jLongValue;
        long j3 = j;
        this.zzr.zzm();
        this.zzA = false;
        zzahd zzahdVar2 = this.zzu;
        zzaiq zzaiqVar = zzahdVar2.zza;
        int i3 = zzahdVar2.zze;
        zzaeg zzaegVar = z4 ? null : zzahdVar2.zzf;
        zzs zzsVar = z5 ? zzs.zza : zzahdVar2.zzh;
        zzka zzkaVar = z5 ? this.zze : this.zzu.zzi;
        List listZzi = z5 ? zzfoj.zzi() : this.zzu.zzj;
        zzahd zzahdVar3 = this.zzu;
        this.zzu = new zzahd(zzaiqVar, zzhfVar, j3, j2, i3, zzaegVar, false, zzsVar, zzkaVar, listZzi, zzhfVar, zzahdVar3.zzl, zzahdVar3.zzm, zzahdVar3.zzn, j2, 0L, j2, this.zzF, false);
        if (z3) {
            this.zzs.zzg();
        }
    }

    private final Pair<zzhf, Long> zzJ(zzaiq zzaiqVar) {
        long j = 0;
        if (zzaiqVar.zzt()) {
            return Pair.create(zzahd.zzb(), 0L);
        }
        Pair<Object, Long> pairZzv = zzaiqVar.zzv(this.zzk, this.zzl, zzaiqVar.zze(this.zzC), -9223372036854775807L);
        zzhf zzhfVarZzp = this.zzr.zzp(zzaiqVar, pairZzv.first, 0L);
        long jLongValue = ((Long) pairZzv.second).longValue();
        if (zzhfVarZzp.zzb()) {
            zzaiqVar.zzy(zzhfVarZzp.zza, this.zzl);
            if (zzhfVarZzp.zzc == this.zzl.zzc(zzhfVarZzp.zzb)) {
                this.zzl.zzi();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(zzhfVarZzp, Long.valueOf(j));
    }

    private final void zzK(zzaiq zzaiqVar, zzaiq zzaiqVar2) {
        if (zzaiqVar.zzt() && zzaiqVar2.zzt()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzo);
            return;
        }
        zzafl zzaflVar = this.zzo.get(size);
        Object obj = zzaflVar.zzb;
        zzahs zzahsVar = zzaflVar.zza;
        zzadx.zzb(-9223372036854775807L);
        zzahs zzahsVar2 = zzaflVar.zza;
        throw null;
    }

    private final void zzL(zzahv zzahvVar) throws zzaeg {
        if (zzaf(zzahvVar)) {
            this.zzn.zze(zzahvVar);
            zzah(zzahvVar);
            zzahvVar.zzar();
            this.zzG--;
        }
    }

    private final boolean zzM() {
        zzagp zzagpVarZzh = this.zzr.zzh();
        long j = zzagpVarZzh.zzf.zze;
        if (!zzagpVarZzh.zzd) {
            return false;
        }
        if (j == -9223372036854775807L || this.zzu.zzs < j) {
            return true;
        }
        return !zzac();
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0346  */
    /* JADX WARN: Code duplicated, block: B:193:0x0349  */
    /* JADX WARN: Code duplicated, block: B:196:0x0354  */
    /* JADX WARN: Code duplicated, block: B:198:0x035c  */
    /* JADX WARN: Code duplicated, block: B:200:0x0366 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:206:0x0379  */
    /* JADX WARN: Code duplicated, block: B:209:0x0385  */
    /* JADX WARN: Code duplicated, block: B:210:0x0388  */
    /* JADX WARN: Code duplicated, block: B:214:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x013e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0159  */
    /* JADX WARN: Code duplicated, block: B:54:0x0164  */
    /* JADX WARN: Code duplicated, block: B:60:0x016f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0178  */
    /* JADX WARN: Code duplicated, block: B:69:0x0188  */
    /* JADX WARN: Code duplicated, block: B:72:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x019a  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:90:0x01be  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.zzain] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.google.android.gms.internal.ads.zzafo] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r15v12, types: [com.google.android.gms.internal.ads.zzafp] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.zzaiq] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v2, types: [long] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5, types: [long] */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.google.android.gms.internal.ads.zzafp] */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.google.android.gms.internal.ads.zzaiq] */
    /* JADX WARN: Type inference failed for: r5v17, types: [long] */
    /* JADX WARN: Type inference failed for: r5v20, types: [long] */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void zzN(zzaiq zzaiqVar, boolean z) throws Throwable {
        zzhf zzhfVar;
        zzags zzagsVar;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int iZze;
        int iZze2;
        boolean z5;
        long jLongValue;
        zzhf zzhfVarZzp;
        boolean z6;
        boolean zEquals;
        boolean z7;
        ?? r13;
        zzhf zzhfVarZzb;
        boolean z8;
        boolean z9;
        long jZzE;
        boolean z10;
        ?? r15;
        int i3;
        int i4;
        int iZze3;
        boolean z11;
        boolean z12;
        boolean z13;
        ?? r9;
        boolean z14;
        ?? r25;
        ?? r26;
        long j;
        Object obj;
        ?? r10;
        int i5;
        boolean z15;
        ?? r27;
        zzafo zzafoVar;
        boolean z16;
        ?? r28;
        long jMax;
        ?? r29;
        zzahd zzahdVar = this.zzu;
        zzafo zzafoVar2 = this.zzH;
        zzags zzagsVar2 = this.zzr;
        int i6 = this.zzB;
        boolean z17 = this.zzC;
        zzaip zzaipVar = this.zzk;
        ?? r14 = this.zzl;
        boolean z18 = true;
        if (zzaiqVar.zzt()) {
            zzhfVarZzb = zzahd.zzb();
            z10 = true;
            r15 = this;
            r13 = -9223372036854775807;
            z8 = false;
            z9 = false;
            r9 = -1;
            jZzE = 0;
        } else {
            zzhf zzhfVar2 = zzahdVar.zzb;
            Object obj2 = zzhfVar2.zza;
            boolean zZzad = zzad(zzahdVar, r14);
            long jLongValue2 = (zzahdVar.zzb.zzb() || zZzad) ? zzahdVar.zzc : zzahdVar.zzs;
            if (zzafoVar2 != null) {
                zzhfVar = zzhfVar2;
                zzagsVar = zzagsVar2;
                i4 = -1;
                Pair<Object, Long> pairZzae = zzae(zzaiqVar, zzafoVar2, true, i6, z17, zzaipVar, r14);
                if (pairZzae == null) {
                    iZze3 = zzaiqVar.zze(z17);
                    jLongValue2 = jLongValue2;
                    z5 = true;
                    z12 = false;
                    z13 = false;
                } else {
                    if (zzafoVar2.zzc == -9223372036854775807L) {
                        iZze3 = zzaiqVar.zzy(pairZzae.first, r14).zzc;
                        jLongValue2 = jLongValue2;
                        z11 = false;
                    } else {
                        obj2 = pairZzae.first;
                        jLongValue2 = ((Long) pairZzae.second).longValue();
                        iZze3 = -1;
                        z11 = true;
                    }
                    z12 = zzahdVar.zze == 4;
                    z13 = z11;
                    z5 = false;
                }
                z2 = z12;
                i2 = iZze3;
                z4 = z13;
            } else {
                zzhfVar = zzhfVar2;
                zzagsVar = zzagsVar2;
                i = -1;
                i = -1;
                i4 = -1;
                if (zzahdVar.zza.zzt()) {
                    iZze = zzaiqVar.zze(z17);
                } else {
                    if (zzaiqVar.zzi(obj2) == -1) {
                        Object objZzm = zzm(zzaipVar, r14, i6, z17, obj2, zzahdVar.zza, zzaiqVar);
                        if (objZzm == null) {
                            iZze2 = zzaiqVar.zze(z17);
                            z5 = true;
                        } else {
                            iZze2 = zzaiqVar.zzy(objZzm, r14).zzc;
                            z5 = false;
                        }
                        i2 = iZze2;
                        jLongValue2 = jLongValue2;
                        z2 = false;
                        z4 = false;
                    } else if (jLongValue2 == -9223372036854775807L) {
                        iZze = zzaiqVar.zzy(obj2, r14).zzc;
                    } else if (zZzad) {
                        zzahdVar.zza.zzy(zzhfVar.zza, r14);
                        if (zzahdVar.zza.zzf(r14.zzc, zzaipVar, 0L).zzn == zzahdVar.zza.zzi(zzhfVar.zza)) {
                            Pair<Object, Long> pairZzv = zzaiqVar.zzv(zzaipVar, r14, zzaiqVar.zzy(obj2, r14).zzc, jLongValue2);
                            obj2 = pairZzv.first;
                            jLongValue2 = ((Long) pairZzv.second).longValue();
                        } else {
                            jLongValue2 = jLongValue2;
                        }
                        i2 = -1;
                        obj2 = obj2;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        i2 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                    if (i2 != i) {
                        Pair<Object, Long> pairZzv2 = zzaiqVar.zzv(zzaipVar, r14, i2, -9223372036854775807L);
                        obj2 = pairZzv2.first;
                        jLongValue = ((Long) pairZzv2.second).longValue();
                        jLongValue2 = -9223372036854775807L;
                    } else {
                        jLongValue = jLongValue2;
                    }
                    zzhfVarZzp = zzagsVar.zzp(zzaiqVar, obj2, jLongValue);
                    if (zzhfVarZzp.zze != i || ((i3 = zzhfVar.zze) != i && zzhfVarZzp.zzb >= i3)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zEquals = zzhfVar.zza.equals(obj2);
                    if (zEquals || zzhfVar.zzb() || zzhfVarZzp.zzb() || !z6) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    zzaiqVar.zzy(obj2, r14);
                    if (zEquals && !zZzad && jLongValue2 == jLongValue2) {
                        if (zzhfVarZzp.zzb()) {
                            r14.zzj(zzhfVarZzp.zzb);
                        }
                        if (zzhfVar.zzb()) {
                            r14.zzj(zzhfVar.zzb);
                        }
                    }
                    if (true == z7) {
                        zzhfVarZzp = zzhfVar;
                    }
                    if (zzhfVarZzp.zzb()) {
                        if (zzhfVarZzp.equals(zzhfVar)) {
                            jLongValue = zzahdVar.zzs;
                        } else {
                            zzaiqVar.zzy(zzhfVarZzp.zza, r14);
                            if (zzhfVarZzp.zzc == r14.zzc(zzhfVarZzp.zzb)) {
                                r14.zzi();
                            }
                            jLongValue = 0;
                        }
                    }
                    r13 = jLongValue2;
                    zzhfVarZzb = zzhfVarZzp;
                    z8 = z2;
                    z9 = z4;
                    jZzE = jLongValue;
                    z10 = true;
                    z18 = z3;
                    r15 = this;
                    r9 = i;
                }
                i2 = iZze;
                z2 = false;
                z3 = false;
                z4 = false;
                if (i2 != i) {
                    Pair<Object, Long> pairZzv3 = zzaiqVar.zzv(zzaipVar, r14, i2, -9223372036854775807L);
                    obj2 = pairZzv3.first;
                    jLongValue = ((Long) pairZzv3.second).longValue();
                    jLongValue2 = -9223372036854775807L;
                } else {
                    jLongValue = jLongValue2;
                }
                zzhfVarZzp = zzagsVar.zzp(zzaiqVar, obj2, jLongValue);
                if (zzhfVarZzp.zze != i) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                zEquals = zzhfVar.zza.equals(obj2);
                if (zEquals) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                zzaiqVar.zzy(obj2, r14);
                if (zEquals) {
                    if (zzhfVarZzp.zzb()) {
                        r14.zzj(zzhfVarZzp.zzb);
                    }
                    if (zzhfVar.zzb()) {
                        r14.zzj(zzhfVar.zzb);
                    }
                }
                if (true == z7) {
                    zzhfVarZzp = zzhfVar;
                }
                if (zzhfVarZzp.zzb()) {
                    if (zzhfVarZzp.equals(zzhfVar)) {
                        jLongValue = zzahdVar.zzs;
                    } else {
                        zzaiqVar.zzy(zzhfVarZzp.zza, r14);
                        if (zzhfVarZzp.zzc == r14.zzc(zzhfVarZzp.zzb)) {
                            r14.zzi();
                        }
                        jLongValue = 0;
                    }
                }
                r13 = jLongValue2;
                zzhfVarZzb = zzhfVarZzp;
                z8 = z2;
                z9 = z4;
                jZzE = jLongValue;
                z10 = true;
                z18 = z3;
                r15 = this;
                r9 = i;
            }
            Object obj3 = obj2;
            z3 = z5;
            obj2 = obj3;
            i = i4;
            if (i2 != i) {
                Pair<Object, Long> pairZzv4 = zzaiqVar.zzv(zzaipVar, r14, i2, -9223372036854775807L);
                obj2 = pairZzv4.first;
                jLongValue = ((Long) pairZzv4.second).longValue();
                jLongValue2 = -9223372036854775807L;
            } else {
                jLongValue = jLongValue2;
            }
            zzhfVarZzp = zzagsVar.zzp(zzaiqVar, obj2, jLongValue);
            if (zzhfVarZzp.zze != i) {
                z6 = true;
            } else {
                z6 = true;
            }
            zEquals = zzhfVar.zza.equals(obj2);
            if (zEquals) {
                z7 = false;
            } else {
                z7 = false;
            }
            zzaiqVar.zzy(obj2, r14);
            if (zEquals) {
                if (zzhfVarZzp.zzb()) {
                    r14.zzj(zzhfVarZzp.zzb);
                }
                if (zzhfVar.zzb()) {
                    r14.zzj(zzhfVar.zzb);
                }
            }
            if (true == z7) {
                zzhfVarZzp = zzhfVar;
            }
            if (zzhfVarZzp.zzb()) {
                if (zzhfVarZzp.equals(zzhfVar)) {
                    jLongValue = zzahdVar.zzs;
                } else {
                    zzaiqVar.zzy(zzhfVarZzp.zza, r14);
                    if (zzhfVarZzp.zzc == r14.zzc(zzhfVarZzp.zzb)) {
                        r14.zzi();
                    }
                    jLongValue = 0;
                }
            }
            r13 = jLongValue2;
            zzhfVarZzb = zzhfVarZzp;
            z8 = z2;
            z9 = z4;
            jZzE = jLongValue;
            z10 = true;
            z18 = z3;
            r15 = this;
            r9 = i;
        }
        boolean z19 = (r15.zzu.zzb.equals(zzhfVarZzb) && jZzE == r15.zzu.zzs) ? false : z10;
        if (z18) {
            try {
                if (r15.zzu.zze != z10) {
                    try {
                        r15.zzu(4);
                    } catch (Throwable th) {
                        th = th;
                        r9 = z10;
                        r26 = r13;
                        r13 = 0;
                        r14 = 0;
                        r25 = r26;
                        zzahd zzahdVar2 = r15.zzu;
                        zzaiq zzaiqVar2 = zzahdVar2.zza;
                        zzhf zzhfVar3 = zzahdVar2.zzb;
                        if (r9 != z9) {
                            j = -9223372036854775807L;
                        } else {
                            j = jZzE;
                        }
                        zzO(zzaiqVar, zzhfVarZzb, zzaiqVar2, zzhfVar3, j);
                        if (z19 || r25 != r15.zzu.zzc) {
                            zzahd zzahdVar3 = r15.zzu;
                            obj = zzahdVar3.zzb.zza;
                            zzaiq zzaiqVar3 = zzahdVar3.zza;
                            if (z19 || !z || zzaiqVar3.zzt() || zzaiqVar3.zzy(obj, r15.zzl).zzf) {
                                r10 = r9;
                                r10 = r13;
                            }
                            r10 = r9;
                            long j2 = r15.zzu.zzd;
                            if (zzaiqVar.zzi(obj) == -1) {
                                i5 = 4;
                            } else {
                                i5 = 3;
                            }
                            r15.zzu = zzV(zzhfVarZzb, jZzE, r25, j2, r10, i5);
                        }
                        zzP();
                        r15.zzK(zzaiqVar, r15.zzu.zza);
                        r15.zzu = r15.zzu.zzd(zzaiqVar);
                        if (!zzaiqVar.zzt()) {
                            r15.zzH = r14;
                        }
                        r15.zzY(r13);
                        throw th;
                    }
                }
                z14 = false;
                try {
                    r15.zzI(false, false, false, z10);
                } catch (Throwable th2) {
                    th = th2;
                    r9 = z10;
                    r25 = r13;
                    r14 = 0;
                    r13 = z14;
                    zzahd zzahdVar4 = r15.zzu;
                    zzaiq zzaiqVar4 = zzahdVar4.zza;
                    zzhf zzhfVar4 = zzahdVar4.zzb;
                    if (r9 != z9) {
                        j = -9223372036854775807L;
                    } else {
                        j = jZzE;
                    }
                    zzO(zzaiqVar, zzhfVarZzb, zzaiqVar4, zzhfVar4, j);
                    if (z19) {
                        zzahd zzahdVar5 = r15.zzu;
                        obj = zzahdVar5.zzb.zza;
                        zzaiq zzaiqVar5 = zzahdVar5.zza;
                        if (z19) {
                            r10 = r9;
                            r10 = r13;
                        } else {
                            r10 = r9;
                            r10 = r13;
                        }
                        r10 = r9;
                        long j3 = r15.zzu.zzd;
                        if (zzaiqVar.zzi(obj) == -1) {
                            i5 = 4;
                        } else {
                            i5 = 3;
                        }
                        r15.zzu = zzV(zzhfVarZzb, jZzE, r25, j3, r10, i5);
                    } else {
                        zzahd zzahdVar6 = r15.zzu;
                        obj = zzahdVar6.zzb.zza;
                        zzaiq zzaiqVar6 = zzahdVar6.zza;
                        if (z19) {
                            r10 = r9;
                            r10 = r13;
                        } else {
                            r10 = r9;
                            r10 = r13;
                        }
                        r10 = r9;
                        long j4 = r15.zzu.zzd;
                        if (zzaiqVar.zzi(obj) == -1) {
                            i5 = 4;
                        } else {
                            i5 = 3;
                        }
                        r15.zzu = zzV(zzhfVarZzb, jZzE, r25, j4, r10, i5);
                    }
                    zzP();
                    r15.zzK(zzaiqVar, r15.zzu.zza);
                    r15.zzu = r15.zzu.zzd(zzaiqVar);
                    if (!zzaiqVar.zzt()) {
                        r15.zzH = r14;
                    }
                    r15.zzY(r13);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z14 = false;
                r9 = z10;
                r25 = r13;
                r14 = 0;
                r13 = z14;
                zzahd zzahdVar7 = r15.zzu;
                zzaiq zzaiqVar7 = zzahdVar7.zza;
                zzhf zzhfVar5 = zzahdVar7.zzb;
                if (r9 != z9) {
                    j = -9223372036854775807L;
                } else {
                    j = jZzE;
                }
                zzO(zzaiqVar, zzhfVarZzb, zzaiqVar7, zzhfVar5, j);
                if (z19) {
                    zzahd zzahdVar8 = r15.zzu;
                    obj = zzahdVar8.zzb.zza;
                    zzaiq zzaiqVar8 = zzahdVar8.zza;
                    if (z19) {
                        r10 = r9;
                        r10 = r13;
                    } else {
                        r10 = r9;
                        r10 = r13;
                    }
                    r10 = r9;
                    long j5 = r15.zzu.zzd;
                    if (zzaiqVar.zzi(obj) == -1) {
                        i5 = 4;
                    } else {
                        i5 = 3;
                    }
                    r15.zzu = zzV(zzhfVarZzb, jZzE, r25, j5, r10, i5);
                } else {
                    zzahd zzahdVar9 = r15.zzu;
                    obj = zzahdVar9.zzb.zza;
                    zzaiq zzaiqVar9 = zzahdVar9.zza;
                    if (z19) {
                        r10 = r9;
                        r10 = r13;
                    } else {
                        r10 = r9;
                        r10 = r13;
                    }
                    r10 = r9;
                    long j6 = r15.zzu.zzd;
                    if (zzaiqVar.zzi(obj) == -1) {
                        i5 = 4;
                    } else {
                        i5 = 3;
                    }
                    r15.zzu = zzV(zzhfVarZzb, jZzE, r25, j6, r10, i5);
                }
                zzP();
                r15.zzK(zzaiqVar, r15.zzu.zza);
                r15.zzu = r15.zzu.zzd(zzaiqVar);
                if (!zzaiqVar.zzt()) {
                    r15.zzH = r14;
                }
                r15.zzY(r13);
                throw th;
            }
        } else {
            z14 = false;
        }
        try {
            if (z19) {
                z15 = z10;
                r27 = r13;
                zzafoVar = null;
                z16 = z14;
                if (!zzaiqVar.zzt()) {
                    for (zzagp zzagpVarZzh = r15.zzr.zzh(); zzagpVarZzh != null; zzagpVarZzh = zzagpVarZzh.zzo()) {
                        if (zzagpVarZzh.zzf.zza.equals(zzhfVarZzb)) {
                            r28 = r27;
                            zzagpVarZzh.zzf = r15.zzr.zzo(zzaiqVar, zzagpVarZzh.zzf);
                            zzagpVarZzh.zzr();
                        } else {
                            r28 = r27;
                        }
                    }
                    r28 = r27;
                    jZzE = r15.zzE(zzhfVarZzb, jZzE, z8);
                    r28 = r27;
                }
            } else {
                zzags zzagsVar3 = r15.zzr;
                long j7 = r15.zzI;
                zzagp zzagpVarZzi = zzagsVar3.zzi();
                if (zzagpVarZzi == null) {
                    r29 = r13;
                    jMax = 0;
                } else {
                    long jZza = zzagpVarZzi.zza();
                    if (zzagpVarZzi.zzd) {
                        jMax = jZza;
                        int i7 = 0;
                        ?? r16 = r13;
                        while (true) {
                            try {
                                zzahv[] zzahvVarArr = r15.zza;
                                r29 = r16;
                                if (i7 >= 2) {
                                    break;
                                }
                                try {
                                    if (zzaf(zzahvVarArr[i7]) && r15.zza[i7].zzaj() == zzagpVarZzi.zzc[i7]) {
                                        long jZzal = r15.zza[i7].zzal();
                                        if (jZzal == Long.MIN_VALUE) {
                                            jMax = Long.MIN_VALUE;
                                            break;
                                        }
                                        jMax = Math.max(jZzal, jMax);
                                    }
                                    i7++;
                                    r16 = r29;
                                } catch (Throwable th4) {
                                    th = th4;
                                    r9 = 1;
                                    r26 = r29;
                                    r13 = 0;
                                    r14 = 0;
                                    r25 = r26;
                                    zzahd zzahdVar10 = r15.zzu;
                                    zzaiq zzaiqVar10 = zzahdVar10.zza;
                                    zzhf zzhfVar6 = zzahdVar10.zzb;
                                    if (r9 != z9) {
                                        j = -9223372036854775807L;
                                    } else {
                                        j = jZzE;
                                    }
                                    zzO(zzaiqVar, zzhfVarZzb, zzaiqVar10, zzhfVar6, j);
                                    if (z19) {
                                        zzahd zzahdVar11 = r15.zzu;
                                        obj = zzahdVar11.zzb.zza;
                                        zzaiq zzaiqVar11 = zzahdVar11.zza;
                                        if (z19) {
                                            r10 = r9;
                                            r10 = r13;
                                        } else {
                                            r10 = r9;
                                            r10 = r13;
                                        }
                                        r10 = r9;
                                        long j8 = r15.zzu.zzd;
                                        if (zzaiqVar.zzi(obj) == -1) {
                                            i5 = 4;
                                        } else {
                                            i5 = 3;
                                        }
                                        r15.zzu = zzV(zzhfVarZzb, jZzE, r25, j8, r10, i5);
                                    } else {
                                        zzahd zzahdVar12 = r15.zzu;
                                        obj = zzahdVar12.zzb.zza;
                                        zzaiq zzaiqVar12 = zzahdVar12.zza;
                                        if (z19) {
                                            r10 = r9;
                                            r10 = r13;
                                        } else {
                                            r10 = r9;
                                            r10 = r13;
                                        }
                                        r10 = r9;
                                        long j9 = r15.zzu.zzd;
                                        if (zzaiqVar.zzi(obj) == -1) {
                                            i5 = 4;
                                        } else {
                                            i5 = 3;
                                        }
                                        r15.zzu = zzV(zzhfVarZzb, jZzE, r25, j9, r10, i5);
                                    }
                                    zzP();
                                    r15.zzK(zzaiqVar, r15.zzu.zza);
                                    r15.zzu = r15.zzu.zzd(zzaiqVar);
                                    if (!zzaiqVar.zzt()) {
                                        r15.zzH = r14;
                                    }
                                    r15.zzY(r13);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                r29 = r16;
                            }
                        }
                    } else {
                        r29 = r13;
                        jMax = jZza;
                    }
                }
                z16 = false;
                z15 = true;
                zzafoVar = null;
                r28 = r29;
                if (!zzagsVar3.zzn(zzaiqVar, j7, jMax)) {
                    r15.zzx(false);
                    r28 = r29;
                }
            }
            r28 = r27;
            zzahd zzahdVar13 = r15.zzu;
            zzO(zzaiqVar, zzhfVarZzb, zzahdVar13.zza, zzahdVar13.zzb, z15 != z9 ? -9223372036854775807L : jZzE);
            if (z19 || r28 != r15.zzu.zzc) {
                zzahd zzahdVar14 = r15.zzu;
                Object obj4 = zzahdVar14.zzb.zza;
                zzaiq zzaiqVar13 = zzahdVar14.zza;
                if (!z19 || !z || zzaiqVar13.zzt() || zzaiqVar13.zzy(obj4, r15.zzl).zzf) {
                    z15 = z16;
                }
                r15.zzu = zzV(zzhfVarZzb, jZzE, r28, r15.zzu.zzd, z15, zzaiqVar.zzi(obj4) == -1 ? 4 : 3);
            }
            zzP();
            r15.zzK(zzaiqVar, r15.zzu.zza);
            r15.zzu = r15.zzu.zzd(zzaiqVar);
            if (!zzaiqVar.zzt()) {
                r15.zzH = zzafoVar;
            }
            r15.zzY(z16);
        } catch (Throwable th6) {
            th = th6;
            zzahd zzahdVar15 = r15.zzu;
            zzaiq zzaiqVar14 = zzahdVar15.zza;
            zzhf zzhfVar7 = zzahdVar15.zzb;
            if (r9 != z9) {
                j = -9223372036854775807L;
            } else {
                j = jZzE;
            }
            zzO(zzaiqVar, zzhfVarZzb, zzaiqVar14, zzhfVar7, j);
            if (z19) {
                zzahd zzahdVar16 = r15.zzu;
                obj = zzahdVar16.zzb.zza;
                zzaiq zzaiqVar15 = zzahdVar16.zza;
                if (z19) {
                    r10 = r9;
                    r10 = r13;
                } else {
                    r10 = r9;
                    r10 = r13;
                }
                r10 = r9;
                long j10 = r15.zzu.zzd;
                if (zzaiqVar.zzi(obj) == -1) {
                    i5 = 4;
                } else {
                    i5 = 3;
                }
                r15.zzu = zzV(zzhfVarZzb, jZzE, r25, j10, r10, i5);
            } else {
                zzahd zzahdVar17 = r15.zzu;
                obj = zzahdVar17.zzb.zza;
                zzaiq zzaiqVar16 = zzahdVar17.zza;
                if (z19) {
                    r10 = r9;
                    r10 = r13;
                } else {
                    r10 = r9;
                    r10 = r13;
                }
                r10 = r9;
                long j11 = r15.zzu.zzd;
                if (zzaiqVar.zzi(obj) == -1) {
                    i5 = 4;
                } else {
                    i5 = 3;
                }
                r15.zzu = zzV(zzhfVarZzb, jZzE, r25, j11, r10, i5);
            }
            zzP();
            r15.zzK(zzaiqVar, r15.zzu.zza);
            r15.zzu = r15.zzu.zzd(zzaiqVar);
            if (!zzaiqVar.zzt()) {
                r15.zzH = r14;
            }
            r15.zzY(r13);
            throw th;
        }
    }

    private final void zzO(zzaiq zzaiqVar, zzhf zzhfVar, zzaiq zzaiqVar2, zzhf zzhfVar2, long j) {
        if (zzaiqVar.zzt() || !zzC(zzaiqVar, zzhfVar)) {
            float f = this.zzn.zzA().zzb;
            zzahf zzahfVar = this.zzu.zzn;
            if (f != zzahfVar.zzb) {
                this.zzn.zzz(zzahfVar);
                return;
            }
            return;
        }
        zzaiqVar.zzf(zzaiqVar.zzy(zzhfVar.zza, this.zzl).zzc, this.zzk, 0L);
        zzadz zzadzVar = this.zzM;
        zzagh zzaghVar = this.zzk.zzj;
        int i = zzamq.zza;
        zzadzVar.zza(zzaghVar);
        if (j != -9223372036854775807L) {
            this.zzM.zzb(zzB(zzaiqVar, zzhfVar.zza, j));
            return;
        }
        if (zzamq.zzc(!zzaiqVar2.zzt() ? zzaiqVar2.zzf(zzaiqVar2.zzy(zzhfVar2.zza, this.zzl).zzc, this.zzk, 0L).zzb : null, this.zzk.zzb)) {
            return;
        }
        this.zzM.zzb(-9223372036854775807L);
    }

    private final void zzP() {
        zzagp zzagpVarZzh = this.zzr.zzh();
        boolean z = false;
        if (zzagpVarZzh != null && zzagpVarZzh.zzf.zzh && this.zzx) {
            z = true;
        }
        this.zzy = z;
    }

    private final void zzQ(zzahf zzahfVar, boolean z) throws zzaeg {
        zzR(zzahfVar, zzahfVar.zzb, true, z);
    }

    private final void zzR(zzahf zzahfVar, float f, boolean z, boolean z2) throws zzaeg {
        int i;
        zzafp zzafpVar = this;
        if (z) {
            if (z2) {
                zzafpVar.zzv.zzb(1);
            }
            zzahd zzahdVar = zzafpVar.zzu;
            zzafpVar = this;
            zzafpVar.zzu = new zzahd(zzahdVar.zza, zzahdVar.zzb, zzahdVar.zzc, zzahdVar.zzd, zzahdVar.zze, zzahdVar.zzf, zzahdVar.zzg, zzahdVar.zzh, zzahdVar.zzi, zzahdVar.zzj, zzahdVar.zzk, zzahdVar.zzl, zzahdVar.zzm, zzahfVar, zzahdVar.zzq, zzahdVar.zzr, zzahdVar.zzs, zzahdVar.zzo, zzahdVar.zzp);
        }
        float f2 = zzahfVar.zzb;
        zzagp zzagpVarZzh = zzafpVar.zzr.zzh();
        while (true) {
            i = 0;
            if (zzagpVarZzh == null) {
                break;
            }
            zzjg[] zzjgVarArr = zzagpVarZzh.zzq().zzd;
            int length = zzjgVarArr.length;
            while (i < length) {
                zzjg zzjgVar = zzjgVarArr[i];
                i++;
            }
            zzagpVarZzh = zzagpVarZzh.zzo();
        }
        zzahv[] zzahvVarArr = zzafpVar.zza;
        while (i < 2) {
            zzahv zzahvVar = zzahvVarArr[i];
            if (zzahvVar != null) {
                zzahvVar.zzM(f, zzahfVar.zzb);
            }
            i++;
        }
    }

    private final void zzS() {
        long jZza;
        long jZza2;
        boolean zZzf;
        if (zzT()) {
            zzagp zzagpVarZzg = this.zzr.zzg();
            long jZzaa = zzaa(zzagpVarZzg.zzf());
            if (zzagpVarZzg == this.zzr.zzh()) {
                jZza = this.zzI;
                jZza2 = zzagpVarZzg.zza();
            } else {
                jZza = this.zzI - zzagpVarZzg.zza();
                jZza2 = zzagpVarZzg.zzf.zzb;
            }
            zZzf = this.zzf.zzf(jZza - jZza2, jZzaa, this.zzn.zzA().zzb);
        } else {
            zZzf = false;
        }
        this.zzA = zZzf;
        if (zZzf) {
            this.zzr.zzg().zzi(this.zzI);
        }
        zzU();
    }

    private final boolean zzT() {
        zzagp zzagpVarZzg = this.zzr.zzg();
        return (zzagpVarZzg == null || zzagpVarZzg.zzf() == Long.MIN_VALUE) ? false : true;
    }

    private final void zzU() {
        zzagp zzagpVarZzg = this.zzr.zzg();
        boolean z = this.zzA || (zzagpVarZzg != null && zzagpVarZzg.zza.zzm());
        zzahd zzahdVar = this.zzu;
        if (z != zzahdVar.zzg) {
            this.zzu = new zzahd(zzahdVar.zza, zzahdVar.zzb, zzahdVar.zzc, zzahdVar.zzd, zzahdVar.zze, zzahdVar.zzf, z, zzahdVar.zzh, zzahdVar.zzi, zzahdVar.zzj, zzahdVar.zzk, zzahdVar.zzl, zzahdVar.zzm, zzahdVar.zzn, zzahdVar.zzq, zzahdVar.zzr, zzahdVar.zzs, zzahdVar.zzo, zzahdVar.zzp);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    private final zzahd zzV(zzhf zzhfVar, long j, long j2, long j3, boolean z, int i) {
        List<zzaiv> listZzi;
        zzs zzsVar;
        zzka zzkaVar;
        this.zzK = (!this.zzK && j == this.zzu.zzs && zzhfVar.equals(this.zzu.zzb)) ? false : true;
        zzP();
        zzahd zzahdVar = this.zzu;
        zzs zzsVarZzp = zzahdVar.zzh;
        zzka zzkaVarZzq = zzahdVar.zzi;
        List<zzaiv> list = zzahdVar.zzj;
        if (!this.zzs.zzc()) {
            if (zzhfVar.equals(this.zzu.zzb)) {
                listZzi = list;
            } else {
                zzsVar = zzs.zza;
                zzkaVar = this.zze;
                listZzi = zzfoj.zzi();
            }
            if (z) {
                this.zzv.zzd(i);
            }
            return this.zzu.zzc(zzhfVar, j, j2, j3, zzZ(), zzsVar, zzkaVar, listZzi);
        }
        zzagp zzagpVarZzh = this.zzr.zzh();
        zzsVarZzp = zzagpVarZzh == null ? zzs.zza : zzagpVarZzh.zzp();
        zzkaVarZzq = zzagpVarZzh == null ? this.zze : zzagpVarZzh.zzq();
        zzjg[] zzjgVarArr = zzkaVarZzq.zzd;
        zzfog zzfogVar = new zzfog();
        boolean z2 = false;
        for (zzjg zzjgVar : zzjgVarArr) {
            if (zzjgVar != null) {
                zzaiv zzaivVar = zzjgVar.zzd(0).zzj;
                if (zzaivVar == null) {
                    zzfogVar.zze(new zzaiv(new zzaiu[0]));
                } else {
                    zzfogVar.zze(zzaivVar);
                    z2 = true;
                }
            }
        }
        zzfoj zzfojVarZzf = z2 ? zzfogVar.zzf() : zzfoj.zzi();
        if (zzagpVarZzh != null) {
            zzagq zzagqVar = zzagpVarZzh.zzf;
            if (zzagqVar.zzc != j2) {
                zzagpVarZzh.zzf = zzagqVar.zzb(j2);
            }
        }
        listZzi = zzfojVarZzf;
        zzsVar = zzsVarZzp;
        zzkaVar = zzkaVarZzq;
        if (z) {
            this.zzv.zzd(i);
        }
        return this.zzu.zzc(zzhfVar, j, j2, j3, zzZ(), zzsVar, zzkaVar, listZzi);
    }

    private final void zzW() throws zzaeg {
        zzX(new boolean[2]);
    }

    private final void zzX(boolean[] zArr) throws zzaeg {
        zzagp zzagpVarZzi = this.zzr.zzi();
        zzka zzkaVarZzq = zzagpVarZzi.zzq();
        for (int i = 0; i < 2; i++) {
            if (!zzkaVarZzq.zza(i) && this.zzb.remove(this.zza[i])) {
                this.zza[i].zzas();
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzkaVarZzq.zza(i2)) {
                boolean z = zArr[i2];
                zzahv zzahvVar = this.zza[i2];
                if (!zzaf(zzahvVar)) {
                    zzagp zzagpVarZzi2 = this.zzr.zzi();
                    boolean z2 = zzagpVarZzi2 == this.zzr.zzh();
                    zzka zzkaVarZzq2 = zzagpVarZzi2.zzq();
                    zzahx zzahxVar = zzkaVarZzq2.zzb[i2];
                    zzafv[] zzafvVarArrZzaj = zzaj(zzkaVarZzq2.zzd[i2]);
                    boolean z3 = zzac() && this.zzu.zze == 3;
                    boolean z4 = !z && z3;
                    this.zzG++;
                    this.zzb.add(zzahvVar);
                    zzahvVar.zzag(zzahxVar, zzafvVarArrZzaj, zzagpVarZzi2.zzc[i2], this.zzI, z4, z2, zzagpVarZzi2.zzc(), zzagpVarZzi2.zza());
                    zzahvVar.zzE(11, new zzafh(this));
                    this.zzn.zzd(zzahvVar);
                    if (z3) {
                        zzahvVar.zzah();
                    }
                }
            }
        }
        zzagpVarZzi.zzg = true;
    }

    private final void zzY(boolean z) {
        zzagp zzagpVarZzg = this.zzr.zzg();
        zzhf zzhfVar = zzagpVarZzg == null ? this.zzu.zzb : zzagpVarZzg.zzf.zza;
        boolean z2 = !this.zzu.zzk.equals(zzhfVar);
        if (z2) {
            this.zzu = this.zzu.zzg(zzhfVar);
        }
        zzahd zzahdVar = this.zzu;
        zzahdVar.zzq = zzagpVarZzg == null ? zzahdVar.zzs : zzagpVarZzg.zze();
        this.zzu.zzr = zzZ();
        if ((z2 || z) && zzagpVarZzg != null && zzagpVarZzg.zzd) {
            zzab(zzagpVarZzg.zzp(), zzagpVarZzg.zzq());
        }
    }

    private final long zzZ() {
        return zzaa(this.zzu.zzq);
    }

    private final long zzaa(long j) {
        zzagp zzagpVarZzg = this.zzr.zzg();
        if (zzagpVarZzg == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzI - zzagpVarZzg.zza()));
    }

    private final void zzab(zzs zzsVar, zzka zzkaVar) {
        this.zzf.zzi(this.zza, zzsVar, zzkaVar.zzd);
    }

    private final boolean zzac() {
        zzahd zzahdVar = this.zzu;
        return zzahdVar.zzl && zzahdVar.zzm == 0;
    }

    private static boolean zzad(zzahd zzahdVar, zzain zzainVar) {
        zzhf zzhfVar = zzahdVar.zzb;
        zzaiq zzaiqVar = zzahdVar.zza;
        return zzaiqVar.zzt() || zzaiqVar.zzy(zzhfVar.zza, zzainVar).zzf;
    }

    private static Pair<Object, Long> zzae(zzaiq zzaiqVar, zzafo zzafoVar, boolean z, int i, boolean z2, zzaip zzaipVar, zzain zzainVar) {
        zzaiq zzaiqVar2 = zzafoVar.zza;
        if (zzaiqVar.zzt()) {
            return null;
        }
        zzaiq zzaiqVar3 = true == zzaiqVar2.zzt() ? zzaiqVar : zzaiqVar2;
        try {
            Pair<Object, Long> pairZzv = zzaiqVar3.zzv(zzaipVar, zzainVar, zzafoVar.zzb, zzafoVar.zzc);
            if (zzaiqVar.equals(zzaiqVar3)) {
                return pairZzv;
            }
            if (zzaiqVar.zzi(pairZzv.first) != -1) {
                return (zzaiqVar3.zzy(pairZzv.first, zzainVar).zzf && zzaiqVar3.zzf(zzainVar.zzc, zzaipVar, 0L).zzn == zzaiqVar3.zzi(pairZzv.first)) ? zzaiqVar.zzv(zzaipVar, zzainVar, zzaiqVar.zzy(pairZzv.first, zzainVar).zzc, zzafoVar.zzc) : pairZzv;
            }
            Object objZzm = zzm(zzaipVar, zzainVar, i, z2, pairZzv.first, zzaiqVar3, zzaiqVar);
            if (objZzm != null) {
                return zzaiqVar.zzv(zzaipVar, zzainVar, zzaiqVar.zzy(objZzm, zzainVar).zzc, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private static boolean zzaf(zzahv zzahvVar) {
        return zzahvVar.zzaf() != 0;
    }

    private static final void zzag(zzahs zzahsVar) throws zzaeg {
        zzahsVar.zzh();
        try {
            zzahsVar.zza().zzE(zzahsVar.zzc(), zzahsVar.zze());
        } finally {
            zzahsVar.zzi(true);
        }
    }

    private static final void zzah(zzahv zzahvVar) throws zzaeg {
        if (zzahvVar.zzaf() == 2) {
            zzahvVar.zzaq();
        }
    }

    private static final void zzai(zzahv zzahvVar, long j) {
        zzahvVar.zzam();
        if (zzahvVar instanceof zzaks) {
            throw null;
        }
    }

    private static zzafv[] zzaj(zzjg zzjgVar) {
        int iZzc = zzjgVar != null ? zzjgVar.zzc() : 0;
        zzafv[] zzafvVarArr = new zzafv[iZzc];
        for (int i = 0; i < iZzc; i++) {
            zzafvVarArr[i] = zzjgVar.zzd(i);
        }
        return zzafvVarArr;
    }

    static /* synthetic */ boolean zzd(zzafp zzafpVar, boolean z) {
        zzafpVar.zzE = true;
        return true;
    }

    static Object zzm(zzaip zzaipVar, zzain zzainVar, int i, boolean z, Object obj, zzaiq zzaiqVar, zzaiq zzaiqVar2) {
        int iZzi = zzaiqVar.zzi(obj);
        int iZzg = zzaiqVar.zzg();
        int iZzu = iZzi;
        int iZzi2 = -1;
        for (int i2 = 0; i2 < iZzg && iZzi2 == -1; i2++) {
            iZzu = zzaiqVar.zzu(iZzu, zzainVar, zzaipVar, i, z);
            if (iZzu == -1) {
                iZzi2 = -1;
                break;
            }
            iZzi2 = zzaiqVar2.zzi(zzaiqVar.zzj(iZzu));
        }
        if (iZzi2 == -1) {
            return null;
        }
        return zzaiqVar2.zzj(iZzi2);
    }

    static final /* synthetic */ void zzr(zzahs zzahsVar) {
        try {
            zzag(zzahsVar);
        } catch (zzaeg e) {
            zzaln.zzb("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final void zzs(IOException iOException, int i) {
        zzaeg zzaegVarZza = zzaeg.zza(iOException, i);
        zzagp zzagpVarZzh = this.zzr.zzh();
        if (zzagpVarZzh != null) {
            zzaegVarZza = zzaegVarZza.zzd(zzagpVarZzh.zzf.zza);
        }
        zzaln.zzb("ExoPlayerImplInternal", "Playback error", zzaegVarZza);
        zzH(false, false);
        this.zzu = this.zzu.zzf(zzaegVarZza);
    }

    private final synchronized void zzt(zzfmj<Boolean> zzfmjVar, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + 500;
        boolean z = false;
        for (long jElapsedRealtime2 = 500; !zzfmjVar.zza().booleanValue() && jElapsedRealtime2 > 0; jElapsedRealtime2 = jElapsedRealtime - SystemClock.elapsedRealtime()) {
            try {
                wait(jElapsedRealtime2);
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final void zzu(int i) {
        zzahd zzahdVar = this.zzu;
        if (zzahdVar.zze != i) {
            this.zzu = zzahdVar.zze(i);
        }
    }

    private final void zzv() {
        this.zzv.zzc(this.zzu);
        if (this.zzv.zzg) {
            this.zzq.zza(this.zzv);
            this.zzv = new zzafm(this.zzu);
        }
    }

    private final void zzw(boolean z, int i, boolean z2, int i2) throws zzaeg {
        this.zzv.zzb(z2 ? 1 : 0);
        this.zzv.zze(i2);
        this.zzu = this.zzu.zzh(z, i);
        this.zzz = false;
        for (zzagp zzagpVarZzh = this.zzr.zzh(); zzagpVarZzh != null; zzagpVarZzh = zzagpVarZzh.zzo()) {
            for (zzjg zzjgVar : zzagpVarZzh.zzq().zzd) {
            }
        }
        if (!zzac()) {
            zzz();
            zzA();
            return;
        }
        int i3 = this.zzu.zze;
        if (i3 == 3) {
            zzy();
            this.zzh.zzf(2);
        } else if (i3 == 2) {
            this.zzh.zzf(2);
        }
    }

    private final void zzx(boolean z) throws zzaeg {
        zzhf zzhfVar = this.zzr.zzh().zzf.zza;
        long jZzF = zzF(zzhfVar, this.zzu.zzs, true, false);
        if (jZzF != this.zzu.zzs) {
            zzahd zzahdVar = this.zzu;
            this.zzu = zzV(zzhfVar, jZzF, zzahdVar.zzc, zzahdVar.zzd, z, 5);
        }
    }

    private final void zzy() throws zzaeg {
        this.zzz = false;
        this.zzn.zza();
        zzahv[] zzahvVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzahv zzahvVar = zzahvVarArr[i];
            if (zzaf(zzahvVar)) {
                zzahvVar.zzah();
            }
        }
    }

    private final void zzz() throws zzaeg {
        this.zzn.zzb();
        zzahv[] zzahvVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzahv zzahvVar = zzahvVarArr[i];
            if (zzaf(zzahvVar)) {
                zzah(zzahvVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0452 A[Catch: all -> 0x04f0, TryCatch #0 {all -> 0x04f0, blocks: (B:181:0x0448, B:183:0x0452, B:185:0x0457, B:187:0x045e, B:188:0x0461, B:190:0x0468, B:192:0x0472, B:194:0x047a, B:198:0x0482, B:200:0x048c, B:202:0x049c, B:205:0x04a5, B:211:0x04b7, B:215:0x04c1), top: B:572:0x0448 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0455 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x0457 A[Catch: all -> 0x04f0, TryCatch #0 {all -> 0x04f0, blocks: (B:181:0x0448, B:183:0x0452, B:185:0x0457, B:187:0x045e, B:188:0x0461, B:190:0x0468, B:192:0x0472, B:194:0x047a, B:198:0x0482, B:200:0x048c, B:202:0x049c, B:205:0x04a5, B:211:0x04b7, B:215:0x04c1), top: B:572:0x0448 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x045e A[Catch: all -> 0x04f0, TryCatch #0 {all -> 0x04f0, blocks: (B:181:0x0448, B:183:0x0452, B:185:0x0457, B:187:0x045e, B:188:0x0461, B:190:0x0468, B:192:0x0472, B:194:0x047a, B:198:0x0482, B:200:0x048c, B:202:0x049c, B:205:0x04a5, B:211:0x04b7, B:215:0x04c1), top: B:572:0x0448 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x0468 A[Catch: all -> 0x04f0, TryCatch #0 {all -> 0x04f0, blocks: (B:181:0x0448, B:183:0x0452, B:185:0x0457, B:187:0x045e, B:188:0x0461, B:190:0x0468, B:192:0x0472, B:194:0x047a, B:198:0x0482, B:200:0x048c, B:202:0x049c, B:205:0x04a5, B:211:0x04b7, B:215:0x04c1), top: B:572:0x0448 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0472 A[Catch: all -> 0x04f0, TryCatch #0 {all -> 0x04f0, blocks: (B:181:0x0448, B:183:0x0452, B:185:0x0457, B:187:0x045e, B:188:0x0461, B:190:0x0468, B:192:0x0472, B:194:0x047a, B:198:0x0482, B:200:0x048c, B:202:0x049c, B:205:0x04a5, B:211:0x04b7, B:215:0x04c1), top: B:572:0x0448 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x048b  */
    /* JADX WARN: Code duplicated, block: B:210:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:213:0x04be  */
    /* JADX WARN: Code duplicated, block: B:214:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:218:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:219:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:417:0x0858 A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:419:0x085f A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:421:0x0863 A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:423:0x0869  */
    /* JADX WARN: Code duplicated, block: B:424:0x086c  */
    /* JADX WARN: Code duplicated, block: B:425:0x086e  */
    /* JADX WARN: Code duplicated, block: B:426:0x0870 A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:428:0x0874 A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:430:0x0886 A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:436:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:442:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:450:0x08e0 A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:451:0x08e4 A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:453:0x08eb A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:455:0x08ef A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:457:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:458:0x08f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:459:0x08f8 A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:461:0x0906 A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:463:0x090e A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:465:0x0918 A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, LOOP:13: B:464:0x0916->B:465:0x0918, LOOP_END, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:463:0x090e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.zzay, com.google.android.gms.internal.ads.zzki] */
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
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        boolean z;
        zzagp zzagpVarZzi;
        boolean z2;
        boolean z3;
        zzahd zzahdVar;
        zzagp zzagpVarZzh;
        int i;
        zzagp zzagpVarZzg;
        boolean z4;
        boolean z5;
        int i2;
        boolean z6;
        boolean z7;
        zzagp zzagpVarZzh2;
        zzagp zzagpVarZzo;
        zzagq zzagqVarZzf;
        long j;
        boolean z8;
        long j2;
        zzhf zzhfVar;
        long j3;
        Throwable th;
        boolean z9;
        long j4;
        long jZzj;
        boolean z10;
        long jZzE;
        boolean z11;
        zzagp zzagpVarZzh3;
        zzahd zzahdVar2;
        int i3;
        zzahd zzahdVarZzV;
        int i4;
        try {
            char c = 3;
            switch (message.what) {
                case 0:
                    this.zzv.zzb(1);
                    zzI(false, false, false, true);
                    this.zzf.zza();
                    zzu(true != this.zzu.zza.zzt() ? 2 : 4);
                    this.zzs.zze(this.zzg);
                    this.zzh.zzf(2);
                    z = true;
                    zzv();
                    return z;
                case 1:
                    zzw(message.arg1 != 0, message.arg2, true, 1);
                    z = true;
                    zzv();
                    return z;
                case 2:
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    if (!this.zzu.zza.zzt() && this.zzs.zzc()) {
                        this.zzr.zzd(this.zzI);
                        if (this.zzr.zze() && (zzagqVarZzf = this.zzr.zzf(this.zzI, this.zzu)) != null) {
                            zzagp zzagpVarZzr = this.zzr.zzr(this.zzc, this.zzd, this.zzf.zzh(), this.zzs, zzagqVarZzf, this.zze);
                            zzagpVarZzr.zza.zzb(this, zzagqVarZzf.zzb);
                            if (this.zzr.zzh() == zzagpVarZzr) {
                                zzG(zzagpVarZzr.zzc());
                            }
                            zzY(false);
                        }
                        if (this.zzA) {
                            this.zzA = zzT();
                            zzU();
                        } else {
                            zzS();
                        }
                        zzagp zzagpVarZzi2 = this.zzr.zzi();
                        if (zzagpVarZzi2 != null) {
                            if (zzagpVarZzi2.zzo() != null && !this.zzy) {
                                zzagp zzagpVarZzi3 = this.zzr.zzi();
                                if (zzagpVarZzi3.zzd) {
                                    int i5 = 0;
                                    while (true) {
                                        zzahv[] zzahvVarArr = this.zza;
                                        if (i5 < 2) {
                                            zzahv zzahvVar = zzahvVarArr[i5];
                                            zziu zziuVar = zzagpVarZzi3.zzc[i5];
                                            if (zzahvVar.zzaj() == zziuVar) {
                                                if (zziuVar == null || zzahvVar.zzak()) {
                                                    i5++;
                                                } else {
                                                    zzagpVarZzi3.zzo();
                                                    boolean z12 = zzagpVarZzi3.zzf.zzf;
                                                }
                                            }
                                        } else if (zzagpVarZzi2.zzo().zzd || this.zzI >= zzagpVarZzi2.zzo().zzc()) {
                                            zzka zzkaVarZzq = zzagpVarZzi2.zzq();
                                            zzagp zzagpVarZzj = this.zzr.zzj();
                                            zzka zzkaVarZzq2 = zzagpVarZzj.zzq();
                                            if (!zzagpVarZzj.zzd || zzagpVarZzj.zza.zzg() == -9223372036854775807L) {
                                                for (int i6 = 0; i6 < 2; i6++) {
                                                    boolean zZza = zzkaVarZzq.zza(i6);
                                                    boolean zZza2 = zzkaVarZzq2.zza(i6);
                                                    if (zZza && !this.zza[i6].zzan()) {
                                                        this.zzc[i6].zzac();
                                                        zzahx zzahxVar = zzkaVarZzq.zzb[i6];
                                                        zzahx zzahxVar2 = zzkaVarZzq2.zzb[i6];
                                                        if (!zZza2 || !zzahxVar2.equals(zzahxVar)) {
                                                            zzai(this.zza[i6], zzagpVarZzj.zzc());
                                                        }
                                                    }
                                                }
                                            } else {
                                                long jZzc = zzagpVarZzj.zzc();
                                                zzahv[] zzahvVarArr2 = this.zza;
                                                for (int i7 = 0; i7 < 2; i7++) {
                                                    zzahv zzahvVar2 = zzahvVarArr2[i7];
                                                    if (zzahvVar2.zzaj() != null) {
                                                        zzai(zzahvVar2, jZzc);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (zzagpVarZzi2.zzf.zzi || this.zzy) {
                                int i8 = 0;
                                while (true) {
                                    zzahv[] zzahvVarArr3 = this.zza;
                                    if (i8 < 2) {
                                        zzahv zzahvVar3 = zzahvVarArr3[i8];
                                        zziu zziuVar2 = zzagpVarZzi2.zzc[i8];
                                        if (zziuVar2 != null && zzahvVar3.zzaj() == zziuVar2 && zzahvVar3.zzak()) {
                                            long j5 = zzagpVarZzi2.zzf.zze;
                                            zzai(zzahvVar3, (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? -9223372036854775807L : zzagpVarZzi2.zza() + zzagpVarZzi2.zzf.zze);
                                        }
                                        i8++;
                                    }
                                }
                            }
                        }
                        zzagp zzagpVarZzi4 = this.zzr.zzi();
                        if (zzagpVarZzi4 != null && this.zzr.zzh() != zzagpVarZzi4 && !zzagpVarZzi4.zzg) {
                            zzagp zzagpVarZzi5 = this.zzr.zzi();
                            zzka zzkaVarZzq3 = zzagpVarZzi5.zzq();
                            int i9 = 0;
                            boolean z13 = false;
                            while (true) {
                                zzahv[] zzahvVarArr4 = this.zza;
                                if (i9 < 2) {
                                    zzahv zzahvVar4 = zzahvVarArr4[i9];
                                    if (zzaf(zzahvVar4)) {
                                        zziu zziuVarZzaj = zzahvVar4.zzaj();
                                        zziu zziuVar3 = zzagpVarZzi5.zzc[i9];
                                        if (!zzkaVarZzq3.zza(i9) || zziuVarZzaj != zziuVar3) {
                                            if (!zzahvVar4.zzan()) {
                                                zzahvVar4.zzai(zzaj(zzkaVarZzq3.zzd[i9]), zzagpVarZzi5.zzc[i9], zzagpVarZzi5.zzc(), zzagpVarZzi5.zza());
                                            } else if (zzahvVar4.zzw()) {
                                                zzL(zzahvVar4);
                                            } else {
                                                z13 = true;
                                            }
                                        }
                                    }
                                    i9++;
                                } else if (!z13) {
                                    zzW();
                                }
                            }
                        }
                        boolean z14 = false;
                        while (zzac() && !this.zzy && (zzagpVarZzh2 = this.zzr.zzh()) != null && (zzagpVarZzo = zzagpVarZzh2.zzo()) != null && this.zzI >= zzagpVarZzo.zzc() && zzagpVarZzo.zzg) {
                            if (z14) {
                                zzv();
                            }
                            zzagp zzagpVarZzh4 = this.zzr.zzh();
                            zzagp zzagpVarZzk = this.zzr.zzk();
                            zzagq zzagqVar = zzagpVarZzk.zzf;
                            zzhf zzhfVar2 = zzagqVar.zza;
                            long j6 = zzagqVar.zzb;
                            zzahd zzahdVarZzV2 = zzV(zzhfVar2, j6, zzagqVar.zzc, j6, true, 0);
                            this.zzu = zzahdVarZzV2;
                            zzaiq zzaiqVar = zzahdVarZzV2.zza;
                            zzO(zzaiqVar, zzagpVarZzk.zzf.zza, zzaiqVar, zzagpVarZzh4.zzf.zza, -9223372036854775807L);
                            zzP();
                            zzA();
                            c = c;
                            jUptimeMillis = jUptimeMillis;
                            z14 = true;
                        }
                    }
                    long j7 = jUptimeMillis;
                    int i10 = this.zzu.zze;
                    if (i10 == 1 || i10 == 4) {
                        this.zzh.zzh(2);
                    } else {
                        zzagp zzagpVarZzh5 = this.zzr.zzh();
                        if (zzagpVarZzh5 == null) {
                            zzD(j7, 10L);
                        } else {
                            zzamo.zza("doSomeWork");
                            zzA();
                            if (zzagpVarZzh5.zzd) {
                                long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                                zzagpVarZzh5.zza.zze(this.zzu.zzs - this.zzm, false);
                                z2 = true;
                                z3 = true;
                                int i11 = 0;
                                while (true) {
                                    zzahv[] zzahvVarArr5 = this.zza;
                                    if (i11 < 2) {
                                        zzahv zzahvVar5 = zzahvVarArr5[i11];
                                        if (zzaf(zzahvVar5)) {
                                            zzahvVar5.zzO(this.zzI, jElapsedRealtime);
                                            z3 = z3 && zzahvVar5.zzw();
                                            zziu zziuVar4 = zzagpVarZzh5.zzc[i11];
                                            zziu zziuVarZzaj2 = zzahvVar5.zzaj();
                                            boolean z15 = zziuVar4 != zziuVarZzaj2 || (zziuVar4 == zziuVarZzaj2 && zzahvVar5.zzak()) || zzahvVar5.zzx() || zzahvVar5.zzw();
                                            z2 = z2 && z15;
                                            if (!z15) {
                                                zzahvVar5.zzao();
                                            }
                                        }
                                        i11++;
                                    }
                                }
                            } else {
                                zzagpVarZzh5.zza.zzc();
                                z2 = true;
                                z3 = true;
                            }
                            long j8 = zzagpVarZzh5.zzf.zze;
                            if (z3 && zzagpVarZzh5.zzd && (j8 == -9223372036854775807L || j8 <= this.zzu.zzs)) {
                                if (this.zzy) {
                                    this.zzy = false;
                                    zzw(false, this.zzu.zzm, false, 5);
                                }
                                if (zzagpVarZzh5.zzf.zzi) {
                                    zzu(4);
                                    zzz();
                                } else {
                                    zzahdVar = this.zzu;
                                    if (zzahdVar.zze != 2) {
                                        if (this.zzu.zze == 3) {
                                            if (this.zzG == 0) {
                                                if (!zzM()) {
                                                    this.zzz = zzac();
                                                    zzu(2);
                                                    if (this.zzz) {
                                                        for (zzagpVarZzh = this.zzr.zzh(); zzagpVarZzh != null; zzagpVarZzh = zzagpVarZzh.zzo()) {
                                                            for (zzjg zzjgVar : zzagpVarZzh.zzq().zzd) {
                                                            }
                                                        }
                                                        this.zzM.zzc();
                                                    }
                                                    zzz();
                                                }
                                            } else if (!z2) {
                                                this.zzz = zzac();
                                                zzu(2);
                                                if (this.zzz) {
                                                    while (zzagpVarZzh != null) {
                                                        while (i < r7) {
                                                        }
                                                    }
                                                    this.zzM.zzc();
                                                }
                                                zzz();
                                            }
                                        }
                                    } else if (this.zzG == 0) {
                                        if (z2) {
                                            if (zzahdVar.zzg) {
                                                long jZze = zzC(zzahdVar.zza, this.zzr.zzh().zzf.zza) ? this.zzM.zze() : -9223372036854775807L;
                                                zzagpVarZzg = this.zzr.zzg();
                                                if (zzagpVarZzg.zzd()) {
                                                    z4 = false;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (zzagpVarZzg.zzf.zza.zzb()) {
                                                    z5 = false;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (!z4) {
                                                }
                                            }
                                            zzu(3);
                                            this.zzL = null;
                                            if (zzac()) {
                                                zzy();
                                            }
                                        }
                                        if (this.zzu.zze == 3) {
                                            if (this.zzG == 0) {
                                                if (!zzM()) {
                                                    this.zzz = zzac();
                                                    zzu(2);
                                                    if (this.zzz) {
                                                        while (zzagpVarZzh != null) {
                                                            while (i < r7) {
                                                            }
                                                        }
                                                        this.zzM.zzc();
                                                    }
                                                    zzz();
                                                }
                                            } else if (!z2) {
                                                this.zzz = zzac();
                                                zzu(2);
                                                if (this.zzz) {
                                                    while (zzagpVarZzh != null) {
                                                        while (i < r7) {
                                                        }
                                                    }
                                                    this.zzM.zzc();
                                                }
                                                zzz();
                                            }
                                        }
                                    } else if (zzM()) {
                                        zzu(3);
                                        this.zzL = null;
                                        if (zzac()) {
                                            zzy();
                                        }
                                    } else if (this.zzu.zze == 3) {
                                        if (this.zzG == 0) {
                                            if (!zzM()) {
                                                this.zzz = zzac();
                                                zzu(2);
                                                if (this.zzz) {
                                                    while (zzagpVarZzh != null) {
                                                        while (i < r7) {
                                                        }
                                                    }
                                                    this.zzM.zzc();
                                                }
                                                zzz();
                                            }
                                        } else if (!z2) {
                                            this.zzz = zzac();
                                            zzu(2);
                                            if (this.zzz) {
                                                while (zzagpVarZzh != null) {
                                                    while (i < r7) {
                                                    }
                                                }
                                                this.zzM.zzc();
                                            }
                                            zzz();
                                        }
                                    }
                                }
                            } else {
                                zzahdVar = this.zzu;
                                if (zzahdVar.zze != 2) {
                                    if (this.zzu.zze == 3) {
                                        if (this.zzG == 0) {
                                            if (!zzM()) {
                                                this.zzz = zzac();
                                                zzu(2);
                                                if (this.zzz) {
                                                    while (zzagpVarZzh != null) {
                                                        while (i < r7) {
                                                        }
                                                    }
                                                    this.zzM.zzc();
                                                }
                                                zzz();
                                            }
                                        } else if (!z2) {
                                            this.zzz = zzac();
                                            zzu(2);
                                            if (this.zzz) {
                                                while (zzagpVarZzh != null) {
                                                    while (i < r7) {
                                                    }
                                                }
                                                this.zzM.zzc();
                                            }
                                            zzz();
                                        }
                                    }
                                } else if (this.zzG == 0) {
                                    if (z2) {
                                        if (zzahdVar.zzg) {
                                            long jZze2 = zzC(zzahdVar.zza, this.zzr.zzh().zzf.zza) ? this.zzM.zze() : -9223372036854775807L;
                                            zzagpVarZzg = this.zzr.zzg();
                                            if (zzagpVarZzg.zzd() || !zzagpVarZzg.zzf.zzi) {
                                                z4 = false;
                                            } else {
                                                z4 = true;
                                            }
                                            if (zzagpVarZzg.zzf.zza.zzb() || zzagpVarZzg.zzd) {
                                                z5 = false;
                                            } else {
                                                z5 = true;
                                            }
                                            if (!z4 || z5 || this.zzf.zzg(zzZ(), this.zzn.zzA().zzb, this.zzz, jZze2)) {
                                            }
                                        }
                                        zzu(3);
                                        this.zzL = null;
                                        if (zzac()) {
                                            zzy();
                                        }
                                    }
                                    if (this.zzu.zze == 3) {
                                        if (this.zzG == 0) {
                                            if (!zzM()) {
                                                this.zzz = zzac();
                                                zzu(2);
                                                if (this.zzz) {
                                                    while (zzagpVarZzh != null) {
                                                        while (i < r7) {
                                                        }
                                                    }
                                                    this.zzM.zzc();
                                                }
                                                zzz();
                                            }
                                        } else if (!z2) {
                                            this.zzz = zzac();
                                            zzu(2);
                                            if (this.zzz) {
                                                while (zzagpVarZzh != null) {
                                                    while (i < r7) {
                                                    }
                                                }
                                                this.zzM.zzc();
                                            }
                                            zzz();
                                        }
                                    }
                                } else if (zzM()) {
                                    zzu(3);
                                    this.zzL = null;
                                    if (zzac()) {
                                        zzy();
                                    }
                                } else if (this.zzu.zze == 3) {
                                    if (this.zzG == 0) {
                                        if (!zzM()) {
                                            this.zzz = zzac();
                                            zzu(2);
                                            if (this.zzz) {
                                                while (zzagpVarZzh != null) {
                                                    while (i < r7) {
                                                    }
                                                }
                                                this.zzM.zzc();
                                            }
                                            zzz();
                                        }
                                    } else if (!z2) {
                                        this.zzz = zzac();
                                        zzu(2);
                                        if (this.zzz) {
                                            while (zzagpVarZzh != null) {
                                                while (i < r7) {
                                                }
                                            }
                                            this.zzM.zzc();
                                        }
                                        zzz();
                                    }
                                }
                            }
                            int i12 = 2;
                            if (this.zzu.zze == 2) {
                                int i13 = 0;
                                while (true) {
                                    zzahv[] zzahvVarArr6 = this.zza;
                                    if (i13 < i12) {
                                        if (zzaf(zzahvVarArr6[i13]) && this.zza[i13].zzaj() == zzagpVarZzh5.zzc[i13]) {
                                            this.zza[i13].zzao();
                                        }
                                        i13++;
                                        i12 = 2;
                                    } else {
                                        zzahd zzahdVar3 = this.zzu;
                                        if (!zzahdVar3.zzg && zzahdVar3.zzr < 500000 && zzT()) {
                                            throw new IllegalStateException("Playback stuck buffering and not loading");
                                        }
                                    }
                                }
                            }
                            boolean z16 = this.zzF;
                            zzahd zzahdVar4 = this.zzu;
                            if (z16 != zzahdVar4.zzo) {
                                this.zzu = zzahdVar4.zzi(z16);
                            }
                            if ((zzac() && this.zzu.zze == 3) || (i2 = this.zzu.zze) == 2) {
                                if (this.zzF && this.zzE) {
                                    z7 = false;
                                } else {
                                    zzD(j7, 10L);
                                    z7 = true;
                                }
                                z6 = !z7;
                            } else {
                                if (this.zzG == 0 || i2 == 4) {
                                    this.zzh.zzh(2);
                                } else {
                                    zzD(j7, 1000L);
                                }
                                z6 = false;
                            }
                            zzahd zzahdVar5 = this.zzu;
                            if (zzahdVar5.zzp != z6) {
                                this.zzu = new zzahd(zzahdVar5.zza, zzahdVar5.zzb, zzahdVar5.zzc, zzahdVar5.zzd, zzahdVar5.zze, zzahdVar5.zzf, zzahdVar5.zzg, zzahdVar5.zzh, zzahdVar5.zzi, zzahdVar5.zzj, zzahdVar5.zzk, zzahdVar5.zzl, zzahdVar5.zzm, zzahdVar5.zzn, zzahdVar5.zzq, zzahdVar5.zzr, zzahdVar5.zzs, zzahdVar5.zzo, z6);
                            }
                            this.zzE = false;
                            zzamo.zzb();
                        }
                    }
                    z = true;
                    zzv();
                    return z;
                case 3:
                    zzafo zzafoVar = (zzafo) message.obj;
                    this.zzv.zzb(1);
                    Pair<Object, Long> pairZzae = zzae(this.zzu.zza, zzafoVar, true, this.zzB, this.zzC, this.zzk, this.zzl);
                    try {
                        if (pairZzae != null) {
                            Object obj = pairZzae.first;
                            long jLongValue = ((Long) pairZzae.second).longValue();
                            j = zzafoVar.zzc == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                            zzhf zzhfVarZzp = this.zzr.zzp(this.zzu.zza, obj, jLongValue);
                            if (zzhfVarZzp.zzb()) {
                                this.zzu.zza.zzy(zzhfVarZzp.zza, this.zzl);
                                if (this.zzl.zzc(zzhfVarZzp.zzb) == zzhfVarZzp.zzc) {
                                    this.zzl.zzi();
                                }
                                zzhfVar = zzhfVarZzp;
                                z8 = true;
                                j3 = 0;
                            } else {
                                long j9 = j;
                                z8 = zzafoVar.zzc == -9223372036854775807L;
                                j = j9;
                                j2 = jLongValue;
                                zzhfVar = zzhfVarZzp;
                            }
                            if (this.zzu.zza.zzt()) {
                                if (pairZzae == null) {
                                    if (this.zzu.zze != 1) {
                                        zzu(4);
                                    }
                                    zzI(false, true, false, true);
                                } else {
                                    if (zzhfVar.equals(this.zzu.zzb)) {
                                        zzagpVarZzh3 = this.zzr.zzh();
                                        if (zzagpVarZzh3 == null && zzagpVarZzh3.zzd && j3 != 0) {
                                            jZzj = zzagpVarZzh3.zza.zzj(j3, this.zzt);
                                        } else {
                                            jZzj = j3;
                                        }
                                        if (zzadx.zza(jZzj) != zzadx.zza(this.zzu.zzs) && ((i3 = (zzahdVar2 = this.zzu).zze) == 2 || i3 == 3)) {
                                            long j10 = zzahdVar2.zzs;
                                            zzahdVarZzV = zzV(zzhfVar, j10, j, j10, z8, 2);
                                        }
                                    } else {
                                        jZzj = j3;
                                    }
                                    if (this.zzu.zze == 4) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    jZzE = zzE(zzhfVar, jZzj, z10);
                                    if (j3 != jZzE) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    z8 |= z11;
                                    try {
                                        zzahd zzahdVar6 = this.zzu;
                                        zzaiq zzaiqVar2 = zzahdVar6.zza;
                                        zzO(zzaiqVar2, zzhfVar, zzaiqVar2, zzahdVar6.zzb, j);
                                        zzahdVarZzV = zzV(zzhfVar, jZzE, j, jZzE, z8, 2);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z9 = z8;
                                        j4 = jZzE;
                                        this.zzu = zzV(zzhfVar, j4, j, j4, z9, 2);
                                        throw th;
                                    }
                                }
                                this.zzu = zzahdVarZzV;
                                z = true;
                                zzv();
                                return z;
                            }
                            this.zzH = zzafoVar;
                            jZzE = j3;
                            zzahdVarZzV = zzV(zzhfVar, jZzE, j, jZzE, z8, 2);
                            this.zzu = zzahdVarZzV;
                            z = true;
                            zzv();
                            return z;
                        }
                        Pair<zzhf, Long> pairZzJ = zzJ(this.zzu.zza);
                        zzhf zzhfVar3 = (zzhf) pairZzJ.first;
                        long jLongValue2 = ((Long) pairZzJ.second).longValue();
                        z8 = !this.zzu.zza.zzt();
                        j = -9223372036854775807L;
                        j2 = jLongValue2;
                        zzhfVar = zzhfVar3;
                        if (this.zzu.zza.zzt()) {
                            if (pairZzae == null) {
                                if (this.zzu.zze != 1) {
                                    zzu(4);
                                }
                                zzI(false, true, false, true);
                            } else {
                                if (zzhfVar.equals(this.zzu.zzb)) {
                                    zzagpVarZzh3 = this.zzr.zzh();
                                    if (zzagpVarZzh3 == null) {
                                        jZzj = j3;
                                    } else {
                                        jZzj = j3;
                                    }
                                    if (zzadx.zza(jZzj) != zzadx.zza(this.zzu.zzs)) {
                                    }
                                } else {
                                    jZzj = j3;
                                }
                                if (this.zzu.zze == 4) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                jZzE = zzE(zzhfVar, jZzj, z10);
                                if (j3 != jZzE) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                z8 |= z11;
                                zzahd zzahdVar7 = this.zzu;
                                zzaiq zzaiqVar3 = zzahdVar7.zza;
                                zzO(zzaiqVar3, zzhfVar, zzaiqVar3, zzahdVar7.zzb, j);
                                zzahdVarZzV = zzV(zzhfVar, jZzE, j, jZzE, z8, 2);
                            }
                            this.zzu = zzahdVarZzV;
                            z = true;
                            zzv();
                            return z;
                        }
                        this.zzH = zzafoVar;
                        jZzE = j3;
                        zzahdVarZzV = zzV(zzhfVar, jZzE, j, jZzE, z8, 2);
                        this.zzu = zzahdVarZzV;
                        z = true;
                        zzv();
                        return z;
                    } catch (Throwable th3) {
                        th = th3;
                        z9 = z8;
                        j4 = j3;
                    }
                    j3 = j2;
                    break;
                case 4:
                    this.zzn.zzz((zzahf) message.obj);
                    zzQ(this.zzn.zzA(), true);
                    z = true;
                    zzv();
                    return z;
                case 5:
                    this.zzt = (zzahz) message.obj;
                    z = true;
                    zzv();
                    return z;
                case 6:
                    zzH(false, true);
                    z = true;
                    zzv();
                    return z;
                case 7:
                    zzI(true, false, true, false);
                    this.zzf.zzc();
                    zzu(1);
                    this.zzi.quit();
                    synchronized (this) {
                        this.zzw = true;
                        notifyAll();
                        break;
                    }
                    return true;
                case 8:
                    if (this.zzr.zzc((zzhe) message.obj)) {
                        zzagp zzagpVarZzg2 = this.zzr.zzg();
                        zzagpVarZzg2.zzg(this.zzn.zzA().zzb, this.zzu.zza);
                        zzab(zzagpVarZzg2.zzp(), zzagpVarZzg2.zzq());
                        if (zzagpVarZzg2 == this.zzr.zzh()) {
                            zzG(zzagpVarZzg2.zzf.zzb);
                            zzW();
                            zzahd zzahdVar8 = this.zzu;
                            zzhf zzhfVar4 = zzahdVar8.zzb;
                            long j11 = zzagpVarZzg2.zzf.zzb;
                            this.zzu = zzV(zzhfVar4, j11, zzahdVar8.zzc, j11, false, 5);
                        }
                        zzS();
                    }
                    z = true;
                    zzv();
                    return z;
                case 9:
                    if (this.zzr.zzc((zzhe) message.obj)) {
                        this.zzr.zzd(this.zzI);
                        zzS();
                    }
                    z = true;
                    zzv();
                    return z;
                case 10:
                    float f = this.zzn.zzA().zzb;
                    zzagp zzagpVarZzh6 = this.zzr.zzh();
                    zzagp zzagpVarZzi6 = this.zzr.zzi();
                    boolean z17 = true;
                    while (true) {
                        if (zzagpVarZzh6 == null || !zzagpVarZzh6.zzd) {
                            z = true;
                            zzv();
                            return z;
                        }
                        zzka zzkaVarZzj = zzagpVarZzh6.zzj(f, this.zzu.zza);
                        zzka zzkaVarZzq4 = zzagpVarZzh6.zzq();
                        if (zzkaVarZzq4 != null && zzkaVarZzq4.zzd.length == zzkaVarZzj.zzd.length) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= zzkaVarZzj.zzd.length) {
                                    z17 &= zzagpVarZzh6 != zzagpVarZzi6;
                                    zzagpVarZzh6 = zzagpVarZzh6.zzo();
                                } else if (zzkaVarZzj.zzb(zzkaVarZzq4, i14)) {
                                    i14++;
                                }
                            }
                        }
                        if (z17) {
                            zzagp zzagpVarZzh7 = this.zzr.zzh();
                            boolean[] zArr = new boolean[2];
                            long jZzl = zzagpVarZzh7.zzl(zzkaVarZzj, this.zzu.zzs, this.zzr.zzl(zzagpVarZzh7), zArr);
                            zzahd zzahdVar9 = this.zzu;
                            boolean z18 = (zzahdVar9.zze == 4 || jZzl == zzahdVar9.zzs) ? false : true;
                            zzahd zzahdVar10 = this.zzu;
                            i4 = 2;
                            zzagp zzagpVar = zzagpVarZzh7;
                            this.zzu = zzV(zzahdVar10.zzb, jZzl, zzahdVar10.zzc, zzahdVar10.zzd, z18, 5);
                            if (z18) {
                                zzG(jZzl);
                            }
                            boolean[] zArr2 = new boolean[2];
                            int i15 = 0;
                            while (true) {
                                zzahv[] zzahvVarArr7 = this.zza;
                                if (i15 < 2) {
                                    zzahv zzahvVar6 = zzahvVarArr7[i15];
                                    boolean zZzaf = zzaf(zzahvVar6);
                                    zArr2[i15] = zZzaf;
                                    zzagp zzagpVar2 = zzagpVar;
                                    zziu zziuVar5 = zzagpVar2.zzc[i15];
                                    if (zZzaf) {
                                        if (zziuVar5 != zzahvVar6.zzaj()) {
                                            zzL(zzahvVar6);
                                        } else if (zArr[i15]) {
                                            zzahvVar6.zzap(this.zzI);
                                        }
                                    }
                                    i15++;
                                    zzagpVar = zzagpVar2;
                                } else {
                                    zzX(zArr2);
                                }
                            }
                        } else {
                            i4 = 2;
                            this.zzr.zzl(zzagpVarZzh6);
                            if (zzagpVarZzh6.zzd) {
                                zzagpVarZzh6.zzk(zzkaVarZzj, Math.max(zzagpVarZzh6.zzf.zzb, this.zzI - zzagpVarZzh6.zza()), false);
                            }
                        }
                        zzY(true);
                        if (this.zzu.zze != 4) {
                            zzS();
                            zzA();
                            this.zzh.zzf(i4);
                        }
                        z = true;
                        zzv();
                        return z;
                    }
                case 11:
                    int i16 = message.arg1;
                    this.zzB = i16;
                    if (!this.zzr.zza(this.zzu.zza, i16)) {
                        zzx(true);
                    }
                    zzY(false);
                    z = true;
                    zzv();
                    return z;
                case 12:
                    boolean z19 = message.arg1 != 0;
                    this.zzC = z19;
                    if (!this.zzr.zzb(this.zzu.zza, z19)) {
                        zzx(true);
                    }
                    zzY(false);
                    z = true;
                    zzv();
                    return z;
                case 13:
                    boolean z20 = message.arg1 != 0;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                    if (this.zzD != z20) {
                        this.zzD = z20;
                        if (!z20) {
                            zzahv[] zzahvVarArr8 = this.zza;
                            for (int i17 = 0; i17 < 2; i17++) {
                                zzahv zzahvVar7 = zzahvVarArr8[i17];
                                if (!zzaf(zzahvVar7) && this.zzb.remove(zzahvVar7)) {
                                    zzahvVar7.zzas();
                                }
                            }
                        }
                    }
                    if (atomicBoolean != null) {
                        synchronized (this) {
                            atomicBoolean.set(true);
                            notifyAll();
                            break;
                        }
                    }
                    z = true;
                    zzv();
                    return z;
                case 14:
                    zzahs zzahsVar = (zzahs) message.obj;
                    if (zzahsVar.zzf() == this.zzj) {
                        zzag(zzahsVar);
                        int i18 = this.zzu.zze;
                        if (i18 == 3 || i18 == 2) {
                            this.zzh.zzf(2);
                        }
                    } else {
                        this.zzh.zzc(15, zzahsVar).zza();
                    }
                    z = true;
                    zzv();
                    return z;
                case 15:
                    final zzahs zzahsVar2 = (zzahs) message.obj;
                    Looper looperZzf = zzahsVar2.zzf();
                    if (looperZzf.getThread().isAlive()) {
                        this.zzp.zza(looperZzf, null).zzj(new Runnable(this, zzahsVar2) { // from class: com.google.android.gms.internal.ads.zzafg
                            private final zzafp zza;
                            private final zzahs zzb;

                            {
                                this.zza = this;
                                this.zzb = zzahsVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                zzafp.zzr(this.zzb);
                            }
                        });
                    } else {
                        Log.w("TAG", "Trying to send message on a dead thread.");
                        zzahsVar2.zzi(false);
                    }
                    z = true;
                    zzv();
                    return z;
                case 16:
                    zzQ((zzahf) message.obj, false);
                    z = true;
                    zzv();
                    return z;
                case 17:
                    zzafi zzafiVar = (zzafi) message.obj;
                    this.zzv.zzb(1);
                    if (zzafiVar.zzb != -1) {
                        this.zzH = new zzafo(new zzaht(zzafiVar.zza, zzafiVar.zzd, null), zzafiVar.zzb, zzafiVar.zzc);
                    }
                    zzN(this.zzs.zzj(zzafiVar.zza, zzafiVar.zzd), false);
                    z = true;
                    zzv();
                    return z;
                case 18:
                    zzafi zzafiVar2 = (zzafi) message.obj;
                    int iZzd = message.arg1;
                    this.zzv.zzb(1);
                    zzagz zzagzVar = this.zzs;
                    if (iZzd == -1) {
                        iZzd = zzagzVar.zzd();
                    }
                    zzN(zzagzVar.zzk(iZzd, zzafiVar2.zza, zzafiVar2.zzd), false);
                    z = true;
                    zzv();
                    return z;
                case 19:
                    zzafj zzafjVar = (zzafj) message.obj;
                    this.zzv.zzb(1);
                    zzagz zzagzVar2 = this.zzs;
                    int i19 = zzafjVar.zza;
                    int i20 = zzafjVar.zzb;
                    int i21 = zzafjVar.zzc;
                    zzix zzixVar = zzafjVar.zzd;
                    zzN(zzagzVar2.zzm(0, 0, 0, null), false);
                    z = true;
                    zzv();
                    return z;
                case 20:
                    int i22 = message.arg1;
                    int i23 = message.arg2;
                    zzix zzixVar2 = (zzix) message.obj;
                    this.zzv.zzb(1);
                    zzN(this.zzs.zzl(i22, i23, zzixVar2), false);
                    z = true;
                    zzv();
                    return z;
                case 21:
                    zzix zzixVar3 = (zzix) message.obj;
                    this.zzv.zzb(1);
                    zzN(this.zzs.zzn(zzixVar3), false);
                    z = true;
                    zzv();
                    return z;
                case 22:
                    zzN(this.zzs.zzh(), true);
                    z = true;
                    zzv();
                    return z;
                case 23:
                    this.zzx = message.arg1 != 0;
                    zzP();
                    if (this.zzy && this.zzr.zzi() != this.zzr.zzh()) {
                        zzx(true);
                        zzY(false);
                    }
                    z = true;
                    zzv();
                    return z;
                case 24:
                    boolean z21 = message.arg1 == 1;
                    if (z21 != this.zzF) {
                        this.zzF = z21;
                        zzahd zzahdVar11 = this.zzu;
                        int i24 = zzahdVar11.zze;
                        if (z21 || i24 == 4 || i24 == 1) {
                            this.zzu = zzahdVar11.zzi(z21);
                        } else {
                            this.zzh.zzf(2);
                        }
                    }
                    z = true;
                    zzv();
                    return z;
                case 25:
                    zzx(true);
                    z = true;
                    zzv();
                    return z;
                default:
                    return false;
            }
        } catch (zzaeg e) {
            zzaeg zzaegVarZzd = e;
            if (zzaegVarZzd.zza == 1 && (zzagpVarZzi = this.zzr.zzi()) != null) {
                zzaegVarZzd = zzaegVarZzd.zzd(zzagpVarZzi.zzf.zza);
            }
            if (zzaegVarZzd.zzg && this.zzL == null) {
                zzaln.zza("ExoPlayerImplInternal", "Recoverable renderer error", zzaegVarZzd);
                this.zzL = zzaegVarZzd;
                zzalg zzalgVar = this.zzh;
                zzalgVar.zze(zzalgVar.zzc(25, zzaegVarZzd));
            } else {
                zzaeg zzaegVar = this.zzL;
                if (zzaegVar != null) {
                    zzged.zza(zzaegVar, zzaegVarZzd);
                    zzaegVarZzd = this.zzL;
                }
                zzaln.zzb("ExoPlayerImplInternal", "Playback error", zzaegVarZzd);
                z = true;
                zzH(true, false);
                this.zzu = this.zzu.zzf(zzaegVarZzd);
            }
        } catch (zzaha e2) {
            zzs(e2, e2.zzc == 1 ? true != e2.zzb ? 3003 : 3001 : 1000);
        } catch (zzak e3) {
            zzs(e3, e3.zza);
        } catch (zzey e4) {
            zzs(e4, e4.zza);
        } catch (zzgj e5) {
            zzs(e5, 1002);
        } catch (IOException e6) {
            zzs(e6, 2000);
        } catch (RuntimeException e7) {
            zzaeg zzaegVarZzc = zzaeg.zzc(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            zzaln.zzb("ExoPlayerImplInternal", "Playback error", zzaegVarZzc);
            zzH(true, false);
            this.zzu = this.zzu.zzf(zzaegVarZzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zza() {
        this.zzh.zzf(10);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzb(zzahf zzahfVar) {
        this.zzh.zzc(16, zzahfVar).zza();
    }

    public final void zze() {
        this.zzh.zzb(0).zza();
    }

    public final void zzf(boolean z, int i) {
        this.zzh.zzd(1, z ? 1 : 0, i).zza();
    }

    public final void zzg(zzaiq zzaiqVar, int i, long j) {
        this.zzh.zzc(3, new zzafo(zzaiqVar, i, j)).zza();
    }

    public final void zzh() {
        this.zzh.zzb(6).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzahq
    public final synchronized void zzi(zzahs zzahsVar) {
        if (!this.zzw && this.zzi.isAlive()) {
            this.zzh.zzc(14, zzahsVar).zza();
            return;
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzahsVar.zzi(false);
    }

    public final synchronized boolean zzj() {
        if (!this.zzw && this.zzi.isAlive()) {
            this.zzh.zzf(7);
            zzt(new zzfmj(this) { // from class: com.google.android.gms.internal.ads.zzaff
                private final zzafp zza;

                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzfmj
                public final Object zza() {
                    return this.zza.zzo();
                }
            }, 500L);
            return this.zzw;
        }
        return true;
    }

    public final Looper zzk() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    public final void zzl() {
        this.zzh.zzf(22);
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzn(zzhe zzheVar) {
        this.zzh.zzc(8, zzheVar).zza();
    }

    final /* synthetic */ Boolean zzo() {
        return Boolean.valueOf(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zziv
    public final /* bridge */ /* synthetic */ void zzp(zziw zziwVar) {
        this.zzh.zzc(9, (zzhe) zziwVar).zza();
    }

    public final void zzq(List<zzagx> list, int i, long j, zzix zzixVar) {
        this.zzh.zzc(17, new zzafi(list, zzixVar, i, j, null, null)).zza();
    }
}
