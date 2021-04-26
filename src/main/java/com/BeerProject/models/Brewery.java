package com.BeerProject.models;

import java.util.Collection;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Brewery {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int BreweryID;
	
	private String name;
	private String country;
	
	@OneToMany(mappedBy = "brewery")
	private Collection<Beer> beers;
	
	
	public Brewery() {}
	public Brewery(int breweryID, String name, String country, Collection<Beer> beers) {
		super();
		BreweryID = breweryID;
		this.name = name;
		this.country = country;
		this.beers = beers;
	}
	
	
	
	public int getBreweryID() {
		return BreweryID;
	}
	public void setBreweryID(int breweryID) {
		BreweryID = breweryID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Collection<Beer> getBeers() {
		return beers;
	}
	public void setBeers(Collection<Beer> beers) {
		this.beers = beers;
	}
	
}
