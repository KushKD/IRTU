package com.kcdhawan.utri.eco.app.repositories.ProductThumbnails;

import com.kcdhawan.utri.eco.app.modules.products.entity.ProductsEntity;
import com.kcdhawan.utri.eco.app.modules.products.entity.ProductsThumbnail;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductThumbnailsDatatableRepository extends DataTablesRepository<ProductsThumbnail,Long>, ProductThumbnailsDatatableRepositoryCustom {


}
