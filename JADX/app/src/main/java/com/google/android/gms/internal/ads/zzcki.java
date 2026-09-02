package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcki extends zzcis implements zzauo, zzasm, zzavy, zzaoj, zzamz {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzcjy zze;
    private final zzanr zzf;
    private final zzanr zzg;
    private final zzatq zzh;
    private final zzcja zzi;
    private zzanc zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private final WeakReference<zzcjb> zzm;
    private zzcir zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private final String zzr;
    private final int zzs;
    private final ArrayList<zzaui> zzu;
    private volatile zzcjx zzv;
    private final Object zzt = new Object();
    private final Set<WeakReference<zzcju>> zzw = new HashSet();

    public zzcki(Context context, zzcja zzcjaVar, zzcjb zzcjbVar) {
        this.zzd = context;
        this.zzi = zzcjaVar;
        this.zzm = new WeakReference<>(zzcjbVar);
        zzcjy zzcjyVar = new zzcjy();
        this.zze = zzcjyVar;
        zzavn zzavnVar = new zzavn(context, zzark.zza, 0L, com.google.android.gms.ads.internal.util.zzs.zza, this, -1);
        this.zzf = zzavnVar;
        zzaox zzaoxVar = new zzaox(zzark.zza, null, true, com.google.android.gms.ads.internal.util.zzs.zza, this);
        this.zzg = zzaoxVar;
        zzatm zzatmVar = new zzatm(null);
        this.zzh = zzatmVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        zza.incrementAndGet();
        zzanc zzancVarZza = zzand.zza(new zzanr[]{zzaoxVar, zzavnVar}, zzatmVar, zzcjyVar);
        this.zzj = zzancVarZza;
        zzancVarZza.zza(this);
        this.zzo = 0;
        this.zzq = 0L;
        this.zzp = 0;
        this.zzu = new ArrayList<>();
        this.zzv = null;
        this.zzr = (zzcjbVar == null || zzcjbVar.zzn() == null) ? "" : zzcjbVar.zzn();
        this.zzs = zzcjbVar != null ? zzcjbVar.zzp() : 0;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzn)).booleanValue()) {
            this.zzj.zzo();
        }
        if (zzcjbVar != null && zzcjbVar.zzD() > 0) {
            this.zzj.zzp(zzcjbVar.zzD());
        }
        if (zzcjbVar == null || zzcjbVar.zzE() <= 0) {
            return;
        }
        this.zzj.zzq(zzcjbVar.zzE());
    }

    private final boolean zzY() {
        return this.zzv != null && this.zzv.zzf();
    }

    public final void finalize() throws Throwable {
        zza.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final boolean zzA() {
        return this.zzj != null;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final int zzB() {
        return this.zzj.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzC() {
        return this.zzj.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final boolean zzD() {
        return this.zzj.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzE(boolean z) {
        this.zzj.zze(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzF(int i) {
        this.zze.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzG(int i) {
        this.zze.zzh(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzH() {
        return this.zzj.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzI() {
        if (zzY()) {
            return 0L;
        }
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzJ() {
        if (zzY() && this.zzv.zzg()) {
            return Math.min(this.zzo, this.zzv.zzi());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzK() {
        if (zzY()) {
            return this.zzv.zzj();
        }
        synchronized (this.zzt) {
            while (!this.zzu.isEmpty()) {
                long j = this.zzq;
                Map<String, List<String>> mapZze = this.zzu.remove(0).zze();
                long j2 = 0;
                if (mapZze != null) {
                    for (Map.Entry<String, List<String>> entry : mapZze.entrySet()) {
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && zzflf.zze("content-length", entry.getKey()) && entry.getValue() != null && entry.getValue().get(0) != null) {
                                    j2 = Long.parseLong(entry.getValue().get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzq = j + j2;
            }
        }
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final int zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzM(boolean z) {
        if (this.zzj != null) {
            for (int i = 0; i < 2; i++) {
                this.zzh.zzc(i, !z);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzN() {
        return this.zzj.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzO() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzauo
    /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
    public final void zzj(zzatz zzatzVar, zzaub zzaubVar) {
        if (zzatzVar instanceof zzaui) {
            synchronized (this.zzt) {
                this.zzu.add((zzaui) zzatzVar);
            }
        } else if (zzatzVar instanceof zzcjx) {
            this.zzv = (zzcjx) zzatzVar;
            final zzcjb zzcjbVar = this.zzm.get();
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue() && zzcjbVar != null && this.zzv.zze()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzv.zzg()));
                map.put("gcacheDownloaded", String.valueOf(this.zzv.zzh()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(zzcjbVar, map) { // from class: com.google.android.gms.internal.ads.zzcjz
                    private final zzcjb zza;
                    private final Map zzb;

                    {
                        this.zza = zzcjbVar;
                        this.zzb = map;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcjb zzcjbVar2 = this.zza;
                        Map<String, ?> map2 = this.zzb;
                        int i = zzcki.zzc;
                        zzcjbVar2.zze("onGcacheInfoEvent", map2);
                    }
                });
            }
        }
    }

    public final void zzS(zzatz zzatzVar, int i) {
        this.zzo += i;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    final zzasr zzT(Uri uri, final String str) {
        final zzaty zzatyVar;
        zzaty zzatyVar2;
        zzapq zzapqVar;
        if (!this.zzl || this.zzk.limit() <= 0) {
            final boolean z = true;
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbq)).booleanValue()) {
                if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue()) {
                    if (this.zzi.zzj) {
                        z = false;
                    }
                }
            } else if (this.zzi.zzj) {
                z = false;
            }
            zzatyVar = this.zzi.zzi > 0 ? new zzaty(this, str, z) { // from class: com.google.android.gms.internal.ads.zzckb
                private final zzcki zza;
                private final String zzb;
                private final boolean zzc;

                {
                    this.zza = this;
                    this.zzb = str;
                    this.zzc = z;
                }

                @Override // com.google.android.gms.internal.ads.zzaty
                public final zzatz zza() {
                    return this.zza.zzX(this.zzb, this.zzc);
                }
            } : new zzaty(this, str, z) { // from class: com.google.android.gms.internal.ads.zzckc
                private final zzcki zza;
                private final String zzb;
                private final boolean zzc;

                {
                    this.zza = this;
                    this.zzb = str;
                    this.zzc = z;
                }

                @Override // com.google.android.gms.internal.ads.zzaty
                public final zzatz zza() {
                    return this.zza.zzW(this.zzb, this.zzc);
                }
            };
            if (this.zzi.zzj) {
                zzatyVar = new zzaty(this, zzatyVar) { // from class: com.google.android.gms.internal.ads.zzckd
                    private final zzcki zza;
                    private final zzaty zzb;

                    {
                        this.zza = this;
                        this.zzb = zzatyVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzaty
                    public final zzatz zza() {
                        return this.zza.zzU(this.zzb);
                    }
                };
            }
            ByteBuffer byteBuffer = this.zzk;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.zzk.limit()];
                this.zzk.get(bArr);
                zzatyVar2 = new zzaty(zzatyVar, bArr) { // from class: com.google.android.gms.internal.ads.zzcke
                    private final zzaty zza;
                    private final byte[] zzb;

                    {
                        this.zza = zzatyVar;
                        this.zzb = bArr;
                    }

                    @Override // com.google.android.gms.internal.ads.zzaty
                    public final zzatz zza() {
                        zzaty zzatyVar3 = this.zza;
                        byte[] bArr2 = this.zzb;
                        int i = zzcki.zzc;
                        return new zzckj(new zzatx(bArr2), bArr2.length, zzatyVar3.zza());
                    }
                };
            }
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzm)).booleanValue()) {
                zzapqVar = zzckf.zza;
            } else {
                zzapqVar = zzckg.zza;
            }
            return new zzasn(uri, zzatyVar2, zzapqVar, this.zzi.zzk, com.google.android.gms.ads.internal.util.zzs.zza, this, null, this.zzi.zzg);
        }
        final byte[] bArr2 = new byte[this.zzk.limit()];
        this.zzk.get(bArr2);
        zzatyVar = new zzaty(bArr2) { // from class: com.google.android.gms.internal.ads.zzcka
            private final byte[] zza;

            {
                this.zza = bArr2;
            }

            @Override // com.google.android.gms.internal.ads.zzaty
            public final zzatz zza() {
                return new zzatx(this.zza);
            }
        };
        zzatyVar2 = zzatyVar;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzm)).booleanValue()) {
            zzapqVar = zzckf.zza;
        } else {
            zzapqVar = zzckg.zza;
        }
        return new zzasn(uri, zzatyVar2, zzapqVar, this.zzi.zzk, com.google.android.gms.ads.internal.util.zzs.zza, this, null, this.zzi.zzg);
    }

    final /* synthetic */ zzatz zzU(zzaty zzatyVar) {
        return new zzcjx(this.zzd, zzatyVar.zza(), this.zzr, this.zzs, this, new zzcjw(this) { // from class: com.google.android.gms.internal.ads.zzckh
            private final zzcki zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzcjw
            public final void zza(boolean z, long j) {
                this.zza.zzV(z, j);
            }
        });
    }

    final /* synthetic */ void zzV(boolean z, long j) {
        zzcir zzcirVar = this.zzn;
        if (zzcirVar != null) {
            zzcirVar.zza(z, j);
        }
    }

    final /* synthetic */ zzatz zzW(String str, boolean z) {
        zzcki zzckiVar = true != z ? null : this;
        zzcja zzcjaVar = this.zzi;
        return new zzaud(str, null, zzckiVar, zzcjaVar.zzd, zzcjaVar.zzf, true, null);
    }

    final /* synthetic */ zzatz zzX(String str, boolean z) {
        zzcki zzckiVar = true != z ? null : this;
        zzcja zzcjaVar = this.zzi;
        zzcju zzcjuVar = new zzcju(str, zzckiVar, zzcjaVar.zzd, zzcjaVar.zzf, zzcjaVar.zzi);
        this.zzw.add(new WeakReference<>(zzcjuVar));
        return zzcjuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzanx zzanxVar, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzatg zzatgVar, zzats zzatsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(boolean z, int i) {
        zzcir zzcirVar = this.zzn;
        if (zzcirVar != null) {
            zzcirVar.zzb(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze(zzamy zzamyVar) {
        zzcir zzcirVar = this.zzn;
        if (zzcirVar != null) {
            zzcirVar.zzu("onPlayerError", zzamyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzg(zzanq zzanqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaoj
    public final void zzh(zzanm zzanmVar) {
        zzcjb zzcjbVar = this.zzm.get();
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue() || zzcjbVar == null || zzanmVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("audioMime", zzanmVar.zze);
        map.put("audioSampleMime", zzanmVar.zzf);
        map.put("audioCodec", zzanmVar.zzc);
        zzcjbVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final void zzi(IOException iOException) {
        zzcir zzcirVar = this.zzn;
        if (zzcirVar != null) {
            if (this.zzi.zzl) {
                zzcirVar.zzv("onLoadException", iOException);
            } else {
                zzcirVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauo
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i) {
        this.zzo += i;
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzl(zzanm zzanmVar) {
        zzcjb zzcjbVar = this.zzm.get();
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue() || zzcjbVar == null || zzanmVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzanmVar.zzl));
        map.put("bitRate", String.valueOf(zzanmVar.zzb));
        int i = zzanmVar.zzj;
        int i2 = zzanmVar.zzk;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        map.put("resolution", sb.toString());
        map.put("videoMime", zzanmVar.zze);
        map.put("videoSampleMime", zzanmVar.zzf);
        map.put("videoCodec", zzanmVar.zzc);
        zzcjbVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzm(int i, long j) {
        this.zzp += i;
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzn(int i, int i2, int i3, float f) {
        zzcir zzcirVar = this.zzn;
        if (zzcirVar != null) {
            zzcirVar.zzc(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzo(Surface surface) {
        zzcir zzcirVar = this.zzn;
        if (zzcirVar != null) {
            zzcirVar.zzC();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzp(Uri[] uriArr, String str) {
        zzq(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzr(zzcir zzcirVar) {
        this.zzn = zzcirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzs() {
        zzanc zzancVar = this.zzj;
        if (zzancVar != null) {
            zzancVar.zzb(this);
            this.zzj.zzi();
            this.zzj = null;
            zzb.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzt(Surface surface, boolean z) {
        if (this.zzj == null) {
            return;
        }
        zzanb zzanbVar = new zzanb(this.zzf, 1, surface);
        if (z) {
            this.zzj.zzk(zzanbVar);
        } else {
            this.zzj.zzj(zzanbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzu(float f, boolean z) {
        if (this.zzj == null) {
            return;
        }
        zzanb zzanbVar = new zzanb(this.zzg, 2, Float.valueOf(f));
        if (z) {
            this.zzj.zzk(zzanbVar);
        } else {
            this.zzj.zzj(zzanbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzv() {
        this.zzj.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzw(long j) {
        this.zzj.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzx(int i) {
        this.zze.zzi(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzy(int i) {
        this.zze.zzj(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzz(int i) {
        Iterator<WeakReference<zzcju>> it = this.zzw.iterator();
        while (it.hasNext()) {
            zzcju zzcjuVar = it.next().get();
            if (zzcjuVar != null) {
                zzcjuVar.zzg(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzq(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzasr zzasvVar;
        if (this.zzj == null) {
            return;
        }
        this.zzk = byteBuffer;
        this.zzl = z;
        int length = uriArr.length;
        if (length == 1) {
            zzasvVar = zzT(uriArr[0], str);
        } else {
            zzasr[] zzasrVarArr = new zzasr[length];
            for (int i = 0; i < uriArr.length; i++) {
                zzasrVarArr[i] = zzT(uriArr[i], str);
            }
            zzasvVar = new zzasv(zzasrVarArr);
        }
        this.zzj.zzd(zzasvVar);
        zzb.incrementAndGet();
    }
}
