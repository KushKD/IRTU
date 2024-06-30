package com.kcdhawan.utri.eco.app.repositories.customer_address;

import com.kcdhawan.utri.eco.app.modules.customer_address.CustomerAddressEntity;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerAddressRepositoryCustom  {

    List<CustomerAddressEntity> getAddressByUSerId(Integer userId);

    CustomerAddressEntity getAddressByAddressId(Integer addressId);

    void deleteRow(Integer id);
}
