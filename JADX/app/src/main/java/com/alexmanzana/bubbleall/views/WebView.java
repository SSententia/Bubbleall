package com.alexmanzana.bubbleall.views;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.ShortcutActivity;
import com.alexmanzana.bubbleall.adapters.AdapterShortcut;
import com.alexmanzana.bubbleall.adapters.AdapterWebTab;
import com.alexmanzana.bubbleall.listeners.ListenerSuccess;
import com.alexmanzana.bubbleall.listeners.ListenerSwipe;
import com.alexmanzana.bubbleall.listeners.ListenerWeb;
import com.alexmanzana.bubbleall.listeners.ListenerWebTab;
import com.alexmanzana.bubbleall.pojos.ItemShortcut;
import com.alexmanzana.bubbleall.pojos.ItemWeb;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import com.alexmanzana.bubbleall.utils.WebTabsPrefs;
import com.alexmanzana.bubbleall.window.ButtonToolbar;
import com.alexmanzana.bubbleall.window.Panel;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WebView.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010%\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010'\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010)\u001a\u00020\u0015H\u0016J\b\u0010*\u001a\u00020\u0015H\u0002J\b\u0010+\u001a\u00020\u0015H\u0016J\b\u0010(\u001a\u00020\u0015H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m495d2 = {"Lcom/alexmanzana/bubbleall/views/WebView;", "Lcom/alexmanzana/bubbleall/window/Panel;", "Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;", "Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "addButton", "Ljava/lang/Runnable;", "currentWeb", "isOpenMenu", "", "mPrefs", "Landroid/content/SharedPreferences;", "menuButton", "tabsButton", "args", "", "item", "", "detectMenuView", "Landroid/view/View;", "finishMenu", "onBackPressed", "onCreate", "onDestroy", "onError", ImagesContract.URL, "", "onIcon", "icon", "Landroid/graphics/Bitmap;", "onLoaded", "onReceived", "onSelectUrl", "onTitle", "title", "pause", "savePages", "start", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class WebView extends Panel implements ListenerWeb, ListenerSuccess {
    private final Runnable addButton;
    private int currentWeb;
    private boolean isOpenMenu;
    private SharedPreferences mPrefs;
    private final Runnable menuButton;
    private final Runnable tabsButton;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void args(Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerWeb
    public void onError(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerWeb
    public void onSelectUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public /* synthetic */ WebView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentWeb = -1;
        this.menuButton = new Runnable() { // from class: com.alexmanzana.bubbleall.views.WebView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                WebView.menuButton$lambda$5(this.f$0, context);
            }
        };
        this.tabsButton = new Runnable() { // from class: com.alexmanzana.bubbleall.views.WebView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                WebView.tabsButton$lambda$6(this.f$0, context);
            }
        };
        this.addButton = new Runnable() { // from class: com.alexmanzana.bubbleall.views.WebView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                WebView.addButton$lambda$8(this.f$0, context);
            }
        };
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void onCreate() {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("bubble_data_prefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.mPrefs = sharedPreferences;
        if (PreferenceManager.getDefaultSharedPreferences(getContext()).getBoolean("key_save_pages", false)) {
            WebTabsPrefs.Companion companion = WebTabsPrefs.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            for (String str : companion.list(context)) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Web web = new Web(context2, null, 0, 6, null);
                addView(web, new FrameLayout.LayoutParams(-1, -1));
                web.setVisibility(8);
                web.setListener(this);
                web.loadUrl(str);
            }
            if (getChildCount() > 0) {
                int childCount = getChildCount() - 1;
                this.currentWeb = childCount;
                View childAt = getChildAt(childCount);
                childAt.setVisibility(0);
                childAt.requestFocus();
                return;
            }
            this.addButton.run();
            return;
        }
        this.addButton.run();
    }

    private final void title() {
        View childAt;
        int i = this.currentWeb;
        if (i == -1 || (childAt = getChildAt(i)) == null || !(childAt instanceof Web)) {
            return;
        }
        Web web = (Web) childAt;
        web.setVisibility(0);
        web.onResume();
        web.requestFocus();
        Object favicon = web.getFavicon();
        if (favicon == null) {
            favicon = Integer.valueOf(C1106R.drawable.ic_web);
        } else {
            Intrinsics.checkNotNull(favicon);
        }
        requestIconToolbar(favicon);
        String title = web.getTitle();
        if (title == null) {
            title = getContext().getString(C1106R.string.text_web);
        }
        Intrinsics.checkNotNull(title);
        requestTitle(title);
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void pause() {
        View childAt;
        int i = this.currentWeb;
        if (i != -1 && (childAt = getChildAt(i)) != null && (childAt instanceof Web)) {
            Web web = (Web) childAt;
            web.setVisibility(8);
            web.onPause();
        }
        finishList();
        finishMenu();
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void start() {
        int i = C1106R.drawable.ic_web;
        String string = getContext().getString(C1106R.string.text_web);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        requestToolbar(i, string);
        requestButtons(new ButtonToolbar(C1106R.drawable.ic_baseline_add_24, this.addButton), new ButtonToolbar(C1106R.drawable.ic_baseline_tab_24, this.tabsButton), new ButtonToolbar(C1106R.drawable.ic_baseline_more_vert_24, this.menuButton));
        finishMenu();
        title();
    }

    private final void finishMenu() {
        View childAt = getChildAt(getChildCount() - 1);
        if (childAt instanceof Web) {
            childAt = detectMenuView();
        }
        if (childAt != null) {
            removeView(childAt);
            this.isOpenMenu = false;
        }
    }

    private final View detectMenuView() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof Web)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void onBackPressed() {
        View childAt;
        int i = this.currentWeb;
        if (i == -1 || (childAt = getChildAt(i)) == null || !(childAt instanceof Web)) {
            return;
        }
        Web web = (Web) childAt;
        if (web.canGoBack()) {
            web.goBack();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void menuButton$lambda$5(WebView this$0, Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.finishList();
        if (this$0.isOpenMenu) {
            this$0.finishMenu();
            int i = this$0.currentWeb;
            if (i != -1) {
                View childAt = this$0.getChildAt(i);
                if (childAt instanceof Web) {
                    Web web = (Web) childAt;
                    web.onResume();
                    web.requestFocus();
                    web.setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        int i2 = this$0.currentWeb;
        if (i2 != -1) {
            View childAt2 = this$0.getChildAt(i2);
            if (childAt2 instanceof Web) {
                ArrayList<ItemShortcut> arrayListArrayListOf = CollectionsKt.arrayListOf(new ItemShortcut(C1106R.drawable.ic_web, null, C1106R.string.text_open), new ItemShortcut(C1106R.drawable.ic_baseline_refresh_24, null, C1106R.string.text_refresh), new ItemShortcut(C1106R.drawable.ic_baseline_content_copy_24, null, C1106R.string.text_copy), new ItemShortcut(C1106R.drawable.ic_baseline_share_24, null, C1106R.string.text_share), new ItemShortcut(C1106R.drawable.ic_baseline_launch_24, null, C1106R.string.text_to_shortcut));
                AdapterShortcut adapterShortcut = new AdapterShortcut(context, true);
                adapterShortcut.setListener(this$0);
                adapterShortcut.replaceList(arrayListArrayListOf);
                View viewInflate = LayoutInflater.from(context).inflate(C1106R.layout.layout_web_menu, (ViewGroup) this$0, false);
                viewInflate.setId(C1106R.id.contentSettings);
                this$0.addView(viewInflate);
                SwitchView switchView = (SwitchView) viewInflate.findViewById(C1106R.id.switchDesktop);
                RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C1106R.id.optionsMenuWeb);
                TextView textView = (TextView) viewInflate.findViewById(C1106R.id.textWeb);
                ImageView imageView = (ImageView) viewInflate.findViewById(C1106R.id.iconWeb);
                TextView textView2 = (TextView) viewInflate.findViewById(C1106R.id.urlWeb);
                recyclerView.setLayoutManager(new GridLayoutManager(context, 5));
                recyclerView.setAdapter(adapterShortcut);
                Web web2 = (Web) childAt2;
                textView.setText(web2.getTitle());
                textView2.setText(web2.getUrl());
                textView.setTextColor(BubblePrefs.INSTANCE.getInternalColors(context));
                textView2.setTextColor(BubblePrefs.INSTANCE.getInternalColors(context));
                switchView.attachWeb(web2);
                imageView.setImageBitmap(web2.getFavicon());
                web2.onPause();
                web2.setVisibility(8);
                this$0.isOpenMenu = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tabsButton$lambda$6(final WebView this$0, Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        if (this$0.finishList()) {
            return;
        }
        this$0.finishMenu();
        ArrayList arrayList = new ArrayList();
        int childCount = this$0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this$0.getChildAt(i);
            if (childAt instanceof Web) {
                Web web = (Web) childAt;
                String url = web.getUrl();
                if (url == null) {
                    url = "";
                }
                arrayList.add(new ItemWeb(url, web.getTitle(), web.getFavicon()));
            }
        }
        final AdapterWebTab adapterWebTab = new AdapterWebTab(new ListenerWebTab() { // from class: com.alexmanzana.bubbleall.views.WebView$tabsButton$1$adapter$1
            @Override // com.alexmanzana.bubbleall.listeners.ListenerWebTab
            public void onClick(int item) {
                this.this$0.pause();
                View childAt2 = this.this$0.getChildAt(item);
                if (childAt2 != null) {
                    WebView webView = this.this$0;
                    if (childAt2 instanceof Web) {
                        webView.currentWeb = item;
                        Web web2 = (Web) childAt2;
                        web2.setVisibility(0);
                        web2.onResume();
                        childAt2.requestFocus();
                    }
                }
                this.this$0.finishList();
            }

            @Override // com.alexmanzana.bubbleall.listeners.ListenerWebTab
            public void onRemove(int position, int newPosition) {
                this.this$0.removeViewAt(position);
                View childAt2 = this.this$0.getChildAt(newPosition);
                if (childAt2 != null) {
                    WebView webView = this.this$0;
                    if (childAt2 instanceof Web) {
                        webView.currentWeb = newPosition;
                        Web web2 = (Web) childAt2;
                        web2.setVisibility(0);
                        web2.onResume();
                        childAt2.requestFocus();
                    }
                }
            }
        }, arrayList, this$0.currentWeb);
        this$0.requestList(new LinearLayoutManager(context), adapterWebTab, new ListenerSwipe() { // from class: com.alexmanzana.bubbleall.views.WebView$tabsButton$1$1
            @Override // com.alexmanzana.bubbleall.listeners.ListenerSwipe
            public void onSwipe(int position) {
                adapterWebTab.remove(position);
            }

            @Override // com.alexmanzana.bubbleall.listeners.ListenerSwipe
            public boolean isSwipe(int position) {
                return position != this$0.currentWeb;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addButton$lambda$8(WebView this$0, Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.pause();
        this$0.finishList();
        this$0.finishMenu();
        Web web = new Web(context, null, 0, 6, null);
        this$0.addView(web, new FrameLayout.LayoutParams(-1, -1));
        this$0.currentWeb = this$0.getChildCount() - 1;
        web.setVisibility(0);
        web.setListener(this$0);
        this$0.requestToolbar(C1106R.drawable.ic_web, "");
        SharedPreferences sharedPreferences = this$0.mPrefs;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrefs");
            sharedPreferences = null;
        }
        String string = sharedPreferences.getString("page_web", null);
        String str = string;
        if (str == null || str.length() == 0) {
            web.loadUrl("https://google.com");
        } else {
            web.loadUrl(string);
        }
        web.requestFocus();
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerWeb
    public void onTitle(String title, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        View childAt = getChildAt(this.currentWeb);
        if (childAt != null && (childAt instanceof Web) && Intrinsics.areEqual(((Web) childAt).getUrl(), url)) {
            if (title == null) {
                title = getContext().getString(C1106R.string.text_web);
                Intrinsics.checkNotNullExpressionValue(title, "getString(...)");
            }
            if (this.isOpenMenu) {
                View viewDetectMenuView = detectMenuView();
                TextView textView = viewDetectMenuView != null ? (TextView) viewDetectMenuView.findViewById(C1106R.id.textWeb) : null;
                if (textView != null) {
                    textView.setText(title);
                }
            }
            requestTitle(title);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Integer] */
    @Override // com.alexmanzana.bubbleall.listeners.ListenerWeb
    public void onIcon(Bitmap icon, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        View childAt = getChildAt(this.currentWeb);
        if (childAt != null && (childAt instanceof Web) && Intrinsics.areEqual(((Web) childAt).getUrl(), url)) {
            if (this.isOpenMenu) {
                View viewDetectMenuView = detectMenuView();
                ImageView imageView = viewDetectMenuView != null ? (ImageView) viewDetectMenuView.findViewById(C1106R.id.iconWeb) : null;
                if (imageView != null) {
                    imageView.setImageBitmap(icon);
                }
            }
            if (icon == 0) {
                icon = Integer.valueOf(C1106R.drawable.ic_web);
            }
            requestIconToolbar(icon);
        }
    }

    @Override // com.alexmanzana.bubbleall.window.Panel
    public void onDestroy() {
        savePages();
        finishMenu();
        removeAllViews();
    }

    private final void savePages() {
        String url;
        if (PreferenceManager.getDefaultSharedPreferences(getContext()).getBoolean("key_save_pages", false)) {
            ArrayList<String> arrayList = new ArrayList<>();
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if ((childAt instanceof Web) && (url = ((Web) childAt).getUrl()) != null) {
                    arrayList.add(url);
                }
            }
            WebTabsPrefs.Companion companion = WebTabsPrefs.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            companion.addAll(context, arrayList);
        }
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerWeb
    public void onLoaded(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        finishList();
        finishMenu();
        View childAt = getChildAt(this.currentWeb);
        if (childAt == null || !(childAt instanceof Web)) {
            return;
        }
        Web web = (Web) childAt;
        web.onResume();
        web.setVisibility(0);
        childAt.requestFocus();
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerSuccess
    public void onReceived(Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View childAt = getChildAt(this.currentWeb);
        if (childAt != null) {
            finishMenu();
            if (childAt instanceof Web) {
                int iIntValue = ((Integer) item).intValue();
                if (iIntValue == 0) {
                    closeManager();
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((Web) childAt).getUrl())));
                } else if (iIntValue == 1) {
                    ((Web) childAt).reload();
                } else if (iIntValue == 2) {
                    Object systemService = getContext().getSystemService("clipboard");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("page_web", ((Web) childAt).getUrl()));
                    String string = getContext().getString(C1106R.string.text_copy_success);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    toast(string);
                } else if (iIntValue == 3) {
                    closeManager();
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", ((Web) childAt).getUrl());
                    Intent intentCreateChooser = Intent.createChooser(intent, getContext().getString(C1106R.string.text_share));
                    Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "createChooser(...)");
                    startActivity(intentCreateChooser);
                } else if (iIntValue == 4) {
                    if (PreferenceManager.getDefaultSharedPreferences(getContext()).getBoolean("key_save_access", false)) {
                        closeManager();
                        Intent intent2 = new Intent(getContext(), (Class<?>) ShortcutActivity.class);
                        intent2.setData(Uri.parse(((Web) childAt).getUrl()));
                        intent2.setAction("com.alexmanzana.bubbleall.Web.SAVE_ACCESS");
                        startActivity(intent2);
                    } else {
                        int i = C1106R.id.shortcutPanel;
                        Web web = (Web) childAt;
                        String url = web.getUrl();
                        if (url == null) {
                            url = "";
                        }
                        Intrinsics.checkNotNull(url);
                        Object favicon = web.getFavicon();
                        if (favicon == null) {
                            favicon = Integer.valueOf(C1106R.drawable.ic_web);
                        } else {
                            Intrinsics.checkNotNull(favicon);
                        }
                        argsOnPanel(i, url, favicon);
                    }
                }
                Web web2 = (Web) childAt;
                web2.onResume();
                web2.setVisibility(0);
                childAt.requestFocus();
            }
        }
    }
}
