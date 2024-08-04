package com.kcdhawan.utri.eco.app.repositories.firms;

import com.kcdhawan.utri.eco.app.modules.firm.entity.FirmEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface FirmsRepositoryCustom {

    List<FirmEntity> getAllActiveFirms();
    List<FirmEntity> getAllFirms();
}
