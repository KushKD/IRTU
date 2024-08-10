package com.kcdhawan.utri.eco.app.repositories.htype;

import com.kcdhawan.utri.eco.app.modules.hoteltype.HtypeEntity;
import com.kcdhawan.utri.eco.app.modules.role.entity.RolesEntity;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;


@Repository
@CacheConfig(cacheNames = "hType")
public interface HtypeRepository extends DataTablesRepository<HtypeEntity, Long>, HtypeRepositoryCustom {



}