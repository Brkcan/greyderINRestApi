package com.greyder.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greyder.entity.Permissions;

@Repository
public class PermissionsDAOImpl implements PermissionsDAO{
	
	private EntityManager entityManager;
	
	@Autowired
	public PermissionsDAOImpl(EntityManager theEntityManager) {
			entityManager = theEntityManager;
	}

	@Override
	public Permissions persmissionfindByID(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Permissions permissions = currentSession.get(Permissions.class, id);
		
		return permissions;
	}

	@Override
	public List<Permissions> permissionsfindAll() {
		Session currentSession  = entityManager.unwrap(Session.class);
		
		Query<Permissions> theQuery = currentSession.createQuery("from Permissions", Permissions.class);
		
		List<Permissions> permissions = theQuery.getResultList();
		return permissions;
	}

	@Override
	public void permissionsSave(Permissions permissions) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.saveOrUpdate(permissions);
		
	}

}
