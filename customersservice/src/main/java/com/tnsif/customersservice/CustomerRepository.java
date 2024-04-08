package com.tnsif.customersservice;

import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}

