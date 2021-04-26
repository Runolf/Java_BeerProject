package com.BeerProject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import com.BeerProject.tools.Password;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userID")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int UserID;
	
	String pseudo;
	String Password;
	String UserRole; 
	
	public String hashPswd() {
		Password pswd = new Password(Password);
		pswd.firstHash();
		this.Password = pswd.getHash();
		
		System.out.println(this.Password);
		
		return this.Password;
	}
	
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public String getUserRole() {
		return UserRole;
	}
	public void setUser(String userRole) {
		UserRole = userRole;
	}
}
