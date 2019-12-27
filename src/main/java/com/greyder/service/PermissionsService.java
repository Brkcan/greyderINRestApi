package com.greyder.service;

import java.util.List;

import com.greyder.entity.Permissions;

public interface PermissionsService {
	
	public Permissions permissionsfindById(int id);
	
	public List<Permissions> permissionsfindAll();
	
	public void permissionsSave(Permissions permissions);

}
