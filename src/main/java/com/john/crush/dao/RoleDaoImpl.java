package com.john.crush.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.john.crush.entity.Role;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

@Repository
public class RoleDaoImpl implements RoleDao {
    private EntityManager entityManager;

    @Autowired
    public RoleDaoImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public Role getRole(String username) {
        return entityManager.find(Role.class, username);
    }

    @Override
    public Role findRoleByName(String roleName) {
        TypedQuery<Role> theQuery = entityManager.createQuery("from Role where name=:roleName", Role.class);
        theQuery.setParameter("roleName", roleName);
        Role theRole = null;
        try {
            theRole = theQuery.getSingleResult();
        } catch (Exception e) {
            theRole = null;
        }
        return theRole;
    }

}
