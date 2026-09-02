package com.alexmanzana.bubbleall.utils;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import androidx.media2.session.MediaConstants;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.MainActivity$$ExternalSyntheticApiModelOutline0;
import com.alexmanzana.bubbleall.pojos.ItemAdd;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ShortcutPrefs.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000e"}, m495d2 = {"Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "p1", "", "p2", "Companion", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class ShortcutPrefs extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int p1, int p2) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutPrefs(Context context) {
        super(context, "db_shortcuts", (SQLiteDatabase.CursorFactory) null, 1);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: compiled from: ShortcutPrefs.kt */
    @Metadata(m494d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0011j\b\u0012\u0004\u0012\u00020\b`\u00122\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0013"}, m495d2 = {"Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs$Companion;", "", "()V", "add", "", "context", "Landroid/content/Context;", "item", "Lcom/alexmanzana/bubbleall/pojos/ItemAdd;", "delete", MediaConstants.MEDIA_URI_QUERY_ID, "", "edit", "exists", "", "get", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ItemAdd get(Context context, String id) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(id, "id");
            SQLiteDatabase readableDatabase = new ShortcutPrefs(context).getReadableDatabase();
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM shortcuts WHERE id='" + id + '\'', null);
            cursorRawQuery.moveToFirst();
            try {
                String string = cursorRawQuery.getString(1);
                String string2 = cursorRawQuery.getString(2);
                String string3 = cursorRawQuery.getString(3);
                Intrinsics.checkNotNull(string);
                Intrinsics.checkNotNull(string3);
                ItemAdd itemAdd = new ItemAdd(id, string, string3, 0, string2, C1106R.id.shortcutPanel);
                cursorRawQuery.close();
                readableDatabase.close();
                return itemAdd;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public final boolean exists(Context context, String id) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(id, "id");
            SQLiteDatabase readableDatabase = new ShortcutPrefs(context).getReadableDatabase();
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM shortcuts WHERE id='" + id + '\'', null);
            if (cursorRawQuery.moveToFirst()) {
                cursorRawQuery.close();
                readableDatabase.close();
                return true;
            }
            cursorRawQuery.close();
            readableDatabase.close();
            return false;
        }

        public final ArrayList<ItemAdd> list(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ArrayList<ItemAdd> arrayList = new ArrayList<>();
            SQLiteDatabase readableDatabase = new ShortcutPrefs(context).getReadableDatabase();
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM shortcuts", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    String string = cursorRawQuery.getString(0);
                    String string2 = cursorRawQuery.getString(1);
                    String string3 = cursorRawQuery.getString(2);
                    String string4 = cursorRawQuery.getString(3);
                    Intrinsics.checkNotNull(string);
                    Intrinsics.checkNotNull(string2);
                    Intrinsics.checkNotNull(string4);
                    arrayList.add(new ItemAdd(string, string2, string4, 0, string3, C1106R.id.shortcutPanel));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            readableDatabase.close();
            return arrayList;
        }

        public final void delete(Context context, String id) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(id, "id");
            SQLiteDatabase writableDatabase = new ShortcutPrefs(context).getWritableDatabase();
            writableDatabase.execSQL("DELETE FROM shortcuts WHERE id='" + id + '\'');
            writableDatabase.close();
        }

        public final void edit(Context context, ItemAdd item) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(item, "item");
            SQLiteDatabase writableDatabase = new ShortcutPrefs(context).getWritableDatabase();
            writableDatabase.execSQL("UPDATE shortcuts SET name='" + item.getName() + "', image='" + item.getResourceBitmap() + "', url='" + item.getDescription() + "' WHERE id='" + item.getId() + '\'');
            writableDatabase.close();
        }

        public final void add(Context context, ItemAdd item) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(item, "item");
            SQLiteDatabase writableDatabase = new ShortcutPrefs(context).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(MediaConstants.MEDIA_URI_QUERY_ID, item.getId());
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, item.getName());
            contentValues.put("image", item.getResourceBitmap());
            contentValues.put(ImagesContract.URL, item.getDescription());
            writableDatabase.insert("shortcuts", null, contentValues);
            writableDatabase.close();
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                MainActivity$$ExternalSyntheticApiModelOutline0.m337m();
                NotificationChannel notificationChannelM331m = MainActivity$$ExternalSyntheticApiModelOutline0.m331m(item.getId(), item.getName(), 2);
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(notificationChannelM331m);
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        if (db != null) {
            db.execSQL("CREATE TABLE shortcuts(id TEXT primary key, name TEXT, image TEXT, url TEXT);");
        }
    }
}
