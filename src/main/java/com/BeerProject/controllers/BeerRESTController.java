package com.BeerProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BeerProject.Repository.BeerRepo;
import com.BeerProject.models.Beer;

import java.util.List;

import org.apache.commons.collections4.IterableUtils;

@RestController
@RequestMapping(value = "/api/beers")
//@CrossOrigin(origins = "http://localhost:4200")
public class BeerRESTController {
	
	@Autowired
	private BeerRepo BR;
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/allBeers")
	List<Beer> allBeers(){
		return IterableUtils.toList(BR.findAll());
	}
	
	@GetMapping("/oneBeer/{id}")
	Beer oneFormateurs(@PathVariable int id) {
		return BR.findById(id).get();
	}
	
}
