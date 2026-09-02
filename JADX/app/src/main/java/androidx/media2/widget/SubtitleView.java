package androidx.media2.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class SubtitleView extends View {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private Layout.Alignment mAlignment;
    private int mBackgroundColor;
    private final float mCornerRadius;
    private int mEdgeColor;
    private int mEdgeType;
    private int mForegroundColor;
    private boolean mHasMeasurements;
    private int mInnerPaddingX;
    private int mLastMeasuredWidth;
    private StaticLayout mLayout;
    private final RectF mLineBounds;
    private final float mOutlineWidth;
    private Paint mPaint;
    private final float mShadowOffsetX;
    private final float mShadowOffsetY;
    private final float mShadowRadius;
    private float mSpacingAdd;
    private float mSpacingMult;
    private final SpannableStringBuilder mText;
    private TextPaint mTextPaint;

    SubtitleView(Context context) {
        this(context, null);
    }

    SubtitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    SubtitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mLineBounds = new RectF();
        this.mText = new SpannableStringBuilder();
        this.mSpacingMult = 1.0f;
        this.mSpacingAdd = 0.0f;
        this.mInnerPaddingX = 0;
        Resources resources = getContext().getResources();
        this.mCornerRadius = resources.getDimensionPixelSize(C0793R.dimen.media2_widget_subtitle_corner_radius);
        this.mOutlineWidth = resources.getDimensionPixelSize(C0793R.dimen.media2_widget_subtitle_outline_width);
        this.mShadowRadius = resources.getDimensionPixelSize(C0793R.dimen.media2_widget_subtitle_shadow_radius);
        float dimensionPixelSize = resources.getDimensionPixelSize(C0793R.dimen.media2_widget_subtitle_shadow_offset);
        this.mShadowOffsetX = dimensionPixelSize;
        this.mShadowOffsetY = dimensionPixelSize;
        TextPaint textPaint = new TextPaint();
        this.mTextPaint = textPaint;
        textPaint.setAntiAlias(true);
        this.mTextPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
    }

    public void setText(int i) {
        setText(getContext().getText(i));
    }

    public void setText(CharSequence charSequence) {
        this.mText.clear();
        this.mText.append(charSequence);
        this.mHasMeasurements = false;
        requestLayout();
        invalidate();
    }

    public void setForegroundColor(int i) {
        this.mForegroundColor = i;
        invalidate();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.mBackgroundColor = i;
        invalidate();
    }

    public void setEdgeType(int i) {
        this.mEdgeType = i;
        invalidate();
    }

    public void setEdgeColor(int i) {
        this.mEdgeColor = i;
        invalidate();
    }

    public void setTextSize(float f) {
        if (this.mTextPaint.getTextSize() != f) {
            this.mTextPaint.setTextSize(f);
            this.mInnerPaddingX = (int) ((f * INNER_PADDING_RATIO) + 0.5f);
            this.mHasMeasurements = false;
            requestLayout();
            invalidate();
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface == null || typeface.equals(this.mTextPaint.getTypeface())) {
            return;
        }
        this.mTextPaint.setTypeface(typeface);
        this.mHasMeasurements = false;
        requestLayout();
        invalidate();
    }

    public void setAlignment(Layout.Alignment alignment) {
        if (this.mAlignment != alignment) {
            this.mAlignment = alignment;
            this.mHasMeasurements = false;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (computeMeasurements(View.MeasureSpec.getSize(i))) {
            StaticLayout staticLayout = this.mLayout;
            setMeasuredDimension(staticLayout.getWidth() + getPaddingLeft() + getPaddingRight() + (this.mInnerPaddingX * 2), staticLayout.getHeight() + getPaddingTop() + getPaddingBottom());
            return;
        }
        setMeasuredDimension(16777216, 16777216);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        computeMeasurements(i3 - i);
    }

    private boolean computeMeasurements(int i) {
        if (this.mHasMeasurements && i == this.mLastMeasuredWidth) {
            return true;
        }
        int paddingLeft = i - ((getPaddingLeft() + getPaddingRight()) + (this.mInnerPaddingX * 2));
        if (paddingLeft <= 0) {
            return false;
        }
        this.mHasMeasurements = true;
        this.mLastMeasuredWidth = paddingLeft;
        SpannableStringBuilder spannableStringBuilder = this.mText;
        StaticLayout.Builder builderObtainStaticLayoutBuilder = Api23Impl.obtainStaticLayoutBuilder(spannableStringBuilder, 0, spannableStringBuilder.length(), this.mTextPaint, paddingLeft);
        Api23Impl.setAlignment(builderObtainStaticLayoutBuilder, this.mAlignment);
        Api23Impl.setLineSpacing(builderObtainStaticLayoutBuilder, this.mSpacingAdd, this.mSpacingMult);
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.setUseLineSpacingFromFallbacks(builderObtainStaticLayoutBuilder, true);
        }
        this.mLayout = Api23Impl.build(builderObtainStaticLayoutBuilder);
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        StaticLayout staticLayout = this.mLayout;
        if (staticLayout == null) {
            return;
        }
        int iSave = canvas.save();
        int i = this.mInnerPaddingX;
        canvas.translate(getPaddingLeft() + i, getPaddingTop());
        int lineCount = staticLayout.getLineCount();
        TextPaint textPaint = this.mTextPaint;
        Paint paint = this.mPaint;
        RectF rectF = this.mLineBounds;
        if (Color.alpha(this.mBackgroundColor) > 0) {
            float f = this.mCornerRadius;
            float lineTop = staticLayout.getLineTop(0);
            paint.setColor(this.mBackgroundColor);
            paint.setStyle(Paint.Style.FILL);
            for (int i2 = 0; i2 < lineCount; i2++) {
                float f2 = i;
                rectF.left = staticLayout.getLineLeft(i2) - f2;
                rectF.right = staticLayout.getLineRight(i2) + f2;
                rectF.top = lineTop;
                rectF.bottom = staticLayout.getLineBottom(i2);
                lineTop = rectF.bottom;
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        }
        int i3 = this.mEdgeType;
        if (i3 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.mOutlineWidth);
            textPaint.setColor(this.mEdgeColor);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout.draw(canvas);
        } else if (i3 == 2) {
            textPaint.setShadowLayer(this.mShadowRadius, this.mShadowOffsetX, this.mShadowOffsetY, this.mEdgeColor);
        } else if (i3 == 3 || i3 == 4) {
            boolean z = i3 == 3;
            int i4 = z ? -1 : this.mEdgeColor;
            int i5 = z ? this.mEdgeColor : -1;
            float f3 = this.mShadowRadius / 2.0f;
            textPaint.setColor(this.mForegroundColor);
            textPaint.setStyle(Paint.Style.FILL);
            float f4 = -f3;
            textPaint.setShadowLayer(this.mShadowRadius, f4, f4, i4);
            staticLayout.draw(canvas);
            textPaint.setShadowLayer(this.mShadowRadius, f3, f3, i5);
        }
        textPaint.setColor(this.mForegroundColor);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    static class Api23Impl {
        static StaticLayout build(StaticLayout.Builder builder) {
            return builder.build();
        }

        static StaticLayout.Builder obtainStaticLayoutBuilder(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3) {
            return StaticLayout.Builder.obtain(charSequence, i, i2, textPaint, i3);
        }

        static void setAlignment(StaticLayout.Builder builder, Layout.Alignment alignment) {
            builder.setAlignment(alignment);
        }

        static void setLineSpacing(StaticLayout.Builder builder, float f, float f2) {
            builder.setLineSpacing(f, f2);
        }

        private Api23Impl() {
        }
    }

    static class Api28Impl {
        static void setUseLineSpacingFromFallbacks(StaticLayout.Builder builder, boolean z) {
            builder.setUseLineSpacingFromFallbacks(z);
        }

        private Api28Impl() {
        }
    }
}
