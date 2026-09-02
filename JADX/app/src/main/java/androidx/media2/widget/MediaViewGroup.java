package androidx.media2.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
abstract class MediaViewGroup extends ViewGroup {
    private boolean mAggregatedIsVisible;

    MediaViewGroup(Context context) {
        super(context);
        this.mAggregatedIsVisible = false;
    }

    MediaViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAggregatedIsVisible = false;
    }

    MediaViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAggregatedIsVisible = false;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        boolean zIsShown;
        if (Build.VERSION.SDK_INT >= 24 || getWindowVisibility() != 0 || this.mAggregatedIsVisible == (zIsShown = isShown())) {
            return;
        }
        onVisibilityAggregatedCompat(zIsShown);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 24 || !isShown()) {
            return;
        }
        onVisibilityAggregatedCompat(i == 0);
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        onVisibilityAggregatedCompat(z);
    }

    void onVisibilityAggregatedCompat(boolean z) {
        this.mAggregatedIsVisible = z;
    }

    boolean isAggregatedVisible() {
        return this.mAggregatedIsVisible;
    }
}
