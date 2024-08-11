package com.kcdhawan.utri.eco.app.modules.room;

import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;
import com.kcdhawan.utri.eco.app.modules.role.entity.RolesEntity;
import com.kcdhawan.utri.eco.app.modules.role.form.RolesForm;
import com.kcdhawan.utri.eco.app.modules.room.entity.FloorTypeEntity;
import com.kcdhawan.utri.eco.app.modules.room.entity.RoomEntity;
import com.kcdhawan.utri.eco.app.modules.room.entity.RoomStatusEntity;
import com.kcdhawan.utri.eco.app.modules.room.entity.RoomTypeEntity;
import com.kcdhawan.utri.eco.app.modules.room.form.RoomForm;
import com.kcdhawan.utri.eco.app.modules.user.entity.UserEntity;
import com.kcdhawan.utri.eco.app.repositories.room.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.sql.Date;
import java.sql.Timestamp;

@Controller
public class RoomController {

    @Autowired
    RoomRepository roomRepository;

    @RequestMapping(value = "/createRooms", method = RequestMethod.GET)
    public String createRole(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {
        model.addAttribute("roomForm", new RoomForm());
        return "createroom";
        }
    }

    @RequestMapping(value = "/getRooms", method = RequestMethod.GET)
    public String getRooms(Model model, HttpServletRequest request) throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {
            UserEntity user = (UserEntity) request.getSession().getAttribute("UserData");
            if(user==null){
                return "login";
            }else{
                return "getRooms";
            }
        }
    }

    //saveRoom
    @RequestMapping(value = "/saveRoom", method = RequestMethod.POST)
    public String saveRoom(@ModelAttribute("roomForm") RoomForm roomForm, BindingResult bindingResult, Model model, HttpServletRequest request) {
       // roleValidator.validate(roleForm, bindingResult);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        RoomEntity roomEntity = new RoomEntity();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {
            if (bindingResult.hasErrors()) {
                return "createroom";
            }
            try {

                roomEntity.setActive(true);
                roomEntity.setRoomName(roomForm.getRoomName());
                roomEntity.setRoomNo(roomForm.getRoomNo());
                roomEntity.setRoomPrice(roomForm.getRoomPrice());
                roomEntity.setRoomTax(roomForm.getRoomTax());
                roomEntity.setRoomDesc(roomForm.getRoomDesc());
                roomEntity.setRoomSize(roomForm.getRoomSize());
                roomEntity.setRoomCapacity(roomForm.getRoomCapacity());
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                Date date = new Date(timestamp.getTime());
                roomEntity.setCreatedDate(date);

                HotelEntity hotel = new HotelEntity();
                hotel.setHotelId(roomForm.getHotelId().longValue());
                roomEntity.setHotelEntity(hotel);

                FloorTypeEntity floor = new FloorTypeEntity();
                floor.setFloorId(roomForm.getFloorId().longValue());
                roomEntity.setFloorTypeEntity(floor);


                RoomTypeEntity roomType = new RoomTypeEntity();
                roomType.setRtypeId(roomForm.getRoomTypeId().longValue());
                roomEntity.setRtypeEntity(roomType);

                RoomStatusEntity roomStatusEntity = new RoomStatusEntity();
                roomStatusEntity.setRstatusId(1L);
                roomEntity.setRstatusEntity(roomStatusEntity);


                RoomEntity savedData = roomRepository.save(roomEntity);
                roomEntity.setRoomName("");
                roomEntity.setRoomNo("");
                roomEntity.setRoomPrice("");
                roomEntity.setRoomTax("");
                roomEntity.setRoomDesc("");
                roomEntity.setRoomSize("");
                roomEntity.setRoomCapacity("");
                request.getSession().setAttribute("successMessage", savedData.getRoomNo() + " role Successfully Saved. ID is" + savedData.getRoomId());
                return "redirect:/getRooms";

            } catch (Exception ex) {
                roomEntity.setRoomName("");
                roomEntity.setRoomNo("");
                roomEntity.setRoomPrice("");
                roomEntity.setRoomTax("");
                roomEntity.setRoomDesc("");
                roomEntity.setRoomSize("");
                roomEntity.setRoomCapacity("");
                model.addAttribute("serverError", ex.toString());
                return "createroom";
            }
        }


    }

    @RequestMapping(value = "/updateRoom/{id}", method = RequestMethod.GET)
    public String updateDistrict(@PathVariable("id")Integer room_id, Model model, HttpServletRequest request) throws Exception {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {

            UserEntity user = (UserEntity) request.getSession().getAttribute("UserData");
            System.out.println(user);

            if(user==null){
                return "login";
            }else{

                RoomEntity roomEntity = roomRepository.getRoomViaId(room_id);
                model.addAttribute("room_to_update", roomEntity);
                model.addAttribute("roomForm", new RoomForm());
                return "updateRoom";
            }
        }
    }


    @RequestMapping(value = "/updateRoomEntity", method = RequestMethod.POST)
    @Transactional
    public String updateModuleEntity(@ModelAttribute("roomForm") RoomForm roomForm,
                                     BindingResult bindingResult, Model model, HttpServletRequest request,
                                     HttpSession session, RedirectAttributes redirectAttributes) {


        // moduleValidatorUpdate.validate(moduleForm, bindingResult);
        if (bindingResult.hasErrors()) {
            return "updateRoom";
        }
        try {

            RoomEntity savedModule = null;
            RoomEntity roomEntity = new RoomEntity();

            roomEntity = roomRepository.getRoomViaId(roomForm.getRoomId());
            roomEntity.setActive(true);
            roomEntity.setRoomName(roomForm.getRoomName());
            roomEntity.setRoomNo(roomForm.getRoomNo());
            roomEntity.setRoomPrice(roomForm.getRoomPrice());
            roomEntity.setRoomTax(roomForm.getRoomTax());
            roomEntity.setRoomDesc(roomForm.getRoomDesc());
            roomEntity.setRoomSize(roomForm.getRoomSize());
            roomEntity.setRoomCapacity(roomForm.getRoomCapacity());
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            Date date = new Date(timestamp.getTime());
            roomEntity.setCreatedDate(date);

            HotelEntity hotel = new HotelEntity();
            hotel.setHotelId(roomForm.getHotelId().longValue());
            roomEntity.setHotelEntity(hotel);

            FloorTypeEntity floor = new FloorTypeEntity();
            floor.setFloorId(roomForm.getFloorId().longValue());
            roomEntity.setFloorTypeEntity(floor);


            RoomTypeEntity roomType = new RoomTypeEntity();
            roomType.setRtypeId(roomForm.getRoomTypeId().longValue());
            roomEntity.setRtypeEntity(roomType);

            RoomStatusEntity roomStatusEntity = new RoomStatusEntity();
            roomStatusEntity.setRstatusId(1L);
            roomEntity.setRstatusEntity(roomStatusEntity);

            savedModule = roomRepository.save(roomEntity);
            System.out.println(savedModule.toString());

            request.getSession().setAttribute("successMessage", "Room Updated Successfully. ");
            return "redirect:/getRooms";
        } catch (Exception ex) {
            request.getSession().setAttribute("successMessage", ex.getLocalizedMessage());
            return "updateRoom";
        }

    }
}

