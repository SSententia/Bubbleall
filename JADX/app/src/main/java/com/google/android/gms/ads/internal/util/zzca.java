package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzezz;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfmg;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzca {
    public static boolean zza(int i) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbY)).booleanValue()) {
            return ((Boolean) zzbet.zzc().zzc(zzbjl.zzbZ)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x015e  */
    public static JSONObject zzb(Context context, View view) {
        String str;
        byte b;
        JSONObject jSONObjectZzk;
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            int[] iArrZzg = zzg(view);
            int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
            for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                iArr[0] = Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                iArr[1] = Math.min(viewGroup.getMeasuredHeight(), iArr[1]);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", zzber.zza().zza(context, view.getMeasuredWidth()));
            jSONObject2.put("height", zzber.zza().zza(context, view.getMeasuredHeight()));
            jSONObject2.put("x", zzber.zza().zza(context, iArrZzg[0]));
            jSONObject2.put("y", zzber.zza().zza(context, iArrZzg[1]));
            jSONObject2.put("maximum_visible_width", zzber.zza().zza(context, iArr[0]));
            jSONObject2.put("maximum_visible_height", zzber.zza().zza(context, iArr[1]));
            jSONObject2.put("relative_to", "window");
            jSONObject.put("frame", jSONObject2);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObjectZzk = zzk(context, rect);
            } else {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("width", 0);
                jSONObject3.put("height", 0);
                jSONObject3.put("x", zzber.zza().zza(context, iArrZzg[0]));
                jSONObject3.put("y", zzber.zza().zza(context, iArrZzg[1]));
                jSONObject3.put("relative_to", "window");
                jSONObjectZzk = jSONObject3;
            }
            jSONObject.put("visible_bounds", jSONObjectZzk);
        } catch (Exception unused) {
            zze.zzi("Unable to get native ad view bounding box");
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzez)).booleanValue()) {
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                try {
                    str = (String) parent2.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(parent2, new Object[0]);
                } catch (IllegalAccessException e) {
                    e = e;
                    zze.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                } catch (NoSuchMethodException unused2) {
                    str = "";
                } catch (SecurityException e2) {
                    e = e2;
                    zze.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                } catch (InvocationTargetException e3) {
                    e = e3;
                    zze.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                }
            } else {
                str = "";
            }
            try {
                int iHashCode = str.hashCode();
                if (iHashCode != -2066603854) {
                    if (iHashCode == 2019754500 && str.equals("medium_template")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("small_template")) {
                    b = 0;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    jSONObject.put("native_template_type", 1);
                } else if (b != 1) {
                    jSONObject.put("native_template_type", 0);
                } else {
                    jSONObject.put("native_template_type", 2);
                }
            } catch (JSONException e4) {
                zze.zzg("Could not log native template signal to JSON", e4);
            }
        }
        return jSONObject;
    }

    public static JSONObject zzc(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            boolean z = false;
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfF)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                ViewParent parent = view.getParent();
                while (parent != null && !(parent instanceof ScrollView)) {
                    parent = parent.getParent();
                }
                if (parent != null) {
                    z = true;
                }
                jSONObject.put("contained_in_scroll_view", z);
            } else {
                com.google.android.gms.ads.internal.zzt.zzc();
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                jSONObject.put("contained_in_scroll_view", (parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) != -1);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject zzd(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            jSONObject.put("can_show_on_lock_screen", zzs.zzt(view));
            com.google.android.gms.ads.internal.zzt.zzc();
            jSONObject.put("is_keyguard_locked", zzs.zzG(context));
        } catch (JSONException unused) {
            zze.zzi("Unable to get lock screen information");
        }
        return jSONObject;
    }

    public static JSONObject zze(Context context, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject3;
        }
        int[] iArrZzg = zzg(view);
        Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, WeakReference<View>> next = it.next();
            View view2 = next.getValue().get();
            if (view2 != null) {
                int[] iArrZzg2 = zzg(view2);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                try {
                    JSONObject jSONObject6 = jSONObject3;
                    try {
                        jSONObject5.put("width", zzber.zza().zza(context, view2.getMeasuredWidth()));
                        jSONObject5.put("height", zzber.zza().zza(context, view2.getMeasuredHeight()));
                        jSONObject5.put("x", zzber.zza().zza(context, iArrZzg2[0] - iArrZzg[0]));
                        jSONObject5.put("y", zzber.zza().zza(context, iArrZzg2[1] - iArrZzg[1]));
                        jSONObject5.put("relative_to", "ad_view");
                        jSONObject4.put("frame", jSONObject5);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject2 = zzk(context, rect);
                        } else {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put("width", 0);
                            jSONObject2.put("height", 0);
                            jSONObject2.put("x", zzber.zza().zza(context, iArrZzg2[0] - iArrZzg[0]));
                            jSONObject2.put("y", zzber.zza().zza(context, iArrZzg2[1] - iArrZzg[1]));
                            jSONObject2.put("relative_to", "ad_view");
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject4.put("text_color", textView.getCurrentTextColor());
                            jSONObject4.put("font_size", textView.getTextSize());
                            jSONObject4.put("text", textView.getText());
                        }
                        jSONObject4.put("is_clickable", map2 != null && map2.containsKey(next.getKey()) && view2.isClickable());
                        jSONObject = jSONObject6;
                        try {
                            jSONObject.put(next.getKey(), jSONObject4);
                        } catch (JSONException unused) {
                            zze.zzi("Unable to get asset views information");
                        }
                    } catch (JSONException unused2) {
                        jSONObject = jSONObject6;
                    }
                } catch (JSONException unused3) {
                    jSONObject = jSONObject3;
                }
                jSONObject3 = jSONObject;
                it = it2;
            }
        }
        return jSONObject3;
    }

    public static JSONObject zzf(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", zzber.zza().zza(context, point2.x));
                    jSONObject3.put("y", zzber.zza().zza(context, point2.y));
                    jSONObject3.put("start_x", zzber.zza().zza(context, point.x));
                    jSONObject3.put("start_y", zzber.zza().zza(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    zze.zzg("Error occurred while putting signals into JSON object.", e);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                jSONObject = jSONObject2;
                zze.zzg("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static int[] zzg(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static Point zzh(MotionEvent motionEvent, View view) {
        int[] iArrZzg = zzg(view);
        float rawX = motionEvent.getRawX();
        return new Point(((int) rawX) - iArrZzg[0], ((int) motionEvent.getRawY()) - iArrZzg[1]);
    }

    public static boolean zzi(Context context, zzezz zzezzVar) {
        if (!zzezzVar.zzJ) {
            return false;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfG)).booleanValue()) {
            return ((Boolean) zzbet.zzc().zzc(zzbjl.zzfJ)).booleanValue();
        }
        String str = (String) zzbet.zzc().zzc(zzbjl.zzfH);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator<String> it = zzfmg.zzb(zzflk.zzb(';')).zzd(str).iterator();
            while (it.hasNext()) {
                if (it.next().equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static WindowManager.LayoutParams zzj() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) zzbet.zzc().zzc(zzbjl.zzfI)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    private static JSONObject zzk(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", zzber.zza().zza(context, rect.right - rect.left));
        jSONObject.put("height", zzber.zza().zza(context, rect.bottom - rect.top));
        jSONObject.put("x", zzber.zza().zza(context, rect.left));
        jSONObject.put("y", zzber.zza().zza(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }
}
