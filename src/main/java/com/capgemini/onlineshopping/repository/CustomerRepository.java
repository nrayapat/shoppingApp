package com.capgemini.onlineshopping.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onlineshopping.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}