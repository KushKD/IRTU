package com.kcdhawan.utri.eco.app.repositories.room;

import com.kcdhawan.utri.eco.app.modules.room.entity.RoomEntity;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;


@Repository
@CacheConfig(cacheNames = "rooms")
public interface RoomRepository extends DataTablesRepository<RoomEntity, Long>, RoomRepositoryCustom {



}