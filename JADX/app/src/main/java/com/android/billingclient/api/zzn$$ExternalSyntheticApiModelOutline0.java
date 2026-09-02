package com.android.billingclient.api;

import android.app.ApplicationExitInfo;
import android.app.NotificationChannel;
import android.content.pm.ApkChecksum;
import android.content.res.loader.ResourcesLoader;
import android.graphics.ImageDecoder;
import android.media.ApplicationMediaCapabilities;
import android.media.ExifInterface;
import android.media.MediaCodec;
import dalvik.system.DelegateLastClassLoader;
import java.io.InputStream;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzn$$ExternalSyntheticApiModelOutline0 {
    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ ApplicationExitInfo m350m(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ NotificationChannel m352m(String str, CharSequence charSequence, int i) {
        return new NotificationChannel(str, charSequence, i);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ ApkChecksum m357m(Object obj) {
        return (ApkChecksum) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ ResourcesLoader m358m() {
        return new ResourcesLoader();
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ ImageDecoder.Source m366m(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ ApplicationMediaCapabilities.Builder m368m() {
        return new ApplicationMediaCapabilities.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ ExifInterface m373m(InputStream inputStream) {
        return new ExifInterface(inputStream);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern m374m(int i, int i2) {
        return new MediaCodec.CryptoInfo.Pattern(i, i2);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ DelegateLastClassLoader m383m(String str, ClassLoader classLoader) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m394m() {
    }
}
