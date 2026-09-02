package androidx.media2.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.UriMediaItem;
import androidx.media2.common.VideoSize;
import androidx.media2.session.MediaController;
import androidx.media2.session.SessionCommandGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class MediaControlView extends MediaViewGroup {
    private static final long AD_SKIP_WAIT_TIME_MS = 5000;
    private static final long DEFAULT_DELAYED_ANIMATION_INTERVAL_MS = 2000;
    private static final long DEFAULT_PROGRESS_UPDATE_TIME_MS = 1000;
    private static final long DISABLE_DELAYED_ANIMATION = -1;
    private static final long FORWARD_TIME_MS = 30000;
    private static final long HIDE_TIME_MS = 250;
    private static final int MAX_PROGRESS = 1000;
    private static final int MAX_SCALE_LEVEL = 10000;
    private static final int PLAYBACK_SPEED_1x_INDEX = 3;
    private static final int PLAY_BUTTON_PAUSE = 0;
    private static final int PLAY_BUTTON_PLAY = 1;
    private static final int PLAY_BUTTON_REPLAY = 2;
    private static final String RESOURCE_EMPTY = "";
    private static final int RESOURCE_NON_EXISTENT = -1;
    private static final long REWIND_TIME_MS = 10000;
    private static final int SEEK_POSITION_NOT_SET = -1;
    private static final int SETTINGS_MODE_AUDIO_TRACK = 0;
    private static final int SETTINGS_MODE_MAIN = 3;
    private static final int SETTINGS_MODE_PLAYBACK_SPEED = 1;
    private static final int SETTINGS_MODE_SUBTITLE_TRACK = 2;
    private static final long SHOW_TIME_MS = 250;
    private static final int SIZE_TYPE_EMBEDDED = 0;
    private static final int SIZE_TYPE_FULL = 1;
    private static final int SIZE_TYPE_MINIMAL = 2;
    private static final int SIZE_TYPE_UNDEFINED = -1;
    private static final int UX_STATE_ALL_VISIBLE = 0;
    private static final int UX_STATE_ANIMATING = 3;
    private static final int UX_STATE_NONE_VISIBLE = 2;
    private static final int UX_STATE_ONLY_PROGRESS_VISIBLE = 1;
    private AccessibilityManager mAccessibilityManager;
    private View mAdExternalLink;
    private TextView mAdRemainingView;
    private TextView mAdSkipView;
    List<String> mAudioTrackDescriptionList;
    List<SessionPlayer.TrackInfo> mAudioTracks;
    ViewGroup mBasicControls;
    private View mBottomBarBackground;
    private ViewGroup mBottomBarLeft;
    ViewGroup mCenterView;
    private View mCenterViewBackground;
    long mCurrentSeekPosition;
    TextView mCurrentTime;
    int mCustomPlaybackSpeedIndex;
    long mDelayedAnimationIntervalMs;
    boolean mDragging;
    long mDuration;
    private int mEmbeddedSettingsItemWidth;
    private View mEmbeddedTransportControls;
    private TextView mEndTime;
    ViewGroup mExtraControls;
    private final View.OnClickListener mFfwdListener;
    private StringBuilder mFormatBuilder;
    private Formatter mFormatter;
    ImageButton mFullScreenButton;
    private final View.OnClickListener mFullScreenListener;
    private int mFullSettingsItemWidth;
    private View mFullTransportControls;
    private final Runnable mHideAllBars;
    AnimatorSet mHideAllBarsAnimator;
    Runnable mHideMainBars;
    AnimatorSet mHideMainBarsAnimator;
    final Runnable mHideProgressBar;
    AnimatorSet mHideProgressBarAnimator;
    boolean mIsAdvertisement;
    private boolean mIsAttachedToVideoView;
    boolean mIsFullScreen;
    boolean mIsShowingReplayButton;
    ImageButton mMinimalFullScreenButton;
    ViewGroup mMinimalFullScreenView;
    private View mMinimalTransportControls;
    boolean mNeedToHideBars;
    boolean mNeedToShowBars;
    private final View.OnClickListener mNextListener;
    long mNextSeekPosition;
    OnFullScreenListener mOnFullScreenListener;
    ValueAnimator mOverflowHideAnimator;
    private final View.OnClickListener mOverflowHideListener;
    boolean mOverflowIsShowing;
    ValueAnimator mOverflowShowAnimator;
    private final View.OnClickListener mOverflowShowListener;
    private final View.OnClickListener mPlayPauseListener;
    List<Integer> mPlaybackSpeedMultBy100List;
    List<String> mPlaybackSpeedTextList;
    PlayerWrapper mPlayer;
    private final View.OnClickListener mPrevListener;
    SeekBar mProgress;
    private ViewGroup mProgressBar;
    Resources mResources;
    private final View.OnClickListener mRewListener;
    boolean mSeekAvailable;
    private final SeekBar.OnSeekBarChangeListener mSeekListener;
    int mSelectedAudioTrackIndex;
    int mSelectedSpeedIndex;
    int mSelectedSubtitleTrackIndex;
    SettingsAdapter mSettingsAdapter;
    private final View.OnClickListener mSettingsButtonListener;
    private PopupWindow.OnDismissListener mSettingsDismissListener;
    private List<Integer> mSettingsIconIdsList;
    private final AdapterView.OnItemClickListener mSettingsItemClickListener;
    private int mSettingsItemHeight;
    private ListView mSettingsListView;
    private List<String> mSettingsMainTextsList;
    int mSettingsMode;
    List<String> mSettingsSubTextsList;
    private PopupWindow mSettingsWindow;
    private int mSettingsWindowMargin;
    final Runnable mShowAllBars;
    AnimatorSet mShowAllBarsAnimator;
    AnimatorSet mShowMainBarsAnimator;
    int mSizeType;
    SubSettingsAdapter mSubSettingsAdapter;
    ImageButton mSubtitleButton;
    List<String> mSubtitleDescriptionsList;
    private final View.OnClickListener mSubtitleListener;
    List<SessionPlayer.TrackInfo> mSubtitleTracks;
    private ViewGroup mTimeView;
    private View mTitleBar;
    private TextView mTitleView;
    private SparseArray<View> mTransportControlsMap;
    final Runnable mUpdateProgress;
    int mUxState;
    int mVideoTrackCount;
    boolean mWasPlaying;
    private static final String TAG = "MediaControlView";
    static final boolean DEBUG = Log.isLoggable(TAG, 3);

    public interface OnFullScreenListener {
        void onFullScreen(View view, boolean z);
    }

    @Override // androidx.media2.widget.MediaViewGroup, android.view.View
    public /* bridge */ /* synthetic */ void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
    }

    public MediaControlView(Context context) {
        this(context, null);
    }

    public MediaControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsAttachedToVideoView = false;
        this.mSizeType = -1;
        this.mTransportControlsMap = new SparseArray<>();
        this.mAudioTracks = new ArrayList();
        this.mSubtitleTracks = new ArrayList();
        this.mUpdateProgress = new Runnable() { // from class: androidx.media2.widget.MediaControlView.14
            @Override // java.lang.Runnable
            public void run() {
                boolean z = MediaControlView.this.getVisibility() == 0;
                if (MediaControlView.this.mDragging || !z || MediaControlView.this.mPlayer == null || !MediaControlView.this.mPlayer.isPlaying()) {
                    return;
                }
                long progress = MediaControlView.this.setProgress();
                MediaControlView mediaControlView = MediaControlView.this;
                mediaControlView.postDelayedRunnable(mediaControlView.mUpdateProgress, MediaControlView.DEFAULT_PROGRESS_UPDATE_TIME_MS - (progress % MediaControlView.DEFAULT_PROGRESS_UPDATE_TIME_MS));
            }
        };
        this.mShowAllBars = new Runnable() { // from class: androidx.media2.widget.MediaControlView.15
            @Override // java.lang.Runnable
            public void run() {
                int i2 = MediaControlView.this.mUxState;
                if (i2 == 1) {
                    MediaControlView.this.mShowMainBarsAnimator.start();
                } else if (i2 == 2) {
                    MediaControlView.this.mShowAllBarsAnimator.start();
                } else if (i2 == 3) {
                    MediaControlView.this.mNeedToShowBars = true;
                }
                if (MediaControlView.this.mPlayer.isPlaying()) {
                    MediaControlView mediaControlView = MediaControlView.this;
                    mediaControlView.postDelayedRunnable(mediaControlView.mHideMainBars, MediaControlView.this.mDelayedAnimationIntervalMs);
                }
            }
        };
        this.mHideAllBars = new Runnable() { // from class: androidx.media2.widget.MediaControlView.16
            @Override // java.lang.Runnable
            public void run() {
                if (MediaControlView.this.shouldNotHideBars()) {
                    return;
                }
                MediaControlView.this.mHideAllBarsAnimator.start();
            }
        };
        this.mHideMainBars = new Runnable() { // from class: androidx.media2.widget.MediaControlView.17
            @Override // java.lang.Runnable
            public void run() {
                if (!MediaControlView.this.mPlayer.isPlaying() || MediaControlView.this.shouldNotHideBars()) {
                    return;
                }
                MediaControlView.this.mHideMainBarsAnimator.start();
                MediaControlView mediaControlView = MediaControlView.this;
                mediaControlView.postDelayedRunnable(mediaControlView.mHideProgressBar, MediaControlView.this.mDelayedAnimationIntervalMs);
            }
        };
        this.mHideProgressBar = new Runnable() { // from class: androidx.media2.widget.MediaControlView.18
            @Override // java.lang.Runnable
            public void run() {
                if (!MediaControlView.this.mPlayer.isPlaying() || MediaControlView.this.shouldNotHideBars()) {
                    return;
                }
                MediaControlView.this.mHideProgressBarAnimator.start();
            }
        };
        this.mSeekListener = new SeekBar.OnSeekBarChangeListener() { // from class: androidx.media2.widget.MediaControlView.19
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (MediaControlView.this.mPlayer == null || !MediaControlView.this.mSeekAvailable) {
                    return;
                }
                MediaControlView.this.mDragging = true;
                MediaControlView mediaControlView = MediaControlView.this;
                mediaControlView.removeCallbacks(mediaControlView.mUpdateProgress);
                MediaControlView mediaControlView2 = MediaControlView.this;
                mediaControlView2.removeCallbacks(mediaControlView2.mHideMainBars);
                MediaControlView mediaControlView3 = MediaControlView.this;
                mediaControlView3.removeCallbacks(mediaControlView3.mHideProgressBar);
                if (MediaControlView.this.mIsShowingReplayButton) {
                    MediaControlView.this.updateReplayButton(false);
                }
                if (MediaControlView.this.isCurrentMediaItemFromNetwork() && MediaControlView.this.mPlayer.isPlaying()) {
                    MediaControlView.this.mWasPlaying = true;
                    MediaControlView.this.mPlayer.pause();
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                if (MediaControlView.this.mPlayer != null && MediaControlView.this.mSeekAvailable && z && MediaControlView.this.mDragging && MediaControlView.this.mDuration > 0) {
                    MediaControlView.this.seekTo((MediaControlView.this.mDuration * ((long) i2)) / MediaControlView.DEFAULT_PROGRESS_UPDATE_TIME_MS, !MediaControlView.this.isCurrentMediaItemFromNetwork());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (MediaControlView.this.mPlayer == null || !MediaControlView.this.mSeekAvailable) {
                    return;
                }
                MediaControlView.this.mDragging = false;
                long latestSeekPosition = MediaControlView.this.getLatestSeekPosition();
                if (MediaControlView.this.isCurrentMediaItemFromNetwork()) {
                    MediaControlView.this.mCurrentSeekPosition = -1L;
                    MediaControlView.this.mNextSeekPosition = -1L;
                }
                MediaControlView.this.seekTo(latestSeekPosition, true);
                if (MediaControlView.this.mWasPlaying) {
                    MediaControlView.this.mWasPlaying = false;
                    MediaControlView.this.mPlayer.play();
                }
            }
        };
        this.mPlayPauseListener = new View.OnClickListener() { // from class: androidx.media2.widget.MediaControlView.20
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MediaControlView.this.mPlayer == null) {
                    return;
                }
                MediaControlView.this.resetHideCallbacks();
                MediaControlView.this.togglePausePlayState();
            }
        };
        this.mRewListener = new View.OnClickListener() { // from class: androidx.media2.widget.MediaControlView.21
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MediaControlView.this.mPlayer == null) {
                    return;
                }
                MediaControlView.this.resetHideCallbacks();
                MediaControlView mediaControlView = MediaControlView.this;
                mediaControlView.removeCallbacks(mediaControlView.mUpdateProgress);
                boolean z = MediaControlView.this.mIsShowingReplayButton && MediaControlView.this.mDuration != 0;
                MediaControlView mediaControlView2 = MediaControlView.this;
                MediaControlView.this.seekTo(Math.max((z ? mediaControlView2.mDuration : mediaControlView2.getLatestSeekPosition()) - 10000, 0L), true);
                if (z) {
                    MediaControlView.this.updateReplayButton(false);
                }
            }
        };
        this.mFfwdListener = new View.OnClickListener() { // from class: androidx.media2.widget.MediaControlView.22
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MediaControlView.this.mPlayer == null) {
                    return;
                }
                MediaControlView.this.resetHideCallbacks();
                MediaControlView mediaControlView = MediaControlView.this;
                mediaControlView.removeCallbacks(mediaControlView.mUpdateProgress);
                long latestSeekPosition = MediaControlView.this.getLatestSeekPosition();
                MediaControlView mediaControlView2 = MediaControlView.this;
                long j = latestSeekPosition + 30000;
                mediaControlView2.seekTo(Math.min(j, mediaControlView2.mDuration), true);
                if (j < MediaControlView.this.mDuration || MediaControlView.this.mPlayer.isPlaying()) {
                    return;
                }
                MediaControlView.this.updateReplayButton(true);
            }
        };
        this.mNextListener = new View.OnClickListener() { // from class: androidx.media2.widget.MediaControlView.23
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MediaControlView.this.mPlayer == null) {
                    return;
                }
                MediaControlView.this.resetHideCallbacks();
                MediaControlView.this.mPlayer.skipToNextItem();
            }
        };
        this.mPrevListener = new View.OnClickListener() { // from class: androidx.media2.widget.MediaControlView.24
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MediaControlView.this.mPlayer == null) {
                    return;
                }
                MediaControlView.this.resetHideCallbacks();
                MediaControlView.this.mPlayer.skipToPreviousItem();
            }
        };
        this.mSubtitleListener = new View.OnClickListener() { // from class: androidx.media2.widget.MediaControlView.25
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MediaControlView.this.mPlayer == null) {
                    return;
                }
                MediaControlView mediaControlView = MediaControlView.this;
                mediaControlView.removeCallbacks(mediaControlView.mHideMainBars);
                MediaControlView mediaControlView2 = MediaControlView.this;
                mediaControlView2.removeCallbacks(mediaControlView2.mHideProgressBar);
                MediaControlView.this.mSettingsMode = 2;
                MediaControlView.this.mSubSettingsAdapter.setTexts(MediaControlView.this.mSubtitleDescriptionsList);
                MediaControlView.this.mSubSettingsAdapter.setCheckPosition(MediaControlView.this.mSelectedSubtitleTrackIndex + 1);
                MediaControlView mediaControlView3 = MediaControlView.this;
                mediaControlView3.displaySettingsWindow(mediaControlView3.mSubSettingsAdapter);
            }
        };
        this.mFullScreenListener = new View.OnClickListener() { // from class: androidx.media2.widget.MediaControlView.26
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MediaControlView.this.mOnFullScreenListener == null) {
                    return;
                }
                boolean z = !MediaControlView.this.mIsFullScreen;
                if (z) {
                    MediaControlView.this.mFullScreenButton.setImageDrawable(ContextCompat.getDrawable(MediaControlView.this.getContext(), C0793R.drawable.media2_widget_ic_fullscreen_exit));
                    MediaControlView.this.mMinimalFullScreenButton.setImageDrawable(ContextCompat.getDrawable(MediaControlView.this.getContext(), C0793R.drawable.media2_widget_ic_fullscreen_exit));
                } else {
                    MediaControlView.this.mFullScreenButton.setImageDrawable(ContextCompat.getDrawable(MediaControlView.this.getContext(), C0793R.drawable.media2_widget_ic_fullscreen));
                    MediaControlView.this.mMinimalFullScreenButton.setImageDrawable(ContextCompat.getDrawable(MediaControlView.this.getContext(), C0793R.drawable.media2_widget_ic_fullscreen));
                }
                MediaControlView.this.mIsFullScreen = z;
                OnFullScreenListener onFullScreenListener = MediaControlView.this.mOnFullScreenListener;
                MediaControlView mediaControlView = MediaControlView.this;
                onFullScreenListener.onFullScreen(mediaControlView, mediaControlView.mIsFullScreen);
            }
        };
        this.mOverflowShowListener = new View.OnClickListener() { // from class: androidx.media2.widget.MediaControlView.27
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MediaControlView.this.mPlayer == null) {
                    return;
                }
                MediaControlView.this.resetHideCallbacks();
                MediaControlView.this.mOverflowIsShowing = true;
                MediaControlView.this.mOverflowShowAnimator.start();
            }
        };
        this.mOverflowHideListener = new View.OnClickListener() { // from class: androidx.media2.widget.MediaControlView.28
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MediaControlView.this.mPlayer == null) {
                    return;
                }
                MediaControlView.this.resetHideCallbacks();
                MediaControlView.this.mOverflowIsShowing = false;
                MediaControlView.this.mOverflowHideAnimator.start();
            }
        };
        this.mSettingsButtonListener = new View.OnClickListener() { // from class: androidx.media2.widget.MediaControlView.29
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MediaControlView.this.mPlayer == null) {
                    return;
                }
                MediaControlView mediaControlView = MediaControlView.this;
                mediaControlView.removeCallbacks(mediaControlView.mHideMainBars);
                MediaControlView mediaControlView2 = MediaControlView.this;
                mediaControlView2.removeCallbacks(mediaControlView2.mHideProgressBar);
                MediaControlView.this.mSettingsMode = 3;
                MediaControlView.this.mSettingsAdapter.setSubTexts(MediaControlView.this.mSettingsSubTextsList);
                MediaControlView mediaControlView3 = MediaControlView.this;
                mediaControlView3.displaySettingsWindow(mediaControlView3.mSettingsAdapter);
            }
        };
        this.mSettingsItemClickListener = new AdapterView.OnItemClickListener() { // from class: androidx.media2.widget.MediaControlView.30
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                int i3 = MediaControlView.this.mSettingsMode;
                if (i3 == 0) {
                    if (i2 != MediaControlView.this.mSelectedAudioTrackIndex && MediaControlView.this.mAudioTracks.size() > 0) {
                        MediaControlView.this.mPlayer.selectTrack(MediaControlView.this.mAudioTracks.get(i2));
                    }
                    MediaControlView.this.dismissSettingsWindow();
                    return;
                }
                if (i3 == 1) {
                    if (i2 != MediaControlView.this.mSelectedSpeedIndex) {
                        MediaControlView.this.mPlayer.setPlaybackSpeed(MediaControlView.this.mPlaybackSpeedMultBy100List.get(i2).intValue() / 100.0f);
                    }
                    MediaControlView.this.dismissSettingsWindow();
                    return;
                }
                if (i3 == 2) {
                    if (i2 != MediaControlView.this.mSelectedSubtitleTrackIndex + 1) {
                        if (i2 > 0) {
                            MediaControlView.this.mPlayer.selectTrack(MediaControlView.this.mSubtitleTracks.get(i2 - 1));
                        } else {
                            MediaControlView.this.mPlayer.deselectTrack(MediaControlView.this.mSubtitleTracks.get(MediaControlView.this.mSelectedSubtitleTrackIndex));
                        }
                    }
                    MediaControlView.this.dismissSettingsWindow();
                    return;
                }
                if (i3 != 3) {
                    return;
                }
                if (i2 == 0) {
                    MediaControlView.this.mSubSettingsAdapter.setTexts(MediaControlView.this.mAudioTrackDescriptionList);
                    MediaControlView.this.mSubSettingsAdapter.setCheckPosition(MediaControlView.this.mSelectedAudioTrackIndex);
                    MediaControlView.this.mSettingsMode = 0;
                } else if (i2 == 1) {
                    MediaControlView.this.mSubSettingsAdapter.setTexts(MediaControlView.this.mPlaybackSpeedTextList);
                    MediaControlView.this.mSubSettingsAdapter.setCheckPosition(MediaControlView.this.mSelectedSpeedIndex);
                    MediaControlView.this.mSettingsMode = 1;
                }
                MediaControlView mediaControlView = MediaControlView.this;
                mediaControlView.displaySettingsWindow(mediaControlView.mSubSettingsAdapter);
            }
        };
        this.mSettingsDismissListener = new PopupWindow.OnDismissListener() { // from class: androidx.media2.widget.MediaControlView.31
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                if (MediaControlView.this.mNeedToHideBars) {
                    MediaControlView mediaControlView = MediaControlView.this;
                    mediaControlView.postDelayedRunnable(mediaControlView.mHideMainBars, MediaControlView.this.mDelayedAnimationIntervalMs);
                }
            }
        };
        this.mResources = context.getResources();
        inflate(context, C0793R.layout.media2_widget_media_controller, this);
        initControllerView();
        this.mDelayedAnimationIntervalMs = DEFAULT_DELAYED_ANIMATION_INTERVAL_MS;
        this.mAccessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public void setMediaController(MediaController mediaController) {
        if (mediaController == null) {
            throw new NullPointerException("controller must not be null");
        }
        if (this.mIsAttachedToVideoView) {
            throw new IllegalStateException("It's attached to VideoView. Use VideoView's method.");
        }
        setMediaControllerInternal(mediaController);
    }

    void setMediaControllerInternal(MediaController mediaController) {
        PlayerWrapper playerWrapper = this.mPlayer;
        if (playerWrapper != null) {
            playerWrapper.detachCallback();
        }
        this.mPlayer = new PlayerWrapper(mediaController, ContextCompat.getMainExecutor(getContext()), new PlayerCallback());
        if (ViewCompat.isAttachedToWindow(this)) {
            this.mPlayer.attachCallback();
        }
    }

    public void setPlayer(SessionPlayer sessionPlayer) {
        if (sessionPlayer == null) {
            throw new NullPointerException("player must not be null");
        }
        if (this.mIsAttachedToVideoView) {
            throw new IllegalStateException("It's attached to VideoView. Use VideoView's method.");
        }
        setPlayerInternal(sessionPlayer);
    }

    void setPlayerInternal(SessionPlayer sessionPlayer) {
        PlayerWrapper playerWrapper = this.mPlayer;
        if (playerWrapper != null) {
            playerWrapper.detachCallback();
        }
        this.mPlayer = new PlayerWrapper(sessionPlayer, ContextCompat.getMainExecutor(getContext()), new PlayerCallback());
        if (ViewCompat.isAttachedToWindow(this)) {
            this.mPlayer.attachCallback();
        }
    }

    public void setOnFullScreenListener(OnFullScreenListener onFullScreenListener) {
        if (onFullScreenListener == null) {
            this.mOnFullScreenListener = null;
            this.mFullScreenButton.setVisibility(8);
        } else {
            this.mOnFullScreenListener = onFullScreenListener;
            this.mFullScreenButton.setVisibility(0);
        }
    }

    public void requestPlayButtonFocus() {
        ImageButton imageButtonFindControlButton = findControlButton(this.mSizeType, C0793R.id.pause);
        if (imageButtonFindControlButton != null) {
            imageButtonFindControlButton.requestFocus();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.media2.widget.MediaControlView";
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mPlayer == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 && (!isCurrentItemMusic() || this.mSizeType != 1)) {
            if (this.mUxState == 0) {
                hideMediaControlView();
            } else {
                showMediaControlView();
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (this.mPlayer == null) {
            return super.onTrackballEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 && (!isCurrentItemMusic() || this.mSizeType != 1)) {
            if (this.mUxState == 0) {
                hideMediaControlView();
            } else {
                showMediaControlView();
            }
        }
        return true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int measuredState;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iResolveSize = resolveSize(getSuggestedMinimumWidth(), i);
        int iResolveSize2 = resolveSize(getSuggestedMinimumHeight(), i2);
        int paddingLeft = (iResolveSize - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (iResolveSize2 - getPaddingTop()) - getPaddingBottom();
        if (paddingLeft < 0) {
            measuredState = 16777216;
            i3 = 0;
        } else {
            i3 = paddingLeft;
            measuredState = 0;
        }
        if (paddingTop < 0) {
            measuredState |= 256;
            paddingTop = 0;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, BasicMeasure.EXACTLY);
                } else if (layoutParams.width == -2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 0);
                } else {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.width, BasicMeasure.EXACTLY);
                }
                if (layoutParams.height == -1) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, BasicMeasure.EXACTLY);
                } else if (layoutParams.height == -2) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 0);
                } else {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, BasicMeasure.EXACTLY);
                }
                childAt.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                measuredState |= childAt.getMeasuredState();
            }
        }
        setMeasuredDimension(resolveSizeAndState(iResolveSize, i, measuredState), resolveSizeAndState(iResolveSize2, i2, measuredState << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredHeight;
        int paddingLeft = ((i3 - i) - getPaddingLeft()) - getPaddingRight();
        int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        int measuredWidth = this.mBottomBarLeft.getMeasuredWidth() + this.mTimeView.getMeasuredWidth() + this.mBasicControls.getMeasuredWidth();
        int measuredHeight2 = this.mTitleBar.getMeasuredHeight() + this.mProgressBar.getMeasuredHeight() + this.mBottomBarBackground.getMeasuredHeight();
        int measuredWidth2 = this.mTimeView.getMeasuredWidth() + this.mBasicControls.getMeasuredWidth();
        int measuredHeight3 = this.mTitleBar.getMeasuredHeight() + this.mEmbeddedTransportControls.getMeasuredHeight() + this.mProgressBar.getMeasuredHeight() + this.mBottomBarBackground.getMeasuredHeight();
        if (this.mIsAdvertisement || (measuredWidth <= paddingLeft && measuredHeight2 <= paddingTop)) {
            i5 = 1;
        } else {
            i5 = (measuredWidth2 > paddingLeft || measuredHeight3 > paddingTop) ? 2 : 0;
        }
        if (this.mSizeType != i5) {
            this.mSizeType = i5;
            updateLayoutForSizeChange(i5);
        }
        this.mTitleBar.setVisibility(i5 != 2 ? 0 : 4);
        this.mCenterViewBackground.setVisibility(i5 != 1 ? 0 : 4);
        this.mEmbeddedTransportControls.setVisibility(i5 == 0 ? 0 : 4);
        this.mMinimalTransportControls.setVisibility(i5 == 2 ? 0 : 4);
        this.mBottomBarBackground.setVisibility(i5 != 2 ? 0 : 4);
        this.mBottomBarLeft.setVisibility(i5 == 1 ? 0 : 4);
        this.mTimeView.setVisibility(i5 != 2 ? 0 : 4);
        this.mBasicControls.setVisibility(i5 != 2 ? 0 : 4);
        this.mMinimalFullScreenButton.setVisibility(i5 != 2 ? 4 : 0);
        int paddingLeft2 = getPaddingLeft();
        int i6 = paddingLeft + paddingLeft2;
        int paddingTop2 = getPaddingTop();
        int i7 = paddingTop + paddingTop2;
        layoutChild(this.mTitleBar, paddingLeft2, paddingTop2);
        layoutChild(this.mCenterView, paddingLeft2, paddingTop2);
        View view = this.mBottomBarBackground;
        layoutChild(view, paddingLeft2, i7 - view.getMeasuredHeight());
        ViewGroup viewGroup = this.mBottomBarLeft;
        layoutChild(viewGroup, paddingLeft2, i7 - viewGroup.getMeasuredHeight());
        layoutChild(this.mTimeView, i5 == 1 ? (i6 - this.mBasicControls.getMeasuredWidth()) - this.mTimeView.getMeasuredWidth() : paddingLeft2, i7 - this.mTimeView.getMeasuredHeight());
        ViewGroup viewGroup2 = this.mBasicControls;
        layoutChild(viewGroup2, i6 - viewGroup2.getMeasuredWidth(), i7 - this.mBasicControls.getMeasuredHeight());
        ViewGroup viewGroup3 = this.mExtraControls;
        layoutChild(viewGroup3, i6, i7 - viewGroup3.getMeasuredHeight());
        ViewGroup viewGroup4 = this.mProgressBar;
        if (i5 == 2) {
            measuredHeight = i7 - viewGroup4.getMeasuredHeight();
        } else {
            measuredHeight = (i7 - viewGroup4.getMeasuredHeight()) - this.mResources.getDimensionPixelSize(C0793R.dimen.media2_widget_custom_progress_margin_bottom);
        }
        layoutChild(viewGroup4, paddingLeft2, measuredHeight);
        ViewGroup viewGroup5 = this.mMinimalFullScreenView;
        layoutChild(viewGroup5, paddingLeft2, i7 - viewGroup5.getMeasuredHeight());
    }

    private void layoutChild(View view, int i, int i2) {
        view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    @Override // androidx.media2.widget.MediaViewGroup
    void onVisibilityAggregatedCompat(boolean z) {
        super.onVisibilityAggregatedCompat(z);
        if (this.mPlayer == null) {
            return;
        }
        if (z) {
            removeCallbacks(this.mUpdateProgress);
            post(this.mUpdateProgress);
        } else {
            removeCallbacks(this.mUpdateProgress);
        }
    }

    void setDelayedAnimationInterval(long j) {
        this.mDelayedAnimationIntervalMs = j;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        PlayerWrapper playerWrapper = this.mPlayer;
        if (playerWrapper != null) {
            playerWrapper.attachCallback();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PlayerWrapper playerWrapper = this.mPlayer;
        if (playerWrapper != null) {
            playerWrapper.detachCallback();
        }
    }

    void setAttachedToVideoView(boolean z) {
        this.mIsAttachedToVideoView = z;
    }

    static View inflateLayout(Context context, int i) {
        return ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i, (ViewGroup) null);
    }

    private void initControllerView() {
        this.mTitleBar = findViewById(C0793R.id.title_bar);
        this.mTitleView = (TextView) findViewById(C0793R.id.title_text);
        this.mAdExternalLink = findViewById(C0793R.id.ad_external_link);
        this.mCenterView = (ViewGroup) findViewById(C0793R.id.center_view);
        this.mCenterViewBackground = findViewById(C0793R.id.center_view_background);
        this.mEmbeddedTransportControls = initTransportControls(C0793R.id.embedded_transport_controls);
        this.mMinimalTransportControls = initTransportControls(C0793R.id.minimal_transport_controls);
        this.mMinimalFullScreenView = (ViewGroup) findViewById(C0793R.id.minimal_fullscreen_view);
        ImageButton imageButton = (ImageButton) findViewById(C0793R.id.minimal_fullscreen);
        this.mMinimalFullScreenButton = imageButton;
        imageButton.setOnClickListener(this.mFullScreenListener);
        this.mProgressBar = (ViewGroup) findViewById(C0793R.id.progress_bar);
        SeekBar seekBar = (SeekBar) findViewById(C0793R.id.progress);
        this.mProgress = seekBar;
        seekBar.setOnSeekBarChangeListener(this.mSeekListener);
        this.mProgress.setMax(1000);
        this.mCurrentSeekPosition = -1L;
        this.mNextSeekPosition = -1L;
        this.mBottomBarBackground = findViewById(C0793R.id.bottom_bar_background);
        this.mBottomBarLeft = (ViewGroup) findViewById(C0793R.id.bottom_bar_left);
        this.mFullTransportControls = initTransportControls(C0793R.id.full_transport_controls);
        this.mTimeView = (ViewGroup) findViewById(C0793R.id.time);
        this.mEndTime = (TextView) findViewById(C0793R.id.time_end);
        this.mCurrentTime = (TextView) findViewById(C0793R.id.time_current);
        this.mAdSkipView = (TextView) findViewById(C0793R.id.ad_skip_time);
        this.mFormatBuilder = new StringBuilder();
        this.mFormatter = new Formatter(this.mFormatBuilder, Locale.getDefault());
        this.mBasicControls = (ViewGroup) findViewById(C0793R.id.basic_controls);
        this.mExtraControls = (ViewGroup) findViewById(C0793R.id.extra_controls);
        ImageButton imageButton2 = (ImageButton) findViewById(C0793R.id.subtitle);
        this.mSubtitleButton = imageButton2;
        imageButton2.setOnClickListener(this.mSubtitleListener);
        ImageButton imageButton3 = (ImageButton) findViewById(C0793R.id.fullscreen);
        this.mFullScreenButton = imageButton3;
        imageButton3.setOnClickListener(this.mFullScreenListener);
        ((ImageButton) findViewById(C0793R.id.overflow_show)).setOnClickListener(this.mOverflowShowListener);
        ((ImageButton) findViewById(C0793R.id.overflow_hide)).setOnClickListener(this.mOverflowHideListener);
        ((ImageButton) findViewById(C0793R.id.settings)).setOnClickListener(this.mSettingsButtonListener);
        this.mAdRemainingView = (TextView) findViewById(C0793R.id.ad_remaining);
        initializeSettingsLists();
        this.mSettingsListView = (ListView) inflateLayout(getContext(), C0793R.layout.media2_widget_settings_list);
        this.mSettingsAdapter = new SettingsAdapter(this.mSettingsMainTextsList, this.mSettingsSubTextsList, this.mSettingsIconIdsList);
        this.mSubSettingsAdapter = new SubSettingsAdapter(null, 0);
        this.mSettingsListView.setAdapter((ListAdapter) this.mSettingsAdapter);
        this.mSettingsListView.setChoiceMode(1);
        this.mSettingsListView.setOnItemClickListener(this.mSettingsItemClickListener);
        this.mTransportControlsMap.append(0, this.mEmbeddedTransportControls);
        this.mTransportControlsMap.append(1, this.mFullTransportControls);
        this.mTransportControlsMap.append(2, this.mMinimalTransportControls);
        this.mEmbeddedSettingsItemWidth = this.mResources.getDimensionPixelSize(C0793R.dimen.media2_widget_embedded_settings_width);
        this.mFullSettingsItemWidth = this.mResources.getDimensionPixelSize(C0793R.dimen.media2_widget_full_settings_width);
        this.mSettingsItemHeight = this.mResources.getDimensionPixelSize(C0793R.dimen.media2_widget_settings_height);
        this.mSettingsWindowMargin = this.mResources.getDimensionPixelSize(C0793R.dimen.media2_widget_settings_offset);
        PopupWindow popupWindow = new PopupWindow((View) this.mSettingsListView, this.mEmbeddedSettingsItemWidth, -2, true);
        this.mSettingsWindow = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        this.mSettingsWindow.setOnDismissListener(this.mSettingsDismissListener);
        float dimension = this.mResources.getDimension(C0793R.dimen.media2_widget_title_bar_height);
        float dimension2 = this.mResources.getDimension(C0793R.dimen.media2_widget_custom_progress_thumb_size);
        float dimension3 = this.mResources.getDimension(C0793R.dimen.media2_widget_bottom_bar_height);
        View[] viewArr = {this.mBottomBarBackground, this.mBottomBarLeft, this.mTimeView, this.mBasicControls, this.mExtraControls, this.mProgressBar};
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media2.widget.MediaControlView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MediaControlView.this.mProgress.getThumb().setLevel((int) ((MediaControlView.this.mSizeType == 2 ? 0 : 10000) * fFloatValue));
                MediaControlView.this.mCenterView.setAlpha(fFloatValue);
                MediaControlView.this.mMinimalFullScreenView.setAlpha(fFloatValue);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: androidx.media2.widget.MediaControlView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MediaControlView.this.mCenterView.setVisibility(4);
                MediaControlView.this.mMinimalFullScreenView.setVisibility(4);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media2.widget.MediaControlView.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MediaControlView.this.mProgress.getThumb().setLevel((int) ((MediaControlView.this.mSizeType == 2 ? 0 : 10000) * fFloatValue));
                MediaControlView.this.mCenterView.setAlpha(fFloatValue);
                MediaControlView.this.mMinimalFullScreenView.setAlpha(fFloatValue);
            }
        });
        valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: androidx.media2.widget.MediaControlView.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                MediaControlView.this.mCenterView.setVisibility(0);
                MediaControlView.this.mMinimalFullScreenView.setVisibility(0);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.mHideMainBarsAnimator = animatorSet;
        float f = -dimension;
        animatorSet.play(valueAnimatorOfFloat).with(AnimatorUtil.ofTranslationY(0.0f, f, this.mTitleBar)).with(AnimatorUtil.ofTranslationYTogether(0.0f, dimension3, viewArr));
        this.mHideMainBarsAnimator.setDuration(250L);
        this.mHideMainBarsAnimator.addListener(new AnimatorListenerAdapter() { // from class: androidx.media2.widget.MediaControlView.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                MediaControlView.this.mUxState = 3;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MediaControlView.this.mUxState = 1;
                if (MediaControlView.this.mNeedToShowBars) {
                    MediaControlView mediaControlView = MediaControlView.this;
                    mediaControlView.post(mediaControlView.mShowAllBars);
                    MediaControlView.this.mNeedToShowBars = false;
                }
            }
        });
        float f2 = dimension2 + dimension3;
        AnimatorSet animatorSetOfTranslationYTogether = AnimatorUtil.ofTranslationYTogether(dimension3, f2, viewArr);
        this.mHideProgressBarAnimator = animatorSetOfTranslationYTogether;
        animatorSetOfTranslationYTogether.setDuration(250L);
        this.mHideProgressBarAnimator.addListener(new AnimatorListenerAdapter() { // from class: androidx.media2.widget.MediaControlView.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                MediaControlView.this.mUxState = 3;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MediaControlView.this.mUxState = 2;
                if (MediaControlView.this.mNeedToShowBars) {
                    MediaControlView mediaControlView = MediaControlView.this;
                    mediaControlView.post(mediaControlView.mShowAllBars);
                    MediaControlView.this.mNeedToShowBars = false;
                }
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.mHideAllBarsAnimator = animatorSet2;
        animatorSet2.play(valueAnimatorOfFloat).with(AnimatorUtil.ofTranslationY(0.0f, f, this.mTitleBar)).with(AnimatorUtil.ofTranslationYTogether(0.0f, f2, viewArr));
        this.mHideAllBarsAnimator.setDuration(250L);
        this.mHideAllBarsAnimator.addListener(new AnimatorListenerAdapter() { // from class: androidx.media2.widget.MediaControlView.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                MediaControlView.this.mUxState = 3;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MediaControlView.this.mUxState = 2;
                if (MediaControlView.this.mNeedToShowBars) {
                    MediaControlView mediaControlView = MediaControlView.this;
                    mediaControlView.post(mediaControlView.mShowAllBars);
                    MediaControlView.this.mNeedToShowBars = false;
                }
            }
        });
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.mShowMainBarsAnimator = animatorSet3;
        animatorSet3.play(valueAnimatorOfFloat2).with(AnimatorUtil.ofTranslationY(f, 0.0f, this.mTitleBar)).with(AnimatorUtil.ofTranslationYTogether(dimension3, 0.0f, viewArr));
        this.mShowMainBarsAnimator.setDuration(250L);
        this.mShowMainBarsAnimator.addListener(new AnimatorListenerAdapter() { // from class: androidx.media2.widget.MediaControlView.8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                MediaControlView.this.mUxState = 3;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MediaControlView.this.mUxState = 0;
            }
        });
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.mShowAllBarsAnimator = animatorSet4;
        animatorSet4.play(valueAnimatorOfFloat2).with(AnimatorUtil.ofTranslationY(f, 0.0f, this.mTitleBar)).with(AnimatorUtil.ofTranslationYTogether(f2, 0.0f, viewArr));
        this.mShowAllBarsAnimator.setDuration(250L);
        this.mShowAllBarsAnimator.addListener(new AnimatorListenerAdapter() { // from class: androidx.media2.widget.MediaControlView.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                MediaControlView.this.mUxState = 3;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MediaControlView.this.mUxState = 0;
            }
        });
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mOverflowShowAnimator = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        this.mOverflowShowAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media2.widget.MediaControlView.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                MediaControlView.this.animateOverflow(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.mOverflowShowAnimator.addListener(new AnimatorListenerAdapter() { // from class: androidx.media2.widget.MediaControlView.11
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                MediaControlView.this.mExtraControls.setVisibility(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MediaControlView.this.mBasicControls.setVisibility(4);
                MediaControlView.this.findFullSizedControlButton(C0793R.id.ffwd).setVisibility((MediaControlView.this.mPlayer == null || !MediaControlView.this.mPlayer.canSeekForward()) ? 8 : 4);
            }
        });
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.mOverflowHideAnimator = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        this.mOverflowHideAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media2.widget.MediaControlView.12
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                MediaControlView.this.animateOverflow(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.mOverflowHideAnimator.addListener(new AnimatorListenerAdapter() { // from class: androidx.media2.widget.MediaControlView.13
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                MediaControlView.this.mBasicControls.setVisibility(0);
                MediaControlView.this.findFullSizedControlButton(C0793R.id.ffwd).setVisibility((MediaControlView.this.mPlayer == null || !MediaControlView.this.mPlayer.canSeekForward()) ? 8 : 0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MediaControlView.this.mExtraControls.setVisibility(8);
            }
        });
    }

    String stringForTime(long j) {
        long j2 = j / DEFAULT_PROGRESS_UPDATE_TIME_MS;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        this.mFormatBuilder.setLength(0);
        return j5 > 0 ? this.mFormatter.format("%d:%02d:%02d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : this.mFormatter.format("%02d:%02d", Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    long setProgress() {
        ensurePlayerIsNotNull();
        long currentPosition = this.mPlayer.getCurrentPosition();
        long j = this.mDuration;
        if (currentPosition > j) {
            currentPosition = j;
        }
        int i = j > 0 ? (int) ((currentPosition * DEFAULT_PROGRESS_UPDATE_TIME_MS) / j) : 0;
        SeekBar seekBar = this.mProgress;
        if (seekBar != null && currentPosition != j) {
            seekBar.setProgress(i);
            if (this.mPlayer.getBufferPercentage() < 0) {
                this.mProgress.setSecondaryProgress(1000);
            } else {
                this.mProgress.setSecondaryProgress(((int) this.mPlayer.getBufferPercentage()) * 10);
            }
        }
        TextView textView = this.mEndTime;
        if (textView != null) {
            textView.setText(stringForTime(this.mDuration));
        }
        TextView textView2 = this.mCurrentTime;
        if (textView2 != null) {
            textView2.setText(stringForTime(currentPosition));
        }
        if (this.mIsAdvertisement) {
            TextView textView3 = this.mAdSkipView;
            if (textView3 != null) {
                if (currentPosition <= AD_SKIP_WAIT_TIME_MS) {
                    if (textView3.getVisibility() == 8) {
                        this.mAdSkipView.setVisibility(0);
                    }
                    this.mAdSkipView.setText(this.mResources.getString(C0793R.string.MediaControlView_ad_skip_wait_time, Long.valueOf(((AD_SKIP_WAIT_TIME_MS - currentPosition) / DEFAULT_PROGRESS_UPDATE_TIME_MS) + 1)));
                } else if (textView3.getVisibility() == 0) {
                    this.mAdSkipView.setVisibility(8);
                    findFullSizedControlButton(C0793R.id.next).setEnabled(true);
                    findFullSizedControlButton(C0793R.id.next).clearColorFilter();
                }
            }
            if (this.mAdRemainingView != null) {
                long j2 = this.mDuration;
                this.mAdRemainingView.setText(this.mResources.getString(C0793R.string.MediaControlView_ad_remaining_time, stringForTime(j2 - currentPosition >= 0 ? j2 - currentPosition : 0L)));
            }
        }
        return currentPosition;
    }

    void togglePausePlayState() {
        ensurePlayerIsNotNull();
        if (this.mPlayer.isPlaying()) {
            this.mPlayer.pause();
            updatePlayButton(1);
        } else {
            if (this.mIsShowingReplayButton) {
                this.mPlayer.seekTo(0L);
            }
            this.mPlayer.play();
            updatePlayButton(0);
        }
    }

    private void showMediaControlView() {
        if (this.mUxState == 3) {
            return;
        }
        removeCallbacks(this.mHideMainBars);
        removeCallbacks(this.mHideProgressBar);
        post(this.mShowAllBars);
    }

    private void hideMediaControlView() {
        if (shouldNotHideBars() || this.mUxState == 3) {
            return;
        }
        removeCallbacks(this.mHideMainBars);
        removeCallbacks(this.mHideProgressBar);
        post(this.mHideAllBars);
    }

    void updateTimeViews(MediaItem mediaItem) {
        if (mediaItem == null) {
            this.mProgress.setProgress(0);
            this.mCurrentTime.setText(this.mResources.getString(C0793R.string.MediaControlView_time_placeholder));
            this.mEndTime.setText(this.mResources.getString(C0793R.string.MediaControlView_time_placeholder));
        } else {
            ensurePlayerIsNotNull();
            long durationMs = this.mPlayer.getDurationMs();
            if (durationMs > 0) {
                this.mDuration = durationMs;
                setProgress();
            }
        }
    }

    void updateTitleView(MediaItem mediaItem) {
        if (mediaItem == null) {
            this.mTitleView.setText((CharSequence) null);
            return;
        }
        if (!isCurrentItemMusic()) {
            CharSequence title = this.mPlayer.getTitle();
            if (title == null) {
                title = this.mResources.getString(C0793R.string.mcv2_non_music_title_unknown_text);
            }
            this.mTitleView.setText(title.toString());
            return;
        }
        CharSequence title2 = this.mPlayer.getTitle();
        if (title2 == null) {
            title2 = this.mResources.getString(C0793R.string.mcv2_music_title_unknown_text);
        }
        CharSequence artistText = this.mPlayer.getArtistText();
        if (artistText == null) {
            artistText = this.mResources.getString(C0793R.string.mcv2_music_artist_unknown_text);
        }
        this.mTitleView.setText(title2.toString() + " - " + artistText.toString());
    }

    void updateLayoutForAd() {
        ensurePlayerIsNotNull();
        if (this.mIsAdvertisement) {
            findFullSizedControlButton(C0793R.id.rew).setVisibility(8);
            findFullSizedControlButton(C0793R.id.ffwd).setVisibility(8);
            findFullSizedControlButton(C0793R.id.prev).setVisibility(8);
            findFullSizedControlButton(C0793R.id.next).setVisibility(0);
            findFullSizedControlButton(C0793R.id.next).setEnabled(false);
            findFullSizedControlButton(C0793R.id.next).setColorFilter(C0793R.color.media2_widget_gray);
            this.mTimeView.setVisibility(8);
            this.mAdSkipView.setVisibility(0);
            this.mAdRemainingView.setVisibility(0);
            this.mAdExternalLink.setVisibility(0);
            this.mProgress.setEnabled(false);
            return;
        }
        findFullSizedControlButton(C0793R.id.rew).setVisibility(this.mPlayer.canSeekBackward() ? 0 : 8);
        findFullSizedControlButton(C0793R.id.ffwd).setVisibility(this.mPlayer.canSeekForward() ? 0 : 8);
        findFullSizedControlButton(C0793R.id.prev).setVisibility(this.mPlayer.canSkipToPrevious() ? 0 : 8);
        findFullSizedControlButton(C0793R.id.next).setVisibility(this.mPlayer.canSkipToNext() ? 0 : 8);
        findFullSizedControlButton(C0793R.id.next).setEnabled(true);
        findFullSizedControlButton(C0793R.id.next).clearColorFilter();
        this.mTimeView.setVisibility(0);
        this.mAdSkipView.setVisibility(8);
        this.mAdRemainingView.setVisibility(8);
        this.mAdExternalLink.setVisibility(8);
        this.mProgress.setEnabled(this.mSeekAvailable);
    }

    private void updateLayoutForSizeChange(int i) {
        if (i == 0 || i == 1) {
            this.mProgress.getThumb().setLevel(10000);
        } else if (i == 2) {
            this.mProgress.getThumb().setLevel(0);
        }
        updateReplayButton(this.mIsShowingReplayButton);
    }

    private View initTransportControls(int i) {
        View viewFindViewById = findViewById(i);
        ImageButton imageButton = (ImageButton) viewFindViewById.findViewById(C0793R.id.pause);
        if (imageButton != null) {
            imageButton.setOnClickListener(this.mPlayPauseListener);
        }
        ImageButton imageButton2 = (ImageButton) viewFindViewById.findViewById(C0793R.id.ffwd);
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(this.mFfwdListener);
        }
        ImageButton imageButton3 = (ImageButton) viewFindViewById.findViewById(C0793R.id.rew);
        if (imageButton3 != null) {
            imageButton3.setOnClickListener(this.mRewListener);
        }
        ImageButton imageButton4 = (ImageButton) viewFindViewById.findViewById(C0793R.id.next);
        if (imageButton4 != null) {
            imageButton4.setOnClickListener(this.mNextListener);
        }
        ImageButton imageButton5 = (ImageButton) viewFindViewById.findViewById(C0793R.id.prev);
        if (imageButton5 != null) {
            imageButton5.setOnClickListener(this.mPrevListener);
        }
        return viewFindViewById;
    }

    private void initializeSettingsLists() {
        ArrayList arrayList = new ArrayList();
        this.mSettingsMainTextsList = arrayList;
        arrayList.add(this.mResources.getString(C0793R.string.MediaControlView_audio_track_text));
        this.mSettingsMainTextsList.add(this.mResources.getString(C0793R.string.MediaControlView_playback_speed_text));
        ArrayList arrayList2 = new ArrayList();
        this.mSettingsSubTextsList = arrayList2;
        arrayList2.add(this.mResources.getString(C0793R.string.MediaControlView_audio_track_none_text));
        String string = this.mResources.getString(C0793R.string.MediaControlView_playback_speed_normal);
        this.mSettingsSubTextsList.add(string);
        this.mSettingsSubTextsList.add("");
        ArrayList arrayList3 = new ArrayList();
        this.mSettingsIconIdsList = arrayList3;
        arrayList3.add(Integer.valueOf(C0793R.drawable.media2_widget_ic_audiotrack));
        this.mSettingsIconIdsList.add(Integer.valueOf(C0793R.drawable.media2_widget_ic_speed));
        ArrayList arrayList4 = new ArrayList();
        this.mAudioTrackDescriptionList = arrayList4;
        arrayList4.add(this.mResources.getString(C0793R.string.MediaControlView_audio_track_none_text));
        ArrayList arrayList5 = new ArrayList(Arrays.asList(this.mResources.getStringArray(C0793R.array.MediaControlView_playback_speeds)));
        this.mPlaybackSpeedTextList = arrayList5;
        arrayList5.add(3, string);
        this.mSelectedSpeedIndex = 3;
        this.mPlaybackSpeedMultBy100List = new ArrayList();
        for (int i : this.mResources.getIntArray(C0793R.array.media2_widget_speed_multiplied_by_100)) {
            this.mPlaybackSpeedMultBy100List.add(Integer.valueOf(i));
        }
        this.mCustomPlaybackSpeedIndex = -1;
    }

    ImageButton findControlButton(int i, int i2) {
        View view = this.mTransportControlsMap.get(i);
        if (view == null) {
            return null;
        }
        return (ImageButton) view.findViewById(i2);
    }

    ImageButton findFullSizedControlButton(int i) {
        ImageButton imageButtonFindControlButton = findControlButton(1, i);
        if (imageButtonFindControlButton != null) {
            return imageButtonFindControlButton;
        }
        throw new IllegalArgumentException("Couldn't find a view that has the given id");
    }

    boolean isCurrentMediaItemFromNetwork() {
        ensurePlayerIsNotNull();
        MediaItem currentMediaItem = this.mPlayer.getCurrentMediaItem();
        if (currentMediaItem instanceof UriMediaItem) {
            return UriUtil.isFromNetwork(((UriMediaItem) currentMediaItem).getUri());
        }
        return false;
    }

    void displaySettingsWindow(BaseAdapter baseAdapter) {
        this.mSettingsListView.setAdapter((ListAdapter) baseAdapter);
        this.mSettingsWindow.setWidth(this.mSizeType == 0 ? this.mEmbeddedSettingsItemWidth : this.mFullSettingsItemWidth);
        int height = getHeight() - (this.mSettingsWindowMargin * 2);
        int count = baseAdapter.getCount() * this.mSettingsItemHeight;
        if (count < height) {
            height = count;
        }
        this.mSettingsWindow.setHeight(height);
        this.mNeedToHideBars = false;
        this.mSettingsWindow.dismiss();
        if (height > 0) {
            this.mSettingsWindow.showAsDropDown(this, (getWidth() - this.mSettingsWindow.getWidth()) - this.mSettingsWindowMargin, (-this.mSettingsWindow.getHeight()) - this.mSettingsWindowMargin);
            this.mNeedToHideBars = true;
        }
    }

    void dismissSettingsWindow() {
        this.mNeedToHideBars = true;
        this.mSettingsWindow.dismiss();
    }

    void animateOverflow(float f) {
        this.mExtraControls.setTranslationX(((int) (this.mExtraControls.getWidth() * f)) * (-1));
        float f2 = 1.0f - f;
        this.mTimeView.setAlpha(f2);
        this.mBasicControls.setAlpha(f2);
        this.mFullTransportControls.setTranslationX(((int) (findFullSizedControlButton(C0793R.id.pause).getLeft() * f)) * (-1));
        findFullSizedControlButton(C0793R.id.ffwd).setAlpha(f2);
    }

    void resetHideCallbacks() {
        removeCallbacks(this.mHideMainBars);
        removeCallbacks(this.mHideProgressBar);
        postDelayedRunnable(this.mHideMainBars, this.mDelayedAnimationIntervalMs);
    }

    void updateAllowedCommands() {
        ensurePlayerIsNotNull();
        boolean zCanPause = this.mPlayer.canPause();
        boolean zCanSeekBackward = this.mPlayer.canSeekBackward();
        boolean zCanSeekForward = this.mPlayer.canSeekForward();
        boolean zCanSkipToPrevious = this.mPlayer.canSkipToPrevious();
        boolean zCanSkipToNext = this.mPlayer.canSkipToNext();
        boolean zCanSeekTo = this.mPlayer.canSeekTo();
        int size = this.mTransportControlsMap.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.mTransportControlsMap.keyAt(i);
            ImageButton imageButtonFindControlButton = findControlButton(iKeyAt, C0793R.id.pause);
            if (imageButtonFindControlButton != null) {
                imageButtonFindControlButton.setVisibility(zCanPause ? 0 : 8);
            }
            ImageButton imageButtonFindControlButton2 = findControlButton(iKeyAt, C0793R.id.rew);
            if (imageButtonFindControlButton2 != null) {
                imageButtonFindControlButton2.setVisibility(zCanSeekBackward ? 0 : 8);
            }
            ImageButton imageButtonFindControlButton3 = findControlButton(iKeyAt, C0793R.id.ffwd);
            if (imageButtonFindControlButton3 != null) {
                imageButtonFindControlButton3.setVisibility(zCanSeekForward ? 0 : 8);
            }
            ImageButton imageButtonFindControlButton4 = findControlButton(iKeyAt, C0793R.id.prev);
            if (imageButtonFindControlButton4 != null) {
                imageButtonFindControlButton4.setVisibility(zCanSkipToPrevious ? 0 : 8);
            }
            ImageButton imageButtonFindControlButton5 = findControlButton(iKeyAt, C0793R.id.next);
            if (imageButtonFindControlButton5 != null) {
                imageButtonFindControlButton5.setVisibility(zCanSkipToNext ? 0 : 8);
            }
        }
        this.mSeekAvailable = zCanSeekTo;
        this.mProgress.setEnabled(zCanSeekTo);
        updateSubtitleButtonVisibility();
    }

    void updateSubtitleButtonVisibility() {
        if (!this.mPlayer.canSelectDeselectTrack() || (this.mVideoTrackCount == 0 && this.mAudioTracks.isEmpty() && this.mSubtitleTracks.isEmpty())) {
            this.mSubtitleButton.setVisibility(8);
            this.mSubtitleButton.setEnabled(false);
            return;
        }
        if (this.mSubtitleTracks.isEmpty()) {
            if (isCurrentItemMusic()) {
                this.mSubtitleButton.setVisibility(8);
                this.mSubtitleButton.setEnabled(false);
                return;
            } else {
                this.mSubtitleButton.setVisibility(0);
                this.mSubtitleButton.setAlpha(0.5f);
                this.mSubtitleButton.setEnabled(false);
                return;
            }
        }
        this.mSubtitleButton.setVisibility(0);
        this.mSubtitleButton.setAlpha(1.0f);
        this.mSubtitleButton.setEnabled(true);
    }

    void updatePrevNextButtons(int i, int i2) {
        int size = this.mTransportControlsMap.size();
        for (int i3 = 0; i3 < size; i3++) {
            int iKeyAt = this.mTransportControlsMap.keyAt(i3);
            ImageButton imageButtonFindControlButton = findControlButton(iKeyAt, C0793R.id.prev);
            if (imageButtonFindControlButton != null) {
                if (i > -1) {
                    imageButtonFindControlButton.setAlpha(1.0f);
                    imageButtonFindControlButton.setEnabled(true);
                } else {
                    imageButtonFindControlButton.setAlpha(0.5f);
                    imageButtonFindControlButton.setEnabled(false);
                }
            }
            ImageButton imageButtonFindControlButton2 = findControlButton(iKeyAt, C0793R.id.next);
            if (imageButtonFindControlButton2 != null) {
                if (i2 > -1) {
                    imageButtonFindControlButton2.setAlpha(1.0f);
                    imageButtonFindControlButton2.setEnabled(true);
                } else {
                    imageButtonFindControlButton2.setAlpha(0.5f);
                    imageButtonFindControlButton2.setEnabled(false);
                }
            }
        }
    }

    boolean shouldNotHideBars() {
        return (isCurrentItemMusic() && this.mSizeType == 1) || this.mAccessibilityManager.isTouchExplorationEnabled() || this.mPlayer.getPlayerState() == 3 || this.mPlayer.getPlayerState() == 0;
    }

    void seekTo(long j, boolean z) {
        ensurePlayerIsNotNull();
        long j2 = this.mDuration;
        this.mProgress.setProgress(j2 <= 0 ? 0 : (int) ((DEFAULT_PROGRESS_UPDATE_TIME_MS * j) / j2));
        this.mCurrentTime.setText(stringForTime(j));
        if (this.mCurrentSeekPosition == -1) {
            this.mCurrentSeekPosition = j;
            if (z) {
                this.mPlayer.seekTo(j);
                return;
            }
            return;
        }
        this.mNextSeekPosition = j;
    }

    long getLatestSeekPosition() {
        ensurePlayerIsNotNull();
        long j = this.mNextSeekPosition;
        if (j != -1) {
            return j;
        }
        long j2 = this.mCurrentSeekPosition;
        return j2 != -1 ? j2 : this.mPlayer.getCurrentPosition();
    }

    void removeCustomSpeedFromList() {
        this.mPlaybackSpeedMultBy100List.remove(this.mCustomPlaybackSpeedIndex);
        this.mPlaybackSpeedTextList.remove(this.mCustomPlaybackSpeedIndex);
        this.mCustomPlaybackSpeedIndex = -1;
    }

    void updateSelectedSpeed(int i, String str) {
        this.mSelectedSpeedIndex = i;
        this.mSettingsSubTextsList.set(1, str);
        this.mSubSettingsAdapter.setTexts(this.mPlaybackSpeedTextList);
        this.mSubSettingsAdapter.setCheckPosition(this.mSelectedSpeedIndex);
    }

    void updateReplayButton(boolean z) {
        ImageButton imageButtonFindControlButton = findControlButton(this.mSizeType, C0793R.id.ffwd);
        if (z) {
            this.mIsShowingReplayButton = true;
            updatePlayButton(2);
            if (imageButtonFindControlButton != null) {
                imageButtonFindControlButton.setAlpha(0.5f);
                imageButtonFindControlButton.setEnabled(false);
                return;
            }
            return;
        }
        this.mIsShowingReplayButton = false;
        PlayerWrapper playerWrapper = this.mPlayer;
        if (playerWrapper != null && playerWrapper.isPlaying()) {
            updatePlayButton(0);
        } else {
            updatePlayButton(1);
        }
        if (imageButtonFindControlButton != null) {
            imageButtonFindControlButton.setAlpha(1.0f);
            imageButtonFindControlButton.setEnabled(true);
        }
    }

    void updatePlayButton(int i) {
        Drawable drawable;
        String string;
        ImageButton imageButtonFindControlButton = findControlButton(this.mSizeType, C0793R.id.pause);
        if (imageButtonFindControlButton == null) {
            return;
        }
        if (i == 0) {
            drawable = ContextCompat.getDrawable(getContext(), C0793R.drawable.media2_widget_ic_pause_circle_filled);
            string = this.mResources.getString(C0793R.string.mcv2_pause_button_desc);
        } else if (i == 1) {
            drawable = ContextCompat.getDrawable(getContext(), C0793R.drawable.media2_widget_ic_play_circle_filled);
            string = this.mResources.getString(C0793R.string.mcv2_play_button_desc);
        } else if (i == 2) {
            drawable = ContextCompat.getDrawable(getContext(), C0793R.drawable.media2_widget_ic_replay_circle_filled);
            string = this.mResources.getString(C0793R.string.mcv2_replay_button_desc);
        } else {
            throw new IllegalArgumentException("unknown type " + i);
        }
        imageButtonFindControlButton.setImageDrawable(drawable);
        imageButtonFindControlButton.setContentDescription(string);
    }

    void postDelayedRunnable(Runnable runnable, long j) {
        if (j != -1) {
            postDelayed(runnable, j);
        }
    }

    void ensurePlayerIsNotNull() {
        if (this.mPlayer == null) {
            throw new IllegalStateException("mPlayer must not be null");
        }
    }

    void updateTracks(PlayerWrapper playerWrapper, List<SessionPlayer.TrackInfo> list) {
        String string;
        this.mVideoTrackCount = 0;
        this.mAudioTracks = new ArrayList();
        this.mSubtitleTracks = new ArrayList();
        this.mSelectedAudioTrackIndex = 0;
        this.mSelectedSubtitleTrackIndex = -1;
        SessionPlayer.TrackInfo selectedTrack = playerWrapper.getSelectedTrack(2);
        SessionPlayer.TrackInfo selectedTrack2 = playerWrapper.getSelectedTrack(4);
        for (int i = 0; i < list.size(); i++) {
            int trackType = list.get(i).getTrackType();
            if (trackType == 1) {
                this.mVideoTrackCount++;
            } else if (trackType == 2) {
                if (list.get(i).equals(selectedTrack)) {
                    this.mSelectedAudioTrackIndex = this.mAudioTracks.size();
                }
                this.mAudioTracks.add(list.get(i));
            } else if (trackType == 4) {
                if (list.get(i).equals(selectedTrack2)) {
                    this.mSelectedSubtitleTrackIndex = this.mSubtitleTracks.size();
                }
                this.mSubtitleTracks.add(list.get(i));
            }
        }
        this.mAudioTrackDescriptionList = new ArrayList();
        if (this.mAudioTracks.isEmpty()) {
            this.mAudioTrackDescriptionList.add(this.mResources.getString(C0793R.string.MediaControlView_audio_track_none_text));
        } else {
            int i2 = 0;
            while (i2 < this.mAudioTracks.size()) {
                i2++;
                this.mAudioTrackDescriptionList.add(this.mResources.getString(C0793R.string.MediaControlView_audio_track_number_text, Integer.valueOf(i2)));
            }
        }
        this.mSettingsSubTextsList.set(0, this.mAudioTrackDescriptionList.get(this.mSelectedAudioTrackIndex));
        this.mSubtitleDescriptionsList = new ArrayList();
        if (!this.mSubtitleTracks.isEmpty()) {
            this.mSubtitleDescriptionsList.add(this.mResources.getString(C0793R.string.MediaControlView_subtitle_off_text));
            for (int i3 = 0; i3 < this.mSubtitleTracks.size(); i3++) {
                String iSO3Language = this.mSubtitleTracks.get(i3).getLanguage().getISO3Language();
                if (iSO3Language.equals("und")) {
                    string = this.mResources.getString(C0793R.string.MediaControlView_subtitle_track_number_text, Integer.valueOf(i3 + 1));
                } else {
                    string = this.mResources.getString(C0793R.string.MediaControlView_subtitle_track_number_and_lang_text, Integer.valueOf(i3 + 1), iSO3Language);
                }
                this.mSubtitleDescriptionsList.add(string);
            }
        }
        updateSubtitleButtonVisibility();
    }

    private boolean hasActualVideo() {
        if (this.mVideoTrackCount > 0) {
            return true;
        }
        VideoSize videoSize = this.mPlayer.getVideoSize();
        if (videoSize.getHeight() <= 0 || videoSize.getWidth() <= 0) {
            return false;
        }
        Log.w(TAG, "video track count is zero, but it renders video. size: " + videoSize);
        return true;
    }

    private boolean isCurrentItemMusic() {
        return !hasActualVideo() && this.mAudioTracks.size() > 0;
    }

    private class SettingsAdapter extends BaseAdapter {
        private List<Integer> mIconIds;
        private List<String> mMainTexts;
        private List<String> mSubTexts;

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        SettingsAdapter(List<String> list, List<String> list2, List<Integer> list3) {
            this.mMainTexts = list;
            this.mSubTexts = list2;
            this.mIconIds = list3;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<String> list = this.mMainTexts;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View viewInflateLayout = MediaControlView.inflateLayout(MediaControlView.this.getContext(), C0793R.layout.media2_widget_settings_list_item);
            TextView textView = (TextView) viewInflateLayout.findViewById(C0793R.id.main_text);
            TextView textView2 = (TextView) viewInflateLayout.findViewById(C0793R.id.sub_text);
            ImageView imageView = (ImageView) viewInflateLayout.findViewById(C0793R.id.icon);
            textView.setText(this.mMainTexts.get(i));
            List<String> list = this.mSubTexts;
            if (list == null || "".equals(list.get(i))) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(this.mSubTexts.get(i));
            }
            List<Integer> list2 = this.mIconIds;
            if (list2 == null || list2.get(i).intValue() == -1) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(ContextCompat.getDrawable(MediaControlView.this.getContext(), this.mIconIds.get(i).intValue()));
            }
            return viewInflateLayout;
        }

        public void setSubTexts(List<String> list) {
            this.mSubTexts = list;
        }
    }

    private class SubSettingsAdapter extends BaseAdapter {
        private int mCheckPosition;
        private List<String> mTexts;

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        SubSettingsAdapter(List<String> list, int i) {
            this.mTexts = list;
            this.mCheckPosition = i;
        }

        public String getMainText(int i) {
            List<String> list = this.mTexts;
            if (list != null && i < list.size()) {
                return this.mTexts.get(i);
            }
            return "";
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<String> list = this.mTexts;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View viewInflateLayout = MediaControlView.inflateLayout(MediaControlView.this.getContext(), C0793R.layout.media2_widget_sub_settings_list_item);
            TextView textView = (TextView) viewInflateLayout.findViewById(C0793R.id.text);
            ImageView imageView = (ImageView) viewInflateLayout.findViewById(C0793R.id.check);
            textView.setText(this.mTexts.get(i));
            if (i != this.mCheckPosition) {
                imageView.setVisibility(4);
            }
            return viewInflateLayout;
        }

        public void setTexts(List<String> list) {
            this.mTexts = list;
        }

        public void setCheckPosition(int i) {
            this.mCheckPosition = i;
        }
    }

    class PlayerCallback extends PlayerWrapper.PlayerCallback {
        PlayerCallback() {
        }

        @Override // androidx.media2.widget.PlayerWrapper.PlayerCallback
        public void onPlayerStateChanged(PlayerWrapper playerWrapper, int i) {
            if (playerWrapper != MediaControlView.this.mPlayer) {
                return;
            }
            if (MediaControlView.DEBUG) {
                Log.d(MediaControlView.TAG, "onPlayerStateChanged(state: " + i + ")");
            }
            MediaControlView.this.updateTimeViews(playerWrapper.getCurrentMediaItem());
            if (i == 1) {
                MediaControlView.this.updatePlayButton(1);
                MediaControlView mediaControlView = MediaControlView.this;
                mediaControlView.removeCallbacks(mediaControlView.mUpdateProgress);
                MediaControlView mediaControlView2 = MediaControlView.this;
                mediaControlView2.removeCallbacks(mediaControlView2.mHideMainBars);
                MediaControlView mediaControlView3 = MediaControlView.this;
                mediaControlView3.removeCallbacks(mediaControlView3.mHideProgressBar);
                MediaControlView mediaControlView4 = MediaControlView.this;
                mediaControlView4.post(mediaControlView4.mShowAllBars);
                return;
            }
            if (i == 2) {
                MediaControlView mediaControlView5 = MediaControlView.this;
                mediaControlView5.removeCallbacks(mediaControlView5.mUpdateProgress);
                MediaControlView mediaControlView6 = MediaControlView.this;
                mediaControlView6.post(mediaControlView6.mUpdateProgress);
                MediaControlView.this.resetHideCallbacks();
                MediaControlView.this.updateReplayButton(false);
                return;
            }
            if (i != 3) {
                return;
            }
            MediaControlView.this.updatePlayButton(1);
            MediaControlView mediaControlView7 = MediaControlView.this;
            mediaControlView7.removeCallbacks(mediaControlView7.mUpdateProgress);
            if (MediaControlView.this.getWindowToken() != null) {
                new AlertDialog.Builder(MediaControlView.this.getContext()).setMessage(C0793R.string.mcv2_playback_error_text).setPositiveButton(C0793R.string.mcv2_error_dialog_button, new DialogInterface.OnClickListener() { // from class: androidx.media2.widget.MediaControlView.PlayerCallback.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        dialogInterface.dismiss();
                    }
                }).setCancelable(true).show();
            }
        }

        @Override // androidx.media2.widget.PlayerWrapper.PlayerCallback
        public void onSeekCompleted(PlayerWrapper playerWrapper, long j) {
            if (playerWrapper != MediaControlView.this.mPlayer) {
                return;
            }
            if (MediaControlView.DEBUG) {
                Log.d(MediaControlView.TAG, "onSeekCompleted(): " + j);
            }
            MediaControlView.this.mProgress.setProgress(MediaControlView.this.mDuration <= 0 ? 0 : (int) ((MediaControlView.DEFAULT_PROGRESS_UPDATE_TIME_MS * j) / MediaControlView.this.mDuration));
            MediaControlView.this.mCurrentTime.setText(MediaControlView.this.stringForTime(j));
            if (MediaControlView.this.mNextSeekPosition != -1) {
                MediaControlView mediaControlView = MediaControlView.this;
                mediaControlView.mCurrentSeekPosition = mediaControlView.mNextSeekPosition;
                playerWrapper.seekTo(MediaControlView.this.mNextSeekPosition);
                MediaControlView.this.mNextSeekPosition = -1L;
                return;
            }
            MediaControlView.this.mCurrentSeekPosition = -1L;
            if (MediaControlView.this.mDragging) {
                return;
            }
            MediaControlView mediaControlView2 = MediaControlView.this;
            mediaControlView2.removeCallbacks(mediaControlView2.mUpdateProgress);
            MediaControlView mediaControlView3 = MediaControlView.this;
            mediaControlView3.removeCallbacks(mediaControlView3.mHideMainBars);
            MediaControlView mediaControlView4 = MediaControlView.this;
            mediaControlView4.post(mediaControlView4.mUpdateProgress);
            MediaControlView mediaControlView5 = MediaControlView.this;
            mediaControlView5.postDelayedRunnable(mediaControlView5.mHideMainBars, MediaControlView.this.mDelayedAnimationIntervalMs);
        }

        @Override // androidx.media2.widget.PlayerWrapper.PlayerCallback
        public void onCurrentMediaItemChanged(PlayerWrapper playerWrapper, MediaItem mediaItem) {
            if (playerWrapper != MediaControlView.this.mPlayer) {
                return;
            }
            if (MediaControlView.DEBUG) {
                Log.d(MediaControlView.TAG, "onCurrentMediaItemChanged(): " + mediaItem);
            }
            MediaControlView.this.updateTimeViews(mediaItem);
            MediaControlView.this.updateTitleView(mediaItem);
            MediaControlView.this.updatePrevNextButtons(playerWrapper.getPreviousMediaItemIndex(), playerWrapper.getNextMediaItemIndex());
        }

        @Override // androidx.media2.widget.PlayerWrapper.PlayerCallback
        void onPlaylistChanged(PlayerWrapper playerWrapper, List<MediaItem> list, MediaMetadata mediaMetadata) {
            if (playerWrapper != MediaControlView.this.mPlayer) {
                return;
            }
            if (MediaControlView.DEBUG) {
                Log.d(MediaControlView.TAG, "onPlaylistChanged(): list: " + list + ", metadata: " + mediaMetadata);
            }
            MediaControlView.this.updatePrevNextButtons(playerWrapper.getPreviousMediaItemIndex(), playerWrapper.getNextMediaItemIndex());
        }

        @Override // androidx.media2.widget.PlayerWrapper.PlayerCallback
        public void onPlaybackCompleted(PlayerWrapper playerWrapper) {
            if (playerWrapper != MediaControlView.this.mPlayer) {
                return;
            }
            if (MediaControlView.DEBUG) {
                Log.d(MediaControlView.TAG, "onPlaybackCompleted()");
            }
            MediaControlView.this.updateReplayButton(true);
            MediaControlView.this.mProgress.setProgress(1000);
            TextView textView = MediaControlView.this.mCurrentTime;
            MediaControlView mediaControlView = MediaControlView.this;
            textView.setText(mediaControlView.stringForTime(mediaControlView.mDuration));
        }

        @Override // androidx.media2.widget.PlayerWrapper.PlayerCallback
        public void onAllowedCommandsChanged(PlayerWrapper playerWrapper, SessionCommandGroup sessionCommandGroup) {
            if (playerWrapper != MediaControlView.this.mPlayer) {
                return;
            }
            MediaControlView.this.updateAllowedCommands();
        }

        @Override // androidx.media2.widget.PlayerWrapper.PlayerCallback
        public void onPlaybackSpeedChanged(PlayerWrapper playerWrapper, float f) {
            if (playerWrapper != MediaControlView.this.mPlayer) {
                return;
            }
            int iRound = Math.round(f * 100.0f);
            if (MediaControlView.this.mCustomPlaybackSpeedIndex != -1) {
                MediaControlView.this.removeCustomSpeedFromList();
            }
            int i = 0;
            if (MediaControlView.this.mPlaybackSpeedMultBy100List.contains(Integer.valueOf(iRound))) {
                while (i < MediaControlView.this.mPlaybackSpeedMultBy100List.size()) {
                    if (iRound == MediaControlView.this.mPlaybackSpeedMultBy100List.get(i).intValue()) {
                        MediaControlView mediaControlView = MediaControlView.this;
                        mediaControlView.updateSelectedSpeed(i, mediaControlView.mPlaybackSpeedTextList.get(i));
                        return;
                    }
                    i++;
                }
                return;
            }
            String string = MediaControlView.this.mResources.getString(C0793R.string.MediaControlView_custom_playback_speed_text, Float.valueOf(iRound / 100.0f));
            while (i < MediaControlView.this.mPlaybackSpeedMultBy100List.size()) {
                if (iRound < MediaControlView.this.mPlaybackSpeedMultBy100List.get(i).intValue()) {
                    MediaControlView.this.mPlaybackSpeedMultBy100List.add(i, Integer.valueOf(iRound));
                    MediaControlView.this.mPlaybackSpeedTextList.add(i, string);
                    MediaControlView.this.updateSelectedSpeed(i, string);
                    break;
                } else {
                    if (i == MediaControlView.this.mPlaybackSpeedMultBy100List.size() - 1 && iRound > MediaControlView.this.mPlaybackSpeedMultBy100List.get(i).intValue()) {
                        MediaControlView.this.mPlaybackSpeedMultBy100List.add(Integer.valueOf(iRound));
                        MediaControlView.this.mPlaybackSpeedTextList.add(string);
                        MediaControlView.this.updateSelectedSpeed(i + 1, string);
                    }
                    i++;
                }
            }
            MediaControlView mediaControlView2 = MediaControlView.this;
            mediaControlView2.mCustomPlaybackSpeedIndex = mediaControlView2.mSelectedSpeedIndex;
        }

        @Override // androidx.media2.widget.PlayerWrapper.PlayerCallback
        void onTracksChanged(PlayerWrapper playerWrapper, List<SessionPlayer.TrackInfo> list) {
            if (playerWrapper != MediaControlView.this.mPlayer) {
                return;
            }
            if (MediaControlView.DEBUG) {
                Log.d(MediaControlView.TAG, "onTrackInfoChanged(): " + list);
            }
            MediaControlView.this.updateTracks(playerWrapper, list);
            MediaControlView.this.updateTimeViews(playerWrapper.getCurrentMediaItem());
            MediaControlView.this.updateTitleView(playerWrapper.getCurrentMediaItem());
        }

        @Override // androidx.media2.widget.PlayerWrapper.PlayerCallback
        void onTrackSelected(PlayerWrapper playerWrapper, SessionPlayer.TrackInfo trackInfo) {
            if (playerWrapper != MediaControlView.this.mPlayer) {
                return;
            }
            if (MediaControlView.DEBUG) {
                Log.d(MediaControlView.TAG, "onTrackSelected(): " + trackInfo);
            }
            if (trackInfo.getTrackType() == 4) {
                for (int i = 0; i < MediaControlView.this.mSubtitleTracks.size(); i++) {
                    if (MediaControlView.this.mSubtitleTracks.get(i).equals(trackInfo)) {
                        MediaControlView.this.mSelectedSubtitleTrackIndex = i;
                        if (MediaControlView.this.mSettingsMode == 2) {
                            MediaControlView.this.mSubSettingsAdapter.setCheckPosition(MediaControlView.this.mSelectedSubtitleTrackIndex + 1);
                        }
                        MediaControlView.this.mSubtitleButton.setImageDrawable(ContextCompat.getDrawable(MediaControlView.this.getContext(), C0793R.drawable.media2_widget_ic_subtitle_on));
                        MediaControlView.this.mSubtitleButton.setContentDescription(MediaControlView.this.mResources.getString(C0793R.string.mcv2_cc_is_on));
                        return;
                    }
                }
                return;
            }
            if (trackInfo.getTrackType() == 2) {
                for (int i2 = 0; i2 < MediaControlView.this.mAudioTracks.size(); i2++) {
                    if (MediaControlView.this.mAudioTracks.get(i2).equals(trackInfo)) {
                        MediaControlView.this.mSelectedAudioTrackIndex = i2;
                        MediaControlView.this.mSettingsSubTextsList.set(0, MediaControlView.this.mSubSettingsAdapter.getMainText(MediaControlView.this.mSelectedAudioTrackIndex));
                        return;
                    }
                }
            }
        }

        @Override // androidx.media2.widget.PlayerWrapper.PlayerCallback
        void onTrackDeselected(PlayerWrapper playerWrapper, SessionPlayer.TrackInfo trackInfo) {
            if (playerWrapper != MediaControlView.this.mPlayer) {
                return;
            }
            if (MediaControlView.DEBUG) {
                Log.d(MediaControlView.TAG, "onTrackDeselected(): " + trackInfo);
            }
            if (trackInfo.getTrackType() == 4) {
                for (int i = 0; i < MediaControlView.this.mSubtitleTracks.size(); i++) {
                    if (MediaControlView.this.mSubtitleTracks.get(i).equals(trackInfo)) {
                        MediaControlView.this.mSelectedSubtitleTrackIndex = -1;
                        if (MediaControlView.this.mSettingsMode == 2) {
                            MediaControlView.this.mSubSettingsAdapter.setCheckPosition(MediaControlView.this.mSelectedSubtitleTrackIndex + 1);
                        }
                        MediaControlView.this.mSubtitleButton.setImageDrawable(ContextCompat.getDrawable(MediaControlView.this.getContext(), C0793R.drawable.media2_widget_ic_subtitle_off));
                        MediaControlView.this.mSubtitleButton.setContentDescription(MediaControlView.this.mResources.getString(C0793R.string.mcv2_cc_is_off));
                        return;
                    }
                }
            }
        }

        @Override // androidx.media2.widget.PlayerWrapper.PlayerCallback
        void onVideoSizeChanged(PlayerWrapper playerWrapper, VideoSize videoSize) {
            List<SessionPlayer.TrackInfo> tracks;
            if (playerWrapper != MediaControlView.this.mPlayer) {
                return;
            }
            if (MediaControlView.DEBUG) {
                Log.d(MediaControlView.TAG, "onVideoSizeChanged(): " + videoSize);
            }
            if (MediaControlView.this.mVideoTrackCount != 0 || videoSize.getHeight() <= 0 || videoSize.getWidth() <= 0 || (tracks = playerWrapper.getTracks()) == null) {
                return;
            }
            MediaControlView.this.updateTracks(playerWrapper, tracks);
        }
    }
}
