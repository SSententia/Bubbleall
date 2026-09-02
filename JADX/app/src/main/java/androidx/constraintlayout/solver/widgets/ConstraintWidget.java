package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.ArrayRow;
import androidx.constraintlayout.solver.Cache;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.analyzer.ChainRun;
import androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    private boolean hasBaseline;
    public ChainRun horizontalChainRun;
    public HorizontalWidgetRun horizontalRun;
    private boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    protected ArrayList<ConstraintAnchor> mAnchors;
    ConstraintAnchor mBaseline;
    int mBaselineDistance;
    public ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    ConstraintAnchor mCenter;
    ConstraintAnchor mCenterX;
    ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private Object mCompanionWidget;
    private int mContainerItemSkip;
    private String mDebugName;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    boolean mGroupsToSolver;
    int mHeight;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    boolean mHorizontalWrapVisited;
    private boolean mInVirtuaLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    public ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    protected ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    protected int mMinHeight;
    protected int mMinWidth;
    protected ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    boolean mOptimizerMeasurable;
    public ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    boolean mResolvedHasRatio;
    public int[] mResolvedMatchConstraintDefault;
    public ConstraintAnchor mRight;
    boolean mRightHasCentered;
    public ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    int mWidth;

    /* JADX INFO: renamed from: mX */
    protected int f38mX;

    /* JADX INFO: renamed from: mY */
    protected int f39mY;
    public boolean measured;
    public WidgetRun[] run;
    public ChainRun verticalChainRun;
    public VerticalWidgetRun verticalRun;
    public int[] wrapMeasure;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public WidgetRun getRun(int i) {
        if (i == 0) {
            return this.horizontalRun;
        }
        if (i == 1) {
            return this.verticalRun;
        }
        return null;
    }

    public boolean isInVirtualLayout() {
        return this.mInVirtuaLayout;
    }

    public void setInVirtualLayout(boolean z) {
        this.mInVirtuaLayout = z;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public void setMaxWidth(int i) {
        this.mMaxDimension[0] = i;
    }

    public void setMaxHeight(int i) {
        this.mMaxDimension[1] = i;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void setHasBaseline(boolean z) {
        this.hasBaseline = z;
    }

    public boolean getHasBaseline() {
        return this.hasBaseline;
    }

    public boolean isInPlaceholder() {
        return this.inPlaceholder;
    }

    public void setInPlaceholder(boolean z) {
        this.inPlaceholder = z;
    }

    protected void setInBarrier(int i, boolean z) {
        this.mIsInBarrier[i] = z;
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f38mX = 0;
        this.f39mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mListDimensionBehaviors[0] = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors[1] = DimensionBehaviour.FIXED;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedHasRatio = false;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.mInVirtuaLayout = false;
        boolean[] zArr2 = this.mIsInBarrier;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = new HorizontalWidgetRun(this);
        this.verticalRun = new VerticalWidgetRun(this);
        this.isTerminalWidget = new boolean[]{true, true};
        this.wrapMeasure = new int[]{0, 0, 0, 0};
        this.mResolvedHasRatio = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f38mX = 0;
        this.f39mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        addAnchors();
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = new HorizontalWidgetRun(this);
        this.verticalRun = new VerticalWidgetRun(this);
        this.isTerminalWidget = new boolean[]{true, true};
        this.wrapMeasure = new int[]{0, 0, 0, 0};
        this.mResolvedHasRatio = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.f38mX = i;
        this.f39mY = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        addAnchors();
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }

    public void resetSolverVariables(Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.mCenterX.resetSolverVariable(cache);
        this.mCenterY.resetSolverVariable(cache);
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f, int i) {
        immediateConnect(ConstraintAnchor.Type.CENTER, constraintWidget, ConstraintAnchor.Type.CENTER, i, 0);
        this.mCircleConstraintAngle = f;
    }

    public String getType() {
        return this.mType;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setVisibility(int i) {
        this.mVisibility = i;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public void setDebugName(String str) {
        this.mDebugName = str;
    }

    public void setDebugSolverName(LinearSystem linearSystem, String str) {
        this.mDebugName = str;
        SolverVariable solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        solverVariableCreateObjectVariable.setName(str + ".left");
        solverVariableCreateObjectVariable2.setName(str + ".top");
        solverVariableCreateObjectVariable3.setName(str + ".right");
        solverVariableCreateObjectVariable4.setName(str + ".bottom");
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline).setName(str + ".baseline");
        }
    }

    public void createObjectVariables(LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.mType != null) {
            str = "type: " + this.mType + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.mDebugName != null) {
            str2 = "id: " + this.mDebugName + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f38mX);
        sb.append(", ");
        sb.append(this.f39mY);
        sb.append(") - (");
        sb.append(this.mWidth);
        sb.append(" x ");
        sb.append(this.mHeight);
        sb.append(")");
        return sb.toString();
    }

    public int getX() {
        ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            return ((ConstraintWidgetContainer) constraintWidget).mPaddingLeft + this.f38mX;
        }
        return this.f38mX;
    }

    public int getY() {
        ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            return ((ConstraintWidgetContainer) constraintWidget).mPaddingTop + this.f39mY;
        }
        return this.f39mY;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getOptimizerWrapWidth() {
        int iMax;
        int i = this.mWidth;
        if (this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            iMax = Math.max(this.mMatchConstraintMinWidth, i);
        } else {
            iMax = this.mMatchConstraintMinWidth;
            if (iMax > 0) {
                this.mWidth = iMax;
            } else {
                iMax = 0;
            }
        }
        int i2 = this.mMatchConstraintMaxWidth;
        return (i2 <= 0 || i2 >= iMax) ? iMax : i2;
    }

    public int getOptimizerWrapHeight() {
        int iMax;
        int i = this.mHeight;
        if (this.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.mMatchConstraintDefaultHeight == 1) {
            iMax = Math.max(this.mMatchConstraintMinHeight, i);
        } else {
            iMax = this.mMatchConstraintMinHeight;
            if (iMax > 0) {
                this.mHeight = iMax;
            } else {
                iMax = 0;
            }
        }
        int i2 = this.mMatchConstraintMaxHeight;
        return (i2 <= 0 || i2 >= iMax) ? iMax : i2;
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public int getLength(int i) {
        if (i == 0) {
            return getWidth();
        }
        if (i == 1) {
            return getHeight();
        }
        return 0;
    }

    protected int getRootX() {
        return this.f38mX + this.mOffsetX;
    }

    protected int getRootY() {
        return this.f39mY + this.mOffsetY;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getLeft() {
        return getX();
    }

    public int getTop() {
        return getY();
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public int getHorizontalMargin() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        int i = constraintAnchor != null ? constraintAnchor.mMargin : 0;
        ConstraintAnchor constraintAnchor2 = this.mRight;
        return constraintAnchor2 != null ? i + constraintAnchor2.mMargin : i;
    }

    public int getVerticalMargin() {
        int i = this.mLeft != null ? this.mTop.mMargin : 0;
        return this.mRight != null ? i + this.mBottom.mMargin : i;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public float getBiasPercent(int i) {
        if (i == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (i == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public boolean hasBaseline() {
        return this.hasBaseline;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public void setX(int i) {
        this.f38mX = i;
    }

    public void setY(int i) {
        this.f39mY = i;
    }

    public void setOrigin(int i, int i2) {
        this.f38mX = i;
        this.f39mY = i2;
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setGoneMargin(ConstraintAnchor.Type type, int i) {
        int i2 = C01921.f40x4c44d048[type.ordinal()];
        if (i2 == 1) {
            this.mLeft.mGoneMargin = i;
            return;
        }
        if (i2 == 2) {
            this.mTop.mGoneMargin = i;
        } else if (i2 == 3) {
            this.mRight.mGoneMargin = i;
        } else {
            if (i2 != 4) {
                return;
            }
            this.mBottom.mGoneMargin = i;
        }
    }

    public void setWidth(int i) {
        this.mWidth = i;
        int i2 = this.mMinWidth;
        if (i < i2) {
            this.mWidth = i2;
        }
    }

    public void setHeight(int i) {
        this.mHeight = i;
        int i2 = this.mMinHeight;
        if (i < i2) {
            this.mHeight = i2;
        }
    }

    public void setLength(int i, int i2) {
        if (i2 == 0) {
            setWidth(i);
        } else if (i2 == 1) {
            setHeight(i);
        }
    }

    public void setHorizontalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxWidth = i3;
        this.mMatchConstraintPercentWidth = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultWidth = 2;
    }

    public void setVerticalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxHeight = i3;
        this.mMatchConstraintPercentHeight = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultHeight = 2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
  0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public void setDimensionRatio(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.mDimensionRatio = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i2 = 0;
        int i3 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i2 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i3 = i2;
            i2 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                String strSubstring2 = str.substring(i2, iIndexOf2);
                String strSubstring3 = str.substring(iIndexOf2 + 1);
                if (strSubstring2.length() <= 0 || strSubstring3.length() <= 0) {
                    fAbs = i;
                } else {
                    float f = Float.parseFloat(strSubstring2);
                    float f2 = Float.parseFloat(strSubstring3);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        fAbs = i;
                    } else if (i3 == 1) {
                        fAbs = Math.abs(f2 / f);
                    } else {
                        fAbs = Math.abs(f / f2);
                    }
                }
            } else {
                String strSubstring4 = str.substring(i2);
                if (strSubstring4.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring4);
                } else {
                    fAbs = i;
                }
            }
        } catch (NumberFormatException unused) {
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.mDimensionRatio = fAbs;
            this.mDimensionRatioSide = i3;
        }
    }

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public void setHorizontalBiasPercent(float f) {
        this.mHorizontalBiasPercent = f;
    }

    public void setVerticalBiasPercent(float f) {
        this.mVerticalBiasPercent = f;
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i;
        }
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i;
        }
    }

    public void setDimension(int i, int i2) {
        this.mWidth = i;
        int i3 = this.mMinWidth;
        if (i < i3) {
            this.mWidth = i3;
        }
        this.mHeight = i2;
        int i4 = this.mMinHeight;
        if (i2 < i4) {
            this.mHeight = i4;
        }
    }

    public void setFrame(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f38mX = i;
        this.f39mY = i2;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i7 < (i6 = this.mWidth)) {
            i7 = i6;
        }
        if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i8 < (i5 = this.mHeight)) {
            i8 = i5;
        }
        this.mWidth = i7;
        this.mHeight = i8;
        int i9 = this.mMinHeight;
        if (i8 < i9) {
            this.mHeight = i9;
        }
        int i10 = this.mMinWidth;
        if (i7 < i10) {
            this.mWidth = i10;
        }
    }

    public void setFrame(int i, int i2, int i3) {
        if (i3 == 0) {
            setHorizontalDimension(i, i2);
        } else if (i3 == 1) {
            setVerticalDimension(i, i2);
        }
    }

    public void setHorizontalDimension(int i, int i2) {
        this.f38mX = i;
        int i3 = i2 - i;
        this.mWidth = i3;
        int i4 = this.mMinWidth;
        if (i3 < i4) {
            this.mWidth = i4;
        }
    }

    public void setVerticalDimension(int i, int i2) {
        this.f39mY = i;
        int i3 = i2 - i;
        this.mHeight = i3;
        int i4 = this.mMinHeight;
        if (i3 < i4) {
            this.mHeight = i4;
        }
    }

    int getRelativePositioning(int i) {
        if (i == 0) {
            return this.mRelX;
        }
        if (i == 1) {
            return this.mRelY;
        }
        return 0;
    }

    void setRelativePositioning(int i, int i2) {
        if (i2 == 0) {
            this.mRelX = i;
        } else if (i2 == 1) {
            this.mRelY = i;
        }
    }

    public void setBaselineDistance(int i) {
        this.mBaselineDistance = i;
        this.hasBaseline = i > 0;
    }

    public void setCompanionWidget(Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i) {
        if (i >= 0) {
            this.mContainerItemSkip = i;
        } else {
            this.mContainerItemSkip = 0;
        }
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setHorizontalChainStyle(int i) {
        this.mHorizontalChainStyle = i;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public void setVerticalChainStyle(int i) {
        this.mVerticalChainStyle = i;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void immediateConnect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i, i2, true);
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i);
        }
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0);
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        boolean z;
        if (type == ConstraintAnchor.Type.CENTER) {
            if (type2 == ConstraintAnchor.Type.CENTER) {
                ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
                ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
                ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
                ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                boolean z2 = true;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    connect(ConstraintAnchor.Type.LEFT, constraintWidget, ConstraintAnchor.Type.LEFT, 0);
                    connect(ConstraintAnchor.Type.RIGHT, constraintWidget, ConstraintAnchor.Type.RIGHT, 0);
                    z = true;
                } else {
                    z = false;
                }
                if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                    connect(ConstraintAnchor.Type.TOP, constraintWidget, ConstraintAnchor.Type.TOP, 0);
                    connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, ConstraintAnchor.Type.BOTTOM, 0);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.CENTER), 0);
                    return;
                } else if (z) {
                    getAnchor(ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.CENTER_X), 0);
                    return;
                } else {
                    if (z2) {
                        getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.CENTER_Y), 0);
                        return;
                    }
                    return;
                }
            }
            if (type2 == ConstraintAnchor.Type.LEFT || type2 == ConstraintAnchor.Type.RIGHT) {
                connect(ConstraintAnchor.Type.LEFT, constraintWidget, type2, 0);
                connect(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0);
                return;
            } else {
                if (type2 == ConstraintAnchor.Type.TOP || type2 == ConstraintAnchor.Type.BOTTOM) {
                    connect(ConstraintAnchor.Type.TOP, constraintWidget, type2, 0);
                    connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0);
                    return;
                }
                return;
            }
        }
        if (type == ConstraintAnchor.Type.CENTER_X && (type2 == ConstraintAnchor.Type.LEFT || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor anchor6 = constraintWidget.getAnchor(type2);
            ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.RIGHT);
            anchor5.connect(anchor6, 0);
            anchor7.connect(anchor6, 0);
            getAnchor(ConstraintAnchor.Type.CENTER_X).connect(anchor6, 0);
            return;
        }
        if (type == ConstraintAnchor.Type.CENTER_Y && (type2 == ConstraintAnchor.Type.TOP || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor anchor8 = constraintWidget.getAnchor(type2);
            getAnchor(ConstraintAnchor.Type.TOP).connect(anchor8, 0);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(anchor8, 0);
            getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(anchor8, 0);
            return;
        }
        if (type == ConstraintAnchor.Type.CENTER_X && type2 == ConstraintAnchor.Type.CENTER_X) {
            getAnchor(ConstraintAnchor.Type.LEFT).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT), 0);
            getAnchor(ConstraintAnchor.Type.RIGHT).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT), 0);
            getAnchor(ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        if (type == ConstraintAnchor.Type.CENTER_Y && type2 == ConstraintAnchor.Type.CENTER_Y) {
            getAnchor(ConstraintAnchor.Type.TOP).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.TOP), 0);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM), 0);
            getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        ConstraintAnchor anchor9 = getAnchor(type);
        ConstraintAnchor anchor10 = constraintWidget.getAnchor(type2);
        if (anchor9.isValidConnection(anchor10)) {
            if (type == ConstraintAnchor.Type.BASELINE) {
                ConstraintAnchor anchor11 = getAnchor(ConstraintAnchor.Type.TOP);
                ConstraintAnchor anchor12 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                if (anchor11 != null) {
                    anchor11.reset();
                }
                if (anchor12 != null) {
                    anchor12.reset();
                }
                i = 0;
            } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                ConstraintAnchor anchor13 = getAnchor(ConstraintAnchor.Type.BASELINE);
                if (anchor13 != null) {
                    anchor13.reset();
                }
                ConstraintAnchor anchor14 = getAnchor(ConstraintAnchor.Type.CENTER);
                if (anchor14.getTarget() != anchor10) {
                    anchor14.reset();
                }
                ConstraintAnchor opposite = getAnchor(type).getOpposite();
                ConstraintAnchor anchor15 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
                if (anchor15.isConnected()) {
                    opposite.reset();
                    anchor15.reset();
                }
            } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor anchor16 = getAnchor(ConstraintAnchor.Type.CENTER);
                if (anchor16.getTarget() != anchor10) {
                    anchor16.reset();
                }
                ConstraintAnchor opposite2 = getAnchor(type).getOpposite();
                ConstraintAnchor anchor17 = getAnchor(ConstraintAnchor.Type.CENTER_X);
                if (anchor17.isConnected()) {
                    opposite2.reset();
                    anchor17.reset();
                }
            }
            anchor9.connect(anchor10, i);
        }
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchor(ConstraintAnchor constraintAnchor) {
        if (getParent() != null && (getParent() instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
        ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
        ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
        ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.CENTER);
        ConstraintAnchor anchor6 = getAnchor(ConstraintAnchor.Type.CENTER_X);
        ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
        if (constraintAnchor == anchor5) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor.reset();
                anchor2.reset();
            }
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
            this.mVerticalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor6) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                anchor.reset();
                anchor2.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor7) {
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.mVerticalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor || constraintAnchor == anchor2) {
            if (anchor.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor5.reset();
            }
        } else if ((constraintAnchor == anchor3 || constraintAnchor == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
            anchor5.reset();
        }
        constraintAnchor.reset();
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent != null && (parent instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).reset();
        }
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        switch (C01921.f40x4c44d048[type.ordinal()]) {
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.mCenterX;
            case 8:
                return this.mCenterY;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public DimensionBehaviour getDimensionBehaviour(int i) {
        if (i == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public boolean isInHorizontalChain() {
        if (this.mLeft.mTarget == null || this.mLeft.mTarget.mTarget != this.mLeft) {
            return this.mRight.mTarget != null && this.mRight.mTarget.mTarget == this.mRight;
        }
        return true;
    }

    public ConstraintWidget getPreviousChainMember(int i) {
        if (i == 0) {
            if (this.mLeft.mTarget == null) {
                return null;
            }
            ConstraintAnchor constraintAnchor = this.mLeft.mTarget.mTarget;
            ConstraintAnchor constraintAnchor2 = this.mLeft;
            if (constraintAnchor == constraintAnchor2) {
                return constraintAnchor2.mTarget.mOwner;
            }
            return null;
        }
        if (i != 1 || this.mTop.mTarget == null) {
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mTop.mTarget.mTarget;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        if (constraintAnchor3 == constraintAnchor4) {
            return constraintAnchor4.mTarget.mOwner;
        }
        return null;
    }

    public ConstraintWidget getNextChainMember(int i) {
        if (i == 0) {
            if (this.mRight.mTarget == null) {
                return null;
            }
            ConstraintAnchor constraintAnchor = this.mRight.mTarget.mTarget;
            ConstraintAnchor constraintAnchor2 = this.mRight;
            if (constraintAnchor == constraintAnchor2) {
                return constraintAnchor2.mTarget.mOwner;
            }
            return null;
        }
        if (i != 1 || this.mBottom.mTarget == null) {
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mBottom.mTarget.mTarget;
        ConstraintAnchor constraintAnchor4 = this.mBottom;
        if (constraintAnchor3 == constraintAnchor4) {
            return constraintAnchor4.mTarget.mOwner;
        }
        return null;
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        if (!isInHorizontalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.RIGHT).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public boolean isInVerticalChain() {
        if (this.mTop.mTarget == null || this.mTop.mTarget.mTarget != this.mTop) {
            return this.mBottom.mTarget != null && this.mBottom.mTarget.mTarget == this.mBottom;
        }
        return true;
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        if (!isInVerticalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.TOP);
            ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.BOTTOM).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    private boolean isChainHead(int i) {
        int i2 = i * 2;
        if (this.mListAnchors[i2].mTarget != null) {
            ConstraintAnchor constraintAnchor = this.mListAnchors[i2].mTarget.mTarget;
            ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
            if (constraintAnchor != constraintAnchorArr[i2]) {
                int i3 = i2 + 1;
                if (constraintAnchorArr[i3].mTarget != null && this.mListAnchors[i3].mTarget.mTarget == this.mListAnchors[i3]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0271  */
    /* JADX WARN: Code duplicated, block: B:147:0x027b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x0287  */
    /* JADX WARN: Code duplicated, block: B:154:0x028e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0292  */
    /* JADX WARN: Code duplicated, block: B:157:0x0295  */
    /* JADX WARN: Code duplicated, block: B:160:0x02af  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:176:0x030a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0313  */
    /* JADX WARN: Code duplicated, block: B:180:0x0319  */
    /* JADX WARN: Code duplicated, block: B:181:0x0322  */
    /* JADX WARN: Code duplicated, block: B:183:0x0387  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:199:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:203:0x0406 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:206:0x0410  */
    /* JADX WARN: Code duplicated, block: B:209:0x0417  */
    /* JADX WARN: Code duplicated, block: B:211:0x041b  */
    /* JADX WARN: Code duplicated, block: B:213:0x041f  */
    /* JADX WARN: Code duplicated, block: B:218:0x0429  */
    /* JADX WARN: Code duplicated, block: B:221:0x042f  */
    /* JADX WARN: Code duplicated, block: B:222:0x0436  */
    /* JADX WARN: Code duplicated, block: B:225:0x043c  */
    /* JADX WARN: Code duplicated, block: B:228:0x0448  */
    /* JADX WARN: Code duplicated, block: B:230:0x044c  */
    /* JADX WARN: Code duplicated, block: B:232:0x0459  */
    /* JADX WARN: Code duplicated, block: B:234:0x0466  */
    /* JADX WARN: Code duplicated, block: B:236:0x0473  */
    /* JADX WARN: Code duplicated, block: B:238:0x0477  */
    /* JADX WARN: Code duplicated, block: B:241:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:244:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:246:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:247:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:250:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public void addToSolver(LinearSystem linearSystem) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        SolverVariable solverVariable;
        int i;
        int i2;
        int i3;
        boolean z5;
        boolean z6;
        boolean z7;
        int i4;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        ConstraintWidget constraintWidget;
        LinearSystem linearSystem2;
        SolverVariable solverVariable2;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ConstraintWidget constraintWidget2;
        SolverVariable solverVariableCreateObjectVariable;
        boolean z13;
        int i11;
        ConstraintWidget constraintWidget3;
        SolverVariable solverVariableCreateObjectVariable2;
        ConstraintWidget constraintWidget4;
        SolverVariable solverVariableCreateObjectVariable3;
        int i12;
        boolean zIsInHorizontalChain;
        boolean zIsInVerticalChain;
        ConstraintWidget constraintWidget5 = this;
        SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(constraintWidget5.mLeft);
        SolverVariable solverVariableCreateObjectVariable5 = linearSystem.createObjectVariable(constraintWidget5.mRight);
        SolverVariable solverVariableCreateObjectVariable6 = linearSystem.createObjectVariable(constraintWidget5.mTop);
        SolverVariable solverVariableCreateObjectVariable7 = linearSystem.createObjectVariable(constraintWidget5.mBottom);
        SolverVariable solverVariableCreateObjectVariable8 = linearSystem.createObjectVariable(constraintWidget5.mBaseline);
        if (LinearSystem.sMetrics != null) {
            LinearSystem.sMetrics.widgets++;
        }
        if (constraintWidget5.horizontalRun.start.resolved && constraintWidget5.horizontalRun.end.resolved && constraintWidget5.verticalRun.start.resolved && constraintWidget5.verticalRun.end.resolved) {
            if (LinearSystem.sMetrics != null) {
                LinearSystem.sMetrics.graphSolved++;
            }
            linearSystem.addEquality(solverVariableCreateObjectVariable4, constraintWidget5.horizontalRun.start.value);
            linearSystem.addEquality(solverVariableCreateObjectVariable5, constraintWidget5.horizontalRun.end.value);
            linearSystem.addEquality(solverVariableCreateObjectVariable6, constraintWidget5.verticalRun.start.value);
            linearSystem.addEquality(solverVariableCreateObjectVariable7, constraintWidget5.verticalRun.end.value);
            linearSystem.addEquality(solverVariableCreateObjectVariable8, constraintWidget5.verticalRun.baseline.value);
            ConstraintWidget constraintWidget6 = constraintWidget5.mParent;
            if (constraintWidget6 != null) {
                boolean z14 = constraintWidget6 != null && constraintWidget6.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT;
                ConstraintWidget constraintWidget7 = constraintWidget5.mParent;
                boolean z15 = constraintWidget7 != null && constraintWidget7.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT;
                if (z14 && constraintWidget5.isTerminalWidget[0] && !isInHorizontalChain()) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget5.mParent.mRight), solverVariableCreateObjectVariable5, 0, 8);
                }
                if (z15 && constraintWidget5.isTerminalWidget[1] && !isInVerticalChain()) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget5.mParent.mBottom), solverVariableCreateObjectVariable7, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        if (LinearSystem.sMetrics != null) {
            LinearSystem.sMetrics.linearSolved++;
        }
        ConstraintWidget constraintWidget8 = constraintWidget5.mParent;
        if (constraintWidget8 != null) {
            boolean z16 = constraintWidget8 != null && constraintWidget8.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT;
            ConstraintWidget constraintWidget9 = constraintWidget5.mParent;
            boolean z17 = constraintWidget9 != null && constraintWidget9.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT;
            if (constraintWidget5.isChainHead(0)) {
                ((ConstraintWidgetContainer) constraintWidget5.mParent).addChain(constraintWidget5, 0);
                zIsInHorizontalChain = true;
            } else {
                zIsInHorizontalChain = isInHorizontalChain();
            }
            if (constraintWidget5.isChainHead(1)) {
                ((ConstraintWidgetContainer) constraintWidget5.mParent).addChain(constraintWidget5, 1);
                zIsInVerticalChain = true;
            } else {
                zIsInVerticalChain = isInVerticalChain();
            }
            if (!zIsInHorizontalChain && z16 && constraintWidget5.mVisibility != 8 && constraintWidget5.mLeft.mTarget == null && constraintWidget5.mRight.mTarget == null) {
                linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget5.mParent.mRight), solverVariableCreateObjectVariable5, 0, 1);
            }
            if (!zIsInVerticalChain && z17 && constraintWidget5.mVisibility != 8 && constraintWidget5.mTop.mTarget == null && constraintWidget5.mBottom.mTarget == null && constraintWidget5.mBaseline == null) {
                linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget5.mParent.mBottom), solverVariableCreateObjectVariable7, 0, 1);
            }
            z2 = z16;
            z = z17;
            z4 = zIsInHorizontalChain;
            z3 = zIsInVerticalChain;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        int i13 = constraintWidget5.mWidth;
        int i14 = constraintWidget5.mMinWidth;
        if (i13 < i14) {
            i13 = i14;
        }
        int i15 = constraintWidget5.mHeight;
        int i16 = constraintWidget5.mMinHeight;
        if (i15 < i16) {
            i15 = i16;
        }
        boolean z18 = constraintWidget5.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z19 = constraintWidget5.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT;
        constraintWidget5.mResolvedDimensionRatioSide = constraintWidget5.mDimensionRatioSide;
        float f = constraintWidget5.mDimensionRatio;
        constraintWidget5.mResolvedDimensionRatio = f;
        int i17 = constraintWidget5.mMatchConstraintDefaultWidth;
        int i18 = constraintWidget5.mMatchConstraintDefaultHeight;
        SolverVariable solverVariable5 = solverVariableCreateObjectVariable6;
        if (f > 0.0f && constraintWidget5.mVisibility != 8) {
            solverVariable = solverVariableCreateObjectVariable8;
            if (constraintWidget5.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && i17 == 0) {
                i17 = 3;
            }
            if (constraintWidget5.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && i18 == 0) {
                i18 = 3;
            }
            if (constraintWidget5.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget5.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && i17 == 3 && i18 == 3) {
                constraintWidget5.setupDimensionRatio(z2, z, z18, z19);
            } else {
                if (constraintWidget5.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && i17 == 3) {
                    constraintWidget5.mResolvedDimensionRatioSide = 0;
                    i13 = (int) (constraintWidget5.mResolvedDimensionRatio * constraintWidget5.mHeight);
                    z5 = true;
                    i = i18;
                    i2 = i15;
                    if (constraintWidget5.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
                        i3 = 4;
                        z5 = false;
                    } else {
                        i3 = i17;
                    }
                } else if (constraintWidget5.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && i18 == 3) {
                    constraintWidget5.mResolvedDimensionRatioSide = 1;
                    if (constraintWidget5.mDimensionRatioSide == -1) {
                        constraintWidget5.mResolvedDimensionRatio = 1.0f / constraintWidget5.mResolvedDimensionRatio;
                    }
                    i15 = (int) (constraintWidget5.mResolvedDimensionRatio * constraintWidget5.mWidth);
                    if (constraintWidget5.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
                        i2 = i15;
                        i = 4;
                    }
                }
                int[] iArr = constraintWidget5.mResolvedMatchConstraintDefault;
                iArr[0] = i3;
                iArr[1] = i;
                constraintWidget5.mResolvedHasRatio = z5;
                z6 = !z5 && ((i12 = constraintWidget5.mResolvedDimensionRatioSide) == 0 || i12 == -1);
                if (constraintWidget5.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT || !(constraintWidget5 instanceof ConstraintWidgetContainer)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (z7) {
                    i4 = 0;
                } else {
                    i4 = i13;
                }
                z8 = !constraintWidget5.mCenter.isConnected();
                boolean[] zArr = constraintWidget5.mIsInBarrier;
                z9 = zArr[0];
                z10 = zArr[1];
                if (constraintWidget5.mHorizontalResolution != 2) {
                    if (constraintWidget5.horizontalRun.start.resolved || !constraintWidget5.horizontalRun.end.resolved) {
                        constraintWidget3 = constraintWidget5.mParent;
                        if (constraintWidget3 != null) {
                            solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(constraintWidget3.mRight);
                        } else {
                            solverVariableCreateObjectVariable2 = null;
                        }
                        constraintWidget4 = constraintWidget5.mParent;
                        if (constraintWidget4 != null) {
                            solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(constraintWidget4.mLeft);
                        } else {
                            solverVariableCreateObjectVariable3 = null;
                        }
                        z12 = z2;
                        z11 = z;
                        applyConstraints(linearSystem, true, z12, z11, constraintWidget5.isTerminalWidget[0], solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, constraintWidget5.mListDimensionBehaviors[0], z7, constraintWidget5.mLeft, constraintWidget5.mRight, constraintWidget5.f38mX, i4, constraintWidget5.mMinWidth, constraintWidget5.mMaxDimension[0], constraintWidget5.mHorizontalBiasPercent, z6, z4, z3, z9, i3, i, constraintWidget5.mMatchConstraintMinWidth, constraintWidget5.mMatchConstraintMaxWidth, constraintWidget5.mMatchConstraintPercentWidth, z8);
                    } else {
                        linearSystem.addEquality(solverVariableCreateObjectVariable4, constraintWidget5.horizontalRun.start.value);
                        linearSystem.addEquality(solverVariableCreateObjectVariable5, constraintWidget5.horizontalRun.end.value);
                        if (constraintWidget5.mParent != null && z2 && constraintWidget5.isTerminalWidget[0] && !isInHorizontalChain()) {
                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget5.mParent.mRight), solverVariableCreateObjectVariable5, 0, 8);
                        }
                        z11 = z;
                        solverVariableCreateObjectVariable7 = solverVariableCreateObjectVariable7;
                        z5 = z5;
                        solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                        solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                        z12 = z2;
                        solverVariable5 = solverVariable5;
                        solverVariable = solverVariable;
                        constraintWidget = constraintWidget5;
                    }
                    if (constraintWidget.verticalRun.start.resolved || !constraintWidget.verticalRun.end.resolved) {
                        linearSystem2 = linearSystem;
                        solverVariable2 = solverVariable;
                        solverVariable3 = solverVariableCreateObjectVariable7;
                        solverVariable4 = solverVariable5;
                        i5 = 8;
                        i6 = 0;
                        i7 = 1;
                        i8 = 1;
                    } else {
                        linearSystem2 = linearSystem;
                        solverVariable4 = solverVariable5;
                        linearSystem2.addEquality(solverVariable4, constraintWidget.verticalRun.start.value);
                        solverVariable3 = solverVariableCreateObjectVariable7;
                        linearSystem2.addEquality(solverVariable3, constraintWidget.verticalRun.end.value);
                        solverVariable2 = solverVariable;
                        linearSystem2.addEquality(solverVariable2, constraintWidget.verticalRun.baseline.value);
                        ConstraintWidget constraintWidget10 = constraintWidget.mParent;
                        if (constraintWidget10 == null || z3 || !z11) {
                            i5 = 8;
                            i6 = 0;
                            i7 = 1;
                        } else {
                            i7 = 1;
                            if (constraintWidget.isTerminalWidget[1]) {
                                i5 = 8;
                                i6 = 0;
                                linearSystem2.addGreaterThan(linearSystem2.createObjectVariable(constraintWidget10.mBottom), solverVariable3, 0, 8);
                            } else {
                                i5 = 8;
                                i6 = 0;
                            }
                        }
                        i8 = i6;
                    }
                    if (constraintWidget.mVerticalResolution != 2 && i8 != 0) {
                        if (constraintWidget.mListDimensionBehaviors[i7] == DimensionBehaviour.WRAP_CONTENT || !(constraintWidget instanceof ConstraintWidgetContainer)) {
                            i9 = i6;
                        } else {
                            i9 = i7;
                        }
                        if (i9 != 0) {
                            i2 = i6;
                        }
                        if (z5 || !((i11 = constraintWidget.mResolvedDimensionRatioSide) == i7 || i11 == -1)) {
                            i10 = i6;
                        } else {
                            i10 = i7;
                        }
                        constraintWidget2 = constraintWidget.mParent;
                        if (constraintWidget2 != null) {
                            solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget2.mBottom);
                        } else {
                            solverVariableCreateObjectVariable = null;
                        }
                        ConstraintWidget constraintWidget11 = constraintWidget.mParent;
                        SolverVariable solverVariableCreateObjectVariable9 = constraintWidget11 != null ? linearSystem2.createObjectVariable(constraintWidget11.mTop) : null;
                        if (constraintWidget.mBaselineDistance <= 0 || constraintWidget.mVisibility == i5) {
                            linearSystem2.addEquality(solverVariable2, solverVariable4, getBaselineDistance(), i5);
                            if (constraintWidget.mBaseline.mTarget != null) {
                                linearSystem2.addEquality(solverVariable2, linearSystem2.createObjectVariable(constraintWidget.mBaseline.mTarget), i6, i5);
                                if (z11) {
                                    linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(constraintWidget.mBottom), i6, 5);
                                }
                                z13 = i6;
                            } else {
                                if (constraintWidget.mVisibility == i5) {
                                    linearSystem2.addEquality(solverVariable2, solverVariable4, i6, i5);
                                }
                                z13 = z8;
                            }
                        } else {
                            z13 = z8;
                        }
                        applyConstraints(linearSystem, false, z11, z12, constraintWidget.isTerminalWidget[i7], solverVariableCreateObjectVariable9, solverVariableCreateObjectVariable, constraintWidget.mListDimensionBehaviors[i7], i9, constraintWidget.mTop, constraintWidget.mBottom, constraintWidget.f39mY, i2, constraintWidget.mMinHeight, constraintWidget.mMaxDimension[i7], constraintWidget.mVerticalBiasPercent, i10, z3, z4, z10, i, i3, constraintWidget.mMatchConstraintMinHeight, constraintWidget.mMatchConstraintMaxHeight, constraintWidget.mMatchConstraintPercentHeight, z13);
                    }
                    if (z5) {
                        if (this.mResolvedDimensionRatioSide == 1) {
                            linearSystem.addRatio(solverVariable3, solverVariable4, solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable4, this.mResolvedDimensionRatio, 8);
                        } else {
                            linearSystem.addRatio(solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable4, solverVariable3, solverVariable4, this.mResolvedDimensionRatio, 8);
                        }
                    }
                    if (this.mCenter.isConnected()) {
                        linearSystem.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
                    }
                }
                z11 = z;
                z12 = z2;
                constraintWidget = this;
                if (constraintWidget.verticalRun.start.resolved) {
                    linearSystem2 = linearSystem;
                    solverVariable2 = solverVariable;
                    solverVariable3 = solverVariableCreateObjectVariable7;
                    solverVariable4 = solverVariable5;
                    i5 = 8;
                    i6 = 0;
                    i7 = 1;
                    i8 = 1;
                } else {
                    linearSystem2 = linearSystem;
                    solverVariable2 = solverVariable;
                    solverVariable3 = solverVariableCreateObjectVariable7;
                    solverVariable4 = solverVariable5;
                    i5 = 8;
                    i6 = 0;
                    i7 = 1;
                    i8 = 1;
                }
                if (constraintWidget.mVerticalResolution != 2) {
                    if (constraintWidget.mListDimensionBehaviors[i7] == DimensionBehaviour.WRAP_CONTENT) {
                        i9 = i6;
                    } else {
                        i9 = i6;
                    }
                    if (i9 != 0) {
                        i2 = i6;
                    }
                    if (z5) {
                        i10 = i6;
                    } else {
                        i10 = i6;
                    }
                    constraintWidget2 = constraintWidget.mParent;
                    if (constraintWidget2 != null) {
                        solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget2.mBottom);
                    } else {
                        solverVariableCreateObjectVariable = null;
                    }
                    ConstraintWidget constraintWidget12 = constraintWidget.mParent;
                    if (constraintWidget12 != null) {
                    }
                    if (constraintWidget.mBaselineDistance <= 0) {
                        linearSystem2.addEquality(solverVariable2, solverVariable4, getBaselineDistance(), i5);
                        if (constraintWidget.mBaseline.mTarget != null) {
                            linearSystem2.addEquality(solverVariable2, linearSystem2.createObjectVariable(constraintWidget.mBaseline.mTarget), i6, i5);
                            if (z11) {
                                linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(constraintWidget.mBottom), i6, 5);
                            }
                            z13 = i6;
                        } else {
                            if (constraintWidget.mVisibility == i5) {
                                linearSystem2.addEquality(solverVariable2, solverVariable4, i6, i5);
                            }
                            z13 = z8;
                        }
                    } else {
                        linearSystem2.addEquality(solverVariable2, solverVariable4, getBaselineDistance(), i5);
                        if (constraintWidget.mBaseline.mTarget != null) {
                            linearSystem2.addEquality(solverVariable2, linearSystem2.createObjectVariable(constraintWidget.mBaseline.mTarget), i6, i5);
                            if (z11) {
                                linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(constraintWidget.mBottom), i6, 5);
                            }
                            z13 = i6;
                        } else {
                            if (constraintWidget.mVisibility == i5) {
                                linearSystem2.addEquality(solverVariable2, solverVariable4, i6, i5);
                            }
                            z13 = z8;
                        }
                    }
                    applyConstraints(linearSystem, false, z11, z12, constraintWidget.isTerminalWidget[i7], solverVariableCreateObjectVariable9, solverVariableCreateObjectVariable, constraintWidget.mListDimensionBehaviors[i7], i9, constraintWidget.mTop, constraintWidget.mBottom, constraintWidget.f39mY, i2, constraintWidget.mMinHeight, constraintWidget.mMaxDimension[i7], constraintWidget.mVerticalBiasPercent, i10, z3, z4, z10, i, i3, constraintWidget.mMatchConstraintMinHeight, constraintWidget.mMatchConstraintMaxHeight, constraintWidget.mMatchConstraintPercentHeight, z13);
                }
                if (z5) {
                    if (this.mResolvedDimensionRatioSide == 1) {
                        linearSystem.addRatio(solverVariable3, solverVariable4, solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable4, this.mResolvedDimensionRatio, 8);
                    } else {
                        linearSystem.addRatio(solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable4, solverVariable3, solverVariable4, this.mResolvedDimensionRatio, 8);
                    }
                }
                if (this.mCenter.isConnected()) {
                    linearSystem.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
                }
            }
            i = i18;
            i2 = i15;
            i3 = i17;
            z5 = true;
            int[] iArr2 = constraintWidget5.mResolvedMatchConstraintDefault;
            iArr2[0] = i3;
            iArr2[1] = i;
            constraintWidget5.mResolvedHasRatio = z5;
            if (z5) {
            }
            if (constraintWidget5.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z7) {
                i4 = 0;
            } else {
                i4 = i13;
            }
            z8 = !constraintWidget5.mCenter.isConnected();
            boolean[] zArr2 = constraintWidget5.mIsInBarrier;
            z9 = zArr2[0];
            z10 = zArr2[1];
            if (constraintWidget5.mHorizontalResolution != 2) {
                if (constraintWidget5.horizontalRun.start.resolved) {
                }
                constraintWidget3 = constraintWidget5.mParent;
                if (constraintWidget3 != null) {
                    solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(constraintWidget3.mRight);
                } else {
                    solverVariableCreateObjectVariable2 = null;
                }
                constraintWidget4 = constraintWidget5.mParent;
                if (constraintWidget4 != null) {
                    solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(constraintWidget4.mLeft);
                } else {
                    solverVariableCreateObjectVariable3 = null;
                }
                z12 = z2;
                z11 = z;
                applyConstraints(linearSystem, true, z12, z11, constraintWidget5.isTerminalWidget[0], solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, constraintWidget5.mListDimensionBehaviors[0], z7, constraintWidget5.mLeft, constraintWidget5.mRight, constraintWidget5.f38mX, i4, constraintWidget5.mMinWidth, constraintWidget5.mMaxDimension[0], constraintWidget5.mHorizontalBiasPercent, z6, z4, z3, z9, i3, i, constraintWidget5.mMatchConstraintMinWidth, constraintWidget5.mMatchConstraintMaxWidth, constraintWidget5.mMatchConstraintPercentWidth, z8);
            } else {
                z11 = z;
                z12 = z2;
            }
            constraintWidget = this;
            if (constraintWidget.verticalRun.start.resolved) {
                linearSystem2 = linearSystem;
                solverVariable2 = solverVariable;
                solverVariable3 = solverVariableCreateObjectVariable7;
                solverVariable4 = solverVariable5;
                i5 = 8;
                i6 = 0;
                i7 = 1;
                i8 = 1;
            } else {
                linearSystem2 = linearSystem;
                solverVariable2 = solverVariable;
                solverVariable3 = solverVariableCreateObjectVariable7;
                solverVariable4 = solverVariable5;
                i5 = 8;
                i6 = 0;
                i7 = 1;
                i8 = 1;
            }
            if (constraintWidget.mVerticalResolution != 2) {
                if (constraintWidget.mListDimensionBehaviors[i7] == DimensionBehaviour.WRAP_CONTENT) {
                    i9 = i6;
                } else {
                    i9 = i6;
                }
                if (i9 != 0) {
                    i2 = i6;
                }
                if (z5) {
                    i10 = i6;
                } else {
                    i10 = i6;
                }
                constraintWidget2 = constraintWidget.mParent;
                if (constraintWidget2 != null) {
                    solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget2.mBottom);
                } else {
                    solverVariableCreateObjectVariable = null;
                }
                ConstraintWidget constraintWidget13 = constraintWidget.mParent;
                if (constraintWidget13 != null) {
                }
                if (constraintWidget.mBaselineDistance <= 0) {
                    linearSystem2.addEquality(solverVariable2, solverVariable4, getBaselineDistance(), i5);
                    if (constraintWidget.mBaseline.mTarget != null) {
                        linearSystem2.addEquality(solverVariable2, linearSystem2.createObjectVariable(constraintWidget.mBaseline.mTarget), i6, i5);
                        if (z11) {
                            linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(constraintWidget.mBottom), i6, 5);
                        }
                        z13 = i6;
                    } else {
                        if (constraintWidget.mVisibility == i5) {
                            linearSystem2.addEquality(solverVariable2, solverVariable4, i6, i5);
                        }
                        z13 = z8;
                    }
                } else {
                    linearSystem2.addEquality(solverVariable2, solverVariable4, getBaselineDistance(), i5);
                    if (constraintWidget.mBaseline.mTarget != null) {
                        linearSystem2.addEquality(solverVariable2, linearSystem2.createObjectVariable(constraintWidget.mBaseline.mTarget), i6, i5);
                        if (z11) {
                            linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(constraintWidget.mBottom), i6, 5);
                        }
                        z13 = i6;
                    } else {
                        if (constraintWidget.mVisibility == i5) {
                            linearSystem2.addEquality(solverVariable2, solverVariable4, i6, i5);
                        }
                        z13 = z8;
                    }
                }
                applyConstraints(linearSystem, false, z11, z12, constraintWidget.isTerminalWidget[i7], solverVariableCreateObjectVariable9, solverVariableCreateObjectVariable, constraintWidget.mListDimensionBehaviors[i7], i9, constraintWidget.mTop, constraintWidget.mBottom, constraintWidget.f39mY, i2, constraintWidget.mMinHeight, constraintWidget.mMaxDimension[i7], constraintWidget.mVerticalBiasPercent, i10, z3, z4, z10, i, i3, constraintWidget.mMatchConstraintMinHeight, constraintWidget.mMatchConstraintMaxHeight, constraintWidget.mMatchConstraintPercentHeight, z13);
            }
            if (z5) {
                if (this.mResolvedDimensionRatioSide == 1) {
                    linearSystem.addRatio(solverVariable3, solverVariable4, solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable4, this.mResolvedDimensionRatio, 8);
                } else {
                    linearSystem.addRatio(solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable4, solverVariable3, solverVariable4, this.mResolvedDimensionRatio, 8);
                }
            }
            if (this.mCenter.isConnected()) {
                linearSystem.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
            }
        }
        solverVariable = solverVariableCreateObjectVariable8;
        i = i18;
        i2 = i15;
        i3 = i17;
        z5 = false;
        int[] iArr3 = constraintWidget5.mResolvedMatchConstraintDefault;
        iArr3[0] = i3;
        iArr3[1] = i;
        constraintWidget5.mResolvedHasRatio = z5;
        if (z5) {
        }
        if (constraintWidget5.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT) {
            z7 = false;
        } else {
            z7 = false;
        }
        if (z7) {
            i4 = 0;
        } else {
            i4 = i13;
        }
        z8 = !constraintWidget5.mCenter.isConnected();
        boolean[] zArr3 = constraintWidget5.mIsInBarrier;
        z9 = zArr3[0];
        z10 = zArr3[1];
        if (constraintWidget5.mHorizontalResolution != 2) {
            if (constraintWidget5.horizontalRun.start.resolved) {
            }
            constraintWidget3 = constraintWidget5.mParent;
            if (constraintWidget3 != null) {
                solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(constraintWidget3.mRight);
            } else {
                solverVariableCreateObjectVariable2 = null;
            }
            constraintWidget4 = constraintWidget5.mParent;
            if (constraintWidget4 != null) {
                solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(constraintWidget4.mLeft);
            } else {
                solverVariableCreateObjectVariable3 = null;
            }
            z12 = z2;
            z11 = z;
            applyConstraints(linearSystem, true, z12, z11, constraintWidget5.isTerminalWidget[0], solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, constraintWidget5.mListDimensionBehaviors[0], z7, constraintWidget5.mLeft, constraintWidget5.mRight, constraintWidget5.f38mX, i4, constraintWidget5.mMinWidth, constraintWidget5.mMaxDimension[0], constraintWidget5.mHorizontalBiasPercent, z6, z4, z3, z9, i3, i, constraintWidget5.mMatchConstraintMinWidth, constraintWidget5.mMatchConstraintMaxWidth, constraintWidget5.mMatchConstraintPercentWidth, z8);
        } else {
            z11 = z;
            z12 = z2;
        }
        constraintWidget = this;
        if (constraintWidget.verticalRun.start.resolved) {
            linearSystem2 = linearSystem;
            solverVariable2 = solverVariable;
            solverVariable3 = solverVariableCreateObjectVariable7;
            solverVariable4 = solverVariable5;
            i5 = 8;
            i6 = 0;
            i7 = 1;
            i8 = 1;
        } else {
            linearSystem2 = linearSystem;
            solverVariable2 = solverVariable;
            solverVariable3 = solverVariableCreateObjectVariable7;
            solverVariable4 = solverVariable5;
            i5 = 8;
            i6 = 0;
            i7 = 1;
            i8 = 1;
        }
        if (constraintWidget.mVerticalResolution != 2) {
            if (constraintWidget.mListDimensionBehaviors[i7] == DimensionBehaviour.WRAP_CONTENT) {
                i9 = i6;
            } else {
                i9 = i6;
            }
            if (i9 != 0) {
                i2 = i6;
            }
            if (z5) {
                i10 = i6;
            } else {
                i10 = i6;
            }
            constraintWidget2 = constraintWidget.mParent;
            if (constraintWidget2 != null) {
                solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget2.mBottom);
            } else {
                solverVariableCreateObjectVariable = null;
            }
            ConstraintWidget constraintWidget14 = constraintWidget.mParent;
            if (constraintWidget14 != null) {
            }
            if (constraintWidget.mBaselineDistance <= 0) {
                linearSystem2.addEquality(solverVariable2, solverVariable4, getBaselineDistance(), i5);
                if (constraintWidget.mBaseline.mTarget != null) {
                    linearSystem2.addEquality(solverVariable2, linearSystem2.createObjectVariable(constraintWidget.mBaseline.mTarget), i6, i5);
                    if (z11) {
                        linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(constraintWidget.mBottom), i6, 5);
                    }
                    z13 = i6;
                } else {
                    if (constraintWidget.mVisibility == i5) {
                        linearSystem2.addEquality(solverVariable2, solverVariable4, i6, i5);
                    }
                    z13 = z8;
                }
            } else {
                linearSystem2.addEquality(solverVariable2, solverVariable4, getBaselineDistance(), i5);
                if (constraintWidget.mBaseline.mTarget != null) {
                    linearSystem2.addEquality(solverVariable2, linearSystem2.createObjectVariable(constraintWidget.mBaseline.mTarget), i6, i5);
                    if (z11) {
                        linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(constraintWidget.mBottom), i6, 5);
                    }
                    z13 = i6;
                } else {
                    if (constraintWidget.mVisibility == i5) {
                        linearSystem2.addEquality(solverVariable2, solverVariable4, i6, i5);
                    }
                    z13 = z8;
                }
            }
            applyConstraints(linearSystem, false, z11, z12, constraintWidget.isTerminalWidget[i7], solverVariableCreateObjectVariable9, solverVariableCreateObjectVariable, constraintWidget.mListDimensionBehaviors[i7], i9, constraintWidget.mTop, constraintWidget.mBottom, constraintWidget.f39mY, i2, constraintWidget.mMinHeight, constraintWidget.mMaxDimension[i7], constraintWidget.mVerticalBiasPercent, i10, z3, z4, z10, i, i3, constraintWidget.mMatchConstraintMinHeight, constraintWidget.mMatchConstraintMaxHeight, constraintWidget.mMatchConstraintPercentHeight, z13);
        }
        if (z5) {
            if (this.mResolvedDimensionRatioSide == 1) {
                linearSystem.addRatio(solverVariable3, solverVariable4, solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable4, this.mResolvedDimensionRatio, 8);
            } else {
                linearSystem.addRatio(solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable4, solverVariable3, solverVariable4, this.mResolvedDimensionRatio, 8);
            }
        }
        if (this.mCenter.isConnected()) {
            linearSystem.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
        }
    }

    boolean addFirst() {
        return (this instanceof VirtualLayout) || (this instanceof Guideline);
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z3 && !z4) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z3 && z4) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            int i = this.mMatchConstraintMinWidth;
            if (i > 0 && this.mMatchConstraintMinHeight == 0) {
                this.mResolvedDimensionRatioSide = 0;
            } else {
                if (i != 0 || this.mMatchConstraintMinHeight <= 0) {
                    return;
                }
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0177  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:181:0x02de  */
    /* JADX WARN: Code duplicated, block: B:183:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:184:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:186:0x030e  */
    /* JADX WARN: Code duplicated, block: B:189:0x031b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:190:0x031c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:191:0x031e  */
    /* JADX WARN: Code duplicated, block: B:199:0x032f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0348  */
    /* JADX WARN: Code duplicated, block: B:209:0x035f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0365  */
    /* JADX WARN: Code duplicated, block: B:233:0x0393  */
    /* JADX WARN: Code duplicated, block: B:235:0x0397  */
    /* JADX WARN: Code duplicated, block: B:243:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:245:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:246:0x03be  */
    /* JADX WARN: Code duplicated, block: B:248:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:270:0x03fd A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:273:0x040b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:298:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:66:0x0104  */
    /* JADX WARN: Code duplicated, block: B:67:0x0106  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x010b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0116  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    /* JADX WARN: Code duplicated, block: B:83:0x0125  */
    /* JADX WARN: Code duplicated, block: B:86:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    /* JADX WARN: Code duplicated, block: B:88:0x0134 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0136  */
    /* JADX WARN: Code duplicated, block: B:90:0x013e  */
    /* JADX WARN: Code duplicated, block: B:92:0x014a  */
    /* JADX WARN: Code duplicated, block: B:94:0x014d  */
    private void applyConstraints(LinearSystem linearSystem, boolean z, boolean z2, boolean z3, boolean z4, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, int i5, int i6, int i7, int i8, float f2, boolean z10) {
        int i9;
        boolean z11;
        int iMin;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        SolverVariable solverVariableCreateObjectVariable;
        SolverVariable solverVariableCreateObjectVariable2;
        int i15;
        boolean z13;
        boolean z14;
        int i16;
        int i17;
        boolean z15;
        boolean z16;
        boolean z17;
        int i18;
        ConstraintWidget constraintWidget;
        int i19;
        LinearSystem linearSystem2;
        SolverVariable solverVariable3;
        int iMin2;
        int i20;
        SolverVariable solverVariable4;
        int margin;
        ConstraintWidget constraintWidget2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z18;
        boolean z19;
        SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(constraintAnchor);
        SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(constraintAnchor2);
        SolverVariable solverVariableCreateObjectVariable5 = linearSystem.createObjectVariable(constraintAnchor.getTarget());
        SolverVariable solverVariableCreateObjectVariable6 = linearSystem.createObjectVariable(constraintAnchor2.getTarget());
        if (LinearSystem.getMetrics() != null) {
            LinearSystem.getMetrics().nonresolvedWidgets++;
        }
        boolean zIsConnected = constraintAnchor.isConnected();
        boolean zIsConnected2 = constraintAnchor2.isConnected();
        boolean zIsConnected3 = this.mCenter.isConnected();
        int i27 = zIsConnected2 ? (zIsConnected ? 1 : 0) + 1 : zIsConnected ? 1 : 0;
        if (zIsConnected3) {
            i27++;
        }
        int i28 = z6 ? 3 : i5;
        int i29 = C01921.f41xdde91696[dimensionBehaviour.ordinal()];
        if (i29 != 1 && i29 != 2 && i29 != 3 && i29 == 4) {
            i9 = i28;
            if (i9 != 4) {
                z11 = true;
            }
            if (this.mVisibility == 8) {
                iMin = 0;
                z11 = false;
            } else {
                iMin = i2;
            }
            if (!z10) {
                if (zIsConnected && !zIsConnected2 && !zIsConnected3) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable3, i);
                } else if (zIsConnected && !zIsConnected2) {
                    i10 = 8;
                    linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), 8);
                }
                i10 = 8;
            } else {
                i10 = 8;
            }
            if (!z11) {
                if (i27 == 2 && !z6 && (i9 == 1 || i9 == 0)) {
                    int iMax = Math.max(i7, iMin);
                    if (i8 > 0) {
                        iMax = Math.min(i8, iMax);
                    }
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMax, 8);
                    i14 = i7;
                    i12 = i8;
                    solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                    solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                    z12 = false;
                    i13 = i27;
                } else {
                    if (i7 == -2) {
                        i11 = iMin;
                    } else {
                        i11 = i7;
                    }
                    if (i8 == -2) {
                        i12 = iMin;
                    } else {
                        i12 = i8;
                    }
                    if (iMin > 0 && i9 != 1) {
                        iMin = 0;
                    }
                    if (i11 > 0) {
                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i11, 8);
                        iMin = Math.max(iMin, i11);
                    }
                    if (i12 > 0) {
                        if (z2 || i9 != 1) {
                            linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i12, 8);
                        }
                        iMin = Math.min(iMin, i12);
                    }
                    if (i9 == 1) {
                        if (z2) {
                            linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
                        } else if (z7) {
                            linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 5);
                            linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
                        } else {
                            linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 5);
                            linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
                        }
                        i14 = i11;
                    } else if (i9 == 2) {
                        if (constraintAnchor.getType() != ConstraintAnchor.Type.TOP || constraintAnchor.getType() == ConstraintAnchor.Type.BOTTOM) {
                            solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.TOP));
                            solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.BOTTOM));
                        } else {
                            solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.LEFT));
                            solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.RIGHT));
                        }
                        SolverVariable solverVariable5 = solverVariableCreateObjectVariable;
                        ArrayRow arrayRowCreateRow = linearSystem.createRow();
                        int i30 = i11;
                        solverVariableCreateObjectVariable6 = solverVariableCreateObjectVariable6;
                        i13 = i27 == true ? 1 : 0;
                        solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                        solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                        linearSystem.addConstraint(arrayRowCreateRow.createRowDimensionRatio(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, solverVariable5, f2));
                        z4 = z4;
                        i14 = i30;
                        z12 = false;
                    } else {
                        solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                        solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                        int i31 = i11;
                        solverVariableCreateObjectVariable6 = solverVariableCreateObjectVariable6;
                        i13 = i27;
                        i14 = i31;
                        z12 = z11;
                        z4 = true;
                    }
                }
                if (z10 || z7) {
                    i15 = 8;
                    if (i13 >= 2 && z2 && z4) {
                        
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0410: INVOKE 
                              (r10v0 ?? I:??[OBJECT, ARRAY])
                              (r9v0 'solverVariableCreateObjectVariable3' androidx.constraintlayout.solver.SolverVariable)
                              (r37v0 'solverVariable' androidx.constraintlayout.solver.SolverVariable A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
                              (0 int)
                              (r5v9 'i15' int)
                             VIRTUAL call: androidx.constraintlayout.solver.LinearSystem.addGreaterThan(androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.SolverVariable, int, int):void A[MD:(androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.SolverVariable, int, int):void (m)] (LINE:2503) in method: androidx.constraintlayout.solver.widgets.ConstraintWidget.applyConstraints(androidx.constraintlayout.solver.LinearSystem, boolean, boolean, boolean, boolean, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.solver.widgets.ConstraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1102
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.applyConstraints(androidx.constraintlayout.solver.LinearSystem, boolean, boolean, boolean, boolean, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.solver.widgets.ConstraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
                    }

                    /* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$1 */
                    static /* synthetic */ class C01921 {

                        /* JADX INFO: renamed from: $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type */
                        static final /* synthetic */ int[] f40x4c44d048;

                        /* JADX INFO: renamed from: $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour */
                        static final /* synthetic */ int[] f41xdde91696;

                        static {
                            int[] iArr = new int[DimensionBehaviour.values().length];
                            f41xdde91696 = iArr;
                            try {
                                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                f41xdde91696[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                f41xdde91696[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                f41xdde91696[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
                            f40x4c44d048 = iArr2;
                            try {
                                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
                            } catch (NoSuchFieldError unused5) {
                            }
                            try {
                                f40x4c44d048[ConstraintAnchor.Type.TOP.ordinal()] = 2;
                            } catch (NoSuchFieldError unused6) {
                            }
                            try {
                                f40x4c44d048[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
                            } catch (NoSuchFieldError unused7) {
                            }
                            try {
                                f40x4c44d048[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
                            } catch (NoSuchFieldError unused8) {
                            }
                            try {
                                f40x4c44d048[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
                            } catch (NoSuchFieldError unused9) {
                            }
                            try {
                                f40x4c44d048[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
                            } catch (NoSuchFieldError unused10) {
                            }
                            try {
                                f40x4c44d048[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
                            } catch (NoSuchFieldError unused11) {
                            }
                            try {
                                f40x4c44d048[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
                            } catch (NoSuchFieldError unused12) {
                            }
                            try {
                                f40x4c44d048[ConstraintAnchor.Type.NONE.ordinal()] = 9;
                            } catch (NoSuchFieldError unused13) {
                            }
                        }
                    }

                    public void updateFromSolver(LinearSystem linearSystem) {
                        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
                        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
                        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
                        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
                        if (this.horizontalRun.start.resolved && this.horizontalRun.end.resolved) {
                            objectVariableValue = this.horizontalRun.start.value;
                            objectVariableValue3 = this.horizontalRun.end.value;
                        }
                        if (this.verticalRun.start.resolved && this.verticalRun.end.resolved) {
                            objectVariableValue2 = this.verticalRun.start.value;
                            objectVariableValue4 = this.verticalRun.end.value;
                        }
                        int i = objectVariableValue4 - objectVariableValue2;
                        if (objectVariableValue3 - objectVariableValue < 0 || i < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
                            objectVariableValue = 0;
                            objectVariableValue4 = 0;
                            objectVariableValue2 = 0;
                            objectVariableValue3 = 0;
                        }
                        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
                    }

                    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
                        this.mHorizontalResolution = constraintWidget.mHorizontalResolution;
                        this.mVerticalResolution = constraintWidget.mVerticalResolution;
                        this.mMatchConstraintDefaultWidth = constraintWidget.mMatchConstraintDefaultWidth;
                        this.mMatchConstraintDefaultHeight = constraintWidget.mMatchConstraintDefaultHeight;
                        int[] iArr = this.mResolvedMatchConstraintDefault;
                        int[] iArr2 = constraintWidget.mResolvedMatchConstraintDefault;
                        iArr[0] = iArr2[0];
                        iArr[1] = iArr2[1];
                        this.mMatchConstraintMinWidth = constraintWidget.mMatchConstraintMinWidth;
                        this.mMatchConstraintMaxWidth = constraintWidget.mMatchConstraintMaxWidth;
                        this.mMatchConstraintMinHeight = constraintWidget.mMatchConstraintMinHeight;
                        this.mMatchConstraintMaxHeight = constraintWidget.mMatchConstraintMaxHeight;
                        this.mMatchConstraintPercentHeight = constraintWidget.mMatchConstraintPercentHeight;
                        this.mIsWidthWrapContent = constraintWidget.mIsWidthWrapContent;
                        this.mIsHeightWrapContent = constraintWidget.mIsHeightWrapContent;
                        this.mResolvedDimensionRatioSide = constraintWidget.mResolvedDimensionRatioSide;
                        this.mResolvedDimensionRatio = constraintWidget.mResolvedDimensionRatio;
                        int[] iArr3 = constraintWidget.mMaxDimension;
                        this.mMaxDimension = Arrays.copyOf(iArr3, iArr3.length);
                        this.mCircleConstraintAngle = constraintWidget.mCircleConstraintAngle;
                        this.hasBaseline = constraintWidget.hasBaseline;
                        this.inPlaceholder = constraintWidget.inPlaceholder;
                        this.mLeft.reset();
                        this.mTop.reset();
                        this.mRight.reset();
                        this.mBottom.reset();
                        this.mBaseline.reset();
                        this.mCenterX.reset();
                        this.mCenterY.reset();
                        this.mCenter.reset();
                        this.mListDimensionBehaviors = (DimensionBehaviour[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
                        this.mParent = this.mParent == null ? null : map.get(constraintWidget.mParent);
                        this.mWidth = constraintWidget.mWidth;
                        this.mHeight = constraintWidget.mHeight;
                        this.mDimensionRatio = constraintWidget.mDimensionRatio;
                        this.mDimensionRatioSide = constraintWidget.mDimensionRatioSide;
                        this.f38mX = constraintWidget.f38mX;
                        this.f39mY = constraintWidget.f39mY;
                        this.mRelX = constraintWidget.mRelX;
                        this.mRelY = constraintWidget.mRelY;
                        this.mOffsetX = constraintWidget.mOffsetX;
                        this.mOffsetY = constraintWidget.mOffsetY;
                        this.mBaselineDistance = constraintWidget.mBaselineDistance;
                        this.mMinWidth = constraintWidget.mMinWidth;
                        this.mMinHeight = constraintWidget.mMinHeight;
                        this.mHorizontalBiasPercent = constraintWidget.mHorizontalBiasPercent;
                        this.mVerticalBiasPercent = constraintWidget.mVerticalBiasPercent;
                        this.mCompanionWidget = constraintWidget.mCompanionWidget;
                        this.mContainerItemSkip = constraintWidget.mContainerItemSkip;
                        this.mVisibility = constraintWidget.mVisibility;
                        this.mDebugName = constraintWidget.mDebugName;
                        this.mType = constraintWidget.mType;
                        this.mDistToTop = constraintWidget.mDistToTop;
                        this.mDistToLeft = constraintWidget.mDistToLeft;
                        this.mDistToRight = constraintWidget.mDistToRight;
                        this.mDistToBottom = constraintWidget.mDistToBottom;
                        this.mLeftHasCentered = constraintWidget.mLeftHasCentered;
                        this.mRightHasCentered = constraintWidget.mRightHasCentered;
                        this.mTopHasCentered = constraintWidget.mTopHasCentered;
                        this.mBottomHasCentered = constraintWidget.mBottomHasCentered;
                        this.mHorizontalWrapVisited = constraintWidget.mHorizontalWrapVisited;
                        this.mVerticalWrapVisited = constraintWidget.mVerticalWrapVisited;
                        this.mOptimizerMeasurable = constraintWidget.mOptimizerMeasurable;
                        this.mGroupsToSolver = constraintWidget.mGroupsToSolver;
                        this.mHorizontalChainStyle = constraintWidget.mHorizontalChainStyle;
                        this.mVerticalChainStyle = constraintWidget.mVerticalChainStyle;
                        this.mHorizontalChainFixedPosition = constraintWidget.mHorizontalChainFixedPosition;
                        this.mVerticalChainFixedPosition = constraintWidget.mVerticalChainFixedPosition;
                        float[] fArr = this.mWeight;
                        float[] fArr2 = constraintWidget.mWeight;
                        fArr[0] = fArr2[0];
                        fArr[1] = fArr2[1];
                        ConstraintWidget[] constraintWidgetArr = this.mListNextMatchConstraintsWidget;
                        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.mListNextMatchConstraintsWidget;
                        constraintWidgetArr[0] = constraintWidgetArr2[0];
                        constraintWidgetArr[1] = constraintWidgetArr2[1];
                        ConstraintWidget[] constraintWidgetArr3 = this.mNextChainWidget;
                        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.mNextChainWidget;
                        constraintWidgetArr3[0] = constraintWidgetArr4[0];
                        constraintWidgetArr3[1] = constraintWidgetArr4[1];
                        ConstraintWidget constraintWidget2 = constraintWidget.mHorizontalNextWidget;
                        this.mHorizontalNextWidget = constraintWidget2 == null ? null : map.get(constraintWidget2);
                        ConstraintWidget constraintWidget3 = constraintWidget.mVerticalNextWidget;
                        this.mVerticalNextWidget = constraintWidget3 != null ? map.get(constraintWidget3) : null;
                    }

                    public void updateFromRuns(boolean z, boolean z2) {
                        int i;
                        int i2;
                        boolean zIsResolved = z & this.horizontalRun.isResolved();
                        boolean zIsResolved2 = z2 & this.verticalRun.isResolved();
                        int i3 = this.horizontalRun.start.value;
                        int i4 = this.verticalRun.start.value;
                        int i5 = this.horizontalRun.end.value;
                        int i6 = this.verticalRun.end.value;
                        int i7 = i6 - i4;
                        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
                            i3 = 0;
                            i4 = 0;
                            i5 = 0;
                            i6 = 0;
                        }
                        int i8 = i5 - i3;
                        int i9 = i6 - i4;
                        if (zIsResolved) {
                            this.f38mX = i3;
                        }
                        if (zIsResolved2) {
                            this.f39mY = i4;
                        }
                        if (this.mVisibility == 8) {
                            this.mWidth = 0;
                            this.mHeight = 0;
                            return;
                        }
                        if (zIsResolved) {
                            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.mWidth)) {
                                i8 = i2;
                            }
                            this.mWidth = i8;
                            int i10 = this.mMinWidth;
                            if (i8 < i10) {
                                this.mWidth = i10;
                            }
                        }
                        if (zIsResolved2) {
                            if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i9 < (i = this.mHeight)) {
                                i9 = i;
                            }
                            this.mHeight = i9;
                            int i11 = this.mMinHeight;
                            if (i9 < i11) {
                                this.mHeight = i11;
                            }
                        }
                    }
                }
