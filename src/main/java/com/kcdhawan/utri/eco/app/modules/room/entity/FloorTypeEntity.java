package com.kcdhawan.utri.eco.app.modules.room.entity;


import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "mst_floor")
public class FloorTypeEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "mst_floor_floor_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "mst_floor_floor_id_seq", sequenceName = "public.mst_floor_floor_id_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "floor_id")
    private Long floorId;

    @Column(name = "floor_name", length = 100)
    private String floorName;

    @OneToOne
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotelId;

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

    public Long getFloorId() {
        return floorId;
    }

    public void setFloorId(Long floorId) {
        this.floorId = floorId;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public HotelEntity getHotelId() {
        return hotelId;
    }

    public void setHotelId(HotelEntity hotelId) {
        this.hotelId = hotelId;
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
        return "FloorTypeEntity{" +
                "floorId=" + floorId +
                ", floorName='" + floorName + '\'' +
                ", hotelId=" + hotelId +
                ", active=" + active +
                ", isDeleted=" + isDeleted +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
