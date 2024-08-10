package com.kcdhawan.utri.eco.app.repositories.firms;

import com.kcdhawan.utri.eco.app.modules.firm.entity.FirmEntity;
import com.kcdhawan.utri.eco.app.modules.order.OrdersEntity;
import com.kcdhawan.utri.eco.app.modules.role.entity.RolesEntity;
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
public class FirmsRepositoryCustomImpl implements FirmsRepositoryCustom{

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<FirmEntity> getAllActiveFirms() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<FirmEntity> criteriaQuery = cb.createQuery(FirmEntity.class);
        Root<FirmEntity> firm = criteriaQuery.from(FirmEntity.class);
        Predicate predicate_active = cb.equal(firm.get("active"), true);
        criteriaQuery.where(predicate_active);
        TypedQuery<FirmEntity> query =  entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }

    @Override
    public List<FirmEntity> getAllFirms() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<FirmEntity> criteriaQuery = cb.createQuery(FirmEntity.class);
        TypedQuery<FirmEntity> query =  entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }


    @Override
    public FirmEntity getFirmViaId(Integer roleId) throws Exception {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<FirmEntity> cq = cb.createQuery(FirmEntity.class);
        Root<FirmEntity> book = cq.from(FirmEntity.class);
        Predicate role_id = cb.equal(book.get("firmId"), roleId);
        cq.where(role_id);
        TypedQuery<FirmEntity> query =  entityManager.createQuery(cq);
        return query.getResultList().get(0);
    }
}
