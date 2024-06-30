package com.kcdhawan.utri.eco.app.repositories.ProductThumbnails;

import com.kcdhawan.utri.eco.app.modules.products.entity.ProductsEntity;
import com.kcdhawan.utri.eco.app.modules.products.entity.ProductsThumbnail;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProductThumbnailsDatatableRepositoryCustom {
    List<ProductsThumbnail> getProductThumbnailsViaId(Integer productId);

    void deleteRow(Integer id);


}
