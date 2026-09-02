package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhn;
import com.google.android.gms.internal.measurement.zzhr;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public class zzhn<MessageType extends zzhr<MessageType, BuilderType>, BuilderType extends zzhn<MessageType, BuilderType>> extends zzgb<MessageType, BuilderType> {
    protected MessageType zza;
    protected boolean zzb = false;
    private final MessageType zzc;

    protected zzhn(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (MessageType) messagetype.zzl(4, null, null);
    }

    private static final void zza(MessageType messagetype, MessageType messagetype2) {
        zzje.zza().zzb(messagetype.getClass()).zzd(messagetype, messagetype2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r4 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final MessageType zzaA() {
        /*
            r6 = this;
            com.google.android.gms.internal.measurement.zzhr r0 = r6.zzaD()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = r1.booleanValue()
            r2 = 1
            r3 = 0
            java.lang.Object r4 = r0.zzl(r2, r3, r3)
            java.lang.Byte r4 = (java.lang.Byte) r4
            byte r4 = r4.byteValue()
            if (r4 != r2) goto L19
            goto L38
        L19:
            if (r4 == 0) goto L39
            com.google.android.gms.internal.measurement.zzje r4 = com.google.android.gms.internal.measurement.zzje.zza()
            java.lang.Class r5 = r0.getClass()
            com.google.android.gms.internal.measurement.zzjh r4 = r4.zzb(r5)
            boolean r4 = r4.zzj(r0)
            if (r1 == 0) goto L36
            if (r2 == r4) goto L31
            r1 = r3
            goto L32
        L31:
            r1 = r0
        L32:
            r2 = 2
            r0.zzl(r2, r1, r3)
        L36:
            if (r4 == 0) goto L39
        L38:
            return r0
        L39:
            com.google.android.gms.internal.measurement.zzju r1 = new com.google.android.gms.internal.measurement.zzju
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhn.zzaA():com.google.android.gms.internal.measurement.zzhr");
    }

    public final BuilderType zzaB(MessageType messagetype) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zza(this.zza, messagetype);
        return this;
    }

    public final BuilderType zzaC(byte[] bArr, int i, int i2, zzhd zzhdVar) throws zzib {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        try {
            zzje.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i2, new zzgf(zzhdVar));
            return this;
        } catch (zzib e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzib.zza();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgb
    public final /* bridge */ /* synthetic */ zzgb zzar(byte[] bArr, int i, int i2) throws zzib {
        zzaC(bArr, 0, i2, zzhd.zza());
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzgb
    public final /* bridge */ /* synthetic */ zzgb zzas(byte[] bArr, int i, int i2, zzhd zzhdVar) throws zzib {
        zzaC(bArr, 0, i2, zzhdVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzgb
    protected final /* bridge */ /* synthetic */ zzgb zzat(zzgc zzgcVar) {
        zzaB((zzhr) zzgcVar);
        return this;
    }

    protected void zzax() {
        MessageType messagetype = (MessageType) this.zza.zzl(4, null, null);
        zza(messagetype, this.zza);
        this.zza = messagetype;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzgb
    /* JADX INFO: renamed from: zzay, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final BuilderType zzaq() {
        BuilderType buildertype = (BuilderType) this.zzc.zzl(5, null, null);
        buildertype.zzaB(zzaD());
        return buildertype;
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    /* JADX INFO: renamed from: zzaz, reason: merged with bridge method [inline-methods] */
    public MessageType zzaD() {
        if (this.zzb) {
            return this.zza;
        }
        MessageType messagetype = this.zza;
        zzje.zza().zzb(messagetype.getClass()).zzi(messagetype);
        this.zzb = true;
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final /* bridge */ /* synthetic */ zziw zzbK() {
        return this.zzc;
    }
}
