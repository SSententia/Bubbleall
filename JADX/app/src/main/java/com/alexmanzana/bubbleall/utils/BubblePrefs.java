package com.alexmanzana.bubbleall.utils;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.alexmanzana.bubbleall.pojos.ItemTheme;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BubblePrefs.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000f"}, m495d2 = {"Lcom/alexmanzana/bubbleall/utils/BubblePrefs;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "p0", "p1", "", "p2", "Companion", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class BubblePrefs extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase p0, int p1, int p2) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BubblePrefs(Context context) {
        super(context, "db_themes", (SQLiteDatabase.CursorFactory) null, 1);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: compiled from: BubblePrefs.kt */
    @Metadata(m494d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0019j\b\u0012\u0004\u0012\u00020\b`\u001a2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u001b"}, m495d2 = {"Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;", "", "()V", "addTheme", "", "context", "Landroid/content/Context;", "item", "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;", "delete", "uuid", "", "edit", "exists", "", "get", "getColorBubble", "", "getColorManager", "getColorTabNotSelected", "getColorTabSelected", "getInternalColors", "getPosition", "getSizeBubble", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void addTheme(Context context, ItemTheme item) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(item, "item");
            SQLiteDatabase writableDatabase = new BubblePrefs(context).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("uuid", item.getUuid());
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, item.getName());
            contentValues.put("colorBubble", Integer.valueOf(item.getColorBubble()));
            contentValues.put("colorCurrentTab", Integer.valueOf(item.getColorCurrentTab()));
            contentValues.put("colorTab", Integer.valueOf(item.getColorTab()));
            contentValues.put("colorWindow", Integer.valueOf(item.getColorWindow()));
            contentValues.put("colorInternal", Integer.valueOf(item.getColorInternal()));
            writableDatabase.insert("themes", null, contentValues);
            writableDatabase.close();
        }

        public final void delete(Context context, String uuid) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            SQLiteDatabase writableDatabase = new BubblePrefs(context).getWritableDatabase();
            writableDatabase.execSQL("DELETE FROM themes WHERE uuid='" + uuid + '\'');
            writableDatabase.close();
        }

        public final boolean exists(Context context, String uuid) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            SQLiteDatabase readableDatabase = new BubblePrefs(context).getReadableDatabase();
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM themes WHERE uuid='" + uuid + '\'', null);
            if (cursorRawQuery.moveToFirst()) {
                cursorRawQuery.close();
                readableDatabase.close();
                return true;
            }
            cursorRawQuery.close();
            readableDatabase.close();
            return false;
        }

        public final ItemTheme get(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getSharedPreferences("bubble_data_prefs", 0).getString("theme_selected", "");
            ItemTheme itemTheme = get(context, string != null ? string : "");
            return itemTheme == null ? ItemTheme.INSTANCE.m720default() : itemTheme;
        }

        public final ItemTheme get(Context context, String uuid) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            SQLiteDatabase readableDatabase = new BubblePrefs(context).getReadableDatabase();
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM themes WHERE uuid='" + uuid + '\'', null);
            cursorRawQuery.moveToFirst();
            try {
                String string = cursorRawQuery.getString(1);
                int i = cursorRawQuery.getInt(2);
                int i2 = cursorRawQuery.getInt(3);
                int i3 = cursorRawQuery.getInt(4);
                int i4 = cursorRawQuery.getInt(5);
                int i5 = cursorRawQuery.getInt(6);
                Intrinsics.checkNotNull(string);
                ItemTheme itemTheme = new ItemTheme(string, i, i2, i3, i4, i5, uuid);
                cursorRawQuery.close();
                readableDatabase.close();
                return itemTheme;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public final void edit(Context context, ItemTheme item) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(item, "item");
            SQLiteDatabase writableDatabase = new BubblePrefs(context).getWritableDatabase();
            writableDatabase.execSQL("UPDATE themes SET name='" + item.getName() + "', colorBubble='" + item.getColorBubble() + "', colorCurrentTab='" + item.getColorCurrentTab() + "', colorTab='" + item.getColorTab() + "', colorWindow='" + item.getColorWindow() + "', colorInternal='" + item.getColorInternal() + "' WHERE uuid='" + item.getUuid() + '\'');
            writableDatabase.close();
        }

        public final ArrayList<ItemTheme> list(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ArrayList<ItemTheme> arrayList = new ArrayList<>();
            SQLiteDatabase readableDatabase = new BubblePrefs(context).getReadableDatabase();
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM themes", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    String string = cursorRawQuery.getString(0);
                    String string2 = cursorRawQuery.getString(1);
                    int i = cursorRawQuery.getInt(2);
                    int i2 = cursorRawQuery.getInt(3);
                    int i3 = cursorRawQuery.getInt(4);
                    int i4 = cursorRawQuery.getInt(5);
                    int i5 = cursorRawQuery.getInt(6);
                    Intrinsics.checkNotNull(string2);
                    arrayList.add(new ItemTheme(string2, i, i2, i3, i4, i5, string));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            readableDatabase.close();
            return arrayList;
        }

        public final int getPosition(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            int i = 0;
            SharedPreferences sharedPreferences = context.getSharedPreferences("bubble_data_prefs", 0);
            ArrayList<ItemTheme> list = list(context);
            String string = sharedPreferences.getString("theme_selected", "");
            String str = string != null ? string : "";
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (Intrinsics.areEqual(((ItemTheme) obj).getUuid(), str)) {
                    return i;
                }
                i = i2;
            }
            return -1;
        }

        public final int getInternalColors(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getSharedPreferences("bubble_data_prefs", 0).getString("theme_selected", "");
            ItemTheme itemThemeM720default = get(context, string != null ? string : "");
            if (itemThemeM720default == null) {
                itemThemeM720default = ItemTheme.INSTANCE.m720default();
            }
            return itemThemeM720default.getColorInternal();
        }

        public final int getColorManager(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getSharedPreferences("bubble_data_prefs", 0).getString("theme_selected", "");
            ItemTheme itemThemeM720default = get(context, string != null ? string : "");
            if (itemThemeM720default == null) {
                itemThemeM720default = ItemTheme.INSTANCE.m720default();
            }
            return itemThemeM720default.getColorWindow();
        }

        public final int getColorTabSelected(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getSharedPreferences("bubble_data_prefs", 0).getString("theme_selected", "");
            ItemTheme itemThemeM720default = get(context, string != null ? string : "");
            if (itemThemeM720default == null) {
                itemThemeM720default = ItemTheme.INSTANCE.m720default();
            }
            return itemThemeM720default.getColorCurrentTab();
        }

        public final int getColorTabNotSelected(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getSharedPreferences("bubble_data_prefs", 0).getString("theme_selected", "");
            ItemTheme itemThemeM720default = get(context, string != null ? string : "");
            if (itemThemeM720default == null) {
                itemThemeM720default = ItemTheme.INSTANCE.m720default();
            }
            return itemThemeM720default.getColorTab();
        }

        public final int getSizeBubble(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getSharedPreferences("bubble_data_prefs", 0).getInt("theme_size", 0);
        }

        public final int getColorBubble(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getSharedPreferences("bubble_data_prefs", 0).getString("theme_selected", "");
            ItemTheme itemThemeM720default = get(context, string != null ? string : "");
            if (itemThemeM720default == null) {
                itemThemeM720default = ItemTheme.INSTANCE.m720default();
            }
            return itemThemeM720default.getColorBubble();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        if (db != null) {
            db.execSQL("CREATE TABLE themes(uuid TEXT primary key, name TEXT, colorBubble INTEGER, colorCurrentTab INTEGER, colorTab INTEGER, colorWindow INTEGER, colorInternal INTEGER);");
        }
    }
}
