package com.kcdhawan.utri.eco.app.modules.room.form;

import java.io.Serializable;

public class RoomForm implements Serializable {

    private Integer roomId;
    private String roomName;
    private String roomNo;
    private String roomDesc;
    private String roomPrice;
    private String roomTax;
    private String roomSize;
    private String roomCapacity;
    private Integer hotelId;
    private Integer floorId;
    private Integer roomTypeId;
    private Integer roomStatusId;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
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

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public Integer getRoomStatusId() {
        return roomStatusId;
    }

    public void setRoomStatusId(Integer roomStatusId) {
        this.roomStatusId = roomStatusId;
    }

    @Override
    public String toString() {
        return "RoomForm{" +
                "roomId=" + roomId +
                ", roomName='" + roomName + '\'' +
                ", roomNo='" + roomNo + '\'' +
                ", roomDesc='" + roomDesc + '\'' +
                ", roomPrice='" + roomPrice + '\'' +
                ", roomTax='" + roomTax + '\'' +
                ", roomSize='" + roomSize + '\'' +
                ", roomCapacity='" + roomCapacity + '\'' +
                ", hotelId=" + hotelId +
                ", floorId=" + floorId +
                ", roomTypeId=" + roomTypeId +
                ", roomStatusId=" + roomStatusId +
                '}';
    }
}
