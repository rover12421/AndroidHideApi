package com.mediatek.internal.telephony;

import android.net.LinkProperties;
import android.os.*;
import android.telephony.RadioAccessFamily;

public interface ITelephonyEx extends IInterface {
    Bundle queryNetworkLock(int var1, int var2) throws RemoteException;

    int supplyNetworkDepersonalization(int var1, String var2) throws RemoteException;

    void repollIccStateForNetworkLock(int var1, boolean var2) throws RemoteException;

    int setLine1Number(int var1, String var2, String var3) throws RemoteException;

    boolean isFdnEnabled(int var1) throws RemoteException;

    String getIccCardType(int var1) throws RemoteException;

    int getSvlteCardType(int var1) throws RemoteException;

    boolean isAppTypeSupported(int var1, int var2) throws RemoteException;

    boolean isTestIccCard(int var1) throws RemoteException;

    String getMvnoMatchType(int var1) throws RemoteException;

    String getMvnoPattern(int var1, String var2) throws RemoteException;

    String getNetworkOperatorNameGemini(int var1) throws RemoteException;

    String getNetworkOperatorNameUsingSub(int var1) throws RemoteException;

    String getNetworkOperatorGemini(int var1) throws RemoteException;

    String getNetworkOperatorUsingSub(int var1) throws RemoteException;

    int btSimapConnectSIM(int var1, BtSimapOperResponse var2) throws RemoteException;

    int btSimapDisconnectSIM() throws RemoteException;

    int btSimapApduRequest(int var1, String var2, BtSimapOperResponse var3) throws RemoteException;

    int btSimapResetSIM(int var1, BtSimapOperResponse var2) throws RemoteException;

    int btSimapPowerOnSIM(int var1, BtSimapOperResponse var2) throws RemoteException;

    int btSimapPowerOffSIM() throws RemoteException;

    byte[] simAkaAuthentication(int var1, int var2, byte[] var3, byte[] var4) throws RemoteException;

    byte[] simGbaAuthBootStrapMode(int var1, int var2, byte[] var3, byte[] var4) throws RemoteException;

    byte[] simGbaAuthNafMode(int var1, int var2, byte[] var3, byte[] var4) throws RemoteException;

    boolean broadcastIccUnlockIntent(int var1) throws RemoteException;

    boolean isRadioOffBySimManagement(int var1) throws RemoteException;

    int getPhoneCapability(int var1) throws RemoteException;

    void setPhoneCapability(int[] var1, int[] var2) throws RemoteException;

    boolean configSimSwap(boolean var1) throws RemoteException;

    boolean isSimSwapped() throws RemoteException;

    boolean isCapSwitchManualEnabled() throws RemoteException;

    String[] getCapSwitchManualList() throws RemoteException;

    String getLocatedPlmn(int var1) throws RemoteException;

    int getNetworkHideState(int var1) throws RemoteException;

    Bundle getServiceState(int var1) throws RemoteException;

    int[] getAdnStorageInfo(int var1) throws RemoteException;

    boolean isPhbReady(int var1) throws RemoteException;

    Bundle getScAddressUsingSubId(int var1) throws RemoteException;

    boolean setScAddressUsingSubId(int var1, String var2) throws RemoteException;

    boolean isAirplanemodeAvailableNow() throws RemoteException;

    int getLastDataConnectionFailCause(String var1, int var2) throws RemoteException;

    LinkProperties getLinkProperties(String var1, int var2) throws RemoteException;

    boolean setRadioCapability(RadioAccessFamily[] var1) throws RemoteException;

    boolean isCapabilitySwitching() throws RemoteException;

    void switchSvlteRatMode(int var1) throws RemoteException;

    void setSvlteRatMode(int var1, int var2) throws RemoteException;

    Bundle getSvlteServiceState(int var1) throws RemoteException;

    void switchRadioTechnology(int var1) throws RemoteException;

    void setRadioTechnology(int var1, int var2) throws RemoteException;

    void setTrmForPhone(int var1, int var2) throws RemoteException;

    String getSubscriberIdForLteDcPhone(int var1) throws RemoteException;

    String getSvlteImei(int var1) throws RemoteException;

    int getMainCapabilityPhoneId() throws RemoteException;

    boolean isAllowAirplaneModeChange() throws RemoteException;

    void initializeService(String var1) throws RemoteException;

    void finalizeService(String var1) throws RemoteException;

    boolean isInHomeNetwork(int var1) throws RemoteException;

    boolean setLteAccessStratumReport(boolean var1) throws RemoteException;

    boolean setLteUplinkDataTransfer(boolean var1, int var2) throws RemoteException;

    String getLteAccessStratumState() throws RemoteException;

    boolean isSharedDefaultApn() throws RemoteException;

    String getSvlteMeid(int var1) throws RemoteException;

    boolean isImsRegistered(int var1) throws RemoteException;

    boolean isVolteEnabled(int var1) throws RemoteException;

    boolean isWifiCallingEnabled(int var1) throws RemoteException;

    String getMeid() throws RemoteException;

    void setEccInProgress(boolean var1) throws RemoteException;

