package com.registration.jpa.model;

import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name="city",column=@Column(name="address_city")),
			@AttributeOverride(name="street",column=@Column(name="address_street")),
			@AttributeOverride(name="zipCode",column=@Column(name="address_zipCode"))
			})
	private Address address;

	public Person(Long id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Person() {
	}

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
//		if(this==obj) {
//			return true;
//		}
//		if(obj==null) {
//			return false;
//		}
//		if(obj.getClass()!=this.getClass()) {
//			return false;
//		}
//		Person person = (Person)obj;
//		if(Objects.equals(this.name, person.getName()));
//		if(Objects.equals(this.address, person.address));
		return Objects.equals(obj, this);
	}

}
