package com.registration.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.registration.jpa.model.inheritance.Animal;
@RestResource(exported = false)
public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
