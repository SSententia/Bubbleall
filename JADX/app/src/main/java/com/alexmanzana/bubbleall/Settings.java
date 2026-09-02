package com.alexmanzana.bubbleall;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SwitchPreference;
import com.alexmanzana.bubbleall.dialogs.EnterTextDialog;
import com.alexmanzana.bubbleall.listeners.ListenerSuccess;
import com.alexmanzana.bubbleall.utils.VideoPrefs;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\b"}, m495d2 = {"Lcom/alexmanzana/bubbleall/Settings;", "", "()V", "Main", "Music", "Shortcuts", "Video", "Web", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class Settings {

    /* JADX INFO: compiled from: Settings.kt */
    @Metadata(m494d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, m495d2 = {"Lcom/alexmanzana/bubbleall/Settings$Main;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "onResume", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class Main extends PreferenceFragmentCompat {
        @Override // androidx.preference.PreferenceFragmentCompat
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(C1106R.xml.settings_main, rootKey);
            SwitchPreference switchPreference = (SwitchPreference) findPreference("key_main_only_menu");
            Preference preferenceFindPreference = findPreference("key_start_position");
            Preference preferenceFindPreference2 = findPreference("key_block_ad_app");
            if (preferenceFindPreference2 != null) {
                preferenceFindPreference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: com.alexmanzana.bubbleall.Settings$Main$$ExternalSyntheticLambda1
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean onPreferenceClick(Preference preference) {
                        return Settings.Main.onCreatePreferences$lambda$0(this.f$0, preference);
                    }
                });
            }
            if (switchPreference != null) {
                switchPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: com.alexmanzana.bubbleall.Settings$Main$$ExternalSyntheticLambda2
                    @Override // androidx.preference.Preference.OnPreferenceChangeListener
                    public final boolean onPreferenceChange(Preference preference, Object obj) {
                        return Settings.Main.onCreatePreferences$lambda$1(this.f$0, preference, obj);
                    }
                });
            }
            if (preferenceFindPreference != null) {
                preferenceFindPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: com.alexmanzana.bubbleall.Settings$Main$$ExternalSyntheticLambda3
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean onPreferenceClick(Preference preference) {
                        return Settings.Main.onCreatePreferences$lambda$3(this.f$0, preference);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onCreatePreferences$lambda$0(Main this$0, Preference it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            this$0.startActivity(new Intent(this$0.getContext(), (Class<?>) AdsActivity.class));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onCreatePreferences$lambda$1(Main this$0, Preference preference, Object obj) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(preference, "<anonymous parameter 0>");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj).booleanValue()) {
                Intent intent = new Intent(this$0.getContext(), (Class<?>) MenuActivity.class);
                intent.putExtra("select_menu", true);
                this$0.startActivity(intent);
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onCreatePreferences$lambda$3(final Main this$0, final Preference it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            if (android.provider.Settings.canDrawOverlays(it.getContext())) {
                this$0.startActivity(new Intent(it.getContext(), (Class<?>) BubblePositionActivity.class));
                return true;
            }
            MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(it.getContext());
            materialAlertDialogBuilder.setTitle(C1106R.string.text_draw_overlays);
            materialAlertDialogBuilder.setMessage(C1106R.string.text_draw_overlays_message_position);
            materialAlertDialogBuilder.setPositiveButton(C1106R.string.text_continue, new DialogInterface.OnClickListener() { // from class: com.alexmanzana.bubbleall.Settings$Main$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Settings.Main.onCreatePreferences$lambda$3$lambda$2(it, this$0, dialogInterface, i);
                }
            });
            materialAlertDialogBuilder.setNegativeButton(C1106R.string.text_cancel, (DialogInterface.OnClickListener) null);
            materialAlertDialogBuilder.show();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onCreatePreferences$lambda$3$lambda$2(Preference it, Main this$0, DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNullParameter(it, "$it");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setData(Uri.parse("package:" + it.getContext().getPackageName()));
            this$0.startActivity(intent);
        }

        @Override // androidx.fragment.app.Fragment
        public void onResume() {
            super.onResume();
            SwitchPreference switchPreference = (SwitchPreference) findPreference("key_main_only_menu");
            Preference preferenceFindPreference = findPreference("key_start_position");
            FragmentActivity activity = getActivity();
            SharedPreferences sharedPreferences = activity != null ? activity.getSharedPreferences("bubble_data_prefs", 0) : null;
            if (sharedPreferences != null && sharedPreferences.getInt("menu_option", -1) == -1 && switchPreference != null) {
                switchPreference.setChecked(false);
            }
            if (preferenceFindPreference != null) {
                preferenceFindPreference.setEnabled(!BubbleService.INSTANCE.isStarting());
            }
            if (BubbleService.INSTANCE.isStarting()) {
                if (preferenceFindPreference == null) {
                    return;
                }
                preferenceFindPreference.setSummary(getString(C1106R.string.text_close_position));
            } else {
                if (preferenceFindPreference == null) {
                    return;
                }
                preferenceFindPreference.setSummary(getString(C1106R.string.text_bubble_position));
            }
        }
    }

    /* JADX INFO: compiled from: Settings.kt */
    @Metadata(m494d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, m495d2 = {"Lcom/alexmanzana/bubbleall/Settings$Web;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class Web extends PreferenceFragmentCompat {
        @Override // androidx.preference.PreferenceFragmentCompat
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(C1106R.xml.settings_web, rootKey);
            Preference preferenceFindPreference = findPreference("key_save_main_page");
            if (preferenceFindPreference != null) {
                preferenceFindPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: com.alexmanzana.bubbleall.Settings$Web$$ExternalSyntheticLambda0
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean onPreferenceClick(Preference preference) {
                        return Settings.Web.onCreatePreferences$lambda$1(this.f$0, preference);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onCreatePreferences$lambda$1(Web this$0, Preference it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            Context context = this$0.getContext();
            if (context == null) {
                return true;
            }
            final SharedPreferences sharedPreferences = context.getSharedPreferences("bubble_data_prefs", 0);
            new EnterTextDialog(C1106R.string.text_main_page, C1106R.string.text_url, sharedPreferences.getString("page_web", ""), false, false, new ListenerSuccess() { // from class: com.alexmanzana.bubbleall.Settings$Web$onCreatePreferences$1$1$dialog$1
                @Override // com.alexmanzana.bubbleall.listeners.ListenerSuccess
                public void onReceived(Object item) {
                    Intrinsics.checkNotNullParameter(item, "item");
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString("page_web", (String) item);
                    editorEdit.apply();
                }
            }).show(context);
            return true;
        }
    }

    /* JADX INFO: compiled from: Settings.kt */
    @Metadata(m494d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, m495d2 = {"Lcom/alexmanzana/bubbleall/Settings$Video;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class Video extends PreferenceFragmentCompat {
        @Override // androidx.preference.PreferenceFragmentCompat
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(C1106R.xml.settings_video, rootKey);
            Preference preferenceFindPreference = findPreference("key_video_delete_all_favorites");
            if (preferenceFindPreference != null) {
                preferenceFindPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: com.alexmanzana.bubbleall.Settings$Video$$ExternalSyntheticLambda0
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean onPreferenceClick(Preference preference) {
                        return Settings.Video.onCreatePreferences$lambda$2(this.f$0, preference);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onCreatePreferences$lambda$2(final Video this$0, Preference it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(it.getContext());
            materialAlertDialogBuilder.setTitle(C1106R.string.text_question_delete_all_favorites);
            materialAlertDialogBuilder.setMessage(C1106R.string.text_delete_all_favorites_message);
            materialAlertDialogBuilder.setPositiveButton(C1106R.string.text_accept, new DialogInterface.OnClickListener() { // from class: com.alexmanzana.bubbleall.Settings$Video$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Settings.Video.onCreatePreferences$lambda$2$lambda$1(this.f$0, dialogInterface, i);
                }
            });
            materialAlertDialogBuilder.setNegativeButton(C1106R.string.text_cancel, (DialogInterface.OnClickListener) null);
            materialAlertDialogBuilder.show();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onCreatePreferences$lambda$2$lambda$1(Video this$0, DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Context context = this$0.getContext();
            if (context != null) {
                VideoPrefs.INSTANCE.deleteFavorites(context);
            }
        }
    }

    /* JADX INFO: compiled from: Settings.kt */
    @Metadata(m494d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, m495d2 = {"Lcom/alexmanzana/bubbleall/Settings$Music;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class Music extends PreferenceFragmentCompat {
        @Override // androidx.preference.PreferenceFragmentCompat
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(C1106R.xml.settings_music, rootKey);
        }
    }

    /* JADX INFO: compiled from: Settings.kt */
    @Metadata(m494d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, m495d2 = {"Lcom/alexmanzana/bubbleall/Settings$Shortcuts;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class Shortcuts extends PreferenceFragmentCompat {
        @Override // androidx.preference.PreferenceFragmentCompat
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(C1106R.xml.settings_shortcuts, rootKey);
            Preference preferenceFindPreference = findPreference("key_open_shortcut_created");
            if (preferenceFindPreference != null) {
                preferenceFindPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: com.alexmanzana.bubbleall.Settings$Shortcuts$$ExternalSyntheticLambda0
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean onPreferenceClick(Preference preference) {
                        return Settings.Shortcuts.onCreatePreferences$lambda$0(this.f$0, preference);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onCreatePreferences$lambda$0(Shortcuts this$0, Preference it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            this$0.startActivity(new Intent(this$0.getContext(), (Class<?>) ShortcutActivity.class));
            return true;
        }
    }
}
