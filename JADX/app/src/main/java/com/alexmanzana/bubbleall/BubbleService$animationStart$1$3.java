package com.alexmanzana.bubbleall;

import android.animation.Animator;
import android.content.Intent;
import android.os.Handler;
import com.alexmanzana.bubbleall.utils.AnimationUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BubbleService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m495d2 = {"com/alexmanzana/bubbleall/BubbleService$animationStart$1$3", "Lcom/alexmanzana/bubbleall/utils/AnimationUtils;", "onAnimationEnd", "", "p0", "Landroid/animation/Animator;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class BubbleService$animationStart$1$3 extends AnimationUtils {
    final /* synthetic */ Intent $intent;
    final /* synthetic */ BubbleService this$0;

    BubbleService$animationStart$1$3(BubbleService bubbleService, Intent intent) {
        this.this$0 = bubbleService;
        this.$intent = intent;
    }

    @Override // com.alexmanzana.bubbleall.utils.AnimationUtils, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Handler handler = this.this$0.mHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
            handler = null;
        }
        final Intent intent = this.$intent;
        final BubbleService bubbleService = this.this$0;
        handler.postDelayed(new Runnable() { // from class: com.alexmanzana.bubbleall.BubbleService$animationStart$1$3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BubbleService$animationStart$1$3.onAnimationEnd$lambda$1(intent, bubbleService);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAnimationEnd$lambda$1(Intent intent, BubbleService this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (intent == null || !Intrinsics.areEqual(intent.getAction(), "com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE")) {
            return;
        }
        this$0.openManager();
    }
}
