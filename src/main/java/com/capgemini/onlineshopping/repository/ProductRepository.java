package com.capgemini.onlineshopping.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.capgemini.onlineshopping.entity.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {

	@Query("{'productName':?0}")
	public List<Product> findByProductName(String name);

	@Query("{'productCategory':?0}")
	public List<Product> findByProductCategory(String category);

	@Query("{'productCategory':?0, 'productPrice': {$gt: ?1, $lt:?2}}")
	public List<Product> findByProductByRange(String productCategory, double min, double max);

}