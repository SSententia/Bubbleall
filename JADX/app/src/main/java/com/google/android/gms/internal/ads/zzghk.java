package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.text.Typography;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzghk {
    static String zza(zzghi zzghiVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzc(zzghiVar, sb, 0);
        return sb.toString();
    }

    static final void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzgim.zza(zzgex.zzv((String) obj)));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof zzgex) {
            sb.append(": \"");
            sb.append(zzgim.zza((zzgex) obj));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof zzgga) {
            sb.append(" {");
            zzc((zzgga) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        zzb(sb, i4, "key", entry.getKey());
        zzb(sb, i4, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    private static void zzc(zzghi zzghiVar, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzghiVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strValueOf = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb, i, zzd(strConcat), zzgga.zzaA(method2, zzghiVar, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i, zzd(strConcat2), zzgga.zzaA(method3, zzghiVar, new Object[0]));
                }
            }
            String strValueOf5 = String.valueOf(strSubstring);
            if (((Method) map2.get(strValueOf5.length() != 0 ? "set".concat(strValueOf5) : new String("set"))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    String strValueOf6 = String.valueOf(strSubstring.substring(0, strSubstring.length() - 5));
                    if (!map.containsKey(strValueOf6.length() != 0 ? "get".concat(strValueOf6) : new String("get"))) {
                    }
                }
                String strValueOf7 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf8 = String.valueOf(strSubstring.substring(1));
                String strConcat3 = strValueOf8.length() != 0 ? strValueOf7.concat(strValueOf8) : new String(strValueOf7);
                String strValueOf9 = String.valueOf(strSubstring);
                Method method4 = (Method) map.get(strValueOf9.length() != 0 ? "get".concat(strValueOf9) : new String("get"));
                String strValueOf10 = String.valueOf(strSubstring);
                Method method5 = (Method) map.get(strValueOf10.length() != 0 ? "has".concat(strValueOf10) : new String("has"));
                if (method4 != null) {
                    Object objZzaA = zzgga.zzaA(method4, zzghiVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzaA instanceof Boolean) {
                            if (((Boolean) objZzaA).booleanValue()) {
                                zzb(sb, i, zzd(strConcat3), objZzaA);
                            }
                        } else if (objZzaA instanceof Integer) {
                            if (((Integer) objZzaA).intValue() != 0) {
                                zzb(sb, i, zzd(strConcat3), objZzaA);
                            }
                        } else if (objZzaA instanceof Float) {
                            if (((Float) objZzaA).floatValue() != 0.0f) {
                                zzb(sb, i, zzd(strConcat3), objZzaA);
                            }
                        } else if (!(objZzaA instanceof Double)) {
                            if (objZzaA instanceof String) {
                                zEquals = objZzaA.equals("");
                            } else if (objZzaA instanceof zzgex) {
                                zEquals = objZzaA.equals(zzgex.zzb);
                            } else if (objZzaA instanceof zzghi) {
                                if (objZzaA != ((zzghi) objZzaA).zzbe()) {
                                    zzb(sb, i, zzd(strConcat3), objZzaA);
                                }
                            } else if (!(objZzaA instanceof Enum) || ((Enum) objZzaA).ordinal() != 0) {
                                zzb(sb, i, zzd(strConcat3), objZzaA);
                            }
                            if (!zEquals) {
                                zzb(sb, i, zzd(strConcat3), objZzaA);
                            }
                        } else if (((Double) objZzaA).doubleValue() != 0.0d) {
                            zzb(sb, i, zzd(strConcat3), objZzaA);
                        }
                    } else if (((Boolean) zzgga.zzaA(method5, zzghiVar, new Object[0])).booleanValue()) {
                        zzb(sb, i, zzd(strConcat3), objZzaA);
                    }
                }
            }
        }
        if (zzghiVar instanceof zzgfx) {
            zzgfr zzgfrVar = ((zzgfx) zzghiVar).zzb;
            throw null;
        }
        zzgip zzgipVar = ((zzgga) zzghiVar).zzc;
        if (zzgipVar != null) {
            zzgipVar.zzg(sb, i);
        }
    }

    private static final String zzd(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }
}
