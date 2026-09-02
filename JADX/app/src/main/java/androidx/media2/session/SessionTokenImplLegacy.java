package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.core.util.ObjectsCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import androidx.versionedparcelable.VersionedParcelable;

/* JADX INFO: loaded from: classes.dex */
final class SessionTokenImplLegacy extends CustomVersionedParcelable implements SessionToken.SessionTokenImpl {
    ComponentName mComponentName;
    Bundle mExtras;
    private MediaSessionCompat.Token mLegacyToken;
    Bundle mLegacyTokenBundle;
    String mPackageName;
    int mType;
    int mUid;

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public boolean isLegacySession() {
        return true;
    }

    SessionTokenImplLegacy(MediaSessionCompat.Token token, String str, int i, Bundle bundle) {
        if (token == null) {
            throw new NullPointerException("token shouldn't be null");
        }
        if (str == null) {
            throw new NullPointerException("packageName shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName shouldn't be empty");
        }
        this.mLegacyToken = token;
        this.mUid = i;
        this.mPackageName = str;
        this.mComponentName = null;
        this.mType = 100;
        this.mExtras = bundle;
    }

    SessionTokenImplLegacy(ComponentName componentName, int i) {
        if (componentName == null) {
            throw new NullPointerException("serviceComponent shouldn't be null");
        }
        this.mLegacyToken = null;
        this.mUid = i;
        this.mType = 101;
        this.mPackageName = componentName.getPackageName();
        this.mComponentName = componentName;
        this.mExtras = null;
    }

    SessionTokenImplLegacy() {
    }

    public int hashCode() {
        return ObjectsCompat.hash(Integer.valueOf(this.mType), this.mComponentName, this.mLegacyToken);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionTokenImplLegacy)) {
            return false;
        }
        SessionTokenImplLegacy sessionTokenImplLegacy = (SessionTokenImplLegacy) obj;
        int i = this.mType;
        if (i != sessionTokenImplLegacy.mType) {
            return false;
        }
        if (i == 100) {
            return ObjectsCompat.equals(this.mLegacyToken, sessionTokenImplLegacy.mLegacyToken);
        }
        if (i != 101) {
            return false;
        }
        return ObjectsCompat.equals(this.mComponentName, sessionTokenImplLegacy.mComponentName);
    }

    public String toString() {
        return "SessionToken {legacyToken=" + this.mLegacyToken + "}";
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public int getUid() {
        return this.mUid;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public String getPackageName() {
        return this.mPackageName;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public String getServiceName() {
        ComponentName componentName = this.mComponentName;
        if (componentName == null) {
            return null;
        }
        return componentName.getClassName();
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public int getType() {
        return this.mType != 101 ? 0 : 2;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public Bundle getExtras() {
        return this.mExtras;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public Object getBinder() {
        return this.mLegacyToken;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean z) {
        MediaSessionCompat.Token token = this.mLegacyToken;
        if (token != null) {
            synchronized (token) {
                VersionedParcelable session2Token = this.mLegacyToken.getSession2Token();
                this.mLegacyToken.setSession2Token(null);
                this.mLegacyTokenBundle = this.mLegacyToken.toBundle();
                this.mLegacyToken.setSession2Token(session2Token);
            }
            return;
        }
        this.mLegacyTokenBundle = null;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        this.mLegacyToken = MediaSessionCompat.Token.fromBundle(this.mLegacyTokenBundle);
    }
}
