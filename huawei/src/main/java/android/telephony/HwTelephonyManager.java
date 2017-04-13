package android.telephony;

public class HwTelephonyManager {
    public static final String CARD_TYPE_SIM1 = "gsm.sim1.type";
    public static final String CARD_TYPE_SIM2 = "gsm.sim2.type";
    public static final int CT_NATIONAL_ROAMING_CARD = 41;
    public static final int CU_DUAL_MODE_CARD = 42;
    public static final int DUAL_MODE_CG_CARD = 40;
    public static final int DUAL_MODE_TELECOM_LTE_CARD = 43;
    public static final int DUAL_MODE_UG_CARD = 50;
    public static final int EXTRA_VALUE_NEW_SIM = 1;
    public static final int EXTRA_VALUE_NOCHANGE = 4;
    public static final int EXTRA_VALUE_REMOVE_SIM = 2;
    public static final int EXTRA_VALUE_REPOSITION_SIM = 3;
    public static final String INTENT_KEY_DETECT_STATUS = "simDetectStatus";
    public static final String INTENT_KEY_NEW_SIM_SLOT = "newSIMSlot";
    public static final String INTENT_KEY_NEW_SIM_STATUS = "newSIMStatus";
    public static final String INTENT_KEY_SIM_COUNT = "simCount";
    public static final int SINGLE_MODE_OVER_SEA_RUIM_CARD = 35;
    public static final int SINGLE_MODE_RUIM_CARD = 30;
    public static final int SINGLE_MODE_SIM_CARD = 10;
    public static final int SINGLE_MODE_USIM_CARD = 20;
    public static final int UNKNOWN_CARD = -1;

    public HwTelephonyManager() {
        super();
    }

    public int applyVSimPricePack(String arg8, int arg9, int arg10, String arg11) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean checkCdmaSlaveCardMode(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public Boolean clearTrafficData() {
        throw new UnsupportedOperationException("STUB");
    }

    public void closeRrc() {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean cmdForECInfo(int arg2, int arg3, byte[] arg4) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean disableVSim() {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean dsFlowCfg(int arg2, int arg3, int arg4, int arg5) {
        throw new UnsupportedOperationException("STUB");
    }

    public int enableVSim(String arg8, int arg9, int arg10, String arg11, String arg12) {
        throw new UnsupportedOperationException("STUB");
    }

    public int enableVSim(String arg8, int arg9, int arg10, String arg11, String arg12, int arg13) {
        throw new UnsupportedOperationException("STUB");
    }

    public int getCardType(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public String getCdmaGsmImsi() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getCdmaMlplVersion() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getCdmaMsplVersion() {
        throw new UnsupportedOperationException("STUB");
    }

    public CellLocation getCellLocation(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public int getCpserr(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public int getDataState(long arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public static HwTelephonyManager getDefault() {
        throw new UnsupportedOperationException("STUB");
    }

    public int getDefault4GSlotId() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getDevSubMode() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getDevSubMode(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public int getDeviceNetworkCountryIso() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getIccATR() {
        throw new UnsupportedOperationException("STUB");
    }

    public int getLteServiceAbility() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getMeid() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getMeid(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public int getOperatorWithDeviceCustomed() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getPesn() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getPesn(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public int getPreferredDataSubscription() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getPreferredNetworkTypeForVSim() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getPreferredNetworkTypeForVSim(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public String getRegPlmn(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public int getSimMode(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public int getSimStateForVSim(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public int getSimStateViaSysinfoEx(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public int getSpecCardType(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public int getSubState(long arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public String getTrafficData() {
        throw new UnsupportedOperationException("STUB");
    }

    public int getUserReservedSubId() {
        throw new UnsupportedOperationException("STUB");
    }

    public int getVSimCurCardType() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getVSimNetworkCountryIso() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getVSimNetworkOperator() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getVSimNetworkOperatorName() {
        throw new UnsupportedOperationException("STUB");
    }

    public int getVSimNetworkType() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getVSimNetworkTypeName() {
        throw new UnsupportedOperationException("STUB");
    }

    public int getVSimOccupiedSubId() {
        throw new UnsupportedOperationException("STUB");
    }

    public int getVSimPlatformCapability() {
        throw new UnsupportedOperationException("STUB");
    }

    public int getVSimState() {
        throw new UnsupportedOperationException("STUB");
    }

    public int getVSimSubId() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getVSimSubscriberId() {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean getVSimULOnlyMode() {
        throw new UnsupportedOperationException("STUB");
    }

    public int getVsimAvailableNetworks(int arg2, int arg3) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean getWaitingSwitchBalongSlot() {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean hasHardIccCardForVSim(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean hasIccCardForVSim(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean hasVSimIccCard() {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isCDMASimCard(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isCTCdmaCardInGsmMode() {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isCTSimCard(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isCardPresent(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isCardUimLocked(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isChinaTelecom(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isDomesticCard(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isFullNetworkSupported() {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isLTESupported() {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isNeedToRadioPowerOn(long arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isPlatformSupportVsim() {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isRadioOn(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isSubDeactivedByPowerOff(long arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isVSimEnabled() {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isVSimInProcess() {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isVSimOn() {
        throw new UnsupportedOperationException("STUB");
    }

    public int maxVSimModemCount() {
        throw new UnsupportedOperationException("STUB");
    }

    public void recoverSimMode() {
        throw new UnsupportedOperationException("STUB");
    }

    public int setApn(int arg8, int arg9, String arg10) {
        throw new UnsupportedOperationException("STUB");
    }

    public void setLteServiceAbility(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public void setUserPrefDataSlotId(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean setUserReservedSubId(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean setVSimULOnlyMode(boolean arg2) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean switchVSimWorkMode(int arg2) {
        throw new UnsupportedOperationException("STUB");
    }
}

