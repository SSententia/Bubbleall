package androidx.media2.common;

import androidx.versionedparcelable.ParcelImpl;
import androidx.versionedparcelable.ParcelUtils;
import androidx.versionedparcelable.VersionedParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MediaParcelUtils {
    public static final String TAG = "MediaParcelUtils";

    public static ParcelImpl toParcelable(VersionedParcelable versionedParcelable) {
        if (versionedParcelable instanceof MediaItem) {
            return new MediaItemParcelImpl((MediaItem) versionedParcelable);
        }
        return (ParcelImpl) ParcelUtils.toParcelable(versionedParcelable);
    }

    public static List<ParcelImpl> toParcelableList(List<? extends VersionedParcelable> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(toParcelable(list.get(i)));
        }
        return arrayList;
    }

    public static <T extends VersionedParcelable> T fromParcelable(ParcelImpl parcelImpl) {
        return (T) ParcelUtils.fromParcelable(parcelImpl);
    }

    public static <T extends VersionedParcelable> List<T> fromParcelableList(List<ParcelImpl> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(fromParcelable(list.get(i)));
        }
        return arrayList;
    }

    private MediaParcelUtils() {
    }

    private static class MediaItemParcelImpl extends ParcelImpl {
        private final MediaItem mItem;

        MediaItemParcelImpl(MediaItem mediaItem) {
            super(new MediaItem(mediaItem));
            this.mItem = mediaItem;
        }

        @Override // androidx.versionedparcelable.ParcelImpl
        public MediaItem getVersionedParcel() {
            return this.mItem;
        }
    }
}
