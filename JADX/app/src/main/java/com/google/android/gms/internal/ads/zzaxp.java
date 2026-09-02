package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxp {
    private final zzaxe zza;
    private final int zzb;
    private String zzc;
    private final int zzd;

    public zzaxp(int i, int i2, int i3) {
        this.zzb = i;
        i2 = (i2 > 64 || i2 < 0) ? 64 : i2;
        if (i3 <= 0) {
            this.zzd = 1;
        } else {
            this.zzd = i3;
        }
        this.zza = new zzaxn(i2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    public final String zza(ArrayList<String> arrayList, ArrayList<zzaxd> arrayList2) {
        Collections.sort(arrayList2, new zzaxo(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i = 0; i < arrayList2.size(); i++) {
            String[] strArrSplit = Normalizer.normalize(arrayList.get(arrayList2.get(i).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (String str : strArrSplit) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i2 = 1;
                        boolean z = false;
                        while (true) {
                            int i3 = i2 + 2;
                            if (i3 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i2) == '\'') {
                                if (sb.charAt(i2 - 1) != ' ') {
                                    int i4 = i2 + 1;
                                    if ((sb.charAt(i4) == 's' || sb.charAt(i4) == 'S') && (i3 == sb.length() || sb.charAt(i3) == ' ')) {
                                        sb.insert(i2, ' ');
                                        i2 = i3;
                                    } else {
                                        sb.setCharAt(i2, ' ');
                                    }
                                } else {
                                    sb.setCharAt(i2, ' ');
                                }
                                z = true;
                            }
                            i2++;
                        }
                        String string = z ? sb.toString() : null;
                        if (string != null) {
                            this.zzc = string;
                            str = string;
                        }
                    }
                    String[] strArrZzb = zzaxi.zzb(str, true);
                    if (strArrZzb.length >= this.zzd) {
                        for (int i5 = 0; i5 < strArrZzb.length; i5++) {
                            String strConcat = "";
                            for (int i6 = 0; i6 < this.zzd; i6++) {
                                int i7 = i5 + i6;
                                if (i7 >= strArrZzb.length) {
                                    break;
                                }
                                if (i6 > 0) {
                                    strConcat = String.valueOf(strConcat).concat(" ");
                                }
                                String strValueOf = String.valueOf(strConcat);
                                String strValueOf2 = String.valueOf(strArrZzb[i7]);
                                strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
            }
        }
        zzaxg zzaxgVar = new zzaxg();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzaxgVar.zzb.write(this.zza.zza((String) it.next()));
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Error while writing hash to byteStream", e);
            }
        }
        return zzaxgVar.toString();
    }
}
