package com.kcdhawan.utri.eco.app.modules.roomamenities;

import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;
import com.kcdhawan.utri.eco.app.modules.role.controller.RolesRestController;
import com.kcdhawan.utri.eco.app.modules.role.entity.RolesEntity;
import com.kcdhawan.utri.eco.app.modules.room.entity.RoomEntity;
import com.kcdhawan.utri.eco.app.modules.user.entity.UserEntity;
import com.kcdhawan.utri.eco.app.repositories.roomamenities.RoomAmenitiesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.sql.Date;
import java.sql.Timestamp;

@RestController
public class RoomAmenitiesRestController {

    @Autowired
    RoomAmenitiesRepository roomAmenitiesRepository;


    private static final Logger logger = LoggerFactory.getLogger(RolesRestController.class);

    @RequestMapping(value = "/apidataTable/getRoomsA", method = RequestMethod.GET)
    public DataTablesOutput<RoomAmenitiesEntity> getRoomsA(@Valid DataTablesInput input) {
        return roomAmenitiesRepository.findAll(input);
    }


}
