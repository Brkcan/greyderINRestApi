package com.greyder.dao;

import java.util.List;

import com.greyder.entity.EnTumSatisAnlik;

public interface EnTumSatisAnlikDAO {
	
	public EnTumSatisAnlik enTumSatisAnlikfindByID(int id);
	
	public List<EnTumSatisAnlik> enTumSatisAknlikFindAll();

}
