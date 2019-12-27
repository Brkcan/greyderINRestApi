package com.greyder.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greyder.entity.EnTumSatisIkıYil;

@Repository
public class EnTumSatisIkiYilDAOImpl implements EnTumSatisIkiYilDAO{

	private EntityManager entityManager;
	
	@Autowired
	public EnTumSatisIkiYilDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	public EnTumSatisIkıYil enTumSatisIkıYil(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		EnTumSatisIkıYil enTumSatisIkıYil = currentSession.get(EnTumSatisIkıYil.class, id);
		return enTumSatisIkıYil;
	}

	@Override
	public List<EnTumSatisIkıYil> enTumSatisIkıYilsfindAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<EnTumSatisIkıYil> theQuery = currentSession.createQuery("from EnTumSatisIkıYil", EnTumSatisIkıYil.class).setMaxResults(100);
		List<EnTumSatisIkıYil> tumSatisIkıYils = theQuery.getResultList();
		return tumSatisIkıYils;
	}

	
}
