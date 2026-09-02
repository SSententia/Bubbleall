package com.alexmanzana.bubbleall;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.adapters.AdapterMusic;
import com.alexmanzana.bubbleall.listeners.ListenerListMusic;
import com.alexmanzana.bubbleall.listeners.ListenerMusic;
import com.alexmanzana.bubbleall.pojos.ItemData;
import com.alexmanzana.bubbleall.pojos.ItemMusic;
import com.alexmanzana.bubbleall.pojos.ItemMusicMetadata;
import com.alexmanzana.bubbleall.utils.AdBlock;
import com.alexmanzana.bubbleall.utils.MusicPrefs;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MusicActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u000bH\u0014J\b\u0010\u001d\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m495d2 = {"Lcom/alexmanzana/bubbleall/MusicActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;", "()V", "mHandler", "Landroid/os/Handler;", "requestPermission", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "dialog", "", "list", "loadAd", "onClick", "item", "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;", "position", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "Landroid/view/MenuItem;", "onResume", "onSupportNavigateUp", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class MusicActivity extends AppCompatActivity implements ListenerMusic {
    private Handler mHandler;
    private final ActivityResultLauncher<String> requestPermission;

    public MusicActivity() {
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: com.alexmanzana.bubbleall.MusicActivity$$ExternalSyntheticLambda1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MusicActivity.requestPermission$lambda$1(this.f$0, (Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.requestPermission = activityResultLauncherRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C1106R.layout.activity_music);
        View viewFindViewById = findViewById(C1106R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        setSupportActionBar((MaterialToolbar) viewFindViewById);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        this.mHandler = new Handler(looperMyLooper);
        if (Build.VERSION.SDK_INT >= 33) {
            if (ActivityCompat.checkSelfPermission(this, "android.permission.READ_MEDIA_AUDIO") == 0) {
                list();
                return;
            } else {
                dialog();
                return;
            }
        }
        if (ActivityCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            list();
        } else {
            dialog();
        }
    }

    private final void dialog() {
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(this);
        materialAlertDialogBuilder.setTitle(C1106R.string.text_music);
        materialAlertDialogBuilder.setMessage(C1106R.string.text_music_dialog);
        materialAlertDialogBuilder.setPositiveButton(C1106R.string.text_continue, new DialogInterface.OnClickListener() { // from class: com.alexmanzana.bubbleall.MusicActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MusicActivity.dialog$lambda$0(this.f$0, dialogInterface, i);
            }
        });
        materialAlertDialogBuilder.setNegativeButton(C1106R.string.text_cancel, (DialogInterface.OnClickListener) null);
        materialAlertDialogBuilder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialog$lambda$0(MusicActivity this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Build.VERSION.SDK_INT >= 33) {
            this$0.requestPermission.launch("android.permission.READ_MEDIA_AUDIO");
        } else {
            this$0.requestPermission.launch("android.permission.READ_EXTERNAL_STORAGE");
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1106R.menu.activity_music, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C1106R.id.configMusic) {
            Intent intent = new Intent(this, (Class<?>) SettingsActivity.class);
            intent.putExtra("position_settings", 3);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private final void loadAd() {
        View viewFindViewById = findViewById(C1106R.id.adBanner);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        AdView adView = (AdView) viewFindViewById;
        if (!AdBlock.INSTANCE.removerAd(this)) {
            adView.loadAd(new AdRequest.Builder().build());
        } else {
            adView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestPermission$lambda$1(MusicActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(bool);
        if (bool.booleanValue()) {
            this$0.list();
        }
    }

    /* JADX INFO: renamed from: com.alexmanzana.bubbleall.MusicActivity$list$1 */
    /* JADX INFO: compiled from: MusicActivity.kt */
    @Metadata(m494d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0016¨\u0006\b"}, m495d2 = {"com/alexmanzana/bubbleall/MusicActivity$list$1", "Lcom/alexmanzana/bubbleall/listeners/ListenerListMusic;", "onReceived", "", "list", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;", "Lkotlin/collections/ArrayList;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class C11051 implements ListenerListMusic {
        C11051() {
        }

        @Override // com.alexmanzana.bubbleall.listeners.ListenerListMusic
        public void onReceived(final ArrayList<ItemMusic> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            Handler handler = MusicActivity.this.mHandler;
            if (handler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                handler = null;
            }
            final MusicActivity musicActivity = MusicActivity.this;
            handler.post(new Runnable() { // from class: com.alexmanzana.bubbleall.MusicActivity$list$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MusicActivity.C11051.onReceived$lambda$0(musicActivity, list);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onReceived$lambda$0(MusicActivity this$0, ArrayList list) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(list, "$list");
            View viewFindViewById = this$0.findViewById(C1106R.id.musicList);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            if (list.isEmpty()) {
                ((TextView) this$0.findViewById(C1106R.id.textListEmpty)).setVisibility(0);
            } else {
                recyclerView.setLayoutManager(new LinearLayoutManager(this$0));
                recyclerView.setAdapter(new AdapterMusic(list, this$0, false, 4, null));
            }
            ((ProgressBar) this$0.findViewById(C1106R.id.progressList)).setVisibility(8);
        }
    }

    private final void list() {
        MusicPrefs.INSTANCE.list(this, new C11051());
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerMusic
    public void onClick(ItemMusic item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        MusicActivity musicActivity = this;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(musicActivity);
        ItemData itemData = new ItemData("music", C1106R.id.musicPanel, ItemMusicMetadata.INSTANCE.parse(item));
        if (!BubbleService.INSTANCE.isStarting()) {
            Intent intent = new Intent(musicActivity, (Class<?>) BubbleService.class);
            intent.setAction("com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE");
            intent.putExtra("com.alexmanzana.bubbleall.EXTRA_ITEM_DATA", itemData);
            intent.putExtra("com.alexmanzana.bubbleall.EXTRA_ITEM_ONLY", defaultSharedPreferences.getBoolean("key_only_music", true));
            startService(intent);
            return;
        }
        Intent intent2 = new Intent("com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE");
        intent2.putExtra("com.alexmanzana.bubbleall.EXTRA_ITEM_DATA", itemData);
        intent2.putExtra("com.alexmanzana.bubbleall.EXTRA_OPEN_MANAGER", true);
        sendBroadcast(intent2);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        loadAd();
    }
}
