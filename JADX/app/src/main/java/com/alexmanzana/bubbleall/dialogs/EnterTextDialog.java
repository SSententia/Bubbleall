package com.alexmanzana.bubbleall.dialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.listeners.ListenerSuccess;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EnterTextDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m495d2 = {"Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;", "", "title", "", "hint", "text", "", "capText", "", "isNumber", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;", "(IILjava/lang/String;ZZLcom/alexmanzana/bubbleall/listeners/ListenerSuccess;)V", "show", "", "context", "Landroid/content/Context;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class EnterTextDialog {
    private final boolean capText;
    private final int hint;
    private final boolean isNumber;
    private final ListenerSuccess listener;
    private final String text;
    private final int title;

    public EnterTextDialog(int i, int i2, String str, boolean z, boolean z2, ListenerSuccess listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.title = i;
        this.hint = i2;
        this.text = str;
        this.capText = z;
        this.isNumber = z2;
        this.listener = listener;
    }

    public final void show(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(context);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        View viewInflate = layoutInflaterFrom.inflate(C1106R.layout.layout_dialog_title, (ViewGroup) null, false);
        View viewInflate2 = layoutInflaterFrom.inflate(C1106R.layout.layout_dialog_edit, (ViewGroup) null, false);
        View viewFindViewById = viewInflate2.findViewById(C1106R.id.layoutEdit);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final EditText editText = (EditText) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(C1106R.id.titleLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((TextView) viewFindViewById2).setText(this.title);
        editText.setHint(this.hint);
        String str = this.text;
        if (str == null) {
            str = "";
        }
        editText.setText(str);
        if (this.isNumber) {
            editText.setInputType(2);
        } else if (this.capText) {
            editText.setInputType(16385);
        } else {
            editText.setInputType(1);
        }
        materialAlertDialogBuilder.setCustomTitle(viewInflate);
        materialAlertDialogBuilder.setView(viewInflate2);
        materialAlertDialogBuilder.setNegativeButton(C1106R.string.text_cancel, (DialogInterface.OnClickListener) null);
        materialAlertDialogBuilder.setPositiveButton(C1106R.string.text_accept, new DialogInterface.OnClickListener() { // from class: com.alexmanzana.bubbleall.dialogs.EnterTextDialog$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EnterTextDialog.show$lambda$0(this.f$0, editText, dialogInterface, i);
            }
        });
        AlertDialog alertDialogCreate = materialAlertDialogBuilder.create();
        Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
        alertDialogCreate.show();
        alertDialogCreate.getButton(-2).setAllCaps(false);
        alertDialogCreate.getButton(-1).setAllCaps(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(EnterTextDialog this$0, EditText editView, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(editView, "$editView");
        this$0.listener.onReceived(editView.getText().toString());
    }
}
