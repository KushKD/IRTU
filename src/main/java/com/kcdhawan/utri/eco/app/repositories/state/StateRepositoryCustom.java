package com.kcdhawan.utri.eco.app.repositories.state;


import com.kcdhawan.utri.eco.app.modules.states.StatesMaster;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@CacheConfig(cacheNames = "states")
public interface StateRepositoryCustom {

    List<StatesMaster> getAllStates();


}