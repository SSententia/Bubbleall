package com.alexmanzana.bubbleall.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebResourceResponse;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.okhttp.HttpUrl;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p006io.TextStreamsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: AdBlock.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m495d2 = {"Lcom/alexmanzana/bubbleall/utils/AdBlock;", "", "()V", "Companion", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class AdBlock {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HashSet<String> hosts = new HashSet<>();
    private static boolean isLoaded;

    /* JADX INFO: compiled from: AdBlock.kt */
    @Metadata(m494d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0005J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m495d2 = {"Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;", "", "()V", "hosts", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "interstitialUuid", "getInterstitialUuid", "()Ljava/lang/String;", "isLoaded", "", "createEmpty", "Landroid/webkit/WebResourceResponse;", "init", "", "context", "Landroid/content/Context;", "isAd", ImagesContract.URL, "isAdHost", "host", "removeAds", "removerAd", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getInterstitialUuid() {
            return "ca-app-pub-9845855639311944/9040458529";
        }

        public final boolean removerAd(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getSharedPreferences("bubble_data_prefs", 0).getBoolean("com.alexmanzana.bubbleall.BUY_ADS", false);
        }

        public final void removeAds(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("bubble_data_prefs", 0).edit();
            editorEdit.putBoolean("com.alexmanzana.bubbleall.BUY_ADS", true);
            editorEdit.apply();
        }

        public final void init(Context context) throws IOException {
            Intrinsics.checkNotNullParameter(context, "context");
            if (AdBlock.isLoaded) {
                return;
            }
            final InputStream inputStreamOpen = context.getAssets().open("serverlist.txt");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: com.alexmanzana.bubbleall.utils.AdBlock$Companion$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    AdBlock.Companion.init$lambda$1(inputStreamOpen);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void init$lambda$1(InputStream stream) throws IOException {
            Intrinsics.checkNotNullParameter(stream, "$stream");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
            Iterator<T> it = TextStreamsKt.readLines(bufferedReader).iterator();
            while (it.hasNext()) {
                AdBlock.hosts.add((String) it.next());
            }
            bufferedReader.close();
            stream.close();
            Companion companion = AdBlock.INSTANCE;
            AdBlock.isLoaded = true;
        }

        public final boolean isAd(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            HttpUrl httpUrl = HttpUrl.parse(url);
            String strHost = httpUrl != null ? httpUrl.host() : null;
            if (strHost == null) {
                strHost = "";
            }
            return isAdHost(strHost);
        }

        public final WebResourceResponse createEmpty() {
            byte[] bytes = "".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return new WebResourceResponse("text/plain", "utf-8", new ByteArrayInputStream(bytes));
        }

        private final boolean isAdHost(String host) {
            int iIndexOf$default;
            String str = host;
            if (str.length() == 0 || (iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ".", 0, false, 6, (Object) null)) < 0) {
                return false;
            }
            if (!AdBlock.hosts.contains(host)) {
                int i = iIndexOf$default + 1;
                if (i >= host.length()) {
                    return false;
                }
                String strSubstring = host.substring(i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                if (!isAdHost(strSubstring)) {
                    return false;
                }
            }
            return true;
        }
    }
}
