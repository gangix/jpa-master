package com.registration.jpa.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.registration.jpa.model.Person;
import com.registration.jpa.model.inheritance.Animal;
import com.registration.jpa.model.mto.Student;
import com.registration.jpa.model.oto.Customer;
import com.registration.jpa.service.CrudService;

@RestController
public class CrudController {
	
	@Autowired
	private CrudService crudService;
	
	@GetMapping(path = "/api/person/{id}")
	public ResponseEntity<Optional<Person>> getPerson(@PathVariable(name = "id", required = true) long id) throws Exception {
		return ResponseEntity.ok(crudService.getPerson(id));
	}
	
	@GetMapping(path = "/api/student/{id}")
	public ResponseEntity<Optional<Student>> getStudent(@PathVariable(name = "id", required = true) long id) throws Exception {
		return ResponseEntity.ok(crudService.getStudent(id));
	}

	@PostMapping(path = "/api/person")
	public ResponseEntity<Person> register(@Valid @RequestBody Person p) throws Exception {
		Person savedPerson = crudService.savePerson(p);
		return ResponseEntity.ok(savedPerson);
	}
	@PostMapping(path = "/api/student")
	public ResponseEntity<Student> registerStudent() throws Exception {
		Student savedPerson = crudService.saveStudent();
		return ResponseEntity.ok(savedPerson);
	}
	
	@PostMapping(path = "/api/customer")
	public ResponseEntity<Customer> registerCustomer(@Valid @RequestBody Customer customer) throws Exception {
		Customer savedPerson = crudService.saveCustomer(customer);
		return ResponseEntity.ok(savedPerson);
	}
	
	@PostMapping(path = "/api/animal")
	public ResponseEntity<Animal> registerDog() throws Exception {
		Animal savedPerson = crudService.saveAnimal();
		return ResponseEntity.ok(savedPerson);
	}
	
	@PostMapping(path = "/api/entity")
	public ResponseEntity<HttpStatus> update() throws Exception {
		crudService.entityManagerDeneme();
		return new ResponseEntity(HttpStatus.OK);
	}
}
