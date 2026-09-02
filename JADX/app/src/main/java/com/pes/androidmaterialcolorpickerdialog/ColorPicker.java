package com.pes.androidmaterialcolorpickerdialog;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class ColorPicker extends Dialog implements SeekBar.OnSeekBarChangeListener {
    private final Activity activity;
    private int alpha;
    private SeekBar alphaSeekBar;
    private boolean autoclose;
    private int blue;
    private SeekBar blueSeekBar;
    private ColorPickerCallback callback;
    private View colorView;
    private int green;
    private SeekBar greenSeekBar;
    private EditText hexCode;
    private int red;
    private SeekBar redSeekBar;
    private boolean withAlpha;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ColorPicker(Activity activity) {
        super(activity);
        this.activity = activity;
        if (activity instanceof ColorPickerCallback) {
            this.callback = (ColorPickerCallback) activity;
        }
        this.alpha = 255;
        this.red = 0;
        this.green = 0;
        this.blue = 0;
        this.withAlpha = false;
        this.autoclose = false;
    }

    public ColorPicker(Activity activity, int i, int i2, int i3) {
        this(activity);
        this.red = ColorFormatHelper.assertColorValueInRange(i);
        this.green = ColorFormatHelper.assertColorValueInRange(i2);
        this.blue = ColorFormatHelper.assertColorValueInRange(i3);
    }

    public ColorPicker(Activity activity, int i, int i2, int i3, int i4) {
        this(activity);
        this.alpha = ColorFormatHelper.assertColorValueInRange(i);
        this.red = ColorFormatHelper.assertColorValueInRange(i2);
        this.green = ColorFormatHelper.assertColorValueInRange(i3);
        this.blue = ColorFormatHelper.assertColorValueInRange(i4);
        this.withAlpha = true;
    }

    public void enableAutoClose() {
        this.autoclose = true;
    }

    public void disableAutoClose() {
        this.autoclose = false;
    }

    public void setCallback(ColorPickerCallback colorPickerCallback) {
        this.callback = colorPickerCallback;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1607R.layout.materialcolorpicker__layout_color_picker);
        this.colorView = findViewById(C1607R.id.colorView);
        this.hexCode = (EditText) findViewById(C1607R.id.hexCode);
        this.alphaSeekBar = (SeekBar) findViewById(C1607R.id.alphaSeekBar);
        this.redSeekBar = (SeekBar) findViewById(C1607R.id.redSeekBar);
        this.greenSeekBar = (SeekBar) findViewById(C1607R.id.greenSeekBar);
        this.blueSeekBar = (SeekBar) findViewById(C1607R.id.blueSeekBar);
        this.alphaSeekBar.setOnSeekBarChangeListener(this);
        this.redSeekBar.setOnSeekBarChangeListener(this);
        this.greenSeekBar.setOnSeekBarChangeListener(this);
        this.blueSeekBar.setOnSeekBarChangeListener(this);
        EditText editText = this.hexCode;
        InputFilter[] inputFilterArr = new InputFilter[1];
        inputFilterArr[0] = new InputFilter.LengthFilter(this.withAlpha ? 8 : 6);
        editText.setFilters(inputFilterArr);
        this.hexCode.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.pes.androidmaterialcolorpickerdialog.ColorPicker.1
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 3 && i != 6 && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                ColorPicker.this.updateColorView(textView.getText().toString());
                ((InputMethodManager) ColorPicker.this.activity.getSystemService("input_method")).hideSoftInputFromWindow(ColorPicker.this.hexCode.getWindowToken(), 0);
                return true;
            }
        });
        ((Button) findViewById(C1607R.id.okColorButton)).setOnClickListener(new View.OnClickListener() { // from class: com.pes.androidmaterialcolorpickerdialog.ColorPicker.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ColorPicker.this.sendColor();
            }
        });
    }

    private void initUi() {
        String colorValues;
        this.colorView.setBackgroundColor(getColor());
        this.alphaSeekBar.setProgress(this.alpha);
        this.redSeekBar.setProgress(this.red);
        this.greenSeekBar.setProgress(this.green);
        this.blueSeekBar.setProgress(this.blue);
        if (!this.withAlpha) {
            this.alphaSeekBar.setVisibility(8);
        }
        EditText editText = this.hexCode;
        if (this.withAlpha) {
            colorValues = ColorFormatHelper.formatColorValues(this.alpha, this.red, this.green, this.blue);
        } else {
            colorValues = ColorFormatHelper.formatColorValues(this.red, this.green, this.blue);
        }
        editText.setText(colorValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendColor() {
        ColorPickerCallback colorPickerCallback = this.callback;
        if (colorPickerCallback != null) {
            colorPickerCallback.onColorChosen(getColor());
        }
        if (this.autoclose) {
            dismiss();
        }
    }

    public void setColor(int i) {
        this.alpha = Color.alpha(i);
        this.red = Color.red(i);
        this.green = Color.green(i);
        this.blue = Color.blue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateColorView(String str) {
        try {
            int color = Color.parseColor("#" + str);
            this.alpha = Color.alpha(color);
            this.red = Color.red(color);
            this.green = Color.green(color);
            this.blue = Color.blue(color);
            this.colorView.setBackgroundColor(getColor());
            this.alphaSeekBar.setProgress(this.alpha);
            this.redSeekBar.setProgress(this.red);
            this.greenSeekBar.setProgress(this.green);
            this.blueSeekBar.setProgress(this.blue);
        } catch (IllegalArgumentException unused) {
            this.hexCode.setError(this.activity.getResources().getText(C1607R.string.materialcolorpicker__errHex));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        String colorValues;
        if (seekBar.getId() == C1607R.id.alphaSeekBar) {
            this.alpha = i;
        } else if (seekBar.getId() == C1607R.id.redSeekBar) {
            this.red = i;
        } else if (seekBar.getId() == C1607R.id.greenSeekBar) {
            this.green = i;
        } else if (seekBar.getId() == C1607R.id.blueSeekBar) {
            this.blue = i;
        }
        this.colorView.setBackgroundColor(getColor());
        EditText editText = this.hexCode;
        if (this.withAlpha) {
            colorValues = ColorFormatHelper.formatColorValues(this.alpha, this.red, this.green, this.blue);
        } else {
            colorValues = ColorFormatHelper.formatColorValues(this.red, this.green, this.blue);
        }
        editText.setText(colorValues);
    }

    public int getAlpha() {
        return this.alpha;
    }

    public int getRed() {
        return this.red;
    }

    public int getGreen() {
        return this.green;
    }

    public int getBlue() {
        return this.blue;
    }

    public void setAlpha(int i) {
        this.alpha = i;
    }

    public void setRed(int i) {
        this.red = i;
    }

    public void setGreen(int i) {
        this.green = i;
    }

    public void setBlue(int i) {
        this.blue = i;
    }

    public void setAll(int i, int i2, int i3, int i4) {
        this.alpha = i;
        this.red = i2;
        this.green = i3;
        this.blue = i4;
    }

    public void setColors(int i, int i2, int i3) {
        this.red = i;
        this.green = i2;
        this.blue = i3;
    }

    public int getColor() {
        return this.withAlpha ? Color.argb(this.alpha, this.red, this.green, this.blue) : Color.rgb(this.red, this.green, this.blue);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        initUi();
    }
}
