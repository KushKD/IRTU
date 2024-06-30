package com.kcdhawan.utri.eco.app.repositories.orders;

import com.kcdhawan.utri.eco.app.modules.order.OrdersEntity;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface OrdersRepository extends DataTablesRepository<OrdersEntity,Integer>, OrdersRepositoryCustom {

}
