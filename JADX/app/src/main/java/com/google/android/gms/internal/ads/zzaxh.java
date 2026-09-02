package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxh {
    private final int zza;
    private final zzaxe zzb = new zzaxj();

    public zzaxh(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(arrayList.get(i).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        zzaxg zzaxgVar = new zzaxg();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzaxf(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzaxi.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzaxm.zza(strArrZzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzaxgVar.zzb.write(this.zzb.zza(((zzaxl) it.next()).zzb));
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Error while writing hash to byteStream", e);
            }
        }
        return zzaxgVar.toString();
    }
}
