package com.alexmanzana.bubbleall.window;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ButtonToolbar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m495d2 = {"Lcom/alexmanzana/bubbleall/window/ButtonToolbar;", "", "resource", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/lang/Runnable;", "(ILjava/lang/Runnable;)V", "getListener", "()Ljava/lang/Runnable;", "setListener", "(Ljava/lang/Runnable;)V", "getResource", "()I", "setResource", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final /* data */ class ButtonToolbar {
    private Runnable listener;
    private int resource;

    public static /* synthetic */ ButtonToolbar copy$default(ButtonToolbar buttonToolbar, int i, Runnable runnable, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = buttonToolbar.resource;
        }
        if ((i2 & 2) != 0) {
            runnable = buttonToolbar.listener;
        }
        return buttonToolbar.copy(i, runnable);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResource() {
        return this.resource;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Runnable getListener() {
        return this.listener;
    }

    public final ButtonToolbar copy(int resource, Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return new ButtonToolbar(resource, listener);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonToolbar)) {
            return false;
        }
        ButtonToolbar buttonToolbar = (ButtonToolbar) other;
        return this.resource == buttonToolbar.resource && Intrinsics.areEqual(this.listener, buttonToolbar.listener);
    }

    public int hashCode() {
        return (this.resource * 31) + this.listener.hashCode();
    }

    public String toString() {
        return "ButtonToolbar(resource=" + this.resource + ", listener=" + this.listener + ')';
    }

    public ButtonToolbar(int i, Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.resource = i;
        this.listener = listener;
    }

    public final Runnable getListener() {
        return this.listener;
    }

    public final int getResource() {
        return this.resource;
    }

    public final void setListener(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "<set-?>");
        this.listener = runnable;
    }

    public final void setResource(int i) {
        this.resource = i;
    }
}
