package com.alexmanzana.bubbleall;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;

/* JADX INFO: compiled from: DynamicActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, m495d2 = {"Lcom/alexmanzana/bubbleall/DynamicActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class DynamicActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == 259207075 && action.equals("com.alexmanzana.bubbleall.ACTION_OPEN_MANAGER")) {
            sendBroadcast(new Intent("com.alexmanzana.bubbleall.ACTION_OPEN_MANAGER"));
        }
        finishAffinity();
    }
}
