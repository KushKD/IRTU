package com.kcdhawan.utri.eco.app.modules.firm.controller;

import com.kcdhawan.utri.eco.app.fileStorage.FileStorageService;
import com.kcdhawan.utri.eco.app.modules.firm.entity.FirmEntity;
import com.kcdhawan.utri.eco.app.modules.firm.form.FirmsForm;
import com.kcdhawan.utri.eco.app.modules.products.entity.ProductsEntity;
import com.kcdhawan.utri.eco.app.modules.products.entity.ProductsThumbnail;
import com.kcdhawan.utri.eco.app.modules.products.form.ProductForm;
import com.kcdhawan.utri.eco.app.modules.products.validator.ProductsUpdateValidator;
import com.kcdhawan.utri.eco.app.modules.products.validator.ProductsValidator;
import com.kcdhawan.utri.eco.app.modules.role.entity.RolesEntity;
import com.kcdhawan.utri.eco.app.modules.role.form.RolesForm;
import com.kcdhawan.utri.eco.app.modules.user.entity.UserEntity;
import com.kcdhawan.utri.eco.app.repositories.ProductThumbnails.ProductThumbnailsDatatableRepository;
import com.kcdhawan.utri.eco.app.repositories.firms.FirmsRepository;
import com.kcdhawan.utri.eco.app.repositories.products.ProductsDatatableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
import java.util.ArrayList;
import java.util.List;

@Controller
public class FirmsController {

    @Autowired
    FirmsRepository firmsRepository;
//
//    @Autowired
//    ProductThumbnailsDatatableRepository productThumbnailsDatatableRepository;
//
//    @Autowired
//    ProductsValidator productsValidator;
//
//    @Autowired
//    ProductsUpdateValidator productsUpdateValidator;
//
//    @Autowired
//    private FileStorageService fileStorageService;

    @RequestMapping(value = "/createFirm", method = RequestMethod.GET)
    public String createTransfer(Model model, HttpServletRequest request) throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {

            UserEntity user = (UserEntity) request.getSession().getAttribute("UserData");
            System.out.println(user);

            if (user == null) {
                return "login";
            } else {
                model.addAttribute("firmsForm", new FirmsForm());
                return "createFirm";
            }

        }
    }

    @RequestMapping(value = "/updateFirm/{id}", method = RequestMethod.GET)
    public String updateDistrict(@PathVariable("id")Integer firm_id, Model model, HttpServletRequest request) throws Exception {

        System.out.println(firm_id);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {

            UserEntity user = (UserEntity) request.getSession().getAttribute("UserData");
            System.out.println(user);

            if(user==null){
                return "login";
            }else{

                FirmEntity role =firmsRepository.getFirmViaId(firm_id);
                System.out.println(role.toString());
                model.addAttribute("firm_to_update", role);
                model.addAttribute("firmsForm", new FirmsForm());
                return "updatefirm";
            }
        }
    }


    @RequestMapping(value = "/updateFirmEntity", method = RequestMethod.POST)
    @Transactional
    public String updateModuleEntity(@ModelAttribute("firmsForm") FirmsForm firmsForm,
                                     BindingResult bindingResult, Model model, HttpServletRequest request,
                                     HttpSession session, RedirectAttributes redirectAttributes) {


        // moduleValidatorUpdate.validate(moduleForm, bindingResult);
        if (bindingResult.hasErrors()) {
            return "updatefirm";
        }
        try {

            FirmEntity savedModule = null;
            FirmEntity roleToUpdate = new FirmEntity();

            roleToUpdate = firmsRepository.getFirmViaId(Integer.parseInt(firmsForm.getFirmId()));

            roleToUpdate.setFirmName(firmsForm.getFirmName().toString());
            roleToUpdate.setFirmDescription(firmsForm.getFirmDescription());

            if (firmsForm.getIsActive().equalsIgnoreCase("T")) {
                roleToUpdate.setActive(true);
            } else {
                roleToUpdate.setActive(false);
            }


            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            Date date = new Date(timestamp.getTime());
            roleToUpdate.setUpdatedOn(date);

            savedModule = firmsRepository.save(roleToUpdate);
            firmsForm.setFirmName("");
            firmsForm.setFirmDescription("");
            request.getSession().setAttribute("successMessage", "Role Updated Successfully. ");
            return "redirect:/getFirms";
        } catch (Exception ex) {
            request.getSession().setAttribute("successMessage", ex.getLocalizedMessage());
            return "updatemodule";
        }

    }





    @RequestMapping(value = "/saveFirm", method = RequestMethod.POST)
    public String saveRole(@ModelAttribute("firmsForm") FirmsForm firmsForm, BindingResult bindingResult, Model model, HttpServletRequest request) {
       // roleValidator.validate(roleForm, bindingResult);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {
            if (bindingResult.hasErrors()) {
                return "updatefirm";
            }
            try {
                FirmEntity firmEntity = new FirmEntity();
                firmEntity.setActive(true);
                firmEntity.setFirmName(firmsForm.getFirmName());
                firmEntity.setFirmDescription(firmsForm.getFirmDescription());
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                Date date = new Date(timestamp.getTime());
                firmEntity.setCreatedDate(date);


                FirmEntity savedData = firmsRepository.save(firmEntity);
                firmEntity.setFirmName("");
                firmEntity.setFirmDescription("");
                request.getSession().setAttribute("successMessage", savedData.getFirmName() + " Firm Successfully Saved. ID is" + savedData.getFirmId());
                return "redirect:/getFirms";
            } catch (Exception ex) {
                firmsForm.setFirmName("");
                firmsForm.setFirmDescription("");
                model.addAttribute("serverError", ex.toString());
                return "updatefirm";
            }
        }


    }

    //getFirms
    @RequestMapping(value = "/getFirms", method = RequestMethod.GET)
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
                return "getFirms";
            }
        }
    }



}