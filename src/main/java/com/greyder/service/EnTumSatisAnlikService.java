package com.greyder.service;

import java.util.List;

import com.greyder.entity.EnTumSatisAnlik;

public interface EnTumSatisAnlikService {
	
	public EnTumSatisAnlik enTumSatisAnlikfindById(int id);
	
	public List<EnTumSatisAnlik> enTumSatisAnlikFindAll();

}
