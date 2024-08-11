package com.kcdhawan.utri.eco.app.repositories.room;

import com.kcdhawan.utri.eco.app.modules.room.entity.RoomEntity;
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
public class RoomRepositoryCustomImpl implements RoomRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<RoomEntity> getRoles() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<RoomEntity> cq = cb.createQuery(RoomEntity.class);
        Root<RoomEntity> book = cq.from(RoomEntity.class);
        Predicate isActive_ = cb.equal(book.get("active"), true);
        cq.where(isActive_);
       // cq.multiselect( book.get("roleId"), book.get("roleName")).distinct(true);
        TypedQuery<RoomEntity> query =  entityManager.createQuery(cq);
        return query.getResultList();
    }




    @Override
    public RoomEntity getRoomViaId(Integer roleId) throws Exception {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<RoomEntity> cq = cb.createQuery(RoomEntity.class);
        Root<RoomEntity> book = cq.from(RoomEntity.class);
        Predicate role_id = cb.equal(book.get("roomId"), roleId);
        cq.where(role_id);
        TypedQuery<RoomEntity> query =  entityManager.createQuery(cq);
        return query.getResultList().get(0);
    }

    @Override
    public List<RoomEntity> getRoomViaHotelId(Integer hotelId) throws Exception {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<RoomEntity> cq = cb.createQuery(RoomEntity.class);
        Root<RoomEntity> book = cq.from(RoomEntity.class);
        Predicate hotelId_ = cb.equal(book.get("hotelEntity").get("hotelId"), hotelId);
        cq.where(hotelId_);
        TypedQuery<RoomEntity> query =  entityManager.createQuery(cq);
        return query.getResultList();
    }
}
