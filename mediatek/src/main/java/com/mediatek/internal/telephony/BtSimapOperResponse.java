package com.mediatek.internal.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public class BtSimapOperResponse implements Parcelable {
    public static final int SUCCESS = 0;
    public static final int ERR_NO_REASON_DEFINED = 1;
    public static final int ERR_CARD_NOT_ACCESSIBLE = 2;
    public static final int ERR_CARD_POWERED_OFF = 3;
    public static final int ERR_CARD_REMOVED = 4;
    public static final int ERR_CARD_POWERED_ON = 5;
    public static final int ERR_DATA_NOT_AVAILABLE = 6;
    public static final int ERR_NOT_SUPPORTED = 7;
    static final int UNKNOWN_PROTOCOL_TYPE = -1;

    public static final Creator<BtSimapOperResponse> CREATOR = new Creator() {
        public BtSimapOperResponse createFromParcel(Parcel in) {
            return new BtSimapOperResponse(in);
        }

        public BtSimapOperResponse[] newArray(int size) {
            return new BtSimapOperResponse[size];
        }
    };

    public BtSimapOperResponse() {
        throw new UnsupportedOperationException("STUB");
    }

    public BtSimapOperResponse(Parcel in) {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isCurTypeExist() {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isSupportTypeExist() {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isAtrExist() {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isApduExist() {
        throw new UnsupportedOperationException("STUB");
    }

    public int getCurType() {
        throw new UnsupportedOperationException("STUB");
    }

    public int getSupportType() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getAtrString() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getApduString() {
        throw new UnsupportedOperationException("STUB");
    }

    public void setCurType(int nType) {
        throw new UnsupportedOperationException("STUB");
    }

    public void setSupportType(int nType) {
        throw new UnsupportedOperationException("STUB");
    }

    public void setAtrString(String strVal) {
        throw new UnsupportedOperationException("STUB");
    }

    public void setApduString(String strVal) {
        throw new UnsupportedOperationException("STUB");
    }

    public void readFromParcel(Parcel source) {
        throw new UnsupportedOperationException("STUB");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("STUB");
    }

    public void writeToParcel(Parcel dest, int flags) {
        throw new UnsupportedOperationException("STUB");
    }
}
