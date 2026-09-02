package com.alexmanzana.bubbleall;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.alexmanzana.bubbleall.utils.AdBlock;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SettingsActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m495d2 = {"Lcom/alexmanzana/bubbleall/SettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "loadAd", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onSupportNavigateUp", "", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class SettingsActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C1106R.layout.activity_settings);
        View viewFindViewById = findViewById(C1106R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        setSupportActionBar((MaterialToolbar) viewFindViewById);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        int intExtra = getIntent().getIntExtra("position_settings", 0);
        if (intExtra == 1) {
            getSupportFragmentManager().beginTransaction().replace(C1106R.id.contentSettings, new Settings.Web()).commit();
            return;
        }
        if (intExtra == 2) {
            getSupportFragmentManager().beginTransaction().replace(C1106R.id.contentSettings, new Settings.Video()).commit();
            return;
        }
        if (intExtra == 3) {
            getSupportFragmentManager().beginTransaction().replace(C1106R.id.contentSettings, new Settings.Music()).commit();
        } else if (intExtra == 4) {
            getSupportFragmentManager().beginTransaction().replace(C1106R.id.contentSettings, new Settings.Shortcuts()).commit();
        } else {
            getSupportFragmentManager().beginTransaction().replace(C1106R.id.contentSettings, new Settings.Main()).commit();
        }
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

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
