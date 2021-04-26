package com.BeerProject.Repository;

import org.springframework.data.repository.CrudRepository;

import com.BeerProject.models.Beer;

public interface BeerRepo extends CrudRepository<Beer, Integer>{

}
