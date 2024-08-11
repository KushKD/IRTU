package com.kcdhawan.utri.eco.app.repositories.roomtype;

import com.kcdhawan.utri.eco.app.modules.hotel.entity.HotelEntity;
import com.kcdhawan.utri.eco.app.modules.room.entity.RoomTypeEntity;
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
public class RoomTRepositoryCustomImpl implements RoomTRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<RoomTypeEntity> getRoomTypesViaFloors(Integer id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<RoomTypeEntity> cq = cb.createQuery(RoomTypeEntity.class);
        Root<RoomTypeEntity> book = cq.from(RoomTypeEntity.class);
        Predicate floor_id = cb.equal(book.get("floorId"), id);
        cq.where(floor_id);
        TypedQuery<RoomTypeEntity> query =  entityManager.createQuery(cq);
        return query.getResultList();
    }
}
