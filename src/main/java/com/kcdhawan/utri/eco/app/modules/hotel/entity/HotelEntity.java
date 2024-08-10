package com.kcdhawan.utri.eco.app.modules.hotel.entity;

import com.kcdhawan.utri.eco.app.modules.hoteltype.HtypeEntity;

import javax.persistence.*;
import java.util.Date;


    @Entity
    @Table(name="mst_hotels")
    public class HotelEntity {
        @Id
        @GeneratedValue(generator = "mst_hotels_hotel_id_seq", strategy = GenerationType.AUTO)
        @SequenceGenerator(name = "mst_hotels_hotel_id_seq", sequenceName = "public.mst_hotels_hotel_id_seq", initialValue = 1, allocationSize = 1)
        @Column(name="hotel_id")
        private Long hotelId;

        @Column(name="hotel_name")
        private String hotelName;

        @Column(name="hotel_state")
        private String hotelState;

        @Column(name="hotel_address")
        private String hotelAddress;

        @Column(name="hotel_latitude")
        private String hotelLatitude;

        @Column(name="hotel_longitude")
        private String hotelLongitude;

        @JoinColumn(name="htype_id")
        @OneToOne
        private HtypeEntity hotelType;

        @Column(name="active")
        private boolean active;

        @Column(name = "createddate")
        @Temporal(TemporalType.TIMESTAMP)
        private Date createdDate;

        @Column(name = "updated_date")
        @Temporal(TemporalType.TIMESTAMP)
        private Date updatedOn;


        public Long getHotelId() {
            return hotelId;
        }

        public void setHotelId(Long hotelId) {
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

        public HtypeEntity getHotelType() {
            return hotelType;
        }

        public void setHotelType(HtypeEntity hotelType) {
            this.hotelType = hotelType;
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
            return "HotelEntity{" +
                    "hotelId=" + hotelId +
                    ", hotelName='" + hotelName + '\'' +
                    ", hotelState='" + hotelState + '\'' +
                    ", hotelAddress='" + hotelAddress + '\'' +
                    ", hotelLatitude='" + hotelLatitude + '\'' +
                    ", hotelLongitude='" + hotelLongitude + '\'' +
                    ", hotelType=" + hotelType +
                    ", active=" + active +
                    ", createdDate=" + createdDate +
                    ", updatedOn=" + updatedOn +
                    '}';
        }
    }
