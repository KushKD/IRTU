package com.kcdhawan.utri.eco.app.repositories.htype;

import com.kcdhawan.utri.eco.app.modules.hoteltype.HtypeEntity;
import com.kcdhawan.utri.eco.app.modules.role.entity.RolesEntity;
import com.kcdhawan.utri.eco.app.modules.role.modal.RolesModal;
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
public class HtypeRepositoryCustomImpl implements HtypeRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;




    @Override
    public List<HtypeEntity> getHotelType() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<HtypeEntity> cq = cb.createQuery(HtypeEntity.class);
        Root<HtypeEntity> book = cq.from(HtypeEntity.class);
        Predicate isActive_ = cb.equal(book.get("active"), true);
        //Predicate role_name = cb.equal(book.get("roleName"), "Vendor");
        cq.where(isActive_);
        //cq.multiselect(book.get("roleId"), book.get("roleName")).distinct(true);
        TypedQuery<HtypeEntity> query =  entityManager.createQuery(cq);
        return query.getResultList();
    }



    @Override
    public HtypeEntity checkHotelTypeViaId(Integer roleId) throws Exception {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<HtypeEntity> cq = cb.createQuery(HtypeEntity.class);
        Root<HtypeEntity> book = cq.from(HtypeEntity.class);
        Predicate role_id = cb.equal(book.get("htypeId"), roleId);
        cq.where(role_id);
        TypedQuery<HtypeEntity> query =  entityManager.createQuery(cq);
        return query.getResultList().get(0);
    }
}
