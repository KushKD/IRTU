package com.kcdhawan.utri.eco.app.repositories.firms;

import com.kcdhawan.utri.eco.app.modules.firm.entity.FirmEntity;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirmsRepository extends DataTablesRepository<FirmEntity, Long>, FirmsRepositoryCustom {
}
