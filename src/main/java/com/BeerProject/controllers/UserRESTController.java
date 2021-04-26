package com.BeerProject.controllers;

import java.util.List;

import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BeerProject.Repository.UserRepo;
import com.BeerProject.models.Users;

@RestController
@RequestMapping(value = "/api/users")
public class UserRESTController {
	
	@Autowired
	private UserRepo UR;
	
	@GetMapping("/allUsers")
	List<Users> getAllUsers(){
		return IterableUtils.toList(UR.findAll());
	}
	
	@GetMapping("/allUsers/{id}")
	Users getOneUser(@PathVariable int id) {
		return UR.findById(id).get();
	}
	
	@PostMapping("/user")
	Users createUser(@RequestBody Users user) {
		user.hashPswd();
		return UR.save(user);
	}
	
}
