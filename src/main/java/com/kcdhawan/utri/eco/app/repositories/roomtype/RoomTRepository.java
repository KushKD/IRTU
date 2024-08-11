package com.kcdhawan.utri.eco.app.repositories.roomtype;

import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;
import com.kcdhawan.utri.eco.app.modules.room.entity.RoomTypeEntity;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;


@Repository
@CacheConfig(cacheNames = "roomType")
public interface RoomTRepository extends DataTablesRepository<RoomTypeEntity, Long>, RoomTRepositoryCustom {



}