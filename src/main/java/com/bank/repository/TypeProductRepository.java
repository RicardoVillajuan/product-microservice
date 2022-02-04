package com.bank.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.TypeProduct;

@Repository
public interface TypeProductRepository extends ReactiveMongoRepository<TypeProduct, String>{
	
	
	
}
