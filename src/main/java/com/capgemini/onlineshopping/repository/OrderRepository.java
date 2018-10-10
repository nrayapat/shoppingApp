package com.capgemini.onlineshopping.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.onlineshopping.entity.Order;

public interface OrderRepository extends MongoRepository<Order, Integer>{

}