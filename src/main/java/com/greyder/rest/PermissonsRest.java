package com.greyder.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greyder.entity.Permissions;
import com.greyder.service.PermissionsService;

@RestController
@RequestMapping("api")
public class PermissonsRest {

	private PermissionsService permissionsService;
	
	@Autowired
	public PermissonsRest(PermissionsService thePermissionsService) {
		permissionsService = thePermissionsService;
	}
	
	@GetMapping("/permissions/{id}")
	public Permissions getPermissions(@PathVariable int id) {
		Permissions thePermissions = permissionsService.permissionsfindById(id);
		return thePermissions;
	}
	
	@GetMapping("/permissions/all")
	public List<Permissions> getPermissionsFindAll(){
		return permissionsService.permissionsfindAll();
	}
	
	@PostMapping("/permissions/addPermissions")
	public Permissions postPermissions(@RequestBody Permissions permissions) {
		permissions.setId(0);

		permissionsService.permissionsSave(permissions);
		
		return permissions;
	}
}
