.class public Landroidx/media2/widget/Cea608CCParser$MutableBackgroundColorSpan;
.super Landroid/text/style/CharacterStyle;
.source "Cea608CCParser.java"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/widget/Cea608CCParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MutableBackgroundColorSpan"
.end annotation


# instance fields
.field private mColor:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    .line 412
    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    .line 413
    iput p1, p0, Landroidx/media2/widget/Cea608CCParser$MutableBackgroundColorSpan;->mColor:I

    return-void
.end method


# virtual methods
.method public getBackgroundColor()I
    .locals 1

    .line 421
    iget v0, p0, Landroidx/media2/widget/Cea608CCParser$MutableBackgroundColorSpan;->mColor:I

    return v0
.end method

.method public setBackgroundColor(I)V
    .locals 0

    .line 417
    iput p1, p0, Landroidx/media2/widget/Cea608CCParser$MutableBackgroundColorSpan;->mColor:I

    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 426
    iget v0, p0, Landroidx/media2/widget/Cea608CCParser$MutableBackgroundColorSpan;->mColor:I

    iput v0, p1, Landroid/text/TextPaint;->bgColor:I

    return-void
.end method
