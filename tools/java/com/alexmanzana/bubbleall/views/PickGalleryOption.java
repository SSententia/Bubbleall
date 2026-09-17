package com.alexmanzana.bubbleall.views;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;

/**
 * The "Pick from gallery" row in the bubble config panel.
 *
 * <p>Off (the default) keeps the 09-14 behaviour: an upload button attaches the newest gallery
 * image with no picker at all. On, {@link com.alexmanzana.bubbleall.utils.LatestImage} opens
 * {@link com.alexmanzana.bubbleall.utils.ImagePicker} instead, so the images that get attached are
 * the ones the user tapped -- several of them at once if they like -- and each of them is still
 * cropped first when "Crop before attaching" is on.
 *
 * <p>Same shape as {@link AttachCropOption}: the preference and the row's appearance live
 * together, the button uses the app's current/other background pair to show its state, and the
 * label under the icon spells the state out. The flag is read at attach time, so switching it
 * never needs a bubble restart.
 *
 * <p>This source is the origin of
 * {@code APKtool/smali/com/alexmanzana/bubbleall/views/PickGalleryOption*.smali}; regenerate with
 * {@code scripts/gen-helper.sh} rather than editing the smali by hand.
 */
public final class PickGalleryOption {

    private static final String PREFS = "bubble_data_prefs";

    /** SharedPreferences flag read by LatestImage when an upload field asks for an image. */
    public static final String KEY_PICK = "pick_from_gallery";

    /** Off by default: one tap attaching the newest image is the behaviour people already know. */
    private static final boolean DEFAULT_PICK = false;

    private static final String TEXT_ON = "On";
    private static final String TEXT_OFF = "Off";

    private PickGalleryOption() {
    }

    /** True when the user chooses which images to attach instead of attaching the newest one. */
    public static boolean enabled(Context context) {
        if (context == null) {
            return DEFAULT_PICK;
        }
        try {
            return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_PICK, DEFAULT_PICK);
        } catch (Throwable ignored) {
            return DEFAULT_PICK;
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
            preferences.edit().putBoolean(KEY_PICK, value).apply();
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
