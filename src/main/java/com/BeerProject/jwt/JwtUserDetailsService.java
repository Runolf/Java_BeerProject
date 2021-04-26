package com.BeerProject.jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.BeerProject.Repository.UserRepo;
import com.BeerProject.models.Users;




@Service
public class JwtUserDetailsService implements UserDetailsService {

  @Autowired
  UserRepo UR;
	
  
  @Override 
  public UserDetails loadUserByUsername(String pseudo) throws UsernameNotFoundException {
    
	  //User du modèle
	  Optional<Users> user = UR.findByPseudo(pseudo);
	    
	  //User Spring security vide.
	  Optional<JwtUserDetails> userDetails = Optional.empty();

	  
	  //User du modèle transformé en user de Spring Security (JWT User Detailsl)
	  if(user.isPresent()) {
		  userDetails = Optional.of(new JwtUserDetails(user.get().getUserID(),user.get().getPseudo(),user.get().getPassword(), user.get().getUserRole())); 
	  }
	  
	  //Erreur si login n'existe pas
	  if (!userDetails.isPresent()) {
		  throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", pseudo));
	  }

	  return userDetails.get();
  }

}