package com.greyder.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greyder.entity.Users;

@Repository
public class UserDAOImpl implements UserDAO{

	private EntityManager  entityManager;
	
	@Autowired
	public UserDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	@Transactional
	public Users usersfindById(int theid) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Users users = currentSession.get(Users.class, theid);
		
		return users;
	}

	@Override
	@Transactional
	public List<Users> userfindAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Users> theQuery = currentSession.createQuery("from Users", Users.class);
		
		List<Users> users = theQuery.getResultList();
		
		return users;
	}

	@Override
	public void userSave(Users theUsers) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.saveOrUpdate(theUsers);
		
	}
	
	
}
