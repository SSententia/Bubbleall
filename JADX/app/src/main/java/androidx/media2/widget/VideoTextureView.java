package androidx.media2.widget;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes.dex */
class VideoTextureView extends TextureView implements VideoViewInterface, TextureView.SurfaceTextureListener {
    private PlayerWrapper mPlayer;
    private Surface mSurface;
    VideoViewInterface.SurfaceListener mSurfaceListener;

    @Override // androidx.media2.widget.VideoViewInterface
    public int getViewType() {
        return 1;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    VideoTextureView(Context context) {
        super(context, null);
        setSurfaceTextureListener(this);
    }

    @Override // androidx.media2.widget.VideoViewInterface
    public boolean assignSurfaceToPlayerWrapper(PlayerWrapper playerWrapper) {
        this.mPlayer = playerWrapper;
        if (playerWrapper == null || !hasAvailableSurface()) {
            return false;
        }
        playerWrapper.setSurface(this.mSurface).addListener(new Runnable() { // from class: androidx.media2.widget.VideoTextureView.1
            @Override // java.lang.Runnable
            public void run() {
                if (VideoTextureView.this.mSurfaceListener != null) {
                    VideoTextureView.this.mSurfaceListener.onSurfaceTakeOverDone(VideoTextureView.this);
                }
            }
        }, ContextCompat.getMainExecutor(getContext()));
        return true;
    }

    @Override // androidx.media2.widget.VideoViewInterface
    public void setSurfaceListener(VideoViewInterface.SurfaceListener surfaceListener) {
        this.mSurfaceListener = surfaceListener;
    }

    @Override // androidx.media2.widget.VideoViewInterface
    public boolean hasAvailableSurface() {
        Surface surface = this.mSurface;
        return surface != null && surface.isValid();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.mSurface = new Surface(surfaceTexture);
        VideoViewInterface.SurfaceListener surfaceListener = this.mSurfaceListener;
        if (surfaceListener != null) {
            surfaceListener.onSurfaceCreated(this, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        VideoViewInterface.SurfaceListener surfaceListener = this.mSurfaceListener;
        if (surfaceListener != null) {
            surfaceListener.onSurfaceChanged(this, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        VideoViewInterface.SurfaceListener surfaceListener = this.mSurfaceListener;
        if (surfaceListener != null) {
            surfaceListener.onSurfaceDestroyed(this);
        }
        this.mSurface = null;
        return true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        PlayerWrapper playerWrapper = this.mPlayer;
        int width = playerWrapper != null ? playerWrapper.getVideoSize().getWidth() : 0;
        PlayerWrapper playerWrapper2 = this.mPlayer;
        int height = playerWrapper2 != null ? playerWrapper2.getVideoSize().getHeight() : 0;
        if (width == 0 || height == 0) {
            setMeasuredDimension(getDefaultSize(width, i), getDefaultSize(height, i2));
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            int i4 = width * size2;
            int i5 = size * height;
            if (i4 < i5) {
                size = i4 / height;
            } else if (i4 > i5) {
                size2 = i5 / width;
            }
        } else if (mode == 1073741824) {
            int i6 = (height * size) / width;
            size2 = (mode2 != Integer.MIN_VALUE || i6 <= size2) ? i6 : size2 | 16777216;
        } else if (mode2 == 1073741824) {
            int i7 = (width * size2) / height;
            size = (mode != Integer.MIN_VALUE || i7 <= size) ? i7 : size | 16777216;
        } else {
            if (mode2 != Integer.MIN_VALUE || height <= size2) {
                i3 = width;
                size2 = height;
            } else {
                i3 = (size2 * width) / height;
            }
            if (mode != Integer.MIN_VALUE || i3 <= size) {
                size = i3;
            } else {
                size2 = (height * size) / width;
            }
        }
        setMeasuredDimension(size, size2);
    }
}
