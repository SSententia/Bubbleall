package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.media2.session.SessionCommand;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfis {
    public static zzfkb zza(Context context, int i, int i2, String str, String str2, String str3, zzfii zzfiiVar) {
        return new zzfir(context, 1, i2, str, str2, "1", zzfiiVar).zza(SessionCommand.COMMAND_CODE_LIBRARY_GET_LIBRARY_ROOT);
    }
}
