package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.PlatformVersion;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbdl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbdl> CREATOR = new zzbdm();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final zzbdl[] zzg;
    public final boolean zzh;
    public final boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;
    public boolean zzm;
    public boolean zzn;
    public boolean zzo;

    public zzbdl() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return (int) (zzf(displayMetrics) * displayMetrics.density);
    }

    public static zzbdl zzb() {
        return new zzbdl("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzbdl zzc() {
        return new zzbdl("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static zzbdl zzd() {
        return new zzbdl("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzbdl zze() {
        return new zzbdl("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    private static int zzf(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzbdl(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Code duplicated, block: B:38:0x011a  */
    public zzbdl(Context context, AdSize[] adSizeArr) {
        int height;
        int i;
        int iZzf;
        String string;
        int dimensionPixelSize;
        int iIntValue;
        int iIntValue2;
        AdSize adSize = adSizeArr[0];
        this.zzd = false;
        boolean zIsFluid = adSize.isFluid();
        this.zzi = zIsFluid;
        this.zzm = com.google.android.gms.ads.zza.zzf(adSize);
        this.zzn = com.google.android.gms.ads.zza.zzg(adSize);
        boolean zZzd = com.google.android.gms.ads.zza.zzd(adSize);
        this.zzo = zZzd;
        if (zIsFluid) {
            this.zze = AdSize.BANNER.getWidth();
            height = AdSize.BANNER.getHeight();
            this.zzb = height;
        } else if (this.zzn) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zza.zzh(adSize);
            this.zzb = height;
        } else if (zZzd) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zza.zze(adSize);
            this.zzb = height;
        } else {
            this.zze = adSize.getWidth();
            height = adSize.getHeight();
            this.zzb = height;
        }
        int i2 = this.zze;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (i2 == -1) {
            zzber.zza();
            if (context.getResources().getConfiguration().orientation == 2) {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (((int) (displayMetrics2.heightPixels / displayMetrics2.density)) < 600) {
                    zzber.zza();
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
                            defaultDisplay.getRealMetrics(displayMetrics3);
                            iIntValue = displayMetrics3.heightPixels;
                            iIntValue2 = displayMetrics3.widthPixels;
                        } else {
                            try {
                                Integer num = (Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0]);
                                Integer num2 = (Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0]);
                                iIntValue = num == null ? 0 : num.intValue();
                                iIntValue2 = num2 == null ? 0 : num2.intValue();
                            } catch (Exception unused) {
                            }
                        }
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i3 = displayMetrics3.heightPixels;
                        int i4 = displayMetrics3.widthPixels;
                        if (i3 != iIntValue || i4 != iIntValue2) {
                            dimensionPixelSize = displayMetrics.widthPixels;
                            this.zzf = dimensionPixelSize;
                        } else {
                            int i5 = displayMetrics.widthPixels;
                            zzber.zza();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i5 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.zzf = dimensionPixelSize;
                        }
                    } else {
                        dimensionPixelSize = displayMetrics.widthPixels;
                        this.zzf = dimensionPixelSize;
                    }
                } else {
                    dimensionPixelSize = displayMetrics.widthPixels;
                    this.zzf = dimensionPixelSize;
                }
            } else {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.zzf = dimensionPixelSize;
            }
            double d = dimensionPixelSize / displayMetrics.density;
            i = (int) d;
            if (d - ((double) i) >= 0.01d) {
                i++;
            }
        } else {
            i = this.zze;
            zzber.zza();
            this.zzf = zzcgm.zzk(displayMetrics, this.zze);
        }
        if (height == -2) {
            iZzf = zzf(displayMetrics);
        } else {
            iZzf = this.zzb;
        }
        zzber.zza();
        this.zzc = zzcgm.zzk(displayMetrics, iZzf);
        if (i2 == -1 || height == -2) {
            StringBuilder sb = new StringBuilder(26);
            sb.append(i);
            sb.append("x");
            sb.append(iZzf);
            sb.append("_as");
            this.zza = sb.toString();
        } else {
            if (!this.zzn && !this.zzo) {
                if (this.zzi) {
                    string = "320x50_mb";
                } else {
                    this.zza = adSize.toString();
                }
            } else {
                int i6 = this.zze;
                int i7 = this.zzb;
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append(i6);
                sb2.append("x");
                sb2.append(i7);
                sb2.append("_as");
                string = sb2.toString();
            }
            this.zza = string;
        }
        int length = adSizeArr.length;
        if (length > 1) {
            this.zzg = new zzbdl[length];
            for (int i8 = 0; i8 < adSizeArr.length; i8++) {
                this.zzg[i8] = new zzbdl(context, adSizeArr[i8]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    zzbdl(String str, int i, int i2, boolean z, int i3, int i4, zzbdl[] zzbdlVarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = zzbdlVarArr;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = z4;
        this.zzk = z5;
        this.zzl = z6;
        this.zzm = z7;
        this.zzn = z8;
        this.zzo = z9;
    }
}
