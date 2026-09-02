package androidx.media2.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
class SubtitleAnchorView extends View implements SubtitleController.Anchor {
    private static final String TAG = "SubtitleAnchorView";
    private SubtitleTrack.RenderingWidget mSubtitleWidget;
    private SubtitleTrack.RenderingWidget.OnChangedListener mSubtitlesChangedListener;

    SubtitleAnchorView(Context context) {
        this(context, null);
    }

    SubtitleAnchorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    SubtitleAnchorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.media2.widget.SubtitleController.Anchor
    public void setSubtitleWidget(SubtitleTrack.RenderingWidget renderingWidget) {
        if (this.mSubtitleWidget == renderingWidget) {
            return;
        }
        boolean zIsAttachedToWindow = ViewCompat.isAttachedToWindow(this);
        SubtitleTrack.RenderingWidget renderingWidget2 = this.mSubtitleWidget;
        if (renderingWidget2 != null) {
            if (zIsAttachedToWindow) {
                renderingWidget2.onDetachedFromWindow();
            }
            this.mSubtitleWidget.setOnChangedListener(null);
        }
        this.mSubtitleWidget = renderingWidget;
        if (renderingWidget != null) {
            if (this.mSubtitlesChangedListener == null) {
                this.mSubtitlesChangedListener = new SubtitleTrack.RenderingWidget.OnChangedListener() { // from class: androidx.media2.widget.SubtitleAnchorView.1
                    @Override // androidx.media2.widget.SubtitleTrack.RenderingWidget.OnChangedListener
                    public void onChanged(SubtitleTrack.RenderingWidget renderingWidget3) {
                        SubtitleAnchorView.this.invalidate();
                    }
                };
            }
            setWillNotDraw(false);
            renderingWidget.setOnChangedListener(this.mSubtitlesChangedListener);
            if (zIsAttachedToWindow) {
                renderingWidget.onAttachedToWindow();
                requestLayout();
            }
        } else {
            setWillNotDraw(true);
        }
        invalidate();
    }

    @Override // androidx.media2.widget.SubtitleController.Anchor
    public Looper getSubtitleLooper() {
        return Looper.getMainLooper();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        SubtitleTrack.RenderingWidget renderingWidget = this.mSubtitleWidget;
        if (renderingWidget != null) {
            renderingWidget.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SubtitleTrack.RenderingWidget renderingWidget = this.mSubtitleWidget;
        if (renderingWidget != null) {
            renderingWidget.onDetachedFromWindow();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.mSubtitleWidget != null) {
            this.mSubtitleWidget.setSize((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mSubtitleWidget != null) {
            int iSave = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            this.mSubtitleWidget.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.media2.widget.SubtitleAnchorView";
    }
}
