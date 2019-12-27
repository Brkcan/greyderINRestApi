package com.greyder.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greyder.entity.EnTumSatisAnlik;

@Repository
public class EnTumSatisAnlikDAOImpl implements EnTumSatisAnlikDAO{

	private EntityManager entityManager;
	
	@Autowired
	public EnTumSatisAnlikDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public EnTumSatisAnlik enTumSatisAnlikfindByID(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		EnTumSatisAnlik enTumSatisAnlik = currentSession.get(EnTumSatisAnlik.class, id);
		return enTumSatisAnlik;
	}

	@Override
	public List<EnTumSatisAnlik> enTumSatisAknlikFindAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<EnTumSatisAnlik> theQuery = currentSession.createQuery("from EnTumSatisAnlik", EnTumSatisAnlik.class);
		List<EnTumSatisAnlik> enTumSatisAnliks = theQuery.getResultList();
		return enTumSatisAnliks;
	}
	
	
}
