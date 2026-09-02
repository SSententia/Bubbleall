package com.alexmanzana.bubbleall.views;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media2.session.MediaConstants;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.MainActivity$$ExternalSyntheticApiModelOutline0;
import com.alexmanzana.bubbleall.MusicActivity;
import com.alexmanzana.bubbleall.adapters.AdapterMusic;
import com.alexmanzana.bubbleall.listeners.ListenerMusic;
import com.alexmanzana.bubbleall.pojos.ItemMusic;
import com.alexmanzana.bubbleall.pojos.ItemMusicMetadata;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import com.alexmanzana.bubbleall.utils.MusicPrefs;
import com.alexmanzana.bubbleall.utils.VideoPrefs;
import com.alexmanzana.bubbleall.window.ButtonToolbar;
import com.alexmanzana.bubbleall.window.Panel;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.gson.Gson;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MusicView.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000³\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t*\u0001$\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B%\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020)H\u0016J\b\u0010-\u001a\u00020)H\u0002J\u0010\u0010.\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0017H\u0002J\u0018\u0010/\u001a\u00020)2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\rH\u0002J\u0010\u0010/\u001a\u00020)2\u0006\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020)2\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020)2\u0006\u00109\u001a\u00020\rH\u0016J\b\u0010:\u001a\u00020)H\u0016J\u0010\u0010;\u001a\u00020)2\u0006\u00109\u001a\u00020<H\u0016J\u0018\u0010;\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00172\u0006\u00102\u001a\u00020\rH\u0016J\u0012\u0010=\u001a\u00020)2\b\u00109\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010>\u001a\u00020)H\u0017J\b\u0010?\u001a\u00020)H\u0016J\u0010\u0010@\u001a\u00020)2\u0006\u00109\u001a\u00020\"H\u0016J\"\u0010A\u001a\u00020)2\b\u00109\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020\u0015H\u0016J\u0012\u0010E\u001a\u00020)2\b\u00109\u001a\u0004\u0018\u00010BH\u0016J\u0010\u0010F\u001a\u00020)2\u0006\u00109\u001a\u00020BH\u0016J\b\u0010G\u001a\u00020)H\u0016J\u0010\u0010H\u001a\u00020)2\u0006\u00100\u001a\u00020\rH\u0002J\b\u0010I\u001a\u00020)H\u0016J\b\u0010J\u001a\u00020)H\u0002R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, m495d2 = {"Lcom/alexmanzana/bubbleall/views/MusicView;", "Lcom/alexmanzana/bubbleall/window/Panel;", "Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroid/media/MediaPlayer$OnPreparedListener;", "Landroid/media/MediaPlayer$OnCompletionListener;", "Landroid/view/View$OnClickListener;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;", "audioManager", "Landroid/media/AudioManager;", "currentPosition", "isAudioFocus", "", "itemCurrent", "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;", "listenerFocus", "Landroid/media/AudioFocusRequest;", "mHandler", "Landroid/os/Handler;", "mManager", "Landroid/app/NotificationManager;", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "modeRepeat", "playerCurrent", "Landroid/media/MediaPlayer;", "receiver", "com/alexmanzana/bubbleall/views/MusicView$receiver$1", "Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;", "updaterProgress", "Ljava/lang/Runnable;", "args", "", "item", "", "declareStyle", "loadDataInSheet", "loadImage", "loadMusic", MediaConstants.MEDIA_URI_QUERY_ID, "", "position", "info", "", "loadNotification", "speed", "", "onAudioFocusChange", "p0", "onBackPressed", "onClick", "Landroid/view/View;", "onCompletion", "onCreate", "onDestroy", "onPrepared", "onProgressChanged", "Landroid/widget/SeekBar;", "p1", "p2", "onStartTrackingTouch", "onStopTrackingTouch", "pauseMedia", "positionMusic", "start", "updateRepeatCenter", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class MusicView extends Panel implements ListenerMusic, SeekBar.OnSeekBarChangeListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, View.OnClickListener, AudioManager.OnAudioFocusChangeListener {
    private AdapterMusic adapter;
    private AudioManager audioManager;
    private int currentPosition;
    private boolean isAudioFocus;
    private ItemMusic itemCurrent;
    private AudioFocusRequest listenerFocus;
    private Handler mHandler;
    private NotificationManager mManager;
    private MediaSessionCompat mediaSession;
    private int modeRepeat;
    private MediaPlayer playerCurrent;
    private final MusicView$receiver$1 receiver;
    private final Runnable updaterProgress;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar p0, int p1, boolean p2) {
    }

    public /* synthetic */ MusicView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.alexmanzana.bubbleall.views.MusicView$receiver$1] */
    public MusicView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentPosition = -1;
        this.updaterProgress = new Runnable() { // from class: com.alexmanzana.bubbleall.views.MusicView$updaterProgress$1
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayer mediaPlayer = this.this$0.playerCurrent;
                if (mediaPlayer != null) {
                    MusicView musicView = this.this$0;
                    TextView textView = (TextView) musicView.findViewById(C1106R.id.currentTextMusic);
                    View viewFindViewById = musicView.findViewById(C1106R.id.progressMusic);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                    int currentPosition = mediaPlayer.getCurrentPosition();
                    ((SeekBar) viewFindViewById).setProgress(currentPosition);
                    textView.setText(VideoPrefs.INSTANCE.convertTime(currentPosition));
                    Handler handler = musicView.mHandler;
                    if (handler != null) {
                        handler.postDelayed(this, 100L);
                    }
                }
            }
        };
        this.receiver = new BroadcastReceiver() { // from class: com.alexmanzana.bubbleall.views.MusicView$receiver$1
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) throws IOException {
                String action;
                NotificationManager notificationManager;
                if (intent == null || (action = intent.getAction()) == null) {
                    action = "com.alexmanzana.bubbleall.Music.CLOSE";
                }
                switch (action.hashCode()) {
                    case -1448234252:
                        if (action.equals("com.alexmanzana.bubbleall.Music.REFRESH")) {
                            MediaPlayer mediaPlayer = this.this$0.playerCurrent;
                            if (mediaPlayer != null) {
                                mediaPlayer.seekTo(0);
                            }
                            this.this$0.loadNotification(1.0f);
                            break;
                        }
                        break;
                    case -979010738:
                        if (action.equals("com.alexmanzana.bubbleall.Music.BACK")) {
                            this.this$0.positionMusic(C1106R.id.backButton);
                            break;
                        }
                        break;
                    case -978648742:
                        if (action.equals("com.alexmanzana.bubbleall.Music.NEXT")) {
                            this.this$0.positionMusic(C1106R.id.nextButton);
                            break;
                        }
                        break;
                    case -283298735:
                        if (action.equals("com.alexmanzana.bubbleall.Music.CLOSE") && (notificationManager = this.this$0.mManager) != null) {
                            notificationManager.cancel(4092);
                            break;
                        }
                        break;
                    case 1356734378:
                        if (action.equals("com.alexmanzana.bubbleall.Music.PLAY_AND_PAUSE")) {
                            this.this$0.pauseMedia();
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void pauseMedia() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        View viewFindViewById = findViewById(C1106R.id.pauseButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        MediaPlayer mediaPlayer = this.playerCurrent;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                if (defaultSharedPreferences.getBoolean("key_music_notification", true)) {
                    loadNotification(0.0f);
                }
                mediaPlayer.pause();
                imageView.setImageResource(C1106R.drawable.ic_baseline_play_arrow_24);
                return;
            }
            if (defaultSharedPreferences.getBoolean("key_music_focus", true)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    AudioFocusRequest audioFocusRequest = this.listenerFocus;
                    if (audioFocusRequest != null) {
                        AudioManager audioManager = this.audioManager;
                        Integer numValueOf = audioManager != null ? Integer.valueOf(audioManager.requestAudioFocus(audioFocusRequest)) : null;
                        if (numValueOf == null || numValueOf.intValue() != 1) {
                            return;
                        }
                    }
                } else {
                    AudioManager audioManager2 = this.audioManager;
                    if (audioManager2 != null) {
                        audioManager2.requestAudioFocus(this, 3, 1);
                    }
                }
            }
            mediaPlayer.start();
            imageView.setImageResource(C1106R.drawable.ic_pause);
            if (defaultSharedPreferences.getBoolean("key_music_notification", true)) {
                loadNotification(1.0f);
            }
        }
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void onCreate() {
        RelativeLayout.inflate(getContext(), C1106R.layout.layout_music_window, this);
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        this.mHandler = new Handler(looperMyLooper);
        Object systemService = getContext().getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService;
        Object systemService2 = getContext().getSystemService("notification");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
        this.mManager = (NotificationManager) systemService2;
        this.mediaSession = new MediaSessionCompat(getContext(), "Music");
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest.Builder builderM333m = MainActivity$$ExternalSyntheticApiModelOutline0.m333m(1);
            builderM333m.setOnAudioFocusChangeListener(this);
            builderM333m.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
            this.listenerFocus = builderM333m.build();
        }
        final BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((RelativeLayout) findViewById(C1106R.id.sheetMusic));
        View viewFindViewById = findViewById(C1106R.id.repeatCenter);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = findViewById(C1106R.id.buttonHideSheet);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = findViewById(C1106R.id.pauseButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = findViewById(C1106R.id.progressMusic);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        View viewFindViewById5 = findViewById(C1106R.id.nextButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        View viewFindViewById6 = findViewById(C1106R.id.backButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        MusicView musicView = this;
        ((ImageView) viewFindViewById6).setOnClickListener(musicView);
        ((ImageView) viewFindViewById5).setOnClickListener(musicView);
        ((SeekBar) viewFindViewById4).setOnSeekBarChangeListener(this);
        ((ImageView) viewFindViewById3).setOnClickListener(musicView);
        ((LinearLayout) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.views.MusicView$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicView.onCreate$lambda$4$lambda$2(this.f$0, view);
            }
        });
        ((ImageView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.views.MusicView$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicView.onCreate$lambda$4$lambda$3(bottomSheetBehaviorFrom, view);
            }
        });
        bottomSheetBehaviorFrom.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() { // from class: com.alexmanzana.bubbleall.views.MusicView.onCreate.2
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View bottomSheet, float slideOffset) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View bottomSheet, int newState) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                View viewFindViewById7 = MusicView.this.findViewById(C1106R.id.buttonHideSheet);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
                ImageView imageView = (ImageView) viewFindViewById7;
                View viewFindViewById8 = MusicView.this.findViewById(C1106R.id.nextButton);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
                ImageView imageView2 = (ImageView) viewFindViewById8;
                View viewFindViewById9 = MusicView.this.findViewById(C1106R.id.backButton);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
                ImageView imageView3 = (ImageView) viewFindViewById9;
                if (newState == 3) {
                    imageView.setImageResource(C1106R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else if (newState == 4) {
                    imageView.setImageResource(C1106R.drawable.ic_baseline_keyboard_arrow_up_24);
                }
                if (MusicView.this.currentPosition == -1) {
                    imageView2.setVisibility(8);
                    imageView3.setVisibility(8);
                } else {
                    imageView2.setVisibility(0);
                    imageView3.setVisibility(0);
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alexmanzana.bubbleall.Music.CLOSE");
        intentFilter.addAction("com.alexmanzana.bubbleall.Music.REFRESH");
        intentFilter.addAction("com.alexmanzana.bubbleall.Music.BACK");
        intentFilter.addAction("com.alexmanzana.bubbleall.Music.NEXT");
        intentFilter.addAction("com.alexmanzana.bubbleall.Music.PLAY_AND_PAUSE");
        if (Build.VERSION.SDK_INT >= 33) {
            getContext().registerReceiver(this.receiver, intentFilter, 4);
            if (checkPermission("android.permission.READ_MEDIA_AUDIO")) {
                return;
            }
            onCreate$action(this);
            return;
        }
        getContext().registerReceiver(this.receiver, intentFilter);
        if (checkPermission("android.permission.READ_EXTERNAL_STORAGE")) {
            return;
        }
        onCreate$action(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4$lambda$2(MusicView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.modeRepeat;
        if (i == 2) {
            this$0.modeRepeat = 0;
        } else {
            this$0.modeRepeat = i + 1;
        }
        this$0.updateRepeatCenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4$lambda$3(BottomSheetBehavior this_apply, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        if (this_apply.getState() == 3) {
            this_apply.setState(4);
        } else if (this_apply.getState() == 4) {
            this_apply.setState(3);
        }
    }

    private static final void onCreate$action(MusicView musicView) {
        musicView.setVisibility(8);
        musicView.startActivity(new Intent(musicView.getContext(), (Class<?>) MusicActivity.class));
        musicView.closeManager();
    }

    private final void updateRepeatCenter() {
        View viewFindViewById = findViewById(C1106R.id.repeatLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RelativeLayout relativeLayout = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(C1106R.id.imageRepeat);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C1106R.id.textRepeat);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        int i = this.modeRepeat;
        if (i == 0 || i == 1) {
            textView.setText(C1106R.string.text_repeat_one);
            imageView.setImageResource(C1106R.drawable.ic_baseline_repeat_one_24);
        } else if (i == 2) {
            textView.setText(C1106R.string.text_repeat);
            imageView.setImageResource(C1106R.drawable.ic_baseline_repeat_24);
        }
        if (this.modeRepeat != 0) {
            relativeLayout.setBackgroundResource(C1106R.drawable.background_item_color_current);
        } else {
            relativeLayout.setBackgroundResource(C1106R.drawable.background_item_color);
        }
    }

    private final void loadDataInSheet() {
        ItemMusic itemMusic = this.itemCurrent;
        if (itemMusic != null) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(C1106R.id.sheetMusic);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(relativeLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
            relativeLayout.setVisibility(0);
            bottomSheetBehaviorFrom.setState(3);
            float f = 160;
            ((RecyclerView) findViewById(C1106R.id.listMusic)).setPadding(0, 0, 0, (int) (60 * (getResources().getDisplayMetrics().densityDpi / f)));
            View viewFindViewById = findViewById(C1106R.id.imageMusicPreview);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            ImageView imageView = (ImageView) viewFindViewById;
            View viewFindViewById2 = findViewById(C1106R.id.imageMusic);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            ImageView imageView2 = (ImageView) viewFindViewById2;
            View viewFindViewById3 = findViewById(C1106R.id.titleMusicPreview);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            TextView textView = (TextView) viewFindViewById3;
            View viewFindViewById4 = findViewById(C1106R.id.authorMusicPreview);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            TextView textView2 = (TextView) viewFindViewById4;
            imageView.setClipToOutline(true);
            Bitmap image = itemMusic.getImage();
            Unit unit = null;
            if (image != null) {
                imageView.setPadding(0, 0, 0, 0);
                imageView2.setPadding(0, 0, 0, 0);
                imageView2.setBackground(null);
                imageView.setImageBitmap(image);
                imageView2.setImageBitmap(image);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                int i = (int) (7 * (getResources().getDisplayMetrics().densityDpi / f));
                imageView.setPadding(i, i, i, i);
                int i2 = (int) (100 * (getResources().getDisplayMetrics().densityDpi / f));
                imageView2.setPadding(i2, i2, i2, i2);
                imageView2.setBackgroundColor(Color.parseColor("#cccccc"));
                imageView.setImageResource(C1106R.drawable.ic_baseline_music_note_24);
                imageView2.setImageResource(C1106R.drawable.ic_baseline_music_note_24);
            }
            textView.setText(itemMusic.getTitle());
            textView2.setText(itemMusic.getAuthor());
        }
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void start() {
        String string = getContext().getString(C1106R.string.text_music);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        requestTitle(string);
        requestIconToolbar(Integer.valueOf(C1106R.drawable.ic_baseline_library_music_24));
        requestButtons(new ButtonToolbar[0]);
        if (Build.VERSION.SDK_INT >= 33) {
            if (checkPermission("android.permission.READ_MEDIA_AUDIO")) {
                start$action$9(this);
            }
        } else if (checkPermission("android.permission.READ_EXTERNAL_STORAGE")) {
            start$action$9(this);
        }
    }

    private static final void start$action$9(MusicView musicView) {
        musicView.setVisibility(0);
        if (musicView.adapter == null) {
            MusicPrefs.Companion companion = MusicPrefs.INSTANCE;
            Context context = musicView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            companion.list(context, new MusicView$start$action$1$1(musicView, musicView));
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void loadMusic(long id, int position) throws IOException {
        MediaPlayer mediaPlayer = this.playerCurrent;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        MediaPlayer mediaPlayer2 = this.playerCurrent;
        if (mediaPlayer2 != null) {
            mediaPlayer2.stop();
        }
        MediaPlayer mediaPlayer3 = this.playerCurrent;
        if (mediaPlayer3 != null) {
            mediaPlayer3.release();
        }
        this.playerCurrent = null;
        if (PreferenceManager.getDefaultSharedPreferences(getContext()).getBoolean("key_music_focus", true) && !this.isAudioFocus) {
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = this.listenerFocus;
                if (audioFocusRequest != null) {
                    AudioManager audioManager = this.audioManager;
                    if (audioManager != null) {
                        audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    }
                    AudioManager audioManager2 = this.audioManager;
                    Integer numValueOf = audioManager2 != null ? Integer.valueOf(audioManager2.requestAudioFocus(audioFocusRequest)) : null;
                    if (numValueOf == null || numValueOf.intValue() != 1) {
                        return;
                    } else {
                        this.isAudioFocus = true;
                    }
                }
            } else {
                AudioManager audioManager3 = this.audioManager;
                if (audioManager3 != null) {
                    audioManager3.abandonAudioFocus(this);
                }
                AudioManager audioManager4 = this.audioManager;
                if (audioManager4 != null) {
                    audioManager4.requestAudioFocus(this, 3, 1);
                }
            }
        }
        Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, id);
        Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
        this.currentPosition = position;
        MediaPlayer mediaPlayer4 = new MediaPlayer();
        this.playerCurrent = mediaPlayer4;
        mediaPlayer4.setOnPreparedListener(this);
        MediaPlayer mediaPlayer5 = this.playerCurrent;
        if (mediaPlayer5 != null) {
            mediaPlayer5.setOnCompletionListener(this);
        }
        MediaPlayer mediaPlayer6 = this.playerCurrent;
        if (mediaPlayer6 != null) {
            mediaPlayer6.setDataSource(getContext(), uriWithAppendedId);
        }
        MediaPlayer mediaPlayer7 = this.playerCurrent;
        if (mediaPlayer7 != null) {
            mediaPlayer7.prepare();
        }
        MediaPlayer mediaPlayer8 = this.playerCurrent;
        if (mediaPlayer8 != null) {
            mediaPlayer8.start();
        }
        loadDataInSheet();
        loadNotification(1.0f);
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void declareStyle() {
        TextView textView = (TextView) findViewById(C1106R.id.currentTextMusic);
        TextView textView2 = (TextView) findViewById(C1106R.id.durationTextMusic);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C1106R.id.sheetMusic);
        View viewFindViewById = findViewById(C1106R.id.buttonHideSheet);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(C1106R.id.nextButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C1106R.id.backButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ImageView imageView3 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C1106R.id.titleMusicPreview);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView3 = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C1106R.id.authorMusicPreview);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        TextView textView4 = (TextView) viewFindViewById5;
        AdapterMusic adapterMusic = this.adapter;
        if (adapterMusic != null) {
            adapterMusic.declareStyle();
        }
        BubblePrefs.Companion companion = BubblePrefs.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(companion.getInternalColors(context));
        BubblePrefs.Companion companion2 = BubblePrefs.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textView2.setTextColor(companion2.getInternalColors(context2));
        BubblePrefs.Companion companion3 = BubblePrefs.INSTANCE;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        textView3.setTextColor(companion3.getInternalColors(context3));
        BubblePrefs.Companion companion4 = BubblePrefs.INSTANCE;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        textView4.setTextColor(companion4.getInternalColors(context4));
        BubblePrefs.Companion companion5 = BubblePrefs.INSTANCE;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        relativeLayout.setBackgroundColor(companion5.getColorManager(context5));
        BubblePrefs.Companion companion6 = BubblePrefs.INSTANCE;
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        imageView2.setColorFilter(companion6.getInternalColors(context6));
        BubblePrefs.Companion companion7 = BubblePrefs.INSTANCE;
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        imageView3.setColorFilter(companion7.getInternalColors(context7));
        BubblePrefs.Companion companion8 = BubblePrefs.INSTANCE;
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        imageView.setColorFilter(companion8.getInternalColors(context8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadNotification(float speed) {
        int i;
        int i2;
        Bitmap bitmapCreateBitmap;
        String author;
        String author2;
        if (PreferenceManager.getDefaultSharedPreferences(getContext()).getBoolean("key_music_notification", true)) {
            PendingIntent broadcast = PendingIntent.getBroadcast(getContext(), 0, new Intent("com.alexmanzana.bubbleall.Music.BACK"), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            PendingIntent broadcast2 = PendingIntent.getBroadcast(getContext(), 0, new Intent("com.alexmanzana.bubbleall.Music.PLAY_AND_PAUSE"), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            PendingIntent broadcast3 = PendingIntent.getBroadcast(getContext(), 0, new Intent("com.alexmanzana.bubbleall.Music.REFRESH"), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            PendingIntent broadcast4 = PendingIntent.getBroadcast(getContext(), 0, new Intent("com.alexmanzana.bubbleall.Music.NEXT"), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            PendingIntent broadcast5 = PendingIntent.getBroadcast(getContext(), 0, new Intent("com.alexmanzana.bubbleall.Music.CLOSE"), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            try {
                MediaSessionCompat mediaSessionCompat = this.mediaSession;
                String str = "";
                if (mediaSessionCompat != null) {
                    MediaMetadataCompat.Builder builder = new MediaMetadataCompat.Builder();
                    ItemMusic itemMusic = this.itemCurrent;
                    MediaMetadataCompat.Builder builderPutString = builder.putString("android.media.metadata.TITLE", itemMusic != null ? itemMusic.getTitle() : null);
                    ItemMusic itemMusic2 = this.itemCurrent;
                    if (itemMusic2 == null || (author2 = itemMusic2.getAuthor()) == null) {
                        author2 = "";
                    }
                    MediaMetadataCompat.Builder builderPutString2 = builderPutString.putString("android.media.metadata.AUTHOR", author2);
                    MediaPlayer mediaPlayer = this.playerCurrent;
                    mediaSessionCompat.setMetadata(builderPutString2.putLong("android.media.metadata.DURATION", mediaPlayer != null ? mediaPlayer.getDuration() : 0).build());
                }
                MediaSessionCompat mediaSessionCompat2 = this.mediaSession;
                if (mediaSessionCompat2 != null) {
                    mediaSessionCompat2.setCallback(new MediaSessionCompat.Callback() { // from class: com.alexmanzana.bubbleall.views.MusicView.loadNotification.1
                        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
                        public void onSeekTo(long pos) {
                            MediaPlayer mediaPlayer2 = MusicView.this.playerCurrent;
                            if (mediaPlayer2 != null) {
                                mediaPlayer2.seekTo((int) pos);
                            }
                            MusicView.this.loadNotification(1.0f);
                        }
                    });
                }
                if (speed == 0.0f) {
                    i = C1106R.drawable.ic_play;
                    i2 = 2;
                } else {
                    i = C1106R.drawable.ic_pause;
                    i2 = 3;
                }
                MediaSessionCompat mediaSessionCompat3 = this.mediaSession;
                if (mediaSessionCompat3 != null) {
                    PlaybackStateCompat.Builder builder2 = new PlaybackStateCompat.Builder();
                    MediaPlayer mediaPlayer2 = this.playerCurrent;
                    mediaSessionCompat3.setPlaybackState(builder2.setState(i2, mediaPlayer2 != null ? mediaPlayer2.getCurrentPosition() : 0, speed).setActions(256L).build());
                }
                ItemMusic itemMusic3 = this.itemCurrent;
                if (itemMusic3 == null || (bitmapCreateBitmap = itemMusic3.getImage()) == null) {
                    bitmapCreateBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
                    Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                }
                NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(getContext(), "music_channel").setSmallIcon(C1106R.drawable.ic_service_small);
                ItemMusic itemMusic4 = this.itemCurrent;
                NotificationCompat.Builder contentTitle = smallIcon.setContentTitle(itemMusic4 != null ? itemMusic4.getTitle() : null);
                ItemMusic itemMusic5 = this.itemCurrent;
                if (itemMusic5 != null && (author = itemMusic5.getAuthor()) != null) {
                    str = author;
                }
                NotificationCompat.Builder builderAddAction = contentTitle.setContentText(str).setLargeIcon(bitmapCreateBitmap).addAction(C1106R.drawable.ic_baseline_refresh_24, "Refresh", broadcast3).addAction(C1106R.drawable.ic_baseline_skip_previous_24, "Back", broadcast).addAction(i, "Play/Pause", broadcast2).addAction(C1106R.drawable.ic_baseline_skip_next_24, "Next", broadcast4).addAction(C1106R.drawable.ic_close, "Close", broadcast5);
                androidx.media.app.NotificationCompat.MediaStyle showActionsInCompactView = new androidx.media.app.NotificationCompat.MediaStyle().setShowActionsInCompactView(1, 2, 3);
                MediaSessionCompat mediaSessionCompat4 = this.mediaSession;
                Notification notificationBuild = builderAddAction.setStyle(showActionsInCompactView.setMediaSession(mediaSessionCompat4 != null ? mediaSessionCompat4.getSessionToken() : null)).build();
                Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
                NotificationManager notificationManager = this.mManager;
                if (notificationManager != null) {
                    notificationManager.notify(4092, notificationBuild);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private final void loadMusic(String info) throws IOException {
        ItemMusicMetadata itemMusicMetadata = (ItemMusicMetadata) new Gson().fromJson(info, ItemMusicMetadata.class);
        Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, itemMusicMetadata.getId());
        Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
        ItemMusic itemMusic = new ItemMusic(itemMusicMetadata.getId(), uriWithAppendedId, itemMusicMetadata.getTitle(), itemMusicMetadata.getAuthor(), null);
        this.itemCurrent = itemMusic;
        loadImage(itemMusic);
        loadMusic(itemMusic.getId(), -1);
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void args(Object item) throws IOException {
        Intrinsics.checkNotNullParameter(item, "item");
        if (checkPermission("android.permission.READ_EXTERNAL_STORAGE")) {
            loadMusic((String) item);
        }
    }

    private final void loadImage(ItemMusic item) {
        ItemMusic itemMusic;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(getContext(), item.getData());
        byte[] embeddedPicture = mediaMetadataRetriever.getEmbeddedPicture();
        if (embeddedPicture == null || (itemMusic = this.itemCurrent) == null) {
            return;
        }
        itemMusic.setImage(BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length));
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void onDestroy() {
        AudioManager audioManager;
        if (PreferenceManager.getDefaultSharedPreferences(getContext()).getBoolean("key_music_focus", true)) {
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = this.listenerFocus;
                if (audioFocusRequest != null && (audioManager = this.audioManager) != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                }
            } else {
                AudioManager audioManager2 = this.audioManager;
                if (audioManager2 != null) {
                    audioManager2.abandonAudioFocus(this);
                }
            }
        }
        NotificationManager notificationManager = this.mManager;
        if (notificationManager != null) {
            notificationManager.cancel(4092);
        }
        getContext().unregisterReceiver(this.receiver);
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.updaterProgress);
        }
        MediaPlayer mediaPlayer = this.playerCurrent;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        MediaPlayer mediaPlayer2 = this.playerCurrent;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        this.playerCurrent = null;
        this.adapter = null;
        this.itemCurrent = null;
        this.mHandler = null;
        removeAllViews();
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerMusic
    public void onClick(ItemMusic item, int position) throws IOException {
        Intrinsics.checkNotNullParameter(item, "item");
        this.itemCurrent = item;
        loadImage(item);
        loadMusic(item.getId(), position);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar p0) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.updaterProgress);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.updaterProgress);
        }
        MediaPlayer mediaPlayer = this.playerCurrent;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(p0.getProgress());
        }
        Handler handler2 = this.mHandler;
        if (handler2 != null) {
            handler2.postDelayed(this.updaterProgress, 100L);
        }
        loadNotification(1.0f);
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        TextView textView = (TextView) findViewById(C1106R.id.durationTextMusic);
        View viewFindViewById = findViewById(C1106R.id.progressMusic);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        SeekBar seekBar = (SeekBar) viewFindViewById;
        View viewFindViewById2 = findViewById(C1106R.id.pauseButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((ImageView) viewFindViewById2).setImageResource(C1106R.drawable.ic_pause);
        seekBar.setMax(p0.getDuration());
        seekBar.setProgress(0);
        textView.setText(VideoPrefs.INSTANCE.convertTime(p0.getDuration()));
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.postDelayed(this.updaterProgress, 100L);
        }
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void onBackPressed() {
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(findViewById(C1106R.id.sheetMusic));
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        if (bottomSheetBehaviorFrom.getState() == 4) {
            bottomSheetBehaviorFrom.setState(4);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer p0) throws IOException {
        AudioManager audioManager;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        View viewFindViewById = findViewById(C1106R.id.pauseButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ((ImageView) viewFindViewById).setImageResource(C1106R.drawable.ic_baseline_play_arrow_24);
        if (defaultSharedPreferences.getBoolean("key_music_notification", true)) {
            loadNotification(0.0f);
        }
        int i = this.modeRepeat;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    positionMusic(C1106R.id.nextButton);
                    return;
                }
                return;
            } else {
                ItemMusic itemMusic = this.itemCurrent;
                if (itemMusic != null) {
                    onClick(itemMusic, this.currentPosition);
                    return;
                }
                return;
            }
        }
        if (defaultSharedPreferences.getBoolean("key_music_focus", true)) {
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = this.listenerFocus;
                if (audioFocusRequest == null || (audioManager = this.audioManager) == null) {
                    return;
                }
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
                return;
            }
            AudioManager audioManager2 = this.audioManager;
            if (audioManager2 != null) {
                audioManager2.abandonAudioFocus(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void positionMusic(int id) throws IOException {
        int i;
        AdapterMusic adapterMusic = this.adapter;
        if (adapterMusic != null) {
            int itemCount = adapterMusic.getItemCount();
            if (this.currentPosition != -1) {
                if (id == C1106R.id.nextButton) {
                    int i2 = this.currentPosition;
                    if (i2 < itemCount - 1) {
                        int i3 = i2 + 1;
                        onClick(adapterMusic.get(i3), i3);
                        return;
                    }
                    return;
                }
                if (id != C1106R.id.backButton || (i = this.currentPosition) <= 0) {
                    return;
                }
                int i4 = i - 1;
                onClick(adapterMusic.get(i4), i4);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "p0");
        if (p0.getId() == C1106R.id.nextButton || p0.getId() == C1106R.id.backButton) {
            positionMusic(p0.getId());
        } else {
            pauseMedia();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int p0) {
        ImageView imageView = (ImageView) findViewById(C1106R.id.pauseButton);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        if (p0 == -2 || p0 == -1) {
            MediaPlayer mediaPlayer = this.playerCurrent;
            if (mediaPlayer != null) {
                mediaPlayer.pause();
            }
            this.isAudioFocus = false;
            if (imageView != null) {
                imageView.setImageResource(C1106R.drawable.ic_baseline_play_arrow_24);
            }
            if (defaultSharedPreferences.getBoolean("key_music_notification", true)) {
                loadNotification(0.0f);
                return;
            }
            return;
        }
        if (p0 != 1) {
            return;
        }
        MediaPlayer mediaPlayer2 = this.playerCurrent;
        if (mediaPlayer2 != null) {
            mediaPlayer2.start();
        }
        this.isAudioFocus = true;
        if (imageView != null) {
            imageView.setImageResource(C1106R.drawable.ic_pause);
        }
        if (defaultSharedPreferences.getBoolean("key_music_notification", true)) {
            loadNotification(1.0f);
        }
    }
}
