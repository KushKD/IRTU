package com.kcdhawan.utri.eco.app.repositories.floor;

import com.kcdhawan.utri.eco.app.modules.room.entity.FloorTypeEntity;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

@Repository
@CacheConfig(cacheNames = "FloorHotel")
public interface FloorRepository extends DataTablesRepository<FloorTypeEntity,Long>, FloorRepositoryCustom {
}
