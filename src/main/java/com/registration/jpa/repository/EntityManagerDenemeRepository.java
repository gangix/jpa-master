package com.registration.jpa.repository;
import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.registration.jpa.model.mto.Guide;
import com.registration.jpa.model.mto.Student;

@Repository
public class EntityManagerDenemeRepository {

	@PersistenceContext
	EntityManager entityManager;

	public void deneme() {
		Guide guide = entityManager.find(Guide.class, 1L);
		Set<Student> studentSet = guide.getStudentSet();
		Student stud = null;
		for (Student student : studentSet) {
			if(student.getId()==1L) {
				stud = student;
			}
		}
		entityManager.getTransaction().commit();
		
		guide.setSalary(new BigDecimal("1256"));
		stud.setName("Olcay Ceren Bilir");
		
		entityManager.getTransaction().begin();
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

}