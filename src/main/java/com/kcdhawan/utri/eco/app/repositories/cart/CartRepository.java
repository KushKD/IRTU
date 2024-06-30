package com.kcdhawan.utri.eco.app.repositories.cart;

import com.kcdhawan.utri.eco.app.modules.cart.CartEntity;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends DataTablesRepository<CartEntity,Integer>,CartRepositoryCustom {


}
