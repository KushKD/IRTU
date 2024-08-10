package com.kcdhawan.utri.eco.app.modules.hotel.form;

import java.io.Serializable;

public class HotelForm implements Serializable {

    private Integer hotelId;

    private String hotelName;
    private String hotelState;
    private String hotelAddress;
    private String hotelLatitude;
    private String hotelLongitude;
    private Integer hotelType;
    private String hotelActive;

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelState() {
        return hotelState;
    }

    public void setHotelState(String hotelState) {
        this.hotelState = hotelState;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelLatitude() {
        return hotelLatitude;
    }

    public void setHotelLatitude(String hotelLatitude) {
        this.hotelLatitude = hotelLatitude;
    }

    public String getHotelLongitude() {
        return hotelLongitude;
    }

    public void setHotelLongitude(String hotelLongitude) {
        this.hotelLongitude = hotelLongitude;
    }

    public Integer getHotelType() {
        return hotelType;
    }

    public void setHotelType(Integer hotelType) {
        this.hotelType = hotelType;
    }

    public String getHotelActive() {
        return hotelActive;
    }

    public void setHotelActive(String hotelActive) {
        this.hotelActive = hotelActive;
    }

    @Override
    public String toString() {
        return "HotelForm{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", hotelState='" + hotelState + '\'' +
                ", hotelAddress='" + hotelAddress + '\'' +
                ", hotelLatitude='" + hotelLatitude + '\'' +
                ", hotelLongitude='" + hotelLongitude + '\'' +
                ", hotelType=" + hotelType +
                ", hotelActive='" + hotelActive + '\'' +
                '}';
    }
}
