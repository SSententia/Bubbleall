package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.p000pm.PackageManager$OnChecksumsReadyListener;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import com.android.billingclient.api.zzn$$ExternalSyntheticApiModelOutline0;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzadc {
    /* JADX WARN: Multi-variable type inference failed */
    public static String zza(Context context, String str, List<Certificate> list, Executor executor) throws ExecutionException, InterruptedException, PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        final zzfsu zzfsuVarZza = zzfsu.zza();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager$OnChecksumsReadyListener(zzfsuVarZza) { // from class: com.google.android.gms.internal.ads.zzadb
            private final zzfsu zza;

            {
                this.zza = zzfsuVarZza;
            }

            public final void onChecksumsReady(List list2) {
                zzfsu zzfsuVar = this.zza;
                if (list2 == null) {
                    zzfsuVar.zzp(null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ApkChecksum apkChecksumM357m = zzn$$ExternalSyntheticApiModelOutline0.m357m(list2.get(i));
                        if (apkChecksumM357m.getType() == 8) {
                            zzfsuVar.zzp(zzabu.zzb(apkChecksumM357m.getValue()));
                            return;
                        }
                    }
                    zzfsuVar.zzp(null);
                } catch (Throwable unused) {
                    zzfsuVar.zzp(null);
                }
            }
        });
        return (String) zzfsuVarZza.get();
    }
}
