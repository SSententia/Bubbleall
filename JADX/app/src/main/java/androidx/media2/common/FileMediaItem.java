package androidx.media2.common;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.util.Preconditions;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class FileMediaItem extends MediaItem {
    public static final long FD_LENGTH_UNKNOWN = 576460752303423487L;
    private static final String TAG = "FileMediaItem";
    private boolean mClosed;
    private final long mFDLength;
    private final long mFDOffset;
    private final Object mLock;
    private final ParcelFileDescriptor mPFD;
    private int mRefCount;

    FileMediaItem(Builder builder) {
        super(builder);
        this.mLock = new Object();
        this.mPFD = builder.mPFD;
        this.mFDOffset = builder.mFDOffset;
        this.mFDLength = builder.mFDLength;
    }

    public ParcelFileDescriptor getParcelFileDescriptor() {
        return this.mPFD;
    }

    public long getFileDescriptorOffset() {
        return this.mFDOffset;
    }

    public long getFileDescriptorLength() {
        return this.mFDLength;
    }

    public void increaseRefCount() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                Log.w(TAG, "ParcelFileDescriptorClient is already closed.");
            } else {
                this.mRefCount++;
            }
        }
    }

    public void decreaseRefCount() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                Log.w(TAG, "ParcelFileDescriptorClient is already closed.");
                return;
            }
            int i = this.mRefCount - 1;
            this.mRefCount = i;
            try {
                if (i <= 0) {
                    try {
                        ParcelFileDescriptor parcelFileDescriptor = this.mPFD;
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        Log.e(TAG, "Failed to close the ParcelFileDescriptor " + this.mPFD, e);
                    }
                    this.mClosed = true;
                }
            } catch (Throwable th) {
                this.mClosed = true;
                throw th;
            }
        }
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mClosed;
        }
        return z;
    }

    public void close() throws IOException {
        synchronized (this.mLock) {
            ParcelFileDescriptor parcelFileDescriptor = this.mPFD;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
            this.mClosed = true;
        }
    }

    public static final class Builder extends MediaItem.Builder {
        long mFDLength;
        long mFDOffset;
        ParcelFileDescriptor mPFD;

        public Builder(ParcelFileDescriptor parcelFileDescriptor) {
            this.mFDOffset = 0L;
            this.mFDLength = 576460752303423487L;
            Preconditions.checkNotNull(parcelFileDescriptor);
            this.mPFD = parcelFileDescriptor;
            this.mFDOffset = 0L;
            this.mFDLength = 576460752303423487L;
        }

        public Builder setFileDescriptorOffset(long j) {
            if (j < 0) {
                j = 0;
            }
            this.mFDOffset = j;
            return this;
        }

        public Builder setFileDescriptorLength(long j) {
            if (j < 0) {
                j = 576460752303423487L;
            }
            this.mFDLength = j;
            return this;
        }

        @Override // androidx.media2.common.MediaItem.Builder
        public Builder setMetadata(MediaMetadata mediaMetadata) {
            return (Builder) super.setMetadata(mediaMetadata);
        }

        @Override // androidx.media2.common.MediaItem.Builder
        public Builder setStartPosition(long j) {
            return (Builder) super.setStartPosition(j);
        }

        @Override // androidx.media2.common.MediaItem.Builder
        public Builder setEndPosition(long j) {
            return (Builder) super.setEndPosition(j);
        }

        @Override // androidx.media2.common.MediaItem.Builder
        public FileMediaItem build() {
            return new FileMediaItem(this);
        }
    }
}
