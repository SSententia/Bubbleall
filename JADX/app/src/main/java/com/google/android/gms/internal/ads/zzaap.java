package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzaap implements zzaao {
    protected static volatile zzabr zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    private double zzr;
    private double zzs;
    protected final LinkedList<MotionEvent> zzc = new LinkedList<>();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzt = false;
    protected boolean zzp = false;

    protected zzaap(Context context) {
        try {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbR)).booleanValue()) {
                zzzs.zzb();
            } else {
                zzabs.zza(zza);
            }
            this.zzq = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final void zzf() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.size() > 0) {
            Iterator<MotionEvent> it = this.zzc.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.zzc.clear();
        } else {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzb = null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2 A[Catch: Exception -> 0x00f6, TryCatch #1 {Exception -> 0x00f6, blocks: (B:48:0x00b5, B:51:0x00c2, B:60:0x00e0, B:61:0x00f0), top: B:78:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f0 A[Catch: Exception -> 0x00f6, TRY_LEAVE, TryCatch #1 {Exception -> 0x00f6, blocks: (B:48:0x00b5, B:51:0x00c2, B:60:0x00e0, B:61:0x00f0), top: B:78:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final String zzg(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        zzaan zzaanVarZzj;
        String str2;
        int i2;
        Exception exc;
        int i3;
        int i4;
        long jCurrentTimeMillis;
        String strZzc;
        int i5;
        int i6;
        zzyj zzyjVarZza;
        int i7;
        int i8;
        int i9 = i;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbG)).booleanValue();
        zzyj zzyjVarZzb = null;
        if (zBooleanValue) {
            zzaanVarZzj = zza != null ? zza.zzj() : null;
            str2 = true != ((Boolean) zzbet.zzc().zzc(zzbjl.zzbR)).booleanValue() ? "te" : "be";
        } else {
            zzaanVarZzj = null;
            str2 = null;
        }
        try {
            if (i9 == 3) {
                zzyjVarZzb = zzb(context, view, activity);
                try {
                    this.zzt = true;
                    i8 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i2 = 3;
                    if (!zBooleanValue && zzaanVarZzj != null) {
                        if (i9 == i2) {
                            i4 = 1003;
                            i3 = 2;
                        } else {
                            i3 = 2;
                            if (i9 == 2) {
                                i4 = 1009;
                            } else {
                                i4 = 1001;
                                i9 = 1;
                            }
                        }
                        zzaanVarZzj.zzc(i4, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzyjVarZzb != null) {
                        try {
                            if (zzyjVarZzb.zzah().zzaw() == 0) {
                                strZzc = Integer.toString(5);
                            } else {
                                strZzc = zzzs.zzc(zzyjVarZzb.zzah(), str);
                                if (zBooleanValue) {
                                    if (i9 == i2) {
                                        i5 = PointerIconCompat.TYPE_CELL;
                                    } else if (i9 == i3) {
                                        i5 = PointerIconCompat.TYPE_ALIAS;
                                    } else {
                                        i5 = 1004;
                                    }
                                    zzaanVarZzj.zzc(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                                }
                            }
                        } catch (Exception e2) {
                            strZzc = Integer.toString(7);
                            if (zBooleanValue && zzaanVarZzj != null) {
                                if (i9 == i2) {
                                    i6 = PointerIconCompat.TYPE_CROSSHAIR;
                                } else {
                                    i6 = i9 == i3 ? PointerIconCompat.TYPE_COPY : GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT;
                                }
                                zzaanVarZzj.zzc(i6, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e2);
                            }
                        }
                    } else {
                        strZzc = Integer.toString(5);
                    }
                    return strZzc;
                }
            } else {
                if (i9 == 2) {
                    zzyjVarZza = zzc(context, view, activity);
                    i7 = PointerIconCompat.TYPE_TEXT;
                } else {
                    zzyjVarZza = zza(context, null);
                    i7 = 1000;
                }
                zzyjVarZzb = zzyjVarZza;
                i8 = i7;
            }
            if (!zBooleanValue || zzaanVarZzj == null) {
                i2 = 3;
            } else {
                i2 = 3;
                try {
                    zzaanVarZzj.zzc(i8, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                } catch (Exception e3) {
                    e = e3;
                    exc = e;
                    if (!zBooleanValue) {
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzyjVarZzb != null) {
                        strZzc = Integer.toString(5);
                    } else if (zzyjVarZzb.zzah().zzaw() == 0) {
                        strZzc = Integer.toString(5);
                    } else {
                        strZzc = zzzs.zzc(zzyjVarZzb.zzah(), str);
                        if (zBooleanValue) {
                            if (i9 == i2) {
                                i5 = PointerIconCompat.TYPE_CELL;
                            } else if (i9 == i3) {
                                i5 = PointerIconCompat.TYPE_ALIAS;
                            } else {
                                i5 = 1004;
                            }
                            zzaanVarZzj.zzc(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                        }
                    }
                    return strZzc;
                }
            }
        } catch (Exception e4) {
            e = e4;
            i2 = 3;
        }
        i3 = 2;
        jCurrentTimeMillis = System.currentTimeMillis();
        if (zzyjVarZzb != null) {
            strZzc = Integer.toString(5);
        } else if (zzyjVarZzb.zzah().zzaw() == 0) {
            strZzc = Integer.toString(5);
        } else {
            strZzc = zzzs.zzc(zzyjVarZzb.zzah(), str);
            if (zBooleanValue && zzaanVarZzj != null) {
                if (i9 == i2) {
                    i5 = PointerIconCompat.TYPE_CELL;
                } else if (i9 == i3) {
                    i5 = PointerIconCompat.TYPE_ALIAS;
                } else {
                    i5 = 1004;
                }
                zzaanVarZzj.zzc(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
            }
        }
        return strZzc;
    }

    protected abstract zzyj zza(Context context, zzyc zzycVar);

    protected abstract zzyj zzb(Context context, View view, Activity activity);

    protected abstract zzyj zzc(Context context, View view, Activity activity);

    protected abstract zzabt zzd(MotionEvent motionEvent) throws zzabi;

    protected abstract long zze(StackTraceElement[] stackTraceElementArr) throws zzabi;

    @Override // com.google.android.gms.internal.ads.zzaao
    public final synchronized void zzj(MotionEvent motionEvent) {
        Long l;
        if (this.zzt) {
            zzf();
            this.zzt = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = 0.0d;
            this.zzr = motionEvent.getRawX();
            this.zzs = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = rawX - this.zzr;
            double d2 = rawY - this.zzs;
            this.zzk += Math.sqrt((d * d) + (d2 * d2));
            this.zzr = rawX;
            this.zzs = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    this.zzb = motionEventObtain;
                    this.zzc.add(motionEventObtain);
                    if (this.zzc.size() > 6) {
                        this.zzc.remove().recycle();
                    }
                    this.zzf++;
                    this.zzh = zze(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zze += (long) (motionEvent.getHistorySize() + 1);
                    zzabt zzabtVarZzd = zzd(motionEvent);
                    Long l2 = zzabtVarZzd.zzd;
                    if (l2 != null && zzabtVarZzd.zzg != null) {
                        this.zzi += l2.longValue() + zzabtVarZzd.zzg.longValue();
                    }
                    if (this.zzq != null && (l = zzabtVarZzd.zze) != null && zzabtVarZzd.zzh != null) {
                        this.zzj += l.longValue() + zzabtVarZzd.zzh.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzg++;
                }
            } catch (zzabi unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final synchronized void zzk(int i, int i2, int i3) {
        if (this.zzb != null) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbE)).booleanValue()) {
                zzf();
            } else {
                this.zzb.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            this.zzb = MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, i2 * this.zzq.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzb = null;
        }
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final String zzl(Context context, String str, View view, Activity activity) {
        return zzg(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final String zzm(Context context, String str, View view) {
        return zzg(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public void zzn(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final String zzo(Context context, View view, Activity activity) {
        return zzg(context, null, 2, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final String zzp(Context context) {
        if (zzabu.zzf()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzg(context, null, 1, null, null, null);
    }
}
