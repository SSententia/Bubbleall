package com.alexmanzana.bubbleall.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.media2.session.MediaConstants;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.VideoActivity;
import com.alexmanzana.bubbleall.adapters.AdapterVideo;
import com.alexmanzana.bubbleall.listeners.ListenerListVideo;
import com.alexmanzana.bubbleall.listeners.ListenerVideo;
import com.alexmanzana.bubbleall.pojos.ItemVideo;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import com.alexmanzana.bubbleall.utils.VideoPrefs;
import com.alexmanzana.bubbleall.window.ButtonToolbar;
import com.alexmanzana.bubbleall.window.Panel;
import com.bumptech.glide.Glide;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoView.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B%\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020\u001eH\u0002J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u001eH\u0016J \u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u0010H\u0016J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\u0012\u0010.\u001a\u00020\u001e2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020\u001eH\u0016J\b\u00102\u001a\u00020\u001eH\u0016J\u0010\u00103\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0016J\"\u00104\u001a\u00020\u001e2\b\u0010/\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0010H\u0016J\u0012\u00108\u001a\u00020\u001e2\b\u0010/\u001a\u0004\u0018\u000105H\u0016J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010/\u001a\u000205H\u0016J\b\u0010:\u001a\u00020\u001eH\u0016J\b\u0010;\u001a\u00020\u001eH\u0016J\b\u0010<\u001a\u00020\u001eH\u0002R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0015j\b\u0012\u0004\u0012\u00020\u0013`\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000¨\u0006="}, m495d2 = {"Lcom/alexmanzana/bubbleall/views/VideoView;", "Lcom/alexmanzana/bubbleall/window/Panel;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;", "Landroid/media/MediaPlayer$OnCompletionListener;", "Landroid/media/MediaPlayer$OnPreparedListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;", "isOpenBucket", "", "isRepeat", "itemCurrent", "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;", "listVideos", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mHandler", "Landroid/os/Handler;", "updaterProgress", "Ljava/lang/Runnable;", "videoPlayer", "Landroid/widget/VideoView;", "args", "", "item", "", "declareStyle", "favoriteMode", "loadPlayVideo", MediaConstants.MEDIA_URI_QUERY_URI, "Landroid/net/Uri;", "onBackPressed", "onBucket", "position", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "onChangeOrientation", "isVertical", "onClick", "onCompletion", "p0", "Landroid/media/MediaPlayer;", "onCreate", "onDestroy", "onPrepared", "onProgressChanged", "Landroid/widget/SeekBar;", NotificationCompat.CATEGORY_PROGRESS, "p2", "onStartTrackingTouch", "onStopTrackingTouch", "pauseMedia", "start", "updateFavorite", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class VideoView extends Panel implements SeekBar.OnSeekBarChangeListener, ListenerVideo, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener {
    private AdapterVideo adapter;
    private boolean isOpenBucket;
    private boolean isRepeat;
    private ItemVideo itemCurrent;
    private final ArrayList<ItemVideo> listVideos;
    private Handler mHandler;
    private final Runnable updaterProgress;
    private android.widget.VideoView videoPlayer;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VideoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.listVideos = new ArrayList<>();
        this.updaterProgress = new Runnable() { // from class: com.alexmanzana.bubbleall.views.VideoView$updaterProgress$1
            @Override // java.lang.Runnable
            public void run() {
                TextView textView = (TextView) this.this$0.findViewById(C1106R.id.currentTextVideo);
                View viewFindViewById = this.this$0.findViewById(C1106R.id.progressVideo);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                SeekBar seekBar = (SeekBar) viewFindViewById;
                android.widget.VideoView videoView = this.this$0.videoPlayer;
                Handler handler = null;
                if (videoView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoPlayer");
                    videoView = null;
                }
                int currentPosition = videoView.getCurrentPosition();
                seekBar.setProgress(currentPosition);
                textView.setText(VideoPrefs.INSTANCE.convertTime(currentPosition));
                Handler handler2 = this.this$0.mHandler;
                if (handler2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                } else {
                    handler = handler2;
                }
                handler.postDelayed(this, 100L);
            }
        };
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void pauseMedia() {
        View viewFindViewById = findViewById(C1106R.id.pauseButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        android.widget.VideoView videoView = this.videoPlayer;
        android.widget.VideoView videoView2 = null;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoPlayer");
            videoView = null;
        }
        if (videoView.isPlaying()) {
            android.widget.VideoView videoView3 = this.videoPlayer;
            if (videoView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoPlayer");
            } else {
                videoView2 = videoView3;
            }
            videoView2.pause();
            imageView.setImageResource(C1106R.drawable.ic_baseline_play_arrow_24);
            return;
        }
        android.widget.VideoView videoView4 = this.videoPlayer;
        if (videoView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoPlayer");
        } else {
            videoView2 = videoView4;
        }
        videoView2.start();
        imageView.setImageResource(C1106R.drawable.ic_pause);
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void onChangeOrientation(boolean isVertical) {
        RecyclerView recyclerView = (RecyclerView) findViewById(C1106R.id.listVideos);
        VideoPrefs.Companion companion = VideoPrefs.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iGrid = companion.grid(context, isVertical);
        if (iGrid != 0) {
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), iGrid));
        } else {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void start() {
        String string = getContext().getString(C1106R.string.text_video);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        requestTitle(string);
        requestIconToolbar(Integer.valueOf(C1106R.drawable.ic_baseline_video_24));
        if (this.isOpenBucket) {
            requestButtons(new ButtonToolbar(C1106R.drawable.ic_baseline_arrow_back_24, new Runnable() { // from class: com.alexmanzana.bubbleall.views.VideoView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoView.start$lambda$0(this.f$0);
                }
            }), new ButtonToolbar(C1106R.drawable.ic_baseline_star_outline_24, new Runnable() { // from class: com.alexmanzana.bubbleall.views.VideoView$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    VideoView.start$lambda$1(this.f$0);
                }
            }));
        } else {
            requestButtons(new ButtonToolbar(C1106R.drawable.ic_baseline_star_outline_24, new Runnable() { // from class: com.alexmanzana.bubbleall.views.VideoView$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    VideoView.start$lambda$2(this.f$0);
                }
            }));
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (checkPermission("android.permission.READ_MEDIA_VIDEO")) {
                start$action(this);
            }
        } else if (checkPermission("android.permission.READ_EXTERNAL_STORAGE")) {
            start$action(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(VideoView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1(VideoView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.favoriteMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$2(VideoView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.favoriteMode();
    }

    private static final void start$action(VideoView videoView) {
        videoView.updateFavorite();
        videoView.setVisibility(0);
        if (videoView.adapter == null) {
            VideoPrefs.Companion companion = VideoPrefs.INSTANCE;
            Context context = videoView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            VideoPrefs.Companion.list$default(companion, context, new VideoView$start$action$1$1(videoView, videoView), null, 4, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void updateFavorite() {
        String id;
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C1106R.id.favoriteCenter);
        ImageView imageView = (ImageView) findViewById(C1106R.id.favoriteImage);
        VideoPrefs.Companion companion = VideoPrefs.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ItemVideo itemVideo = this.itemCurrent;
        if (itemVideo == null || (id = itemVideo.getId()) == null) {
            id = "";
        }
        if (companion.isFavorite(context, id)) {
            relativeLayout.setBackgroundResource(C1106R.drawable.background_item_color_current);
            imageView.setImageResource(C1106R.drawable.ic_baseline_star_24);
            imageView.setColorFilter(ContextCompat.getColor(getContext(), C1106R.color.colorPrimary));
        } else {
            relativeLayout.setBackgroundResource(C1106R.drawable.background_item_color);
            imageView.setImageResource(C1106R.drawable.ic_baseline_star_outline_24);
            imageView.setColorFilter(Color.parseColor("#4d4d4d"));
        }
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void onCreate() {
        RelativeLayout.inflate(getContext(), C1106R.layout.layout_video_window, this);
        View viewFindViewById = findViewById(C1106R.id.videoView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.videoPlayer = (android.widget.VideoView) viewFindViewById;
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        this.mHandler = new Handler(looperMyLooper);
        ((ImageView) findViewById(C1106R.id.pauseButton)).setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.views.VideoView$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoView.onCreate$lambda$4(this.f$0, view);
            }
        });
        final BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((RelativeLayout) findViewById(C1106R.id.sheetVideo));
        View viewFindViewById2 = findViewById(C1106R.id.progressVideo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById(C1106R.id.buttonHideSheet);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C1106R.id.favoriteCenter);
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(C1106R.id.repeatCenter);
        ((SeekBar) viewFindViewById2).setOnSeekBarChangeListener(this);
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.views.VideoView$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoView.onCreate$lambda$9$lambda$5(this.f$0, view);
            }
        });
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.views.VideoView$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoView.onCreate$lambda$9$lambda$7(this.f$0, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.views.VideoView$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoView.onCreate$lambda$9$lambda$8(bottomSheetBehaviorFrom, view);
            }
        });
        bottomSheetBehaviorFrom.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() { // from class: com.alexmanzana.bubbleall.views.VideoView.onCreate.3
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View bottomSheet, float slideOffset) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View bottomSheet, int newState) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                ImageView imageView2 = (ImageView) VideoView.this.findViewById(C1106R.id.buttonHideSheet);
                if (newState == 3) {
                    imageView2.setImageResource(C1106R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    if (newState != 4) {
                        return;
                    }
                    imageView2.setImageResource(C1106R.drawable.ic_baseline_keyboard_arrow_up_24);
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            if (checkPermission("android.permission.READ_MEDIA_VIDEO")) {
                return;
            }
            setVisibility(8);
            startActivity(new Intent(getContext(), (Class<?>) VideoActivity.class));
            closeManager();
            return;
        }
        if (checkPermission("android.permission.READ_EXTERNAL_STORAGE")) {
            return;
        }
        setVisibility(8);
        startActivity(new Intent(getContext(), (Class<?>) VideoActivity.class));
        closeManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(VideoView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.pauseMedia();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$9$lambda$5(VideoView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = !this$0.isRepeat;
        this$0.isRepeat = z;
        if (z) {
            view.setBackgroundResource(C1106R.drawable.background_item_color_current);
        } else {
            view.setBackgroundResource(C1106R.drawable.background_item_color);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$9$lambda$7(VideoView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ItemVideo itemVideo = this$0.itemCurrent;
        if (itemVideo != null) {
            VideoPrefs.Companion companion = VideoPrefs.INSTANCE;
            Context context = this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String id = itemVideo.getId();
            if (id == null) {
                id = "";
            }
            if (companion.isFavorite(context, id)) {
                VideoPrefs.Companion companion2 = VideoPrefs.INSTANCE;
                Context context2 = this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                String id2 = itemVideo.getId();
                companion2.deleteFavorite(context2, id2 != null ? id2 : "");
            } else {
                VideoPrefs.Companion companion3 = VideoPrefs.INSTANCE;
                Context context3 = this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                companion3.addFavorite(context3, itemVideo);
            }
            this$0.updateFavorite();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$9$lambda$8(BottomSheetBehavior this_apply, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        if (this_apply.getState() == 3) {
            this_apply.setState(4);
        } else if (this_apply.getState() == 4) {
            this_apply.setState(3);
        }
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void declareStyle() {
        TextView textView = (TextView) findViewById(C1106R.id.currentTextVideo);
        TextView textView2 = (TextView) findViewById(C1106R.id.durationTextVideo);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C1106R.id.sheetVideo);
        TextView textView3 = (TextView) findViewById(C1106R.id.titlePreview);
        ImageView imageView = (ImageView) findViewById(C1106R.id.buttonHideSheet);
        BubblePrefs.Companion companion = BubblePrefs.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView2.setTextColor(companion.getInternalColors(context));
        BubblePrefs.Companion companion2 = BubblePrefs.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        relativeLayout.setBackgroundColor(companion2.getColorManager(context2));
        BubblePrefs.Companion companion3 = BubblePrefs.INSTANCE;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        textView.setTextColor(companion3.getInternalColors(context3));
        BubblePrefs.Companion companion4 = BubblePrefs.INSTANCE;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        textView3.setTextColor(companion4.getInternalColors(context4));
        BubblePrefs.Companion companion5 = BubblePrefs.INSTANCE;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        imageView.setColorFilter(companion5.getInternalColors(context5));
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void onDestroy() {
        this.listVideos.clear();
        android.widget.VideoView videoView = null;
        this.adapter = null;
        Handler handler = this.mHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
            handler = null;
        }
        handler.removeCallbacks(this.updaterProgress);
        android.widget.VideoView videoView2 = this.videoPlayer;
        if (videoView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoPlayer");
        } else {
            videoView = videoView2;
        }
        videoView.stopPlayback();
        removeAllViews();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar p0, int progress, boolean p2) {
        ((TextView) findViewById(C1106R.id.videoSeekText)).setText(VideoPrefs.INSTANCE.convertTime(progress));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar p0) {
        ((FrameLayout) findViewById(C1106R.id.layoutSeekVideo)).setVisibility(0);
        Handler handler = this.mHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
            handler = null;
        }
        handler.removeCallbacks(this.updaterProgress);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Handler handler = this.mHandler;
        Handler handler2 = null;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
            handler = null;
        }
        handler.removeCallbacks(this.updaterProgress);
        android.widget.VideoView videoView = this.videoPlayer;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoPlayer");
            videoView = null;
        }
        videoView.seekTo(p0.getProgress());
        Handler handler3 = this.mHandler;
        if (handler3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
        } else {
            handler2 = handler3;
        }
        handler2.postDelayed(this.updaterProgress, 100L);
        ((FrameLayout) findViewById(C1106R.id.layoutSeekVideo)).setVisibility(8);
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerVideo
    public void onClick(ItemVideo item) {
        Uri uriForFile;
        Intrinsics.checkNotNullParameter(item, "item");
        try {
            this.itemCurrent = item;
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(C1106R.id.sheetVideo);
            relativeLayout.setVisibility(0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(relativeLayout);
            ImageView imageView = (ImageView) findViewById(C1106R.id.imageVideoPreview);
            TextView textView = (TextView) findViewById(C1106R.id.titlePreview);
            String str = "";
            if (item.getType() != 1) {
                uriForFile = Uri.withAppendedPath(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, item.getId());
            } else {
                Context context = getContext();
                String string = getContext().getString(C1106R.string.file_provider_authority);
                String id = item.getId();
                if (id == null) {
                    id = "";
                }
                uriForFile = FileProvider.getUriForFile(context, string, new File(id));
            }
            Intrinsics.checkNotNull(imageView);
            imageView.setPadding(0, 0, 0, 0);
            imageView.setClipToOutline(true);
            Glide.with(getContext()).load(uriForFile).into(imageView);
            if (item.getType() != 1) {
                VideoPrefs.Companion companion = VideoPrefs.INSTANCE;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Intrinsics.checkNotNull(uriForFile);
                textView.setText(companion.getName(context2, uriForFile));
            } else if (item.getName().length() == 0) {
                String id2 = item.getId();
                if (id2 != null) {
                    str = id2;
                }
                textView.setText(new File(str).getName());
            } else {
                textView.setText(item.getName());
            }
            if (!this.isRepeat) {
                bottomSheetBehaviorFrom.setState(3);
            }
            ((RecyclerView) findViewById(C1106R.id.listVideos)).setPadding(0, 0, 0, (int) (60 * (getResources().getDisplayMetrics().densityDpi / 160)));
            Intrinsics.checkNotNull(uriForFile);
            loadPlayVideo(uriForFile);
            updateFavorite();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void loadPlayVideo(Uri uri) {
        android.widget.VideoView videoView = this.videoPlayer;
        android.widget.VideoView videoView2 = null;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoPlayer");
            videoView = null;
        }
        videoView.stopPlayback();
        android.widget.VideoView videoView3 = this.videoPlayer;
        if (videoView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoPlayer");
            videoView3 = null;
        }
        videoView3.setOnPreparedListener(this);
        android.widget.VideoView videoView4 = this.videoPlayer;
        if (videoView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoPlayer");
            videoView4 = null;
        }
        videoView4.setOnCompletionListener(this);
        android.widget.VideoView videoView5 = this.videoPlayer;
        if (videoView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoPlayer");
            videoView5 = null;
        }
        videoView5.setVideoURI(uri);
        android.widget.VideoView videoView6 = this.videoPlayer;
        if (videoView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoPlayer");
        } else {
            videoView2 = videoView6;
        }
        videoView2.start();
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void onBackPressed() {
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(findViewById(C1106R.id.sheetVideo));
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        if (bottomSheetBehaviorFrom.getState() == 4) {
            requestButtons(new ButtonToolbar(C1106R.drawable.ic_baseline_star_outline_24, new Runnable() { // from class: com.alexmanzana.bubbleall.views.VideoView$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    VideoView.onBackPressed$lambda$11(this.f$0);
                }
            }));
            if (this.isOpenBucket) {
                RecyclerView recyclerView = (RecyclerView) findViewById(C1106R.id.listVideos);
                recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
                this.listVideos.clear();
                AdapterVideo adapterVideo = this.adapter;
                if (adapterVideo != null) {
                    adapterVideo.notifyItemRangeChanged(0, this.listVideos.size());
                }
                ((ProgressBar) findViewById(C1106R.id.progressList)).setVisibility(0);
                VideoPrefs.Companion companion = VideoPrefs.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                VideoPrefs.Companion.list$default(companion, context, new C11172(recyclerView), null, 4, null);
            }
            this.isOpenBucket = false;
            return;
        }
        bottomSheetBehaviorFrom.setState(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressed$lambda$11(VideoView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.favoriteMode();
    }

    /* JADX INFO: renamed from: com.alexmanzana.bubbleall.views.VideoView$onBackPressed$2 */
    /* JADX INFO: compiled from: VideoView.kt */
    @Metadata(m494d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m495d2 = {"com/alexmanzana/bubbleall/views/VideoView$onBackPressed$2", "Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;", "onReceived", "", "list", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;", "Lkotlin/collections/ArrayList;", "grid", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class C11172 implements ListenerListVideo {
        final /* synthetic */ RecyclerView $listVideosR;

        C11172(RecyclerView recyclerView) {
            this.$listVideosR = recyclerView;
        }

        @Override // com.alexmanzana.bubbleall.listeners.ListenerListVideo
        public void onReceived(final ArrayList<ItemVideo> list, final int grid) {
            Intrinsics.checkNotNullParameter(list, "list");
            Handler handler = VideoView.this.mHandler;
            if (handler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                handler = null;
            }
            final VideoView videoView = VideoView.this;
            final RecyclerView recyclerView = this.$listVideosR;
            handler.post(new Runnable() { // from class: com.alexmanzana.bubbleall.views.VideoView$onBackPressed$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoView.C11172.onReceived$lambda$0(videoView, list, grid, recyclerView);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onReceived$lambda$0(VideoView this$0, ArrayList list, int i, RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(list, "$list");
            this$0.listVideos.addAll(list);
            if (i > 0) {
                recyclerView.setLayoutManager(new GridLayoutManager(this$0.getContext(), i));
            } else {
                recyclerView.setLayoutManager(new LinearLayoutManager(this$0.getContext()));
            }
            AdapterVideo adapterVideo = this$0.adapter;
            if (adapterVideo != null) {
                adapterVideo.notifyItemRangeChanged(0, this$0.listVideos.size());
            }
            ((ProgressBar) this$0.findViewById(C1106R.id.progressList)).setVisibility(8);
        }
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerVideo
    public void onBucket(int position, String name, ItemVideo item) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(item, "item");
        RecyclerView recyclerView = (RecyclerView) findViewById(C1106R.id.listVideos);
        this.listVideos.clear();
        AdapterVideo adapterVideo = this.adapter;
        if (adapterVideo != null) {
            adapterVideo.notifyItemRangeChanged(0, this.listVideos.size());
        }
        ((ProgressBar) findViewById(C1106R.id.progressList)).setVisibility(0);
        VideoPrefs.Companion companion = VideoPrefs.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.listFiles(context, name, new C11181(recyclerView));
    }

    /* JADX INFO: renamed from: com.alexmanzana.bubbleall.views.VideoView$onBucket$1 */
    /* JADX INFO: compiled from: VideoView.kt */
    @Metadata(m494d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m495d2 = {"com/alexmanzana/bubbleall/views/VideoView$onBucket$1", "Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;", "onReceived", "", "list", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;", "Lkotlin/collections/ArrayList;", "grid", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class C11181 implements ListenerListVideo {
        final /* synthetic */ RecyclerView $listVideosR;

        C11181(RecyclerView recyclerView) {
            this.$listVideosR = recyclerView;
        }

        @Override // com.alexmanzana.bubbleall.listeners.ListenerListVideo
        public void onReceived(final ArrayList<ItemVideo> list, final int grid) {
            Intrinsics.checkNotNullParameter(list, "list");
            Handler handler = VideoView.this.mHandler;
            if (handler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                handler = null;
            }
            final VideoView videoView = VideoView.this;
            final RecyclerView recyclerView = this.$listVideosR;
            handler.post(new Runnable() { // from class: com.alexmanzana.bubbleall.views.VideoView$onBucket$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoView.C11181.onReceived$lambda$2(videoView, list, grid, recyclerView);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onReceived$lambda$2(final VideoView this$0, ArrayList list, int i, RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(list, "$list");
            this$0.listVideos.addAll(list);
            if (i > 0) {
                recyclerView.setLayoutManager(new GridLayoutManager(this$0.getContext(), i));
            } else {
                recyclerView.setLayoutManager(new LinearLayoutManager(this$0.getContext()));
            }
            AdapterVideo adapterVideo = this$0.adapter;
            if (adapterVideo != null) {
                adapterVideo.notifyItemRangeChanged(0, this$0.listVideos.size());
            }
            this$0.isOpenBucket = true;
            ((ProgressBar) this$0.findViewById(C1106R.id.progressList)).setVisibility(8);
            this$0.requestButtons(new ButtonToolbar(C1106R.drawable.ic_baseline_arrow_back_24, new Runnable() { // from class: com.alexmanzana.bubbleall.views.VideoView$onBucket$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    VideoView.C11181.onReceived$lambda$2$lambda$0(this$0);
                }
            }), new ButtonToolbar(C1106R.drawable.ic_baseline_star_outline_24, new Runnable() { // from class: com.alexmanzana.bubbleall.views.VideoView$onBucket$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    VideoView.C11181.onReceived$lambda$2$lambda$1(this$0);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onReceived$lambda$2$lambda$0(VideoView this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.onBackPressed();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onReceived$lambda$2$lambda$1(VideoView this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.favoriteMode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void favoriteMode() {
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(findViewById(C1106R.id.sheetVideo));
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        bottomSheetBehaviorFrom.setState(4);
        requestButtons(new ButtonToolbar(C1106R.drawable.ic_baseline_arrow_back_24, new Runnable() { // from class: com.alexmanzana.bubbleall.views.VideoView$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                VideoView.favoriteMode$lambda$12(this.f$0);
            }
        }));
        RecyclerView recyclerView = (RecyclerView) findViewById(C1106R.id.listVideos);
        this.listVideos.clear();
        AdapterVideo adapterVideo = this.adapter;
        if (adapterVideo != null) {
            adapterVideo.notifyItemRangeChanged(0, this.listVideos.size());
        }
        ((ProgressBar) findViewById(C1106R.id.progressList)).setVisibility(0);
        VideoPrefs.Companion companion = VideoPrefs.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.favoriteList(context, new C11162(recyclerView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void favoriteMode$lambda$12(VideoView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX INFO: renamed from: com.alexmanzana.bubbleall.views.VideoView$favoriteMode$2 */
    /* JADX INFO: compiled from: VideoView.kt */
    @Metadata(m494d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m495d2 = {"com/alexmanzana/bubbleall/views/VideoView$favoriteMode$2", "Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;", "onReceived", "", "list", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;", "Lkotlin/collections/ArrayList;", "grid", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class C11162 implements ListenerListVideo {
        final /* synthetic */ RecyclerView $listVideosR;

        C11162(RecyclerView recyclerView) {
            this.$listVideosR = recyclerView;
        }

        @Override // com.alexmanzana.bubbleall.listeners.ListenerListVideo
        public void onReceived(final ArrayList<ItemVideo> list, final int grid) {
            Intrinsics.checkNotNullParameter(list, "list");
            Handler handler = VideoView.this.mHandler;
            if (handler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                handler = null;
            }
            final VideoView videoView = VideoView.this;
            final RecyclerView recyclerView = this.$listVideosR;
            handler.post(new Runnable() { // from class: com.alexmanzana.bubbleall.views.VideoView$favoriteMode$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoView.C11162.onReceived$lambda$0(videoView, list, grid, recyclerView);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onReceived$lambda$0(VideoView this$0, ArrayList list, int i, RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(list, "$list");
            this$0.listVideos.addAll(list);
            if (i > 0) {
                recyclerView.setLayoutManager(new GridLayoutManager(this$0.getContext(), i));
            } else {
                recyclerView.setLayoutManager(new LinearLayoutManager(this$0.getContext()));
            }
            AdapterVideo adapterVideo = this$0.adapter;
            if (adapterVideo != null) {
                adapterVideo.notifyItemRangeChanged(0, this$0.listVideos.size());
            }
            ((ProgressBar) this$0.findViewById(C1106R.id.progressList)).setVisibility(8);
            this$0.isOpenBucket = true;
        }
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void args(Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemVideo itemVideo = (ItemVideo) item;
        if (itemVideo.isBucket()) {
            String id = itemVideo.getId();
            if (id == null) {
                id = itemVideo.getName();
            }
            onBucket(-1, id, itemVideo);
            return;
        }
        onClick(itemVideo);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer p0) {
        ItemVideo itemVideo;
        View viewFindViewById = findViewById(C1106R.id.pauseButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ((ImageView) viewFindViewById).setImageResource(C1106R.drawable.ic_baseline_play_arrow_24);
        if (!this.isRepeat || (itemVideo = this.itemCurrent) == null) {
            return;
        }
        onClick(itemVideo);
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        TextView textView = (TextView) findViewById(C1106R.id.durationTextVideo);
        View viewFindViewById = findViewById(C1106R.id.pauseButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ((ImageView) viewFindViewById).setImageResource(C1106R.drawable.ic_pause);
        View viewFindViewById2 = findViewById(C1106R.id.progressVideo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        SeekBar seekBar = (SeekBar) viewFindViewById2;
        seekBar.setMax(p0.getDuration());
        seekBar.setProgress(0);
        textView.setText(VideoPrefs.INSTANCE.convertTime(p0.getDuration()));
        Handler handler = this.mHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
            handler = null;
        }
        handler.postDelayed(this.updaterProgress, 100L);
    }
}
