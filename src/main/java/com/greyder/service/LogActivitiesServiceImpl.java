package com.greyder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greyder.dao.LogActivitiesDAO;
import com.greyder.entity.LogActivities;

@Service
public class LogActivitiesServiceImpl implements LogActivitiesService{

	private LogActivitiesDAO logActivitiesDAO;
	
	@Autowired
	public LogActivitiesServiceImpl(LogActivitiesDAO theLogActivitiesDAO) {
		logActivitiesDAO = theLogActivitiesDAO;
	}
	
	@Override
	public List<LogActivities> logActivitiesFindAll() {
		
		return logActivitiesDAO.logActivitiesFindAll();
	}

	@Override
	public LogActivities logActivitiesFindById(int id) {
		
		return logActivitiesDAO.logActivitiesfindById(id);
	}

	@Override
	public void logActivitiesSave(LogActivities logActivities) {
		logActivitiesDAO.logActivitiesSave(logActivities);
		
	}

	
}
