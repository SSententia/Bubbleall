package com.alexmanzana.bubbleall.utils;

import android.content.ContentUris;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.media2.session.MediaConstants;
import androidx.preference.PreferenceManager;
import com.alexmanzana.bubbleall.C1106R;
import com.alexmanzana.bubbleall.listeners.ListenerListMusic;
import com.alexmanzana.bubbleall.pojos.ItemMusic;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MusicPrefs.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m495d2 = {"Lcom/alexmanzana/bubbleall/utils/MusicPrefs;", "", "()V", "Companion", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class MusicPrefs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: MusicPrefs.kt */
    @Metadata(m494d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m495d2 = {"Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion;", "", "()V", "get", "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;", "context", "Landroid/content/Context;", MediaConstants.MEDIA_URI_QUERY_ID, "", "list", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/alexmanzana/bubbleall/listeners/ListenerListMusic;", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ItemMusic get(Context context, long id) {
            Intrinsics.checkNotNullParameter(context, "context");
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, id);
            Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
            mediaMetadataRetriever.setDataSource(context, uriWithAppendedId);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(7);
            String str = strExtractMetadata == null ? "<unknown>" : strExtractMetadata;
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(2);
            String str2 = strExtractMetadata2 == null ? "<unknown>" : strExtractMetadata2;
            byte[] embeddedPicture = mediaMetadataRetriever.getEmbeddedPicture();
            if (embeddedPicture != null) {
                return new ItemMusic(id, uriWithAppendedId, str, str2, BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length));
            }
            return new ItemMusic(id, uriWithAppendedId, str, str2, null);
        }

        public final void list(Context context, ListenerListMusic listener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listener, "listener");
            ArrayList<ItemMusic> arrayList = new ArrayList<>();
            String string = context.getString(C1106R.string.text_recent_key);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = context.getString(C1106R.string.text_sort_a_z_key);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = context.getString(C1106R.string.text_sort_z_a_key);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            Cursor cursorQuery = context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "artist", "title"}, "is_music != 0", null, null);
            if (cursorQuery != null) {
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        String string4 = cursorQuery.getString(1);
                        if (string4 == null) {
                            string4 = null;
                        }
                        String string5 = cursorQuery.getString(2);
                        Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, j);
                        Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
                        Intrinsics.checkNotNull(string5);
                        arrayList.add(new ItemMusic(j, uriWithAppendedId, string5, string4, null));
                    } while (cursorQuery.moveToNext());
                }
                cursorQuery.close();
            }
            String string6 = defaultSharedPreferences.getString("key_order_music", string);
            if (Intrinsics.areEqual(string6, string2)) {
                final MusicPrefs$Companion$list$2 musicPrefs$Companion$list$2 = new Function2<ItemMusic, ItemMusic, Integer>() { // from class: com.alexmanzana.bubbleall.utils.MusicPrefs$Companion$list$2
                    @Override // kotlin.jvm.functions.Function2
                    public final Integer invoke(ItemMusic itemMusic, ItemMusic itemMusic2) {
                        return Integer.valueOf(itemMusic.getTitle().compareTo(itemMusic2.getTitle()));
                    }
                };
                CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.alexmanzana.bubbleall.utils.MusicPrefs$Companion$$ExternalSyntheticLambda0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return MusicPrefs.Companion.list$lambda$2(musicPrefs$Companion$list$2, obj, obj2);
                    }
                });
            } else if (Intrinsics.areEqual(string6, string3)) {
                final MusicPrefs$Companion$list$3 musicPrefs$Companion$list$3 = new Function2<ItemMusic, ItemMusic, Integer>() { // from class: com.alexmanzana.bubbleall.utils.MusicPrefs$Companion$list$3
                    @Override // kotlin.jvm.functions.Function2
                    public final Integer invoke(ItemMusic itemMusic, ItemMusic itemMusic2) {
                        return Integer.valueOf(itemMusic2.getTitle().compareTo(itemMusic.getTitle()));
                    }
                };
                CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.alexmanzana.bubbleall.utils.MusicPrefs$Companion$$ExternalSyntheticLambda1
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return MusicPrefs.Companion.list$lambda$3(musicPrefs$Companion$list$3, obj, obj2);
                    }
                });
            }
            listener.onReceived(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int list$lambda$2(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int list$lambda$3(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }
    }
}
