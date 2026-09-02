package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.core.util.ObjectsCompat;

/* JADX INFO: loaded from: classes.dex */
final class SessionTokenImplBase implements SessionToken.SessionTokenImpl {
    ComponentName mComponentName;
    Bundle mExtras;
    IBinder mISession;
    String mPackageName;
    String mServiceName;
    int mType;
    int mUid;

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public boolean isLegacySession() {
        return false;
    }

    SessionTokenImplBase(ComponentName componentName, int i, int i2) {
        if (componentName == null) {
            throw new NullPointerException("serviceComponent shouldn't be null");
        }
        this.mComponentName = componentName;
        this.mPackageName = componentName.getPackageName();
        this.mServiceName = componentName.getClassName();
        this.mUid = i;
        this.mType = i2;
        this.mISession = null;
        this.mExtras = null;
    }

    SessionTokenImplBase(int i, int i2, String str, IMediaSession iMediaSession, Bundle bundle) {
        this.mUid = i;
        this.mType = i2;
        this.mPackageName = str;
        this.mServiceName = null;
        this.mComponentName = null;
        this.mISession = iMediaSession.asBinder();
        this.mExtras = bundle;
    }

    SessionTokenImplBase() {
    }

    public int hashCode() {
        return ObjectsCompat.hash(Integer.valueOf(this.mType), Integer.valueOf(this.mUid), this.mPackageName, this.mServiceName);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionTokenImplBase)) {
            return false;
        }
        SessionTokenImplBase sessionTokenImplBase = (SessionTokenImplBase) obj;
        return this.mUid == sessionTokenImplBase.mUid && TextUtils.equals(this.mPackageName, sessionTokenImplBase.mPackageName) && TextUtils.equals(this.mServiceName, sessionTokenImplBase.mServiceName) && this.mType == sessionTokenImplBase.mType && ObjectsCompat.equals(this.mISession, sessionTokenImplBase.mISession);
    }

    public String toString() {
        return "SessionToken {pkg=" + this.mPackageName + " type=" + this.mType + " service=" + this.mServiceName + " IMediaSession=" + this.mISession + " extras=" + this.mExtras + "}";
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
        return this.mServiceName;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public int getType() {
        return this.mType;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public Bundle getExtras() {
        return this.mExtras;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public Object getBinder() {
        return this.mISession;
    }
}
