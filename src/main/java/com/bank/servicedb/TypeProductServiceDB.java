package com.bank.servicedb;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.bank.model.TypeProduct;
import com.bank.repository.TypeProductRepository;
import com.bank.service.ITypeProductService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class TypeProductServiceDB implements ITypeProductService{
	
	private final TypeProductRepository repoTypeProduct;
	
	@Override
	public Flux<TypeProduct> findAll() {
		// TODO Auto-generated method stub
		return repoTypeProduct.findAll();
	}

	@Override
	public Mono<TypeProduct> save(TypeProduct typeproduct) {
		// TODO Auto-generated method stub
		return repoTypeProduct.save(typeproduct);
	}

	@Override
	public Flux<TypeProduct> findTypeProductByName(String name) {
		// TODO Auto-generated method stub
		return repoTypeProduct.findAll().filter(e -> e.getNameproduct() == name);
	}

}
