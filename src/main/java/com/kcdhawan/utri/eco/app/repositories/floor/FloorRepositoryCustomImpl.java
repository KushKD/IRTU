package com.kcdhawan.utri.eco.app.repositories.floor;

import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;
import com.kcdhawan.utri.eco.app.modules.room.entity.FloorTypeEntity;
import com.kcdhawan.utri.eco.app.repositories.hotel.HotelRepositoryCustom;
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
public class FloorRepositoryCustomImpl implements FloorRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<FloorTypeEntity> getFloorViaHotels(Integer hotelId) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<FloorTypeEntity> cq = cb.createQuery(FloorTypeEntity.class);
        Root<FloorTypeEntity> book = cq.from(FloorTypeEntity.class);
        Predicate role_id = cb.equal(book.get("hotelId"), hotelId);
        cq.where(role_id);
        TypedQuery<FloorTypeEntity> query =  entityManager.createQuery(cq);
        return query.getResultList();
    }
}
