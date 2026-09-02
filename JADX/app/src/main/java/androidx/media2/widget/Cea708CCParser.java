package androidx.media2.widget;

import android.graphics.Color;
import android.util.Log;
import com.bumptech.glide.load.Key;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
class Cea708CCParser {
    public static final int CAPTION_EMIT_TYPE_BUFFER = 1;
    public static final int CAPTION_EMIT_TYPE_COMMAND_CLW = 4;
    public static final int CAPTION_EMIT_TYPE_COMMAND_CWX = 3;
    public static final int CAPTION_EMIT_TYPE_COMMAND_DFX = 16;
    public static final int CAPTION_EMIT_TYPE_COMMAND_DLC = 10;
    public static final int CAPTION_EMIT_TYPE_COMMAND_DLW = 8;
    public static final int CAPTION_EMIT_TYPE_COMMAND_DLY = 9;
    public static final int CAPTION_EMIT_TYPE_COMMAND_DSW = 5;
    public static final int CAPTION_EMIT_TYPE_COMMAND_HDW = 6;
    public static final int CAPTION_EMIT_TYPE_COMMAND_RST = 11;
    public static final int CAPTION_EMIT_TYPE_COMMAND_SPA = 12;
    public static final int CAPTION_EMIT_TYPE_COMMAND_SPC = 13;
    public static final int CAPTION_EMIT_TYPE_COMMAND_SPL = 14;
    public static final int CAPTION_EMIT_TYPE_COMMAND_SWA = 15;
    public static final int CAPTION_EMIT_TYPE_COMMAND_TGW = 7;
    public static final int CAPTION_EMIT_TYPE_CONTROL = 2;
    private static final boolean DEBUG = false;
    private static final String MUSIC_NOTE_CHAR = new String("♫".getBytes(Charset.forName(Key.STRING_CHARSET_NAME)), Charset.forName(Key.STRING_CHARSET_NAME));
    private static final String TAG = "Cea708CCParser";
    private final StringBuilder mBuilder = new StringBuilder();
    private DisplayListener mListener;

    interface DisplayListener {
        void emitEvent(CaptionEvent captionEvent);
    }

    private int parseC2(int i, int i2) {
        if (i >= 0 && i <= 7) {
            return i2;
        }
        if (i >= 8 && i <= 15) {
            return i2 + 1;
        }
        if (i < 16 || i > 23) {
            return (i < 24 || i > 31) ? i2 : i2 + 3;
        }
        return i2 + 2;
    }

    private int parseC3(int i, int i2) {
        if (i < 128 || i > 135) {
            return (i < 136 || i > 143) ? i2 : i2 + 5;
        }
        return i2 + 4;
    }

    private void parseG2(int i) {
    }

    private void parseG3(int i) {
    }

    Cea708CCParser(DisplayListener displayListener) {
        this.mListener = new DisplayListener() { // from class: androidx.media2.widget.Cea708CCParser.1
            @Override // androidx.media2.widget.Cea708CCParser.DisplayListener
            public void emitEvent(CaptionEvent captionEvent) {
            }
        };
        if (displayListener != null) {
            this.mListener = displayListener;
        }
    }

    private void emitCaptionEvent(CaptionEvent captionEvent) {
        emitCaptionBuffer();
        this.mListener.emitEvent(captionEvent);
    }

    private void emitCaptionBuffer() {
        if (this.mBuilder.length() > 0) {
            this.mListener.emitEvent(new CaptionEvent(1, this.mBuilder.toString()));
            this.mBuilder.setLength(0);
        }
    }

    public void parse(byte[] bArr) {
        int serviceBlockData = 0;
        while (serviceBlockData < bArr.length) {
            serviceBlockData = parseServiceBlockData(bArr, serviceBlockData);
        }
        emitCaptionBuffer();
    }

    private int parseServiceBlockData(byte[] bArr, int i) {
        int i2 = bArr[i] & UByte.MAX_VALUE;
        int i3 = i + 1;
        if (i2 == 16) {
            return parseExt1(bArr, i3);
        }
        if (i2 >= 0 && i2 <= 31) {
            return parseC0(i2, bArr, i3);
        }
        if (i2 >= 128 && i2 <= 159) {
            return parseC1(i2, bArr, i3);
        }
        if (i2 >= 32 && i2 <= 127) {
            parseG0(i2);
            return i3;
        }
        if (i2 < 160 || i2 > 255) {
            return i3;
        }
        parseG1(i2);
        return i3;
    }

