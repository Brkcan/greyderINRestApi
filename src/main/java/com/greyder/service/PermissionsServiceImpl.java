package com.greyder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greyder.dao.PermissionsDAO;
import com.greyder.entity.Permissions;

@Service
public class PermissionsServiceImpl implements PermissionsService{

	private PermissionsDAO permissionsDAO;
	
	@Autowired
    public PermissionsServiceImpl(PermissionsDAO thePermissionsDAO) {
		permissionsDAO = thePermissionsDAO;
	}
	
	@Override
	public Permissions permissionsfindById(int id_pk) {
			return permissionsDAO.persmissionfindByID(id_pk);
	}

	@Override
	public List<Permissions> permissionsfindAll() {
		
		return permissionsDAO.permissionsfindAll();
	}

	@Override
	public void permissionsSave(Permissions permissions) {
		
		permissionsDAO.permissionsSave(permissions);
	}

}
