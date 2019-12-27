package com.greyder.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greyder.entity.EnTumSatisIkıYil;
import com.greyder.service.EnTumSatisIkiYilService;

@RestController
@RequestMapping("api")
public class EnTumSatisIkiYilRest {
	
	private EnTumSatisIkiYilService enTumSatisIkiYilService;
	
	@Autowired 
	public EnTumSatisIkiYilRest(EnTumSatisIkiYilService theEnTumSatisIkiYilService) {
		enTumSatisIkiYilService = theEnTumSatisIkiYilService;
	}
	
	@GetMapping("/entumsatisikiyil")
	public List<EnTumSatisIkıYil> getEnTumSatisAnlik(){
		return enTumSatisIkiYilService.enTumSatisIkıYilsFindAll();
	}
	
	@GetMapping("/entumsatisikiyil/{id}")
	public EnTumSatisIkıYil getEnTumSatisIkiYil(@PathVariable int id) {
		EnTumSatisIkıYil enTumSatisIkıYil = enTumSatisIkiYilService.enTumSatisIkıYil(id);
		return enTumSatisIkıYil;
	}

}
