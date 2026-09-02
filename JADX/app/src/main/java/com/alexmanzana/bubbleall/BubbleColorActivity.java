package com.alexmanzana.bubbleall;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.adapters.AdapterTheme;
import com.alexmanzana.bubbleall.listeners.ListenerTheme;
import com.alexmanzana.bubbleall.pojos.ItemTheme;
import com.alexmanzana.bubbleall.utils.AdBlock;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BubbleColorActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\u0007H\u0014J\b\u0010\r\u001a\u00020\u0007H\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m495d2 = {"Lcom/alexmanzana/bubbleall/BubbleColorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;", "()V", "adapterTheme", "Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;", "loadAd", "", "onClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "onSupportNavigateUp", "", "onTheme", "theme", "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;", "position", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class BubbleColorActivity extends AppCompatActivity implements ListenerTheme {
    private AdapterTheme adapterTheme;

    @Override // com.alexmanzana.bubbleall.listeners.ListenerTheme
    public void onClick() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C1106R.layout.activity_bubble_color);
        View viewFindViewById = findViewById(C1106R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        setSupportActionBar((MaterialToolbar) viewFindViewById);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        BubbleColorActivity bubbleColorActivity = this;
        this.adapterTheme = new AdapterTheme(bubbleColorActivity, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(C1106R.id.themesList);
        recyclerView.setLayoutManager(new LinearLayoutManager(bubbleColorActivity));
        AdapterTheme adapterTheme = this.adapterTheme;
        if (adapterTheme == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterTheme");
            adapterTheme = null;
        }
        recyclerView.setAdapter(adapterTheme);
        ((FloatingActionButton) findViewById(C1106R.id.buttonAddTheme)).setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.BubbleColorActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BubbleColorActivity.onCreate$lambda$0(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(BubbleColorActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) ThemeActivity.class));
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        AdapterTheme adapterTheme = this.adapterTheme;
        if (adapterTheme == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterTheme");
            adapterTheme = null;
        }
        adapterTheme.refresh();
        loadAd();
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        AdapterTheme adapterTheme = this.adapterTheme;
        if (adapterTheme == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterTheme");
            adapterTheme = null;
        }
        adapterTheme.clear();
    }

    @Override // com.alexmanzana.bubbleall.listeners.ListenerTheme
    public void onTheme(final ItemTheme theme, final int position) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(this);
        materialAlertDialogBuilder.setTitle(C1106R.string.text_delete_theme);
        materialAlertDialogBuilder.setMessage(C1106R.string.text_message_delete);
        materialAlertDialogBuilder.setPositiveButton(C1106R.string.text_accept, new DialogInterface.OnClickListener() { // from class: com.alexmanzana.bubbleall.BubbleColorActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BubbleColorActivity.onTheme$lambda$2(theme, this, position, dialogInterface, i);
            }
        });
        materialAlertDialogBuilder.setNegativeButton(C1106R.string.text_cancel, (DialogInterface.OnClickListener) null);
        materialAlertDialogBuilder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTheme$lambda$2(ItemTheme theme, BubbleColorActivity this$0, int i, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(theme, "$theme");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String uuid = theme.getUuid();
        if (uuid != null) {
            BubblePrefs.INSTANCE.delete(this$0, uuid);
            AdapterTheme adapterTheme = this$0.adapterTheme;
            if (adapterTheme == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapterTheme");
                adapterTheme = null;
            }
            adapterTheme.delete(i);
        }
    }
}
