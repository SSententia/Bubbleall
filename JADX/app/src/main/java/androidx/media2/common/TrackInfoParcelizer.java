package androidx.media2.common;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class TrackInfoParcelizer {
    public static SessionPlayer.TrackInfo read(VersionedParcel versionedParcel) {
        SessionPlayer.TrackInfo trackInfo = new SessionPlayer.TrackInfo();
        trackInfo.mId = versionedParcel.readInt(trackInfo.mId, 1);
        trackInfo.mTrackType = versionedParcel.readInt(trackInfo.mTrackType, 3);
        trackInfo.mParcelableExtras = versionedParcel.readBundle(trackInfo.mParcelableExtras, 4);
        trackInfo.onPostParceling();
        return trackInfo;
    }

    public static void write(SessionPlayer.TrackInfo trackInfo, VersionedParcel versionedParcel) {
        versionedParcel.setSerializationFlags(false, false);
        trackInfo.onPreParceling(versionedParcel.isStream());
        versionedParcel.writeInt(trackInfo.mId, 1);
        versionedParcel.writeInt(trackInfo.mTrackType, 3);
        versionedParcel.writeBundle(trackInfo.mParcelableExtras, 4);
    }
}
