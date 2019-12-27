package com.greyder.dao;
import java.util.List;

import com.greyder.entity.Permissions;


public interface PermissionsDAO {

	public Permissions persmissionfindByID(int id);
	
	public List<Permissions> permissionsfindAll();
	
	public void permissionsSave(Permissions permissions);
}
