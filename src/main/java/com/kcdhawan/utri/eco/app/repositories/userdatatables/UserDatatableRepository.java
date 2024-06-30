package com.kcdhawan.utri.eco.app.repositories.userdatatables;

import com.kcdhawan.utri.eco.app.modules.user.entity.UserEntity;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDatatableRepository extends DataTablesRepository<UserEntity,Long>,UserDatatableRepositoryCustom {



}
