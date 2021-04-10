package com.setters;

public class State {
	private String country;
	private String town;
	private String nationalAnimal;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getNationalAnimal() {
		return nationalAnimal;
	}

	public void setNationalAnimal(String nationalAnimal) {
		this.nationalAnimal = nationalAnimal;
	}

	void display() {
		System.out.println(country + " " + town + " " + nationalAnimal);
	}
}
