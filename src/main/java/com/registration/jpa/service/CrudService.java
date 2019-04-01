package com.registration.jpa.service;

import java.util.Optional;

import com.registration.jpa.model.Person;
import com.registration.jpa.model.inheritance.Animal;
import com.registration.jpa.model.mto.Student;
import com.registration.jpa.model.oto.Customer;

public interface CrudService {
	public Optional<Person> getPerson(Long id);
	
	public Optional<Student> getStudent(Long id);
	
	public Person savePerson(Person person);
	
	public Student saveStudent();
	
	public Customer saveCustomer(Customer customer);

	public Animal saveAnimal();

	public void entityManagerDeneme();
}
