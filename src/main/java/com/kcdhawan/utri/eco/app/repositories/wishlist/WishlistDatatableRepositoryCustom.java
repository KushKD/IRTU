package com.kcdhawan.utri.eco.app.repositories.wishlist;

import com.kcdhawan.utri.eco.app.modules.products.entity.ProductsEntity;
import com.kcdhawan.utri.eco.app.modules.wishlist.WishlistEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishlistDatatableRepositoryCustom {


    List<WishlistEntity> getProductViaId(Integer productId , Long userId);

    void deleteRow(Integer productId);


}
