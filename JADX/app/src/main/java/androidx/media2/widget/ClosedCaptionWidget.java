package androidx.media2.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.CaptioningManager;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
abstract class ClosedCaptionWidget extends ViewGroup implements SubtitleTrack.RenderingWidget {
    protected CaptionStyle mCaptionStyle;
    private CaptioningManager.CaptioningChangeListener mCaptioningListener;
    protected ClosedCaptionLayout mClosedCaptionLayout;
    private boolean mHasChangeListener;
    protected SubtitleTrack.RenderingWidget.OnChangedListener mListener;
    private CaptioningManager mManager;

    interface ClosedCaptionLayout {
        void setCaptionStyle(CaptionStyle captionStyle);

        void setFontScale(float f);
    }

    public abstract ClosedCaptionLayout createCaptionLayout(Context context);

    ClosedCaptionWidget(Context context) {
        this(context, null);
    }

    ClosedCaptionWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    ClosedCaptionWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayerType(1, null);
        this.mCaptioningListener = new CaptioningManager.CaptioningChangeListener() { // from class: androidx.media2.widget.ClosedCaptionWidget.1
            @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
            public void onUserStyleChanged(CaptioningManager.CaptionStyle captionStyle) {
                ClosedCaptionWidget.this.mCaptionStyle = new CaptionStyle(captionStyle);
                ClosedCaptionWidget.this.mClosedCaptionLayout.setCaptionStyle(ClosedCaptionWidget.this.mCaptionStyle);
            }

            @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
            public void onFontScaleChanged(float f) {
                ClosedCaptionWidget.this.mClosedCaptionLayout.setFontScale(f);
            }
        };
        this.mManager = (CaptioningManager) context.getSystemService("captioning");
        this.mCaptionStyle = new CaptionStyle(CaptioningManagerHelper.Api19Impl.getUserStyle(this.mManager));
        float fontScale = CaptioningManagerHelper.Api19Impl.getFontScale(this.mManager);
        ClosedCaptionLayout closedCaptionLayoutCreateCaptionLayout = createCaptionLayout(context);
        this.mClosedCaptionLayout = closedCaptionLayoutCreateCaptionLayout;
        closedCaptionLayoutCreateCaptionLayout.setCaptionStyle(this.mCaptionStyle);
        this.mClosedCaptionLayout.setFontScale(fontScale);
        addView((ViewGroup) this.mClosedCaptionLayout, -1, -1);
        requestLayout();
    }

    @Override // androidx.media2.widget.SubtitleTrack.RenderingWidget
    public void setOnChangedListener(SubtitleTrack.RenderingWidget.OnChangedListener onChangedListener) {
        this.mListener = onChangedListener;
    }

    @Override // androidx.media2.widget.SubtitleTrack.RenderingWidget
    public void setSize(int i, int i2) {
        measure(View.MeasureSpec.makeMeasureSpec(i, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i2, BasicMeasure.EXACTLY));
        layout(0, 0, i, i2);
    }

    @Override // androidx.media2.widget.SubtitleTrack.RenderingWidget
    public void setVisible(boolean z) {
        if (z) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
        manageChangeListener();
    }

    @Override // android.view.ViewGroup, android.view.View, androidx.media2.widget.SubtitleTrack.RenderingWidget
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        manageChangeListener();
    }

    @Override // android.view.ViewGroup, android.view.View, androidx.media2.widget.SubtitleTrack.RenderingWidget
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        manageChangeListener();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ((ViewGroup) this.mClosedCaptionLayout).measure(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((ViewGroup) this.mClosedCaptionLayout).layout(i, i2, i3, i4);
    }

    private void manageChangeListener() {
        boolean z = ViewCompat.isAttachedToWindow(this) && getVisibility() == 0;
        if (this.mHasChangeListener != z) {
            this.mHasChangeListener = z;
            if (z) {
                CaptioningManagerHelper.Api19Impl.addCaptioningChangeListener(this.mManager, this.mCaptioningListener);
            } else {
                CaptioningManagerHelper.Api19Impl.removeCaptioningChangeListener(this.mManager, this.mCaptioningListener);
            }
        }
    }
}
