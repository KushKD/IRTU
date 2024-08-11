package com.kcdhawan.utri.eco.app.repositories.roomtype;

import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;
import com.kcdhawan.utri.eco.app.modules.room.entity.RoomTypeEntity;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@CacheConfig(cacheNames = "roomType")
public interface RoomTRepositoryCustom {


    List<RoomTypeEntity> getRoomTypesViaFloors(Integer id);


}
