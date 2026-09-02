package com.alexmanzana.bubbleall.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.utils.BubblePrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SwitchView.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m495d2 = {"Lcom/alexmanzana/bubbleall/views/SwitchView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "switchView", "Landroid/widget/Switch;", "textView", "Landroid/widget/TextView;", "attachWeb", "", "web", "Lcom/alexmanzana/bubbleall/views/Web;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class SwitchView extends RelativeLayout {
    private final Switch switchView;
    private final TextView textView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SwitchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        RelativeLayout.inflate(context, C1106R.layout.layout_switch, this);
        View viewFindViewById = findViewById(C1106R.id.switchView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        Switch r7 = (Switch) viewFindViewById;
        this.switchView = r7;
        View viewFindViewById2 = findViewById(C1106R.id.textView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        this.textView = textView;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1106R.styleable.SwitchView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                String string = typedArrayObtainStyledAttributes.getString(C1106R.styleable.SwitchView_text);
                string = string == null ? "" : string;
                Intrinsics.checkNotNull(string);
                boolean z = typedArrayObtainStyledAttributes.getBoolean(C1106R.styleable.SwitchView_checked, false);
                textView.setText(string);
                textView.setTextColor(BubblePrefs.INSTANCE.getInternalColors(context));
                r7.setChecked(z);
                ((RelativeLayout) findViewById(C1106R.id.layoutSwitch)).setOnClickListener(new View.OnClickListener() { // from class: com.alexmanzana.bubbleall.views.SwitchView$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SwitchView.lambda$1$lambda$0(this.f$0, view);
                    }
                });
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    static final void lambda$1$lambda$0(SwitchView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Switch r0 = this$0.switchView;
        r0.setChecked(!r0.isChecked());
    }

    public final void attachWeb(final Web web) {
        Intrinsics.checkNotNullParameter(web, "web");
        this.switchView.setChecked(web.getIsDesktop());
        this.switchView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.alexmanzana.bubbleall.views.SwitchView$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SwitchView.attachWeb$lambda$2(web, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachWeb$lambda$2(Web web, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(web, "$web");
        web.setDesktop(z);
    }
}
