package com.greyder.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greyder.entity.LogActivities;

@Repository
public class LogActivitiesDAOImpl implements LogActivitiesDAO{
	
	private EntityManager  entityManager;
	
	@Autowired
	public LogActivitiesDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<LogActivities> logActivitiesFindAll() {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<LogActivities> theQuery = currentSession.createQuery("from LogActivities", LogActivities.class).setMaxResults(100);
		
		List<LogActivities> users = theQuery.getResultList();
		
		return users;
	}

	@Override
	public LogActivities logActivitiesfindById(int id) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		LogActivities logActivities = currentSession.get(LogActivities.class, id);
		
		return logActivities;
	}

	@Override
	public void logActivitiesSave(LogActivities logActivities) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.saveOrUpdate(logActivities);
		
	}

	
	
}
