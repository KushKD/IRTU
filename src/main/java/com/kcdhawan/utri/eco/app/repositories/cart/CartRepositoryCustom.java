package com.kcdhawan.utri.eco.app.repositories.cart;

import com.kcdhawan.utri.eco.app.modules.cart.CartEntity;
import com.kcdhawan.utri.eco.app.modules.wishlist.WishlistEntity;
import com.kcdhawan.utri.eco.app.utilities.Constants;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepositoryCustom  {

    List<CartEntity> getCartItemViaId(Long userId, String active);
    CartEntity getCartViaId(Long userId);


    //boolean deleteItemById(int id);
}