    private int parseC0(int i, byte[] bArr, int i2) {
        if (i >= 24 && i <= 31) {
            if (i == 24) {
                try {
                    if (bArr[i2] == 0) {
                        this.mBuilder.append((char) bArr[i2 + 1]);
                    } else {
                        this.mBuilder.append(new String(Arrays.copyOfRange(bArr, i2, i2 + 2), "EUC-KR"));
                    }
                } catch (UnsupportedEncodingException e) {
                    Log.e(TAG, "P16 Code - Could not find supported encoding", e);
                }
            }
            return i2 + 2;
        }
        if (i >= 16 && i <= 23) {
            return i2 + 1;
        }
        if (i != 3 && i != 8) {
            switch (i) {
                case 12:
                case 14:
                    break;
                case 13:
                    this.mBuilder.append('\n');
                    return i2;
                default:
                    return i2;
            }
        }
        emitCaptionEvent(new CaptionEvent(2, Character.valueOf((char) i)));
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseC1(int i, byte[] bArr, int i2) {
        int i3;
        switch (i) {
            case 128:
            case Const.CODE_C1_CW1 /* 129 */:
            case Const.CODE_C1_CW2 /* 130 */:
            case Const.CODE_C1_CW3 /* 131 */:
            case Const.CODE_C1_CW4 /* 132 */:
            case Const.CODE_C1_CW5 /* 133 */:
            case Const.CODE_C1_CW6 /* 134 */:
            case 135:
                emitCaptionEvent(new CaptionEvent(3, Integer.valueOf(i - 128)));
                return i2;
            case 136:
                int i4 = i2 + 1;
                emitCaptionEvent(new CaptionEvent(4, Integer.valueOf(bArr[i2] & UByte.MAX_VALUE)));
                return i4;
            case Const.CODE_C1_DSW /* 137 */:
                int i5 = i2 + 1;
                emitCaptionEvent(new CaptionEvent(5, Integer.valueOf(bArr[i2] & UByte.MAX_VALUE)));
                return i5;
            case Const.CODE_C1_HDW /* 138 */:
                int i6 = i2 + 1;
                emitCaptionEvent(new CaptionEvent(6, Integer.valueOf(bArr[i2] & UByte.MAX_VALUE)));
                return i6;
            case Const.CODE_C1_TGW /* 139 */:
                int i7 = i2 + 1;
                emitCaptionEvent(new CaptionEvent(7, Integer.valueOf(bArr[i2] & UByte.MAX_VALUE)));
                return i7;
            case Const.CODE_C1_DLW /* 140 */:
                int i8 = i2 + 1;
                emitCaptionEvent(new CaptionEvent(8, Integer.valueOf(bArr[i2] & UByte.MAX_VALUE)));
                return i8;
            case Const.CODE_C1_DLY /* 141 */:
                int i9 = i2 + 1;
                emitCaptionEvent(new CaptionEvent(9, Integer.valueOf(bArr[i2] & UByte.MAX_VALUE)));
                return i9;
            case Const.CODE_C1_DLC /* 142 */:
                emitCaptionEvent(new CaptionEvent(10, null));
                return i2;
            case 143:
                emitCaptionEvent(new CaptionEvent(11, null));
                return i2;
            case Const.CODE_C1_SPA /* 144 */:
                byte b = bArr[i2];
                int i10 = (b & 240) >> 4;
                int i11 = b & 3;
                int i12 = (b & 12) >> 2;
                byte b2 = bArr[i2 + 1];
                boolean z = (b2 & ByteCompanionObject.MIN_VALUE) != 0;
                boolean z2 = (b2 & 64) != 0;
                int i13 = (b2 & 56) >> 3;
                int i14 = b2 & 7;
                i3 = i2 + 2;
                emitCaptionEvent(new CaptionEvent(12, new CaptionPenAttr(i11, i12, i10, i14, i13, z2, z)));
                break;
            case Const.CODE_C1_SPC /* 145 */:
                byte b3 = bArr[i2];
                CaptionColor captionColor = new CaptionColor((b3 & 192) >> 6, (b3 & 48) >> 4, (b3 & 12) >> 2, b3 & 3);
                byte b4 = bArr[i2 + 1];
                CaptionColor captionColor2 = new CaptionColor((b4 & 192) >> 6, (b4 & 48) >> 4, (b4 & 12) >> 2, b4 & 3);
                byte b5 = bArr[i2 + 2];
                CaptionColor captionColor3 = new CaptionColor(0, (b5 & 48) >> 4, (b5 & 12) >> 2, b5 & 3);
                i3 = i2 + 3;
                emitCaptionEvent(new CaptionEvent(13, new CaptionPenColor(captionColor, captionColor2, captionColor3)));
                break;
            case Const.CODE_C1_SPL /* 146 */:
                int i15 = i2 + 2;
                emitCaptionEvent(new CaptionEvent(14, new CaptionPenLocation(bArr[i2] & 15, bArr[i2 + 1] & 63)));
                return i15;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                return i2;
            case Const.CODE_C1_SWA /* 151 */:
                byte b6 = bArr[i2];
                CaptionColor captionColor4 = new CaptionColor((b6 & 192) >> 6, (b6 & 48) >> 4, (b6 & 12) >> 2, b6 & 3);
                byte b7 = bArr[i2 + 1];
                int i16 = i2 + 2;
                int i17 = ((b7 & 192) >> 6) | ((bArr[i16] & ByteCompanionObject.MIN_VALUE) >> 5);
                CaptionColor captionColor5 = new CaptionColor(0, (b7 & 48) >> 4, (b7 & 12) >> 2, b7 & 3);
                byte b8 = bArr[i16];
                boolean z3 = (b8 & 64) != 0;
                int i18 = (b8 & 48) >> 4;
                int i19 = (b8 & 12) >> 2;
                int i20 = b8 & 3;
                byte b9 = bArr[i2 + 3];
                int i21 = (b9 & 240) >> 4;
                int i22 = (b9 & 12) >> 2;
                int i23 = b9 & 3;
                i3 = i2 + 4;
                emitCaptionEvent(new CaptionEvent(15, new CaptionWindowAttr(captionColor4, captionColor5, i17, z3, i18, i19, i20, i22, i21, i23)));
                break;
            case Const.CODE_C1_DF0 /* 152 */:
            case Const.CODE_C1_DF1 /* 153 */:
            case Const.CODE_C1_DF2 /* 154 */:
            case Const.CODE_C1_DF3 /* 155 */:
            case Const.CODE_C1_DF4 /* 156 */:
            case Const.CODE_C1_DF5 /* 157 */:
            case Const.CODE_C1_DF6 /* 158 */:
            case 159:
                int i24 = i - 152;
                byte b10 = bArr[i2];
                boolean z4 = (b10 & 32) != 0;
                boolean z5 = (b10 & 16) != 0;
                boolean z6 = (b10 & 8) != 0;
                int i25 = b10 & 7;
                byte b11 = bArr[i2 + 1];
                boolean z7 = (b11 & ByteCompanionObject.MIN_VALUE) != 0;
                int i26 = b11 & ByteCompanionObject.MAX_VALUE;
                int i27 = bArr[i2 + 2] & UByte.MAX_VALUE;
                byte b12 = bArr[i2 + 3];
                int i28 = (b12 & 240) >> 4;
                int i29 = b12 & 15;
                int i30 = bArr[i2 + 4] & 63;
                byte b13 = bArr[i2 + 5];
                int i31 = (b13 & 56) >> 3;
                int i32 = b13 & 7;
                int i33 = i2 + 6;
                emitCaptionEvent(new CaptionEvent(16, new CaptionWindow(i24, z4, z5, z6, i25, z7, i26, i27, i28, i29, i30, i32, i31)));
                return i33;
        }
        return i3;
    }

    private void parseG0(int i) {
        if (i == 127) {
            this.mBuilder.append(MUSIC_NOTE_CHAR);
        } else {
            this.mBuilder.append((char) i);
        }
    }

    private void parseG1(int i) {
        this.mBuilder.append((char) i);
    }

    private int parseExt1(byte[] bArr, int i) {
        int i2 = bArr[i] & UByte.MAX_VALUE;
        int i3 = i + 1;
        if (i2 >= 0 && i2 <= 31) {
            return parseC2(i2, i3);
        }
        if (i2 >= 128 && i2 <= 159) {
            return parseC3(i2, i3);
        }
        if (i2 >= 32 && i2 <= 127) {
            parseG2(i2);
            return i3;
        }
        if (i2 < 160 || i2 > 255) {
            return i3;
        }
        parseG3(i2);
        return i3;
    }

    private static class Const {
        public static final int CODE_C0_BS = 8;
        public static final int CODE_C0_CR = 13;
        public static final int CODE_C0_ETX = 3;
        public static final int CODE_C0_EXT1 = 16;
        public static final int CODE_C0_FF = 12;
        public static final int CODE_C0_HCR = 14;
        public static final int CODE_C0_NUL = 0;
        public static final int CODE_C0_P16 = 24;
        public static final int CODE_C0_RANGE_END = 31;
        public static final int CODE_C0_RANGE_START = 0;
        public static final int CODE_C0_SKIP1_RANGE_END = 23;
        public static final int CODE_C0_SKIP1_RANGE_START = 16;
        public static final int CODE_C0_SKIP2_RANGE_END = 31;
        public static final int CODE_C0_SKIP2_RANGE_START = 24;
        public static final int CODE_C1_CLW = 136;
        public static final int CODE_C1_CW0 = 128;
        public static final int CODE_C1_CW1 = 129;
        public static final int CODE_C1_CW2 = 130;
        public static final int CODE_C1_CW3 = 131;
        public static final int CODE_C1_CW4 = 132;
        public static final int CODE_C1_CW5 = 133;
        public static final int CODE_C1_CW6 = 134;
        public static final int CODE_C1_CW7 = 135;
        public static final int CODE_C1_DF0 = 152;
        public static final int CODE_C1_DF1 = 153;
        public static final int CODE_C1_DF2 = 154;
        public static final int CODE_C1_DF3 = 155;
        public static final int CODE_C1_DF4 = 156;
        public static final int CODE_C1_DF5 = 157;
        public static final int CODE_C1_DF6 = 158;
        public static final int CODE_C1_DF7 = 159;
        public static final int CODE_C1_DLC = 142;
        public static final int CODE_C1_DLW = 140;
        public static final int CODE_C1_DLY = 141;
        public static final int CODE_C1_DSW = 137;
        public static final int CODE_C1_HDW = 138;
        public static final int CODE_C1_RANGE_END = 159;
        public static final int CODE_C1_RANGE_START = 128;
        public static final int CODE_C1_RST = 143;
        public static final int CODE_C1_SPA = 144;
        public static final int CODE_C1_SPC = 145;
        public static final int CODE_C1_SPL = 146;
        public static final int CODE_C1_SWA = 151;
        public static final int CODE_C1_TGW = 139;
        public static final int CODE_C2_RANGE_END = 31;
        public static final int CODE_C2_RANGE_START = 0;
        public static final int CODE_C2_SKIP0_RANGE_END = 7;
        public static final int CODE_C2_SKIP0_RANGE_START = 0;
        public static final int CODE_C2_SKIP1_RANGE_END = 15;
        public static final int CODE_C2_SKIP1_RANGE_START = 8;
        public static final int CODE_C2_SKIP2_RANGE_END = 23;
        public static final int CODE_C2_SKIP2_RANGE_START = 16;
        public static final int CODE_C2_SKIP3_RANGE_END = 31;
        public static final int CODE_C2_SKIP3_RANGE_START = 24;
        public static final int CODE_C3_RANGE_END = 159;
        public static final int CODE_C3_RANGE_START = 128;
        public static final int CODE_C3_SKIP4_RANGE_END = 135;
        public static final int CODE_C3_SKIP4_RANGE_START = 128;
        public static final int CODE_C3_SKIP5_RANGE_END = 143;
        public static final int CODE_C3_SKIP5_RANGE_START = 136;
        public static final int CODE_G0_MUSICNOTE = 127;
        public static final int CODE_G0_RANGE_END = 127;
        public static final int CODE_G0_RANGE_START = 32;
        public static final int CODE_G1_RANGE_END = 255;
        public static final int CODE_G1_RANGE_START = 160;
        public static final int CODE_G2_BLK = 48;
        public static final int CODE_G2_NBTSP = 33;
        public static final int CODE_G2_RANGE_END = 127;
        public static final int CODE_G2_RANGE_START = 32;
        public static final int CODE_G2_TSP = 32;
        public static final int CODE_G3_CC = 160;
        public static final int CODE_G3_RANGE_END = 255;
        public static final int CODE_G3_RANGE_START = 160;

        private Const() {
        }
    }

    public static class CaptionColor {
        public static final int OPACITY_FLASH = 1;
        public static final int OPACITY_SOLID = 0;
        public static final int OPACITY_TRANSLUCENT = 2;
        public static final int OPACITY_TRANSPARENT = 3;
        public final int blue;
        public final int green;
        public final int opacity;
        public final int red;
        private static final int[] COLOR_MAP = {0, 15, 240, 255};
        private static final int[] OPACITY_MAP = {255, 254, 128, 0};

        CaptionColor(int i, int i2, int i3, int i4) {
            this.opacity = i;
            this.red = i2;
            this.green = i3;
            this.blue = i4;
        }

        public int getArgbValue() {
            int i = OPACITY_MAP[this.opacity];
            int[] iArr = COLOR_MAP;
            return Color.argb(i, iArr[this.red], iArr[this.green], iArr[this.blue]);
        }
    }

    public static class CaptionEvent {
        public final Object obj;
        public final int type;

        CaptionEvent(int i, Object obj) {
            this.type = i;
            this.obj = obj;
        }
    }

    public static class CaptionPenAttr {
        public static final int OFFSET_NORMAL = 1;
        public static final int OFFSET_SUBSCRIPT = 0;
        public static final int OFFSET_SUPERSCRIPT = 2;
        public static final int PEN_SIZE_LARGE = 2;
        public static final int PEN_SIZE_SMALL = 0;
        public static final int PEN_SIZE_STANDARD = 1;
        public final int edgeType;
        public final int fontTag;
        public final boolean italic;
        public final int penOffset;
        public final int penSize;
        public final int textTag;
        public final boolean underline;

        CaptionPenAttr(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
            this.penSize = i;
            this.penOffset = i2;
            this.textTag = i3;
            this.fontTag = i4;
            this.edgeType = i5;
            this.underline = z;
            this.italic = z2;
        }
    }

    public static class CaptionPenColor {
        public final CaptionColor backgroundColor;
        public final CaptionColor edgeColor;
        public final CaptionColor foregroundColor;

        CaptionPenColor(CaptionColor captionColor, CaptionColor captionColor2, CaptionColor captionColor3) {
            this.foregroundColor = captionColor;
            this.backgroundColor = captionColor2;
            this.edgeColor = captionColor3;
        }
    }

    public static class CaptionPenLocation {
        public final int column;
        public final int row;

        CaptionPenLocation(int i, int i2) {
            this.row = i;
            this.column = i2;
        }
    }

    public static class CaptionWindowAttr {
        public final CaptionColor borderColor;
        public final int borderType;
        public final int displayEffect;
        public final int effectDirection;
        public final int effectSpeed;
        public final CaptionColor fillColor;
        public final int justify;
        public final int printDirection;
        public final int scrollDirection;
        public final boolean wordWrap;

        CaptionWindowAttr(CaptionColor captionColor, CaptionColor captionColor2, int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.fillColor = captionColor;
            this.borderColor = captionColor2;
            this.borderType = i;
            this.wordWrap = z;
            this.printDirection = i2;
            this.scrollDirection = i3;
            this.justify = i4;
            this.effectDirection = i5;
            this.effectSpeed = i6;
            this.displayEffect = i7;
        }
    }

    public static class CaptionWindow {
        public final int anchorHorizontal;
        public final int anchorId;
        public final int anchorVertical;
        public final int columnCount;
        public final boolean columnLock;

        /* JADX INFO: renamed from: id */
        public final int f88id;
        public final int penStyle;
        public final int priority;
        public final boolean relativePositioning;
        public final int rowCount;
        public final boolean rowLock;
        public final boolean visible;
        public final int windowStyle;

        CaptionWindow(int i, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f88id = i;
            this.visible = z;
            this.rowLock = z2;
            this.columnLock = z3;
            this.priority = i2;
            this.relativePositioning = z4;
            this.anchorVertical = i3;
            this.anchorHorizontal = i4;
            this.anchorId = i5;
            this.rowCount = i6;
            this.columnCount = i7;
            this.penStyle = i8;
            this.windowStyle = i9;
        }
    }
}
