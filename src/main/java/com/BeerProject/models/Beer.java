package com.BeerProject.models;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "beerID")
public class Beer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int beerID;
	
	String Name;
	float Degree;
	String Color;
	String Fermentation;
	String SpecialCat;
	
	@ManyToOne
	@JoinColumn(name="BreweryID")
	Brewery brewery;
	
	
	public Beer() {}
	public Beer(int beerID, String name, float degree, String color, String fermentation, String specialCat,
			Brewery brewery) {
		super();
		this.beerID = beerID;
		Name = name;
		Degree = degree;
		Color = color;
		Fermentation = fermentation;
		SpecialCat = specialCat;
		this.brewery = brewery;
	}
	
	public Brewery getBrewery() {
		return brewery;
	}
	public void setBrewery(Brewery brewery) {
		this.brewery = brewery;
	}
	public int getBeerID() {
		return this.beerID;
	}
	public void setBeerID(int beerID) {
		this.beerID = beerID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getDegree() {
		return Degree;
	}
	public void setDegree(float degree) {
		Degree = degree;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getFermentation() {
		return Fermentation;
	}
	public void setFermentation(String fermentation) {
		Fermentation = fermentation;
	}
	public String getSpecialCat() {
		return SpecialCat;
	}
	public void setSpecialCat(String specialCat) {
		SpecialCat = specialCat;
	}

}
