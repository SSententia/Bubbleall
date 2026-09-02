package androidx.media2.common;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.graphics.BitmapCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import androidx.versionedparcelable.ParcelImpl;
import androidx.versionedparcelable.ParcelUtils;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadata extends CustomVersionedParcelable {
    public static final long BROWSABLE_TYPE_ALBUMS = 2;
    public static final long BROWSABLE_TYPE_ARTISTS = 3;
    public static final long BROWSABLE_TYPE_GENRES = 4;
    public static final long BROWSABLE_TYPE_MIXED = 0;
    public static final long BROWSABLE_TYPE_NONE = -1;
    public static final long BROWSABLE_TYPE_PLAYLISTS = 5;
    public static final long BROWSABLE_TYPE_TITLES = 1;
    public static final long BROWSABLE_TYPE_YEARS = 6;
    static final ArrayMap<String, Integer> METADATA_KEYS_TYPE;
    public static final String METADATA_KEY_ADVERTISEMENT = "androidx.media2.metadata.ADVERTISEMENT";
    public static final String METADATA_KEY_ALBUM = "android.media.metadata.ALBUM";
    public static final String METADATA_KEY_ALBUM_ART = "android.media.metadata.ALBUM_ART";
    public static final String METADATA_KEY_ALBUM_ARTIST = "android.media.metadata.ALBUM_ARTIST";
    public static final String METADATA_KEY_ALBUM_ART_URI = "android.media.metadata.ALBUM_ART_URI";
    public static final String METADATA_KEY_ART = "android.media.metadata.ART";
    public static final String METADATA_KEY_ARTIST = "android.media.metadata.ARTIST";
    public static final String METADATA_KEY_ART_URI = "android.media.metadata.ART_URI";
    public static final String METADATA_KEY_AUTHOR = "android.media.metadata.AUTHOR";
    public static final String METADATA_KEY_BROWSABLE = "androidx.media2.metadata.BROWSABLE";
    public static final String METADATA_KEY_COMPILATION = "android.media.metadata.COMPILATION";
    public static final String METADATA_KEY_COMPOSER = "android.media.metadata.COMPOSER";
    public static final String METADATA_KEY_DATE = "android.media.metadata.DATE";
    public static final String METADATA_KEY_DISC_NUMBER = "android.media.metadata.DISC_NUMBER";
    public static final String METADATA_KEY_DISPLAY_DESCRIPTION = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final String METADATA_KEY_DISPLAY_ICON = "android.media.metadata.DISPLAY_ICON";
    public static final String METADATA_KEY_DISPLAY_ICON_URI = "android.media.metadata.DISPLAY_ICON_URI";
    public static final String METADATA_KEY_DISPLAY_SUBTITLE = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final String METADATA_KEY_DISPLAY_TITLE = "android.media.metadata.DISPLAY_TITLE";
    public static final String METADATA_KEY_DOWNLOAD_STATUS = "androidx.media2.metadata.DOWNLOAD_STATUS";
    public static final String METADATA_KEY_DURATION = "android.media.metadata.DURATION";
    public static final String METADATA_KEY_EXTRAS = "androidx.media2.metadata.EXTRAS";
    public static final String METADATA_KEY_GENRE = "android.media.metadata.GENRE";
    public static final String METADATA_KEY_MEDIA_ID = "android.media.metadata.MEDIA_ID";
    public static final String METADATA_KEY_MEDIA_URI = "android.media.metadata.MEDIA_URI";
    public static final String METADATA_KEY_NUM_TRACKS = "android.media.metadata.NUM_TRACKS";
    public static final String METADATA_KEY_PLAYABLE = "androidx.media2.metadata.PLAYABLE";
    public static final String METADATA_KEY_RADIO_FREQUENCY = "androidx.media2.metadata.RADIO_FREQUENCY";
    public static final String METADATA_KEY_RADIO_PROGRAM_NAME = "androidx.media2.metadata.RADIO_PROGRAM_NAME";
    public static final String METADATA_KEY_RATING = "android.media.metadata.RATING";
    public static final String METADATA_KEY_TITLE = "android.media.metadata.TITLE";
    public static final String METADATA_KEY_TRACK_NUMBER = "android.media.metadata.TRACK_NUMBER";
    public static final String METADATA_KEY_USER_RATING = "android.media.metadata.USER_RATING";
    public static final String METADATA_KEY_WRITER = "android.media.metadata.WRITER";
    public static final String METADATA_KEY_YEAR = "android.media.metadata.YEAR";
    static final int METADATA_TYPE_BITMAP = 2;
    static final int METADATA_TYPE_BUNDLE = 5;
    static final int METADATA_TYPE_FLOAT = 4;
    static final int METADATA_TYPE_LONG = 0;
    static final int METADATA_TYPE_RATING = 3;
    static final int METADATA_TYPE_TEXT = 1;
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;
    private static final String TAG = "MediaMetadata";
    ParcelImplListSlice mBitmapListSlice;
    Bundle mBundle;
    Bundle mParcelableWithoutBitmapBundle;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BitmapKey {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BundleKey {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FloatKey {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LongKey {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RatingKey {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TextKey {
    }

    static {
        ArrayMap<String, Integer> arrayMap = new ArrayMap<>();
        METADATA_KEYS_TYPE = arrayMap;
        arrayMap.put("android.media.metadata.TITLE", 1);
        arrayMap.put("android.media.metadata.ARTIST", 1);
        arrayMap.put("android.media.metadata.DURATION", 0);
        arrayMap.put("android.media.metadata.ALBUM", 1);
        arrayMap.put("android.media.metadata.AUTHOR", 1);
        arrayMap.put("android.media.metadata.WRITER", 1);
        arrayMap.put("android.media.metadata.COMPOSER", 1);
        arrayMap.put("android.media.metadata.COMPILATION", 1);
        arrayMap.put("android.media.metadata.DATE", 1);
        arrayMap.put("android.media.metadata.YEAR", 0);
        arrayMap.put("android.media.metadata.GENRE", 1);
        arrayMap.put("android.media.metadata.TRACK_NUMBER", 0);
        arrayMap.put("android.media.metadata.NUM_TRACKS", 0);
        arrayMap.put("android.media.metadata.DISC_NUMBER", 0);
        arrayMap.put("android.media.metadata.ALBUM_ARTIST", 1);
        arrayMap.put("android.media.metadata.ART", 2);
        arrayMap.put("android.media.metadata.ART_URI", 1);
        arrayMap.put("android.media.metadata.ALBUM_ART", 2);
        arrayMap.put("android.media.metadata.ALBUM_ART_URI", 1);
        arrayMap.put("android.media.metadata.USER_RATING", 3);
        arrayMap.put("android.media.metadata.RATING", 3);
        arrayMap.put("android.media.metadata.DISPLAY_TITLE", 1);
        arrayMap.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        arrayMap.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        arrayMap.put("android.media.metadata.DISPLAY_ICON", 2);
        arrayMap.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        arrayMap.put("android.media.metadata.MEDIA_ID", 1);
        arrayMap.put("android.media.metadata.MEDIA_URI", 1);
        arrayMap.put(METADATA_KEY_RADIO_FREQUENCY, 4);
        arrayMap.put(METADATA_KEY_RADIO_PROGRAM_NAME, 1);
        arrayMap.put(METADATA_KEY_BROWSABLE, 0);
        arrayMap.put(METADATA_KEY_PLAYABLE, 0);
        arrayMap.put(METADATA_KEY_ADVERTISEMENT, 0);
        arrayMap.put(METADATA_KEY_DOWNLOAD_STATUS, 0);
        arrayMap.put(METADATA_KEY_EXTRAS, 5);
    }

    MediaMetadata() {
    }

    MediaMetadata(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.mBundle = bundle2;
        bundle2.setClassLoader(MediaMetadata.class.getClassLoader());
    }

    public boolean containsKey(String str) {
        if (str == null) {
            throw new NullPointerException("key shouldn't be null");
        }
        return this.mBundle.containsKey(str);
    }

    public CharSequence getText(String str) {
        if (str == null) {
            throw new NullPointerException("key shouldn't be null");
        }
        return this.mBundle.getCharSequence(str);
    }

    public String getMediaId() {
        return getString("android.media.metadata.MEDIA_ID");
    }

    public String getString(String str) {
        if (str == null) {
            throw new NullPointerException("key shouldn't be null");
        }
        CharSequence charSequence = this.mBundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public long getLong(String str) {
        if (str == null) {
            throw new NullPointerException("key shouldn't be null");
        }
        return this.mBundle.getLong(str, 0L);
    }

    public Rating getRating(String str) {
        if (str == null) {
            throw new NullPointerException("key shouldn't be null");
        }
        try {
            return (Rating) ParcelUtils.getVersionedParcelable(this.mBundle, str);
        } catch (Exception e) {
            Log.w(TAG, "Failed to retrieve a key as Rating.", e);
            return null;
        }
    }

    public float getFloat(String str) {
        if (str == null) {
            throw new NullPointerException("key shouldn't be null");
        }
        return this.mBundle.getFloat(str);
    }

    public Bitmap getBitmap(String str) {
        if (str == null) {
            throw new NullPointerException("key shouldn't be null");
        }
        try {
            return (Bitmap) this.mBundle.getParcelable(str);
        } catch (Exception e) {
            Log.w(TAG, "Failed to retrieve a key as Bitmap.", e);
            return null;
        }
    }

    public Bundle getExtras() {
        try {
            return this.mBundle.getBundle(METADATA_KEY_EXTRAS);
        } catch (Exception unused) {
            Log.w(TAG, "Failed to retrieve an extra");
            return null;
        }
    }

    public int size() {
        return this.mBundle.size();
    }

    public Set<String> keySet() {
        return this.mBundle.keySet();
    }

    public String toString() {
        return this.mBundle.toString();
    }

    public Object getObject(String str) {
        if (str == null) {
            throw new NullPointerException("key shouldn't be null");
        }
        return this.mBundle.get(str);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean z) {
        synchronized (this.mBundle) {
            if (this.mParcelableWithoutBitmapBundle == null) {
                this.mParcelableWithoutBitmapBundle = new Bundle(this.mBundle);
                ArrayList arrayList = new ArrayList();
                for (String str : this.mBundle.keySet()) {
                    Object obj = this.mBundle.get(str);
                    if (obj instanceof Bitmap) {
                        arrayList.add(MediaParcelUtils.toParcelable(new BitmapEntry(str, (Bitmap) obj)));
                        this.mParcelableWithoutBitmapBundle.remove(str);
                    }
                }
                this.mBitmapListSlice = new ParcelImplListSlice(arrayList);
            }
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        Bundle bundle = this.mParcelableWithoutBitmapBundle;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.mBundle = bundle;
        ParcelImplListSlice parcelImplListSlice = this.mBitmapListSlice;
        if (parcelImplListSlice != null) {
            Iterator<ParcelImpl> it = parcelImplListSlice.getList().iterator();
            while (it.hasNext()) {
                BitmapEntry bitmapEntry = (BitmapEntry) MediaParcelUtils.fromParcelable(it.next());
                this.mBundle.putParcelable(bitmapEntry.getKey(), bitmapEntry.getBitmap());
            }
        }
    }

    public static final class Builder {
        final Bundle mBundle;

        public Builder() {
            this.mBundle = new Bundle();
        }

        public Builder(MediaMetadata mediaMetadata) {
            this.mBundle = new Bundle(mediaMetadata.mBundle);
        }

        Builder(Bundle bundle) {
            this.mBundle = new Bundle(bundle);
        }

        public Builder putText(String str, CharSequence charSequence) {
            if (str == null) {
                throw new NullPointerException("key shouldn't be null");
            }
            if (MediaMetadata.METADATA_KEYS_TYPE.containsKey(str) && MediaMetadata.METADATA_KEYS_TYPE.get(str).intValue() != 1) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
            }
            this.mBundle.putCharSequence(str, charSequence);
            return this;
        }

        public Builder putString(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("key shouldn't be null");
            }
            if (MediaMetadata.METADATA_KEYS_TYPE.containsKey(str) && MediaMetadata.METADATA_KEYS_TYPE.get(str).intValue() != 1) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
            }
            this.mBundle.putCharSequence(str, str2);
            return this;
        }

        public Builder putLong(String str, long j) {
            if (str == null) {
                throw new NullPointerException("key shouldn't be null");
            }
            if (MediaMetadata.METADATA_KEYS_TYPE.containsKey(str) && MediaMetadata.METADATA_KEYS_TYPE.get(str).intValue() != 0) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
            }
            this.mBundle.putLong(str, j);
            return this;
        }

        public Builder putRating(String str, Rating rating) {
            if (str == null) {
                throw new NullPointerException("key shouldn't be null");
            }
            if (MediaMetadata.METADATA_KEYS_TYPE.containsKey(str) && MediaMetadata.METADATA_KEYS_TYPE.get(str).intValue() != 3) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
            }
            ParcelUtils.putVersionedParcelable(this.mBundle, str, rating);
            return this;
        }

        public Builder putBitmap(String str, Bitmap bitmap) {
            if (str == null) {
                throw new NullPointerException("key shouldn't be null");
            }
            if (MediaMetadata.METADATA_KEYS_TYPE.containsKey(str) && MediaMetadata.METADATA_KEYS_TYPE.get(str).intValue() != 2) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
            }
            this.mBundle.putParcelable(str, bitmap);
            return this;
        }

        public Builder putFloat(String str, float f) {
            if (str == null) {
                throw new NullPointerException("key shouldn't be null");
            }
            if (MediaMetadata.METADATA_KEYS_TYPE.containsKey(str) && MediaMetadata.METADATA_KEYS_TYPE.get(str).intValue() != 4) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a float");
            }
            this.mBundle.putFloat(str, f);
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.mBundle.putBundle(MediaMetadata.METADATA_KEY_EXTRAS, bundle);
            return this;
        }

        public MediaMetadata build() {
            return new MediaMetadata(this.mBundle);
        }
    }

    static final class BitmapEntry implements VersionedParcelable {
        static final int BITMAP_SIZE_LIMIT_IN_BYTES = 262144;
        Bitmap mBitmap;
        String mKey;

        BitmapEntry() {
        }

        BitmapEntry(String str, Bitmap bitmap) {
            this.mKey = str;
            this.mBitmap = bitmap;
            int bitmapSizeInBytes = getBitmapSizeInBytes(bitmap);
            if (bitmapSizeInBytes > 262144) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                double dSqrt = Math.sqrt(262144.0d / ((double) bitmapSizeInBytes));
                int i = (int) (((double) width) * dSqrt);
                int i2 = (int) (((double) height) * dSqrt);
                Log.i(MediaMetadata.TAG, "Scaling large bitmap of " + width + "x" + height + " into " + i + "x" + i2);
                this.mBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
            }
        }

        String getKey() {
            return this.mKey;
        }

        Bitmap getBitmap() {
            return this.mBitmap;
        }

        private int getBitmapSizeInBytes(Bitmap bitmap) {
            return BitmapCompat.getAllocationByteCount(bitmap);
        }
    }
}
