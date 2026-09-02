package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.ArrayRow;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class Chain {
    private static final boolean DEBUG = false;

    Chain() {
    }

    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        if (i == 0) {
            i2 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i3 = 0;
        } else {
            i2 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            ChainHead chainHead = chainHeadArr[i4];
            chainHead.define();
            applyChainConstraints(constraintWidgetContainer, linearSystem, i, i3, chainHead);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:172:0x0305  */
    /* JADX WARN: Code duplicated, block: B:29:0x004a A[PHI: r8 r14
  0x004a: PHI (r8v4 boolean) = (r8v2 boolean), (r8v51 boolean) binds: [B:28:0x0048, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r14v4 boolean) = (r14v2 boolean), (r14v38 boolean) binds: [B:28:0x0048, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x004c A[PHI: r8 r14
  0x004c: PHI (r8v48 boolean) = (r8v2 boolean), (r8v51 boolean) binds: [B:28:0x0048, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r14v35 boolean) = (r14v2 boolean), (r14v38 boolean) binds: [B:28:0x0048, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r36v0, types: [androidx.constraintlayout.solver.LinearSystem] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [androidx.constraintlayout.solver.SolverVariable] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.constraintlayout.solver.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i, int i2, ChainHead chainHead) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        ?? r5;
        float f;
        int size;
        int i4;
        ConstraintWidget constraintWidget = chainHead.mFirst;
        ConstraintWidget constraintWidget2 = chainHead.mLast;
        ConstraintWidget constraintWidget3 = chainHead.mFirstVisibleWidget;
        ConstraintWidget constraintWidget4 = chainHead.mLastVisibleWidget;
        ConstraintWidget constraintWidget5 = chainHead.mHead;
        float f2 = chainHead.mTotalWeight;
        ConstraintWidget constraintWidget6 = chainHead.mFirstMatchConstraintWidget;
        ConstraintWidget constraintWidget7 = chainHead.mLastMatchConstraintWidget;
        boolean z4 = constraintWidgetContainer.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i == 0) {
            z = constraintWidget5.mHorizontalChainStyle == 0;
            z2 = constraintWidget5.mHorizontalChainStyle == 1;
            if (constraintWidget5.mHorizontalChainStyle == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z = constraintWidget5.mVerticalChainStyle == 0;
            z2 = constraintWidget5.mVerticalChainStyle == 1;
            if (constraintWidget5.mVerticalChainStyle == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        ?? r6 = constraintWidget;
        boolean z5 = z2;
        boolean z6 = z;
        boolean z7 = false;
        while (true) {
            Object obj = null;
            if (z7) {
                break;
            }
            ConstraintAnchor constraintAnchor3 = r6.mListAnchors[i2];
            int i5 = z3 ? 1 : 4;
            int margin = constraintAnchor3.getMargin();
            float f3 = f2;
            boolean z8 = z7;
            boolean z9 = r6.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && r6.mResolvedMatchConstraintDefault[i] == 0;
            if (constraintAnchor3.mTarget != null && r6 != constraintWidget) {
                margin += constraintAnchor3.mTarget.getMargin();
            }
            int i6 = margin;
            if (z3 && r6 != constraintWidget && r6 != constraintWidget3) {
                i5 = 5;
            }
            if (constraintAnchor3.mTarget != null) {
                if (r6 == constraintWidget3) {
                    linearSystem.addGreaterThan(constraintAnchor3.mSolverVariable, constraintAnchor3.mTarget.mSolverVariable, i6, 6);
                } else {
                    linearSystem.addGreaterThan(constraintAnchor3.mSolverVariable, constraintAnchor3.mTarget.mSolverVariable, i6, 8);
                }
                linearSystem.addEquality(constraintAnchor3.mSolverVariable, constraintAnchor3.mTarget.mSolverVariable, i6, (!z9 || z3) ? i5 : 5);
            } else {
                constraintWidget5 = constraintWidget5;
                z6 = z6;
            }
            if (z4) {
                if (r6.getVisibility() == 8 || r6.mListDimensionBehaviors[i] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4 = 0;
                } else {
                    i4 = 0;
                    linearSystem.addGreaterThan(r6.mListAnchors[i2 + 1].mSolverVariable, r6.mListAnchors[i2].mSolverVariable, 0, 5);
                }
                linearSystem.addGreaterThan(r6.mListAnchors[i2].mSolverVariable, constraintWidgetContainer.mListAnchors[i2].mSolverVariable, i4, 8);
            }
            ConstraintAnchor constraintAnchor4 = r6.mListAnchors[i2 + 1].mTarget;
            if (constraintAnchor4 != null) {
                ConstraintWidget constraintWidget8 = constraintAnchor4.mOwner;
                if (constraintWidget8.mListAnchors[i2].mTarget != null && constraintWidget8.mListAnchors[i2].mTarget.mOwner == r6) {
                    obj = constraintWidget8;
                }
            }
            if (obj != null) {
                r6 = obj;
                z7 = z8;
            } else {
                z7 = true;
            }
            z5 = z5;
            f2 = f3;
            z6 = z6;
            constraintWidget5 = constraintWidget5;
            r6 = r6;
        }
        ConstraintWidget constraintWidget9 = constraintWidget5;
        float f4 = f2;
        boolean z10 = z6;
        boolean z11 = z5;
        if (constraintWidget4 != null) {
            int i7 = i2 + 1;
            if (constraintWidget2.mListAnchors[i7].mTarget != null) {
                ConstraintAnchor constraintAnchor5 = constraintWidget4.mListAnchors[i7];
                if (constraintWidget4.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget4.mResolvedMatchConstraintDefault[i] == 0 && !z3 && constraintAnchor5.mTarget.mOwner == constraintWidgetContainer) {
                    linearSystem.addEquality(constraintAnchor5.mSolverVariable, constraintAnchor5.mTarget.mSolverVariable, -constraintAnchor5.getMargin(), 5);
                } else if (z3 && constraintAnchor5.mTarget.mOwner == constraintWidgetContainer) {
                    linearSystem.addEquality(constraintAnchor5.mSolverVariable, constraintAnchor5.mTarget.mSolverVariable, -constraintAnchor5.getMargin(), 4);
                }
                linearSystem.addLowerThan(constraintAnchor5.mSolverVariable, constraintWidget2.mListAnchors[i7].mTarget.mSolverVariable, -constraintAnchor5.getMargin(), 6);
            }
        }
        if (z4) {
            int i8 = i2 + 1;
            linearSystem.addGreaterThan(constraintWidgetContainer.mListAnchors[i8].mSolverVariable, constraintWidget2.mListAnchors[i8].mSolverVariable, constraintWidget2.mListAnchors[i8].getMargin(), 8);
        }
        ArrayList<ConstraintWidget> arrayList = chainHead.mWeightedMatchConstraintsWidgets;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f5 = (!chainHead.mHasUndefinedWeights || chainHead.mHasComplexMatchWeights) ? f4 : chainHead.mWidgetsMatchCount;
            float f6 = 0.0f;
            float f7 = 0.0f;
            ConstraintWidget constraintWidget10 = null;
            int i9 = 0;
            while (i9 < size) {
                ConstraintWidget constraintWidget11 = arrayList.get(i9);
                float f8 = constraintWidget11.mWeight[i];
                if (f8 < f6) {
                    if (chainHead.mHasComplexMatchWeights) {
                        linearSystem.addEquality(constraintWidget11.mListAnchors[i2 + 1].mSolverVariable, constraintWidget11.mListAnchors[i2].mSolverVariable, 0, 4);
                    } else {
                        f8 = 1.0f;
                        f6 = 0.0f;
                    }
                    arrayList = arrayList;
                    size = size;
                    i9++;
                    size = size;
                    arrayList = arrayList;
                    f6 = 0.0f;
                }
                if (f8 == f6) {
                    linearSystem.addEquality(constraintWidget11.mListAnchors[i2 + 1].mSolverVariable, constraintWidget11.mListAnchors[i2].mSolverVariable, 0, 8);
                    arrayList = arrayList;
                    size = size;
                } else {
                    if (constraintWidget10 != null) {
                        SolverVariable solverVariable5 = constraintWidget10.mListAnchors[i2].mSolverVariable;
                        int i10 = i2 + 1;
                        SolverVariable solverVariable6 = constraintWidget10.mListAnchors[i10].mSolverVariable;
                        SolverVariable solverVariable7 = constraintWidget11.mListAnchors[i2].mSolverVariable;
                        SolverVariable solverVariable8 = constraintWidget11.mListAnchors[i10].mSolverVariable;
                        ArrayRow arrayRowCreateRow = linearSystem.createRow();
                        arrayRowCreateRow.createRowEqualMatchDimensions(f7, f5, f8, solverVariable5, solverVariable6, solverVariable7, solverVariable8);
                        linearSystem.addConstraint(arrayRowCreateRow);
                    }
                    f7 = f8;
                    constraintWidget10 = constraintWidget11;
                }
                i9++;
                size = size;
                arrayList = arrayList;
                f6 = 0.0f;
            }
        }
        if (constraintWidget3 != null && (constraintWidget3 == constraintWidget4 || z3)) {
            ConstraintAnchor constraintAnchor6 = constraintWidget.mListAnchors[i2];
            int i11 = i2 + 1;
            ConstraintAnchor constraintAnchor7 = constraintWidget2.mListAnchors[i11];
            SolverVariable solverVariable9 = constraintAnchor6.mTarget != null ? constraintAnchor6.mTarget.mSolverVariable : null;
            SolverVariable solverVariable10 = constraintAnchor7.mTarget != null ? constraintAnchor7.mTarget.mSolverVariable : null;
            ConstraintAnchor constraintAnchor8 = constraintWidget3.mListAnchors[i2];
            ConstraintAnchor constraintAnchor9 = constraintWidget4.mListAnchors[i11];
            if (solverVariable9 != null && solverVariable10 != null) {
                if (i == 0) {
                    f = constraintWidget9.mHorizontalBiasPercent;
                } else {
                    f = constraintWidget9.mVerticalBiasPercent;
                }
                linearSystem.addCentering(constraintAnchor8.mSolverVariable, solverVariable9, constraintAnchor8.getMargin(), f, solverVariable10, constraintAnchor9.mSolverVariable, constraintAnchor9.getMargin(), 7);
            }
        } else if (!z10 || constraintWidget3 == null) {
            int i12 = 8;
            if (z11 && constraintWidget3 != null) {
                boolean z12 = chainHead.mWidgetsMatchCount > 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
                ConstraintWidget constraintWidget12 = constraintWidget3;
                ConstraintWidget constraintWidget13 = constraintWidget12;
                while (constraintWidget12 != null) {
                    ConstraintWidget constraintWidget14 = constraintWidget12.mNextChainWidget[i];
                    while (constraintWidget14 != null && constraintWidget14.getVisibility() == i12) {
                        constraintWidget14 = constraintWidget14.mNextChainWidget[i];
                    }
                    if (constraintWidget12 == constraintWidget3 || constraintWidget12 == constraintWidget4 || constraintWidget14 == null) {
                        constraintWidget13 = constraintWidget13;
                        i3 = i12;
                    } else {
                        ConstraintWidget constraintWidget15 = constraintWidget14 == constraintWidget4 ? null : constraintWidget14;
                        ConstraintAnchor constraintAnchor10 = constraintWidget12.mListAnchors[i2];
                        SolverVariable solverVariable11 = constraintAnchor10.mSolverVariable;
                        if (constraintAnchor10.mTarget != null) {
                            SolverVariable solverVariable12 = constraintAnchor10.mTarget.mSolverVariable;
                        }
                        int i13 = i2 + 1;
                        SolverVariable solverVariable13 = constraintWidget13.mListAnchors[i13].mSolverVariable;
                        int margin2 = constraintAnchor10.getMargin();
                        int margin3 = constraintWidget12.mListAnchors[i13].getMargin();
                        if (constraintWidget15 != null) {
                            constraintAnchor = constraintWidget15.mListAnchors[i2];
                            solverVariable = constraintAnchor.mSolverVariable;
                            solverVariable2 = constraintAnchor.mTarget != null ? constraintAnchor.mTarget.mSolverVariable : null;
                        } else {
                            constraintAnchor = constraintWidget4.mListAnchors[i2];
                            solverVariable = constraintAnchor != null ? constraintAnchor.mSolverVariable : null;
                            solverVariable2 = constraintWidget12.mListAnchors[i13].mSolverVariable;
                        }
                        if (constraintAnchor != null) {
                            margin3 += constraintAnchor.getMargin();
                        }
                        int i14 = margin3;
                        if (constraintWidget13 != null) {
                            margin2 += constraintWidget13.mListAnchors[i13].getMargin();
                        }
                        int i15 = margin2;
                        int i16 = z12 ? 8 : 4;
                        if (solverVariable11 == null || solverVariable13 == null || solverVariable == null || solverVariable2 == null) {
                            i3 = 8;
                        } else {
                            i3 = 8;
                            linearSystem.addCentering(solverVariable11, solverVariable13, i15, 0.5f, solverVariable, solverVariable2, i14, i16);
                        }
                        constraintWidget14 = constraintWidget15;
                    }
                    if (constraintWidget12.getVisibility() == i3) {
                        constraintWidget12 = constraintWidget13;
                    }
                    i12 = i3;
                    constraintWidget13 = constraintWidget12;
                    constraintWidget12 = constraintWidget14;
                }
                ConstraintAnchor constraintAnchor11 = constraintWidget3.mListAnchors[i2];
                ConstraintAnchor constraintAnchor12 = constraintWidget.mListAnchors[i2].mTarget;
                int i17 = i2 + 1;
                ConstraintAnchor constraintAnchor13 = constraintWidget4.mListAnchors[i17];
                ConstraintAnchor constraintAnchor14 = constraintWidget2.mListAnchors[i17].mTarget;
                if (constraintAnchor12 != null) {
                    if (constraintWidget3 != constraintWidget4) {
                        linearSystem.addEquality(constraintAnchor11.mSolverVariable, constraintAnchor12.mSolverVariable, constraintAnchor11.getMargin(), 5);
                    } else if (constraintAnchor14 != null) {
                        linearSystem.addCentering(constraintAnchor11.mSolverVariable, constraintAnchor12.mSolverVariable, constraintAnchor11.getMargin(), 0.5f, constraintAnchor13.mSolverVariable, constraintAnchor14.mSolverVariable, constraintAnchor13.getMargin(), 5);
                    }
                }
                if (constraintAnchor14 != null && constraintWidget3 != constraintWidget4) {
                    linearSystem.addEquality(constraintAnchor13.mSolverVariable, constraintAnchor14.mSolverVariable, -constraintAnchor13.getMargin(), 5);
                }
            }
        } else {
            boolean z13 = chainHead.mWidgetsMatchCount > 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
            ConstraintWidget constraintWidget16 = constraintWidget3;
            ConstraintWidget constraintWidget17 = constraintWidget16;
            while (constraintWidget16 != null) {
                ConstraintWidget constraintWidget18 = constraintWidget16.mNextChainWidget[i];
                while (constraintWidget18 != null && constraintWidget18.getVisibility() == 8) {
                    constraintWidget18 = constraintWidget18.mNextChainWidget[i];
                }
                if (constraintWidget18 != null || constraintWidget16 == constraintWidget4) {
                    ConstraintAnchor constraintAnchor15 = constraintWidget16.mListAnchors[i2];
                    SolverVariable solverVariable14 = constraintAnchor15.mSolverVariable;
                    SolverVariable solverVariable15 = constraintAnchor15.mTarget != null ? constraintAnchor15.mTarget.mSolverVariable : null;
                    if (constraintWidget17 != constraintWidget16) {
                        solverVariable15 = constraintWidget17.mListAnchors[i2 + 1].mSolverVariable;
                    } else if (constraintWidget16 == constraintWidget3 && constraintWidget17 == constraintWidget16) {
                        solverVariable15 = constraintWidget.mListAnchors[i2].mTarget != null ? constraintWidget.mListAnchors[i2].mTarget.mSolverVariable : null;
                    }
                    int margin4 = constraintAnchor15.getMargin();
                    int i18 = i2 + 1;
                    int margin5 = constraintWidget16.mListAnchors[i18].getMargin();
                    if (constraintWidget18 != null) {
                        constraintAnchor2 = constraintWidget18.mListAnchors[i2];
                        solverVariable3 = constraintAnchor2.mSolverVariable;
                        solverVariable4 = constraintWidget16.mListAnchors[i18].mSolverVariable;
                    } else {
                        constraintAnchor2 = constraintWidget2.mListAnchors[i18].mTarget;
                        solverVariable3 = constraintAnchor2 != null ? constraintAnchor2.mSolverVariable : null;
                        solverVariable4 = constraintWidget16.mListAnchors[i18].mSolverVariable;
                    }
                    if (constraintAnchor2 != null) {
                        margin5 += constraintAnchor2.getMargin();
                    }
                    if (constraintWidget17 != null) {
                        margin4 += constraintWidget17.mListAnchors[i18].getMargin();
                    }
                    if (solverVariable14 != null && solverVariable15 != null && solverVariable3 != null && solverVariable4 != null) {
                        if (constraintWidget16 == constraintWidget3) {
                            margin4 = constraintWidget3.mListAnchors[i2].getMargin();
                        }
                        linearSystem.addCentering(solverVariable14, solverVariable15, margin4, 0.5f, solverVariable3, solverVariable4, constraintWidget16 == constraintWidget4 ? constraintWidget4.mListAnchors[i18].getMargin() : margin5, z13 ? 8 : 5);
                    }
                }
                if (constraintWidget16.getVisibility() != 8) {
                    constraintWidget17 = constraintWidget16;
                }
                constraintWidget16 = constraintWidget18;
            }
        }
        if ((!z10 && !z11) || constraintWidget3 == null || constraintWidget3 == constraintWidget4) {
            return;
        }
        ConstraintAnchor constraintAnchor16 = constraintWidget3.mListAnchors[i2];
        int i19 = i2 + 1;
        ConstraintAnchor constraintAnchor17 = constraintWidget4.mListAnchors[i19];
        SolverVariable solverVariable16 = constraintAnchor16.mTarget != null ? constraintAnchor16.mTarget.mSolverVariable : null;
        SolverVariable solverVariable17 = constraintAnchor17.mTarget != null ? constraintAnchor17.mTarget.mSolverVariable : null;
        if (constraintWidget2 != constraintWidget4) {
            ConstraintAnchor constraintAnchor18 = constraintWidget2.mListAnchors[i19];
            r5 = constraintAnchor18.mTarget != null ? constraintAnchor18.mTarget.mSolverVariable : null;
        } else {
            r5 = solverVariable17;
        }
        if (constraintWidget3 == constraintWidget4) {
            constraintAnchor16 = constraintWidget3.mListAnchors[i2];
            constraintAnchor17 = constraintWidget3.mListAnchors[i19];
        }
        if (solverVariable16 == null || r5 == 0) {
            return;
        }
        int margin6 = constraintAnchor16.getMargin();
        if (constraintWidget4 != null) {
            constraintWidget2 = constraintWidget4;
        }
        linearSystem.addCentering(constraintAnchor16.mSolverVariable, solverVariable16, margin6, 0.5f, r5, constraintAnchor17.mSolverVariable, constraintWidget2.mListAnchors[i19].getMargin(), 5);
    }
}
