package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzara implements zzapo, zzapv {
    public static final zzapq zza = new zzaqy();
    private static final int zzb = zzave.zzl("qt  ");
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;
    private zzaux zzk;
    private int zzl;
    private int zzm;
    private zzapp zzn;
    private zzaqz[] zzo;
    private long zzp;
    private boolean zzq;
    private final zzaux zze = new zzaux(16);
    private final Stack<zzaqi> zzf = new Stack<>();
    private final zzaux zzc = new zzaux(zzauv.zza);
    private final zzaux zzd = new zzaux(4);

    private final void zzh() {
        this.zzg = 0;
        this.zzj = 0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    private final void zzi(long j) throws zzanp {
        zzaru zzaruVarZzc;
        zzaps zzapsVar;
        zzaru zzaruVar;
        zzarc zzarcVarZza;
        while (!this.zzf.isEmpty() && this.zzf.peek().zza == j) {
            zzaqi zzaqiVarPop = this.zzf.pop();
            if (zzaqiVarPop.zzaR == zzaqk.zzE) {
                ArrayList arrayList = new ArrayList();
                zzaps zzapsVar2 = new zzaps();
                zzaqj zzaqjVarZzc = zzaqiVarPop.zzc(zzaqk.zzaC);
                if (zzaqjVarZzc != null) {
                    zzaruVarZzc = zzaqr.zzc(zzaqjVarZzc, this.zzq);
                    if (zzaruVarZzc != null) {
                        zzapsVar2.zza(zzaruVarZzc);
                    }
                } else {
                    zzaruVarZzc = null;
                }
                long j2 = -9223372036854775807L;
                long j3 = Long.MAX_VALUE;
                int i = 0;
                while (i < zzaqiVarPop.zzc.size()) {
                    zzaqi zzaqiVar = zzaqiVarPop.zzc.get(i);
                    if (zzaqiVar.zzaR == zzaqk.zzG && (zzarcVarZza = zzaqr.zza(zzaqiVar, zzaqiVarPop.zzc(zzaqk.zzF), -9223372036854775807L, null, this.zzq)) != null) {
                        zzarf zzarfVarZzb = zzaqr.zzb(zzarcVarZza, zzaqiVar.zzd(zzaqk.zzH).zzd(zzaqk.zzI).zzd(zzaqk.zzJ), zzapsVar2);
                        if (zzarfVarZzb.zza == 0) {
                            zzapsVar = zzapsVar2;
                            zzaruVar = zzaruVarZzc;
                        } else {
                            zzaqz zzaqzVar = new zzaqz(zzarcVarZza, zzarfVarZzb, this.zzn.zzbf(i, zzarcVarZza.zzb));
                            zzanm zzanmVarZzg = zzarcVarZza.zzf.zzg(zzarfVarZzb.zzd + 30);
                            if (zzarcVarZza.zzb == 1) {
                                if (zzapsVar2.zzb()) {
                                    zzanmVarZzg = zzanmVarZzg.zzh(zzapsVar2.zzb, zzapsVar2.zzc);
                                }
                                if (zzaruVarZzc != null) {
                                    zzanmVarZzg = zzanmVarZzg.zzj(zzaruVarZzc);
                                }
                            }
                            zzaqzVar.zzc.zza(zzanmVarZzg);
                            zzapsVar = zzapsVar2;
                            zzaruVar = zzaruVarZzc;
                            long jMax = Math.max(j2, zzarcVarZza.zze);
                            arrayList.add(zzaqzVar);
                            long j4 = zzarfVarZzb.zzb[0];
                            if (j4 < j3) {
                                j2 = jMax;
                                j3 = j4;
                            } else {
                                j2 = jMax;
                            }
                        }
                    } else {
                        zzapsVar = zzapsVar2;
                        zzaruVar = zzaruVarZzc;
                    }
                    i++;
                    zzapsVar2 = zzapsVar;
                    zzaruVarZzc = zzaruVar;
                }
                this.zzp = j2;
                this.zzo = (zzaqz[]) arrayList.toArray(new zzaqz[arrayList.size()]);
                this.zzn.zzbg();
                this.zzn.zzc(this);
                this.zzf.clear();
                this.zzg = 2;
            } else if (!this.zzf.isEmpty()) {
                this.zzf.peek().zzb(zzaqiVarPop);
            }
        }
        if (this.zzg != 2) {
            zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    public final long zzb() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    public final long zzc(long j) {
        long j2 = Long.MAX_VALUE;
        for (zzaqz zzaqzVar : this.zzo) {
            zzarf zzarfVar = zzaqzVar.zzb;
            int iZza = zzarfVar.zza(j);
            if (iZza == -1) {
                iZza = zzarfVar.zzb(j);
            }
            long j3 = zzarfVar.zzb[iZza];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final void zzd(zzapp zzappVar) {
        this.zzn = zzappVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final void zze(long j, long j2) {
        this.zzf.clear();
        this.zzj = 0;
        this.zzl = 0;
        this.zzm = 0;
        if (j == 0) {
            zzh();
            return;
        }
        zzaqz[] zzaqzVarArr = this.zzo;
        if (zzaqzVarArr != null) {
            for (zzaqz zzaqzVar : zzaqzVarArr) {
                zzarf zzarfVar = zzaqzVar.zzb;
                int iZza = zzarfVar.zza(j2);
                if (iZza == -1) {
                    iZza = zzarfVar.zzb(j2);
                }
                zzaqzVar.zzd = iZza;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final boolean zzf(zzapn zzapnVar) throws InterruptedException, IOException {
        return zzarb.zzb(zzapnVar);
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
    @Override // com.google.android.gms.internal.ads.zzapo
    public final int zzg(zzapn zzapnVar, zzapt zzaptVar) throws InterruptedException, IOException {
        zzaqz[] zzaqzVarArr;
        boolean z;
        boolean z2;
        while (true) {
            int i = this.zzg;
            if (i == 0) {
                if (this.zzj == 0) {
                    if (!zzapnVar.zzb(this.zze.zza, 0, 8, true)) {
                        return -1;
                    }
                    this.zzj = 8;
                    this.zze.zzi(0);
                    this.zzi = this.zze.zzp();
                    this.zzh = this.zze.zzr();
                }
                if (this.zzi == 1) {
                    zzapnVar.zzb(this.zze.zza, 8, 8, false);
                    this.zzj += 8;
                    this.zzi = this.zze.zzv();
                }
                int i2 = this.zzh;
                if (i2 == zzaqk.zzE || i2 == zzaqk.zzG || i2 == zzaqk.zzH || i2 == zzaqk.zzI || i2 == zzaqk.zzJ || i2 == zzaqk.zzS) {
                    long jZzh = (zzapnVar.zzh() + this.zzi) - ((long) this.zzj);
                    this.zzf.add(new zzaqi(this.zzh, jZzh));
                    if (this.zzi == this.zzj) {
                        zzi(jZzh);
                    } else {
                        zzh();
                    }
                } else {
                    int i3 = this.zzh;
                    if (i3 == zzaqk.zzU || i3 == zzaqk.zzF || i3 == zzaqk.zzV || i3 == zzaqk.zzW || i3 == zzaqk.zzao || i3 == zzaqk.zzap || i3 == zzaqk.zzaq || i3 == zzaqk.zzT || i3 == zzaqk.zzar || i3 == zzaqk.zzas || i3 == zzaqk.zzat || i3 == zzaqk.zzau || i3 == zzaqk.zzav || i3 == zzaqk.zzR || i3 == zzaqk.zzd || i3 == zzaqk.zzaC) {
                        zzaup.zzd(this.zzj == 8);
                        zzaup.zzd(this.zzi <= 2147483647L);
                        this.zzk = new zzaux((int) this.zzi);
                        System.arraycopy(this.zze.zza, 0, this.zzk.zza, 0, 8);
                    } else {
                        this.zzk = null;
                    }
                    this.zzg = 1;
                }
            } else {
                if (i != 1) {
                    long j = Long.MAX_VALUE;
                    int i4 = -1;
                    int i5 = 0;
                    while (true) {
                        zzaqzVarArr = this.zzo;
                        if (i5 >= zzaqzVarArr.length) {
                            break;
                        }
                        zzaqz zzaqzVar = zzaqzVarArr[i5];
                        int i6 = zzaqzVar.zzd;
                        zzarf zzarfVar = zzaqzVar.zzb;
                        if (i6 != zzarfVar.zza) {
                            long j2 = zzarfVar.zzb[i6];
                            if (j2 < j) {
                                i4 = i5;
                                j = j2;
                            }
                        }
                        i5++;
                    }
                    if (i4 == -1) {
                        return -1;
                    }
                    zzaqz zzaqzVar2 = zzaqzVarArr[i4];
                    zzapx zzapxVar = zzaqzVar2.zzc;
                    int i7 = zzaqzVar2.zzd;
                    zzarf zzarfVar2 = zzaqzVar2.zzb;
                    long j3 = zzarfVar2.zzb[i7];
                    int i8 = zzarfVar2.zzc[i7];
                    if (zzaqzVar2.zza.zzg == 1) {
                        j3 += 8;
                        i8 -= 8;
                    }
                    long jZzh2 = (j3 - zzapnVar.zzh()) + ((long) this.zzl);
                    if (jZzh2 < 0 || jZzh2 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzaptVar.zza = j3;
                        return 1;
                    }
                    int i9 = (int) jZzh2;
                    boolean z3 = false;
                    zzapnVar.zzd(i9, false);
                    int i10 = zzaqzVar2.zza.zzk;
                    if (i10 == 0) {
                        while (true) {
                            int i11 = this.zzl;
                            if (i11 >= i8) {
                                break;
                            }
                            int iZzd = zzapxVar.zzd(zzapnVar, i8 - i11, false);
                            this.zzl += iZzd;
                            this.zzm -= iZzd;
                        }
                    } else {
                        byte[] bArr = this.zzd.zza;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i12 = 4 - i10;
                        while (this.zzl < i8) {
                            int i13 = this.zzm;
                            if (i13 == 0) {
                                zzapnVar.zzb(this.zzd.zza, i12, i10, z3);
                                this.zzd.zzi(z3 ? 1 : 0);
                                this.zzm = this.zzd.zzu();
                                this.zzc.zzi(z3 ? 1 : 0);
                                zzapxVar.zzb(this.zzc, 4);
                                this.zzl += 4;
                                i8 += i12;
                            } else {
                                int iZzd2 = zzapxVar.zzd(zzapnVar, i13, z3);
                                this.zzl += iZzd2;
                                this.zzm -= iZzd2;
                                z3 = false;
                            }
                        }
                    }
                    int i14 = i8;
                    zzarf zzarfVar3 = zzaqzVar2.zzb;
                    zzapxVar.zzc(zzarfVar3.zze[i7], zzarfVar3.zzf[i7], i14, 0, null);
                    zzaqzVar2.zzd++;
                    this.zzl = 0;
                    this.zzm = 0;
                    return 0;
                }
                long j4 = this.zzi - ((long) this.zzj);
                long jZzh3 = zzapnVar.zzh() + j4;
                zzaux zzauxVar = this.zzk;
                if (zzauxVar != null) {
                    zzapnVar.zzb(zzauxVar.zza, this.zzj, (int) j4, false);
                    if (this.zzh == zzaqk.zzd) {
                        zzaux zzauxVar2 = this.zzk;
                        zzauxVar2.zzi(8);
                        if (zzauxVar2.zzr() != zzb) {
                            zzauxVar2.zzj(4);
                            while (true) {
                                if (zzauxVar2.zzd() <= 0) {
                                    z2 = false;
                                    break;
                                }
                                if (zzauxVar2.zzr() == zzb) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                        this.zzq = z2;
                    } else if (!this.zzf.isEmpty()) {
                        this.zzf.peek().zza(new zzaqj(this.zzh, this.zzk));
                    }
                } else {
                    if (j4 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzapnVar.zzd((int) j4, false);
                    } else {
                        zzaptVar.zza = zzapnVar.zzh() + j4;
                        z = true;
                    }
                    zzi(jZzh3);
                    if (z && this.zzg != 2) {
                        return 1;
                    }
                }
                z = false;
                zzi(jZzh3);
                if (z) {
                    continue;
                }
            }
        }
    }
}
