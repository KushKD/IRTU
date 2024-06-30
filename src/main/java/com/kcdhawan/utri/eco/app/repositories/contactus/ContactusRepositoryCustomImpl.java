package com.kcdhawan.utri.eco.app.repositories.contactus;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class ContactusRepositoryCustomImpl implements ContactusRepositoryCustom{

    @PersistenceContext
    EntityManager entityManager;
}
