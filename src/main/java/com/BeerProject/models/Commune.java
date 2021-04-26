package com.BeerProject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Commune {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int CommuneID;
	
	String Name;
	
	@OneToOne
	@JoinColumn(name = "UserID")
	 Users user;
	
	public int getCommuneID() {
		return CommuneID;
	}

	public void setCommuneID(int communeID) {
		CommuneID = communeID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	
}
