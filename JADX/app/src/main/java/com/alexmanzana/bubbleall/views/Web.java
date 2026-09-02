package com.alexmanzana.bubbleall.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebViewClient;
import androidx.media2.session.MediaConstants;
import com.alexmanzana.bubbleall.listeners.ListenerWeb;
import com.alexmanzana.bubbleall.utils.AdBlock;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Web.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m495d2 = {"Lcom/alexmanzana/bubbleall/views/Web;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", MediaConstants.MEDIA_URI_QUERY_ID, "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isDesktop", "()Z", "setDesktop", "(Z)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;", "getListener", "()Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;", "setListener", "(Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;)V", "usingAd", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class Web extends android.webkit.WebView {
    private String id;
    private boolean isDesktop;
    private ListenerWeb listener;
    private final boolean usingAd;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Web(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Web(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ Web(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.id = "";
        setFocusable(true);
        setFocusableInTouchMode(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDisplayZoomControls(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowFileAccess(true);
        getSettings().setDomStorageEnabled(true);
        this.usingAd = !context.getSharedPreferences("bubble_data_prefs", 0).getBoolean("key_block_ad_main", false);
        setWebViewClient(new WebViewClient() { // from class: com.alexmanzana.bubbleall.views.Web.1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(android.webkit.WebView view, WebResourceRequest request) {
                String url = Web.this.getUrl();
                Intrinsics.checkNotNull(url);
                return !StringsKt.startsWith$default(url, "https://", false, 2, (Object) null);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(android.webkit.WebView view, String url) {
                ListenerWeb listener = Web.this.getListener();
                if (listener != null) {
                    if (url == null) {
                        url = "";
                    }
                    listener.onLoaded(url);
                }
                Web.this.loadUrl("javascript:");
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, WebResourceRequest request) {
                if (Web.this.usingAd) {
                    return super.shouldInterceptRequest(view, request);
                }
                if (AdBlock.INSTANCE.isAd(String.valueOf(request != null ? request.getUrl() : null))) {
                    return AdBlock.INSTANCE.createEmpty();
                }
                return super.shouldInterceptRequest(view, request);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(android.webkit.WebView view, WebResourceRequest request, WebResourceError error) {
                String url;
                ListenerWeb listener = Web.this.getListener();
                if (listener != null) {
                    if (view == null || (url = view.getUrl()) == null) {
                        url = "";
                    }
                    listener.onError(url);
                }
            }
        });
        setWebChromeClient(new WebChromeClient() { // from class: com.alexmanzana.bubbleall.views.Web.2
            @Override // android.webkit.WebChromeClient
            public void onReceivedIcon(android.webkit.WebView view, Bitmap icon) {
                String url;
                ListenerWeb listener = Web.this.getListener();
                if (listener != null) {
                    if (view == null || (url = view.getUrl()) == null) {
                        url = "";
                    }
                    listener.onIcon(icon, url);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(android.webkit.WebView view, String title) {
                String url;
                ListenerWeb listener = Web.this.getListener();
                if (listener != null) {
                    if (view == null || (url = view.getUrl()) == null) {
                        url = "";
                    }
                    listener.onTitle(title, url);
                }
            }
        });
    }

    @Override // android.view.View
    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final ListenerWeb getListener() {
        return this.listener;
    }

    public final void setListener(ListenerWeb listenerWeb) {
        this.listener = listenerWeb;
    }

    /* JADX INFO: renamed from: isDesktop, reason: from getter */
    public final boolean getIsDesktop() {
        return this.isDesktop;
    }

    public final void setDesktop(boolean z) {
        String userAgentString = getSettings().getUserAgentString();
        if (this.isDesktop) {
            userAgentString = null;
        } else {
            try {
                String userAgentString2 = getSettings().getUserAgentString();
                String userAgentString3 = getSettings().getUserAgentString();
                Intrinsics.checkNotNullExpressionValue(userAgentString3, "getUserAgentString(...)");
                Intrinsics.checkNotNull(userAgentString2);
                String strSubstring = userAgentString3.substring(StringsKt.indexOf$default((CharSequence) userAgentString2, "(", 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) userAgentString2, ")", 0, false, 6, (Object) null));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String userAgentString4 = getSettings().getUserAgentString();
                Intrinsics.checkNotNullExpressionValue(userAgentString4, "getUserAgentString(...)");
                userAgentString = StringsKt.replace$default(userAgentString4, strSubstring, "(X11; Linux x86_64)", false, 4, (Object) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.isDesktop = z;
        getSettings().setUserAgentString(userAgentString);
        getSettings().setUseWideViewPort(this.isDesktop);
        getSettings().setLoadWithOverviewMode(this.isDesktop);
        reload();
    }
}
