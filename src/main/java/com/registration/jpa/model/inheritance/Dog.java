package com.registration.jpa.model.inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Dog extends Animal{
	@Column(nullable=false)
	private String type;
	
	public Dog(String type) {
		super();
		this.type = type;
	}
	
	@Override
	public void makeNoice() {
		System.out.println("hav hav");
		
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
}
