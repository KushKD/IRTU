package com.kcdhawan.utri.eco.app.repositories.roomamenities;

import com.kcdhawan.utri.eco.app.modules.room.entity.RoomTypeEntity;
import com.kcdhawan.utri.eco.app.modules.roomamenities.RoomAmenitiesEntity;
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
public class RoomAmenitiesRepositoryCustomImpl implements RoomAmenitiesRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<RoomAmenitiesEntity> getRoomAmnetiesViaRoomType(Integer roomId) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<RoomAmenitiesEntity> cq = cb.createQuery(RoomAmenitiesEntity.class);
        Root<RoomAmenitiesEntity> book = cq.from(RoomAmenitiesEntity.class);
        Predicate room_id = cb.equal(book.get("room").get("roomId"), roomId);
        cq.where(room_id);
        TypedQuery<RoomAmenitiesEntity> query =  entityManager.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public RoomAmenitiesEntity getRoomAmnetiesViaId(Integer id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<RoomAmenitiesEntity> cq = cb.createQuery(RoomAmenitiesEntity.class);
        Root<RoomAmenitiesEntity> book = cq.from(RoomAmenitiesEntity.class);
        Predicate room_id = cb.equal(book.get("roomAmenityId"), id);
        cq.where(room_id);
        TypedQuery<RoomAmenitiesEntity> query =  entityManager.createQuery(cq);
        return query.getResultList().get(0);
    }

}
