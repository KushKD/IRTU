package com.kcdhawan.utri.eco.app.modal;

import java.io.Serializable;

public class BookForm implements Serializable {

    private String checkIncheckOut;

    public String getCheckIncheckOut() {
        return checkIncheckOut;
    }

    public void setCheckIncheckOut(String checkIncheckOut) {
        this.checkIncheckOut = checkIncheckOut;
    }

    public String getCheckInDate() {
        if (checkIncheckOut != null && checkIncheckOut.contains(" to ")) {
            return checkIncheckOut.split(" to ")[0];
        }
        return null;
    }

    public String getCheckOutDate() {
        if (checkIncheckOut != null && checkIncheckOut.contains(" to ")) {
            return checkIncheckOut.split(" to ")[1];
        }
        return null;
    }

    @Override
    public String toString() {
        return "BookForm{" +
                "checkIncheckOut='" + checkIncheckOut + '\'' +
                '}';
    }
}
