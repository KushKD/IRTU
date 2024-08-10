package com.kcdhawan.utri.eco.app.repositories.htype;

import com.kcdhawan.utri.eco.app.modules.hoteltype.HtypeEntity;
import com.kcdhawan.utri.eco.app.modules.role.entity.RolesEntity;
import com.kcdhawan.utri.eco.app.modules.role.modal.RolesModal;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@CacheConfig(cacheNames = "hType")
public interface HtypeRepositoryCustom {


    @Cacheable
    List<HtypeEntity> getHotelType();


    HtypeEntity checkHotelTypeViaId(Integer roleId) throws Exception;
}
