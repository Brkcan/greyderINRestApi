package com.greyder.service;

import java.util.List;

import com.greyder.entity.LogActivities;

public interface LogActivitiesService {
	
	public List<LogActivities> logActivitiesFindAll();
	
	public LogActivities logActivitiesFindById(int id);
	
	public void logActivitiesSave(LogActivities logActivities);

}
