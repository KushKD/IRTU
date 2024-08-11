package com.kcdhawan.utri.eco.app.modules.room;

import com.kcdhawan.utri.eco.app.modules.role.controller.RolesRestController;
import com.kcdhawan.utri.eco.app.modules.role.entity.RolesEntity;
import com.kcdhawan.utri.eco.app.modules.room.entity.RoomEntity;
import com.kcdhawan.utri.eco.app.repositories.roles.RolesRepository;
import com.kcdhawan.utri.eco.app.repositories.room.RoomRepository;
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
public class RoomRestController {

    @Autowired
    RoomRepository roomRepository;

    private static final Logger logger = LoggerFactory.getLogger(RoomRestController.class);

    @RequestMapping(value = "/apidataTable/getRooms", method = RequestMethod.GET)
    public DataTablesOutput<RoomEntity> getRooms_(@Valid DataTablesInput input) {
        return roomRepository.findAll(input);
    }
}
