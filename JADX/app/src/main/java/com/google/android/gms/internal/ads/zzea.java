package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzea {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zzdz zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zzdy zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzea(zzdz zzdzVar) {
        this.zza = zzdzVar;
        if (zzamq.zza >= 18) {
            try {
                this.zzn = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.zzb = new long[10];
    }

    private final long zzm(long j) {
        return (j * 1000000) / ((long) this.zzg);
    }

    private final void zzn() {
        this.zzl = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzm = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzk = false;
    }

    private final long zzo() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (this.zzx != -9223372036854775807L) {
            return Math.min(this.zzA, this.zzz + ((((SystemClock.elapsedRealtime() * 1000) - this.zzx) * ((long) this.zzg)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.zzh) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.zzu = this.zzs;
                }
                playState = 2;
            }
            playbackHeadPosition += this.zzu;
        }
        if (zzamq.zza <= 29) {
            if (playbackHeadPosition == 0 && this.zzs > 0 && playState == 3) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = SystemClock.elapsedRealtime();
                }
                return this.zzs;
            }
            this.zzy = -9223372036854775807L;
        }
        if (this.zzs > playbackHeadPosition) {
            this.zzt++;
        }
        this.zzs = playbackHeadPosition;
        return playbackHeadPosition + (this.zzt << 32);
    }

    public final void zza(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.zzc = audioTrack;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = new zzdy(audioTrack);
        this.zzg = audioTrack.getSampleRate();
        this.zzh = false;
        boolean zZzP = zzamq.zzP(i);
        this.zzq = zZzP;
        this.zzi = zZzP ? zzm(i3 / i2) : -9223372036854775807L;
        this.zzs = 0L;
        this.zzt = 0L;
        this.zzu = 0L;
        this.zzp = false;
        this.zzx = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzr = 0L;
        this.zzo = 0L;
        this.zzj = 1.0f;
    }

    public final long zzb(boolean z) {
        long jZzm;
        String str;
        Method method;
        zzea zzeaVar = this;
        AudioTrack audioTrack = zzeaVar.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long jZzm2 = zzeaVar.zzm(zzo());
            if (jZzm2 != 0) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - zzeaVar.zzm >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    long[] jArr = zzeaVar.zzb;
                    int i = zzeaVar.zzv;
                    jArr[i] = jZzm2 - jNanoTime;
                    zzeaVar.zzv = (i + 1) % 10;
                    int i2 = zzeaVar.zzw;
                    if (i2 < 10) {
                        zzeaVar.zzw = i2 + 1;
                    }
                    zzeaVar.zzm = jNanoTime;
                    zzeaVar.zzl = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = zzeaVar.zzw;
                        if (i3 >= i4) {
                            break;
                        }
                        zzeaVar.zzl += zzeaVar.zzb[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!zzeaVar.zzh) {
                    zzdy zzdyVar = zzeaVar.zzf;
                    zzdyVar.getClass();
                    if (zzdyVar.zza(jNanoTime)) {
                        long jZzf = zzdyVar.zzf();
                        long jZzg = zzdyVar.zzg();
                        if (Math.abs(jZzf - jNanoTime) > 5000000) {
                            zzej zzejVar = (zzej) zzeaVar.zza;
                            long jZzN = zzejVar.zza.zzN();
                            long jZzO = zzejVar.zza.zzO();
                            StringBuilder sb = new StringBuilder(180);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(jZzg);
                            sb.append(", ");
                            sb.append(jZzf);
                            sb.append(", ");
                            sb.append(jNanoTime);
                            sb.append(", ");
                            sb.append(jZzm2);
                            sb.append(", ");
                            sb.append(jZzN);
                            sb.append(", ");
                            sb.append(jZzO);
                            Log.w("DefaultAudioSink", sb.toString());
                            zzdyVar.zzb();
                            zzeaVar = this;
                            str = "DefaultAudioSink";
                        } else {
                            if (Math.abs(zzeaVar.zzm(jZzg) - jZzm2) > 5000000) {
                                zzej zzejVar2 = (zzej) zzeaVar.zza;
                                long jZzN2 = zzejVar2.zza.zzN();
                                long jZzO2 = zzejVar2.zza.zzO();
                                StringBuilder sb2 = new StringBuilder(182);
                                sb2.append("Spurious audio timestamp (frame position mismatch): ");
                                sb2.append(jZzg);
                                sb2.append(", ");
                                sb2.append(jZzf);
                                sb2.append(", ");
                                sb2.append(jNanoTime);
                                sb2.append(", ");
                                sb2.append(jZzm2);
                                sb2.append(", ");
                                sb2.append(jZzN2);
                                sb2.append(", ");
                                sb2.append(jZzO2);
                                str = "DefaultAudioSink";
                                Log.w(str, sb2.toString());
                                zzdyVar.zzb();
                            } else {
                                str = "DefaultAudioSink";
                                zzdyVar.zzc();
                            }
                            zzeaVar = this;
                        }
                    } else {
                        str = "DefaultAudioSink";
                    }
                    if (zzeaVar.zzq && (method = zzeaVar.zzn) != null && jNanoTime - zzeaVar.zzr >= 500000) {
                        try {
                            AudioTrack audioTrack2 = zzeaVar.zzc;
                            audioTrack2.getClass();
                            Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                            int i5 = zzamq.zza;
                            long jIntValue = (((long) num.intValue()) * 1000) - zzeaVar.zzi;
                            zzeaVar.zzo = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            zzeaVar.zzo = jMax;
                            if (jMax > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(jMax);
                                Log.w(str, sb3.toString());
                                zzeaVar.zzo = 0L;
                            }
                        } catch (Exception unused) {
                            zzeaVar.zzn = null;
                        }
                        zzeaVar.zzr = jNanoTime;
                    }
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        zzdy zzdyVar2 = zzeaVar.zzf;
        zzdyVar2.getClass();
        boolean zZzd = zzdyVar2.zzd();
        if (zZzd) {
            jZzm = zzeaVar.zzm(zzdyVar2.zzg()) + zzamq.zzJ(jNanoTime2 - zzdyVar2.zzf(), zzeaVar.zzj);
        } else {
            jZzm = zzeaVar.zzw == 0 ? zzeaVar.zzm(zzo()) : zzeaVar.zzl + jNanoTime2;
            if (!z) {
                jZzm = Math.max(0L, jZzm - zzeaVar.zzo);
            }
        }
        if (zzeaVar.zzD != zZzd) {
            zzeaVar.zzF = zzeaVar.zzC;
            zzeaVar.zzE = zzeaVar.zzB;
        }
        long j = jNanoTime2 - zzeaVar.zzF;
        if (j < 1000000) {
            long j2 = (j * 1000) / 1000000;
            jZzm = ((jZzm * j2) + ((1000 - j2) * (zzeaVar.zzE + zzamq.zzJ(j, zzeaVar.zzj)))) / 1000;
        }
        if (!zzeaVar.zzk) {
            long j3 = zzeaVar.zzB;
            if (jZzm > j3) {
                zzeaVar.zzk = true;
                long jCurrentTimeMillis = System.currentTimeMillis() - zzadx.zza(zzamq.zzK(zzadx.zza(jZzm - j3), zzeaVar.zzj));
                zzej zzejVar3 = (zzej) zzeaVar.zza;
                if (zzejVar3.zza.zzk != null) {
                    ((zzep) zzejVar3.zza.zzk).zza.zzc.zzd(jCurrentTimeMillis);
                }
            }
        }
        zzeaVar.zzC = jNanoTime2;
        zzeaVar.zzB = jZzm;
        zzeaVar.zzD = zZzd;
        return jZzm;
    }

    public final boolean zzd() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zze(long j) {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            }
            if (playState == 1) {
                if (zzo() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzp;
        boolean zZzj = zzj(j);
        this.zzp = zZzj;
        if (z && !zZzj && playState != 1) {
            zzdz zzdzVar = this.zza;
            int i = this.zze;
            long jZza = zzadx.zza(this.zzi);
            zzej zzejVar = (zzej) zzdzVar;
            if (zzejVar.zza.zzk != null) {
                ((zzep) zzejVar.zza.zzk).zza.zzc.zze(i, jZza, SystemClock.elapsedRealtime() - zzejVar.zza.zzM);
            }
        }
        return true;
    }

    public final int zzf(long j) {
        return this.zze - ((int) (j - (zzo() * ((long) this.zzd))));
    }

    public final long zzg(long j) {
        return zzadx.zza(zzm(-zzo()));
    }

    public final boolean zzh(long j) {
        return this.zzy != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final void zzi(long j) {
        this.zzz = zzo();
        this.zzx = SystemClock.elapsedRealtime() * 1000;
        this.zzA = j;
    }

    public final boolean zzj(long j) {
        if (j > zzo()) {
            return true;
        }
        if (!this.zzh) {
            return false;
        }
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && zzo() == 0;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx != -9223372036854775807L) {
            return false;
        }
        zzdy zzdyVar = this.zzf;
        zzdyVar.getClass();
        zzdyVar.zze();
        return true;
    }

    public final void zzl() {
        zzn();
        this.zzc = null;
        this.zzf = null;
    }

    public final void zzc() {
        zzdy zzdyVar = this.zzf;
        zzdyVar.getClass();
        zzdyVar.zze();
    }
}
