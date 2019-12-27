package com.greyder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greyder.dao.YedekAktifSatisFiyatDAO;
import com.greyder.entity.YedekAktifSatisFiyat;

@Service
public class YedekAktifSatisFiyatServiceImpl implements YedekAktifSatisFiyatService {

	private YedekAktifSatisFiyatDAO yedekAktifSatisFiyatDAO;
	
	@Autowired
	public YedekAktifSatisFiyatServiceImpl(YedekAktifSatisFiyatDAO theYedekAktifSatisFiyatDAO) {
		yedekAktifSatisFiyatDAO = theYedekAktifSatisFiyatDAO;
	}
	
	@Override
	public List<YedekAktifSatisFiyat> yedekAktifSatisFiyatFindAll() {
		
		return yedekAktifSatisFiyatDAO.yedekAktifSatisFiyatfindAll();
	}

}
