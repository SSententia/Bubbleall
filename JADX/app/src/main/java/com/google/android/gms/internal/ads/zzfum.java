package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfum {
    private static final Logger zza = Logger.getLogger(zzfum.class.getName());
    private static final ConcurrentMap<String, zzful> zzb = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzfuk> zzc = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzfth<?>> zze = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, zzfue<?, ?>> zzf = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzftp> zzg = new ConcurrentHashMap();

    private zzfum() {
    }

    @Deprecated
    public static zzfth<?> zza(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        zzfth<?> zzfthVar = zze.get(str.toLowerCase(Locale.US));
        if (zzfthVar != null) {
            return zzfthVar;
        }
        String strConcat = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(Locale.US).startsWith("tinkaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(Locale.US).startsWith("tinkdeterministicaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkstreamingaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkhybriddecrypt") || str.toLowerCase(Locale.US).startsWith("tinkhybridencrypt")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkmac")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkpublickeysign") || str.toLowerCase(Locale.US).startsWith("tinkpublickeyverify")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tink")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(strConcat);
    }

    public static synchronized <KeyProtoT extends zzghi> void zzc(zzftu<KeyProtoT> zzftuVar, boolean z) throws GeneralSecurityException {
        String strZzb = zzftuVar.zzb();
        zzp(strZzb, zzftuVar.getClass(), zzftuVar.zzh().zze(), true);
        if (!zzfvw.zza(zzftuVar.zzj())) {
            String strValueOf = String.valueOf(zzftuVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 61);
            sb.append("failed to register key manager ");
            sb.append(strValueOf);
            sb.append(" as it is not FIPS compatible.");
            throw new GeneralSecurityException(sb.toString());
        }
        ConcurrentMap<String, zzful> concurrentMap = zzb;
        if (!concurrentMap.containsKey(strZzb)) {
            concurrentMap.put(strZzb, new zzfui(zzftuVar));
            zzc.put(strZzb, new zzfuk(zzftuVar));
            zzq(strZzb, zzftuVar.zzh().zze());
        }
        zzd.put(strZzb, true);
    }

    public static synchronized <KeyProtoT extends zzghi, PublicKeyProtoT extends zzghi> void zzd(zzfug<KeyProtoT, PublicKeyProtoT> zzfugVar, zzftu<PublicKeyProtoT> zzftuVar, boolean z) throws GeneralSecurityException {
        Class<?> clsZze;
        zzp("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", zzfugVar.getClass(), zzfugVar.zzh().zze(), true);
        zzp("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzftuVar.getClass(), Collections.emptyMap(), false);
        if (!zzfvw.zza(1)) {
            String strValueOf = String.valueOf(zzfugVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 61);
            sb.append("failed to register key manager ");
            sb.append(strValueOf);
            sb.append(" as it is not FIPS compatible.");
            throw new GeneralSecurityException(sb.toString());
        }
        if (!zzfvw.zza(1)) {
            String strValueOf2 = String.valueOf(zzftuVar.getClass());
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 61);
            sb2.append("failed to register key manager ");
            sb2.append(strValueOf2);
            sb2.append(" as it is not FIPS compatible.");
            throw new GeneralSecurityException(sb2.toString());
        }
        ConcurrentMap<String, zzful> concurrentMap = zzb;
        if (concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (clsZze = concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zze()) != null && !clsZze.getName().equals(zzftuVar.getClass().getName())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", zzfugVar.getClass().getName(), clsZze.getName(), zzftuVar.getClass().getName()));
        }
        if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zze() == null) {
            concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new zzfuj(zzfugVar, zzftuVar));
            zzc.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new zzfuk(zzfugVar));
            zzq("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", zzfugVar.zzh().zze());
        }
        ConcurrentMap<String, Boolean> concurrentMap2 = zzd;
        concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", true);
        if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new zzfui(zzftuVar));
        }
        concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", false);
    }

    public static synchronized <B, P> void zze(zzfue<B, P> zzfueVar) throws GeneralSecurityException {
        try {
            if (zzfueVar == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> clsZzb = zzfueVar.zzb();
            ConcurrentMap<Class<?>, zzfue<?, ?>> concurrentMap = zzf;
            if (concurrentMap.containsKey(clsZzb)) {
                zzfue<?, ?> zzfueVar2 = concurrentMap.get(clsZzb);
                if (!zzfueVar.getClass().getName().equals(zzfueVar2.getClass().getName())) {
                    zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(clsZzb.toString()));
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", clsZzb.getName(), zzfueVar2.getClass().getName(), zzfueVar.getClass().getName()));
                }
            }
            concurrentMap.put(clsZzb, zzfueVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static zzftm<?> zzf(String str) throws GeneralSecurityException {
        return zzo(str).zzb();
    }

    public static synchronized zzgar zzg(zzgau zzgauVar) throws GeneralSecurityException {
        zzftm<?> zzftmVarZzf;
        zzftmVarZzf = zzf(zzgauVar.zza());
        if (!zzd.get(zzgauVar.zza()).booleanValue()) {
            String strValueOf = String.valueOf(zzgauVar.zza());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        return zzftmVarZzf.zzf(zzgauVar.zzc());
    }

    public static synchronized zzghi zzh(zzgau zzgauVar) throws GeneralSecurityException {
        zzftm<?> zzftmVarZzf;
        zzftmVarZzf = zzf(zzgauVar.zza());
        if (!zzd.get(zzgauVar.zza()).booleanValue()) {
            String strValueOf = String.valueOf(zzgauVar.zza());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        return zzftmVarZzf.zzc(zzgauVar.zzc());
    }

    public static <P> P zzi(String str, zzghi zzghiVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zzr(str, cls).zzb(zzghiVar);
    }

    public static <P> P zzj(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) zzs(str, zzgex.zzt(bArr), cls);
    }

    public static <P> P zzk(zzgar zzgarVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zzs(zzgarVar.zza(), zzgarVar.zzc(), cls);
    }

    public static <B, P> P zzl(zzfud<B> zzfudVar, Class<P> cls) throws GeneralSecurityException {
        zzfue<?, ?> zzfueVar = zzf.get(cls);
        if (zzfueVar == null) {
            String strValueOf = String.valueOf(zzfudVar.zze().getName());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "No wrapper found for ".concat(strValueOf) : new String("No wrapper found for "));
        }
        if (zzfueVar.zzc().equals(zzfudVar.zze())) {
            return (P) zzfueVar.zza(zzfudVar);
        }
        String string = zzfueVar.zzc().toString();
        String string2 = zzfudVar.zze().toString();
        StringBuilder sb = new StringBuilder(string.length() + 44 + string2.length());
        sb.append("Wrong input primitive class, expected ");
        sb.append(string);
        sb.append(", got ");
        sb.append(string2);
        throw new GeneralSecurityException(sb.toString());
    }

    static synchronized Map<String, zzftp> zzm() {
        return Collections.unmodifiableMap(zzg);
    }

    public static Class<?> zzn(Class<?> cls) {
        zzfue<?, ?> zzfueVar = zzf.get(cls);
        if (zzfueVar == null) {
            return null;
        }
        return zzfueVar.zzc();
    }

    private static synchronized zzful zzo(String str) throws GeneralSecurityException {
        ConcurrentMap<String, zzful> concurrentMap;
        concurrentMap = zzb;
        if (!concurrentMap.containsKey(str)) {
            String strValueOf = String.valueOf(str);
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "No key manager found for key type ".concat(strValueOf) : new String("No key manager found for key type "));
        }
        return concurrentMap.get(str);
    }

    private static synchronized <KeyProtoT extends zzghi, KeyFormatProtoT extends zzghi> void zzp(String str, Class cls, Map<String, zzftr<KeyFormatProtoT>> map, boolean z) throws GeneralSecurityException {
        ConcurrentMap<String, zzful> concurrentMap = zzb;
        zzful zzfulVar = concurrentMap.get(str);
        if (zzfulVar != null && !zzfulVar.zzc().equals(cls)) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(str) : new String("Attempted overwrite of a registered key manager for key type "));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzfulVar.zzc().getName(), cls.getName()));
        }
        if (z) {
            ConcurrentMap<String, Boolean> concurrentMap2 = zzd;
            if (concurrentMap2.containsKey(str) && !concurrentMap2.get(str).booleanValue()) {
                throw new GeneralSecurityException(str.length() != 0 ? "New keys are already disallowed for key type ".concat(str) : new String("New keys are already disallowed for key type "));
            }
            if (concurrentMap.containsKey(str)) {
                for (Map.Entry<String, zzftr<KeyFormatProtoT>> entry : map.entrySet()) {
                    if (!zzg.containsKey(entry.getKey())) {
                        String key = entry.getKey();
                        StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 79 + str.length());
                        sb.append("Attempted to register a new key template ");
                        sb.append(key);
                        sb.append(" from an existing key manager of type ");
                        sb.append(str);
                        throw new GeneralSecurityException(sb.toString());
                    }
                }
            } else {
                for (Map.Entry<String, zzftr<KeyFormatProtoT>> entry2 : map.entrySet()) {
                    if (zzg.containsKey(entry2.getKey())) {
                        String strValueOf = String.valueOf(entry2.getKey());
                        throw new GeneralSecurityException(strValueOf.length() != 0 ? "Attempted overwrite of a registered key template ".concat(strValueOf) : new String("Attempted overwrite of a registered key template "));
                    }
                }
            }
        }
    }

    private static <KeyFormatProtoT extends zzghi> void zzq(String str, Map<String, zzftr<KeyFormatProtoT>> map) {
        for (Map.Entry<String, zzftr<KeyFormatProtoT>> entry : map.entrySet()) {
            zzg.put(entry.getKey(), zzftp.zzc(str, entry.getValue().zza.zzao(), entry.getValue().zzb));
        }
    }

    private static <P> zzftm<P> zzr(String str, Class<P> cls) throws GeneralSecurityException {
        zzful zzfulVarZzo = zzo(str);
        if (zzfulVarZzo.zzd().contains(cls)) {
            return zzfulVarZzo.zza(cls);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzfulVarZzo.zzc());
        Set<Class<?>> setZzd = zzfulVarZzo.zzd();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls2 : setZzd) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(strValueOf).length() + string.length());
        sb2.append("Primitive type ");
        sb2.append(name);
        sb2.append(" not supported by key manager of type ");
        sb2.append(strValueOf);
        sb2.append(", supported primitives: ");
        sb2.append(string);
        throw new GeneralSecurityException(sb2.toString());
    }

    private static <P> P zzs(String str, zzgex zzgexVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zzr(str, cls).zza(zzgexVar);
    }

    public static synchronized <P> void zzb(zzftm<P> zzftmVar, boolean z) throws GeneralSecurityException {
        try {
            if (zzftmVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String strZzd = zzftmVar.zzd();
            zzp(strZzd, zzftmVar.getClass(), Collections.emptyMap(), z);
            zzb.putIfAbsent(strZzd, new zzfuh(zzftmVar));
            zzd.put(strZzd, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }
}
