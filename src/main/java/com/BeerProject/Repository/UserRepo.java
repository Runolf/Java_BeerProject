package com.BeerProject.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.BeerProject.models.Users;

public interface UserRepo extends CrudRepository<Users, Integer>{
	Optional<Users> findByPseudo(String pseudo);
}
