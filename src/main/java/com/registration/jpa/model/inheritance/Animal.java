package com.registration.jpa.model.inheritance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Animal {
	
	@Id
	@SequenceGenerator(name = "SeqGenerator", sequenceName = "hibernate_sequence")
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	private String name;
	
	protected Animal() {
	}
	public Animal(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public abstract void makeNoice();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
