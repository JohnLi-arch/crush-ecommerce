package com.john.crush.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.john.crush.entity.Extra;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ExtrasDaoImpl implements ExtraDao {
    private EntityManager entityManager;

    @Autowired
    public ExtrasDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Extra findById(int id) {
        return entityManager.find(Extra.class, id);
    }

    @Override
    public List<Extra> findAll() {
        TypedQuery<Extra> theQuery = entityManager.createQuery("from Extra", Extra.class);
        List<Extra> extras = null;
        try {
            extras = theQuery.getResultList();
        } catch (Exception e) {
            extras = null;
        }
        return extras;
    }
}
