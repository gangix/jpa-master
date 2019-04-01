package com.registration.jpa.model.mtm;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String userName;

	private String password;

	@ManyToMany
	@JoinTable(
			name = "users_roles", 
			joinColumns = { @JoinColumn(name = "user_id") }, 
			inverseJoinColumns = {@JoinColumn(name = "role_id") })
	private Set<Role> roleSet;

	public User() {
	}

	public User(String userName, String password, Set<Role> roleSet) {
		super();
		this.userName = userName;
		this.password = password;
		this.roleSet = roleSet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoleSet() {
		return roleSet;
	}

	public void setRoleSet(Set<Role> roleSet) {
		this.roleSet = roleSet;
	}

}
