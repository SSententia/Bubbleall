package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcy implements zzahl, zzdq, zzmu, zzhp, zzkh, zzfb {
    private final zzaku zza;
    private final zzain zzb;
    private final zzaip zzc;
    private final zzcx zzd;
    private final SparseArray<zzcz> zze;
    private zzalm<zzda> zzf;
    private zzahp zzg;
    private zzalg zzh;
    private boolean zzi;

    public zzcy(zzaku zzakuVar) {
        this.zza = zzakuVar;
        this.zzf = new zzalm<>(zzamq.zzk(), zzakuVar, zzbb.zza);
        zzain zzainVar = new zzain();
        this.zzb = zzainVar;
        this.zzc = new zzaip();
        this.zzd = new zzcx(zzainVar);
        this.zze = new SparseArray<>();
    }

    private final zzcz zzag() {
        return zzaf(this.zzd.zzc());
    }

    private final zzcz zzah() {
        return zzaf(this.zzd.zzd());
    }

    private final zzcz zzai(int i, zzhf zzhfVar) {
        zzahp zzahpVar = this.zzg;
        zzahpVar.getClass();
        if (zzhfVar != null) {
            return this.zzd.zzf(zzhfVar) != null ? zzaf(zzhfVar) : zzZ(zzaiq.zzc, i, zzhfVar);
        }
        zzaiq zzaiqVarZzF = zzahpVar.zzF();
        if (i >= zzaiqVarZzF.zza()) {
            zzaiqVarZzF = zzaiq.zzc;
        }
        return zzZ(zzaiqVarZzF, i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzA(final Exception exc) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, 1038, new zzalj(zzczVarZzah, exc) { // from class: com.google.android.gms.internal.ads.zzbs
            private final zzcz zza;
            private final Exception zzb;

            {
                this.zza = zzczVarZzah;
                this.zzb = exc;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final void zzB(final int i, final int i2) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, 1029, new zzalj(zzczVarZzah, i, i2) { // from class: com.google.android.gms.internal.ads.zzbt
            private final zzcz zza;

            {
                this.zza = zzczVarZzah;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzC(int i, zzhf zzhfVar, final zzgx zzgxVar, final zzhc zzhcVar) {
        final zzcz zzczVarZzai = zzai(i, zzhfVar);
        zzX(zzczVarZzai, 1000, new zzalj(zzczVarZzai, zzgxVar, zzhcVar) { // from class: com.google.android.gms.internal.ads.zzbu
            private final zzcz zza;
            private final zzgx zzb;
            private final zzhc zzc;

            {
                this.zza = zzczVarZzai;
                this.zzb = zzgxVar;
                this.zzc = zzhcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzD(int i, zzhf zzhfVar, final zzgx zzgxVar, final zzhc zzhcVar) {
        final zzcz zzczVarZzai = zzai(i, zzhfVar);
        zzX(zzczVarZzai, 1001, new zzalj(zzczVarZzai, zzgxVar, zzhcVar) { // from class: com.google.android.gms.internal.ads.zzbw
            private final zzcz zza;
            private final zzgx zzb;
            private final zzhc zzc;

            {
                this.zza = zzczVarZzai;
                this.zzb = zzgxVar;
                this.zzc = zzhcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzE(int i, zzhf zzhfVar, final zzgx zzgxVar, final zzhc zzhcVar) {
        final zzcz zzczVarZzai = zzai(i, zzhfVar);
        zzX(zzczVarZzai, 1002, new zzalj(zzczVarZzai, zzgxVar, zzhcVar) { // from class: com.google.android.gms.internal.ads.zzbx
            private final zzcz zza;
            private final zzgx zzb;
            private final zzhc zzc;

            {
                this.zza = zzczVarZzai;
                this.zzb = zzgxVar;
                this.zzc = zzhcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzF(int i, zzhf zzhfVar, final zzgx zzgxVar, final zzhc zzhcVar, final IOException iOException, final boolean z) {
        final zzcz zzczVarZzai = zzai(i, zzhfVar);
        zzX(zzczVarZzai, PointerIconCompat.TYPE_HELP, new zzalj(zzczVarZzai, zzgxVar, zzhcVar, iOException, z) { // from class: com.google.android.gms.internal.ads.zzby
            private final zzcz zza;
            private final zzgx zzb;
            private final zzhc zzc;
            private final IOException zzd;
            private final boolean zze;

            {
                this.zza = zzczVarZzai;
                this.zzb = zzgxVar;
                this.zzc = zzhcVar;
                this.zzd = iOException;
                this.zze = z;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                ((zzda) obj).zzg(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzG(int i, zzhf zzhfVar, final zzhc zzhcVar) {
        final zzcz zzczVarZzai = zzai(i, zzhfVar);
        zzX(zzczVarZzai, 1004, new zzalj(zzczVarZzai, zzhcVar) { // from class: com.google.android.gms.internal.ads.zzbz
            private final zzcz zza;
            private final zzhc zzb;

            {
                this.zza = zzczVarZzai;
                this.zzb = zzhcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzI(final zzagk zzagkVar, final int i) {
        final zzcz zzczVarZzY = zzY();
        zzX(zzczVarZzY, 1, new zzalj(zzczVarZzY, zzagkVar, i) { // from class: com.google.android.gms.internal.ads.zzcb
            private final zzcz zza;
            private final zzagk zzb;

            {
                this.zza = zzczVarZzY;
                this.zzb = zzagkVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzJ(final zzs zzsVar, final zzt zztVar) {
        final zzcz zzczVarZzY = zzY();
        zzX(zzczVarZzY, 2, new zzalj(zzczVarZzY, zzsVar, zztVar) { // from class: com.google.android.gms.internal.ads.zzcc
            private final zzcz zza;
            private final zzs zzb;
            private final zzt zzc;

            {
                this.zza = zzczVarZzY;
                this.zzb = zzsVar;
                this.zzc = zztVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzK(final boolean z) {
        final zzcz zzczVarZzY = zzY();
        zzX(zzczVarZzY, 3, new zzalj(zzczVarZzY, z) { // from class: com.google.android.gms.internal.ads.zzcd
            private final zzcz zza;

            {
                this.zza = zzczVarZzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzL(final zzahi zzahiVar) {
        final zzcz zzczVarZzY = zzY();
        zzX(zzczVarZzY, 13, new zzalj(zzczVarZzY, zzahiVar) { // from class: com.google.android.gms.internal.ads.zzce
            private final zzcz zza;
            private final zzahi zzb;

            {
                this.zza = zzczVarZzY;
                this.zzb = zzahiVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzM(final boolean z, final int i) {
        final zzcz zzczVarZzY = zzY();
        zzX(zzczVarZzY, -1, new zzalj(zzczVarZzY, z, i) { // from class: com.google.android.gms.internal.ads.zzcg
            private final zzcz zza;

            {
                this.zza = zzczVarZzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzN(final int i) {
        final zzcz zzczVarZzY = zzY();
        zzX(zzczVarZzY, 4, new zzalj(zzczVarZzY, i) { // from class: com.google.android.gms.internal.ads.zzch
            private final zzcz zza;
            private final int zzb;

            {
                this.zza = zzczVarZzY;
                this.zzb = i;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                ((zzda) obj).zze(this.zza, this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzO(final boolean z, final int i) {
        final zzcz zzczVarZzY = zzY();
        zzX(zzczVarZzY, 5, new zzalj(zzczVarZzY, z, i) { // from class: com.google.android.gms.internal.ads.zzci
            private final zzcz zza;

            {
                this.zza = zzczVarZzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzP(final int i) {
        final zzcz zzczVarZzY = zzY();
        zzX(zzczVarZzY, 6, new zzalj(zzczVarZzY, i) { // from class: com.google.android.gms.internal.ads.zzcj
            private final zzcz zza;

            {
                this.zza = zzczVarZzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzQ(final boolean z) {
        final zzcz zzczVarZzY = zzY();
        zzX(zzczVarZzY, 7, new zzalj(zzczVarZzY, z) { // from class: com.google.android.gms.internal.ads.zzck
            private final zzcz zza;

            {
                this.zza = zzczVarZzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzR(final zzahc zzahcVar) {
        zzo zzoVar;
        final zzcz zzczVarZzY = null;
        if ((zzahcVar instanceof zzaeg) && (zzoVar = ((zzaeg) zzahcVar).zzf) != null) {
            zzczVarZzY = zzaf(new zzhf(zzoVar));
        }
        if (zzczVarZzY == null) {
            zzczVarZzY = zzY();
        }
        zzX(zzczVarZzY, 10, new zzalj(zzczVarZzY, zzahcVar) { // from class: com.google.android.gms.internal.ads.zzcl
            private final zzcz zza;
            private final zzahc zzb;

            {
                this.zza = zzczVarZzY;
                this.zzb = zzahcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                ((zzda) obj).zzf(this.zza, this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzT(final zzahf zzahfVar) {
        final zzcz zzczVarZzY = zzY();
        zzX(zzczVarZzY, 12, new zzalj(zzczVarZzY, zzahfVar) { // from class: com.google.android.gms.internal.ads.zzcn
            private final zzcz zza;
            private final zzahf zzb;

            {
                this.zza = zzczVarZzY;
                this.zzb = zzahfVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzU(final zzago zzagoVar) {
        final zzcz zzczVarZzY = zzY();
        zzX(zzczVarZzY, 14, new zzalj(zzczVarZzY, zzagoVar) { // from class: com.google.android.gms.internal.ads.zzcp
            private final zzcz zza;
            private final zzago zzb;

            {
                this.zza = zzczVarZzY;
                this.zzb = zzagoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzV() {
        final zzcz zzczVarZzY = zzY();
        zzX(zzczVarZzY, -1, new zzalj(zzczVarZzY) { // from class: com.google.android.gms.internal.ads.zzcq
            private final zzcz zza;

            {
                this.zza = zzczVarZzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void zzW(final int i, final long j, final long j2) {
        final zzcz zzczVarZzaf = zzaf(this.zzd.zze());
        zzX(zzczVarZzaf, PointerIconCompat.TYPE_CELL, new zzalj(zzczVarZzaf, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzcr
            private final zzcz zza;

            {
                this.zza = zzczVarZzaf;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    protected final void zzX(zzcz zzczVar, int i, zzalj<zzda> zzaljVar) {
        this.zze.put(i, zzczVar);
        zzalm<zzda> zzalmVar = this.zzf;
        zzalmVar.zzd(i, zzaljVar);
        zzalmVar.zze();
    }

    protected final zzcz zzY() {
        return zzaf(this.zzd.zzb());
    }

    @RequiresNonNull({"player"})
    protected final zzcz zzZ(zzaiq zzaiqVar, int i, zzhf zzhfVar) {
        zzhf zzhfVar2 = true == zzaiqVar.zzt() ? null : zzhfVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = zzaiqVar.equals(this.zzg.zzF()) && i == this.zzg.zzv();
        long jZza = 0;
        if (zzhfVar2 == null || !zzhfVar2.zzb()) {
            if (z) {
                jZza = this.zzg.zzD();
            } else if (!zzaiqVar.zzt()) {
                long j = zzaiqVar.zzf(i, this.zzc, 0L).zzl;
                jZza = zzadx.zza(0L);
            }
        } else if (z && this.zzg.zzB() == zzhfVar2.zzb && this.zzg.zzC() == zzhfVar2.zzc) {
            jZza = this.zzg.zzx();
        }
        return new zzcz(jElapsedRealtime, zzaiqVar, i, zzhfVar2, jZza, this.zzg.zzF(), this.zzg.zzv(), this.zzd.zzb(), this.zzg.zzx(), this.zzg.zzz());
    }

    public final void zza(zzda zzdaVar) {
        this.zzf.zzb(zzdaVar);
    }

    final /* synthetic */ void zzaa() {
        this.zzf.zzf();
    }

    final /* synthetic */ void zzab(zzahp zzahpVar, zzda zzdaVar, zzale zzaleVar) {
        SparseArray<zzcz> sparseArray = this.zze;
        SparseArray sparseArray2 = new SparseArray(zzaleVar.zza());
        for (int i = 0; i < zzaleVar.zza(); i++) {
            int iZzb = zzaleVar.zzb(i);
            zzcz zzczVar = sparseArray.get(iZzb);
            zzczVar.getClass();
            sparseArray2.append(iZzb, zzczVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final void zzac(zzaee zzaeeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final void zzad(int i, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final void zzae() {
    }

    public final void zzb(zzda zzdaVar) {
        this.zzf.zzc(zzdaVar);
    }

    public final void zzc(final zzahp zzahpVar, Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzb.isEmpty()) {
            z = false;
        }
        zzakt.zzd(z);
        this.zzg = zzahpVar;
        this.zzh = this.zza.zza(looper, null);
        this.zzf = this.zzf.zza(looper, new zzalk(this, zzahpVar) { // from class: com.google.android.gms.internal.ads.zzbk
            private final zzcy zza;
            private final zzahp zzb;

            {
                this.zza = this;
                this.zzb = zzahpVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalk
            public final void zza(Object obj, zzale zzaleVar) {
                this.zza.zzab(this.zzb, (zzda) obj, zzaleVar);
            }
        });
    }

    public final void zzd() {
        final zzcz zzczVarZzY = zzY();
        this.zze.put(1036, zzczVarZzY);
        zzX(zzczVarZzY, 1036, new zzalj(zzczVarZzY) { // from class: com.google.android.gms.internal.ads.zzbv
            private final zzcz zza;

            {
                this.zza = zzczVarZzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
        zzalg zzalgVar = this.zzh;
        zzakt.zze(zzalgVar);
        zzalgVar.zzj(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcf
            private final zzcy zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaa();
            }
        });
    }

    public final void zzf() {
        if (this.zzi) {
            return;
        }
        final zzcz zzczVarZzY = zzY();
        this.zzi = true;
        zzX(zzczVarZzY, -1, new zzalj(zzczVarZzY) { // from class: com.google.android.gms.internal.ads.zzco
            private final zzcz zza;

            {
                this.zza = zzczVarZzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzg(final zzaz zzazVar) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, PointerIconCompat.TYPE_TEXT, new zzalj(zzczVarZzah, zzazVar) { // from class: com.google.android.gms.internal.ads.zzcs
            private final zzcz zza;
            private final zzaz zzb;

            {
                this.zza = zzczVarZzah;
                this.zzb = zzazVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzh(final String str, final long j, final long j2) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, PointerIconCompat.TYPE_VERTICAL_TEXT, new zzalj(zzczVarZzah, str, j2, j) { // from class: com.google.android.gms.internal.ads.zzct
            private final zzcz zza;
            private final String zzb;

            {
                this.zza = zzczVarZzah;
                this.zzb = str;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzi(final zzafv zzafvVar, final zzba zzbaVar) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, PointerIconCompat.TYPE_ALIAS, new zzalj(zzczVarZzah, zzafvVar, zzbaVar) { // from class: com.google.android.gms.internal.ads.zzcu
            private final zzcz zza;
            private final zzafv zzb;
            private final zzba zzc;

            {
                this.zza = zzczVarZzah;
                this.zzb = zzafvVar;
                this.zzc = zzbaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                ((zzda) obj).zzh(this.zza, this.zzb, this.zzc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzj(final long j) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, PointerIconCompat.TYPE_COPY, new zzalj(zzczVarZzah, j) { // from class: com.google.android.gms.internal.ads.zzcv
            private final zzcz zza;

            {
                this.zza = zzczVarZzah;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzk(final int i, final long j, final long j2) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, PointerIconCompat.TYPE_NO_DROP, new zzalj(zzczVarZzah, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzcw
            private final zzcz zza;

            {
                this.zza = zzczVarZzah;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzl(final String str) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, PointerIconCompat.TYPE_ALL_SCROLL, new zzalj(zzczVarZzah, str) { // from class: com.google.android.gms.internal.ads.zzbc
            private final zzcz zza;
            private final String zzb;

            {
                this.zza = zzczVarZzah;
                this.zzb = str;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzm(final zzaz zzazVar) {
        final zzcz zzczVarZzag = zzag();
        zzX(zzczVarZzag, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, new zzalj(zzczVarZzag, zzazVar) { // from class: com.google.android.gms.internal.ads.zzbd
            private final zzcz zza;
            private final zzaz zzb;

            {
                this.zza = zzczVarZzag;
                this.zzb = zzazVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahl, com.google.android.gms.internal.ads.zzdq
    public final void zzn(final boolean z) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, new zzalj(zzczVarZzah, z) { // from class: com.google.android.gms.internal.ads.zzbe
            private final zzcz zza;

            {
                this.zza = zzczVarZzah;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzo(final Exception exc) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, PointerIconCompat.TYPE_ZOOM_IN, new zzalj(zzczVarZzah, exc) { // from class: com.google.android.gms.internal.ads.zzbf
            private final zzcz zza;
            private final Exception zzb;

            {
                this.zza = zzczVarZzah;
                this.zzb = exc;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzp(final Exception exc) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, 1037, new zzalj(zzczVarZzah, exc) { // from class: com.google.android.gms.internal.ads.zzbg
            private final zzcz zza;
            private final Exception zzb;

            {
                this.zza = zzczVarZzah;
                this.zzb = exc;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final void zzq(final float f) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, PointerIconCompat.TYPE_ZOOM_OUT, new zzalj(zzczVarZzah, f) { // from class: com.google.android.gms.internal.ads.zzbh
            private final zzcz zza;

            {
                this.zza = zzczVarZzah;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzr(final zzaz zzazVar) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, PointerIconCompat.TYPE_GRAB, new zzalj(zzczVarZzah, zzazVar) { // from class: com.google.android.gms.internal.ads.zzbi
            private final zzcz zza;
            private final zzaz zzb;

            {
                this.zza = zzczVarZzah;
                this.zzb = zzazVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzs(final String str, final long j, final long j2) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, PointerIconCompat.TYPE_GRABBING, new zzalj(zzczVarZzah, str, j2, j) { // from class: com.google.android.gms.internal.ads.zzbj
            private final zzcz zza;
            private final String zzb;

            {
                this.zza = zzczVarZzah;
                this.zzb = str;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzt(final zzafv zzafvVar, final zzba zzbaVar) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, 1022, new zzalj(zzczVarZzah, zzafvVar, zzbaVar) { // from class: com.google.android.gms.internal.ads.zzbl
            private final zzcz zza;
            private final zzafv zzb;
            private final zzba zzc;

            {
                this.zza = zzczVarZzah;
                this.zzb = zzafvVar;
                this.zzc = zzbaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                ((zzda) obj).zzi(this.zza, this.zzb, this.zzc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzu(final int i, final long j) {
        final zzcz zzczVarZzag = zzag();
        zzX(zzczVarZzag, 1023, new zzalj(zzczVarZzag, i, j) { // from class: com.google.android.gms.internal.ads.zzbm
            private final zzcz zza;
            private final int zzb;
            private final long zzc;

            {
                this.zza = zzczVarZzag;
                this.zzb = i;
                this.zzc = j;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                ((zzda) obj).zzj(this.zza, this.zzb, this.zzc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzv(final String str) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, 1024, new zzalj(zzczVarZzah, str) { // from class: com.google.android.gms.internal.ads.zzbn
            private final zzcz zza;
            private final String zzb;

            {
                this.zza = zzczVarZzah;
                this.zzb = str;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzw(final zzaz zzazVar) {
        final zzcz zzczVarZzag = zzag();
        zzX(zzczVarZzag, InputDeviceCompat.SOURCE_GAMEPAD, new zzalj(zzczVarZzag, zzazVar) { // from class: com.google.android.gms.internal.ads.zzbo
            private final zzcz zza;
            private final zzaz zzb;

            {
                this.zza = zzczVarZzag;
                this.zzb = zzazVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahl, com.google.android.gms.internal.ads.zzmu
    public final void zzx(final zzy zzyVar) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, 1028, new zzalj(zzczVarZzah, zzyVar) { // from class: com.google.android.gms.internal.ads.zzbp
            private final zzcz zza;
            private final zzy zzb;

            {
                this.zza = zzczVarZzah;
                this.zzb = zzyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzcz zzczVar = this.zza;
                zzy zzyVar2 = this.zzb;
                ((zzda) obj).zzl(zzczVar, zzyVar2);
                int i = zzyVar2.zzb;
                int i2 = zzyVar2.zzc;
                int i3 = zzyVar2.zzd;
                float f = zzyVar2.zze;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzy(final Object obj, final long j) {
        final zzcz zzczVarZzah = zzah();
        zzX(zzczVarZzah, 1027, new zzalj(zzczVarZzah, obj, j) { // from class: com.google.android.gms.internal.ads.zzbq
            private final zzcz zza;
            private final Object zzb;
            private final long zzc;

            {
                this.zza = zzczVarZzah;
                this.zzb = obj;
                this.zzc = j;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj2) {
                ((zzda) obj2).zzk(this.zza, this.zzb, this.zzc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzz(final long j, final int i) {
        final zzcz zzczVarZzag = zzag();
        zzX(zzczVarZzag, 1026, new zzalj(zzczVarZzag, j, i) { // from class: com.google.android.gms.internal.ads.zzbr
            private final zzcz zza;

            {
                this.zza = zzczVarZzag;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    private final zzcz zzaf(zzhf zzhfVar) {
        this.zzg.getClass();
        zzaiq zzaiqVarZzf = zzhfVar == null ? null : this.zzd.zzf(zzhfVar);
        if (zzhfVar != null && zzaiqVarZzf != null) {
            return zzZ(zzaiqVarZzf, zzaiqVarZzf.zzy(zzhfVar.zza, this.zzb).zzc, zzhfVar);
        }
        int iZzv = this.zzg.zzv();
        zzaiq zzaiqVarZzF = this.zzg.zzF();
        if (iZzv >= zzaiqVarZzF.zza()) {
            zzaiqVarZzF = zzaiq.zzc;
        }
        return zzZ(zzaiqVarZzF, iZzv, null);
    }

    public final void zze(List<zzhf> list, zzhf zzhfVar) {
        zzcx zzcxVar = this.zzd;
        zzahp zzahpVar = this.zzg;
        zzahpVar.getClass();
        zzcxVar.zzi(list, zzhfVar, zzahpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzH(zzaiq zzaiqVar, final int i) {
        zzcx zzcxVar = this.zzd;
        zzahp zzahpVar = this.zzg;
        zzahpVar.getClass();
        zzcxVar.zzh(zzahpVar);
        final zzcz zzczVarZzY = zzY();
        zzX(zzczVarZzY, 0, new zzalj(zzczVarZzY, i) { // from class: com.google.android.gms.internal.ads.zzca
            private final zzcz zza;

            {
                this.zza = zzczVarZzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzS(final zzaho zzahoVar, final zzaho zzahoVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzcx zzcxVar = this.zzd;
        zzahp zzahpVar = this.zzg;
        zzahpVar.getClass();
        zzcxVar.zzg(zzahpVar);
        final zzcz zzczVarZzY = zzY();
        zzX(zzczVarZzY, 11, new zzalj(zzczVarZzY, i, zzahoVar, zzahoVar2) { // from class: com.google.android.gms.internal.ads.zzcm
            private final zzcz zza;
            private final zzaho zzb;
            private final zzaho zzc;

            {
                this.zza = zzczVarZzY;
                this.zzb = zzahoVar;
                this.zzc = zzahoVar2;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
            }
        });
    }
}
