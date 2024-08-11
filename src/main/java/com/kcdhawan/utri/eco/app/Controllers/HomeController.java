package com.kcdhawan.utri.eco.app.Controllers;


import com.kcdhawan.utri.eco.app.modal.BookForm;
import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;
import com.kcdhawan.utri.eco.app.modules.hotel.form.HotelForm;
import com.kcdhawan.utri.eco.app.modules.hoteltype.HtypeEntity;
import com.kcdhawan.utri.eco.app.modules.user.entity.UserEntity;
import com.kcdhawan.utri.eco.app.modules.user.modal.LoggedInUserLocationSession;
import com.kcdhawan.utri.eco.app.modules.user.service.UserService;
import com.kcdhawan.utri.eco.app.repositories.user.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

@Controller
public class HomeController {


    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;




    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainpage(Model model) {
        model.addAttribute("bookForm", new BookForm());
        return "mainpage";
    }



    @RequestMapping(value = "/bookRoom", method = RequestMethod.POST)
    public String bookRoom(@ModelAttribute("bookForm") BookForm bookForm, BindingResult bindingResult, Model model, HttpServletRequest request, HttpSession session) {
        //roleValidator.validate(hotelForm, bindingResult);

            if (bindingResult.hasErrors()) {

                return "mainpage";
            }
            try {
                System.out.println(bookForm.toString());
                System.out.println(bookForm.getCheckOutDate());
                System.out.println(bookForm.getCheckInDate());

                // Save the dates to session
                session.setAttribute("checkInDate", bookForm.getCheckInDate());
                session.setAttribute("checkOutDate", bookForm.getCheckOutDate());
                Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
                if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
                  return "login";
                } else {
                    return "redirect:/";
                }



            } catch (Exception ex) {

                model.addAttribute("serverError", ex.toString());
                return "mainpage";
            }

    }



    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String homePage(Model model, HttpServletRequest request) {

        String authority_ = null;

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
            String username;
            if (principal instanceof UserDetails) {
                username = ((UserDetails) principal).getUsername();
            } else {
                username = principal.toString();
            }
            for (GrantedAuthority authority : authorities) {
                authority_ = authority.getAuthority().toString();
                System.out.println(authority.getAuthority().toString());
            }


                List<UserEntity> data = userRepository.getUserGeoData(username);
                request.getSession().setAttribute("UserData", data.get(0));




       if(authority_.equalsIgnoreCase("OWNER") || authority_.equalsIgnoreCase("Admin")) { return "redirect:/dashboard";}
       else if(authority_.equalsIgnoreCase("CUSTOMER")) { return "redirect:/dashboard"; }

       else { return "redirect:/vendorIndex";}
        }

    }





    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String gallery(Model model) {
        return "about";
    }




    @RequestMapping(value = "/privacypolicy", method = RequestMethod.GET)
    public String privacypolicy(Model model) {
        return "privacypolicy";
    }

    @RequestMapping(value = "/termsandconditions", method = RequestMethod.GET)
    public String termsandconditions(Model model) {
        return "termsandconditions";
    }
















}
