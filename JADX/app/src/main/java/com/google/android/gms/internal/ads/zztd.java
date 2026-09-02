package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztd implements zztb {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzox zzb;
    private final zzuq zzd;
    private final zzamf zze;
    private final zztq zzf;
    private final boolean[] zzg;
    private final zztc zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zztd() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        zzalw.zze(this.zzg);
        this.zzh.zza();
        zztq zztqVar = this.zzf;
        if (zztqVar != null) {
            zztqVar.zza();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        zzunVar.zza();
        this.zza = zzunVar.zzc();
        this.zzb = zznxVar.zzB(zzunVar.zzb(), 2);
        zzuq zzuqVar = this.zzd;
        if (zzuqVar != null) {
            zzuqVar.zza(zznxVar, zzunVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010c  */
    /* JADX WARN: Code duplicated, block: B:43:0x012d  */
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
    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzd(zzamf zzamfVar) {
        boolean z;
        boolean z2;
        int i;
        float f;
        int i2;
        float f2;
        int i3;
        zzakt.zze(this.zzb);
        int iZzg = zzamfVar.zzg();
        int iZze = zzamfVar.zze();
        byte[] bArrZzi = zzamfVar.zzi();
        this.zzi += (long) zzamfVar.zzd();
        zzov.zzb(this.zzb, zzamfVar, zzamfVar.zzd());
        while (true) {
            int iZzd = zzalw.zzd(bArrZzi, iZzg, iZze, this.zzg);
            if (iZzd == iZze) {
                break;
            }
            int i4 = iZzd + 3;
            int i5 = zzamfVar.zzi()[i4] & UByte.MAX_VALUE;
            int i6 = iZzd - iZzg;
            if (this.zzk) {
                i4 = i4;
            } else {
                if (i6 > 0) {
                    this.zzh.zzc(bArrZzi, iZzg, iZzd);
                }
                if (this.zzh.zzb(i5, i6 < 0 ? -i6 : 0)) {
                    zztc zztcVar = this.zzh;
                    String str = this.zza;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zztcVar.zzc, zztcVar.zza);
                    byte b = bArrCopyOf[4];
                    byte b2 = bArrCopyOf[5];
                    int i7 = ((b2 & UByte.MAX_VALUE) >> 4) | ((b & UByte.MAX_VALUE) << 4);
                    int i8 = ((b2 & 15) << 8) | (bArrCopyOf[6] & UByte.MAX_VALUE);
                    int i9 = (bArrCopyOf[7] & 240) >> 4;
                    if (i9 == 2) {
                        f = i8 * 4;
                        i2 = i7 * 3;
                    } else if (i9 != 3) {
                        if (i9 != 4) {
                            f2 = 1.0f;
                        } else {
                            f = i8 * 121;
                            i2 = i7 * 100;
                        }
                        zzaft zzaftVar = new zzaft();
                        zzaftVar.zzD(str);
                        zzaftVar.zzN("video/mpeg2");
                        zzaftVar.zzS(i7);
                        zzaftVar.zzT(i8);
                        zzaftVar.zzW(f2);
                        zzaftVar.zzP(Collections.singletonList(bArrCopyOf));
                        zzafv zzafvVarZzah = zzaftVar.zzah();
                        i3 = (bArrCopyOf[7] & 15) - 1;
                        long j = 0;
                        if (i3 >= 0 || i3 >= 8) {
                            i4 = i4;
                        } else {
                            double d = zzc[i3];
                            byte b3 = bArrCopyOf[zztcVar.zzb + 9];
                            int i10 = (b3 & 96) >> 5;
                            int i11 = b3 & 31;
                            if (i10 != i11) {
                                d *= (((double) i10) + 1.0d) / ((double) (i11 + 1));
                            }
                            j = (long) (1000000.0d / d);
                        }
                        Pair pairCreate = Pair.create(zzafvVarZzah, Long.valueOf(j));
                        this.zzb.zzs((zzafv) pairCreate.first);
                        this.zzl = ((Long) pairCreate.second).longValue();
                        this.zzk = true;
                    } else {
                        f = i8 * 16;
                        i2 = i7 * 9;
                    }
                    f2 = f / i2;
                    zzaft zzaftVar2 = new zzaft();
                    zzaftVar2.zzD(str);
                    zzaftVar2.zzN("video/mpeg2");
                    zzaftVar2.zzS(i7);
                    zzaftVar2.zzT(i8);
                    zzaftVar2.zzW(f2);
                    zzaftVar2.zzP(Collections.singletonList(bArrCopyOf));
                    zzafv zzafvVarZzah2 = zzaftVar2.zzah();
                    i3 = (bArrCopyOf[7] & 15) - 1;
                    long j2 = 0;
                    if (i3 >= 0) {
                        i4 = i4;
                    } else {
                        i4 = i4;
                    }
                    Pair pairCreate2 = Pair.create(zzafvVarZzah2, Long.valueOf(j2));
                    this.zzb.zzs((zzafv) pairCreate2.first);
                    this.zzl = ((Long) pairCreate2.second).longValue();
                    this.zzk = true;
                } else {
                    i4 = i4;
                }
            }
            zztq zztqVar = this.zzf;
            if (zztqVar != null) {
                if (i6 > 0) {
                    zztqVar.zzd(bArrZzi, iZzg, iZzd);
                    i = 0;
                } else {
                    i = -i6;
                }
                if (this.zzf.zze(i)) {
                    zztq zztqVar2 = this.zzf;
                    int iZza = zzalw.zza(zztqVar2.zza, zztqVar2.zzb);
                    zzamf zzamfVar2 = this.zze;
                    int i12 = zzamq.zza;
                    zzamfVar2.zzb(this.zzf.zza, iZza);
                    this.zzd.zzb(this.zzo, this.zze);
                }
                if (i5 == 178) {
                    if (zzamfVar.zzi()[iZzd + 2] == 1) {
                        this.zzf.zzc(178);
                    }
                    i5 = 178;
                }
            }
            if (i5 == 0 || i5 == 179) {
                int i13 = iZze - iZzd;
                if (this.zzq && this.zzk) {
                    long j3 = this.zzo;
                    if (j3 != -9223372036854775807L) {
                        this.zzb.zzv(j3, this.zzp ? 1 : 0, ((int) (this.zzi - this.zzn)) - i13, i13, null);
                    }
                }
                if (!this.zzj || this.zzq) {
                    this.zzn = this.zzi - ((long) i13);
                    long j4 = this.zzm;
                    if (j4 == -9223372036854775807L) {
                        long j5 = this.zzo;
                        j4 = j5 != -9223372036854775807L ? j5 + this.zzl : -9223372036854775807L;
                    }
                    this.zzo = j4;
                    z = false;
                    this.zzp = false;
                    this.zzm = -9223372036854775807L;
                    z2 = true;
                    this.zzj = true;
                } else {
                    z = false;
                    z2 = true;
                }
                this.zzq = i5 == 0 ? z2 : z;
            } else if (i5 == 184) {
                this.zzp = true;
            }
            iZzg = i4;
        }
        if (!this.zzk) {
            this.zzh.zzc(bArrZzi, iZzg, iZze);
        }
        zztq zztqVar3 = this.zzf;
        if (zztqVar3 != null) {
            zztqVar3.zzd(bArrZzi, iZzg, iZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }

    zztd(zzuq zzuqVar) {
        zzamf zzamfVar;
        this.zzd = zzuqVar;
        this.zzg = new boolean[4];
        this.zzh = new zztc(128);
        if (zzuqVar != null) {
            this.zzf = new zztq(178, 128);
            zzamfVar = new zzamf();
        } else {
            zzamfVar = null;
            this.zzf = null;
        }
        this.zze = zzamfVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
