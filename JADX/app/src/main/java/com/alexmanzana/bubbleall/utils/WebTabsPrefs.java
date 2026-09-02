package com.alexmanzana.bubbleall.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WebTabsPrefs.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000f"}, m495d2 = {"Lcom/alexmanzana/bubbleall/utils/WebTabsPrefs;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "p0", "p1", "", "p2", "Companion", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class WebTabsPrefs extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase p0, int p1, int p2) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebTabsPrefs(Context context) {
        super(context, "db_webs_tabs", (SQLiteDatabase.CursorFactory) null, 1);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: compiled from: WebTabsPrefs.kt */
    @Metadata(m494d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nJ\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u000b"}, m495d2 = {"Lcom/alexmanzana/bubbleall/utils/WebTabsPrefs$Companion;", "", "()V", "addAll", "", "context", "Landroid/content/Context;", "list", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ArrayList<String> list(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SQLiteDatabase readableDatabase = new WebTabsPrefs(context).getReadableDatabase();
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM webs_tabs", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    arrayList.add(cursorRawQuery.getString(0));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            readableDatabase.close();
            return arrayList;
        }

        public final void addAll(Context context, ArrayList<String> list) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(list, "list");
            SQLiteDatabase writableDatabase = new WebTabsPrefs(context).getWritableDatabase();
            writableDatabase.execSQL("DELETE FROM webs_tabs");
            for (String str : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(ImagesContract.URL, str);
                writableDatabase.insert("webs_tabs", null, contentValues);
            }
            writableDatabase.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        if (db != null) {
            db.execSQL("CREATE TABLE webs_tabs(url TEXT primary key)");
        }
    }
}
