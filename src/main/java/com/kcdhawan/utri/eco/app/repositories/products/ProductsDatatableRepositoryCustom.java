package com.kcdhawan.utri.eco.app.repositories.products;

import com.kcdhawan.utri.eco.app.modules.products.entity.ProductsEntity;
import com.kcdhawan.utri.eco.app.modules.user.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProductsDatatableRepositoryCustom {

    List<ProductsEntity> checkProductName(String productName);
    ProductsEntity getProductViaId(Integer productId);

    Long getTotalProducts();


    ;
}
