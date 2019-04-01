package com.registration.jpa.model.inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cat extends Animal{

	@Column(nullable=false)
	private String colour;
	
	public Cat(String colour) {
		super();
		this.colour = colour;
	}

	@Override
	public void makeNoice() {
		System.out.println("meav meav");
		
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
}
