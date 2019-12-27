package com.greyder.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greyder.entity.LogActivities;
import com.greyder.service.LogActivitiesService;

@RestController
@RequestMapping("api")
public class LogActivitiesRest {
	
	private LogActivitiesService logActivitiesService;
	
	@Autowired
	public LogActivitiesRest(LogActivitiesService TheLogActivitiesService) {
		logActivitiesService = TheLogActivitiesService;
	}

	@GetMapping("/logActivities")
	public List<LogActivities> getLogActivitiesFindAll(){
		
		return logActivitiesService.logActivitiesFindAll();
	}
	
	@GetMapping("/logactivities/{id}")
	public LogActivities getLogActivities(@PathVariable int id) {
		LogActivities logActivities = logActivitiesService.logActivitiesFindById(id);
		return logActivities;
	}
	
	@PostMapping("/addLogActivities")
	public LogActivities postLogActivities(@RequestBody LogActivities logActivities) {
		
		logActivities.setId(0);
		
		logActivitiesService.logActivitiesSave(logActivities);
		
		return logActivities;
	}
}
