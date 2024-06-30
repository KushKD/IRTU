package com.kcdhawan.utri.eco.app.repositories.products;

import com.kcdhawan.utri.eco.app.modules.products.entity.ProductsEntity;
import com.kcdhawan.utri.eco.app.modules.user.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductsDatatableRepository extends DataTablesRepository<ProductsEntity,Long>, ProductsDatatableRepositoryCustom {

    @Query(value = "SELECT * FROM mst_products e WHERE e.active = true", nativeQuery = true)
    Page<ProductsEntity> findByIsActiveTrue(Pageable pageable);
}
