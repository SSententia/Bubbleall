package androidx.media2.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.media.MediaFormat;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class Cea608CaptionRenderer extends SubtitleController.Renderer {
    private static final String TAG = "Cea608CaptionRenderer";
    private Cea608CCWidget mCCWidget;
    private final Context mContext;

    Cea608CaptionRenderer(Context context) {
        this.mContext = context;
    }

    @Override // androidx.media2.widget.SubtitleController.Renderer
    public boolean supports(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("mime")) {
            return "text/cea-608".equals(mediaFormat.getString("mime"));
        }
        return false;
    }

    @Override // androidx.media2.widget.SubtitleController.Renderer
    public SubtitleTrack createTrack(MediaFormat mediaFormat) {
        if ("text/cea-608".equals(mediaFormat.getString("mime"))) {
            if (this.mCCWidget == null) {
                this.mCCWidget = new Cea608CCWidget(this, this.mContext);
            }
            return new Cea608CaptionTrack(this.mCCWidget, mediaFormat);
        }
        throw new RuntimeException("No matching format: " + mediaFormat.toString());
    }

    static class Cea608CaptionTrack extends SubtitleTrack {
        private final Cea608CCParser mCCParser;
        private final Cea608CCWidget mRenderingWidget;

        @Override // androidx.media2.widget.SubtitleTrack
        public void updateView(ArrayList<SubtitleTrack.Cue> arrayList) {
        }

        Cea608CaptionTrack(Cea608CCWidget cea608CCWidget, MediaFormat mediaFormat) {
            super(mediaFormat);
            this.mRenderingWidget = cea608CCWidget;
            this.mCCParser = new Cea608CCParser(cea608CCWidget);
        }

        @Override // androidx.media2.widget.SubtitleTrack
        public void onData(byte[] bArr, boolean z, long j) {
            this.mCCParser.parse(bArr);
        }

        @Override // androidx.media2.widget.SubtitleTrack
        public SubtitleTrack.RenderingWidget getRenderingWidget() {
            return this.mRenderingWidget;
        }
    }

    class Cea608CCWidget extends ClosedCaptionWidget implements Cea608CCParser.DisplayListener {
        private static final String PLACEHOLDER_TEXT = "1234567890123456789012345678901234";
        final Rect mTextBounds;

        Cea608CCWidget(Cea608CaptionRenderer cea608CaptionRenderer, Context context) {
            this(cea608CaptionRenderer, context, null);
        }

        Cea608CCWidget(Cea608CaptionRenderer cea608CaptionRenderer, Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        Cea608CCWidget(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.mTextBounds = new Rect();
        }

        @Override // androidx.media2.widget.ClosedCaptionWidget
        public ClosedCaptionWidget.ClosedCaptionLayout createCaptionLayout(Context context) {
            return new CCLayout(context);
        }

        @Override // androidx.media2.widget.Cea608CCParser.DisplayListener
        public void onDisplayChanged(SpannableStringBuilder[] spannableStringBuilderArr) {
            ((CCLayout) this.mClosedCaptionLayout).update(spannableStringBuilderArr);
            if (this.mListener != null) {
                this.mListener.onChanged(this);
            }
        }

        @Override // androidx.media2.widget.Cea608CCParser.DisplayListener
        public CaptionStyle getCaptionStyle() {
            return this.mCaptionStyle;
        }

        private class CCLineBox extends AppCompatTextView {
            private static final float EDGE_OUTLINE_RATIO = 0.1f;
            private static final float EDGE_SHADOW_RATIO = 0.05f;
            private static final float FONT_PADDING_RATIO = 0.75f;
            private int mBgColor;
            private int mEdgeColor;
            private int mEdgeType;
            private float mOutlineWidth;
            private float mShadowOffset;
            private float mShadowRadius;
            private int mTextColor;

            CCLineBox(Context context) {
                super(context);
                this.mTextColor = -1;
                this.mBgColor = ViewCompat.MEASURED_STATE_MASK;
                this.mEdgeType = 0;
                this.mEdgeColor = 0;
                setGravity(17);
                setBackgroundColor(0);
                setTextColor(-1);
                setTypeface(Typeface.MONOSPACE);
                setVisibility(4);
                Resources resources = getContext().getResources();
                this.mOutlineWidth = resources.getDimensionPixelSize(C0793R.dimen.media2_widget_subtitle_outline_width);
                this.mShadowRadius = resources.getDimensionPixelSize(C0793R.dimen.media2_widget_subtitle_shadow_radius);
                this.mShadowOffset = resources.getDimensionPixelSize(C0793R.dimen.media2_widget_subtitle_shadow_offset);
            }

            void setCaptionStyle(CaptionStyle captionStyle) {
                this.mTextColor = captionStyle.foregroundColor;
                this.mBgColor = captionStyle.backgroundColor;
                this.mEdgeType = captionStyle.edgeType;
                this.mEdgeColor = captionStyle.edgeColor;
                setTextColor(this.mTextColor);
                if (this.mEdgeType == 2) {
                    float f = this.mShadowRadius;
                    float f2 = this.mShadowOffset;
                    setShadowLayer(f, f2, f2, this.mEdgeColor);
                } else {
                    setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                }
                invalidate();
            }

            @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
            protected void onMeasure(int i, int i2) {
                float size = View.MeasureSpec.getSize(i2) * 0.75f;
                setTextSize(0, size);
                this.mOutlineWidth = (0.1f * size) + 1.0f;
                float f = (size * EDGE_SHADOW_RATIO) + 1.0f;
                this.mShadowRadius = f;
                this.mShadowOffset = f;
                setScaleX(1.0f);
                getPaint().getTextBounds(Cea608CCWidget.PLACEHOLDER_TEXT, 0, 34, Cea608CCWidget.this.mTextBounds);
                float fWidth = Cea608CCWidget.this.mTextBounds.width();
                float size2 = View.MeasureSpec.getSize(i);
                if (fWidth != 0.0f) {
                    setScaleX(size2 / fWidth);
                } else {
                    Log.w(Cea608CaptionRenderer.TAG, "onMeasure(): Paint#getTextBounds() returned zero width. Ignored.");
                }
                super.onMeasure(i, i2);
            }

            @Override // android.widget.TextView, android.view.View
            protected void onDraw(Canvas canvas) {
                int i = this.mEdgeType;
                if (i == -1 || i == 0 || i == 2) {
                    super.onDraw(canvas);
                } else if (i == 1) {
                    drawEdgeOutline(canvas);
                } else {
                    drawEdgeRaisedOrDepressed(canvas);
                }
            }

            private void drawEdgeOutline(Canvas canvas) {
                TextPaint paint = getPaint();
                Paint.Style style = paint.getStyle();
                Paint.Join strokeJoin = paint.getStrokeJoin();
                float strokeWidth = paint.getStrokeWidth();
                setTextColor(this.mEdgeColor);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                paint.setStrokeJoin(Paint.Join.ROUND);
                paint.setStrokeWidth(this.mOutlineWidth);
                super.onDraw(canvas);
                setTextColor(this.mTextColor);
                paint.setStyle(style);
                paint.setStrokeJoin(strokeJoin);
                paint.setStrokeWidth(strokeWidth);
                setBackgroundSpans(0);
                super.onDraw(canvas);
                setBackgroundSpans(this.mBgColor);
            }

            private void drawEdgeRaisedOrDepressed(Canvas canvas) {
                TextPaint paint = getPaint();
                Paint.Style style = paint.getStyle();
                paint.setStyle(Paint.Style.FILL);
                boolean z = this.mEdgeType == 3;
                int i = z ? -1 : this.mEdgeColor;
                int i2 = z ? this.mEdgeColor : -1;
                float f = this.mShadowRadius;
                float f2 = f / 2.0f;
                float f3 = -f2;
                setShadowLayer(f, f3, f3, i);
                super.onDraw(canvas);
                setBackgroundSpans(0);
                setShadowLayer(this.mShadowRadius, f2, f2, i2);
                super.onDraw(canvas);
                paint.setStyle(style);
                setBackgroundSpans(this.mBgColor);
            }

            private void setBackgroundSpans(int i) {
                CharSequence text = getText();
                if (text instanceof Spannable) {
                    Spannable spannable = (Spannable) text;
                    for (Cea608CCParser.MutableBackgroundColorSpan mutableBackgroundColorSpan : (Cea608CCParser.MutableBackgroundColorSpan[]) spannable.getSpans(0, spannable.length(), Cea608CCParser.MutableBackgroundColorSpan.class)) {
                        mutableBackgroundColorSpan.setBackgroundColor(i);
                    }
                }
            }
        }

        private class CCLayout extends LinearLayout implements ClosedCaptionWidget.ClosedCaptionLayout {
            private static final int MAX_ROWS = 15;
            private static final float SAFE_AREA_RATIO = 0.9f;
            private final CCLineBox[] mLineBoxes;

            @Override // androidx.media2.widget.ClosedCaptionWidget.ClosedCaptionLayout
            public void setFontScale(float f) {
            }

            CCLayout(Context context) {
                super(context);
                this.mLineBoxes = new CCLineBox[15];
                setGravity(GravityCompat.START);
                setOrientation(1);
                for (int i = 0; i < 15; i++) {
                    this.mLineBoxes[i] = Cea608CCWidget.this.new CCLineBox(getContext());
                    addView(this.mLineBoxes[i], -2, -2);
                }
            }

            @Override // androidx.media2.widget.ClosedCaptionWidget.ClosedCaptionLayout
            public void setCaptionStyle(CaptionStyle captionStyle) {
                for (int i = 0; i < 15; i++) {
                    this.mLineBoxes[i].setCaptionStyle(captionStyle);
                }
            }

            void update(SpannableStringBuilder[] spannableStringBuilderArr) {
                for (int i = 0; i < 15; i++) {
                    SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i];
                    if (spannableStringBuilder != null) {
                        this.mLineBoxes[i].setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
                        this.mLineBoxes[i].setVisibility(0);
                    } else {
                        this.mLineBoxes[i].setVisibility(4);
                    }
                }
            }

            @Override // android.widget.LinearLayout, android.view.View
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                int i3 = measuredWidth * 3;
                int i4 = measuredHeight * 4;
                if (i3 >= i4) {
                    measuredWidth = i4 / 3;
                } else {
                    measuredHeight = i3 / 4;
                }
                int i5 = (int) (measuredWidth * SAFE_AREA_RATIO);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((int) (measuredHeight * SAFE_AREA_RATIO)) / 15, BasicMeasure.EXACTLY);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, BasicMeasure.EXACTLY);
                for (int i6 = 0; i6 < 15; i6++) {
                    this.mLineBoxes[i6].measure(iMakeMeasureSpec2, iMakeMeasureSpec);
                }
            }

            @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                int i5;
                int i6;
                int i7 = i3 - i;
                int i8 = i4 - i2;
                int i9 = i7 * 3;
                int i10 = i8 * 4;
                if (i9 >= i10) {
                    i6 = i10 / 3;
                    i5 = i8;
                } else {
                    i5 = i9 / 4;
                    i6 = i7;
                }
                int i11 = (int) (i6 * SAFE_AREA_RATIO);
                int i12 = (int) (i5 * SAFE_AREA_RATIO);
                int i13 = (i7 - i11) / 2;
                int i14 = (i8 - i12) / 2;
                int i15 = 0;
                while (i15 < 15) {
                    i15++;
                    this.mLineBoxes[i15].layout(i13, ((i12 * i15) / 15) + i14, i13 + i11, ((i12 * i15) / 15) + i14);
                }
            }
        }
    }
}
