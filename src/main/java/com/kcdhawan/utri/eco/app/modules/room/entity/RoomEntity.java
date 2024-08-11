package com.kcdhawan.utri.eco.app.modules.room.entity;

import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "mst_room")
public class RoomEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "mst_room_room_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "mst_room_room_id_seq", sequenceName = "public.mst_room_room_id_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "room_id")
    private Long roomId;

    @Column(name = "room_name")
    private String roomName;

    @Column(name = "room_no")
    private String roomNo;

    @Column(name = "room_desc")
    private String roomDesc;

    @Column(name = "room_price")
    private String roomPrice;

    @Column(name = "room_tax")
    private String roomTax;

    @Column(name = "room_size")
    private String roomSize;

    @Column(name = "room_capacity")
    private String roomCapacity;

    @OneToOne
    @JoinColumn(name = "rstatus_id")
    private RoomStatusEntity rstatusEntity;

    @OneToOne
    @JoinColumn(name = "rtype_id")
    private RoomTypeEntity rtypeEntity;

    @OneToOne
    @JoinColumn(name = "floor_id")
    private FloorTypeEntity floorTypeEntity;

    @OneToOne
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotelEntity;

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

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomDesc() {
        return roomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc;
    }

    public String getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(String roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomTax() {
        return roomTax;
    }

    public void setRoomTax(String roomTax) {
        this.roomTax = roomTax;
    }

    public String getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(String roomSize) {
        this.roomSize = roomSize;
    }

    public String getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(String roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public RoomStatusEntity getRstatusEntity() {
        return rstatusEntity;
    }

    public void setRstatusEntity(RoomStatusEntity rstatusEntity) {
        this.rstatusEntity = rstatusEntity;
    }

    public RoomTypeEntity getRtypeEntity() {
        return rtypeEntity;
    }

    public void setRtypeEntity(RoomTypeEntity rtypeEntity) {
        this.rtypeEntity = rtypeEntity;
    }

    public FloorTypeEntity getFloorTypeEntity() {
        return floorTypeEntity;
    }

    public void setFloorTypeEntity(FloorTypeEntity floorTypeEntity) {
        this.floorTypeEntity = floorTypeEntity;
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

    public HotelEntity getHotelEntity() {
        return hotelEntity;
    }

    public void setHotelEntity(HotelEntity hotelEntity) {
        this.hotelEntity = hotelEntity;
    }

    @Override
    public String toString() {
        return "RoomEntity{" +
                "roomId=" + roomId +
                ", roomName='" + roomName + '\'' +
                ", roomNo='" + roomNo + '\'' +
                ", roomDesc='" + roomDesc + '\'' +
                ", roomPrice='" + roomPrice + '\'' +
                ", roomTax='" + roomTax + '\'' +
                ", roomSize='" + roomSize + '\'' +
                ", roomCapacity='" + roomCapacity + '\'' +
                ", rstatusEntity=" + rstatusEntity +
                ", rtypeEntity=" + rtypeEntity +
                ", floorTypeEntity=" + floorTypeEntity +
                ", hotelEntity=" + hotelEntity +
                ", active=" + active +
                ", isDeleted=" + isDeleted +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
