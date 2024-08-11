package com.kcdhawan.utri.eco.app.modules.hotel.controller;

import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;
import com.kcdhawan.utri.eco.app.modules.hotel.form.HotelForm;
import com.kcdhawan.utri.eco.app.modules.hoteltype.HtypeEntity;
import com.kcdhawan.utri.eco.app.modules.user.entity.UserEntity;
import com.kcdhawan.utri.eco.app.repositories.hotel.HotelRepository;
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
public class HotelController {

    @Autowired
    HotelRepository hotelRepository;

    @RequestMapping(value = "/createHotel", method = RequestMethod.GET)
    public String createRole(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {
        model.addAttribute("hotelForm", new HotelForm());
        return "createhotel";
        }
    }

    @RequestMapping(value = "/saveHotel", method = RequestMethod.POST)
    public String saveRole(@ModelAttribute("hotelForm") HotelForm hotelForm, BindingResult bindingResult, Model model, HttpServletRequest request) {
        //roleValidator.validate(hotelForm, bindingResult);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {
            if (bindingResult.hasErrors()) {
                return "createhotel";
            }
            try {
                HotelEntity hotelEntity = new HotelEntity();
                hotelEntity.setActive(true);
                hotelEntity.setHotelName(hotelForm.getHotelName());
                hotelEntity.setHotelState(hotelForm.getHotelState());
                hotelEntity.setHotelAddress(hotelForm.getHotelAddress());

                HtypeEntity htypeEntity = new HtypeEntity();
                htypeEntity.setHtypeId(Long.valueOf(hotelForm.getHotelType()));
                hotelEntity.setHotelType(htypeEntity);

                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                Date date = new Date(timestamp.getTime());
                hotelEntity.setCreatedDate(date);


                HotelEntity savedHotelEntity = hotelRepository.save(hotelEntity);
                hotelForm.setHotelName("");
                hotelForm.setHotelAddress("");
                hotelForm.setHotelState("");
                request.getSession().setAttribute("successMessage", savedHotelEntity.getHotelName() + " Hotel Successfully Saved. ID is" + savedHotelEntity.getHotelId());
                return "redirect:/getHotels";
            } catch (Exception ex) {
                hotelForm.setHotelName("");
                hotelForm.setHotelAddress("");
                hotelForm.setHotelState("");
                model.addAttribute("serverError", ex.toString());
                return "createhotel";
            }
        }


    }


    @RequestMapping(value = "/getHotels", method = RequestMethod.GET)
    public String viewHotels(Model model, HttpServletRequest request) throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {
            UserEntity user = (UserEntity) request.getSession().getAttribute("UserData");
            if(user==null){
                return "login";
            }else{
                return "getHotels";
            }
        }
    }


    @RequestMapping(value = "/updateHotel/{id}", method = RequestMethod.GET)
    public String updateDistrict(@PathVariable("id")Integer id, Model model, HttpServletRequest request) throws Exception {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {

            UserEntity user = (UserEntity) request.getSession().getAttribute("UserData");
            System.out.println(user);

            if(user==null){
                return "login";
            }else{

                HotelEntity hotel =hotelRepository.checkHotelViaId(id);
                model.addAttribute("hotel_to_update", hotel);
                model.addAttribute("hotelForm", new HotelForm());
                return "updateHotel";
            }
        }
    }

// updateHotelEntity
@RequestMapping(value = "/updateHotelEntity", method = RequestMethod.POST)
@Transactional
public String updateModuleEntity(@ModelAttribute("hotelForm") HotelForm hotelForm,
                                 BindingResult bindingResult, Model model, HttpServletRequest request,
                                 HttpSession session, RedirectAttributes redirectAttributes) {


    // moduleValidatorUpdate.validate(moduleForm, bindingResult);
    if (bindingResult.hasErrors()) {
        return "updateHotel";
    }
    try {

        HotelEntity savedModule = null;
        HotelEntity roleToUpdate = new HotelEntity();

        roleToUpdate = hotelRepository.checkHotelViaId(hotelForm.getHotelId());

        roleToUpdate.setHotelName(hotelForm.getHotelName());
        roleToUpdate.setHotelState(hotelForm.getHotelState());
        roleToUpdate.setHotelAddress(hotelForm.getHotelAddress());

        HtypeEntity hoHtypeEntity = new HtypeEntity();
        hoHtypeEntity.setHtypeId(hotelForm.getHotelType().longValue());
        roleToUpdate.setHotelType(hoHtypeEntity);

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Date date = new Date(timestamp.getTime());
        roleToUpdate.setUpdatedOn(date);

        savedModule = hotelRepository.save(roleToUpdate);
        hotelForm.setHotelName("");
        hotelForm.setHotelAddress("");
        hotelForm.setHotelState("");
        request.getSession().setAttribute("successMessage", "Hotel Updated Successfully. ");
        return "redirect:/getHotels";
    } catch (Exception ex) {
        request.getSession().setAttribute("successMessage", ex.getLocalizedMessage());
        hotelForm.setHotelName("");
        hotelForm.setHotelAddress("");
        hotelForm.setHotelState("");
        return "updateHotel";
    }

}

}
