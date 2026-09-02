package androidx.media2.widget;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
final class CaptionStyle {
    private static final int COLOR_NONE_OPAQUE = 255;
    public static final int COLOR_UNSPECIFIED = 16777215;
    public static final CaptionStyle DEFAULT = new CaptionStyle(-1, ViewCompat.MEASURED_STATE_MASK, 0, ViewCompat.MEASURED_STATE_MASK, 255, null);
    public static final int EDGE_TYPE_DEPRESSED = 4;
    public static final int EDGE_TYPE_DROP_SHADOW = 2;
    public static final int EDGE_TYPE_NONE = 0;
    public static final int EDGE_TYPE_OUTLINE = 1;
    public static final int EDGE_TYPE_RAISED = 3;
    public static final int EDGE_TYPE_UNSPECIFIED = -1;
    public final int backgroundColor;
    public final int edgeColor;
    public final int edgeType;
    public final int foregroundColor;
    private final boolean mHasBackgroundColor;
    private final boolean mHasEdgeColor;
    private final boolean mHasEdgeType;
    private final boolean mHasForegroundColor;
    private final boolean mHasWindowColor;
    private Typeface mParsedTypeface;
    public final int windowColor;

    static boolean hasColor(int i) {
        return (i >>> 24) != 0 || (i & 16776960) == 0;
    }

    CaptionStyle(CaptioningManager.CaptionStyle captionStyle) {
        this(captionStyle.foregroundColor, captionStyle.backgroundColor, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.windowColor, Api19Impl.getTypeface(captionStyle));
    }

    CaptionStyle(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        boolean zHasColor = hasColor(i);
        this.mHasForegroundColor = zHasColor;
        boolean zHasColor2 = hasColor(i2);
        this.mHasBackgroundColor = zHasColor2;
        boolean z = i3 != -1;
        this.mHasEdgeType = z;
        boolean zHasColor3 = hasColor(i4);
        this.mHasEdgeColor = zHasColor3;
        boolean zHasColor4 = hasColor(i5);
        this.mHasWindowColor = zHasColor4;
        this.foregroundColor = zHasColor ? i : -1;
        this.backgroundColor = zHasColor2 ? i2 : -16777216;
        this.edgeType = z ? i3 : 0;
        this.edgeColor = zHasColor3 ? i4 : -16777216;
        this.windowColor = zHasColor4 ? i5 : 255;
        this.mParsedTypeface = typeface;
    }

    boolean hasBackgroundColor() {
        return this.mHasBackgroundColor;
    }

    boolean hasForegroundColor() {
        return this.mHasForegroundColor;
    }

    boolean hasEdgeType() {
        return this.mHasEdgeType;
    }

    boolean hasEdgeColor() {
        return this.mHasEdgeColor;
    }

    boolean hasWindowColor() {
        return this.mHasWindowColor;
    }

    public Typeface getTypeface() {
        return this.mParsedTypeface;
    }

    static class Api19Impl {
        static Typeface getTypeface(CaptioningManager.CaptionStyle captionStyle) {
            return captionStyle.getTypeface();
        }

        private Api19Impl() {
        }
    }
}
