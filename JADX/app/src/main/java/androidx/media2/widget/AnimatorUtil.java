package androidx.media2.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class AnimatorUtil {
    static ObjectAnimator ofTranslationY(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    static AnimatorSet ofTranslationYTogether(float f, float f2, View[] viewArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (viewArr.length == 0) {
            return animatorSet;
        }
        AnimatorSet.Builder builderPlay = animatorSet.play(ofTranslationY(f, f2, viewArr[0]));
        for (int i = 1; i < viewArr.length; i++) {
            builderPlay.with(ofTranslationY(f, f2, viewArr[i]));
        }
        return animatorSet;
    }

    private AnimatorUtil() {
    }
}
