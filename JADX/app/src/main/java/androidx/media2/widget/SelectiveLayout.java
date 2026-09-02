package androidx.media2.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;

/* JADX INFO: loaded from: classes.dex */
class SelectiveLayout extends MediaViewGroup {
    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    SelectiveLayout(Context context) {
        super(context);
    }

    SelectiveLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    SelectiveLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? layoutParams : new LayoutParams(layoutParams);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        int measuredState = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 && !layoutParams.forceMatchParent) {
                measureChild(childAt, i, i2);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                measuredState |= childAt.getMeasuredState();
            }
        }
        int positivePaddingLeft = iMax + getPositivePaddingLeft() + getPositivePaddingRight();
        int positivePaddingTop = iMax2 + getPositivePaddingTop() + getPositivePaddingBottom();
        int iMax3 = Math.max(positivePaddingLeft, getSuggestedMinimumWidth());
        int iMax4 = Math.max(positivePaddingTop, getSuggestedMinimumHeight());
        Drawable foreground = Api23Impl.getForeground(this);
        if (foreground != null) {
            iMax3 = Math.max(iMax3, foreground.getMinimumWidth());
            iMax4 = Math.max(iMax4, foreground.getMinimumHeight());
        }
        setMeasuredDimension(resolveSizeAndState(iMax3, i, measuredState), resolveSizeAndState(iMax4, i2, measuredState << 16));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - (getPositivePaddingLeft() + getPositivePaddingRight()), BasicMeasure.EXACTLY);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - (getPositivePaddingTop() + getPositivePaddingBottom()), BasicMeasure.EXACTLY);
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (childAt2.getVisibility() != 8 && layoutParams2.forceMatchParent) {
                childAt2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int positivePaddingLeft = getPositivePaddingLeft();
        int positivePaddingRight = (i3 - i) - getPositivePaddingRight();
        int positivePaddingTop = getPositivePaddingTop();
        int positivePaddingBottom = (i4 - i2) - getPositivePaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = (((positivePaddingRight - positivePaddingLeft) - measuredWidth) / 2) + positivePaddingLeft;
                int i7 = (((positivePaddingBottom - positivePaddingTop) - measuredHeight) / 2) + positivePaddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    private int getPositivePaddingLeft() {
        return Math.max(getPaddingLeft(), 0);
    }

    private int getPositivePaddingRight() {
        return Math.max(getPaddingRight(), 0);
    }

    private int getPositivePaddingTop() {
        return Math.max(getPaddingTop(), 0);
    }

    private int getPositivePaddingBottom() {
        return Math.max(getPaddingBottom(), 0);
    }

    static class LayoutParams extends ViewGroup.LayoutParams {
        public boolean forceMatchParent;

        LayoutParams() {
            this(-1, -1);
        }

        LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        LayoutParams(int i, int i2) {
            super(i, i2);
        }

        LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    static final class Api23Impl {
        static Drawable getForeground(View view) {
            return view.getForeground();
        }

        private Api23Impl() {
        }
    }
}
