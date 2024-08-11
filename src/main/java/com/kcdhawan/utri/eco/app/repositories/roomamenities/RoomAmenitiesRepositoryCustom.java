package com.kcdhawan.utri.eco.app.repositories.roomamenities;

import com.kcdhawan.utri.eco.app.modules.room.entity.RoomTypeEntity;
import com.kcdhawan.utri.eco.app.modules.roomamenities.RoomAmenitiesEntity;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@CacheConfig(cacheNames = "roomType")
public interface RoomAmenitiesRepositoryCustom {


    List<RoomAmenitiesEntity> getRoomAmnetiesViaRoomType(Integer id);
    RoomAmenitiesEntity getRoomAmnetiesViaId(Integer id);


}
