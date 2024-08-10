package com.kcdhawan.utri.eco.app.repositories.hotel;

import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;
import com.kcdhawan.utri.eco.app.modules.hoteltype.HtypeEntity;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@CacheConfig(cacheNames = "hotelType")
public interface HotelRepositoryCustom {


    @Cacheable
    List<HotelEntity> getHotel();


    HotelEntity checkHotelViaId(Integer roleId) throws Exception;
}
