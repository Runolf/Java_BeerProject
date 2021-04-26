package com.BeerProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.BeerProject.Repository.BeerRepo;

@Controller
@RequestMapping(value = "/api/beer")
public class BeerController {
	
	@Autowired	
	BeerRepo beerRepo;
	
	@RequestMapping(value="allBeer", method = RequestMethod.GET)
	public String getAllBeers(Model model) {	
		//model.addAttribute("beerList", beerRepo.findAll());
		
		return "allBeers";
	}
}
