package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzclg extends zzcla implements zzauo<zzatz> {
    private String zzd;
    private final zzcja zze;
    private boolean zzf;
    private final zzclf zzg;
    private final zzckl zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzclg(zzcjb zzcjbVar, zzcja zzcjaVar) {
        super(zzcjbVar);
        this.zze = zzcjaVar;
        this.zzg = new zzclf();
        this.zzh = new zzckl();
        this.zzk = new Object();
        this.zzl = zzcjbVar != null ? zzcjbVar.zzn() : "";
        this.zzm = zzcjbVar != null ? zzcjbVar.zzp() : 0;
    }

    protected static final String zzt(String str) {
        String strValueOf = String.valueOf(zzcgm.zzd(str));
        return strValueOf.length() != 0 ? "cache:".concat(strValueOf) : new String("cache:");
    }

    private final void zzu() {
        int iZza = (int) this.zzg.zza();
        int iZza2 = (int) this.zzh.zza(this.zzi);
        int iPosition = this.zzi.position();
        int iRound = Math.round(iZza2 * (iPosition / iZza));
        boolean z = iRound > 0;
        int iZzP = zzcis.zzP();
        int iZzQ = zzcis.zzQ();
        String str = this.zzd;
        zzo(str, zzt(str), iPosition, iZza, iRound, iZza2, z, iZzP, iZzQ);
    }

    public final String zza() {
        return this.zzd;
    }

    public final boolean zzb() {
        return this.zzn;
    }

    public final ByteBuffer zzc() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:? -> B:45:0x0143). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcla
    public final boolean zzd(String str) throws Throwable {
        this.zzd = str;
        String strZzt = zzt(str);
        String str2 = "error";
        int i = 0;
        try {
            String str3 = this.zzb;
            zzcja zzcjaVar = this.zze;
            zzatz zzaudVar = new zzaud(str3, null, this, zzcjaVar.zzd, zzcjaVar.zzf, true, null);
            if (this.zze.zzj) {
                zzaudVar = new zzcjx(this.zza, zzaudVar, this.zzl, this.zzm, null, null);
            }
            zzaudVar.zza(new zzaub(Uri.parse(str), null, 0L, 0L, -1L, null, 0));
            zzcjb zzcjbVar = this.zzc.get();
            if (zzcjbVar != null) {
                zzcjbVar.zzu(strZzt, this);
            }
            Clock clockZzj = com.google.android.gms.ads.internal.zzt.zzj();
            long jCurrentTimeMillis = clockZzj.currentTimeMillis();
            long jLongValue = ((Long) zzbet.zzc().zzc(zzbjl.zzt)).longValue();
            long jLongValue2 = ((Long) zzbet.zzc().zzc(zzbjl.zzs)).longValue();
            this.zzi = ByteBuffer.allocate(this.zze.zzc);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            long j = jCurrentTimeMillis;
            while (true) {
                int iZzb = zzaudVar.zzb(bArr, i, Math.min(this.zzi.remaining(), i2));
                if (iZzb == -1) {
                    this.zzn = true;
                    zzq(str, strZzt, (int) this.zzh.zza(this.zzi));
                    break;
                }
                synchronized (this.zzk) {
                    try {
                        if (!this.zzf) {
                            str2 = null;
                            try {
                                this.zzi.put(bArr, 0, iZzb);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.zzi.remaining() <= 0) {
                                zzu();
                                break;
                            }
                            try {
                                if (this.zzf) {
                                    int iLimit = this.zzi.limit();
                                    StringBuilder sb = new StringBuilder(35);
                                    sb.append("Precache abort at ");
                                    sb.append(iLimit);
                                    sb.append(" bytes");
                                    throw new IOException(sb.toString());
                                }
                                long jCurrentTimeMillis2 = clockZzj.currentTimeMillis();
                                if (jCurrentTimeMillis2 - j >= jLongValue) {
                                    zzu();
                                    j = jCurrentTimeMillis2;
                                }
                                if (jCurrentTimeMillis2 - jCurrentTimeMillis > 1000 * jLongValue2) {
                                    StringBuilder sb2 = new StringBuilder(49);
                                    sb2.append("Timeout exceeded. Limit: ");
                                    sb2.append(jLongValue2);
                                    sb2.append(" sec");
                                    throw new IOException(sb2.toString());
                                }
                                str2 = str2;
                                i2 = 8192;
                                i = 0;
                            } catch (Exception e) {
                                e = e;
                                String canonicalName = e.getClass().getCanonicalName();
                                String message = e.getMessage();
                                StringBuilder sb3 = new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length());
                                sb3.append(canonicalName);
                                sb3.append(":");
                                sb3.append(message);
                                String string = sb3.toString();
                                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 34 + string.length());
                                sb4.append("Failed to preload url ");
                                sb4.append(str);
                                sb4.append(" Exception: ");
                                sb4.append(string);
                                com.google.android.gms.ads.internal.util.zze.zzi(sb4.toString());
                                zzr(str, strZzt, str2, string);
                                return false;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str2 = str2;
                            String canonicalName2 = e.getClass().getCanonicalName();
                            String message2 = e.getMessage();
                            StringBuilder sb5 = new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length());
                            sb5.append(canonicalName2);
                            sb5.append(":");
                            sb5.append(message2);
                            String string2 = sb5.toString();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 34 + string2.length());
                            sb6.append("Failed to preload url ");
                            sb6.append(str);
                            sb6.append(" Exception: ");
                            sb6.append(string2);
                            com.google.android.gms.ads.internal.util.zze.zzi(sb6.toString());
                            zzr(str, strZzt, str2, string2);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
            return true;
        } catch (Exception e3) {
            e = e3;
            str2 = str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauo
    public final /* bridge */ /* synthetic */ void zzj(zzatz zzatzVar, zzaub zzaubVar) {
        this.zzg.zzb((zzaud) zzatzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzauo
    public final /* bridge */ /* synthetic */ void zzk(zzatz zzatzVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzm() {
        this.zzf = true;
    }
}
