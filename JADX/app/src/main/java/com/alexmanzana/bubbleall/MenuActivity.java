package com.alexmanzana.bubbleall;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexmanzana.bubbleall.adapters.AdapterAdd;
import com.alexmanzana.bubbleall.listeners.ListenerAdd;
import com.alexmanzana.bubbleall.pojos.ItemAdd;
import com.alexmanzana.bubbleall.utils.AdBlock;
import com.alexmanzana.bubbleall.utils.ShortcutPrefs;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MenuActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0014J\b\u0010\u0019\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m495d2 = {"Lcom/alexmanzana/bubbleall/MenuActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;", "()V", "adapter", "Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;", "list", "Ljava/util/ArrayList;", "Lcom/alexmanzana/bubbleall/pojos/ItemAdd;", "Lkotlin/collections/ArrayList;", "prefs", "Landroid/content/SharedPreferences;", "selectMenu", "", "loadAd", "", "onClick", "option", "position", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLong", "onResume", "onSupportNavigateUp", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class MenuActivity extends AppCompatActivity implements ListenerAdd {
    private AdapterAdd adapter;
    private final ArrayList<ItemAdd> list = new ArrayList<>();
    private SharedPreferences prefs;
    private boolean selectMenu;

    @Override // com.alexmanzana.bubbleall.listeners.ListenerAdd
    public void onLong(ItemAdd option, int position) {
        Intrinsics.checkNotNullParameter(option, "option");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C1106R.layout.activity_menu);
        View viewFindViewById = findViewById(C1106R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        setSupportActionBar((MaterialToolbar) viewFindViewById);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        SharedPreferences sharedPreferences = getSharedPreferences("bubble_data_prefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.prefs = sharedPreferences;
        ArrayList<ItemAdd> arrayList = this.list;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = getString(C1106R.string.text_web);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getString(C1106R.string.text_web_description);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        arrayList.add(new ItemAdd(string, string2, string3, C1106R.drawable.ic_web, null, 1));
        ArrayList<ItemAdd> arrayList2 = this.list;
        String string4 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
        String string5 = getString(C1106R.string.text_video);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = getString(C1106R.string.text_video_description);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        arrayList2.add(new ItemAdd(string4, string5, string6, C1106R.drawable.ic_baseline_video_24, null, 2));
        ArrayList<ItemAdd> arrayList3 = this.list;
        String string7 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
        String string8 = getString(C1106R.string.text_music);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        String string9 = getString(C1106R.string.text_music_description);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        arrayList3.add(new ItemAdd(string7, string8, string9, C1106R.drawable.ic_baseline_library_music_24, null, 3));
        boolean booleanExtra = getIntent().getBooleanExtra("select_menu", false);
        this.selectMenu = booleanExtra;
        AdapterAdd adapterAdd = null;
        if (booleanExtra) {
            this.list.addAll(ShortcutPrefs.INSTANCE.list(this));
            SharedPreferences sharedPreferences2 = this.prefs;
            if (sharedPreferences2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefs");
                sharedPreferences2 = null;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
            editorEdit.putInt("menu_option", -1);
            editorEdit.apply();
        } else {
            ArrayList<ItemAdd> arrayList4 = this.list;
            String string10 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string10, "toString(...)");
            String string11 = getString(C1106R.string.text_shortcuts);
            Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
            String string12 = getString(C1106R.string.text_shortcuts_description);
            Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
            arrayList4.add(new ItemAdd(string10, string11, string12, C1106R.drawable.ic_baseline_launch_24, null, 4));
        }
        MenuActivity menuActivity = this;
        AdapterAdd adapterAdd2 = new AdapterAdd(menuActivity, this);
        this.adapter = adapterAdd2;
        adapterAdd2.replaceList(this.list);
        View viewFindViewById2 = findViewById(C1106R.id.menuBubble);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        recyclerView.setLayoutManager(new LinearLayoutManager(menuActivity));
        AdapterAdd adapterAdd3 = this.adapter;
        if (adapterAdd3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            adapterAdd = adapterAdd3;
        }
        recyclerView.setAdapter(adapterAdd);
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

    @Override // com.alexmanzana.bubbleall.listeners.ListenerAdd
    public void onClick(ItemAdd option, int position) {
        Intrinsics.checkNotNullParameter(option, "option");
        if (this.selectMenu) {
            SharedPreferences sharedPreferences = this.prefs;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefs");
                sharedPreferences = null;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt("menu_option", position);
            editorEdit.apply();
            finish();
            return;
        }
        Intent intent = new Intent(this, (Class<?>) SettingsActivity.class);
        int resourceId = option.getResourceId();
        if (resourceId == 1) {
            intent.putExtra("position_settings", 1);
        } else if (resourceId == 2) {
            intent.putExtra("position_settings", 2);
        } else if (resourceId == 3) {
            intent.putExtra("position_settings", 3);
        } else if (resourceId == 4) {
            intent.putExtra("position_settings", 4);
        } else {
            intent.putExtra("position_settings", 0);
        }
        startActivity(intent);
    }
}
