package com.greyder.dao;

import java.util.List;

import com.greyder.entity.LogActivities;

public interface LogActivitiesDAO {

	public List<LogActivities> logActivitiesFindAll();
	
	public LogActivities logActivitiesfindById(int id);
	
	public void logActivitiesSave(LogActivities logActivities);
	
}
