package com.alexmanzana.bubbleall.views;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;

/**
 * The "Crop before attaching" row in the bubble config panel.
 *
 * <p>Keeps the preference and the row's appearance in one place: the button uses the app's
 * current/other background pair to show its state (the same idiom as the keyboard-mode chips) and
 * the label under the icon spells the state out. The flag itself is read at attach time by
 * LatestImage, so switching it never needs a bubble restart.
 *
 * <p>This source is the origin of
 * {@code APKtool/smali/com/alexmanzana/bubbleall/views/AttachCropOption*.smali}; regenerate with
 * {@code scripts/gen-helper.sh} rather than editing the smali by hand.
 */
public final class AttachCropOption {

    private static final String PREFS = "bubble_data_prefs";

    /** SharedPreferences flag read by LatestImage when an upload field asks for an image. */
    public static final String KEY_CROP = "crop_before_attach";

    /** On by default: the crop screen is the feature, and it degrades to a plain attach. */
    private static final boolean DEFAULT_CROP = true;

    private static final String TEXT_ON = "On";
    private static final String TEXT_OFF = "Off";

    private AttachCropOption() {
    }

    /** True when the newest image should be cropped before it is attached. */
    public static boolean enabled(Context context) {
        if (context == null) {
            return DEFAULT_CROP;
        }
        try {
            return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_CROP, DEFAULT_CROP);
        } catch (Throwable ignored) {
            return DEFAULT_CROP;
        }
    }

    /**
     * Wires the row: shows the stored state and saves the opposite one on every tap.
     *
     * @param button        the 50dp button whose background reports the state
     * @param state         the label inside that button ("On" / "Off")
     * @param backgroundOff the app's plain item background ({@code background_item_color})
     * @param backgroundOn  the app's current-item background ({@code background_item_color_current})
     */
    public static void bind(final Context context, final View button, final View state,
                            final int backgroundOff, final int backgroundOn) {
        if (context == null || button == null || state == null) {
            return;
        }
        apply(button, state, enabled(context), backgroundOff, backgroundOn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setEnabled(context, !enabled(context));
                apply(button, state, enabled(context), backgroundOff, backgroundOn);
            }
        });
    }

    private static void setEnabled(Context context, boolean value) {
        try {
            SharedPreferences preferences = context.getSharedPreferences(PREFS, 0);
            preferences.edit().putBoolean(KEY_CROP, value).apply();
        } catch (Throwable ignored) {
        }
    }

    private static void apply(View button, View state, boolean on, int backgroundOff,
                              int backgroundOn) {
        try {
            button.setBackgroundResource(on ? backgroundOn : backgroundOff);
            if (state instanceof TextView) {
                ((TextView) state).setText(on ? TEXT_ON : TEXT_OFF);
            }
        } catch (Throwable ignored) {
        }
    }
}
