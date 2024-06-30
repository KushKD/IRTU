package com.kcdhawan.utri.eco.app.modules.user.service;


import com.kcdhawan.utri.eco.app.modules.user.entity.UserEntity;

public interface CustomUserService {


    void save(UserEntity user);
    UserEntity findByUsername(String userName);
    UserEntity findByMobileNumber(String mobileNumber);

    UserEntity findByEmail(String email);
}
