package com.registration.jpa.service;

import java.math.BigDecimal;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.jpa.model.Person;
import com.registration.jpa.model.inheritance.Animal;
import com.registration.jpa.model.inheritance.Dog;
import com.registration.jpa.model.mto.Guide;
import com.registration.jpa.model.mto.Student;
import com.registration.jpa.model.oto.Customer;
import com.registration.jpa.repository.AnimalRepository;
import com.registration.jpa.repository.CustomerRepository;
import com.registration.jpa.repository.EntityManagerDenemeRepository;
import com.registration.jpa.repository.PersonRepository;
import com.registration.jpa.repository.StudentRepository;

@Service
public class CrudServiceImpl implements CrudService {

	@Autowired
	private AnimalRepository animalRepository;
	
	@Autowired
	private EntityManagerDenemeRepository entityManagerDenemeRepository;
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Optional<Person> getPerson(Long id) {
		 return personRepository.findById(id);
	}
	
	@Override
	public Optional<Student> getStudent(Long id) {
		 return studentRepository.findById(id);
	}

	@Override
	public Person savePerson(Person person) {
		return personRepository.save(person);
	}
	
	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	@Override
	public Student saveStudent() {
		Student student = new Student();
		student.setName("olcay");
		student.setEnrollmentId("121");
		
		Guide guide = new Guide();
		guide.setName("Ceren");
		guide.setSalary(new BigDecimal("200"));
		guide.setStaffId("232");
		student.setGuide(guide);
		
		return studentRepository.save(student);
	}
	
	@Override
	public Animal saveAnimal() {
		Animal animal1 = new Dog("pitbull");
		animal1.setName("olcay");
		return animalRepository.save(animal1);
	}

	@Override
	@Transactional
	public void entityManagerDeneme() {
		entityManagerDenemeRepository.deneme();
	}
}
