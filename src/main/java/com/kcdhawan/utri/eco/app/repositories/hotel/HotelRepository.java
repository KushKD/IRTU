package com.kcdhawan.utri.eco.app.repositories.hotel;

import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;
import com.kcdhawan.utri.eco.app.modules.hoteltype.HtypeEntity;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;


@Repository
@CacheConfig(cacheNames = "hotelType")
public interface HotelRepository extends DataTablesRepository<HotelEntity, Long>, HotelRepositoryCustom {



}