package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzwc<T> implements Comparable<zzwc<T>> {
    private final zzwn zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzwg zzf;
    private Integer zzg;
    private zzwf zzh;
    private boolean zzi;
    private zzvl zzj;
    private zzwb zzk;
    private final zzvq zzl;

    public zzwc(int i, String str, zzwg zzwgVar) {
        Uri uri;
        String host;
        this.zza = zzwn.zza ? new zzwn() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzwgVar;
        this.zzl = new zzvq();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzwc) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        String strConcat = strValueOf.length() != 0 ? "0x".concat(strValueOf) : new String("0x");
        zzm();
        String str = this.zzc;
        String strValueOf2 = String.valueOf(this.zzg);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(strConcat).length() + 6 + String.valueOf(strValueOf2).length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(strConcat);
        sb.append(" NORMAL ");
        sb.append(strValueOf2);
        return sb.toString();
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final void zzd(String str) {
        if (zzwn.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    final void zze(String str) {
        zzwf zzwfVar = this.zzh;
        if (zzwfVar != null) {
            zzwfVar.zzc(this);
        }
        if (zzwn.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzwa(this, str, id));
            } else {
                this.zza.zza(str, id);
                this.zza.zzb(toString());
            }
        }
    }

    final void zzf(int i) {
        zzwf zzwfVar = this.zzh;
        if (zzwfVar != null) {
            zzwfVar.zzd(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzwc<?> zzg(zzwf zzwfVar) {
        this.zzh = zzwfVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzwc<?> zzh(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public final String zzi() {
        return this.zzc;
    }

    public final String zzj() {
        String str = this.zzc;
        if (this.zzb == 0) {
            return str;
        }
        String string = Integer.toString(1);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
        sb.append(string);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzwc<?> zzk(zzvl zzvlVar) {
        this.zzj = zzvlVar;
        return this;
    }

    public final zzvl zzl() {
        return this.zzj;
    }

    public final boolean zzm() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map<String, String> zzn() throws zzvk {
        return Collections.emptyMap();
    }

    public byte[] zzo() throws zzvk {
        return null;
    }

    public final int zzp() {
        return this.zzl.zza();
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzr() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    protected abstract zzwi<T> zzs(zzvy zzvyVar);

    protected abstract void zzt(T t);

    public final void zzu(zzwl zzwlVar) {
        zzwg zzwgVar;
        synchronized (this.zze) {
            zzwgVar = this.zzf;
        }
        if (zzwgVar != null) {
            zzwgVar.zza(zzwlVar);
        }
    }

    final void zzv(zzwb zzwbVar) {
        synchronized (this.zze) {
            this.zzk = zzwbVar;
        }
    }

    final void zzw(zzwi<?> zzwiVar) {
        zzwb zzwbVar;
        synchronized (this.zze) {
            zzwbVar = this.zzk;
        }
        if (zzwbVar != null) {
            zzwbVar.zza(this, zzwiVar);
        }
    }

    final void zzx() {
        zzwb zzwbVar;
        synchronized (this.zze) {
            zzwbVar = this.zzk;
        }
        if (zzwbVar != null) {
            zzwbVar.zzb(this);
        }
    }

    public final zzvq zzy() {
        return this.zzl;
    }
}
