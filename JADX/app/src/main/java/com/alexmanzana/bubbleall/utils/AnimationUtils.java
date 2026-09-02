package com.alexmanzana.bubbleall.utils;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimationUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\n"}, m495d2 = {"Lcom/alexmanzana/bubbleall/utils/AnimationUtils;", "Landroid/animation/Animator$AnimatorListener;", "()V", "onAnimationCancel", "", "p0", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public class AnimationUtils implements Animator.AnimatorListener {
    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
    }
}
