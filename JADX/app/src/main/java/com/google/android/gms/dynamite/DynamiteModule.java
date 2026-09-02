package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.media2.widget.Cea708CCParser;
import com.android.billingclient.api.zzn$$ExternalSyntheticApiModelOutline0;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {
    public static final int LOCAL = -1;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final int REMOTE = 1;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static zzq zzk;
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    public static final VersionPolicy zza = new zzl();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public interface VersionPolicy {

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z) throws LoadingException;
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
        public static class SelectionResult {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    public static int getLocalVersion(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x023b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0241  */
    /* JADX WARN: Code duplicated, block: B:116:0x024a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0260 A[Catch: all -> 0x02ab, TryCatch #5 {all -> 0x02ab, blocks: (B:5:0x0035, B:120:0x0257, B:121:0x025f, B:122:0x0260, B:123:0x0276, B:124:0x0277, B:125:0x02a6), top: B:145:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x008e A[Catch: all -> 0x02a7, TRY_LEAVE, TryCatch #1 {all -> 0x02a7, blocks: (B:7:0x0052, B:11:0x0080, B:16:0x0088, B:19:0x008e, B:23:0x0097, B:97:0x01ee, B:98:0x01f9, B:100:0x01fb, B:102:0x01fd, B:103:0x0205, B:105:0x0207, B:107:0x0225, B:109:0x0233), top: B:140:0x0052, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2 A[Catch: all -> 0x01ea, TryCatch #4 {, blocks: (B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e1, B:92:0x01e9), top: B:144:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7 A[Catch: all -> 0x01ed, LoadingException -> 0x01fa, RemoteException -> 0x01fc, TRY_ENTER, TryCatch #8 {RemoteException -> 0x01fc, LoadingException -> 0x01fa, all -> 0x01ed, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00f9, B:54:0x0120, B:56:0x0128, B:57:0x012f, B:58:0x0137, B:53:0x010d, B:61:0x013a, B:62:0x013b, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:68:0x014f, B:69:0x0150, B:71:0x016f, B:73:0x0176, B:75:0x017e, B:81:0x01b7, B:83:0x01bd, B:85:0x01c6, B:86:0x01ce, B:76:0x018d, B:77:0x0195, B:79:0x0198, B:80:0x01a8, B:87:0x01cf, B:88:0x01d7, B:89:0x01d8, B:90:0x01e0, B:95:0x01ec), top: B:148:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae A[Catch: all -> 0x01ed, LoadingException -> 0x01fa, RemoteException -> 0x01fc, TryCatch #8 {RemoteException -> 0x01fc, LoadingException -> 0x01fa, all -> 0x01ed, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00f9, B:54:0x0120, B:56:0x0128, B:57:0x012f, B:58:0x0137, B:53:0x010d, B:61:0x013a, B:62:0x013b, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:68:0x014f, B:69:0x0150, B:71:0x016f, B:73:0x0176, B:75:0x017e, B:81:0x01b7, B:83:0x01bd, B:85:0x01c6, B:86:0x01ce, B:76:0x018d, B:77:0x0195, B:79:0x0198, B:80:0x01a8, B:87:0x01cf, B:88:0x01d7, B:89:0x01d8, B:90:0x01e0, B:95:0x01ec), top: B:148:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf A[Catch: all -> 0x01ed, LoadingException -> 0x01fa, RemoteException -> 0x01fc, TRY_ENTER, TryCatch #8 {RemoteException -> 0x01fc, LoadingException -> 0x01fa, all -> 0x01ed, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00f9, B:54:0x0120, B:56:0x0128, B:57:0x012f, B:58:0x0137, B:53:0x010d, B:61:0x013a, B:62:0x013b, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:68:0x014f, B:69:0x0150, B:71:0x016f, B:73:0x0176, B:75:0x017e, B:81:0x01b7, B:83:0x01bd, B:85:0x01c6, B:86:0x01ce, B:76:0x018d, B:77:0x0195, B:79:0x0198, B:80:0x01a8, B:87:0x01cf, B:88:0x01d7, B:89:0x01d8, B:90:0x01e0, B:95:0x01ec), top: B:148:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0144 A[Catch: all -> 0x01ed, LoadingException -> 0x01fa, RemoteException -> 0x01fc, TryCatch #8 {RemoteException -> 0x01fc, LoadingException -> 0x01fa, all -> 0x01ed, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00f9, B:54:0x0120, B:56:0x0128, B:57:0x012f, B:58:0x0137, B:53:0x010d, B:61:0x013a, B:62:0x013b, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:68:0x014f, B:69:0x0150, B:71:0x016f, B:73:0x0176, B:75:0x017e, B:81:0x01b7, B:83:0x01bd, B:85:0x01c6, B:86:0x01ce, B:76:0x018d, B:77:0x0195, B:79:0x0198, B:80:0x01a8, B:87:0x01cf, B:88:0x01d7, B:89:0x01d8, B:90:0x01e0, B:95:0x01ec), top: B:148:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0150 A[Catch: all -> 0x01ed, LoadingException -> 0x01fa, RemoteException -> 0x01fc, TryCatch #8 {RemoteException -> 0x01fc, LoadingException -> 0x01fa, all -> 0x01ed, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00f9, B:54:0x0120, B:56:0x0128, B:57:0x012f, B:58:0x0137, B:53:0x010d, B:61:0x013a, B:62:0x013b, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:68:0x014f, B:69:0x0150, B:71:0x016f, B:73:0x0176, B:75:0x017e, B:81:0x01b7, B:83:0x01bd, B:85:0x01c6, B:86:0x01ce, B:76:0x018d, B:77:0x0195, B:79:0x0198, B:80:0x01a8, B:87:0x01cf, B:88:0x01d7, B:89:0x01d8, B:90:0x01e0, B:95:0x01ec), top: B:148:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:71:0x016f A[Catch: all -> 0x01ed, LoadingException -> 0x01fa, RemoteException -> 0x01fc, TryCatch #8 {RemoteException -> 0x01fc, LoadingException -> 0x01fa, all -> 0x01ed, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00f9, B:54:0x0120, B:56:0x0128, B:57:0x012f, B:58:0x0137, B:53:0x010d, B:61:0x013a, B:62:0x013b, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:68:0x014f, B:69:0x0150, B:71:0x016f, B:73:0x0176, B:75:0x017e, B:81:0x01b7, B:83:0x01bd, B:85:0x01c6, B:86:0x01ce, B:76:0x018d, B:77:0x0195, B:79:0x0198, B:80:0x01a8, B:87:0x01cf, B:88:0x01d7, B:89:0x01d8, B:90:0x01e0, B:95:0x01ec), top: B:148:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0176 A[Catch: all -> 0x01ed, LoadingException -> 0x01fa, RemoteException -> 0x01fc, TryCatch #8 {RemoteException -> 0x01fc, LoadingException -> 0x01fa, all -> 0x01ed, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00f9, B:54:0x0120, B:56:0x0128, B:57:0x012f, B:58:0x0137, B:53:0x010d, B:61:0x013a, B:62:0x013b, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:68:0x014f, B:69:0x0150, B:71:0x016f, B:73:0x0176, B:75:0x017e, B:81:0x01b7, B:83:0x01bd, B:85:0x01c6, B:86:0x01ce, B:76:0x018d, B:77:0x0195, B:79:0x0198, B:80:0x01a8, B:87:0x01cf, B:88:0x01d7, B:89:0x01d8, B:90:0x01e0, B:95:0x01ec), top: B:148:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:75:0x017e A[Catch: all -> 0x01ed, LoadingException -> 0x01fa, RemoteException -> 0x01fc, TryCatch #8 {RemoteException -> 0x01fc, LoadingException -> 0x01fa, all -> 0x01ed, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00f9, B:54:0x0120, B:56:0x0128, B:57:0x012f, B:58:0x0137, B:53:0x010d, B:61:0x013a, B:62:0x013b, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:68:0x014f, B:69:0x0150, B:71:0x016f, B:73:0x0176, B:75:0x017e, B:81:0x01b7, B:83:0x01bd, B:85:0x01c6, B:86:0x01ce, B:76:0x018d, B:77:0x0195, B:79:0x0198, B:80:0x01a8, B:87:0x01cf, B:88:0x01d7, B:89:0x01d8, B:90:0x01e0, B:95:0x01ec), top: B:148:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:76:0x018d A[Catch: all -> 0x01ed, LoadingException -> 0x01fa, RemoteException -> 0x01fc, TryCatch #8 {RemoteException -> 0x01fc, LoadingException -> 0x01fa, all -> 0x01ed, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00f9, B:54:0x0120, B:56:0x0128, B:57:0x012f, B:58:0x0137, B:53:0x010d, B:61:0x013a, B:62:0x013b, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:68:0x014f, B:69:0x0150, B:71:0x016f, B:73:0x0176, B:75:0x017e, B:81:0x01b7, B:83:0x01bd, B:85:0x01c6, B:86:0x01ce, B:76:0x018d, B:77:0x0195, B:79:0x0198, B:80:0x01a8, B:87:0x01cf, B:88:0x01d7, B:89:0x01d8, B:90:0x01e0, B:95:0x01ec), top: B:148:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0198 A[Catch: all -> 0x01ed, LoadingException -> 0x01fa, RemoteException -> 0x01fc, TryCatch #8 {RemoteException -> 0x01fc, LoadingException -> 0x01fa, all -> 0x01ed, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00f9, B:54:0x0120, B:56:0x0128, B:57:0x012f, B:58:0x0137, B:53:0x010d, B:61:0x013a, B:62:0x013b, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:68:0x014f, B:69:0x0150, B:71:0x016f, B:73:0x0176, B:75:0x017e, B:81:0x01b7, B:83:0x01bd, B:85:0x01c6, B:86:0x01ce, B:76:0x018d, B:77:0x0195, B:79:0x0198, B:80:0x01a8, B:87:0x01cf, B:88:0x01d7, B:89:0x01d8, B:90:0x01e0, B:95:0x01ec), top: B:148:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01a8 A[Catch: all -> 0x01ed, LoadingException -> 0x01fa, RemoteException -> 0x01fc, TryCatch #8 {RemoteException -> 0x01fc, LoadingException -> 0x01fa, all -> 0x01ed, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00f9, B:54:0x0120, B:56:0x0128, B:57:0x012f, B:58:0x0137, B:53:0x010d, B:61:0x013a, B:62:0x013b, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:68:0x014f, B:69:0x0150, B:71:0x016f, B:73:0x0176, B:75:0x017e, B:81:0x01b7, B:83:0x01bd, B:85:0x01c6, B:86:0x01ce, B:76:0x018d, B:77:0x0195, B:79:0x0198, B:80:0x01a8, B:87:0x01cf, B:88:0x01d7, B:89:0x01d8, B:90:0x01e0, B:95:0x01ec), top: B:148:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01bd A[Catch: all -> 0x01ed, LoadingException -> 0x01fa, RemoteException -> 0x01fc, TryCatch #8 {RemoteException -> 0x01fc, LoadingException -> 0x01fa, all -> 0x01ed, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00f9, B:54:0x0120, B:56:0x0128, B:57:0x012f, B:58:0x0137, B:53:0x010d, B:61:0x013a, B:62:0x013b, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:68:0x014f, B:69:0x0150, B:71:0x016f, B:73:0x0176, B:75:0x017e, B:81:0x01b7, B:83:0x01bd, B:85:0x01c6, B:86:0x01ce, B:76:0x018d, B:77:0x0195, B:79:0x0198, B:80:0x01a8, B:87:0x01cf, B:88:0x01d7, B:89:0x01d8, B:90:0x01e0, B:95:0x01ec), top: B:148:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c6 A[Catch: all -> 0x01ed, LoadingException -> 0x01fa, RemoteException -> 0x01fc, TryCatch #8 {RemoteException -> 0x01fc, LoadingException -> 0x01fa, all -> 0x01ed, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00f9, B:54:0x0120, B:56:0x0128, B:57:0x012f, B:58:0x0137, B:53:0x010d, B:61:0x013a, B:62:0x013b, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:68:0x014f, B:69:0x0150, B:71:0x016f, B:73:0x0176, B:75:0x017e, B:81:0x01b7, B:83:0x01bd, B:85:0x01c6, B:86:0x01ce, B:76:0x018d, B:77:0x0195, B:79:0x0198, B:80:0x01a8, B:87:0x01cf, B:88:0x01d7, B:89:0x01d8, B:90:0x01e0, B:95:0x01ec), top: B:148:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01cf A[Catch: all -> 0x01ed, LoadingException -> 0x01fa, RemoteException -> 0x01fc, TryCatch #8 {RemoteException -> 0x01fc, LoadingException -> 0x01fa, all -> 0x01ed, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00f9, B:54:0x0120, B:56:0x0128, B:57:0x012f, B:58:0x0137, B:53:0x010d, B:61:0x013a, B:62:0x013b, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:68:0x014f, B:69:0x0150, B:71:0x016f, B:73:0x0176, B:75:0x017e, B:81:0x01b7, B:83:0x01bd, B:85:0x01c6, B:86:0x01ce, B:76:0x018d, B:77:0x0195, B:79:0x0198, B:80:0x01a8, B:87:0x01cf, B:88:0x01d7, B:89:0x01d8, B:90:0x01e0, B:95:0x01ec), top: B:148:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d8 A[Catch: all -> 0x01ed, LoadingException -> 0x01fa, RemoteException -> 0x01fc, TryCatch #8 {RemoteException -> 0x01fc, LoadingException -> 0x01fa, all -> 0x01ed, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00f9, B:54:0x0120, B:56:0x0128, B:57:0x012f, B:58:0x0137, B:53:0x010d, B:61:0x013a, B:62:0x013b, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:68:0x014f, B:69:0x0150, B:71:0x016f, B:73:0x0176, B:75:0x017e, B:81:0x01b7, B:83:0x01bd, B:85:0x01c6, B:86:0x01ce, B:76:0x018d, B:77:0x0195, B:79:0x0198, B:80:0x01a8, B:87:0x01cf, B:88:0x01d7, B:89:0x01d8, B:90:0x01e0, B:95:0x01ec), top: B:148:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01e1 A[Catch: all -> 0x01ea, TRY_ENTER, TryCatch #4 {, blocks: (B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e1, B:92:0x01e9), top: B:144:0x009c }] */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x0260, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00ae, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0150, please report this as an issue */
    @ResultIgnorabilityUnspecified
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws Throwable {
        DynamiteModule dynamiteModuleZzc;
        int i;
        Boolean bool;
        zzq zzqVarZzg;
        int iZze;
        IObjectWrapper iObjectWrapperZzh;
        Object objUnwrap;
        DynamiteModule dynamiteModule;
        zzn zznVar;
        zzr zzrVar;
        zzn zznVar2;
        boolean z;
        Boolean boolValueOf;
        IObjectWrapper iObjectWrapperZze;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal = zzg;
        zzn zznVar3 = (zzn) threadLocal.get();
        zzn zznVar4 = new zzn(null);
        threadLocal.set(zznVar4);
        ThreadLocal threadLocal2 = zzh;
        Long l = (Long) threadLocal2.get();
        long jLongValue = l.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, zzi);
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + selectionResultSelectModule.localVersion + " and remote module " + str + ":" + selectionResultSelectModule.remoteVersion);
                int i2 = selectionResultSelectModule.selection;
                if (i2 != 0) {
                    if (i2 != -1) {
                        if (i2 == 1 || selectionResultSelectModule.remoteVersion != 0) {
                            if (i2 == -1) {
                                dynamiteModuleZzc = zzc(applicationContext, str);
                            } else {
                                if (i2 == 1) {
                                    throw new LoadingException("VersionPolicy returned invalid code:" + i2, null);
                                }
                                try {
                                    i = selectionResultSelectModule.remoteVersion;
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            if (zzf(context)) {
                                                throw new LoadingException("Remote loading disabled", null);
                                            }
                                            bool = zzb;
                                        }
                                        if (bool != null) {
                                            throw new LoadingException("Failed to determine which loading route to use.", null);
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                                            synchronized (DynamiteModule.class) {
                                                zzrVar = zzl;
                                            }
                                            if (zzrVar != null) {
                                                throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                            }
                                            zznVar2 = (zzn) threadLocal.get();
                                            if (zznVar2 != null || zznVar2.zza == null) {
                                                throw new LoadingException("No result cursor", null);
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = zznVar2.zza;
                                            ObjectWrapper.wrap(null);
                                            synchronized (DynamiteModule.class) {
                                                z = zze >= 2;
                                                boolValueOf = Boolean.valueOf(z);
                                            }
                                            boolValueOf.getClass();
                                            if (z) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                iObjectWrapperZze = zzrVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i, ObjectWrapper.wrap(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                iObjectWrapperZze = zzrVar.zze(ObjectWrapper.wrap(applicationContext2), str, i, ObjectWrapper.wrap(cursor2));
                                            }
                                            Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapperZze);
                                            if (context2 == null) {
                                                throw new LoadingException("Failed to get module context", null);
                                            }
                                            dynamiteModule = new DynamiteModule(context2);
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                                            zzqVarZzg = zzg(context);
                                            if (zzqVarZzg != null) {
                                                throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                            }
                                            iZze = zzqVarZzg.zze();
                                            if (iZze >= 3) {
                                                zznVar = (zzn) threadLocal.get();
                                                if (zznVar != null) {
                                                    throw new LoadingException("No cached result cursor holder", null);
                                                }
                                                iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(zznVar.zza));
                                            } else if (iZze == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i);
                                            }
                                            objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                            if (objUnwrap != null) {
                                                throw new LoadingException("Failed to load remote module.", null);
                                            }
                                            dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                        }
                                        dynamiteModuleZzc = dynamiteModule;
                                    } catch (RemoteException e) {
                                        throw new LoadingException("Failed to load remote module.", e, null);
                                    } catch (LoadingException e2) {
                                        throw e2;
                                    } catch (Throwable th) {
                                        CrashUtils.addDynamiteErrorToDropBox(context, th);
                                        throw new LoadingException("Failed to load remote module.", th, null);
                                    }
                                } catch (LoadingException e3) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e3.getMessage());
                                    int i3 = selectionResultSelectModule.localVersion;
                                    if (i3 == 0 || versionPolicy.selectModule(context, str, new zzo(i3, 0)).selection != -1) {
                                        throw new LoadingException("Remote load failed. No local fallback found.", e3, null);
                                    }
                                    dynamiteModuleZzc = zzc(applicationContext, str);
                                }
                            }
                            if (jLongValue == 0) {
                                zzh.remove();
                            } else {
                                zzh.set(l);
                            }
                            cursor = zznVar4.zza;
                            if (cursor != null) {
                                cursor.close();
                            }
                            zzg.set(zznVar3);
                            return dynamiteModuleZzc;
                        }
                    } else if (selectionResultSelectModule.localVersion != 0) {
                        i2 = -1;
                        if (i2 == 1) {
                        }
                        if (i2 == -1) {
                            dynamiteModuleZzc = zzc(applicationContext, str);
                        } else {
                            if (i2 == 1) {
                                throw new LoadingException("VersionPolicy returned invalid code:" + i2, null);
                            }
                            i = selectionResultSelectModule.remoteVersion;
                            synchronized (DynamiteModule.class) {
                                if (zzf(context)) {
                                    throw new LoadingException("Remote loading disabled", null);
                                }
                                bool = zzb;
                                if (bool != null) {
                                    throw new LoadingException("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                                    synchronized (DynamiteModule.class) {
                                        zzrVar = zzl;
                                        if (zzrVar != null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        zznVar2 = (zzn) threadLocal.get();
                                        if (zznVar2 != null) {
                                        }
                                        throw new LoadingException("No result cursor", null);
                                    }
                                }
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                                zzqVarZzg = zzg(context);
                                if (zzqVarZzg != null) {
                                    throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                }
                                iZze = zzqVarZzg.zze();
                                if (iZze >= 3) {
                                    zznVar = (zzn) threadLocal.get();
                                    if (zznVar != null) {
                                        throw new LoadingException("No cached result cursor holder", null);
                                    }
                                    iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(zznVar.zza));
                                } else if (iZze == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i);
                                }
                                objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                if (objUnwrap != null) {
                                    throw new LoadingException("Failed to load remote module.", null);
                                }
                                dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                dynamiteModuleZzc = dynamiteModule;
                            }
                        }
                        if (jLongValue == 0) {
                            zzh.remove();
                        } else {
                            zzh.set(l);
                        }
                        cursor = zznVar4.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        zzg.set(zznVar3);
                        return dynamiteModuleZzc;
                    }
                }
                throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectionResultSelectModule.localVersion + " and remote version is " + selectionResultSelectModule.remoteVersion + ".", null);
            } catch (Throwable th2) {
                th = th2;
                zznVar3 = zznVar3;
                if (jLongValue == 0) {
                    zzh.remove();
                } else {
                    zzh.set(l);
                }
                Cursor cursor3 = zznVar4.zza;
                if (cursor3 != null) {
                    cursor3.close();
                }
                zzg.set(zznVar3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:94:0x016a A[Catch: all -> 0x01c6, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01c6, blocks: (B:3:0x0002, B:61:0x00dd, B:63:0x00e3, B:68:0x0104, B:90:0x015c, B:94:0x016a, B:115:0x01bf, B:116:0x01c2, B:110:0x01b7, B:66:0x00e9, B:119:0x01c5, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:59:0x00da, B:19:0x0046, B:41:0x009c, B:44:0x009f, B:52:0x00b8, B:60:0x00dc, B:58:0x00be), top: B:129:0x0002, inners: #1, #12 }] */
    public static int zza(Context context, String str, boolean z) {
        Throwable th;
        RemoteException e;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                Cursor cursor2 = null;
                int iZzf = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else if (classLoader != null) {
                                try {
                                    zzd(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            } else {
                                if (!zzf(context)) {
                                    return 0;
                                }
                                if (zzd || Boolean.TRUE.equals(null)) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                } else {
                                    try {
                                        int iZzb = zzb(context, str, z, true);
                                        String str2 = zzc;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader classLoaderZza = zzb.zza();
                                            if (classLoaderZza == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    zzn$$ExternalSyntheticApiModelOutline0.m394m();
                                                    String str3 = zzc;
                                                    Preconditions.checkNotNull(str3);
                                                    classLoaderZza = zzn$$ExternalSyntheticApiModelOutline0.m383m(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = zzc;
                                                    Preconditions.checkNotNull(str4);
                                                    classLoaderZza = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            zzd(classLoaderZza);
                                            declaredField.set(null, classLoaderZza);
                                            zzb = Boolean.TRUE;
                                            return iZzb;
                                        }
                                        return iZzb;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            zzb = bool;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e2.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z, false);
                    } catch (LoadingException e3) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e3.getMessage());
                        return 0;
                    }
                }
                zzq zzqVarZzg = zzg(context);
                if (zzqVarZzg != null) {
                    try {
                        try {
                            int iZze = zzqVarZzg.zze();
                            if (iZze >= 3) {
                                zzn zznVar = (zzn) zzg.get();
                                if (zznVar == null || (cursor = zznVar.zza) == null) {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzqVarZzg.zzk(ObjectWrapper.wrap(context), str, z, ((Long) zzh.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i = cursor3.getInt(0);
                                                cursor2 = (i <= 0 || !zze(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iZzf = i;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e4) {
                                            e = e4;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iZzf = cursor.getInt(0);
                                }
                            } else if (iZze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iZzf = zzqVarZzg.zzg(ObjectWrapper.wrap(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iZzf = zzqVarZzg.zzf(ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (RemoteException e5) {
                        e = e5;
                    }
                }
                return iZzf;
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private static int zzb(Context context, String str, boolean z, boolean z2) throws Throwable {
        Throwable th;
        Exception e;
        ?? r0 = 0;
        ?? r1 = 0;
        ?? r2 = 0;
        ?? r3 = 0;
        try {
            try {
                boolean z3 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) zzh.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z4 = false;
                            int i = cursorQuery.getInt(0);
                            if (i > 0) {
                                synchronized (DynamiteModule.class) {
                                    zzc = cursorQuery.getString(2);
                                    int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        zze = cursorQuery.getInt(columnIndex);
                                    }
                                    int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (cursorQuery.getInt(columnIndex2) == 0) {
                                            z3 = false;
                                        }
                                        zzd = z3;
                                        z4 = z3;
                                    }
                                }
                                if (zze(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z2 && z4) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", r2 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof LoadingException) {
                            throw e;
                        }
                        throw new LoadingException("V2 version check failed: " + e.getMessage(), e, r1 == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", r3 == true ? 1 : 0);
            } catch (Exception e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            r0 = context;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    private static DynamiteModule zzc(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        zzp zzpVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzr(iBinder);
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) {
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(zzf)) {
            return true;
        }
        boolean z = false;
        if (zzf == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            zzf = boolValueOf;
            boolValueOf.getClass();
            if (z && providerInfoResolveContentProvider.applicationInfo != null && (providerInfoResolveContentProvider.applicationInfo.flags & Cea708CCParser.Const.CODE_C1_CW1) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zzd = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    public Context getModuleContext() {
        return this.zzj;
    }

    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }
}
