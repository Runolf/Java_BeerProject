package com.BeerProject.Repository;

import org.springframework.data.repository.CrudRepository;

import com.BeerProject.models.Commune;

public interface CommuneRepo extends CrudRepository<Commune, Integer>{
	
}
