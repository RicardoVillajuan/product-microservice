package com.bank.service;

import com.bank.model.TypeProduct;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ITypeProductService {

	Flux<TypeProduct> findAll();
	
	Mono<TypeProduct> save(TypeProduct typeproduct);
	
	Flux<TypeProduct> findTypeProductByName(String name);
	
	
}
