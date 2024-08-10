package com.kcdhawan.utri.eco.app.modules.hotel.controller;

import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;
import com.kcdhawan.utri.eco.app.modules.role.controller.RolesRestController;
import com.kcdhawan.utri.eco.app.modules.role.entity.RolesEntity;
import com.kcdhawan.utri.eco.app.repositories.hotel.HotelRepository;
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
public class HotelRestController {

    @Autowired
    HotelRepository hotelRepository;

    private static final Logger logger = LoggerFactory.getLogger(HotelRestController.class);

    @RequestMapping(value = "/apidataTable/getHotels", method = RequestMethod.GET)
    public DataTablesOutput<HotelEntity> getUsers_(@Valid DataTablesInput input) {
        return hotelRepository.findAll(input);
    }
}
