package com.kcdhawan.utri.eco.app.repositories.user;

import com.kcdhawan.utri.eco.app.modules.user.modal.LoggedInUserLocationSession;
import org.springframework.stereotype.Repository;
import com.kcdhawan.utri.eco.app.modules.user.entity.UserEntity;

import java.util.List;

@Repository
public interface UserRepositoryCustom {

    List<UserEntity> getUserGeoData(String username_);
    UserEntity findByMobileNumber(Long mobile);
    UserEntity getUserDetails(Long mobile );

   Integer getCompanyId(String username);

   Long getTotalCustomers();
}
