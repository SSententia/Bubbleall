package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfq extends zzadv {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private ArrayDeque<zzfo> zzA;
    private zzfp zzB;
    private zzfo zzC;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private zzfk zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private ByteBuffer zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private boolean zzY;
    private int zzZ;
    protected zzaz zza;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private long zzaf;
    private long zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private long zzak;
    private long zzal;
    private int zzam;
    private zzgh zzan;
    private zzfg zzao;
    private zzfg zzap;
    private final zzfm zzc;
    private final zzfs zzd;
    private final float zze;
    private final zzaf zzf;
    private final zzaf zzg;
    private final zzaf zzh;
    private final zzfj zzi;
    private final zzamm<zzafv> zzj;
    private final ArrayList<Long> zzk;
    private final MediaCodec.BufferInfo zzl;
    private final long[] zzm;
    private final long[] zzn;
    private final long[] zzo;
    private zzafv zzp;
    private zzafv zzq;
    private MediaCrypto zzr;
    private boolean zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzafv zzw;
    private MediaFormat zzx;
    private boolean zzy;
    private float zzz;

    public zzfq(int i, zzfm zzfmVar, zzfs zzfsVar, boolean z, float f) {
        super(i);
        this.zzc = zzfmVar;
        zzfsVar.getClass();
        this.zzd = zzfsVar;
        this.zze = f;
        this.zzf = new zzaf(0, 0);
        this.zzg = new zzaf(0, 0);
        this.zzh = new zzaf(2, 0);
        zzfj zzfjVar = new zzfj();
        this.zzi = zzfjVar;
        this.zzj = new zzamm<>(10);
        this.zzk = new ArrayList<>();
        this.zzl = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzm = new long[10];
        this.zzn = new long[10];
        this.zzo = new long[10];
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        zzfjVar.zzi(0);
        zzfjVar.zzb.order(ByteOrder.nativeOrder());
        this.zzz = -1.0f;
        this.zzD = 0;
        this.zzZ = 0;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzP = -9223372036854775807L;
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        this.zzaa = 0;
        this.zzab = 0;
    }

    private final void zzA() {
        this.zzQ = -1;
        this.zzg.zzb = null;
    }

    protected static boolean zzY(zzafv zzafvVar) {
        return zzafvVar.zzE == 0;
    }

    private final void zza() {
        this.zzX = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzW = false;
        this.zzV = false;
    }

    private final boolean zzaA(zzafv zzafvVar) throws Throwable {
        if (zzamq.zza >= 23 && this.zzan != null && this.zzab != 3 && zzaf() != 0) {
            float fZzj = zzj(this.zzv, zzafvVar, zzau());
            float f = this.zzz;
            if (f == fZzj) {
                return true;
            }
            if (fZzj == -1.0f) {
                zzaC();
                return false;
            }
            if (f == -1.0f && fZzj <= this.zze) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fZzj);
            this.zzan.zzm(bundle);
            this.zzz = fZzj;
        }
        return true;
    }

    private final boolean zzaB() throws zzaeg {
        if (this.zzac) {
            this.zzaa = 1;
            if (this.zzF || this.zzH) {
                this.zzab = 3;
                return false;
            }
            this.zzab = 2;
        } else {
            zzaE();
        }
        return true;
    }

    private final void zzaC() throws Throwable {
        if (this.zzac) {
            this.zzaa = 1;
            this.zzab = 3;
        } else {
            zzN();
            zzI();
        }
    }

    private final void zzaE() throws zzaeg {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw zzaw(e, this.zzp, false, 6006);
        }
    }

    private final void zzaa() {
        this.zzR = -1;
        this.zzS = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private final boolean zzab() throws Throwable {
        zzgh zzghVar = this.zzan;
        boolean z = 0;
        if (zzghVar == null || this.zzaa == 2 || this.zzah) {
            return false;
        }
        if (this.zzQ < 0) {
            int iZza = zzghVar.zza();
            this.zzQ = iZza;
            if (iZza < 0) {
                return false;
            }
            this.zzg.zzb = this.zzan.zzd(iZza);
            this.zzg.zza();
        }
        if (this.zzaa == 1) {
            if (!this.zzN) {
                this.zzad = true;
                this.zzan.zzf(this.zzQ, 0, 0, 0L, 4);
                zzA();
            }
            this.zzaa = 2;
            return false;
        }
        if (this.zzL) {
            this.zzL = false;
            this.zzg.zzb.put(zzb);
            this.zzan.zzf(this.zzQ, 0, 38, 0L, 0);
            zzA();
            this.zzac = true;
            return true;
        }
        if (this.zzZ == 1) {
            for (int i = 0; i < this.zzw.zzn.size(); i++) {
                this.zzg.zzb.put(this.zzw.zzn.get(i));
            }
            this.zzZ = 2;
        }
        int iPosition = this.zzg.zzb.position();
        zzafw zzafwVarZzat = zzat();
        try {
            int iZzax = zzax(zzafwVarZzat, this.zzg, 0);
            if (zzak()) {
                this.zzag = this.zzaf;
            }
            if (iZzax == -3) {
                return false;
            }
            if (iZzax == -5) {
                if (this.zzZ == 2) {
                    this.zzg.zza();
                    this.zzZ = 1;
                }
                zzn(zzafwVarZzat);
                return true;
            }
            if (this.zzg.zzc()) {
                if (this.zzZ == 2) {
                    this.zzg.zza();
                    this.zzZ = 1;
                }
                this.zzah = true;
                if (!this.zzac) {
                    zzaD();
                    return false;
                }
                try {
                    if (!this.zzN) {
                        this.zzad = true;
                        this.zzan.zzf(this.zzQ, 0, 0, 0L, 4);
                        zzA();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw zzaw(e, this.zzp, false, zzadx.zze(e.getErrorCode()));
                }
            }
            if (!this.zzac && !this.zzg.zzd()) {
                this.zzg.zza();
                if (this.zzZ == 2) {
                    this.zzZ = 1;
                }
                return true;
            }
            boolean zZzj = this.zzg.zzj();
            if (zZzj) {
                this.zzg.zza.zzc(iPosition);
            }
            if (this.zzE && !zZzj) {
                ByteBuffer byteBuffer = this.zzg.zzb;
                byte[] bArr = zzalw.zza;
                int iPosition2 = byteBuffer.position();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int i4 = i2 + 1;
                    if (i4 >= iPosition2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i5 = byteBuffer.get(i2) & UByte.MAX_VALUE;
                    if (i3 == 3) {
                        if (i5 == 1) {
                            if ((byteBuffer.get(i4) & 31) == 7) {
                                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                                byteBufferDuplicate.position(i2 - 3);
                                byteBufferDuplicate.limit(iPosition2);
                                byteBuffer.position(0);
                                byteBuffer.put(byteBufferDuplicate);
                                break;
                            }
                            i5 = 1;
                        }
                    } else if (i5 == 0) {
                        i3++;
                    }
                    if (i5 != 0) {
                        i3 = 0;
                    }
                    i2 = i4;
                }
                if (this.zzg.zzb.position() == 0) {
                    return true;
                }
                this.zzE = false;
            }
            zzaf zzafVar = this.zzg;
            long jZzb = zzafVar.zzd;
            zzfk zzfkVar = this.zzO;
            if (zzfkVar != null) {
                jZzb = zzfkVar.zzb(this.zzp, zzafVar);
                this.zzaf = Math.max(this.zzaf, this.zzO.zzc(this.zzp));
            }
            long j = jZzb;
            if (this.zzg.zzb()) {
                this.zzk.add(Long.valueOf(j));
            }
            if (this.zzaj) {
                this.zzj.zza(j, this.zzp);
                this.zzaj = false;
            }
            this.zzaf = Math.max(this.zzaf, j);
            this.zzg.zzk();
            if (this.zzg.zze()) {
                zzU(this.zzg);
            }
            zzB(this.zzg);
            try {
                if (zZzj) {
                    this.zzan.zzg(this.zzQ, 0, this.zzg.zza, j, 0);
                } else {
                    this.zzan.zzf(this.zzQ, 0, this.zzg.zzb.limit(), j, 0);
                }
                zzA();
                this.zzac = true;
                this.zzZ = 0;
                zzaz zzazVar = this.zza;
                z = zzazVar.zzc + 1;
                zzazVar.zzc = z;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw zzaw(e2, this.zzp, z, zzadx.zze(e2.getErrorCode()));
            }
        } catch (zzae e3) {
            zzm(e3);
            zzp(0);
            zzb();
            return true;
        }
    }

    private final void zzb() {
        try {
            this.zzan.zzj();
        } finally {
            zzR();
        }
    }

    private final boolean zzp(int i) throws Throwable {
        zzafw zzafwVarZzat = zzat();
        this.zzf.zza();
        int iZzax = zzax(zzafwVarZzat, this.zzf, i | 4);
        if (iZzax == -5) {
            zzn(zzafwVarZzat);
            return true;
        }
        if (iZzax != -4 || !this.zzf.zzc()) {
            return false;
        }
        this.zzah = true;
        zzaD();
        return false;
    }

    private final boolean zzy(long j) {
        return this.zzt == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.zzt;
    }

    private final boolean zzz() {
        return this.zzR >= 0;
    }

    protected void zzB(zzaf zzafVar) throws zzaeg {
        throw null;
    }

    protected void zzC() {
    }

    protected void zzD() throws zzaeg {
    }

    protected abstract boolean zzF(long j, long j2, zzgh zzghVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzafv zzafvVar) throws zzaeg;

    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahw
    public final int zzG() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    public final int zzH(zzafv zzafvVar) throws zzaeg {
        try {
            return zzd(this.zzd, zzafvVar);
        } catch (zzfy e) {
            throw zzaw(e, zzafvVar, false, 4002);
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x024a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0306  */
    /* JADX WARN: Code duplicated, block: B:225:0x0381 A[Catch: Exception -> 0x0385, TryCatch #4 {Exception -> 0x0385, blocks: (B:48:0x00be, B:52:0x00d6, B:56:0x00de, B:59:0x00ee, B:61:0x00f8, B:62:0x0101, B:64:0x0106, B:66:0x0112, B:68:0x011d, B:69:0x0127, B:70:0x0146, B:73:0x015c, B:75:0x0162, B:77:0x016c, B:79:0x0176, B:81:0x0180, B:100:0x01cd, B:102:0x01d7, B:104:0x01df, B:108:0x01ea, B:110:0x01f4, B:112:0x01f8, B:114:0x0200, B:116:0x0208, B:118:0x020c, B:120:0x0216, B:122:0x021e, B:127:0x0228, B:129:0x0230, B:133:0x023b, B:135:0x0241, B:151:0x0276, B:153:0x027c, B:157:0x0287, B:159:0x028d, B:161:0x0295, B:163:0x029f, B:165:0x02a9, B:167:0x02b3, B:169:0x02bd, B:171:0x02c7, B:173:0x02d1, B:177:0x02de, B:179:0x02e6, B:181:0x02ea, B:185:0x02f5, B:187:0x02fd, B:209:0x0344, B:211:0x0350, B:212:0x0357, B:214:0x035e, B:215:0x0367, B:191:0x0308, B:193:0x030e, B:195:0x0316, B:197:0x031a, B:199:0x0322, B:201:0x032a, B:203:0x0334, B:205:0x033e, B:139:0x024c, B:141:0x0250, B:143:0x025a, B:145:0x0264, B:147:0x026c, B:84:0x018c, B:86:0x0192, B:88:0x019a, B:90:0x01a2, B:92:0x01ac, B:94:0x01b6, B:96:0x01c0, B:225:0x0381, B:226:0x0384, B:67:0x0117, B:60:0x00f3, B:51:0x00ca), top: B:248:0x00be, outer: #3 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.media.MediaCrypto, android.view.Surface, com.google.android.gms.internal.ads.zzgg] */
    /* JADX WARN: Type inference failed for: r10v2 */
    protected final void zzI() throws Throwable {
        zzafv zzafvVar;
        MediaCodec mediaCodec;
        int i;
        boolean z;
        boolean z2;
        if (this.zzan != null || this.zzV || (zzafvVar = this.zzp) == null) {
            return;
        }
        if (this.zzap == null && zzf(zzafvVar)) {
            zzafv zzafvVar2 = this.zzp;
            zza();
            String str = zzafvVar2.zzl;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzi.zzl(32);
            } else {
                this.zzi.zzl(1);
            }
            this.zzV = true;
            return;
        }
        this.zzao = this.zzap;
        String str2 = this.zzp.zzl;
        int i2 = 0;
        if (this.zzao != null && zzfh.zza) {
            zzey zzeyVarZza = this.zzao.zza();
            throw zzaw(zzeyVarZza, this.zzp, false, zzeyVarZza.zza);
        }
        try {
            ArrayDeque<zzfo> arrayDeque = 0;
            if (this.zzA == null) {
                try {
                    List<zzfo> listZze = zze(this.zzd, this.zzp, false);
                    listZze.isEmpty();
                    this.zzA = new ArrayDeque<>();
                    if (!listZze.isEmpty()) {
                        this.zzA.add(listZze.get(0));
                    }
                    this.zzB = null;
                } catch (zzfy e) {
                    throw new zzfp(this.zzp, (Throwable) e, false, -49998);
                }
            }
            if (this.zzA.isEmpty()) {
                throw new zzfp(this.zzp, (Throwable) null, false, -49999);
            }
            while (this.zzan == null) {
                zzfo zzfoVarPeekFirst = this.zzA.peekFirst();
                if (!zzJ(zzfoVarPeekFirst)) {
                    return;
                }
                try {
                    String str3 = zzfoVarPeekFirst.zza;
                    float f = -1.0f;
                    float fZzj = zzamq.zza < 23 ? -1.0f : zzj(this.zzv, this.zzp, zzau());
                    if (fZzj > this.zze) {
                        f = fZzj;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    String strValueOf = String.valueOf(str3);
                    zzamo.zza(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
                    zzfl zzflVarZzg = zzg(zzfoVarPeekFirst, this.zzp, arrayDeque, f);
                    try {
                        zzfo zzfoVar = zzflVarZzg.zza;
                        zzfoVar.getClass();
                        String str4 = zzfoVar.zza;
                        String strValueOf2 = String.valueOf(str4);
                        zzamo.zza(strValueOf2.length() != 0 ? "createCodec:".concat(strValueOf2) : new String("createCodec:"));
                        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str4);
                        zzamo.zzb();
                        try {
                            zzamo.zza("configureCodec");
                            mediaCodecCreateByCodecName.configure(zzflVarZzg.zzb, zzflVarZzg.zzd, (MediaCrypto) arrayDeque, i2);
                            zzamo.zzb();
                            zzamo.zza("startCodec");
                            mediaCodecCreateByCodecName.start();
                            zzamo.zzb();
                            zzgh zzghVar = new zzgh(mediaCodecCreateByCodecName, arrayDeque, arrayDeque);
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            this.zzan = zzghVar;
                            this.zzC = zzfoVarPeekFirst;
                            this.zzz = f;
                            this.zzw = this.zzp;
                            if (zzamq.zza <= 25 && "OMX.Exynos.avc.dec.secure".equals(str3) && (zzamq.zzd.startsWith("SM-T585") || zzamq.zzd.startsWith("SM-A510") || zzamq.zzd.startsWith("SM-A520") || zzamq.zzd.startsWith("SM-J700"))) {
                                i = 2;
                            } else {
                                i = (zzamq.zza >= 24 || !(("OMX.Nvidia.h264.decode".equals(str3) || "OMX.Nvidia.h264.decode.secure".equals(str3)) && ("flounder".equals(zzamq.zzb) || "flounder_lte".equals(zzamq.zzb) || "grouper".equals(zzamq.zzb) || "tilapia".equals(zzamq.zzb)))) ? i2 : 1;
                            }
                            this.zzD = i;
                            this.zzE = (zzamq.zza < 21 && this.zzw.zzn.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str3)) ? 1 : i2;
                            this.zzF = zzamq.zza < 18 || (zzamq.zza == 18 && ("OMX.SEC.avc.dec".equals(str3) || "OMX.SEC.avc.dec.secure".equals(str3))) || (zzamq.zza == 19 && zzamq.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str3) || "OMX.Exynos.avc.dec.secure".equals(str3)));
                            this.zzG = zzamq.zza == 29 && "c2.android.aac.decoder".equals(str3);
                            if (zzamq.zza <= 23 && "OMX.google.vorbis.decoder".equals(str3)) {
                                z = true;
                            } else if (zzamq.zza > 19 || !(("hb2000".equals(zzamq.zzb) || "stvm8".equals(zzamq.zzb)) && ("OMX.amlogic.avc.decoder.awesome".equals(str3) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str3)))) {
                                z = false;
                            } else {
                                z = true;
                            }
                            this.zzH = z;
                            this.zzI = zzamq.zza == 21 && "OMX.google.aac.decoder".equals(str3);
                            this.zzJ = zzamq.zza < 21 && "OMX.SEC.mp3.dec".equals(str3) && "samsung".equals(zzamq.zzc) && (zzamq.zzb.startsWith("baffin") || zzamq.zzb.startsWith("grand") || zzamq.zzb.startsWith("fortuna") || zzamq.zzb.startsWith("gprimelte") || zzamq.zzb.startsWith("j2y18lte") || zzamq.zzb.startsWith("ms01"));
                            this.zzK = zzamq.zza <= 18 && this.zzw.zzy == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str3);
                            String str5 = zzfoVarPeekFirst.zza;
                            if (zzamq.zza <= 25 && "OMX.rk.video_decoder.avc".equals(str5)) {
                                z2 = true;
                            } else if ((zzamq.zza > 17 || !"OMX.allwinner.video.decoder.avc".equals(str5)) && ((zzamq.zza > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str5) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str5))) && !("Amazon".equals(zzamq.zzc) && "AFTS".equals(zzamq.zzd) && zzfoVarPeekFirst.zzf))) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            this.zzN = z2;
                            if ("c2.android.mp3.decoder".equals(zzfoVarPeekFirst.zza)) {
                                this.zzO = new zzfk();
                            }
                            if (zzaf() == 2) {
                                this.zzP = SystemClock.elapsedRealtime() + 1000;
                            }
                            this.zza.zza++;
                            zzk(str3, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                        } catch (IOException e2) {
                            e = e2;
                            mediaCodec = mediaCodecCreateByCodecName;
                            if (mediaCodec != null) {
                                mediaCodec.release();
                            }
                            throw e;
                        } catch (RuntimeException e3) {
                            e = e3;
                            mediaCodec = mediaCodecCreateByCodecName;
                            if (mediaCodec != null) {
                                mediaCodec.release();
                            }
                            throw e;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        mediaCodec = null;
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    } catch (RuntimeException e5) {
                        e = e5;
                        mediaCodec = null;
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (Exception e6) {
                    String strValueOf3 = String.valueOf(zzfoVarPeekFirst);
                    String.valueOf(strValueOf3).length();
                    zzaln.zza("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(strValueOf3)), e6);
                    this.zzA.removeFirst();
                    zzfp zzfpVar = new zzfp(this.zzp, (Throwable) e6, false, zzfoVarPeekFirst);
                    zzm(zzfpVar);
                    zzfp zzfpVar2 = this.zzB;
                    if (zzfpVar2 == null) {
                        this.zzB = zzfpVar;
                    } else {
                        this.zzB = zzfp.zza(zzfpVar2, zzfpVar);
                    }
                    if (this.zzA.isEmpty()) {
                        throw this.zzB;
                    }
                }
                i2 = 0;
                arrayDeque = 0;
            }
            this.zzA = arrayDeque;
        } catch (zzfp e7) {
            throw zzaw(e7, this.zzp, false, 4001);
        }
    }

    protected boolean zzJ(zzfo zzfoVar) {
        return true;
    }

    protected final zzfo zzK() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    protected final void zzL(zzafv[] zzafvVarArr, long j, long j2) throws zzaeg {
        if (this.zzal == -9223372036854775807L) {
            zzakt.zzd(this.zzak == -9223372036854775807L);
            this.zzak = j;
            this.zzal = j2;
            return;
        }
        int i = this.zzam;
        if (i == 10) {
            long j3 = this.zzn[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.zzam = i + 1;
        }
        long[] jArr = this.zzm;
        int i2 = this.zzam - 1;
        jArr[i2] = j;
        this.zzn[i2] = j2;
        this.zzo[i2] = this.zzaf;
    }

    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahv
    public void zzM(float f, float f2) throws Throwable {
        this.zzu = f;
        this.zzv = f2;
        zzaA(this.zzw);
    }

    protected final void zzN() {
        try {
            zzgh zzghVar = this.zzan;
            if (zzghVar != null) {
                zzghVar.zzk();
                this.zza.zzb++;
                zzl(this.zzC.zza);
            }
        } finally {
            this.zzan = null;
            this.zzr = null;
            this.zzao = null;
            zzS();
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9781. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zzO(long r24, long r26) throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfq.zzO(long, long):void");
    }

    protected final boolean zzP() throws Throwable {
        boolean zZzQ = zzQ();
        if (zZzQ) {
            zzI();
        }
        return zZzQ;
    }

    protected void zzR() {
        zzA();
        zzaa();
        this.zzP = -9223372036854775807L;
        this.zzad = false;
        this.zzac = false;
        this.zzL = false;
        this.zzM = false;
        this.zzT = false;
        this.zzU = false;
        this.zzk.clear();
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        zzfk zzfkVar = this.zzO;
        if (zzfkVar != null) {
            zzfkVar.zza();
        }
        this.zzaa = 0;
        this.zzab = 0;
        this.zzZ = this.zzY ? 1 : 0;
    }

    protected final void zzS() {
        zzR();
        this.zzO = null;
        this.zzA = null;
        this.zzC = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = false;
        this.zzae = false;
        this.zzz = -1.0f;
        this.zzD = 0;
        this.zzE = false;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzN = false;
        this.zzY = false;
        this.zzZ = 0;
        this.zzs = false;
    }

    protected zzfn zzT(Throwable th, zzfo zzfoVar) {
        return new zzfn(th, zzfoVar);
    }

    protected void zzU(zzaf zzafVar) throws zzaeg {
    }

    protected void zzV(long j) {
        while (true) {
            int i = this.zzam;
            if (i == 0 || j < this.zzo[0]) {
                return;
            }
            long[] jArr = this.zzm;
            this.zzak = jArr[0];
            this.zzal = this.zzn[0];
            int i2 = i - 1;
            this.zzam = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.zzn;
            System.arraycopy(jArr2, 1, jArr2, 0, this.zzam);
            long[] jArr3 = this.zzo;
            System.arraycopy(jArr3, 1, jArr3, 0, this.zzam);
            zzC();
        }
    }

    protected final float zzW() {
        return this.zzu;
    }

    protected final long zzX() {
        return this.zzal;
    }

    protected final zzgh zzZ() {
        return this.zzan;
    }

    protected abstract int zzd(zzfs zzfsVar, zzafv zzafvVar) throws zzfy;

    protected abstract List<zzfo> zze(zzfs zzfsVar, zzafv zzafvVar, boolean z) throws zzfy;

    protected boolean zzf(zzafv zzafvVar) {
        return false;
    }

    protected abstract zzfl zzg(zzfo zzfoVar, zzafv zzafvVar, MediaCrypto mediaCrypto, float f);

    protected zzba zzh(zzfo zzfoVar, zzafv zzafvVar, zzafv zzafvVar2) {
        throw null;
    }

    protected float zzj(float f, zzafv zzafvVar, zzafv[] zzafvVarArr) {
        throw null;
    }

    protected void zzk(String str, long j, long j2) {
        throw null;
    }

    protected void zzl(String str) {
        throw null;
    }

    protected void zzm(Exception exc) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    protected zzba zzn(zzafw zzafwVar) throws zzaeg {
        int i;
        boolean z = true;
        this.zzaj = true;
        zzafv zzafvVar = zzafwVar.zza;
        zzafvVar.getClass();
        if (zzafvVar.zzl == null) {
            throw zzaw(new IllegalArgumentException(), zzafvVar, false, 4005);
        }
        zzfg zzfgVar = zzafwVar.zzb;
        this.zzap = zzfgVar;
        this.zzp = zzafvVar;
        if (this.zzV) {
            this.zzX = true;
            return null;
        }
        zzgh zzghVar = this.zzan;
        if (zzghVar == null) {
            this.zzA = null;
            zzI();
            return null;
        }
        zzfo zzfoVar = this.zzC;
        zzafv zzafvVar2 = this.zzw;
        zzfg zzfgVar2 = this.zzao;
        if (zzfgVar2 != zzfgVar) {
            if (zzfgVar != null && zzfgVar2 != null && zzamq.zza >= 23 && !zzadx.zze.equals(zzadx.zza)) {
                zzadx.zze.equals(zzadx.zza);
            }
            zzaC();
            return new zzba(zzfoVar.zza, zzafvVar2, zzafvVar, 0, 128);
        }
        zzakt.zzd(zzfgVar == zzfgVar2 || zzamq.zza >= 23);
        zzba zzbaVarZzh = zzh(zzfoVar, zzafvVar2, zzafvVar);
        int i2 = zzbaVarZzh.zzd;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (zzaA(zzafvVar)) {
                        this.zzw = zzafvVar;
                        if (zzfgVar != zzfgVar2 && !zzaB()) {
                            i = 2;
                        }
                    } else {
                        i = 16;
                    }
                } else if (zzaA(zzafvVar)) {
                    this.zzY = true;
                    this.zzZ = 1;
                    int i3 = this.zzD;
                    if (i3 != 2 && (i3 != 1 || zzafvVar.zzq != zzafvVar2.zzq || zzafvVar.zzr != zzafvVar2.zzr)) {
                        z = false;
                    }
                    this.zzL = z;
                    this.zzw = zzafvVar;
                    if (zzfgVar != zzfgVar2 && !zzaB()) {
                        i = 2;
                    }
                } else {
                    i = 16;
                }
            } else if (zzaA(zzafvVar)) {
                this.zzw = zzafvVar;
                if (zzfgVar != zzfgVar2) {
                    if (!zzaB()) {
                        i = 2;
                    }
                } else if (this.zzac) {
                    this.zzaa = 1;
                    if (this.zzF || this.zzH) {
                        this.zzab = 3;
                        i = 2;
                    } else {
                        this.zzab = 1;
                    }
                }
            } else {
                i = 16;
            }
            return (zzbaVarZzh.zzd != 0 || (this.zzan == zzghVar && this.zzab != 3)) ? zzbaVarZzh : new zzba(zzfoVar.zza, zzafvVar2, zzafvVar, 0, i);
        }
        zzaC();
        i = 0;
        if (zzbaVarZzh.zzd != 0) {
        }
    }

    protected void zzo(zzafv zzafvVar, MediaFormat mediaFormat) throws zzaeg {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    protected void zzq(boolean z, boolean z2) throws zzaeg {
        this.zza = new zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    protected void zzr(long j, boolean z) throws zzaeg {
        this.zzah = false;
        this.zzai = false;
        if (this.zzV) {
            this.zzi.zza();
            this.zzh.zza();
            this.zzW = false;
        } else {
            zzP();
        }
        if (this.zzj.zzc() > 0) {
            this.zzaj = true;
        }
        this.zzj.zzb();
        int i = this.zzam;
        if (i != 0) {
            int i2 = i - 1;
            this.zzal = this.zzn[i2];
            this.zzak = this.zzm[i2];
            this.zzam = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    protected void zzu() {
        this.zzp = null;
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        this.zzam = 0;
        zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    protected void zzv() {
        try {
            zza();
            zzN();
        } finally {
            this.zzap = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public boolean zzw() {
        return this.zzai;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public boolean zzx() {
        if (this.zzp == null) {
            return false;
        }
        if (zzaz() || zzz()) {
            return true;
        }
        return this.zzP != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzP;
    }

    protected final boolean zzQ() {
        if (this.zzan == null) {
            return false;
        }
        if (this.zzab == 3 || this.zzF || ((this.zzG && !this.zzae) || (this.zzH && this.zzad))) {
            zzN();
            return true;
        }
        zzb();
        return false;
    }

    private final void zzaD() throws Throwable {
        int i = this.zzab;
        if (i == 1) {
            zzb();
            return;
        }
        if (i == 2) {
            zzb();
            zzaE();
        } else if (i != 3) {
            this.zzai = true;
            zzD();
        } else {
            zzN();
            zzI();
        }
    }
}
