package com.alexmanzana.bubbleall.utils;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import androidx.media2.session.MediaConstants;
import androidx.preference.PreferenceManager;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.listeners.ListenerListVideo;
import com.alexmanzana.bubbleall.pojos.ItemVideo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: VideoPrefs.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000f"}, m495d2 = {"Lcom/alexmanzana/bubbleall/utils/VideoPrefs;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "p0", "p1", "", "p2", "Companion", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class VideoPrefs extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase p0, int p1, int p2) {
    }

    /* JADX INFO: compiled from: VideoPrefs.kt */
    @Metadata(m494d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J(\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0014j\b\u0012\u0004\u0012\u00020\b`\u00152\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\nH\u0002J(\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0014j\b\u0012\u0004\u0012\u00020\b`\u00152\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nJ\"\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\nJ \u0010%\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0014j\b\u0012\u0004\u0012\u00020\b`\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010&\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0014j\b\u0012\u0004\u0012\u00020\b`\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010'\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0014j\b\u0012\u0004\u0012\u00020\b`\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001e\u0010(\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012¨\u0006)"}, m495d2 = {"Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;", "", "()V", "addFavorite", "", "context", "Landroid/content/Context;", "itemVideo", "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;", "convertTime", "", "m", "", "deleteFavorite", MediaConstants.MEDIA_URI_QUERY_ID, "deleteFavorites", "favoriteList", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;", "files", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "path", "filesContent", "getMimeType", MediaConstants.MEDIA_URI_QUERY_URI, "Landroid/net/Uri;", "file", "Ljava/io/File;", "getName", "grid", "", "isVertical", "", "isFavorite", "list", "default", "listAllVideos", "listContent", "listExplorer", "listFiles", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String convertTime(long m) {
            String string;
            String str;
            long j = 3600000;
            int i = (int) (m / j);
            long j2 = m % j;
            int i2 = ((int) j2) / 60000;
            int i3 = (int) ((j2 % ((long) 60000)) / ((long) 1000));
            if (i <= 0) {
                string = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(':');
                string = sb.toString();
            }
            if (i3 < 10) {
                str = "0" + i3;
            } else {
                str = "" + i3;
            }
            return string + i2 + ':' + str;
        }

        public final int grid(Context context, boolean isVertical) {
            Intrinsics.checkNotNullParameter(context, "context");
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            String string = context.getString(C1106R.string.text_video_picker1_key);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = context.getString(C1106R.string.text_video_picker2_key);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = context.getString(C1106R.string.text_video_picker3_key);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = defaultSharedPreferences.getString("key_video_picker", string);
            if (Intrinsics.areEqual(string4, string) || Intrinsics.areEqual(string4, string2) || !Intrinsics.areEqual(string4, string3)) {
                return 0;
            }
            return isVertical ? 4 : 8;
        }

        public final void deleteFavorite(Context context, String id) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(id, "id");
            SQLiteDatabase writableDatabase = new VideoPrefs(context).getWritableDatabase();
            writableDatabase.execSQL("DELETE FROM videos WHERE id='" + id + '\'');
            writableDatabase.close();
        }

        public final void deleteFavorites(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SQLiteDatabase writableDatabase = new VideoPrefs(context).getWritableDatabase();
            writableDatabase.execSQL("DELETE FROM videos");
            writableDatabase.close();
        }

        public final boolean isFavorite(Context context, String id) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(id, "id");
            SQLiteDatabase readableDatabase = new VideoPrefs(context).getReadableDatabase();
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM videos WHERE id='" + id + '\'', null);
            if (cursorRawQuery.moveToFirst()) {
                cursorRawQuery.close();
                readableDatabase.close();
                return true;
            }
            cursorRawQuery.close();
            readableDatabase.close();
            return false;
        }

        public final void addFavorite(Context context, ItemVideo itemVideo) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(itemVideo, "itemVideo");
            SQLiteDatabase writableDatabase = new VideoPrefs(context).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(MediaConstants.MEDIA_URI_QUERY_ID, itemVideo.getId());
            contentValues.put("type", Integer.valueOf(itemVideo.getType()));
            contentValues.put("duration", Long.valueOf(itemVideo.getDuration()));
            writableDatabase.insert("videos", null, contentValues);
            writableDatabase.close();
        }

        public final void favoriteList(Context context, ListenerListVideo listener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listener, "listener");
            int i = context.getResources().getConfiguration().orientation == 1 ? 4 : 8;
            ArrayList<ItemVideo> arrayList = new ArrayList<>();
            SQLiteDatabase readableDatabase = new VideoPrefs(context).getReadableDatabase();
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM videos", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    arrayList.add(new ItemVideo(cursorRawQuery.getString(0), "", cursorRawQuery.getLong(2), false, cursorRawQuery.getInt(1), true));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            readableDatabase.close();
            listener.onReceived(arrayList, i);
        }

        public static /* synthetic */ void list$default(Companion companion, Context context, ListenerListVideo listenerListVideo, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = null;
            }
            companion.list(context, listenerListVideo, str);
        }

        public final void list(final Context context, final ListenerListVideo listener, final String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listener, "listener");
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            final String string = context.getString(C1106R.string.text_video_picker1_key);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            final String string2 = context.getString(C1106R.string.text_video_picker2_key);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            final String string3 = context.getString(C1106R.string.text_video_picker3_key);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            final String string4 = defaultSharedPreferences.getString("key_video_picker", string);
            final int i = context.getResources().getConfiguration().orientation == 1 ? 4 : 8;
            Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: com.alexmanzana.bubbleall.utils.VideoPrefs$Companion$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoPrefs.Companion.list$lambda$0(str, string4, string, listener, context, string2, string3, i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void list$lambda$0(String str, String str2, String keyGallery, ListenerListVideo listener, Context context, String keyExplorer, String keyAllVideos, int i) {
            Intrinsics.checkNotNullParameter(keyGallery, "$keyGallery");
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(keyExplorer, "$keyExplorer");
            Intrinsics.checkNotNullParameter(keyAllVideos, "$keyAllVideos");
            if (str == null) {
                str = str2;
            }
            if (Intrinsics.areEqual(str, keyGallery)) {
                listener.onReceived(VideoPrefs.INSTANCE.listContent(context), 0);
            } else if (Intrinsics.areEqual(str, keyExplorer)) {
                listener.onReceived(VideoPrefs.INSTANCE.listExplorer(context), 0);
            } else if (Intrinsics.areEqual(str, keyAllVideos)) {
                listener.onReceived(VideoPrefs.INSTANCE.listAllVideos(context), i);
            }
        }

        public final String getMimeType(Context context, Uri uri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uri, "uri");
            if (uri.getScheme() == null) {
                return null;
            }
            if (Intrinsics.areEqual(uri.getScheme(), "content")) {
                return context.getContentResolver().getType(uri);
            }
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            Intrinsics.checkNotNull(fileExtensionFromUrl);
            String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return singleton.getExtensionFromMimeType(lowerCase);
        }

        public final String getMimeType(Context context, File file) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(file, "file");
            Uri uriForFile = FileProvider.getUriForFile(context, context.getString(C1106R.string.file_provider_authority), file);
            Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(...)");
            return getMimeType(context, uriForFile);
        }

        private final ArrayList<ItemVideo> listAllVideos(Context context) {
            ArrayList<ItemVideo> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_id", "duration"}, null, null, "date_added DESC");
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_id"));
                    if (string != null) {
                        long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("duration"));
                        if (!arrayList2.contains(string)) {
                            arrayList.add(new ItemVideo(string, "", j, false, 2, false, 32, null));
                        }
                    }
                }
                cursorQuery.close();
            }
            return arrayList;
        }

        private final ArrayList<ItemVideo> listExplorer(Context context) {
            File parentFile;
            File parentFile2;
            File parentFile3;
            ArrayList<ItemVideo> arrayList = new ArrayList<>();
            File parentFile4 = null;
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null && (parentFile = externalFilesDir.getParentFile()) != null && (parentFile2 = parentFile.getParentFile()) != null && (parentFile3 = parentFile2.getParentFile()) != null) {
                parentFile4 = parentFile3.getParentFile();
            }
            if (parentFile4 != null) {
                String absolutePath = parentFile4.getAbsolutePath();
                String name = parentFile4.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                arrayList.add(new ItemVideo(absolutePath, name, 0L, true, 1, false, 32, null));
            }
            return arrayList;
        }

        private final ArrayList<ItemVideo> listContent(Context context) {
            String str;
            ArrayList arrayList = new ArrayList();
            ArrayList<ItemVideo> arrayList2 = new ArrayList<>();
            Cursor cursorQuery = context.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"bucket_display_name", "_id"}, null, null, null);
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("bucket_display_name"));
                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_id"));
                    if (string != null && !arrayList.contains(string) && (str = string2) != null && str.length() != 0) {
                        arrayList.add(string);
                        arrayList2.add(new ItemVideo(string2, string, 0L, true, 0, false, 32, null));
                    }
                }
                cursorQuery.close();
            }
            return arrayList2;
        }

        public final String getName(Context context, Uri uri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery == null) {
                return "";
            }
            int columnIndex = cursorQuery.getColumnIndex("_display_name");
            cursorQuery.moveToFirst();
            String string = cursorQuery.getString(columnIndex);
            cursorQuery.close();
            if (string == null) {
                return "";
            }
            Intrinsics.checkNotNull(string);
            return string;
        }

        private final ArrayList<ItemVideo> filesContent(Context context, String path) {
            ArrayList<ItemVideo> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_id", "duration", "_id"}, "bucket_display_name=?", new String[]{path}, "date_added DESC");
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_id"));
                    if (string != null) {
                        long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("duration"));
                        if (!arrayList2.contains(string)) {
                            arrayList.add(new ItemVideo(string, "", j, false, 2, false, 32, null));
                        }
                    }
                }
                cursorQuery.close();
            }
            return arrayList;
        }

        private final ArrayList<ItemVideo> files(Context context, String path) {
            ArrayList<ItemVideo> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            File[] fileArrListFiles = new File(path).listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && !file.isHidden()) {
                        String absolutePath = file.getAbsolutePath();
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        arrayList2.add(new ItemVideo(absolutePath, name, 0L, true, 1, false, 32, null));
                    } else {
                        Companion companion = VideoPrefs.INSTANCE;
                        Intrinsics.checkNotNull(file);
                        String mimeType = companion.getMimeType(context, file);
                        if (mimeType != null && StringsKt.startsWith$default(mimeType, "video", false, 2, (Object) null)) {
                            String absolutePath2 = file.getAbsolutePath();
                            String name2 = file.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            arrayList3.add(new ItemVideo(absolutePath2, name2, 0L, false, 1, false, 32, null));
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            arrayList.addAll(arrayList3);
            return arrayList;
        }

        public final void listFiles(final Context context, final String path, final ListenerListVideo listener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(listener, "listener");
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            final String string = context.getString(C1106R.string.text_video_picker2_key);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            final String string2 = defaultSharedPreferences.getString("key_video_picker", context.getString(C1106R.string.text_video_picker1_key));
            final int i = context.getResources().getConfiguration().orientation == 1 ? 4 : 8;
            Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: com.alexmanzana.bubbleall.utils.VideoPrefs$Companion$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    VideoPrefs.Companion.listFiles$lambda$12(string2, string, listener, context, path, i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void listFiles$lambda$12(String str, String keyExplorer, ListenerListVideo listener, Context context, String path, int i) {
            Intrinsics.checkNotNullParameter(keyExplorer, "$keyExplorer");
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(path, "$path");
            if (Intrinsics.areEqual(str, keyExplorer)) {
                listener.onReceived(VideoPrefs.INSTANCE.files(context, path), 0);
            } else {
                listener.onReceived(VideoPrefs.INSTANCE.filesContent(context, path), i);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPrefs(Context context) {
        super(context, "db_videos", (SQLiteDatabase.CursorFactory) null, 1);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        if (db != null) {
            db.execSQL("CREATE TABLE videos(id TEXT primary key, type INTEGER, duration LONG);");
        }
    }
}
