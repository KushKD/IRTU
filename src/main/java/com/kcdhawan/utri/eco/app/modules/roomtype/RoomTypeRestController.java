package com.kcdhawan.utri.eco.app.modules.roomtype;

import com.kcdhawan.utri.eco.app.modules.room.RoomRestController;
import com.kcdhawan.utri.eco.app.modules.room.entity.RoomEntity;
import com.kcdhawan.utri.eco.app.modules.room.entity.RoomTypeEntity;
import com.kcdhawan.utri.eco.app.repositories.room.RoomRepository;
import com.kcdhawan.utri.eco.app.repositories.roomtype.RoomTRepository;
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
public class RoomTypeRestController {

    @Autowired
    RoomTRepository roomTRepository;

    private static final Logger logger = LoggerFactory.getLogger(RoomTypeRestController.class);

    @RequestMapping(value = "/apidataTable/getRoomTypes", method = RequestMethod.GET)
    public DataTablesOutput<RoomTypeEntity> getRoomTypes(@Valid DataTablesInput input) {
        return roomTRepository.findAll(input);
    }
}

