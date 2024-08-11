package com.kcdhawan.utri.eco.app.modules.room.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "mst_rtype")
public class RoomTypeEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "mst_rtype_rtype_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "mst_rtype_rtype_id_seq", sequenceName = "public.mst_rtype_rtype_id_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "rtype_id")
    private Long rtypeId;

    @Column(name = "rtype_name", length = 100)
    private String rtypeName;

    @Column(name = "floor_id")
    private Integer floorId;

    @Column(name = "active", nullable = false)
    private boolean active = true;

    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted = false;

    @Column(name = "createddate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "updated_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;

    // Getters and Setters

    public Long getRtypeId() {
        return rtypeId;
    }

    public void setRtypeId(Long rtypeId) {
        this.rtypeId = rtypeId;
    }

    public String getRtypeName() {
        return rtypeName;
    }

    public void setRtypeName(String rtypeName) {
        this.rtypeName = rtypeName;
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
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
        return "RoomTypeEntity{" +
                "rtypeId=" + rtypeId +
                ", rtypeName='" + rtypeName + '\'' +
                ", floorId=" + floorId +
                ", active=" + active +
                ", isDeleted=" + isDeleted +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
