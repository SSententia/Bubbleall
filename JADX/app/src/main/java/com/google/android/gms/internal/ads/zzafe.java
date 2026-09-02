package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzafe extends zzadu {
    private zzahd zzA;
    private int zzB;
    private long zzC;
    private zzix zzD;
    final zzka zzb;
    final zzahi zzc;
    private final zzahv[] zzd;
    private final zzjz zze;
    private final zzalg zzf;
    private final zzafn zzg;
    private final zzafp zzh;
    private final zzalm<zzahj> zzi;
    private final CopyOnWriteArraySet<zzaeh> zzj;
    private final zzain zzk;
    private final List<zzafd> zzl;
    private final boolean zzm;
    private final zzhq zzn;
    private final zzcy zzo;
    private final Looper zzp;
    private final zzki zzq;
    private final zzaku zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private int zzv;
    private zzahz zzw;
    private zzahi zzx;
    private zzago zzy;
    private zzago zzz;

    public zzafe(zzahv[] zzahvVarArr, zzjz zzjzVar, zzhq zzhqVar, zzafy zzafyVar, zzki zzkiVar, zzcy zzcyVar, boolean z, zzahz zzahzVar, long j, long j2, zzadz zzadzVar, long j3, boolean z2, zzaku zzakuVar, Looper looper, final zzahp zzahpVar, zzahi zzahiVar, byte[] bArr) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzamq.zze;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.15.0] [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        int length = zzahvVarArr.length;
        zzahvVarArr.getClass();
        this.zzd = zzahvVarArr;
        zzjzVar.getClass();
        this.zze = zzjzVar;
        this.zzn = zzhqVar;
        this.zzq = zzkiVar;
        this.zzo = zzcyVar;
        this.zzm = true;
        this.zzw = zzahzVar;
        this.zzp = looper;
        this.zzr = zzakuVar;
        zzalm<zzahj> zzalmVar = new zzalm<>(looper, zzakuVar, new zzalk(zzahpVar) { // from class: com.google.android.gms.internal.ads.zzaej
            private final zzahp zza;

            {
                this.zza = zzahpVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalk
            public final void zza(Object obj, zzale zzaleVar) {
                new zzahk(zzaleVar);
            }
        });
        this.zzi = zzalmVar;
        this.zzj = new CopyOnWriteArraySet<>();
        this.zzl = new ArrayList();
        this.zzD = new zzix(0);
        zzka zzkaVar = new zzka(new zzahx[2], new zzjg[2], null, null);
        this.zzb = zzkaVar;
        this.zzk = new zzain();
        zzahh zzahhVar = new zzahh();
        zzahhVar.zzc(1, 2, 12, 13, 14, 15, 16, 17, 18, 19);
        zzahhVar.zzb(28, true);
        zzahhVar.zzd(zzahiVar);
        zzahi zzahiVarZze = zzahhVar.zze();
        this.zzc = zzahiVarZze;
        zzahh zzahhVar2 = new zzahh();
        zzahhVar2.zzd(zzahiVarZze);
        zzahhVar2.zza(3);
        zzahhVar2.zza(9);
        this.zzx = zzahhVar2.zze();
        this.zzy = zzago.zza;
        this.zzz = zzago.zza;
        this.zzB = -1;
        this.zzf = zzakuVar.zza(looper, null);
        zzafn zzafnVar = new zzafn(this) { // from class: com.google.android.gms.internal.ads.zzaeu
            private final zzafe zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzafn
            public final void zza(zzafm zzafmVar) {
                this.zza.zzI(zzafmVar);
            }
        };
        this.zzg = zzafnVar;
        this.zzA = zzahd.zza(zzkaVar);
        zzcyVar.zzc(zzahpVar, looper);
        zzalmVar.zzb(zzcyVar);
        zzkiVar.zze(new Handler(looper), zzcyVar);
        this.zzh = new zzafp(zzahvVarArr, zzjzVar, zzkaVar, zzafyVar, zzkiVar, 0, false, zzcyVar, zzahzVar, zzadzVar, 500L, false, looper, zzakuVar, zzafnVar, null);
    }

    private final int zzK() {
        if (this.zzA.zza.zzt()) {
            return this.zzB;
        }
        zzahd zzahdVar = this.zzA;
        return zzahdVar.zza.zzy(zzahdVar.zzb.zza, this.zzk).zzc;
    }

    private final long zzL(zzahd zzahdVar) {
        if (zzahdVar.zza.zzt()) {
            return zzadx.zzb(this.zzC);
        }
        if (zzahdVar.zzb.zzb()) {
            return zzahdVar.zzs;
        }
        zzaiq zzaiqVar = zzahdVar.zza;
        zzhf zzhfVar = zzahdVar.zzb;
        long j = zzahdVar.zzs;
        zzQ(zzaiqVar, zzhfVar, j);
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0423  */
    /* JADX WARN: Code duplicated, block: B:164:0x0429  */
    /* JADX WARN: Code duplicated, block: B:165:0x042b  */
    /* JADX WARN: Instruction removed from duplicated block: B:165:0x042b, please report this as an issue */
    private final void zzM(final zzahd zzahdVar, final int i, final int i2, boolean z, boolean z2, final int i3, long j, int i4) {
        Pair pair;
        int i5;
        final zzagk zzagkVar;
        boolean z3;
        int i6;
        Object obj;
        zzagk zzagkVar2;
        Object obj2;
        int i7;
        long jZzN;
        long jZzN2;
        Object obj3;
        zzagk zzagkVar3;
        Object obj4;
        int iZzi;
        zzahd zzahdVar2 = this.zzA;
        this.zzA = zzahdVar;
        boolean z4 = !zzahdVar2.zza.equals(zzahdVar.zza);
        zzaiq zzaiqVar = zzahdVar2.zza;
        zzaiq zzaiqVar2 = zzahdVar.zza;
        if (zzaiqVar2.zzt() && zzaiqVar.zzt()) {
            pair = new Pair(false, -1);
        } else if (zzaiqVar2.zzt() != zzaiqVar.zzt()) {
            pair = new Pair(true, 3);
        } else if (zzaiqVar.zzf(zzaiqVar.zzy(zzahdVar2.zzb.zza, this.zzk).zzc, this.zza, 0L).zzb.equals(zzaiqVar2.zzf(zzaiqVar2.zzy(zzahdVar.zzb.zza, this.zzk).zzc, this.zza, 0L).zzb)) {
            pair = (z2 && i3 == 0 && zzahdVar2.zzb.zzd < zzahdVar.zzb.zzd) ? new Pair(true, 0) : new Pair(false, -1);
        } else {
            if (z2 && i3 == 0) {
                i5 = 1;
            } else if (z2 && i3 == 1) {
                i5 = 2;
            } else {
                if (!z4) {
                    throw new IllegalStateException();
                }
                i5 = 3;
            }
            pair = new Pair(true, Integer.valueOf(i5));
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        zzago zzagoVar = this.zzy;
        if (zBooleanValue) {
            zzagk zzagkVar4 = zzahdVar.zza.zzt() ? null : zzahdVar.zza.zzf(zzahdVar.zza.zzy(zzahdVar.zzb.zza, this.zzk).zzc, this.zza, 0L).zzc;
            zzagkVar = zzagkVar4;
            zzagoVar = zzagkVar4 != null ? zzagkVar4.zze : zzago.zza;
        } else {
            zzagkVar = null;
        }
        if (!zzahdVar2.zzj.equals(zzahdVar.zzj)) {
            zzagm zzagmVar = new zzagm(zzagoVar, null);
            List<zzaiv> list = zzahdVar.zzj;
            for (int i8 = 0; i8 < list.size(); i8++) {
                zzaiv zzaivVar = list.get(i8);
                for (int i9 = 0; i9 < zzaivVar.zza(); i9++) {
                    zzaivVar.zzb(i9).zza(zzagmVar);
                }
            }
            zzagoVar = new zzago(zzagmVar);
        }
        boolean z5 = !zzagoVar.equals(this.zzy);
        this.zzy = zzagoVar;
        if (!zzahdVar2.zza.equals(zzahdVar.zza)) {
            this.zzi.zzd(0, new zzalj(zzahdVar, i) { // from class: com.google.android.gms.internal.ads.zzafb
                private final zzahd zza;
                private final int zzb;

                {
                    this.zza = zzahdVar;
                    this.zzb = i;
                }

                @Override // com.google.android.gms.internal.ads.zzalj
                public final void zza(Object obj5) {
                    zzahd zzahdVar3 = this.zza;
                    ((zzahj) obj5).zzH(zzahdVar3.zza, this.zzb);
                }
            });
        }
        if (z2) {
            zzain zzainVar = new zzain();
            if (zzahdVar2.zza.zzt()) {
                i6 = i4;
                obj = null;
                zzagkVar2 = null;
                obj2 = null;
                i7 = -1;
            } else {
                Object obj5 = zzahdVar2.zzb.zza;
                zzahdVar2.zza.zzy(obj5, zzainVar);
                int i10 = zzainVar.zzc;
                int iZzi2 = zzahdVar2.zza.zzi(obj5);
                obj = zzahdVar2.zza.zzf(i10, this.zza, 0L).zzb;
                zzagkVar2 = this.zza.zzc;
                obj2 = obj5;
                i6 = i10;
                i7 = iZzi2;
            }
            if (i3 == 0) {
                jZzN = zzainVar.zzd;
                if (zzahdVar2.zzb.zzb()) {
                    zzhf zzhfVar = zzahdVar2.zzb;
                    jZzN = zzainVar.zzh(zzhfVar.zzb, zzhfVar.zzc);
                    jZzN2 = zzN(zzahdVar2);
                } else {
                    if (zzahdVar2.zzb.zze != -1 && this.zzA.zzb.zzb()) {
                        jZzN = zzN(this.zzA);
                    }
                    jZzN2 = jZzN;
                }
            } else if (zzahdVar2.zzb.zzb()) {
                jZzN = zzahdVar2.zzs;
                jZzN2 = zzN(zzahdVar2);
            } else {
                jZzN = zzahdVar2.zzs;
                jZzN2 = jZzN;
            }
            long jZza = zzadx.zza(jZzN);
            long jZza2 = zzadx.zza(jZzN2);
            zzhf zzhfVar2 = zzahdVar2.zzb;
            final zzaho zzahoVar = new zzaho(obj, i6, zzagkVar2, obj2, i7, jZza, jZza2, zzhfVar2.zzb, zzhfVar2.zzc);
            int iZzv = zzv();
            if (this.zzA.zza.zzt()) {
                obj3 = null;
                zzagkVar3 = null;
                obj4 = null;
                iZzi = -1;
            } else {
                zzahd zzahdVar3 = this.zzA;
                Object obj6 = zzahdVar3.zzb.zza;
                zzahdVar3.zza.zzy(obj6, this.zzk);
                iZzi = this.zzA.zza.zzi(obj6);
                obj4 = obj6;
                obj3 = this.zzA.zza.zzf(iZzv, this.zza, 0L).zzb;
                zzagkVar3 = this.zza.zzc;
            }
            long jZza3 = zzadx.zza(j);
            long jZza4 = this.zzA.zzb.zzb() ? zzadx.zza(zzN(this.zzA)) : jZza3;
            zzhf zzhfVar3 = this.zzA.zzb;
            final zzaho zzahoVar2 = new zzaho(obj3, iZzv, zzagkVar3, obj4, iZzi, jZza3, jZza4, zzhfVar3.zzb, zzhfVar3.zzc);
            this.zzi.zzd(11, new zzalj(i3, zzahoVar, zzahoVar2) { // from class: com.google.android.gms.internal.ads.zzafc
                private final int zza;
                private final zzaho zzb;
                private final zzaho zzc;

                {
                    this.zza = i3;
                    this.zzb = zzahoVar;
                    this.zzc = zzahoVar2;
                }

                @Override // com.google.android.gms.internal.ads.zzalj
                public final void zza(Object obj7) {
                    zzahj zzahjVar = (zzahj) obj7;
                    zzahjVar.zzS(this.zzb, this.zzc, this.zza);
                }
            });
        } else {
            zBooleanValue = zBooleanValue;
        }
        if (zBooleanValue) {
            this.zzi.zzd(1, new zzalj(zzagkVar, iIntValue) { // from class: com.google.android.gms.internal.ads.zzaek
                private final zzagk zza;
                private final int zzb;

                {
                    this.zza = zzagkVar;
                    this.zzb = iIntValue;
                }

                @Override // com.google.android.gms.internal.ads.zzalj
                public final void zza(Object obj7) {
                    ((zzahj) obj7).zzI(this.zza, this.zzb);
                }
            });
        }
        if (zzahdVar2.zzf != zzahdVar.zzf) {
            this.zzi.zzd(10, new zzalj(zzahdVar) { // from class: com.google.android.gms.internal.ads.zzael
                private final zzahd zza;

                {
                    this.zza = zzahdVar;
                }

                @Override // com.google.android.gms.internal.ads.zzalj
                public final void zza(Object obj7) {
                    zzaeg zzaegVar = this.zza.zzf;
                }
            });
            if (zzahdVar.zzf != null) {
                this.zzi.zzd(10, new zzalj(zzahdVar) { // from class: com.google.android.gms.internal.ads.zzaem
                    private final zzahd zza;

                    {
                        this.zza = zzahdVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzalj
                    public final void zza(Object obj7) {
                        ((zzahj) obj7).zzR(this.zza.zzf);
                    }
                });
            }
        }
        zzka zzkaVar = zzahdVar2.zzi;
        zzka zzkaVar2 = zzahdVar.zzi;
        if (zzkaVar != zzkaVar2) {
            this.zze.zzi(zzkaVar2.zzc);
            final zzt zztVar = new zzt(zzahdVar.zzi.zzd, null);
            this.zzi.zzd(2, new zzalj(zzahdVar, zztVar) { // from class: com.google.android.gms.internal.ads.zzaen
                private final zzahd zza;
                private final zzt zzb;

                {
                    this.zza = zzahdVar;
                    this.zzb = zztVar;
                }

                @Override // com.google.android.gms.internal.ads.zzalj
                public final void zza(Object obj7) {
                    zzahd zzahdVar4 = this.zza;
                    ((zzahj) obj7).zzJ(zzahdVar4.zzh, this.zzb);
                }
            });
        }
        if (z5) {
            final zzago zzagoVar2 = this.zzy;
            this.zzi.zzd(14, new zzalj(zzagoVar2) { // from class: com.google.android.gms.internal.ads.zzaeo
                private final zzago zza;

                {
                    this.zza = zzagoVar2;
                }

                @Override // com.google.android.gms.internal.ads.zzalj
                public final void zza(Object obj7) {
                    ((zzahj) obj7).zzU(this.zza);
                }
            });
        }
        if (zzahdVar2.zzg != zzahdVar.zzg) {
            this.zzi.zzd(3, new zzalj(zzahdVar) { // from class: com.google.android.gms.internal.ads.zzaep
                private final zzahd zza;

                {
                    this.zza = zzahdVar;
                }

                @Override // com.google.android.gms.internal.ads.zzalj
                public final void zza(Object obj7) {
                    ((zzahj) obj7).zzK(this.zza.zzg);
                }
            });
        }
        if (zzahdVar2.zze != zzahdVar.zze || zzahdVar2.zzl != zzahdVar.zzl) {
            this.zzi.zzd(-1, new zzalj(zzahdVar) { // from class: com.google.android.gms.internal.ads.zzaeq
                private final zzahd zza;

                {
                    this.zza = zzahdVar;
                }

                @Override // com.google.android.gms.internal.ads.zzalj
                public final void zza(Object obj7) {
                    zzahd zzahdVar4 = this.zza;
                    ((zzahj) obj7).zzM(zzahdVar4.zzl, zzahdVar4.zze);
                }
            });
        }
        if (zzahdVar2.zze != zzahdVar.zze) {
            this.zzi.zzd(4, new zzalj(zzahdVar) { // from class: com.google.android.gms.internal.ads.zzaer
                private final zzahd zza;

                {
                    this.zza = zzahdVar;
                }

                @Override // com.google.android.gms.internal.ads.zzalj
                public final void zza(Object obj7) {
                    ((zzahj) obj7).zzN(this.zza.zze);
                }
            });
        }
        if (zzahdVar2.zzl != zzahdVar.zzl) {
            this.zzi.zzd(5, new zzalj(zzahdVar, i2) { // from class: com.google.android.gms.internal.ads.zzaes
                private final zzahd zza;
                private final int zzb;

                {
                    this.zza = zzahdVar;
                    this.zzb = i2;
                }

                @Override // com.google.android.gms.internal.ads.zzalj
                public final void zza(Object obj7) {
                    zzahd zzahdVar4 = this.zza;
                    ((zzahj) obj7).zzO(zzahdVar4.zzl, this.zzb);
                }
            });
        }
        if (zzahdVar2.zzm != zzahdVar.zzm) {
            this.zzi.zzd(6, new zzalj(zzahdVar) { // from class: com.google.android.gms.internal.ads.zzaet
                private final zzahd zza;

                {
                    this.zza = zzahdVar;
                }

                @Override // com.google.android.gms.internal.ads.zzalj
                public final void zza(Object obj7) {
                    ((zzahj) obj7).zzP(this.zza.zzm);
                }
            });
        }
        if (zzR(zzahdVar2) != zzR(zzahdVar)) {
            this.zzi.zzd(7, new zzalj(zzahdVar) { // from class: com.google.android.gms.internal.ads.zzaev
                private final zzahd zza;

                {
                    this.zza = zzahdVar;
                }

                @Override // com.google.android.gms.internal.ads.zzalj
                public final void zza(Object obj7) {
                    ((zzahj) obj7).zzQ(zzafe.zzR(this.zza));
                }
            });
        }
        if (!zzahdVar2.zzn.equals(zzahdVar.zzn)) {
            this.zzi.zzd(12, new zzalj(zzahdVar) { // from class: com.google.android.gms.internal.ads.zzaew
                private final zzahd zza;

                {
                    this.zza = zzahdVar;
                }

                @Override // com.google.android.gms.internal.ads.zzalj
                public final void zza(Object obj7) {
                    ((zzahj) obj7).zzT(this.zza.zzn);
                }
            });
        }
        if (z) {
            this.zzi.zzd(-1, zzaex.zza);
        }
        zzahi zzahiVar = this.zzx;
        zzahi zzahiVar2 = this.zzc;
        zzahh zzahhVar = new zzahh();
        zzahhVar.zzd(zzahiVar2);
        zzahhVar.zzb(3, !zzA());
        zzahhVar.zzb(4, zzd() && !zzA());
        zzahhVar.zzb(5, zza() && !zzA());
        zzahhVar.zzb(6, !this.zzA.zza.zzt() && (zza() || !zzc() || zzd()) && !zzA());
        zzahhVar.zzb(7, zzb() && !zzA());
        if (!this.zzA.zza.zzt()) {
            if (!zzb()) {
                if (zzc()) {
                    zzaiq zzaiqVar3 = this.zzA.zza;
                    if (!zzaiqVar3.zzt() && zzaiqVar3.zzf(zzv(), this.zza, 0L).zzh) {
                        z3 = zzA() ? false : true;
                    }
                }
            } else if (zzA()) {
            }
        }
        zzahhVar.zzb(8, z3);
        zzahhVar.zzb(9, !zzA());
        zzahhVar.zzb(10, zzd() && !zzA());
        zzahhVar.zzb(11, zzd() && !zzA());
        zzahi zzahiVarZze = zzahhVar.zze();
        this.zzx = zzahiVarZze;
        if (!zzahiVarZze.equals(zzahiVar)) {
            this.zzi.zzd(13, new zzalj(this) { // from class: com.google.android.gms.internal.ads.zzaey
                private final zzafe zza;

                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzalj
                public final void zza(Object obj7) {
                    this.zza.zzG((zzahj) obj7);
                }
            });
        }
        this.zzi.zze();
        if (zzahdVar2.zzo != zzahdVar.zzo) {
            Iterator<zzaeh> it = this.zzj.iterator();
            while (it.hasNext()) {
                it.next().zza(zzahdVar.zzo);
            }
        }
        if (zzahdVar2.zzp != zzahdVar.zzp) {
            Iterator<zzaeh> it2 = this.zzj.iterator();
            while (it2.hasNext()) {
                it2.next().zzb(zzahdVar.zzp);
            }
        }
    }

    private static long zzN(zzahd zzahdVar) {
        zzaip zzaipVar = new zzaip();
        zzain zzainVar = new zzain();
        zzahdVar.zza.zzy(zzahdVar.zzb.zza, zzainVar);
        long j = zzahdVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzahdVar.zza.zzf(zzainVar.zzc, zzaipVar, 0L).zzl;
        return 0L;
    }

    private final zzahd zzO(zzahd zzahdVar, zzaiq zzaiqVar, Pair<Object, Long> pair) {
        zzahd zzahdVarZzc;
        zzakt.zza(zzaiqVar.zzt() || pair != null);
        zzaiq zzaiqVar2 = zzahdVar.zza;
        zzahd zzahdVarZzd = zzahdVar.zzd(zzaiqVar);
        if (zzaiqVar.zzt()) {
            zzhf zzhfVarZzb = zzahd.zzb();
            long jZzb = zzadx.zzb(this.zzC);
            zzahd zzahdVarZzg = zzahdVarZzd.zzc(zzhfVarZzb, jZzb, jZzb, jZzb, 0L, zzs.zza, this.zzb, zzfoj.zzi()).zzg(zzhfVarZzb);
            zzahdVarZzg.zzq = zzahdVarZzg.zzs;
            return zzahdVarZzg;
        }
        Object obj = zzahdVarZzd.zzb.zza;
        int i = zzamq.zza;
        boolean z = !obj.equals(pair.first);
        zzhf zzhfVar = z ? new zzhf(pair.first) : zzahdVarZzd.zzb;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzb2 = zzadx.zzb(zzD());
        if (!zzaiqVar2.zzt()) {
            zzaiqVar2.zzy(obj, this.zzk);
        }
        if (z || jLongValue < jZzb2) {
            zzakt.zzd(!zzhfVar.zzb());
            zzahd zzahdVarZzg2 = zzahdVarZzd.zzc(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0159: INVOKE (r7v1 'zzahdVarZzg2' com.google.android.gms.internal.ads.zzahd) = 
                  (wrap com.google.android.gms.internal.ads.zzahd:0x0155: INVOKE 
                  (r7v0 'zzahdVarZzd' com.google.android.gms.internal.ads.zzahd)
                  (r0v1 com.google.android.gms.internal.ads.zzhf)
                  (r13v0 'jLongValue' long)
                  (r13v0 'jLongValue' long)
                  (r13v0 'jLongValue' long)
                  (0 long)
                  (wrap com.google.android.gms.internal.ads.zzs:0x0133: TERNARY null = ((r8v3 'z' boolean) != false) ? (wrap ??:0x012e: SGET  A[WRAPPED] (LINE:18) com.google.android.gms.internal.ads.zzs.zza com.google.android.gms.internal.ads.zzs) : (wrap ??:0x0131: IGET (r7v0 'zzahdVarZzd' com.google.android.gms.internal.ads.zzahd) A[WRAPPED] (LINE:21) com.google.android.gms.internal.ads.zzahd.zzh com.google.android.gms.internal.ads.zzs))
                  (wrap com.google.android.gms.internal.ads.zzka:0x0142: TERNARY null = ((r8v3 'z' boolean) != false) ? (wrap ??:0x013a: IGET (r20v0 'this' com.google.android.gms.internal.ads.zzafe A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:18) com.google.android.gms.internal.ads.zzafe.zzb com.google.android.gms.internal.ads.zzka) : (wrap ??:0x0140: IGET (r7v0 'zzahdVarZzd' com.google.android.gms.internal.ads.zzahd) A[WRAPPED] (LINE:21) com.google.android.gms.internal.ads.zzahd.zzi com.google.android.gms.internal.ads.zzka))
                  (wrap java.util.List<com.google.android.gms.internal.ads.zzaiv>:?: TERNARY null = ((r8v3 'z' boolean) != false) ? (wrap ??:0x0146: INVOKE  STATIC call: com.google.android.gms.internal.ads.zzfoj.zzi():com.google.android.gms.internal.ads.zzfoj A[MD:<E>:():com.google.android.gms.internal.ads.zzfoj<E> (m), WRAPPED] (LINE:19)) : (wrap ??:0x014b: IGET (r7v0 'zzahdVarZzd' com.google.android.gms.internal.ads.zzahd) A[WRAPPED] (LINE:21) com.google.android.gms.internal.ads.zzahd.zzj java.util.List))
                 VIRTUAL call: com.google.android.gms.internal.ads.zzahd.zzc(com.google.android.gms.internal.ads.zzhf, long, long, long, long, com.google.android.gms.internal.ads.zzs, com.google.android.gms.internal.ads.zzka, java.util.List):com.google.android.gms.internal.ads.zzahd A[MD:(com.google.android.gms.internal.ads.zzhf, long, long, long, long, com.google.android.gms.internal.ads.zzs, com.google.android.gms.internal.ads.zzka, java.util.List<com.google.android.gms.internal.ads.zzaiv>):com.google.android.gms.internal.ads.zzahd (m), WRAPPED] (LINE:20))
                  (r15v0 'zzhfVar' com.google.android.gms.internal.ads.zzhf)
                 VIRTUAL call: com.google.android.gms.internal.ads.zzahd.zzg(com.google.android.gms.internal.ads.zzhf):com.google.android.gms.internal.ads.zzahd A[DECLARE_VAR, MD:(com.google.android.gms.internal.ads.zzhf):com.google.android.gms.internal.ads.zzahd (m)] (LINE:21) in method: com.google.android.gms.internal.ads.zzafe.zzO(com.google.android.gms.internal.ads.zzahd, com.google.android.gms.internal.ads.zzaiq, android.util.Pair<java.lang.Object, java.lang.Long>):com.google.android.gms.internal.ads.zzahd, file: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v1 com.google.android.gms.internal.ads.zzhf
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 352
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafe.zzO(com.google.android.gms.internal.ads.zzahd, com.google.android.gms.internal.ads.zzaiq, android.util.Pair):com.google.android.gms.internal.ads.zzahd");
        }

        private final Pair<Object, Long> zzP(zzaiq zzaiqVar, int i, long j) {
            if (zzaiqVar.zzt()) {
                this.zzB = i;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                this.zzC = j;
                return null;
            }
            if (i == -1 || i >= zzaiqVar.zza()) {
                i = zzaiqVar.zze(false);
                long j2 = zzaiqVar.zzf(i, this.zza, 0L).zzl;
                j = zzadx.zza(0L);
            }
            return zzaiqVar.zzv(this.zza, this.zzk, i, zzadx.zzb(j));
        }

        private final long zzQ(zzaiq zzaiqVar, zzhf zzhfVar, long j) {
            zzaiqVar.zzy(zzhfVar.zza, this.zzk);
            return j;
        }

        private static boolean zzR(zzahd zzahdVar) {
            return zzahdVar.zze == 3 && zzahdVar.zzl && zzahdVar.zzm == 0;
        }

        @Override // com.google.android.gms.internal.ads.zzahp
        public final boolean zzA() {
            return this.zzA.zzb.zzb();
        }

        @Override // com.google.android.gms.internal.ads.zzahp
        public final int zzB() {
            if (zzA()) {
                return this.zzA.zzb.zzb;
            }
            return -1;
        }

        @Override // com.google.android.gms.internal.ads.zzahp
        public final int zzC() {
            if (zzA()) {
                return this.zzA.zzb.zzc;
            }
            return -1;
        }

        @Override // com.google.android.gms.internal.ads.zzahp
        public final long zzD() {
            if (!zzA()) {
                return zzx();
            }
            zzahd zzahdVar = this.zzA;
            zzahdVar.zza.zzy(zzahdVar.zzb.zza, this.zzk);
            zzahd zzahdVar2 = this.zzA;
            if (zzahdVar2.zzc != -9223372036854775807L) {
                return zzadx.zza(0L) + zzadx.zza(this.zzA.zzc);
            }
            long j = zzahdVar2.zza.zzf(zzv(), this.zza, 0L).zzl;
            return zzadx.zza(0L);
        }

        public final int zzE() {
            int length = this.zzd.length;
            return 2;
        }

        @Override // com.google.android.gms.internal.ads.zzahp
        public final zzaiq zzF() {
            return this.zzA.zza;
        }

        final /* synthetic */ void zzG(zzahj zzahjVar) {
            zzahjVar.zzL(this.zzx);
        }

        final /* synthetic */ void zzI(final zzafm zzafmVar) {
            this.zzf.zzj(new Runnable(this, zzafmVar) { // from class: com.google.android.gms.internal.ads.zzaez
                private final zzafe zza;
                private final zzafm zzb;

                {
                    this.zza = this;
                    this.zzb = zzafmVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzJ(this.zzb);
                }
            });
        }

        final /* synthetic */ void zzJ(zzafm zzafmVar) {
            long j;
            boolean z;
            long j2;
            int i = this.zzs - zzafmVar.zzb;
            this.zzs = i;
            boolean z2 = true;
            if (zzafmVar.zzc) {
                this.zzt = zzafmVar.zzd;
                this.zzu = true;
            }
            if (zzafmVar.zze) {
                this.zzv = zzafmVar.zzf;
            }
            if (i == 0) {
                zzaiq zzaiqVar = zzafmVar.zza.zza;
                if (!this.zzA.zza.zzt() && zzaiqVar.zzt()) {
                    this.zzB = -1;
                    this.zzC = 0L;
                }
                if (!zzaiqVar.zzt()) {
                    List<zzaiq> listZzs = ((zzaht) zzaiqVar).zzs();
                    zzakt.zzd(listZzs.size() == this.zzl.size());
                    for (int i2 = 0; i2 < listZzs.size(); i2++) {
                        this.zzl.get(i2).zzb = listZzs.get(i2);
                    }
                }
                if (this.zzu) {
                    if (zzafmVar.zza.zzb.equals(this.zzA.zzb) && zzafmVar.zza.zzd == this.zzA.zzs) {
                        z2 = false;
                    }
                    if (z2) {
                        if (zzaiqVar.zzt() || zzafmVar.zza.zzb.zzb()) {
                            j2 = zzafmVar.zza.zzd;
                        } else {
                            zzahd zzahdVar = zzafmVar.zza;
                            zzhf zzhfVar = zzahdVar.zzb;
                            j2 = zzahdVar.zzd;
                            zzQ(zzaiqVar, zzhfVar, j2);
                        }
                        z = z2;
                        j = j2;
                    } else {
                        j = -9223372036854775807L;
                        z = z2;
                    }
                } else {
                    j = -9223372036854775807L;
                    z = false;
                }
                this.zzu = false;
                zzM(zzafmVar.zza, 1, this.zzv, false, z, this.zzt, j, -1);
            }
        }

        public final boolean zze() {
            return this.zzA.zzp;
        }

        public final Looper zzf() {
            return this.zzp;
        }

        public final void zzg(zzahj zzahjVar) {
            this.zzi.zzb(zzahjVar);
        }

        public final void zzh(zzaeh zzaehVar) {
            this.zzj.add(zzaehVar);
        }

        public final int zzi() {
            return this.zzA.zze;
        }

        public final void zzj() {
            zzahd zzahdVar = this.zzA;
            if (zzahdVar.zze != 1) {
                return;
            }
            zzahd zzahdVarZzf = zzahdVar.zzf(null);
            zzahd zzahdVarZze = zzahdVarZzf.zze(true != zzahdVarZzf.zza.zzt() ? 2 : 4);
            this.zzs++;
            this.zzh.zze();
            zzM(zzahdVarZze, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }

        public final void zzk(List<zzhh> list, boolean z) {
            zzK();
            zzx();
            this.zzs++;
            if (!this.zzl.isEmpty()) {
                int size = this.zzl.size();
                for (int i = size - 1; i >= 0; i--) {
                    this.zzl.remove(i);
                }
                this.zzD = this.zzD.zzg(0, size);
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzagx zzagxVar = new zzagx(list.get(i2), this.zzm);
                arrayList.add(zzagxVar);
                this.zzl.add(i2, new zzafd(zzagxVar.zzb, zzagxVar.zza.zzy()));
            }
            this.zzD = this.zzD.zzf(0, arrayList.size());
            zzaht zzahtVar = new zzaht(this.zzl, this.zzD, null);
            if (!zzahtVar.zzt() && zzahtVar.zza() < 0) {
                throw new zzafx(zzahtVar, -1, -9223372036854775807L);
            }
            int iZze = zzahtVar.zze(false);
            zzahd zzahdVarZzO = zzO(this.zzA, zzahtVar, zzP(zzahtVar, iZze, -9223372036854775807L));
            int i3 = zzahdVarZzO.zze;
            if (iZze != -1 && i3 != 1) {
                i3 = 4;
                if (!zzahtVar.zzt() && iZze < zzahtVar.zza()) {
                    i3 = 2;
                }
            }
            zzahd zzahdVarZze = zzahdVarZzO.zze(i3);
            this.zzh.zzq(arrayList, iZze, zzadx.zzb(-9223372036854775807L), this.zzD);
            zzM(zzahdVarZze, 0, 1, false, (this.zzA.zzb.zza.equals(zzahdVarZze.zzb.zza) || this.zzA.zza.zzt()) ? false : true, 4, zzL(zzahdVarZze), -1);
        }

        public final void zzl(boolean z, int i, int i2) {
            zzahd zzahdVar = this.zzA;
            if (zzahdVar.zzl == z && zzahdVar.zzm == i) {
                return;
            }
            this.zzs++;
            zzahd zzahdVarZzh = zzahdVar.zzh(z, i);
            this.zzh.zzf(z, i);
            zzM(zzahdVarZzh, 0, i2, false, false, 5, -9223372036854775807L, -1);
        }

        public final boolean zzm() {
            return this.zzA.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzahp
        public final int zzn() {
            return 0;
        }

        @Override // com.google.android.gms.internal.ads.zzahp
        public final boolean zzo() {
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzahp
        public final void zzp(int i, long j) {
            zzaiq zzaiqVar = this.zzA.zza;
            if (i < 0 || (!zzaiqVar.zzt() && i >= zzaiqVar.zza())) {
                throw new zzafx(zzaiqVar, i, j);
            }
            this.zzs++;
            if (zzA()) {
                Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzafm zzafmVar = new zzafm(this.zzA);
                zzafmVar.zzb(1);
                this.zzg.zza(zzafmVar);
                return;
            }
            int i2 = this.zzA.zze != 1 ? 2 : 1;
            int iZzv = zzv();
            zzahd zzahdVarZzO = zzO(this.zzA.zze(i2), zzaiqVar, zzP(zzaiqVar, i, j));
            this.zzh.zzg(zzaiqVar, i, zzadx.zzb(j));
            zzM(zzahdVarZzO, 0, 1, true, true, 1, zzL(zzahdVarZzO), iZzv);
        }

        @Override // com.google.android.gms.internal.ads.zzahp
        public final void zzq(boolean z) {
            throw null;
        }

        public final void zzr(boolean z, zzaeg zzaegVar) {
            zzahd zzahdVar = this.zzA;
            zzahd zzahdVarZzg = zzahdVar.zzg(zzahdVar.zzb);
            zzahdVarZzg.zzq = zzahdVarZzg.zzs;
            zzahdVarZzg.zzr = 0L;
            zzahd zzahdVarZze = zzahdVarZzg.zze(1);
            if (zzaegVar != null) {
                zzahdVarZze = zzahdVarZze.zzf(zzaegVar);
            }
            zzahd zzahdVar2 = zzahdVarZze;
            this.zzs++;
            this.zzh.zzh();
            zzM(zzahdVar2, 0, 1, false, zzahdVar2.zza.zzt() && !this.zzA.zza.zzt(), 4, zzL(zzahdVar2), -1);
        }

        public final void zzs() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzamq.zze;
            String strZza = zzafq.zza();
            int length = String.valueOf(hexString).length();
            StringBuilder sb = new StringBuilder(length + 36 + String.valueOf(str).length() + String.valueOf(strZza).length());
            sb.append("Release ");
            sb.append(hexString);
            sb.append(" [ExoPlayerLib/2.15.0] [");
            sb.append(str);
            sb.append("] [");
            sb.append(strZza);
            sb.append("]");
            Log.i("ExoPlayerImpl", sb.toString());
            if (!this.zzh.zzj()) {
                zzalm<zzahj> zzalmVar = this.zzi;
                zzalmVar.zzd(10, zzafa.zza);
                zzalmVar.zze();
            }
            this.zzi.zzf();
            this.zzf.zzi(null);
            zzcy zzcyVar = this.zzo;
            if (zzcyVar != null) {
                this.zzq.zzf(zzcyVar);
            }
            zzahd zzahdVarZze = this.zzA.zze(1);
            this.zzA = zzahdVarZze;
            zzahd zzahdVarZzg = zzahdVarZze.zzg(zzahdVarZze.zzb);
            this.zzA = zzahdVarZzg;
            zzahdVarZzg.zzq = zzahdVarZzg.zzs;
            this.zzA.zzr = 0L;
        }

        public final zzahs zzt(zzahr zzahrVar) {
            return new zzahs(this.zzh, zzahrVar, this.zzA.zza, zzv(), this.zzr, this.zzh.zzk());
        }

        @Override // com.google.android.gms.internal.ads.zzahp
        public final int zzu() {
            if (this.zzA.zza.zzt()) {
                return 0;
            }
            zzahd zzahdVar = this.zzA;
            return zzahdVar.zza.zzi(zzahdVar.zzb.zza);
        }

        @Override // com.google.android.gms.internal.ads.zzahp
        public final int zzv() {
            int iZzK = zzK();
            if (iZzK == -1) {
                return 0;
            }
            return iZzK;
        }

        public final long zzw() {
            if (zzA()) {
                zzahd zzahdVar = this.zzA;
                zzhf zzhfVar = zzahdVar.zzb;
                zzahdVar.zza.zzy(zzhfVar.zza, this.zzk);
                return zzadx.zza(this.zzk.zzh(zzhfVar.zzb, zzhfVar.zzc));
            }
            zzaiq zzaiqVar = this.zzA.zza;
            if (zzaiqVar.zzt()) {
                return -9223372036854775807L;
            }
            return zzadx.zza(zzaiqVar.zzf(zzv(), this.zza, 0L).zzm);
        }

        @Override // com.google.android.gms.internal.ads.zzahp
        public final long zzx() {
            return zzadx.zza(zzL(this.zzA));
        }

        public final long zzy() {
            if (zzA()) {
                zzahd zzahdVar = this.zzA;
                return zzahdVar.zzk.equals(zzahdVar.zzb) ? zzadx.zza(this.zzA.zzq) : zzw();
            }
            if (this.zzA.zza.zzt()) {
                return this.zzC;
            }
            zzahd zzahdVar2 = this.zzA;
            long j = 0;
            if (zzahdVar2.zzk.zzd != zzahdVar2.zzb.zzd) {
                return zzadx.zza(zzahdVar2.zza.zzf(zzv(), this.zza, 0L).zzm);
            }
            long j2 = zzahdVar2.zzq;
            if (this.zzA.zzk.zzb()) {
                zzahd zzahdVar3 = this.zzA;
                zzahdVar3.zza.zzy(zzahdVar3.zzk.zza, this.zzk).zzb(this.zzA.zzk.zzb);
            } else {
                j = j2;
            }
            zzahd zzahdVar4 = this.zzA;
            zzQ(zzahdVar4.zza, zzahdVar4.zzk, j);
            return zzadx.zza(j);
        }

        @Override // com.google.android.gms.internal.ads.zzahp
        public final long zzz() {
            return zzadx.zza(this.zzA.zzr);
        }
    }
