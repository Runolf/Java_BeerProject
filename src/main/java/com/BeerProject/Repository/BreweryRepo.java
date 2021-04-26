package com.BeerProject.Repository;

import org.springframework.data.repository.CrudRepository;
import com.BeerProject.models.Brewery;

public interface BreweryRepo extends CrudRepository<Brewery, Integer>{
	
}
