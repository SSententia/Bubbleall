package com.alexmanzana.bubbleall;

import android.content.DialogInterface;
import android.content.Intent;
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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.adapters.AdapterVideo;
import com.alexmanzana.bubbleall.listeners.ListenerListVideo;
import com.alexmanzana.bubbleall.listeners.ListenerVideo;
import com.alexmanzana.bubbleall.pojos.ItemData;
import com.alexmanzana.bubbleall.pojos.ItemVideo;
import com.alexmanzana.bubbleall.utils.AdBlock;
import com.alexmanzana.bubbleall.utils.VideoPrefs;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0016J \u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u000fH\u0014J\b\u0010$\u001a\u00020\u0007H\u0016J\b\u0010%\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m495d2 = {"Lcom/alexmanzana/bubbleall/VideoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;", "()V", "adapter", "Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;", "isFavorite", "", "mHandler", "Landroid/os/Handler;", "requestPermission", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "action", "", "item", "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;", "list", "loadAd", "loadFavorites", "onBackPressed", "onBucket", "position", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "onClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "Landroid/view/MenuItem;", "onResume", "onSupportNavigateUp", "permissionDialog", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class VideoActivity extends AppCompatActivity implements ListenerVideo {
    private AdapterVideo adapter;
    private boolean isFavorite;
    private Handler mHandler;
    private final ActivityResultLauncher<String> requestPermission;

    @Override // com.alexmanzana.bubbleall.listeners.ListenerVideo
    public void onBucket(int position, String name, ItemVideo item) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(item, "item");
    }

    public VideoActivity() {
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: com.alexmanzana.bubbleall.VideoActivity$$ExternalSyntheticLambda1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                VideoActivity.requestPermission$lambda$1(this.f$0, (Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.requestPermission = activityResultLauncherRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C1106R.layout.activity_video);
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
            if (ActivityCompat.checkSelfPermission(this, "android.permission.READ_MEDIA_VIDEO") == 0) {
                list();
                return;
            } else {
                permissionDialog();
                return;
            }
        }
        if (ActivityCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            list();
        } else {
            permissionDialog();
        }
    }

    private final void permissionDialog() {
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(this);
        materialAlertDialogBuilder.setTitle(C1106R.string.text_video);
        materialAlertDialogBuilder.setMessage(C1106R.string.text_video_dialog);
        materialAlertDialogBuilder.setPositiveButton(C1106R.string.text_continue, new DialogInterface.OnClickListener() { // from class: com.alexmanzana.bubbleall.VideoActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                VideoActivity.permissionDialog$lambda$0(this.f$0, dialogInterface, i);
            }
        });
        materialAlertDialogBuilder.setNegativeButton(C1106R.string.text_cancel, (DialogInterface.OnClickListener) null);
        materialAlertDialogBuilder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void permissionDialog$lambda$0(VideoActivity this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Build.VERSION.SDK_INT >= 33) {
            this$0.requestPermission.launch("android.permission.READ_MEDIA_VIDEO");
        } else {
            this$0.requestPermission.launch("android.permission.READ_EXTERNAL_STORAGE");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.isFavorite) {
            this.isFavorite = false;
            list();
        } else {
            super.onBackPressed();
        }
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        loadAd();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1106R.menu.activity_video, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C1106R.id.configVideo) {
            Intent intent = new Intent(this, (Class<?>) SettingsActivity.class);
            intent.putExtra("position_settings", 2);
            startActivity(intent);
            return true;
        }
        if (item.getItemId() == C1106R.id.configFavorite) {
            if (ActivityCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                loadFavorites();
            } else {
                permissionDialog();
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: renamed from: com.alexmanzana.bubbleall.VideoActivity$loadFavorites$1 */
    /* JADX INFO: compiled from: VideoActivity.kt */
    @Metadata(m494d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m495d2 = {"com/alexmanzana/bubbleall/VideoActivity$loadFavorites$1", "Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;", "onReceived", "", "list", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;", "Lkotlin/collections/ArrayList;", "grid", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class C11111 implements ListenerListVideo {
        C11111() {
        }

        @Override // com.alexmanzana.bubbleall.listeners.ListenerListVideo
        public void onReceived(final ArrayList<ItemVideo> list, final int grid) {
            Intrinsics.checkNotNullParameter(list, "list");
            Handler handler = VideoActivity.this.mHandler;
            if (handler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                handler = null;
            }
            final VideoActivity videoActivity = VideoActivity.this;
            handler.post(new Runnable() { // from class: com.alexmanzana.bubbleall.VideoActivity$loadFavorites$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoActivity.C11111.onReceived$lambda$0(list, videoActivity, grid);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onReceived$lambda$0(ArrayList list, VideoActivity this$0, int i) {
            Intrinsics.checkNotNullParameter(list, "$list");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (!list.isEmpty()) {
                this$0.isFavorite = true;
                this$0.adapter = new AdapterVideo(list, this$0, false);
                RecyclerView recyclerView = (RecyclerView) this$0.findViewById(C1106R.id.videoList);
                if (i > 0) {
                    recyclerView.setLayoutManager(new GridLayoutManager(this$0, i));
                } else {
                    recyclerView.setLayoutManager(new LinearLayoutManager(this$0));
                }
                AdapterVideo adapterVideo = this$0.adapter;
                if (adapterVideo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    adapterVideo = null;
                }
                recyclerView.setAdapter(adapterVideo);
            } else {
                ((TextView) this$0.findViewById(C1106R.id.textListEmpty)).setVisibility(0);
            }
            ((ProgressBar) this$0.findViewById(C1106R.id.progressList)).setVisibility(8);
        }
    }

    private final void loadFavorites() {
        VideoPrefs.INSTANCE.favoriteList(this, new C11111());
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestPermission$lambda$1(VideoActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(bool);
        if (bool.booleanValue()) {
            this$0.list();
        }
    }

    /* JADX INFO: renamed from: com.alexmanzana.bubbleall.VideoActivity$list$1 */
    /* JADX INFO: compiled from: VideoActivity.kt */
    @Metadata(m494d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m495d2 = {"com/alexmanzana/bubbleall/VideoActivity$list$1", "Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;", "onReceived", "", "list", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;", "Lkotlin/collections/ArrayList;", "grid", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class C11101 implements ListenerListVideo {
        C11101() {
        }

        @Override // com.alexmanzana.bubbleall.listeners.ListenerListVideo
        public void onReceived(final ArrayList<ItemVideo> list, final int grid) {
            Intrinsics.checkNotNullParameter(list, "list");
            Handler handler = VideoActivity.this.mHandler;
            if (handler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                handler = null;
            }
            final VideoActivity videoActivity = VideoActivity.this;
            handler.post(new Runnable() { // from class: com.alexmanzana.bubbleall.VideoActivity$list$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoActivity.C11101.onReceived$lambda$0(list, videoActivity, grid);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onReceived$lambda$0(ArrayList list, VideoActivity this$0, int i) {
            Intrinsics.checkNotNullParameter(list, "$list");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (!list.isEmpty()) {
                this$0.adapter = new AdapterVideo(list, this$0, false);
                RecyclerView recyclerView = (RecyclerView) this$0.findViewById(C1106R.id.videoList);
                if (i > 0) {
                    recyclerView.setLayoutManager(new GridLayoutManager(this$0, i));
                } else {
                    recyclerView.setLayoutManager(new LinearLayoutManager(this$0));
                }
                AdapterVideo adapterVideo = this$0.adapter;
                if (adapterVideo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    adapterVideo = null;
                }
                recyclerView.setAdapter(adapterVideo);
            } else {
                ((TextView) this$0.findViewById(C1106R.id.textListEmpty)).setVisibility(0);
            }
            ((ProgressBar) this$0.findViewById(C1106R.id.progressList)).setVisibility(8);
        }
    }

    private final void list() {
        VideoPrefs.INSTANCE.list(this, new C11101(), getString(C1106R.string.text_video_picker3_key));
    }

    private final void action(ItemVideo item) {
        ItemData itemData = new ItemData("video", C1106R.id.videoPanel, item);
        if (!BubbleService.INSTANCE.isStarting()) {
            Intent intent = new Intent(this, (Class<?>) BubbleService.class);
            intent.setAction("com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE");
            intent.putExtra("com.alexmanzana.bubbleall.EXTRA_ITEM_DATA", itemData);
            startService(intent);
            return;
        }
        Intent intent2 = new Intent("com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE");
        intent2.putExtra("com.alexmanzana.bubbleall.EXTRA_ITEM_DATA", itemData);
        intent2.putExtra("com.alexmanzana.bubbleall.EXTRA_OPEN_MANAGER", true);
        sendBroadcast(intent2);
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerVideo
    public void onClick(ItemVideo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        action(item);
    }
}
