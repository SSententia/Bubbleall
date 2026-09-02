package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import androidx.media2.widget.Cea708CCParser;
import com.google.ads.AdSize;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.location.LocationRequest;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.p006io.encoding.Base64;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzlz extends zzfq {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private float zzF;
    private zzy zzG;
    private int zzH;
    private zzma zzI;
    private final Context zze;
    private final zzmi zzf;
    private final zzmt zzg;
    private final boolean zzh;
    private zzly zzi;
    private boolean zzj;
    private boolean zzk;
    private Surface zzl;
    private zzlu zzm;
    private boolean zzn;
    private int zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzlz(Context context, zzfm zzfmVar, zzfs zzfsVar, long j, boolean z, Handler handler, zzmu zzmuVar, int i) {
        super(2, zzfmVar, zzfsVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzf = new zzmi(applicationContext);
        this.zzg = new zzmt(handler, zzmuVar);
        this.zzh = "NVIDIA".equals(zzamq.zzc);
        this.zzt = -9223372036854775807L;
        this.zzC = -1;
        this.zzD = -1;
        this.zzF = -1.0f;
        this.zzo = 1;
        this.zzH = 0;
        this.zzG = null;
    }

    private static List<zzfo> zzaA(zzfs zzfsVar, zzafv zzafvVar, boolean z, boolean z2) throws zzfy {
        Pair<Integer, Integer> pairZzf;
        String str = zzafvVar.zzl;
        if (str == null) {
            return Collections.emptyList();
        }
        List<zzfo> listZzd = zzge.zzd(zzge.zzc(str, z, z2), zzafvVar);
        if ("video/dolby-vision".equals(str) && (pairZzf = zzge.zzf(zzafvVar)) != null) {
            int iIntValue = ((Integer) pairZzf.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                listZzd.addAll(zzge.zzc("video/hevc", z, z2));
            } else if (iIntValue == 512) {
                listZzd.addAll(zzge.zzc("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(listZzd);
    }

    private final boolean zzaB(zzfo zzfoVar) {
        if (zzamq.zza < 23 || zzab(zzfoVar.zza)) {
            return false;
        }
        return !zzfoVar.zzf || zzlu.zza(this.zze);
    }

    private final void zzaC() {
        int i = this.zzC;
        if (i == -1) {
            if (this.zzD == -1) {
                return;
            } else {
                i = -1;
            }
        }
        zzy zzyVar = this.zzG;
        if (zzyVar != null && zzyVar.zzb == i && zzyVar.zzc == this.zzD && zzyVar.zzd == this.zzE && zzyVar.zze == this.zzF) {
            return;
        }
        zzy zzyVar2 = new zzy(i, this.zzD, this.zzE, this.zzF);
        this.zzG = zzyVar2;
        this.zzg.zzf(zzyVar2);
    }

    private final void zzaD() {
        zzy zzyVar = this.zzG;
        if (zzyVar != null) {
            this.zzg.zzf(zzyVar);
        }
    }

    private static boolean zzaE(long j) {
        return j < -30000;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    private static int zzaF(zzfo zzfoVar, zzafv zzafvVar) {
        byte b;
        int iZzw;
        int iIntValue;
        int i = zzafvVar.zzq;
        int i2 = zzafvVar.zzr;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        String str = zzafvVar.zzl;
        int i3 = 2;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> pairZzf = zzge.zzf(zzafvVar);
            str = (pairZzf == null || !((iIntValue = ((Integer) pairZzf.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        switch (str) {
            case "video/3gpp":
                b = 0;
                break;
            case "video/hevc":
                b = 4;
                break;
            case "video/mp4v-es":
                b = 1;
                break;
            case "video/avc":
                b = 2;
                break;
            case "video/x-vnd.on2.vp8":
                b = 3;
                break;
            case "video/x-vnd.on2.vp9":
                b = 5;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0 || b == 1) {
            iZzw = i * i2;
        } else if (b != 2) {
            if (b == 3) {
                iZzw = i * i2;
            } else {
                if (b != 4 && b != 5) {
                    return -1;
                }
                iZzw = i * i2;
                i3 = 4;
            }
        } else {
            if ("BRAVIA 4K 2015".equals(zzamq.zzd) || ("Amazon".equals(zzamq.zzc) && ("KFSOWI".equals(zzamq.zzd) || ("AFTS".equals(zzamq.zzd) && zzfoVar.zzf)))) {
                return -1;
            }
            iZzw = zzamq.zzw(i, 16) * zzamq.zzw(i2, 16) * 256;
        }
        return (iZzw * 3) / (i3 + i3);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0164  */
    /* JADX WARN: Code duplicated, block: B:102:0x016c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0170  */
    /* JADX WARN: Code duplicated, block: B:105:0x0178  */
    /* JADX WARN: Code duplicated, block: B:106:0x017c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0184  */
    /* JADX WARN: Code duplicated, block: B:109:0x0188  */
    /* JADX WARN: Code duplicated, block: B:111:0x0190  */
    /* JADX WARN: Code duplicated, block: B:112:0x0194  */
    /* JADX WARN: Code duplicated, block: B:114:0x019c  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:126:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:138:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:139:0x0200  */
    /* JADX WARN: Code duplicated, block: B:141:0x0208  */
    /* JADX WARN: Code duplicated, block: B:142:0x020c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0214  */
    /* JADX WARN: Code duplicated, block: B:145:0x0218  */
    /* JADX WARN: Code duplicated, block: B:147:0x0220  */
    /* JADX WARN: Code duplicated, block: B:148:0x0224  */
    /* JADX WARN: Code duplicated, block: B:150:0x022c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0230  */
    /* JADX WARN: Code duplicated, block: B:153:0x0238  */
    /* JADX WARN: Code duplicated, block: B:154:0x023c  */
    /* JADX WARN: Code duplicated, block: B:156:0x0244  */
    /* JADX WARN: Code duplicated, block: B:157:0x0248  */
    /* JADX WARN: Code duplicated, block: B:159:0x0250  */
    /* JADX WARN: Code duplicated, block: B:160:0x0254  */
    /* JADX WARN: Code duplicated, block: B:162:0x025c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0260  */
    /* JADX WARN: Code duplicated, block: B:165:0x0268  */
    /* JADX WARN: Code duplicated, block: B:166:0x026c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0274  */
    /* JADX WARN: Code duplicated, block: B:169:0x0278  */
    /* JADX WARN: Code duplicated, block: B:171:0x0280  */
    /* JADX WARN: Code duplicated, block: B:172:0x0284  */
    /* JADX WARN: Code duplicated, block: B:174:0x028c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0290  */
    /* JADX WARN: Code duplicated, block: B:177:0x0298  */
    /* JADX WARN: Code duplicated, block: B:178:0x029c  */
    /* JADX WARN: Code duplicated, block: B:180:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:181:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:183:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:184:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:186:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:187:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:189:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:190:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:192:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:193:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:195:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:196:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:198:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:201:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:202:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:204:0x0304  */
    /* JADX WARN: Code duplicated, block: B:205:0x0308  */
    /* JADX WARN: Code duplicated, block: B:207:0x0310  */
    /* JADX WARN: Code duplicated, block: B:208:0x0314  */
    /* JADX WARN: Code duplicated, block: B:210:0x031c  */
    /* JADX WARN: Code duplicated, block: B:211:0x0320  */
    /* JADX WARN: Code duplicated, block: B:213:0x0328  */
    /* JADX WARN: Code duplicated, block: B:214:0x032c  */
    /* JADX WARN: Code duplicated, block: B:216:0x0334  */
    /* JADX WARN: Code duplicated, block: B:217:0x0338  */
    /* JADX WARN: Code duplicated, block: B:219:0x0340  */
    /* JADX WARN: Code duplicated, block: B:220:0x0343  */
    /* JADX WARN: Code duplicated, block: B:222:0x034b  */
    /* JADX WARN: Code duplicated, block: B:223:0x034f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0359  */
    /* JADX WARN: Code duplicated, block: B:228:0x0361  */
    /* JADX WARN: Code duplicated, block: B:229:0x0364  */
    /* JADX WARN: Code duplicated, block: B:231:0x036c  */
    /* JADX WARN: Code duplicated, block: B:232:0x0370  */
    /* JADX WARN: Code duplicated, block: B:234:0x0378  */
    /* JADX WARN: Code duplicated, block: B:235:0x037c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0384  */
    /* JADX WARN: Code duplicated, block: B:238:0x0388  */
    /* JADX WARN: Code duplicated, block: B:240:0x0390  */
    /* JADX WARN: Code duplicated, block: B:241:0x0394  */
    /* JADX WARN: Code duplicated, block: B:243:0x039c  */
    /* JADX WARN: Code duplicated, block: B:244:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:246:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:247:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:249:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:250:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:252:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:253:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:255:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:256:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:258:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:259:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:261:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:262:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:264:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:265:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:267:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:268:0x0400  */
    /* JADX WARN: Code duplicated, block: B:270:0x0408  */
    /* JADX WARN: Code duplicated, block: B:271:0x040c  */
    /* JADX WARN: Code duplicated, block: B:273:0x0414  */
    /* JADX WARN: Code duplicated, block: B:274:0x0418  */
    /* JADX WARN: Code duplicated, block: B:276:0x0420  */
    /* JADX WARN: Code duplicated, block: B:277:0x0423  */
    /* JADX WARN: Code duplicated, block: B:279:0x042b  */
    /* JADX WARN: Code duplicated, block: B:280:0x042e  */
    /* JADX WARN: Code duplicated, block: B:282:0x0436  */
    /* JADX WARN: Code duplicated, block: B:283:0x0439  */
    /* JADX WARN: Code duplicated, block: B:285:0x0441  */
    /* JADX WARN: Code duplicated, block: B:286:0x0445  */
    /* JADX WARN: Code duplicated, block: B:288:0x044d  */
    /* JADX WARN: Code duplicated, block: B:289:0x0450  */
    /* JADX WARN: Code duplicated, block: B:291:0x0458  */
    /* JADX WARN: Code duplicated, block: B:292:0x045b  */
    /* JADX WARN: Code duplicated, block: B:294:0x0463  */
    /* JADX WARN: Code duplicated, block: B:295:0x0466  */
    /* JADX WARN: Code duplicated, block: B:297:0x046e  */
    /* JADX WARN: Code duplicated, block: B:298:0x0472  */
    /* JADX WARN: Code duplicated, block: B:300:0x047a  */
    /* JADX WARN: Code duplicated, block: B:301:0x047e  */
    /* JADX WARN: Code duplicated, block: B:303:0x0486  */
    /* JADX WARN: Code duplicated, block: B:304:0x048a  */
    /* JADX WARN: Code duplicated, block: B:306:0x0492  */
    /* JADX WARN: Code duplicated, block: B:307:0x0496  */
    /* JADX WARN: Code duplicated, block: B:309:0x049e  */
    /* JADX WARN: Code duplicated, block: B:310:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:312:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:313:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:315:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:316:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:318:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:319:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:321:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:322:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:324:0x04da  */
    /* JADX WARN: Code duplicated, block: B:325:0x04de  */
    /* JADX WARN: Code duplicated, block: B:327:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:328:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:330:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:331:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:333:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:334:0x0502  */
    /* JADX WARN: Code duplicated, block: B:336:0x050a  */
    /* JADX WARN: Code duplicated, block: B:337:0x050e  */
    /* JADX WARN: Code duplicated, block: B:339:0x0516  */
    /* JADX WARN: Code duplicated, block: B:340:0x051a  */
    /* JADX WARN: Code duplicated, block: B:342:0x0522  */
    /* JADX WARN: Code duplicated, block: B:343:0x0526  */
    /* JADX WARN: Code duplicated, block: B:345:0x052e  */
    /* JADX WARN: Code duplicated, block: B:346:0x0532  */
    /* JADX WARN: Code duplicated, block: B:348:0x053a  */
    /* JADX WARN: Code duplicated, block: B:349:0x053e  */
    /* JADX WARN: Code duplicated, block: B:351:0x0546  */
    /* JADX WARN: Code duplicated, block: B:352:0x054a  */
    /* JADX WARN: Code duplicated, block: B:354:0x0552  */
    /* JADX WARN: Code duplicated, block: B:355:0x0556  */
    /* JADX WARN: Code duplicated, block: B:357:0x055e  */
    /* JADX WARN: Code duplicated, block: B:358:0x0562  */
    /* JADX WARN: Code duplicated, block: B:360:0x056a  */
    /* JADX WARN: Code duplicated, block: B:361:0x056e  */
    /* JADX WARN: Code duplicated, block: B:363:0x0576  */
    /* JADX WARN: Code duplicated, block: B:364:0x057a  */
    /* JADX WARN: Code duplicated, block: B:366:0x0582  */
    /* JADX WARN: Code duplicated, block: B:367:0x0586  */
    /* JADX WARN: Code duplicated, block: B:369:0x058e  */
    /* JADX WARN: Code duplicated, block: B:370:0x0592  */
    /* JADX WARN: Code duplicated, block: B:372:0x059a  */
    /* JADX WARN: Code duplicated, block: B:373:0x059e  */
    /* JADX WARN: Code duplicated, block: B:375:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:376:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:378:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:379:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:381:0x05be  */
    /* JADX WARN: Code duplicated, block: B:382:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:384:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:385:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:387:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:388:0x05da  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:390:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:391:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:393:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:394:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:396:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:397:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:399:0x0604  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076 A[Catch: all -> 0x0758, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x001e, B:491:0x0750, B:39:0x0076, B:41:0x007c, B:44:0x0087, B:46:0x008d, B:471:0x0717, B:492:0x0754), top: B:498:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:400:0x0608  */
    /* JADX WARN: Code duplicated, block: B:402:0x0610  */
    /* JADX WARN: Code duplicated, block: B:403:0x0614  */
    /* JADX WARN: Code duplicated, block: B:405:0x061c  */
    /* JADX WARN: Code duplicated, block: B:406:0x0620  */
    /* JADX WARN: Code duplicated, block: B:408:0x0628  */
    /* JADX WARN: Code duplicated, block: B:409:0x062c  */
    /* JADX WARN: Code duplicated, block: B:411:0x0634  */
    /* JADX WARN: Code duplicated, block: B:412:0x0638  */
    /* JADX WARN: Code duplicated, block: B:414:0x0640  */
    /* JADX WARN: Code duplicated, block: B:415:0x0644  */
    /* JADX WARN: Code duplicated, block: B:417:0x064c  */
    /* JADX WARN: Code duplicated, block: B:418:0x0650  */
    /* JADX WARN: Code duplicated, block: B:420:0x0658  */
    /* JADX WARN: Code duplicated, block: B:421:0x065c  */
    /* JADX WARN: Code duplicated, block: B:423:0x0664  */
    /* JADX WARN: Code duplicated, block: B:424:0x0668  */
    /* JADX WARN: Code duplicated, block: B:426:0x0670  */
    /* JADX WARN: Code duplicated, block: B:427:0x0674  */
    /* JADX WARN: Code duplicated, block: B:429:0x067c  */
    /* JADX WARN: Code duplicated, block: B:430:0x0680  */
    /* JADX WARN: Code duplicated, block: B:432:0x0688  */
    /* JADX WARN: Code duplicated, block: B:433:0x068c  */
    /* JADX WARN: Code duplicated, block: B:435:0x0694  */
    /* JADX WARN: Code duplicated, block: B:436:0x0698  */
    /* JADX WARN: Code duplicated, block: B:438:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:439:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:441:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:442:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:444:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:445:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:447:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:448:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087 A[Catch: all -> 0x0758, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x001e, B:491:0x0750, B:39:0x0076, B:41:0x007c, B:44:0x0087, B:46:0x008d, B:471:0x0717, B:492:0x0754), top: B:498:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:450:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:451:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:453:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:454:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:456:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:457:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:459:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:460:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:462:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:463:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:465:0x0705  */
    /* JADX WARN: Code duplicated, block: B:466:0x0708  */
    /* JADX WARN: Code duplicated, block: B:468:0x0710  */
    /* JADX WARN: Code duplicated, block: B:469:0x0713  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d A[Catch: all -> 0x0758, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x001e, B:491:0x0750, B:39:0x0076, B:41:0x007c, B:44:0x0087, B:46:0x008d, B:471:0x0717, B:492:0x0754), top: B:498:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:471:0x0717 A[Catch: all -> 0x0758, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x001e, B:491:0x0750, B:39:0x0076, B:41:0x007c, B:44:0x0087, B:46:0x008d, B:471:0x0717, B:492:0x0754), top: B:498:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:474:0x0722  */
    /* JADX WARN: Code duplicated, block: B:476:0x0727  */
    /* JADX WARN: Code duplicated, block: B:479:0x072d  */
    /* JADX WARN: Code duplicated, block: B:482:0x0737  */
    /* JADX WARN: Code duplicated, block: B:484:0x073f  */
    /* JADX WARN: Code duplicated, block: B:485:0x0741  */
    /* JADX WARN: Code duplicated, block: B:487:0x0749  */
    /* JADX WARN: Code duplicated, block: B:489:0x074c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:507:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:520:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:530:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:550:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:560:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:580:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:590:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:610:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:620:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:640:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x0100  */
    /* JADX WARN: Code duplicated, block: B:76:0x0104  */
    /* JADX WARN: Code duplicated, block: B:78:0x010c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0110  */
    /* JADX WARN: Code duplicated, block: B:81:0x0118  */
    /* JADX WARN: Code duplicated, block: B:82:0x011c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0124  */
    /* JADX WARN: Code duplicated, block: B:85:0x0128  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    /* JADX WARN: Code duplicated, block: B:88:0x0134  */
    /* JADX WARN: Code duplicated, block: B:90:0x013c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0140  */
    /* JADX WARN: Code duplicated, block: B:93:0x0148  */
    /* JADX WARN: Code duplicated, block: B:94:0x014c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0154  */
    /* JADX WARN: Code duplicated, block: B:97:0x0158  */
    /* JADX WARN: Code duplicated, block: B:99:0x0160  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected static final boolean zzab(String str) {
        String str2;
        String str3;
        int iHashCode;
        byte b;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzlz.class) {
            if (!zzc) {
                byte b2 = 4;
                byte b3 = -1;
                if (zzamq.zza <= 28) {
                    String str4 = zzamq.zzb;
                    switch (str4.hashCode()) {
                        case -1339091551:
                            b = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                            break;
                        case -1220081023:
                            b = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 2;
                            break;
                        case -1220066608:
                            b = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 1;
                            break;
                        case -1012436106:
                            b = !str4.equals("oneday") ? (byte) -1 : (byte) 6;
                            break;
                        case -64886864:
                            b = !str4.equals("magnolia") ? (byte) -1 : (byte) 3;
                            break;
                        case 3415681:
                            b = !str4.equals("once") ? (byte) -1 : (byte) 5;
                            break;
                        case 825323514:
                            b = !str4.equals("machuca") ? (byte) -1 : (byte) 4;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            if (zzamq.zza <= 27 || !"HWEML".equals(zzamq.zzb)) {
                                if (zzamq.zza <= 26) {
                                    str2 = zzamq.zzb;
                                    switch (str2.hashCode()) {
                                        case -2144781245:
                                            if (!str2.equals("GIONEE_SWW1609")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 54;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str2.equals("GIONEE_SWW1627")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 55;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str2.equals("GIONEE_SWW1631")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 56;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str2.equals("K50a40")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 74;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str2.equals("CP8676_I02")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 22;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str2.equals("NX541J")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 89;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str2.equals("NX573J")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 90;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str2.equals("PGN528")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 101;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str2.equals("PGN610")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 102;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str2.equals("PGN611")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 103;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str2.equals("AquaPowerM")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 13;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str2.equals("RAIJIN")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 116;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str2.equals("XT1663")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 137;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str2.equals("ComioS1")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 21;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str2.equals("Phantom6")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 104;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str2.equals("pacificrim")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 95;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str2.equals("vernee_M5")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 130;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str2.equals("panell_dl")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 97;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str2.equals("panell_ds")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 98;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str2.equals("panell_dt")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 99;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str2.equals("GiONEE_GBL7319")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 52;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str2.equals("BRAVIA_ATV2")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 18;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str2.equals("iris60")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 70;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str2.equals("Slate_Pro")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 118;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str2.equals("namath")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 87;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str2.equals("A10-70F")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 5;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str2.equals("A10-70L")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 6;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str2.equals("s905x018")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 120;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str2.equals("ELUGA_Ray_X")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 34;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str2.equals("tcl_eu")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 126;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str2.equals("nicklaus_f")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 88;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str2.equals("A7000-a")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 9;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str2.equals("SVP-DTV15")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 119;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str2.equals("watson")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 131;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str2.equals("whyred")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 132;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str2.equals("OnePlus5T")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 91;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str2.equals("GiONEE_CBL7513")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 51;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str2.equals("GIONEE_GBL7360")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 53;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str2.equals("Pixi4-7_3G")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 105;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str2.equals("taido_row")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 121;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str2.equals("BLACK-1X")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 17;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str2.equals("Z12_PRO")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 138;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str2.equals("ELUGA_A3_Pro")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 31;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str2.equals("woods_fn")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 134;
                                            }
                                            break;
                                        case 2126:
                                            if (!str2.equals("C1")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 20;
                                            }
                                            break;
                                        case 2564:
                                            if (!str2.equals("Q5")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 113;
                                            }
                                            break;
                                        case 2715:
                                            if (!str2.equals("V1")) {
                                                b2 = -1;
                                            } else {
                                                b2 = ByteCompanionObject.MAX_VALUE;
                                            }
                                            break;
                                        case 2719:
                                            if (!str2.equals("V5")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 129;
                                            }
                                            break;
                                        case 3091:
                                            if (!str2.equals("b5")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 16;
                                            }
                                            break;
                                        case 3483:
                                            if (!str2.equals("mh")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 84;
                                            }
                                            break;
                                        case 73405:
                                            if (!str2.equals("JGZ")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 73;
                                            }
                                            break;
                                        case 75537:
                                            if (!str2.equals("M04")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 79;
                                            }
                                            break;
                                        case 75739:
                                            if (!str2.equals("M5c")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 80;
                                            }
                                            break;
                                        case 76779:
                                            if (!str2.equals("MX6")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 86;
                                            }
                                            break;
                                        case 78669:
                                            if (!str2.equals("P85")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 94;
                                            }
                                            break;
                                        case 79305:
                                            if (!str2.equals("PLE")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 107;
                                            }
                                            break;
                                        case 80618:
                                            if (!str2.equals("QX1")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 115;
                                            }
                                            break;
                                        case 88274:
                                            if (!str2.equals("Z80")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 139;
                                            }
                                            break;
                                        case 98846:
                                            if (!str2.equals("cv1")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 26;
                                            }
                                            break;
                                        case 98848:
                                            if (!str2.equals("cv3")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 27;
                                            }
                                            break;
                                        case 99329:
                                            if (!str2.equals("deb")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 28;
                                            }
                                            break;
                                        case 101481:
                                            if (!str2.equals("flo")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 49;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str2.equals("1601")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 0;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str2.equals("1713")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str2.equals("1714")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 2;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str2.equals("F01H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 36;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str2.equals("F01J")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 37;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str2.equals("F02H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 38;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str2.equals("F03H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 39;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str2.equals("F04H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 40;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str2.equals("F04J")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 41;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str2.equals("P681")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 93;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str2.equals("Q350")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 109;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str2.equals("Q427")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 111;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str2.equals("XE2X")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 136;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str2.equals("fugu")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 50;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str2.equals("kate")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 75;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str2.equals("mido")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 85;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str2.equals("p212")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 92;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str2.equals("MEIZU_M5")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 83;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str2.equals("601LV")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 3;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str2.equals("602LV")) {
                                                b2 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str2.equals("Aura_Note_2")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 15;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str2.equals("A1601")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 7;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str2.equals("E5643")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 30;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str2.equals("F3111")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 42;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str2.equals("F3113")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 43;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str2.equals("F3116")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 44;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str2.equals("F3211")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 45;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str2.equals("F3213")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 46;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str2.equals("F3215")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 47;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str2.equals("F3311")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 48;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str2.equals("PRO7S")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 108;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str2.equals("Q4260")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 110;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str2.equals("Q4310")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 112;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str2.equals("V23GB")) {
                                                b2 = -1;
                                            } else {
                                                b2 = ByteCompanionObject.MIN_VALUE;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str2.equals("X3_HK")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 135;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str2.equals("i9031")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 67;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str2.equals("l5460")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 76;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str2.equals("le_x6")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 77;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str2.equals("A2016a40")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 8;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str2.equals("CPY83_I00")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 25;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str2.equals("marino_f")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 82;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str2.equals("griffin")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 60;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str2.equals("A7010a48")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 11;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str2.equals("A7020a48")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 12;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str2.equals("TB3-730F")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 122;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str2.equals("TB3-730X")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 123;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str2.equals("TB3-850F")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 124;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str2.equals("TB3-850M")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 125;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str2.equals("Pixi5-10_4G")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 106;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str2.equals("QM16XE_U")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 114;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str2.equals("GIONEE_WBL5708")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 57;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str2.equals("GIONEE_WBL7365")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 58;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str2.equals("GIONEE_WBL7519")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 59;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str2.equals("manning")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 81;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str2.equals("A7000plus")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 10;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str2.equals("j2xlteins")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 72;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str2.equals("panell_d")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 96;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str2.equals("LS-5017")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 78;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str2.equals("itel_S41")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 71;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str2.equals("hwALE-H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 62;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str2.equals("EverStar_S")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 35;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str2.equals("htc_e56ml_dtul")) {
                                                b2 = -1;
                                            } else {
                                                b2 = Base64.padSymbol;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str2.equals("woods_f")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 133;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str2.equals("CPH1609")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 23;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str2.equals("CPH1715")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 24;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str2.equals("iball8735_9806")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 68;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str2.equals("santoni")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 117;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str2.equals("PB2-670M")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 100;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str2.equals("Infinix-X572")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 69;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str2.equals("BRAVIA_ATV3_4K")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 19;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str2.equals("DM-01K")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 29;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str2.equals("HWBLN-H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 63;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str2.equals("HWCAM-H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 64;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str2.equals("ASUS_X00AD_2")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 14;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str2.equals("ELUGA_Note")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 32;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str2.equals("ELUGA_Prim")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 33;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str2.equals("HWVNS-H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 65;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str2.equals("HWWAS-H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 66;
                                            }
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    switch (b2) {
                                        default:
                                            str3 = zzamq.zzd;
                                            iHashCode = str3.hashCode();
                                            if (iHashCode != -594534941) {
                                                if (iHashCode != 2006354) {
                                                    if (iHashCode == 2006367 && str3.equals("AFTN")) {
                                                        b3 = 1;
                                                    }
                                                } else if (str3.equals("AFTA")) {
                                                    b3 = 0;
                                                }
                                            } else if (str3.equals("JSN-L21")) {
                                                b3 = 2;
                                            }
                                            if (b3 != 0 || b3 == 1 || b3 == 2) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                        case 50:
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                        case 62:
                                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case Base64.mimeLineLength /* 76 */:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case AdSize.LARGE_AD_HEIGHT /* 90 */:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case LocationRequest.PRIORITY_NO_POWER /* 105 */:
                                        case 106:
                                        case 107:
                                        case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                                        case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case Cea708CCParser.Const.CODE_C1_CW1 /* 129 */:
                                        case Cea708CCParser.Const.CODE_C1_CW2 /* 130 */:
                                        case Cea708CCParser.Const.CODE_C1_CW3 /* 131 */:
                                        case Cea708CCParser.Const.CODE_C1_CW4 /* 132 */:
                                        case Cea708CCParser.Const.CODE_C1_CW5 /* 133 */:
                                        case Cea708CCParser.Const.CODE_C1_CW6 /* 134 */:
                                        case 135:
                                        case 136:
                                        case Cea708CCParser.Const.CODE_C1_DSW /* 137 */:
                                        case Cea708CCParser.Const.CODE_C1_HDW /* 138 */:
                                        case Cea708CCParser.Const.CODE_C1_TGW /* 139 */:
                                            z = true;
                                            break;
                                    }
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            z = true;
                            break;
                    }
                } else if (zzamq.zza <= 27) {
                    if (zzamq.zza <= 26) {
                        str2 = zzamq.zzb;
                        switch (str2.hashCode()) {
                            case -2144781245:
                                if (!str2.equals("GIONEE_SWW1609")) {
                                    b2 = -1;
                                } else {
                                    b2 = 54;
                                }
                                break;
                            case -2144781185:
                                if (!str2.equals("GIONEE_SWW1627")) {
                                    b2 = -1;
                                } else {
                                    b2 = 55;
                                }
                                break;
                            case -2144781160:
                                if (!str2.equals("GIONEE_SWW1631")) {
                                    b2 = -1;
                                } else {
                                    b2 = 56;
                                }
                                break;
                            case -2097309513:
                                if (!str2.equals("K50a40")) {
                                    b2 = -1;
                                } else {
                                    b2 = 74;
                                }
                                break;
                            case -2022874474:
                                if (!str2.equals("CP8676_I02")) {
                                    b2 = -1;
                                } else {
                                    b2 = 22;
                                }
                                break;
                            case -1978993182:
                                if (!str2.equals("NX541J")) {
                                    b2 = -1;
                                } else {
                                    b2 = 89;
                                }
                                break;
                            case -1978990237:
                                if (!str2.equals("NX573J")) {
                                    b2 = -1;
                                } else {
                                    b2 = 90;
                                }
                                break;
                            case -1936688988:
                                if (!str2.equals("PGN528")) {
                                    b2 = -1;
                                } else {
                                    b2 = 101;
                                }
                                break;
                            case -1936688066:
                                if (!str2.equals("PGN610")) {
                                    b2 = -1;
                                } else {
                                    b2 = 102;
                                }
                                break;
                            case -1936688065:
                                if (!str2.equals("PGN611")) {
                                    b2 = -1;
                                } else {
                                    b2 = 103;
                                }
                                break;
                            case -1931988508:
                                if (!str2.equals("AquaPowerM")) {
                                    b2 = -1;
                                } else {
                                    b2 = 13;
                                }
                                break;
                            case -1885099851:
                                if (!str2.equals("RAIJIN")) {
                                    b2 = -1;
                                } else {
                                    b2 = 116;
                                }
                                break;
                            case -1696512866:
                                if (!str2.equals("XT1663")) {
                                    b2 = -1;
                                } else {
                                    b2 = 137;
                                }
                                break;
                            case -1680025915:
                                if (!str2.equals("ComioS1")) {
                                    b2 = -1;
                                } else {
                                    b2 = 21;
                                }
                                break;
                            case -1615810839:
                                if (!str2.equals("Phantom6")) {
                                    b2 = -1;
                                } else {
                                    b2 = 104;
                                }
                                break;
                            case -1600724499:
                                if (!str2.equals("pacificrim")) {
                                    b2 = -1;
                                } else {
                                    b2 = 95;
                                }
                                break;
                            case -1554255044:
                                if (!str2.equals("vernee_M5")) {
                                    b2 = -1;
                                } else {
                                    b2 = 130;
                                }
                                break;
                            case -1481772737:
                                if (!str2.equals("panell_dl")) {
                                    b2 = -1;
                                } else {
                                    b2 = 97;
                                }
                                break;
                            case -1481772730:
                                if (!str2.equals("panell_ds")) {
                                    b2 = -1;
                                } else {
                                    b2 = 98;
                                }
                                break;
                            case -1481772729:
                                if (!str2.equals("panell_dt")) {
                                    b2 = -1;
                                } else {
                                    b2 = 99;
                                }
                                break;
                            case -1320080169:
                                if (!str2.equals("GiONEE_GBL7319")) {
                                    b2 = -1;
                                } else {
                                    b2 = 52;
                                }
                                break;
                            case -1217592143:
                                if (!str2.equals("BRAVIA_ATV2")) {
                                    b2 = -1;
                                } else {
                                    b2 = 18;
                                }
                                break;
                            case -1180384755:
                                if (!str2.equals("iris60")) {
                                    b2 = -1;
                                } else {
                                    b2 = 70;
                                }
                                break;
                            case -1139198265:
                                if (!str2.equals("Slate_Pro")) {
                                    b2 = -1;
                                } else {
                                    b2 = 118;
                                }
                                break;
                            case -1052835013:
                                if (!str2.equals("namath")) {
                                    b2 = -1;
                                } else {
                                    b2 = 87;
                                }
                                break;
                            case -993250464:
                                if (!str2.equals("A10-70F")) {
                                    b2 = -1;
                                } else {
                                    b2 = 5;
                                }
                                break;
                            case -993250458:
                                if (!str2.equals("A10-70L")) {
                                    b2 = -1;
                                } else {
                                    b2 = 6;
                                }
                                break;
                            case -965403638:
                                if (!str2.equals("s905x018")) {
                                    b2 = -1;
                                } else {
                                    b2 = 120;
                                }
                                break;
                            case -958336948:
                                if (!str2.equals("ELUGA_Ray_X")) {
                                    b2 = -1;
                                } else {
                                    b2 = 34;
                                }
                                break;
                            case -879245230:
                                if (!str2.equals("tcl_eu")) {
                                    b2 = -1;
                                } else {
                                    b2 = 126;
                                }
                                break;
                            case -842500323:
                                if (!str2.equals("nicklaus_f")) {
                                    b2 = -1;
                                } else {
                                    b2 = 88;
                                }
                                break;
                            case -821392978:
                                if (!str2.equals("A7000-a")) {
                                    b2 = -1;
                                } else {
                                    b2 = 9;
                                }
                                break;
                            case -797483286:
                                if (!str2.equals("SVP-DTV15")) {
                                    b2 = -1;
                                } else {
                                    b2 = 119;
                                }
                                break;
                            case -794946968:
                                if (!str2.equals("watson")) {
                                    b2 = -1;
                                } else {
                                    b2 = 131;
                                }
                                break;
                            case -788334647:
                                if (!str2.equals("whyred")) {
                                    b2 = -1;
                                } else {
                                    b2 = 132;
                                }
                                break;
                            case -782144577:
                                if (!str2.equals("OnePlus5T")) {
                                    b2 = -1;
                                } else {
                                    b2 = 91;
                                }
                                break;
                            case -575125681:
                                if (!str2.equals("GiONEE_CBL7513")) {
                                    b2 = -1;
                                } else {
                                    b2 = 51;
                                }
                                break;
                            case -521118391:
                                if (!str2.equals("GIONEE_GBL7360")) {
                                    b2 = -1;
                                } else {
                                    b2 = 53;
                                }
                                break;
                            case -430914369:
                                if (!str2.equals("Pixi4-7_3G")) {
                                    b2 = -1;
                                } else {
                                    b2 = 105;
                                }
                                break;
                            case -290434366:
                                if (!str2.equals("taido_row")) {
                                    b2 = -1;
                                } else {
                                    b2 = 121;
                                }
                                break;
                            case -282781963:
                                if (!str2.equals("BLACK-1X")) {
                                    b2 = -1;
                                } else {
                                    b2 = 17;
                                }
                                break;
                            case -277133239:
                                if (!str2.equals("Z12_PRO")) {
                                    b2 = -1;
                                } else {
                                    b2 = 138;
                                }
                                break;
                            case -173639913:
                                if (!str2.equals("ELUGA_A3_Pro")) {
                                    b2 = -1;
                                } else {
                                    b2 = 31;
                                }
                                break;
                            case -56598463:
                                if (!str2.equals("woods_fn")) {
                                    b2 = -1;
                                } else {
                                    b2 = 134;
                                }
                                break;
                            case 2126:
                                if (!str2.equals("C1")) {
                                    b2 = -1;
                                } else {
                                    b2 = 20;
                                }
                                break;
                            case 2564:
                                if (!str2.equals("Q5")) {
                                    b2 = -1;
                                } else {
                                    b2 = 113;
                                }
                                break;
                            case 2715:
                                if (!str2.equals("V1")) {
                                    b2 = -1;
                                } else {
                                    b2 = ByteCompanionObject.MAX_VALUE;
                                }
                                break;
                            case 2719:
                                if (!str2.equals("V5")) {
                                    b2 = -1;
                                } else {
                                    b2 = 129;
                                }
                                break;
                            case 3091:
                                if (!str2.equals("b5")) {
                                    b2 = -1;
                                } else {
                                    b2 = 16;
                                }
                                break;
                            case 3483:
                                if (!str2.equals("mh")) {
                                    b2 = -1;
                                } else {
                                    b2 = 84;
                                }
                                break;
                            case 73405:
                                if (!str2.equals("JGZ")) {
                                    b2 = -1;
                                } else {
                                    b2 = 73;
                                }
                                break;
                            case 75537:
                                if (!str2.equals("M04")) {
                                    b2 = -1;
                                } else {
                                    b2 = 79;
                                }
                                break;
                            case 75739:
                                if (!str2.equals("M5c")) {
                                    b2 = -1;
                                } else {
                                    b2 = 80;
                                }
                                break;
                            case 76779:
                                if (!str2.equals("MX6")) {
                                    b2 = -1;
                                } else {
                                    b2 = 86;
                                }
                                break;
                            case 78669:
                                if (!str2.equals("P85")) {
                                    b2 = -1;
                                } else {
                                    b2 = 94;
                                }
                                break;
                            case 79305:
                                if (!str2.equals("PLE")) {
                                    b2 = -1;
                                } else {
                                    b2 = 107;
                                }
                                break;
                            case 80618:
                                if (!str2.equals("QX1")) {
                                    b2 = -1;
                                } else {
                                    b2 = 115;
                                }
                                break;
                            case 88274:
                                if (!str2.equals("Z80")) {
                                    b2 = -1;
                                } else {
                                    b2 = 139;
                                }
                                break;
                            case 98846:
                                if (!str2.equals("cv1")) {
                                    b2 = -1;
                                } else {
                                    b2 = 26;
                                }
                                break;
                            case 98848:
                                if (!str2.equals("cv3")) {
                                    b2 = -1;
                                } else {
                                    b2 = 27;
                                }
                                break;
                            case 99329:
                                if (!str2.equals("deb")) {
                                    b2 = -1;
                                } else {
                                    b2 = 28;
                                }
                                break;
                            case 101481:
                                if (!str2.equals("flo")) {
                                    b2 = -1;
                                } else {
                                    b2 = 49;
                                }
                                break;
                            case 1513190:
                                if (!str2.equals("1601")) {
                                    b2 = -1;
                                } else {
                                    b2 = 0;
                                }
                                break;
                            case 1514184:
                                if (!str2.equals("1713")) {
                                    b2 = -1;
                                } else {
                                    b2 = 1;
                                }
                                break;
                            case 1514185:
                                if (!str2.equals("1714")) {
                                    b2 = -1;
                                } else {
                                    b2 = 2;
                                }
                                break;
                            case 2133089:
                                if (!str2.equals("F01H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 36;
                                }
                                break;
                            case 2133091:
                                if (!str2.equals("F01J")) {
                                    b2 = -1;
                                } else {
                                    b2 = 37;
                                }
                                break;
                            case 2133120:
                                if (!str2.equals("F02H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 38;
                                }
                                break;
                            case 2133151:
                                if (!str2.equals("F03H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 39;
                                }
                                break;
                            case 2133182:
                                if (!str2.equals("F04H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 40;
                                }
                                break;
                            case 2133184:
                                if (!str2.equals("F04J")) {
                                    b2 = -1;
                                } else {
                                    b2 = 41;
                                }
                                break;
                            case 2436959:
                                if (!str2.equals("P681")) {
                                    b2 = -1;
                                } else {
                                    b2 = 93;
                                }
                                break;
                            case 2463773:
                                if (!str2.equals("Q350")) {
                                    b2 = -1;
                                } else {
                                    b2 = 109;
                                }
                                break;
                            case 2464648:
                                if (!str2.equals("Q427")) {
                                    b2 = -1;
                                } else {
                                    b2 = 111;
                                }
                                break;
                            case 2689555:
                                if (!str2.equals("XE2X")) {
                                    b2 = -1;
                                } else {
                                    b2 = 136;
                                }
                                break;
                            case 3154429:
                                if (!str2.equals("fugu")) {
                                    b2 = -1;
                                } else {
                                    b2 = 50;
                                }
                                break;
                            case 3284551:
                                if (!str2.equals("kate")) {
                                    b2 = -1;
                                } else {
                                    b2 = 75;
                                }
                                break;
                            case 3351335:
                                if (!str2.equals("mido")) {
                                    b2 = -1;
                                } else {
                                    b2 = 85;
                                }
                                break;
                            case 3386211:
                                if (!str2.equals("p212")) {
                                    b2 = -1;
                                } else {
                                    b2 = 92;
                                }
                                break;
                            case 41325051:
                                if (!str2.equals("MEIZU_M5")) {
                                    b2 = -1;
                                } else {
                                    b2 = 83;
                                }
                                break;
                            case 51349633:
                                if (!str2.equals("601LV")) {
                                    b2 = -1;
                                } else {
                                    b2 = 3;
                                }
                                break;
                            case 51350594:
                                if (!str2.equals("602LV")) {
                                    b2 = -1;
                                }
                                break;
                            case 55178625:
                                if (!str2.equals("Aura_Note_2")) {
                                    b2 = -1;
                                } else {
                                    b2 = 15;
                                }
                                break;
                            case 61542055:
                                if (!str2.equals("A1601")) {
                                    b2 = -1;
                                } else {
                                    b2 = 7;
                                }
                                break;
                            case 65355429:
                                if (!str2.equals("E5643")) {
                                    b2 = -1;
                                } else {
                                    b2 = 30;
                                }
                                break;
                            case 66214468:
                                if (!str2.equals("F3111")) {
                                    b2 = -1;
                                } else {
                                    b2 = 42;
                                }
                                break;
                            case 66214470:
                                if (!str2.equals("F3113")) {
                                    b2 = -1;
                                } else {
                                    b2 = 43;
                                }
                                break;
                            case 66214473:
                                if (!str2.equals("F3116")) {
                                    b2 = -1;
                                } else {
                                    b2 = 44;
                                }
                                break;
                            case 66215429:
                                if (!str2.equals("F3211")) {
                                    b2 = -1;
                                } else {
                                    b2 = 45;
                                }
                                break;
                            case 66215431:
                                if (!str2.equals("F3213")) {
                                    b2 = -1;
                                } else {
                                    b2 = 46;
                                }
                                break;
                            case 66215433:
                                if (!str2.equals("F3215")) {
                                    b2 = -1;
                                } else {
                                    b2 = 47;
                                }
                                break;
                            case 66216390:
                                if (!str2.equals("F3311")) {
                                    b2 = -1;
                                } else {
                                    b2 = 48;
                                }
                                break;
                            case 76402249:
                                if (!str2.equals("PRO7S")) {
                                    b2 = -1;
                                } else {
                                    b2 = 108;
                                }
                                break;
                            case 76404105:
                                if (!str2.equals("Q4260")) {
                                    b2 = -1;
                                } else {
                                    b2 = 110;
                                }
                                break;
                            case 76404911:
                                if (!str2.equals("Q4310")) {
                                    b2 = -1;
                                } else {
                                    b2 = 112;
                                }
                                break;
                            case 80963634:
                                if (!str2.equals("V23GB")) {
                                    b2 = -1;
                                } else {
                                    b2 = ByteCompanionObject.MIN_VALUE;
                                }
                                break;
                            case 82882791:
                                if (!str2.equals("X3_HK")) {
                                    b2 = -1;
                                } else {
                                    b2 = 135;
                                }
                                break;
                            case 98715550:
                                if (!str2.equals("i9031")) {
                                    b2 = -1;
                                } else {
                                    b2 = 67;
                                }
                                break;
                            case 101370885:
                                if (!str2.equals("l5460")) {
                                    b2 = -1;
                                } else {
                                    b2 = 76;
                                }
                                break;
                            case 102844228:
                                if (!str2.equals("le_x6")) {
                                    b2 = -1;
                                } else {
                                    b2 = 77;
                                }
                                break;
                            case 165221241:
                                if (!str2.equals("A2016a40")) {
                                    b2 = -1;
                                } else {
                                    b2 = 8;
                                }
                                break;
                            case 182191441:
                                if (!str2.equals("CPY83_I00")) {
                                    b2 = -1;
                                } else {
                                    b2 = 25;
                                }
                                break;
                            case 245388979:
                                if (!str2.equals("marino_f")) {
                                    b2 = -1;
                                } else {
                                    b2 = 82;
                                }
                                break;
                            case 287431619:
                                if (!str2.equals("griffin")) {
                                    b2 = -1;
                                } else {
                                    b2 = 60;
                                }
                                break;
                            case 307593612:
                                if (!str2.equals("A7010a48")) {
                                    b2 = -1;
                                } else {
                                    b2 = 11;
                                }
                                break;
                            case 308517133:
                                if (!str2.equals("A7020a48")) {
                                    b2 = -1;
                                } else {
                                    b2 = 12;
                                }
                                break;
                            case 316215098:
                                if (!str2.equals("TB3-730F")) {
                                    b2 = -1;
                                } else {
                                    b2 = 122;
                                }
                                break;
                            case 316215116:
                                if (!str2.equals("TB3-730X")) {
                                    b2 = -1;
                                } else {
                                    b2 = 123;
                                }
                                break;
                            case 316246811:
                                if (!str2.equals("TB3-850F")) {
                                    b2 = -1;
                                } else {
                                    b2 = 124;
                                }
                                break;
                            case 316246818:
                                if (!str2.equals("TB3-850M")) {
                                    b2 = -1;
                                } else {
                                    b2 = 125;
                                }
                                break;
                            case 407160593:
                                if (!str2.equals("Pixi5-10_4G")) {
                                    b2 = -1;
                                } else {
                                    b2 = 106;
                                }
                                break;
                            case 507412548:
                                if (!str2.equals("QM16XE_U")) {
                                    b2 = -1;
                                } else {
                                    b2 = 114;
                                }
                                break;
                            case 793982701:
                                if (!str2.equals("GIONEE_WBL5708")) {
                                    b2 = -1;
                                } else {
                                    b2 = 57;
                                }
                                break;
                            case 794038622:
                                if (!str2.equals("GIONEE_WBL7365")) {
                                    b2 = -1;
                                } else {
                                    b2 = 58;
                                }
                                break;
                            case 794040393:
                                if (!str2.equals("GIONEE_WBL7519")) {
                                    b2 = -1;
                                } else {
                                    b2 = 59;
                                }
                                break;
                            case 835649806:
                                if (!str2.equals("manning")) {
                                    b2 = -1;
                                } else {
                                    b2 = 81;
                                }
                                break;
                            case 917340916:
                                if (!str2.equals("A7000plus")) {
                                    b2 = -1;
                                } else {
                                    b2 = 10;
                                }
                                break;
                            case 958008161:
                                if (!str2.equals("j2xlteins")) {
                                    b2 = -1;
                                } else {
                                    b2 = 72;
                                }
                                break;
                            case 1060579533:
                                if (!str2.equals("panell_d")) {
                                    b2 = -1;
                                } else {
                                    b2 = 96;
                                }
                                break;
                            case 1150207623:
                                if (!str2.equals("LS-5017")) {
                                    b2 = -1;
                                } else {
                                    b2 = 78;
                                }
                                break;
                            case 1176899427:
                                if (!str2.equals("itel_S41")) {
                                    b2 = -1;
                                } else {
                                    b2 = 71;
                                }
                                break;
                            case 1280332038:
                                if (!str2.equals("hwALE-H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 62;
                                }
                                break;
                            case 1306947716:
                                if (!str2.equals("EverStar_S")) {
                                    b2 = -1;
                                } else {
                                    b2 = 35;
                                }
                                break;
                            case 1349174697:
                                if (!str2.equals("htc_e56ml_dtul")) {
                                    b2 = -1;
                                } else {
                                    b2 = Base64.padSymbol;
                                }
                                break;
                            case 1522194893:
                                if (!str2.equals("woods_f")) {
                                    b2 = -1;
                                } else {
                                    b2 = 133;
                                }
                                break;
                            case 1691543273:
                                if (!str2.equals("CPH1609")) {
                                    b2 = -1;
                                } else {
                                    b2 = 23;
                                }
                                break;
                            case 1691544261:
                                if (!str2.equals("CPH1715")) {
                                    b2 = -1;
                                } else {
                                    b2 = 24;
                                }
                                break;
                            case 1709443163:
                                if (!str2.equals("iball8735_9806")) {
                                    b2 = -1;
                                } else {
                                    b2 = 68;
                                }
                                break;
                            case 1865889110:
                                if (!str2.equals("santoni")) {
                                    b2 = -1;
                                } else {
                                    b2 = 117;
                                }
                                break;
                            case 1906253259:
                                if (!str2.equals("PB2-670M")) {
                                    b2 = -1;
                                } else {
                                    b2 = 100;
                                }
                                break;
                            case 1977196784:
                                if (!str2.equals("Infinix-X572")) {
                                    b2 = -1;
                                } else {
                                    b2 = 69;
                                }
                                break;
                            case 2006372676:
                                if (!str2.equals("BRAVIA_ATV3_4K")) {
                                    b2 = -1;
                                } else {
                                    b2 = 19;
                                }
                                break;
                            case 2019281702:
                                if (!str2.equals("DM-01K")) {
                                    b2 = -1;
                                } else {
                                    b2 = 29;
                                }
                                break;
                            case 2029784656:
                                if (!str2.equals("HWBLN-H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 63;
                                }
                                break;
                            case 2030379515:
                                if (!str2.equals("HWCAM-H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 64;
                                }
                                break;
                            case 2033393791:
                                if (!str2.equals("ASUS_X00AD_2")) {
                                    b2 = -1;
                                } else {
                                    b2 = 14;
                                }
                                break;
                            case 2047190025:
                                if (!str2.equals("ELUGA_Note")) {
                                    b2 = -1;
                                } else {
                                    b2 = 32;
                                }
                                break;
                            case 2047252157:
                                if (!str2.equals("ELUGA_Prim")) {
                                    b2 = -1;
                                } else {
                                    b2 = 33;
                                }
                                break;
                            case 2048319463:
                                if (!str2.equals("HWVNS-H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 65;
                                }
                                break;
                            case 2048855701:
                                if (!str2.equals("HWWAS-H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 66;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            default:
                                str3 = zzamq.zzd;
                                iHashCode = str3.hashCode();
                                if (iHashCode != -594534941) {
                                    if (iHashCode != 2006354) {
                                        if (iHashCode == 2006367) {
                                            b3 = 1;
                                        }
                                    } else if (str3.equals("AFTA")) {
                                        b3 = 0;
                                    }
                                } else if (str3.equals("JSN-L21")) {
                                    b3 = 2;
                                }
                                if (b3 != 0) {
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            case 50:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            case 62:
                            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                            case Base64.mimeLineLength /* 76 */:
                            case 77:
                            case 78:
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 86:
                            case 87:
                            case 88:
                            case 89:
                            case AdSize.LARGE_AD_HEIGHT /* 90 */:
                            case 91:
                            case 92:
                            case 93:
                            case 94:
                            case 95:
                            case 96:
                            case 97:
                            case 98:
                            case 99:
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                            case 104:
                            case LocationRequest.PRIORITY_NO_POWER /* 105 */:
                            case 106:
                            case 107:
                            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                            case 110:
                            case 111:
                            case 112:
                            case 113:
                            case 114:
                            case 115:
                            case 116:
                            case 117:
                            case 118:
                            case 119:
                            case 120:
                            case 121:
                            case 122:
                            case 123:
                            case 124:
                            case 125:
                            case 126:
                            case 127:
                            case 128:
                            case Cea708CCParser.Const.CODE_C1_CW1 /* 129 */:
                            case Cea708CCParser.Const.CODE_C1_CW2 /* 130 */:
                            case Cea708CCParser.Const.CODE_C1_CW3 /* 131 */:
                            case Cea708CCParser.Const.CODE_C1_CW4 /* 132 */:
                            case Cea708CCParser.Const.CODE_C1_CW5 /* 133 */:
                            case Cea708CCParser.Const.CODE_C1_CW6 /* 134 */:
                            case 135:
                            case 136:
                            case Cea708CCParser.Const.CODE_C1_DSW /* 137 */:
                            case Cea708CCParser.Const.CODE_C1_HDW /* 138 */:
                            case Cea708CCParser.Const.CODE_C1_TGW /* 139 */:
                                z = true;
                                break;
                        }
                    }
                } else if (zzamq.zza <= 26) {
                    str2 = zzamq.zzb;
                    switch (str2.hashCode()) {
                        case -2144781245:
                            if (!str2.equals("GIONEE_SWW1609")) {
                                b2 = -1;
                            } else {
                                b2 = 54;
                            }
                            break;
                        case -2144781185:
                            if (!str2.equals("GIONEE_SWW1627")) {
                                b2 = -1;
                            } else {
                                b2 = 55;
                            }
                            break;
                        case -2144781160:
                            if (!str2.equals("GIONEE_SWW1631")) {
                                b2 = -1;
                            } else {
                                b2 = 56;
                            }
                            break;
                        case -2097309513:
                            if (!str2.equals("K50a40")) {
                                b2 = -1;
                            } else {
                                b2 = 74;
                            }
                            break;
                        case -2022874474:
                            if (!str2.equals("CP8676_I02")) {
                                b2 = -1;
                            } else {
                                b2 = 22;
                            }
                            break;
                        case -1978993182:
                            if (!str2.equals("NX541J")) {
                                b2 = -1;
                            } else {
                                b2 = 89;
                            }
                            break;
                        case -1978990237:
                            if (!str2.equals("NX573J")) {
                                b2 = -1;
                            } else {
                                b2 = 90;
                            }
                            break;
                        case -1936688988:
                            if (!str2.equals("PGN528")) {
                                b2 = -1;
                            } else {
                                b2 = 101;
                            }
                            break;
                        case -1936688066:
                            if (!str2.equals("PGN610")) {
                                b2 = -1;
                            } else {
                                b2 = 102;
                            }
                            break;
                        case -1936688065:
                            if (!str2.equals("PGN611")) {
                                b2 = -1;
                            } else {
                                b2 = 103;
                            }
                            break;
                        case -1931988508:
                            if (!str2.equals("AquaPowerM")) {
                                b2 = -1;
                            } else {
                                b2 = 13;
                            }
                            break;
                        case -1885099851:
                            if (!str2.equals("RAIJIN")) {
                                b2 = -1;
                            } else {
                                b2 = 116;
                            }
                            break;
                        case -1696512866:
                            if (!str2.equals("XT1663")) {
                                b2 = -1;
                            } else {
                                b2 = 137;
                            }
                            break;
                        case -1680025915:
                            if (!str2.equals("ComioS1")) {
                                b2 = -1;
                            } else {
                                b2 = 21;
                            }
                            break;
                        case -1615810839:
                            if (!str2.equals("Phantom6")) {
                                b2 = -1;
                            } else {
                                b2 = 104;
                            }
                            break;
                        case -1600724499:
                            if (!str2.equals("pacificrim")) {
                                b2 = -1;
                            } else {
                                b2 = 95;
                            }
                            break;
                        case -1554255044:
                            if (!str2.equals("vernee_M5")) {
                                b2 = -1;
                            } else {
                                b2 = 130;
                            }
                            break;
                        case -1481772737:
                            if (!str2.equals("panell_dl")) {
                                b2 = -1;
                            } else {
                                b2 = 97;
                            }
                            break;
                        case -1481772730:
                            if (!str2.equals("panell_ds")) {
                                b2 = -1;
                            } else {
                                b2 = 98;
                            }
                            break;
                        case -1481772729:
                            if (!str2.equals("panell_dt")) {
                                b2 = -1;
                            } else {
                                b2 = 99;
                            }
                            break;
                        case -1320080169:
                            if (!str2.equals("GiONEE_GBL7319")) {
                                b2 = -1;
                            } else {
                                b2 = 52;
                            }
                            break;
                        case -1217592143:
                            if (!str2.equals("BRAVIA_ATV2")) {
                                b2 = -1;
                            } else {
                                b2 = 18;
                            }
                            break;
                        case -1180384755:
                            if (!str2.equals("iris60")) {
                                b2 = -1;
                            } else {
                                b2 = 70;
                            }
                            break;
                        case -1139198265:
                            if (!str2.equals("Slate_Pro")) {
                                b2 = -1;
                            } else {
                                b2 = 118;
                            }
                            break;
                        case -1052835013:
                            if (!str2.equals("namath")) {
                                b2 = -1;
                            } else {
                                b2 = 87;
                            }
                            break;
                        case -993250464:
                            if (!str2.equals("A10-70F")) {
                                b2 = -1;
                            } else {
                                b2 = 5;
                            }
                            break;
                        case -993250458:
                            if (!str2.equals("A10-70L")) {
                                b2 = -1;
                            } else {
                                b2 = 6;
                            }
                            break;
                        case -965403638:
                            if (!str2.equals("s905x018")) {
                                b2 = -1;
                            } else {
                                b2 = 120;
                            }
                            break;
                        case -958336948:
                            if (!str2.equals("ELUGA_Ray_X")) {
                                b2 = -1;
                            } else {
                                b2 = 34;
                            }
                            break;
                        case -879245230:
                            if (!str2.equals("tcl_eu")) {
                                b2 = -1;
                            } else {
                                b2 = 126;
                            }
                            break;
                        case -842500323:
                            if (!str2.equals("nicklaus_f")) {
                                b2 = -1;
                            } else {
                                b2 = 88;
                            }
                            break;
                        case -821392978:
                            if (!str2.equals("A7000-a")) {
                                b2 = -1;
                            } else {
                                b2 = 9;
                            }
                            break;
                        case -797483286:
                            if (!str2.equals("SVP-DTV15")) {
                                b2 = -1;
                            } else {
                                b2 = 119;
                            }
                            break;
                        case -794946968:
                            if (!str2.equals("watson")) {
                                b2 = -1;
                            } else {
                                b2 = 131;
                            }
                            break;
                        case -788334647:
                            if (!str2.equals("whyred")) {
                                b2 = -1;
                            } else {
                                b2 = 132;
                            }
                            break;
                        case -782144577:
                            if (!str2.equals("OnePlus5T")) {
                                b2 = -1;
                            } else {
                                b2 = 91;
                            }
                            break;
                        case -575125681:
                            if (!str2.equals("GiONEE_CBL7513")) {
                                b2 = -1;
                            } else {
                                b2 = 51;
                            }
                            break;
                        case -521118391:
                            if (!str2.equals("GIONEE_GBL7360")) {
                                b2 = -1;
                            } else {
                                b2 = 53;
                            }
                            break;
                        case -430914369:
                            if (!str2.equals("Pixi4-7_3G")) {
                                b2 = -1;
                            } else {
                                b2 = 105;
                            }
                            break;
                        case -290434366:
                            if (!str2.equals("taido_row")) {
                                b2 = -1;
                            } else {
                                b2 = 121;
                            }
                            break;
                        case -282781963:
                            if (!str2.equals("BLACK-1X")) {
                                b2 = -1;
                            } else {
                                b2 = 17;
                            }
                            break;
                        case -277133239:
                            if (!str2.equals("Z12_PRO")) {
                                b2 = -1;
                            } else {
                                b2 = 138;
                            }
                            break;
                        case -173639913:
                            if (!str2.equals("ELUGA_A3_Pro")) {
                                b2 = -1;
                            } else {
                                b2 = 31;
                            }
                            break;
                        case -56598463:
                            if (!str2.equals("woods_fn")) {
                                b2 = -1;
                            } else {
                                b2 = 134;
                            }
                            break;
                        case 2126:
                            if (!str2.equals("C1")) {
                                b2 = -1;
                            } else {
                                b2 = 20;
                            }
                            break;
                        case 2564:
                            if (!str2.equals("Q5")) {
                                b2 = -1;
                            } else {
                                b2 = 113;
                            }
                            break;
                        case 2715:
                            if (!str2.equals("V1")) {
                                b2 = -1;
                            } else {
                                b2 = ByteCompanionObject.MAX_VALUE;
                            }
                            break;
                        case 2719:
                            if (!str2.equals("V5")) {
                                b2 = -1;
                            } else {
                                b2 = 129;
                            }
                            break;
                        case 3091:
                            if (!str2.equals("b5")) {
                                b2 = -1;
                            } else {
                                b2 = 16;
                            }
                            break;
                        case 3483:
                            if (!str2.equals("mh")) {
                                b2 = -1;
                            } else {
                                b2 = 84;
                            }
                            break;
                        case 73405:
                            if (!str2.equals("JGZ")) {
                                b2 = -1;
                            } else {
                                b2 = 73;
                            }
                            break;
                        case 75537:
                            if (!str2.equals("M04")) {
                                b2 = -1;
                            } else {
                                b2 = 79;
                            }
                            break;
                        case 75739:
                            if (!str2.equals("M5c")) {
                                b2 = -1;
                            } else {
                                b2 = 80;
                            }
                            break;
                        case 76779:
                            if (!str2.equals("MX6")) {
                                b2 = -1;
                            } else {
                                b2 = 86;
                            }
                            break;
                        case 78669:
                            if (!str2.equals("P85")) {
                                b2 = -1;
                            } else {
                                b2 = 94;
                            }
                            break;
                        case 79305:
                            if (!str2.equals("PLE")) {
                                b2 = -1;
                            } else {
                                b2 = 107;
                            }
                            break;
                        case 80618:
                            if (!str2.equals("QX1")) {
                                b2 = -1;
                            } else {
                                b2 = 115;
                            }
                            break;
                        case 88274:
                            if (!str2.equals("Z80")) {
                                b2 = -1;
                            } else {
                                b2 = 139;
                            }
                            break;
                        case 98846:
                            if (!str2.equals("cv1")) {
                                b2 = -1;
                            } else {
                                b2 = 26;
                            }
                            break;
                        case 98848:
                            if (!str2.equals("cv3")) {
                                b2 = -1;
                            } else {
                                b2 = 27;
                            }
                            break;
                        case 99329:
                            if (!str2.equals("deb")) {
                                b2 = -1;
                            } else {
                                b2 = 28;
                            }
                            break;
                        case 101481:
                            if (!str2.equals("flo")) {
                                b2 = -1;
                            } else {
                                b2 = 49;
                            }
                            break;
                        case 1513190:
                            if (!str2.equals("1601")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case 1514184:
                            if (!str2.equals("1713")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case 1514185:
                            if (!str2.equals("1714")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case 2133089:
                            if (!str2.equals("F01H")) {
                                b2 = -1;
                            } else {
                                b2 = 36;
                            }
                            break;
                        case 2133091:
                            if (!str2.equals("F01J")) {
                                b2 = -1;
                            } else {
                                b2 = 37;
                            }
                            break;
                        case 2133120:
                            if (!str2.equals("F02H")) {
                                b2 = -1;
                            } else {
                                b2 = 38;
                            }
                            break;
                        case 2133151:
                            if (!str2.equals("F03H")) {
                                b2 = -1;
                            } else {
                                b2 = 39;
                            }
                            break;
                        case 2133182:
                            if (!str2.equals("F04H")) {
                                b2 = -1;
                            } else {
                                b2 = 40;
                            }
                            break;
                        case 2133184:
                            if (!str2.equals("F04J")) {
                                b2 = -1;
                            } else {
                                b2 = 41;
                            }
                            break;
                        case 2436959:
                            if (!str2.equals("P681")) {
                                b2 = -1;
                            } else {
                                b2 = 93;
                            }
                            break;
                        case 2463773:
                            if (!str2.equals("Q350")) {
                                b2 = -1;
                            } else {
                                b2 = 109;
                            }
                            break;
                        case 2464648:
                            if (!str2.equals("Q427")) {
                                b2 = -1;
                            } else {
                                b2 = 111;
                            }
                            break;
                        case 2689555:
                            if (!str2.equals("XE2X")) {
                                b2 = -1;
                            } else {
                                b2 = 136;
                            }
                            break;
                        case 3154429:
                            if (!str2.equals("fugu")) {
                                b2 = -1;
                            } else {
                                b2 = 50;
                            }
                            break;
                        case 3284551:
                            if (!str2.equals("kate")) {
                                b2 = -1;
                            } else {
                                b2 = 75;
                            }
                            break;
                        case 3351335:
                            if (!str2.equals("mido")) {
                                b2 = -1;
                            } else {
                                b2 = 85;
                            }
                            break;
                        case 3386211:
                            if (!str2.equals("p212")) {
                                b2 = -1;
                            } else {
                                b2 = 92;
                            }
                            break;
                        case 41325051:
                            if (!str2.equals("MEIZU_M5")) {
                                b2 = -1;
                            } else {
                                b2 = 83;
                            }
                            break;
                        case 51349633:
                            if (!str2.equals("601LV")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        case 51350594:
                            if (!str2.equals("602LV")) {
                                b2 = -1;
                            }
                            break;
                        case 55178625:
                            if (!str2.equals("Aura_Note_2")) {
                                b2 = -1;
                            } else {
                                b2 = 15;
                            }
                            break;
                        case 61542055:
                            if (!str2.equals("A1601")) {
                                b2 = -1;
                            } else {
                                b2 = 7;
                            }
                            break;
                        case 65355429:
                            if (!str2.equals("E5643")) {
                                b2 = -1;
                            } else {
                                b2 = 30;
                            }
                            break;
                        case 66214468:
                            if (!str2.equals("F3111")) {
                                b2 = -1;
                            } else {
                                b2 = 42;
                            }
                            break;
                        case 66214470:
                            if (!str2.equals("F3113")) {
                                b2 = -1;
                            } else {
                                b2 = 43;
                            }
                            break;
                        case 66214473:
                            if (!str2.equals("F3116")) {
                                b2 = -1;
                            } else {
                                b2 = 44;
                            }
                            break;
                        case 66215429:
                            if (!str2.equals("F3211")) {
                                b2 = -1;
                            } else {
                                b2 = 45;
                            }
                            break;
                        case 66215431:
                            if (!str2.equals("F3213")) {
                                b2 = -1;
                            } else {
                                b2 = 46;
                            }
                            break;
                        case 66215433:
                            if (!str2.equals("F3215")) {
                                b2 = -1;
                            } else {
                                b2 = 47;
                            }
                            break;
                        case 66216390:
                            if (!str2.equals("F3311")) {
                                b2 = -1;
                            } else {
                                b2 = 48;
                            }
                            break;
                        case 76402249:
                            if (!str2.equals("PRO7S")) {
                                b2 = -1;
                            } else {
                                b2 = 108;
                            }
                            break;
                        case 76404105:
                            if (!str2.equals("Q4260")) {
                                b2 = -1;
                            } else {
                                b2 = 110;
                            }
                            break;
                        case 76404911:
                            if (!str2.equals("Q4310")) {
                                b2 = -1;
                            } else {
                                b2 = 112;
                            }
                            break;
                        case 80963634:
                            if (!str2.equals("V23GB")) {
                                b2 = -1;
                            } else {
                                b2 = ByteCompanionObject.MIN_VALUE;
                            }
                            break;
                        case 82882791:
                            if (!str2.equals("X3_HK")) {
                                b2 = -1;
                            } else {
                                b2 = 135;
                            }
                            break;
                        case 98715550:
                            if (!str2.equals("i9031")) {
                                b2 = -1;
                            } else {
                                b2 = 67;
                            }
                            break;
                        case 101370885:
                            if (!str2.equals("l5460")) {
                                b2 = -1;
                            } else {
                                b2 = 76;
                            }
                            break;
                        case 102844228:
                            if (!str2.equals("le_x6")) {
                                b2 = -1;
                            } else {
                                b2 = 77;
                            }
                            break;
                        case 165221241:
                            if (!str2.equals("A2016a40")) {
                                b2 = -1;
                            } else {
                                b2 = 8;
                            }
                            break;
                        case 182191441:
                            if (!str2.equals("CPY83_I00")) {
                                b2 = -1;
                            } else {
                                b2 = 25;
                            }
                            break;
                        case 245388979:
                            if (!str2.equals("marino_f")) {
                                b2 = -1;
                            } else {
                                b2 = 82;
                            }
                            break;
                        case 287431619:
                            if (!str2.equals("griffin")) {
                                b2 = -1;
                            } else {
                                b2 = 60;
                            }
                            break;
                        case 307593612:
                            if (!str2.equals("A7010a48")) {
                                b2 = -1;
                            } else {
                                b2 = 11;
                            }
                            break;
                        case 308517133:
                            if (!str2.equals("A7020a48")) {
                                b2 = -1;
                            } else {
                                b2 = 12;
                            }
                            break;
                        case 316215098:
                            if (!str2.equals("TB3-730F")) {
                                b2 = -1;
                            } else {
                                b2 = 122;
                            }
                            break;
                        case 316215116:
                            if (!str2.equals("TB3-730X")) {
                                b2 = -1;
                            } else {
                                b2 = 123;
                            }
                            break;
                        case 316246811:
                            if (!str2.equals("TB3-850F")) {
                                b2 = -1;
                            } else {
                                b2 = 124;
                            }
                            break;
                        case 316246818:
                            if (!str2.equals("TB3-850M")) {
                                b2 = -1;
                            } else {
                                b2 = 125;
                            }
                            break;
                        case 407160593:
                            if (!str2.equals("Pixi5-10_4G")) {
                                b2 = -1;
                            } else {
                                b2 = 106;
                            }
                            break;
                        case 507412548:
                            if (!str2.equals("QM16XE_U")) {
                                b2 = -1;
                            } else {
                                b2 = 114;
                            }
                            break;
                        case 793982701:
                            if (!str2.equals("GIONEE_WBL5708")) {
                                b2 = -1;
                            } else {
                                b2 = 57;
                            }
                            break;
                        case 794038622:
                            if (!str2.equals("GIONEE_WBL7365")) {
                                b2 = -1;
                            } else {
                                b2 = 58;
                            }
                            break;
                        case 794040393:
                            if (!str2.equals("GIONEE_WBL7519")) {
                                b2 = -1;
                            } else {
                                b2 = 59;
                            }
                            break;
                        case 835649806:
                            if (!str2.equals("manning")) {
                                b2 = -1;
                            } else {
                                b2 = 81;
                            }
                            break;
                        case 917340916:
                            if (!str2.equals("A7000plus")) {
                                b2 = -1;
                            } else {
                                b2 = 10;
                            }
                            break;
                        case 958008161:
                            if (!str2.equals("j2xlteins")) {
                                b2 = -1;
                            } else {
                                b2 = 72;
                            }
                            break;
                        case 1060579533:
                            if (!str2.equals("panell_d")) {
                                b2 = -1;
                            } else {
                                b2 = 96;
                            }
                            break;
                        case 1150207623:
                            if (!str2.equals("LS-5017")) {
                                b2 = -1;
                            } else {
                                b2 = 78;
                            }
                            break;
                        case 1176899427:
                            if (!str2.equals("itel_S41")) {
                                b2 = -1;
                            } else {
                                b2 = 71;
                            }
                            break;
                        case 1280332038:
                            if (!str2.equals("hwALE-H")) {
                                b2 = -1;
                            } else {
                                b2 = 62;
                            }
                            break;
                        case 1306947716:
                            if (!str2.equals("EverStar_S")) {
                                b2 = -1;
                            } else {
                                b2 = 35;
                            }
                            break;
                        case 1349174697:
                            if (!str2.equals("htc_e56ml_dtul")) {
                                b2 = -1;
                            } else {
                                b2 = Base64.padSymbol;
                            }
                            break;
                        case 1522194893:
                            if (!str2.equals("woods_f")) {
                                b2 = -1;
                            } else {
                                b2 = 133;
                            }
                            break;
                        case 1691543273:
                            if (!str2.equals("CPH1609")) {
                                b2 = -1;
                            } else {
                                b2 = 23;
                            }
                            break;
                        case 1691544261:
                            if (!str2.equals("CPH1715")) {
                                b2 = -1;
                            } else {
                                b2 = 24;
                            }
                            break;
                        case 1709443163:
                            if (!str2.equals("iball8735_9806")) {
                                b2 = -1;
                            } else {
                                b2 = 68;
                            }
                            break;
                        case 1865889110:
                            if (!str2.equals("santoni")) {
                                b2 = -1;
                            } else {
                                b2 = 117;
                            }
                            break;
                        case 1906253259:
                            if (!str2.equals("PB2-670M")) {
                                b2 = -1;
                            } else {
                                b2 = 100;
                            }
                            break;
                        case 1977196784:
                            if (!str2.equals("Infinix-X572")) {
                                b2 = -1;
                            } else {
                                b2 = 69;
                            }
                            break;
                        case 2006372676:
                            if (!str2.equals("BRAVIA_ATV3_4K")) {
                                b2 = -1;
                            } else {
                                b2 = 19;
                            }
                            break;
                        case 2019281702:
                            if (!str2.equals("DM-01K")) {
                                b2 = -1;
                            } else {
                                b2 = 29;
                            }
                            break;
                        case 2029784656:
                            if (!str2.equals("HWBLN-H")) {
                                b2 = -1;
                            } else {
                                b2 = 63;
                            }
                            break;
                        case 2030379515:
                            if (!str2.equals("HWCAM-H")) {
                                b2 = -1;
                            } else {
                                b2 = 64;
                            }
                            break;
                        case 2033393791:
                            if (!str2.equals("ASUS_X00AD_2")) {
                                b2 = -1;
                            } else {
                                b2 = 14;
                            }
                            break;
                        case 2047190025:
                            if (!str2.equals("ELUGA_Note")) {
                                b2 = -1;
                            } else {
                                b2 = 32;
                            }
                            break;
                        case 2047252157:
                            if (!str2.equals("ELUGA_Prim")) {
                                b2 = -1;
                            } else {
                                b2 = 33;
                            }
                            break;
                        case 2048319463:
                            if (!str2.equals("HWVNS-H")) {
                                b2 = -1;
                            } else {
                                b2 = 65;
                            }
                            break;
                        case 2048855701:
                            if (!str2.equals("HWWAS-H")) {
                                b2 = -1;
                            } else {
                                b2 = 66;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        default:
                            str3 = zzamq.zzd;
                            iHashCode = str3.hashCode();
                            if (iHashCode != -594534941) {
                                if (iHashCode != 2006354) {
                                    if (iHashCode == 2006367) {
                                        b3 = 1;
                                    }
                                } else if (str3.equals("AFTA")) {
                                    b3 = 0;
                                }
                            } else if (str3.equals("JSN-L21")) {
                                b3 = 2;
                            }
                            if (b3 != 0) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                        case 50:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        case 62:
                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case Base64.mimeLineLength /* 76 */:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case AdSize.LARGE_AD_HEIGHT /* 90 */:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case LocationRequest.PRIORITY_NO_POWER /* 105 */:
                        case 106:
                        case 107:
                        case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                        case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case Cea708CCParser.Const.CODE_C1_CW1 /* 129 */:
                        case Cea708CCParser.Const.CODE_C1_CW2 /* 130 */:
                        case Cea708CCParser.Const.CODE_C1_CW3 /* 131 */:
                        case Cea708CCParser.Const.CODE_C1_CW4 /* 132 */:
                        case Cea708CCParser.Const.CODE_C1_CW5 /* 133 */:
                        case Cea708CCParser.Const.CODE_C1_CW6 /* 134 */:
                        case 135:
                        case 136:
                        case Cea708CCParser.Const.CODE_C1_DSW /* 137 */:
                        case Cea708CCParser.Const.CODE_C1_HDW /* 138 */:
                        case Cea708CCParser.Const.CODE_C1_TGW /* 139 */:
                            z = true;
                            break;
                    }
                }
                zzd = z;
                zzc = true;
            }
        }
        return zzd;
    }

    protected static int zzy(zzfo zzfoVar, zzafv zzafvVar) {
        if (zzafvVar.zzm == -1) {
            return zzaF(zzfoVar, zzafvVar);
        }
        int size = zzafvVar.zzn.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += zzafvVar.zzn.get(i).length;
        }
        return zzafvVar.zzm + length;
    }

    protected final void zzA(zzgh zzghVar, int i, long j) {
        zzaC();
        zzamo.zza("releaseOutputBuffer");
        zzghVar.zzh(i, true);
        zzamo.zzb();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zza.zze++;
        this.zzw = 0;
        zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzB(zzaf zzafVar) throws zzaeg {
        this.zzx++;
        int i = zzamq.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzC() {
        this.zzp = false;
        int i = zzamq.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final boolean zzJ(zzfo zzfoVar) {
        return this.zzl != null || zzaB(zzfoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahv
    public final void zzM(float f, float f2) throws Throwable {
        super.zzM(f, f2);
        this.zzf.zzf(f);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzR() {
        super.zzR();
        this.zzx = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final zzfn zzT(Throwable th, zzfo zzfoVar) {
        return new zzlx(th, zzfoVar, this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzU(zzaf zzafVar) throws zzaeg {
        if (this.zzk) {
            ByteBuffer byteBuffer = zzafVar.zze;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    zzgh zzghVarZzZ = zzZ();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    zzghVarZzZ.zzm(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzV(long j) {
        super.zzV(j);
        this.zzx--;
    }

    protected final void zza(int i) {
        zzaz zzazVar = this.zza;
        zzazVar.zzg += i;
        this.zzv += i;
        int i2 = this.zzw + i;
        this.zzw = i2;
        zzazVar.zzh = Math.max(i2, zzazVar.zzh);
    }

    protected final void zzaa(zzgh zzghVar, int i, long j, long j2) {
        zzaC();
        zzamo.zza("releaseOutputBuffer");
        zzghVar.zzi(i, j2);
        zzamo.zzb();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zza.zze++;
        this.zzw = 0;
        zzp();
    }

    protected final void zzb(long j) {
        zzaz zzazVar = this.zza;
        zzazVar.zzj += j;
        zzazVar.zzk++;
        this.zzA += j;
        this.zzB++;
    }

    @Override // com.google.android.gms.internal.ads.zzahv, com.google.android.gms.internal.ads.zzahw
    public final String zzc() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final int zzd(zzfs zzfsVar, zzafv zzafvVar) throws zzfy {
        int i = 0;
        if (!zzalt.zzb(zzafvVar.zzl)) {
            return 0;
        }
        boolean z = zzafvVar.zzo != null;
        List<zzfo> listZzaA = zzaA(zzfsVar, zzafvVar, z, false);
        if (z && listZzaA.isEmpty()) {
            listZzaA = zzaA(zzfsVar, zzafvVar, false, false);
        }
        if (listZzaA.isEmpty()) {
            return 1;
        }
        if (!zzY(zzafvVar)) {
            return 2;
        }
        zzfo zzfoVar = listZzaA.get(0);
        boolean zZzc = zzfoVar.zzc(zzafvVar);
        int i2 = true != zzfoVar.zzd(zzafvVar) ? 8 : 16;
        if (zZzc) {
            List<zzfo> listZzaA2 = zzaA(zzfsVar, zzafvVar, z, true);
            if (!listZzaA2.isEmpty()) {
                zzfo zzfoVar2 = listZzaA2.get(0);
                if (zzfoVar2.zzc(zzafvVar) && zzfoVar2.zzd(zzafvVar)) {
                    i = 32;
                }
            }
        }
        return (true != zZzc ? 3 : 4) | i2 | i;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final List<zzfo> zze(zzfs zzfsVar, zzafv zzafvVar, boolean z) throws zzfy {
        return zzaA(zzfsVar, zzafvVar, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0139  */
    /* JADX WARN: Code duplicated, block: B:73:0x017c  */
    @Override // com.google.android.gms.internal.ads.zzfq
    protected final zzfl zzg(zzfo zzfoVar, zzafv zzafvVar, MediaCrypto mediaCrypto, float f) {
        String str;
        zzly zzlyVar;
        int i;
        String str2;
        Point point;
        Pair<Integer, Integer> pairZzf;
        int iZzaF;
        zzlu zzluVar = this.zzm;
        if (zzluVar != null && zzluVar.zza != zzfoVar.zzf) {
            zzluVar.release();
            this.zzm = null;
        }
        String str3 = zzfoVar.zzc;
        zzafv[] zzafvVarArrZzau = zzau();
        int iMax = zzafvVar.zzq;
        int iMax2 = zzafvVar.zzr;
        int iZzy = zzy(zzfoVar, zzafvVar);
        int length = zzafvVarArrZzau.length;
        if (length == 1) {
            if (iZzy != -1 && (iZzaF = zzaF(zzfoVar, zzafvVar)) != -1) {
                iZzy = Math.min((int) (iZzy * 1.5f), iZzaF);
            }
            zzlyVar = new zzly(iMax, iMax2, iZzy);
            str = str3;
        } else {
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                zzafv zzafvVarZzah = zzafvVarArrZzau[i2];
                if (zzafvVar.zzx != null && zzafvVarZzah.zzx == null) {
                    zzaft zzaftVarZza = zzafvVarZzah.zza();
                    zzaftVarZza.zzZ(zzafvVar.zzx);
                    zzafvVarZzah = zzaftVarZza.zzah();
                }
                if (zzfoVar.zze(zzafvVar, zzafvVarZzah).zzd != 0) {
                    int i3 = zzafvVarZzah.zzq;
                    z |= i3 == -1 || zzafvVarZzah.zzr == -1;
                    iMax = Math.max(iMax, i3);
                    iMax2 = Math.max(iMax2, zzafvVarZzah.zzr);
                    iZzy = Math.max(iZzy, zzy(zzfoVar, zzafvVarZzah));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(iMax);
                sb.append("x");
                sb.append(iMax2);
                String str4 = "MediaCodecVideoRenderer";
                Log.w("MediaCodecVideoRenderer", sb.toString());
                int i4 = zzafvVar.zzr;
                int i5 = zzafvVar.zzq;
                int i6 = i4 > i5 ? i4 : i5;
                int i7 = i4 <= i5 ? i4 : i5;
                float f2 = i7 / i6;
                int[] iArr = zzb;
                str = str3;
                int i8 = 0;
                while (true) {
                    if (i8 < 9) {
                        int i9 = iArr[i8];
                        int[] iArr2 = iArr;
                        int i10 = (int) (i9 * f2);
                        if (i9 > i6 && i10 > i7) {
                            int i11 = i6;
                            int i12 = i7;
                            if (zzamq.zza >= 21) {
                                int i13 = i4 <= i5 ? i9 : i10;
                                if (i4 <= i5) {
                                    i9 = i10;
                                }
                                point = zzfoVar.zzg(i13, i9);
                                i = iZzy;
                                str2 = str4;
                                if (!zzfoVar.zzf(point.x, point.y, zzafvVar.zzs)) {
                                    i8++;
                                    iArr = iArr2;
                                    i6 = i11;
                                    i7 = i12;
                                    iZzy = i;
                                    str4 = str2;
                                }
                            } else {
                                i = iZzy;
                                str2 = str4;
                                try {
                                    int iZzw = zzamq.zzw(i9, 16) * 16;
                                    int iZzw2 = zzamq.zzw(i10, 16) * 16;
                                    if (iZzw * iZzw2 <= zzge.zze()) {
                                        int i14 = i4 <= i5 ? iZzw : iZzw2;
                                        if (i4 <= i5) {
                                            iZzw = iZzw2;
                                        }
                                        point = new Point(i14, iZzw);
                                    } else {
                                        i8++;
                                        iArr = iArr2;
                                        i6 = i11;
                                        i7 = i12;
                                        iZzy = i;
                                        str4 = str2;
                                    }
                                } catch (zzfy unused) {
                                    point = null;
                                }
                            }
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            zzaft zzaftVarZza2 = zzafvVar.zza();
                            zzaftVarZza2.zzS(iMax);
                            zzaftVarZza2.zzT(iMax2);
                            iZzy = Math.max(i, zzaF(zzfoVar, zzaftVarZza2.zzah()));
                            StringBuilder sb2 = new StringBuilder(57);
                            sb2.append("Codec max resolution adjusted to: ");
                            sb2.append(iMax);
                            sb2.append("x");
                            sb2.append(iMax2);
                            Log.w(str2, sb2.toString());
                        } else {
                            iZzy = i;
                        }
                    }
                    i = iZzy;
                    str2 = str4;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        zzaft zzaftVarZza3 = zzafvVar.zza();
                        zzaftVarZza3.zzS(iMax);
                        zzaftVarZza3.zzT(iMax2);
                        iZzy = Math.max(i, zzaF(zzfoVar, zzaftVarZza3.zzah()));
                        StringBuilder sb3 = new StringBuilder(57);
                        sb3.append("Codec max resolution adjusted to: ");
                        sb3.append(iMax);
                        sb3.append("x");
                        sb3.append(iMax2);
                        Log.w(str2, sb3.toString());
                    } else {
                        iZzy = i;
                    }
                }
            } else {
                str = str3;
            }
            zzlyVar = new zzly(iMax, iMax2, iZzy);
        }
        this.zzi = zzlyVar;
        boolean z2 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzafvVar.zzq);
        mediaFormat.setInteger("height", zzafvVar.zzr);
        zzalq.zza(mediaFormat, zzafvVar.zzn);
        float f3 = zzafvVar.zzs;
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        zzalq.zzb(mediaFormat, "rotation-degrees", zzafvVar.zzt);
        zzj zzjVar = zzafvVar.zzx;
        if (zzjVar != null) {
            zzalq.zzb(mediaFormat, "color-transfer", zzjVar.zzc);
            zzalq.zzb(mediaFormat, "color-standard", zzjVar.zza);
            zzalq.zzb(mediaFormat, "color-range", zzjVar.zzb);
            byte[] bArr = zzjVar.zzd;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzafvVar.zzl) && (pairZzf = zzge.zzf(zzafvVar)) != null) {
            zzalq.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZzf.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzlyVar.zza);
        mediaFormat.setInteger("max-height", zzlyVar.zzb);
        zzalq.zzb(mediaFormat, "max-input-size", zzlyVar.zzc);
        if (zzamq.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z2) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.zzl == null) {
            if (!zzaB(zzfoVar)) {
                throw new IllegalStateException();
            }
            if (this.zzm == null) {
                this.zzm = zzlu.zzb(this.zze, zzfoVar.zzf);
            }
            this.zzl = this.zzm;
        }
        return zzfl.zzb(zzfoVar, mediaFormat, zzafvVar, this.zzl, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final zzba zzh(zzfo zzfoVar, zzafv zzafvVar, zzafv zzafvVar2) {
        int i;
        int i2;
        zzba zzbaVarZze = zzfoVar.zze(zzafvVar, zzafvVar2);
        int i3 = zzbaVarZze.zze;
        int i4 = zzafvVar2.zzq;
        zzly zzlyVar = this.zzi;
        if (i4 > zzlyVar.zza || zzafvVar2.zzr > zzlyVar.zzb) {
            i3 |= 256;
        }
        if (zzy(zzfoVar, zzafvVar2) > this.zzi.zzc) {
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

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final float zzj(float f, zzafv zzafvVar, zzafv[] zzafvVarArr) {
        float fMax = -1.0f;
        for (zzafv zzafvVar2 : zzafvVarArr) {
            float f2 = zzafvVar2.zzs;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzk(String str, long j, long j2) {
        this.zzg.zzb(str, j, j2);
        this.zzj = zzab(str);
        zzfo zzfoVarZzK = zzK();
        zzfoVarZzK.getClass();
        boolean z = false;
        if (zzamq.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzfoVarZzK.zzb)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzfoVarZzK.zzb()) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.zzk = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzl(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzm(Exception exc) {
        zzaln.zzb("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final zzba zzn(zzafw zzafwVar) throws zzaeg {
        zzba zzbaVarZzn = super.zzn(zzafwVar);
        this.zzg.zzc(zzafwVar.zza, zzbaVarZzn);
        return zzbaVarZzn;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzo(zzafv zzafvVar, MediaFormat mediaFormat) {
        zzgh zzghVarZzZ = zzZ();
        if (zzghVarZzZ != null) {
            zzghVarZzZ.zzn(this.zzo);
        }
        mediaFormat.getClass();
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        this.zzC = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        this.zzD = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.zzF = zzafvVar.zzu;
        if (zzamq.zza >= 21) {
            int i = zzafvVar.zzt;
            if (i == 90 || i == 270) {
                int i2 = this.zzC;
                this.zzC = this.zzD;
                this.zzD = i2;
                this.zzF = 1.0f / this.zzF;
            }
        } else {
            this.zzE = zzafvVar.zzt;
        }
        this.zzf.zzg(zzafvVar.zzs);
    }

    final void zzp() {
        this.zzr = true;
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        this.zzg.zzg(this.zzl);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    protected final void zzq(boolean z, boolean z2) throws zzaeg {
        super.zzq(z, z2);
        zzav();
        this.zzg.zza(this.zza);
        this.zzf.zzb();
        this.zzq = z2;
        this.zzr = false;
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    protected final void zzr(long j, boolean z) throws zzaeg {
        super.zzr(j, z);
        this.zzp = false;
        int i = zzamq.zza;
        this.zzf.zze();
        this.zzy = -9223372036854775807L;
        this.zzs = -9223372036854775807L;
        this.zzw = 0;
        this.zzt = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    protected final void zzs() {
        this.zzv = 0;
        this.zzu = SystemClock.elapsedRealtime();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zzA = 0L;
        this.zzB = 0;
        this.zzf.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    protected final void zzt() {
        this.zzt = -9223372036854775807L;
        if (this.zzv > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzv, jElapsedRealtime - this.zzu);
            this.zzv = 0;
            this.zzu = jElapsedRealtime;
        }
        int i = this.zzB;
        if (i != 0) {
            this.zzg.zze(this.zzA, i);
            this.zzA = 0L;
            this.zzB = 0;
        }
        this.zzf.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    protected final void zzu() {
        this.zzG = null;
        this.zzp = false;
        int i = zzamq.zza;
        this.zzn = false;
        this.zzf.zzj();
        try {
            super.zzu();
        } finally {
            this.zzg.zzi(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    protected final void zzv() {
        try {
            super.zzv();
        } finally {
            zzlu zzluVar = this.zzm;
            if (zzluVar != null) {
                if (this.zzl == zzluVar) {
                    this.zzl = null;
                }
                zzluVar.release();
                this.zzm = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzahv
    public final boolean zzx() {
        zzlu zzluVar;
        if (super.zzx() && (this.zzp || (((zzluVar = this.zzm) != null && this.zzl == zzluVar) || zzZ() == null))) {
            this.zzt = -9223372036854775807L;
            return true;
        }
        if (this.zzt == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.zzt) {
            return true;
        }
        this.zzt = -9223372036854775807L;
        return false;
    }

    protected final void zzz(zzgh zzghVar, int i, long j) {
        zzamo.zza("skipVideoBuffer");
        zzghVar.zzh(i, false);
        zzamo.zzb();
        this.zza.zzf++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzgh] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.google.android.gms.internal.ads.zzmi] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.google.android.gms.internal.ads.zzlu] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahr
    public final void zzE(int i, Object obj) throws Throwable {
        ?? Zzb;
        Surface surface;
        if (i != 1) {
            if (i == 7) {
                this.zzI = (zzma) obj;
                return;
            }
            if (i == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.zzH != iIntValue) {
                    this.zzH = iIntValue;
                    return;
                }
                return;
            }
            if (i != 4) {
                if (i != 5) {
                    return;
                }
                this.zzf.zza(((Integer) obj).intValue());
                return;
            } else {
                this.zzo = ((Integer) obj).intValue();
                zzgh zzghVarZzZ = zzZ();
                if (zzghVarZzZ != null) {
                    zzghVarZzZ.zzn(this.zzo);
                    return;
                }
                return;
            }
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            Zzb = 0;
        }
        if (Zzb == 0) {
            zzlu zzluVar = this.zzm;
            if (zzluVar != null) {
                Zzb = surface;
                Zzb = zzluVar;
            } else {
                zzfo zzfoVarZzK = zzK();
                if (zzfoVarZzK != null && zzaB(zzfoVarZzK)) {
                    Zzb = surface;
                    Zzb = zzlu.zzb(this.zze, zzfoVarZzK.zzf);
                    this.zzm = Zzb;
                }
            }
        }
        Zzb = surface;
        Zzb = surface;
        Zzb = surface;
        if (this.zzl == Zzb) {
            if (Zzb == 0 || Zzb == this.zzm) {
                return;
            }
            zzaD();
            if (this.zzn) {
                this.zzg.zzg(this.zzl);
                return;
            }
            return;
        }
        this.zzl = Zzb;
        this.zzf.zzd(Zzb);
        this.zzn = false;
        int iZzaf = zzaf();
        ?? ZzZ = zzZ();
        if (ZzZ != 0) {
            if (zzamq.zza < 23 || Zzb == 0 || this.zzj) {
                zzN();
                zzI();
            } else {
                ZzZ.zzl(Zzb);
            }
        }
        if (Zzb == 0 || Zzb == this.zzm) {
            this.zzG = null;
            this.zzp = false;
            int i2 = zzamq.zza;
        } else {
            zzaD();
            this.zzp = false;
            int i3 = zzamq.zza;
            if (iZzaf == 2) {
                this.zzt = -9223372036854775807L;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a0, code lost:
    
        if (r16 > 100000) goto L46;
     */
    @Override // com.google.android.gms.internal.ads.zzfq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean zzF(long r23, long r25, com.google.android.gms.internal.ads.zzgh r27, java.nio.ByteBuffer r28, int r29, int r30, int r31, long r32, boolean r34, boolean r35, com.google.android.gms.internal.ads.zzafv r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlz.zzF(long, long, com.google.android.gms.internal.ads.zzgh, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.gms.internal.ads.zzafv):boolean");
    }
}
