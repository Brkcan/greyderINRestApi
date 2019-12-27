package com.greyder.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greyder.entity.YedekAktifSatisFiyat;


@Repository
public class YedekAktifSatisFiyatDAOImpl implements YedekAktifSatisFiyatDAO{
	
	private EntityManager entityManager;
	
	@Autowired
	public YedekAktifSatisFiyatDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<YedekAktifSatisFiyat> yedekAktifSatisFiyatfindAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<YedekAktifSatisFiyat> theQuery = currentSession.createQuery("from YedekAktifSatisFiyat", YedekAktifSatisFiyat.class);
		
		List<YedekAktifSatisFiyat> yedekAktifSatisFiyat = theQuery.getResultList();
		
		return yedekAktifSatisFiyat; 
	}

}
