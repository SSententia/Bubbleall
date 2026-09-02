package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzo extends zza implements zzq {
    zzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j);
        zzc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzc.zzd(parcelZza, bundle);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzc(43, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j);
        zzc(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void generateEventId(zzt zztVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zztVar);
        zzc(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void getAppInstanceId(zzt zztVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zztVar);
        zzc(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void getCachedAppInstanceId(zzt zztVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zztVar);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void getConditionalUserProperties(String str, String str2, zzt zztVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzc.zze(parcelZza, zztVar);
        zzc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void getCurrentScreenClass(zzt zztVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zztVar);
        zzc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void getCurrentScreenName(zzt zztVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zztVar);
        zzc(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void getGmpAppId(zzt zztVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zztVar);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void getMaxUserProperties(String str, zzt zztVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc.zze(parcelZza, zztVar);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void getTestFlag(zzt zztVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zztVar);
        parcelZza.writeInt(i);
        zzc(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void getUserProperties(String str, String str2, boolean z, zzt zztVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzc.zzb(parcelZza, z);
        zzc.zze(parcelZza, zztVar);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void initForTests(Map map) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void initialize(IObjectWrapper iObjectWrapper, zzz zzzVar, long j) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, iObjectWrapper);
        zzc.zzd(parcelZza, zzzVar);
        parcelZza.writeLong(j);
        zzc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void isDataCollectionEnabled(zzt zztVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzc.zzd(parcelZza, bundle);
        zzc.zzb(parcelZza, z);
        zzc.zzb(parcelZza, z2);
        parcelZza.writeLong(j);
        zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzt zztVar, long j) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(5);
        parcelZza.writeString(str);
        zzc.zze(parcelZza, iObjectWrapper);
        zzc.zze(parcelZza, iObjectWrapper2);
        zzc.zze(parcelZza, iObjectWrapper3);
        zzc(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, iObjectWrapper);
        zzc.zzd(parcelZza, bundle);
        parcelZza.writeLong(j);
        zzc(27, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeLong(j);
        zzc(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeLong(j);
        zzc(29, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeLong(j);
        zzc(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzt zztVar, long j) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, iObjectWrapper);
        zzc.zze(parcelZza, zztVar);
        parcelZza.writeLong(j);
        zzc(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeLong(j);
        zzc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeLong(j);
        zzc(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void performAction(Bundle bundle, zzt zztVar, long j) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, bundle);
        zzc.zze(parcelZza, zztVar);
        parcelZza.writeLong(j);
        zzc(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void registerOnMeasurementEventListener(zzw zzwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzwVar);
        zzc(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, bundle);
        parcelZza.writeLong(j);
        zzc(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, bundle);
        parcelZza.writeLong(j);
        zzc(44, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, bundle);
        parcelZza.writeLong(j);
        zzc(45, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeLong(j);
        zzc(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, z);
        zzc(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, bundle);
        zzc(42, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void setEventInterceptor(zzw zzwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzwVar);
        zzc(34, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void setInstanceIdProvider(zzy zzyVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, z);
        parcelZza.writeLong(j);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void setMinimumSessionDuration(long j) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzc(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void setUserId(String str, long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzc.zze(parcelZza, iObjectWrapper);
        zzc.zzb(parcelZza, z);
        parcelZza.writeLong(j);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzq
    public final void unregisterOnMeasurementEventListener(zzw zzwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzwVar);
        zzc(36, parcelZza);
    }
}
