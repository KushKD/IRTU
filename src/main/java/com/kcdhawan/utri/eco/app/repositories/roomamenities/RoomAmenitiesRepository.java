package com.kcdhawan.utri.eco.app.repositories.roomamenities;

import com.kcdhawan.utri.eco.app.modules.room.entity.RoomTypeEntity;
import com.kcdhawan.utri.eco.app.modules.roomamenities.RoomAmenitiesEntity;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;


@Repository
@CacheConfig(cacheNames = "roomAmenities")
public interface RoomAmenitiesRepository extends DataTablesRepository<RoomAmenitiesEntity, Long>, RoomAmenitiesRepositoryCustom {



}