package com.registration.jpa.model.oto;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable=false)
	private String staffId;
	private String name;
	private BigDecimal salary;

	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="passaport_id",unique=true)
	private Passaport passaport;

	public Customer(Long id, String name, Passaport passaport) {
		this.id = id;
		this.name = name;
		this.passaport = passaport;
	}
	public Customer() {
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
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	
}
