package com.greyder.service;

import java.util.List;

import com.greyder.entity.EnTumSatisIkıYil;

public interface EnTumSatisIkiYilService {
	
	
	public EnTumSatisIkıYil enTumSatisIkıYil(int id);
	
	public List<EnTumSatisIkıYil> enTumSatisIkıYilsFindAll();

}
