.class final Lcom/alexmanzana/bubbleall/views/WebView$keyListener$1;
.super Ljava/lang/Object;
.source "WebView.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;

# instance fields
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/WebView;

# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/views/WebView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/WebView$keyListener$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    # the current Web tab, or nothing to type into
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/WebView$keyListener$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/WebView;->currentTab()Lcom/alexmanzana/bubbleall/views/Web;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-nez v2, :cond_1

    return-void

    :cond_1
    check-cast v1, Ljava/lang/String;

    # shift: uppercase every letter key label + tag while active
    const-string v2, "#shift"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/views/WebView$keyListener$1;->toggleShift()V

    return-void

    # ?123: swap letter rows and the number/symbol row
    :cond_2
    const-string v2, "#123"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2h

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/views/WebView$keyListener$1;->toggleSymbols()V

    return-void

    # hide: blur the field and dismiss the bar (like the system back gesture)
    :cond_2h
    const-string v2, "#hide"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/views/WebView$keyListener$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-virtual {v2}, Lcom/alexmanzana/bubbleall/views/WebView;->dismissKeyboardBar()V

    return-void

    :cond_3
    const-string v2, "#del"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/Web;->deleteText()V

    return-void

    :cond_4
    const-string v2, "#cr"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/Web;->enterText()V

    return-void

    :cond_5
    const-string v2, "#sp"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const-string v1, " "

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/views/Web;->insertText(Ljava/lang/String;)V

    return-void

    :cond_6
    const-string v2, "#paste"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    # paste: first clip item as text, if any
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "clipboard"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Landroid/content/ClipboardManager;

    if-nez v2, :cond_7

    return-void

    :cond_7
    check-cast v1, Landroid/content/ClipboardManager;

    invoke-virtual {v1}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Landroid/content/ClipData;->getItemCount()I

    move-result v2

    if-lez v2, :cond_8

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/ClipData$Item;->coerceToText(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_8

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/views/Web;->insertText(Ljava/lang/String;)V

    :cond_8
    return-void

    :cond_9
    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/views/Web;->insertText(Ljava/lang/String;)V

    return-void
.end method

.method private final toggleShift()V
    .locals 8

    # walk the bar: single-char letter keys flip between lower/upper case
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/WebView$keyListener$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/WebView;->getRootView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_end

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->keyboardBar:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_end

    # shift state flips with the shift key's own background highlight
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->keyboardShift:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_end

    invoke-virtual {v1}, Landroid/view/View;->isSelected()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    const/4 v1, 0x0

    :goto_rows
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v1, v3, :cond_end

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v4, v3, Landroid/view/ViewGroup;

    if-eqz v4, :next_row

    check-cast v3, Landroid/view/ViewGroup;

    const/4 v4, 0x0

    :goto_keys
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    if-ge v4, v5, :next_row

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    instance-of v6, v5, Landroid/widget/TextView;

    if-eqz v6, :next_key

    check-cast v5, Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->getTag()Ljava/lang/Object;

    move-result-object v6

    instance-of v6, v6, Ljava/lang/String;

    if-eqz v6, :next_key

    invoke-virtual {v5}, Landroid/widget/TextView;->getTag()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :next_key

    invoke-virtual {v5}, Landroid/widget/TextView;->getTag()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v2, :lower

    invoke-virtual {v6}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v6

    goto :set_tag

    :lower
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    :set_tag
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    check-cast v6, Ljava/lang/CharSequence;

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :next_key
    add-int/lit8 v4, v4, 0x1

    goto :goto_keys

    :next_row
    add-int/lit8 v1, v1, 0x1

    goto :goto_rows

    :cond_end
    return-void
.end method

.method private final toggleSymbols()V    .locals 5

    # swap letter rows with the number row and the symbol row
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/WebView$keyListener$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/WebView;->getRootView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_end

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->keyboardBar:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_end

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->keyboardNumRow:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_end

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    # the new visibility for both toggle rows
    if-eqz v2, :to_gone

    const/4 v3, 0x0

    goto :apply_num

    :to_gone
    const/16 v3, 0x8

    :apply_num
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->keyboardRow5:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :skip_r5

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    :skip_r5
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->keyboardRow7:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_end

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    # letter rows always flip opposite to the toggle rows
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->keyboardRow1:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :skip_r1

    if-eqz v3, :hide_r1

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    goto :skip_r1

    :hide_r1
    const/16 v4, 0x8

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    :skip_r1
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->keyboardRow2:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :skip_r2

    if-eqz v3, :hide_r2

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    goto :skip_r2

    :hide_r2
    const/16 v4, 0x8

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    :skip_r2
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->keyboardRow3:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_end

    if-eqz v3, :hide_r3

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    goto :cond_end

    :hide_r3
    const/16 v4, 0x8

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_end
    return-void
.end method
