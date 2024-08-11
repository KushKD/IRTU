package com.kcdhawan.utri.eco.app.modules.roomamenities;

import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;
import com.kcdhawan.utri.eco.app.modules.role.entity.RolesEntity;
import com.kcdhawan.utri.eco.app.modules.role.form.RolesForm;
import com.kcdhawan.utri.eco.app.modules.room.entity.RoomEntity;
import com.kcdhawan.utri.eco.app.modules.user.entity.UserEntity;
import com.kcdhawan.utri.eco.app.repositories.roomamenities.RoomAmenitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.sql.Date;
import java.sql.Timestamp;

@Controller
public class RoomAmenitiesController {

    @Autowired
    RoomAmenitiesRepository roomAmenitiesRepository;


    @RequestMapping(value = "/createRoomAmenities", method = RequestMethod.GET)
    public String createRole(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {
        model.addAttribute("roomamenitiesForm", new RoomamenitiesForm());
        return "createrooma";
        }
    }

    //saveRooma
    @RequestMapping(value = "/saveRooma", method = RequestMethod.POST)
    public String saveRole(@ModelAttribute("roomamenitiesForm") RoomamenitiesForm roleForm, BindingResult bindingResult, Model model, HttpServletRequest request) {
       // roleValidator.validate(roleForm, bindingResult);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {
            if (bindingResult.hasErrors()) {
                return "createrooma";
            }
            try {
                RoomAmenitiesEntity rolesEntity = new RoomAmenitiesEntity();

                rolesEntity.setAmenityName(roleForm.getAmenityName());
                rolesEntity.setAmenityDescription(roleForm.getAmenityDescription());
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                Date date = new Date(timestamp.getTime());
                rolesEntity.setCreatedDate(date);

                HotelEntity hotel = new HotelEntity();
                hotel.setHotelId(roleForm.getHotelId().longValue());
                rolesEntity.setHotel(hotel);

                RoomEntity roomEntity = new RoomEntity();
                roomEntity.setRoomId(roleForm.getRoomId().longValue());
                rolesEntity.setRoom(roomEntity);


                RoomAmenitiesEntity savedData = roomAmenitiesRepository.save(rolesEntity);
                roleForm.setAmenityName("");
                roleForm.setAmenityDescription("");
                request.getSession().setAttribute("successMessage", savedData.getAmenityName() + " role Successfully Saved. ID is" + savedData.getRoomAmenityId());
                return "redirect:/getRoomAmenities";
            } catch (Exception ex) {
                roleForm.setAmenityName("");
                roleForm.setAmenityDescription("");
                model.addAttribute("serverError", ex.toString());
                return "createrooma";
            }
        }


    }


    @RequestMapping(value = "/getRoomAmenities", method = RequestMethod.GET)
    public String viewBarrier(Model model, HttpServletRequest request) throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {

            UserEntity user = (UserEntity) request.getSession().getAttribute("UserData");
            System.out.println(user);

            if(user==null){
                return "login";
            }else{
                return "getRoomsA";
            }
        }
    }


    @RequestMapping(value = "/updateRoomA/{id}", method = RequestMethod.GET)
    public String updateRoomA(@PathVariable("id")Integer role_id, Model model, HttpServletRequest request) throws Exception {

        System.out.println(role_id);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {
            UserEntity user = (UserEntity) request.getSession().getAttribute("UserData");
            if(user==null){
                return "login";
            }else{

                RoomAmenitiesEntity role =roomAmenitiesRepository.getRoomAmnetiesViaId(role_id);
                model.addAttribute("rooma_to_update", role);
                model.addAttribute("roomamenitiesForm", new RoomamenitiesForm());
                return "updateRoomA";
            }
        }
    }

    @RequestMapping(value = "/updateRoomAEntity", method = RequestMethod.POST)
    @Transactional
    public String updateModuleEntity(@ModelAttribute("roomamenitiesForm") RoomamenitiesForm rolesForm,
                                     BindingResult bindingResult, Model model, HttpServletRequest request,
                                     HttpSession session, RedirectAttributes redirectAttributes) {


        // moduleValidatorUpdate.validate(moduleForm, bindingResult);
        if (bindingResult.hasErrors()) {
            return "updateRoomA";
        }
        try {

            RoomAmenitiesEntity savedModule = null;
            RoomAmenitiesEntity rolesEntity = new RoomAmenitiesEntity();

            rolesEntity = roomAmenitiesRepository.getRoomAmnetiesViaId(rolesForm.getRoomAmenityId());

            rolesEntity.setAmenityName(rolesForm.getAmenityName());
            rolesEntity.setAmenityDescription(rolesForm.getAmenityDescription());
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            Date date = new Date(timestamp.getTime());
            rolesEntity.setCreatedDate(date);

            HotelEntity hotel = new HotelEntity();
            hotel.setHotelId(rolesForm.getHotelId().longValue());
            rolesEntity.setHotel(hotel);

            RoomEntity roomEntity = new RoomEntity();
            roomEntity.setRoomId(rolesForm.getRoomId().longValue());
            rolesEntity.setRoom(roomEntity);


            savedModule = roomAmenitiesRepository.save(rolesEntity);

            request.getSession().setAttribute("successMessage", "Updated Successfully. ");
            return "redirect:/getRoomAmenities";
        } catch (Exception ex) {
            request.getSession().setAttribute("successMessage", ex.getLocalizedMessage());
            return "updateRoomA";
        }

    }


}
