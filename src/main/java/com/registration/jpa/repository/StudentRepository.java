package com.registration.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.registration.jpa.model.mto.Student;
@RestResource(exported = false)
public interface StudentRepository extends JpaRepository<Student, Long> {

}
