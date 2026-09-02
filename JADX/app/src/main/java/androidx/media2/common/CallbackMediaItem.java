package androidx.media2.common;

import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class CallbackMediaItem extends MediaItem {
    private final DataSourceCallback mDataSourceCallback;

    CallbackMediaItem(Builder builder) {
        super(builder);
        this.mDataSourceCallback = builder.mDataSourceCallback;
    }

    public DataSourceCallback getDataSourceCallback() {
        return this.mDataSourceCallback;
    }

    public static final class Builder extends MediaItem.Builder {
        DataSourceCallback mDataSourceCallback;

        public Builder(DataSourceCallback dataSourceCallback) {
            Preconditions.checkNotNull(dataSourceCallback);
            this.mDataSourceCallback = dataSourceCallback;
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
        public CallbackMediaItem build() {
            return new CallbackMediaItem(this);
        }
    }
}
