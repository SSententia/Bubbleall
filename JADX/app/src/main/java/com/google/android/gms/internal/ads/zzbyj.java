package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbyj extends zzbyp {
    static final Set<String> zza = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzcml zzk;
    private final Activity zzl;
    private zzcob zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbyq zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbyj(zzcml zzcmlVar, zzbyq zzbyqVar) {
        super(zzcmlVar, "resize");
        this.zzb = "top-right";
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzcmlVar;
        this.zzl = zzcmlVar.zzj();
        this.zzp = zzbyqVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:126:0x0255 A[Catch: all -> 0x047f, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:58:0x012e, B:126:0x0255, B:127:0x025a, B:129:0x025c, B:131:0x027c, B:133:0x0280, B:135:0x028d, B:137:0x02c9, B:169:0x0382, B:176:0x03b1, B:177:0x03c9, B:178:0x03ea, B:180:0x03f2, B:181:0x03f9, B:182:0x041f, B:185:0x0422, B:187:0x0432, B:189:0x043c, B:191:0x044c, B:192:0x0461, B:188:0x0437, B:170:0x0389, B:171:0x0390, B:172:0x0397, B:173:0x039e, B:174:0x03a4, B:175:0x03ab, B:136:0x02c6, B:194:0x0463, B:195:0x0468, B:59:0x0135, B:61:0x0139, B:89:0x018c, B:97:0x01dc, B:99:0x01e7, B:101:0x01ea, B:103:0x01ed, B:105:0x01f1, B:108:0x01f7, B:90:0x0197, B:92:0x01ad, B:94:0x01b8, B:91:0x01a2, B:93:0x01b0, B:95:0x01bd, B:96:0x01d1, B:98:0x01df, B:109:0x0208, B:115:0x0232, B:121:0x0242, B:118:0x0238, B:120:0x0240, B:112:0x022a, B:114:0x0230, B:122:0x0247, B:123:0x024d, B:197:0x046a, B:198:0x046f, B:200:0x0471, B:201:0x0476, B:203:0x0478, B:204:0x047d), top: B:211:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x025c A[Catch: all -> 0x047f, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:58:0x012e, B:126:0x0255, B:127:0x025a, B:129:0x025c, B:131:0x027c, B:133:0x0280, B:135:0x028d, B:137:0x02c9, B:169:0x0382, B:176:0x03b1, B:177:0x03c9, B:178:0x03ea, B:180:0x03f2, B:181:0x03f9, B:182:0x041f, B:185:0x0422, B:187:0x0432, B:189:0x043c, B:191:0x044c, B:192:0x0461, B:188:0x0437, B:170:0x0389, B:171:0x0390, B:172:0x0397, B:173:0x039e, B:174:0x03a4, B:175:0x03ab, B:136:0x02c6, B:194:0x0463, B:195:0x0468, B:59:0x0135, B:61:0x0139, B:89:0x018c, B:97:0x01dc, B:99:0x01e7, B:101:0x01ea, B:103:0x01ed, B:105:0x01f1, B:108:0x01f7, B:90:0x0197, B:92:0x01ad, B:94:0x01b8, B:91:0x01a2, B:93:0x01b0, B:95:0x01bd, B:96:0x01d1, B:98:0x01df, B:109:0x0208, B:115:0x0232, B:121:0x0242, B:118:0x0238, B:120:0x0240, B:112:0x022a, B:114:0x0230, B:122:0x0247, B:123:0x024d, B:197:0x046a, B:198:0x046f, B:200:0x0471, B:201:0x0476, B:203:0x0478, B:204:0x047d), top: B:211:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x036b  */
    /* JADX WARN: Code duplicated, block: B:82:0x017f  */
    public final void zza(Map<String, String> map) {
        int[] iArr;
        ViewParent parent;
        byte b;
        byte b2;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this.zzj) {
            if (this.zzl == null) {
                zzf("Not an activity context. Cannot resize.");
                return;
            }
            if (this.zzk.zzP() == null) {
                zzf("Webview is not yet available, size is not set.");
                return;
            }
            if (this.zzk.zzP().zzg()) {
                zzf("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (this.zzk.zzW()) {
                zzf("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty(map.get("width"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzi = com.google.android.gms.ads.internal.util.zzs.zzQ(map.get("width"));
            }
            if (!TextUtils.isEmpty(map.get("height"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzf = com.google.android.gms.ads.internal.util.zzs.zzQ(map.get("height"));
            }
            if (!TextUtils.isEmpty(map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzg = com.google.android.gms.ads.internal.util.zzs.zzQ(map.get("offsetX"));
            }
            if (!TextUtils.isEmpty(map.get("offsetY"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzh = com.google.android.gms.ads.internal.util.zzs.zzQ(map.get("offsetY"));
            }
            if (!TextUtils.isEmpty(map.get("allowOffscreen"))) {
                this.zzc = Boolean.parseBoolean(map.get("allowOffscreen"));
            }
            String str = map.get("customClosePosition");
            if (!TextUtils.isEmpty(str)) {
                this.zzb = str;
            }
            if (this.zzi < 0 || this.zzf < 0) {
                zzf("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = this.zzl.getWindow();
            if (window != null && window.getDecorView() != null) {
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] iArrZzY = com.google.android.gms.ads.internal.util.zzs.zzY(this.zzl);
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] iArrZzV = com.google.android.gms.ads.internal.util.zzs.zzV(this.zzl);
                int i5 = iArrZzY[0];
                int i6 = iArrZzY[1];
                int i7 = this.zzi;
                if (i7 < 50 || i7 > i5) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Width is too small or too large.");
                } else {
                    int i8 = this.zzf;
                    if (i8 < 50 || i8 > i6) {
                        com.google.android.gms.ads.internal.util.zze.zzi("Height is too small or too large.");
                    } else {
                        if (i8 != i6 || i7 != i5) {
                            if (this.zzc) {
                                switch (this.zzb) {
                                    case "center":
                                        b2 = 2;
                                        break;
                                    case "top-left":
                                        b2 = 0;
                                        break;
                                    case "bottom-left":
                                        b2 = 3;
                                        break;
                                    case "bottom-right":
                                        b2 = 5;
                                        break;
                                    case "bottom-center":
                                        b2 = 4;
                                        break;
                                    case "top-center":
                                        b2 = 1;
                                        break;
                                    default:
                                        b2 = -1;
                                        break;
                                }
                                if (b2 == 0) {
                                    i = this.zzd + this.zzg;
                                    i2 = this.zze;
                                } else if (b2 != 1) {
                                    if (b2 != 2) {
                                        if (b2 == 3) {
                                            i = this.zzd + this.zzg;
                                            i4 = this.zze;
                                        } else if (b2 == 4) {
                                            i = ((this.zzd + this.zzg) + (i7 >> 1)) - 25;
                                            i4 = this.zze;
                                        } else if (b2 != 5) {
                                            i = ((this.zzd + this.zzg) + i7) - 50;
                                            i2 = this.zze;
                                        } else {
                                            i = ((this.zzd + this.zzg) + i7) - 50;
                                            i4 = this.zze;
                                        }
                                        i3 = ((i4 + this.zzh) + i8) - 50;
                                    } else {
                                        i = ((this.zzd + this.zzg) + (i7 >> 1)) - 25;
                                        i3 = ((this.zze + this.zzh) + (i8 >> 1)) - 25;
                                    }
                                    if (i < 0 && i + 50 <= i5 && i3 >= iArrZzV[0] && i3 + 50 <= iArrZzV[1]) {
                                        iArr = new int[]{this.zzd + this.zzg, this.zze + this.zzh};
                                    }
                                } else {
                                    i = ((this.zzd + this.zzg) + (i7 >> 1)) - 25;
                                    i2 = this.zze;
                                }
                                i3 = i2 + this.zzh;
                                if (i < 0) {
                                }
                            } else {
                                com.google.android.gms.ads.internal.zzt.zzc();
                                int[] iArrZzY2 = com.google.android.gms.ads.internal.util.zzs.zzY(this.zzl);
                                com.google.android.gms.ads.internal.zzt.zzc();
                                int[] iArrZzV2 = com.google.android.gms.ads.internal.util.zzs.zzV(this.zzl);
                                int i9 = iArrZzY2[0];
                                int i10 = this.zzd + this.zzg;
                                int i11 = this.zze + this.zzh;
                                if (i10 < 0) {
                                    i10 = 0;
                                } else {
                                    int i12 = this.zzi;
                                    if (i10 + i12 > i9) {
                                        i10 = i9 - i12;
                                    }
                                }
                                int i13 = iArrZzV2[0];
                                if (i11 < i13) {
                                    i11 = i13;
                                } else {
                                    int i14 = this.zzf;
                                    int i15 = i11 + i14;
                                    int i16 = iArrZzV2[1];
                                    if (i15 > i16) {
                                        i11 = i16 - i14;
                                    }
                                }
                                iArr = new int[]{i10, i11};
                            }
                            if (iArr == null) {
                                zzf("Resize location out of screen or close button is not visible.");
                                return;
                            }
                            zzber.zza();
                            int iZzs = zzcgm.zzs(this.zzl, this.zzi);
                            zzber.zza();
                            int iZzs2 = zzcgm.zzs(this.zzl, this.zzf);
                            parent = ((View) this.zzk).getParent();
                            if (parent != null || !(parent instanceof ViewGroup)) {
                                zzf("Webview is detached, probably in the middle of a resize or expand.");
                                return;
                            }
                            ViewGroup viewGroup = (ViewGroup) parent;
                            viewGroup.removeView((View) this.zzk);
                            PopupWindow popupWindow = this.zzq;
                            if (popupWindow == null) {
                                this.zzs = viewGroup;
                                com.google.android.gms.ads.internal.zzt.zzc();
                                Object obj = this.zzk;
                                ((View) obj).setDrawingCacheEnabled(true);
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) obj).getDrawingCache());
                                ((View) obj).setDrawingCacheEnabled(false);
                                ImageView imageView = new ImageView(this.zzl);
                                this.zzn = imageView;
                                imageView.setImageBitmap(bitmapCreateBitmap);
                                this.zzm = this.zzk.zzP();
                                this.zzs.addView(this.zzn);
                            } else {
                                popupWindow.dismiss();
                            }
                            RelativeLayout relativeLayout = new RelativeLayout(this.zzl);
                            this.zzr = relativeLayout;
                            relativeLayout.setBackgroundColor(0);
                            this.zzr.setLayoutParams(new ViewGroup.LayoutParams(iZzs, iZzs2));
                            com.google.android.gms.ads.internal.zzt.zzc();
                            PopupWindow popupWindow2 = new PopupWindow((View) this.zzr, iZzs, iZzs2, false);
                            this.zzq = popupWindow2;
                            popupWindow2.setOutsideTouchable(false);
                            this.zzq.setTouchable(true);
                            this.zzq.setClippingEnabled(!this.zzc);
                            this.zzr.addView((View) this.zzk, -1, -1);
                            this.zzo = new LinearLayout(this.zzl);
                            zzber.zza();
                            int iZzs3 = zzcgm.zzs(this.zzl, 50);
                            zzber.zza();
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iZzs3, zzcgm.zzs(this.zzl, 50));
                            switch (this.zzb) {
                                case "center":
                                    b = 2;
                                    break;
                                case "top-left":
                                    b = 0;
                                    break;
                                case "bottom-left":
                                    b = 3;
                                    break;
                                case "bottom-right":
                                    b = 5;
                                    break;
                                case "bottom-center":
                                    b = 4;
                                    break;
                                case "top-center":
                                    b = 1;
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            if (b == 0) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(9);
                            } else if (b == 1) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(14);
                            } else if (b == 2) {
                                layoutParams.addRule(13);
                            } else if (b == 3) {
                                layoutParams.addRule(12);
                                layoutParams.addRule(9);
                            } else if (b == 4) {
                                layoutParams.addRule(12);
                                layoutParams.addRule(14);
                            } else if (b != 5) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(12);
                                layoutParams.addRule(11);
                            }
                            this.zzo.setOnClickListener(new zzbyi(this));
                            this.zzo.setContentDescription("Close button");
                            this.zzr.addView(this.zzo, layoutParams);
                            try {
                                PopupWindow popupWindow3 = this.zzq;
                                View decorView = window.getDecorView();
                                zzber.zza();
                                int iZzs4 = zzcgm.zzs(this.zzl, iArr[0]);
                                zzber.zza();
                                popupWindow3.showAtLocation(decorView, 0, iZzs4, zzcgm.zzs(this.zzl, iArr[1]));
                                int i17 = iArr[0];
                                int i18 = iArr[1];
                                zzbyq zzbyqVar = this.zzp;
                                if (zzbyqVar != null) {
                                    zzbyqVar.zza(i17, i18, this.zzi, this.zzf);
                                }
                                this.zzk.zzaf(zzcob.zzc(iZzs, iZzs2));
                                int i19 = iArr[0];
                                int i20 = iArr[1];
                                com.google.android.gms.ads.internal.zzt.zzc();
                                zzh(i19, i20 - com.google.android.gms.ads.internal.util.zzs.zzV(this.zzl)[0], this.zzi, this.zzf);
                                zzj("resized");
                                return;
                            } catch (RuntimeException e) {
                                String strValueOf = String.valueOf(e.getMessage());
                                zzf(strValueOf.length() != 0 ? "Cannot show popup window: ".concat(strValueOf) : new String("Cannot show popup window: "));
                                this.zzr.removeView((View) this.zzk);
                                ViewGroup viewGroup2 = this.zzs;
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(this.zzn);
                                    this.zzs.addView((View) this.zzk);
                                    this.zzk.zzaf(this.zzm);
                                }
                                return;
                            }
                        }
                        com.google.android.gms.ads.internal.util.zze.zzi("Cannot resize to a full-screen ad.");
                    }
                }
                iArr = null;
                if (iArr == null) {
                    zzf("Resize location out of screen or close button is not visible.");
                    return;
                }
                zzber.zza();
                int iZzs5 = zzcgm.zzs(this.zzl, this.zzi);
                zzber.zza();
                int iZzs6 = zzcgm.zzs(this.zzl, this.zzf);
                parent = ((View) this.zzk).getParent();
                if (parent != null) {
                }
                zzf("Webview is detached, probably in the middle of a resize or expand.");
                return;
            }
            zzf("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void zzb(boolean z) {
        synchronized (this.zzj) {
            PopupWindow popupWindow = this.zzq;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.zzr.removeView((View) this.zzk);
                ViewGroup viewGroup = this.zzs;
                if (viewGroup != null) {
                    viewGroup.removeView(this.zzn);
                    this.zzs.addView((View) this.zzk);
                    this.zzk.zzaf(this.zzm);
                }
                if (z) {
                    zzj("default");
                    zzbyq zzbyqVar = this.zzp;
                    if (zzbyqVar != null) {
                        zzbyqVar.zzb();
                    }
                }
                this.zzq = null;
                this.zzr = null;
                this.zzs = null;
                this.zzo = null;
            }
        }
    }

    public final void zzc(int i, int i2, boolean z) {
        synchronized (this.zzj) {
            this.zzd = i;
            this.zze = i2;
        }
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zzj) {
            z = this.zzq != null;
        }
        return z;
    }

    public final void zze(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }
}
