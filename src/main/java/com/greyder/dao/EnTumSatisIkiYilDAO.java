package com.greyder.dao;

import java.util.List;

import com.greyder.entity.EnTumSatisIkıYil;

public interface EnTumSatisIkiYilDAO {
	
	public EnTumSatisIkıYil enTumSatisIkıYil(int id);
	
	public List<EnTumSatisIkıYil> enTumSatisIkıYilsfindAll();

}
