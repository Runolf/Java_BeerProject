package com.BeerProject;

import java.util.Collection;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.BeerProject.Repository.BeerRepo;
import com.BeerProject.Repository.BreweryRepo;
import com.BeerProject.Repository.CommuneRepo;
import com.BeerProject.Repository.UserRepo;
import com.BeerProject.models.Beer;
import com.BeerProject.models.Brewery;
import com.BeerProject.models.Commune;
import com.BeerProject.models.Users;

@SpringBootTest
class BeerProjectApplicationTests {
	
	@Autowired
	BreweryRepo BR;
	
	@Autowired
	BeerRepo BeerR;
	
	@Autowired
	UserRepo UR;
	
	@Autowired
	CommuneRepo CR;
	
	@Test
	void test1() {
		/*
		Optional<Brewery> B = BR.findById(1);
		Optional<Beer> OBeer = BeerR.findById(1);
		
		Brewery B2 = B.get();
		System.out.println(B2.getName() + " " + B2.getCountry());
		
		Beer beer = OBeer.get();
		System.out.println(beer.getName() + " " + beer.getFermentation());
		*/
		
		Users user = UR.findById(1).get();
		System.out.println("Users = " + user.getPseudo());
		
		
		Optional<Commune> comOpt = CR.findById(1);
		Commune com = CR.findById(1).get();
		
		System.out.println("Commune = " + com.getName() + " " + com.getUser().getPseudo());
		
		System.out.println("\n-----------------\n");
		
		
	}


	@Test
	void test2() {
		//Optional<Brewery> B = BR.findById(1);
		//Brewery B2 = B.get();
		//B2.getBeers();
		
		//Collection<Beer> beersDB = (Collection<Beer>) BeerR.findAll(); 
		
		//beersDB.forEach(B -> System.out.println("List: " + B.getName()));
		//System.out.println("\n-----------------\n");
		
		Beer bir = BeerR.findById(4).get();
		
		Brewery brew = bir.getBrewery();
		
		System.out.println("Test2 : " + bir.getName() + " " + brew.getName());
	}
	
	
	@Test
	void testAddUser() {
		/*
		Users us = new Users();
		us.setPseudo("Jean");
		us.setPassword("Paul");
		
		
		
		Commune com = new Commune();
		com.setName("Islande");
		com.setUser(us);
		
		UR.save(us);
		CR.save(com);
		*/
	}
	
	
	@Test
	void testDeleteUser() {
		/*
		Commune com = CR.findById(2).get();
		Users us = UR.findById(2).get();
		
		CR.deleteById(us.getCommunee().getCommuneID());
		UR.deleteById(us.getUserID());
		

		if(UR.existsById(2) && CR.existsById(2)) {
			System.out.println("ID 2 HAS BEEN DELETED <3");
		}
		*/
	
	}
	
}
