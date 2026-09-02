package androidx.media2.widget;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class SubtitleController {
    private static final int WHAT_HIDE = 2;
    private static final int WHAT_SELECT_DEFAULT_TRACK = 4;
    private static final int WHAT_SELECT_TRACK = 3;
    private static final int WHAT_SHOW = 1;
    private Anchor mAnchor;
    private final Handler.Callback mCallback;
    private CaptioningManager.CaptioningChangeListener mCaptioningChangeListener;
    private CaptioningManager mCaptioningManager;
    private Handler mHandler;
    private Listener mListener;
    private ArrayList<Renderer> mRenderers;
    private final Object mRenderersLock;
    private SubtitleTrack mSelectedTrack;
    private MediaTimeProvider mTimeProvider;
    private boolean mTrackIsExplicit;
    private ArrayList<SubtitleTrack> mTracks;
    private final Object mTracksLock;
    private boolean mVisibilityIsExplicit;

    interface Anchor {
        Looper getSubtitleLooper();

        void setSubtitleWidget(SubtitleTrack.RenderingWidget renderingWidget);
    }

    interface Listener {
        void onSubtitleTrackSelected(SubtitleTrack subtitleTrack);
    }

    public static abstract class Renderer {
        public abstract SubtitleTrack createTrack(MediaFormat mediaFormat);

        public abstract boolean supports(MediaFormat mediaFormat);
    }

    SubtitleController(Context context) {
        this(context, null, null);
    }

    SubtitleController(Context context, MediaTimeProvider mediaTimeProvider, Listener listener) {
        this.mRenderersLock = new Object();
        this.mTracksLock = new Object();
        this.mCallback = new Handler.Callback() { // from class: androidx.media2.widget.SubtitleController.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    SubtitleController.this.doShow();
                    return true;
                }
                if (i == 2) {
                    SubtitleController.this.doHide();
                    return true;
                }
                if (i == 3) {
                    SubtitleController.this.doSelectTrack((SubtitleTrack) message.obj);
                    return true;
                }
                if (i != 4) {
                    return false;
                }
                SubtitleController.this.doSelectDefaultTrack();
                return true;
            }
        };
        this.mTrackIsExplicit = false;
        this.mVisibilityIsExplicit = false;
        this.mTimeProvider = mediaTimeProvider;
        this.mListener = listener;
        this.mRenderers = new ArrayList<>();
        this.mTracks = new ArrayList<>();
        this.mCaptioningManager = (CaptioningManager) context.getSystemService("captioning");
        this.mCaptioningChangeListener = new CaptioningManager.CaptioningChangeListener() { // from class: androidx.media2.widget.SubtitleController.2
            @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
            public void onEnabledChanged(boolean z) {
                SubtitleController.this.selectDefaultTrack();
            }

            @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
            public void onLocaleChanged(Locale locale) {
                SubtitleController.this.selectDefaultTrack();
            }
        };
    }

    protected void finalize() throws Throwable {
        CaptioningManagerHelper.Api19Impl.removeCaptioningChangeListener(this.mCaptioningManager, this.mCaptioningChangeListener);
        super.finalize();
    }

    public SubtitleTrack[] getTracks() {
        SubtitleTrack[] subtitleTrackArr;
        synchronized (this.mTracksLock) {
            subtitleTrackArr = new SubtitleTrack[this.mTracks.size()];
            this.mTracks.toArray(subtitleTrackArr);
        }
        return subtitleTrackArr;
    }

    public SubtitleTrack getSelectedTrack() {
        return this.mSelectedTrack;
    }

    private SubtitleTrack.RenderingWidget getRenderingWidget() {
        SubtitleTrack subtitleTrack = this.mSelectedTrack;
        if (subtitleTrack == null) {
            return null;
        }
        return subtitleTrack.getRenderingWidget();
    }

    public boolean selectTrack(SubtitleTrack subtitleTrack) {
        if (subtitleTrack != null && !this.mTracks.contains(subtitleTrack)) {
            return false;
        }
        processOnAnchor(this.mHandler.obtainMessage(3, subtitleTrack));
        return true;
    }

    void doSelectTrack(SubtitleTrack subtitleTrack) {
        this.mTrackIsExplicit = true;
        SubtitleTrack subtitleTrack2 = this.mSelectedTrack;
        if (subtitleTrack2 == subtitleTrack) {
            return;
        }
        if (subtitleTrack2 != null) {
            subtitleTrack2.hide();
            this.mSelectedTrack.setTimeProvider(null);
        }
        this.mSelectedTrack = subtitleTrack;
        Anchor anchor = this.mAnchor;
        if (anchor != null) {
            anchor.setSubtitleWidget(getRenderingWidget());
        }
        SubtitleTrack subtitleTrack3 = this.mSelectedTrack;
        if (subtitleTrack3 != null) {
            subtitleTrack3.setTimeProvider(this.mTimeProvider);
            this.mSelectedTrack.show();
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onSubtitleTrackSelected(subtitleTrack);
        }
    }

    public SubtitleTrack getDefaultTrack() {
        SubtitleTrack subtitleTrack;
        Locale locale = CaptioningManagerHelper.Api19Impl.getLocale(this.mCaptioningManager);
        Locale locale2 = locale == null ? Locale.getDefault() : locale;
        int i = 1;
        boolean z = !CaptioningManagerHelper.Api19Impl.isEnabled(this.mCaptioningManager);
        synchronized (this.mTracksLock) {
            subtitleTrack = null;
            int i2 = -1;
            for (SubtitleTrack subtitleTrack2 : this.mTracks) {
                MediaFormat format = subtitleTrack2.getFormat();
                String string = format.getString("language");
                int i3 = 0;
                int i4 = MediaFormatUtil.getInteger(format, "is-forced-subtitle", 0) != 0 ? i : 0;
                int i5 = MediaFormatUtil.getInteger(format, "is-autoselect", i) != 0 ? i : 0;
                int i6 = MediaFormatUtil.getInteger(format, "is-default", 0) != 0 ? i : 0;
                int i7 = (locale2 == null || locale2.getLanguage().equals("") || locale2.getISO3Language().equals(string) || locale2.getLanguage().equals(string)) ? 1 : 0;
                int i8 = (i4 != 0 ? 0 : 8) + ((locale != null || i6 == 0) ? 0 : 4);
                if (i5 == 0) {
                    i3 = 2;
                }
                int i9 = i8 + i3 + i7;
                if ((!z || i4 != 0) && (((locale == null && i6 != 0) || (i7 != 0 && (i5 != 0 || i4 != 0 || locale != null))) && i9 > i2)) {
                    subtitleTrack = subtitleTrack2;
                    i2 = i9;
                }
                i = 1;
            }
        }
        return subtitleTrack;
    }

    static class MediaFormatUtil {
        MediaFormatUtil() {
        }

        static int getInteger(MediaFormat mediaFormat, String str, int i) {
            try {
                return mediaFormat.getInteger(str);
            } catch (ClassCastException | NullPointerException unused) {
                return i;
            }
        }
    }

    public void selectDefaultTrack() {
        processOnAnchor(this.mHandler.obtainMessage(4));
    }

    void doSelectDefaultTrack() {
        SubtitleTrack subtitleTrack;
        if (this.mTrackIsExplicit) {
            if (this.mVisibilityIsExplicit) {
                return;
            }
            if (CaptioningManagerHelper.Api19Impl.isEnabled(this.mCaptioningManager) || ((subtitleTrack = this.mSelectedTrack) != null && MediaFormatUtil.getInteger(subtitleTrack.getFormat(), "is-forced-subtitle", 0) != 0)) {
                show();
            } else {
                SubtitleTrack subtitleTrack2 = this.mSelectedTrack;
                if (subtitleTrack2 != null && subtitleTrack2.getTrackType() == 4) {
                    hide();
                }
            }
            this.mVisibilityIsExplicit = false;
        }
        SubtitleTrack defaultTrack = getDefaultTrack();
        if (defaultTrack != null) {
            selectTrack(defaultTrack);
            this.mTrackIsExplicit = false;
            if (this.mVisibilityIsExplicit) {
                return;
            }
            show();
            this.mVisibilityIsExplicit = false;
        }
    }

    public void reset() {
        hide();
        selectTrack(null);
        this.mTracks.clear();
        this.mTrackIsExplicit = false;
        this.mVisibilityIsExplicit = false;
        CaptioningManagerHelper.Api19Impl.removeCaptioningChangeListener(this.mCaptioningManager, this.mCaptioningChangeListener);
    }

    public SubtitleTrack addTrack(MediaFormat mediaFormat) {
        SubtitleTrack subtitleTrackCreateTrack;
        synchronized (this.mRenderersLock) {
            try {
                for (Renderer renderer : this.mRenderers) {
                    if (renderer.supports(mediaFormat) && (subtitleTrackCreateTrack = renderer.createTrack(mediaFormat)) != null) {
                        synchronized (this.mTracksLock) {
                            if (this.mTracks.size() == 0) {
                                CaptioningManagerHelper.Api19Impl.addCaptioningChangeListener(this.mCaptioningManager, this.mCaptioningChangeListener);
                            }
                            this.mTracks.add(subtitleTrackCreateTrack);
                        }
                        return subtitleTrackCreateTrack;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void show() {
        processOnAnchor(this.mHandler.obtainMessage(1));
    }

    void doShow() {
        this.mVisibilityIsExplicit = true;
        SubtitleTrack subtitleTrack = this.mSelectedTrack;
        if (subtitleTrack != null) {
            subtitleTrack.show();
        }
    }

    public void hide() {
        processOnAnchor(this.mHandler.obtainMessage(2));
    }

    void doHide() {
        this.mVisibilityIsExplicit = true;
        SubtitleTrack subtitleTrack = this.mSelectedTrack;
        if (subtitleTrack != null) {
            subtitleTrack.hide();
        }
    }

    public void registerRenderer(Renderer renderer) {
        synchronized (this.mRenderersLock) {
            if (!this.mRenderers.contains(renderer)) {
                this.mRenderers.add(renderer);
            }
        }
    }

    public boolean hasRendererFor(MediaFormat mediaFormat) {
        synchronized (this.mRenderersLock) {
            Iterator<Renderer> it = this.mRenderers.iterator();
            while (it.hasNext()) {
                if (it.next().supports(mediaFormat)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void setAnchor(Anchor anchor) {
        Anchor anchor2 = this.mAnchor;
        if (anchor2 == anchor) {
            return;
        }
        if (anchor2 != null) {
            anchor2.setSubtitleWidget(null);
        }
        this.mAnchor = anchor;
        this.mHandler = null;
        if (anchor != null) {
            this.mHandler = new Handler(this.mAnchor.getSubtitleLooper(), this.mCallback);
            this.mAnchor.setSubtitleWidget(getRenderingWidget());
        }
    }

    private void processOnAnchor(Message message) {
        if (Looper.myLooper() == this.mHandler.getLooper()) {
            this.mHandler.dispatchMessage(message);
        } else {
            this.mHandler.sendMessage(message);
        }
    }
}
