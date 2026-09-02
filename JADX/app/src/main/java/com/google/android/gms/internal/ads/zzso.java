package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzso extends zzsm {
    private zzsn zza;
    private int zzb;
    private boolean zzc;
    private zzpb zzd;
    private zzoz zze;

    zzso() {
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    protected final long zzb(zzamf zzamfVar) {
        if ((zzamfVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzamfVar.zzi()[0];
        zzsn zzsnVar = this.zza;
        zzakt.zze(zzsnVar);
        int i = !zzsnVar.zzd[(b >> 1) & (255 >>> (8 - zzsnVar.zze))].zza ? zzsnVar.zza.zze : zzsnVar.zza.zzf;
        long j = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzamfVar.zzj() < zzamfVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzamfVar.zzi(), zzamfVar.zze() + 4);
            zzamfVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzamfVar.zzf(zzamfVar.zze() + 4);
        }
        byte[] bArrZzi = zzamfVar.zzi();
        bArrZzi[zzamfVar.zze() - 4] = (byte) (j & 255);
        bArrZzi[zzamfVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        bArrZzi[zzamfVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        bArrZzi[zzamfVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    protected final void zzj(long j) {
        super.zzj(j);
        this.zzc = j != 0;
        zzpb zzpbVar = this.zzd;
        this.zzb = zzpbVar != null ? zzpbVar.zze : 0;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x0406 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x0408  */
    /* JADX WARN: Code duplicated, block: B:62:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x017f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0192  */
    @Override // com.google.android.gms.internal.ads.zzsm
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzamf zzamfVar, long j, zzsk zzskVar) throws IOException {
        zzsn zzsnVar;
        int i;
        int iZzb;
        int i2;
        int i3;
        int i4;
        if (this.zza != null) {
            zzskVar.zza.getClass();
            return false;
        }
        zzpb zzpbVar = this.zzd;
        if (zzpbVar != null) {
            zzoz zzozVar = this.zze;
            if (zzozVar == null) {
                this.zze = zzpc.zzb(zzamfVar, true, true);
            } else {
                byte[] bArr = new byte[zzamfVar.zze()];
                System.arraycopy(zzamfVar.zzi(), 0, bArr, 0, zzamfVar.zze());
                int i5 = zzpbVar.zza;
                int i6 = 5;
                zzpc.zzc(5, zzamfVar, false);
                int iZzn = zzamfVar.zzn() + 1;
                zzoy zzoyVar = new zzoy(zzamfVar.zzi());
                zzoyVar.zzc(zzamfVar.zzg() * 8);
                int i7 = 0;
                while (i7 < iZzn) {
                    if (zzoyVar.zzb(24) != 5653314) {
                        int iZzd = zzoyVar.zzd();
                        StringBuilder sb = new StringBuilder(66);
                        sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                        sb.append(iZzd);
                        throw zzaha.zzb(sb.toString(), null);
                    }
                    int iZzb2 = zzoyVar.zzb(16);
                    int iZzb3 = zzoyVar.zzb(24);
                    long[] jArr = new long[iZzb3];
                    long jFloor = 0;
                    if (zzoyVar.zza()) {
                        i3 = iZzn;
                        int iZzb4 = zzoyVar.zzb(i6) + 1;
                        int i8 = 0;
                        while (i8 < iZzb3) {
                            int iZzb5 = zzoyVar.zzb(zzpc.zza(iZzb3 - i8));
                            int i9 = 0;
                            while (i9 < iZzb5 && i8 < iZzb3) {
                                jArr[i8] = iZzb4;
                                i8++;
                                i9++;
                                zzozVar = zzozVar;
                                bArr = bArr;
                            }
                            iZzb4++;
                            zzozVar = zzozVar;
                            bArr = bArr;
                        }
                    } else {
                        boolean zZza = zzoyVar.zza();
                        int i10 = 0;
                        while (i10 < iZzb3) {
                            if (zZza) {
                                if (zzoyVar.zza()) {
                                    jArr[i10] = zzoyVar.zzb(i6) + 1;
                                } else {
                                    jArr[i10] = 0;
                                }
                                i4 = 5;
                            } else {
                                i4 = i6;
                                iZzn = iZzn;
                                jArr[i10] = zzoyVar.zzb(i4) + 1;
                            }
                            i10++;
                            i6 = i4;
                            iZzn = iZzn;
                        }
                        i3 = iZzn;
                    }
                    zzoz zzozVar2 = zzozVar;
                    byte[] bArr2 = bArr;
                    int iZzb6 = zzoyVar.zzb(4);
                    if (iZzb6 > 2) {
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("lookup type greater than 2 not decodable: ");
                        sb2.append(iZzb6);
                        throw zzaha.zzb(sb2.toString(), null);
                    }
                    if (iZzb6 == 1) {
                        zzoyVar.zzc(32);
                        zzoyVar.zzc(32);
                        int iZzb7 = zzoyVar.zzb(4) + 1;
                        zzoyVar.zzc(1);
                        if (iZzb6 == 1) {
                            jFloor = ((long) iZzb3) * ((long) iZzb2);
                        } else if (iZzb2 != 0) {
                            jFloor = (long) Math.floor(Math.pow(iZzb3, 1.0d / ((double) iZzb2)));
                        }
                        zzoyVar.zzc((int) (((long) iZzb7) * jFloor));
                    } else if (iZzb6 == 2) {
                        iZzb6 = 2;
                        zzoyVar.zzc(32);
                        zzoyVar.zzc(32);
                        int iZzb8 = zzoyVar.zzb(4) + 1;
                        zzoyVar.zzc(1);
                        if (iZzb6 == 1) {
                            jFloor = ((long) iZzb3) * ((long) iZzb2);
                        } else if (iZzb2 != 0) {
                            jFloor = (long) Math.floor(Math.pow(iZzb3, 1.0d / ((double) iZzb2)));
                        }
                        zzoyVar.zzc((int) (((long) iZzb8) * jFloor));
                    }
                    i7++;
                    zzozVar = zzozVar2;
                    iZzn = i3;
                    bArr = bArr2;
                    i6 = 5;
                }
                zzoz zzozVar3 = zzozVar;
                byte[] bArr3 = bArr;
                int i11 = 6;
                int iZzb9 = zzoyVar.zzb(6) + 1;
                for (int i12 = 0; i12 < iZzb9; i12++) {
                    if (zzoyVar.zzb(16) != 0) {
                        throw zzaha.zzb("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i13 = 1;
                int iZzb10 = zzoyVar.zzb(6) + 1;
                int i14 = 0;
                while (true) {
                    int i15 = 3;
                    if (i14 >= iZzb10) {
                        int i16 = 1;
                        int iZzb11 = zzoyVar.zzb(i11) + 1;
                        int i17 = 0;
                        while (i17 < iZzb11) {
                            if (zzoyVar.zzb(16) > 2) {
                                throw zzaha.zzb("residueType greater than 2 is not decodable", null);
                            }
                            zzoyVar.zzc(24);
                            zzoyVar.zzc(24);
                            zzoyVar.zzc(24);
                            int iZzb12 = zzoyVar.zzb(i11) + i16;
                            int i18 = 8;
                            zzoyVar.zzc(8);
                            int[] iArr = new int[iZzb12];
                            for (int i19 = 0; i19 < iZzb12; i19++) {
                                iArr[i19] = ((zzoyVar.zza() ? zzoyVar.zzb(5) : 0) * 8) + zzoyVar.zzb(3);
                            }
                            int i20 = 0;
                            while (i20 < iZzb12) {
                                int i21 = 0;
                                while (i21 < i18) {
                                    if ((iArr[i20] & (1 << i21)) != 0) {
                                        zzoyVar.zzc(i18);
                                    }
                                    i21++;
                                    i18 = 8;
                                }
                                i20++;
                                i18 = 8;
                            }
                            i17++;
                            i11 = 6;
                            i16 = 1;
                        }
                        int iZzb13 = zzoyVar.zzb(i11) + 1;
                        for (int i22 = 0; i22 < iZzb13; i22++) {
                            int iZzb14 = zzoyVar.zzb(16);
                            if (iZzb14 != 0) {
                                StringBuilder sb3 = new StringBuilder(52);
                                sb3.append("mapping type other than 0 not supported: ");
                                sb3.append(iZzb14);
                                Log.e("VorbisUtil", sb3.toString());
                            } else {
                                if (zzoyVar.zza()) {
                                    i = 1;
                                    iZzb = zzoyVar.zzb(4) + 1;
                                } else {
                                    i = 1;
                                    iZzb = 1;
                                }
                                if (zzoyVar.zza()) {
                                    int iZzb15 = zzoyVar.zzb(8) + i;
                                    for (int i23 = 0; i23 < iZzb15; i23++) {
                                        int i24 = i5 - 1;
                                        zzoyVar.zzc(zzpc.zza(i24));
                                        zzoyVar.zzc(zzpc.zza(i24));
                                    }
                                }
                                if (zzoyVar.zzb(2) != 0) {
                                    throw zzaha.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (iZzb > 1) {
                                    for (int i25 = 0; i25 < i5; i25++) {
                                        zzoyVar.zzc(4);
                                    }
                                }
                                for (int i26 = 0; i26 < iZzb; i26++) {
                                    zzoyVar.zzc(8);
                                    zzoyVar.zzc(8);
                                    zzoyVar.zzc(8);
                                }
                            }
                        }
                        int iZzb16 = zzoyVar.zzb(6);
                        int i27 = iZzb16 + 1;
                        zzpa[] zzpaVarArr = new zzpa[i27];
                        for (int i28 = 0; i28 < i27; i28++) {
                            zzpaVarArr[i28] = new zzpa(zzoyVar.zza(), zzoyVar.zzb(16), zzoyVar.zzb(16), zzoyVar.zzb(8));
                        }
                        if (!zzoyVar.zza()) {
                            throw zzaha.zzb("framing bit after modes not set as expected", null);
                        }
                        zzsnVar = new zzsn(zzpbVar, zzozVar3, bArr3, zzpaVarArr, zzpc.zza(iZzb16));
                        break;
                    }
                    int iZzb17 = zzoyVar.zzb(16);
                    if (iZzb17 == 0) {
                        int i29 = 8;
                        zzoyVar.zzc(8);
                        zzoyVar.zzc(16);
                        zzoyVar.zzc(16);
                        zzoyVar.zzc(6);
                        zzoyVar.zzc(8);
                        int iZzb18 = zzoyVar.zzb(4) + 1;
                        int i30 = 0;
                        while (i30 < iZzb18) {
                            zzoyVar.zzc(i29);
                            i30++;
                            i29 = 8;
                        }
                    } else {
                        if (iZzb17 != i13) {
                            StringBuilder sb4 = new StringBuilder(52);
                            sb4.append("floor type greater than 1 not decodable: ");
                            sb4.append(iZzb17);
                            throw zzaha.zzb(sb4.toString(), null);
                        }
                        int iZzb19 = zzoyVar.zzb(5);
                        int[] iArr2 = new int[iZzb19];
                        int i31 = -1;
                        for (int i32 = 0; i32 < iZzb19; i32++) {
                            int iZzb20 = zzoyVar.zzb(4);
                            iArr2[i32] = iZzb20;
                            if (iZzb20 > i31) {
                                i31 = iZzb20;
                            }
                        }
                        int i33 = i31 + 1;
                        int[] iArr3 = new int[i33];
                        int i34 = 0;
                        while (i34 < i33) {
                            iArr3[i34] = zzoyVar.zzb(i15) + 1;
                            int iZzb21 = zzoyVar.zzb(2);
                            if (iZzb21 > 0) {
                                i2 = 8;
                                zzoyVar.zzc(8);
                            } else {
                                i2 = 8;
                            }
                            int i35 = 0;
                            for (int i36 = 1; i35 < (i36 << iZzb21); i36 = 1) {
                                zzoyVar.zzc(i2);
                                i35++;
                                i2 = 8;
                            }
                            i34++;
                            i15 = 3;
                        }
                        zzoyVar.zzc(2);
                        int iZzb22 = zzoyVar.zzb(4);
                        int i37 = 0;
                        int i38 = 0;
                        for (int i39 = 0; i39 < iZzb19; i39++) {
                            i37 += iArr3[iArr2[i39]];
                            while (i38 < i37) {
                                zzoyVar.zzc(iZzb22);
                                i38++;
                            }
                        }
                    }
                    i14++;
                    i11 = 6;
                    i13 = 1;
                }
            }
            this.zza = zzsnVar;
            if (zzsnVar == null) {
                return true;
            }
            zzpb zzpbVar2 = zzsnVar.zza;
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzpbVar2.zzg);
            arrayList.add(zzsnVar.zzc);
            zzaft zzaftVar = new zzaft();
            zzaftVar.zzN("audio/vorbis");
            zzaftVar.zzI(zzpbVar2.zzd);
            zzaftVar.zzJ(zzpbVar2.zzc);
            zzaftVar.zzaa(zzpbVar2.zza);
            zzaftVar.zzab(zzpbVar2.zzb);
            zzaftVar.zzP(arrayList);
            zzskVar.zza = zzaftVar.zzah();
            return true;
        }
        zzpc.zzc(1, zzamfVar, false);
        int iZzC = zzamfVar.zzC();
        int iZzn2 = zzamfVar.zzn();
        int iZzC2 = zzamfVar.zzC();
        int iZzw = zzamfVar.zzw();
        int i40 = iZzw <= 0 ? -1 : iZzw;
        int iZzw2 = zzamfVar.zzw();
        int i41 = iZzw2 <= 0 ? -1 : iZzw2;
        int iZzw3 = zzamfVar.zzw();
        int i42 = iZzw3 <= 0 ? -1 : iZzw3;
        int iZzn3 = zzamfVar.zzn();
        this.zzd = new zzpb(iZzC, iZzn2, iZzC2, i40, i41, i42, (int) Math.pow(2.0d, iZzn3 & 15), (int) Math.pow(2.0d, (iZzn3 & 240) >> 4), 1 == (zzamfVar.zzn() & 1), Arrays.copyOf(zzamfVar.zzi(), zzamfVar.zze()));
        zzsnVar = null;
        this.zza = zzsnVar;
        if (zzsnVar == null) {
            return true;
        }
        zzpb zzpbVar3 = zzsnVar.zza;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(zzpbVar3.zzg);
        arrayList2.add(zzsnVar.zzc);
        zzaft zzaftVar2 = new zzaft();
        zzaftVar2.zzN("audio/vorbis");
        zzaftVar2.zzI(zzpbVar3.zzd);
        zzaftVar2.zzJ(zzpbVar3.zzc);
        zzaftVar2.zzaa(zzpbVar3.zza);
        zzaftVar2.zzab(zzpbVar3.zzb);
        zzaftVar2.zzP(arrayList2);
        zzskVar.zza = zzaftVar2.zzah();
        return true;
    }
}
