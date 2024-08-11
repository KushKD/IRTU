package com.kcdhawan.utri.eco.app.repositories.room;

import com.kcdhawan.utri.eco.app.modules.room.entity.RoomEntity;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@CacheConfig(cacheNames = "room")
public interface RoomRepositoryCustom {


    @Cacheable
    List<RoomEntity> getRoles();


//    Boolean checkRole(String rolenmae);

//     @Cacheable
//    List<RolesModal> getRoleVendor();


    RoomEntity getRoomViaId(Integer roleId) throws Exception;
}
