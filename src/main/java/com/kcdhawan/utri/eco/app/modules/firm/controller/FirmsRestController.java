package com.kcdhawan.utri.eco.app.modules.firm.controller;

import com.kcdhawan.utri.eco.app.modules.firm.entity.FirmEntity;
import com.kcdhawan.utri.eco.app.modules.role.entity.RolesEntity;
import com.kcdhawan.utri.eco.app.repositories.firms.FirmsRepository;
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
public class FirmsRestController {

    @Autowired
    FirmsRepository firmsRepository;

    private static final Logger logger = LoggerFactory.getLogger(FirmsRestController.class);

    @RequestMapping(value = "/apidataTable/getFirms", method = RequestMethod.GET)
    public DataTablesOutput<FirmEntity> getUsers_(@Valid DataTablesInput input) {
        System.out.println(input);
        return firmsRepository.findAll(input);
    }

}