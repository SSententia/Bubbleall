package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzacc extends zzacz {
    private static final zzada<zzzp> zzi = new zzada<>();
    private final Context zzj;

    public zzacc(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i, int i2, Context context, zzyc zzycVar) {
        super(zzabrVar, "NK1iwlHEHCICBCLEvTy0TnuhgEeSXovnPs9zKPvVW8trSfaaB+/inefY+5AxSSUI", "/qulcnd5BAOc2NixUFmrPgx+DAD1V/hpoK4nowHOBbg=", zzyjVar, i, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzo() != null) {
                this.zzb.zzo().get();
            }
            zzyz zzyzVarZzn = this.zzb.zzn();
            if (zzyzVarZzn == null || !zzyzVarZzn.zza()) {
                return null;
            }
            return zzyzVarZzn.zzc();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzzp zzzpVar;
        AtomicReference<zzzp> atomicReferenceZza = zzi.zza(this.zzj.getPackageName());
        synchronized (atomicReferenceZza) {
            zzzp zzzpVar2 = atomicReferenceZza.get();
            if (zzzpVar2 == null || zzabu.zze(zzzpVar2.zza) || zzzpVar2.zza.equals("E") || zzzpVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzabu.zze(null)) {
                    i = ((!zzabu.zze(null) ? false : false).booleanValue() && this.zzb.zzk()) ? 4 : 3;
                } else {
                    i = 5;
                }
                Boolean boolValueOf = Boolean.valueOf(i == 3);
                Boolean bool = (Boolean) zzbet.zzc().zzc(zzbjl.zzbB);
                String strZzb = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbA)).booleanValue() ? zzb() : null;
                if (bool.booleanValue() && this.zzb.zzk() && zzabu.zze(strZzb)) {
                    strZzb = zzc();
                }
                zzzp zzzpVar3 = new zzzp((String) this.zzf.invoke(null, this.zzj, boolValueOf, strZzb));
                if (zzabu.zze(zzzpVar3.zza) || zzzpVar3.zza.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String strZzc = zzc();
                        if (!zzabu.zze(strZzc)) {
                            zzzpVar3.zza = strZzc;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                atomicReferenceZza.set(zzzpVar3);
            }
            zzzpVar = atomicReferenceZza.get();
        }
        synchronized (this.zze) {
            if (zzzpVar != null) {
                this.zze.zzo(zzzpVar.zza);
                this.zze.zzu(zzzpVar.zzb);
                this.zze.zzt(zzzpVar.zzc);
                this.zze.zzD(zzzpVar.zzd);
                this.zze.zzE(zzzpVar.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrZzc = zzabu.zzc((String) zzbet.zzc().zzc(zzbjl.zzbC));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzc)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzabu.zzc((String) zzbet.zzc().zzc(zzbjl.zzbD)))));
            }
            Context context = this.zzj;
            return zzadc.zza(context, context.getPackageName(), arrayList, this.zzb.zze());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
