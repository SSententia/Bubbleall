package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbyl implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbym zza;

    zzbyl(zzbym zzbymVar) {
        this.zza = zzbymVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzf("User canceled the download.");
    }
}
