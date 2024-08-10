package com.kcdhawan.utri.eco.app.modules.hoteltype;

import com.kcdhawan.utri.eco.app.modules.role.entity.RolesEntity;
import com.kcdhawan.utri.eco.app.repositories.htype.HtypeRepository;
import com.kcdhawan.utri.eco.app.repositories.roles.RolesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class HTypeRestController {

    @Autowired
    HtypeRepository htypeRepository;

    private static final Logger logger = LoggerFactory.getLogger(HTypeRestController.class);

    @RequestMapping(value = "/apidataTable/getHotelTypes", method = RequestMethod.GET)
    public DataTablesOutput<HtypeEntity> getUsers_(@Valid DataTablesInput input) {
        System.out.println(input);
        return htypeRepository.findAll(input);
    }

}