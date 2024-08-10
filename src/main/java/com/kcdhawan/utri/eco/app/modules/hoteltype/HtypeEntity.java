package com.kcdhawan.utri.eco.app.modules.hoteltype;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="mst_hoteltype")
public class HtypeEntity {

    @Id
    @GeneratedValue(generator = "mst_hoteltype_htype_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "mst_hoteltype_htype_id_seq", sequenceName = "public.mst_hoteltype_htype_id_seq", initialValue = 1, allocationSize = 1)
    @Column(name="htype_id")
    private Long htypeId;

    @Column(name="htype_name")
    private String htypeName;


    @Column(name="active")
    private boolean active;


    @Column(name = "createddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "lastmodifieddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

    public Long getHtypeId() {
        return htypeId;
    }

    public void setHtypeId(Long htypeId) {
        this.htypeId = htypeId;
    }

    public String getHtypeName() {
        return htypeName;
    }

    public void setHtypeName(String htypeName) {
        this.htypeName = htypeName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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

    @Override
    public String toString() {
        return "HtypeEntity{" +
                "htypeId=" + htypeId +
                ", htypeName='" + htypeName + '\'' +
                ", active=" + active +
                ", createdDate=" + createdDate +
                ", updatedOn=" + updatedOn +
                '}';
    }
}