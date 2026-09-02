package com.google.android.gms.internal.measurement;

import androidx.media2.widget.Cea708CCParser;
import java.io.PrintStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzga {
    static final zzfu zza;

    static {
        zzfu zzfyVar;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(System.err);
            }
            if (num == null || num.intValue() < 19) {
                zzfyVar = !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new zzfx() : new zzfy();
            } else {
                zzfyVar = new zzfz();
            }
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = zzfy.class.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + Cea708CCParser.Const.CODE_C1_CW5);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            zzfyVar = new zzfy();
        }
        zza = zzfyVar;
        if (num == null) {
            return;
        }
        num.intValue();
    }

    public static void zza(Throwable th, Throwable th2) {
        zza.zza(th, th2);
    }
}
