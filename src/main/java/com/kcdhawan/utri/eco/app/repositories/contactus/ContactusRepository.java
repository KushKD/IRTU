package com.kcdhawan.utri.eco.app.repositories.contactus;

import com.kcdhawan.utri.eco.app.modules.contactus.ContactusEntity;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactusRepository extends DataTablesRepository<ContactusEntity,Integer>,ContactusRepositoryCustom {
}
