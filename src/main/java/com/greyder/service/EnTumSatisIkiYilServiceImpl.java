package com.greyder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greyder.dao.EnTumSatisIkiYilDAO;
import com.greyder.entity.EnTumSatisIkıYil;

@Service
public class EnTumSatisIkiYilServiceImpl implements EnTumSatisIkiYilService{

	private EnTumSatisIkiYilDAO enTumSatisIkiYilDAO;
	
	@Autowired
	public EnTumSatisIkiYilServiceImpl(EnTumSatisIkiYilDAO theEnTumSatisIkiYilDAO) {
		enTumSatisIkiYilDAO = theEnTumSatisIkiYilDAO;
	}

	@Override
	public EnTumSatisIkıYil enTumSatisIkıYil(int id) {
		return enTumSatisIkiYilDAO.enTumSatisIkıYil(id);
	}

	@Override
	public List<EnTumSatisIkıYil> enTumSatisIkıYilsFindAll() {
		
		return enTumSatisIkiYilDAO.enTumSatisIkıYilsfindAll();
	}
	
}
