package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzen implements zzdw {
    private ByteBuffer[] zzA;
    private ByteBuffer zzB;
    private ByteBuffer zzC;
    private byte[] zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private int zzK;
    private zzh zzL;
    private long zzM;
    private boolean zzN;
    private boolean zzO;
    private final zzef zzP;
    private final zzec zza;
    private final zzew zzb;
    private final zzde[] zzc;
    private final zzde[] zzd;
    private final ConditionVariable zze;
    private final zzea zzf;
    private final ArrayDeque<zzeg> zzg;
    private zzem zzh;
    private final zzei<zzds> zzi;
    private final zzei<zzdv> zzj;
    private zzdt zzk;
    private zzee zzl;
    private zzee zzm;
    private AudioTrack zzn;
    private zzg zzo;
    private zzeg zzp;
    private zzeg zzq;
    private final zzahf zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private boolean zzv;
    private boolean zzw;
    private long zzx;
    private float zzy;
    private zzde[] zzz;

    public zzen(zzdb zzdbVar, zzde[] zzdeVarArr, boolean z) {
        zzef zzefVar = new zzef(zzdeVarArr);
        this.zzP = zzefVar;
        int i = zzamq.zza;
        this.zze = new ConditionVariable(true);
        this.zzf = new zzea(new zzej(this, null));
        zzec zzecVar = new zzec();
        this.zza = zzecVar;
        zzew zzewVar = new zzew();
        this.zzb = zzewVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new zzes(), zzecVar, zzewVar);
        Collections.addAll(arrayList, zzefVar.zza());
        this.zzc = (zzde[]) arrayList.toArray(new zzde[0]);
        this.zzd = new zzde[]{new zzeo()};
        this.zzy = 1.0f;
        this.zzo = zzg.zza;
        this.zzK = 0;
        this.zzL = new zzh(0, 0.0f);
        this.zzq = new zzeg(zzahf.zza, false, 0L, 0L, null);
        this.zzr = zzahf.zza;
        this.zzF = -1;
        this.zzz = new zzde[0];
        this.zzA = new ByteBuffer[0];
        this.zzg = new ArrayDeque<>();
        this.zzi = new zzei<>(100L);
        this.zzj = new zzei<>(100L);
    }

    private final void zzD() {
        int i = 0;
        while (true) {
            zzde[] zzdeVarArr = this.zzz;
            if (i >= zzdeVarArr.length) {
                return;
            }
            zzde zzdeVar = zzdeVarArr[i];
            zzdeVar.zzg();
            this.zzA[i] = zzdeVar.zze();
            i++;
        }
    }

    private final void zzE(long j) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.zzz.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzA[i - 1];
            } else {
                byteBuffer = this.zzB;
                if (byteBuffer == null) {
                    byteBuffer = zzde.zza;
                }
            }
            if (i == length) {
                zzF(byteBuffer, j);
            } else {
                zzde zzdeVar = this.zzz[i];
                if (i > this.zzF) {
                    zzdeVar.zzc(byteBuffer);
                }
                ByteBuffer byteBufferZze = zzdeVar.zze();
                this.zzA[i] = byteBufferZze;
                if (byteBufferZze.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    private final void zzF(ByteBuffer byteBuffer, long j) throws Exception {
        int iWrite;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzC;
            boolean z = true;
            if (byteBuffer2 != null) {
                zzakt.zza(byteBuffer2 == byteBuffer);
            } else {
                this.zzC = byteBuffer;
                if (zzamq.zza < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.zzD;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.zzD = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.zzD, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.zzE = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (zzamq.zza < 21) {
                int iZzf = this.zzf.zzf(this.zzt);
                if (iZzf > 0) {
                    iWrite = this.zzn.write(this.zzD, this.zzE, Math.min(iRemaining2, iZzf));
                    if (iWrite > 0) {
                        this.zzE += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else {
                iWrite = this.zzn.write(byteBuffer, iRemaining2, 1);
            }
            this.zzM = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                if ((zzamq.zza < 24 || iWrite != -6) && iWrite != -32) {
                    z = false;
                }
                zzdv zzdvVar = new zzdv(iWrite, this.zzm.zza, z);
                zzdt zzdtVar = this.zzk;
                if (zzdtVar != null) {
                    zzdtVar.zzb(zzdvVar);
                }
                if (zzdvVar.zza) {
                    throw zzdvVar;
                }
                this.zzj.zza(zzdvVar);
                return;
            }
            this.zzj.zzb();
            if (zzP(this.zzn) && this.zzI && this.zzk != null && iWrite < iRemaining2 && !this.zzO) {
                long jZzg = this.zzf.zzg(0L);
                zzep zzepVar = (zzep) this.zzk;
                if (zzepVar.zza.zzl != null) {
                    zzepVar.zza.zzl.zza(jZzg);
                }
            }
            int i = this.zzm.zzc;
            this.zzt += (long) iWrite;
            if (iWrite == iRemaining2) {
                this.zzC = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final boolean zzG() throws com.google.android.gms.internal.ads.zzdv {
        /*
            r9 = this;
            int r0 = r9.zzF
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.zzF = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.zzF
            com.google.android.gms.internal.ads.zzde[] r5 = r9.zzz
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.zzd()
        L1f:
            r9.zzE(r7)
            boolean r0 = r4.zzf()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.zzF
            int r0 = r0 + r1
            r9.zzF = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.zzC
            if (r0 == 0) goto L3b
            r9.zzF(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzC
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.zzF = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzen.zzG():boolean");
    }

    private final void zzH() {
        if (zzM()) {
            if (zzamq.zza >= 21) {
                this.zzn.setVolume(this.zzy);
                return;
            }
            AudioTrack audioTrack = this.zzn;
            float f = this.zzy;
            audioTrack.setStereoVolume(f, f);
        }
    }

    private final void zzI(zzahf zzahfVar, boolean z) {
        zzeg zzegVarZzJ = zzJ();
        if (zzahfVar.equals(zzegVarZzJ.zza) && z == zzegVarZzJ.zzb) {
            return;
        }
        zzeg zzegVar = new zzeg(zzahfVar, z, -9223372036854775807L, -9223372036854775807L, null);
        if (zzM()) {
            this.zzp = zzegVar;
        } else {
            this.zzq = zzegVar;
        }
    }

    private final zzeg zzJ() {
        zzeg zzegVar = this.zzp;
        if (zzegVar != null) {
            return zzegVar;
        }
        return !this.zzg.isEmpty() ? this.zzg.getLast() : this.zzq;
    }

    private final void zzK(long j) {
        zzahf zzahfVar;
        boolean z;
        if (zzL()) {
            zzef zzefVar = this.zzP;
            zzahfVar = zzJ().zza;
            zzefVar.zzb(zzahfVar);
        } else {
            zzahfVar = zzahf.zza;
        }
        zzahf zzahfVar2 = zzahfVar;
        if (zzL()) {
            zzef zzefVar2 = this.zzP;
            boolean z2 = zzJ().zzb;
            zzefVar2.zzc(z2);
            z = z2;
        } else {
            z = false;
        }
        this.zzg.add(new zzeg(zzahfVar2, z, Math.max(0L, j), this.zzm.zza(zzO()), null));
        zzde[] zzdeVarArr = this.zzm.zzi;
        ArrayList arrayList = new ArrayList();
        for (zzde zzdeVar : zzdeVarArr) {
            if (zzdeVar.zzb()) {
                arrayList.add(zzdeVar);
            } else {
                zzdeVar.zzg();
            }
        }
        int size = arrayList.size();
        this.zzz = (zzde[]) arrayList.toArray(new zzde[size]);
        this.zzA = new ByteBuffer[size];
        zzD();
        zzdt zzdtVar = this.zzk;
        if (zzdtVar != null) {
            ((zzep) zzdtVar).zza.zzc.zzh(z);
        }
    }

    private final boolean zzL() {
        if (!"audio/raw".equals(this.zzm.zza.zzl)) {
            return false;
        }
        int i = this.zzm.zza.zzA;
        return true;
    }

    private final boolean zzM() {
        return this.zzn != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzN() {
        zzee zzeeVar = this.zzm;
        int i = zzeeVar.zzc;
        return this.zzs / ((long) zzeeVar.zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzO() {
        zzee zzeeVar = this.zzm;
        int i = zzeeVar.zzc;
        return this.zzt / ((long) zzeeVar.zzd);
    }

    private static boolean zzP(AudioTrack audioTrack) {
        return zzamq.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final void zzQ() {
        if (this.zzH) {
            return;
        }
        this.zzH = true;
        this.zzf.zzi(zzO());
        this.zzn.stop();
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zza(zzdt zzdtVar) {
        this.zzk = zzdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final boolean zzb(zzafv zzafvVar) {
        return zzc(zzafvVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final int zzc(zzafv zzafvVar) {
        if (!"audio/raw".equals(zzafvVar.zzl)) {
            int i = zzamq.zza;
            return 0;
        }
        if (zzamq.zzP(zzafvVar.zzA)) {
            return zzafvVar.zzA != 2 ? 1 : 2;
        }
        int i2 = zzafvVar.zzA;
        StringBuilder sb = new StringBuilder(33);
        sb.append("Invalid PCM encoding: ");
        sb.append(i2);
        Log.w("DefaultAudioSink", sb.toString());
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final long zzd(boolean z) {
        long jZzJ;
        if (!zzM() || this.zzw) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzf.zzb(z), this.zzm.zza(zzO()));
        while (!this.zzg.isEmpty() && jMin >= this.zzg.getFirst().zzd) {
            this.zzq = this.zzg.remove();
        }
        zzeg zzegVar = this.zzq;
        long j = jMin - zzegVar.zzd;
        if (zzegVar.zza.equals(zzahf.zza)) {
            jZzJ = this.zzq.zzc + j;
        } else if (this.zzg.isEmpty()) {
            jZzJ = this.zzP.zzd(j) + this.zzq.zzc;
        } else {
            zzeg first = this.zzg.getFirst();
            jZzJ = first.zzc - zzamq.zzJ(first.zzd - jMin, this.zzq.zza.zzb);
        }
        return jZzJ + this.zzm.zza(this.zzP.zze());
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zze(zzafv zzafvVar, int i, int[] iArr) throws zzdr {
        if (!"audio/raw".equals(zzafvVar.zzl)) {
            int i2 = zzafvVar.zzz;
            int i3 = zzamq.zza;
            String strValueOf = String.valueOf(zzafvVar);
            String.valueOf(strValueOf).length();
            throw new zzdr("Unable to configure passthrough for: ".concat(String.valueOf(strValueOf)), zzafvVar);
        }
        zzakt.zza(zzamq.zzP(zzafvVar.zzA));
        int iZzS = zzamq.zzS(zzafvVar.zzA, zzafvVar.zzy);
        int i4 = zzafvVar.zzA;
        zzde[] zzdeVarArr = this.zzc;
        this.zzb.zzo(zzafvVar.zzB, zzafvVar.zzC);
        if (zzamq.zza < 21 && zzafvVar.zzy == 8 && iArr == null) {
            iArr = new int[6];
            for (int i5 = 0; i5 < 6; i5++) {
                iArr[i5] = i5;
            }
        }
        this.zza.zzo(iArr);
        zzdc zzdcVar = new zzdc(zzafvVar.zzz, zzafvVar.zzy, zzafvVar.zzA);
        for (zzde zzdeVar : zzdeVarArr) {
            try {
                zzdc zzdcVarZza = zzdeVar.zza(zzdcVar);
                if (true == zzdeVar.zzb()) {
                    zzdcVar = zzdcVarZza;
                }
            } catch (zzdd e) {
                throw new zzdr(e, zzafvVar);
            }
        }
        int i6 = zzdcVar.zzd;
        int i7 = zzdcVar.zzb;
        int iZzR = zzamq.zzR(zzdcVar.zzc);
        int iZzS2 = zzamq.zzS(i6, zzdcVar.zzc);
        if (i6 == 0) {
            String strValueOf2 = String.valueOf(zzafvVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf2).length() + 48);
            sb.append("Invalid output encoding (mode=0) for: ");
            sb.append(strValueOf2);
            throw new zzdr(sb.toString(), zzafvVar);
        }
        if (iZzR == 0) {
            String strValueOf3 = String.valueOf(zzafvVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf3).length() + 54);
            sb2.append("Invalid output channel config (mode=0) for: ");
            sb2.append(strValueOf3);
            throw new zzdr(sb2.toString(), zzafvVar);
        }
        this.zzN = false;
        zzee zzeeVar = new zzee(zzafvVar, iZzS, 0, iZzS2, i7, iZzR, i6, 0, false, zzdeVarArr);
        if (zzM()) {
            this.zzl = zzeeVar;
        } else {
            this.zzm = zzeeVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzf() {
        this.zzI = true;
        if (zzM()) {
            this.zzf.zzc();
            this.zzn.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzg() {
        this.zzv = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final boolean zzh(ByteBuffer byteBuffer, long j, int i) throws Exception {
        ByteBuffer byteBuffer2 = this.zzB;
        zzakt.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzl != null) {
            if (!zzG()) {
                return false;
            }
            zzee zzeeVar = this.zzl;
            zzee zzeeVar2 = this.zzm;
            int i2 = zzeeVar2.zzc;
            int i3 = zzeeVar.zzc;
            if (zzeeVar2.zzg == zzeeVar.zzg && zzeeVar2.zze == zzeeVar.zze && zzeeVar2.zzf == zzeeVar.zzf && zzeeVar2.zzd == zzeeVar.zzd) {
                this.zzm = zzeeVar;
                this.zzl = null;
                if (zzP(this.zzn)) {
                    this.zzn.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.zzn;
                    zzafv zzafvVar = this.zzm.zza;
                    audioTrack.setOffloadDelayPadding(zzafvVar.zzB, zzafvVar.zzC);
                    this.zzO = true;
                }
            } else {
                zzQ();
                if (zzk()) {
                    return false;
                }
                zzt();
            }
            zzK(j);
        }
        if (!zzM()) {
            try {
                this.zze.block();
                try {
                    zzee zzeeVar3 = this.zzm;
                    zzeeVar3.getClass();
                    AudioTrack audioTrackZzc = zzeeVar3.zzc(false, this.zzo, this.zzK);
                    this.zzn = audioTrackZzc;
                    if (zzP(audioTrackZzc)) {
                        AudioTrack audioTrack2 = this.zzn;
                        if (this.zzh == null) {
                            this.zzh = new zzem(this);
                        }
                        this.zzh.zza(audioTrack2);
                        AudioTrack audioTrack3 = this.zzn;
                        zzafv zzafvVar2 = this.zzm.zza;
                        audioTrack3.setOffloadDelayPadding(zzafvVar2.zzB, zzafvVar2.zzC);
                    }
                    this.zzK = this.zzn.getAudioSessionId();
                    zzea zzeaVar = this.zzf;
                    AudioTrack audioTrack4 = this.zzn;
                    zzee zzeeVar4 = this.zzm;
                    int i4 = zzeeVar4.zzc;
                    zzeaVar.zza(audioTrack4, false, zzeeVar4.zzg, zzeeVar4.zzd, zzeeVar4.zzh);
                    zzH();
                    int i5 = this.zzL.zza;
                    this.zzw = true;
                } catch (zzds e) {
                    zzdt zzdtVar = this.zzk;
                    if (zzdtVar != null) {
                        zzdtVar.zzb(e);
                    }
                    throw e;
                }
            } catch (zzds e2) {
                this.zzi.zza(e2);
                return false;
            }
        }
        this.zzi.zzb();
        if (this.zzw) {
            this.zzx = Math.max(0L, j);
            this.zzv = false;
            this.zzw = false;
            zzK(j);
            if (this.zzI) {
                zzf();
            }
        }
        if (!this.zzf.zze(zzO())) {
            return false;
        }
        if (this.zzB == null) {
            zzakt.zza(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            int i6 = this.zzm.zzc;
            if (this.zzp != null) {
                if (!zzG()) {
                    return false;
                }
                zzK(j);
                this.zzp = null;
            }
            long jZzN = this.zzx + (((zzN() - this.zzb.zzq()) * 1000000) / ((long) this.zzm.zza.zzz));
            if (!this.zzv && Math.abs(jZzN - j) > 200000) {
                this.zzk.zzb(new zzdu(j, jZzN));
                this.zzv = true;
            }
            if (this.zzv) {
                if (!zzG()) {
                    return false;
                }
                long j2 = j - jZzN;
                this.zzx += j2;
                this.zzv = false;
                zzK(j);
                zzdt zzdtVar2 = this.zzk;
                if (zzdtVar2 != null && j2 != 0) {
                    ((zzep) zzdtVar2).zza.zzp();
                }
            }
            int i7 = this.zzm.zzc;
            this.zzs += (long) byteBuffer.remaining();
            this.zzB = byteBuffer;
        }
        zzE(j);
        if (!this.zzB.hasRemaining()) {
            this.zzB = null;
            return true;
        }
        if (!this.zzf.zzh(zzO())) {
            return false;
        }
        Log.w("DefaultAudioSink", "Resetting stalled audio track");
        zzt();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzi() throws zzdv {
        if (!this.zzG && zzM() && zzG()) {
            zzQ();
            this.zzG = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final boolean zzj() {
        if (zzM()) {
            return this.zzG && !zzk();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final boolean zzk() {
        return zzM() && this.zzf.zzj(zzO());
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzl(zzahf zzahfVar) {
        zzI(new zzahf(zzamq.zzz(zzahfVar.zzb, 0.1f, 8.0f), zzamq.zzz(zzahfVar.zzc, 0.1f, 8.0f)), zzJ().zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final zzahf zzm() {
        return zzJ().zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzn(boolean z) {
        zzI(zzJ().zza, z);
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzo(zzg zzgVar) {
        if (this.zzo.equals(zzgVar)) {
            return;
        }
        this.zzo = zzgVar;
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzp(int i) {
        if (this.zzK != i) {
            this.zzK = i;
            this.zzJ = i != 0;
            zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzq(zzh zzhVar) {
        if (this.zzL.equals(zzhVar)) {
            return;
        }
        int i = zzhVar.zza;
        float f = zzhVar.zzb;
        if (this.zzn != null) {
            int i2 = this.zzL.zza;
        }
        this.zzL = zzhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzr(float f) {
        if (this.zzy != f) {
            this.zzy = f;
            zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzs() {
        this.zzI = false;
        if (zzM() && this.zzf.zzk()) {
            this.zzn.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzt() {
        if (zzM()) {
            this.zzs = 0L;
            this.zzt = 0L;
            this.zzu = 0L;
            this.zzO = false;
            this.zzq = new zzeg(zzJ().zza, zzJ().zzb, 0L, 0L, null);
            this.zzx = 0L;
            this.zzp = null;
            this.zzg.clear();
            this.zzB = null;
            this.zzC = null;
            this.zzH = false;
            this.zzG = false;
            this.zzF = -1;
            this.zzb.zzp();
            zzD();
            if (this.zzf.zzd()) {
                this.zzn.pause();
            }
            if (zzP(this.zzn)) {
                zzem zzemVar = this.zzh;
                zzemVar.getClass();
                zzemVar.zzb(this.zzn);
            }
            AudioTrack audioTrack = this.zzn;
            this.zzn = null;
            if (zzamq.zza < 21 && !this.zzJ) {
                this.zzK = 0;
            }
            zzee zzeeVar = this.zzl;
            if (zzeeVar != null) {
                this.zzm = zzeeVar;
                this.zzl = null;
            }
            this.zzf.zzl();
            this.zze.close();
            new zzed(this, "ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.zzj.zzb();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzu() {
        zzt();
        for (zzde zzdeVar : this.zzc) {
            zzdeVar.zzh();
        }
        zzde[] zzdeVarArr = this.zzd;
        int length = zzdeVarArr.length;
        for (int i = 0; i <= 0; i++) {
            zzdeVarArr[i].zzh();
        }
        this.zzI = false;
        this.zzN = false;
    }
}
