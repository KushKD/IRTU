package com.kcdhawan.utri.eco.app.repositories.floor;

import com.kcdhawan.utri.eco.app.modules.room.entity.FloorTypeEntity;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@CacheConfig(cacheNames = "FloorHotel")
public interface FloorRepositoryCustom {

   // @Cacheable
    List<FloorTypeEntity> getFloorViaHotels(Integer hotelId);


   // HotelEntity checkHotelViaId(Integer roleId) throws Exception;
}
