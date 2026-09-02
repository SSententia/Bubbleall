package com.pes.androidmaterialcolorpickerdialog;

/* JADX INFO: loaded from: classes2.dex */
final class ColorFormatHelper {
    static int assertColorValueInRange(int i) {
        if (i < 0 || i > 255) {
            return 0;
        }
        return i;
    }

    ColorFormatHelper() {
    }

    static String formatColorValues(int i, int i2, int i3) {
        return String.format("%02X%02X%02X", Integer.valueOf(assertColorValueInRange(i)), Integer.valueOf(assertColorValueInRange(i2)), Integer.valueOf(assertColorValueInRange(i3)));
    }

    static String formatColorValues(int i, int i2, int i3, int i4) {
        return String.format("%02X%02X%02X%02X", Integer.valueOf(assertColorValueInRange(i)), Integer.valueOf(assertColorValueInRange(i2)), Integer.valueOf(assertColorValueInRange(i3)), Integer.valueOf(assertColorValueInRange(i4)));
    }
}
