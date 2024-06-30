package com.kcdhawan.utri.eco.app.repositories.wishlist;

import com.kcdhawan.utri.eco.app.modules.products.entity.ProductsEntity;
import com.kcdhawan.utri.eco.app.modules.wishlist.WishlistEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface WishlistDatatableRepository extends DataTablesRepository<WishlistEntity,Integer>, WishlistDatatableRepositoryCustom {


}
