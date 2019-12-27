package com.greyder.dao;

import java.util.List;

import com.greyder.entity.Users;

public interface UserDAO {

	public Users usersfindById(int theid);
	
	public List<Users> userfindAll();
	
	public void userSave(Users theUsers);
	
	
}
