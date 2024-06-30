package com.kcdhawan.utri.eco.app.ajax;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kcdhawan.utri.eco.app.modules.products.entity.ProductsThumbnail;
import com.kcdhawan.utri.eco.app.modules.role.modal.RolesModal;
import com.kcdhawan.utri.eco.app.modules.states.StatesMaster;
import com.kcdhawan.utri.eco.app.repositories.ProductThumbnails.ProductThumbnailsDatatableRepository;
import com.kcdhawan.utri.eco.app.repositories.cart_items.CartItemRepository;
import com.kcdhawan.utri.eco.app.repositories.customer_address.CustomerAddressRepository;
import com.kcdhawan.utri.eco.app.repositories.roles.RolesRepository;
import com.kcdhawan.utri.eco.app.repositories.state.StateRepository;
import com.kcdhawan.utri.eco.app.repositories.user.UserRepository;
import com.kcdhawan.utri.eco.app.repositories.wishlist.WishlistDatatableRepository;
import com.kcdhawan.utri.eco.app.repositories.wishlist.WishlistDatatableRepositoryCustom;
import com.kcdhawan.utri.eco.app.utilities.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class AjaxContoller {

    @Autowired
    RolesRepository rolesRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    private HttpSession httpSession;

    @Autowired
    StateRepository stateRepository;

    @Autowired
    ProductThumbnailsDatatableRepository productThumbnailsDatatableRepository;

    @Autowired
    WishlistDatatableRepository wishlistDatatableRepository;

    @Autowired
    CustomerAddressRepository customerAddressRepository;

    private static final Logger logger = LoggerFactory.getLogger(AjaxContoller.class);



    @RequestMapping(value = "/ajax/getStates", method = RequestMethod.GET,  produces="application/json")
    public @ResponseBody
    String getStates() throws Exception {
        Map<String, Object> map = null;
        List<StatesMaster> states = stateRepository.getAllStates();

        map = new HashMap<String, Object>();
        map.put(Constants.keyResponse, states);
        map.put(Constants.keyMessage, Constants.valueMessage);
        map.put(Constants.keyStatus, HttpStatus.OK);

        ObjectMapper Obj = new ObjectMapper();
        String jsonStr = null;
        jsonStr = Obj.writeValueAsString(map);
        logger.info(jsonStr);

        return jsonStr;

    }


    @RequestMapping(value = "/ajax/getRoles", method = RequestMethod.GET,  produces="application/json")
    public @ResponseBody
    String getRoles() throws JsonProcessingException {
        Map<String, Object> map = null;
        List<RolesModal> roles = rolesRepository.getRoles();


        map = new HashMap<String, Object>();
        map.put(Constants.keyResponse, roles);
        map.put(Constants.keyMessage, Constants.valueMessage);
        map.put(Constants.keyStatus, HttpStatus.OK);

        ObjectMapper Obj = new ObjectMapper();
        String jsonStr = null;
        jsonStr = Obj.writeValueAsString(map);
        logger.info(jsonStr);
        return jsonStr;

    }


    @DeleteMapping("/ajax/deleteThumbnail/{id}")
    public ResponseEntity<?> deleteThumbnail(@PathVariable Integer id) throws JsonProcessingException {
        productThumbnailsDatatableRepository.deleteRow(id);
        return ResponseEntity.ok().build();
    }


    @DeleteMapping("/ajax/deleteProductFromCart/{id}")
    public ResponseEntity<?> deleteProductFromCart(@PathVariable Integer id) throws JsonProcessingException {
        wishlistDatatableRepository.deleteRow(id);
        return ResponseEntity.ok().build();
    }



    @DeleteMapping("/ajax/deleteUserAddress/{id}")
    public ResponseEntity<?> deleteUserAddress(@PathVariable Integer id) throws JsonProcessingException {
        customerAddressRepository.deleteRow(id);
        return ResponseEntity.ok().build();
    }
}
