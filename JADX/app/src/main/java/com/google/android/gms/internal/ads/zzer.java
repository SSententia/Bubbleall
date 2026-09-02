package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzer extends zzfq implements zzalp {
    private final Context zzb;
    private final zzdp zzc;
    private final zzdw zzd;
    private int zze;
    private boolean zzf;
    private zzafv zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private zzahu zzl;

    public zzer(Context context, zzfm zzfmVar, zzfs zzfsVar, boolean z, Handler handler, zzdq zzdqVar, zzdw zzdwVar) {
        super(1, zzfmVar, zzfsVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzdwVar;
        this.zzc = new zzdp(handler, zzdqVar);
        zzdwVar.zza(new zzep(this, null));
    }

    private final int zzaa(zzfo zzfoVar, zzafv zzafvVar) {
        if (!"OMX.google.raw.decoder".equals(zzfoVar.zza) || zzamq.zza >= 24 || (zzamq.zza == 23 && zzamq.zzZ(this.zzb))) {
            return zzafvVar.zzm;
        }
        return -1;
    }

    private final void zzab() {
        long jZzd = this.zzd.zzd(zzw());
        if (jZzd != Long.MIN_VALUE) {
            if (!this.zzj) {
                jZzd = Math.max(this.zzh, jZzd);
            }
            this.zzh = jZzd;
            this.zzj = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final zzahf zzA() {
        return this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzB(zzaf zzafVar) {
        if (!this.zzi || zzafVar.zzb()) {
            return;
        }
        if (Math.abs(zzafVar.zzd - this.zzh) > 500000) {
            this.zzh = zzafVar.zzd;
        }
        this.zzi = false;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzC() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahr
    public final void zzE(int i, Object obj) throws zzaeg {
        if (i == 2) {
            this.zzd.zzr(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.zzd.zzo((zzg) obj);
            return;
        }
        if (i == 6) {
            this.zzd.zzq((zzh) obj);
            return;
        }
        switch (i) {
            case 9:
                this.zzd.zzn(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.zzd.zzp(((Integer) obj).intValue());
                break;
            case 11:
                this.zzl = (zzahu) obj;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahv, com.google.android.gms.internal.ads.zzahw
    public final String zzc() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final int zzd(zzfs zzfsVar, zzafv zzafvVar) throws zzfy {
        if (!zzalt.zza(zzafvVar.zzl)) {
            return 0;
        }
        int i = zzamq.zza >= 21 ? 32 : 0;
        int i2 = zzafvVar.zzE;
        boolean zZzY = zzY(zzafvVar);
        if (zZzY && this.zzd.zzb(zzafvVar) && (i2 == 0 || zzge.zza() != null)) {
            return i | 12;
        }
        if (("audio/raw".equals(zzafvVar.zzl) && !this.zzd.zzb(zzafvVar)) || !this.zzd.zzb(zzamq.zzN(2, zzafvVar.zzy, zzafvVar.zzz))) {
            return 1;
        }
        List<zzfo> listZze = zze(zzfsVar, zzafvVar, false);
        if (listZze.isEmpty()) {
            return 1;
        }
        if (!zZzY) {
            return 2;
        }
        zzfo zzfoVar = listZze.get(0);
        boolean zZzc = zzfoVar.zzc(zzafvVar);
        int i3 = 8;
        if (zZzc && zzfoVar.zzd(zzafvVar)) {
            i3 = 16;
        }
        return (true != zZzc ? 3 : 4) | i3 | i;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final List<zzfo> zze(zzfs zzfsVar, zzafv zzafvVar, boolean z) throws zzfy {
        zzfo zzfoVarZza;
        String str = zzafvVar.zzl;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.zzd.zzb(zzafvVar) && (zzfoVarZza = zzge.zza()) != null) {
            return Collections.singletonList(zzfoVarZza);
        }
        List<zzfo> listZzd = zzge.zzd(zzge.zzc(str, false, false), zzafvVar);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(listZzd);
            arrayList.addAll(zzge.zzc("audio/eac3", false, false));
            listZzd = arrayList;
        }
        return Collections.unmodifiableList(listZzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final boolean zzf(zzafv zzafvVar) {
        return this.zzd.zzb(zzafvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final zzfl zzg(zzfo zzfoVar, zzafv zzafvVar, MediaCrypto mediaCrypto, float f) {
        zzafv[] zzafvVarArrZzau = zzau();
        int iZzaa = zzaa(zzfoVar, zzafvVar);
        if (zzafvVarArrZzau.length != 1) {
            for (zzafv zzafvVar2 : zzafvVarArrZzau) {
                if (zzfoVar.zze(zzafvVar, zzafvVar2).zzd != 0) {
                    iZzaa = Math.max(iZzaa, zzaa(zzfoVar, zzafvVar2));
                }
            }
        }
        this.zze = iZzaa;
        this.zzf = zzamq.zza < 24 && "OMX.SEC.aac.dec".equals(zzfoVar.zza) && "samsung".equals(zzamq.zzc) && (zzamq.zzb.startsWith("zeroflte") || zzamq.zzb.startsWith("herolte") || zzamq.zzb.startsWith("heroqlte"));
        String str = zzfoVar.zzc;
        int i = this.zze;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", zzafvVar.zzy);
        mediaFormat.setInteger("sample-rate", zzafvVar.zzz);
        zzalq.zza(mediaFormat, zzafvVar.zzn);
        zzalq.zzb(mediaFormat, "max-input-size", i);
        if (zzamq.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (zzamq.zza != 23 || (!"ZTE B2017G".equals(zzamq.zzd) && !"AXON 7 mini".equals(zzamq.zzd)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (zzamq.zza <= 28 && "audio/ac4".equals(zzafvVar.zzl)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (zzamq.zza >= 24 && this.zzd.zzc(zzamq.zzN(4, zzafvVar.zzy, zzafvVar.zzz)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        this.zzg = (!"audio/raw".equals(zzfoVar.zzb) || "audio/raw".equals(zzafvVar.zzl)) ? null : zzafvVar;
        return zzfl.zza(zzfoVar, mediaFormat, zzafvVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final zzba zzh(zzfo zzfoVar, zzafv zzafvVar, zzafv zzafvVar2) {
        int i;
        int i2;
        zzba zzbaVarZze = zzfoVar.zze(zzafvVar, zzafvVar2);
        int i3 = zzbaVarZze.zze;
        if (zzaa(zzfoVar, zzafvVar2) > this.zze) {
            i3 |= 64;
        }
        String str = zzfoVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzbaVarZze.zzd;
        }
        return new zzba(str, zzafvVar, zzafvVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahv
    public final zzalp zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final float zzj(float f, zzafv zzafvVar, zzafv[] zzafvVarArr) {
        int iMax = -1;
        for (zzafv zzafvVar2 : zzafvVarArr) {
            int i = zzafvVar2.zzz;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzk(String str, long j, long j2) {
        this.zzc.zzb(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzl(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzm(Exception exc) {
        zzaln.zzb("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final zzba zzn(zzafw zzafwVar) throws zzaeg {
        zzba zzbaVarZzn = super.zzn(zzafwVar);
        this.zzc.zzc(zzafwVar.zza, zzbaVarZzn);
        return zzbaVarZzn;
    }

    protected final void zzp() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    protected final void zzq(boolean z, boolean z2) throws zzaeg {
        super.zzq(z, z2);
        this.zzc.zza(this.zza);
        zzav();
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    protected final void zzr(long j, boolean z) throws zzaeg {
        super.zzr(j, z);
        this.zzd.zzt();
        this.zzh = j;
        this.zzi = true;
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    protected final void zzs() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    protected final void zzt() {
        zzab();
        this.zzd.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    protected final void zzu() {
        this.zzk = true;
        try {
            this.zzd.zzt();
            try {
                super.zzu();
            } finally {
                this.zzc.zzg(this.zza);
            }
        } catch (Throwable th) {
            try {
                super.zzu();
                throw th;
            } finally {
                this.zzc.zzg(this.zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    protected final void zzv() {
        try {
            super.zzv();
            if (this.zzk) {
            }
        } finally {
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzu();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzahv
    public final boolean zzw() {
        return super.zzw() && this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzahv
    public final boolean zzx() {
        return this.zzd.zzk() || super.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final long zzy() {
        if (zzaf() == 2) {
            zzab();
        }
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final void zzz(zzahf zzahfVar) {
        this.zzd.zzl(zzahfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzD() throws zzaeg {
        try {
            this.zzd.zzi();
        } catch (zzdv e) {
            throw zzaw(e, e.zzb, e.zza, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final boolean zzF(long j, long j2, zzgh zzghVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzafv zzafvVar) throws zzaeg {
        byteBuffer.getClass();
        if (this.zzg != null && (i2 & 2) != 0) {
            zzghVar.getClass();
            zzghVar.zzh(i, false);
            return true;
        }
        if (z) {
            if (zzghVar != null) {
                zzghVar.zzh(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzh(byteBuffer, j3, i3)) {
                return false;
            }
            if (zzghVar != null) {
                zzghVar.zzh(i, false);
            }
            this.zza.zze += i3;
            return true;
        } catch (zzds e) {
            throw zzaw(e, e.zzb, false, 5001);
        } catch (zzdv e2) {
            throw zzaw(e2, zzafvVar, e2.zza, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzo(zzafv zzafvVar, MediaFormat mediaFormat) throws zzaeg {
        int iZzO;
        int i;
        zzafv zzafvVar2 = this.zzg;
        int[] iArr = null;
        if (zzafvVar2 != null) {
            zzafvVar = zzafvVar2;
        } else if (zzZ() != null) {
            if ("audio/raw".equals(zzafvVar.zzl)) {
                iZzO = zzafvVar.zzA;
            } else if (zzamq.zza >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iZzO = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                iZzO = zzamq.zzO(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                iZzO = "audio/raw".equals(zzafvVar.zzl) ? zzafvVar.zzA : 2;
            }
            zzaft zzaftVar = new zzaft();
            zzaftVar.zzN("audio/raw");
            zzaftVar.zzac(iZzO);
            zzaftVar.zzad(zzafvVar.zzB);
            zzaftVar.zzae(zzafvVar.zzC);
            zzaftVar.zzaa(mediaFormat.getInteger("channel-count"));
            zzaftVar.zzab(mediaFormat.getInteger("sample-rate"));
            zzafv zzafvVarZzah = zzaftVar.zzah();
            if (this.zzf && zzafvVarZzah.zzy == 6 && (i = zzafvVar.zzy) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < zzafvVar.zzy; i2++) {
                    iArr[i2] = i2;
                }
            }
            zzafvVar = zzafvVarZzah;
        }
        try {
            this.zzd.zze(zzafvVar, 0, iArr);
        } catch (zzdr e) {
            throw zzaw(e, e.zza, false, 5001);
        }
    }
}
