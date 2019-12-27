package com.greyder.service;

import java.util.List;

import com.greyder.entity.Users;

public interface UsersService {

	public Users usersfindById(int theId);
	
	public List<Users> usersfindAll();
	
	public void usersSave(Users users);
}
