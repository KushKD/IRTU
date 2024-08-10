package com.kcdhawan.utri.eco.app.repositories.hotel;

import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;
import com.kcdhawan.utri.eco.app.modules.hoteltype.HtypeEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
public class HotelRepositoryCustomImpl implements HotelRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;




    @Override
    public List<HotelEntity> getHotel() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<HotelEntity> cq = cb.createQuery(HotelEntity.class);
        Root<HotelEntity> book = cq.from(HotelEntity.class);
        Predicate isActive_ = cb.equal(book.get("active"), true);
        //Predicate role_name = cb.equal(book.get("roleName"), "Vendor");
        cq.where(isActive_);
        //cq.multiselect(book.get("roleId"), book.get("roleName")).distinct(true);
        TypedQuery<HotelEntity> query =  entityManager.createQuery(cq);
        return query.getResultList();
    }



    @Override
    public HotelEntity checkHotelViaId(Integer roleId) throws Exception {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<HotelEntity> cq = cb.createQuery(HotelEntity.class);
        Root<HotelEntity> book = cq.from(HotelEntity.class);
        Predicate role_id = cb.equal(book.get("hotelId"), roleId);
        cq.where(role_id);
        TypedQuery<HotelEntity> query =  entityManager.createQuery(cq);
        return query.getResultList().get(0);
    }
}
