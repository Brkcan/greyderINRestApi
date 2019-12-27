package com.greyder.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greyder.entity.Users;
import com.greyder.service.UsersService;

@RestController
@RequestMapping("api")
public class UsersRest {
	
	private UsersService usersService;
	
	@Autowired
	public UsersRest(UsersService theUsersService) {
		usersService = theUsersService;
	}
	
	@GetMapping("/users/{id}")
	public Users getUsers(@PathVariable int id) {
		Users users = usersService.usersfindById(id);
		return users;
	}

	@GetMapping("/users")
	public List<Users> getUsersFindAll(){
		return usersService.usersfindAll();
	}
	
	@PostMapping("/addUsers")
	public Users postUser(@RequestBody Users users) {
		users.setId(0);
		
		usersService.usersSave(users);
		
		return users;
	}
}
