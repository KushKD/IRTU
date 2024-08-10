package com.kcdhawan.utri.eco.app.modules.firm.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="mst_firms")
public class FirmEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "mst_firms_firm_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "mst_firms_firm_id_seq", sequenceName = "public.mst_firms_firm_id_seq", initialValue = 1, allocationSize = 1)
    @Column(name="firm_id")
    private Long firmId;

    @Column(name="firm_name")
    private String firmName;

    @Column(name="firm_description")
    private String firmDescription;


    @Column(name="active")
    private boolean active;

    @Column(name="is_deleted")
    private boolean deleted;

    @Column(name = "createddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "updated_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

    public Long getFirmId() {
        return firmId;
    }

    public void setFirmId(Long firmId) {
        this.firmId = firmId;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }



    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getFirmDescription() {
        return firmDescription;
    }

    public void setFirmDescription(String firmDescription) {
        this.firmDescription = firmDescription;
    }

    @Override
    public String toString() {
        return "FirmEntity{" +
                "firmId=" + firmId +
                ", firmName='" + firmName + '\'' +
                ", firmDescription='" + firmDescription + '\'' +
                ", active=" + active +
                ", deleted=" + deleted +
                ", createdDate=" + createdDate +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
