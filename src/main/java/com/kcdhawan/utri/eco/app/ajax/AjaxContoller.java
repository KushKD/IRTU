package com.kcdhawan.utri.eco.app.ajax;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;
import com.kcdhawan.utri.eco.app.modules.hoteltype.HtypeEntity;
import com.kcdhawan.utri.eco.app.modules.role.modal.RolesModal;
import com.kcdhawan.utri.eco.app.modules.room.entity.FloorTypeEntity;
import com.kcdhawan.utri.eco.app.modules.room.entity.RoomTypeEntity;
import com.kcdhawan.utri.eco.app.modules.states.StatesMaster;
import com.kcdhawan.utri.eco.app.repositories.ProductThumbnails.ProductThumbnailsDatatableRepository;
import com.kcdhawan.utri.eco.app.repositories.customer_address.CustomerAddressRepository;
import com.kcdhawan.utri.eco.app.repositories.floor.FloorRepository;
import com.kcdhawan.utri.eco.app.repositories.hotel.HotelRepository;
import com.kcdhawan.utri.eco.app.repositories.htype.HtypeRepository;
import com.kcdhawan.utri.eco.app.repositories.roles.RolesRepository;
import com.kcdhawan.utri.eco.app.repositories.roomtype.RoomTRepository;
import com.kcdhawan.utri.eco.app.repositories.state.StateRepository;
import com.kcdhawan.utri.eco.app.repositories.user.UserRepository;
import com.kcdhawan.utri.eco.app.repositories.wishlist.WishlistDatatableRepository;
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
    HtypeRepository htypeRepository;

    @Autowired
    HotelRepository hotelRepository;

    @Autowired
    FloorRepository floorRepository;

    @Autowired
    RoomTRepository roomTRepository;

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


    //getHotelTypes
    @RequestMapping(value = "/ajax/getHotelTypes", method = RequestMethod.GET,  produces="application/json")
    public @ResponseBody
    String getHotelTypes() throws JsonProcessingException {
        Map<String, Object> map = null;
        List<HtypeEntity> hotelTypes = htypeRepository.getHotelType();


        map = new HashMap<String, Object>();
        map.put(Constants.keyResponse, hotelTypes);
        map.put(Constants.keyMessage, Constants.valueMessage);
        map.put(Constants.keyStatus, HttpStatus.OK);

        ObjectMapper Obj = new ObjectMapper();
        String jsonStr = null;
        jsonStr = Obj.writeValueAsString(map);
        logger.info(jsonStr);
        return jsonStr;

    }

    @RequestMapping(value = "/ajax/getHotels", method = RequestMethod.GET,  produces="application/json")
    public @ResponseBody
    String getHotels() throws JsonProcessingException {
        Map<String, Object> map = null;
        List<HotelEntity> hotels = hotelRepository.getHotel();
        map = new HashMap<String, Object>();
        map.put(Constants.keyResponse, hotels);
        map.put(Constants.keyMessage, Constants.valueMessage);
        map.put(Constants.keyStatus, HttpStatus.OK);

        ObjectMapper Obj = new ObjectMapper();
        String jsonStr = null;
        jsonStr = Obj.writeValueAsString(map);
        logger.info(jsonStr);
        return jsonStr;

    }

    //gethigher
    @RequestMapping(value = "/ajax/getFloors", method = RequestMethod.GET,  produces="application/json")
    public @ResponseBody
    ResponseEntity<?> getFloors_(@RequestParam(value =  "id", required = true) String id) throws Exception {
        Map<String, Object> map = null;
        List<FloorTypeEntity> floors = floorRepository.getFloorViaHotels(Integer.parseInt(id));
        map = new HashMap<String, Object>();
        map.put(Constants.keyResponse, floors);
        map.put(Constants.keyMessage, Constants.valueMessage);
        map.put(Constants.keyStatus, HttpStatus.OK);
        return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
    }

    //getRoomTypes
    @RequestMapping(value = "/ajax/getRoomTypes", method = RequestMethod.GET,  produces="application/json")
    public @ResponseBody
    ResponseEntity<?> getRoomTypes_(@RequestParam(value =  "id", required = true) String id) throws Exception {
        Map<String, Object> map = null;
        List<RoomTypeEntity> roomTypes = roomTRepository.getRoomTypesViaFloors(Integer.parseInt(id));
        map = new HashMap<String, Object>();
        map.put(Constants.keyResponse, roomTypes);
        map.put(Constants.keyMessage, Constants.valueMessage);
        map.put(Constants.keyStatus, HttpStatus.OK);
        return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
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
