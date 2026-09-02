package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
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
public final class zzcmb extends zzcis implements zzay, zzda {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzclm zze;
    private final zzjt zzf;
    private final zzcja zzg;
    private final WeakReference<zzcjb> zzh;
    private final zzij zzi;
    private zzaie zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private zzcir zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private final String zzq;
    private final int zzr;
    private final ArrayList<zzaw> zzt;
    private volatile zzclp zzu;
    private final Object zzs = new Object();
    private final Set<WeakReference<zzcll>> zzv = new HashSet();

    /* JADX WARN: Code duplicated, block: B:27:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fa  */
    public zzcmb(Context context, zzcja zzcjaVar, zzcjb zzcjbVar) {
        final boolean z;
        final zzai zzaiVar;
        this.zzd = context;
        this.zzg = zzcjaVar;
        this.zzh = new WeakReference<>(zzcjbVar);
        zzclm zzclmVar = new zzclm();
        this.zze = zzclmVar;
        zzjt zzjtVar = new zzjt(context);
        this.zzf = zzjtVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("OfficialSimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zza.incrementAndGet();
        zzaei zzaeiVar = new zzaei(context, new zzahy(this) { // from class: com.google.android.gms.internal.ads.zzclx
            private final zzcmb zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahy
            public final zzahv[] zza(Handler handler, zzmu zzmuVar, zzdq zzdqVar, zzakr zzakrVar, zzaiw zzaiwVar) {
                return this.zza.zzn(handler, zzmuVar, zzdqVar, zzakrVar, zzaiwVar);
            }
        });
        zzaeiVar.zza(zzjtVar);
        zzaeiVar.zzb(zzclmVar);
        this.zzj = zzaeiVar.zzc();
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzbo)).booleanValue()) {
            this.zzj.zzR(false);
        }
        this.zzj.zzG(this);
        this.zzn = 0;
        this.zzp = 0L;
        this.zzo = 0;
        this.zzt = new ArrayList<>();
        this.zzu = null;
        this.zzq = (zzcjbVar == null || zzcjbVar.zzn() == null) ? "" : zzcjbVar.zzn();
        this.zzr = zzcjbVar != null ? zzcjbVar.zzp() : 0;
        final String strZzi = com.google.android.gms.ads.internal.zzt.zzc().zzi(context, zzcjbVar.zzt().zza);
        if (!this.zzl || this.zzk.limit() <= 0) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbq)).booleanValue()) {
                if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue()) {
                    z = zzcjaVar.zzj ? false : true;
                }
            } else if (zzcjaVar.zzj) {
            }
            final zzai zzaiVar2 = zzcjaVar.zzi > 0 ? new zzai(this, strZzi, z) { // from class: com.google.android.gms.internal.ads.zzclt
                private final zzcmb zza;
                private final String zzb;
                private final boolean zzc;

                {
                    this.zza = this;
                    this.zzb = strZzi;
                    this.zzc = z;
                }

                @Override // com.google.android.gms.internal.ads.zzai
                public final zzaj zza() {
                    return this.zza.zzT(this.zzb, this.zzc);
                }
            } : new zzai(this, strZzi, z) { // from class: com.google.android.gms.internal.ads.zzclu
                private final zzcmb zza;
                private final String zzb;
                private final boolean zzc;

                {
                    this.zza = this;
                    this.zzb = strZzi;
                    this.zzc = z;
                }

                @Override // com.google.android.gms.internal.ads.zzai
                public final zzaj zza() {
                    return this.zza.zzS(this.zzb, this.zzc);
                }
            };
            zzaiVar = zzcjaVar.zzj ? new zzai(this, zzaiVar2) { // from class: com.google.android.gms.internal.ads.zzclv
                private final zzcmb zza;
                private final zzai zzb;

                {
                    this.zza = this;
                    this.zzb = zzaiVar2;
                }

                @Override // com.google.android.gms.internal.ads.zzai
                public final zzaj zza() {
                    return this.zza.zzo(this.zzb);
                }
            } : zzaiVar2;
            ByteBuffer byteBuffer = this.zzk;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.zzk.limit()];
                this.zzk.get(bArr);
                zzaiVar = new zzai(zzaiVar, bArr) { // from class: com.google.android.gms.internal.ads.zzclw
                    private final zzai zza;
                    private final byte[] zzb;

                    {
                        this.zza = zzaiVar;
                        this.zzb = bArr;
                    }

                    @Override // com.google.android.gms.internal.ads.zzai
                    public final zzaj zza() {
                        zzai zzaiVar3 = this.zza;
                        byte[] bArr2 = this.zzb;
                        int i = zzcmb.zzc;
                        return new zzclq(new zzkj(bArr2), bArr2.length, zzaiVar3.zza());
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.zzk.limit()];
            this.zzk.get(bArr2);
            zzaiVar = new zzai(bArr2) { // from class: com.google.android.gms.internal.ads.zzcls
                private final byte[] zza;

                {
                    this.zza = bArr2;
                }

                @Override // com.google.android.gms.internal.ads.zzai
                public final zzaj zza() {
                    return new zzkj(this.zza);
                }
            };
        }
        this.zzi = new zzij(zzaiVar, ((Boolean) zzbet.zzc().zzc(zzbjl.zzm)).booleanValue() ? zzcly.zza : zzclz.zza);
    }

    private final boolean zzU() {
        return this.zzu != null && this.zzu.zzl();
    }

    public final void finalize() {
        zza.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final boolean zzA() {
        return this.zzj != null;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final int zzB() {
        return this.zzj.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzC() {
        return this.zzj.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final boolean zzD() {
        return this.zzj.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzE(boolean z) {
        this.zzj.zzL(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzF(int i) {
        this.zze.zzj(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzG(int i) {
        this.zze.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzH() {
        return this.zzj.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzI() {
        if (zzU()) {
            return 0L;
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzJ() {
        if (zzU() && this.zzu.zzm()) {
            return Math.min(this.zzn, this.zzu.zzo());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzK() {
        if (zzU()) {
            return this.zzu.zzp();
        }
        synchronized (this.zzs) {
            while (!this.zzt.isEmpty()) {
                long j = this.zzp;
                Map<String, List<String>> mapZzf = this.zzt.remove(0).zzf();
                long j2 = 0;
                if (mapZzf != null) {
                    for (Map.Entry<String, List<String>> entry : mapZzf.entrySet()) {
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
                this.zzp = j + j2;
            }
        }
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final int zzL() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzM(boolean z) {
        if (this.zzj == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzj.zzO();
            if (i >= 2) {
                return;
            }
            zzjt zzjtVar = this.zzf;
            zzjo zzjoVarZzg = zzjtVar.zzc().zzg();
            zzjoVarZzg.zzs(i, !z);
            zzjtVar.zzd(zzjoVarZzg);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzN() {
        return this.zzj.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzO() {
        return this.zzn;
    }

    final /* synthetic */ void zzR(boolean z, long j) {
        zzcir zzcirVar = this.zzm;
        if (zzcirVar != null) {
            zzcirVar.zza(z, j);
        }
    }

    final /* synthetic */ zzaj zzS(String str, boolean z) {
        zzao zzaoVar = new zzao();
        zzaoVar.zzb(str);
        zzaoVar.zzf(true != z ? null : this);
        zzaoVar.zzc(this.zzg.zzd);
        zzaoVar.zzd(this.zzg.zzf);
        zzaoVar.zze(true);
        return zzaoVar.zza();
    }

    final /* synthetic */ zzaj zzT(String str, boolean z) {
        zzcmb zzcmbVar = true != z ? null : this;
        zzcja zzcjaVar = this.zzg;
        zzcll zzcllVar = new zzcll(str, zzcmbVar, zzcjaVar.zzd, zzcjaVar.zzf, zzcjaVar.zzi);
        this.zzv.add(new WeakReference<>(zzcllVar));
        return zzcllVar;
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zza(zzaj zzajVar, zzan zzanVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzb(zzaj zzajVar, zzan zzanVar, boolean z) {
        if (zzajVar instanceof zzaw) {
            synchronized (this.zzs) {
                this.zzt.add((zzaw) zzajVar);
            }
        } else if (zzajVar instanceof zzclp) {
            this.zzu = (zzclp) zzajVar;
            final zzcjb zzcjbVar = this.zzh.get();
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue() && zzcjbVar != null && this.zzu.zzk()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzu.zzm()));
                map.put("gcacheDownloaded", String.valueOf(this.zzu.zzn()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(zzcjbVar, map) { // from class: com.google.android.gms.internal.ads.zzclr
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
                        int i = zzcmb.zzc;
                        zzcjbVar2.zze("onGcacheInfoEvent", map2);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzc(zzaj zzajVar, zzan zzanVar, boolean z, int i) {
        this.zzn += i;
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzd(zzaj zzajVar, zzan zzanVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final void zze(zzcz zzczVar, int i) {
        zzcir zzcirVar = this.zzm;
        if (zzcirVar != null) {
            zzcirVar.zzb(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final void zzf(zzcz zzczVar, zzahc zzahcVar) {
        zzcir zzcirVar = this.zzm;
        if (zzcirVar != null) {
            zzcirVar.zzu("onPlayerError", zzahcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final void zzg(zzcz zzczVar, zzgx zzgxVar, zzhc zzhcVar, IOException iOException, boolean z) {
        zzcir zzcirVar = this.zzm;
        if (zzcirVar != null) {
            if (this.zzg.zzl) {
                zzcirVar.zzv("onLoadException", iOException);
            } else {
                zzcirVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final void zzh(zzcz zzczVar, zzafv zzafvVar, zzba zzbaVar) {
        zzcjb zzcjbVar = this.zzh.get();
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue() || zzcjbVar == null || zzafvVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("audioMime", zzafvVar.zzk);
        map.put("audioSampleMime", zzafvVar.zzl);
        map.put("audioCodec", zzafvVar.zzi);
        zzcjbVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final void zzi(zzcz zzczVar, zzafv zzafvVar, zzba zzbaVar) {
        zzcjb zzcjbVar = this.zzh.get();
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue() || zzcjbVar == null || zzafvVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzafvVar.zzs));
        map.put("bitRate", String.valueOf(zzafvVar.zzh));
        int i = zzafvVar.zzq;
        int i2 = zzafvVar.zzr;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        map.put("resolution", sb.toString());
        map.put("videoMime", zzafvVar.zzk);
        map.put("videoSampleMime", zzafvVar.zzl);
        map.put("videoCodec", zzafvVar.zzi);
        zzcjbVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final void zzj(zzcz zzczVar, int i, long j) {
        this.zzo += i;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final void zzk(zzcz zzczVar, Object obj, long j) {
        zzcir zzcirVar = this.zzm;
        if (zzcirVar != null) {
            zzcirVar.zzC();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final void zzl(zzcz zzczVar, zzy zzyVar) {
        zzcir zzcirVar = this.zzm;
        if (zzcirVar != null) {
            zzcirVar.zzc(zzyVar.zzb, zzyVar.zzc);
        }
    }

    final zzhh zzm(Uri uri) {
        zzagb zzagbVar = new zzagb();
        zzagbVar.zzb(uri);
        zzagk zzagkVarZzc = zzagbVar.zzc();
        zzij zzijVar = this.zzi;
        zzijVar.zza(this.zzg.zzg);
        return zzijVar.zzb(zzagkVarZzc);
    }

    final /* synthetic */ zzahv[] zzn(Handler handler, zzmu zzmuVar, zzdq zzdqVar, zzakr zzakrVar, zzaiw zzaiwVar) {
        return new zzahv[]{new zzer(this.zzd, zzfm.zza, zzfs.zzb, false, handler, zzdqVar, new zzen(null, new zzde[0], false)), new zzlz(this.zzd, zzfm.zza, zzfs.zzb, 0L, false, handler, zzmuVar, -1)};
    }

    final /* synthetic */ zzaj zzo(zzai zzaiVar) {
        return new zzclp(this.zzd, zzaiVar.zza(), this.zzq, this.zzr, this, new zzclo(this) { // from class: com.google.android.gms.internal.ads.zzcma
            private final zzcmb zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzclo
            public final void zza(boolean z, long j) {
                this.zza.zzR(z, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzp(Uri[] uriArr, String str) {
        zzq(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzr(zzcir zzcirVar) {
        this.zzm = zzcirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzs() {
        zzaie zzaieVar = this.zzj;
        if (zzaieVar != null) {
            zzaieVar.zzH(this);
            this.zzj.zzN();
            this.zzj = null;
            zzb.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzt(Surface surface, boolean z) {
        zzaie zzaieVar = this.zzj;
        if (zzaieVar == null) {
            return;
        }
        zzaieVar.zzy(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzu(float f, boolean z) {
        zzaie zzaieVar = this.zzj;
        if (zzaieVar == null) {
            return;
        }
        zzaieVar.zzE(f);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzv() {
        this.zzj.zzq(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzw(long j) {
        zzaie zzaieVar = this.zzj;
        zzaieVar.zzp(zzaieVar.zzv(), j);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzx(int i) {
        this.zze.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzy(int i) {
        this.zze.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzz(int i) {
        Iterator<WeakReference<zzcll>> it = this.zzv.iterator();
        while (it.hasNext()) {
            zzcll zzcllVar = it.next().get();
            if (zzcllVar != null) {
                zzcllVar.zzl(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzq(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzhh zzhvVar;
        if (this.zzj == null) {
            return;
        }
        this.zzk = byteBuffer;
        this.zzl = z;
        int length = uriArr.length;
        if (length == 1) {
            zzhvVar = zzm(uriArr[0]);
        } else {
            zzhh[] zzhhVarArr = new zzhh[length];
            for (int i = 0; i < uriArr.length; i++) {
                zzhhVarArr[i] = zzm(uriArr[i]);
            }
            zzhvVar = new zzhv(false, false, zzhhVarArr);
        }
        this.zzj.zzK(zzhvVar);
        this.zzj.zzJ();
        zzb.incrementAndGet();
    }
}
