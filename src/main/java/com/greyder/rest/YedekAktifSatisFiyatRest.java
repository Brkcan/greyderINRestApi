package com.greyder.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greyder.entity.YedekAktifSatisFiyat;
import com.greyder.service.YedekAktifSatisFiyatService;

@RestController
@RequestMapping("api")
public class YedekAktifSatisFiyatRest {

	private YedekAktifSatisFiyatService yedekAktifSatisFiyatService;
	
	@Autowired
	public YedekAktifSatisFiyatRest(YedekAktifSatisFiyatService theAktifSatisFiyatService) {
		yedekAktifSatisFiyatService = theAktifSatisFiyatService;
	}
	
	@GetMapping("/yedekAktifSatisFiyat")
	public List<YedekAktifSatisFiyat> getYedekAktifSatisFiyatFindAll(){
		return yedekAktifSatisFiyatService.yedekAktifSatisFiyatFindAll();
	}
}
