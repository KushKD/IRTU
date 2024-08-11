package com.kcdhawan.utri.eco.app.modules.roomamenities;

import java.io.Serializable;

public class RoomamenitiesForm implements Serializable {

    private Integer roomAmenityId;
    private Integer roomId;
    private Integer hotelId;
    private String amenityName;
    private String amenityDescription;

    public Integer getRoomAmenityId() {
        return roomAmenityId;
    }

    public void setRoomAmenityId(Integer roomAmenityId) {
        this.roomAmenityId = roomAmenityId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
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

    @Override
    public String toString() {
        return "RoomamenitiesForm{" +
                "roomAmenityId=" + roomAmenityId +
                ", roomId=" + roomId +
                ", hotelId=" + hotelId +
                ", amenityName='" + amenityName + '\'' +
                ", amenityDescription='" + amenityDescription + '\'' +
                '}';
    }
}
