package com.kcdhawan.utri.eco.app.modules.roomamenities;


import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;
import com.kcdhawan.utri.eco.app.modules.room.entity.RoomEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "room_amenities")
public class RoomAmenitiesEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "room_amenities_room_amenity_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "room_amenities_room_amenity_id_seq", sequenceName = "public.room_amenities_room_amenity_id_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "room_amenity_id")
    private Long roomAmenityId;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private RoomEntity room;

    @ManyToOne
    @JoinColumn(name = "hotel_id", nullable = false)
    private HotelEntity hotel;

    @Column(name = "amenity_name", length = 100, nullable = false)
    private String amenityName;

    @Column(name = "amenity_description", length = 255)
    private String amenityDescription;

    @Column(name = "is_available", nullable = false)
    private boolean isAvailable = true;

    @Column(name = "active", nullable = false)
    private boolean active = true;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", nullable = false)
    private Date createdDate = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_date")
    private Date updatedDate;

    // Getters and Setters
    public Long getRoomAmenityId() {
        return roomAmenityId;
    }

    public void setRoomAmenityId(Long roomAmenityId) {
        this.roomAmenityId = roomAmenityId;
    }

    public RoomEntity getRoom() {
        return room;
    }

    public void setRoom(RoomEntity room) {
        this.room = room;
    }

    public HotelEntity getHotel() {
        return hotel;
    }

    public void setHotel(HotelEntity hotel) {
        this.hotel = hotel;
    }

    public String getAmenityName() {
        return amenityName;
    }

    public void setAmenityName(String amenityName) {
        this.amenityName = amenityName;
    }

    public String getAmenityDescription() {
        return amenityDescription;
    }

    public void setAmenityDescription(String amenityDescription) {
        this.amenityDescription = amenityDescription;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
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
        return "RoomAmenitiesEntity{" +
                "roomAmenityId=" + roomAmenityId +
                ", room=" + room +
                ", hotel=" + hotel +
                ", amenityName='" + amenityName + '\'' +
                ", amenityDescription='" + amenityDescription + '\'' +
                ", isAvailable=" + isAvailable +
                ", active=" + active +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
