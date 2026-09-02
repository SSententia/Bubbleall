package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidgetContainer extends WidgetContainer {
    private static final boolean DEBUG = false;
    static final boolean DEBUG_GRAPH = false;
    private static final boolean DEBUG_LAYOUT = false;
    private static final int MAX_ITERATIONS = 8;
    BasicMeasure mBasicMeasureSolver;
    int mDebugSolverPassCount;
    public DependencyGraph mDependencyGraph;
    public boolean mGroupsWrapOptimized;
    private boolean mHeightMeasuredTooSmall;
    ChainHead[] mHorizontalChainsArray;
    int mHorizontalChainsSize;
    public boolean mHorizontalWrapOptimized;
    private boolean mIsRtl;
    protected BasicMeasure.Measurer mMeasurer;
    public Metrics mMetrics;
    private int mOptimizationLevel;
    int mPaddingBottom;
    int mPaddingLeft;
    int mPaddingRight;
    int mPaddingTop;
    public boolean mSkipSolver;
    protected LinearSystem mSystem;
    ChainHead[] mVerticalChainsArray;
    int mVerticalChainsSize;
    public boolean mVerticalWrapOptimized;
    private boolean mWidthMeasuredTooSmall;
    public int mWrapFixedHeight;
    public int mWrapFixedWidth;

    public boolean handlesInternalConstraints() {
        return false;
    }

    public void invalidateGraph() {
        this.mDependencyGraph.invalidateGraph();
    }

    public void invalidateMeasures() {
        this.mDependencyGraph.invalidateMeasures();
    }

    public boolean directMeasure(boolean z) {
        return this.mDependencyGraph.directMeasure(z);
    }

    public boolean directMeasureSetup(boolean z) {
        return this.mDependencyGraph.directMeasureSetup(z);
    }

    public boolean directMeasureWithOrientation(boolean z, int i) {
        return this.mDependencyGraph.directMeasureWithOrientation(z, i);
    }

    public void defineTerminalWidgets() {
        this.mDependencyGraph.defineTerminalWidgets(getHorizontalDimensionBehaviour(), getVerticalDimensionBehaviour());
    }

    public long measure(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.mPaddingLeft = i8;
        this.mPaddingTop = i9;
        return this.mBasicMeasureSolver.solverMeasure(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public void updateHierarchy() {
        this.mBasicMeasureSolver.updateHierarchy(this);
    }

    public void setMeasurer(BasicMeasure.Measurer measurer) {
        this.mMeasurer = measurer;
        this.mDependencyGraph.setMeasurer(measurer);
    }

    public BasicMeasure.Measurer getMeasurer() {
        return this.mMeasurer;
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        this.mSystem.fillMetrics(metrics);
    }

    public ConstraintWidgetContainer() {
        this.mBasicMeasureSolver = new BasicMeasure(this);
        this.mDependencyGraph = new DependencyGraph(this);
        this.mMeasurer = null;
        this.mIsRtl = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new ChainHead[4];
        this.mHorizontalChainsArray = new ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.mOptimizationLevel = Optimizer.OPTIMIZATION_STANDARD;
        this.mSkipSolver = false;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
    }

    public ConstraintWidgetContainer(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.mBasicMeasureSolver = new BasicMeasure(this);
        this.mDependencyGraph = new DependencyGraph(this);
        this.mMeasurer = null;
        this.mIsRtl = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new ChainHead[4];
        this.mHorizontalChainsArray = new ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.mOptimizationLevel = Optimizer.OPTIMIZATION_STANDARD;
        this.mSkipSolver = false;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
    }

    public ConstraintWidgetContainer(int i, int i2) {
        super(i, i2);
        this.mBasicMeasureSolver = new BasicMeasure(this);
        this.mDependencyGraph = new DependencyGraph(this);
        this.mMeasurer = null;
        this.mIsRtl = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new ChainHead[4];
        this.mHorizontalChainsArray = new ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.mOptimizationLevel = Optimizer.OPTIMIZATION_STANDARD;
        this.mSkipSolver = false;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        LinearSystem.OPTIMIZED_ENGINE = Optimizer.enabled(i, 256);
    }

    public int getOptimizationLevel() {
        return this.mOptimizationLevel;
    }

    public boolean optimizeFor(int i) {
        return (this.mOptimizationLevel & i) == i;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public String getType() {
        return "ConstraintLayout";
    }

    @Override // androidx.constraintlayout.solver.widgets.WidgetContainer, androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void reset() {
        this.mSystem.reset();
        this.mPaddingLeft = 0;
        this.mPaddingRight = 0;
        this.mPaddingTop = 0;
        this.mPaddingBottom = 0;
        this.mSkipSolver = false;
        super.reset();
    }

    public boolean isWidthMeasuredTooSmall() {
        return this.mWidthMeasuredTooSmall;
    }

    public boolean isHeightMeasuredTooSmall() {
        return this.mHeightMeasuredTooSmall;
    }

    public boolean addChildrenToSolver(LinearSystem linearSystem) {
        addToSolver(linearSystem);
        int size = this.mChildren.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i);
            constraintWidget.setInBarrier(0, false);
            constraintWidget.setInBarrier(1, false);
            if (constraintWidget instanceof Barrier) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = this.mChildren.get(i2);
                if (constraintWidget2 instanceof Barrier) {
                    ((Barrier) constraintWidget2).markWidgets();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget3 = this.mChildren.get(i3);
            if (constraintWidget3.addFirst()) {
                constraintWidget3.addToSolver(linearSystem);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget4 = this.mChildren.get(i4);
            if (constraintWidget4 instanceof ConstraintWidgetContainer) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget4.mListDimensionBehaviors[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget4.mListDimensionBehaviors[1];
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget4.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                }
                if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget4.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                }
                constraintWidget4.addToSolver(linearSystem);
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget4.setHorizontalDimensionBehaviour(dimensionBehaviour);
                }
                if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget4.setVerticalDimensionBehaviour(dimensionBehaviour2);
                }
            } else {
                Optimizer.checkMatchParent(this, linearSystem, constraintWidget4);
                if (!constraintWidget4.addFirst()) {
                    constraintWidget4.addToSolver(linearSystem);
                }
            }
        }
        if (this.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(this, linearSystem, 0);
        }
        if (this.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(this, linearSystem, 1);
        }
        return true;
    }

    public void updateChildrenFromSolver(LinearSystem linearSystem, boolean[] zArr) {
        zArr[2] = false;
        updateFromSolver(linearSystem);
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            this.mChildren.get(i).updateFromSolver(linearSystem);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void updateFromRuns(boolean z, boolean z2) {
        super.updateFromRuns(z, z2);
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            this.mChildren.get(i).updateFromRuns(z, z2);
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.mPaddingLeft = i;
        this.mPaddingTop = i2;
        this.mPaddingRight = i3;
        this.mPaddingBottom = i4;
    }

    public void setRtl(boolean z) {
        this.mIsRtl = z;
    }

    public boolean isRtl() {
        return this.mIsRtl;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x015c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d3 A[PHI: r0 r12
  0x01d3: PHI (r0v30 ??) = (r0v29 ??), (r0v32 ??), (r0v32 ??), (r0v32 ??) binds: [B:70:0x0196, B:78:0x01bb, B:79:0x01bd, B:81:0x01c3] A[DONT_GENERATE, DONT_INLINE]
  0x01d3: PHI (r12v5 boolean) = (r12v4 boolean), (r12v7 boolean), (r12v7 boolean), (r12v7 boolean) binds: [B:70:0x0196, B:78:0x01bb, B:79:0x01bd, B:81:0x01c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
    @Override // androidx.constraintlayout.solver.widgets.WidgetContainer
    public void layout() {
        ?? r11;
        boolean z;
        boolean z2;
        ?? r12;
        boolean z3;
        ?? r0;
        ?? r13;
        boolean z4;
        boolean z5;
        boolean zAddChildrenToSolver;
        this.f38mX = 0;
        this.f39mY = 0;
        int iMax = Math.max(0, getWidth());
        int iMax2 = Math.max(0, getHeight());
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        boolean z6 = optimizeFor(64) || optimizeFor(128);
        this.mSystem.graphOptimizer = false;
        this.mSystem.newgraphOptimizer = false;
        if (this.mOptimizationLevel != 0 && z6) {
            this.mSystem.newgraphOptimizer = true;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.mListDimensionBehaviors[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.mListDimensionBehaviors[0];
        ArrayList<ConstraintWidget> arrayList = this.mChildren;
        boolean z7 = getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        resetChains();
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i);
            if (constraintWidget instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget).layout();
            }
        }
        int i2 = 0;
        boolean z8 = false;
        ?? r14 = 1;
        while (r14 != 0) {
            int i3 = i2 + 1;
            try {
                this.mSystem.reset();
                resetChains();
                createObjectVariables(this.mSystem);
                for (int i4 = 0; i4 < size; i4++) {
                    this.mChildren.get(i4).createObjectVariables(this.mSystem);
                }
                zAddChildrenToSolver = addChildrenToSolver(this.mSystem);
                r11 = zAddChildrenToSolver;
                if (zAddChildrenToSolver) {
                    this.mSystem.minimize();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("EXCEPTION : " + e);
                r11 = r14;
            }
            if (r11 != 0) {
                updateChildrenFromSolver(this.mSystem, Optimizer.flags);
            } else {
                updateFromSolver(this.mSystem);
                for (int i5 = 0; i5 < size; i5++) {
                    r11 = zAddChildrenToSolver;
                    this.mChildren.get(i5).updateFromSolver(this.mSystem);
                }
            }
            if (z7) {
                r11 = zAddChildrenToSolver;
                if (i3 >= 8 || !Optimizer.flags[2]) {
                    r11 = zAddChildrenToSolver;
                    r11 = zAddChildrenToSolver;
                    r11 = zAddChildrenToSolver;
                    r11 = zAddChildrenToSolver;
                    z = false;
                    z2 = z8;
                } else {
                    int iMax3 = 0;
                    int iMax4 = 0;
                    for (int i6 = 0; i6 < size; i6++) {
                        r11 = zAddChildrenToSolver;
                        ConstraintWidget constraintWidget2 = this.mChildren.get(i6);
                        iMax3 = Math.max(iMax3, constraintWidget2.f38mX + constraintWidget2.getWidth());
                        iMax4 = Math.max(iMax4, constraintWidget2.f39mY + constraintWidget2.getHeight());
                    }
                    r11 = zAddChildrenToSolver;
                    int iMax5 = Math.max(this.mMinWidth, iMax3);
                    int iMax6 = Math.max(this.mMinHeight, iMax4);
                    if (dimensionBehaviour2 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || getWidth() >= iMax5) {
                        z4 = false;
                        z5 = z8;
                    } else {
                        setWidth(iMax5);
                        this.mListDimensionBehaviors[0] = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        z4 = true;
                        z5 = true;
                    }
                    z = z4;
                    z2 = z5;
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && getHeight() < iMax6) {
                        z = z4;
                        z2 = z5;
                        setHeight(iMax6);
                        this.mListDimensionBehaviors[1] = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        z = true;
                        z2 = true;
                    }
                }
            } else {
                r11 = zAddChildrenToSolver;
                r11 = zAddChildrenToSolver;
                r11 = zAddChildrenToSolver;
                r11 = zAddChildrenToSolver;
                z = false;
                z2 = z8;
            }
            z = z4;
            z2 = z5;
            int iMax7 = Math.max(this.mMinWidth, getWidth());
            boolean z9 = z;
            boolean z10 = z2;
            if (iMax7 > getWidth()) {
                setWidth(iMax7);
                this.mListDimensionBehaviors[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                z9 = true;
                z10 = true;
            }
            int iMax8 = Math.max(this.mMinHeight, getHeight());
            if (iMax8 > getHeight()) {
                setHeight(iMax8);
                r12 = 1;
                this.mListDimensionBehaviors[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                r0 = 1;
                z3 = true;
            } else {
                r12 = 1;
            }
            if (z3) {
                r0 = z9;
                z3 = z10;
                r13 = r0;
            } else {
                r0 = z9;
                z3 = z10;
                if (this.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && iMax > 0) {
                    r0 = r0;
                    z3 = z3;
                    if (getWidth() > iMax) {
                        this.mWidthMeasuredTooSmall = r12;
                        this.mListDimensionBehaviors[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                        setWidth(iMax);
                        ?? r1 = r12;
                        z3 = r1 == true ? 1 : 0;
                        r0 = r1;
                    }
                }
                r0 = r0;
                r0 = r0;
                z3 = z3;
                z3 = z3;
                if (this.mListDimensionBehaviors[r12] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || iMax2 <= 0 || getHeight() <= iMax2) {
                    r0 = z9;
                    z3 = z10;
                    r13 = r0;
                } else {
                    this.mHeightMeasuredTooSmall = r12;
                    this.mListDimensionBehaviors[r12] = ConstraintWidget.DimensionBehaviour.FIXED;
                    setHeight(iMax2);
                    r13 = 1;
                    z3 = true;
                }
            }
            i2 = i3;
            r14 = r13;
            z8 = z3;
        }
        this.mChildren = arrayList;
        if (z8) {
            this.mListDimensionBehaviors[0] = dimensionBehaviour2;
            this.mListDimensionBehaviors[1] = dimensionBehaviour;
        }
        resetSolverVariables(this.mSystem.getCache());
    }

    public ArrayList<Guideline> getVerticalGuidelines() {
        ArrayList<Guideline> arrayList = new ArrayList<>();
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i);
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                if (guideline.getOrientation() == 1) {
                    arrayList.add(guideline);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<Guideline> getHorizontalGuidelines() {
        ArrayList<Guideline> arrayList = new ArrayList<>();
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i);
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                if (guideline.getOrientation() == 0) {
                    arrayList.add(guideline);
                }
            }
        }
        return arrayList;
    }

    public LinearSystem getSystem() {
        return this.mSystem;
    }

    private void resetChains() {
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
    }

    void addChain(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            addHorizontalChain(constraintWidget);
        } else if (i == 1) {
            addVerticalChain(constraintWidget);
        }
    }

    private void addHorizontalChain(ConstraintWidget constraintWidget) {
        int i = this.mHorizontalChainsSize + 1;
        ChainHead[] chainHeadArr = this.mHorizontalChainsArray;
        if (i >= chainHeadArr.length) {
            this.mHorizontalChainsArray = (ChainHead[]) Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
        }
        this.mHorizontalChainsArray[this.mHorizontalChainsSize] = new ChainHead(constraintWidget, 0, isRtl());
        this.mHorizontalChainsSize++;
    }

    private void addVerticalChain(ConstraintWidget constraintWidget) {
        int i = this.mVerticalChainsSize + 1;
        ChainHead[] chainHeadArr = this.mVerticalChainsArray;
        if (i >= chainHeadArr.length) {
            this.mVerticalChainsArray = (ChainHead[]) Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
        }
        this.mVerticalChainsArray[this.mVerticalChainsSize] = new ChainHead(constraintWidget, 1, isRtl());
        this.mVerticalChainsSize++;
    }
}
