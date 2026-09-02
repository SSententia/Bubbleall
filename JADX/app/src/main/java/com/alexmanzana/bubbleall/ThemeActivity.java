package com.alexmanzana.bubbleall;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.WallpaperManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.adapters.AdapterColors;
import com.alexmanzana.bubbleall.listeners.ListenerTheme;
import com.alexmanzana.bubbleall.pojos.ItemTheme;
import com.alexmanzana.bubbleall.utils.AdBlock;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.pes.androidmaterialcolorpickerdialog.ColorPicker;
import com.pes.androidmaterialcolorpickerdialog.ColorPickerCallback;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThemeActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f*\u0005\r\u0010\u0013\u0016\u0019\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\"H\u0002J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\"H\u0002J\b\u0010)\u001a\u00020\"H\u0002J\b\u0010*\u001a\u00020\"H\u0016J\u0012\u0010+\u001a\u00020\"2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0012\u0010.\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u000100H\u0015J\b\u00101\u001a\u00020\"H\u0014J \u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020'2\u0006\u00104\u001a\u00020'2\u0006\u00105\u001a\u00020'H\u0002J(\u00106\u001a\u00020\"2\u0006\u00107\u001a\u00020'2\u0006\u00108\u001a\u00020'2\u0006\u00103\u001a\u00020'2\u0006\u00109\u001a\u00020'H\u0002J\u0010\u0010:\u001a\u00020\"2\u0006\u0010;\u001a\u00020\u0005H\u0002J\u0010\u00104\u001a\u00020\"2\u0006\u0010&\u001a\u00020'H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, m495d2 = {"Lcom/alexmanzana/bubbleall/ThemeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "adapter1", "Lcom/alexmanzana/bubbleall/adapters/AdapterColors;", "adapter2", "adapter3", "adapter4", "adapter5", "isFinish", "", "listenerList1", "com/alexmanzana/bubbleall/ThemeActivity$listenerList1$1", "Lcom/alexmanzana/bubbleall/ThemeActivity$listenerList1$1;", "listenerList2", "com/alexmanzana/bubbleall/ThemeActivity$listenerList2$1", "Lcom/alexmanzana/bubbleall/ThemeActivity$listenerList2$1;", "listenerList3", "com/alexmanzana/bubbleall/ThemeActivity$listenerList3$1", "Lcom/alexmanzana/bubbleall/ThemeActivity$listenerList3$1;", "listenerList4", "com/alexmanzana/bubbleall/ThemeActivity$listenerList4$1", "Lcom/alexmanzana/bubbleall/ThemeActivity$listenerList4$1;", "listenerList5", "com/alexmanzana/bubbleall/ThemeActivity$listenerList5$1", "Lcom/alexmanzana/bubbleall/ThemeActivity$listenerList5$1;", "mHandler", "Landroid/os/Handler;", "themeCreating", "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;", "uuid", "", "animationStart", "", "animationStart2", "animationStart3", "dialogColor", "color", "", "loadAd", "loadInterstitial", "onBackPressed", "onClick", "p0", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "oneBubblePreview", "color1", "text", "layout", "secondBubble", "text1", "text2", "color2", "selectColor", "adapter", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class ThemeActivity extends AppCompatActivity implements View.OnClickListener {
    private AdapterColors adapter1;
    private AdapterColors adapter2;
    private AdapterColors adapter3;
    private AdapterColors adapter4;
    private AdapterColors adapter5;
    private boolean isFinish;
    private Handler mHandler;
    private String uuid;
    private final ItemTheme themeCreating = ItemTheme.INSTANCE.m720default();
    private final ThemeActivity$listenerList1$1 listenerList1 = new ListenerTheme() { // from class: com.alexmanzana.bubbleall.ThemeActivity$listenerList1$1
        @Override // com.alexmanzana.bubbleall.listeners.ListenerTheme
        public void onTheme(ItemTheme theme, int position) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.this$0.oneBubblePreview(theme.getColorBubble(), C1106R.string.text_bubble_color, C1106R.drawable.background_bubble_adapter);
            this.this$0.themeCreating.setColorBubble(theme.getColorBubble());
        }

        @Override // com.alexmanzana.bubbleall.listeners.ListenerTheme
        public void onClick() {
            ThemeActivity themeActivity = this.this$0;
            AdapterColors adapterColors = themeActivity.adapter1;
            if (adapterColors == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter1");
                adapterColors = null;
            }
            themeActivity.selectColor(adapterColors);
        }
    };
    private final ThemeActivity$listenerList2$1 listenerList2 = new ListenerTheme() { // from class: com.alexmanzana.bubbleall.ThemeActivity$listenerList2$1
        @Override // com.alexmanzana.bubbleall.listeners.ListenerTheme
        public void onTheme(ItemTheme theme, int position) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.this$0.secondBubble(C1106R.string.text_color_tab_select, C1106R.string.text_color_tab, theme.getColorTab(), this.this$0.themeCreating.getColorCurrentTab());
            this.this$0.themeCreating.setColorTab(theme.getColorTab());
        }

        @Override // com.alexmanzana.bubbleall.listeners.ListenerTheme
        public void onClick() {
            ThemeActivity themeActivity = this.this$0;
            AdapterColors adapterColors = themeActivity.adapter2;
            if (adapterColors == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter2");
                adapterColors = null;
            }
            themeActivity.selectColor(adapterColors);
        }
    };
    private final ThemeActivity$listenerList3$1 listenerList3 = new ListenerTheme() { // from class: com.alexmanzana.bubbleall.ThemeActivity$listenerList3$1
        @Override // com.alexmanzana.bubbleall.listeners.ListenerTheme
        public void onTheme(ItemTheme theme, int position) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.this$0.secondBubble(C1106R.string.text_color_tab, C1106R.string.text_color_tab_select, theme.getColorCurrentTab(), this.this$0.themeCreating.getColorTab());
            this.this$0.themeCreating.setColorCurrentTab(theme.getColorCurrentTab());
        }

        @Override // com.alexmanzana.bubbleall.listeners.ListenerTheme
        public void onClick() {
            ThemeActivity themeActivity = this.this$0;
            AdapterColors adapterColors = themeActivity.adapter3;
            if (adapterColors == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter3");
                adapterColors = null;
            }
            themeActivity.selectColor(adapterColors);
        }
    };
    private final ThemeActivity$listenerList4$1 listenerList4 = new ListenerTheme() { // from class: com.alexmanzana.bubbleall.ThemeActivity$listenerList4$1
        @Override // com.alexmanzana.bubbleall.listeners.ListenerTheme
        public void onTheme(ItemTheme theme, int position) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.this$0.oneBubblePreview(theme.getColorWindow(), C1106R.string.text_color_window, C1106R.drawable.background_window_adapter);
            this.this$0.themeCreating.setColorWindow(theme.getColorWindow());
        }

        @Override // com.alexmanzana.bubbleall.listeners.ListenerTheme
        public void onClick() {
            ThemeActivity themeActivity = this.this$0;
            AdapterColors adapterColors = themeActivity.adapter4;
            if (adapterColors == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter4");
                adapterColors = null;
            }
            themeActivity.selectColor(adapterColors);
        }
    };
    private final ThemeActivity$listenerList5$1 listenerList5 = new ListenerTheme() { // from class: com.alexmanzana.bubbleall.ThemeActivity$listenerList5$1
        @Override // com.alexmanzana.bubbleall.listeners.ListenerTheme
        public void onTheme(ItemTheme theme, int position) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.this$0.text(theme.getColorInternal());
            this.this$0.themeCreating.setColorInternal(theme.getColorInternal());
        }

        @Override // com.alexmanzana.bubbleall.listeners.ListenerTheme
        public void onClick() {
            ThemeActivity themeActivity = this.this$0;
            AdapterColors adapterColors = themeActivity.adapter5;
            if (adapterColors == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter5");
                adapterColors = null;
            }
            themeActivity.selectColor(adapterColors);
        }
    };

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String stringExtra;
        super.onCreate(savedInstanceState);
        setContentView(C1106R.layout.activity_theme);
        ((FloatingActionButton) findViewById(C1106R.id.finishActivity)).setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.ThemeActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThemeActivity.onCreate$lambda$0(this.f$0, view);
            }
        });
        ((MaterialButton) findViewById(C1106R.id.cancelButton)).setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.ThemeActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThemeActivity.onCreate$lambda$1(this.f$0, view);
            }
        });
        ((MaterialButton) findViewById(C1106R.id.acceptButton)).setOnClickListener(this);
        ((MaterialButton) findViewById(C1106R.id.nextButton)).setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.ThemeActivity$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThemeActivity.onCreate$lambda$2(this.f$0, view);
            }
        });
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        this.mHandler = new Handler(looperMyLooper);
        View viewFindViewById = findViewById(C1106R.id.list1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = findViewById(C1106R.id.list2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        RecyclerView recyclerView2 = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C1106R.id.list3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        RecyclerView recyclerView3 = (RecyclerView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C1106R.id.list4);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        RecyclerView recyclerView4 = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C1106R.id.list5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        RecyclerView recyclerView5 = (RecyclerView) viewFindViewById5;
        ThemeActivity themeActivity = this;
        this.adapter1 = new AdapterColors(themeActivity, C1106R.drawable.ic_baseline_color_lens_24, this.listenerList1, 0, false);
        this.adapter2 = new AdapterColors(themeActivity, C1106R.drawable.ic_baseline_color_lens_24, this.listenerList2, 2, false);
        this.adapter3 = new AdapterColors(themeActivity, C1106R.drawable.ic_baseline_color_lens_24, this.listenerList3, 1, false);
        this.adapter4 = new AdapterColors(themeActivity, C1106R.drawable.ic_baseline_color_lens_24, this.listenerList4, 3, false);
        this.adapter5 = new AdapterColors(themeActivity, C1106R.drawable.ic_baseline_color_lens_24, this.listenerList5, 4, false);
        recyclerView.setLayoutManager(new LinearLayoutManager(themeActivity, 0, false));
        recyclerView2.setLayoutManager(new LinearLayoutManager(themeActivity, 0, false));
        recyclerView3.setLayoutManager(new LinearLayoutManager(themeActivity, 0, false));
        recyclerView4.setLayoutManager(new LinearLayoutManager(themeActivity, 0, false));
        recyclerView5.setLayoutManager(new LinearLayoutManager(themeActivity, 0, false));
        AdapterColors adapterColors = this.adapter1;
        if (adapterColors == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter1");
            adapterColors = null;
        }
        recyclerView.setAdapter(adapterColors);
        AdapterColors adapterColors2 = this.adapter2;
        if (adapterColors2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter2");
            adapterColors2 = null;
        }
        recyclerView2.setAdapter(adapterColors2);
        AdapterColors adapterColors3 = this.adapter3;
        if (adapterColors3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter3");
            adapterColors3 = null;
        }
        recyclerView3.setAdapter(adapterColors3);
        AdapterColors adapterColors4 = this.adapter4;
        if (adapterColors4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter4");
            adapterColors4 = null;
        }
        recyclerView4.setAdapter(adapterColors4);
        AdapterColors adapterColors5 = this.adapter5;
        if (adapterColors5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter5");
            adapterColors5 = null;
        }
        recyclerView5.setAdapter(adapterColors5);
        oneBubblePreview(this.themeCreating.getColorBubble(), C1106R.string.text_bubble_color, C1106R.drawable.background_bubble_adapter);
        String stringExtra2 = getIntent().getStringExtra("uuid");
        if (stringExtra2 != null && stringExtra2.length() != 0) {
            Intent intent = getIntent();
            if (intent == null || (stringExtra = intent.getStringExtra("uuid")) == null) {
                stringExtra = "";
            }
            this.uuid = stringExtra;
            BubblePrefs.Companion companion = BubblePrefs.INSTANCE;
            String str = this.uuid;
            if (str == null) {
                str = "";
            }
            if (companion.exists(themeActivity, str)) {
                View viewFindViewById6 = findViewById(C1106R.id.inputText);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
                TextInputEditText textInputEditText = (TextInputEditText) viewFindViewById6;
                BubblePrefs.Companion companion2 = BubblePrefs.INSTANCE;
                String str2 = this.uuid;
                ItemTheme itemTheme = companion2.get(themeActivity, str2 != null ? str2 : "");
                if (itemTheme != null) {
                    textInputEditText.setText(itemTheme.getName());
                    AdapterColors adapterColors6 = this.adapter1;
                    if (adapterColors6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter1");
                        adapterColors6 = null;
                    }
                    adapterColors6.addColor(ItemTheme.INSTANCE.forVal(itemTheme.getColorBubble()));
                    AdapterColors adapterColors7 = this.adapter2;
                    if (adapterColors7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter2");
                        adapterColors7 = null;
                    }
                    adapterColors7.addColor(ItemTheme.INSTANCE.forVal(itemTheme.getColorTab()));
                    AdapterColors adapterColors8 = this.adapter3;
                    if (adapterColors8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter3");
                        adapterColors8 = null;
                    }
                    adapterColors8.addColor(ItemTheme.INSTANCE.forVal(itemTheme.getColorCurrentTab()));
                    AdapterColors adapterColors9 = this.adapter4;
                    if (adapterColors9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter4");
                        adapterColors9 = null;
                    }
                    adapterColors9.addColor(ItemTheme.INSTANCE.forVal(itemTheme.getColorWindow()));
                    AdapterColors adapterColors10 = this.adapter5;
                    if (adapterColors10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter5");
                        adapterColors10 = null;
                    }
                    adapterColors10.addColor(ItemTheme.INSTANCE.forVal(itemTheme.getColorInternal()));
                    this.themeCreating.setColorBubble(itemTheme.getColorBubble());
                    this.themeCreating.setColorCurrentTab(itemTheme.getColorCurrentTab());
                    this.themeCreating.setColorTab(itemTheme.getColorTab());
                    this.themeCreating.setColorWindow(itemTheme.getColorWindow());
                    this.themeCreating.setColorInternal(itemTheme.getColorInternal());
                    oneBubblePreview(itemTheme.getColorBubble(), C1106R.string.text_bubble_color, C1106R.drawable.background_bubble_adapter);
                }
            }
            Intent intent2 = getIntent();
            if (intent2 != null && intent2.getBooleanExtra("duplicate", false)) {
                this.uuid = null;
            }
        }
        if (Build.VERSION.SDK_INT >= 33) {
            View viewFindViewById7 = findViewById(C1106R.id.frameLayout);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            RelativeLayout relativeLayout = (RelativeLayout) viewFindViewById7;
            relativeLayout.setBackgroundColor(Color.parseColor("#3b608f"));
            relativeLayout.setClipToOutline(true);
            return;
        }
        if (ActivityCompat.checkSelfPermission(themeActivity, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            View viewFindViewById8 = findViewById(C1106R.id.frameLayout);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            RelativeLayout relativeLayout2 = (RelativeLayout) viewFindViewById8;
            relativeLayout2.setBackground(WallpaperManager.getInstance(themeActivity).getDrawable());
            relativeLayout2.setClipToOutline(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(ThemeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(ThemeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(ThemeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((NestedScrollView) this$0.findViewById(C1106R.id.layoutMain)).setVisibility(8);
        ((NestedScrollView) this$0.findViewById(C1106R.id.layoutAdd)).setVisibility(0);
        this$0.isFinish = true;
        this$0.animationStart();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        loadAd();
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.isFinish) {
            ((NestedScrollView) findViewById(C1106R.id.layoutMain)).setVisibility(0);
            ((NestedScrollView) findViewById(C1106R.id.layoutAdd)).setVisibility(8);
            this.isFinish = false;
            return;
        }
        super.onBackPressed();
    }

    private final void animationStart() {
        View viewFindViewById = findViewById(C1106R.id.miniWindow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ((LinearLayout) viewFindViewById).setVisibility(8);
        View viewFindViewById2 = findViewById(C1106R.id.miniBubble);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
        frameLayout.setY(0.0f);
        frameLayout.setX(0.0f);
        frameLayout.getBackground().setTint(this.themeCreating.getColorBubble());
        frameLayout.setVisibility(8);
        Handler handler = this.mHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
            handler = null;
        }
        handler.postDelayed(new Runnable() { // from class: com.alexmanzana.bubbleall.ThemeActivity$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                ThemeActivity.animationStart$lambda$5(frameLayout, this);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationStart$lambda$5(final FrameLayout bubble, final ThemeActivity this$0) {
        Intrinsics.checkNotNullParameter(bubble, "$bubble");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bubble.setVisibility(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(bubble.getY(), 100.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alexmanzana.bubbleall.ThemeActivity$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ThemeActivity.animationStart$lambda$5$lambda$4(bubble, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.alexmanzana.bubbleall.ThemeActivity$animationStart$1$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                if (this.this$0.isFinish) {
                    this.this$0.animationStart2();
                }
            }
        });
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationStart$lambda$5$lambda$4(FrameLayout bubble, ValueAnimator valueAnimator1) {
        Intrinsics.checkNotNullParameter(bubble, "$bubble");
        Intrinsics.checkNotNullParameter(valueAnimator1, "valueAnimator1");
        try {
            Object animatedValue = valueAnimator1.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            bubble.setY(((Float) animatedValue).floatValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animationStart2() {
        Handler handler = this.mHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
            handler = null;
        }
        handler.postDelayed(new Runnable() { // from class: com.alexmanzana.bubbleall.ThemeActivity$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                ThemeActivity.animationStart2$lambda$8(this.f$0);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationStart2$lambda$8(final ThemeActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View viewFindViewById = this$0.findViewById(C1106R.id.frameLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = this$0.findViewById(C1106R.id.miniBubble);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
        float x = frameLayout.getX();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(frameLayout.getY(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alexmanzana.bubbleall.ThemeActivity$$ExternalSyntheticLambda12
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ThemeActivity.animationStart2$lambda$8$lambda$6(frameLayout, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(150L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(x, ((RelativeLayout) viewFindViewById).getWidth() - frameLayout.getWidth());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alexmanzana.bubbleall.ThemeActivity$$ExternalSyntheticLambda13
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ThemeActivity.animationStart2$lambda$8$lambda$7(frameLayout, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.setDuration(150L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat2, valueAnimatorOfFloat);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.alexmanzana.bubbleall.ThemeActivity$animationStart2$1$3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                if (this.this$0.isFinish) {
                    this.this$0.animationStart3();
                }
            }
        });
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationStart2$lambda$8$lambda$6(FrameLayout bubble, ValueAnimator valueAnimator1) {
        Intrinsics.checkNotNullParameter(bubble, "$bubble");
        Intrinsics.checkNotNullParameter(valueAnimator1, "valueAnimator1");
        Object animatedValue = valueAnimator1.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        bubble.setY(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationStart2$lambda$8$lambda$7(FrameLayout bubble, ValueAnimator valueAnimator1) {
        Intrinsics.checkNotNullParameter(bubble, "$bubble");
        Intrinsics.checkNotNullParameter(valueAnimator1, "valueAnimator1");
        Object animatedValue = valueAnimator1.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        bubble.setX(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animationStart3() {
        View viewFindViewById = findViewById(C1106R.id.miniWindow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = findViewById(C1106R.id.miniWindowBackground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = findViewById(C1106R.id.iconMiniWindow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = findViewById(C1106R.id.titleMiniWindow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ((LinearLayout) viewFindViewById).setVisibility(0);
        ((RelativeLayout) viewFindViewById2).getBackground().setTint(this.themeCreating.getColorWindow());
        ((TextView) viewFindViewById4).setTextColor(this.themeCreating.getColorInternal());
        ((ImageView) viewFindViewById3).setColorFilter(this.themeCreating.getColorInternal());
        View viewFindViewById5 = findViewById(C1106R.id.miniBubble);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        ((FrameLayout) viewFindViewById5).setVisibility(8);
        View viewFindViewById6 = findViewById(C1106R.id.tab1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        final FrameLayout frameLayout = (FrameLayout) viewFindViewById6;
        View viewFindViewById7 = findViewById(C1106R.id.tab2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        final FrameLayout frameLayout2 = (FrameLayout) viewFindViewById7;
        frameLayout.setBackgroundResource(C1106R.drawable.ic_bubble_small);
        frameLayout2.setBackgroundResource(C1106R.drawable.ic_bubble_small);
        frameLayout.getBackground().setTint(this.themeCreating.getColorCurrentTab());
        frameLayout2.getBackground().setTint(this.themeCreating.getColorTab());
        Handler handler = this.mHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
            handler = null;
        }
        handler.postDelayed(new Runnable() { // from class: com.alexmanzana.bubbleall.ThemeActivity$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                ThemeActivity.animationStart3$lambda$10(frameLayout, this, frameLayout2);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationStart3$lambda$10(FrameLayout tab1, final ThemeActivity this$0, FrameLayout tab2) {
        Intrinsics.checkNotNullParameter(tab1, "$tab1");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tab2, "$tab2");
        tab1.getBackground().setTint(this$0.themeCreating.getColorTab());
        tab2.getBackground().setTint(this$0.themeCreating.getColorCurrentTab());
        Handler handler = this$0.mHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
            handler = null;
        }
        handler.postDelayed(new Runnable() { // from class: com.alexmanzana.bubbleall.ThemeActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ThemeActivity.animationStart3$lambda$10$lambda$9(this.f$0);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationStart3$lambda$10$lambda$9(ThemeActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isFinish) {
            this$0.animationStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectColor(final AdapterColors adapter) {
        ColorPicker colorPicker = new ColorPicker(this);
        colorPicker.enableAutoClose();
        colorPicker.setCallback(new ColorPickerCallback() { // from class: com.alexmanzana.bubbleall.ThemeActivity$$ExternalSyntheticLambda3
            @Override // com.pes.androidmaterialcolorpickerdialog.ColorPickerCallback
            public final void onColorChosen(int i) {
                ThemeActivity.selectColor$lambda$11(adapter, i);
            }
        });
        colorPicker.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void selectColor$lambda$11(AdapterColors adapter, int i) {
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        adapter.addColor(ItemTheme.INSTANCE.forVal(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oneBubblePreview(final int color1, int text, int layout) {
        View viewFindViewById = findViewById(C1106R.id.bubbleTextPreview);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        textView.setVisibility(0);
        textView.setText(text);
        ((TextView) findViewById(C1106R.id.textInternal)).setVisibility(8);
        ((LinearLayout) findViewById(C1106R.id.secondLayout)).setVisibility(8);
        ((LinearLayout) findViewById(C1106R.id.bubbleLayout)).setVisibility(0);
        View viewFindViewById2 = findViewById(C1106R.id.bubblePreview);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
        frameLayout.setBackgroundResource(layout);
        frameLayout.setVisibility(0);
        Drawable background = frameLayout.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(color1);
        frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.alexmanzana.bubbleall.ThemeActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ThemeActivity.oneBubblePreview$lambda$12(this.f$0, color1, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean oneBubblePreview$lambda$12(ThemeActivity this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dialogColor(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void text(int color) {
        View viewFindViewById = findViewById(C1106R.id.textInternal);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        textView.setVisibility(0);
        textView.setTextColor(color);
        ((TextView) findViewById(C1106R.id.bubbleTextPreview)).setVisibility(8);
        ((FrameLayout) findViewById(C1106R.id.bubblePreview)).setVisibility(8);
        ((LinearLayout) findViewById(C1106R.id.secondLayout)).setVisibility(8);
        ((LinearLayout) findViewById(C1106R.id.bubbleLayout)).setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void secondBubble(int text1, int text2, final int color1, final int color2) {
        ((TextView) findViewById(C1106R.id.textInternal)).setVisibility(8);
        ((LinearLayout) findViewById(C1106R.id.secondLayout)).setVisibility(0);
        ((LinearLayout) findViewById(C1106R.id.bubbleLayout)).setVisibility(0);
        View viewFindViewById = findViewById(C1106R.id.bubbleTextPreview);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C1106R.id.bubblePreview);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(C1106R.id.secondPreview);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        FrameLayout frameLayout2 = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(C1106R.id.secondTextPreview);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById4;
        textView.setVisibility(0);
        textView2.setVisibility(0);
        textView.setText(text1);
        textView2.setText(text2);
        frameLayout.setVisibility(0);
        frameLayout2.setVisibility(0);
        frameLayout.setBackgroundResource(C1106R.drawable.background_bubble_adapter);
        frameLayout2.setBackgroundResource(C1106R.drawable.background_bubble_adapter);
        Drawable background = frameLayout.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(color1);
        Drawable background2 = frameLayout2.getBackground();
        Intrinsics.checkNotNull(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background2).setColor(color2);
        frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.alexmanzana.bubbleall.ThemeActivity$$ExternalSyntheticLambda10
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ThemeActivity.secondBubble$lambda$13(this.f$0, color1, view);
            }
        });
        frameLayout2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.alexmanzana.bubbleall.ThemeActivity$$ExternalSyntheticLambda11
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ThemeActivity.secondBubble$lambda$14(this.f$0, color2, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean secondBubble$lambda$13(ThemeActivity this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dialogColor(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean secondBubble$lambda$14(ThemeActivity this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dialogColor(i);
        return true;
    }

    private final void dialogColor(final int color) {
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(this);
        materialAlertDialogBuilder.setTitle(C1106R.string.text_title_color);
        materialAlertDialogBuilder.setMessage((CharSequence) ("#" + Integer.toHexString(color)));
        materialAlertDialogBuilder.setPositiveButton(C1106R.string.text_accept, (DialogInterface.OnClickListener) null);
        materialAlertDialogBuilder.setNegativeButton(C1106R.string.text_close_short, (DialogInterface.OnClickListener) null);
        materialAlertDialogBuilder.setNeutralButton(C1106R.string.text_copy, new DialogInterface.OnClickListener() { // from class: com.alexmanzana.bubbleall.ThemeActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ThemeActivity.dialogColor$lambda$15(this.f$0, color, dialogInterface, i);
            }
        });
        materialAlertDialogBuilder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogColor$lambda$15(ThemeActivity this$0, int i, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Object systemService = this$0.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(this$0.getString(C1106R.string.text_color), Integer.toHexString(i)));
            Toast.makeText(this$0, C1106R.string.text_copy_success, 0).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View p0) {
        Unit unit;
        View viewFindViewById = findViewById(C1106R.id.inputText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextInputEditText textInputEditText = (TextInputEditText) viewFindViewById;
        Editable text = textInputEditText.getText();
        if (text == null || text.length() == 0) {
            Toast.makeText(this, C1106R.string.text_input_text, 0).show();
            return;
        }
        this.themeCreating.setName(String.valueOf(textInputEditText.getText()));
        String str = this.uuid;
        if (str != null) {
            this.themeCreating.setUuid(str);
            BubblePrefs.INSTANCE.edit(this, this.themeCreating);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.themeCreating.setUuid(UUID.randomUUID().toString());
            BubblePrefs.INSTANCE.addTheme(this, this.themeCreating);
        }
        if (!AdBlock.INSTANCE.removerAd(this)) {
            loadInterstitial();
        } else {
            finish();
        }
    }

    private final void loadInterstitial() {
        ((FrameLayout) findViewById(C1106R.id.contentTheme)).setVisibility(8);
        ((ProgressBar) findViewById(C1106R.id.progressAd)).setVisibility(0);
        InterstitialAd.load(this, AdBlock.INSTANCE.getInterstitialUuid(), new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: com.alexmanzana.bubbleall.ThemeActivity.loadInterstitial.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd ad) {
                Intrinsics.checkNotNullParameter(ad, "ad");
                final ThemeActivity themeActivity = ThemeActivity.this;
                ad.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.alexmanzana.bubbleall.ThemeActivity$loadInterstitial$1$onAdLoaded$1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        themeActivity.finish();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        themeActivity.finish();
                    }
                });
                ad.show(ThemeActivity.this);
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ThemeActivity.this.finish();
            }
        });
    }
}
