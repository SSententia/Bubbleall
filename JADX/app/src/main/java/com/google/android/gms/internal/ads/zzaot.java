package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import androidx.media2.widget.Cea708CCParser;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaot {
    private Method zzA;
    private int zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private int zzI;
    private long zzJ;
    private long zzK;
    private long zzL;
    private float zzM;
    private zzaob[] zzN;
    private ByteBuffer[] zzO;
    private ByteBuffer zzP;
    private ByteBuffer zzQ;
    private byte[] zzR;
    private int zzS;
    private int zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private final zzaou zza;
    private final zzapa zzb;
    private final zzaob[] zzc;
    private final zzaop zzd;
    private final ConditionVariable zze = new ConditionVariable(true);
    private final long[] zzf;
    private final zzaol zzg;
    private final LinkedList<zzaor> zzh;
    private AudioTrack zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private int zzo;
    private long zzp;
    private zzanq zzq;
    private zzanq zzr;
    private long zzs;
    private long zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private long zzx;
    private boolean zzy;
    private long zzz;

    public zzaot(zzanz zzanzVar, zzaob[] zzaobVarArr, zzaop zzaopVar) {
        this.zzd = zzaopVar;
        if (zzave.zza >= 18) {
            try {
                this.zzA = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzave.zza >= 19) {
            this.zzg = new zzaom();
        } else {
            this.zzg = new zzaol(null);
        }
        zzaou zzaouVar = new zzaou();
        this.zza = zzaouVar;
        zzapa zzapaVar = new zzapa();
        this.zzb = zzapaVar;
        zzaob[] zzaobVarArr2 = {new zzaoy(), zzaouVar, zzapaVar};
        this.zzc = zzaobVarArr2;
        System.arraycopy(zzaobVarArr, 0, zzaobVarArr2, 2, 0);
        this.zzf = new long[10];
        this.zzM = 1.0f;
        this.zzI = 0;
        this.zzW = 0;
        this.zzr = zzanq.zza;
        this.zzT = -1;
        this.zzN = new zzaob[0];
        this.zzO = new ByteBuffer[0];
        this.zzh = new LinkedList<>();
    }

    private final void zzp() {
        ArrayList arrayList = new ArrayList();
        zzaob[] zzaobVarArr = this.zzc;
        for (int i = 0; i < 3; i++) {
            zzaob zzaobVar = zzaobVarArr[i];
            if (zzaobVar.zzb()) {
                arrayList.add(zzaobVar);
            } else {
                zzaobVar.zzi();
            }
        }
        int size = arrayList.size();
        this.zzN = (zzaob[]) arrayList.toArray(new zzaob[size]);
        this.zzO = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            zzaob zzaobVar2 = this.zzN[i2];
            zzaobVar2.zzi();
            this.zzO[i2] = zzaobVar2.zzg();
        }
    }

    private final void zzq(long j) throws zzaos {
        ByteBuffer byteBuffer;
        int length = this.zzN.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzO[i - 1];
            } else {
                byteBuffer = this.zzP;
                if (byteBuffer == null) {
                    byteBuffer = zzaob.zza;
                }
            }
            if (i == length) {
                zzr(byteBuffer, j);
            } else {
                zzaob zzaobVar = this.zzN[i];
                zzaobVar.zze(byteBuffer);
                ByteBuffer byteBufferZzg = zzaobVar.zzg();
                this.zzO[i] = byteBufferZzg;
                if (byteBufferZzg.hasRemaining()) {
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

    private final boolean zzr(ByteBuffer byteBuffer, long j) throws zzaos {
        int iWrite;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        ByteBuffer byteBuffer2 = this.zzQ;
        if (byteBuffer2 != null) {
            zzaup.zza(byteBuffer2 == byteBuffer);
        } else {
            this.zzQ = byteBuffer;
            if (zzave.zza < 21) {
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = this.zzR;
                if (bArr == null || bArr.length < iRemaining) {
                    this.zzR = new byte[iRemaining];
                }
                int iPosition = byteBuffer.position();
                byteBuffer.get(this.zzR, 0, iRemaining);
                byteBuffer.position(iPosition);
                this.zzS = 0;
            }
        }
        int iRemaining2 = byteBuffer.remaining();
        if (zzave.zza < 21) {
            int iZzd = this.zzo - ((int) (this.zzF - (this.zzg.zzd() * ((long) this.zzE))));
            if (iZzd > 0) {
                iWrite = this.zzi.write(this.zzR, this.zzS, Math.min(iRemaining2, iZzd));
                if (iWrite > 0) {
                    this.zzS += iWrite;
                    byteBuffer.position(byteBuffer.position() + iWrite);
                }
            } else {
                iWrite = 0;
            }
        } else {
            iWrite = this.zzi.write(byteBuffer, iRemaining2, 1);
        }
        this.zzY = SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            throw new zzaos(iWrite);
        }
        boolean z = this.zzn;
        if (!z) {
            this.zzF += (long) iWrite;
        }
        if (iWrite != iRemaining2) {
            return false;
        }
        if (z) {
            this.zzG += (long) this.zzH;
        }
        this.zzQ = null;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final boolean zzs() throws com.google.android.gms.internal.ads.zzaos {
        /*
            r9 = this;
            int r0 = r9.zzT
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L14
            boolean r0 = r9.zzn
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzaob[] r0 = r9.zzN
            int r0 = r0.length
            goto L10
        Lf:
            r0 = r2
        L10:
            r9.zzT = r0
        L12:
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            int r4 = r9.zzT
            com.google.android.gms.internal.ads.zzaob[] r5 = r9.zzN
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.zzf()
        L28:
            r9.zzq(r7)
            boolean r0 = r4.zzh()
            if (r0 != 0) goto L32
            return r2
        L32:
            int r0 = r9.zzT
            int r0 = r0 + r1
            r9.zzT = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.zzQ
            if (r0 == 0) goto L44
            r9.zzr(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzQ
            if (r0 == 0) goto L44
            return r2
        L44:
            r9.zzT = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaot.zzs():boolean");
    }

    private final void zzt() {
        if (zzu()) {
            if (zzave.zza >= 21) {
                this.zzi.setVolume(this.zzM);
                return;
            }
            AudioTrack audioTrack = this.zzi;
            float f = this.zzM;
            audioTrack.setStereoVolume(f, f);
        }
    }

    private final boolean zzu() {
        return this.zzi != null;
    }

    private final long zzv(long j) {
        return (j * 1000000) / ((long) this.zzj);
    }

    private final long zzw(long j) {
        return (j * ((long) this.zzj)) / 1000000;
    }

    private final long zzx() {
        return this.zzn ? this.zzG : this.zzF / ((long) this.zzE);
    }

    private final void zzy() {
        this.zzw = 0L;
        this.zzv = 0;
        this.zzu = 0;
        this.zzx = 0L;
        this.zzy = false;
        this.zzz = 0L;
    }

    private final boolean zzz() {
        if (zzave.zza >= 23) {
            return false;
        }
        int i = this.zzm;
        return i == 5 || i == 6;
    }

    public final long zzb(boolean z) {
        long jZze;
        long j;
        long jZzj;
        long j2;
        if (!zzu() || this.zzI == 0) {
            return Long.MIN_VALUE;
        }
        if (this.zzi.getPlayState() == 3) {
            long jZze2 = this.zzg.zze();
            if (jZze2 != 0) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.zzx >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    long[] jArr = this.zzf;
                    int i = this.zzu;
                    jArr[i] = jZze2 - jNanoTime;
                    this.zzu = (i + 1) % 10;
                    int i2 = this.zzv;
                    if (i2 < 10) {
                        this.zzv = i2 + 1;
                    }
                    this.zzx = jNanoTime;
                    this.zzw = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.zzv;
                        if (i3 >= i4) {
                            break;
                        }
                        this.zzw += this.zzf[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!zzz() && jNanoTime - this.zzz >= 500000) {
                    boolean zZzf = this.zzg.zzf();
                    this.zzy = zZzf;
                    if (zZzf) {
                        long jZzg = this.zzg.zzg() / 1000;
                        long jZzh = this.zzg.zzh();
                        if (jZzg < this.zzK) {
                            this.zzy = false;
                        } else if (Math.abs(jZzg - jNanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(jZzh);
                            sb.append(", ");
                            sb.append(jZzg);
                            sb.append(", ");
                            sb.append(jNanoTime);
                            sb.append(", ");
                            sb.append(jZze2);
                            Log.w("AudioTrack", sb.toString());
                            this.zzy = false;
                        } else if (Math.abs(zzv(jZzh) - jZze2) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(Cea708CCParser.Const.CODE_C1_HDW);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(jZzh);
                            sb2.append(", ");
                            sb2.append(jZzg);
                            sb2.append(", ");
                            sb2.append(jNanoTime);
                            sb2.append(", ");
                            sb2.append(jZze2);
                            Log.w("AudioTrack", sb2.toString());
                            this.zzy = false;
                        }
                    }
                    Method method = this.zzA;
                    if (method != null && !this.zzn) {
                        try {
                            long jIntValue = (((long) ((Integer) method.invoke(this.zzi, null)).intValue()) * 1000) - this.zzp;
                            this.zzL = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            this.zzL = jMax;
                            if (jMax > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(jMax);
                                Log.w("AudioTrack", sb3.toString());
                                this.zzL = 0L;
                            }
                        } catch (Exception unused) {
                            this.zzA = null;
                        }
                    }
                    this.zzz = jNanoTime;
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        if (this.zzy) {
            jZze = zzv(this.zzg.zzh() + zzw(jNanoTime2 - (this.zzg.zzg() / 1000)));
        } else {
            jZze = this.zzv == 0 ? this.zzg.zze() : jNanoTime2 + this.zzw;
            if (!z) {
                jZze -= this.zzL;
            }
        }
        long j3 = this.zzJ;
        while (!this.zzh.isEmpty() && jZze >= this.zzh.getFirst().zzc) {
            zzaor zzaorVarRemove = this.zzh.remove();
            this.zzr = zzaorVarRemove.zza;
            this.zzt = zzaorVarRemove.zzc;
            this.zzs = zzaorVarRemove.zzb - this.zzJ;
        }
        if (this.zzr.zzb == 1.0f) {
            j2 = (jZze + this.zzs) - this.zzt;
        } else {
            if (!this.zzh.isEmpty() || this.zzb.zzn() < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                j = this.zzs;
                jZzj = (long) (((double) this.zzr.zzb) * (jZze - this.zzt));
            } else {
                j = this.zzs;
                jZzj = zzave.zzj(jZze - this.zzt, this.zzb.zzm(), this.zzb.zzn());
            }
            j2 = jZzj + j;
        }
        return j3 + j2;
    }

    public final void zzd() {
        this.zzV = true;
        if (zzu()) {
            this.zzK = System.nanoTime() / 1000;
            this.zzi.play();
        }
    }

    public final void zze() {
        if (this.zzI == 1) {
            this.zzI = 2;
        }
    }

    public final boolean zzf(ByteBuffer byteBuffer, long j) throws zzaoo, zzaos {
        int iZzc;
        ByteBuffer byteBuffer2 = this.zzP;
        zzaup.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!zzu()) {
            this.zze.block();
            int i = this.zzW;
            if (i == 0) {
                this.zzi = new AudioTrack(3, this.zzj, this.zzk, this.zzm, this.zzo, 1);
            } else {
                this.zzi = new AudioTrack(3, this.zzj, this.zzk, this.zzm, this.zzo, 1, i);
            }
            int state = this.zzi.getState();
            if (state != 1) {
                try {
                    this.zzi.release();
                } catch (Exception unused) {
                } finally {
                    this.zzi = null;
                }
                throw new zzaoo(state, this.zzj, this.zzk, this.zzo);
            }
            int audioSessionId = this.zzi.getAudioSessionId();
            if (this.zzW != audioSessionId) {
                this.zzW = audioSessionId;
                ((zzaov) this.zzd).zza.zzb.zzg(audioSessionId);
            }
            this.zzg.zza(this.zzi, zzz());
            zzt();
            this.zzX = false;
            if (this.zzV) {
                zzd();
            }
        }
        if (zzz()) {
            if (this.zzi.getPlayState() == 2) {
                this.zzX = false;
                return false;
            }
            if (this.zzi.getPlayState() == 1 && this.zzg.zzd() != 0) {
                return false;
            }
        }
        boolean z = this.zzX;
        boolean zZzi = zzi();
        this.zzX = zZzi;
        if (z && !zZzi && this.zzi.getPlayState() != 1) {
            ((zzaov) this.zzd).zza.zzb.zze(this.zzo, zzamx.zza(this.zzp), SystemClock.elapsedRealtime() - this.zzY);
        }
        if (this.zzP == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.zzn && this.zzH == 0) {
                int i2 = this.zzm;
                if (i2 == 7 || i2 == 8) {
                    int iPosition = byteBuffer.position();
                    iZzc = ((((byteBuffer.get(iPosition + 5) & 252) >> 2) | ((byteBuffer.get(iPosition + 4) & 1) << 6)) + 1) * 32;
                } else if (i2 == 5) {
                    int i3 = zzany.zza;
                    iZzc = 1536;
                } else {
                    if (i2 != 6) {
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unexpected audio encoding: ");
                        sb.append(i2);
                        throw new IllegalStateException(sb.toString());
                    }
                    iZzc = zzany.zzc(byteBuffer);
                }
                this.zzH = iZzc;
            }
            if (this.zzq != null) {
                if (!zzs()) {
                    return false;
                }
                this.zzh.add(new zzaor(this.zzq, Math.max(0L, j), zzv(zzx()), null));
                this.zzq = null;
                zzp();
            }
            if (this.zzI == 0) {
                this.zzJ = Math.max(0L, j);
                this.zzI = 1;
            } else {
                long jZzv = this.zzJ + zzv(this.zzn ? this.zzD : this.zzC / ((long) this.zzB));
                if (this.zzI == 1 && Math.abs(jZzv - j) > 200000) {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(jZzv);
                    sb2.append(", got ");
                    sb2.append(j);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    this.zzI = 2;
                }
                if (this.zzI == 2) {
                    this.zzJ += j - jZzv;
                    this.zzI = 1;
                    zzaox.zzI(((zzaov) this.zzd).zza, true);
                }
            }
            if (this.zzn) {
                this.zzD += (long) this.zzH;
            } else {
                this.zzC += (long) byteBuffer.remaining();
            }
            this.zzP = byteBuffer;
        }
        if (this.zzn) {
            zzr(this.zzP, j);
        } else {
            zzq(j);
        }
        if (this.zzP.hasRemaining()) {
            return false;
        }
        this.zzP = null;
        return true;
    }

    public final void zzg() throws zzaos {
        if (!this.zzU && zzu() && zzs()) {
            this.zzg.zzb(zzx());
            this.zzU = true;
        }
    }

    public final boolean zzh() {
        if (zzu()) {
            return this.zzU && !zzi();
        }
        return true;
    }

    public final boolean zzi() {
        if (!zzu()) {
            return false;
        }
        if (zzx() <= this.zzg.zzd()) {
            return zzz() && this.zzi.getPlayState() == 2 && this.zzi.getPlaybackHeadPosition() == 0;
        }
        return true;
    }

    public final zzanq zzj(zzanq zzanqVar) {
        if (this.zzn) {
            zzanq zzanqVar2 = zzanq.zza;
            this.zzr = zzanqVar2;
            return zzanqVar2;
        }
        float fZzk = this.zzb.zzk(zzanqVar.zzb);
        zzapa zzapaVar = this.zzb;
        float f = zzanqVar.zzc;
        zzapaVar.zzl(1.0f);
        zzanq zzanqVar3 = new zzanq(fZzk, 1.0f);
        zzanq zzanqVar4 = this.zzq;
        if (zzanqVar4 == null) {
            zzanqVar4 = !this.zzh.isEmpty() ? this.zzh.getLast().zza : this.zzr;
        }
        if (!zzanqVar3.equals(zzanqVar4)) {
            if (zzu()) {
                this.zzq = zzanqVar3;
            } else {
                this.zzr = zzanqVar3;
            }
        }
        return this.zzr;
    }

    public final zzanq zzk() {
        return this.zzr;
    }

    public final void zzl(float f) {
        if (this.zzM != f) {
            this.zzM = f;
            zzt();
        }
    }

    public final void zzm() {
        this.zzV = false;
        if (zzu()) {
            zzy();
            this.zzg.zzc();
        }
    }

    public final void zzo() {
        zzn();
        zzaob[] zzaobVarArr = this.zzc;
        for (int i = 0; i < 3; i++) {
            zzaobVarArr[i].zzj();
        }
        this.zzW = 0;
        this.zzV = false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    public final void zzc(String str, int i, int i2, int i3, int i4, int[] iArr) throws zzaon {
        int i5;
        this.zzB = zzave.zzp(i3, i);
        this.zza.zzk(iArr);
        zzaob[] zzaobVarArr = this.zzc;
        boolean zZza = false;
        for (int i6 = 0; i6 < 3; i6++) {
            zzaob zzaobVar = zzaobVarArr[i6];
            try {
                zZza |= zzaobVar.zza(i2, i, i3);
                if (zzaobVar.zzb()) {
                    i = zzaobVar.zzc();
                    zzaobVar.zzd();
                    i3 = 2;
                }
            } catch (zzaoa e) {
                throw new zzaon(e);
            }
        }
        if (zZza) {
            zzp();
        }
        int i7 = 252;
        switch (i) {
            case 1:
                i5 = 4;
                break;
            case 2:
                i5 = 12;
                break;
            case 3:
                i5 = 28;
                break;
            case 4:
                i5 = 204;
                break;
            case 5:
                i5 = 220;
                break;
            case 6:
                i5 = 252;
                break;
            case 7:
                i5 = 1276;
                break;
            case 8:
                i5 = zzamx.zza;
                break;
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unsupported channel count: ");
                sb.append(i);
                throw new zzaon(sb.toString());
        }
        if (zzave.zza > 23 || !"foster".equals(zzave.zzb) || !"NVIDIA".equals(zzave.zzc)) {
            i7 = i5;
        } else if (i != 3 && i != 5) {
            if (i != 7) {
                i7 = i5;
            } else {
                i7 = zzamx.zza;
            }
        }
        if (zzave.zza <= 25) {
            "fugu".equals(zzave.zzb);
        }
        if (!zZza && zzu() && this.zzl == i3 && this.zzj == i2 && this.zzk == i7) {
            return;
        }
        zzn();
        this.zzl = i3;
        this.zzn = false;
        this.zzj = i2;
        this.zzk = i7;
        this.zzm = 2;
        this.zzE = zzave.zzp(2, i);
        int minBufferSize = AudioTrack.getMinBufferSize(i2, i7, this.zzm);
        zzaup.zzd(minBufferSize != -2);
        int i8 = minBufferSize * 4;
        int iZzw = ((int) zzw(250000L)) * this.zzE;
        int iMax = (int) Math.max(minBufferSize, zzw(750000L) * ((long) this.zzE));
        if (i8 < iZzw) {
            i8 = iZzw;
        } else if (i8 > iMax) {
            i8 = iMax;
        }
        this.zzo = i8;
        this.zzp = zzv(i8 / this.zzE);
        zzj(this.zzr);
    }

    public final void zzn() {
        if (zzu()) {
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzF = 0L;
            this.zzG = 0L;
            this.zzH = 0;
            zzanq zzanqVar = this.zzq;
            if (zzanqVar != null) {
                this.zzr = zzanqVar;
                this.zzq = null;
            } else if (!this.zzh.isEmpty()) {
                this.zzr = this.zzh.getLast().zza;
            }
            this.zzh.clear();
            this.zzs = 0L;
            this.zzt = 0L;
            this.zzP = null;
            this.zzQ = null;
            int i = 0;
            while (true) {
                zzaob[] zzaobVarArr = this.zzN;
                if (i >= zzaobVarArr.length) {
                    break;
                }
                zzaob zzaobVar = zzaobVarArr[i];
                zzaobVar.zzi();
                this.zzO[i] = zzaobVar.zzg();
                i++;
            }
            this.zzU = false;
            this.zzT = -1;
            this.zzI = 0;
            this.zzL = 0L;
            zzy();
            if (this.zzi.getPlayState() == 3) {
                this.zzi.pause();
            }
            AudioTrack audioTrack = this.zzi;
            this.zzi = null;
            this.zzg.zza(null, false);
            this.zze.close();
            new zzaok(this, audioTrack).start();
        }
    }
}
