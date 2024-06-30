package com.kcdhawan.utri.eco.app.modules.user.controller;

import com.kcdhawan.utri.eco.app.modules.user.entity.UserEntity;
import com.kcdhawan.utri.eco.app.modules.user.modal.LoggedInUserLocationSession;
import com.kcdhawan.utri.eco.app.repositories.userdatatables.UserDatatableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
public class UsersRestController {

    @Autowired
    UserDatatableRepository userDatatableRepository;

    @PersistenceContext
    private EntityManager entityManager;



    @RequestMapping(value = "/apidataTable/getUsers", method = RequestMethod.GET)
    public DataTablesOutput<UserEntity> getUsers_(@Valid DataTablesInput input) {
        System.out.println(input);
        return userDatatableRepository.findAll(input);
    }

}