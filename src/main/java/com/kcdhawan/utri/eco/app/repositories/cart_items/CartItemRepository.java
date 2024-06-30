package com.kcdhawan.utri.eco.app.repositories.cart_items;

import com.kcdhawan.utri.eco.app.modules.cart_items.CartItemsEntity;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends DataTablesRepository<CartItemsEntity,Integer>, CartItemRepositoryCustom {
}
