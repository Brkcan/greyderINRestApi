package com.greyder.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greyder.dao.EnTumSatisAnlikDAO;
import com.greyder.entity.EnTumSatisAnlik;

@Service
public class EnTumSatisAnlikServiceImpl implements EnTumSatisAnlikService{

	private EnTumSatisAnlikDAO enTumSatisAnlikDAO;
	
	@Autowired
	public EnTumSatisAnlikServiceImpl(EnTumSatisAnlikDAO theEnTumSatisAnlikDAO) {
		enTumSatisAnlikDAO = theEnTumSatisAnlikDAO;
	}

	@Override
	public EnTumSatisAnlik enTumSatisAnlikfindById(int id) {
		
		return enTumSatisAnlikDAO.enTumSatisAnlikfindByID(id);
	}

	@Override
	public List<EnTumSatisAnlik> enTumSatisAnlikFindAll() {
		
		return enTumSatisAnlikDAO.enTumSatisAknlikFindAll();
	}
	
	
	
}
