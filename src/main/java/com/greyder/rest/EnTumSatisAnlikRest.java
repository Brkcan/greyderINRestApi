package com.greyder.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greyder.entity.EnTumSatisAnlik;
import com.greyder.service.EnTumSatisAnlikService;

@RestController
@RequestMapping("api")
public class EnTumSatisAnlikRest {

	private EnTumSatisAnlikService enTumSatisAnlikService;
	
	@Autowired
	public EnTumSatisAnlikRest(EnTumSatisAnlikService theEnTumSatisAnlikService) {
		enTumSatisAnlikService = theEnTumSatisAnlikService;
	}
	
	@GetMapping("/entumsatis/{id}")
	public EnTumSatisAnlik getEnTumSatisAnlik(@PathVariable int id) {
		EnTumSatisAnlik theEnTumSatisAnlik = enTumSatisAnlikService.enTumSatisAnlikfindById(id);
		return theEnTumSatisAnlik;
	}
	
	@GetMapping("/entumsatis")
	public List<EnTumSatisAnlik> getEnTumSatisAnlik(){
		return enTumSatisAnlikService.enTumSatisAnlikFindAll();
	}	
}
