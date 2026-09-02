package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzre {
    private static final byte[] zza = zzamq.zzs("OpusHead");

    /* JADX WARN: Code duplicated, block: B:379:0x0791  */
    /* JADX WARN: Code duplicated, block: B:386:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:388:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:389:0x0804  */
    /* JADX WARN: Code duplicated, block: B:391:0x080d  */
    /* JADX WARN: Code duplicated, block: B:394:0x0818  */
    /* JADX WARN: Code duplicated, block: B:396:0x082e  */
    /* JADX WARN: Code duplicated, block: B:398:0x0837  */
    /* JADX WARN: Code duplicated, block: B:399:0x0844  */
    /* JADX WARN: Code duplicated, block: B:402:0x0869  */
    /* JADX WARN: Code duplicated, block: B:403:0x086c  */
    /* JADX WARN: Code duplicated, block: B:406:0x0876  */
    /* JADX WARN: Code duplicated, block: B:407:0x0879  */
    /* JADX WARN: Code duplicated, block: B:410:0x0894  */
    /* JADX WARN: Code duplicated, block: B:411:0x089c  */
    /* JADX WARN: Code duplicated, block: B:413:0x089f  */
    /* JADX WARN: Code duplicated, block: B:415:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:416:0x08af  */
    /* JADX WARN: Code duplicated, block: B:417:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:444:0x0966 A[PHI: r6
  0x0966: PHI (r6v33 int) = (r6v32 int), (r6v32 int), (r6v71 int), (r6v32 int) binds: [B:419:0x08be, B:426:0x08d8, B:443:0x0965, B:425:0x08d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:446:0x0986  */
    /* JADX WARN: Code duplicated, block: B:448:0x098a  */
    /* JADX WARN: Code duplicated, block: B:450:0x0990 A[LOOP:11: B:447:0x0988->B:450:0x0990, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:455:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:457:0x09d9 A[ADDED_TO_REGION, LOOP:12: B:457:0x09d9->B:459:0x09dd, LOOP_START, PHI: r20 r21 r27
  0x09d9: PHI (r20v11 int) = (r20v7 int), (r20v12 int) binds: [B:456:0x09d7, B:459:0x09dd] A[DONT_GENERATE, DONT_INLINE]
  0x09d9: PHI (r21v5 int) = (r21v3 int), (r21v9 int) binds: [B:456:0x09d7, B:459:0x09dd] A[DONT_GENERATE, DONT_INLINE]
  0x09d9: PHI (r27v7 int) = (r11v21 int), (r27v8 int) binds: [B:456:0x09d7, B:459:0x09dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:458:0x09db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:459:0x09dd A[LOOP:12: B:457:0x09d9->B:459:0x09dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:465:0x09fd  */
    /* JADX WARN: Code duplicated, block: B:468:0x0a08  */
    /* JADX WARN: Code duplicated, block: B:469:0x0a0a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:472:0x0a11  */
    /* JADX WARN: Code duplicated, block: B:474:0x0a18  */
    /* JADX WARN: Code duplicated, block: B:477:0x0a2b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:478:0x0a2d  */
    /* JADX WARN: Code duplicated, block: B:479:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:480:0x0a3e  */
    /* JADX WARN: Code duplicated, block: B:485:0x0a64 A[DONT_INVERT, LOOP:13: B:485:0x0a64->B:489:0x0a6e, LOOP_START, PHI: r20
  0x0a64: PHI (r20v8 int) = (r20v7 int), (r20v9 int) binds: [B:484:0x0a62, B:489:0x0a6e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:486:0x0a66  */
    /* JADX WARN: Code duplicated, block: B:489:0x0a6e A[LOOP:13: B:485:0x0a64->B:489:0x0a6e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:490:0x0a74 A[EDGE_INSN: B:490:0x0a74->B:491:0x0a75 BREAK  A[LOOP:13: B:485:0x0a64->B:489:0x0a6e]] */
    /* JADX WARN: Code duplicated, block: B:492:0x0a77 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:493:0x0a79 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:494:0x0a7b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:495:0x0a7d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:496:0x0a7f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:497:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:498:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:499:0x0a91  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:501:0x0a9a  */
    /* JADX WARN: Code duplicated, block: B:502:0x0aa2  */
    /* JADX WARN: Code duplicated, block: B:503:0x0aab  */
    /* JADX WARN: Code duplicated, block: B:504:0x0ab5  */
    /* JADX WARN: Code duplicated, block: B:507:0x0ac6  */
    /* JADX WARN: Code duplicated, block: B:508:0x0ac9  */
    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    /* JADX WARN: Code duplicated, block: B:513:0x0b2a  */
    /* JADX WARN: Code duplicated, block: B:514:0x0b42  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105 A[PHI: r10
  0x0105: PHI (r10v6 int) = (r10v4 int), (r10v8 int) binds: [B:45:0x00f9, B:50:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:538:0x0bfa  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:542:0x0c03  */
    /* JADX WARN: Code duplicated, block: B:544:0x0c0c  */
    /* JADX WARN: Code duplicated, block: B:547:0x0c19 A[LOOP:5: B:545:0x0c16->B:547:0x0c19, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:550:0x0c4a  */
    /* JADX WARN: Code duplicated, block: B:553:0x0c50  */
    /* JADX WARN: Code duplicated, block: B:554:0x0c52  */
    /* JADX WARN: Code duplicated, block: B:558:0x0c69  */
    /* JADX WARN: Code duplicated, block: B:560:0x0c74  */
    /* JADX WARN: Code duplicated, block: B:563:0x0c9e  */
    /* JADX WARN: Code duplicated, block: B:568:0x0caf  */
    /* JADX WARN: Code duplicated, block: B:569:0x0cb1  */
    /* JADX WARN: Code duplicated, block: B:571:0x0cb7  */
    /* JADX WARN: Code duplicated, block: B:575:0x0cd3  */
    /* JADX WARN: Code duplicated, block: B:576:0x0cd5  */
    /* JADX WARN: Code duplicated, block: B:579:0x0cd9  */
    /* JADX WARN: Code duplicated, block: B:580:0x0cdd  */
    /* JADX WARN: Code duplicated, block: B:582:0x0ce1  */
    /* JADX WARN: Code duplicated, block: B:583:0x0ce5  */
    /* JADX WARN: Code duplicated, block: B:586:0x0cea  */
    /* JADX WARN: Code duplicated, block: B:587:0x0cec  */
    /* JADX WARN: Code duplicated, block: B:589:0x0cf0  */
    /* JADX WARN: Code duplicated, block: B:590:0x0cf4  */
    /* JADX WARN: Code duplicated, block: B:594:0x0d01  */
    /* JADX WARN: Code duplicated, block: B:596:0x0d0b  */
    /* JADX WARN: Code duplicated, block: B:597:0x0d1d  */
    /* JADX WARN: Code duplicated, block: B:599:0x0d23  */
    /* JADX WARN: Code duplicated, block: B:59:0x0114  */
    /* JADX WARN: Code duplicated, block: B:601:0x0d55  */
    /* JADX WARN: Code duplicated, block: B:610:0x0dab  */
    /* JADX WARN: Code duplicated, block: B:616:0x0da3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x0cca A[EDGE_INSN: B:625:0x0cca->B:573:0x0cca BREAK  A[LOOP:6: B:556:0x0c62->B:572:0x0cbf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x0ca9 A[ADDED_TO_REGION, EDGE_INSN: B:628:0x0ca9->B:566:0x0ca9 BREAK  A[LOOP:7: B:561:0x0c98->B:565:0x0ca3], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x0d5b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x09b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x0a58 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x09a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:0x09ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x09e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x0a74 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x0a6c A[SYNTHETIC] */
    public static List<zzrx> zza(zzqv zzqvVar, zzoj zzojVar, long j, zzn zznVar, boolean z, boolean z2, zzfln<zzru, zzru> zzflnVar) throws zzaha {
        int i;
        long j2;
        int i2;
        ArrayList arrayList;
        String str;
        zzqv zzqvVar2;
        long[] jArr;
        long[] jArr2;
        zzru zzruVar;
        Pair pairCreate;
        zzamf zzamfVar;
        zzn zznVarZza;
        int i3;
        String str2;
        int i4;
        boolean z3;
        int i5;
        byte[] bArrCopyOfRange;
        String str3;
        List<byte[]> list;
        String str4;
        String str5;
        String str6;
        zzfoj zzfojVarZzj;
        long j3;
        zzru zzruVarApply;
        ArrayList arrayList2;
        zzqv zzqvVarZzd;
        zzqw zzqwVarZzc;
        zzqw zzqwVarZzc2;
        zzqz zzrcVar;
        int iZza;
        zzqw zzqwVarZzc3;
        zzqw zzqwVar;
        boolean z4;
        zzamf zzamfVar2;
        zzqw zzqwVarZzc4;
        zzamf zzamfVar3;
        zzqw zzqwVarZzc5;
        zzamf zzamfVar4;
        zzqy zzqyVar;
        int iZzB;
        int iZzB2;
        int iZzB3;
        int iZzB4;
        int i6;
        int iZzB5;
        int iZzB6;
        int iZzb;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int i7;
        int[] iArrCopyOf2;
        zzru zzruVar2;
        int iZzB7;
        int iZzv;
        int i8;
        int i9;
        int i10;
        int iZzv2;
        int i11;
        int iZzB8;
        long j4;
        long j5;
        int i12;
        int i13;
        String str7;
        int i14;
        boolean z5;
        int i15;
        int i16;
        int i17;
        int i18;
        long j6;
        int[] iArr;
        int[] iArr2;
        long[] jArr3;
        int iMax;
        String str8;
        boolean zZza;
        int i19;
        int iZzc;
        int i20;
        int iZzB9;
        int i21;
        long jZzH;
        long[] jArr4;
        int i22;
        zzrx zzrxVar;
        zzrx zzrxVar2;
        long[] jArr5;
        int length;
        boolean z6;
        int[] iArr3;
        int[] iArr4;
        long[] jArr6;
        int i23;
        int i24;
        int i25;
        boolean z7;
        long[] jArr7;
        int i26;
        long[] jArr8;
        int[] iArr5;
        boolean z8;
        boolean z9;
        long[] jArr9;
        int[] iArr6;
        int i27;
        int[] iArr7;
        long[] jArr10;
        int i28;
        int i29;
        long j7;
        long j8;
        int i30;
        int i31;
        int[] iArr8;
        long j9;
        int i32;
        int i33;
        int i34;
        boolean z10;
        long j10;
        int i35;
        int length2;
        ArrayList arrayList3 = new ArrayList();
        int i36 = 0;
        while (i36 < zzqvVar.zzc.size()) {
            zzqv zzqvVar3 = zzqvVar.zzc.get(i36);
            if (zzqvVar3.zzd != 1953653099) {
                arrayList2 = arrayList3;
                i = i36;
            } else {
                zzqw zzqwVarZzc6 = zzqvVar.zzc(1836476516);
                zzqwVarZzc6.getClass();
                zzqv zzqvVarZzd2 = zzqvVar3.zzd(1835297121);
                zzqvVarZzd2.getClass();
                zzqw zzqwVarZzc7 = zzqvVarZzd2.zzc(1751411826);
                zzqwVarZzc7.getClass();
                int iZzf = zzf(zze(zzqwVarZzc7.zza));
                i = i36;
                if (iZzf == -1) {
                    str = "AtomParsers";
                    zzqvVar2 = zzqvVar3;
                    arrayList = arrayList3;
                } else {
                    zzqw zzqwVarZzc8 = zzqvVar3.zzc(1953196132);
                    zzqwVarZzc8.getClass();
                    zzamf zzamfVar5 = zzqwVarZzc8.zza;
                    zzamfVar5.zzh(8);
                    int iZze = zzqx.zze(zzamfVar5.zzv());
                    zzamfVar5.zzk(iZze == 0 ? 8 : 16);
                    int iZzv3 = zzamfVar5.zzv();
                    zzamfVar5.zzk(4);
                    int iZzg = zzamfVar5.zzg();
                    int i37 = iZze == 0 ? 4 : 8;
                    int i38 = 0;
                    while (true) {
                        if (i38 >= i37) {
                            zzamfVar5.zzk(i37);
                        } else {
                            if (zzamfVar5.zzi()[iZzg + i38] != -1) {
                                long jZzt = iZze == 0 ? zzamfVar5.zzt() : zzamfVar5.zzD();
                                if (jZzt != 0) {
                                    j2 = jZzt;
                                    break;
                                }
                                break;
                            }
                            i38++;
                        }
                        j2 = -9223372036854775807L;
                        break;
                    }
                    zzamfVar5.zzk(16);
                    int iZzv4 = zzamfVar5.zzv();
                    int iZzv5 = zzamfVar5.zzv();
                    zzamfVar5.zzk(4);
                    int iZzv6 = zzamfVar5.zzv();
                    int iZzv7 = zzamfVar5.zzv();
                    int i39 = 65536;
                    String str9 = "AtomParsers";
                    if (iZzv4 != 0) {
                        if (iZzv4 == 0) {
                            i39 = iZzv6;
                        } else if (iZzv5 != -65536) {
                            i39 = iZzv6;
                            iZzv4 = 0;
                        } else if (iZzv6 == 65536) {
                            iZzv5 = -65536;
                            i39 = iZzv6;
                            iZzv4 = 0;
                        } else if (iZzv7 == 0) {
                            i2 = 270;
                        } else {
                            iZzv5 = -65536;
                            iZzv4 = 0;
                        }
                        if (iZzv4 != -65536 && iZzv5 == 0 && i39 == 0 && iZzv7 == -65536) {
                            i2 = 180;
                        } else {
                            i2 = 0;
                        }
                    } else {
                        if (iZzv5 == 65536) {
                            if (iZzv6 != -65536) {
                                iZzv5 = 65536;
                            } else if (iZzv7 == 0) {
                                i2 = 90;
                            } else {
                                iZzv5 = 65536;
                                iZzv6 = -65536;
                            }
                        }
                        iZzv4 = 0;
                        if (iZzv4 == 0) {
                            i39 = iZzv6;
                        } else if (iZzv5 != -65536) {
                            i39 = iZzv6;
                            iZzv4 = 0;
                        } else if (iZzv6 == 65536) {
                            iZzv5 = -65536;
                            i39 = iZzv6;
                            iZzv4 = 0;
                        } else if (iZzv7 == 0) {
                            i2 = 270;
                        } else {
                            iZzv5 = -65536;
                            iZzv4 = 0;
                        }
                        if (iZzv4 != -65536) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                        }
                    }
                    zzrd zzrdVar = new zzrd(iZzv3, j2, i2);
                    long j11 = j == -9223372036854775807L ? zzrdVar.zzb : j;
                    zzamf zzamfVar6 = zzqwVarZzc6.zza;
                    zzamfVar6.zzh(8);
                    zzamfVar6.zzk(zzqx.zze(zzamfVar6.zzv()) == 0 ? 8 : 16);
                    long jZzt2 = zzamfVar6.zzt();
                    long jZzH2 = j11 != -9223372036854775807L ? zzamq.zzH(j11, 1000000L, jZzt2) : -9223372036854775807L;
                    zzqv zzqvVarZzd3 = zzqvVarZzd2.zzd(1835626086);
                    zzqvVarZzd3.getClass();
                    zzqv zzqvVarZzd4 = zzqvVarZzd3.zzd(1937007212);
                    zzqvVarZzd4.getClass();
                    zzqw zzqwVarZzc9 = zzqvVarZzd2.zzc(1835296868);
                    zzqwVarZzc9.getClass();
                    zzamf zzamfVar7 = zzqwVarZzc9.zza;
                    zzamfVar7.zzh(8);
                    int iZze2 = zzqx.zze(zzamfVar7.zzv());
                    zzamfVar7.zzk(iZze2 == 0 ? 8 : 16);
                    long jZzt3 = zzamfVar7.zzt();
                    zzamfVar7.zzk(iZze2 == 0 ? 4 : 8);
                    int iZzo = zzamfVar7.zzo();
                    StringBuilder sb = new StringBuilder(3);
                    sb.append((char) (((iZzo >> 10) & 31) + 96));
                    sb.append((char) (((iZzo >> 5) & 31) + 96));
                    sb.append((char) ((iZzo & 31) + 96));
                    Pair pairCreate2 = Pair.create(Long.valueOf(jZzt3), sb.toString());
                    zzqw zzqwVarZzc10 = zzqvVarZzd4.zzc(1937011556);
                    zzqwVarZzc10.getClass();
                    zzamf zzamfVar8 = zzqwVarZzc10.zza;
                    int i40 = zzrdVar.zza;
                    int i41 = zzrdVar.zzc;
                    String str10 = (String) pairCreate2.second;
                    zzamfVar8.zzh(12);
                    int iZzv8 = zzamfVar8.zzv();
                    zzra zzraVar = new zzra(iZzv8);
                    int i42 = 0;
                    while (i42 < iZzv8) {
                        int iZzg2 = zzamfVar8.zzg();
                        ArrayList arrayList4 = arrayList3;
                        int iZzv9 = zzamfVar8.zzv();
                        zzny.zza(iZzv9 > 0, "childAtomSize must be positive");
                        int iZzv10 = zzamfVar8.zzv();
                        int i43 = i41;
                        if (iZzv10 == 1635148593 || iZzv10 == 1635148595 || iZzv10 == 1701733238 || iZzv10 == 1831958048 || iZzv10 == 1836070006 || iZzv10 == 1752589105 || iZzv10 == 1751479857 || iZzv10 == 1932670515 || iZzv10 == 1211250227 || iZzv10 == 1987063864 || iZzv10 == 1987063865 || iZzv10 == 1635135537 || iZzv10 == 1685479798 || iZzv10 == 1685479729 || iZzv10 == 1685481573 || iZzv10 == 1685481521) {
                            zzraVar = zzraVar;
                            str10 = str10;
                            int i44 = i40;
                            iZzf = iZzf;
                            pairCreate2 = pairCreate2;
                            zzqvVar3 = zzqvVar3;
                            zzrdVar = zzrdVar;
                            String str11 = str9;
                            zzamfVar = zzamfVar8;
                            zzamfVar.zzh(iZzg2 + 16);
                            zzamfVar.zzk(16);
                            int iZzo2 = zzamfVar.zzo();
                            int iZzo3 = zzamfVar.zzo();
                            zzamfVar.zzk(50);
                            int iZzg3 = zzamfVar.zzg();
                            if (iZzv10 == 1701733238) {
                                Pair<Integer, zzrv> pairZzi = zzi(zzamfVar, iZzg2, iZzv9);
                                if (pairZzi != null) {
                                    int iIntValue = ((Integer) pairZzi.first).intValue();
                                    zznVarZza = zznVar == null ? null : zznVar.zza(((zzrv) pairZzi.second).zzb);
                                    zzraVar.zza[i42] = (zzrv) pairZzi.second;
                                    iZzv10 = iIntValue;
                                } else {
                                    zzraVar = zzraVar;
                                    iZzv10 = 1701733238;
                                    zznVarZza = zznVar;
                                }
                                zzamfVar.zzh(iZzg3);
                            } else {
                                zzraVar = zzraVar;
                                zznVarZza = zznVar;
                            }
                            if (iZzv10 == 1831958048) {
                                i3 = iZzv10;
                                str2 = "video/mpeg";
                            } else {
                                i3 = 1211250227;
                                if (iZzv10 == 1211250227) {
                                    str2 = "video/3gpp";
                                } else {
                                    i3 = iZzv10;
                                    str2 = null;
                                }
                            }
                            int i45 = iZzg3;
                            float fZzB = 1.0f;
                            List<byte[]> listZzj = null;
                            int i46 = -1;
                            String str12 = null;
                            byte[] bArr = null;
                            zzj zzjVar = null;
                            String str13 = str2;
                            boolean z11 = false;
                            while (i45 - iZzg2 < iZzv9) {
                                zzamfVar.zzh(i45);
                                int iZzg4 = zzamfVar.zzg();
                                int iZzv11 = zzamfVar.zzv();
                                if (iZzv11 != 0) {
                                    i4 = iZzv11;
                                } else {
                                    if (zzamfVar.zzg() - iZzg2 == iZzv9) {
                                        break;
                                    }
                                    i4 = 0;
                                }
                                zzny.zza(i4 > 0, "childAtomSize must be positive");
                                int iZzv12 = zzamfVar.zzv();
                                if (iZzv12 == 1635148611) {
                                    zzny.zza(str13 == null, null);
                                    zzamfVar.zzh(iZzg4 + 8);
                                    zzne zzneVarZza = zzne.zza(zzamfVar);
                                    list = zzneVarZza.zza;
                                    zzraVar.zzc = zzneVarZza.zzb;
                                    if (!z11) {
                                        fZzB = zzneVarZza.zze;
                                    }
                                    str4 = zzneVarZza.zzf;
                                    str5 = "video/avc";
                                } else {
                                    if (iZzv12 == 1752589123) {
                                        zzny.zza(str13 == null, null);
                                        zzamfVar.zzh(iZzg4 + 8);
                                        zzok zzokVarZza = zzok.zza(zzamfVar);
                                        list = zzokVarZza.zza;
                                        zzraVar.zzc = zzokVarZza.zzb;
                                        str4 = zzokVarZza.zzc;
                                        str5 = "video/hevc";
                                    } else {
                                        if (iZzv12 == 1685480259 || iZzv12 == 1685485123) {
                                            z3 = z11;
                                            str11 = str11;
                                            i5 = i3;
                                            zznr zznrVarZza = zznr.zza(zzamfVar);
                                            if (zznrVarZza != null) {
                                                str13 = "video/dolby-vision";
                                                str12 = zznrVarZza.zza;
                                            }
                                        } else {
                                            if (iZzv12 == 1987076931) {
                                                zzny.zza(str13 == null, null);
                                                str3 = i3 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            } else if (iZzv12 == 1635135811) {
                                                zzny.zza(str13 == null, null);
                                                str3 = "video/av01";
                                            } else {
                                                if (iZzv12 == 1681012275) {
                                                    zzny.zza(str13 == null, null);
                                                    str3 = "video/3gpp";
                                                } else if (iZzv12 == 1702061171) {
                                                    zzny.zza(str13 == null, null);
                                                    Pair<String, byte[]> pairZzh = zzh(zzamfVar, iZzg4);
                                                    String str14 = (String) pairZzh.first;
                                                    byte[] bArr2 = (byte[]) pairZzh.second;
                                                    if (bArr2 != null) {
                                                        listZzj = zzfoj.zzj(bArr2);
                                                    }
                                                    str13 = str14;
                                                } else if (iZzv12 == 1885434736) {
                                                    zzamfVar.zzh(iZzg4 + 8);
                                                    fZzB = zzamfVar.zzB() / zzamfVar.zzB();
                                                    z11 = true;
                                                } else {
                                                    if (iZzv12 == 1937126244) {
                                                        int i47 = iZzg4 + 8;
                                                        while (true) {
                                                            if (i47 - iZzg4 >= i4) {
                                                                z3 = z11;
                                                                bArrCopyOfRange = null;
                                                                break;
                                                            }
                                                            zzamfVar.zzh(i47);
                                                            int iZzv13 = zzamfVar.zzv();
                                                            int i48 = iZzg4;
                                                            z3 = z11;
                                                            if (zzamfVar.zzv() == 1886547818) {
                                                                bArrCopyOfRange = Arrays.copyOfRange(zzamfVar.zzi(), i47, iZzv13 + i47);
                                                                break;
                                                            }
                                                            i47 += iZzv13;
                                                            iZzg4 = i48;
                                                            z11 = z3;
                                                        }
                                                        bArr = bArrCopyOfRange;
                                                    } else {
                                                        z3 = z11;
                                                        if (iZzv12 == 1936995172) {
                                                            int iZzn = zzamfVar.zzn();
                                                            zzamfVar.zzk(3);
                                                            if (iZzn == 0) {
                                                                int iZzn2 = zzamfVar.zzn();
                                                                if (iZzn2 == 0) {
                                                                    i46 = 0;
                                                                } else if (iZzn2 == 1) {
                                                                    i46 = 1;
                                                                } else if (iZzn2 == 2) {
                                                                    i46 = 2;
                                                                } else if (iZzn2 == 3) {
                                                                    i46 = 3;
                                                                }
                                                            }
                                                        } else {
                                                            if (iZzv12 == 1668246642) {
                                                                int iZzv14 = zzamfVar.zzv();
                                                                if (iZzv14 == 1852009592 || iZzv14 == 1852009571) {
                                                                    String str15 = str11;
                                                                    int iZzo4 = zzamfVar.zzo();
                                                                    int iZzo5 = zzamfVar.zzo();
                                                                    zzamfVar.zzk(2);
                                                                    i5 = i3;
                                                                    str11 = str15;
                                                                    zzjVar = new zzj(zzj.zza(iZzo4), true != (iZzv14 == 1852009592 && (zzamfVar.zzn() & 128) != 0) ? 2 : 1, zzj.zzb(iZzo5), null);
                                                                } else {
                                                                    String strZzf = zzqx.zzf(iZzv14);
                                                                    String str16 = str11;
                                                                    Log.w(str16, strZzf.length() != 0 ? "Unsupported color type: ".concat(strZzf) : new String("Unsupported color type: "));
                                                                    str11 = str16;
                                                                }
                                                            } else {
                                                                str11 = str11;
                                                            }
                                                            i5 = i3;
                                                        }
                                                    }
                                                    z11 = z3;
                                                }
                                                i5 = i3;
                                            }
                                            str13 = str3;
                                            i5 = i3;
                                        }
                                        z11 = z3;
                                    }
                                    i45 += i4;
                                    i42 = i42;
                                    iZzv9 = iZzv9;
                                    i3 = i5;
                                    str11 = str11;
                                }
                                str12 = str4;
                                str13 = str5;
                                listZzj = list;
                                i5 = i3;
                                i45 += i4;
                                i42 = i42;
                                iZzv9 = iZzv9;
                                i3 = i5;
                                str11 = str11;
                            }
                            i42 = i42;
                            iZzv9 = iZzv9;
                            str9 = str11;
                            if (str13 != null) {
                                zzaft zzaftVar = new zzaft();
                                i40 = i44;
                                zzaftVar.zzE(i40);
                                zzaftVar.zzN(str13);
                                zzaftVar.zzK(str12);
                                zzaftVar.zzS(iZzo2);
                                zzaftVar.zzT(iZzo3);
                                zzaftVar.zzW(fZzB);
                                i43 = i43;
                                zzaftVar.zzV(i43);
                                zzaftVar.zzX(bArr);
                                zzaftVar.zzY(i46);
                                zzaftVar.zzP(listZzj);
                                zzaftVar.zzQ(zznVarZza);
                                zzaftVar.zzZ(zzjVar);
                                zzraVar.zzb = zzaftVar.zzah();
                            } else {
                                i43 = i43;
                                i40 = i44;
                            }
                        } else if (iZzv10 == 1836069985 || iZzv10 == 1701733217 || iZzv10 == 1633889587 || iZzv10 == 1700998451 || iZzv10 == 1633889588 || iZzv10 == 1685353315 || iZzv10 == 1685353317 || iZzv10 == 1685353320 || iZzv10 == 1685353324 || iZzv10 == 1685353336 || iZzv10 == 1935764850 || iZzv10 == 1935767394 || iZzv10 == 1819304813 || iZzv10 == 1936684916 || iZzv10 == 1953984371 || iZzv10 == 778924082 || iZzv10 == 778924083 || iZzv10 == 1835557169 || iZzv10 == 1835560241 || iZzv10 == 1634492771 || iZzv10 == 1634492791 || iZzv10 == 1970037111 || iZzv10 == 1332770163 || iZzv10 == 1716281667) {
                            int i49 = iZzf;
                            zzra zzraVar2 = zzraVar;
                            str10 = str10;
                            zzrdVar = zzrdVar;
                            zzamfVar = zzamfVar8;
                            iZzf = i49;
                            pairCreate2 = pairCreate2;
                            zzqvVar3 = zzqvVar3;
                            zzg(zzamfVar8, iZzv10, iZzg2, iZzv9, i40, str10, z2, zznVar, zzraVar2, i42);
                            iZzv9 = iZzv9;
                            zzraVar = zzraVar2;
                            i43 = i43;
                            i40 = i40;
                            str9 = str9;
                            i42 = i42;
                        } else {
                            if (iZzv10 == 1414810956 || iZzv10 == 1954034535 || iZzv10 == 2004251764 || iZzv10 == 1937010800 || iZzv10 == 1664495672) {
                                zzamfVar8.zzh(iZzg2 + 16);
                                if (iZzv10 == 1414810956) {
                                    str6 = "application/ttml+xml";
                                } else {
                                    if (iZzv10 == 1954034535) {
                                        int i50 = iZzv9 - 16;
                                        byte[] bArr3 = new byte[i50];
                                        zzamfVar8.zzm(bArr3, 0, i50);
                                        zzfojVarZzj = zzfoj.zzj(bArr3);
                                        str6 = "application/x-quicktime-tx3g";
                                        j3 = Long.MAX_VALUE;
                                    } else if (iZzv10 == 2004251764) {
                                        str6 = "application/x-mp4-vtt";
                                    } else if (iZzv10 == 1937010800) {
                                        str6 = "application/ttml+xml";
                                        zzfojVarZzj = null;
                                        j3 = 0;
                                    } else {
                                        zzraVar.zzd = 1;
                                        str6 = "application/x-mp4-cea-608";
                                    }
                                    zzaft zzaftVar2 = new zzaft();
                                    zzaftVar2.zzE(i40);
                                    zzaftVar2.zzN(str6);
                                    zzaftVar2.zzG(str10);
                                    zzaftVar2.zzR(j3);
                                    zzaftVar2.zzP(zzfojVarZzj);
                                    zzraVar.zzb = zzaftVar2.zzah();
                                }
                                zzfojVarZzj = null;
                                j3 = Long.MAX_VALUE;
                                zzaft zzaftVar3 = new zzaft();
                                zzaftVar3.zzE(i40);
                                zzaftVar3.zzN(str6);
                                zzaftVar3.zzG(str10);
                                zzaftVar3.zzR(j3);
                                zzaftVar3.zzP(zzfojVarZzj);
                                zzraVar.zzb = zzaftVar3.zzah();
                            } else if (iZzv10 == 1835365492) {
                                zzamfVar8.zzh(iZzg2 + 16);
                                zzamfVar8.zzG((char) 0);
                                String strZzG = zzamfVar8.zzG((char) 0);
                                if (strZzG != null) {
                                    zzaft zzaftVar4 = new zzaft();
                                    zzaftVar4.zzE(i40);
                                    zzaftVar4.zzN(strZzG);
                                    zzraVar.zzb = zzaftVar4.zzah();
                                }
                            } else if (iZzv10 == 1667329389) {
                                zzaft zzaftVar5 = new zzaft();
                                zzaftVar5.zzE(i40);
                                zzaftVar5.zzN("application/x-camera-motion");
                                zzraVar.zzb = zzaftVar5.zzah();
                            }
                            zzamfVar = zzamfVar8;
                        }
                        zzamfVar.zzh(iZzg2 + iZzv9);
                        i42++;
                        zznVar = zznVar;
                        i40 = i40;
                        i41 = i43;
                        zzraVar = zzraVar;
                        zzamfVar8 = zzamfVar;
                        zzrdVar = zzrdVar;
                        str10 = str10;
                        iZzf = iZzf;
                        arrayList3 = arrayList4;
                        iZzv8 = iZzv8;
                        pairCreate2 = pairCreate2;
                        zzqvVar3 = zzqvVar3;
                        str9 = str9;
                    }
                    int i51 = iZzf;
                    Pair pair = pairCreate2;
                    arrayList = arrayList3;
                    zzrd zzrdVar2 = zzrdVar;
                    str = str9;
                    zzra zzraVar3 = zzraVar;
                    zzqvVar2 = zzqvVar3;
                    zzqv zzqvVarZzd5 = zzqvVar2.zzd(1701082227);
                    if (zzqvVarZzd5 == null) {
                        jArr = null;
                        jArr2 = null;
                    } else {
                        zzqw zzqwVarZzc11 = zzqvVarZzd5.zzc(1701606260);
                        if (zzqwVarZzc11 == null) {
                            pairCreate = null;
                        } else {
                            zzamf zzamfVar9 = zzqwVarZzc11.zza;
                            zzamfVar9.zzh(8);
                            int iZze3 = zzqx.zze(zzamfVar9.zzv());
                            int iZzB10 = zzamfVar9.zzB();
                            long[] jArr11 = new long[iZzB10];
                            long[] jArr12 = new long[iZzB10];
                            for (int i52 = 0; i52 < iZzB10; i52++) {
                                jArr11[i52] = iZze3 == 1 ? zzamfVar9.zzD() : zzamfVar9.zzt();
                                jArr12[i52] = iZze3 == 1 ? zzamfVar9.zzx() : zzamfVar9.zzv();
                                if (zzamfVar9.zzq() != 1) {
                                    throw new IllegalArgumentException("Unsupported media rate.");
                                }
                                zzamfVar9.zzk(2);
                            }
                            pairCreate = Pair.create(jArr11, jArr12);
                        }
                        if (pairCreate != null) {
                            jArr = (long[]) pairCreate.first;
                            jArr2 = (long[]) pairCreate.second;
                        } else {
                            jArr = null;
                            jArr2 = null;
                        }
                    }
                    if (zzraVar3.zzb != null) {
                        zzruVar = new zzru(zzrdVar2.zza, i51, ((Long) pair.first).longValue(), jZzt2, jZzH2, zzraVar3.zzb, zzraVar3.zzd, zzraVar3.zza, zzraVar3.zzc, jArr, jArr2);
                        zzflnVar = zzflnVar;
                    }
                    zzruVarApply = zzflnVar.apply(zzruVar);
                    if (zzruVarApply != null) {
                        zzqv zzqvVarZzd6 = zzqvVar2.zzd(1835297121);
                        zzqvVarZzd6.getClass();
                        zzqv zzqvVarZzd7 = zzqvVarZzd6.zzd(1835626086);
                        zzqvVarZzd7.getClass();
                        zzqvVarZzd = zzqvVarZzd7.zzd(1937007212);
                        zzqvVarZzd.getClass();
                        zzqwVarZzc = zzqvVarZzd.zzc(1937011578);
                        if (zzqwVarZzc != null) {
                            zzrcVar = new zzrb(zzqwVarZzc, zzruVarApply.zzf);
                        } else {
                            zzqwVarZzc2 = zzqvVarZzd.zzc(1937013298);
                            if (zzqwVarZzc2 != null) {
                                throw zzaha.zzb("Track has no sample table size information", null);
                            }
                            zzrcVar = new zzrc(zzqwVarZzc2);
                        }
                        iZza = zzrcVar.zza();
                        if (iZza == 0) {
                            zzrxVar2 = new zzrx(zzruVarApply, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                        } else {
                            zzqwVarZzc3 = zzqvVarZzd.zzc(1937007471);
                            if (zzqwVarZzc3 == null) {
                                zzqw zzqwVarZzc12 = zzqvVarZzd.zzc(1668232756);
                                zzqwVarZzc12.getClass();
                                zzqwVar = zzqwVarZzc12;
                                z4 = true;
                            } else {
                                zzqwVar = zzqwVarZzc3;
                                z4 = false;
                            }
                            zzamf zzamfVar10 = zzqwVar.zza;
                            zzqw zzqwVarZzc13 = zzqvVarZzd.zzc(1937011555);
                            zzqwVarZzc13.getClass();
                            zzamf zzamfVar11 = zzqwVarZzc13.zza;
                            zzqw zzqwVarZzc14 = zzqvVarZzd.zzc(1937011827);
                            zzqwVarZzc14.getClass();
                            zzamfVar2 = zzqwVarZzc14.zza;
                            zzqwVarZzc4 = zzqvVarZzd.zzc(1937011571);
                            if (zzqwVarZzc4 != null) {
                                zzamfVar3 = zzqwVarZzc4.zza;
                            } else {
                                zzamfVar3 = null;
                            }
                            zzqwVarZzc5 = zzqvVarZzd.zzc(1668576371);
                            if (zzqwVarZzc5 != null) {
                                zzamfVar4 = zzqwVarZzc5.zza;
                            } else {
                                zzamfVar4 = null;
                            }
                            zzqyVar = new zzqy(zzamfVar11, zzamfVar10, z4);
                            zzamfVar2.zzh(12);
                            iZzB = zzamfVar2.zzB() - 1;
                            iZzB2 = zzamfVar2.zzB();
                            iZzB3 = zzamfVar2.zzB();
                            if (zzamfVar4 != null) {
                                zzamfVar4.zzh(12);
                                iZzB4 = zzamfVar4.zzB();
                            } else {
                                iZzB4 = 0;
                            }
                            if (zzamfVar3 != null) {
                                zzamfVar3.zzh(12);
                                iZzB6 = zzamfVar3.zzB();
                                if (iZzB6 > 0) {
                                    i6 = -1;
                                    iZzB5 = zzamfVar3.zzB() - 1;
                                } else {
                                    i6 = -1;
                                    iZzB5 = -1;
                                    zzamfVar3 = null;
                                }
                            } else {
                                i6 = -1;
                                iZzB5 = -1;
                                iZzB6 = 0;
                            }
                            iZzb = zzrcVar.zzb();
                            String str17 = zzruVarApply.zzf.zzl;
                            if (iZzb != i6 || ((!"audio/raw".equals(str17) && !"audio/g711-mlaw".equals(str17) && !"audio/g711-alaw".equals(str17)) || iZzB != 0)) {
                                jArrCopyOf = new long[iZza];
                                iArrCopyOf = new int[iZza];
                                jArrCopyOf2 = new long[iZza];
                                i7 = iZzB6;
                                iArrCopyOf2 = new int[iZza];
                                zzruVar2 = zzruVarApply;
                                iZzB7 = iZzB2;
                                iZzv = iZzB3;
                                i8 = iZzB4;
                                i9 = iZzB5;
                                i10 = 0;
                                iZzv2 = 0;
                                i11 = 0;
                                iZzB8 = 0;
                                j4 = 0;
                                j5 = 0;
                                i12 = iZzB;
                                i13 = 0;
                                while (true) {
                                    if (i13 < iZza) {
                                        str7 = str;
                                        i14 = iZzv2;
                                        break;
                                    }
                                    zZza = true;
                                    while (true) {
                                        if (i11 != 0) {
                                            i19 = i11;
                                            break;
                                        }
                                        zZza = zzqyVar.zza();
                                        if (zZza) {
                                            i19 = 0;
                                            break;
                                        }
                                        int i53 = iZzv2;
                                        long j12 = zzqyVar.zzd;
                                        i11 = zzqyVar.zzc;
                                        j4 = j12;
                                        iZzv2 = i53;
                                        i9 = i9;
                                        iZza = iZza;
                                    }
                                    if (!zZza) {
                                        String str18 = str;
                                        Log.w(str18, "Unexpected end of chunk data");
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i13);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i13);
                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i13);
                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i13);
                                        iZza = i13;
                                        str7 = str18;
                                        i14 = iZzv2;
                                        break;
                                    }
                                    String str19 = str;
                                    if (zzamfVar4 != null) {
                                        while (iZzB8 == 0) {
                                            if (i8 > 0) {
                                                iZzB8 = 0;
                                                break;
                                            }
                                            iZzB8 = zzamfVar4.zzB();
                                            iZzv2 = zzamfVar4.zzv();
                                            i8--;
                                        }
                                        iZzB8--;
                                    }
                                    int i54 = iZzv2;
                                    jArrCopyOf[i13] = j4;
                                    long[] jArr13 = jArrCopyOf;
                                    iZzc = zzrcVar.zzc();
                                    iArrCopyOf[i13] = iZzc;
                                    if (iZzc > i10) {
                                        i10 = iZzc;
                                    }
                                    zzqy zzqyVar2 = zzqyVar;
                                    jArrCopyOf2[i13] = j5 + ((long) i54);
                                    if (zzamfVar3 == null) {
                                        i20 = 1;
                                    } else {
                                        i20 = 0;
                                    }
                                    iArrCopyOf2[i13] = i20;
                                    iZzB9 = i9;
                                    if (i13 == iZzB9) {
                                        iArrCopyOf2[i13] = 1;
                                        i7--;
                                        if (i7 > 0) {
                                            zzamfVar3.getClass();
                                            iZzB9 = zzamfVar3.zzB() - 1;
                                        }
                                    }
                                    zzamf zzamfVar12 = zzamfVar3;
                                    int i55 = iZzB9;
                                    j5 += (long) iZzv;
                                    i21 = iZzB7 - 1;
                                    if (i21 == 0) {
                                        iZzB7 = i21;
                                    } else if (i12 > 0) {
                                        i12--;
                                        iZzB7 = zzamfVar2.zzB();
                                        iZzv = zzamfVar2.zzv();
                                    } else {
                                        iZzB7 = 0;
                                    }
                                    j4 += (long) iArrCopyOf[i13];
                                    i13++;
                                    zzqyVar = zzqyVar2;
                                    zzamfVar3 = zzamfVar12;
                                    iZzv2 = i54;
                                    i9 = i55;
                                    jArrCopyOf = jArr13;
                                    str = str19;
                                    i11 = i19 - 1;
                                    iZza = iZza;
                                }
                                long j13 = j5 + ((long) i14);
                                if (zzamfVar4 != null) {
                                    z5 = true;
                                    break;
                                }
                                while (true) {
                                    if (i8 > 0) {
                                        z5 = true;
                                        break;
                                    }
                                    if (zzamfVar4.zzB() != 0) {
                                        z5 = false;
                                        break;
                                    }
                                    zzamfVar4.zzv();
                                    i8--;
                                }
                                if (i7 == 0) {
                                    i15 = i7;
                                    i16 = iZzB7;
                                    i17 = i11;
                                    zzruVar2 = zzruVar2;
                                    i18 = iZzB8;
                                } else if (iZzB7 == 0) {
                                    i16 = iZzB7;
                                    i17 = i11;
                                    zzruVar2 = zzruVar2;
                                    i18 = iZzB8;
                                    i15 = 0;
                                } else if (i11 == 0) {
                                    i17 = i11;
                                    zzruVar2 = zzruVar2;
                                    i18 = iZzB8;
                                    i15 = 0;
                                    i16 = 0;
                                } else if (i12 == 0) {
                                    if (iZzB8 == 0) {
                                        if (z5) {
                                            zzruVar2 = zzruVar2;
                                        } else {
                                            z5 = false;
                                            i15 = 0;
                                            i16 = 0;
                                            i17 = 0;
                                            i18 = 0;
                                        }
                                        j6 = j13;
                                        iArr = iArrCopyOf2;
                                        iArr2 = iArrCopyOf;
                                        jArr3 = jArrCopyOf;
                                        iZza = iZza;
                                        iMax = i10;
                                    } else {
                                        i18 = iZzB8;
                                        i15 = 0;
                                        i16 = 0;
                                        i17 = 0;
                                    }
                                    i12 = 0;
                                } else {
                                    zzruVar2 = zzruVar2;
                                    i18 = iZzB8;
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                }
                                int i56 = zzruVar2.zza;
                                if (true != z5) {
                                    str8 = ", ctts invalid";
                                } else {
                                    str8 = "";
                                }
                                StringBuilder sb2 = new StringBuilder(str8.length() + 262);
                                sb2.append("Inconsistent stbl box for track ");
                                sb2.append(i56);
                                sb2.append(": remainingSynchronizationSamples ");
                                sb2.append(i15);
                                sb2.append(", remainingSamplesAtTimestampDelta ");
                                sb2.append(i16);
                                sb2.append(", remainingSamplesInChunk ");
                                sb2.append(i17);
                                sb2.append(", remainingTimestampDeltaChanges ");
                                sb2.append(i12);
                                sb2.append(", remainingSamplesAtTimestampOffset ");
                                sb2.append(i18);
                                sb2.append(str8);
                                Log.w(str7, sb2.toString());
                                j6 = j13;
                                iArr = iArrCopyOf2;
                                iArr2 = iArrCopyOf;
                                jArr3 = jArrCopyOf;
                                iZza = iZza;
                                iMax = i10;
                            } else if (iZzB4 == 0 && iZzB6 == 0) {
                                int i57 = zzqyVar.zza;
                                long[] jArr14 = new long[i57];
                                int[] iArr9 = new int[i57];
                                while (zzqyVar.zza()) {
                                    int i58 = zzqyVar.zzb;
                                    jArr14[i58] = zzqyVar.zzd;
                                    iArr9[i58] = zzqyVar.zzc;
                                }
                                long j14 = iZzB3;
                                int i59 = 8192 / iZzb;
                                int iZzw = 0;
                                for (int i60 = 0; i60 < i57; i60++) {
                                    iZzw += zzamq.zzw(iArr9[i60], i59);
                                }
                                long[] jArr15 = new long[iZzw];
                                iArr2 = new int[iZzw];
                                long[] jArr16 = new long[iZzw];
                                int[] iArr10 = new int[iZzw];
                                int i61 = 0;
                                int i62 = 0;
                                iMax = 0;
                                int i63 = 0;
                                while (i61 < i57) {
                                    int i64 = iArr9[i61];
                                    long j15 = jArr14[i61];
                                    int i65 = i57;
                                    int i66 = i64;
                                    while (i66 > 0) {
                                        int iMin = Math.min(i59, i66);
                                        jArr15[i63] = j15;
                                        long[] jArr17 = jArr14;
                                        int i67 = iZzb * iMin;
                                        iArr2[i63] = i67;
                                        iMax = Math.max(iMax, i67);
                                        jArr16[i63] = ((long) i62) * j14;
                                        iArr10[i63] = 1;
                                        j15 += (long) iArr2[i63];
                                        i62 += iMin;
                                        i66 -= iMin;
                                        i63++;
                                        i59 = i59;
                                        jArr14 = jArr17;
                                        jArr15 = jArr15;
                                    }
                                    i61++;
                                    i57 = i65;
                                    jArr14 = jArr14;
                                }
                                j6 = j14 * ((long) i62);
                                iArr = iArr10;
                                jArrCopyOf2 = jArr16;
                                jArr3 = jArr15;
                                zzruVar2 = zzruVarApply;
                            } else {
                                iZzB = 0;
                                jArrCopyOf = new long[iZza];
                                iArrCopyOf = new int[iZza];
                                jArrCopyOf2 = new long[iZza];
                                i7 = iZzB6;
                                iArrCopyOf2 = new int[iZza];
                                zzruVar2 = zzruVarApply;
                                iZzB7 = iZzB2;
                                iZzv = iZzB3;
                                i8 = iZzB4;
                                i9 = iZzB5;
                                i10 = 0;
                                iZzv2 = 0;
                                i11 = 0;
                                iZzB8 = 0;
                                j4 = 0;
                                j5 = 0;
                                i12 = iZzB;
                                i13 = 0;
                                while (true) {
                                    if (i13 < iZza) {
                                        str7 = str;
                                        i14 = iZzv2;
                                        break;
                                    }
                                    zZza = true;
                                    while (true) {
                                        if (i11 != 0) {
                                            i19 = i11;
                                            break;
                                        }
                                        zZza = zzqyVar.zza();
                                        if (zZza) {
                                            i19 = 0;
                                            break;
                                        }
                                        int i510 = iZzv2;
                                        long j16 = zzqyVar.zzd;
                                        i11 = zzqyVar.zzc;
                                        j4 = j16;
                                        iZzv2 = i510;
                                        i9 = i9;
                                        iZza = iZza;
                                    }
                                    if (!zZza) {
                                        String str110 = str;
                                        Log.w(str110, "Unexpected end of chunk data");
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i13);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i13);
                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i13);
                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i13);
                                        iZza = i13;
                                        str7 = str110;
                                        i14 = iZzv2;
                                        break;
                                    }
                                    String str111 = str;
                                    if (zzamfVar4 != null) {
                                        while (iZzB8 == 0) {
                                            if (i8 > 0) {
                                                iZzB8 = 0;
                                                break;
                                            }
                                            iZzB8 = zzamfVar4.zzB();
                                            iZzv2 = zzamfVar4.zzv();
                                            i8--;
                                        }
                                        iZzB8--;
                                    }
                                    int i511 = iZzv2;
                                    jArrCopyOf[i13] = j4;
                                    long[] jArr18 = jArrCopyOf;
                                    iZzc = zzrcVar.zzc();
                                    iArrCopyOf[i13] = iZzc;
                                    if (iZzc > i10) {
                                        i10 = iZzc;
                                    }
                                    zzqy zzqyVar3 = zzqyVar;
                                    jArrCopyOf2[i13] = j5 + ((long) i511);
                                    if (zzamfVar3 == null) {
                                        i20 = 1;
                                    } else {
                                        i20 = 0;
                                    }
                                    iArrCopyOf2[i13] = i20;
                                    iZzB9 = i9;
                                    if (i13 == iZzB9) {
                                        iArrCopyOf2[i13] = 1;
                                        i7--;
                                        if (i7 > 0) {
                                            zzamfVar3.getClass();
                                            iZzB9 = zzamfVar3.zzB() - 1;
                                        }
                                    }
                                    zzamf zzamfVar13 = zzamfVar3;
                                    int i512 = iZzB9;
                                    j5 += (long) iZzv;
                                    i21 = iZzB7 - 1;
                                    if (i21 == 0) {
                                        iZzB7 = i21;
                                    } else if (i12 > 0) {
                                        i12--;
                                        iZzB7 = zzamfVar2.zzB();
                                        iZzv = zzamfVar2.zzv();
                                    } else {
                                        iZzB7 = 0;
                                    }
                                    j4 += (long) iArrCopyOf[i13];
                                    i13++;
                                    zzqyVar = zzqyVar3;
                                    zzamfVar3 = zzamfVar13;
                                    iZzv2 = i511;
                                    i9 = i512;
                                    jArrCopyOf = jArr18;
                                    str = str111;
                                    i11 = i19 - 1;
                                    iZza = iZza;
                                }
                                long j17 = j5 + ((long) i14);
                                if (zzamfVar4 != null) {
                                    z5 = true;
                                    break;
                                }
                                while (true) {
                                    if (i8 > 0) {
                                        z5 = true;
                                        break;
                                    }
                                    if (zzamfVar4.zzB() != 0) {
                                        z5 = false;
                                        break;
                                    }
                                    zzamfVar4.zzv();
                                    i8--;
                                }
                                if (i7 == 0) {
                                    i15 = i7;
                                    i16 = iZzB7;
                                    i17 = i11;
                                    zzruVar2 = zzruVar2;
                                    i18 = iZzB8;
                                } else if (iZzB7 == 0) {
                                    i16 = iZzB7;
                                    i17 = i11;
                                    zzruVar2 = zzruVar2;
                                    i18 = iZzB8;
                                    i15 = 0;
                                } else if (i11 == 0) {
                                    i17 = i11;
                                    zzruVar2 = zzruVar2;
                                    i18 = iZzB8;
                                    i15 = 0;
                                    i16 = 0;
                                } else if (i12 == 0) {
                                    if (iZzB8 == 0) {
                                        if (z5) {
                                            z5 = false;
                                            i15 = 0;
                                            i16 = 0;
                                            i17 = 0;
                                            i18 = 0;
                                        } else {
                                            zzruVar2 = zzruVar2;
                                        }
                                        j6 = j17;
                                        iArr = iArrCopyOf2;
                                        iArr2 = iArrCopyOf;
                                        jArr3 = jArrCopyOf;
                                        iZza = iZza;
                                        iMax = i10;
                                    } else {
                                        i18 = iZzB8;
                                        i15 = 0;
                                        i16 = 0;
                                        i17 = 0;
                                    }
                                    i12 = 0;
                                } else {
                                    zzruVar2 = zzruVar2;
                                    i18 = iZzB8;
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                }
                                int i513 = zzruVar2.zza;
                                if (true != z5) {
                                    str8 = ", ctts invalid";
                                } else {
                                    str8 = "";
                                }
                                StringBuilder sb3 = new StringBuilder(str8.length() + 262);
                                sb3.append("Inconsistent stbl box for track ");
                                sb3.append(i513);
                                sb3.append(": remainingSynchronizationSamples ");
                                sb3.append(i15);
                                sb3.append(", remainingSamplesAtTimestampDelta ");
                                sb3.append(i16);
                                sb3.append(", remainingSamplesInChunk ");
                                sb3.append(i17);
                                sb3.append(", remainingTimestampDeltaChanges ");
                                sb3.append(i12);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(i18);
                                sb3.append(str8);
                                Log.w(str7, sb3.toString());
                                j6 = j17;
                                iArr = iArrCopyOf2;
                                iArr2 = iArrCopyOf;
                                jArr3 = jArrCopyOf;
                                iZza = iZza;
                                iMax = i10;
                            }
                            jZzH = zzamq.zzH(j6, 1000000L, zzruVar2.zzc);
                            jArr4 = zzruVar2.zzh;
                            if (jArr4 == null) {
                                zzamq.zzI(jArrCopyOf2, 1000000L, zzruVar2.zzc);
                                zzrxVar2 = new zzrx(zzruVar2, jArr3, iArr2, iMax, jArrCopyOf2, iArr, jZzH);
                            } else {
                                if (jArr4.length == 1 || zzruVar2.zzb != 1 || (length2 = jArrCopyOf2.length) < 2) {
                                    i22 = iZza;
                                } else {
                                    long[] jArr19 = zzruVar2.zzi;
                                    jArr19.getClass();
                                    long j18 = jArr19[0];
                                    int i68 = iZza;
                                    long jZzH3 = j18 + zzamq.zzH(jArr4[0], zzruVar2.zzc, zzruVar2.zzd);
                                    int i69 = length2 - 1;
                                    int iZzx = zzamq.zzx(4, 0, i69);
                                    int iZzx2 = zzamq.zzx(length2 - 4, 0, i69);
                                    long j19 = jArrCopyOf2[0];
                                    if (j19 > j18 || j18 >= jArrCopyOf2[iZzx] || jArrCopyOf2[iZzx2] >= jZzH3 || jZzH3 > j6) {
                                        i22 = i68;
                                        jArr5 = zzruVar2.zzh;
                                        length = jArr5.length;
                                        if (length == 1) {
                                            if (jArr5[0] == 0) {
                                                long[] jArr20 = zzruVar2.zzi;
                                                jArr20.getClass();
                                                j10 = jArr20[0];
                                                for (i35 = 0; i35 < jArrCopyOf2.length; i35++) {
                                                    jArrCopyOf2[i35] = zzamq.zzH(jArrCopyOf2[i35] - j10, 1000000L, zzruVar2.zzc);
                                                }
                                                zzrxVar = new zzrx(zzruVar2, jArr3, iArr2, iMax, jArrCopyOf2, iArr, zzamq.zzH(j6 - j10, 1000000L, zzruVar2.zzc));
                                            } else {
                                                length = 1;
                                            }
                                        }
                                        if (zzruVar2.zzb == 1) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        iArr3 = new int[length];
                                        iArr4 = new int[length];
                                        long[] jArr21 = zzruVar2.zzi;
                                        jArr21.getClass();
                                        jArr6 = jArr21;
                                        i23 = 0;
                                        i24 = 0;
                                        i25 = 0;
                                        z7 = false;
                                        while (true) {
                                            jArr7 = zzruVar2.zzh;
                                            i26 = iMax;
                                            if (i23 < jArr7.length) {
                                                break;
                                            }
                                            long[] jArr22 = jArr3;
                                            int[] iArr11 = iArr2;
                                            j9 = jArr6[i23];
                                            if (j9 != -1) {
                                                long j20 = jArr7[i23];
                                                boolean z12 = z7;
                                                int i70 = i24;
                                                long jZzH4 = zzamq.zzH(j20, zzruVar2.zzc, zzruVar2.zzd);
                                                i32 = 1;
                                                iArr3[i23] = zzamq.zzD(jArrCopyOf2, j9, true, true);
                                                iArr4[i23] = zzamq.zzE(jArrCopyOf2, j9 + jZzH4, z6, false);
                                                while (true) {
                                                    i33 = iArr3[i23];
                                                    i34 = iArr4[i23];
                                                    if (i33 >= i34 || (iArr[i33] & i32) != 0) {
                                                        break;
                                                    }
                                                    iArr3[i23] = i33 + 1;
                                                    i32 = 1;
                                                }
                                                int i71 = i70 + (i34 - i33);
                                                if (i25 != i33) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                z7 = z12 | z10;
                                                i25 = i34;
                                                i24 = i71;
                                            }
                                            i23++;
                                            iMax = i26;
                                            iArr2 = iArr11;
                                            jArr3 = jArr22;
                                            i22 = i22;
                                        }
                                        jArr8 = jArr3;
                                        iArr5 = iArr2;
                                        boolean z13 = z7;
                                        if (i24 != i22) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        z9 = z13 | z8;
                                        if (z9) {
                                            jArr9 = new long[i24];
                                        } else {
                                            jArr9 = jArr8;
                                        }
                                        if (z9) {
                                            iArr6 = new int[i24];
                                        } else {
                                            iArr6 = iArr5;
                                        }
                                        if (true == z9) {
                                            i27 = 0;
                                        } else {
                                            i27 = i26;
                                        }
                                        if (z9) {
                                            iArr7 = new int[i24];
                                        } else {
                                            iArr7 = iArr;
                                        }
                                        jArr10 = new long[i24];
                                        int i72 = i27;
                                        i28 = 0;
                                        i29 = 0;
                                        j7 = 0;
                                        while (i28 < zzruVar2.zzh.length) {
                                            j8 = zzruVar2.zzi[i28];
                                            i30 = iArr3[i28];
                                            i31 = iArr4[i28];
                                            if (z9) {
                                                int i73 = i31 - i30;
                                                System.arraycopy(jArr8, i30, jArr9, i29, i73);
                                                iArr8 = iArr5;
                                                System.arraycopy(iArr8, i30, iArr6, i29, i73);
                                                System.arraycopy(iArr, i30, iArr7, i29, i73);
                                            } else {
                                                iArr8 = iArr5;
                                            }
                                            while (i30 < i31) {
                                                int[] iArr12 = iArr;
                                                int i74 = i31;
                                                long[] jArr23 = jArrCopyOf2;
                                                int[] iArr13 = iArr8;
                                                int[] iArr14 = iArr4;
                                                jArr10[i29] = zzamq.zzH(j7, 1000000L, zzruVar2.zzd) + zzamq.zzH(Math.max(0L, jArrCopyOf2[i30] - j8), 1000000L, zzruVar2.zzc);
                                                if (!z9 && iArr6[i29] > i72) {
                                                    i72 = iArr13[i30];
                                                }
                                                i29++;
                                                i30++;
                                                i31 = i74;
                                                iArr4 = iArr14;
                                                iArr8 = iArr13;
                                                jArrCopyOf2 = jArr23;
                                                iArr = iArr12;
                                            }
                                            int[] iArr15 = iArr8;
                                            j7 += zzruVar2.zzh[i28];
                                            i28++;
                                            iArr3 = iArr3;
                                            iArr4 = iArr4;
                                            iArr5 = iArr15;
                                            iArr = iArr;
                                        }
                                        zzrxVar2 = new zzrx(zzruVar2, jArr9, iArr6, i72, jArr10, iArr7, zzamq.zzH(j7, 1000000L, zzruVar2.zzd));
                                    } else {
                                        i22 = i68;
                                        long jZzH5 = zzamq.zzH(j18 - j19, zzruVar2.zzf.zzz, zzruVar2.zzc);
                                        long jZzH6 = zzamq.zzH(j6 - jZzH3, zzruVar2.zzf.zzz, zzruVar2.zzc);
                                        if ((jZzH5 != 0 || jZzH6 != 0) && jZzH5 <= 2147483647L && jZzH6 <= 2147483647L) {
                                            zzojVar.zza = (int) jZzH5;
                                            zzojVar.zzb = (int) jZzH6;
                                            zzamq.zzI(jArrCopyOf2, 1000000L, zzruVar2.zzc);
                                            zzrxVar = new zzrx(zzruVar2, jArr3, iArr2, iMax, jArrCopyOf2, iArr, zzamq.zzH(zzruVar2.zzh[0], 1000000L, zzruVar2.zzd));
                                        }
                                    }
                                    zzrxVar2 = zzrxVar;
                                }
                                jArr5 = zzruVar2.zzh;
                                length = jArr5.length;
                                if (length == 1) {
                                    if (jArr5[0] == 0) {
                                        long[] jArr24 = zzruVar2.zzi;
                                        jArr24.getClass();
                                        j10 = jArr24[0];
                                        while (i35 < jArrCopyOf2.length) {
                                            jArrCopyOf2[i35] = zzamq.zzH(jArrCopyOf2[i35] - j10, 1000000L, zzruVar2.zzc);
                                        }
                                        zzrxVar = new zzrx(zzruVar2, jArr3, iArr2, iMax, jArrCopyOf2, iArr, zzamq.zzH(j6 - j10, 1000000L, zzruVar2.zzc));
                                        zzrxVar2 = zzrxVar;
                                    } else {
                                        length = 1;
                                    }
                                }
                                if (zzruVar2.zzb == 1) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                iArr3 = new int[length];
                                iArr4 = new int[length];
                                long[] jArr25 = zzruVar2.zzi;
                                jArr25.getClass();
                                jArr6 = jArr25;
                                i23 = 0;
                                i24 = 0;
                                i25 = 0;
                                z7 = false;
                                while (true) {
                                    jArr7 = zzruVar2.zzh;
                                    i26 = iMax;
                                    if (i23 < jArr7.length) {
                                        break;
                                        break;
                                    }
                                    long[] jArr26 = jArr3;
                                    int[] iArr16 = iArr2;
                                    j9 = jArr6[i23];
                                    if (j9 != -1) {
                                        long j21 = jArr7[i23];
                                        boolean z14 = z7;
                                        int i75 = i24;
                                        long jZzH7 = zzamq.zzH(j21, zzruVar2.zzc, zzruVar2.zzd);
                                        i32 = 1;
                                        iArr3[i23] = zzamq.zzD(jArrCopyOf2, j9, true, true);
                                        iArr4[i23] = zzamq.zzE(jArrCopyOf2, j9 + jZzH7, z6, false);
                                        while (true) {
                                            i33 = iArr3[i23];
                                            i34 = iArr4[i23];
                                            if (i33 >= i34) {
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr3[i23] = i33 + 1;
                                            i32 = 1;
                                        }
                                        int i76 = i75 + (i34 - i33);
                                        if (i25 != i33) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        z7 = z14 | z10;
                                        i25 = i34;
                                        i24 = i76;
                                    }
                                    i23++;
                                    iMax = i26;
                                    iArr2 = iArr16;
                                    jArr3 = jArr26;
                                    i22 = i22;
                                }
                                jArr8 = jArr3;
                                iArr5 = iArr2;
                                boolean z15 = z7;
                                if (i24 != i22) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                z9 = z15 | z8;
                                if (z9) {
                                    jArr9 = new long[i24];
                                } else {
                                    jArr9 = jArr8;
                                }
                                if (z9) {
                                    iArr6 = new int[i24];
                                } else {
                                    iArr6 = iArr5;
                                }
                                if (true == z9) {
                                    i27 = 0;
                                } else {
                                    i27 = i26;
                                }
                                if (z9) {
                                    iArr7 = new int[i24];
                                } else {
                                    iArr7 = iArr;
                                }
                                jArr10 = new long[i24];
                                int i77 = i27;
                                i28 = 0;
                                i29 = 0;
                                j7 = 0;
                                while (i28 < zzruVar2.zzh.length) {
                                    j8 = zzruVar2.zzi[i28];
                                    i30 = iArr3[i28];
                                    i31 = iArr4[i28];
                                    if (z9) {
                                        int i78 = i31 - i30;
                                        System.arraycopy(jArr8, i30, jArr9, i29, i78);
                                        iArr8 = iArr5;
                                        System.arraycopy(iArr8, i30, iArr6, i29, i78);
                                        System.arraycopy(iArr, i30, iArr7, i29, i78);
                                    } else {
                                        iArr8 = iArr5;
                                    }
                                    while (i30 < i31) {
                                        int[] iArr17 = iArr;
                                        int i79 = i31;
                                        long[] jArr27 = jArrCopyOf2;
                                        int[] iArr18 = iArr8;
                                        int[] iArr19 = iArr4;
                                        jArr10[i29] = zzamq.zzH(j7, 1000000L, zzruVar2.zzd) + zzamq.zzH(Math.max(0L, jArrCopyOf2[i30] - j8), 1000000L, zzruVar2.zzc);
                                        if (!z9) {
                                        }
                                        i29++;
                                        i30++;
                                        i31 = i79;
                                        iArr4 = iArr19;
                                        iArr8 = iArr18;
                                        jArrCopyOf2 = jArr27;
                                        iArr = iArr17;
                                    }
                                    int[] iArr110 = iArr8;
                                    j7 += zzruVar2.zzh[i28];
                                    i28++;
                                    iArr3 = iArr3;
                                    iArr4 = iArr4;
                                    iArr5 = iArr110;
                                    iArr = iArr;
                                }
                                zzrxVar2 = new zzrx(zzruVar2, jArr9, iArr6, i77, jArr10, iArr7, zzamq.zzH(j7, 1000000L, zzruVar2.zzd));
                            }
                        }
                        arrayList2 = arrayList;
                        arrayList2.add(zzrxVar2);
                    } else {
                        arrayList2 = arrayList;
                    }
                }
                zzruVar = null;
                zzruVarApply = zzflnVar.apply(zzruVar);
                if (zzruVarApply != null) {
                    zzqv zzqvVarZzd8 = zzqvVar2.zzd(1835297121);
                    zzqvVarZzd8.getClass();
                    zzqv zzqvVarZzd9 = zzqvVarZzd8.zzd(1835626086);
                    zzqvVarZzd9.getClass();
                    zzqvVarZzd = zzqvVarZzd9.zzd(1937007212);
                    zzqvVarZzd.getClass();
                    zzqwVarZzc = zzqvVarZzd.zzc(1937011578);
                    if (zzqwVarZzc != null) {
                        zzrcVar = new zzrb(zzqwVarZzc, zzruVarApply.zzf);
                    } else {
                        zzqwVarZzc2 = zzqvVarZzd.zzc(1937013298);
                        if (zzqwVarZzc2 != null) {
                            throw zzaha.zzb("Track has no sample table size information", null);
                        }
                        zzrcVar = new zzrc(zzqwVarZzc2);
                    }
                    iZza = zzrcVar.zza();
                    if (iZza == 0) {
                        zzrxVar2 = new zzrx(zzruVarApply, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                    } else {
                        zzqwVarZzc3 = zzqvVarZzd.zzc(1937007471);
                        if (zzqwVarZzc3 == null) {
                            zzqw zzqwVarZzc15 = zzqvVarZzd.zzc(1668232756);
                            zzqwVarZzc15.getClass();
                            zzqwVar = zzqwVarZzc15;
                            z4 = true;
                        } else {
                            zzqwVar = zzqwVarZzc3;
                            z4 = false;
                        }
                        zzamf zzamfVar14 = zzqwVar.zza;
                        zzqw zzqwVarZzc16 = zzqvVarZzd.zzc(1937011555);
                        zzqwVarZzc16.getClass();
                        zzamf zzamfVar15 = zzqwVarZzc16.zza;
                        zzqw zzqwVarZzc17 = zzqvVarZzd.zzc(1937011827);
                        zzqwVarZzc17.getClass();
                        zzamfVar2 = zzqwVarZzc17.zza;
                        zzqwVarZzc4 = zzqvVarZzd.zzc(1937011571);
                        if (zzqwVarZzc4 != null) {
                            zzamfVar3 = zzqwVarZzc4.zza;
                        } else {
                            zzamfVar3 = null;
                        }
                        zzqwVarZzc5 = zzqvVarZzd.zzc(1668576371);
                        if (zzqwVarZzc5 != null) {
                            zzamfVar4 = zzqwVarZzc5.zza;
                        } else {
                            zzamfVar4 = null;
                        }
                        zzqyVar = new zzqy(zzamfVar15, zzamfVar14, z4);
                        zzamfVar2.zzh(12);
                        iZzB = zzamfVar2.zzB() - 1;
                        iZzB2 = zzamfVar2.zzB();
                        iZzB3 = zzamfVar2.zzB();
                        if (zzamfVar4 != null) {
                            zzamfVar4.zzh(12);
                            iZzB4 = zzamfVar4.zzB();
                        } else {
                            iZzB4 = 0;
                        }
                        if (zzamfVar3 != null) {
                            zzamfVar3.zzh(12);
                            iZzB6 = zzamfVar3.zzB();
                            if (iZzB6 > 0) {
                                i6 = -1;
                                iZzB5 = zzamfVar3.zzB() - 1;
                            } else {
                                i6 = -1;
                                iZzB5 = -1;
                                zzamfVar3 = null;
                            }
                        } else {
                            i6 = -1;
                            iZzB5 = -1;
                            iZzB6 = 0;
                        }
                        iZzb = zzrcVar.zzb();
                        String str112 = zzruVarApply.zzf.zzl;
                        if (iZzb != i6) {
                            jArrCopyOf = new long[iZza];
                            iArrCopyOf = new int[iZza];
                            jArrCopyOf2 = new long[iZza];
                            i7 = iZzB6;
                            iArrCopyOf2 = new int[iZza];
                            zzruVar2 = zzruVarApply;
                            iZzB7 = iZzB2;
                            iZzv = iZzB3;
                            i8 = iZzB4;
                            i9 = iZzB5;
                            i10 = 0;
                            iZzv2 = 0;
                            i11 = 0;
                            iZzB8 = 0;
                            j4 = 0;
                            j5 = 0;
                            i12 = iZzB;
                            i13 = 0;
                            while (true) {
                                if (i13 < iZza) {
                                    str7 = str;
                                    i14 = iZzv2;
                                    break;
                                }
                                zZza = true;
                                while (true) {
                                    if (i11 != 0) {
                                        i19 = i11;
                                        break;
                                    }
                                    zZza = zzqyVar.zza();
                                    if (zZza) {
                                        i19 = 0;
                                        break;
                                    }
                                    int i514 = iZzv2;
                                    long j110 = zzqyVar.zzd;
                                    i11 = zzqyVar.zzc;
                                    j4 = j110;
                                    iZzv2 = i514;
                                    i9 = i9;
                                    iZza = iZza;
                                }
                                if (!zZza) {
                                    String str113 = str;
                                    Log.w(str113, "Unexpected end of chunk data");
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i13);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i13);
                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i13);
                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i13);
                                    iZza = i13;
                                    str7 = str113;
                                    i14 = iZzv2;
                                    break;
                                }
                                String str114 = str;
                                if (zzamfVar4 != null) {
                                    while (iZzB8 == 0) {
                                        if (i8 > 0) {
                                            iZzB8 = 0;
                                            break;
                                        }
                                        iZzB8 = zzamfVar4.zzB();
                                        iZzv2 = zzamfVar4.zzv();
                                        i8--;
                                    }
                                    iZzB8--;
                                }
                                int i515 = iZzv2;
                                jArrCopyOf[i13] = j4;
                                long[] jArr110 = jArrCopyOf;
                                iZzc = zzrcVar.zzc();
                                iArrCopyOf[i13] = iZzc;
                                if (iZzc > i10) {
                                    i10 = iZzc;
                                }
                                zzqy zzqyVar4 = zzqyVar;
                                jArrCopyOf2[i13] = j5 + ((long) i515);
                                if (zzamfVar3 == null) {
                                    i20 = 1;
                                } else {
                                    i20 = 0;
                                }
                                iArrCopyOf2[i13] = i20;
                                iZzB9 = i9;
                                if (i13 == iZzB9) {
                                    iArrCopyOf2[i13] = 1;
                                    i7--;
                                    if (i7 > 0) {
                                        zzamfVar3.getClass();
                                        iZzB9 = zzamfVar3.zzB() - 1;
                                    }
                                }
                                zzamf zzamfVar16 = zzamfVar3;
                                int i516 = iZzB9;
                                j5 += (long) iZzv;
                                i21 = iZzB7 - 1;
                                if (i21 == 0) {
                                    iZzB7 = i21;
                                } else if (i12 > 0) {
                                    i12--;
                                    iZzB7 = zzamfVar2.zzB();
                                    iZzv = zzamfVar2.zzv();
                                } else {
                                    iZzB7 = 0;
                                }
                                j4 += (long) iArrCopyOf[i13];
                                i13++;
                                zzqyVar = zzqyVar4;
                                zzamfVar3 = zzamfVar16;
                                iZzv2 = i515;
                                i9 = i516;
                                jArrCopyOf = jArr110;
                                str = str114;
                                i11 = i19 - 1;
                                iZza = iZza;
                            }
                            long j111 = j5 + ((long) i14);
                            if (zzamfVar4 != null) {
                                z5 = true;
                                break;
                            }
                            while (true) {
                                if (i8 > 0) {
                                    z5 = true;
                                    break;
                                }
                                if (zzamfVar4.zzB() != 0) {
                                    z5 = false;
                                    break;
                                }
                                zzamfVar4.zzv();
                                i8--;
                            }
                            if (i7 == 0) {
                                i15 = i7;
                                i16 = iZzB7;
                                i17 = i11;
                                zzruVar2 = zzruVar2;
                                i18 = iZzB8;
                            } else if (iZzB7 == 0) {
                                i16 = iZzB7;
                                i17 = i11;
                                zzruVar2 = zzruVar2;
                                i18 = iZzB8;
                                i15 = 0;
                            } else if (i11 == 0) {
                                i17 = i11;
                                zzruVar2 = zzruVar2;
                                i18 = iZzB8;
                                i15 = 0;
                                i16 = 0;
                            } else if (i12 == 0) {
                                if (iZzB8 == 0) {
                                    if (z5) {
                                        z5 = false;
                                        i15 = 0;
                                        i16 = 0;
                                        i17 = 0;
                                        i18 = 0;
                                    } else {
                                        zzruVar2 = zzruVar2;
                                    }
                                    j6 = j111;
                                    iArr = iArrCopyOf2;
                                    iArr2 = iArrCopyOf;
                                    jArr3 = jArrCopyOf;
                                    iZza = iZza;
                                    iMax = i10;
                                } else {
                                    i18 = iZzB8;
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                }
                                i12 = 0;
                            } else {
                                zzruVar2 = zzruVar2;
                                i18 = iZzB8;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                            }
                            int i517 = zzruVar2.zza;
                            if (true != z5) {
                                str8 = ", ctts invalid";
                            } else {
                                str8 = "";
                            }
                            StringBuilder sb4 = new StringBuilder(str8.length() + 262);
                            sb4.append("Inconsistent stbl box for track ");
                            sb4.append(i517);
                            sb4.append(": remainingSynchronizationSamples ");
                            sb4.append(i15);
                            sb4.append(", remainingSamplesAtTimestampDelta ");
                            sb4.append(i16);
                            sb4.append(", remainingSamplesInChunk ");
                            sb4.append(i17);
                            sb4.append(", remainingTimestampDeltaChanges ");
                            sb4.append(i12);
                            sb4.append(", remainingSamplesAtTimestampOffset ");
                            sb4.append(i18);
                            sb4.append(str8);
                            Log.w(str7, sb4.toString());
                            j6 = j111;
                            iArr = iArrCopyOf2;
                            iArr2 = iArrCopyOf;
                            jArr3 = jArrCopyOf;
                            iZza = iZza;
                            iMax = i10;
                        } else {
                            jArrCopyOf = new long[iZza];
                            iArrCopyOf = new int[iZza];
                            jArrCopyOf2 = new long[iZza];
                            i7 = iZzB6;
                            iArrCopyOf2 = new int[iZza];
                            zzruVar2 = zzruVarApply;
                            iZzB7 = iZzB2;
                            iZzv = iZzB3;
                            i8 = iZzB4;
                            i9 = iZzB5;
                            i10 = 0;
                            iZzv2 = 0;
                            i11 = 0;
                            iZzB8 = 0;
                            j4 = 0;
                            j5 = 0;
                            i12 = iZzB;
                            i13 = 0;
                            while (true) {
                                if (i13 < iZza) {
                                    str7 = str;
                                    i14 = iZzv2;
                                    break;
                                }
                                zZza = true;
                                while (true) {
                                    if (i11 != 0) {
                                        i19 = i11;
                                        break;
                                    }
                                    zZza = zzqyVar.zza();
                                    if (zZza) {
                                        i19 = 0;
                                        break;
                                    }
                                    int i518 = iZzv2;
                                    long j112 = zzqyVar.zzd;
                                    i11 = zzqyVar.zzc;
                                    j4 = j112;
                                    iZzv2 = i518;
                                    i9 = i9;
                                    iZza = iZza;
                                }
                                if (!zZza) {
                                    String str115 = str;
                                    Log.w(str115, "Unexpected end of chunk data");
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i13);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i13);
                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i13);
                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i13);
                                    iZza = i13;
                                    str7 = str115;
                                    i14 = iZzv2;
                                    break;
                                }
                                String str116 = str;
                                if (zzamfVar4 != null) {
                                    while (iZzB8 == 0) {
                                        if (i8 > 0) {
                                            iZzB8 = 0;
                                            break;
                                        }
                                        iZzB8 = zzamfVar4.zzB();
                                        iZzv2 = zzamfVar4.zzv();
                                        i8--;
                                    }
                                    iZzB8--;
                                }
                                int i519 = iZzv2;
                                jArrCopyOf[i13] = j4;
                                long[] jArr111 = jArrCopyOf;
                                iZzc = zzrcVar.zzc();
                                iArrCopyOf[i13] = iZzc;
                                if (iZzc > i10) {
                                    i10 = iZzc;
                                }
                                zzqy zzqyVar5 = zzqyVar;
                                jArrCopyOf2[i13] = j5 + ((long) i519);
                                if (zzamfVar3 == null) {
                                    i20 = 1;
                                } else {
                                    i20 = 0;
                                }
                                iArrCopyOf2[i13] = i20;
                                iZzB9 = i9;
                                if (i13 == iZzB9) {
                                    iArrCopyOf2[i13] = 1;
                                    i7--;
                                    if (i7 > 0) {
                                        zzamfVar3.getClass();
                                        iZzB9 = zzamfVar3.zzB() - 1;
                                    }
                                }
                                zzamf zzamfVar17 = zzamfVar3;
                                int i5110 = iZzB9;
                                j5 += (long) iZzv;
                                i21 = iZzB7 - 1;
                                if (i21 == 0) {
                                    iZzB7 = i21;
                                } else if (i12 > 0) {
                                    i12--;
                                    iZzB7 = zzamfVar2.zzB();
                                    iZzv = zzamfVar2.zzv();
                                } else {
                                    iZzB7 = 0;
                                }
                                j4 += (long) iArrCopyOf[i13];
                                i13++;
                                zzqyVar = zzqyVar5;
                                zzamfVar3 = zzamfVar17;
                                iZzv2 = i519;
                                i9 = i5110;
                                jArrCopyOf = jArr111;
                                str = str116;
                                i11 = i19 - 1;
                                iZza = iZza;
                            }
                            long j113 = j5 + ((long) i14);
                            if (zzamfVar4 != null) {
                                z5 = true;
                                break;
                            }
                            while (true) {
                                if (i8 > 0) {
                                    z5 = true;
                                    break;
                                }
                                if (zzamfVar4.zzB() != 0) {
                                    z5 = false;
                                    break;
                                }
                                zzamfVar4.zzv();
                                i8--;
                            }
                            if (i7 == 0) {
                                i15 = i7;
                                i16 = iZzB7;
                                i17 = i11;
                                zzruVar2 = zzruVar2;
                                i18 = iZzB8;
                            } else if (iZzB7 == 0) {
                                i16 = iZzB7;
                                i17 = i11;
                                zzruVar2 = zzruVar2;
                                i18 = iZzB8;
                                i15 = 0;
                            } else if (i11 == 0) {
                                i17 = i11;
                                zzruVar2 = zzruVar2;
                                i18 = iZzB8;
                                i15 = 0;
                                i16 = 0;
                            } else if (i12 == 0) {
                                if (iZzB8 == 0) {
                                    if (z5) {
                                        z5 = false;
                                        i15 = 0;
                                        i16 = 0;
                                        i17 = 0;
                                        i18 = 0;
                                    } else {
                                        zzruVar2 = zzruVar2;
                                    }
                                    j6 = j113;
                                    iArr = iArrCopyOf2;
                                    iArr2 = iArrCopyOf;
                                    jArr3 = jArrCopyOf;
                                    iZza = iZza;
                                    iMax = i10;
                                } else {
                                    i18 = iZzB8;
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                }
                                i12 = 0;
                            } else {
                                zzruVar2 = zzruVar2;
                                i18 = iZzB8;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                            }
                            int i5111 = zzruVar2.zza;
                            if (true != z5) {
                                str8 = ", ctts invalid";
                            } else {
                                str8 = "";
                            }
                            StringBuilder sb5 = new StringBuilder(str8.length() + 262);
                            sb5.append("Inconsistent stbl box for track ");
                            sb5.append(i5111);
                            sb5.append(": remainingSynchronizationSamples ");
                            sb5.append(i15);
                            sb5.append(", remainingSamplesAtTimestampDelta ");
                            sb5.append(i16);
                            sb5.append(", remainingSamplesInChunk ");
                            sb5.append(i17);
                            sb5.append(", remainingTimestampDeltaChanges ");
                            sb5.append(i12);
                            sb5.append(", remainingSamplesAtTimestampOffset ");
                            sb5.append(i18);
                            sb5.append(str8);
                            Log.w(str7, sb5.toString());
                            j6 = j113;
                            iArr = iArrCopyOf2;
                            iArr2 = iArrCopyOf;
                            jArr3 = jArrCopyOf;
                            iZza = iZza;
                            iMax = i10;
                        }
                        jZzH = zzamq.zzH(j6, 1000000L, zzruVar2.zzc);
                        jArr4 = zzruVar2.zzh;
                        if (jArr4 == null) {
                            zzamq.zzI(jArrCopyOf2, 1000000L, zzruVar2.zzc);
                            zzrxVar2 = new zzrx(zzruVar2, jArr3, iArr2, iMax, jArrCopyOf2, iArr, jZzH);
                        } else {
                            if (jArr4.length == 1) {
                                i22 = iZza;
                                jArr5 = zzruVar2.zzh;
                                length = jArr5.length;
                                if (length == 1) {
                                    if (jArr5[0] == 0) {
                                        long[] jArr28 = zzruVar2.zzi;
                                        jArr28.getClass();
                                        j10 = jArr28[0];
                                        while (i35 < jArrCopyOf2.length) {
                                            jArrCopyOf2[i35] = zzamq.zzH(jArrCopyOf2[i35] - j10, 1000000L, zzruVar2.zzc);
                                        }
                                        zzrxVar = new zzrx(zzruVar2, jArr3, iArr2, iMax, jArrCopyOf2, iArr, zzamq.zzH(j6 - j10, 1000000L, zzruVar2.zzc));
                                    } else {
                                        length = 1;
                                    }
                                }
                                if (zzruVar2.zzb == 1) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                iArr3 = new int[length];
                                iArr4 = new int[length];
                                long[] jArr29 = zzruVar2.zzi;
                                jArr29.getClass();
                                jArr6 = jArr29;
                                i23 = 0;
                                i24 = 0;
                                i25 = 0;
                                z7 = false;
                                while (true) {
                                    jArr7 = zzruVar2.zzh;
                                    i26 = iMax;
                                    if (i23 < jArr7.length) {
                                        break;
                                        break;
                                    }
                                    long[] jArr210 = jArr3;
                                    int[] iArr111 = iArr2;
                                    j9 = jArr6[i23];
                                    if (j9 != -1) {
                                        long j22 = jArr7[i23];
                                        boolean z16 = z7;
                                        int i710 = i24;
                                        long jZzH8 = zzamq.zzH(j22, zzruVar2.zzc, zzruVar2.zzd);
                                        i32 = 1;
                                        iArr3[i23] = zzamq.zzD(jArrCopyOf2, j9, true, true);
                                        iArr4[i23] = zzamq.zzE(jArrCopyOf2, j9 + jZzH8, z6, false);
                                        while (true) {
                                            i33 = iArr3[i23];
                                            i34 = iArr4[i23];
                                            if (i33 >= i34) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr3[i23] = i33 + 1;
                                            i32 = 1;
                                        }
                                        int i711 = i710 + (i34 - i33);
                                        if (i25 != i33) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        z7 = z16 | z10;
                                        i25 = i34;
                                        i24 = i711;
                                    }
                                    i23++;
                                    iMax = i26;
                                    iArr2 = iArr111;
                                    jArr3 = jArr210;
                                    i22 = i22;
                                }
                                jArr8 = jArr3;
                                iArr5 = iArr2;
                                boolean z17 = z7;
                                if (i24 != i22) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                z9 = z17 | z8;
                                if (z9) {
                                    jArr9 = new long[i24];
                                } else {
                                    jArr9 = jArr8;
                                }
                                if (z9) {
                                    iArr6 = new int[i24];
                                } else {
                                    iArr6 = iArr5;
                                }
                                if (true == z9) {
                                    i27 = 0;
                                } else {
                                    i27 = i26;
                                }
                                if (z9) {
                                    iArr7 = new int[i24];
                                } else {
                                    iArr7 = iArr;
                                }
                                jArr10 = new long[i24];
                                int i712 = i27;
                                i28 = 0;
                                i29 = 0;
                                j7 = 0;
                                while (i28 < zzruVar2.zzh.length) {
                                    j8 = zzruVar2.zzi[i28];
                                    i30 = iArr3[i28];
                                    i31 = iArr4[i28];
                                    if (z9) {
                                        int i713 = i31 - i30;
                                        System.arraycopy(jArr8, i30, jArr9, i29, i713);
                                        iArr8 = iArr5;
                                        System.arraycopy(iArr8, i30, iArr6, i29, i713);
                                        System.arraycopy(iArr, i30, iArr7, i29, i713);
                                    } else {
                                        iArr8 = iArr5;
                                    }
                                    while (i30 < i31) {
                                        int[] iArr112 = iArr;
                                        int i714 = i31;
                                        long[] jArr211 = jArrCopyOf2;
                                        int[] iArr113 = iArr8;
                                        int[] iArr114 = iArr4;
                                        jArr10[i29] = zzamq.zzH(j7, 1000000L, zzruVar2.zzd) + zzamq.zzH(Math.max(0L, jArrCopyOf2[i30] - j8), 1000000L, zzruVar2.zzc);
                                        if (!z9) {
                                        }
                                        i29++;
                                        i30++;
                                        i31 = i714;
                                        iArr4 = iArr114;
                                        iArr8 = iArr113;
                                        jArrCopyOf2 = jArr211;
                                        iArr = iArr112;
                                    }
                                    int[] iArr115 = iArr8;
                                    j7 += zzruVar2.zzh[i28];
                                    i28++;
                                    iArr3 = iArr3;
                                    iArr4 = iArr4;
                                    iArr5 = iArr115;
                                    iArr = iArr;
                                }
                                zzrxVar2 = new zzrx(zzruVar2, jArr9, iArr6, i712, jArr10, iArr7, zzamq.zzH(j7, 1000000L, zzruVar2.zzd));
                            } else {
                                i22 = iZza;
                                jArr5 = zzruVar2.zzh;
                                length = jArr5.length;
                                if (length == 1) {
                                    if (jArr5[0] == 0) {
                                        long[] jArr212 = zzruVar2.zzi;
                                        jArr212.getClass();
                                        j10 = jArr212[0];
                                        while (i35 < jArrCopyOf2.length) {
                                            jArrCopyOf2[i35] = zzamq.zzH(jArrCopyOf2[i35] - j10, 1000000L, zzruVar2.zzc);
                                        }
                                        zzrxVar = new zzrx(zzruVar2, jArr3, iArr2, iMax, jArrCopyOf2, iArr, zzamq.zzH(j6 - j10, 1000000L, zzruVar2.zzc));
                                    } else {
                                        length = 1;
                                    }
                                }
                                if (zzruVar2.zzb == 1) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                iArr3 = new int[length];
                                iArr4 = new int[length];
                                long[] jArr213 = zzruVar2.zzi;
                                jArr213.getClass();
                                jArr6 = jArr213;
                                i23 = 0;
                                i24 = 0;
                                i25 = 0;
                                z7 = false;
                                while (true) {
                                    jArr7 = zzruVar2.zzh;
                                    i26 = iMax;
                                    if (i23 < jArr7.length) {
                                        break;
                                        break;
                                    }
                                    long[] jArr214 = jArr3;
                                    int[] iArr116 = iArr2;
                                    j9 = jArr6[i23];
                                    if (j9 != -1) {
                                        long j23 = jArr7[i23];
                                        boolean z18 = z7;
                                        int i715 = i24;
                                        long jZzH9 = zzamq.zzH(j23, zzruVar2.zzc, zzruVar2.zzd);
                                        i32 = 1;
                                        iArr3[i23] = zzamq.zzD(jArrCopyOf2, j9, true, true);
                                        iArr4[i23] = zzamq.zzE(jArrCopyOf2, j9 + jZzH9, z6, false);
                                        while (true) {
                                            i33 = iArr3[i23];
                                            i34 = iArr4[i23];
                                            if (i33 >= i34) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr3[i23] = i33 + 1;
                                            i32 = 1;
                                        }
                                        int i716 = i715 + (i34 - i33);
                                        if (i25 != i33) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        z7 = z18 | z10;
                                        i25 = i34;
                                        i24 = i716;
                                    }
                                    i23++;
                                    iMax = i26;
                                    iArr2 = iArr116;
                                    jArr3 = jArr214;
                                    i22 = i22;
                                }
                                jArr8 = jArr3;
                                iArr5 = iArr2;
                                boolean z19 = z7;
                                if (i24 != i22) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                z9 = z19 | z8;
                                if (z9) {
                                    jArr9 = new long[i24];
                                } else {
                                    jArr9 = jArr8;
                                }
                                if (z9) {
                                    iArr6 = new int[i24];
                                } else {
                                    iArr6 = iArr5;
                                }
                                if (true == z9) {
                                    i27 = 0;
                                } else {
                                    i27 = i26;
                                }
                                if (z9) {
                                    iArr7 = new int[i24];
                                } else {
                                    iArr7 = iArr;
                                }
                                jArr10 = new long[i24];
                                int i717 = i27;
                                i28 = 0;
                                i29 = 0;
                                j7 = 0;
                                while (i28 < zzruVar2.zzh.length) {
                                    j8 = zzruVar2.zzi[i28];
                                    i30 = iArr3[i28];
                                    i31 = iArr4[i28];
                                    if (z9) {
                                        int i718 = i31 - i30;
                                        System.arraycopy(jArr8, i30, jArr9, i29, i718);
                                        iArr8 = iArr5;
                                        System.arraycopy(iArr8, i30, iArr6, i29, i718);
                                        System.arraycopy(iArr, i30, iArr7, i29, i718);
                                    } else {
                                        iArr8 = iArr5;
                                    }
                                    while (i30 < i31) {
                                        int[] iArr117 = iArr;
                                        int i719 = i31;
                                        long[] jArr215 = jArrCopyOf2;
                                        int[] iArr118 = iArr8;
                                        int[] iArr119 = iArr4;
                                        jArr10[i29] = zzamq.zzH(j7, 1000000L, zzruVar2.zzd) + zzamq.zzH(Math.max(0L, jArrCopyOf2[i30] - j8), 1000000L, zzruVar2.zzc);
                                        if (!z9) {
                                        }
                                        i29++;
                                        i30++;
                                        i31 = i719;
                                        iArr4 = iArr119;
                                        iArr8 = iArr118;
                                        jArrCopyOf2 = jArr215;
                                        iArr = iArr117;
                                    }
                                    int[] iArr1110 = iArr8;
                                    j7 += zzruVar2.zzh[i28];
                                    i28++;
                                    iArr3 = iArr3;
                                    iArr4 = iArr4;
                                    iArr5 = iArr1110;
                                    iArr = iArr;
                                }
                                zzrxVar2 = new zzrx(zzruVar2, jArr9, iArr6, i717, jArr10, iArr7, zzamq.zzH(j7, 1000000L, zzruVar2.zzd));
                            }
                            zzrxVar2 = zzrxVar;
                        }
                    }
                    arrayList2 = arrayList;
                    arrayList2.add(zzrxVar2);
                } else {
                    arrayList2 = arrayList;
                }
            }
            i36 = i + 1;
            arrayList3 = arrayList2;
        }
        return arrayList3;
    }

    public static Pair<zzaiv, zzaiv> zzb(zzqw zzqwVar) {
        zzamf zzamfVar = zzqwVar.zza;
        zzamfVar.zzh(8);
        zzaiv zzaivVar = null;
        zzaiv zzaivVar2 = null;
        while (zzamfVar.zzd() >= 8) {
            int iZzg = zzamfVar.zzg();
            int iZzv = zzamfVar.zzv();
            int iZzv2 = zzamfVar.zzv();
            if (iZzv2 == 1835365473) {
                zzamfVar.zzh(iZzg);
                int i = iZzg + iZzv;
                zzamfVar.zzk(8);
                zzd(zzamfVar);
                while (true) {
                    if (zzamfVar.zzg() < i) {
                        int iZzg2 = zzamfVar.zzg();
                        int iZzv3 = zzamfVar.zzv();
                        if (zzamfVar.zzv() == 1768715124) {
                            zzamfVar.zzh(iZzg2);
                            int i2 = iZzg2 + iZzv3;
                            zzamfVar.zzk(8);
                            ArrayList arrayList = new ArrayList();
                            while (zzamfVar.zzg() < i2) {
                                zzaiu zzaiuVarZza = zzrl.zza(zzamfVar);
                                if (zzaiuVarZza != null) {
                                    arrayList.add(zzaiuVarZza);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                zzaivVar = new zzaiv(arrayList);
                                break;
                            }
                        } else {
                            zzamfVar.zzh(iZzg2 + iZzv3);
                        }
                    }
                    zzaivVar = null;
                    break;
                }
            }
            if (iZzv2 == 1936553057) {
                zzamfVar.zzh(iZzg);
                int i3 = iZzg + iZzv;
                zzamfVar.zzk(12);
                while (true) {
                    if (zzamfVar.zzg() < i3) {
                        int iZzg3 = zzamfVar.zzg();
                        int iZzv4 = zzamfVar.zzv();
                        if (zzamfVar.zzv() != 1935766900) {
                            zzamfVar.zzh(iZzg3 + iZzv4);
                        } else if (iZzv4 >= 14) {
                            zzamfVar.zzk(5);
                            int iZzn = zzamfVar.zzn();
                            float f = 120.0f;
                            if (iZzn != 12) {
                                if (iZzn != 13) {
                                }
                            } else if (iZzn == 12) {
                                f = 240.0f;
                            }
                            zzamfVar.zzk(1);
                            zzaivVar2 = new zzaiv(new zzakq(f, zzamfVar.zzn()));
                            break;
                        }
                    }
                    zzaivVar2 = null;
                    break;
                }
            }
            zzamfVar.zzh(iZzg + iZzv);
        }
        return Pair.create(zzaivVar, zzaivVar2);
    }

    public static zzaiv zzc(zzqv zzqvVar) {
        zzakk zzakkVar;
        zzqw zzqwVarZzc = zzqvVar.zzc(1751411826);
        zzqw zzqwVarZzc2 = zzqvVar.zzc(1801812339);
        zzqw zzqwVarZzc3 = zzqvVar.zzc(1768715124);
        if (zzqwVarZzc == null || zzqwVarZzc2 == null || zzqwVarZzc3 == null || zze(zzqwVarZzc.zza) != 1835299937) {
            return null;
        }
        zzamf zzamfVar = zzqwVarZzc2.zza;
        zzamfVar.zzh(12);
        int iZzv = zzamfVar.zzv();
        String[] strArr = new String[iZzv];
        for (int i = 0; i < iZzv; i++) {
            int iZzv2 = zzamfVar.zzv();
            zzamfVar.zzk(4);
            strArr[i] = zzamfVar.zzE(iZzv2 - 8, zzfll.zzc);
        }
        zzamf zzamfVar2 = zzqwVarZzc3.zza;
        zzamfVar2.zzh(8);
        ArrayList arrayList = new ArrayList();
        while (zzamfVar2.zzd() > 8) {
            int iZzg = zzamfVar2.zzg();
            int iZzv3 = zzamfVar2.zzv();
            int iZzv4 = zzamfVar2.zzv() - 1;
            if (iZzv4 < 0 || iZzv4 >= iZzv) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(iZzv4);
                Log.w("AtomParsers", sb.toString());
            } else {
                String str = strArr[iZzv4];
                int i2 = iZzg + iZzv3;
                int i3 = zzrl.zzb;
                while (true) {
                    int iZzg2 = zzamfVar2.zzg();
                    if (iZzg2 >= i2) {
                        zzakkVar = null;
                        break;
                    }
                    int iZzv5 = zzamfVar2.zzv();
                    if (zzamfVar2.zzv() == 1684108385) {
                        int iZzv6 = zzamfVar2.zzv();
                        int iZzv7 = zzamfVar2.zzv();
                        int i4 = iZzv5 - 16;
                        byte[] bArr = new byte[i4];
                        zzamfVar2.zzm(bArr, 0, i4);
                        zzakkVar = new zzakk(str, bArr, iZzv7, iZzv6);
                        break;
                    }
                    zzamfVar2.zzh(iZzg2 + iZzv5);
                }
                if (zzakkVar != null) {
                    arrayList.add(zzakkVar);
                }
            }
            zzamfVar2.zzh(iZzg + iZzv3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzaiv(arrayList);
    }

    public static void zzd(zzamf zzamfVar) {
        int iZzg = zzamfVar.zzg();
        zzamfVar.zzk(4);
        if (zzamfVar.zzv() != 1751411826) {
            iZzg += 4;
        }
        zzamfVar.zzh(iZzg);
    }

    private static int zze(zzamf zzamfVar) {
        zzamfVar.zzh(16);
        return zzamfVar.zzv();
    }

    private static int zzf(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015d  */
    /* JADX WARN: Code duplicated, block: B:101:0x015f  */
    /* JADX WARN: Code duplicated, block: B:104:0x016e  */
    /* JADX WARN: Code duplicated, block: B:107:0x018a  */
    /* JADX WARN: Code duplicated, block: B:109:0x018f  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:134:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:136:0x0217  */
    /* JADX WARN: Code duplicated, block: B:137:0x021b  */
    /* JADX WARN: Code duplicated, block: B:139:0x023d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0242  */
    /* JADX WARN: Code duplicated, block: B:142:0x0260  */
    /* JADX WARN: Code duplicated, block: B:144:0x0265  */
    /* JADX WARN: Code duplicated, block: B:145:0x027e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0283  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:152:0x0305  */
    /* JADX WARN: Code duplicated, block: B:154:0x0310  */
    /* JADX WARN: Code duplicated, block: B:156:0x031e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0326  */
    /* JADX WARN: Code duplicated, block: B:171:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0154  */
    private static void zzg(zzamf zzamfVar, int i, int i2, int i3, int i4, String str, boolean z, zzn zznVar, zzra zzraVar, int i5) throws zzaha {
        int iZzo;
        int iZzz;
        int iZzB;
        String str2;
        int i6;
        String str3;
        List<byte[]> listZzj;
        int iZzv;
        boolean z2;
        int iZzv2;
        int i7;
        int i8;
        byte[] bArr;
        List<byte[]> listZza;
        int i9;
        int i10 = i2;
        int i11 = i3;
        zzn zznVarZza = zznVar;
        zzamfVar.zzh(i10 + 16);
        if (z) {
            iZzo = zzamfVar.zzo();
            zzamfVar.zzk(6);
        } else {
            zzamfVar.zzk(8);
            iZzo = 0;
        }
        if (iZzo == 0 || iZzo == 1) {
            int iZzo2 = zzamfVar.zzo();
            zzamfVar.zzk(6);
            iZzz = zzamfVar.zzz();
            if (iZzo == 1) {
                zzamfVar.zzk(16);
            }
            iZzB = iZzo2;
        } else {
            if (iZzo != 2) {
                return;
            }
            zzamfVar.zzk(16);
            iZzz = (int) Math.round(Double.longBitsToDouble(zzamfVar.zzx()));
            iZzB = zzamfVar.zzB();
            zzamfVar.zzk(20);
        }
        int iZzg = zzamfVar.zzg();
        int iIntValue = 1701733217;
        if (i == 1701733217) {
            Pair<Integer, zzrv> pairZzi = zzi(zzamfVar, i10, i11);
            if (pairZzi != null) {
                iIntValue = ((Integer) pairZzi.first).intValue();
                zznVarZza = zznVarZza == null ? null : zznVarZza.zza(((zzrv) pairZzi.second).zzb);
                zzraVar.zza[i5] = (zzrv) pairZzi.second;
            }
            zzamfVar.zzh(iZzg);
        } else {
            iIntValue = i;
        }
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else {
            if (iIntValue != 1935767394) {
                if (iIntValue == 1819304813 || iIntValue == 1936684916) {
                    str2 = "audio/raw";
                    i6 = 2;
                } else if (iIntValue == 1953984371) {
                    i6 = 268435456;
                    str2 = "audio/raw";
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str2 = "audio/mpeg";
                } else if (iIntValue == 1835557169) {
                    str2 = "audio/mha1";
                } else if (iIntValue == 1835560241) {
                    str2 = "audio/mhm1";
                } else if (iIntValue == 1634492771) {
                    str2 = "audio/alac";
                } else if (iIntValue == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (iIntValue == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (iIntValue == 1332770163) {
                    str2 = "audio/opus";
                } else {
                    str2 = iIntValue == 1716281667 ? "audio/flac" : null;
                }
                str3 = null;
                listZzj = null;
                while (iZzg - i10 < i11) {
                    zzamfVar.zzh(iZzg);
                    iZzv = zzamfVar.zzv();
                    if (iZzv > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String str4 = "childAtomSize must be positive";
                    zzny.zza(z2, "childAtomSize must be positive");
                    iZzv2 = zzamfVar.zzv();
                    if (iZzv2 == 1835557187) {
                        int i12 = iZzv - 13;
                        byte[] bArr2 = new byte[i12];
                        zzamfVar.zzh(iZzg + 13);
                        zzamfVar.zzm(bArr2, 0, i12);
                        listZza = zzfoj.zzj(bArr2);
                    } else {
                        if (iZzv2 != 1702061171) {
                            if (!z && iZzv2 == 2002876005) {
                                int iZzg2 = zzamfVar.zzg();
                                while (true) {
                                    if (iZzg2 - iZzg >= iZzv) {
                                        i8 = -1;
                                        i7 = -1;
                                        break;
                                    }
                                    zzamfVar.zzh(iZzg2);
                                    int iZzv3 = zzamfVar.zzv();
                                    zzny.zza(iZzv3 > 0, str4);
                                    String str5 = str4;
                                    if (zzamfVar.zzv() == 1702061171) {
                                        i7 = iZzg2;
                                        i8 = -1;
                                        break;
                                    } else {
                                        iZzg2 += iZzv3;
                                        str4 = str5;
                                    }
                                }
                            } else if (iZzv2 == 1684103987) {
                                zzamfVar.zzh(iZzg + 8);
                                zzraVar.zzb = zzna.zza(zzamfVar, Integer.toString(i4), str, zznVarZza);
                            } else if (iZzv2 == 1684366131) {
                                zzamfVar.zzh(iZzg + 8);
                                zzraVar.zzb = zzna.zzb(zzamfVar, Integer.toString(i4), str, zznVarZza);
                            } else if (iZzv2 == 1684103988) {
                                zzamfVar.zzh(iZzg + 8);
                                String string = Integer.toString(i4);
                                int i13 = zznd.zza;
                                zzamfVar.zzk(1);
                                if (1 != ((zzamfVar.zzn() & 32) >> 5)) {
                                    i9 = 44100;
                                } else {
                                    i9 = 48000;
                                }
                                zzaft zzaftVar = new zzaft();
                                zzaftVar.zzD(string);
                                zzaftVar.zzN("audio/ac4");
                                zzaftVar.zzaa(2);
                                zzaftVar.zzab(i9);
                                zzaftVar.zzQ(zznVarZza);
                                zzaftVar.zzG(str);
                                zzraVar.zzb = zzaftVar.zzah();
                            } else if (iZzv2 == 1684305011) {
                                zzaft zzaftVar2 = new zzaft();
                                zzaftVar2.zzE(i4);
                                zzaftVar2.zzN(str2);
                                zzaftVar2.zzaa(iZzB);
                                zzaftVar2.zzab(iZzz);
                                zzaftVar2.zzQ(zznVarZza);
                                zzaftVar2.zzG(str);
                                zzraVar.zzb = zzaftVar2.zzah();
                            } else if (iZzv2 == 1682927731) {
                                int i14 = iZzv - 8;
                                byte[] bArr3 = zza;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i14);
                                zzamfVar.zzh(iZzg + 8);
                                zzamfVar.zzm(bArrCopyOf, bArr3.length, i14);
                                listZza = zzop.zza(bArrCopyOf);
                            } else if (iZzv2 == 1684425825) {
                                byte[] bArr4 = new byte[iZzv - 8];
                                bArr4[0] = 102;
                                bArr4[1] = 76;
                                bArr4[2] = 97;
                                bArr4[3] = 67;
                                zzamfVar.zzh(iZzg + 12);
                                zzamfVar.zzm(bArr4, 4, iZzv - 12);
                                listZzj = zzfoj.zzj(bArr4);
                            } else if (iZzv2 == 1634492771) {
                                int i15 = iZzv - 12;
                                byte[] bArr5 = new byte[i15];
                                zzamfVar.zzh(iZzg + 12);
                                zzamfVar.zzm(bArr5, 0, i15);
                                zzamf zzamfVar2 = new zzamf(bArr5);
                                zzamfVar2.zzh(9);
                                int iZzn = zzamfVar2.zzn();
                                zzamfVar2.zzh(20);
                                Pair pairCreate = Pair.create(Integer.valueOf(zzamfVar2.zzB()), Integer.valueOf(iZzn));
                                int iIntValue2 = ((Integer) pairCreate.first).intValue();
                                int iIntValue3 = ((Integer) pairCreate.second).intValue();
                                listZzj = zzfoj.zzj(bArr5);
                                iZzz = iIntValue2;
                                iZzB = iIntValue3;
                            }
                            iZzg += iZzv;
                            i10 = i2;
                            i11 = i3;
                        } else {
                            i7 = iZzg;
                            i8 = -1;
                        }
                        if (i7 != i8) {
                            Pair<String, byte[]> pairZzh = zzh(zzamfVar, i7);
                            str2 = (String) pairZzh.first;
                            bArr = (byte[]) pairZzh.second;
                            if (bArr == null) {
                                if ("audio/mp4a-latm".equals(str2)) {
                                    zzmv zzmvVarZza = zzmx.zza(bArr);
                                    iZzz = zzmvVarZza.zza;
                                    iZzB = zzmvVarZza.zzb;
                                    str3 = zzmvVarZza.zzc;
                                }
                                listZzj = zzfoj.zzj(bArr);
                            }
                        }
                        iZzg += iZzv;
                        i10 = i2;
                        i11 = i3;
                    }
                    listZzj = listZza;
                    iZzg += iZzv;
                    i10 = i2;
                    i11 = i3;
                }
                if (zzraVar.zzb == null || str2 == null) {
                }
                zzaft zzaftVar3 = new zzaft();
                zzaftVar3.zzE(i4);
                zzaftVar3.zzN(str2);
                zzaftVar3.zzK(str3);
                zzaftVar3.zzaa(iZzB);
                zzaftVar3.zzab(iZzz);
                zzaftVar3.zzac(i6);
                zzaftVar3.zzP(listZzj);
                zzaftVar3.zzQ(zznVarZza);
                zzaftVar3.zzG(str);
                zzraVar.zzb = zzaftVar3.zzah();
                return;
            }
            str2 = "audio/amr-wb";
        }
        i6 = -1;
        str3 = null;
        listZzj = null;
        while (iZzg - i10 < i11) {
            zzamfVar.zzh(iZzg);
            iZzv = zzamfVar.zzv();
            if (iZzv > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str6 = "childAtomSize must be positive";
            zzny.zza(z2, "childAtomSize must be positive");
            iZzv2 = zzamfVar.zzv();
            if (iZzv2 == 1835557187) {
                int i16 = iZzv - 13;
                byte[] bArr6 = new byte[i16];
                zzamfVar.zzh(iZzg + 13);
                zzamfVar.zzm(bArr6, 0, i16);
                listZza = zzfoj.zzj(bArr6);
            } else {
                if (iZzv2 != 1702061171) {
                    if (!z) {
                    }
                    if (iZzv2 == 1684103987) {
                        zzamfVar.zzh(iZzg + 8);
                        zzraVar.zzb = zzna.zza(zzamfVar, Integer.toString(i4), str, zznVarZza);
                    } else if (iZzv2 == 1684366131) {
                        zzamfVar.zzh(iZzg + 8);
                        zzraVar.zzb = zzna.zzb(zzamfVar, Integer.toString(i4), str, zznVarZza);
                    } else if (iZzv2 == 1684103988) {
                        zzamfVar.zzh(iZzg + 8);
                        String string2 = Integer.toString(i4);
                        int i17 = zznd.zza;
                        zzamfVar.zzk(1);
                        if (1 != ((zzamfVar.zzn() & 32) >> 5)) {
                            i9 = 44100;
                        } else {
                            i9 = 48000;
                        }
                        zzaft zzaftVar4 = new zzaft();
                        zzaftVar4.zzD(string2);
                        zzaftVar4.zzN("audio/ac4");
                        zzaftVar4.zzaa(2);
                        zzaftVar4.zzab(i9);
                        zzaftVar4.zzQ(zznVarZza);
                        zzaftVar4.zzG(str);
                        zzraVar.zzb = zzaftVar4.zzah();
                    } else {
                        if (iZzv2 == 1684305011) {
                            zzaft zzaftVar5 = new zzaft();
                            zzaftVar5.zzE(i4);
                            zzaftVar5.zzN(str2);
                            zzaftVar5.zzaa(iZzB);
                            zzaftVar5.zzab(iZzz);
                            zzaftVar5.zzQ(zznVarZza);
                            zzaftVar5.zzG(str);
                            zzraVar.zzb = zzaftVar5.zzah();
                        } else if (iZzv2 == 1682927731) {
                            int i18 = iZzv - 8;
                            byte[] bArr7 = zza;
                            byte[] bArrCopyOf2 = Arrays.copyOf(bArr7, bArr7.length + i18);
                            zzamfVar.zzh(iZzg + 8);
                            zzamfVar.zzm(bArrCopyOf2, bArr7.length, i18);
                            listZza = zzop.zza(bArrCopyOf2);
                        } else if (iZzv2 == 1684425825) {
                            byte[] bArr8 = new byte[iZzv - 8];
                            bArr8[0] = 102;
                            bArr8[1] = 76;
                            bArr8[2] = 97;
                            bArr8[3] = 67;
                            zzamfVar.zzh(iZzg + 12);
                            zzamfVar.zzm(bArr8, 4, iZzv - 12);
                            listZzj = zzfoj.zzj(bArr8);
                        } else if (iZzv2 == 1634492771) {
                            int i19 = iZzv - 12;
                            byte[] bArr9 = new byte[i19];
                            zzamfVar.zzh(iZzg + 12);
                            zzamfVar.zzm(bArr9, 0, i19);
                            zzamf zzamfVar3 = new zzamf(bArr9);
                            zzamfVar3.zzh(9);
                            int iZzn2 = zzamfVar3.zzn();
                            zzamfVar3.zzh(20);
                            Pair pairCreate2 = Pair.create(Integer.valueOf(zzamfVar3.zzB()), Integer.valueOf(iZzn2));
                            int iIntValue4 = ((Integer) pairCreate2.first).intValue();
                            int iIntValue5 = ((Integer) pairCreate2.second).intValue();
                            listZzj = zzfoj.zzj(bArr9);
                            iZzz = iIntValue4;
                            iZzB = iIntValue5;
                        }
                        iZzg += iZzv;
                        i10 = i2;
                        i11 = i3;
                    }
                    iZzg += iZzv;
                    i10 = i2;
                    i11 = i3;
                } else {
                    i7 = iZzg;
                    i8 = -1;
                }
                if (i7 != i8) {
                    Pair<String, byte[]> pairZzh2 = zzh(zzamfVar, i7);
                    str2 = (String) pairZzh2.first;
                    bArr = (byte[]) pairZzh2.second;
                    if (bArr == null) {
                        if ("audio/mp4a-latm".equals(str2)) {
                            zzmv zzmvVarZza2 = zzmx.zza(bArr);
                            iZzz = zzmvVarZza2.zza;
                            iZzB = zzmvVarZza2.zzb;
                            str3 = zzmvVarZza2.zzc;
                        }
                        listZzj = zzfoj.zzj(bArr);
                    }
                }
                iZzg += iZzv;
                i10 = i2;
                i11 = i3;
            }
            listZzj = listZza;
            iZzg += iZzv;
            i10 = i2;
            i11 = i3;
        }
        if (zzraVar.zzb == null) {
        }
    }

    private static Pair<String, byte[]> zzh(zzamf zzamfVar, int i) {
        zzamfVar.zzh(i + 12);
        zzamfVar.zzk(1);
        zzj(zzamfVar);
        zzamfVar.zzk(2);
        int iZzn = zzamfVar.zzn();
        if ((iZzn & 128) != 0) {
            zzamfVar.zzk(2);
        }
        if ((iZzn & 64) != 0) {
            zzamfVar.zzk(zzamfVar.zzo());
        }
        if ((iZzn & 32) != 0) {
            zzamfVar.zzk(2);
        }
        zzamfVar.zzk(1);
        zzj(zzamfVar);
        String strZze = zzalt.zze(zzamfVar.zzn());
        if ("audio/mpeg".equals(strZze) || "audio/vnd.dts".equals(strZze) || "audio/vnd.dts.hd".equals(strZze)) {
            return Pair.create(strZze, null);
        }
        zzamfVar.zzk(12);
        zzamfVar.zzk(1);
        int iZzj = zzj(zzamfVar);
        byte[] bArr = new byte[iZzj];
        zzamfVar.zzm(bArr, 0, iZzj);
        return Pair.create(strZze, bArr);
    }

    private static Pair<Integer, zzrv> zzi(zzamf zzamfVar, int i, int i2) throws zzaha {
        zzrv zzrvVar;
        Pair<Integer, zzrv> pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int iZzg = zzamfVar.zzg();
        while (iZzg - i < i2) {
            zzamfVar.zzh(iZzg);
            int iZzv = zzamfVar.zzv();
            zzny.zza(iZzv > 0, "childAtomSize must be positive");
            if (zzamfVar.zzv() == 1936289382) {
                int i5 = iZzg + 8;
                int i6 = 0;
                int i7 = -1;
                String strZzE = null;
                Integer numValueOf = null;
                while (i5 - iZzg < iZzv) {
                    zzamfVar.zzh(i5);
                    int iZzv2 = zzamfVar.zzv();
                    int iZzv3 = zzamfVar.zzv();
                    if (iZzv3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzamfVar.zzv());
                    } else if (iZzv3 == 1935894637) {
                        zzamfVar.zzk(4);
                        strZzE = zzamfVar.zzE(4, zzfll.zzc);
                    } else if (iZzv3 == 1935894633) {
                        i7 = i5;
                        i6 = iZzv2;
                    }
                    i5 += iZzv2;
                }
                if ("cenc".equals(strZzE) || "cbc1".equals(strZzE) || "cens".equals(strZzE) || "cbcs".equals(strZzE)) {
                    zzny.zza(numValueOf != null, "frma atom is mandatory");
                    zzny.zza(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            zzrvVar = null;
                            break;
                        }
                        zzamfVar.zzh(i8);
                        int iZzv4 = zzamfVar.zzv();
                        if (zzamfVar.zzv() == 1952804451) {
                            int iZzv5 = zzamfVar.zzv();
                            zzamfVar.zzk(1);
                            if (zzqx.zze(iZzv5) == 0) {
                                zzamfVar.zzk(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iZzn = zzamfVar.zzn();
                                int i9 = (iZzn & 240) >> 4;
                                i3 = iZzn & 15;
                                i4 = i9;
                            }
                            boolean z = zzamfVar.zzn() == 1;
                            int iZzn2 = zzamfVar.zzn();
                            byte[] bArr2 = new byte[16];
                            zzamfVar.zzm(bArr2, 0, 16);
                            if (z && iZzn2 == 0) {
                                int iZzn3 = zzamfVar.zzn();
                                byte[] bArr3 = new byte[iZzn3];
                                zzamfVar.zzm(bArr3, 0, iZzn3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            zzrvVar = new zzrv(z, strZzE, iZzn2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i8 += iZzv4;
                    }
                    zzny.zza(zzrvVar != null, "tenc atom is mandatory");
                    int i10 = zzamq.zza;
                    pairCreate = Pair.create(numValueOf, zzrvVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzg += iZzv;
        }
        return null;
    }

    private static int zzj(zzamf zzamfVar) {
        int iZzn = zzamfVar.zzn();
        int i = iZzn & 127;
        while ((iZzn & 128) == 128) {
            iZzn = zzamfVar.zzn();
            i = (i << 7) | (iZzn & 127);
        }
        return i;
    }
}
