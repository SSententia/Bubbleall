package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzp extends zzb implements zzq {
    public zzp() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzq asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzo(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzt zzrVar;
        zzt zzrVar2 = null;
        zzt zzrVar3 = null;
        zzt zzrVar4 = null;
        zzw zzuVar = null;
        zzw zzuVar2 = null;
        zzw zzuVar3 = null;
        zzt zzrVar5 = null;
        zzt zzrVar6 = null;
        zzt zzrVar7 = null;
        zzt zzrVar8 = null;
        zzt zzrVar9 = null;
        zzt zzrVar10 = null;
        zzy zzxVar = null;
        zzt zzrVar11 = null;
        zzt zzrVar12 = null;
        zzt zzrVar13 = null;
        zzt zzrVar14 = null;
        switch (i) {
            case 1:
                initialize(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzz) zzc.zzc(parcel, zzz.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) zzc.zzc(parcel, Bundle.CREATOR), zzc.zza(parcel), zzc.zza(parcel), parcel.readLong());
                break;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) zzc.zzc(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzrVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzrVar = iInterfaceQueryLocalInterface instanceof zzt ? (zzt) iInterfaceQueryLocalInterface : new zzr(strongBinder);
                }
                logEventAndBundle(string, string2, bundle, zzrVar, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzc.zza(parcel), parcel.readLong());
                break;
            case 5:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean zZza = zzc.zza(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzrVar2 = iInterfaceQueryLocalInterface2 instanceof zzt ? (zzt) iInterfaceQueryLocalInterface2 : new zzr(strongBinder2);
                }
                getUserProperties(string3, string4, zZza, zzrVar2);
                break;
            case 6:
                String string5 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzrVar14 = iInterfaceQueryLocalInterface3 instanceof zzt ? (zzt) iInterfaceQueryLocalInterface3 : new zzr(strongBinder3);
                }
                getMaxUserProperties(string5, zzrVar14);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) zzc.zzc(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) zzc.zzc(parcel, Bundle.CREATOR));
                break;
            case 10:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzrVar13 = iInterfaceQueryLocalInterface4 instanceof zzt ? (zzt) iInterfaceQueryLocalInterface4 : new zzr(strongBinder4);
                }
                getConditionalUserProperties(string6, string7, zzrVar13);
                break;
            case 11:
                setMeasurementEnabled(zzc.zza(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzrVar12 = iInterfaceQueryLocalInterface5 instanceof zzt ? (zzt) iInterfaceQueryLocalInterface5 : new zzr(strongBinder5);
                }
                getCurrentScreenName(zzrVar12);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzrVar11 = iInterfaceQueryLocalInterface6 instanceof zzt ? (zzt) iInterfaceQueryLocalInterface6 : new zzr(strongBinder6);
                }
                getCurrentScreenClass(zzrVar11);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zzxVar = iInterfaceQueryLocalInterface7 instanceof zzy ? (zzy) iInterfaceQueryLocalInterface7 : new zzx(strongBinder7);
                }
                setInstanceIdProvider(zzxVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzrVar10 = iInterfaceQueryLocalInterface8 instanceof zzt ? (zzt) iInterfaceQueryLocalInterface8 : new zzr(strongBinder8);
                }
                getCachedAppInstanceId(zzrVar10);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzrVar9 = iInterfaceQueryLocalInterface9 instanceof zzt ? (zzt) iInterfaceQueryLocalInterface9 : new zzr(strongBinder9);
                }
                getAppInstanceId(zzrVar9);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzrVar8 = iInterfaceQueryLocalInterface10 instanceof zzt ? (zzt) iInterfaceQueryLocalInterface10 : new zzr(strongBinder10);
                }
                getGmpAppId(zzrVar8);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzrVar7 = iInterfaceQueryLocalInterface11 instanceof zzt ? (zzt) iInterfaceQueryLocalInterface11 : new zzr(strongBinder11);
                }
                generateEventId(zzrVar7);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (Bundle) zzc.zzc(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                onActivityPaused(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzrVar6 = iInterfaceQueryLocalInterface12 instanceof zzt ? (zzt) iInterfaceQueryLocalInterface12 : new zzr(strongBinder12);
                }
                onActivitySaveInstanceState(iObjectWrapperAsInterface, zzrVar6, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) zzc.zzc(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzrVar5 = iInterfaceQueryLocalInterface13 instanceof zzt ? (zzt) iInterfaceQueryLocalInterface13 : new zzr(strongBinder13);
                }
                performAction(bundle2, zzrVar5, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzuVar3 = iInterfaceQueryLocalInterface14 instanceof zzw ? (zzw) iInterfaceQueryLocalInterface14 : new zzu(strongBinder14);
                }
                setEventInterceptor(zzuVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzuVar2 = iInterfaceQueryLocalInterface15 instanceof zzw ? (zzw) iInterfaceQueryLocalInterface15 : new zzu(strongBinder15);
                }
                registerOnMeasurementEventListener(zzuVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzuVar = iInterfaceQueryLocalInterface16 instanceof zzw ? (zzw) iInterfaceQueryLocalInterface16 : new zzu(strongBinder16);
                }
                unregisterOnMeasurementEventListener(zzuVar);
                break;
            case 37:
                initForTests(zzc.zzf(parcel));
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzrVar4 = iInterfaceQueryLocalInterface17 instanceof zzt ? (zzt) iInterfaceQueryLocalInterface17 : new zzr(strongBinder17);
                }
                getTestFlag(zzrVar4, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(zzc.zza(parcel));
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzrVar3 = iInterfaceQueryLocalInterface18 instanceof zzt ? (zzt) iInterfaceQueryLocalInterface18 : new zzr(strongBinder18);
                }
                isDataCollectionEnabled(zzrVar3);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) zzc.zzc(parcel, Bundle.CREATOR));
                break;
            case 43:
                clearMeasurementEnabled(parcel.readLong());
                break;
            case 44:
                setConsent((Bundle) zzc.zzc(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 45:
                setConsentThirdParty((Bundle) zzc.zzc(parcel, Bundle.CREATOR), parcel.readLong());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