    boolean isEccInProgress() throws RemoteException;

    public abstract static class Stub extends Binder implements ITelephonyEx {
        private static final String DESCRIPTOR = "com.mediatek.internal.telephony.ITelephonyEx";
        static final int TRANSACTION_queryNetworkLock = 1;
        static final int TRANSACTION_supplyNetworkDepersonalization = 2;
        static final int TRANSACTION_repollIccStateForNetworkLock = 3;
        static final int TRANSACTION_setLine1Number = 4;
        static final int TRANSACTION_isFdnEnabled = 5;
        static final int TRANSACTION_getIccCardType = 6;
        static final int TRANSACTION_getSvlteCardType = 7;
        static final int TRANSACTION_isAppTypeSupported = 8;
        static final int TRANSACTION_isTestIccCard = 9;
        static final int TRANSACTION_getMvnoMatchType = 10;
        static final int TRANSACTION_getMvnoPattern = 11;
        static final int TRANSACTION_getNetworkOperatorNameGemini = 12;
        static final int TRANSACTION_getNetworkOperatorNameUsingSub = 13;
        static final int TRANSACTION_getNetworkOperatorGemini = 14;
        static final int TRANSACTION_getNetworkOperatorUsingSub = 15;
        static final int TRANSACTION_btSimapConnectSIM = 16;
        static final int TRANSACTION_btSimapDisconnectSIM = 17;
        static final int TRANSACTION_btSimapApduRequest = 18;
        static final int TRANSACTION_btSimapResetSIM = 19;
        static final int TRANSACTION_btSimapPowerOnSIM = 20;
        static final int TRANSACTION_btSimapPowerOffSIM = 21;
        static final int TRANSACTION_simAkaAuthentication = 22;
        static final int TRANSACTION_simGbaAuthBootStrapMode = 23;
        static final int TRANSACTION_simGbaAuthNafMode = 24;
        static final int TRANSACTION_broadcastIccUnlockIntent = 25;
        static final int TRANSACTION_isRadioOffBySimManagement = 26;
        static final int TRANSACTION_getPhoneCapability = 27;
        static final int TRANSACTION_setPhoneCapability = 28;
        static final int TRANSACTION_configSimSwap = 29;
        static final int TRANSACTION_isSimSwapped = 30;
        static final int TRANSACTION_isCapSwitchManualEnabled = 31;
        static final int TRANSACTION_getCapSwitchManualList = 32;
        static final int TRANSACTION_getLocatedPlmn = 33;
        static final int TRANSACTION_getNetworkHideState = 34;
        static final int TRANSACTION_getServiceState = 35;
        static final int TRANSACTION_getAdnStorageInfo = 36;
        static final int TRANSACTION_isPhbReady = 37;
        static final int TRANSACTION_getScAddressUsingSubId = 38;
        static final int TRANSACTION_setScAddressUsingSubId = 39;
        static final int TRANSACTION_isAirplanemodeAvailableNow = 40;
        static final int TRANSACTION_getLastDataConnectionFailCause = 41;
        static final int TRANSACTION_getLinkProperties = 42;
        static final int TRANSACTION_setRadioCapability = 43;
        static final int TRANSACTION_isCapabilitySwitching = 44;
        static final int TRANSACTION_switchSvlteRatMode = 45;
        static final int TRANSACTION_setSvlteRatMode = 46;
        static final int TRANSACTION_getSvlteServiceState = 47;
        static final int TRANSACTION_switchRadioTechnology = 48;
        static final int TRANSACTION_setRadioTechnology = 49;
        static final int TRANSACTION_setTrmForPhone = 50;
        static final int TRANSACTION_getSubscriberIdForLteDcPhone = 51;
        static final int TRANSACTION_getSvlteImei = 52;
        static final int TRANSACTION_getMainCapabilityPhoneId = 53;
        static final int TRANSACTION_isAllowAirplaneModeChange = 54;
        static final int TRANSACTION_initializeService = 55;
        static final int TRANSACTION_finalizeService = 56;
        static final int TRANSACTION_isInHomeNetwork = 57;
        static final int TRANSACTION_setLteAccessStratumReport = 58;
        static final int TRANSACTION_setLteUplinkDataTransfer = 59;
        static final int TRANSACTION_getLteAccessStratumState = 60;
        static final int TRANSACTION_isSharedDefaultApn = 61;
        static final int TRANSACTION_getSvlteMeid = 62;
        static final int TRANSACTION_isImsRegistered = 63;
        static final int TRANSACTION_isVolteEnabled = 64;
        static final int TRANSACTION_isWifiCallingEnabled = 65;
        static final int TRANSACTION_getMeid = 66;
        static final int TRANSACTION_setEccInProgress = 67;
        static final int TRANSACTION_isEccInProgress = 68;

        public Stub() {
            throw new UnsupportedOperationException("STUB");
        }

        public static ITelephonyEx asInterface(IBinder obj) {
            throw new UnsupportedOperationException("STUB");
        }

        public IBinder asBinder() {
            throw new UnsupportedOperationException("STUB");
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            throw new UnsupportedOperationException("STUB");
        }
    }
}
