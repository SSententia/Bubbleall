package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfjk {
    public static boolean zza(int i) {
        int i2 = i - 1;
        return i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x0107  */
    /* JADX WARN: Code duplicated, block: B:71:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0112  */
    /* JADX WARN: Code duplicated, block: B:76:0x0115  */
    /* JADX WARN: Code duplicated, block: B:77:0x0118  */
    /* JADX WARN: Code duplicated, block: B:78:0x011b  */
    /* JADX WARN: Code duplicated, block: B:79:0x011e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0121  */
    public static final int zzb(Context context, zzfii zzfiiVar) {
        int i;
        String str;
        String strZzd;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new zzfqp(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                zzfiiVar.zze(5017, "No .so");
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                zzc(bArr, null, context, zzfiiVar);
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s = ByteBuffer.wrap(bArr2).getShort();
                                if (s == 3) {
                                    fileInputStream.close();
                                    i = 5;
                                } else if (s == 40) {
                                    fileInputStream.close();
                                    i = 3;
                                } else if (s == 62) {
                                    fileInputStream.close();
                                    i = 7;
                                } else if (s != 183) {
                                    zzc(bArr, null, context, zzfiiVar);
                                } else {
                                    fileInputStream.close();
                                    i = 6;
                                }
                            }
                        }
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            zzged.zza(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    zzc(null, e.toString(), context, zzfiiVar);
                }
                i = 1;
            }
            if (i == 1000) {
                strZzd = zzd(context, zzfiiVar);
                if (TextUtils.isEmpty(strZzd)) {
                    zzc(null, "Empty dev arch", context, zzfiiVar);
                } else if (!strZzd.equalsIgnoreCase("i686") || strZzd.equalsIgnoreCase("x86")) {
                    i = 5;
                } else if (strZzd.equalsIgnoreCase("x86_64")) {
                    i = 7;
                } else if (strZzd.equalsIgnoreCase("arm64-v8a")) {
                    i = 6;
                } else if (strZzd.equalsIgnoreCase("armeabi-v7a") || strZzd.equalsIgnoreCase("armv71")) {
                    i = 3;
                } else {
                    zzc(null, strZzd, context, zzfiiVar);
                }
                i = 1;
            }
            if (i != 1) {
                str = "UNSUPPORTED";
            } else if (i != 3) {
                str = "ARM7";
            } else if (i != 5) {
                str = "X86";
            } else if (i != 6) {
                str = "ARM64";
            } else if (i != 7) {
                str = "null";
            } else {
                str = "X86_64";
            }
            zzfiiVar.zze(5018, str);
            return i;
        }
        zzfiiVar.zze(5017, "No lib/");
        i = 1000;
        if (i == 1000) {
            strZzd = zzd(context, zzfiiVar);
            if (TextUtils.isEmpty(strZzd)) {
                zzc(null, "Empty dev arch", context, zzfiiVar);
            } else if (strZzd.equalsIgnoreCase("i686")) {
                i = 5;
            } else {
                i = 5;
            }
            i = 1;
        }
        if (i != 1) {
            str = "UNSUPPORTED";
        } else if (i != 3) {
            str = "ARM7";
        } else if (i != 5) {
            str = "X86";
        } else if (i != 6) {
            str = "ARM64";
        } else if (i != 7) {
            str = "null";
        } else {
            str = "X86_64";
        }
        zzfiiVar.zze(5018, str);
        return i;
    }

    private static final void zzc(byte[] bArr, String str, Context context, zzfii zzfiiVar) {
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(zzfmh.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfiiVar.zze(4007, sb.toString());
    }

    private static final String zzd(Context context, zzfii zzfiiVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strZza = zzfmh.OS_ARCH.zza();
        if (!TextUtils.isEmpty(strZza) && hashSet.contains(strZza)) {
            return strZza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e) {
            zzfiiVar.zzc(2024, 0L, e);
        } catch (NoSuchFieldException e2) {
            zzfiiVar.zzc(2024, 0L, e2);
        }
        return Build.CPU_ABI != null ? Build.CPU_ABI : Build.CPU_ABI2;
    }
}
