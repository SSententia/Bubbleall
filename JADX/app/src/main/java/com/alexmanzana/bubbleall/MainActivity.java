package com.alexmanzana.bubbleall;

import android.animation.ValueAnimator;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.adapters.AdapterColors;
import com.alexmanzana.bubbleall.adapters.AdapterShortcut;
import com.alexmanzana.bubbleall.adapters.AdapterSize;
import com.alexmanzana.bubbleall.listeners.ListenerSize;
import com.alexmanzana.bubbleall.listeners.ListenerTheme;
import com.alexmanzana.bubbleall.pojos.ItemTheme;
import com.alexmanzana.bubbleall.utils.AdBlock;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m495d2 = {"Lcom/alexmanzana/bubbleall/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;", "Lcom/alexmanzana/bubbleall/listeners/ListenerSize;", "()V", "adapterColors", "Lcom/alexmanzana/bubbleall/adapters/AdapterColors;", "adapterSize", "Lcom/alexmanzana/bubbleall/adapters/AdapterSize;", "animationButton", "Landroid/animation/ValueAnimator;", "button", "Landroid/widget/ImageView;", "loadAd", "", "onClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onSize", "position", "", "onTheme", "theme", "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;", "verifyButton", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class MainActivity extends AppCompatActivity implements ListenerTheme, ListenerSize {
    private AdapterColors adapterColors;
    private AdapterSize adapterSize;
    private ValueAnimator animationButton;
    private ImageView button;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IOException {
        super.onCreate(savedInstanceState);
        setContentView(C1106R.layout.activity_main);
        MainActivity mainActivity = this;
        MobileAds.initialize(mainActivity);
        AdBlock.INSTANCE.init(mainActivity);
        View viewFindViewById = findViewById(C1106R.id.buttonStart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.button = (ImageView) viewFindViewById;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.3f);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "ofFloat(...)");
        this.animationButton = valueAnimatorOfFloat;
        ImageView imageView = null;
        if (valueAnimatorOfFloat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animationButton");
            valueAnimatorOfFloat = null;
        }
        valueAnimatorOfFloat.setDuration(1000L);
        ValueAnimator valueAnimator = this.animationButton;
        if (valueAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animationButton");
            valueAnimator = null;
        }
        valueAnimator.setRepeatCount(-1);
        ValueAnimator valueAnimator2 = this.animationButton;
        if (valueAnimator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animationButton");
            valueAnimator2 = null;
        }
        valueAnimator2.setRepeatMode(2);
        ValueAnimator valueAnimator3 = this.animationButton;
        if (valueAnimator3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animationButton");
            valueAnimator3 = null;
        }
        valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alexmanzana.bubbleall.MainActivity$$ExternalSyntheticLambda5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                MainActivity.onCreate$lambda$0(this.f$0, valueAnimator4);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(C1106R.id.itemsList);
        recyclerView.setLayoutManager(new LinearLayoutManager(mainActivity, 0, false));
        recyclerView.setAdapter(new AdapterShortcut(mainActivity, false, 2, null));
        this.adapterColors = new AdapterColors(mainActivity, C1106R.drawable.ic_baseline_add_24, this, 0, true);
        this.adapterSize = new AdapterSize(mainActivity, this, false);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(C1106R.id.colorList);
        recyclerView2.setLayoutManager(new LinearLayoutManager(mainActivity, 0, false));
        AdapterColors adapterColors = this.adapterColors;
        if (adapterColors == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterColors");
            adapterColors = null;
        }
        recyclerView2.setAdapter(adapterColors);
        View viewFindViewById2 = findViewById(C1106R.id.listSize);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        RecyclerView recyclerView3 = (RecyclerView) viewFindViewById2;
        recyclerView3.setLayoutManager(new LinearLayoutManager(mainActivity, 0, false));
        AdapterSize adapterSize = this.adapterSize;
        if (adapterSize == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterSize");
            adapterSize = null;
        }
        recyclerView3.setAdapter(adapterSize);
        onTheme(BubblePrefs.INSTANCE.get(mainActivity), 0);
        ((FrameLayout) findViewById(C1106R.id.iconLayout)).setOnLongClickListener(new View.OnLongClickListener() { // from class: com.alexmanzana.bubbleall.MainActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return MainActivity.onCreate$lambda$1(this.f$0, view);
            }
        });
        ImageView imageView2 = this.button;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("button");
            imageView2 = null;
        }
        imageView2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.alexmanzana.bubbleall.MainActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return MainActivity.onCreate$lambda$2(this.f$0, view);
            }
        });
        ImageView imageView3 = this.button;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("button");
        } else {
            imageView = imageView3;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.MainActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.onCreate$lambda$4(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(MainActivity this$0, ValueAnimator valueAnimator1) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(valueAnimator1, "valueAnimator1");
        ImageView imageView = this$0.button;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("button");
            imageView = null;
        }
        Object animatedValue = valueAnimator1.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        imageView.setScaleX(((Float) animatedValue).floatValue());
        ImageView imageView3 = this$0.button;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("button");
        } else {
            imageView2 = imageView3;
        }
        Object animatedValue2 = valueAnimator1.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        imageView2.setScaleY(((Float) animatedValue2).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$1(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ImageView imageView = this$0.button;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("button");
            imageView = null;
        }
        return imageView.performLongClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$2(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(this$0);
        materialAlertDialogBuilder.setTitle(C1106R.string.app_name);
        materialAlertDialogBuilder.setMessage(C1106R.string.text_start);
        materialAlertDialogBuilder.setPositiveButton(C1106R.string.text_accept, (DialogInterface.OnClickListener) null);
        materialAlertDialogBuilder.show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(final MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = this$0.getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            MainActivity$$ExternalSyntheticApiModelOutline0.m337m();
            NotificationChannel notificationChannelM331m = MainActivity$$ExternalSyntheticApiModelOutline0.m331m("channel_service", this$0.getString(C1106R.string.text_channel), 2);
            MainActivity$$ExternalSyntheticApiModelOutline0.m337m();
            NotificationChannel notificationChannelM331m2 = MainActivity$$ExternalSyntheticApiModelOutline0.m331m("music_channel", this$0.getString(C1106R.string.text_channel_music), 2);
            notificationChannelM331m.setSound(null, null);
            notificationChannelM331m.setImportance(2);
            notificationManager.createNotificationChannel(notificationChannelM331m);
            notificationManager.createNotificationChannel(notificationChannelM331m2);
        }
        MainActivity mainActivity = this$0;
        if (!android.provider.Settings.canDrawOverlays(mainActivity)) {
            MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(mainActivity);
            materialAlertDialogBuilder.setTitle(C1106R.string.text_draw_overlays);
            materialAlertDialogBuilder.setMessage(C1106R.string.text_draw_overlays_message);
            materialAlertDialogBuilder.setPositiveButton(C1106R.string.text_continue, new DialogInterface.OnClickListener() { // from class: com.alexmanzana.bubbleall.MainActivity$$ExternalSyntheticLambda9
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    MainActivity.onCreate$lambda$4$lambda$3(this.f$0, dialogInterface, i);
                }
            });
            materialAlertDialogBuilder.setNegativeButton(C1106R.string.text_cancel, (DialogInterface.OnClickListener) null);
            materialAlertDialogBuilder.show();
            return;
        }
        BubbleService.INSTANCE.start(mainActivity);
        this$0.verifyButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4$lambda$3(MainActivity this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:" + this$0.getPackageName()));
        this$0.startActivity(intent);
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
        verifyButton();
        AdapterSize adapterSize = this.adapterSize;
        AdapterColors adapterColors = null;
        if (adapterSize == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterSize");
            adapterSize = null;
        }
        adapterSize.refresh();
        AdapterColors adapterColors2 = this.adapterColors;
        if (adapterColors2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterColors");
        } else {
            adapterColors = adapterColors2;
        }
        MainActivity mainActivity = this;
        adapterColors.refresh(mainActivity, true);
        ((FrameLayout) findViewById(C1106R.id.iconLayout)).getBackground().setTint(BubblePrefs.INSTANCE.get(mainActivity).getColorBubble());
    }

    private final void verifyButton() {
        ImageView imageView = null;
        if (BubbleService.INSTANCE.isStarting()) {
            ValueAnimator valueAnimator = this.animationButton;
            if (valueAnimator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("animationButton");
                valueAnimator = null;
            }
            valueAnimator.pause();
            ImageView imageView2 = this.button;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("button");
                imageView2 = null;
            }
            imageView2.setScaleX(1.0f);
            ImageView imageView3 = this.button;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("button");
                imageView3 = null;
            }
            imageView3.setScaleY(1.0f);
            ImageView imageView4 = this.button;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("button");
            } else {
                imageView = imageView4;
            }
            imageView.setImageResource(C1106R.drawable.ic_baseline_stop_24);
            return;
        }
        ValueAnimator valueAnimator2 = this.animationButton;
        if (valueAnimator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animationButton");
            valueAnimator2 = null;
        }
        valueAnimator2.start();
        ImageView imageView5 = this.button;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("button");
        } else {
            imageView = imageView5;
        }
        imageView.setImageResource(C1106R.drawable.ic_baseline_play_arrow_24);
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerTheme
    public void onTheme(ItemTheme theme, int position) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        SharedPreferences.Editor editorEdit = getSharedPreferences("bubble_data_prefs", 0).edit();
        ((FrameLayout) findViewById(C1106R.id.iconLayout)).getBackground().setTint(theme.getColorBubble());
        String uuid = theme.getUuid();
        if (uuid == null) {
            uuid = "";
        }
        editorEdit.putString("theme_selected", uuid);
        editorEdit.apply();
        if (BubbleService.INSTANCE.isStarting()) {
            sendBroadcast(new Intent("com.alexmanzana.bubbleall.ACTION_MODIFY_BUBBLE"));
        }
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerTheme
    public void onClick() {
        startActivity(new Intent(this, (Class<?>) BubbleColorActivity.class));
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerSize
    public void onSize(int position) {
        SharedPreferences.Editor editorEdit = getSharedPreferences("bubble_data_prefs", 0).edit();
        editorEdit.putInt("theme_size", position);
        editorEdit.apply();
        if (BubbleService.INSTANCE.isStarting()) {
            sendBroadcast(new Intent("com.alexmanzana.bubbleall.ACTION_MODIFY_BUBBLE"));
        }
    }
}
