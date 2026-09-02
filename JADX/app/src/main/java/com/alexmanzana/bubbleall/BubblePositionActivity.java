package com.alexmanzana.bubbleall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.alexmanzana.bubbleall.utils.AdBlock;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BubblePositionActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\u0007H\u0014J\b\u0010\f\u001a\u00020\u0007H\u0014R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\r"}, m495d2 = {"Lcom/alexmanzana/bubbleall/BubblePositionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "receiverData", "com/alexmanzana/bubbleall/BubblePositionActivity$receiverData$1", "Lcom/alexmanzana/bubbleall/BubblePositionActivity$receiverData$1;", "loadAd", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class BubblePositionActivity extends AppCompatActivity {
    private final BubblePositionActivity$receiverData$1 receiverData = new BroadcastReceiver() { // from class: com.alexmanzana.bubbleall.BubblePositionActivity$receiverData$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            TextView textView = (TextView) this.this$0.findViewById(C1106R.id.stateBubble);
            if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "com.alexmanzana.bubbleall.ACTION_START_ONLY_BUBBLE")) {
                SharedPreferences.Editor editorEdit = this.this$0.getSharedPreferences("bubble_data_prefs", 0).edit();
                String stringExtra = intent.getStringExtra("bubble_state");
                if (stringExtra == null) {
                    stringExtra = "up";
                }
                if (Intrinsics.areEqual(stringExtra, "up")) {
                    textView.setText(C1106R.string.text_move_bubble_2);
                    editorEdit.putInt("yBubble", intent.getIntExtra("yBubble", 200));
                    editorEdit.putInt("xBubble", intent.getIntExtra("xBubble", 0));
                    editorEdit.apply();
                    return;
                }
                if (Intrinsics.areEqual(stringExtra, "down")) {
                    textView.setText(C1106R.string.text_move_bubble_1);
                }
            }
        }
    };

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C1106R.layout.activity_bubble_position);
        ((FloatingActionButton) findViewById(C1106R.id.finishActivity)).setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.BubblePositionActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BubblePositionActivity.onCreate$lambda$0(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(BubblePositionActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
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
        loadAd();
        Intent intent = new Intent(this, (Class<?>) BubbleService.class);
        intent.setAction("com.alexmanzana.bubbleall.ACTION_START_ONLY_BUBBLE");
        startService(intent);
        registerReceiver(this.receiverData, new IntentFilter("com.alexmanzana.bubbleall.ACTION_START_ONLY_BUBBLE"));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        stopService(new Intent(this, (Class<?>) BubbleService.class));
    }
}
