package com.alexmanzana.bubbleall;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.adapters.AdapterAdd;
import com.alexmanzana.bubbleall.dialogs.EnterTextDialog;
import com.alexmanzana.bubbleall.listeners.ListenerAdd;
import com.alexmanzana.bubbleall.listeners.ListenerSuccess;
import com.alexmanzana.bubbleall.pojos.ItemAdd;
import com.alexmanzana.bubbleall.utils.AdBlock;
import com.alexmanzana.bubbleall.utils.ShortcutPrefs;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: ShortcutActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u000e\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0012\u0010\u001d\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0012\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0018\u0010#\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0010\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0015H\u0014J\b\u0010(\u001a\u00020\tH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m495d2 = {"Lcom/alexmanzana/bubbleall/ShortcutActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;", "()V", "adapter", "Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;", "currentPosition", "", "edit", "", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "list", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemAdd;", "Lkotlin/collections/ArrayList;", "uriImage", "Landroid/net/Uri;", "cancelEdit", "", "loadAd", "loadToAddUrl", "s", "onBackPressed", "onClick", "option", "position", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onLong", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "onSupportNavigateUp", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class ShortcutActivity extends AppCompatActivity implements ListenerAdd {
    private AdapterAdd adapter;
    private int currentPosition;
    private boolean edit;
    private final ActivityResultLauncher<String> launcher;
    private final ArrayList<ItemAdd> list = new ArrayList<>();
    private Uri uriImage;

    public ShortcutActivity() {
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.GetContent(), new ActivityResultCallback() { // from class: com.alexmanzana.bubbleall.ShortcutActivity$$ExternalSyntheticLambda2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ShortcutActivity.launcher$lambda$1(this.f$0, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.launcher = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launcher$lambda$1(ShortcutActivity this$0, Uri uri) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (uri != null) {
            ((ImageView) this$0.findViewById(C1106R.id.editImage)).setVisibility(0);
            View viewFindViewById = this$0.findViewById(C1106R.id.imageSelected);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            ((ImageView) viewFindViewById).setImageURI(uri);
            this$0.uriImage = uri;
        }
    }

    private final void cancelEdit() {
        ((RelativeLayout) findViewById(C1106R.id.contentAccess)).setVisibility(0);
        ((LinearLayout) findViewById(C1106R.id.contentEditAccess)).setVisibility(8);
        this.edit = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C1106R.layout.activity_shortcuts);
        View viewFindViewById = findViewById(C1106R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        setSupportActionBar((MaterialToolbar) viewFindViewById);
        ((MaterialButton) findViewById(C1106R.id.cancelButton)).setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.ShortcutActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortcutActivity.onCreate$lambda$2(this.f$0, view);
            }
        });
        ((FrameLayout) findViewById(C1106R.id.selectImage)).setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.ShortcutActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortcutActivity.onCreate$lambda$3(this.f$0, view);
            }
        });
        ((MaterialButton) findViewById(C1106R.id.acceptButton)).setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.ShortcutActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortcutActivity.onCreate$lambda$5(this.f$0, view);
            }
        });
        ((FloatingActionButton) findViewById(C1106R.id.buttonAddAccess)).setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.ShortcutActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortcutActivity.onCreate$lambda$6(this.f$0, view);
            }
        });
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        list();
        Intent intent = getIntent();
        if (!Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.intent.action.VIEW")) {
            Intent intent2 = getIntent();
            if (!Intrinsics.areEqual(intent2 != null ? intent2.getAction() : null, "com.alexmanzana.bubbleall.Web.SAVE_ACCESS")) {
                return;
            }
        }
        Intent intent3 = getIntent();
        loadToAddUrl(String.valueOf(intent3 != null ? intent3.getData() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(ShortcutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancelEdit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(ShortcutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.launcher.launch("image/png");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$5(ShortcutActivity this$0, View view) {
        File file;
        String absolutePath;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ItemAdd itemAdd = this$0.list.get(this$0.currentPosition);
        Intrinsics.checkNotNullExpressionValue(itemAdd, "get(...)");
        ItemAdd itemAdd2 = itemAdd;
        View viewFindViewById = this$0.findViewById(C1106R.id.editName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextInputEditText textInputEditText = (TextInputEditText) viewFindViewById;
        Uri uri = this$0.uriImage;
        if (uri != null) {
            file = new File(this$0.getFilesDir(), UUID.randomUUID().toString() + ".png");
            BitmapFactory.decodeStream(this$0.getContentResolver().openInputStream(uri)).compress(Bitmap.CompressFormat.PNG, 50, new FileOutputStream(file.getAbsoluteFile()));
        } else {
            file = null;
        }
        ItemAdd itemAdd3 = new ItemAdd(itemAdd2.getId(), String.valueOf(textInputEditText.getText()), itemAdd2.getDescription(), 0, (file == null || (absolutePath = file.getAbsolutePath()) == null) ? itemAdd2.getResourceBitmap() : absolutePath, 0);
        ShortcutPrefs.INSTANCE.edit(this$0, itemAdd3);
        this$0.list.set(this$0.currentPosition, itemAdd3);
        AdapterAdd adapterAdd = this$0.adapter;
        if (adapterAdd != null) {
            adapterAdd.notifyItemChanged(this$0.currentPosition);
        }
        ((RelativeLayout) this$0.findViewById(C1106R.id.contentAccess)).setVisibility(0);
        ((LinearLayout) this$0.findViewById(C1106R.id.contentEditAccess)).setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6(final ShortcutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new EnterTextDialog(C1106R.string.text_shortcut_new, C1106R.string.text_url, null, false, false, new ListenerSuccess() { // from class: com.alexmanzana.bubbleall.ShortcutActivity$onCreate$4$dialog$1
            @Override // com.alexmanzana.bubbleall.listeners.ListenerSuccess
            public void onReceived(Object item) {
                Intrinsics.checkNotNullParameter(item, "item");
                String str = (String) item;
                if (StringsKt.startsWith$default(str, "http", false, 2, (Object) null)) {
                    this.this$0.loadToAddUrl(str);
                    return;
                }
                this.this$0.loadToAddUrl("https://" + str);
            }
        }).show(this$0);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        loadAd();
    }

    private final void loadAd() {
        View viewFindViewById = findViewById(C1106R.id.adBanner);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        AdView adView = (AdView) viewFindViewById;
        if (!AdBlock.INSTANCE.removerAd(this)) {
            adView.loadAd(new AdRequest.Builder().build());
        } else {
            adView.setVisibility(8);
        }
    }

    private final void list() {
        View viewFindViewById = findViewById(C1106R.id.menuAccess);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        ShortcutActivity shortcutActivity = this;
        this.list.addAll(ShortcutPrefs.INSTANCE.list(shortcutActivity));
        AdapterAdd adapterAdd = new AdapterAdd(shortcutActivity, this);
        this.adapter = adapterAdd;
        adapterAdd.replaceList(this.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(shortcutActivity));
        recyclerView.setAdapter(this.adapter);
        ((TextView) findViewById(C1106R.id.textListEmpty)).setVisibility(8);
        recyclerView.setVisibility(8);
        if (this.list.isEmpty()) {
            ((TextView) findViewById(C1106R.id.textListEmpty)).setVisibility(0);
        } else {
            recyclerView.setVisibility(0);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1106R.menu.activity_shortcuts, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C1106R.id.refreshAccess) {
            new Thread(new Runnable() { // from class: com.alexmanzana.bubbleall.ShortcutActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ShortcutActivity.onOptionsItemSelected$lambda$9(this.f$0);
                }
            }).start();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onOptionsItemSelected$lambda$9(final ShortcutActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (ItemAdd itemAdd : this$0.list) {
            itemAdd.setDescription(itemAdd.getId());
            ShortcutPrefs.INSTANCE.edit(this$0, itemAdd);
        }
        this$0.runOnUiThread(new Runnable() { // from class: com.alexmanzana.bubbleall.ShortcutActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ShortcutActivity.onOptionsItemSelected$lambda$9$lambda$8(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onOptionsItemSelected$lambda$9$lambda$8(ShortcutActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AdapterAdd adapterAdd = this$0.adapter;
        if (adapterAdd != null) {
            adapterAdd.notifyItemRangeChanged(0, this$0.list.size());
        }
        Snackbar.make(this$0.findViewById(C1106R.id.contentActivity), C1106R.string.text_success_shortcut, -1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadToAddUrl(final String s) {
        if (Patterns.WEB_URL.matcher(s).matches() && StringsKt.startsWith$default(s, "https://", false, 2, (Object) null)) {
            ShortcutActivity shortcutActivity = this;
            if (!ShortcutPrefs.INSTANCE.exists(shortcutActivity, s)) {
                ((RelativeLayout) findViewById(C1106R.id.contentActivity)).setVisibility(8);
                ((ProgressBar) findViewById(C1106R.id.progressAccess)).setVisibility(0);
                WebView webView = new WebView(shortcutActivity);
                webView.setWebViewClient(new WebViewClient() { // from class: com.alexmanzana.bubbleall.ShortcutActivity.loadToAddUrl.1
                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                        ((RelativeLayout) ShortcutActivity.this.findViewById(C1106R.id.contentActivity)).setVisibility(0);
                        ((ProgressBar) ShortcutActivity.this.findViewById(C1106R.id.progressAccess)).setVisibility(8);
                        Snackbar.make(ShortcutActivity.this.findViewById(C1106R.id.contentActivity), C1106R.string.text_error_load_shortcut, -1).show();
                    }
                });
                webView.setWebChromeClient(new WebChromeClient() { // from class: com.alexmanzana.bubbleall.ShortcutActivity.loadToAddUrl.2
                    @Override // android.webkit.WebChromeClient
                    public void onReceivedIcon(WebView view, Bitmap icon) {
                        String title;
                        Context applicationContext;
                        ((TextView) ShortcutActivity.this.findViewById(C1106R.id.textListEmpty)).setVisibility(8);
                        ((RecyclerView) ShortcutActivity.this.findViewById(C1106R.id.menuAccess)).setVisibility(0);
                        ((RelativeLayout) ShortcutActivity.this.findViewById(C1106R.id.contentActivity)).setVisibility(0);
                        ((ProgressBar) ShortcutActivity.this.findViewById(C1106R.id.progressAccess)).setVisibility(8);
                        File file = new File(ShortcutActivity.this.getFilesDir(), UUID.randomUUID().toString() + ".png");
                        if (icon != null) {
                            icon.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(file));
                        }
                        String lowerCase = s.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (view == null || (title = view.getTitle()) == null) {
                            title = "";
                        }
                        ItemAdd itemAdd = new ItemAdd(lowerCase, title, s, 0, file.getAbsolutePath(), 0);
                        ShortcutPrefs.Companion companion = ShortcutPrefs.INSTANCE;
                        if (view == null || (applicationContext = view.getContext()) == null) {
                            applicationContext = ShortcutActivity.this.getApplicationContext();
                        }
                        Intrinsics.checkNotNull(applicationContext);
                        companion.add(applicationContext, itemAdd);
                        ShortcutActivity.this.list.add(itemAdd);
                        AdapterAdd adapterAdd = ShortcutActivity.this.adapter;
                        if (adapterAdd != null) {
                            adapterAdd.notifyItemInserted(ShortcutActivity.this.list.size() - 1);
                        }
                    }
                });
                webView.loadUrl(s);
                return;
            }
        }
        ShortcutActivity shortcutActivity2 = this;
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(shortcutActivity2);
        materialAlertDialogBuilder.setTitle(C1106R.string.text_title_invalid_url);
        if (ShortcutPrefs.INSTANCE.exists(shortcutActivity2, s)) {
            materialAlertDialogBuilder.setMessage(C1106R.string.text_message_exists_url);
        } else if (StringsKt.startsWith$default(s, "http", false, 2, (Object) null)) {
            materialAlertDialogBuilder.setMessage(C1106R.string.text_message_invalid_url_https);
        } else {
            materialAlertDialogBuilder.setMessage(C1106R.string.text_message_invalid_url);
        }
        materialAlertDialogBuilder.setPositiveButton(C1106R.string.text_accept, (DialogInterface.OnClickListener) null);
        materialAlertDialogBuilder.show();
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerAdd
    public void onLong(final ItemAdd option, final int position) {
        Intrinsics.checkNotNullParameter(option, "option");
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(this);
        materialAlertDialogBuilder.setTitle(C1106R.string.text_delete);
        materialAlertDialogBuilder.setMessage(C1106R.string.text_message_delete);
        materialAlertDialogBuilder.setPositiveButton(C1106R.string.text_accept, new DialogInterface.OnClickListener() { // from class: com.alexmanzana.bubbleall.ShortcutActivity$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ShortcutActivity.onLong$lambda$10(this.f$0, option, position, dialogInterface, i);
            }
        });
        materialAlertDialogBuilder.setNegativeButton(C1106R.string.text_cancel, (DialogInterface.OnClickListener) null);
        materialAlertDialogBuilder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLong$lambda$10(ShortcutActivity this$0, ItemAdd option, int i, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(option, "$option");
        ShortcutPrefs.INSTANCE.delete(this$0, option.getId());
        this$0.list.remove(i);
        AdapterAdd adapterAdd = this$0.adapter;
        if (adapterAdd != null) {
            adapterAdd.notifyItemRemoved(i);
        }
        AdapterAdd adapterAdd2 = this$0.adapter;
        if (adapterAdd2 != null) {
            adapterAdd2.notifyItemRangeChanged(i, this$0.list.size());
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.edit) {
            cancelEdit();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerAdd
    public void onClick(ItemAdd option, int position) {
        Intrinsics.checkNotNullParameter(option, "option");
        this.currentPosition = position;
        this.edit = true;
        ((RelativeLayout) findViewById(C1106R.id.contentAccess)).setVisibility(8);
        ((LinearLayout) findViewById(C1106R.id.contentEditAccess)).setVisibility(0);
        View viewFindViewById = findViewById(C1106R.id.editName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = findViewById(C1106R.id.imageSelected);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((TextInputEditText) viewFindViewById).setText(option.getName());
        ((ImageView) viewFindViewById2).setImageBitmap(BitmapFactory.decodeFile(option.getResourceBitmap()));
    }
}
