.class Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker$1;
.super Ljava/lang/Object;
.source "ColorPicker.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;


# direct methods
.method constructor <init>(Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker$1;->this$0:Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x0

    if-eq p2, v0, :cond_1

    const/4 v0, 0x6

    if-eq p2, v0, :cond_1

    .line 172
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p2

    if-nez p2, :cond_0

    .line 173
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p2

    const/16 p3, 0x42

    if-ne p2, p3, :cond_0

    goto :goto_0

    :cond_0
    return v1

    .line 174
    :cond_1
    :goto_0
    iget-object p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker$1;->this$0:Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->access$000(Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;Ljava/lang/String;)V

    .line 175
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker$1;->this$0:Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;

    invoke-static {p1}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->access$100(Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;)Landroid/app/Activity;

    move-result-object p1

    const-string p2, "input_method"

    .line 176
    invoke-virtual {p1, p2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 177
    iget-object p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker$1;->this$0:Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;

    invoke-static {p2}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->access$200(Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;)Landroid/widget/EditText;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    const/4 p1, 0x1

    return p1
.end method
