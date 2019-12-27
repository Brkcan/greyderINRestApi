package com.greyder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greyder.dao.UserDAO;
import com.greyder.entity.Users;

@Service
public class UsersServiceImpl implements UsersService{

	private UserDAO userDAO;
	
	
	@Autowired
	public UsersServiceImpl(UserDAO theUserDAO) {
		userDAO = theUserDAO;
	}


	@Override
	public Users usersfindById(int theId) {
		
		return userDAO.usersfindById(theId);
	}


	@Override
	public List<Users> usersfindAll() {
		
		return userDAO.userfindAll();
	}


	@Override
	public void usersSave(Users users) {
		userDAO.userSave(users);
		
	}
	
	
}
