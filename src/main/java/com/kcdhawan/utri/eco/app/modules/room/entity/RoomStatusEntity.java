package com.kcdhawan.utri.eco.app.modules.room.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "mst_rstatus")
public class RoomStatusEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "mst_rstatus_rstatus_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "mst_rstatus_rstatus_id_seq", sequenceName = "public.mst_rstatus_rstatus_id_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "rstatus_id")
    private Long rstatusId;

    @Column(name = "rstatus_name", length = 100)
    private String rstatusName;

    @Column(name = "active", nullable = false)
    private boolean active = true;

    @Column(name = "createddate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "updated_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;

    // Getters and Setters

    public Long getRstatusId() {
        return rstatusId;
    }

    public void setRstatusId(Long rstatusId) {
        this.rstatusId = rstatusId;
    }

    public String getRstatusName() {
        return rstatusName;
    }

    public void setRstatusName(String rstatusName) {
        this.rstatusName = rstatusName;
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

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "RoomStatusEntity{" +
                "rstatusId=" + rstatusId +
                ", rstatusName='" + rstatusName + '\'' +
                ", active=" + active +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
