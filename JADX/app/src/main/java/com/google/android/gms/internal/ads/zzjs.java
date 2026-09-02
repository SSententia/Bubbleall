package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzjs implements Comparable<zzjs> {
    public final boolean zza;
    private final zzjn zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;

    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    /* JADX WARN: Code duplicated, block: B:25:0x003b  */
    /* JADX WARN: Code duplicated, block: B:27:0x003f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0043  */
    /* JADX WARN: Code duplicated, block: B:31:0x0049  */
    /* JADX WARN: Code duplicated, block: B:33:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:38:0x0059  */
    public zzjs(zzafv zzafvVar, zzjn zzjnVar, int i, boolean z) {
        boolean z2;
        int i2;
        float f;
        int i3;
        this.zzb = zzjnVar;
        boolean z3 = true;
        int i4 = 0;
        if (z) {
            if (zzafvVar.zzq != -1) {
                int i5 = zzjnVar.zzc;
            }
            if (zzafvVar.zzr != -1) {
                int i6 = zzjnVar.zzd;
            }
            float f2 = zzafvVar.zzs;
            if (f2 != -1.0f) {
                int i7 = zzjnVar.zze;
                if (f2 > 2.1474836E9f) {
                    z2 = false;
                }
            }
            if (zzafvVar.zzh != -1) {
                int i8 = zzjnVar.zzf;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        this.zza = z2;
        if (z) {
            int i9 = zzafvVar.zzq;
            if (i9 != -1) {
                int i10 = zzjnVar.zzg;
                if (i9 >= 0) {
                    i2 = zzafvVar.zzr;
                    if (i2 != -1) {
                        int i11 = zzjnVar.zzh;
                        if (i2 >= 0) {
                            f = zzafvVar.zzs;
                            if (f != -1.0f) {
                                int i12 = zzjnVar.zzi;
                                if (f >= 0.0f) {
                                    i3 = zzafvVar.zzh;
                                    if (i3 != -1) {
                                        int i13 = zzjnVar.zzj;
                                        if (i3 < 0) {
                                            z3 = false;
                                        }
                                    }
                                } else {
                                    z3 = false;
                                }
                            } else {
                                i3 = zzafvVar.zzh;
                                if (i3 != -1) {
                                    int i14 = zzjnVar.zzj;
                                    if (i3 < 0) {
                                        z3 = false;
                                    }
                                }
                            }
                        } else {
                            z3 = false;
                        }
                    } else {
                        f = zzafvVar.zzs;
                        if (f != -1.0f) {
                            int i15 = zzjnVar.zzi;
                            if (f >= 0.0f) {
                                i3 = zzafvVar.zzh;
                                if (i3 != -1) {
                                    int i16 = zzjnVar.zzj;
                                    if (i3 < 0) {
                                        z3 = false;
                                    }
                                }
                            } else {
                                z3 = false;
                            }
                        } else {
                            i3 = zzafvVar.zzh;
                            if (i3 != -1) {
                                int i17 = zzjnVar.zzj;
                                if (i3 < 0) {
                                    z3 = false;
                                }
                            }
                        }
                    }
                } else {
                    z3 = false;
                }
            } else {
                i2 = zzafvVar.zzr;
                if (i2 != -1) {
                    int i18 = zzjnVar.zzh;
                    if (i2 >= 0) {
                        f = zzafvVar.zzs;
                        if (f != -1.0f) {
                            int i19 = zzjnVar.zzi;
                            if (f >= 0.0f) {
                                i3 = zzafvVar.zzh;
                                if (i3 != -1) {
                                    int i110 = zzjnVar.zzj;
                                    if (i3 < 0) {
                                        z3 = false;
                                    }
                                }
                            } else {
                                z3 = false;
                            }
                        } else {
                            i3 = zzafvVar.zzh;
                            if (i3 != -1) {
                                int i111 = zzjnVar.zzj;
                                if (i3 < 0) {
                                    z3 = false;
                                }
                            }
                        }
                    } else {
                        z3 = false;
                    }
                } else {
                    f = zzafvVar.zzs;
                    if (f != -1.0f) {
                        int i112 = zzjnVar.zzi;
                        if (f >= 0.0f) {
                            i3 = zzafvVar.zzh;
                            if (i3 != -1) {
                                int i113 = zzjnVar.zzj;
                                if (i3 < 0) {
                                    z3 = false;
                                }
                            }
                        } else {
                            z3 = false;
                        }
                    } else {
                        i3 = zzafvVar.zzh;
                        if (i3 != -1) {
                            int i114 = zzjnVar.zzj;
                            if (i3 < 0) {
                                z3 = false;
                            }
                        }
                    }
                }
            }
        } else {
            z3 = false;
        }
        this.zzc = z3;
        this.zzd = zzjt.zzf(i, false);
        this.zze = zzafvVar.zzh;
        this.zzf = zzafvVar.zzc();
        while (i4 < zzjnVar.zzn.size()) {
            String str = zzafvVar.zzl;
            if (str != null && str.equals(zzjnVar.zzn.get(i4))) {
                this.zzg = i4;
            }
            i4++;
        }
        i4 = Integer.MAX_VALUE;
        this.zzg = i4;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzjs zzjsVar) {
        zzfpw zzfpwVarZza = (this.zza && this.zzd) ? zzjt.zzb : zzjt.zzb.zza();
        zzfny zzfnyVarZza = zzfny.zzj().zzd(this.zzd, zzjsVar.zzd).zzd(this.zza, zzjsVar.zza).zzd(this.zzc, zzjsVar.zzc).zza(Integer.valueOf(this.zzg), Integer.valueOf(zzjsVar.zzg), zzfpw.zzb().zza());
        Integer numValueOf = Integer.valueOf(this.zze);
        Integer numValueOf2 = Integer.valueOf(zzjsVar.zze);
        boolean z = this.zzb.zzw;
        return zzfnyVarZza.zza(numValueOf, numValueOf2, zzjt.zzc).zza(Integer.valueOf(this.zzf), Integer.valueOf(zzjsVar.zzf), zzfpwVarZza).zza(Integer.valueOf(this.zze), Integer.valueOf(zzjsVar.zze), zzfpwVarZza).zze();
    }
}
