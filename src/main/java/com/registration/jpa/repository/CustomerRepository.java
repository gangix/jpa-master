package com.registration.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.registration.jpa.model.oto.Customer;
@RestResource(exported = false)
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
