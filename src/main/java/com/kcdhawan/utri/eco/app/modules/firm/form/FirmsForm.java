package com.kcdhawan.utri.eco.app.modules.firm.form;

import java.io.Serializable;

public class FirmsForm implements Serializable {

    private String firmId;

    private String firmName;
    private String firmDescription;

    private String isActive;

    private String isDeleted;

    public String getFirmId() {
        return firmId;
    }

    public void setFirmId(String firmId) {
        this.firmId = firmId;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getFirmDescription() {
        return firmDescription;
    }

    public void setFirmDescription(String firmDescription) {
        this.firmDescription = firmDescription;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "FirmsForm{" +
                "firmId='" + firmId + '\'' +
                ", firmName='" + firmName + '\'' +
                ", firmDescription='" + firmDescription + '\'' +
                ", isActive='" + isActive + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                '}';
    }
}